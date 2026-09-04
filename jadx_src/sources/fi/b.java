package fi;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends kotlin.collections.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f118855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f118856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f118857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f118858e;

    public b(char c10, char c11, int i10) {
        this.f118855b = i10;
        this.f118856c = c11;
        boolean z10 = true;
        if (i10 <= 0 ? f0.t(c10, c11) < 0 : f0.t(c10, c11) > 0) {
            z10 = false;
        }
        this.f118857d = z10;
        this.f118858e = z10 ? c10 : c11;
    }

    @Override // kotlin.collections.q
    public char b() {
        int i10 = this.f118858e;
        if (i10 != this.f118856c) {
            this.f118858e = this.f118855b + i10;
        } else {
            if (!this.f118857d) {
                throw new NoSuchElementException();
            }
            this.f118857d = false;
        }
        return (char) i10;
    }

    public final int c() {
        return this.f118855b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118857d;
    }
}
