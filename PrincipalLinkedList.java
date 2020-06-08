import java.util.HashMap;
import java.util.Map;

public class PrincipalLinkedList
{
    public static void main(String args[])
    {
        HashMap<String, Vertice> vertices = new HashMap<String, Vertice>();
        HashMap<String, Aresta> arestas = new HashMap<String, Aresta>();
        
        vertices.put("a", new Vertice());
        vertices.put("b", new Vertice());
        vertices.put("c", new Vertice());
        vertices.put("d", new Vertice());
        vertices.put("e", new Vertice());
        vertices.put("f", new Vertice());
        vertices.put("g", new Vertice());

        arestas.put("a -- d", new Aresta(vertices.get("a"), vertices.get("d"), 2));
        arestas.put("d -- e", new Aresta(vertices.get("d"), vertices.get("e"), 9));
        arestas.put("e -- f", new Aresta(vertices.get("e"), vertices.get("f"), 5));
        arestas.put("a -- b", new Aresta(vertices.get("a"), vertices.get("b"), 3));
        arestas.put("b -- c", new Aresta(vertices.get("b"), vertices.get("c"), 6));
        arestas.put("c -- g", new Aresta(vertices.get("c"), vertices.get("g"), 8));
        arestas.put("b -- f", new Aresta(vertices.get("b"), vertices.get("f"), 7));
        arestas.put("e -- g", new Aresta(vertices.get("e"), vertices.get("g"), 4));
        arestas.put("c -- e", new Aresta(vertices.get("c"), vertices.get("e"), 1));
        System.out.println(printaVertices(vertices));
        System.out.println(printaArestas(arestas));
    }

    public static String printaVertices(HashMap<String, Vertice> vertices)
    {
        String retorno = "Vertices existentes no grafo: ";
        for(Map.Entry<String, Vertice> entrada : vertices.entrySet())
        {
            String key = entrada.getKey();
            retorno += "\n" + key;
        }
        return retorno;
    }

    public static String printaArestas(HashMap<String, Aresta> arestas)
    {
        String retorno = "Arestas existentes no grafo: ";
        for(Map.Entry<String, Aresta> entrada : arestas.entrySet())
        {
            String key = entrada.getKey();
            retorno += "\n" + key;
        }
        return retorno;
    }
}