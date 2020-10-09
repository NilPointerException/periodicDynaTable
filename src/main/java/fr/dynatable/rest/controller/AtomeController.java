package fr.dynatable.rest.controller;

import fr.dynatable.rest.model.Atomes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.dynatable.rest.dao.AtomeDAO;

@RestController
@RequestMapping(path = "/atomes")
public class AtomeController
{
    @Autowired
    private AtomeDAO atomeDao;
    
    @GetMapping(path="/", produces = "application/json")
    public Atomes getEmployees()
    {
        return atomeDao.getAllAtomes();
    }

}
