public class main {
    public static void main(String[] args) {
        //crear grafo
        grafo g = new grafo(5);
        //agregar aristas
        g.agregarArista(0, 1);
        g.agregarArista(0, 4);
        g.agregarArista(1, 2);
        g.agregarArista(1, 3);
        g.agregarArista(1, 4);
        g.agregarArista(2, 3);
        //imprimir grafo (matriz de adyacencia) (dirigido)
        Utilerias.imprimirGrafoMatrizDirigido(5, g.adyacencia);
        //imprimir grafo (matriz de adyacencia) (no dirigido)
        Utilerias.imprimirGrafoMatrizNoDirigido(5, g.adyacencia);
        //imprimir grafo (lista de adyacencia) (dirigido)
        Utilerias.imprimirGrafoListaDirigido(5, g.adyacencia);
        //imprimir grafo (lista de adyacencia) (no dirigido)
        Utilerias.imprimirGrafoListaNoDirigido(5, g.adyacencia);
        //imprimir grafo (lista de adyacencia)
        Utilerias.imprimirGrafoLista(5, g.adyacencia);

    }
}
