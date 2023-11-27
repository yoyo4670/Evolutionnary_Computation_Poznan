public class edgesExchange {
    int startingEdgeToReplace;
    int endingEdgeToReplace;
    int startingEdgeToReplaceWith;
    int endingEdgeToReplaceWith;
    int startingEdgeToReplaceIndex;
    int endingEdgeToReplaceIndex;
    int startingEdgeToReplaceWithIndex;
    int endingEdgeToReplaceWithIndex;

    int[] startToReplaceSuccessor=new int[2];
    int[] endToReplaceSuccessor=new int[2];
    int[] startToReplaceWithSuccessor=new int[2];
    int[] endToReplaceWithSuccessor=new int[2];

    int[] startToReplacePredecessor=new int[2];
    int[] endToReplacePredecessor=new int[2];
    int[] startToReplaceWithPredecessor=new int[2];
    int[] endToReplaceWithPredecessor=new int[2];

    int nodeStartReverse;
    int nodeEndReverse;

    int nodeStartReverseIfReversed;
    int nodeEndReverseIfReversed;
    int cost;

    public edgesExchange(int startingEdgeToReplace, int endingEdgeToReplace, int startingEdgeToReplaceWith, int endingEdgeToReplaceWith, int startingEdgeToReplaceIndex, int endingEdgeToReplaceIndex, int startingEdgeToReplaceWithIndex,
                         int endingEdgeToReplaceWithIndex, int startToReplaceSuccessor, int startToReplaceSuccessorIndex, int endToReplaceSuccessor, int endToReplaceSuccessorIndex,
                         int startToReplaceWithSuccessor, int startToReplaceWithSuccessorIndex, int endToReplaceWithSuccessor, int endToReplaceWithSuccessorIndex, int startToReplacePredecessor,
                         int startToReplacePredecessorIndex, int endToReplacePredecessor, int endToReplacePredecessorIndex, int startToReplaceWithPredecessor, int startToReplaceWithPredecessorIndex,
                         int endToReplaceWithPredecessor, int endToReplaceWithPredecessorIndex, int cost, int nodeStartReverse, int nodeEndReverse, int nodeStartReverseIfReversed, int nodeEndReverseIfReversed) {

        this.startingEdgeToReplace = startingEdgeToReplace;
        this.endingEdgeToReplace = endingEdgeToReplace;
        this.startingEdgeToReplaceWith = startingEdgeToReplaceWith;
        this.endingEdgeToReplaceWith = endingEdgeToReplaceWith;
        this.startingEdgeToReplaceIndex = startingEdgeToReplaceIndex;
        this.endingEdgeToReplaceIndex = endingEdgeToReplaceIndex;
        this.startingEdgeToReplaceWithIndex = startingEdgeToReplaceWithIndex;
        this.endingEdgeToReplaceWithIndex = endingEdgeToReplaceWithIndex;
        this.startToReplaceSuccessor[0] = startToReplaceSuccessor;
        this.startToReplaceSuccessor[1] = startToReplaceSuccessorIndex;
        this.endToReplaceSuccessor[0] = endToReplaceSuccessor;
        this.endToReplaceSuccessor[1] = endToReplaceSuccessorIndex;
        this.startToReplaceWithSuccessor[0] = startToReplaceWithSuccessor;
        this.startToReplaceWithSuccessor[1] = startToReplaceWithSuccessorIndex;
        this.endToReplaceWithSuccessor[0] = endToReplaceWithSuccessor;
        this.endToReplaceWithSuccessor[1] = endToReplaceWithSuccessorIndex;
        this.startToReplacePredecessor[0] = startToReplacePredecessor;
        this.startToReplacePredecessor[1] = startToReplacePredecessorIndex;
        this.endToReplacePredecessor[0] = endToReplacePredecessor;
        this.endToReplacePredecessor[1] = endToReplacePredecessorIndex;
        this.startToReplaceWithPredecessor[0] = startToReplaceWithPredecessor;
        this.startToReplaceWithPredecessor[1] = startToReplaceWithPredecessorIndex;
        this.endToReplaceWithPredecessor[0] = endToReplaceWithPredecessor;
        this.endToReplaceWithPredecessor[1] = endToReplaceWithPredecessorIndex;
        this.cost = cost;
        this.nodeStartReverse = nodeStartReverse;
        this.nodeEndReverse = nodeEndReverse;
        this.nodeStartReverseIfReversed = nodeStartReverseIfReversed;
        this.nodeEndReverseIfReversed = nodeEndReverseIfReversed;
    }

    public int getStartingEdgeToReplace() {
        return startingEdgeToReplace;
    }

    public void setStartingEdgeToReplace(int startingEdgeToReplace) {
        this.startingEdgeToReplace = startingEdgeToReplace;
    }

    public int getNodeStartReverse() {
        return nodeStartReverse;
    }

    public void setNodeStartReverse(int nodeStartReverse) {
        this.nodeStartReverse = nodeStartReverse;
    }

    public int getNodeEndReverse() {
        return nodeEndReverse;
    }

    public void setNodeEndReverse(int nodeEndReverse) {
        this.nodeEndReverse = nodeEndReverse;
    }

    public int getEndingEdgeToReplace() {
        return endingEdgeToReplace;
    }

    public void setEndingEdgeToReplace(int endingEdgeToReplace) {
        this.endingEdgeToReplace = endingEdgeToReplace;
    }

    public int getStartingEdgeToReplaceWith() {
        return startingEdgeToReplaceWith;
    }

    public void setStartingEdgeToReplaceWith(int startingEdgeToReplaceWith) {
        this.startingEdgeToReplaceWith = startingEdgeToReplaceWith;
    }

    public int getEndingEdgeToReplaceWith() {
        return endingEdgeToReplaceWith;
    }

    public void setEndingEdgeToReplaceWith(int endingEdgeToReplaceWith) {
        this.endingEdgeToReplaceWith = endingEdgeToReplaceWith;
    }

    public int getStartingEdgeToReplaceIndex() {
        return startingEdgeToReplaceIndex;
    }

    public void setStartingEdgeToReplaceIndex(int startingEdgeToReplaceIndex) {
        this.startingEdgeToReplaceIndex = startingEdgeToReplaceIndex;
    }

    public int getEndingEdgeToReplaceIndex() {
        return endingEdgeToReplaceIndex;
    }

    public void setEndingEdgeToReplaceIndex(int endingEdgeToReplaceIndex) {
        this.endingEdgeToReplaceIndex = endingEdgeToReplaceIndex;
    }

    public int getStartingEdgeToReplaceWithIndex() {
        return startingEdgeToReplaceWithIndex;
    }

    public void setStartingEdgeToReplaceWithIndex(int startingEdgeToReplaceWithIndex) {
        this.startingEdgeToReplaceWithIndex = startingEdgeToReplaceWithIndex;
    }

    public int getEndingEdgeToReplaceWithIndex() {
        return endingEdgeToReplaceWithIndex;
    }

    public void setEndingEdgeToReplaceWithIndex(int endingEdgeToReplaceWithIndex) {
        this.endingEdgeToReplaceWithIndex = endingEdgeToReplaceWithIndex;
    }

    public int[] getStartToReplaceSuccessor() {
        return startToReplaceSuccessor;
    }

    public void setStartToReplaceSuccessor(int[] startToReplaceSuccessor) {
        this.startToReplaceSuccessor = startToReplaceSuccessor;
    }

    public int[] getEndToReplaceSuccessor() {
        return endToReplaceSuccessor;
    }

    public void setEndToReplaceSuccessor(int[] endToReplaceSuccessor) {
        this.endToReplaceSuccessor = endToReplaceSuccessor;
    }

    public int[] getStartToReplaceWithSuccessor() {
        return startToReplaceWithSuccessor;
    }

    public void setStartToReplaceWithSuccessor(int[] startToReplaceWithSuccessor) {
        this.startToReplaceWithSuccessor = startToReplaceWithSuccessor;
    }

    public int[] getEndToReplaceWithSuccessor() {
        return endToReplaceWithSuccessor;
    }

    public void setEndToReplaceWithSuccessor(int[] endToReplaceWithSuccessor) {
        this.endToReplaceWithSuccessor = endToReplaceWithSuccessor;
    }

    public int[] getStartToReplacePredecessor() {
        return startToReplacePredecessor;
    }

    public void setStartToReplacePredecessor(int[] startToReplacePredecessor) {
        this.startToReplacePredecessor = startToReplacePredecessor;
    }

    public int[] getEndToReplacePredecessor() {
        return endToReplacePredecessor;
    }

    public void setEndToReplacePredecessor(int[] endToReplacePredecessor) {
        this.endToReplacePredecessor = endToReplacePredecessor;
    }

    public int[] getStartToReplaceWithPredecessor() {
        return startToReplaceWithPredecessor;
    }

    public void setStartToReplaceWithPredecessor(int[] startToReplaceWithPredecessor) {
        this.startToReplaceWithPredecessor = startToReplaceWithPredecessor;
    }

    public int[] getEndToReplaceWithPredecessor() {
        return endToReplaceWithPredecessor;
    }

    public void setEndToReplaceWithPredecessor(int[] endToReplaceWithPredecessor) {
        this.endToReplaceWithPredecessor = endToReplaceWithPredecessor;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
