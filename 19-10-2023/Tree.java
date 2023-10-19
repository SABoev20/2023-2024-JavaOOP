public class Tree {
    private String type;
    private int age;
    private double height;
    private int branches;
    private int leafs;

    public Tree(String type, int age, double height, int branches, int leafs) {
        this.type = type;
        this.age = age;
        this.height = height;
        this.branches = branches;
        this.leafs = leafs;
    }

    public void grow(int age, double height, int branches, int leafs){
        this.age += age;
        this.height += height;
        this.branches += branches;
        this.leafs += leafs;
    }

    public void shedLeaves(int fallenLeafs){
        this.leafs -= fallenLeafs;
    }

    public String getTreeInfo() {
        return "type=" + type + '\n' +
                "age=" + age + '\n' +
                "height=" + height + '\n' +
                "branches=" + branches + '\n' +
                "leafs=" + leafs;
    }
}
