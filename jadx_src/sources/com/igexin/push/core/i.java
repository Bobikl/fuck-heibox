package com.igexin.push.core;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f63748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f63749b;

    static {
        int[] iArr = new int[j.values().length];
        f63749b = iArr;
        try {
            iArr[j.HEARTBEAT_OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f63749b[j.HEARTBEAT_TIMEOUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f63749b[j.NETWORK_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f63749b[j.NETWORK_SWITCH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[k.values().length];
        f63748a = iArr2;
        try {
            iArr2[k.DETECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f63748a[k.STABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f63748a[k.PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
