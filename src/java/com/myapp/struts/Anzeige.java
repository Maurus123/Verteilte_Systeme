/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Hendrik
 */
@Entity
    public class Anzeige implements Serializable{
        //Schluessel
        @Id
        @GeneratedValue
        private long id = 0;
        
        //Felder
        private String art = "";
        private String titel = "";
        private String beschreibung = "";
        private Date erstellungsDatum = new Date();
        private Date onlineBis = new Date();
        private double preisVorstellung = 0.0;
        private String artDesPreises = "";
        private int plz = 0;
        private String ort = "";
        
        
        
    }
