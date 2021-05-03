package io.ankat.service;

import io.ankat.entity.Employee;
import io.ankat.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service(value = "employeeService")
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long empId){
        return employeeRepository.getOne(empId);
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee modifyEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Boolean deleteEmployee(Long empId) {
        employeeRepository.deleteById(empId);
        return true;
    }
}
