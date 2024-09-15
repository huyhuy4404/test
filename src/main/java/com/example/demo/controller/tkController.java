package com.example.demo.controller;

import com.example.demo.model.tk;
import com.example.demo.service.tkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tks")
public class tkController {

    @Autowired
    private tkService tkService;

    @GetMapping
    public List<tk> getAlltk() {
        return tkService.getAlltk();
    }

    @GetMapping("/{name}")
    public tk getById(@PathVariable String name) {
        return tkService.getById(name);
    }

    @PostMapping
    public tk createTk(@RequestBody tk tk) {
        return tkService.createTk(tk);
    }

    @PutMapping("/{name}")
    public tk updateTk(@PathVariable String name, @RequestBody tk tkDetails) {
        return tkService.updateTk(name, tkDetails);
    }

    @DeleteMapping("/{name}")
    public void deletetk(@PathVariable String name) {
        tkService.deletetk(name);
    }
}