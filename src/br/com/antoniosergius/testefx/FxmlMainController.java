package br.com.antoniosergius.testefx;

import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class FxmlMainController {
	
	@FXML private TextField tfValorPrincipal;
	@FXML private TextField tfTaxaJuros;
	@FXML private TextField tfPeriodo;
	@FXML private TextField tfParcela;
	@FXML private TextField tfMontante;
	@FXML private TextField tfRetencao;
	@FXML private Text errorMsg;
	private String choosenField = "";
		
	
	@FXML 
	public void handleButtonAction(ActionEvent event) {
		if (hasJustOneFieldEmpty()) {
			switch (choosenField) {
			case "valorPrincipal":
				
				break;
			case "taxaJuros":
				break;
			case "parcela":
				break;
			case "periodo":
				break;
			default:
				break;
			}
		} else {
			errorMsg.setText("Preencha três campos.");
		}
	}
	
	private boolean hasJustOneFieldEmpty() {
		boolean hasOneEmpty = false;
		String emptyField = "";
		
		if (tfValorPrincipal.getText().isEmpty()){
			emptyField = "valorPrincipal";
			hasOneEmpty = true;
		} 
		
		if (tfTaxaJuros.getText().isEmpty()) {
			if (hasOneEmpty) {
				return false;
			} else {
				emptyField = "taxaJuros";
				hasOneEmpty = true;
			}
		} 
			
		if (tfParcela.getText().isEmpty()) {
			if (hasOneEmpty) {
				return false;
			} else {
				emptyField = "parcela";
				hasOneEmpty = true;
			}
		}
		
		if (tfPeriodo.getText().isEmpty()) {
			if (hasOneEmpty) {
				return false;
			} else {
				emptyField = "periodo";
				hasOneEmpty = true;
			}
		} 
		
		if (hasOneEmpty) {
			this.choosenField = emptyField;
			return true;
		} else {
			errorMsg.setText("Preencha somente três campos.");
			return false;
		}
	}
}
