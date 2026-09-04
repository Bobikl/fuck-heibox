package r;

import com.tencent.msdk.dns.base.executor.DnsExecutors;
import k.f;
import k.m;

/* JADX INFO: compiled from: CacheHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f138697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f138698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f138699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a.a.a.a.d.p.d.c f138700e;

    /* JADX INFO: compiled from: CacheHelper.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w.d.b("HDNSLookupAsync", f.j(c.this.f138699d));
        }
    }

    public c(a.a.a.a.d.p.d.c cVar, String str, int i10, m mVar) {
        this.f138700e = cVar;
        this.f138697b = str;
        this.f138698c = i10;
        this.f138699d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        f.b.b("%.2f of TTL goes by, lookup for %s(%d) async", Float.valueOf(0.75f), this.f138697b, Integer.valueOf(this.f138698c));
        DnsExecutors.f100946c.execute(new a());
        this.f138700e.f1137a.remove(this);
    }
}
