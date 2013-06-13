import java.util.*;

public class Labyrinth {



	private Map<Node, ArrayList<Edge>> nodes;

	

	

	public Labyrinth(){

		this.nodes = new HashMap<Node, ArrayList<Edge>>(); 

	}



	public void addNode(Node node, Node[] edges) {

		Edge e = null;

		ArrayList<Edge> list = new ArrayList<Edge>();

	    for (Node edge : edges){

	    	e = new Edge(node, edge);

	    	list.add(e);

	    }

	   nodes.put(node, list);

	  }

	

	public void print() {

		String result = "";

		for (Node v : nodes.keySet()) {

		    ArrayList<Edge> node = nodes.get(v);

		    Iterator<Edge> iterator = node.iterator();

		    System.out.print(v.getData() + " : ");

		    while(iterator.hasNext()){

				result += "" +iterator.next().getNode2().getData();

			}

		    System.out.println(result);

		    result = "";

		 }

	 }

	

	public Map<Node, ArrayList<Edge>> getNodes()

	{

		return nodes;

	}

}




