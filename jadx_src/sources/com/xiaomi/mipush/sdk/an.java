package com.xiaomi.mipush.sdk;

import com.xiaomi.push.in;

/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class an {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f106757a;

    static {
        int[] iArr = new int[in.values().length];
        f106757a = iArr;
        try {
            iArr[in.SendMessage.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f106757a[in.Registration.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f106757a[in.UnRegistration.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f106757a[in.Subscription.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f106757a[in.UnSubscription.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f106757a[in.Command.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f106757a[in.Notification.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
