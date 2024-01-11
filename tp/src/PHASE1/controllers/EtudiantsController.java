package PHASE1.controllers;



import PHASE1.Main;
import PHASE1.models.Etudiant;
import PHASE1.services.DB;
import PHASE1.services.DepartementServices;
import PHASE1.services.EnseignantServices;
import PHASE1.services.EtudiantServices;

public class EtudiantsController {

    public static void showMenu(){
        System.out.println("-------------------------[ Etudiants ]---------------------------");


        System.out.println("1: Pour ajouter un etudiant");
        System.out.println("2: Pour afficher les etudiants");
        System.out.println("3: Pour modifier un etudiant");
        System.out.println("4: Pour supprimer un etudiant");
        System.out.println("0: Pour retourner au menu principal");

        //"Veuillez sélectionner une option : ")
        int nbre =Main.getIntInput("Veuillez sélectionner une nbre : ");
        switch(nbre) {
            case 1:
                createEtudiant();
                break;
            case 2:
                showEtudiant();
                break;
            case 3:
                editEtudiant();
                break;
            case 4:
                destroyEtudiant();
                break;
            default:
                EtudiantsController.showPrincipalMenu();
        }
    } private static int getIntInput(String s) {
        return 0;
    }
    public static void showEtudiant(){
        for (Etudiant etudiant : DB.etudiants) {
            System.out.print("Id : " + etudiant.getId());
            System.out.print(" | Nom : " + etudiant.getNom() + " " + etudiant.getPrenom());
            System.out.print(" | Email : " + etudiant.getEmail() );
            System.out.print(" | apogee: " + etudiant.getApogee() );
            System.out.print(" | filiere: " + etudiant.getFiliere() );
            System.out.print(" | notes: " + etudiant.getNotes() );
            System.out.println("");
        }
    }
    private static void showPrincipalMenu() {
    }
    public static void createEtudiant(){
        String nom = Main.getStringInput("Entrez le nom:");
        EtudiantsController.showEtudiant();

        String prenom;Main.getStringInput("Entrez le prenom:");
        EtudiantsController.showEtudiant();
        String email;Main.getStringInput("Entrez l'email:");
        EtudiantsController.showEtudiant();
        String grade;Main.getStringInput("Entrez filiere:");
        EtudiantsController.showEtudiant();
        String dept;Main.getStringInput("Entrez la note:");
        EtudiantsController.showEtudiant();
        showEtudiant();
        showMenu();

    }
    public static void editEtudiant(){
        showEtudiant();
        int id = Main.getIntInput("Sélecionnez un enseignant par id :");
        String nom = Main.getStringInput("Entrez le nom :");
        EnseignantsController.showEnseignants();
        String prenom = Main.getStringInput("Entrez le prenom :");
        EnseignantsController.showEnseignants();

        int idEns = Main.getIntInput("Sélecionnez un enseignant par id :");

        EtudiantServices.updateEtd(id, nom, EnseignantServices.getEnsById(idEns));

        showEtudiant();
        showPrincipalMenu();
    }
    public static void destroyEtudiant(){
        showEtudiant();
        int id;
        id = Main.getIntInput("Sélecionnez un etudiant par id :");
       EtudiantServices.deleteEtdById(id);
        showEtudiant();

    }


}
