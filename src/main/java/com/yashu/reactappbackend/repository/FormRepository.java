package com.yashu.reactappbackend.repository;

import com.yashu.reactappbackend.model.FormData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormRepository extends JpaRepository<FormData, Integer> {
    List<FormData> findByAddress(String address);
}
