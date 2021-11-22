import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ASTNode implements AbsSynTree {
    public String name;
    public int type;
    public List<String> lambdaExpr;
    private final Map<String, ASTNode> childs;

    ASTNode(String name, int type, List<String> l) {
        childs = new HashMap<>();
        lambdaExpr = new ArrayList<>(l);
        this.name = name;
        this.type = type;
    }

    @Override
    public void add(String name, ASTNode syntax) {

    }

    @Override
    public void search() {

    }

    @Override
    public void convert() {

    }

    @Override
    public ASTNode getChild(String name) {
        return childs.get(name);
    }
}
