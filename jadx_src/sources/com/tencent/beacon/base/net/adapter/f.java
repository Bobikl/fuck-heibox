package com.tencent.beacon.base.net.adapter;

import com.tencent.beacon.base.net.BodyType;

/* JADX INFO: compiled from: OkHttpAdapter.java */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f98905a;

    static {
        int[] iArr = new int[BodyType.values().length];
        f98905a = iArr;
        try {
            iArr[BodyType.FORM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f98905a[BodyType.JSON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f98905a[BodyType.DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
