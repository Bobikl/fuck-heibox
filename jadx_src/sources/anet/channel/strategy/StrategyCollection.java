package anet.channel.strategy;

import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.PolicyVersionStat;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.ALog;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import okhttp3.t;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class StrategyCollection implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f29875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile long f29876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile String f29877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f29878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f29879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private StrategyList f29880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient long f29881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient boolean f29882h;

    public StrategyCollection() {
        this.f29880f = null;
        this.f29876b = 0L;
        this.f29877c = null;
        this.f29878d = false;
        this.f29879e = 0;
        this.f29881g = 0L;
        this.f29882h = true;
    }

    protected StrategyCollection(String str) {
        this.f29880f = null;
        this.f29876b = 0L;
        this.f29877c = null;
        this.f29878d = false;
        this.f29879e = 0;
        this.f29881g = 0L;
        this.f29882h = true;
        this.f29875a = str;
        this.f29878d = DispatchConstants.isAmdcServerDomain(str);
    }

    public synchronized void checkInit() {
        if (System.currentTimeMillis() - this.f29876b > 172800000) {
            this.f29880f = null;
            return;
        }
        StrategyList strategyList = this.f29880f;
        if (strategyList != null) {
            strategyList.checkInit();
        }
    }

    public boolean isExpired() {
        return System.currentTimeMillis() > this.f29876b;
    }

    public synchronized void notifyConnEvent(IConnStrategy iConnStrategy, ConnEvent connEvent) {
        StrategyList strategyList = this.f29880f;
        if (strategyList != null) {
            strategyList.notifyConnEvent(iConnStrategy, connEvent);
            if (!connEvent.isSuccess && this.f29880f.shouldRefresh()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.f29881g > 60000) {
                    StrategyCenter.getInstance().forceRefreshStrategy(this.f29875a);
                    this.f29881g = jCurrentTimeMillis;
                }
            }
        }
    }

    public synchronized List<IConnStrategy> queryStrategyList() {
        if (this.f29880f == null) {
            return Collections.EMPTY_LIST;
        }
        if (this.f29882h) {
            this.f29882h = false;
            PolicyVersionStat policyVersionStat = new PolicyVersionStat(this.f29875a, this.f29879e);
            policyVersionStat.reportType = 0;
            AppMonitor.getInstance().commitStat(policyVersionStat);
        }
        return this.f29880f.getStrategyList();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("\nStrategyList = ");
        sb2.append(this.f29876b);
        StrategyList strategyList = this.f29880f;
        if (strategyList != null) {
            sb2.append(strategyList.toString());
        } else if (this.f29877c != null) {
            sb2.append('[');
            sb2.append(this.f29875a);
            sb2.append("=>");
            sb2.append(this.f29877c);
            sb2.append(']');
        } else {
            sb2.append(t.f132643o);
        }
        return sb2.toString();
    }

    public synchronized void update(l.b bVar) {
        l.e[] eVarArr;
        l.a[] aVarArr;
        this.f29876b = System.currentTimeMillis() + (((long) bVar.f29953b) * 1000);
        if (!bVar.f29952a.equalsIgnoreCase(this.f29875a)) {
            ALog.e("StrategyCollection", "update error!", null, "host", this.f29875a, "dnsInfo.host", bVar.f29952a);
            return;
        }
        int i10 = this.f29879e;
        int i11 = bVar.f29963l;
        if (i10 != i11) {
            this.f29879e = i11;
            PolicyVersionStat policyVersionStat = new PolicyVersionStat(this.f29875a, i11);
            policyVersionStat.reportType = 1;
            AppMonitor.getInstance().commitStat(policyVersionStat);
        }
        this.f29877c = bVar.f29955d;
        String[] strArr = bVar.f29957f;
        if ((strArr != null && strArr.length != 0 && (aVarArr = bVar.f29959h) != null && aVarArr.length != 0) || ((eVarArr = bVar.f29960i) != null && eVarArr.length != 0)) {
            if (this.f29880f == null) {
                this.f29880f = new StrategyList();
            }
            this.f29880f.update(bVar);
            return;
        }
        this.f29880f = null;
    }
}
