package com.bumptech.glide.load.resource;

import android.content.Context;
import androidx.annotation.n0;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.i;
import java.security.MessageDigest;

/* JADX INFO: compiled from: UnitTransformation.java */
/* JADX INFO: loaded from: classes6.dex */
public final class c<T> implements i<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final i<?> f41635c = new c();

    private c() {
    }

    @n0
    public static <T> c<T> c() {
        return (c) f41635c;
    }

    @Override // com.bumptech.glide.load.i
    @n0
    public s<T> a(@n0 Context context, @n0 s<T> sVar, int i10, int i11) {
        return sVar;
    }

    @Override // com.bumptech.glide.load.c
    public void b(@n0 MessageDigest messageDigest) {
    }
}
