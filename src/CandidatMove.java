import java.util.ArrayList;
import java.util.HashMap;

public class CandidatMove {

    private HashMap<Integer, ArrayList<Integer>> candidatMoves;

    public CandidatMove() {
        this.candidatMoves = new HashMap<Integer, ArrayList<Integer>>();
    }

    public void addCandidatMove(int initialNode, ArrayList<Integer> candidatMove) {
        this.candidatMoves.put(initialNode, candidatMove);
    }

    public ArrayList<Integer> getCandidatMove(int initialNode) {
        return this.candidatMoves.get(initialNode);
    }

    public HashMap<Integer, ArrayList<Integer>> getCandidatMoves() {
        return this.candidatMoves;
    }



}
