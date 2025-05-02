package br.com.java.RecordConversor;

public record dadosMoeda(  String base_code ,String target_code , double conversion_rate) {

public double getConversionRate(){
    return conversion_rate;
}
    public String getBaseCode(){
        return base_code;
    }public String getTargetCode(){
        return target_code;
    }
}

