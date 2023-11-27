public class PotentialMove {

    nodeExchangeInter nodeExchangeInter=null;
    edgesExchange edgesExchange=null;


    public PotentialMove(nodeExchangeInter nodeExchangeInter) {
        this.nodeExchangeInter = nodeExchangeInter;
    }

    public PotentialMove(edgesExchange edgesExchange) {
        this.edgesExchange = edgesExchange;
    }

    public nodeExchangeInter getNodeExchangeInter() {
        return nodeExchangeInter;
    }

    public void setNodeExchangeInter(nodeExchangeInter nodeExchangeInter) {
        this.nodeExchangeInter = nodeExchangeInter;
    }

    public edgesExchange getEdgesExchange() {
        return edgesExchange;
    }

    public void setEdgesExchange(edgesExchange edgesExchange) {
        this.edgesExchange = edgesExchange;
    }

    public boolean isNodeExchangeInter(){
        return nodeExchangeInter!=null;
    }

    public int getCost(){
        if(isNodeExchangeInter()){
            return nodeExchangeInter.getCost();
        }else{
            return edgesExchange.getCost();
        }
    }
}
