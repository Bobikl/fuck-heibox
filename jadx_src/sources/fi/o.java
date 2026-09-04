package fi;

import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: PrimitiveRanges.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class o extends m implements g<Long>, r<Long> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final a f118887f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final o f118888g = new o(1, 0);

    /* JADX INFO: compiled from: PrimitiveRanges.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final o a() {
            return o.f118888g;
        }
    }

    public o(long j10, long j11) {
        super(j10, j11, 1L);
    }

    @u0(version = s0.f136932w)
    @kotlin.k(message = "Can throw an exception when it's impossible to represent the value with Long type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @kotlin.q
    public static /* synthetic */ void v() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fi.g
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return s(((Number) comparable).longValue());
    }

    @Override // fi.m
    public boolean equals(@dl.e Object obj) {
        if (obj instanceof o) {
            if (!isEmpty() || !((o) obj).isEmpty()) {
                o oVar = (o) obj;
                if (h() != oVar.h() || i() != oVar.i()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // fi.m
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (h() ^ (h() >>> 32))) + (i() ^ (i() >>> 32)));
    }

    @Override // fi.m, fi.g
    public boolean isEmpty() {
        return h() > i();
    }

    public boolean s(long j10) {
        return h() <= j10 && j10 <= i();
    }

    @Override // fi.m
    @dl.d
    public String toString() {
        return h() + ".." + i();
    }

    @Override // fi.r
    @dl.d
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Long g() {
        if (i() != Long.MAX_VALUE) {
            return Long.valueOf(i() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // fi.g
    @dl.d
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Long e() {
        return Long.valueOf(i());
    }

    @Override // fi.g
    @dl.d
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Long D() {
        return Long.valueOf(h());
    }
}
