public class Aresta
{
    Vertice vert1;
    Vertice vert2;
    double peso;

    public Aresta(Vertice v1, Vertice v2, int p)
    {
        vert1 = v1;
        vert2 = v2;
        peso = p;
    }

    public Vertice getVertice1()
    {
        return vert1;
    }

    public Vertice getVertice2()
    {
        return vert2;
    }

    public double getPeso()
    {
        return peso;
    }
}