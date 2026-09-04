package k;

import com.tencent.msdk.dns.core.LookupResult;
import k.g.a;

/* JADX INFO: compiled from: IDns.java */
/* JADX INFO: loaded from: classes.dex */
public interface g<LookupExtra extends a> {

    /* JADX INFO: compiled from: IDns.java */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f124381a = new C1119a();

        /* JADX INFO: renamed from: k.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IDns.java */
        public static final class C1119a implements a {
        }
    }

    /* JADX INFO: compiled from: IDns.java */
    public interface b {

        /* JADX INFO: compiled from: IDns.java */
        public interface a {
        }

        String[] a();

        void b();

        void c();

        a d();

        boolean e();

        void f();

        c g();

        g h();

        b i();
    }

    /* JADX INFO: compiled from: IDns.java */
    public interface c {
        boolean lookupFailed();

        boolean lookupPartCached();

        boolean lookupSuccess();
    }

    LookupResult a(m<LookupExtra> mVar);

    e a();

    b a(k<LookupExtra> kVar);

    LookupResult b(m<LookupExtra> mVar);
}
