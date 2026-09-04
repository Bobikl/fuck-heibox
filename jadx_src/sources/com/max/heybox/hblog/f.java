package com.max.heybox.hblog;

import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.File;

/* JADX INFO: compiled from: HBLogValues.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final f f74508a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final String f74509b = "HBLog_Default";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final String f74510c = "HBLog_Path";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final String f74511d = "HBLog_Net";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final String f74512e = "HBLog_Web";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final String f74513f = "HBLog_Exception";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    public static final String f74514g = "HBLog_VideoPlayer";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final String f74515h = "HBLog_OnlineTrace";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f74516i = 5242880;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f74517j = 20971520;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f74518k = 6;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f74519l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f74520m = 432000000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final String f74521n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final String f74522o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final String f74523p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final String f74524q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private static final String f74525r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private static final String f74526s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private static final String f74527t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private static final String f74528u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final String f74529v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private static final String f74530w;

    static {
        StringBuilder sb2 = new StringBuilder();
        String str = File.separator;
        sb2.append(str);
        sb2.append("hblog");
        String string = sb2.toString();
        f74521n = string;
        String str2 = string + str + "content";
        f74522o = str2;
        f74523p = str2 + str + "common";
        f74524q = str2 + str + h5.b.f119111k;
        f74525r = str2 + str + FlutterActivityLaunchConfigs.EXTRA_PATH;
        f74526s = str2 + str + "web";
        f74527t = str2 + str + "exception";
        f74528u = str2 + str + "video_player";
        f74529v = str2 + str + "online_trace";
        f74530w = string + str + "output";
    }

    private f() {
    }

    @dl.d
    public final String a() {
        return f74523p;
    }

    @dl.d
    public final String b() {
        return f74522o;
    }

    @dl.d
    public final String c() {
        return f74527t;
    }

    @dl.d
    public final String d() {
        return f74524q;
    }

    @dl.d
    public final String e() {
        return f74530w;
    }

    @dl.d
    public final String f() {
        return f74525r;
    }

    @dl.d
    public final String g() {
        return f74528u;
    }

    @dl.d
    public final String h() {
        return f74526s;
    }

    @dl.d
    public final String i() {
        return f74529v;
    }
}
