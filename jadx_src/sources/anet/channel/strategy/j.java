package anet.channel.strategy;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class j implements StrategyList.Predicate<IPConnStrategy> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l.a f29939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f29940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ConnProtocol f29941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ StrategyList f29942d;

    j(StrategyList strategyList, l.a aVar, String str, ConnProtocol connProtocol) {
        this.f29942d = strategyList;
        this.f29939a = aVar;
        this.f29940b = str;
        this.f29941c = connProtocol;
    }

    @Override // anet.channel.strategy.StrategyList.Predicate
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean apply(IPConnStrategy iPConnStrategy) {
        return iPConnStrategy.getPort() == this.f29939a.f29944a && iPConnStrategy.getIp().equals(this.f29940b) && iPConnStrategy.protocol.equals(this.f29941c);
    }
}
