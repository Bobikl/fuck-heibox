package com.airbnb.lottie.value;

/* JADX INFO: compiled from: LottieRelativeIntegerValueCallback.java */
/* JADX INFO: loaded from: classes6.dex */
public class h extends j<Integer> {
    /* JADX WARN: Multi-variable type inference failed */
    public Integer e(b<Integer> bVar) {
        T t10 = this.f37883c;
        if (t10 != 0) {
            return (Integer) t10;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    @Override // com.airbnb.lottie.value.j
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Integer a(b<Integer> bVar) {
        return Integer.valueOf(com.airbnb.lottie.utils.i.l(bVar.g().intValue(), bVar.b().intValue(), bVar.c()) + e(bVar).intValue());
    }
}
