package com.example.demo.models.repos;

import java.util.Optional;

import com.example.demo.models.entities.AppUser;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface AppUserRepo extends PagingAndSortingRepository<AppUser, Long> {
    Optional<AppUser> findByEmail(String email);
}
