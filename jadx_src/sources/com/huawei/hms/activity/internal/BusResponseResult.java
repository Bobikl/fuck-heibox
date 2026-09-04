package com.huawei.hms.activity.internal;

import android.content.Intent;

/* JADX INFO: loaded from: classes7.dex */
public class BusResponseResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Intent f60271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f60272b;

    public int getCode() {
        return this.f60272b;
    }

    public Intent getIntent() {
        return this.f60271a;
    }

    public void setCode(int i10) {
        this.f60272b = i10;
    }

    public void setIntent(Intent intent) {
        this.f60271a = intent;
    }
}
