package com.tencent.open.a;

import java.io.IOException;
import okhttp3.c0;
import okhttp3.d0;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c0 f101015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f101016b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f101017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f101018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f101019e;

    d(c0 c0Var, int i10) {
        this.f101015a = c0Var;
        this.f101018d = i10;
        this.f101017c = c0Var.x();
        d0 d0VarQ = this.f101015a.q();
        if (d0VarQ != null) {
            this.f101019e = (int) d0VarQ.getF132481e();
        } else {
            this.f101019e = 0;
        }
    }

    @Override // com.tencent.open.a.g
    public String a() throws IOException {
        if (this.f101016b == null) {
            d0 d0VarQ = this.f101015a.q();
            if (d0VarQ != null) {
                this.f101016b = d0VarQ.string();
            }
            if (this.f101016b == null) {
                this.f101016b = "";
            }
        }
        return this.f101016b;
    }

    @Override // com.tencent.open.a.g
    public int b() {
        return this.f101019e;
    }

    @Override // com.tencent.open.a.g
    public int c() {
        return this.f101018d;
    }

    @Override // com.tencent.open.a.g
    public int d() {
        return this.f101017c;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + hashCode() + this.f101016b + this.f101017c + this.f101018d + this.f101019e;
    }
}
