package com.service;

import java.util.List;
import controller;
public interface EmployeeService {

    List < Employee > listAll();

    void save(Employee employee);

}
