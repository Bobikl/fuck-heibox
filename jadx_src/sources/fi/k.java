package fi;

import java.util.NoSuchElementException;
import kotlin.collections.k0;

/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k extends k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f118873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f118874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f118875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f118876e;

    public k(int i10, int i11, int i12) {
        this.f118873b = i12;
        this.f118874c = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f118875d = z10;
        this.f118876e = z10 ? i10 : i11;
    }

    public final int a() {
        return this.f118873b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118875d;
    }

    @Override // kotlin.collections.k0
    public int nextInt() {
        int i10 = this.f118876e;
        if (i10 != this.f118874c) {
            this.f118876e = this.f118873b + i10;
        } else {
            if (!this.f118875d) {
                throw new NoSuchElementException();
            }
            this.f118875d = false;
        }
        return i10;
    }
}
