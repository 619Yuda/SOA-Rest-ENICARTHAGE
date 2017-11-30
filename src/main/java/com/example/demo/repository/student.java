package com.example.demo.repository;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by oussa on 29/11/2017.
 */
@Entity
public class student {

    @Id
    private Long id  ;
    private  String name ;
    private  String niveau ;
    private  String classe ;
    private  String  moy ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getMoy() {
        return moy;
    }

    public void setMoy(String moy) {
        this.moy = moy;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", niveau='" + niveau + '\'' +
                ", classe='" + classe + '\'' +
                ", moy='" + moy + '\'' +
                '}';
    }
}
