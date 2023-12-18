package practice.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test {

    public static void main(String[] args) {
        String logFilePath = "C:\\Users\\prate\\OneDrive\\Desktop\\log.txt";
        String csvFilePath = "C:\\Users\\prate\\OneDrive\\Desktop\\outputfile.csv";

        try {
            processLogFile(logFilePath, csvFilePath);
            System.out.println("Log file processed successfully. CSV file created at: " + csvFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processLogFile(String logFilePath, String csvFilePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(logFilePath));
             FileWriter writer = new FileWriter(csvFilePath)) {

            // Writing CSV header
            writer.write("Bot Name,Status Code,Query\n");

            String line;
            while ((line = reader.readLine()) != null) {
                // Check if the line contains the relevant information
                if (line.contains("***After DF Call***")) {
                    // Extract bot name, status code, and query from the line
                    String botName = extractValue(line, "Bot Name:", " | ");
                    String statusCode = extractValue(line, "Status Code:", " | ");
                    String query = extractValue(line, "Query:", " | ");

                    // Write the values to the CSV
                    writer.write(botName + "," + statusCode + "," + query + "\n");
                }
            }

            while ((line = reader.readLine()) != null) {
                // Check if the line contains the relevant information
                if (line.contains("Iveonlyfaqprod")) {
                    // Extract bot name, status code, and query from the line
                    String statusCode = extractValue(line, "Status Code:", " | ");
                    String query = extractValue(line, "Query:", " | ");

                    // Write the values to the CSV
                    writer.write(statusCode + "," + statusCode + "," + query + "\n");
                }
            }

            System.out.println("Log file processed successfully. CSV file created at: " + csvFilePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String extractValue(String line, String key, String delimiter) {
        int startIndex = line.indexOf(key);
        if (startIndex != -1) {
            startIndex += key.length();
            int endIndex = line.indexOf(delimiter, startIndex);
            if (endIndex != -1) {
                return line.substring(startIndex, endIndex).trim();
            } else {
                // If the delimiter is not found, return the substring from startIndex to the end
                return line.substring(startIndex).trim();
            }
        }
        return "";
    }
}
