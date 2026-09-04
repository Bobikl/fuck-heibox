package io.reactivex.processors;

import io.reactivex.j;
import io.reactivex.o;
import jh.c;
import jh.e;
import jh.f;

/* JADX INFO: compiled from: FlowableProcessor.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a<T> extends j<T> implements org.reactivestreams.b<T, T>, o<T> {
    @f
    public abstract Throwable M8();

    public abstract boolean N8();

    public abstract boolean O8();

    public abstract boolean P8();

    @e
    @c
    public final a<T> Q8() {
        return this instanceof b ? this : new b(this);
    }
}
