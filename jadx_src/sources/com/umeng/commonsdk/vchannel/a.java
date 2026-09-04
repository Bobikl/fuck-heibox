package com.umeng.commonsdk.vchannel;

/* JADX INFO: compiled from: Constant.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f105544a = "https://pslog.umeng.com";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f105545b = "https://pslog.umeng.com/";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f105546c = "explog";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f105547d = "analytics";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f105548e = "ekv";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f105549f = "id";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f105550g = "ts";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f105551h = "ds";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f105552i = "pn";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f105553j = "";

    static {
        String str = "SUB" + System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(String.format("%0" + (32 - str.length()) + "d", 0));
        f105553j = sb2.toString();
    }
}
