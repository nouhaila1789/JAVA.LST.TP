package PHASE1.services;



import PHASE1.models.Enseignant;
import PHASE1.models.Etudiant;
import PHASE1.models.Filiere;

import java.util.ArrayList;

public class EtudiantServices {

    public static Etudiant addEtd(String nom, String prenom, String email, int apogee, Filiere filiere){
        return  new Etudiant();
    }

    public static Etudiant updateEtd(int id,String nom, String prenom, String email, int apogee, Filiere filiere){
        return  new Etudiant();
    }
    public static ArrayList<Etudiant> deleteEtdById(int id){
        return  DB.etudiants;
    }

    public static Enseignant getEtdById(int id){
        return new Enseignant();
    }

    public static ArrayList<Etudiant> getAllEtd(){
        return  DB.etudiants;
    }

    public static void updateEtd(int id, String nom, Enseignant etdById) {

    }
}