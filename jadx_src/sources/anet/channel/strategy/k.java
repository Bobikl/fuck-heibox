package anet.channel.strategy;

import java.util.Comparator;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class k implements Comparator<IPConnStrategy> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ StrategyList f29943a;

    k(StrategyList strategyList) {
        this.f29943a = strategyList;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(IPConnStrategy iPConnStrategy, IPConnStrategy iPConnStrategy2) {
        int i10;
        int i11;
        ConnHistoryItem connHistoryItem = (ConnHistoryItem) this.f29943a.f29893b.get(Integer.valueOf(iPConnStrategy.getUniqueId()));
        ConnHistoryItem connHistoryItem2 = (ConnHistoryItem) this.f29943a.f29893b.get(Integer.valueOf(iPConnStrategy2.getUniqueId()));
        int iA = connHistoryItem.a();
        int iA2 = connHistoryItem2.a();
        if (iA != iA2) {
            return iA - iA2;
        }
        if (iPConnStrategy.f29872a != iPConnStrategy2.f29872a) {
            i10 = iPConnStrategy.f29872a;
            i11 = iPConnStrategy2.f29872a;
        } else {
            i10 = iPConnStrategy.protocol.isHttp;
            i11 = iPConnStrategy2.protocol.isHttp;
        }
        return i10 - i11;
    }
}
