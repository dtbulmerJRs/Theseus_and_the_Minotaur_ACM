



import java.util.ArrayList;

import java.util.Iterator;



public class Node {

	public char data;

	public boolean isLit;

	public boolean isDirty;

	

	public Node(char data){

		this.data = data;

		isLit = false;

		isDirty = false;

	}

	

	public boolean getisLit(){

		return isLit;

	}

	

	public char getData(){

		return data;

	}

	

	public void setisLit(boolean isLit){

		this.isLit = isLit;

	}

	

	public boolean getisDirty()

	{

		return isDirty;

	}

	

	public void setisDirty(boolean isDirty)

	{

		this.isDirty = isDirty;

	}

}








