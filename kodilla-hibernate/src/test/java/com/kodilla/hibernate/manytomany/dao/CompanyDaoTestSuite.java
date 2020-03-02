package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testFindByLastname() {

        //Given
        Employee e1 = new Employee("John", "Smith");
        Employee e2 = new Employee("Stephanie", "Clarckson");
        Employee e3 = new Employee("Linda", "Kovalsky");

        //When
        employeeDao.save(e1);
        employeeDao.save(e2);
        employeeDao.save(e3);
        List<Employee> employeeList = employeeDao.findByLastname("Kovalsky");
        int howManyEmployees = employeeList.size();

        //Then
        Assert.assertEquals(1, howManyEmployees);

        //CleanUp
        try {
            employeeDao.deleteAll(employeeDao.findAll());
        } catch (Exception e) {
            //do nothing
        }
    }
    @Test
    public void findByCompanyNameStartingWith() {

        //Given
        Company c1 = new Company("Software Machine");
        Company c2 = new Company("Grey Matter");
        Company c3 = new Company("Data Maesters");

        //When
        companyDao.save(c1);
        companyDao.save(c2);
        companyDao.save(c3);
        List<Company> companyList = companyDao.findByCompanyNameStartingWith("Gre%");
        int howManyCompanies = companyList.size();

        //Then
        Assert.assertEquals(1, howManyCompanies);

        //CleanUp
        try {
            companyDao.deleteAll(companyDao.findAll());
        } catch (Exception e) {
            //do nothing
        }
    }
}
