package com.xiaomi.mipush.sdk;

import com.xiaomi.push.in;

/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f106754a;

    static {
        int[] iArr = new int[in.values().length];
        f106754a = iArr;
        try {
            iArr[in.Registration.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f106754a[in.UnRegistration.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f106754a[in.Subscription.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f106754a[in.UnSubscription.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f106754a[in.SendMessage.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f106754a[in.AckMessage.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f106754a[in.SetConfig.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f106754a[in.ReportFeedback.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f106754a[in.Notification.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f106754a[in.Command.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
