import java.io.File;
import java.util.ArrayList;
import java.util.List;

class Dossier extends Composant {
    private List<Composant> composants;

    public Dossier(String nom) {
        super(nom);
        this.composants = new ArrayList<>();
    }

     /**
     * Ajoute un composant au dossier.
     *
     * @param composant Le composant à ajouter.
     */
    public void ajouterComposant(Composant composant) {
        composants.add(composant);
    }

     /**
     * Supprime un composant du dossier.
     *
     * @param composant Le composant à supprimer.
     */
    public void supprimerComposant(Composant composant) {
        composants.remove(composant);
    }

    @Override
    public void affiche(String indent) {
        System.out.println(indent + "\u2514\u2500 " + getNom());
        for (Composant composant : composants) {
            composant.affiche(indent + "    ");
        }
    }
}
