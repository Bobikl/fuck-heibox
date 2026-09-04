package com.bumptech.glide;

import androidx.annotation.n0;

/* JADX INFO: compiled from: GenericTransitionOptions.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b<TranscodeType> extends k<b<TranscodeType>, TranscodeType> {
    @n0
    public static <TranscodeType> b<TranscodeType> h(int i10) {
        return new b().e(i10);
    }

    @n0
    public static <TranscodeType> b<TranscodeType> i(@n0 com.bumptech.glide.request.transition.g<? super TranscodeType> gVar) {
        return new b().f(gVar);
    }

    @n0
    public static <TranscodeType> b<TranscodeType> j(@n0 com.bumptech.glide.request.transition.j.a aVar) {
        return new b().g(aVar);
    }

    @n0
    public static <TranscodeType> b<TranscodeType> k() {
        return new b().b();
    }

    @Override // com.bumptech.glide.k
    public boolean equals(Object obj) {
        return (obj instanceof b) && super.equals(obj);
    }

    @Override // com.bumptech.glide.k
    public int hashCode() {
        return super.hashCode();
    }
}
