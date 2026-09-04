package com.huawei.secure.android.common.util;

/* JADX INFO: loaded from: classes7.dex */
public class SecurityCommonException extends Exception {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f63093c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f63094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63095b;

    public SecurityCommonException() {
    }

    public SecurityCommonException(String str) {
        super(str);
        this.f63095b = str;
    }

    public SecurityCommonException(String str, String str2) {
        this.f63094a = str;
        this.f63095b = str2;
    }

    public SecurityCommonException(String str, Throwable th2) {
        super(str, th2);
    }

    public SecurityCommonException(Throwable th2) {
        super(th2);
    }

    public String getMsgDes() {
        return this.f63095b;
    }

    public String getRetCd() {
        return this.f63094a;
    }
}
