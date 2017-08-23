package com.accenture.assignment.dao;

/**
 * Interface to handle Door Access list  
 */

/**
 * @author : SantoshPC
 * @description : Interface DoorAccessInterface, Interfaces is design for getAccessDoorList,showDoorAccessStatus methods
 * 
 */
public interface DoorAccessInterface {

	public int[] getAccessDoorList(int doorCount);
	public void showDoorAccessStatus(int[] doorList);
	
}
