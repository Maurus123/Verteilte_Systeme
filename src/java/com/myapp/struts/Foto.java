/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Hendrik
 */
@Entity
public class Foto implements Serializable{
        @Id
        @GeneratedValue
        private long id = 0;
        
        private String bezeichnung = "";
        private String bildDaten = "";
        
        /*@ManyToOne
        Anzeige anzeige = new Anzeige();
        */
}