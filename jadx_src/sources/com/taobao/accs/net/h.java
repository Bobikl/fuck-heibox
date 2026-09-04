package com.taobao.accs.net;

import anet.channel.entity.ConnType;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.HttpDispatcher;
import com.taobao.accs.utl.ALog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f98331a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<IConnStrategy> f98332b = new ArrayList();

    public h(String str) {
        HttpDispatcher.getInstance().addListener(new i(this));
        a(str);
    }

    public IConnStrategy a() {
        return a(this.f98332b);
    }

    public IConnStrategy a(List<IConnStrategy> list) {
        if (list == null || list.isEmpty()) {
            ALog.d("HttpDnsProvider", "strategys null or 0", new Object[0]);
            return null;
        }
        int i10 = this.f98331a;
        if (i10 < 0 || i10 >= list.size()) {
            this.f98331a = 0;
        }
        return list.get(this.f98331a);
    }

    public List<IConnStrategy> a(String str) {
        List<IConnStrategy> connStrategyListByHost;
        if ((this.f98331a == 0 || this.f98332b.isEmpty()) && (connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str)) != null && !connStrategyListByHost.isEmpty()) {
            this.f98332b.clear();
            for (IConnStrategy iConnStrategy : connStrategyListByHost) {
                ConnType connTypeValueOf = ConnType.valueOf(iConnStrategy.getProtocol());
                if (connTypeValueOf.getTypeLevel() == ConnType.TypeLevel.SPDY && connTypeValueOf.isSSL()) {
                    this.f98332b.add(iConnStrategy);
                }
            }
        }
        return this.f98332b;
    }

    public void b() {
        this.f98331a++;
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d("HttpDnsProvider", "updateStrategyPos StrategyPos:" + this.f98331a, new Object[0]);
        }
    }

    public void b(String str) {
        StrategyCenter.getInstance().forceRefreshStrategy(str);
    }

    public int c() {
        return this.f98331a;
    }
}
