import java.io.File;
import java.util.ArrayList;
import java.util.List;

// Classe composante abstraite
abstract class FileSystemComponent {
    protected String name;

    public FileSystemComponent(String name) {
        this.name = name;
    }

    public abstract void display(int depth);
}

// Classe feuille représentant un fichier
class FileLeaf extends FileSystemComponent {
    public FileLeaf(String name) {
        super(name);
    }

    @Override
    public void display(int depth) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            indent.append("  ");
        }
        System.out.println(indent + name);
    }
}

// Classe composite représentant un dossier
class DirectoryComposite extends FileSystemComponent {
    private List<FileSystemComponent> children;

    public DirectoryComposite(String name) {
        super(name);
        children = new ArrayList<>();
    }

    public void add(FileSystemComponent component) {
        children.add(component);
    }

    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            indent.append("  ");
        }
        System.out.println(indent + "[" + name + "]");

        for (FileSystemComponent component : children) {
            component.display(depth + 1);
        }
    }
}

// Classe cliente pour tester le programme
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
