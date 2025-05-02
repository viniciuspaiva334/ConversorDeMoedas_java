package br.com.java.tratamendoJson;

import br.com.java.RecordConversor.dadosMoeda;
import com.google.gson.Gson;

import java.net.http.HttpResponse;

public class GsonDados {
    private String Json;
   public dadosMoeda dados;
    Gson gson  = new Gson ();


    public void setDeserializationGson(HttpResponse<String> response){
      this.dados = gson.fromJson(response.body() , dadosMoeda.class);

    }
    public void convertFormat(){
   // formato ja convertido
     System.out.println(" conversao : ["+dados.getBaseCode()+"] -> [" + dados.getTargetCode() + "] = " + dados.conversion_rate() );

    }



}

