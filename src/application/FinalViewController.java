package application;

import java.io.FileInputStream;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class FinalViewController{
	@FXML 
	private BarChart<?, ?> barChart;
	
	@FXML
	private PieChart pieChart; 
	
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
		pieChart.setTitle("Celebrity Compatibility in % on PieChart");
	}
}
