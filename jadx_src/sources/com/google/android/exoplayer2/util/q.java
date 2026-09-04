package com.google.android.exoplayer2.util;

import java.util.Arrays;

/* JADX INFO: compiled from: LibraryLoader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f51503d = "LibraryLoader";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String[] f51504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f51505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f51506c;

    public q(String... strArr) {
        this.f51504a = strArr;
    }

    public synchronized boolean a() {
        if (this.f51505b) {
            return this.f51506c;
        }
        this.f51505b = true;
        try {
            for (String str : this.f51504a) {
                System.loadLibrary(str);
            }
            this.f51506c = true;
        } catch (UnsatisfiedLinkError unused) {
            String strValueOf = String.valueOf(Arrays.toString(this.f51504a));
            u.m(f51503d, strValueOf.length() != 0 ? "Failed to load ".concat(strValueOf) : new String("Failed to load "));
        }
        return this.f51506c;
    }

    public synchronized void b(String... strArr) {
        a.j(!this.f51505b, "Cannot set libraries after loading");
        this.f51504a = strArr;
    }
}
