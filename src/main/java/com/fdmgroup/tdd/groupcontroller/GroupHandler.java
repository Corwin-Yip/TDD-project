package com.fdmgroup.tdd.groupcontroller;

import java.util.Map;

public class GroupHandler implements GroupControllerService {

	private DatabaseReader databaseReader;
	private DatabaseWriter databaseWriter;
	public GroupHandler(DatabaseReader databaseReader,DatabaseWriter databaseWriter) {

		this.databaseReader = databaseReader;
        this.databaseWriter = databaseWriter;
	}
	
	@Override
	public Map<String, Trainee> getAllTrainees() {
		// TODO Auto-generated method stub
		this.databaseReader.readGroup();
		return null;
	}

	@Override
	public void addTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		this.databaseWriter.addTrainee(trainee);
		
	}

	@Override
	public void removeTraineeByUsername(String traineeUsername) {
		// TODO Auto-generated method stub
		this.databaseWriter.deleteTraineeByUsername(traineeUsername);
	}

}
