package histogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/***
 * 
 * @author EfthymiaKostaki The purpose of this class is to 
 *         read a file with students’
*          grades and generate its histogram.
 */
public class HistogramGenerator {

	public static void main(String[] args) {
		String path = args[0];
		ArrayList<String> gradesArray = new ArrayList<String>();
		try {
		      File grades = new File(path);
		      Scanner myReader = new Scanner(grades);
		      while (myReader.hasNextLine()) {
		    	  gradesArray.add(myReader.nextLine()) ;
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		HistogramGenerator hg = new HistogramGenerator();
		ArrayList<Integer> grades = hg.getIntegerArray(gradesArray);
		hg.generateChart(grades);
	}
	
	/***
	 * Receives a single dimension Integer array. From this array the dataset
	 * that will be used for the visualization is generated. Finally, The chart
	 * is generated with the use of the aforementioned dataset and then
	 * presented in the screen.
	 * 
	 * @param dataValues Single dimension integer array
	 */
	public void generateChart(ArrayList<Integer> dataValues) {
		/*
		 * The XYSeriesCollection object is a set XYSeries series (dataset) that
		 * can be visualized in the same chart
		 */
		XYSeriesCollection dataset = new XYSeriesCollection();
		/*
		 * The XYSeries that are loaded in the dataset. There might be many
		 * series in one dataset.
		 */
		XYSeries data = new XYSeries("random values");

		/*
		 * Populating the XYSeries data object from the input Integer array
		 * values.
		 */
		for (int i = 0; i < dataValues.size(); i++) {
			data.add(i, dataValues.get(i));
		}

		// add the series to the dataset
		dataset.addSeries(data);

		boolean legend = false; // do not visualize a legend
		boolean tooltips = false; // do not visualize tooltips
		boolean urls = false; // do not visualize urls

		// Declare and initialize a createXYLineChart JFreeChart
		JFreeChart chart = ChartFactory.createXYLineChart("Chart title", "x_axis title", "y_axis_title", dataset,
				PlotOrientation.VERTICAL, legend, tooltips, urls);

		/*
		 * Initialize a frame for visualizing the chart and attach the
		 * previously created chart.
		 */
		ChartFrame frame = new ChartFrame("First", chart);
		frame.pack();
		// makes the previously created frame visible
		frame.setVisible(true);
	}
	
	private ArrayList<Integer> getIntegerArray(ArrayList<String> stringArray) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(String stringValue : stringArray) {
            try {
                //Convert String to Integer, and store it into integer array list.
                result.add(Integer.parseInt(stringValue));
            } catch(NumberFormatException nfe) {
               //System.out.println("Could not parse " + nfe);
                System.out.println("Parsing failed! " + stringValue + " can not be an integer");
            } 
        }       
        return result;
    }

}
