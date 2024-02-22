package com.fdmgroup.tdd.gradecalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GradeCalculatorServiceTest {
	GradeTransformer gradeTransformer;
	
	@BeforeEach
	public void setUp() {
		gradeTransformer = new GradeTransformer();
	}
	//test1
	@Test
	@DisplayName("check Zero Score Input")
	public void gradeTransformer_zeroScoreInput(){
		//Arrange
		String actual, expected ;
		expected = "fail";
		
		//Act
		actual = gradeTransformer.getClassification(0);
		
		//Assert
		assertEquals(expected,actual);
	}
	//test2
	@Test
	@DisplayName("check Pass Score Input")
	public void gradeTransformer_PassScoreInput(){
		//Arrange
		String actual, expected ;
		expected = "pass";
		
		//Act
		actual = gradeTransformer.getClassification(75);
		
		//Assert
		assertEquals(expected,actual);	
	}
	//test3
	@Test
	@DisplayName("check Merit Score Input")
	public void gradeTransformer_MeritScoreInput(){
		//Arrange
		String actual, expected ;
		expected = "merit";
		
		//Act
		actual = gradeTransformer.getClassification(80);
		
		//Assert
		assertEquals(expected,actual);
	}
		
	//test4
	@Test
	@DisplayName("check Distinction Score Input")
	public void gradeTransformer_DistinctionScoreInput(){
		//Arrange
		String actual, expected ;
		expected = "distinction";
		
		//Act
		actual = gradeTransformer.getClassification(100);
		
		//Assert
		assertEquals(expected,actual);
	}	
	//test5
	@Test
	@DisplayName("check Float Number Input")
	public void gradeTransformer_floatNumberInput(){
		//Arrange
		String actual, expected ;
		expected = "distinction";
		
		//Act
		actual = gradeTransformer.getClassification(98.7);
		
		//Assert
		assertEquals(expected,actual);
	}	
		
	//test6
	@Test
 	@DisplayName("check Over Hundred Input")
	public void gradeTransformer_overHundredInput(){
		//Arrange
		String actual, expected ;
		expected = "invalid input";
		
		//Act
		actual = gradeTransformer.getClassification(100.1);
		
		//Assert
		assertEquals(expected,actual);
	}	
			
	//test7
	@Test
	@DisplayName("check Negative Input")
	public void gradeTransformer_negativeInput(){
		//Arrange
		String actual, expected ;
		expected = "invalid input";
		
		//Act
		actual = gradeTransformer.getClassification(-1);
		
		//Assert
		assertEquals(expected,actual);
	}	

	
}

