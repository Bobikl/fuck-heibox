package com.bun.miitmdid.core;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class CertChecker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CertChecker f42069a = new CertChecker();

    static {
        try {
            System.loadLibrary("msaoaidauth");
        } catch (RuntimeException e10) {
            e10.printStackTrace();
        }
    }

    public static native CertChecker a();

    public native boolean verifyCert(Context context, String str);
}
