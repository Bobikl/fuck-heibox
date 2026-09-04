package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.entity.ConnType;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class StrategyTable implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static Comparator<StrategyCollection> f29896e = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f29897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected volatile String f29898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Map<String, Long> f29899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected transient boolean f29900d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HostLruCache f29901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile transient int f29902g;

    /* JADX INFO: compiled from: Taobao */
    public static class HostLruCache extends SerialLruCache<String, StrategyCollection> {
        public HostLruCache(int i10) {
            super(i10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // anet.channel.strategy.utils.SerialLruCache
        public boolean entryRemoved(Map.Entry<String, StrategyCollection> entry) {
            if (!entry.getValue().f29878d) {
                return true;
            }
            Iterator<Map.Entry<String, StrategyCollection>> it = entrySet().iterator();
            while (it.hasNext()) {
                if (!it.next().getValue().f29878d) {
                    it.remove();
                    return false;
                }
            }
            return false;
        }
    }

    protected StrategyTable(String str) {
        this.f29897a = str;
        a();
    }

    private void a(String str) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(str);
        a(treeSet);
    }

    private void a(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        if ((GlobalAppRuntimeInfo.isAppBackground() && AppLifecycle.lastEnterBackgroundTime > 0) || !NetworkStatusHelper.isConnected()) {
            ALog.i("awcn.StrategyTable", "app in background or no network", this.f29897a, new Object[0]);
            return;
        }
        int amdcLimitLevel = AmdcRuntimeInfo.getAmdcLimitLevel();
        if (amdcLimitLevel == 3) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f29901f) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                StrategyCollection strategyCollection = this.f29901f.get(it.next());
                if (strategyCollection != null) {
                    strategyCollection.f29876b = 30000 + jCurrentTimeMillis;
                }
            }
        }
        if (amdcLimitLevel == 0) {
            b(set);
        }
        HttpDispatcher.getInstance().sendAmdcRequest(set, this.f29902g);
    }

    private void b() {
        if (HttpDispatcher.getInstance().isInitHostsChanged(this.f29897a)) {
            for (String str : HttpDispatcher.getInstance().getInitHosts()) {
                this.f29901f.put(str, new StrategyCollection(str));
            }
        }
    }

    private void b(Set<String> set) {
        TreeSet<StrategyCollection> treeSet = new TreeSet(f29896e);
        synchronized (this.f29901f) {
            treeSet.addAll(this.f29901f.values());
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (StrategyCollection strategyCollection : treeSet) {
            if (!strategyCollection.isExpired() || set.size() >= 40) {
                return;
            }
            strategyCollection.f29876b = 30000 + jCurrentTimeMillis;
            set.add(strategyCollection.f29875a);
        }
    }

    private void c() {
        try {
            if (HttpDispatcher.getInstance().isInitHostsChanged(this.f29897a)) {
                TreeSet treeSet = null;
                synchronized (this.f29901f) {
                    for (String str : HttpDispatcher.getInstance().getInitHosts()) {
                        if (!this.f29901f.containsKey(str)) {
                            this.f29901f.put(str, new StrategyCollection(str));
                            if (treeSet == null) {
                                treeSet = new TreeSet();
                            }
                            treeSet.add(str);
                        }
                    }
                }
                if (treeSet != null) {
                    a(treeSet);
                }
            }
        } catch (Exception e10) {
            ALog.e("awcn.StrategyTable", "checkInitHost failed", this.f29897a, e10, new Object[0]);
        }
    }

    protected void a() {
        if (this.f29901f == null) {
            this.f29901f = new HostLruCache(256);
            b();
        }
        Iterator<StrategyCollection> it = this.f29901f.values().iterator();
        while (it.hasNext()) {
            it.next().checkInit();
        }
        ALog.i("awcn.StrategyTable", "strategy map", null, UiKitSpanObj.TYPE_SIZE, Integer.valueOf(this.f29901f.size()));
        this.f29902g = GlobalAppRuntimeInfo.isTargetProcess() ? 0 : -1;
        if (this.f29899c == null) {
            this.f29899c = new ConcurrentHashMap();
        }
    }

    void a(String str, IConnStrategy iConnStrategy, ConnEvent connEvent) {
        StrategyCollection strategyCollection;
        if (ALog.isPrintLog(1)) {
            ALog.d("awcn.StrategyTable", "[notifyConnEvent]", null, "Host", str, "IConnStrategy", iConnStrategy, "ConnEvent", connEvent);
        }
        String str2 = iConnStrategy.getProtocol().protocol;
        if (ConnType.HTTP3.equals(str2) || ConnType.HTTP3_PLAIN.equals(str2)) {
            anet.channel.e.a.a(connEvent.isSuccess);
            ALog.e("awcn.StrategyTable", "enable http3", null, "uniqueId", this.f29897a, "enable", Boolean.valueOf(connEvent.isSuccess));
        }
        if (!connEvent.isSuccess && anet.channel.strategy.utils.c.b(iConnStrategy.getIp())) {
            this.f29899c.put(str, Long.valueOf(System.currentTimeMillis()));
            ALog.e("awcn.StrategyTable", "disable ipv6", null, "uniqueId", this.f29897a, "host", str);
        }
        synchronized (this.f29901f) {
            strategyCollection = this.f29901f.get(str);
        }
        if (strategyCollection != null) {
            strategyCollection.notifyConnEvent(iConnStrategy, connEvent);
        }
    }

    protected void a(String str, boolean z10) {
        StrategyCollection strategyCollection;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f29901f) {
            strategyCollection = this.f29901f.get(str);
            if (strategyCollection == null) {
                strategyCollection = new StrategyCollection(str);
                this.f29901f.put(str, strategyCollection);
            }
        }
        if (z10 || strategyCollection.f29876b == 0 || (strategyCollection.isExpired() && AmdcRuntimeInfo.getAmdcLimitLevel() == 0)) {
            a(str);
        }
    }

    boolean a(String str, long j10) {
        Long l10 = this.f29899c.get(str);
        if (l10 == null) {
            return false;
        }
        if (l10.longValue() + j10 >= System.currentTimeMillis()) {
            return true;
        }
        this.f29899c.remove(str);
        return false;
    }

    public String getCnameByHost(String str) {
        StrategyCollection strategyCollection;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f29901f) {
            strategyCollection = this.f29901f.get(str);
        }
        if (strategyCollection != null && strategyCollection.isExpired() && AmdcRuntimeInfo.getAmdcLimitLevel() == 0) {
            a(str);
        }
        if (strategyCollection != null) {
            return strategyCollection.f29877c;
        }
        return null;
    }

    public List<IConnStrategy> queryByHost(String str) {
        StrategyCollection strategyCollection;
        if (TextUtils.isEmpty(str) || !anet.channel.strategy.utils.c.c(str)) {
            return Collections.EMPTY_LIST;
        }
        c();
        synchronized (this.f29901f) {
            strategyCollection = this.f29901f.get(str);
            if (strategyCollection == null) {
                strategyCollection = new StrategyCollection(str);
                this.f29901f.put(str, strategyCollection);
            }
        }
        if (strategyCollection.f29876b == 0 || (strategyCollection.isExpired() && AmdcRuntimeInfo.getAmdcLimitLevel() == 0)) {
            a(str);
        }
        return strategyCollection.queryStrategyList();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0056 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void update(anet.channel.strategy.l.d r8) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.strategy.StrategyTable.update(anet.channel.strategy.l$d):void");
    }
}
