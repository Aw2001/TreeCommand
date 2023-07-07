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
