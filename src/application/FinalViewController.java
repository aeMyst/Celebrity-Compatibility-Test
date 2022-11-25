package application;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class FinalViewController{
	@FXML 
	private BarChart<?, ?> barChart;
	
	@FXML
	private PieChart pieChart; 
	
	@FXML
	private Label DisplayCompatibilityScoreLabel;
	
	@FXML
	private Label congratsLabel;
	
	@FXML
	private Button restartButton;
	
	public void createBarGraph(double jbData, double jloData, double kwData, double tsData) {
		XYChart.Series series = new XYChart.Series<>();
		
		series.setName("Celebrity Compatibility Results in %");

		series.getData().add(new XYChart.Data<>( "Justin Bieber",  jbData));
		series.getData().add(new XYChart.Data<>( "Jennifer Lopez",  jloData));
		series.getData().add(new XYChart.Data<>( "Kanye West", kwData));
		series.getData().add(new XYChart.Data<>( "Taylor Swift", tsData));	
		
		barChart.getData().addAll(series);
		barChart.setLegendVisible(false);
		
		 Node n = barChart.lookup(".data0.chart-bar");
		    n.setStyle("-fx-bar-fill: darkcyan");
		    n = barChart.lookup(".data1.chart-bar");
		    n.setStyle("-fx-bar-fill: mediumorchid");
		    n = barChart.lookup(".data2.chart-bar");
		    n.setStyle("-fx-bar-fill: turquoise");
		    n = barChart.lookup(".data3.chart-bar");
		    n.setStyle("-fx-bar-fill: orchid");
		

	}

	public void createPieChart(double jbData, double jloData, double kwData, double tsData)	{
		ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
				new PieChart.Data("Justin Bieber" , jbData),
				new PieChart.Data("Jennnifer Lopez" , jloData),
				new PieChart.Data("KanyeWest" , kwData),
				new PieChart.Data("Taylor Swift" , tsData));
		
		pieChart.setData(pieChartData);
	}
	
	public void setLabel(double jbData, double jloData, double kwData, double tsData, String name) {
		DisplayCompatibilityScoreLabel.setText(String.format("Justin Bieber: %.2f"
				+ "    Jennifer Lopez: %.2f"
				+ "    Kanye West: %.2f"
				+ "    Taylor Swift: %.2f", 
				jbData, jloData, kwData, tsData));
		
		congratsLabel.setText(String.format("Congratulations %s" + "!", name));
	}
	
	@FXML
	void restart(ActionEvent event) {
		Stage stage = (Stage) restartButton.getScene().getWindow();
		stage.close();
		Stage newStage = new Stage();
		new main().start(newStage);
	}
	
	
}
