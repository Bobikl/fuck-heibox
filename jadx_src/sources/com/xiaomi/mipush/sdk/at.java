package com.xiaomi.mipush.sdk;

/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class at {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f106766a;

    static {
        int[] iArr = new int[au.values().length];
        f106766a = iArr;
        try {
            iArr[au.DISABLE_PUSH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f106766a[au.ENABLE_PUSH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f106766a[au.UPLOAD_HUAWEI_TOKEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f106766a[au.UPLOAD_FCM_TOKEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f106766a[au.UPLOAD_COS_TOKEN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f106766a[au.UPLOAD_FTOS_TOKEN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
