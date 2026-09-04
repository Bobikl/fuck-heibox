package k;

import com.tencent.msdk.dns.core.LookupResult;
import java.util.Set;

/* JADX INFO: compiled from: LookupHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f124391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f124392c;

    public l(k kVar, g gVar) {
        this.f124391b = kVar;
        this.f124392c = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        Set<g> setH = this.f124391b.h();
        if (setH.contains(this.f124392c)) {
            LookupResult lookupResultA = this.f124392c.a((m) this.f124391b.f124382a);
            if (lookupResultA.stat.lookupSuccess() || lookupResultA.stat.lookupFailed()) {
                setH.remove(this.f124392c);
                b.a.n(this.f124391b, this.f124392c, lookupResultA.stat, lookupResultA.ipSet.ips);
            }
        }
    }
}
