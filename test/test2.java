package practice.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class test2 {

    public static void main(String[] args) {
        String logFilePath = "C:\\Users\\prate\\OneDrive\\Desktop\\log1.txt";
        String csvFilePath = "C:\\Users\\prate\\OneDrive\\Desktop\\output.csv";

        try {
            processLogFile(logFilePath, csvFilePath);
            System.out.println("Queries counted and saved to CSV successfully.");
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    private static void processLogFile(String logFilePath, String csvFilePath)
            throws IOException, ParseException {
        try (BufferedReader reader = new BufferedReader(new FileReader(logFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(csvFilePath))) {

            String line;
            SimpleDateFormat logDateFormat = new SimpleDateFormat("dd MMM yyyy HH:mm:ss.SSS");

            Map<String, Integer> queryCountMap = new HashMap<>();
            String currentDate = null;
            String currentQuery = null;
            int consecutiveCount = 0;

            while ((line = reader.readLine()) != null) {
                LogEntry logEntry = extractLogEntry(line);
                if (logEntry != null) {
                    Date date = logDateFormat.parse(logEntry.getDate());
                    String formattedDate = new SimpleDateFormat("yyyy-MM-dd").format(date);
                    String query = logEntry.getQuery();

                    // Check if the current query is the same as the previous one
                    if (query.equals(currentQuery) && formattedDate.equals(currentDate)) {
                        consecutiveCount++;
                    } else {
                        // Write the previous date, query, and its count to the CSV file
                        if (currentQuery != null) {
                            writer.write(currentDate + "," + currentQuery + "," + consecutiveCount);
                            writer.newLine();
                        }

                        // Start counting the consecutive occurrences of the new query
                        currentDate = formattedDate;
                        currentQuery = query;
                        consecutiveCount = 1;
                    }
                }
            }

            // Write the last date, query, and its count to the CSV file
            if (currentQuery != null) {
                writer.write(currentDate + "," + currentQuery + "," + consecutiveCount);
                writer.newLine();
            }
        }
    }

    private static LogEntry extractLogEntry(String logEntry) {
        int botNameIndex = logEntry.indexOf("Bot Name : ");
        int queryIndex = logEntry.indexOf("Query : ");
        if (botNameIndex != -1 && queryIndex != -1) {
            int botNameEndIndex = logEntry.indexOf(" |", botNameIndex);
            int queryEndIndex = logEntry.indexOf(" |", queryIndex);
            if (botNameEndIndex != -1 && queryEndIndex != -1) {
                String botName = logEntry.substring(botNameIndex + 11, botNameEndIndex);
                String queryWithSign = logEntry.substring(queryIndex + 8, queryEndIndex);
                String query = queryWithSign.startsWith("+") ? queryWithSign.substring(1) : queryWithSign;

                String[] parts = logEntry.split("\\s+");
                if (parts.length >= 5) {
                    return new LogEntry(parts[0] + " " + parts[1] + " " + parts[2] + " " + parts[3], botName, query);
                }
            }
        }
        return null;
    }

    private static class LogEntry {
        private final String date;
        private final String botName;
        private final String query;

        public LogEntry(String date, String botName, String query) {
            this.date = date;
            this.botName = botName;
            this.query = query;
        }

        public String getDate() {
            return date;
        }

        public String getBotName() {
            return botName;
        }

        public String getQuery() {
            return query;
        }
    }
}