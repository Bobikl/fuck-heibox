package com.alipay.mobile.android.verify.bridge;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

/* JADX INFO: compiled from: BusProvider.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Bus f39341a = new Bus(ThreadEnforcer.MAIN);

    private b() {
    }

    public static Bus a() {
        return f39341a;
    }
}
