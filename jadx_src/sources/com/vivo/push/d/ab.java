package com.vivo.push.d;

import java.util.List;

/* JADX INFO: compiled from: OnSetTagsReceiveTask.java */
/* JADX INFO: loaded from: classes4.dex */
public final class ab implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f106527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f106528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f106529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f106530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ aa f106531e;

    ab(aa aaVar, int i10, List list, List list2, String str) {
        this.f106531e = aaVar;
        this.f106527a = i10;
        this.f106528b = list;
        this.f106529c = list2;
        this.f106530d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aa aaVar = this.f106531e;
        ((z) aaVar).f106569b.onSetTags(((com.vivo.push.l) aaVar).f106610a, this.f106527a, this.f106528b, this.f106529c, this.f106530d);
    }
}
