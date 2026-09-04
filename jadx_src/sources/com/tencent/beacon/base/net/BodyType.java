package com.tencent.beacon.base.net;

/* JADX INFO: loaded from: classes4.dex */
public enum BodyType {
    JSON("application/json; charset=utf-8"),
    FORM("application/x-www-form-urlencoded"),
    DATA("multipart/form-data");

    public String httpType;

    BodyType(String str) {
        this.httpType = str;
    }
}
