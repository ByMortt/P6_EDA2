import java.util.List;

public class Utilerias {
    //imprimir grafo (matriz de adyacencia) (dirigido)
    public static void imprimirGrafoMatrizDirigido(int vertices, List<List<Integer>> adyacencia) {
        int[][] matriz = new int[vertices][vertices];
        for (int i = 0; i < vertices; i++) {
            for (Integer pCrawl : adyacencia.get(i)) {
                matriz[i][pCrawl] = 1;
            }
        }
        System.out.println("Matriz de adyacencia");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    //imprimir grafo (matriz de adyacencia) (no dirigido)
    public static void imprimirGrafoMatrizNoDirigido(int vertices, List<List<Integer>> adyacencia) {
        int[][] matriz = new int[vertices][vertices];
        for (int i = 0; i < vertices; i++) {
            for (Integer pCrawl : adyacencia.get(i)) {
                matriz[i][pCrawl] = 1;
            }
        }
        System.out.println("Matriz de adyacencia");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    //imprimir grafo (lista de adyacencia)
    public static void imprimirGrafoLista(int vertices, List<List<Integer>> adyacencia) {
        for (int i = 0; i < vertices; i++) {
            System.out.println("Lista de adyacencia del vertice " + i);
            System.out.print("head");
            for (Integer pCrawl : adyacencia.get(i)) {
                System.out.print(" -> " + pCrawl);
            }
            System.out.println("\n");
        }
    }
    //imprimir grafo (lista de adyacencia) (dirigido)
    public static void imprimirGrafoListaDirigido(int vertices, List<List<Integer>> adyacencia) {
        for (int i = 0; i < vertices; i++) {
            System.out.println("Lista de adyacencia del vertice " + i);
            System.out.print("head");
            for (Integer pCrawl : adyacencia.get(i)) {
                System.out.print(" -> " + pCrawl);
            }
            System.out.println("\n");
        }
    }
    //imprimir grafo (lista de adyacencia) (no dirigido)
    public static void imprimirGrafoListaNoDirigido(int vertices, List<List<Integer>> adyacencia) {
        for (int i = 0; i < vertices; i++) {
            System.out.println("Lista de adyacencia del vertice " + i);
            System.out.print("head");
            for (Integer pCrawl : adyacencia.get(i)) {
                System.out.print(" -> " + pCrawl);
            }
            System.out.println("\n");
        }
    }
}
