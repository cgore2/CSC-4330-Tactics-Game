using System;
using UnityEngine;
using System.Collections;

namespace UnityStandardAssets._2D
{

	public class Unit : MonoBehaviour
	{
	    private int hitPoints;
	    private int attackPoints;
	    private int[] status = new int[2]    //array to store HP and AP
	    //public Square moveRange; 
	    //public Square attackRange;
	    public Square position;             //stores the position of the current unit


	    protected void Start()
	    {
		hitPoints = 10;
		attackPoints = 5;
	    }

	    // Update is called once per frame
	    protected void Update()
	    {
		hitPoints = hitPoints;
		attackPoints = attackPoints;
	    }

	    //moves the unit from its current position(square) to a new square
	    public void MoveUnit(int x, int y)
	    {
	       position = square[x][y];
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
		return status;
	    }
	}
}
