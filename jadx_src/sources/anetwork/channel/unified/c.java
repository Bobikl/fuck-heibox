package anetwork.channel.unified;

import anet.channel.bytes.ByteArray;
import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.cache.Cache;
import com.google.android.exoplayer2.source.rtsp.k0;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class c implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l f30292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Cache f30293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f30294d = false;

    public c(l lVar, Cache cache) {
        this.f30292b = null;
        this.f30293c = null;
        this.f30292b = lVar;
        this.f30293c = cache;
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        this.f30294d = true;
        this.f30292b.f30339a.f30244f.ret = 2;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zEquals;
        Cache.Entry entry;
        if (this.f30294d) {
            return;
        }
        anetwork.channel.entity.k kVar = this.f30292b.f30339a;
        RequestStatistic requestStatistic = kVar.f30244f;
        if (this.f30293c != null) {
            String strL = kVar.l();
            Request requestA = this.f30292b.f30339a.a();
            String str = requestA.getHeaders().get("Cache-Control");
            boolean zEquals2 = "no-store".equals(str);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (zEquals2) {
                this.f30293c.remove(strL);
                zEquals = false;
                entry = null;
            } else {
                zEquals = "no-cache".equals(str);
                entry = this.f30293c.get(strL);
                if (ALog.isPrintLog(2)) {
                    String str2 = this.f30292b.f30341c;
                    Object[] objArr = new Object[8];
                    objArr[0] = "hit";
                    objArr[1] = Boolean.valueOf(entry != null);
                    objArr[2] = "cost";
                    objArr[3] = Long.valueOf(requestStatistic.cacheTime);
                    objArr[4] = k0.f48801p;
                    objArr[5] = Integer.valueOf(entry != null ? entry.f30149b.length : 0);
                    objArr[6] = "key";
                    objArr[7] = strL;
                    ALog.i("anet.CacheTask", "read cache", str2, objArr);
                }
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            requestStatistic.cacheTime = jCurrentTimeMillis2 - jCurrentTimeMillis;
            if (entry == null || zEquals || !entry.a()) {
                if (this.f30294d) {
                    return;
                }
                g gVar = new g(this.f30292b, zEquals2 ? null : this.f30293c, entry);
                this.f30292b.f30343e = gVar;
                gVar.run();
                return;
            }
            if (this.f30292b.f30342d.compareAndSet(false, true)) {
                this.f30292b.a();
                requestStatistic.ret = 1;
                requestStatistic.statusCode = 200;
                requestStatistic.msg = "SUCCESS";
                requestStatistic.protocolType = "cache";
                requestStatistic.rspEnd = jCurrentTimeMillis2;
                requestStatistic.processTime = jCurrentTimeMillis2 - requestStatistic.start;
                if (ALog.isPrintLog(2)) {
                    l lVar = this.f30292b;
                    ALog.i("anet.CacheTask", "hit fresh cache", lVar.f30341c, "URL", lVar.f30339a.k().urlString());
                }
                this.f30292b.f30340b.onResponseCode(200, entry.f30154g);
                v3.a aVar = this.f30292b.f30340b;
                byte[] bArr = entry.f30149b;
                aVar.a(1, bArr.length, ByteArray.wrap(bArr));
                this.f30292b.f30340b.b(new DefaultFinishEvent(200, "SUCCESS", requestA));
            }
        }
    }
}
