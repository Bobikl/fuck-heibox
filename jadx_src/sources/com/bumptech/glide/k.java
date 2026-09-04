package com.bumptech.glide;

import androidx.annotation.n0;
import com.bumptech.glide.k;
import com.bumptech.glide.util.m;
import com.bumptech.glide.util.o;

/* JADX INFO: compiled from: TransitionOptions.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class k<CHILD extends k<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.bumptech.glide.request.transition.g<? super TranscodeType> f40816b = com.bumptech.glide.request.transition.e.c();

    private CHILD d() {
        return this;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    @n0
    public final CHILD b() {
        return (CHILD) f(com.bumptech.glide.request.transition.e.c());
    }

    final com.bumptech.glide.request.transition.g<? super TranscodeType> c() {
        return this.f40816b;
    }

    @n0
    public final CHILD e(int i10) {
        return (CHILD) f(new com.bumptech.glide.request.transition.h(i10));
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return o.e(this.f40816b, ((k) obj).f40816b);
        }
        return false;
    }

    @n0
    public final CHILD f(@n0 com.bumptech.glide.request.transition.g<? super TranscodeType> gVar) {
        this.f40816b = (com.bumptech.glide.request.transition.g) m.e(gVar);
        return (CHILD) d();
    }

    @n0
    public final CHILD g(@n0 com.bumptech.glide.request.transition.j.a aVar) {
        return (CHILD) f(new com.bumptech.glide.request.transition.i(aVar));
    }

    public int hashCode() {
        com.bumptech.glide.request.transition.g<? super TranscodeType> gVar = this.f40816b;
        if (gVar != null) {
            return gVar.hashCode();
        }
        return 0;
    }
}
