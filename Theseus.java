import java.util.ArrayList;

import java.util.Set;

import java.util.Stack;



/**

 * 

 */



/**

 * @author Derrik2

 *

 */

public class Theseus 

{

	ArrayList<Edge> T; 

	Labyrinth graph;

	

	public Theseus(Labyrinth graph, Node start, Node end)

	{

		T = new ArrayList<Edge>();

		this.graph = graph;

		

		// make an Edge

		Edge starting = new Edge(start, end);

		

		ArrayList<Edge> listStart = this.graph.getNodes().get(start);

		

		for(Edge edge : listStart)

		{

			if(edge.getNode1().getData() == start.getData()

					&& edge.getNode2().getData() == end.getData())

			{

				// then we found it

				T.add(edge); 

			}

		}

		if(T.isEmpty())

		{

			System.out.println("Error, not a valid start position");

		}

		// find and confirm start position in graph

		

	}

		

	public void move()

	{

		 ArrayList<Edge> list;

		 Edge n = T.get(T.size() - 1);

		 Node prev = n.getNode1();

		 Node curr = n.getNode2();

		 list = graph.getNodes().get(curr);

		 boolean lost = true;

		 

		 for(int i = 0; i < list.size(); i++){

			 if(!list.get(i).getMarkedExit()){

				 lost = false;

			 }

		 }

		 if(lost){

			 System.out.println("Theseus is lost in cavern " +curr);

			 return;

		 }

		 int i = 0;

		 if(!curr.getisDirty())

		 { 

			 while(prev.getData() != list.get(i).getNode2().getData())

			 {

			 	i++;

			 }

			 if(i >= list.size() - 1)

			 {

			 	i = 0;

			 	while(list.get(i).getMarkedExit()){

			 		i++;

			 	}

			 	T.add(list.get(i));

			  }

			 else

			 {

			 	 while(list.get(i+1).getMarkedExit()){

			 		 i++;

			 		 if(i >= list.size() - 1){

			 			 i = -1;

			 		 }

			 	 }

				 T.add(list.get(i + 1));

			 }

			 T.get(T.size() - 1).setMarkedExit(true);

		 }

		 else

		 {  // this is the minotaur's clockwise move algorithm

			 i = list.size() - 1;

			 while(prev.getData() != list.get(i).getNode2().getData())

			 {

			 	i--;

			 }	 

			 if(i <= 0)

			 {

				 i = list.size() - 1;

				 while(list.get(i).getMarkedExit()){

				 		i--;

				 }

				 	T.add(list.get(i));

			 }

			 else

			 {

			 	 while(list.get(i-1).getMarkedExit()){

			 		 i--;

			 		 if(i >= 0){

			 			 i = list.size();

			 		 }

			 	 }

			 	 T.add(list.get(i - 1));

			 	 T.get(T.size() - 1).setMarkedExit(true);

			 	 curr.setisLit(true);

			 }

		 }

		

	}

	public ArrayList<Edge> getT()

	{

		return T;

	}

}
