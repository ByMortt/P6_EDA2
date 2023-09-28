import java.util.ArrayList;
import java.util.List;

public class grafo {
    //atributos
    int vertices;
    List<List<Integer>> adyacencia;
    //constructor
    public grafo(int vertices, List<List<Integer>> adyacencia) {
        this.vertices = vertices;
        this.adyacencia = adyacencia;
    }
    //crear grafo
    public grafo(int numeroVertices) {
        this.vertices = numeroVertices;
        this.adyacencia = new ArrayList<>(numeroVertices);
        for (int i = 0; i < numeroVertices; i++) this.adyacencia.add(new ArrayList<>());
    }
    //agregar arista
    public void agregarArista(int v, int w) {
        this.adyacencia.get(v).add(w);
        this.adyacencia.get(w).add(v);
    }
}
