/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author Hendrik
 */
@Entity
public class Benutzer implements Serializable{
    @Id
    @GeneratedValue
    private String benutzername = "";
    //Felder
    private int passwortHash = 0;
    private String vorname = "";
    private String nachname = "";
    private String strasse = "";
    private int hausnummer = 0;
    private int postleitzahl = 0;
    private String land = "";
    private String mail = "";
    private int tel = 0;
    
    
    @OneToMany(mappedBy="Benutzer") 
    List<Nachricht> nachrichten = new ArrayList<>(); 
    
    @ManyToMany
    Anzeige anzeige = new Anzeige();

    @OneToMany
    List<Anzeige> anzeige2 = new ArrayList<>();
    
    
}
