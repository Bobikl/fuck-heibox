package com.tencent.thumbplayer.tcmedia.utils;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static CopyOnWriteArrayList<a> f103147a = new CopyOnWriteArrayList<>();

    public interface a {
        void a(int i10, int i11, int i12, Object obj);
    }

    public static synchronized void a(int i10, int i11, int i12, Object obj) {
        Iterator<a> it = f103147a.iterator();
        while (it.hasNext()) {
            it.next().a(i10, i11, i12, obj);
        }
    }

    public static synchronized void a(a aVar) {
        CopyOnWriteArrayList<a> copyOnWriteArrayList = f103147a;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.contains(aVar)) {
            f103147a.add(aVar);
            TPLogUtil.d("TPGlobalEventNofication", "add onNetStatus change listener: " + aVar + ", mListeners: " + f103147a.size());
        }
    }

    public static synchronized void b(a aVar) {
        CopyOnWriteArrayList<a> copyOnWriteArrayList = f103147a;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(aVar);
            TPLogUtil.d("TPGlobalEventNofication", "remove netStatusChangeListener, listener: " + aVar + ", mListeners: " + f103147a.size());
        }
    }
}
