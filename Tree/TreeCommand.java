public class TreeCommand {
    public static void main(String[] args) {
        // Création de la structure d'arborescence

        // Création du répertoire racine
        Dossier doc = new Dossier("semestre2");

        //Création des sous-répertoires
        Dossier dic1 = new Dossier("DIC1");
        Dossier documents = new Dossier("Documents");

        //Ajouter les sous-répertoires dans le répertoire racine
        doc.ajouterComposant(dic1);
        doc.ajouterComposant(documents);

        //Ajout des fichiers dans les sous répertoires du répertoire racine
        dic1.ajouterComposant(new Fichier("TP_RESEAU3.pdf"));
        dic1.ajouterComposant(new Fichier("Info.php"));
        documents.ajouterComposant(new Fichier("CalculNumérique.word"));
        documents.ajouterComposant(new Fichier("Capture d\u2019\u00E9cran de 2023-07-06 12-08-35.png"));

        //Afficher le contenu du répertoire semestre2
        doc.affiche("");

    }
}
