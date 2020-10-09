package fr.dynatable.rest.model;

public class Atome {

    public Atome() {

    }

    public Atome(Integer id, String nom, String abbreviation) {
        super();
        this.id = id;
        this.nom = nom;
        this.abbreviation = abbreviation;
    }
 
    private Integer id;
    private String nom;
    private String abbreviation;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }


    @Override
    public String toString() {
        return "Atome [id=" + id + ", nom=" + nom + ", abbreviation=" + abbreviation + "]";
    }
}
