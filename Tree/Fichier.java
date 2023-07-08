class Fichier extends Composant {
    public Fichier(String nom) {
        super(nom);
    }

    @Override
    public void affiche(String indent) {
        System.out.println(indent + "|-- " + getNom());
    }
}
