

public class Project328 {



	/**

	 * @param args

	 */

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// TODO:  use user input or txt files to make graphs

		Node a = new Node('a');

		Node b = new Node('b');

		Node c = new Node('c');

		Node d = new Node('d');

		Node e = new Node('e');

		Node f = new Node('f');

		Node g = new Node('g');

		Node h = new Node('h');

		

		

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

	    

	    Theseus t = new Theseus(graph,a,c);

	    Minotaur m = new Minotaur(graph,d,g);

	    

	    Duel dl = new Duel(m, t);

	    dl.start();

	    System.out.println(dl.getResult());

	

	//

	

	}



}
