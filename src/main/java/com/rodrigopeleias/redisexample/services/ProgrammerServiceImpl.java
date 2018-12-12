package com.rodrigopeleias.redisexample.services;

import com.rodrigopeleias.redisexample.dao.ProgrammerRepository;
import com.rodrigopeleias.redisexample.model.Programmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammerServiceImpl implements ProgrammerService{

    @Autowired
    private ProgrammerRepository programmerRepository;

    @Override
    public void setProgrammerAsString(String idKey, String programmer) {
        programmerRepository.setProgrammerAsString(idKey, programmer);
    }

    @Override
    public String getProgrammerAsString(String idKey) {
        return programmerRepository.getProgrammerAsString(idKey);
    }

    @Override
    public void addToProgrammersList(Programmer programmer) {
        programmerRepository.addToProgrammersList(programmer);
    }

    @Override
    public List<Programmer> getProgrammersListMembers() {
        return programmerRepository.getProgrammersListMembers();
    }

    @Override
    public Long getProgrammersListCount() {
        return programmerRepository.getProgrammersListCount();
    }
}
