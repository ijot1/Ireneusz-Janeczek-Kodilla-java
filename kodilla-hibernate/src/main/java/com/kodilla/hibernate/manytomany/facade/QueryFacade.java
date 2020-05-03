package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.List;

@Service
public class QueryFacade {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public void saveCompany(Company company) {
        companyDao.save(company);
    }

    public void deleteCompany(Integer id) {
        companyDao.deleteById(id);
    }

    public List<Company> retrieveCompaniesWithNameSample(String arg) {

        return companyDao.findByNameContaining(arg);
    }

    public void saveEmployee(Employee employee) {
        employeeDao.save(employee);
    }

    public void deleteEmployee(Integer id) {
        employeeDao.deleteById(id);
    }

    public List<Employee> retrieveByLastnameContaining(String arg) {

        return employeeDao.findByLastnameContaining(arg);
    }
}
