package io.reactivex.subjects;

import io.reactivex.g0;
import io.reactivex.z;
import jh.e;
import jh.f;

/* JADX INFO: compiled from: Subject.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c<T> extends z<T> implements g0<T> {
    @f
    public abstract Throwable h8();

    public abstract boolean i8();

    public abstract boolean j8();

    public abstract boolean k8();

    @e
    public final c<T> l8() {
        return this instanceof b ? this : new b(this);
    }
}
