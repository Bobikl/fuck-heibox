package com.google.common.collect;

import io.flutter.embedding.android.KeyboardMap;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.c
@u
public class CompactLinkedHashMap<K, V> extends CompactHashMap<K, V> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f57142r = -2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @CheckForNull
    @o9.d
    transient long[] f57143n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private transient int f57144o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private transient int f57145p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f57146q;

    CompactLinkedHashMap() {
        this(3);
    }

    CompactLinkedHashMap(int i10) {
        this(i10, false);
    }

    CompactLinkedHashMap(int i10, boolean z10) {
        super(i10);
        this.f57146q = z10;
    }

    public static <K, V> CompactLinkedHashMap<K, V> l0() {
        return new CompactLinkedHashMap<>();
    }

    public static <K, V> CompactLinkedHashMap<K, V> m0(int i10) {
        return new CompactLinkedHashMap<>(i10);
    }

    private int n0(int i10) {
        return ((int) (o0(i10) >>> 32)) - 1;
    }

    private long o0(int i10) {
        return p0()[i10];
    }

    private long[] p0() {
        long[] jArr = this.f57143n;
        Objects.requireNonNull(jArr);
        return jArr;
    }

    private void q0(int i10, long j10) {
        p0()[i10] = j10;
    }

    private void r0(int i10, int i11) {
        q0(i10, (o0(i10) & KeyboardMap.kValueMask) | (((long) (i11 + 1)) << 32));
    }

    private void s0(int i10, int i11) {
        if (i10 == -2) {
            this.f57144o = i11;
        } else {
            t0(i10, i11);
        }
        if (i11 == -2) {
            this.f57145p = i10;
        } else {
            r0(i11, i10);
        }
    }

    private void t0(int i10, int i11) {
        q0(i10, (o0(i10) & (-4294967296L)) | (((long) (i11 + 1)) & KeyboardMap.kValueMask));
    }

    @Override // com.google.common.collect.CompactHashMap
    int F() {
        return this.f57144o;
    }

    @Override // com.google.common.collect.CompactHashMap
    int G(int i10) {
        return ((int) o0(i10)) - 1;
    }

    @Override // com.google.common.collect.CompactHashMap
    void K(int i10) {
        super.K(i10);
        this.f57144o = -2;
        this.f57145p = -2;
    }

    @Override // com.google.common.collect.CompactHashMap
    void L(int i10, @x1 K k10, @x1 V v10, int i11, int i12) {
        super.L(i10, k10, v10, i11, i12);
        s0(this.f57145p, i10);
        s0(i10, -2);
    }

    @Override // com.google.common.collect.CompactHashMap
    void O(int i10, int i11) {
        int size = size() - 1;
        super.O(i10, i11);
        s0(n0(i10), G(i10));
        if (i10 < size) {
            s0(n0(size), i10);
            s0(i10, G(size));
        }
        q0(size, 0L);
    }

    @Override // com.google.common.collect.CompactHashMap
    void Z(int i10) {
        super.Z(i10);
        this.f57143n = Arrays.copyOf(p0(), i10);
    }

    @Override // com.google.common.collect.CompactHashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        if (P()) {
            return;
        }
        this.f57144o = -2;
        this.f57145p = -2;
        long[] jArr = this.f57143n;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    @Override // com.google.common.collect.CompactHashMap
    void p(int i10) {
        if (this.f57146q) {
            s0(n0(i10), G(i10));
            s0(this.f57145p, i10);
            s0(i10, -2);
            I();
        }
    }

    @Override // com.google.common.collect.CompactHashMap
    int r(int i10, int i11) {
        return i10 >= size() ? i11 : i10;
    }

    @Override // com.google.common.collect.CompactHashMap
    int u() {
        int iU = super.u();
        this.f57143n = new long[iU];
        return iU;
    }

    @Override // com.google.common.collect.CompactHashMap
    @s9.a
    Map<K, V> v() {
        Map<K, V> mapV = super.v();
        this.f57143n = null;
        return mapV;
    }

    @Override // com.google.common.collect.CompactHashMap
    Map<K, V> y(int i10) {
        return new LinkedHashMap(i10, 1.0f, this.f57146q);
    }
}
