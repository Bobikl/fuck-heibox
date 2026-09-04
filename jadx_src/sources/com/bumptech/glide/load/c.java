package com.bumptech.glide.load;

import androidx.annotation.n0;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: compiled from: Key.java */
/* JADX INFO: loaded from: classes6.dex */
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f40832a = "UTF-8";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f40833b = Charset.forName("UTF-8");

    void b(@n0 MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
