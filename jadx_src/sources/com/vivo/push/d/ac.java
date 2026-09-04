package com.vivo.push.d;

import java.util.List;

/* JADX INFO: compiled from: OnSetTagsReceiveTask.java */
/* JADX INFO: loaded from: classes4.dex */
public final class ac implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f106532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f106533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f106534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f106535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ aa f106536e;

    ac(aa aaVar, int i10, List list, List list2, String str) {
        this.f106536e = aaVar;
        this.f106532a = i10;
        this.f106533b = list;
        this.f106534c = list2;
        this.f106535d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aa aaVar = this.f106536e;
        ((z) aaVar).f106569b.onSetAlias(((com.vivo.push.l) aaVar).f106610a, this.f106532a, this.f106533b, this.f106534c, this.f106535d);
    }
}
