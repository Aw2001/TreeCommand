import java.io.File;

public abstract class Composant {
    private String nom;

    public Composant(String nom) {
        this.nom = nom;
    }

       /**
     * Obtient le nom du composant.
     *
     * @return Le nom du composant.
     */
    public String getNom() {
        return this.nom;
    }
    
     /**
     * Affiche le composant avec l'indentation spécifiée.
     *
     * @param indent L'indentation à utiliser pour l'affichage.
     */
    public abstract void affiche(String indent);
}
