package fi;

import java.util.NoSuchElementException;
import kotlin.collections.l0;

/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class n extends l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f118883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f118884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f118885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f118886e;

    public n(long j10, long j11, long j12) {
        this.f118883b = j12;
        this.f118884c = j11;
        boolean z10 = true;
        if (j12 <= 0 ? j10 < j11 : j10 > j11) {
            z10 = false;
        }
        this.f118885d = z10;
        this.f118886e = z10 ? j10 : j11;
    }

    public final long a() {
        return this.f118883b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118885d;
    }

    @Override // kotlin.collections.l0
    public long nextLong() {
        long j10 = this.f118886e;
        if (j10 != this.f118884c) {
            this.f118886e = this.f118883b + j10;
        } else {
            if (!this.f118885d) {
                throw new NoSuchElementException();
            }
            this.f118885d = false;
        }
        return j10;
    }
}
