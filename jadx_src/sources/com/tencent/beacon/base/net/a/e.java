package com.tencent.beacon.base.net.a;

import com.tencent.beacon.base.net.BodyType;

/* JADX INFO: compiled from: HttpRequestEntity.java */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f98853a;

    static {
        int[] iArr = new int[BodyType.values().length];
        f98853a = iArr;
        try {
            iArr[BodyType.JSON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f98853a[BodyType.FORM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f98853a[BodyType.DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
