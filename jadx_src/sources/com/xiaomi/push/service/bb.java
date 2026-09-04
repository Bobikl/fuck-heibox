package com.xiaomi.push.service;

import com.xiaomi.push.it;
import com.xiaomi.push.iu;

/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class bb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f107905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f107906b;

    static {
        int[] iArr = new int[iu.values().length];
        f107906b = iArr;
        try {
            iArr[iu.INT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f107906b[iu.LONG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f107906b[iu.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f107906b[iu.BOOLEAN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[it.values().length];
        f107905a = iArr2;
        try {
            iArr2[it.MISC_CONFIG.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f107905a[it.PLUGIN_CONFIG.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
