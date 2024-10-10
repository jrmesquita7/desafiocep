import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu CEP");
        var cep = leitura.nextLine();

        ConsultaCep consultaCep = new ConsultaCep();
        try{
            Endereco endereco = consultaCep.buscaEndereco(cep);
            System.out.println(endereco);
            GeradorArquivo geradorArquivo = new GeradorArquivo();
            geradorArquivo.salvaJson(endereco);
        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
        }

    }
}
