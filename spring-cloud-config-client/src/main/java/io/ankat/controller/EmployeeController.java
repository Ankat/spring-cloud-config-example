package io.ankat.controller;

import io.ankat.entity.Employee;
import io.ankat.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping(path = "/{empId}")
    public Employee getEmployeeById(@PathVariable Long empId) {
        return employeeService.getEmployeeById(empId);
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @PutMapping
    public Employee modifyEmployee(@RequestBody Employee employee){
        return employeeService.modifyEmployee(employee);
    }

    @DeleteMapping(path = "/{empId}")
    public Boolean deleteEmployee(@PathVariable Long empId){
        return employeeService.deleteEmployee(empId);
    }
}
