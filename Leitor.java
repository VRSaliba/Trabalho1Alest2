import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public  class Leitor{
    File arq;
    public Leitor(File arq){
        this.arq = arq;
    }
    public Map<String, Double> read(){
        try(BufferedReader leitor = new BufferedReader(new FileReader(arq))){
            String linha, label, aux;
            String[] dot;
            String dot1;
            int count = 0;
            Map<String, Double> bib = new HashMap<String, Double>();
            while((linha = leitor.readLine()) != null){
                if(count == 0){
                    count = 1;
                    continue;
                }
                aux = linha.replaceFirst(" ", "");
                aux = aux.replaceFirst(" ", "");
                dot = aux.split(" ");
                dot1 = dot[0] + " " + dot[1] + " " + dot[2];
                label = dot[3];
                label = label.replace("[", "");
                label = label.replace("=", "");
                label = label.replaceAll("([a-z])", "");
                label = label.replaceFirst("]", "");
                double d = Double.parseDouble(label);
                bib.put(dot1, d);
            }
            return bib;
        }
        catch(IOException e){
            return null;
        }
    }
}