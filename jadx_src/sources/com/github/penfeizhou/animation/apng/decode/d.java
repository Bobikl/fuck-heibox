package com.github.penfeizhou.animation.apng.decode;

import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: compiled from: Chunk.java */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f43205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f43206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f43207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f43208d;

    d() {
    }

    static int a(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 4) {
            return -1159790593;
        }
        return ((str.charAt(3) & 255) << 24) | (str.charAt(0) & 255) | ((str.charAt(1) & 255) << 8) | ((str.charAt(2) & 255) << 16);
    }

    void b(com.github.penfeizhou.animation.apng.io.a aVar) throws IOException {
    }

    void c(com.github.penfeizhou.animation.apng.io.a aVar) throws IOException {
        int iAvailable = aVar.available();
        b(aVar);
        int iAvailable2 = iAvailable - aVar.available();
        int i10 = this.f43205a;
        if (iAvailable2 > i10) {
            throw new IOException("Out of chunk area");
        }
        if (iAvailable2 < i10) {
            aVar.skip(i10 - iAvailable2);
        }
    }
}
