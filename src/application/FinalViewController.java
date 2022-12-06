package application;

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
	// data charts
	@FXML 
	private BarChart<?, ?> barChart;
	@FXML
	private PieChart pieChart; 
	
	// final scene labels
	@FXML
	private Label DisplayCompatibilityScoreLabel;
	@FXML
	private Label congratsLabel;
	
	//restart button
	@FXML
	private Button restartButton;
	
	// fxml method that closes and creates a new scene
	@FXML
	void restart(ActionEvent event) {
		Stage stage = (Stage) restartButton.getScene().getWindow();
		stage.close();
		Stage newStage = new Stage();
		new main().start(newStage);
	}

	/**
     * Method that creates our barGraph in final scene with passed in data
     */
	public void createBarGraph(double justinBieberData, double jenniferLopezData, double pitbullData, double taylorSwiftData) {
		XYChart.Series series = new XYChart.Series<>();
		
		series.getData().add(new XYChart.Data<>( "Justin Bieber",  justinBieberData));
		series.getData().add(new XYChart.Data<>( "Jennifer Lopez",  jenniferLopezData));
		series.getData().add(new XYChart.Data<>( "Pitbull Perez", pitbullData));
		series.getData().add(new XYChart.Data<>( "Taylor Swift", taylorSwiftData));	
		
		barChart.getData().addAll(series);
		barChart.setLegendVisible(false);
		
		//styling barchart colors
		Node n = barChart.lookup(".data0.chart-bar");
		n.setStyle("-fx-bar-fill: darkcyan");
		n = barChart.lookup(".data1.chart-bar");
		n.setStyle("-fx-bar-fill: mediumorchid");
		n = barChart.lookup(".data2.chart-bar");
		n.setStyle("-fx-bar-fill: turquoise");
		n = barChart.lookup(".data3.chart-bar");
		n.setStyle("-fx-bar-fill: orchid");
	}

	/**
     * Method that creates our pieGraph in final scene with passed in data
     */
	public void createPieChart(double justinBieberData, double jenniferLopezData, double pitbullData, double taylorSwiftData)	{
		ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(

				new PieChart.Data("Justin Bieber" , justinBieberData),
				new PieChart.Data("Jennifer Lopez" , jenniferLopezData),
				new PieChart.Data("Mr.WorldWide" , pitbullData),
				new PieChart.Data("Taylor Swift" , taylorSwiftData));

		
		pieChart.setData(pieChartData);
	}
	

	
	/**
     * Method that sets our DisplayCompatibilityScoreLabel with 
     * final scores collected and our congratsLabel with the user's name.
     */
	public void setLabel(double justinBieberData, double jenniferLopezData, double pitbullData, double taylorSwiftData, String userName) {
		DisplayCompatibilityScoreLabel.setText(String.format("Justin Bieber: %.2f"
				+ "    Jennifer Lopez: %.2f"
				+ "    Pitbull: %.2f"
				+ "    Taylor Swift: %.2f", 
				justinBieberData, jenniferLopezData, pitbullData, taylorSwiftData));
		
		congratsLabel.setText(String.format("Congratulations %s" + "!", userName));
	}
}
