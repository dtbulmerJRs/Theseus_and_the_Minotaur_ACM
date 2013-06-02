

public class Edge{
	public Node n1;
	public Node n2;
	boolean markedExit; 
	
	public Edge(){
		
	}
	
	public Edge( Node n1, Node n2 ){
		this.n1 = n1;
		this.n2 = n2;
		markedExit = false;
	}
	
	public Node getNode1(){
		return n1;
	}
	
	public Node getNode2(){
		return n2;
	}

	public void setMarkedExit(boolean s){
		markedExit = s;
	}
	
	public boolean getMarkedExit()
	{
		return markedExit;
	}
	

}
