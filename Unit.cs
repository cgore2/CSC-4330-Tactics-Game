using System;
using UnityEngine;
using System.Collections;

namespace UnityStandardAssets._2D
{

	public class Unit : MonoBehaviour
	{
	    private int hitPoints;
	    private int attackPoints;
	    private int[] status = new int[3]    //array to store HP, AP, and position
	    //public Square moveRange; 
	    //public Square attackRange;
	    Unit unit = new Unit();
	    public Square position;          		//need int[,] square = new int[3,3]{
	    						//{{0,0}{0,1}{0,2}},
							//{{1,0}{1,1}{1,2}},
							//{{2,0}{2,1}{2,2}}; also getSquare() method


	    protected void Start()
	    {
		hitPoints = 10;
		attackPoints = 5;
		position = square[0,0];
	    }

	    // Update is called once per frame
	    protected void Update()
	    {
		hitPoints = hitPoints;
		attackPoints = attackPoints;
		position = unit.getSquare();
	    }

	    //moves the unit from its current position(square) to a new square
	    public void MoveUnit(int x, int y)
	    {
	       position = square[x,y];
	    }

	    public void Attack()
	    {
		//implement
	    }

	    //returns HP and AP in an array
	    private int[] checkStatus()
	    {
		status[0] = hitPoints;
		status[1] = attackPoints;
		status[3] = position;
		return status;
	    }
	}
}
