package com.tencent.beacon.event.open;

/* JADX INFO: compiled from: BeaconEvent.java */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f99202a;

    static {
        int[] iArr = new int[EventType.values().length];
        f99202a = iArr;
        try {
            iArr[EventType.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f99202a[EventType.DT_NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f99202a[EventType.IMMEDIATE_MSF.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f99202a[EventType.IMMEDIATE_WNS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f99202a[EventType.REALTIME.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f99202a[EventType.DT_REALTIME.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
