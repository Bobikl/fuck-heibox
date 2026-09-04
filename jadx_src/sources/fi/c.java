package fi;

import kotlin.jvm.internal.f0;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: PrimitiveRanges.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c extends fi.a implements g<Character>, r<Character> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final a f118859f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final c f118860g = new c(1, 0);

    /* JADX INFO: compiled from: PrimitiveRanges.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final c a() {
            return c.f118860g;
        }
    }

    public c(char c10, char c11) {
        super(c10, c11, 1);
    }

    @u0(version = s0.f136932w)
    @kotlin.k(message = "Can throw an exception when it's impossible to represent the value with Char type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @kotlin.q
    public static /* synthetic */ void v() {
    }

    @Override // fi.g
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return s(((Character) comparable).charValue());
    }

    @Override // fi.a
    public boolean equals(@dl.e Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (h() != cVar.h() || i() != cVar.i()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // fi.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (h() * 31) + i();
    }

    @Override // fi.a, fi.g
    public boolean isEmpty() {
        return f0.t(h(), i()) > 0;
    }

    public boolean s(char c10) {
        return f0.t(h(), c10) <= 0 && f0.t(c10, i()) <= 0;
    }

    @Override // fi.a
    @dl.d
    public String toString() {
        return h() + ".." + i();
    }

    @Override // fi.r
    @dl.d
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Character g() {
        if (i() != 65535) {
            return Character.valueOf((char) (i() + 1));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // fi.g
    @dl.d
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Character e() {
        return Character.valueOf(i());
    }

    @Override // fi.g
    @dl.d
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Character D() {
        return Character.valueOf(h());
    }
}
