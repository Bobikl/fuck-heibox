package anetwork.channel.statist;

import anet.channel.statist.RequestStatistic;
import anet.channel.util.StringUtils;
import java.io.Serializable;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class StatisticData implements Serializable, Cloneable {
    private static final long serialVersionUID = -3538602124202475612L;
    public int G;

    @Deprecated
    public int H;
    public String I;

    @Deprecated
    public String J;
    public String K;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30263b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f30264c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f30265d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f30266e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public String f30267f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f30268g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public boolean f30269h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f30270i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public int f30271j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public int f30272k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public long f30273l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public long f30274m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f30275n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f30276o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    public long f30277p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    public long f30278q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f30279r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    public long f30280s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f30281t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f30282u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f30283v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f30284w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Deprecated
    public long f30285x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f30286y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f30287z = 0;

    @Deprecated
    public long A = 0;
    public long B = 0;
    public long C = 0;

    @Deprecated
    public long D = 0;
    public long E = 0;

    @Deprecated
    public String F = "";

    public void a(RequestStatistic requestStatistic) {
        if (requestStatistic != null) {
            this.f30265d = requestStatistic.statusCode;
            this.f30263b = requestStatistic.protocolType;
            this.f30264c = requestStatistic.ret == 1;
            this.f30266e = requestStatistic.host;
            if (requestStatistic.ip != null && requestStatistic.port != 0) {
                this.f30268g = String.format("%s:%d", requestStatistic.ip, Integer.valueOf(requestStatistic.port));
            }
            this.G = requestStatistic.retryTimes;
            this.f30270i = requestStatistic.isSSL;
            this.f30275n = requestStatistic.oneWayTime;
            this.f30276o = requestStatistic.cacheTime;
            this.f30281t = requestStatistic.processTime;
            this.f30282u = requestStatistic.sendBeforeTime;
            this.f30283v = requestStatistic.firstDataTime;
            this.f30284w = requestStatistic.recDataTime;
            this.B = requestStatistic.sendDataSize;
            this.C = requestStatistic.recDataSize;
            this.f30286y = requestStatistic.serverRT;
            long j10 = this.f30284w;
            this.E = j10 != 0 ? this.C / j10 : this.C;
            this.K = requestStatistic.locationUrl;
        }
    }

    public String b() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("isSuccess=");
        sb2.append(this.f30264c);
        sb2.append(",host=");
        sb2.append(this.f30266e);
        sb2.append(",resultCode=");
        sb2.append(this.f30265d);
        sb2.append(",connType=");
        sb2.append(this.f30263b);
        sb2.append(",oneWayTime_ANet=");
        sb2.append(this.f30275n);
        sb2.append(",ip_port=");
        sb2.append(this.f30268g);
        sb2.append(",isSSL=");
        sb2.append(this.f30270i);
        sb2.append(",cacheTime=");
        sb2.append(this.f30276o);
        sb2.append(",processTime=");
        sb2.append(this.f30281t);
        sb2.append(",sendBeforeTime=");
        sb2.append(this.f30282u);
        sb2.append(",postBodyTime=");
        sb2.append(this.f30279r);
        sb2.append(",firstDataTime=");
        sb2.append(this.f30283v);
        sb2.append(",recDataTime=");
        sb2.append(this.f30284w);
        sb2.append(",serverRT=");
        sb2.append(this.f30286y);
        sb2.append(",rtt=");
        sb2.append(this.f30287z);
        sb2.append(",sendSize=");
        sb2.append(this.B);
        sb2.append(",totalSize=");
        sb2.append(this.C);
        sb2.append(",dataSpeed=");
        sb2.append(this.E);
        sb2.append(",retryTime=");
        sb2.append(this.G);
        return sb2.toString();
    }

    public String toString() {
        if (StringUtils.isBlank(this.I)) {
            this.I = b();
        }
        return "StatisticData [" + this.I + "]";
    }
}
