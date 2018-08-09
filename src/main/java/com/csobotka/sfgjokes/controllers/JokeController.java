package com.csobotka.sfgjokes.controllers;

import com.csobotka.sfgjokes.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping(value = {"/", " "})
    public String showJoke(Model model) {

        model.addAttribute("joke", jokeService.getJoke());

        return "chuck-norris";
    }
}
