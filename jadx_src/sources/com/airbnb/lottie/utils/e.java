package com.airbnb.lottie.utils;

import android.util.Log;
import com.airbnb.lottie.m;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: LogcatLogger.java */
/* JADX INFO: loaded from: classes6.dex */
public class e implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f37826a = new HashSet();

    @Override // com.airbnb.lottie.m
    public void a(String str) {
        c(str, null);
    }

    @Override // com.airbnb.lottie.m
    public void b(String str, Throwable th2) {
        if (com.airbnb.lottie.e.f37311a) {
            Log.d(com.airbnb.lottie.e.f37312b, str, th2);
        }
    }

    @Override // com.airbnb.lottie.m
    public void c(String str, Throwable th2) {
        Set<String> set = f37826a;
        if (set.contains(str)) {
            return;
        }
        Log.w(com.airbnb.lottie.e.f37312b, str, th2);
        set.add(str);
    }

    @Override // com.airbnb.lottie.m
    public void d(String str, Throwable th2) {
        if (com.airbnb.lottie.e.f37311a) {
            Log.d(com.airbnb.lottie.e.f37312b, str, th2);
        }
    }

    @Override // com.airbnb.lottie.m
    public void e(String str) {
        d(str, null);
    }
}
