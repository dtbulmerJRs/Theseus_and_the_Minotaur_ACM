import java.util.ArrayList;



/**

 * 

 */



/**

 * @author Derrik2

 *

 */

public class Minotaur 

{

	ArrayList<Edge> M; 

	Labyrinth graph;

	boolean coward;

	

	public Minotaur(Labyrinth graph, Node start, Node end)

	{

		M = new ArrayList<Edge>();

		this.graph = graph;

		coward = false;

		// make an Edge

		Edge starting = new Edge(start, end);

		

		ArrayList<Edge> listStart = this.graph.getNodes().get(start);

		

		for(Edge edge : listStart)

		{

			if(edge.getNode1().getData() == start.getData()

					&& edge.getNode2().getData() == end.getData())

			{

				// then we found it

				M.add(edge); 

			}

		}

		if(M.isEmpty())

		{

			System.out.println("Error, not a valid start position");

		}

		// find and confirm start position in graph

		

	}

		

	public void move()

	{

		 ArrayList<Edge> list;

		 Edge n = M.get(M.size() - 1);

		 Node prev = n.getNode1();

		 Node curr = n.getNode2();

		 list = graph.getNodes().get(curr);

		 int i = list.size() - 1;

		 if(!coward)

		 {

			 while(prev.getData() != list.get(i).getNode2().getData())

			 {

				 i--;

			 }

		 

			 if(!list.get(list.size() - 1).getNode2().getisLit())

			 {

				 if(i <= 0)

				 	M.add(list.get(list.size() - 1));

				 else

				 	M.add(list.get(i - 1));

				 curr.setisDirty(true);

			 }

			 else

			 {

				 // he runs like a coward back through the tunnel

				 if(i <= 0)

					 M.add(list.get(list.size() - 1));

				 else

					 M.add(list.get(i - 1));

				 coward = true;

				 

			 }

		 }

		 else

		 {

			 coward = false;

			 list = graph.getNodes().get(curr);

			 while(prev.getData() != list.get(i).getNode2().getData())

			 {

				 i--;

			 }

		 

			 if(i <= 0)

			 	M.add(list.get(0));

			 else

			 	M.add(list.get(i));

		 }

		 

		 

		 

	}

	

	public ArrayList<Edge> getM()

	{

		return M;

	}

}
