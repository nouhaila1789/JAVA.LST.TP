package PHASE1.services;


import PHASE1.models.Enseignant;
import PHASE1.models.Filiere;
import PHASE1.models.Module;

import java.util.ArrayList;

public class ModuleServices {

    public static Module addFiliere(String intitule, Enseignant chef,  Filiere filiere) {
        return  new Module();
    }

    public static Module updateFiliere(int id , String intitule, Enseignant chef,  Filiere filiere){
        return  new Module();
    }
    public static ArrayList<Module> deleteModuleById(int id){
        return  DB.modules;
    }

    public static Module getModuleById(int id){
        return  new Module();
    }

    public static ArrayList<Module> getAllModule(){
        return  DB.modules;
    }

    public static void updateModule(int id, String intitule, Module moduleById) {

    }
}
