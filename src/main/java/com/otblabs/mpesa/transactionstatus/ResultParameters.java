package com.otblabs.mpesa.transactionstatus;

import java.util.List;

public class ResultParameters {
    private List<ResultParameter> resultParameterList;

    public ResultParameters() {
    }

    public ResultParameters(List<ResultParameter> resultParameterList) {
        this.resultParameterList = resultParameterList;
    }

    @Override
    public String toString() {
        return "ResultParameters{" +
                "resultParameterList=" + resultParameterList +
                '}';
    }
}
