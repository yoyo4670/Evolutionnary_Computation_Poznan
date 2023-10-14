package extraction;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class node_extraction {
    static String COMMA_DELIMITER = ";";
    static distance_matrix matrix = new distance_matrix(new ArrayList<ArrayList<Integer>>());
    static ArrayList<Integer> weight_list = new ArrayList<Integer>();
    public node_extraction(String pathname) throws FileNotFoundException {

        List<List<String>> records = new ArrayList<>();
        try (
                Scanner scanner = new Scanner(new File(pathname))) {
            while (scanner.hasNextLine()) {
                records.add(getRecordFromLine(scanner.nextLine()));
            }
        }
        for (int i = 0; i < records.size(); i++) {
            weight_list.add(Integer.parseInt(records.get(i).get(2)));
            matrix.addNewLine(Float.parseFloat(records.get(i).get(0)), Float.parseFloat(records.get(i).get(1)), records);
        }

    }

    public static ArrayList<Integer> getWeight_list() {
        return weight_list;
    }

    public static distance_matrix getMatrix() {
        return matrix;
    }
    private static List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(COMMA_DELIMITER);
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }
}

