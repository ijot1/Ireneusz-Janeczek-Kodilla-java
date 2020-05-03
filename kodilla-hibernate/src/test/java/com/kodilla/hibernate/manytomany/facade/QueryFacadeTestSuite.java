package com.kodilla.hibernate.manytomany.facade;

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
public class QueryFacadeTestSuite {
    @Autowired
    QueryFacade queryFacade;

    @Test
    public void testRetrieveCompaniesWithNameSample() {
        //Before
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        //Given
        queryFacade.saveCompany(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        queryFacade.saveCompany(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        queryFacade.saveCompany(greyMatter);
        int greyMatterId = greyMatter.getId();

        //When
        List<Company> list = queryFacade.retrieveCompaniesWithNameSample("%a%");

        //Then
        Assert.assertEquals(3, list.size());

        //CleanUp
        queryFacade.deleteCompany(softwareMachineId);
        queryFacade.deleteCompany(dataMaestersId);
        queryFacade.deleteCompany(greyMatterId);
    }

    @Test
    public void testRetrieveByLastnameContaining() {
        //Before
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        //Given
        queryFacade.saveEmployee(johnSmith);
        int johnSmithId = johnSmith.getId();
        queryFacade.saveEmployee(stephanieClarckson);
        int stephanieClarcksonId = stephanieClarckson.getId();
        queryFacade.saveEmployee(lindaKovalsky);
        int lindaKovalskyId = lindaKovalsky.getId();

        //When
        List<Employee> list = queryFacade.retrieveByLastnameContaining("%th%");

        //Then
        Assert.assertEquals(1, list.size());

        //CleanUp
        queryFacade.deleteEmployee(johnSmithId);
        queryFacade.deleteEmployee(stephanieClarcksonId);
        queryFacade.deleteEmployee(lindaKovalskyId);
    }
}
