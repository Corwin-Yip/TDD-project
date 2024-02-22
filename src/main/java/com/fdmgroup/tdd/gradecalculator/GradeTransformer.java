package com.fdmgroup.tdd.gradecalculator;

public class GradeTransformer implements GradeCalculatorService {

	@Override
	public String getClassification(double mark) {
		// TODO Auto-generated method stub
		String Result = "invalid input";
		if(mark>=0) {
			if(mark<75) {
				Result = "fail";
			}else if(mark<80) {
				Result = "pass";
			}else if(mark<90) {
				Result = "merit";
			}else if(mark<=100) {
				Result = "distinction";
			}
		}
		return Result;
	}

}
