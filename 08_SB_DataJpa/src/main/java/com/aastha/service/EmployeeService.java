package com.aastha.service;

import com.aastha.entity.Employee;
import com.aastha.repo.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private EmployeeRepository empRepo;

    public EmployeeService(EmployeeRepository empRepo) {
        this.empRepo = empRepo;
        System.out.println(this.empRepo.getClass().getName());
    }

    public void saveEmployee() {
        //insert
        Employee employee = new Employee();

        employee.setEmpId(101);
        employee.setEmpName("charles");
        employee.setEmpGender("male");
        employee.setEmpDept("sales");
        employee.setEmpSalary(15000.00);
        empRepo.save(employee);
    }

    public void saveMultipleEmployee() {
        Employee emp1 = new Employee();
        emp1.setEmpId(102);
        emp1.setEmpName("Kathy");
        emp1.setEmpGender("female");
        emp1.setEmpDept("sales");
        emp1.setEmpSalary(19000.00);

        Employee emp2 = new Employee();
        emp2.setEmpId(103);
        emp2.setEmpName("Nick");
        emp2.setEmpGender("male");
        emp2.setEmpDept("Admin");
        emp2.setEmpSalary(29000.00);

        List<Employee> employeeList = Arrays.asList(emp1, emp2);
        empRepo.saveAll(employeeList);
    }
    public void getEmps(){
        List<Integer>empIds=Arrays.asList(102,103);
        Iterable<Employee>itr=empRepo.findAllById(empIds);
        itr.forEach(System.out::println);
    }
    //findall
    public void getAllEmps(){
        Iterable<Employee>findAll=empRepo.findAll();
        findAll.forEach(System.out::println);
    }
    //find
    public void getEmp(){
        Optional<Employee>findById=empRepo.findById(101); //optional avoid null pointer exception
        if(findById.isPresent()){
            Employee employee=findById.get();
            System.out.println(employee);
        }

        //multiple retrieve

    }
}