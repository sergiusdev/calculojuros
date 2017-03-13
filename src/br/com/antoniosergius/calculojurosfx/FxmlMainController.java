package br.com.antoniosergius.calculojurosfx;

import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class FxmlMainController {
   @FXML private GridPane gridPane;
   @FXML private TextField tfValorPrincipal;
   @FXML private TextField tfTaxaJuros;
   @FXML private TextField tfPeriodo;
   @FXML private TextField tfParcela;
   @FXML private TextField tfMontante;
   @FXML private TextField tfRetencao;
   @FXML private Text errorMsg;


   @FXML 
   public void buttonCalcularAction(ActionEvent event) {
      String fieldId = getEmptyFieldId();
      if (!fieldId.equals("error")) {
         calculate(fieldId);
      } else {
         errorMsg.setText("Preencha três campos.");
      }
   }

   private void calculate(String choosenField) {
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
   }

   @FXML
   private void limparButtonAction(ActionEvent event) {
      
   }
   
   private String getEmptyFieldId() {
      ObservableList<Node> childrenNodes = gridPane.getChildren();
      String emptyFieldId = "";
      int count = 0;
      for (Node node : childrenNodes) {
         if (count <= 1) {
            if (node instanceof TextField) {
               TextField textField = (TextField) node;
               String text = textField.getText();
               if (text.isEmpty()) {
                  emptyFieldId = textField.getId();
                  count++;
               }
            }
         } else {
            return "error";
         }
      }
      return (count == 1) ? emptyFieldId : "error";
   }
   
   /*
   private boolean validFields() {
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
   }*/

}
