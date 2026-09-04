package fi;

import java.util.Iterator;
import kotlin.e2;
import kotlin.r1;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: ULongRange.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = s0.f136928s)
@e2(markerClass = {kotlin.s.class})
public class y implements Iterable<r1>, zh.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f118903e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f118904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f118905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f118906d;

    /* JADX INFO: compiled from: ULongRange.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final y a(long j10, long j11, long j12) {
            return new y(j10, j11, j12, null);
        }
    }

    private y(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f118904b = j10;
        this.f118905c = sh.q.c(j10, j11, j12);
        this.f118906d = j12;
    }

    public /* synthetic */ y(long j10, long j11, long j12, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12);
    }

    public boolean equals(@dl.e Object obj) {
        if (obj instanceof y) {
            if (!isEmpty() || !((y) obj).isEmpty()) {
                y yVar = (y) obj;
                if (this.f118904b != yVar.f118904b || this.f118905c != yVar.f118905c || this.f118906d != yVar.f118906d) {
                }
            }
            return true;
        }
        return false;
    }

    public final long h() {
        return this.f118904b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = this.f118904b;
        int iH = ((int) r1.h(j10 ^ r1.h(j10 >>> 32))) * 31;
        long j11 = this.f118905c;
        int iH2 = (iH + ((int) r1.h(j11 ^ r1.h(j11 >>> 32)))) * 31;
        long j12 = this.f118906d;
        return iH2 + ((int) ((j12 >>> 32) ^ j12));
    }

    public final long i() {
        return this.f118905c;
    }

    public boolean isEmpty() {
        long j10 = this.f118906d;
        long j11 = this.f118904b;
        long j12 = this.f118905c;
        if (j10 > 0) {
            if (Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) > 0) {
                return true;
            }
        } else if (Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) < 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @dl.d
    public final Iterator<r1> iterator() {
        return new z(this.f118904b, this.f118905c, this.f118906d, null);
    }

    public final long j() {
        return this.f118906d;
    }

    @dl.d
    public String toString() {
        StringBuilder sb2;
        long j10;
        if (this.f118906d > 0) {
            sb2 = new StringBuilder();
            sb2.append((Object) r1.l0(this.f118904b));
            sb2.append("..");
            sb2.append((Object) r1.l0(this.f118905c));
            sb2.append(" step ");
            j10 = this.f118906d;
        } else {
            sb2 = new StringBuilder();
            sb2.append((Object) r1.l0(this.f118904b));
            sb2.append(" downTo ");
            sb2.append((Object) r1.l0(this.f118905c));
            sb2.append(" step ");
            j10 = -this.f118906d;
        }
        sb2.append(j10);
        return sb2.toString();
    }
}
