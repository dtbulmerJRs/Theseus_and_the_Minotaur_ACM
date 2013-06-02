import java.util.ArrayList;
import java.util.Scanner;


public class Project328 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO:  use user input or txt files to make graphs
		
	
		Node a = new Node("a");
		Node b = new Node("b");
		Node c = new Node("c");
		Node d = new Node("d");
		Node e = new Node("e");
		Node f = new Node("f");
		Node g = new Node("g");
		Node h = new Node("h");
		
		
	    Labyrinth graph = new Labyrinth();
	    
	    graph.addNode(a, new Node[] { b, c, d });
	    graph.addNode(b, new Node[] { a, d });
	    graph.addNode(c, new Node[] { a, d });
	    graph.addNode(d, new Node[] { b, a, c, g });
	    graph.addNode(e, new Node[] { f, g, h });
	    graph.addNode(f, new Node[] { h, e });
	    graph.addNode(g, new Node[] { h, e, d });
	    graph.addNode(h, new Node[] { f, e, g });
	    graph.print();
	    
	    
	    Scanner scanner = new Scanner(System.in);
	    boolean flag = true;
	    String str;
	    String delim = "[ ]+";
	    String[] tokens;
	    Node[] temp;
	    System.out.println("Enter a node witih edges in the form A:BDC");
	    // TODO: Nodes are being created and stored, but not the right ones.
	    while(flag)
	    {
	    	int count = 0;
	    	str = scanner.next();
	    	tokens = str.split(delim);
	    	temp = new Node[tokens.length];
	    	Node first = new Node(tokens[0]); 
	    	if(!tokens[0].equals("#")){
		    	for(int i = 2; i < tokens.length; i++)
		    	{
		    		Node newNode = new Node(tokens[i]);
		    		temp[count] = newNode;
		    		count++;
		    	}
		    	graph.addNode(first, temp);
	    	}
	    	else
	    		flag = false;
	    }
	    graph.print();
	   
	    Theseus t = new Theseus(graph,a,c);
	    Minotaur m = new Minotaur(graph,d,g);
	    
	    Duel dl = new Duel(m, t);
	    dl.start();
	    System.out.println(dl.getResult());
	    
	
	//
	}
}
