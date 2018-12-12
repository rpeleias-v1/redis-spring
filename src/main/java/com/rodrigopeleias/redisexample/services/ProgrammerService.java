package com.rodrigopeleias.redisexample.services;

import com.rodrigopeleias.redisexample.model.Programmer;

import java.util.List;
import java.util.Set;

public interface ProgrammerService {

    void setProgrammerAsString(String idKey, String programmer);

    String getProgrammerAsString(String idKey);

    void addToProgrammersList(Programmer programmer);

    List<Programmer> getProgrammersListMembers();

    Long getProgrammersListCount();

    void addToProgrammersToSet(Programmer ...programmer);

    Set<Programmer> getProgrammersSetMembers();

    boolean isSetMember(Programmer programmer);
}
