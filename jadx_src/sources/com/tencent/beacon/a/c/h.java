package com.tencent.beacon.a.c;

import com.tencent.beacon.base.util.BeaconLogger;
import com.tencent.qimei.log.IObservableLog;
import com.tencent.qimei.upload.BuildConfig;

/* JADX INFO: compiled from: QimeiWrapper.java */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements IObservableLog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ BeaconLogger f98822a;

    h(BeaconLogger beaconLogger) {
        this.f98822a = beaconLogger;
    }

    @Override // com.tencent.qimei.log.IObservableLog
    public void onLog(String str) {
        this.f98822a.d(BuildConfig.SDK_ID, str);
    }
}
