package br.com.antoniosergius.testefx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Main extends Application{
	
	public static void main(String[] args){
		Application.launch(args);
	}
	
	public void start(Stage stage) throws Exception{
		GridPane grid = new GridPane();
		setComponents(grid);
		
		Scene scene = new Scene(grid, 355, 310);
		stage.setTitle("Cálculo de Juros");
		stage.setMinWidth(355);
		stage.setMinHeight(310);
		//stage.setMaxWidth(355);
		//stage.setMaxHeight(300);
		stage.setScene(scene);
		stage.show();
	}
	
	private void setComponents(GridPane grid){
		Label labelPrincipal = new Label("Valor Principal");
		Label lbTaxa = new Label("Taxa de Juros");
		Label lbPeriodo = new Label("Período");
		Label lbMontante = new Label("Montante");
		Label lbValorMontante = new Label("R$ 26.894.179,53");
		Label lbParcela = new Label("Parcela");
		Label lbRetencao = new Label("Retenção");
		Label lbValorRetencao = new Label("R$ 1.733.582,44");
		
		lbValorMontante.setMaxWidth(Double.MAX_VALUE);
		lbValorMontante.setAlignment(Pos.BASELINE_RIGHT);
		lbValorRetencao.setMaxWidth(Double.MAX_VALUE);
		lbValorRetencao.setAlignment(Pos.BASELINE_RIGHT);
		
		
		TextField tfPrincipal = new TextField();
		TextField tfTaxa = new TextField();
		TextField tfPeriodo = new TextField();
		TextField tfParcela = new TextField();
		
		Button btn = new Button("Calcular");
		btn.setOnAction((ActionEvent) -> {
			System.out.println("Botão clicado");
		});
		
		HBox hbox = new HBox(10);
		hbox.setAlignment(Pos.BOTTOM_RIGHT);
		hbox.getChildren().add(btn);
		
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(12);
		grid.setHgap(12);
		grid.setPadding(new Insets(10,20,10,20));
		
		grid.add(tfPrincipal, 1, 0);
		grid.add(tfTaxa, 1, 1);
		grid.add(tfPeriodo, 1, 2);
		grid.add(tfParcela, 1, 3);
		grid.add(labelPrincipal, 0, 0);
		grid.add(lbTaxa, 0, 1);
		grid.add(lbPeriodo, 0, 2);
		grid.add(lbParcela, 0, 3);
		grid.add(lbMontante, 0, 4);
		grid.add(lbValorMontante, 1, 4);		
		grid.add(lbRetencao, 0, 5);
		grid.add(lbValorRetencao, 1, 5);
		grid.add(hbox, 0, 6, 2, 1);
		
		grid.setOnMouseClicked((MouseEvent) -> {
			System.out.println("Largura = "+grid.getWidth());
			System.out.println("Altura  = "+grid.getHeight());
		});
	}
}