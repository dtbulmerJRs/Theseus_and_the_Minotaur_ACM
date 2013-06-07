/**

 * 

 */



/**

 * @author Derrik2

 *

 */

public class Duel 

{

	private Minotaur m;

	private Theseus t;

	private String result;

	private boolean slainTheseus;

	private boolean slainMinotaur;

	

	public Duel(Minotaur m, Theseus t)

	{

		this.m = m;

		this.t = t;

		slainMinotaur = false;

		slainTheseus = false;

	}

	

	public void setResult(String s)

	{

		result = s;

	}

	

	public String getResult()

	{

		return result;

	}

	

	public void start()

	{

		boolean collision = false;

		char tDest = '#'; // # is undeclared, so if found in main, indicates error in loop

		char mDest = '#';

		char tPrev = '#';

		char mPrev;

		while(!collision)

		{

			move();// move them both

			

			// check for collisions

			tDest = t.getT().get(t.getT().size()-1).getNode2().getData();

			mDest = m.getM().get(m.getM().size()-1).getNode2().getData();

			tPrev = t.getT().get(t.getT().size()-1).getNode1().getData();

			mPrev = m.getM().get(m.getM().size()-1).getNode1().getData();

			

			if( tDest == mDest )	

			{

				collision = true;

				slainMinotaur= true;

				

			}

			else if( (mDest == tPrev) && (mPrev == tDest))

			{

				collision = true;

				slainTheseus = true;

			}

		}

		// print last location moved

		 System.out.println("T:" + t.T.get(t.T.size() - 1).getNode1().getData() +  t.T.get(t.T.size() - 1).getNode2().getData());

		 System.out.println("M:" + m.M.get(m.M.size() - 1).getNode1().getData() +  m.M.get(m.M.size() - 1).getNode2().getData());

		 System.out.println();

		if(slainMinotaur)

		{

			setResult("The Minotaur was SLAIN at cavern " + mDest);

		}

		else if(slainTheseus)

		{

			setResult("Theseus was SLAIN in the tunnel between cavern " + tPrev + " and cavern " + tDest);

		}

	}

	

	public void move()

	{

		// print movements

		// print location moved

		 System.out.println("T:" + t.T.get(t.T.size() - 1).getNode1().getData() +  t.T.get(t.T.size() - 1).getNode2().getData());

		 System.out.println("M:" + m.M.get(m.M.size() - 1).getNode1().getData() +  m.M.get(m.M.size() - 1).getNode2().getData());

		 System.out.println();

		t.move();

		m.move();

	

	}

}
