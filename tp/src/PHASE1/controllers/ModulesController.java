package PHASE1.controllers;


import PHASE1.Main;
import PHASE1.models.Enseignant;
import PHASE1.models.Module;
import PHASE1.services.DB;
import PHASE1.services.FiliereServices;
import PHASE1.services.ModuleServices;

public class ModulesController {
    public static void showMenu() {
        System.out.println("-------------------------[ Modules ]---------------------------");


        System.out.println("1: Pour ajouter un module");
        System.out.println("2: Pour afficher les modules");
        System.out.println("3: Pour modifier un module");
        System.out.println("4: Pour supprimer un module");
        System.out.println("0: Pour retourner au menu principal");

        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch (option) {
            case 1:
                showModule();
                break;
            case 2:
                createModule();
                break;
            case 3:
                editModule();
                break;
            case 4:
                deleteModule();
                break;
            default:
                PHASE1.controllers.ModulesController.showPrincipalMenu();

        }
    }

    private static void showPrincipalMenu() {

    }

    private static int getIntInput(String s) {
        return 0;
    }

    public static void showModule() {
        for (Module module : DB.modules) {
            System.out.print("Id : " + module.getId());
            System.out.print(" | intitule : " + module.getIntitule());
            System.out.print(" | chef: " + module.getChef());
            System.out.print(" | filiere: " + module.getFiliere());
            System.out.println("");
        }

    }
    public static void createModule(){
        String intitule = Main.getStringInput("Entrez l'intitule:");
        Enseignant chef;Main.getStringInput("Entrez le nom et le prenom:");
        String filiere;Main.getStringInput("Entrez filiere:");
        ModulesController.showModule();
        showModule();
        showMenu();

    }
    public static void editModule(){
        showModule();
        int id = Main.getIntInput("Sélecionnez un Module par id :");
        String intitule = Main.getStringInput("Entrez l'intitule :");
        ModulesController.showModule();

        int idMdl = Main.getIntInput("Sélecionnez un module par id :");

        ModuleServices.updateModule(id,intitule, ModuleServices.getModuleById(idMdl));

        showModule();
        showPrincipalMenu();
    }
    public static void deleteModule(){
        showModule();
        int id;
        id = Main.getIntInput("Sélecionnez un module par id :");
        ModuleServices.getModuleById(id);
        showModule();

    }

}