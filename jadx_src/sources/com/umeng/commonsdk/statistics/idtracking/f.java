package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* JADX INFO: compiled from: ImeiTracker.java */
/* JADX INFO: loaded from: classes4.dex */
public class f extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f105363a = "imei";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f105364b;

    public f(Context context) {
        super("imei");
        this.f105364b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        return DeviceConfig.getImeiNew(this.f105364b);
    }
}
