package kotlin.time;

import kotlin.jvm.internal.f0;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = s0.f136934y)
@k
public interface d extends q, Comparable<d> {

    /* JADX INFO: compiled from: TimeSource.kt */
    public static final class a {
        public static int a(@dl.d d dVar, @dl.d d other) {
            f0.p(other, "other");
            return e.h(dVar.B(other), e.f128628c.W());
        }

        public static boolean b(@dl.d d dVar) {
            return q.a.a(dVar);
        }

        public static boolean c(@dl.d d dVar) {
            return q.a.b(dVar);
        }

        @dl.d
        public static d d(@dl.d d dVar, long j10) {
            return dVar.u(e.C0(j10));
        }
    }

    long B(@dl.d d dVar);

    boolean equals(@dl.e Object obj);

    int hashCode();

    int k1(@dl.d d dVar);

    @Override // kotlin.time.q
    @dl.d
    d u(long j10);

    @Override // kotlin.time.q
    @dl.d
    d v(long j10);
}
