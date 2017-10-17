package com.cisc181.core;

import static org.junit.Assert.*;




import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	
	
	ArrayList<Staff> StaffArray = new ArrayList<Staff>();
	@BeforeClass
	public static void setup() {
		
		
		
		
	}

	@Test
	public void SalaryTest() throws PersonException{
		
		
		StaffArray.add(new Staff("Enoch", "Hyunsoo", "Lee", new Date(1995, 8, 20), "419 Woodstock Lane",
				"302-312-5168", "enochlee681@gmail.com", "8am-10am", 5, 1000, new Date(1998, 1, 27), eTitle.MR));
		
		StaffArray.add(new Staff("Enoch", "H", "Lee", new Date(1995, 8, 20), "419 Woodstock Lane",
				"302-312-5168", "enochlee681@gmail.com", "10am to 12pm", 2, 2000.00, new Date(1998, 1, 27), eTitle.MR));
		
		StaffArray.add(new Staff("Enoch", "H", "Lee", new Date(1995, 8, 20), "419 Woodstock Lane",
				"302-312-5168", "enochlee681@gmail.com", "12pm to 2pm", 2, 3000.00, new Date(1998, 1, 27), eTitle.MR));
		
		StaffArray.add(new Staff("Enoch", "H", "Lee", new Date(1995, 8, 20), "419 Woodstock Lane",
				"302-312-5168", "enochlee681@gmail.com", "2pm to 4pm", 2, 4000.00, new Date(1998, 1, 27), eTitle.MR));
		
		StaffArray.add(new Staff("Enoch", "H", "Lee", new Date(1995, 8, 20), "419 Woodstock Lane",
				"302-312-5168", "enochlee681@gmail.com", "4pm to 6pm", 2, 5000.00, new Date(1998, 1, 27), eTitle.MR));
		
		
		
		double AverageSalary = 0;
		double TotalSalary = 0;
		TotalSalary = StaffArray.get(0).getSalary() + StaffArray.get(1).getSalary() + StaffArray.get(2).getSalary()
				+ StaffArray.get(3).getSalary() + StaffArray.get(4).getSalary();
		AverageSalary = TotalSalary / StaffArray.size();
		assertEquals(3000.0, AverageSalary, 0.01);
		
		
	}
	@Test (expected = PersonException.class)
	public void invalidDOB() throws PersonException{
		Staff test = new Staff("Really", "Old", "Person", new Date(1995, 8, 20), "123 Invalid Street",
				"111-111-1111", "oldguy@gmail.com", "8am-8pm", 1, 100, new Date(1998, 1, 27), eTitle.MR);
		
	}
}
