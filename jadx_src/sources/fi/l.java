package fi;

import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: PrimitiveRanges.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l extends j implements g<Integer>, r<Integer> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final a f118877f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final l f118878g = new l(1, 0);

    /* JADX INFO: compiled from: PrimitiveRanges.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final l a() {
            return l.f118878g;
        }
    }

    public l(int i10, int i11) {
        super(i10, i11, 1);
    }

    @u0(version = s0.f136932w)
    @kotlin.k(message = "Can throw an exception when it's impossible to represent the value with Int type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @kotlin.q
    public static /* synthetic */ void v() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fi.g
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return s(((Number) comparable).intValue());
    }

    @Override // fi.j
    public boolean equals(@dl.e Object obj) {
        if (obj instanceof l) {
            if (!isEmpty() || !((l) obj).isEmpty()) {
                l lVar = (l) obj;
                if (h() != lVar.h() || i() != lVar.i()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // fi.j
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (h() * 31) + i();
    }

    @Override // fi.j, fi.g
    public boolean isEmpty() {
        return h() > i();
    }

    public boolean s(int i10) {
        return h() <= i10 && i10 <= i();
    }

    @Override // fi.j
    @dl.d
    public String toString() {
        return h() + ".." + i();
    }

    @Override // fi.r
    @dl.d
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Integer g() {
        if (i() != Integer.MAX_VALUE) {
            return Integer.valueOf(i() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // fi.g
    @dl.d
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Integer e() {
        return Integer.valueOf(i());
    }

    @Override // fi.g
    @dl.d
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Integer D() {
        return Integer.valueOf(h());
    }
}
