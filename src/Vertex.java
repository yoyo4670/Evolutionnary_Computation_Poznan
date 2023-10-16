public class Vertex {
    int id;//index of the vertex
    int a;//index of the first node
    int b; //index of the second node

    public Vertex(int x, int y) {
        this.a = x;
        this.b = y;
    }

    //Check if the vertex is equal to another one
    public boolean equals(Vertex vertex) {
        return (this.a == vertex.getA() && this.b == vertex.getB()) || (this.a == vertex.getB() && this.b == vertex.getA());
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }


}
