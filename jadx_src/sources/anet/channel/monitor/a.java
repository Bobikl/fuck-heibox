package anet.channel.monitor;

import anet.channel.util.ALog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f29735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<INetworkQualityChangeListener, f> f29736b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f29737c = new f();

    private a() {
    }

    public static a a() {
        if (f29735a == null) {
            synchronized (a.class) {
                if (f29735a == null) {
                    f29735a = new a();
                }
            }
        }
        return f29735a;
    }

    public void a(double d10) {
        boolean zA;
        for (Map.Entry<INetworkQualityChangeListener, f> entry : this.f29736b.entrySet()) {
            INetworkQualityChangeListener key = entry.getKey();
            f value = entry.getValue();
            if (key != null && value != null && !value.b() && value.f29769a != (zA = value.a(d10))) {
                value.f29769a = zA;
                key.onNetworkQualityChanged(zA ? NetworkSpeed.Slow : NetworkSpeed.Fast);
            }
        }
    }

    public void a(INetworkQualityChangeListener iNetworkQualityChangeListener) {
        this.f29736b.remove(iNetworkQualityChangeListener);
    }

    public void a(INetworkQualityChangeListener iNetworkQualityChangeListener, f fVar) {
        if (iNetworkQualityChangeListener == null) {
            ALog.e("BandWidthListenerHelp", "listener is null", null, new Object[0]);
            return;
        }
        if (fVar != null) {
            fVar.f29770b = System.currentTimeMillis();
            this.f29736b.put(iNetworkQualityChangeListener, fVar);
        } else {
            this.f29737c.f29770b = System.currentTimeMillis();
            this.f29736b.put(iNetworkQualityChangeListener, this.f29737c);
        }
    }
}
