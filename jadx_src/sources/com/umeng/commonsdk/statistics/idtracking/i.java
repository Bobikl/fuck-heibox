package com.umeng.commonsdk.statistics.idtracking;

import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* JADX INFO: compiled from: SerialTracker.java */
/* JADX INFO: loaded from: classes4.dex */
public class i extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f105372a = "serial";

    public i() {
        super(f105372a);
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        return DeviceConfig.getSerial();
    }
}
