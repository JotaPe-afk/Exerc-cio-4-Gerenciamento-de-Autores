package com.jp.demo.controllers;

import com.jp.demo.models.AutorModel;
import com.jp.demo.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/produto")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @PostMapping
    public AutorModel cadastrar(AutorModel autorModel) {
        return autorService.cadastrar(autorModel);
    }

    @GetMapping
    public List<AutorModel> findAll() {
        return autorService.findAll();
    }

    @GetMapping("/{id}")
    public AutorModel buscar(@PathVariable Long id) {
        return autorService.buscar(id);
    }

    @DeleteMapping
    public void delete(Long id) {
        autorService.delete(id);
    }
}
