package fi;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.r1;
import kotlin.u0;

/* JADX INFO: compiled from: ULongRange.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
public final class z implements Iterator<r1>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f118907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f118908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f118909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f118910e;

    private z(long j10, long j11, long j12) {
        this.f118907b = j11;
        boolean z10 = true;
        if (j12 <= 0 ? Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) < 0 : Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) > 0) {
            z10 = false;
        }
        this.f118908c = z10;
        this.f118909d = r1.h(j12);
        this.f118910e = this.f118908c ? j10 : j11;
    }

    public /* synthetic */ z(long j10, long j11, long j12, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12);
    }

    public long a() {
        long j10 = this.f118910e;
        if (j10 != this.f118907b) {
            this.f118910e = r1.h(this.f118909d + j10);
        } else {
            if (!this.f118908c) {
                throw new NoSuchElementException();
            }
            this.f118908c = false;
        }
        return j10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118908c;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ r1 next() {
        return r1.b(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
