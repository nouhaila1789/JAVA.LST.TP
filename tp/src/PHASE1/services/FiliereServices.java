package PHASE1.services;


import PHASE1.models.Departement;
import PHASE1.models.Enseignant;
import PHASE1.models.Filiere;

import java.util.ArrayList;

public class FiliereServices {

    public static Filiere addFiliere(String intitule, Enseignant chef, Departement dept) {
        return  new Filiere();
    }

    public static Filiere updateFiliere(int id , String intitule, Enseignant chef, Departement dept){
        return  new Filiere();
    }
    public static ArrayList<Filiere> deleteFiliereById(int id){
        return  DB.filieres;
    }

    public static Filiere getFiliereById(int id){
        return  new Filiere();
    }

    public static ArrayList<Filiere> getAllFiliere(int idFl){
        return  DB.filieres;
    }

    public static void updateFiliere(int id, String intitule, ArrayList<Filiere> allFiliere) {

    }
}
