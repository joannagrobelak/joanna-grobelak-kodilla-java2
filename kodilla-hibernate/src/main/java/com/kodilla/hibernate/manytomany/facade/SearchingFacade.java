package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchingFacade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchingFacade.class);

    public List<Company> searchingForCompanies(final String partOfName) {
        try {
            LOGGER.info("search for companies successful");
            return companyDao.retrieveCompaniesWithNameContainingGivenLetters(partOfName);
        } catch (Exception e) {
            LOGGER.error("error " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public List<Employee> searchingForEmployees(final String partOfLastname) {
        try {
            LOGGER.info("search for employees successful");
            return employeeDao.retrieveEmployeesWithLastnameContainingGivenLetters(partOfLastname);
        } catch (Exception e) {
            LOGGER.error("error" + e.getMessage());
            return new ArrayList<>();
        }
    }

}
