package anet.channel.strategy;

import java.util.Comparator;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public final class o implements Comparator<StrategyCollection> {
    o() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(StrategyCollection strategyCollection, StrategyCollection strategyCollection2) {
        return strategyCollection.f29876b != strategyCollection2.f29876b ? (int) (strategyCollection.f29876b - strategyCollection2.f29876b) : strategyCollection.f29875a.compareTo(strategyCollection2.f29875a);
    }
}
