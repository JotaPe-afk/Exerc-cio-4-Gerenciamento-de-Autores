package com.jp.demo.repositories;

import com.jp.demo.models.AutorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<AutorModel, Long> {
}
