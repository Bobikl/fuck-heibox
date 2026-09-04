package com.huawei.agconnect.core.service.auth;

/* JADX INFO: loaded from: classes7.dex */
public interface Token {
    long getExpiration();

    long getIssuedAt();

    long getNotBefore();

    String getTokenString();
}
