/**
 * Skeleton for 'Borders.fxml' Controller Class
 */

package it.polito.tdp.borders;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.borders.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BordersController {

	Model model;

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="txtAnno"
	private TextField txtAnno; // Value injected by FXMLLoader

	@FXML // fx:id="txtResult"
	private TextArea txtResult; // Value injected by FXMLLoader

	@FXML
	void doCalcolaConfini(ActionEvent event) {
		try {
			txtResult.clear();
			int anno = Integer.parseInt(txtAnno.getText());
			if(anno<1816 || anno>2016)
				txtResult.appendText("Inserire un anno compreso tra il 1816 ed il 2016!\n");
			
			txtResult.appendText("Fino all'anno selezionato gli stati ed il numero dei loro confinanti sono: \n");
			
			for(String s : model.bordersForYear(anno))
				txtResult.appendText(s + "\n");
			
			txtResult.appendText("Il numero di componenti connesse �: " + model.numberOfConnectedSets());
		}
		catch (Exception e) {
			txtResult.clear();
			txtResult.appendText("Attenzione! Assicurarsi di inserire un numero!\n");
			//e.printStackTrace();
		}
	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert txtAnno != null : "fx:id=\"txtAnno\" was not injected: check your FXML file 'Borders.fxml'.";
		assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Borders.fxml'.";
	}

	public void setModel(Model model) {
		this.model=model;
		
	}
}
