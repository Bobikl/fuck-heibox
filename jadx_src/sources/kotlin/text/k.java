package kotlin.text;

import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MatchResult.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface k {

    /* JADX INFO: compiled from: MatchResult.kt */
    public static final class a {
        @dl.d
        public static b a(@dl.d k kVar) {
            return new b(kVar);
        }
    }

    /* JADX INFO: compiled from: MatchResult.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final k f128587a;

        public b(@dl.d k match) {
            f0.p(match, "match");
            this.f128587a = match;
        }

        @sh.f
        private final String a() {
            return k().c().get(1);
        }

        @sh.f
        private final String b() {
            return k().c().get(10);
        }

        @sh.f
        private final String c() {
            return k().c().get(2);
        }

        @sh.f
        private final String d() {
            return k().c().get(3);
        }

        @sh.f
        private final String e() {
            return k().c().get(4);
        }

        @sh.f
        private final String f() {
            return k().c().get(5);
        }

        @sh.f
        private final String g() {
            return k().c().get(6);
        }

        @sh.f
        private final String h() {
            return k().c().get(7);
        }

        @sh.f
        private final String i() {
            return k().c().get(8);
        }

        @sh.f
        private final String j() {
            return k().c().get(9);
        }

        @dl.d
        public final k k() {
            return this.f128587a;
        }

        @dl.d
        public final List<String> l() {
            return this.f128587a.c().subList(1, this.f128587a.c().size());
        }
    }

    @dl.d
    b a();

    @dl.d
    i b();

    @dl.d
    List<String> c();

    @dl.d
    fi.l d();

    @dl.d
    String getValue();

    @dl.e
    k next();
}
