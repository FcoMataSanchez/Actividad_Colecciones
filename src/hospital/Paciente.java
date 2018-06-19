/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author alumneDAM
 */
public class Paciente {
   private String cip;
   private String nif;
   private String nom;

    Paciente(String cip, String nif, String nom) {
        this.cip = cip;
        this.nif = nif;
        this.nom = nom;
    }

    public String getCip() {
        return cip;
    }

    public void setCip(String cip) {
        this.cip = cip;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Paciente= " + "cip=" + cip + ", nif=" + nif + ", nom=" + nom;
    }
   

   
}
