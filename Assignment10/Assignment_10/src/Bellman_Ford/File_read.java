package Bellman_Ford;

import java.io.*;

public class File_read {
	public static int[][] fileRead(String filename) throws IOException {
		String path = main.class.getResource("").getPath(); // Get a Absolute path
		File read_file = new File(path + filename);
		
		// Create inputStream
		FileReader filereader = new FileReader(read_file);
		BufferedReader bufReader = new BufferedReader(filereader);
		String line = "";
		String[] vertex_weigth = null;
		
		line = bufReader.readLine();
		int total_vertex = line.charAt(1)-48;
		int[][] vertex_arr = new int[total_vertex][total_vertex];
		
		/* create Two-dimension Array */
		while ((line = bufReader.readLine()) != null) {
			vertex_weigth = line.split(" ");
			int vertex1 = Integer.parseInt(vertex_weigth[0]);
			int vertex2 = Integer.parseInt(vertex_weigth[1]);
			vertex_arr[vertex1][vertex2] = Integer.parseInt(vertex_weigth[2]);
			vertex_arr[vertex2][vertex1] = Integer.parseInt(vertex_weigth[2]);
		}
		
		bufReader.close();
		
		for (int i=0; i<vertex_arr.length; i++) {
			System.out.println();
			for (int j=0; j<vertex_arr.length; j++) {
				System.out.print(vertex_arr[i][j]+ "	");
			}
		}
		System.out.println();
		return vertex_arr;
	}
	
	public static int fileSize(String filename) throws IOException {
		String path = main.class.getResource("").getPath(); // Get a Absolute path
		File read_file = new File(path + filename);
		
		// Create inputStream
		FileReader filereader = new FileReader(read_file);
		BufferedReader bufReader = new BufferedReader(filereader);
		String line = "";
		int fileSize = 0;
		line = bufReader.readLine();
		/* create Two-dimension Array */
		while ((line = bufReader.readLine()) != null) {
			fileSize++;
		}
		
		bufReader.close();
		
		return fileSize;
	}
	
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    return true;
	}
}
