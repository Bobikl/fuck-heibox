package com.tencent.open.log;

import com.ss.bytertc.engine.utils.LogUtil;
import com.tencent.connect.common.Constants;
import java.io.File;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f101123a = 60;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f101124b = 60;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f101125c = "OpenSDK.Client.File.Tracer";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f101126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f101127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static long f101128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f101129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f101130h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f101131i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f101132j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f101133k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f101134l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f101135m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static long f101136n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static String f101137o;

    static {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Tencent");
        String str = File.separator;
        sb2.append(str);
        sb2.append("msflogs");
        sb2.append(str);
        sb2.append("com");
        sb2.append(str);
        sb2.append("tencent");
        sb2.append(str);
        sb2.append("mobileqq");
        sb2.append(str);
        f101126d = sb2.toString();
        f101127e = ".log";
        f101128f = 8388608L;
        f101129g = 262144;
        f101130h = 1024;
        f101131i = 10000;
        f101132j = "debug.file.blockcount";
        f101133k = "debug.file.keepperiod";
        f101134l = "debug.file.tracelevel";
        f101135m = 24;
        f101136n = 604800000L;
        f101137o = Constants.APP_SPECIFIC_ROOT + str + LogUtil.DIR_TAIL;
    }
}
