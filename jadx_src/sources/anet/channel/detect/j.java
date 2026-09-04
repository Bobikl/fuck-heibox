package anet.channel.detect;

import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IConnStrategy;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public final class j implements IConnStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ anet.channel.strategy.l.e f29660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ConnProtocol f29661b;

    j(anet.channel.strategy.l.e eVar, ConnProtocol connProtocol) {
        this.f29660a = eVar;
        this.f29661b = connProtocol;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getConnectionTimeout() {
        return this.f29660a.f29975b.f29946c;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getHeartbeat() {
        return 0;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public String getIp() {
        return this.f29660a.f29974a;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpSource() {
        return 2;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpType() {
        return 1;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getPort() {
        return this.f29660a.f29975b.f29944a;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public ConnProtocol getProtocol() {
        return this.f29661b;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getReadTimeout() {
        return this.f29660a.f29975b.f29947d;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getRetryTimes() {
        return 0;
    }
}
