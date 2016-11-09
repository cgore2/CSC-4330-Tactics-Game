using System;
using UnityEngine;

namespace UnityStandardAssets._2D
{
	public class Unit : MonoBehaviour
	{
		private int hitPoints = 10;
		private int attackPoints = 5;
		//private Square moveRange = 3; 
		//private Square attackRange = 1;
		private Square position; 		     //the units current position
		private int[] status = new int[2]    //array to store HP and AP
		
		//moves the unit from its current position(square) to a new square
		public Square MoveUnit(Square square )
		{
			position = square
			return position;
		}

		public Attack()
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
