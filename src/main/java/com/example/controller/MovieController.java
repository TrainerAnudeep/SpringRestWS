package com.example.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/movie")
public class MovieController {

    private static final Logger LOG = Logger.getLogger(MovieController.class);

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String getMovie(@PathVariable String name, ModelMap model) {
        LOG.info("Adding " + name + " movie to list");
        model.addAttribute("movie", name);
        return "list";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getDefaultMovie(ModelMap model) {
        model.addAttribute("movie", "this is default movie");
        return "list";
    }
}
