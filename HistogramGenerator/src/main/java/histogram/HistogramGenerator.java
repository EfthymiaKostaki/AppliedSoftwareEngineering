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
 *         read a file with students
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
		    	  // parses file line by line
		    	  gradesArray.add(myReader.nextLine()) ;
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      // handle File not found exception
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		HistogramGenerator hg = new HistogramGenerator();
		ArrayList<Integer> grades = hg.getIntegerArray(gradesArray);
		ArrayList<Integer> frequencyOfGrades = hg.getFrequencies(grades);
		hg.generateChart(frequencyOfGrades);
	}
	
	/***
	 * Receives an ArrayList of Integers. From this ArrayList the dataset
	 * that will be used for the visualization is generated. Finally, The chart
	 * is generated and presented on a new screen.
	 * 
	 * The output histogram represents the frequency of occurence of the students' grades.
	 * More specifically, on the x-axis we have the possible grades [0,10]. 
	 * On y-axis there are the number of occurences of each distinct grade.
	 * 
	 * @param dataValues ArrayList<Integer>
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

		boolean legend = false; // doesn't visualize a legend
		boolean tooltips = false; // doesn't not visualize tooltips
		boolean urls = false; // doesn't visualize urls

		// Declare and initialize a createXYLineChart JFreeChart
		JFreeChart chart = ChartFactory.createXYLineChart("Histogram of students' grades", "grades", "grade frequence", dataset,
				PlotOrientation.VERTICAL, legend, tooltips, urls);

		/*
		 * Initialize a frame for visualizing the chart and attach the
		 * previously created chart.
		 */
		ChartFrame frame = new ChartFrame("Histogram", chart);
		frame.pack();
		// makes the previously created frame visible
		frame.setVisible(true);
	}
	
	/***
	 * Receives an ArrayList of Integers to calculate the 
	 * number of occurances of the input of the given ArrayList.
	 * The occurences are betweeen [0,10].
	 * 
	 * Returns an ArrayList of Integers
	 * @param grades ArrayList<Integer>.
	 * @return ArrayList<Integer>.
	 */
	private ArrayList<Integer> getFrequencies(ArrayList<Integer> grades) {
		ArrayList<Integer> frequencyOfGrades = new ArrayList<Integer>();
		for (int i = 0; i<=10; i++) {
			int numberOfOccurences = 0;
			for  (int j = 0; j < grades.size(); j++) {
				if (grades.get(j) == i) {
					numberOfOccurences++;
				}
			}
			frequencyOfGrades.add(numberOfOccurences);
		}
		return 	frequencyOfGrades;
	}
	
	/***
	 * Alters an ArrayList<String> to turn all values included in the ArrayList from String to
	 * Integer. There is an error handling try...catch block if that is not possible.
	 * 
	 * @param stringArray ArrayList<String>.
	 * @return ArrayList<Integer>.
	 */
	private ArrayList<Integer> getIntegerArray(ArrayList<String> stringArray) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(String stringValue : stringArray) {
            try {
                //Convert String to Integer, and store it into integer array list.
                result.add(Integer.parseInt(stringValue));
            } catch(NumberFormatException nfe) {
                System.out.println("Parsing failed! " + stringValue + " can not be an integer");
            } 
        }       
        return result;
    }

}
