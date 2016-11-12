using System;
using UnityEngine;
using System.Collections;

namespace UnityStandardAssets._2D
{

	public class Unit : MonoBehaviour
	{
	    private int hitPoints;
	    private int attackPoints;
	    private int[] status = new int[4]    //array to store HP, AP, row, and column
	    public Square position;
	    //public Square moveRange; 
	    //public Square attackRange;
	    Unit unit = new Unit();

	    protected void Start()
	    {
		hitPoints = 10;
		attackPoints = 5;
		position.setRow(0);
		position.setColumn(0);
	
	    }

	    // Update is called once per frame
	    protected void Update()
	    {
		hitPoints = hitPoints;
		attackPoints = attackPoints;
	    }

	
	    public void MoveUnit(Square s, Square z)
	    {
	    	s.setRow(z.getRow());
	        s.setColumn(z.getColumn());

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
		status[2] = position.getRow();
		status[3] = position.getColumn();
		return status;
	    }
	}
}
