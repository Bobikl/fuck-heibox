package com.tencent.thumbplayer.tcmedia.d;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<WeakReference<a>> f102612a = new CopyOnWriteArrayList<>();

    public void a(a aVar) {
        CopyOnWriteArrayList<WeakReference<a>> copyOnWriteArrayList;
        if (aVar == null || (copyOnWriteArrayList = this.f102612a) == null || copyOnWriteArrayList.contains(aVar)) {
            return;
        }
        this.f102612a.add(new WeakReference<>(aVar));
    }

    public void a(b.a aVar) {
        CopyOnWriteArrayList<WeakReference<a>> copyOnWriteArrayList = this.f102612a;
        if (copyOnWriteArrayList != null) {
            Iterator<WeakReference<a>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                a aVar2 = it.next().get();
                if (aVar2 != null) {
                    aVar2.a(aVar);
                }
            }
        }
    }
}
