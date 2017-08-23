/**
 * 
 */
package com.accenture.assignment.daoImpl;

import com.accenture.assignment.dao.DoorAccessInterface;

/**
 * @author : SantoshPC
 * @description : Class DoorAccessDaoImpl implements AssignmentInterface Interface , Class is design to implement getAccessDoorList,showDoorAccessStatus methods
 * 
 */
public class DoorAccessDaoImpl implements DoorAccessInterface{

	/**
	 * @Class: DoorAccessDaoImpl
	 * @description : method "getAccessDoorList" is designed to to get user input data and perform activity.
	 * @param : doorCount : Integer
	 * @return : doorList : Integer []
	 */
	public int[] getAccessDoorList(int doorCount) {
				
				int doorList[] = new int[doorCount]; 

					for (int j = 1; j < doorCount; j++) { 
					int count = 0; 
					for (int i = 1; i <= j; i++) { 
					if (j % i == 0) { 
					count++; 
					} 
					} 
					if (count % 2 == 1) { 
						doorList[j] = 1; 
						} else 
						doorList[j] = 0; 
					}
				return doorList; 
	}

	/**
	 * @Class: DoorAccessDaoImpl
	 * @description : method "showDoorAccessStatus" is designed to to get user input data and display data.
	 * @param : doorList : Integer []
	 * @return : void
	 */
	public void showDoorAccessStatus(int[] doorList) {
	
		for (int i = 1; i < doorList.length; i++) { 
			if(doorList[i] == 1){ 
				System.out.println("Door "+ i +" is open"); 
			} 
			else 
				System.out.println("Door "+ i +" is close"); 
			}
	}


	
}
