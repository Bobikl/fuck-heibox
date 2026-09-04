package anetwork.channel.entity;

import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import anet.channel.util.Utils;
import anetwork.channel.aidl.ParcelableRequest;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ParcelableRequest f30239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Request f30240b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f30242d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RequestStatistic f30244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f30245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f30246h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f30247i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f30248j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f30249k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30241c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30243e = 0;

    public k(ParcelableRequest parcelableRequest, int i10, boolean z10) {
        this.f30240b = null;
        this.f30242d = 0;
        if (parcelableRequest == null) {
            throw new IllegalArgumentException("request is null");
        }
        this.f30239a = parcelableRequest;
        this.f30248j = i10;
        this.f30249k = z10;
        this.f30247i = w3.b.a(parcelableRequest.f30057n, i10 == 0 ? "HTTP" : "DGRD");
        int i11 = parcelableRequest.f30054k;
        this.f30245g = i11 <= 0 ? (int) (Utils.getNetworkTimeFactor() * 12000.0f) : i11;
        int i12 = parcelableRequest.f30055l;
        this.f30246h = i12 <= 0 ? (int) (Utils.getNetworkTimeFactor() * 12000.0f) : i12;
        int i13 = parcelableRequest.f30047d;
        this.f30242d = (i13 < 0 || i13 > 3) ? 2 : i13;
        HttpUrl httpUrlQ = q();
        RequestStatistic requestStatistic = new RequestStatistic(httpUrlQ.host(), String.valueOf(parcelableRequest.f30056m));
        this.f30244f = requestStatistic;
        requestStatistic.url = httpUrlQ.simpleUrlString();
        this.f30240b = f(httpUrlQ);
    }

    private Request f(HttpUrl httpUrl) {
        Request.Builder requestStatistic = new Request.Builder().setUrl(httpUrl).setMethod(this.f30239a.f30051h).setBody(this.f30239a.f30046c).setReadTimeout(this.f30246h).setConnectTimeout(this.f30245g).setRedirectEnable(this.f30239a.f30050g).setRedirectTimes(this.f30241c).setBizId(this.f30239a.f30056m).setSeq(this.f30247i).setRequestStatistic(this.f30244f);
        requestStatistic.setParams(this.f30239a.f30053j);
        String str = this.f30239a.f30049f;
        if (str != null) {
            requestStatistic.setCharset(str);
        }
        requestStatistic.setHeaders(g(httpUrl));
        return requestStatistic.build();
    }

    private Map<String, String> g(HttpUrl httpUrl) {
        String strHost = httpUrl.host();
        boolean z10 = !anet.channel.strategy.utils.c.a(strHost);
        if (strHost.length() > 2 && strHost.charAt(0) == '[' && strHost.charAt(strHost.length() - 1) == ']' && anet.channel.strategy.utils.c.b(strHost.substring(1, strHost.length() - 1))) {
            z10 = false;
        }
        HashMap map = new HashMap();
        Map<String, String> map2 = this.f30239a.f30052i;
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                String key = entry.getKey();
                if (!"Host".equalsIgnoreCase(key) && !":host".equalsIgnoreCase(key)) {
                    boolean zEqualsIgnoreCase = "true".equalsIgnoreCase(this.f30239a.a(w3.a.f140969e));
                    if (!"Cookie".equalsIgnoreCase(key) || zEqualsIgnoreCase) {
                        map.put(key, entry.getValue());
                    }
                } else if (!z10) {
                    map.put("Host", entry.getValue());
                }
            }
        }
        return map;
    }

    private HttpUrl q() {
        HttpUrl httpUrl = HttpUrl.parse(this.f30239a.f30048e);
        if (httpUrl == null) {
            throw new IllegalArgumentException("url is invalid. url=" + this.f30239a.f30048e);
        }
        if (!t3.b.t()) {
            ALog.i("anet.RequestConfig", "request ssl disabled.", this.f30247i, new Object[0]);
            httpUrl.downgradeSchemeAndLock();
        } else if ("false".equalsIgnoreCase(this.f30239a.a(w3.a.f140970f))) {
            httpUrl.lockScheme();
        }
        return httpUrl;
    }

    public Request a() {
        return this.f30240b;
    }

    public String b(String str) {
        return this.f30239a.a(str);
    }

    public void c(Request request) {
        this.f30240b = request;
    }

    public void d(HttpUrl httpUrl) {
        ALog.i("anet.RequestConfig", "redirect", this.f30247i, "to url", httpUrl.toString());
        this.f30241c++;
        this.f30244f.url = httpUrl.simpleUrlString();
        this.f30240b = f(httpUrl);
    }

    public int e() {
        return this.f30246h * (this.f30242d + 1);
    }

    public boolean h() {
        return this.f30249k;
    }

    public boolean i() {
        return this.f30243e < this.f30242d;
    }

    public boolean j() {
        return t3.b.o() && !"false".equalsIgnoreCase(this.f30239a.a(w3.a.f140971g)) && (t3.b.f() || this.f30243e == 0);
    }

    public HttpUrl k() {
        return this.f30240b.getHttpUrl();
    }

    public String l() {
        return this.f30240b.getUrlString();
    }

    public Map<String, String> m() {
        return this.f30240b.getHeaders();
    }

    public boolean n() {
        return !"false".equalsIgnoreCase(this.f30239a.a(w3.a.f140968d));
    }

    public boolean o() {
        return "true".equals(this.f30239a.a(w3.a.f140972h));
    }

    public void p() {
        int i10 = this.f30243e + 1;
        this.f30243e = i10;
        this.f30244f.retryTimes = i10;
    }
}
