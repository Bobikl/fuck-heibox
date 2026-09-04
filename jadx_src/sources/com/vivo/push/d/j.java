package com.vivo.push.d;

import java.util.List;

/* JADX INFO: compiled from: OnDelTagsReceiveTask.java */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f106547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f106548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f106549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f106550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ h f106551e;

    j(h hVar, int i10, List list, List list2, String str) {
        this.f106551e = hVar;
        this.f106547a = i10;
        this.f106548b = list;
        this.f106549c = list2;
        this.f106550d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar = this.f106551e;
        ((z) hVar).f106569b.onDelAlias(((com.vivo.push.l) hVar).f106610a, this.f106547a, this.f106548b, this.f106549c, this.f106550d);
    }
}
