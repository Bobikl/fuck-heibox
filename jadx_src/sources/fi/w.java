package fi;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.n1;
import kotlin.u0;

/* JADX INFO: compiled from: UIntRange.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
public final class w implements Iterator<n1>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f118897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f118898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f118899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f118900e;

    private w(int i10, int i11, int i12) {
        this.f118897b = i11;
        boolean z10 = true;
        if (i12 <= 0 ? Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) < 0 : Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) > 0) {
            z10 = false;
        }
        this.f118898c = z10;
        this.f118899d = n1.h(i12);
        this.f118900e = this.f118898c ? i10 : i11;
    }

    public /* synthetic */ w(int i10, int i11, int i12, kotlin.jvm.internal.u uVar) {
        this(i10, i11, i12);
    }

    public int a() {
        int i10 = this.f118900e;
        if (i10 != this.f118897b) {
            this.f118900e = n1.h(this.f118899d + i10);
        } else {
            if (!this.f118898c) {
                throw new NoSuchElementException();
            }
            this.f118898c = false;
        }
        return i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118898c;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ n1 next() {
        return n1.b(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
