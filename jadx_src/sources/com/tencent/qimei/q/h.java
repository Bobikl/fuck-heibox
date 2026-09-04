package com.tencent.qimei.q;

import java.util.Map;

/* JADX INFO: compiled from: Reporter.java */
/* JADX INFO: loaded from: classes4.dex */
public class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f101337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f101338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f101339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f101340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f101341e;

    public h(j jVar, String str, Map map, String str2, String str3) {
        this.f101341e = jVar;
        this.f101337a = str;
        this.f101338b = map;
        this.f101339c = str2;
        this.f101340d = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f101341e) {
            this.f101341e.a(this.f101337a, this.f101338b, this.f101339c, this.f101340d);
        }
    }
}
