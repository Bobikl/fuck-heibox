package com.google.common.collect;

import com.google.common.base.Equivalence;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public final class MapMaker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f57542g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f57543h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f57544i = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f57545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f57546b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f57547c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @CheckForNull
    MapMakerInternalMap.Strength f57548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @CheckForNull
    MapMakerInternalMap.Strength f57549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @CheckForNull
    Equivalence<Object> f57550f;

    public enum Dummy {
        VALUE
    }

    @s9.a
    public MapMaker a(int i10) {
        int i11 = this.f57547c;
        com.google.common.base.w.n0(i11 == -1, "concurrency level was already set to %s", i11);
        com.google.common.base.w.d(i10 > 0);
        this.f57547c = i10;
        return this;
    }

    int b() {
        int i10 = this.f57547c;
        if (i10 == -1) {
            return 4;
        }
        return i10;
    }

    int c() {
        int i10 = this.f57546b;
        if (i10 == -1) {
            return 16;
        }
        return i10;
    }

    Equivalence<Object> d() {
        return (Equivalence) com.google.common.base.q.a(this.f57550f, e().defaultEquivalence());
    }

    MapMakerInternalMap.Strength e() {
        return (MapMakerInternalMap.Strength) com.google.common.base.q.a(this.f57548d, MapMakerInternalMap.Strength.STRONG);
    }

    MapMakerInternalMap.Strength f() {
        return (MapMakerInternalMap.Strength) com.google.common.base.q.a(this.f57549e, MapMakerInternalMap.Strength.STRONG);
    }

    @s9.a
    public MapMaker g(int i10) {
        int i11 = this.f57546b;
        com.google.common.base.w.n0(i11 == -1, "initial capacity was already set to %s", i11);
        com.google.common.base.w.d(i10 >= 0);
        this.f57546b = i10;
        return this;
    }

    @s9.a
    @o9.c
    MapMaker h(Equivalence<Object> equivalence) {
        Equivalence<Object> equivalence2 = this.f57550f;
        com.google.common.base.w.x0(equivalence2 == null, "key equivalence was already set to %s", equivalence2);
        this.f57550f = (Equivalence) com.google.common.base.w.E(equivalence);
        this.f57545a = true;
        return this;
    }

    public <K, V> ConcurrentMap<K, V> i() {
        return !this.f57545a ? new ConcurrentHashMap(c(), 0.75f, b()) : MapMakerInternalMap.c(this);
    }

    MapMaker j(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.f57548d;
        com.google.common.base.w.x0(strength2 == null, "Key strength was already set to %s", strength2);
        this.f57548d = (MapMakerInternalMap.Strength) com.google.common.base.w.E(strength);
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.f57545a = true;
        }
        return this;
    }

    MapMaker k(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.f57549e;
        com.google.common.base.w.x0(strength2 == null, "Value strength was already set to %s", strength2);
        this.f57549e = (MapMakerInternalMap.Strength) com.google.common.base.w.E(strength);
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.f57545a = true;
        }
        return this;
    }

    @s9.a
    @o9.c
    public MapMaker l() {
        return j(MapMakerInternalMap.Strength.WEAK);
    }

    @s9.a
    @o9.c
    public MapMaker m() {
        return k(MapMakerInternalMap.Strength.WEAK);
    }

    public String toString() {
        com.google.common.base.q.b bVarC = com.google.common.base.q.c(this);
        int i10 = this.f57546b;
        if (i10 != -1) {
            bVarC.d("initialCapacity", i10);
        }
        int i11 = this.f57547c;
        if (i11 != -1) {
            bVarC.d("concurrencyLevel", i11);
        }
        MapMakerInternalMap.Strength strength = this.f57548d;
        if (strength != null) {
            bVarC.f("keyStrength", com.google.common.base.a.g(strength.toString()));
        }
        MapMakerInternalMap.Strength strength2 = this.f57549e;
        if (strength2 != null) {
            bVarC.f("valueStrength", com.google.common.base.a.g(strength2.toString()));
        }
        if (this.f57550f != null) {
            bVarC.s("keyEquivalence");
        }
        return bVarC.toString();
    }
}
