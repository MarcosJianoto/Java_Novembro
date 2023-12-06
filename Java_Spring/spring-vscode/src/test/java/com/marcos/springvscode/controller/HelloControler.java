package com.marcos.springvscode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloControler
 */

@RestController
public class HelloControler {

    @GetMapping(value = "/")
    public String getMethodName() {
        return "Olá mundo VSCODE!";
    }

}