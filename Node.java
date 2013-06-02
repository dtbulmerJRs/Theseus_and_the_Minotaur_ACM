

import java.util.ArrayList;
import java.util.Iterator;

public class Node {
	public String data;
	public boolean isLit;
	public boolean isDirty;
	
	public Node(String data){
		this.data = data;
		isLit = false;
		isDirty = false;
	}
	
	public boolean getisLit(){
		return isLit;
	}
	
	public String getData(){
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




