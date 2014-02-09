import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class BooleanParser {

    static public class Node {
            List<Node> children;
            String name;
            String value;

            //  User fields
             boolean result;
   boolean isEmpty = false;
 
            //

            public Node(String name, String value) {
                this.value = value;
                this.name = name;
                this.children = new ArrayList<Node>();
            }

            void addNode(Node node) {
                children.add(node);
            }

            @Override
            public String toString() {
                return name + " -> [" + StringUtils.join(children, ", ") + "]";
            }
    }

    public BooleanParser(List<Lexem> lexems) {
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
    	Set<String> TERMSet = new HashSet<String>(Arrays.asList("not", "openBr", "value"));
	Set<String> MAINSet = new HashSet<String>(Arrays.asList("not", "openBr", "END", "value"));
	Set<String> XORSet = new HashSet<String>(Arrays.asList("not", "openBr", "xor", "value"));
	Set<String> AND_Set = new HashSet<String>(Arrays.asList("xor", "or", "closeBr", "END", "and"));
	Set<String> OR_Set = new HashSet<String>(Arrays.asList("or", "closeBr", "END"));
	Set<String> XOR_Set = new HashSet<String>(Arrays.asList("xor", "or", "closeBr", "END"));
	Set<String> ANDSet = new HashSet<String>(Arrays.asList("not", "openBr", "value", "and"));
	Set<String> ORSet = new HashSet<String>(Arrays.asList("not", "openBr", "or", "value"));
    // END OF SETS

    // BEGIN OF NODES
    	public Node TERM(Node node0) {
		if (TERMSet.contains(currentLexem.name)) {
			if (currentLexem.name.equals("not")){
				Node node1 = new Node("not", null);
				Node node2 = new Node("TERM", null);
				node1 = test("not", node1);
				node0.addNode(node1);
				node2 = TERM(node2);
				node0.addNode(node2);
				node0.result = !node2.result;
				return node0;
			}
			if (currentLexem.name.equals("openBr")){
				Node node1 = new Node("openBr", null);
				Node node2 = new Node("OR", null);
				Node node3 = new Node("closeBr", null);
				node1 = test("openBr", node1);
				node0.addNode(node1);
				node2 = OR(node2);
				node0.addNode(node2);
				node3 = test("closeBr", node3);
				node0.addNode(node3);
				node0.result = node2.result;
				return node0;
			}
			if (currentLexem.name.equals("value")){
				Node node1 = new Node("value", null);
				node1 = test("value", node1);
				node0.addNode(node1);
				node1.result = node1.value.equals("true"); node0.result = node1.result;
				return node0;
			}
			return node0;
		} else {
			throw new UnexpectedLexemException(TERMSet, currentLexem.name);
		}
	}

	public Node MAIN(Node node0) {
		if (MAINSet.contains(currentLexem.name)) {
			if (currentLexem.name.equals("not")){
				Node node1 = new Node("OR", null);
				Node node2 = new Node("END", null);
				node1 = OR(node1);
				node0.addNode(node1);
				node2 = test("END", node2);
				node0.addNode(node2);
				return node0;
			}
			if (currentLexem.name.equals("openBr")){
				Node node1 = new Node("OR", null);
				Node node2 = new Node("END", null);
				node1 = OR(node1);
				node0.addNode(node1);
				node2 = test("END", node2);
				node0.addNode(node2);
				return node0;
			}
			if (currentLexem.name.equals("END")){
				Node node1 = new Node("OR", null);
				Node node2 = new Node("END", null);
				node1 = OR(node1);
				node0.addNode(node1);
				node2 = test("END", node2);
				node0.addNode(node2);
				return node0;
			}
			if (currentLexem.name.equals("value")){
				Node node1 = new Node("OR", null);
				Node node2 = new Node("END", null);
				node1 = OR(node1);
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

	public Node XOR(Node node0) {
		if (XORSet.contains(currentLexem.name)) {
			if (currentLexem.name.equals("not")){
				Node node1 = new Node("AND", null);
				Node node2 = new Node("XOR_", null);
				node1 = AND(node1);
				node0.addNode(node1);
				node2 = XOR_(node2);
				node0.addNode(node2);
				
				if (!node2.isEmpty) {
				node0.result = node1.result != node2.result;
				} else node0.result = node1.result;
				
				return node0;
			}
			if (currentLexem.name.equals("openBr")){
				Node node1 = new Node("AND", null);
				Node node2 = new Node("XOR_", null);
				node1 = AND(node1);
				node0.addNode(node1);
				node2 = XOR_(node2);
				node0.addNode(node2);
				
				if (!node2.isEmpty) {
				node0.result = node1.result != node2.result;
				} else node0.result = node1.result;
				
				return node0;
			}
			if (currentLexem.name.equals("xor")){
				Node node1 = new Node("AND", null);
				Node node2 = new Node("XOR_", null);
				node1 = AND(node1);
				node0.addNode(node1);
				node2 = XOR_(node2);
				node0.addNode(node2);
				
				if (!node2.isEmpty) {
				node0.result = node1.result != node2.result;
				} else node0.result = node1.result;
				
				return node0;
			}
			if (currentLexem.name.equals("value")){
				Node node1 = new Node("AND", null);
				Node node2 = new Node("XOR_", null);
				node1 = AND(node1);
				node0.addNode(node1);
				node2 = XOR_(node2);
				node0.addNode(node2);
				
				if (!node2.isEmpty) {
				node0.result = node1.result != node2.result;
				} else node0.result = node1.result;
				
				return node0;
			}
			return node0;
		} else {
			throw new UnexpectedLexemException(XORSet, currentLexem.name);
		}
	}

	public Node AND_(Node node0) {
		if (AND_Set.contains(currentLexem.name)) {
			if (currentLexem.name.equals("xor")){
				node0.isEmpty = true;
				return node0;
			}
			if (currentLexem.name.equals("or")){
				node0.isEmpty = true;
				return node0;
			}
			if (currentLexem.name.equals("closeBr")){
				node0.isEmpty = true;
				return node0;
			}
			if (currentLexem.name.equals("END")){
				node0.isEmpty = true;
				return node0;
			}
			if (currentLexem.name.equals("and")){
				Node node1 = new Node("and", null);
				Node node2 = new Node("TERM", null);
				Node node3 = new Node("AND_", null);
				node1 = test("and", node1);
				node0.addNode(node1);
				node2 = TERM(node2);
				node0.addNode(node2);
				node3 = AND_(node3);
				node0.addNode(node3);
				
				if (!node3.isEmpty) {
				node0.result = node2.result && node3.result;
				} else node0.result = node2.result;
				
				return node0;
			}
			return node0;
		} else {
			throw new UnexpectedLexemException(AND_Set, currentLexem.name);
		}
	}

	public Node OR_(Node node0) {
		if (OR_Set.contains(currentLexem.name)) {
			if (currentLexem.name.equals("or")){
				Node node1 = new Node("or", null);
				Node node2 = new Node("XOR", null);
				Node node3 = new Node("OR_", null);
				node1 = test("or", node1);
				node0.addNode(node1);
				node2 = XOR(node2);
				node0.addNode(node2);
				node3 = OR_(node3);
				node0.addNode(node3);
				
				if (!node3.isEmpty) {
				node0.result = node2.result || node3.result;
				} else node0.result = node2.result;
				
				return node0;
			}
			if (currentLexem.name.equals("closeBr")){
				node0.isEmpty = true;
				return node0;
			}
			if (currentLexem.name.equals("END")){
				node0.isEmpty = true;
				return node0;
			}
			return node0;
		} else {
			throw new UnexpectedLexemException(OR_Set, currentLexem.name);
		}
	}

	public Node XOR_(Node node0) {
		if (XOR_Set.contains(currentLexem.name)) {
			if (currentLexem.name.equals("xor")){
				Node node1 = new Node("xor", null);
				Node node2 = new Node("AND", null);
				Node node3 = new Node("XOR_", null);
				node1 = test("xor", node1);
				node0.addNode(node1);
				node2 = AND(node2);
				node0.addNode(node2);
				node3 = XOR_(node3);
				node0.addNode(node3);
				
				if (!node3.isEmpty) {
				node0.result = node2.result != node3.result;
				} else node0.result = node2.result;
				
				return node0;
			}
			if (currentLexem.name.equals("or")){
				node0.isEmpty = true;
				return node0;
			}
			if (currentLexem.name.equals("closeBr")){
				node0.isEmpty = true;
				return node0;
			}
			if (currentLexem.name.equals("END")){
				node0.isEmpty = true;
				return node0;
			}
			return node0;
		} else {
			throw new UnexpectedLexemException(XOR_Set, currentLexem.name);
		}
	}

	public Node AND(Node node0) {
		if (ANDSet.contains(currentLexem.name)) {
			if (currentLexem.name.equals("not")){
				Node node1 = new Node("TERM", null);
				Node node2 = new Node("AND_", null);
				node1 = TERM(node1);
				node0.addNode(node1);
				node2 = AND_(node2);
				node0.addNode(node2);
				
				if (!node2.isEmpty) {
				node0.result = node1.result && node2.result;
				} else node0.result = node1.result;
				
				return node0;
			}
			if (currentLexem.name.equals("openBr")){
				Node node1 = new Node("TERM", null);
				Node node2 = new Node("AND_", null);
				node1 = TERM(node1);
				node0.addNode(node1);
				node2 = AND_(node2);
				node0.addNode(node2);
				
				if (!node2.isEmpty) {
				node0.result = node1.result && node2.result;
				} else node0.result = node1.result;
				
				return node0;
			}
			if (currentLexem.name.equals("value")){
				Node node1 = new Node("TERM", null);
				Node node2 = new Node("AND_", null);
				node1 = TERM(node1);
				node0.addNode(node1);
				node2 = AND_(node2);
				node0.addNode(node2);
				
				if (!node2.isEmpty) {
				node0.result = node1.result && node2.result;
				} else node0.result = node1.result;
				
				return node0;
			}
			if (currentLexem.name.equals("and")){
				Node node1 = new Node("TERM", null);
				Node node2 = new Node("AND_", null);
				node1 = TERM(node1);
				node0.addNode(node1);
				node2 = AND_(node2);
				node0.addNode(node2);
				
				if (!node2.isEmpty) {
				node0.result = node1.result && node2.result;
				} else node0.result = node1.result;
				
				return node0;
			}
			return node0;
		} else {
			throw new UnexpectedLexemException(ANDSet, currentLexem.name);
		}
	}

	public Node OR(Node node0) {
		if (ORSet.contains(currentLexem.name)) {
			if (currentLexem.name.equals("not")){
				Node node1 = new Node("XOR", null);
				Node node2 = new Node("OR_", null);
				node1 = XOR(node1);
				node0.addNode(node1);
				node2 = OR_(node2);
				node0.addNode(node2);
				
				if (!node2.isEmpty) {
				node0.result = node1.result || node2.result;
				} else node0.result = node1.result;
				return node0;
			}
			if (currentLexem.name.equals("openBr")){
				Node node1 = new Node("XOR", null);
				Node node2 = new Node("OR_", null);
				node1 = XOR(node1);
				node0.addNode(node1);
				node2 = OR_(node2);
				node0.addNode(node2);
				
				if (!node2.isEmpty) {
				node0.result = node1.result || node2.result;
				} else node0.result = node1.result;
				return node0;
			}
			if (currentLexem.name.equals("or")){
				Node node1 = new Node("XOR", null);
				Node node2 = new Node("OR_", null);
				node1 = XOR(node1);
				node0.addNode(node1);
				node2 = OR_(node2);
				node0.addNode(node2);
				
				if (!node2.isEmpty) {
				node0.result = node1.result || node2.result;
				} else node0.result = node1.result;
				return node0;
			}
			if (currentLexem.name.equals("value")){
				Node node1 = new Node("XOR", null);
				Node node2 = new Node("OR_", null);
				node1 = XOR(node1);
				node0.addNode(node1);
				node2 = OR_(node2);
				node0.addNode(node2);
				
				if (!node2.isEmpty) {
				node0.result = node1.result || node2.result;
				} else node0.result = node1.result;
				return node0;
			}
			return node0;
		} else {
			throw new UnexpectedLexemException(ORSet, currentLexem.name);
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
