package w;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: compiled from: AttaHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f140892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f140893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f140894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f140895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f140896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f140897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f140898h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f140899i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f140900j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f140901k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f140902l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f140903m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f140904n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f140905o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f140906p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f140907q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f140908r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f140909s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f140910t;

    public a(String str, String str2, String str3, String str4, String str5, String str6, long j10, String str7, long j11, long j12, String str8, String str9, long j13, long j14, int i10, boolean z10, int i11, String str10, String str11) {
        this.f140892b = str;
        this.f140893c = str2;
        this.f140894d = str3;
        this.f140895e = str4;
        this.f140896f = str5;
        this.f140897g = str6;
        this.f140898h = j10;
        this.f140899i = str7;
        this.f140900j = j11;
        this.f140901k = j12;
        this.f140902l = str8;
        this.f140903m = str9;
        this.f140904n = j13;
        this.f140905o = j14;
        this.f140906p = i10;
        this.f140907q = z10;
        this.f140908r = i11;
        this.f140909s = str10;
        this.f140910t = str11;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x015f  */
    @Override // java.lang.Runnable
    public void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        Throwable th2;
        IOException e10;
        try {
            URL url = new URL("https://h.trace.qq.com/kv?attaid=0f500064192&token=4725229671&carrier=" + this.f140892b + "&networkType=" + this.f140893c + "&dnsId=" + this.f140894d + "&appId=" + this.f140895e + "&encryptType=" + this.f140896f + "&eventName=" + this.f140897g + "&eventTime=" + this.f140898h + "&dnsIp=" + this.f140899i + "&sdkVersion=4.9.0a&deviceName=" + b.f140911a + "&systemName=Android&systemVersion=" + b.f140912b + "&spend=" + this.f140900j + "&ldns_spend=" + this.f140901k + "&req_dn=" + this.f140902l + "&req_type=" + this.f140903m + "&req_timeout=" + this.f140904n + "&req_query=&req_ttl=0&errorCode=" + this.f140905o + "&statusCode=" + this.f140906p + "&sessionId=" + b.f140913c + "&isCache=" + (this.f140907q ? 1 : 0) + "&count=" + this.f140908r + "&ldns=" + this.f140909s + "&hdns=" + this.f140910t + "&_dc=" + Math.random());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("开始Atta上报：");
            sb2.append(url);
            f.b.b(sb2.toString(), new Object[0]);
            httpURLConnection = (HttpURLConnection) url.openConnection();
            try {
                try {
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setConnectTimeout(2000);
                    httpURLConnection.setReadTimeout(2000);
                    httpURLConnection.connect();
                    httpURLConnection.disconnect();
                    f.b.b("Atta上报关闭", new Object[0]);
                } catch (IOException e11) {
                    e10 = e11;
                    e10.printStackTrace();
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                        f.b.b("Atta上报关闭", new Object[0]);
                    }
                }
            } catch (Throwable th3) {
                th2 = th3;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    f.b.b("Atta上报关闭", new Object[0]);
                }
                throw th2;
            }
        } catch (IOException e12) {
            httpURLConnection = null;
            e10 = e12;
        } catch (Throwable th4) {
            httpURLConnection = null;
            th2 = th4;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
                f.b.b("Atta上报关闭", new Object[0]);
            }
            throw th2;
        }
    }
}
