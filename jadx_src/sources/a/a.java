package a;

import android.os.SystemClock;
import com.tencent.msdk.dns.DnsConfig;
import com.tencent.msdk.dns.DnsService;
import com.tencent.msdk.dns.MSDKDnsResolver;
import com.tencent.msdk.dns.core.IStatisticsMerge;
import com.tencent.msdk.dns.core.LookupResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicInteger;
import k.f;
import k.m;
import r.e;
import w.d;

/* JADX INFO: compiled from: BackupResolver.java */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static a f1127g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DnsConfig f1129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f1130c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AtomicInteger f1128a = new AtomicInteger(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1131d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f1132e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j.b f1133f = j.b.a(new RunnableC0000a(), 15L);

    /* JADX INFO: renamed from: a.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BackupResolver.java */
    public class RunnableC0000a implements Runnable {
        public RunnableC0000a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String strB = a.c().b();
                m.a aVarA = new m.a().f(strB).c(MSDKDnsResolver.DES_HTTP_CHANNEL).g(b.f1149a[0]).d(new e("34745", "Sh63l8wv", "347982594")).b(DnsService.getContext()).a(2000);
                aVarA.f124419l = true;
                aVarA.f124414g = false;
                LookupResult<IStatisticsMerge> lookupResultJ = f.j(aVarA.e());
                d.b("HDNSGetDomainIP", lookupResultJ);
                if (lookupResultJ.stat.lookupSuccess()) {
                    ArrayList arrayList = new ArrayList();
                    List listAsList = Arrays.asList(lookupResultJ.ipSet.v4Ips);
                    ArrayList arrayListA = a.this.a();
                    arrayList.addAll(listAsList);
                    arrayList.addAll(arrayListA);
                    a.this.f1130c = arrayList;
                    f.b.b("dns servers Ips: " + a.this.f1130c, new Object[0]);
                    a aVar = a.this;
                    aVar.f1131d = 0;
                    aVar.f1128a.set(0);
                }
            } catch (Exception e10) {
                f.b.a(5, e10, "getServerIpsTask failed", new Object[0]);
            }
        }
    }

    public static a c() {
        if (f1127g == null) {
            synchronized (a.class) {
                if (f1127g == null) {
                    f1127g = new a();
                }
            }
        }
        return f1127g;
    }

    public final ArrayList a() {
        return MSDKDnsResolver.HTTPS_CHANNEL.equals(this.f1129b.channel) ? new ArrayList(Arrays.asList("119.29.29.99", "119.28.28.99")) : new ArrayList(Arrays.asList("119.29.29.98", "119.28.28.98"));
    }

    public String b() {
        if (this.f1131d != 0 && this.f1132e > 0 && SystemClock.elapsedRealtime() - this.f1132e >= 600000) {
            this.f1131d = 0;
            this.f1128a.set(0);
        }
        if (this.f1128a.get() >= 3) {
            if (this.f1131d == 0) {
                this.f1132e = SystemClock.elapsedRealtime();
            }
            if (this.f1131d >= this.f1130c.size() - 1) {
                this.f1131d = 0;
                this.f1132e = 0L;
            } else {
                this.f1131d++;
            }
            this.f1128a.set(0);
            f.b.b("IP Changed：" + this.f1130c.get(this.f1131d), new Object[0]);
        }
        return this.f1130c.get(this.f1131d);
    }

    public void d() {
        if (MSDKDnsResolver.HTTPS_CHANNEL.equals(this.f1129b.channel) || !DnsService.getDnsConfig().enableDomainServer) {
            return;
        }
        j.b bVar = this.f1133f;
        Timer timer = bVar.f124187a;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        bVar.f124187a = timer2;
        timer2.schedule(new j.a(bVar), bVar.f124188b.longValue());
    }
}
