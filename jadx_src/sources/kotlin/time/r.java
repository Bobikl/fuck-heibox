package kotlin.time;

import kotlin.jvm.internal.f0;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
@k
public interface r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f128644a = a.f128645a;

    /* JADX INFO: compiled from: TimeSource.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f128645a = new a();

        private a() {
        }
    }

    /* JADX INFO: compiled from: TimeSource.kt */
    public static final class b implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final b f128646b = new b();

        /* JADX INFO: compiled from: TimeSource.kt */
        @u0(version = s0.f136932w)
        @xh.f
        @k
        public static final class a implements d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final long f128647b;

            private /* synthetic */ a(long j10) {
                this.f128647b = j10;
            }

            public static final /* synthetic */ a d(long j10) {
                return new a(j10);
            }

            public static final int e(long j10, long j11) {
                return e.h(n(j10, j11), e.f128628c.W());
            }

            public static int f(long j10, @dl.d d other) {
                f0.p(other, "other");
                return d(j10).compareTo(other);
            }

            public static long g(long j10) {
                return j10;
            }

            public static long h(long j10) {
                return o.f128641b.d(j10);
            }

            public static boolean i(long j10, Object obj) {
                return (obj instanceof a) && j10 == ((a) obj).w();
            }

            public static final boolean j(long j10, long j11) {
                return j10 == j11;
            }

            public static boolean k(long j10) {
                return e.j0(h(j10));
            }

            public static boolean l(long j10) {
                return !e.j0(h(j10));
            }

            public static int m(long j10) {
                return androidx.collection.k.a(j10);
            }

            public static final long n(long j10, long j11) {
                return o.f128641b.c(j10, j11);
            }

            public static long p(long j10, long j11) {
                return o.f128641b.b(j10, e.C0(j11));
            }

            public static long q(long j10, @dl.d d other) {
                f0.p(other, "other");
                if (other instanceof a) {
                    return n(j10, ((a) other).w());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) t(j10)) + " and " + other);
            }

            public static long s(long j10, long j11) {
                return o.f128641b.b(j10, j11);
            }

            public static String t(long j10) {
                return "ValueTimeMark(reading=" + j10 + ')';
            }

            @Override // kotlin.time.d
            public long B(@dl.d d other) {
                f0.p(other, "other");
                return q(this.f128647b, other);
            }

            @Override // kotlin.time.q
            public long a() {
                return h(this.f128647b);
            }

            @Override // kotlin.time.q
            public boolean b() {
                return k(this.f128647b);
            }

            @Override // kotlin.time.q
            public boolean c() {
                return l(this.f128647b);
            }

            @Override // kotlin.time.d
            public boolean equals(Object obj) {
                return i(this.f128647b, obj);
            }

            @Override // kotlin.time.d
            public int hashCode() {
                return m(this.f128647b);
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
            public int compareTo(@dl.d d dVar) {
                return d.a.a(this, dVar);
            }

            public long o(long j10) {
                return p(this.f128647b, j10);
            }

            public long r(long j10) {
                return s(this.f128647b, j10);
            }

            public String toString() {
                return t(this.f128647b);
            }

            @Override // kotlin.time.d, kotlin.time.q
            public /* bridge */ /* synthetic */ d u(long j10) {
                return d(r(j10));
            }

            @Override // kotlin.time.q
            public /* bridge */ /* synthetic */ q u(long j10) {
                return d(r(j10));
            }

            @Override // kotlin.time.d, kotlin.time.q
            public /* bridge */ /* synthetic */ d v(long j10) {
                return d(o(j10));
            }

            @Override // kotlin.time.q
            public /* bridge */ /* synthetic */ q v(long j10) {
                return d(o(j10));
            }

            public final /* synthetic */ long w() {
                return this.f128647b;
            }
        }

        private b() {
        }

        @Override // kotlin.time.r.c, kotlin.time.r
        public /* bridge */ /* synthetic */ d a() {
            return a.d(b());
        }

        @Override // kotlin.time.r
        public /* bridge */ /* synthetic */ q a() {
            return a.d(b());
        }

        public long b() {
            return o.f128641b.e();
        }

        @dl.d
        public String toString() {
            return o.f128641b.toString();
        }
    }

    /* JADX INFO: compiled from: TimeSource.kt */
    @u0(version = s0.f136934y)
    @k
    public interface c extends r {
        @Override // kotlin.time.r
        @dl.d
        d a();
    }

    @dl.d
    q a();
}
