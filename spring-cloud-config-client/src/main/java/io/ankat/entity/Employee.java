package io.ankat.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EMP_ID", insertable = false, updatable = false, unique = true)
    private Long empId;

    @Column(name = "EMP_NAME", updatable = false)
    private String empName;

    @Column(name = "EMP_AGE")
    private String empAge;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getEmpId().equals(employee.getEmpId()) && getEmpName().equals(employee.getEmpName()) && getEmpAge().equals(employee.getEmpAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpId(), getEmpName(), getEmpAge());
    }
}
