package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

public class FinalViewController{
	@FXML 
	private BarChart<?, ?> barChart;
	
	@FXML
	private PieChart pieChart; 
	
	@FXML
	private Label DisplayCompatibilityScoreLabel;
	
	@FXML
	private Label highestLabel;
	
	@FXML
	private Label congratsLabel;
	
	public void createBarGraph(double jbData, double jloData, double kwData, double tsData) {
		XYChart.Series series = new XYChart.Series<>();
		
		series.setName("Celebrity Compatibility Results in %");

		series.getData().add(new XYChart.Data<>( "Justin Bieber",  jbData));
		series.getData().add(new XYChart.Data<>( "Jennifer Lopez",  jloData));
		series.getData().add(new XYChart.Data<>( "Kanye West", kwData));
		series.getData().add(new XYChart.Data<>( "Taylor Swift", tsData));	
		
		barChart.getData().addAll(series);
		barChart.setLegendVisible(false);
		

	}

	public void createPieChart(double jbData, double jloData, double kwData, double tsData)	{
		ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
				new PieChart.Data("Justin Bieber" , jbData),
				new PieChart.Data("Jennnifer Lopez" , jloData),
				new PieChart.Data("Kanye West" , kwData),
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
		
		
//		highestLabel.setText(String.format("You are you compatible with: %s" , ));
	}
}
