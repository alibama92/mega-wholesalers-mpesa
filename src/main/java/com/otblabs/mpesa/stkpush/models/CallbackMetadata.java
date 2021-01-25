package com.otblabs.mpesa.stkpush.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CallbackMetadata {

    @JsonProperty("Item")
    List<MetaItem> metaItemList;

    public CallbackMetadata() {
    }

    public List<MetaItem> getMetaItemList() {
        return metaItemList;
    }

    public void setMetaItemList(List<MetaItem> metaItemList) {
        this.metaItemList = metaItemList;
    }

    @Override
    public String toString() {
        return "CallbackMetadata{" +
                "metaItemList=" + metaItemList +
                '}';
    }
}
