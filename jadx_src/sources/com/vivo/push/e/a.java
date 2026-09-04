package com.vivo.push.e;

import java.util.ArrayList;

/* JADX INFO: compiled from: TestManager.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String[] f106594a = {"com.vivo.pushservice", "com.vivo.pushdemo.test", "com.vivo.sdk.test", "com.vivo.hybrid"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<String> f106595b;

    /* JADX INFO: renamed from: com.vivo.push.e.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TestManager.java */
    public static final class C1062a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static a f106596a = new a(0);
    }

    private a() {
        this.f106595b = null;
        this.f106595b = new ArrayList<>();
    }

    /* synthetic */ a(byte b10) {
        this();
    }

    public static a a() {
        return C1062a.f106596a;
    }

    public final ArrayList<String> b() {
        return new ArrayList<>(this.f106595b);
    }

    public final boolean c() {
        ArrayList<String> arrayList = this.f106595b;
        return (arrayList == null || arrayList.size() == 0) ? false : true;
    }
}
