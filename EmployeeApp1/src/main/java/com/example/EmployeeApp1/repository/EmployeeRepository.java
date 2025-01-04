package com.example.EmployeeApp1.repository;


import com.example.EmployeeApp1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
//Employee is entitytname and Integer is type of primary key
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //CRUD operations are defined
    //CREATE READ UPDATE DELETE
    /**
     * getallemployee();
     * getanemployee(id);
     * updateEmployee(Employee employee);
     * deleteEmployee(id);
     */
    //JPA repository has all the methods
    //For JPA we have to add dependency from maven repository ie spring boot starter jpa

}
