package com.google.android.exoplayer2.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: CopyOnWriteMultiset.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j<E> implements Iterable<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f51436b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0("lock")
    private final Map<E, Integer> f51437c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0("lock")
    private Set<E> f51438d = Collections.emptySet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.b0("lock")
    private List<E> f51439e = Collections.emptyList();

    public int E1(E e10) {
        int iIntValue;
        synchronized (this.f51436b) {
            iIntValue = this.f51437c.containsKey(e10) ? this.f51437c.get(e10).intValue() : 0;
        }
        return iIntValue;
    }

    public void a(E e10) {
        synchronized (this.f51436b) {
            ArrayList arrayList = new ArrayList(this.f51439e);
            arrayList.add(e10);
            this.f51439e = Collections.unmodifiableList(arrayList);
            Integer num = this.f51437c.get(e10);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f51438d);
                hashSet.add(e10);
                this.f51438d = Collections.unmodifiableSet(hashSet);
            }
            this.f51437c.put(e10, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    public void b(E e10) {
        synchronized (this.f51436b) {
            Integer num = this.f51437c.get(e10);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f51439e);
            arrayList.remove(e10);
            this.f51439e = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f51437c.remove(e10);
                HashSet hashSet = new HashSet(this.f51438d);
                hashSet.remove(e10);
                this.f51438d = Collections.unmodifiableSet(hashSet);
            } else {
                this.f51437c.put(e10, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    public Set<E> c() {
        Set<E> set;
        synchronized (this.f51436b) {
            set = this.f51438d;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f51436b) {
            it = this.f51439e.iterator();
        }
        return it;
    }
}
