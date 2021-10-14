package com.example.demo.models.repos;

import java.util.List;

import com.example.demo.models.entities.Supplier;

import org.springframework.data.repository.CrudRepository;

public interface SupplierRepo extends CrudRepository<Supplier, Long> {

    Supplier findByEmail(String email);

    List<Supplier> findByNameContainsOrderByIdDesc(String name);

    List<Supplier> findByNameStartingWith(String name);

    List<Supplier> findByNameContainsOrEmailContains(String name, String email);
}
