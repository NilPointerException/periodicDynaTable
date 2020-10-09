package fr.dynatable.rest.dao;

import fr.dynatable.rest.model.Atome;
import fr.dynatable.rest.model.Atomes;
import org.springframework.stereotype.Repository;

@Repository
public class AtomeDAO
{
    private static Atomes list = new Atomes();
    
    static 
    {
        list.getAtomeList().add(new Atome(1, "Azote", "N2"));
        list.getAtomeList().add(new Atome(2, "Oxygène", "O2"));
        list.getAtomeList().add(new Atome(3, "Hydrogène", "H"));
    }
    
    public Atomes getAllAtomes()
    {
        return list;
    }
    
    public void addEmployee(Atome atome) {
        list.getAtomeList().add(atome);
    }
}
