package com.tencent.beacon.base.net.adapter;

import com.tencent.beacon.base.net.BodyType;

/* JADX INFO: compiled from: HttpAdapter.java */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f98898a;

    static {
        int[] iArr = new int[BodyType.values().length];
        f98898a = iArr;
        try {
            iArr[BodyType.DATA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f98898a[BodyType.FORM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f98898a[BodyType.JSON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
