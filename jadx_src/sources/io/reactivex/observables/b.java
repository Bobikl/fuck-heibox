package io.reactivex.observables;

import io.reactivex.z;
import jh.f;

/* JADX INFO: compiled from: GroupedObservable.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b<K, T> extends z<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final K f123887b;

    protected b(@f K k10) {
        this.f123887b = k10;
    }

    @f
    public K h8() {
        return this.f123887b;
    }
}
