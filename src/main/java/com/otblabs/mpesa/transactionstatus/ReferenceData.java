package com.otblabs.mpesa.transactionstatus;

public class ReferenceData {

    private ReferenceItem referenceItem;

    public ReferenceData() {
    }

    public ReferenceItem getReferenceItem() {
        return referenceItem;
    }

    public void setReferenceItem(ReferenceItem referenceItem) {
        this.referenceItem = referenceItem;
    }

    @Override
    public String toString() {
        return "ReferenceData{" +
                "referenceItem=" + referenceItem +
                '}';
    }
}
