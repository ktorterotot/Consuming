package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)//ignores any unknown properties the server receives
public class Weather {

    private String type;
    private Value value;

    public Weather(){

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return "Quote{" +
                "type='" + type + '\'' +
                ", value =" + value +
                '}';
    }
}
