package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Control;

public class ControllerMain implements Initializable{

	@FXML
	private ChoiceBox<String> typeAutomata;
	
	@FXML
    private AnchorPane anchorM1;

    @FXML
    private TextField rowM1;

    @FXML
    private TextField rowM2;

    @FXML
    private AnchorPane anchorM2;

    @FXML
    private TextField nameM1;

    @FXML
    private TextField nameM2;
    
    @FXML
    private Button btStart;
    
    ArrayList<TextField> txtsM1 = new ArrayList<>();
    ArrayList<TextField> txtsM2 = new ArrayList<>();
    
    @FXML
    void startAu(ActionEvent event) {
    	if(typeAutomata.getSelectionModel().getSelectedItem() == "Moore") {
    		
    		Label l1 = new Label();
    		l1.setText("S");
    		l1.setLayoutX(196.0);
    		l1.setLayoutY(45.0);
    		
    		Label l2 = new Label();
    		l2.setText("0");
    		l2.setLayoutX(122);
    		l2.setLayoutY(45);
    		
    		Label l3 = new Label();
    		l3.setText("1");
    		l3.setLayoutX(154);
    		l3.setLayoutY(45);
    		
    		anchorM1.getChildren().addAll(l1,l2, l3);
    		
    		Label l4 = new Label();
    		l4.setText("0");
    		l4.setLayoutX(116.0);
    		l4.setLayoutY(45.0);
    		
    		Label l5 = new Label();
    		l5.setText("1");
    		l5.setLayoutX(l4.getLayoutX() + 36);
    		l5.setLayoutY(45);
    		
    		Label l6 = new Label();
    		l6.setText("S");
    		l6.setLayoutX(l5.getLayoutX() + 36);
    		l6.setLayoutY(45);
    		
    		anchorM2.getChildren().addAll(l4, l5, l6);
    		
    		int m1 = Integer.parseInt(rowM1.getText());
    		int m2 = Integer.parseInt(rowM2.getText());
    		
    		rowM1.setDisable(true);
    		rowM2.setDisable(true);
    		typeAutomata.setDisable(true);
    		btStart.setDisable(true);
    		
    		
    		newTableMoore1(m1);
    		newTableMoore2(m2);
    	} else {
    		Label l4 = new Label();
    		l4.setText("0");
    		l4.setLayoutX(108.0);
    		l4.setLayoutY(45.0);
    		
    		Label l5 = new Label();
    		l5.setText("S0");
    		l5.setLayoutX(132);
    		l5.setLayoutY(45);
    		
    		Label l6 = new Label();
    		l6.setText("1");
    		l6.setLayoutX(175);
    		l6.setLayoutY(45);
    		
    		Label l7 = new Label();
    		l7.setText("S1");
    		l7.setLayoutX(198);
    		l7.setLayoutY(45);
    		
    		anchorM2.getChildren().addAll(l4, l5, l6, l7);
    	}
    }

	private void newTableMealy2(int m2) {
		// TODO Auto-generated method stub
		int cambioY = 25;
		int cambioX1 = 39;
		int cambioX2 = 28;
		for(int i = 0; i < m2; i++) {
			TextField txt1 = new TextField();
			txt1.setLayoutX(58);
			txt1.setLayoutY(73 + (i*cambioY));
			txt1.setPrefHeight(25);
			txt1.setPrefWidth(28);
			txt1.setId("n"+i);
			txtsM2.add(txt1);
			
			TextField txt2 = new TextField();
			txt2.setLayoutX(txt1.getLayoutX() + cambioX1);
			txt2.setLayoutY(73 + (i*cambioY));
			txt2.setPrefHeight(25);
			txt2.setPrefWidth(28);
			txt2.setId("n0"+i);
			txtsM2.add(txt2);
			
			TextField txt3 = new TextField();
			txt3.setLayoutX(txt2.getLayoutX() + cambioX2);
			txt3.setLayoutY(73 + (i*cambioY));
			txt3.setPrefHeight(25);
			txt3.setPrefWidth(28);
			txt3.setId("e0"+i);
			txtsM2.add(txt3);
			
			TextField txt4 = new TextField();
			txt4.setLayoutX(txt3.getLayoutX() + cambioX1);
			txt4.setLayoutY(73 + (i*cambioY));
			txt4.setPrefHeight(25);
			txt4.setPrefWidth(28);
			txt4.setId("n1"+i);
			txtsM2.add(txt4);
			
			TextField txt5 = new TextField();
			txt5.setLayoutX(txt4.getLayoutX() + cambioX2);
			txt5.setLayoutY(73 + (i*cambioY));
			txt5.setPrefHeight(25);
			txt5.setPrefWidth(28);
			txt5.setId("e1"+i);
			txtsM2.add(txt5);
			
			anchorM2.getChildren().addAll(txt1,txt2,txt3,txt4,txt5);
		}
	}

	private void newTableMoore1(int m1) {
		// TODO Auto-generated method stub
		int cambioY = 25;
		int cambioX = 36;
		for(int i = 0; i < m1; i++) {
			TextField txt1 = new TextField();
			txt1.setLayoutX(75);
			txt1.setLayoutY(73 + (i*cambioY));
			txt1.setPrefHeight(25);
			txt1.setPrefWidth(28);
			txt1.setId("n"+i);
			txtsM1.add(txt1);
			
			TextField txt2 = new TextField();
			txt2.setLayoutX(75 + cambioX);
			txt2.setLayoutY(73 + (i*cambioY));
			txt2.setPrefHeight(25);
			txt2.setPrefWidth(28);
			txt2.setId("e0"+i);
			txtsM1.add(txt2);
			
			TextField txt3 = new TextField();
			txt3.setLayoutX(75 + (2*cambioX));
			txt3.setLayoutY(73 + (i*cambioY));
			txt3.setPrefHeight(25);
			txt3.setPrefWidth(28);
			txt3.setId("e1"+i);
			txtsM1.add(txt3);
			
			TextField txt4 = new TextField();
			txt4.setLayoutX(75 + (3*cambioX));
			txt4.setLayoutY(73 + (i*cambioY));
			txt4.setPrefHeight(25);
			txt4.setPrefWidth(28);
			txt4.setId("eS"+i);
			txtsM1.add(txt4);
			
			anchorM1.getChildren().addAll(txt1,txt2,txt3,txt4);
		}
	}
	
	private void newTableMoore2(int m1) {
		// TODO Auto-generated method stub
		int cambioY = 25;
		int cambioX = 36;
		for(int i = 0; i < m1; i++) {
			TextField txt1 = new TextField();
			txt1.setLayoutX(68);
			txt1.setLayoutY(73 + (i*cambioY));
			txt1.setPrefHeight(25);
			txt1.setPrefWidth(28);
			txt1.setId("n"+i);
			txtsM2.add(txt1);
			
			TextField txt2 = new TextField();
			txt2.setLayoutX(txt1.getLayoutX() + cambioX);
			txt2.setLayoutY(73 + (i*cambioY));
			txt2.setPrefHeight(25);
			txt2.setPrefWidth(28);
			txt2.setId("e0"+i);
			txtsM2.add(txt2);
			
			TextField txt3 = new TextField();
			txt3.setLayoutX(txt2.getLayoutX() + cambioX);
			txt3.setLayoutY(73 + (i*cambioY));
			txt3.setPrefHeight(25);
			txt3.setPrefWidth(28);
			txt3.setId("e1"+i);
			txtsM2.add(txt3);
			
			TextField txt4 = new TextField();
			txt4.setLayoutX(txt3.getLayoutX() + cambioX);
			txt4.setLayoutY(73 + (i*cambioY));
			txt4.setPrefHeight(25);
			txt4.setPrefWidth(28);
			txt4.setId("eS"+i);
			txtsM2.add(txt4);
			
			anchorM2.getChildren().addAll(txt1,txt2,txt3,txt4);
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		ArrayList<String> type = new ArrayList<>();
		type.add("Moore");
		type.add("Mealy");
		
		typeAutomata.setItems(FXCollections.observableArrayList(type));
	}
	
	@FXML
    void calcular(ActionEvent event) {
		Control control = new Control(Integer.parseInt(rowM1.getText()), 4, Integer.parseInt(rowM2.getText()), 4);
		
		ArrayList<String> m1 = new ArrayList<String>();
		ArrayList<String> m2 = new ArrayList<String>();
		
		for(int i = 0; i < txtsM1.size(); i++) {
			m1.add(txtsM1.get(i).getText());
		}
		for(int i = 0; i < txtsM2.size(); i++) {
			m2.add(txtsM2.get(i).getText() + "i");
		}
		control.agregarM1(m1);
		control.agregarM2(m2);
    }
	
}
