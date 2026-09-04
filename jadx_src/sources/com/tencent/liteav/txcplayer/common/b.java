package com.tencent.liteav.txcplayer.common;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f99898a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f99899b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static List<String> f99900c;

    public static String a() {
        return f99898a;
    }

    public static void a(int i10) {
        f99899b = i10;
    }

    public static void a(String str) {
        f99898a = str;
    }

    public static void a(List<String> list) {
        f99900c = new ArrayList(list);
    }

    public static int b() {
        return f99899b;
    }

    public static List<String> c() {
        return f99900c;
    }
}
