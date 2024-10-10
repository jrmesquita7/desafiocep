import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        ConsultaCep consultaCep = new ConsultaCep();
        try{
            Endereco endereco = consultaCep.buscaEndereco("65045380");
            System.out.println(endereco);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

    }
}
