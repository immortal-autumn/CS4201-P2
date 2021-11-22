import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ASTRoot implements AbsSynTree {

    public List<String> lambdaExpr;
    private final Map<String, ASTNode> childs;

    ASTRoot(List<String> l) {
        childs = new HashMap<>();
        lambdaExpr = new ArrayList<>(l);
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
