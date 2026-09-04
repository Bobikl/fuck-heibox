package kotlin.time;

import kotlin.u0;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
@k
public interface q {

    /* JADX INFO: compiled from: TimeSource.kt */
    public static final class a {
        public static boolean a(@dl.d q qVar) {
            return e.j0(qVar.a());
        }

        public static boolean b(@dl.d q qVar) {
            return !e.j0(qVar.a());
        }

        @dl.d
        public static q c(@dl.d q qVar, long j10) {
            return qVar.u(e.C0(j10));
        }

        @dl.d
        public static q d(@dl.d q qVar, long j10) {
            return new c(qVar, j10, null);
        }
    }

    long a();

    boolean b();

    boolean c();

    @dl.d
    q u(long j10);

    @dl.d
    q v(long j10);
}
