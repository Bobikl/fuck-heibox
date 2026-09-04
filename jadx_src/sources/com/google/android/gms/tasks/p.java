package com.google.android.gms.tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class p implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Collection f52783a;

    p(Collection collection) {
        this.f52783a = collection;
    }

    @Override // com.google.android.gms.tasks.c
    public final /* bridge */ /* synthetic */ Object a(@androidx.annotation.n0 k kVar) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f52783a.iterator();
        while (it.hasNext()) {
            arrayList.add(((k) it.next()).r());
        }
        return arrayList;
    }
}
