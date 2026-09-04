package anet.channel.strategy;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public interface IConnStrategy {
    int getConnectionTimeout();

    int getHeartbeat();

    String getIp();

    int getIpSource();

    int getIpType();

    int getPort();

    ConnProtocol getProtocol();

    int getReadTimeout();

    int getRetryTimes();
}
