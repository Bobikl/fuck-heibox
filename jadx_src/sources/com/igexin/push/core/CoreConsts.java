package com.igexin.push.core;

import android.os.Environment;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public class CoreConsts {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f63451a = a(6, "pre_burypoint.", new String[]{"co.", "mi.", "gex.", "ins.", "dka.", "cti.", "on.", "notifi.", "cation.", "burying.", "point."});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f63452b = a(5, "pre_doaction.", new String[]{"com.", "ige.", "xin.", "sdk.", "act.", "ion.", "do.", "act.", "tion."});

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f63453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f63454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f63455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f63456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f63457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f63458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f63459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f63460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f63461k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f63462l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f63463m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f63464n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f63465o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static String f63466p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static String f63467q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static String f63468r;

    static {
        String path = Environment.getExternalStorageDirectory().getPath();
        f63453c = path;
        f63454d = path + "/Sdk/ImgCache/";
        f63455e = path + "/Sdk/WebCache/";
        f63456f = 0;
        f63457g = 2;
        f63458h = 11;
        f63459i = 5;
        f63460j = 7;
        f63461k = 9;
        f63462l = 10;
        f63463m = 0;
        f63464n = 1;
        f63465o = 2;
        f63466p = "com.igexin.sdk.PushService";
        f63467q = "com.igexin.sdk.coordinator.SdkMsgService";
        f63468r = "com.igexin.sdk.coordinator.GexinMsgService";
    }

    public static String a(int i10, String str, String[] strArr) {
        if (i10 <= 0 || strArr == null || strArr.length <= 0) {
            return str;
        }
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        for (int i11 = 0; i11 < i10; i11++) {
            stringBuffer.append(strArr[random.nextInt(strArr.length)]);
        }
        return stringBuffer.toString().substring(0, stringBuffer.toString().length() - 1);
    }

    @Deprecated
    public static String getBuryPointAction() {
        return f63451a;
    }
}
