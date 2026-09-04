package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Pair;

/* JADX INFO: compiled from: Pair.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F a(@dl.d Pair<F, S> pair) {
        kotlin.jvm.internal.f0.p(pair, "<this>");
        return (F) pair.first;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F b(@dl.d k<F, S> kVar) {
        kotlin.jvm.internal.f0.p(kVar, "<this>");
        return kVar.f21263a;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S c(@dl.d Pair<F, S> pair) {
        kotlin.jvm.internal.f0.p(pair, "<this>");
        return (S) pair.second;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S d(@dl.d k<F, S> kVar) {
        kotlin.jvm.internal.f0.p(kVar, "<this>");
        return kVar.f21264b;
    }

    @dl.d
    public static final <F, S> Pair<F, S> e(@dl.d kotlin.Pair<? extends F, ? extends S> pair) {
        kotlin.jvm.internal.f0.p(pair, "<this>");
        return new Pair<>(pair.e(), pair.f());
    }

    @dl.d
    public static final <F, S> k<F, S> f(@dl.d kotlin.Pair<? extends F, ? extends S> pair) {
        kotlin.jvm.internal.f0.p(pair, "<this>");
        return new k<>(pair.e(), pair.f());
    }

    @dl.d
    public static final <F, S> kotlin.Pair<F, S> g(@dl.d Pair<F, S> pair) {
        kotlin.jvm.internal.f0.p(pair, "<this>");
        return new kotlin.Pair<>(pair.first, pair.second);
    }

    @dl.d
    public static final <F, S> kotlin.Pair<F, S> h(@dl.d k<F, S> kVar) {
        kotlin.jvm.internal.f0.p(kVar, "<this>");
        return new kotlin.Pair<>(kVar.f21263a, kVar.f21264b);
    }
}
