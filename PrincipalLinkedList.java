import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class PrincipalLinkedList
{
    public static void main(String args[])
    {
        Map<String, Vertice> vertices = new HashMap<String, Vertice>();
        Map<String, Aresta> arestas = new HashMap<String, Aresta>();
        Map<String, Double> teste = new HashMap<String, Double>();
        File arq = new File("grafo.dot");
        Leitor testes = new Leitor(arq);
        teste = testes.read();
        System.out.println(teste);
        //codigo
    }
}