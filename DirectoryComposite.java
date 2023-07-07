import java.util.ArrayList;
import java.util.List;

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
