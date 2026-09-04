package com.tencent.qimei.o;

import com.tencent.qimei.d.e;

/* JADX INFO: compiled from: MultiAppKeyDeviceInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f101294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f101295b;

    public c(d dVar, e eVar) {
        this.f101295b = dVar;
        this.f101294a = eVar;
    }

    @Override // com.tencent.qimei.d.e
    public void a(int i10) {
        if (this.f101294a != null) {
            synchronized (this.f101295b.f101298c) {
                if (!this.f101295b.f101299d) {
                    this.f101294a.a(i10);
                    this.f101295b.f101299d = true;
                }
            }
        }
    }
}
