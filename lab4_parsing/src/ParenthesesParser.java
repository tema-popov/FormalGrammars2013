import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class ParenthesesParser {

    static public class Node {
            List<Node> children;
            String name;
            String value;

            //  User fields
             int level = -1;
 
            //

            public Node(String name, String value) {
                this.value = value;
                this.name = name;
                this.children = new ArrayList<Node>();
            }

            void addNode(Node node) {
                children.add(node);
            }

            public String printLevel(int level) {
                String tabs = "";
                for (int i = 0; i < level; i++) {
                    tabs += "\t";
                }
                if (name.equals("openBr") || name.equals("closeBr")) {
                    return name.equals("openBr") ? tabs + "(\n" : tabs + ")\n";
                }
                String ans = tabs + name + "{" + this.level + "}" + " -> \n";
                for (Node child : children) {
                    ans += child.printLevel(level + 1);
                }
                return ans;
            }

            @Override
            public String toString() {
                return printLevel(0);
            }
    }

    public ParenthesesParser(List<Lexem> lexems) {
        final ArrayList<Lexem> newLexems = new ArrayList<Lexem>(lexems);
        newLexems.add(Lexem.END_LEXEM);
        this.lexems = newLexems.iterator();
        currentLexem = this.lexems.next();
    }


    Iterator<Lexem> lexems;
    Lexem currentLexem;
    Set<String> terminals = new HashSet<String>(Arrays.asList("or", "openBr", "closeBr", "not", "and", "xor", "var", "EPS"));
    Set<String> nonTerminals = new HashSet<String>(Arrays.asList("OR", "OR_", "XOR", "XOR_", "AND", "AND_", "TERM"));

    // SETS Set<String> MAINSet = new HashSet<String>(Arrays.asList("not", "openBr", "var", "END"));
    	Set<String> MAINSet = new HashSet<String>(Arrays.asList("openBr"));
	Set<String> SSet = new HashSet<String>(Arrays.asList("openBr", "closeBr", "END"));
    // END OF SETS

    // BEGIN OF NODES
    	public Node MAIN(Node node0) {
		if (MAINSet.contains(currentLexem.name)) {
			if (currentLexem.name.equals("openBr")){
				Node node1 = new Node("S", null);
				Node node2 = new Node("END", null);
				node1 = S(node1);
				node0.addNode(node1);
				node2 = test("END", node2);
				node0.addNode(node2);
				return node0;
			}
			return node0;
		} else {
			throw new UnexpectedLexemException(MAINSet, currentLexem.name);
		}
	}

	public Node S(Node node0) {
		if (SSet.contains(currentLexem.name)) {
			if (currentLexem.name.equals("openBr")){
				Node node1 = new Node("openBr", null);
				Node node2 = new Node("S", null);
				Node node3 = new Node("closeBr", null);
				Node node4 = new Node("S", null);
				
				if (node0.level == -1) {
				node0.level = 0;
				}
				node2.level = node0.level + 1;
				node4.level = node0.level;
				
				node1 = test("openBr", node1);
				node0.addNode(node1);
				node2 = S(node2);
				node0.addNode(node2);
				node3 = test("closeBr", node3);
				node0.addNode(node3);
				node4 = S(node4);
				node0.addNode(node4);
				return node0;
			}
			if (currentLexem.name.equals("closeBr")){
				return node0;
			}
			if (currentLexem.name.equals("END")){
				return node0;
			}
			return node0;
		} else {
			throw new UnexpectedLexemException(SSet, currentLexem.name);
		}
	}

    // END OF NODES

    private Node test(String value, Node node) {
            if (currentLexem.name.equals(value)) {
                try {
                    node.name = value;
                    node.value = currentLexem.value;
                    currentLexem = lexems.next();
                    return node;
                }
                catch (NoSuchElementException e) {
                    throw new UnexpectedEndException();
                }

            } else
                throw new UnexpectedLexemException(new HashSet<String>(Arrays.asList(value)), currentLexem.value);
    }


}
