import java.io.File;

public class TestTreeCommand {
    public static void main(String[] args) {
        File directory = new File("/home/awa/Documents/DIC1/semestre2"); // Remplacez par le chemin du répertoire de départ
        
        if (!directory.isDirectory()) {
            System.out.println("Le chemin spécifié n'est pas un répertoire valide.");
            return;
        }
        
        System.out.println(directory.getName());
        displayTree(directory, "");
    }
    
    private static void displayTree(File directory, String indent) {
        File[] files = directory.listFiles();
        
        if (files == null) {
            return;
        }
        
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            
            if (file.isDirectory()) {
                System.out.println(indent + "|-- " + file.getName());
                displayTree(file, indent + "    ");
            } else {
                System.out.println(indent + "|-- " + file.getName());
            }
        }
    }
}
