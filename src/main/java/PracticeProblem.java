import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeProblem {

	public static void main(String args[]) {
		
	}

	private static String readFileContent(String filename) {
		FileReader inputStream = null;
		String content = "";
		try {
			inputStream = new FileReader(filename);
			int c;
			while ((c = inputStream.read()) != -1) {
				content = content + (char)c;
			}
		} catch (IOException e) {
			System.out.println("Error was found");
		}	finally { 
			  try {
				if (inputStream != null) {
					inputStream.close();
				}
			  } catch (IOException e) {
				System.out.println("Error was found");
			  }
		}
		return content;

		}
		public static String getName(int line, String filename) {
			String content = readFileContent(filename);
			String[] lines = content.split("\n");
			if(line <= 0 || line > lines.length) {
				return "";
			}
			String targetLine = lines[line -1];
			String[] tokens = targetLine.trim().split("\\s+");
			if(tokens.length < 2) {
				return "";
			}
			return tokens[0] + " " + tokens[1];

		}

		public static int getAge(int line, String filename) {
			String content = readFileContent(filename);
			String[] lines = content.split("\n");
			if (line <= 0 || line > lines.length) {
				return -1;
			}
		    String targetline = lines[line -1];
			String[] tokens = targetline.trim().split("\\s+");
			if (tokens.length < 3) {
				return -1;
			}
			try {
				return Integer.parseInt(tokens[2]);

			}
			catch (NumberFormatException e) {
				System.out.println("Error was found");
				return -1;

			}
			}

		public static int getNumber(int line, String filename) {
			String content = readFileContent(filename);
			String[] lines = content.split("\n");
			if (line <= 0 || line > lines.length) {
				return -1;
			}

			String targetline = lines[line -1];
			String[] tokens = targetline.trim().split("\\s+");
			if (tokens.length < 4) {
				return -1;
			}
			try {
				return Integer.parseInt(tokens[3]);

			}
			catch (NumberFormatException e) {
				System.out.println("Error was found");
				return -1;

			}
			}

		public static void fileAppend(String output, String filename) {
			FileWriter fw = null;
			try {
				fw = new FileWriter(filename, true);
				fw.write(output);

			}
			 catch (IOException e) {
				System.out.println("Error was found");


			 }

			 finally {
				try {
					if (fw != null) {
						fw.close();
					}

				} catch (IOException e) {
					System.out.println("Error was found");

				}
			 }
		}

		}