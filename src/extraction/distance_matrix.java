package extraction;

import java.util.ArrayList;
import java.util.List;

public class distance_matrix {
    ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();

    public distance_matrix(ArrayList<ArrayList<Integer>> matrix) {
        this.matrix = matrix;
    }

    public ArrayList<ArrayList<Integer>> getMatrix() {
        return matrix;
    }

   public void addNewLine(float x, float y,List<List<String>> records) {
        ArrayList<Integer> newLine = new ArrayList<Integer>();
        for (int i = 0; i < records.size(); i++) {
            newLine.add((int) Math.sqrt(Math.pow(x - Double.parseDouble(records.get(i).get(0)), 2) + Math.pow(y - Double.parseDouble(records.get(i).get(1)), 2)));
        }
        matrix.add(newLine);
    }
}
