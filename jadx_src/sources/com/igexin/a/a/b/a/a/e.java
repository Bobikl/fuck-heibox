package com.igexin.a.a.b.a.a;

/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f63144a;

    static {
        int[] iArr = new int[q.values().length];
        f63144a = iArr;
        try {
            iArr[q.TCP_START_CONNECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f63144a[q.TCP_CREATE_SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f63144a[q.TCP_CONNECT_SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f63144a[q.INTERRUPT_SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f63144a[q.TCP_DISCONNECT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f63144a[q.TCP_IO_EXCEPTION.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
