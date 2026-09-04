package com.xiaomi.push.service;

import com.xiaomi.push.in;

/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class cg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f107989a;

    static {
        int[] iArr = new int[in.values().length];
        f107989a = iArr;
        try {
            iArr[in.Registration.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f107989a[in.UnRegistration.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f107989a[in.Subscription.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f107989a[in.UnSubscription.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f107989a[in.SendMessage.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f107989a[in.AckMessage.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f107989a[in.SetConfig.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f107989a[in.ReportFeedback.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f107989a[in.Notification.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f107989a[in.Command.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
