public class Edge {
    int node1;
    int node2;


    int node1Index;
    int node2Index;


    public Edge(int node1, int node2, int node1Index, int node2Index) {
        this.node1 = node1;
        this.node2 = node2;
        this.node1Index = node1Index;
        this.node2Index = node2Index;
    }

    public int getStartNode() {
        return node1;
    }

    public void setNode1(int node1) {
        this.node1 = node1;
    }

    public int getEndNode() {
        return node2;
    }

    public void setNode2(int node2) {
        this.node2 = node2;
    }

    public int getStartNodeIndex() {
        return node1Index;
    }

    public void setNode1Index(int node1Index) {
        this.node1Index = node1Index;
    }

    public int getEndNodeIndex() {
        return node2Index;
    }

    public void setNode2Index(int node2Index) {
        this.node2Index = node2Index;
    }


}
