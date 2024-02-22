package com.fdmgroup.tdd.groupcontroller;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
public class GroupControllerServiceTest {
	GroupHandler groupHandler;
	
	@Mock DatabaseWriter mockcDatabaseWriter;
	@Mock Trainee mockTrainee;
	@Mock DatabaseReader mockDatabaseReader;
	
	@BeforeEach
	public void setUp(){
		groupHandler= new GroupHandler(mockDatabaseReader,mockcDatabaseWriter);
	}
	//Test1
	@Test
	@DisplayName("verify if readGroup() has been called")
		public void getAllTrainees_CallDatabaseReader(){
		//Arrange
		
		//Act
			groupHandler.getAllTrainees();
		
		//Assert
			verify(mockDatabaseReader).readGroup();
	}
	//Test2
		@Test
		@DisplayName("verify if deleteTraineeByUsername() has been called")
		public void removeTraineeByUsername_CallDatabaseWriter(){
			//Arrange
			
			//Act
				groupHandler.removeTraineeByUsername("trainee");
			
			//Assert
				verify(mockcDatabaseWriter).deleteTraineeByUsername("trainee");
		}
	
	//Test3     
	@Test
	@DisplayName("verify if deleteTraineeByUsername() has been called twice with different input")
	public void removeTraineeByUsernameTwice_CallDatabaseWriterTwice(){
		//Arrange
		
		//Act
			groupHandler.removeTraineeByUsername("trainee1");
			groupHandler.removeTraineeByUsername("trainee2");
		
		//Assert
			verify(mockcDatabaseWriter).deleteTraineeByUsername("trainee1");
			verify(mockcDatabaseWriter).deleteTraineeByUsername("trainee2");
			
	}
	
	
		
	//Test4
	@Test
	@DisplayName("verify if AddTrainee() has been called twice")
	public void addTrainee_CallDatabaseWriterAddTrainee(){
		//Arrange
		
		//Act
			groupHandler.addTrainee(mockTrainee);
		
		//Assert
			verify(mockcDatabaseWriter).addTrainee(mockTrainee);
	}
	
	//Test5
	@Test
	@DisplayName("verify if AddTrainee() has been called Twice")
	public void addTraineeTwice_CallDatabaseWriterAddTraineeTwice(){
		//Arrange
		
		//Act
			groupHandler.addTrainee(mockTrainee);
			groupHandler.addTrainee(mockTrainee);
		
		//Assert
			
			verify(mockcDatabaseWriter,times(2)).addTrainee(mockTrainee);
	}

	
	


}
