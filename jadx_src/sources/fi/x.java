package fi;

import kotlin.e2;
import kotlin.n1;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: UIntRange.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = s0.f136928s)
@e2(markerClass = {kotlin.s.class})
public final class x extends v implements g<n1>, r<n1> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final a f118901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final x f118902g;

    /* JADX INFO: compiled from: UIntRange.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final x a() {
            return x.f118902g;
        }
    }

    static {
        kotlin.jvm.internal.u uVar = null;
        f118901f = new a(uVar);
        f118902g = new x(-1, 0, uVar);
    }

    private x(int i10, int i11) {
        super(i10, i11, 1, null);
    }

    public /* synthetic */ x(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this(i10, i11);
    }

    @u0(version = s0.f136932w)
    @kotlin.k(message = "Can throw an exception when it's impossible to represent the value with UInt type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @kotlin.q
    public static /* synthetic */ void u() {
    }

    @Override // fi.g
    public /* bridge */ /* synthetic */ Comparable D() {
        return n1.b(w());
    }

    @Override // fi.g
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return o(((n1) comparable).q0());
    }

    @Override // fi.g
    public /* bridge */ /* synthetic */ Comparable e() {
        return n1.b(v());
    }

    @Override // fi.v
    public boolean equals(@dl.e Object obj) {
        if (obj instanceof x) {
            if (!isEmpty() || !((x) obj).isEmpty()) {
                x xVar = (x) obj;
                if (h() != xVar.h() || i() != xVar.i()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // fi.r
    public /* bridge */ /* synthetic */ Comparable g() {
        return n1.b(s());
    }

    @Override // fi.v
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (h() * 31) + i();
    }

    @Override // fi.v, fi.g
    public boolean isEmpty() {
        return Integer.compare(h() ^ Integer.MIN_VALUE, i() ^ Integer.MIN_VALUE) > 0;
    }

    public boolean o(int i10) {
        return Integer.compare(h() ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE) <= 0 && Integer.compare(i10 ^ Integer.MIN_VALUE, i() ^ Integer.MIN_VALUE) <= 0;
    }

    public int s() {
        if (i() != -1) {
            return n1.h(i() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // fi.v
    @dl.d
    public String toString() {
        return ((Object) n1.l0(h())) + ".." + ((Object) n1.l0(i()));
    }

    public int v() {
        return i();
    }

    public int w() {
        return h();
    }
}
