import java.util.*;

/**
 * Author: Artem Popov <jambo@yandex-team.ru>
 * Date: 02.06.13
 */
public class ExampleParser {

    public class Node {
        List<Node> children;
        String value;

        public Node() {
            this.children = new ArrayList<Node>();
        }

        void addNode(Node node) {
            children.add(node);
        }

    }

    public ExampleParser(List<Lexem> lexems) {
        final ArrayList<Lexem> newLexems = new ArrayList<Lexem>(lexems);
        newLexems.add(Lexem.REAL_END_LEXEM);
        this.lexems = lexems.iterator();
        currentLexem = this.lexems.next();
    }

    public Node parse() {
        return MAIN();
    }

    Iterator<Lexem> lexems;
    Lexem currentLexem;
    Set<String> terminals = new HashSet<String>(Arrays.asList("or", "openBr", "closeBr", "not", "and", "xor", "var", "EPS"));
    Set<String> nonTerminals = new HashSet<String>(Arrays.asList("OR", "OR_", "XOR", "XOR_", "AND", "AND_", "TERM"));

    // FIRST SET
    Set<String> MAINSet = new HashSet<String>(Arrays.asList("not", "openBr", "var", "END"));

    private Node MAIN() {
        final Node node = new Node();
        if (MAINSet.contains(currentLexem.name)) {
            if (currentLexem.name.equals("not")){
                node.addNode(OR());
                node.addNode(test("END"));
            }
            if (currentLexem.name.equals("openBr")){
                node.addNode(OR());
                node.addNode(test("END"));
            }
            if (currentLexem.name.equals("var")){
                node.addNode(OR());
                node.addNode(test("END"));
            }
            if (currentLexem.name.equals("END")){
                node.addNode(OR());
                node.addNode(test("END"));
            }
            return node;
        } else {
            throw new UnexpectedLexemException(MAINSet, currentLexem.name);
        }
    }

    private Node test(String value) {
        if (currentLexem.name.equals(value)) {
            try {
                currentLexem = lexems.next();
            }
            catch (NoSuchElementException e) {
                throw new UnexpectedEndException();
            }
            return new Node();
        } else
            throw new UnexpectedLexemException(new HashSet<String>(Arrays.asList(value)), currentLexem.value);
    }


    private Node OR() {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }




}
