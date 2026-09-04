package anet.channel.strategy;

import anet.channel.statist.StrategyStatObject;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Map.Entry f29930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ StrategyInfoHolder.LruStrategyMap f29931b;

    f(StrategyInfoHolder.LruStrategyMap lruStrategyMap, Map.Entry entry) {
        this.f29931b = lruStrategyMap;
        this.f29930a = entry;
    }

    @Override // java.lang.Runnable
    public void run() {
        StrategyTable strategyTable = (StrategyTable) this.f29930a.getValue();
        if (strategyTable.f29900d) {
            StrategyStatObject strategyStatObject = new StrategyStatObject(1);
            strategyStatObject.writeStrategyFileId = strategyTable.f29897a;
            m.a((Serializable) this.f29930a.getValue(), strategyTable.f29897a, strategyStatObject);
            strategyTable.f29900d = false;
        }
    }
}
