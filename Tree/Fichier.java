class Fichier extends Composant {
    public Fichier(String nom) {
        super(nom);
    }

    @Override
    public void affiche(String indent) {
        System.out.println(indent + "\u2514\u2500 " + getNom());
    }
}
