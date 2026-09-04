package com.tekartik.sqflite;

import io.flutter.plugin.common.MethodCall;

/* JADX INFO: compiled from: LogLevel.java */
/* JADX INFO: loaded from: classes4.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f98710a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f98711b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f98712c = 2;

    static Integer a(MethodCall methodCall) {
        return (Integer) methodCall.argument("logLevel");
    }

    static boolean b(int i10) {
        return i10 >= 1;
    }

    static boolean c(int i10) {
        return i10 >= 2;
    }
}
