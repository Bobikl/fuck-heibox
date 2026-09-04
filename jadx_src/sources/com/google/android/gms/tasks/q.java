package com.google.android.gms.tasks;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class q implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Collection f52785a;

    q(Collection collection) {
        this.f52785a = collection;
    }

    @Override // com.google.android.gms.tasks.c
    public final /* bridge */ /* synthetic */ Object a(@androidx.annotation.n0 k kVar) throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f52785a);
        return n.g(arrayList);
    }
}
