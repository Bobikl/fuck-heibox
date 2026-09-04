package anet.channel.strategy;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f29928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ StrategyInfoHolder f29929b;

    e(StrategyInfoHolder strategyInfoHolder, String str) {
        this.f29929b = strategyInfoHolder;
        this.f29928a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f29929b.a(this.f29928a, true);
    }
}
