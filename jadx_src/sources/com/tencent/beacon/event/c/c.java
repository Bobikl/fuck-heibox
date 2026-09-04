package com.tencent.beacon.event.c;

import com.tencent.beacon.event.open.EventType;

/* JADX INFO: compiled from: EventUtils.java */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f99071a;

    static {
        int[] iArr = new int[EventType.values().length];
        f99071a = iArr;
        try {
            iArr[EventType.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f99071a[EventType.DT_NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f99071a[EventType.REALTIME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f99071a[EventType.DT_REALTIME.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f99071a[EventType.IMMEDIATE_WNS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f99071a[EventType.IMMEDIATE_MSF.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
