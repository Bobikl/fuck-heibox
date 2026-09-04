package com.google.android.exoplayer2;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: PlaylistTimeline.java */
/* JADX INFO: loaded from: classes7.dex */
public final class i3 extends a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f46366j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f46367k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int[] f46368l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int[] f46369m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final z3[] f46370n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object[] f46371o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final HashMap<Object, Integer> f46372p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(Collection<? extends r2> collection, com.google.android.exoplayer2.source.f1 f1Var) {
        super(false, f1Var);
        int iW = 0;
        int size = collection.size();
        this.f46368l = new int[size];
        this.f46369m = new int[size];
        this.f46370n = new z3[size];
        this.f46371o = new Object[size];
        this.f46372p = new HashMap<>();
        int iN = 0;
        int i10 = 0;
        for (r2 r2Var : collection) {
            this.f46370n[i10] = r2Var.a();
            this.f46369m[i10] = iW;
            this.f46368l[i10] = iN;
            iW += this.f46370n[i10].w();
            iN += this.f46370n[i10].n();
            this.f46371o[i10] = r2Var.getUid();
            this.f46372p.put(this.f46371o[i10], Integer.valueOf(i10));
            i10++;
        }
        this.f46366j = iW;
        this.f46367k = iN;
    }

    @Override // com.google.android.exoplayer2.a
    protected int B(Object obj) {
        Integer num = this.f46372p.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.exoplayer2.a
    protected int C(int i10) {
        return com.google.android.exoplayer2.util.u0.i(this.f46368l, i10 + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.a
    protected int D(int i10) {
        return com.google.android.exoplayer2.util.u0.i(this.f46369m, i10 + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.a
    protected Object G(int i10) {
        return this.f46371o[i10];
    }

    @Override // com.google.android.exoplayer2.a
    protected int I(int i10) {
        return this.f46368l[i10];
    }

    @Override // com.google.android.exoplayer2.a
    protected int J(int i10) {
        return this.f46369m[i10];
    }

    @Override // com.google.android.exoplayer2.a
    protected z3 M(int i10) {
        return this.f46370n[i10];
    }

    List<z3> N() {
        return Arrays.asList(this.f46370n);
    }

    @Override // com.google.android.exoplayer2.z3
    public int n() {
        return this.f46367k;
    }

    @Override // com.google.android.exoplayer2.z3
    public int w() {
        return this.f46366j;
    }
}
