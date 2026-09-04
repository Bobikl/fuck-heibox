package com.huawei.hms.support.api.client;

import android.os.Bundle;

/* JADX INFO: loaded from: classes7.dex */
public class BundleResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f62662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bundle f62663b;

    public BundleResult(int i10, Bundle bundle) {
        this.f62662a = i10;
        this.f62663b = bundle;
    }

    public int getResultCode() {
        return this.f62662a;
    }

    public Bundle getRspBody() {
        return this.f62663b;
    }

    public void setResultCode(int i10) {
        this.f62662a = i10;
    }

    public void setRspBody(Bundle bundle) {
        this.f62663b = bundle;
    }
}
