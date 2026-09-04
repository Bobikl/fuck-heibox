package anet.channel.entity;

import anet.channel.strategy.IConnStrategy;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IConnStrategy f29692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29693b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29694c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f29695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f29696e;

    public a(String str, String str2, IConnStrategy iConnStrategy) {
        this.f29692a = iConnStrategy;
        this.f29695d = str;
        this.f29696e = str2;
    }

    public String a() {
        IConnStrategy iConnStrategy = this.f29692a;
        if (iConnStrategy != null) {
            return iConnStrategy.getIp();
        }
        return null;
    }

    public int b() {
        IConnStrategy iConnStrategy = this.f29692a;
        if (iConnStrategy != null) {
            return iConnStrategy.getPort();
        }
        return 0;
    }

    public ConnType c() {
        IConnStrategy iConnStrategy = this.f29692a;
        return iConnStrategy != null ? ConnType.valueOf(iConnStrategy.getProtocol()) : ConnType.HTTP;
    }

    public int d() {
        IConnStrategy iConnStrategy = this.f29692a;
        if (iConnStrategy == null || iConnStrategy.getConnectionTimeout() == 0) {
            return 20000;
        }
        return this.f29692a.getConnectionTimeout();
    }

    public int e() {
        IConnStrategy iConnStrategy = this.f29692a;
        if (iConnStrategy == null || iConnStrategy.getReadTimeout() == 0) {
            return 20000;
        }
        return this.f29692a.getReadTimeout();
    }

    public String f() {
        return this.f29695d;
    }

    public int g() {
        IConnStrategy iConnStrategy = this.f29692a;
        if (iConnStrategy != null) {
            return iConnStrategy.getHeartbeat();
        }
        return 45000;
    }

    public String h() {
        return this.f29696e;
    }

    public String toString() {
        return "ConnInfo [ip=" + a() + ",port=" + b() + ",type=" + c() + ",hb" + g() + "]";
    }
}
