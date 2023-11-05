public class Move {

    private int nodeToExchange1;
    private int nodeToExchange2;
    private int costDifference;
    //Type designates the type of move (1 = node exchange, 2 = edge exchange, 3 = inter route exchange)
    private int type;

    public Move(int nodeToExchange1, int nodeToExchange2, int costDifference, int type) {
        this.nodeToExchange1 = nodeToExchange1;
        this.nodeToExchange2 = nodeToExchange2;
        this.costDifference = costDifference;
        this.type = type;
    }

    public int getCost() {
        return this.costDifference;
    }

    public int getType() {
        return this.type;
    }

    public int getI() {
        return this.nodeToExchange1;
    }

    public Integer getJ() {
        return this.nodeToExchange2;
    }
}
