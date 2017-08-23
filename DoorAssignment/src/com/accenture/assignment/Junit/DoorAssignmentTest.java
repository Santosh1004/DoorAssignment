/**
 * 
 */
package com.accenture.assignment.Junit;

import org.junit.Test;
import com.accenture.assignment.daoImpl.DoorAccessDaoImpl;

/**
 * @author : SantoshPC
 * @description : Class DoorAssignmentTest , Class is design to test junit 
 * 
 */
public class DoorAssignmentTest {

	@Test
	public void test(){
		DoorAccessDaoImpl obj = new DoorAccessDaoImpl();
		int[] doorList = obj.getAccessDoorList(101);
		obj.showDoorAccessStatus(doorList);
	}
}
