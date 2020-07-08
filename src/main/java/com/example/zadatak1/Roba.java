package com.example.zadatak1;

import javax.persistence.*;

@Entity
@Table(name = "roba")

public class Roba {
	
    @Id
    private long ID;

    @Column(name = "NAZIV", nullable = false)
    private String naziv;

  public long getId() {
        return ID;
    }

  public void setId(long ID) {
        this.ID = ID;
    }
  
  public String getNaziv() {
        return naziv;
    }

  public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}
