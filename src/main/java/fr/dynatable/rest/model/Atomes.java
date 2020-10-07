package fr.dynatable.rest.model;

import java.util.ArrayList;
import java.util.List;

public class Atomes
{
    private List<Atome> atomeList;
    
    public List<Atome> getAtomeList() {
        if(atomeList == null) {
            atomeList = new ArrayList<>();
        }
        return atomeList;
    }
 
    public void setAtomeList(List<Atome> atomeList) {
        this.atomeList = atomeList;
    }
}
