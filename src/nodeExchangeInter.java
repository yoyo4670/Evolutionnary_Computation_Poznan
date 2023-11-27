public class nodeExchangeInter {
    int nodeInSolution;
    int nodeNotInSolution;
    int cost;
    int nodeInSolutionIndex;

    int previousNodeInSolution;
    int nextNodeInSolution;


    public nodeExchangeInter(int nodeInSolution, int nodeNotInSolution, int cost, int nodeInSolutionIndex, int previousNodeInSolution, int nextNodeInSolution) {
        this.nodeInSolution = nodeInSolution;
        this.nodeNotInSolution = nodeNotInSolution;
        this.cost = cost;
        this.nodeInSolutionIndex = nodeInSolutionIndex;
        this.previousNodeInSolution = previousNodeInSolution;
        this.nextNodeInSolution = nextNodeInSolution;
    }

    public int getNodeInSolution() {
        return nodeInSolution;
    }

    public void setNodeInSolution(int nodeInSolution) {
        this.nodeInSolution = nodeInSolution;
    }

    public int getNodeNotInSolution() {
        return nodeNotInSolution;
    }

    public void setNodeNotInSolution(int nodeNotInSolution) {
        this.nodeNotInSolution = nodeNotInSolution;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getNodeInSolutionIndex() {
        return nodeInSolutionIndex;
    }

    public void setNodeInSolutionIndex(int nodeInSolutionIndex) {
        this.nodeInSolutionIndex = nodeInSolutionIndex;
    }

    public int getPreviousNodeInSolution() {
        return previousNodeInSolution;
    }

    public void setPreviousNodeInSolution(int previousNodeInSolution) {
        this.previousNodeInSolution = previousNodeInSolution;
    }

    public int getNextNodeInSolution() {
        return nextNodeInSolution;
    }

    public void setNextNodeInSolution(int nextNodeInSolution) {
        this.nextNodeInSolution = nextNodeInSolution;
    }

}
