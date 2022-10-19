package com.cursojava.curso.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@ControllerAdvice
public class SpaErrorController implements ErrorController {

    public static final String FORWARD_INDEX_HTML = "forward:/index.html";

    @RequestMapping("/error")
    public Object error(HttpServletRequest request, HttpServletResponse response) {
        // place your additional code here (such as error logging...)
        if (request.getMethod().equalsIgnoreCase(HttpMethod.GET.name())) {
            response.setStatus(HttpStatus.OK.value()); // optional.
            return FORWARD_INDEX_HTML; // forward to static SPA html resource.
        } else {
            return ResponseEntity.notFound().build(); // or your REST 404 blabla...
        }
    }

    @GetMapping("/")
    public String home() {
        return FORWARD_INDEX_HTML;
    }
}
