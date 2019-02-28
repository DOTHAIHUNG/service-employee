package com.hk3t.employee.repository;

import com.hk3t.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(origins = "https://client-employees.firebaseapp.com/")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
