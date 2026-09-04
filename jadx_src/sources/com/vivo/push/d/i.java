package com.vivo.push.d;

import java.util.List;

/* JADX INFO: compiled from: OnDelTagsReceiveTask.java */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f106542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f106543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f106544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f106545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ h f106546e;

    i(h hVar, int i10, List list, List list2, String str) {
        this.f106546e = hVar;
        this.f106542a = i10;
        this.f106543b = list;
        this.f106544c = list2;
        this.f106545d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar = this.f106546e;
        ((z) hVar).f106569b.onDelTags(((com.vivo.push.l) hVar).f106610a, this.f106542a, this.f106543b, this.f106544c, this.f106545d);
    }
}
