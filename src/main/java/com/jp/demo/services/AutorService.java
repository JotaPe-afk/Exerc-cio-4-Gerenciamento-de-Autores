package com.jp.demo.services;

import com.jp.demo.models.AutorModel;
import com.jp.demo.repositories.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    private AutorRepository autorRepository;

    public AutorModel cadastras(AutorModel autorModel) {
        return autorRepository.save(autorModel);
    }

    public List<AutorModel> findAll() {
        return autorRepository.findAll();
    }

    public AutorModel buscar(Long id) {
        return autorRepository.findById(id).get();
    }

    public void delete(Long id) {
        autorRepository.deleteById(id);
    }
}
