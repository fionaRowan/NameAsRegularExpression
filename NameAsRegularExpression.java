/*
 * Fiona Rowan
 * 
 * Finds the largest, lexographically first word in the dictionary bigDict.txt
 * that is made up of any combination of the letters in my name.
 *
 *	Make sure to put the Dictionary.txt file you use in the command line arguments!
 * 
 */






import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class NameAsRegularExpression {
	
	public static void main(String[] args) throws IOException{
		try{
			//array of words that match
			ArrayList<String> matches = new ArrayList<String>();
			
			//file paths that will be needed
			String bigDictPath = args[0];
			
			//for iterating through files later
			String line;
			//String[] inputLine; 
			int lineCounter = 0;


			//read in dict
			BufferedReader bigDict2 = new BufferedReader(new 
				FileReader(bigDictPath));
			
			
			while((line = bigDict2.readLine())!=null){
				if (line.matches("[fionarowan]*")){ 
					matches.add(line); 
				
				}
			}
			
			//sort array list and find largest
			Collections.sort(matches);
			int largestIndex = 0; 
			for(int i =0; i< matches.size(); i++){
				if(matches.get(i).length() > 
					matches.get(largestIndex).length()){
					largestIndex= i;
					}
			}
			
						
			//print largest value, first lexographically
			System.out.println("The first longest word 
				lexographically is " + 
				matches.get(largestIndex));
					
			
			bigDict2.close();
			
		}catch(IOException e){
			System.out.println("Please check your file!");
		}catch(ArrayIndexOutOfBoundsException f){
			System.out.println("Please enter one file.");
		}finally{
			System.out.println("Thanks for running me!");
		}

	}
	
	
	
}

