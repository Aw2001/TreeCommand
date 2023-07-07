public class Main {
    public static void main(String[] args) {
        // Création de la structure d'arborescence

        // Répertoire racine
        DirectoryComposite root = new DirectoryComposite("root");

        // Sous-répertoire 1
        DirectoryComposite dir1 = new DirectoryComposite("dir1");
        FileLeaf file1 = new FileLeaf("file1");
        dir1.add(file1);

        // Sous-répertoire 2
        DirectoryComposite dir2 = new DirectoryComposite("dir2");
        FileLeaf file2 = new FileLeaf("file2");
        FileLeaf file3 = new FileLeaf("file3");
        dir2.add(file2);
        dir2.add(file3);

        root.add(dir1);
        root.add(dir2);

        // Affichage de la structure d'arborescence
        root.display(0);
    }
}
