package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* JADX INFO: compiled from: IDFATracker.java */
/* JADX INFO: loaded from: classes4.dex */
public class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f105347a = "idfa";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f105348b;

    public c(Context context) {
        super(f105347a);
        this.f105348b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        return DeviceConfig.getIdfa(this.f105348b);
    }
}
