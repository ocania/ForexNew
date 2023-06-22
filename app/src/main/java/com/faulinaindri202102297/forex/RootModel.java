package com.faulinaindri202102297.forex;

import com.google.gson.annotations.SerializedName;

public class RootModel {
    @SerializedName("rates")
    private RatesModel ratesModel;

    public RatesModel getRatsModel() {
        return ratesModel;
    }

    public void setRatsModel(RatesModel ratesModel) {
        this.ratesModel = ratesModel;
    }
}
