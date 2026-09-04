package com.alibaba.sdk.android.utils;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class SdkInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f38037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f38038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f38039c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    Map<String, String> f57c;

    public SdkInfo setAppKey(String str) {
        this.f38039c = str;
        return this;
    }

    public SdkInfo setExt(Map<String, String> map) {
        this.f57c = map;
        return this;
    }

    public SdkInfo setSdkId(String str) {
        this.f38037a = str;
        return this;
    }

    public SdkInfo setSdkVersion(String str) {
        this.f38038b = str;
        return this;
    }
}
