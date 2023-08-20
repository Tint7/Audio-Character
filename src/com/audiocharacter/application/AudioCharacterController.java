package com.audiocharacter.application;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;


public class AudioCharacterController 
{
	private static final Object Space = null;

	@FXML
    private TextArea view;

    @FXML
    private Button a;

    @FXML
    private Button s;

    @FXML
    private Button d;

    @FXML
    private Button f;

    @FXML
    private Button h;

    @FXML
    private Button j;

    @FXML
    private Button k;

    @FXML
    private Button g;

    @FXML
    private Button l;

    @FXML
    private Button q;

    @FXML
    private Button w;

    @FXML
    private Button e;

    @FXML
    private Button r;

    @FXML
    private Button t;

    @FXML
    private Button y;

    @FXML
    private Button u;

    @FXML
    private Button i;

    @FXML
    private Button o;

    @FXML
    private Button p;

    @FXML
    private Button z;

    @FXML
    private Button x;

    @FXML
    private Button c;

    @FXML
    private Button v;

    @FXML
    private Button b;

    @FXML
    private Button n;

    @FXML
    private Button m;
    
    @FXML
    private Button space;
    String sp = "Space";
    public void playSound(MouseEvent event)
    {
    	Node node = (Node) event.getSource();
    	SoundItem item = SoundItem.valueOf(node.getId());
    	play(item.getVoice());
    	String st =((Button) event.getSource()).getText();
    	String st1 = view.getText();
    	
    	view.setText(st1+""+st);
    	
       	
    }

	private void play(String voice) 
	{
		// TODO Auto-generated method stub
		AudioClip clip = new AudioClip(getClass().getResource(voice).toString());
		clip.play();
	}

}
