package anet.channel.strategy;

import android.text.TextUtils;
import java.io.Serializable;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class IPConnStrategy implements IConnStrategy, Serializable {
    public static final int SOURCE_AMDC = 0;
    public static final int SOURCE_CUSTOMIZED = 2;
    public static final int SOURCE_LOCAL_DNS = 1;
    public static final int TYPE_IP_TO_HOST = -1;
    public static final int TYPE_NORMAL = 1;
    public static final int TYPE_STATIC_BANDWITDH = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile int f29872a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile int f29873b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient boolean f29874c;
    public volatile int cto;
    public volatile int heartbeat;
    public final String ip;
    public final int port;
    public final ConnProtocol protocol;
    public volatile int retry;
    public volatile int rto;

    private IPConnStrategy(String str, int i10, ConnProtocol connProtocol, int i11, int i12, int i13, int i14) {
        this.ip = str;
        this.port = i10;
        this.protocol = connProtocol;
        this.cto = i11;
        this.rto = i12;
        this.retry = i13;
        this.heartbeat = i14;
    }

    static IPConnStrategy a(String str, int i10, ConnProtocol connProtocol, int i11, int i12, int i13, int i14) {
        if (TextUtils.isEmpty(str) || connProtocol == null || i10 <= 0) {
            return null;
        }
        return new IPConnStrategy(str, i10, connProtocol, i11, i12, i13, i14);
    }

    static IPConnStrategy a(String str, l.a aVar) {
        ConnProtocol connProtocolValueOf = ConnProtocol.valueOf(aVar);
        if (connProtocolValueOf == null) {
            return null;
        }
        return a(str, aVar.f29944a, connProtocolValueOf, aVar.f29946c, aVar.f29947d, aVar.f29948e, aVar.f29949f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IPConnStrategy)) {
            return false;
        }
        IPConnStrategy iPConnStrategy = (IPConnStrategy) obj;
        return this.port == iPConnStrategy.port && this.ip.equals(iPConnStrategy.ip) && this.protocol.equals(iPConnStrategy.protocol);
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getConnectionTimeout() {
        return this.cto;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getHeartbeat() {
        return this.heartbeat;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public String getIp() {
        return this.ip;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpSource() {
        return this.f29873b;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpType() {
        return this.f29872a;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getPort() {
        return this.port;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public ConnProtocol getProtocol() {
        return this.protocol;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getReadTimeout() {
        return this.rto;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getRetryTimes() {
        return this.retry;
    }

    public int getUniqueId() {
        return hashCode();
    }

    public int hashCode() {
        return ((((bb.c.b.f30674h7 + this.ip.hashCode()) * 31) + this.port) * 31) + this.protocol.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append('{');
        sb2.append(this.ip);
        if (this.f29872a == 0) {
            sb2.append("(*)");
        }
        sb2.append(' ');
        sb2.append(this.port);
        sb2.append(' ');
        sb2.append(this.protocol);
        sb2.append('}');
        return sb2.toString();
    }
}
