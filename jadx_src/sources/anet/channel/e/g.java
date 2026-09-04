package anet.channel.e;

import anet.channel.entity.ConnType;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IConnStrategy;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public final class g implements IConnStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ IConnStrategy f29691a;

    g(IConnStrategy iConnStrategy) {
        this.f29691a = iConnStrategy;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getConnectionTimeout() {
        return this.f29691a.getConnectionTimeout();
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getHeartbeat() {
        return this.f29691a.getHeartbeat();
    }

    @Override // anet.channel.strategy.IConnStrategy
    public String getIp() {
        return this.f29691a.getIp();
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpSource() {
        return this.f29691a.getIpSource();
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpType() {
        return this.f29691a.getIpType();
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getPort() {
        return this.f29691a.getPort();
    }

    @Override // anet.channel.strategy.IConnStrategy
    public ConnProtocol getProtocol() {
        this.f29691a.getProtocol();
        return ConnProtocol.valueOf(ConnType.HTTP3_1RTT, null, null);
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getReadTimeout() {
        return this.f29691a.getReadTimeout();
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getRetryTimes() {
        return this.f29691a.getRetryTimes();
    }
}
