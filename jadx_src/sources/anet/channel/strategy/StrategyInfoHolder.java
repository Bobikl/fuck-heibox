package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.StrategyStatObject;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class StrategyInfoHolder implements NetworkStatusHelper.INetworkStatusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map<String, StrategyTable> f29886a = new LruStrategyMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile StrategyConfig f29887b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final a f29888c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final StrategyTable f29889d = new StrategyTable("Unknown");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<String> f29890e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile String f29891f = "";

    /* JADX INFO: compiled from: Taobao */
    public static class LruStrategyMap extends SerialLruCache<String, StrategyTable> {
        public LruStrategyMap() {
            super(3);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // anet.channel.strategy.utils.SerialLruCache
        public boolean entryRemoved(Map.Entry<String, StrategyTable> entry) {
            anet.channel.strategy.utils.a.a(new f(this, entry));
            return true;
        }
    }

    private StrategyInfoHolder() {
        try {
            e();
            g();
        } catch (Throwable unused) {
        }
        f();
    }

    public static StrategyInfoHolder a() {
        return new StrategyInfoHolder();
    }

    private String a(NetworkStatusHelper.NetworkStatus networkStatus) {
        if (networkStatus.isWifi()) {
            String strMd5ToHex = StringUtils.md5ToHex(NetworkStatusHelper.getWifiBSSID());
            return "WIFI$" + (TextUtils.isEmpty(strMd5ToHex) ? "" : strMd5ToHex);
        }
        if (!networkStatus.isMobile()) {
            return "";
        }
        return networkStatus.getType() + "$" + NetworkStatusHelper.getApn();
    }

    private void e() {
        NetworkStatusHelper.addStatusChangeListener(this);
        this.f29891f = a(NetworkStatusHelper.getStatus());
    }

    private void f() {
        Iterator<Map.Entry<String, StrategyTable>> it = this.f29886a.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().a();
        }
        synchronized (this) {
            if (this.f29887b == null) {
                StrategyConfig strategyConfig = new StrategyConfig();
                strategyConfig.b();
                strategyConfig.a(this);
                this.f29887b = strategyConfig;
            }
        }
    }

    private void g() {
        ALog.i("awcn.StrategyInfoHolder", "restore", null, new Object[0]);
        String str = this.f29891f;
        if (!AwcnConfig.isAsyncLoadStrategyEnable()) {
            if (!TextUtils.isEmpty(str)) {
                a(str, true);
            }
            this.f29887b = (StrategyConfig) m.a("StrategyConfig", null);
            if (this.f29887b != null) {
                this.f29887b.b();
                this.f29887b.a(this);
            }
        }
        anet.channel.strategy.utils.a.a(new d(this, str));
    }

    void a(l.d dVar) {
        int i10 = dVar.f29972g;
        if (i10 != 0) {
            AmdcRuntimeInfo.updateAmdcLimit(i10, dVar.f29973h);
        }
        d().update(dVar);
        this.f29887b.a(dVar);
    }

    protected void a(String str, boolean z10) {
        synchronized (this.f29890e) {
            if (this.f29890e.contains(str)) {
                return;
            }
            this.f29890e.add(str);
            StrategyStatObject strategyStatObject = null;
            if (z10) {
                strategyStatObject = new StrategyStatObject(0);
                strategyStatObject.readStrategyFileId = str;
            }
            StrategyTable strategyTable = (StrategyTable) m.a(str, strategyStatObject);
            if (strategyTable != null) {
                strategyTable.a();
                synchronized (this.f29886a) {
                    this.f29886a.put(strategyTable.f29897a, strategyTable);
                }
            }
            synchronized (this.f29890e) {
                this.f29890e.remove(str);
            }
            if (z10) {
                strategyStatObject.isSucceed = strategyTable != null ? 1 : 0;
                AppMonitor.getInstance().commitStat(strategyStatObject);
            }
        }
    }

    void b() {
        NetworkStatusHelper.removeStatusChangeListener(this);
    }

    void c() {
        synchronized (this) {
            for (StrategyTable strategyTable : this.f29886a.values()) {
                if (strategyTable.f29900d) {
                    StrategyStatObject strategyStatObject = new StrategyStatObject(1);
                    String str = strategyTable.f29897a;
                    strategyStatObject.writeStrategyFileId = str;
                    m.a(strategyTable, str, strategyStatObject);
                    strategyTable.f29900d = false;
                }
            }
            m.a(this.f29887b.a(), "StrategyConfig", null);
        }
    }

    StrategyTable d() {
        StrategyTable strategyTable = this.f29889d;
        String str = this.f29891f;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f29886a) {
                strategyTable = this.f29886a.get(str);
                if (strategyTable == null) {
                    strategyTable = new StrategyTable(str);
                    this.f29886a.put(str, strategyTable);
                }
            }
        }
        return strategyTable;
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        this.f29891f = a(networkStatus);
        String str = this.f29891f;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f29886a) {
            if (!this.f29886a.containsKey(str)) {
                anet.channel.strategy.utils.a.a(new e(this, str));
            }
        }
    }
}
