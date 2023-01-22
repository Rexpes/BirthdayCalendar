package com.example.demo.repository;

import com.example.demo.model.CelebrationDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CelebrationDateRepository extends JpaRepository<CelebrationDate, Long> {
}
