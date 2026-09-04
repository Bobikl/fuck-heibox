package fi;

import io.flutter.embedding.android.KeyboardMap;
import kotlin.e2;
import kotlin.r1;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: ULongRange.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = s0.f136928s)
@e2(markerClass = {kotlin.s.class})
public final class a0 extends y implements g<r1>, r<r1> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final a f118853f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final a0 f118854g = new a0(-1, 0, null);

    /* JADX INFO: compiled from: ULongRange.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final a0 a() {
            return a0.f118854g;
        }
    }

    private a0(long j10, long j11) {
        super(j10, j11, 1L, null);
    }

    public /* synthetic */ a0(long j10, long j11, kotlin.jvm.internal.u uVar) {
        this(j10, j11);
    }

    @u0(version = s0.f136932w)
    @kotlin.k(message = "Can throw an exception when it's impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @kotlin.q
    public static /* synthetic */ void u() {
    }

    @Override // fi.g
    public /* bridge */ /* synthetic */ Comparable D() {
        return r1.b(w());
    }

    @Override // fi.g
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return o(((r1) comparable).q0());
    }

    @Override // fi.g
    public /* bridge */ /* synthetic */ Comparable e() {
        return r1.b(v());
    }

    @Override // fi.y
    public boolean equals(@dl.e Object obj) {
        if (obj instanceof a0) {
            if (!isEmpty() || !((a0) obj).isEmpty()) {
                a0 a0Var = (a0) obj;
                if (h() != a0Var.h() || i() != a0Var.i()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // fi.r
    public /* bridge */ /* synthetic */ Comparable g() {
        return r1.b(s());
    }

    @Override // fi.y
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((int) r1.h(h() ^ r1.h(h() >>> 32))) * 31) + ((int) r1.h(i() ^ r1.h(i() >>> 32)));
    }

    @Override // fi.y, fi.g
    public boolean isEmpty() {
        return Long.compare(h() ^ Long.MIN_VALUE, i() ^ Long.MIN_VALUE) > 0;
    }

    public boolean o(long j10) {
        return Long.compare(h() ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE) <= 0 && Long.compare(j10 ^ Long.MIN_VALUE, i() ^ Long.MIN_VALUE) <= 0;
    }

    public long s() {
        if (i() != -1) {
            return r1.h(i() + r1.h(((long) 1) & KeyboardMap.kValueMask));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // fi.y
    @dl.d
    public String toString() {
        return ((Object) r1.l0(h())) + ".." + ((Object) r1.l0(i()));
    }

    public long v() {
        return i();
    }

    public long w() {
        return h();
    }
}
