package br.com.java.apiclass;

import br.com.java.tratamendoJson.GsonDados;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiRequisition {
    //public String moedaNome ;
    private GsonDados gson = new GsonDados( );


     public ApiRequisition(String moedaNome1, String moedaNome2) throws IOException, InterruptedException {

         HttpClient client = HttpClient.newBuilder().build();
         HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://v6.exchangerate-api.com/v6/cdfc494a2c30da38aef48191/pair/"+moedaNome1+"/"+moedaNome2)).build();
         HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
         gson.setDeserializationGson(response);

     }
     public String retornaJSON (){
        return  gson.getJson();
     }

 
}
