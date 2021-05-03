package io.ankat.repository;

import io.ankat.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
