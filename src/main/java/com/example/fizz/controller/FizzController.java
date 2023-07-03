package com.example.fizz.controller;

import com.example.fizz.model.TesteFizz;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/fizz")
@RequiredArgsConstructor
public class FizzController {

    @GetMapping("usuario")
    public String[] getUsuario(@RequestParam Integer id){
        if (id == null || id == 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Id da pesquisa não informado.");
        }
        String [] arr = {};
        return null;
    }

    @GetMapping("/fizzbuzz/{val}")
    public String getFizz(@PathVariable Integer val){
        TesteFizz fizz = new TesteFizz();
        return fizz.getResultado(val);

    }

}
