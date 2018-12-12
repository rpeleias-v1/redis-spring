package com.rodrigopeleias.redisexample.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rodrigopeleias.redisexample.model.Programmer;
import com.rodrigopeleias.redisexample.services.ProgrammerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProgrammerController {

    @Autowired
    private ProgrammerService programmerService;

    @PostMapping(value = "/programmer-string")
    public void addTopic(@RequestBody Programmer programmer) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        programmerService.setProgrammerAsString(String.valueOf(programmer.getId()), mapper.writeValueAsString(programmer));
    }

    @GetMapping(value = "/programmer-string/{id}")
    public String readString(@PathVariable String id) {
        return programmerService.getProgrammerAsString(id);
    }

    @PostMapping("/programmers-list")
    public void addToProgrammersList(Programmer programmer) {
        programmerService.addToProgrammersList(programmer);
    }

    @GetMapping("/programmers-list")
    public List<Programmer> getProgrammersListMembers() {
        return programmerService.getProgrammersListMembers();
    }

    @GetMapping("/programmers-list/count")
    public Long getProgrammersListCount() {
        return programmerService.getProgrammersListCount();
    }
}
