package com.alipay.face.network.model;

/* JADX INFO: loaded from: classes6.dex */
public class BisBehavToken {
    public String apdid;
    public String appid;

    @Deprecated
    public String behid;
    public String bizid;
    public String token;
    public String uid;

    @Deprecated
    public int type = 0;

    @Deprecated
    public int sampleMode = 0;
    public String verifyid = "";

    @Deprecated
    public String vtoken = "";
    public String apdidToken = "";

    public String getApdid() {
        return this.apdid;
    }

    public String getApdidToken() {
        return this.apdidToken;
    }

    public String getAppid() {
        return this.appid;
    }

    public String getBehid() {
        return this.behid;
    }

    public String getBizid() {
        return this.bizid;
    }

    public int getSampleMode() {
        return this.sampleMode;
    }

    public String getToken() {
        return this.token;
    }

    public int getType() {
        return this.type;
    }

    public String getUid() {
        return this.uid;
    }

    public String getVerifyid() {
        return this.verifyid;
    }

    public String getVtoken() {
        return this.vtoken;
    }

    public void setApdid(String str) {
        this.apdid = str;
    }

    public void setApdidToken(String str) {
        this.apdidToken = str;
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setBehid(String str) {
        this.behid = str;
    }

    public void setBizid(String str) {
        this.bizid = str;
    }

    public void setSampleMode(int i10) {
        this.sampleMode = i10;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setType(int i10) {
        this.type = i10;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setVerifyid(String str) {
        this.verifyid = str;
    }

    public void setVtoken(String str) {
        this.vtoken = str;
    }
}
