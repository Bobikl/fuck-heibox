package com.alipay.mobile.android.verify.logger;

/* JADX INFO: compiled from: AndroidLogAdapter.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f39363a;

    public a() {
        this.f39363a = g.k().a();
    }

    public a(b bVar) {
        this.f39363a = bVar;
    }

    @Override // com.alipay.mobile.android.verify.logger.c
    public void a(int i10, String str, String str2) {
        this.f39363a.a(i10, str, str2);
    }

    @Override // com.alipay.mobile.android.verify.logger.c
    public boolean isLoggable(int i10, String str) {
        return true;
    }
}
