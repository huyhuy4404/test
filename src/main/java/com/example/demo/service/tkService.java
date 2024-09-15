package com.example.demo.service;

import com.example.demo.repository.tkRepository;
import com.example.demo.model.tk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class tkService {

    @Autowired
    private tkRepository tkRepository;

    public List<tk> getAlltk() {
        return tkRepository.findAll();
    }

    public tk getById(String name) {
        return tkRepository.findById(name).orElse(null);
    }

    public tk createTk(tk tk) {
        return tkRepository.save(tk);
    }

    public tk updateTk(String name, tk tkDetails) {
        tk tk = tkRepository.findById(name).orElse(null);
        if (tk != null) {
            tk.setName(tkDetails.getName());
            tk.setMk(tkDetails.getMk());

            return tkRepository.save(tk);
        }
        return null;
    }

    public void deletetk(String name) {
        tkRepository.deleteById(name);
    }
}