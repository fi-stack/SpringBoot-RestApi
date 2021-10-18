package com.example.demo.controllers;

import com.example.demo.dto.AppUserData;
import com.example.demo.dto.ResponseData;
import com.example.demo.models.entities.AppUser;
import com.example.demo.services.AppUserService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class AppUserController {
    @Autowired
    private AppUserService appUserService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/register")
    public ResponseEntity<ResponseData<AppUser>> register(@RequestBody AppUserData userData) {
        ResponseData<AppUser> response = new ResponseData<>();
        AppUser appUser = modelMapper.map(userData, AppUser.class);
        response.setPayload(appUserService.registerAppUser(appUser));
        response.setSuccess(true);
        response.getMessage().add("AppUser saved!");
        return ResponseEntity.ok(response);
    }
}
