package androidx.core.util;

import android.annotation.SuppressLint;

/* JADX INFO: compiled from: Predicate.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public interface w<T> {
    @SuppressLint({"MissingNullability"})
    w<T> a(@SuppressLint({"MissingNullability"}) w<? super T> wVar);

    @SuppressLint({"MissingNullability"})
    w<T> b(@SuppressLint({"MissingNullability"}) w<? super T> wVar);

    @SuppressLint({"MissingNullability"})
    w<T> negate();

    boolean test(T t10);
}
