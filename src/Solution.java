import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {

    private int cost;
    private ArrayList<Integer> visitedNodes;

    public Solution(int cost, ArrayList<Integer> visitedNodes) {
        this.cost = cost;
        this.visitedNodes = visitedNodes;
    }

    public int getCost() {
        return this.cost;
    }

    public ArrayList<Integer> getVisitedNodes() {
        return this.visitedNodes;
    }

    //Save the solution as a csv file
    public void saveSolution(String fileName){
        try {
            FileWriter writer = new FileWriter(fileName + ".csv");
            for (int i = 0; i < visitedNodes.size(); i++) {
                writer.append(visitedNodes.get(i).toString());
                writer.append("\n");
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
