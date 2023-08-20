package com.audiocharacter.application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;


public class AppMain extends Application 
{
	@Override
	public void start(Stage stage) throws Exception 
	{
		Parent root = FXMLLoader.load(getClass().getResource("AudioCharacter.fxml"));
		Scene scene = new  Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}