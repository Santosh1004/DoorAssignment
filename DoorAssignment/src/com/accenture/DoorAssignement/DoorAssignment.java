package com.accenture.DoorAssignement;

import org.apache.log4j.Logger;
import com.accenture.assignment.daoImpl.DoorAccessDaoImpl;

/**
 * @author : SantoshPC
 * @description : Class DoorAssignment , Class is design to execute stand alone execution.
 * 
 */
public class DoorAssignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Logger log = Logger.getLogger(DoorAssignment.class);
		int[] doorList = null;
		DoorAccessDaoImpl obj = new DoorAccessDaoImpl();
		
		try {
			doorList = obj.getAccessDoorList(101);
			obj.showDoorAccessStatus(doorList);

		} catch (Exception ex) {
			log.error(ex);
		}	
	}

	
}
