package com.tencent.qmsp.sdk.a;

import com.google.android.material.timepicker.TimeModel;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private StringBuilder f101682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f101683b;

    public g() {
        a();
    }

    private void b() {
        b(Constants.ACCEPT_TIME_SEPARATOR_SP);
    }

    private void b(String str) {
        if (this.f101683b) {
            this.f101682a.append(str);
        }
        this.f101683b = true;
    }

    public g a() {
        this.f101682a = new StringBuilder();
        this.f101683b = false;
        return this;
    }

    public g a(int i10) {
        return a(String.format(TimeModel.f55754j, Integer.valueOf(i10)));
    }

    public g a(String str) {
        b();
        this.f101682a.append(str.replace(',', ';'));
        return this;
    }

    public String toString() {
        return this.f101682a.toString();
    }
}
