package com.otblabs.mpesa.stkpush;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetaItem {

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Value")
    private String value;

    public MetaItem() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MetaItem{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
