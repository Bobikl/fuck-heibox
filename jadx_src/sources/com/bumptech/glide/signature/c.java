package com.bumptech.glide.signature;

import androidx.annotation.n0;
import java.security.MessageDigest;

/* JADX INFO: compiled from: EmptySignature.java */
/* JADX INFO: loaded from: classes6.dex */
public final class c implements com.bumptech.glide.load.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f41969c = new c();

    private c() {
    }

    @n0
    public static c c() {
        return f41969c;
    }

    @Override // com.bumptech.glide.load.c
    public void b(@n0 MessageDigest messageDigest) {
    }

    public String toString() {
        return "EmptySignature";
    }
}
