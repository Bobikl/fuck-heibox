package fi;

import kotlin.collections.l0;

/* JADX INFO: compiled from: Progressions.kt */
/* JADX INFO: loaded from: classes5.dex */
public class m implements Iterable<Long>, zh.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f118879e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f118880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f118881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f118882d;

    /* JADX INFO: compiled from: Progressions.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final m a(long j10, long j11, long j12) {
            return new m(j10, j11, j12);
        }
    }

    public m(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f118880b = j10;
        this.f118881c = sh.n.d(j10, j11, j12);
        this.f118882d = j12;
    }

    public boolean equals(@dl.e Object obj) {
        if (obj instanceof m) {
            if (!isEmpty() || !((m) obj).isEmpty()) {
                m mVar = (m) obj;
                if (this.f118880b != mVar.f118880b || this.f118881c != mVar.f118881c || this.f118882d != mVar.f118882d) {
                }
            }
            return true;
        }
        return false;
    }

    public final long h() {
        return this.f118880b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = 31;
        long j11 = this.f118880b;
        long j12 = this.f118881c;
        long j13 = j10 * (((j11 ^ (j11 >>> 32)) * j10) + (j12 ^ (j12 >>> 32)));
        long j14 = this.f118882d;
        return (int) (j13 + (j14 ^ (j14 >>> 32)));
    }

    public final long i() {
        return this.f118881c;
    }

    public boolean isEmpty() {
        long j10 = this.f118882d;
        long j11 = this.f118880b;
        long j12 = this.f118881c;
        if (j10 > 0) {
            if (j11 > j12) {
                return true;
            }
        } else if (j11 < j12) {
            return true;
        }
        return false;
    }

    public final long j() {
        return this.f118882d;
    }

    @Override // java.lang.Iterable
    @dl.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public l0 iterator() {
        return new n(this.f118880b, this.f118881c, this.f118882d);
    }

    @dl.d
    public String toString() {
        StringBuilder sb2;
        long j10;
        if (this.f118882d > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f118880b);
            sb2.append("..");
            sb2.append(this.f118881c);
            sb2.append(" step ");
            j10 = this.f118882d;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f118880b);
            sb2.append(" downTo ");
            sb2.append(this.f118881c);
            sb2.append(" step ");
            j10 = -this.f118882d;
        }
        sb2.append(j10);
        return sb2.toString();
    }
}
