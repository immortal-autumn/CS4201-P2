public interface AbsSynTree {
    String lambda = "\\";
    String Y_comb = "Y";

    void add(String name, ASTNode syntax);
    void search();
    void convert();
//    void setChild(ASTNode tree);
    ASTNode getChild(String name);
}
