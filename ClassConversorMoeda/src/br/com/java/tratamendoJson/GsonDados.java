package br.com.java.tratamendoJson;

import br.com.java.RecordConversor.dadosMoeda;
import com.google.gson.Gson;

import java.net.http.HttpResponse;

public class GsonDados {
    private String Json;
    private dadosMoeda dados;
    Gson gson  = new Gson ();


    public void setDeserializationGson(HttpResponse<String> response){
      dados = gson.fromJson(response.body() , dadosMoeda.class);

    }
    public String getJson(){
        Json = gson.toJson(dados);
        return Json;
    }

}
