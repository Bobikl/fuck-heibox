package com.alipay.zoloz.android.phone.mrpc.core;

import com.meituan.robust.Constants;

/* JADX INFO: loaded from: classes6.dex */
public class HttpException extends Exception {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f39598d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f39599e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f39600f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f39601g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f39602h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f39603i = 5;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f39604j = 6;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f39605k = 7;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f39606l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f39607m = 9;
    private static final long serialVersionUID = -6320569206365033676L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f39609c;

    public HttpException(Integer num, String str) {
        super(a(num, str));
        this.f39608b = num.intValue();
        this.f39609c = str;
    }

    public HttpException(String str) {
        super(str);
        this.f39608b = 0;
        this.f39609c = str;
    }

    private static String a(Integer num, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Http Transport error");
        if (num != null) {
            sb2.append(Constants.ARRAY_TYPE);
            sb2.append(num);
            sb2.append("]");
        }
        sb2.append(" : ");
        if (str != null) {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public int b() {
        return this.f39608b;
    }

    public String c() {
        return this.f39609c;
    }
}
