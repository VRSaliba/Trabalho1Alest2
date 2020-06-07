import java.util.HashMap;
import java.util.Map;

public class Vertice
{
    Map<String, Aresta> arestasLigadas = new HashMap<String, Aresta>();
    double custo;

    public Vertice()
    {
        custo = 0;
    }

    public void addAresta(String nomeAresta, Aresta aresta)
    {
        arestasLigadas.put(nomeAresta, aresta);
    }

    public boolean achaAresta(String nomeAresta)
    {
        if(arestasLigadas.containsKey(nomeAresta))
            return true;
        else
            return false;
    }
}