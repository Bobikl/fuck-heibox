package com.google.android.exoplayer2.source;

import android.util.SparseArray;

/* JADX INFO: compiled from: SpannedData.java */
/* JADX INFO: loaded from: classes7.dex */
public final class l1<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f48539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<V> f48540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.i<V> f48541c;

    public l1() {
        this(new com.google.android.exoplayer2.util.i() { // from class: com.google.android.exoplayer2.source.k1
            @Override // com.google.android.exoplayer2.util.i
            public final void accept(Object obj) {
                l1.i(obj);
            }
        });
    }

    public l1(com.google.android.exoplayer2.util.i<V> iVar) {
        this.f48540b = new SparseArray<>();
        this.f48541c = iVar;
        this.f48539a = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(Object obj) {
    }

    public void b(int i10, V v10) {
        if (this.f48539a == -1) {
            com.google.android.exoplayer2.util.a.i(this.f48540b.size() == 0);
            this.f48539a = 0;
        }
        if (this.f48540b.size() > 0) {
            SparseArray<V> sparseArray = this.f48540b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            com.google.android.exoplayer2.util.a.a(i10 >= iKeyAt);
            if (iKeyAt == i10) {
                com.google.android.exoplayer2.util.i<V> iVar = this.f48541c;
                SparseArray<V> sparseArray2 = this.f48540b;
                iVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f48540b.append(i10, v10);
    }

    public void c() {
        for (int i10 = 0; i10 < this.f48540b.size(); i10++) {
            this.f48541c.accept(this.f48540b.valueAt(i10));
        }
        this.f48539a = -1;
        this.f48540b.clear();
    }

    public void d(int i10) {
        for (int size = this.f48540b.size() - 1; size >= 0 && i10 < this.f48540b.keyAt(size); size--) {
            this.f48541c.accept(this.f48540b.valueAt(size));
            this.f48540b.removeAt(size);
        }
        this.f48539a = this.f48540b.size() > 0 ? Math.min(this.f48539a, this.f48540b.size() - 1) : -1;
    }

    public void e(int i10) {
        int i11 = 0;
        while (i11 < this.f48540b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f48540b.keyAt(i12)) {
                return;
            }
            this.f48541c.accept(this.f48540b.valueAt(i11));
            this.f48540b.removeAt(i11);
            int i13 = this.f48539a;
            if (i13 > 0) {
                this.f48539a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public V f(int i10) {
        if (this.f48539a == -1) {
            this.f48539a = 0;
        }
        while (true) {
            int i11 = this.f48539a;
            if (i11 <= 0 || i10 >= this.f48540b.keyAt(i11)) {
                break;
            }
            this.f48539a--;
        }
        while (this.f48539a < this.f48540b.size() - 1 && i10 >= this.f48540b.keyAt(this.f48539a + 1)) {
            this.f48539a++;
        }
        return this.f48540b.valueAt(this.f48539a);
    }

    public V g() {
        SparseArray<V> sparseArray = this.f48540b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean h() {
        return this.f48540b.size() == 0;
    }
}
