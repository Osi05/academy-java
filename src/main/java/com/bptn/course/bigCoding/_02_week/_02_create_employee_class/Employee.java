package com.bptn.course.bigCoding._02_week._02_create_employee_class;

class Employee {
	   // Instance variable to store salary
	  private int salary;
	   
	   // Instance variable to store hours per day worked by employee
	   private int hoursPerDay;
	   

	   // Constructor to set instance variables(salary and hoursPerDay) value 
	   Employee(int salary, int hoursPerDay){
		   setSalary(salary);  // Set salary using setSalary method
		   setHoursPerDay(hoursPerDay);  // Set hours using setHoursPerDay method
	   }
	   // Set method to update salary
	      public void setSalary(int salary){
	      if (salary < 500){
	        this.salary = salary + 10; // Increase salary by 10 if less than 500
	      } else {
	         this.salary = salary; // Keep salary unchanged if 500 or more
	      }
	   }

	   // Set method to update hoursPerDay
	      public void setHoursPerDay(int hoursPerDay) {
	    	  this.hoursPerDay = hoursPerDay;
	    	  
	    	  if (hoursPerDay > 6) {
	    		  this.salary += 5;  // Increase salary by 5 if hoursPerDay is greater than 6
	    		  } 
	    	  }

	   // Get method to return salary
	  public int getSalary(){
	      return this.salary;
	   }
	   
	}

