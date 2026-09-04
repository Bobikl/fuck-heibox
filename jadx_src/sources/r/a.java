package r;

import android.text.TextUtils;
import com.tencent.msdk.dns.core.LookupResult;
import com.tencent.msdk.dns.core.rest.share.AbsRestDns;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import k.g;
import k.k;
import k.m;

/* JADX INFO: compiled from: AbsHttpDns.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends AbsRestDns {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f138686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k.e f138687c;

    /* JADX INFO: renamed from: r.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbsHttpDns.java */
    public class C1258a extends AbsRestDns.a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public SocketChannel f138688i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public SocketAddress f138689j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public ByteBuffer f138690k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public StringBuilder f138691l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public ByteBuffer f138692m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final g.b.a f138693n;

        /* JADX INFO: renamed from: r.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AbsHttpDns.java */
        public class C1259a extends AbsRestDns.a.C0974a {
            public C1259a() {
                super();
            }

            @Override // com.tencent.msdk.dns.core.rest.share.AbsRestDns.a.C0974a
            public boolean a() {
                SocketChannel socketChannel = C1258a.this.f138688i;
                if (socketChannel != null) {
                    return socketChannel.isConnected() && super.a();
                }
                return super.a();
            }

            @Override // com.tencent.msdk.dns.core.rest.share.AbsRestDns.a.C0974a
            public boolean b() {
                if (C1258a.this.f138688i == null) {
                    return super.b();
                }
                f.b.b(a.this.g() + ", channel isConnected:" + C1258a.this.f138688i.isConnected() + ", writable:" + super.b(), new Object[0]);
                return C1258a.this.f138688i.isConnected() && super.b();
            }

            public boolean c() {
                SocketChannel socketChannel = C1258a.this.f138688i;
                if (socketChannel != null) {
                    try {
                        if (socketChannel.isConnected()) {
                            return true;
                        }
                        boolean zFinishConnect = C1258a.this.f138688i.finishConnect();
                        if (zFinishConnect) {
                            f.b.b(a.this.g() + "tryFinishConnect connect success", new Object[0]);
                            C1258a.this.f100958d.interestOps(5);
                        }
                        return zFinishConnect;
                    } catch (Exception e10) {
                        f.b.a(3, e10, a.this.g() + "tryFinishConnect connect failed", new Object[0]);
                        C1258a.this.b();
                        AbsRestDns.Statistics statistics = C1258a.this.f100959e;
                        statistics.errorCode = bb.c.l.f34236jk;
                        statistics.errorMsg = e10.getMessage();
                    }
                }
                return false;
            }
        }

        public C1258a(k<e> kVar, g gVar, AbsRestDns.a aVar) {
            super(kVar, gVar, aVar);
            this.f138688i = null;
            this.f138689j = null;
            this.f138690k = null;
            this.f138691l = null;
            this.f138692m = null;
            this.f138693n = new C1259a();
            if (3 == this.f100955a) {
                return;
            }
            Selector selectorL = this.f100956b.l();
            if (selectorL == null) {
                throw new IllegalArgumentException("selector".concat(" can not be null"));
            }
            try {
                try {
                    this.f138688i = SocketChannel.open();
                    f.b.b(a.this.g() + "%s opened", this.f138688i);
                    try {
                        this.f138688i.configureBlocking(false);
                        try {
                            SelectionKey selectionKeyRegister = this.f138688i.register(selectorL, 13);
                            this.f100958d = selectionKeyRegister;
                            selectionKeyRegister.attach(this.f138688i);
                            this.f100955a = 1;
                            SocketAddress socketAddressE = a.this.e(this.f100956b.g(), a.this.f138686b);
                            this.f138689j = socketAddressE;
                            if (socketAddressE == null) {
                                f.b.b(a.this.g() + "get target socket address failed", new Object[0]);
                                this.f100959e.errorCode = 1006;
                                b();
                            }
                        } catch (Exception e10) {
                            AbsRestDns.Statistics statistics = this.f100959e;
                            statistics.errorCode = 1005;
                            statistics.errorMsg = e10.getMessage();
                            throw e10;
                        }
                    } catch (Exception e11) {
                        AbsRestDns.Statistics statistics2 = this.f100959e;
                        statistics2.errorCode = 1004;
                        statistics2.errorMsg = e11.getMessage();
                        throw e11;
                    }
                } catch (Exception e12) {
                    AbsRestDns.Statistics statistics3 = this.f100959e;
                    statistics3.errorCode = 1001;
                    statistics3.errorMsg = e12.getMessage();
                    throw e12;
                }
            } catch (Exception e13) {
                f.b.c(e13, a.this.g() + "create socket channel failed", new Object[0]);
                b();
            }
        }

        @Override // k.g.b
        public g.b.a d() {
            return this.f138693n;
        }

        @Override // com.tencent.msdk.dns.core.rest.share.AbsRestDns.a
        public int j() {
            try {
                f.b.b(a.this.g() + "connect start", new Object[0]);
                this.f138688i.connect(this.f138689j);
                return 0;
            } catch (Exception e10) {
                f.b.a(3, e10, a.this.g() + "connect failed", new Object[0]);
                b();
                AbsRestDns.Statistics statistics = this.f100959e;
                statistics.errorCode = bb.c.l.f34236jk;
                statistics.errorMsg = e10.getMessage();
                return 1;
            }
        }

        @Override // com.tencent.msdk.dns.core.rest.share.AbsRestDns.a
        public AbsRestDns.a k() {
            return a.this.new C1258a(this.f100956b, this.f100957c, this);
        }

        @Override // com.tencent.msdk.dns.core.rest.share.AbsRestDns.a
        public void l() {
            b.a.k(this.f138688i);
            this.f138692m = null;
            this.f138690k = null;
            this.f138691l = null;
        }

        @Override // com.tencent.msdk.dns.core.rest.share.AbsRestDns.a
        public int m() {
            String str;
            m<LookupExtra> mVar = this.f100956b.f124382a;
            String strD = a.this.d(mVar.f124396d, mVar.f124407o, (e) mVar.f124397e);
            if (TextUtils.isEmpty(strD)) {
                this.f100959e.errorCode = 1007;
                b();
                return 1;
            }
            if (TextUtils.isEmpty(strD)) {
                throw new IllegalArgumentException("urlStr".concat(" can not be empty"));
            }
            try {
                URL url = new URL(strD);
                String host = url.getHost();
                str = "GET " + url.getFile() + " HTTP/1.1\r\nConnection: keep-alive\r\nHost: " + host + "\r\n\r\n";
            } catch (MalformedURLException unused) {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                this.f100959e.errorCode = 1008;
                b();
                return 1;
            }
            try {
                f.b.f(a.this.g() + "send httpReq:{\n%s}", str);
                f.b.b(a.this.g() + "lookup send byUrl: %s", strD);
                if (this.f138692m == null) {
                    this.f138692m = ByteBuffer.wrap(str.getBytes("UTF-8"));
                }
                ByteBuffer byteBuffer = this.f138692m;
                int i10 = 0;
                while (byteBuffer.hasRemaining()) {
                    int iWrite = this.f138688i.write(byteBuffer);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(a.this.g());
                    sb2.append("send request count:");
                    i10++;
                    sb2.append(i10);
                    sb2.append(", res:");
                    sb2.append(iWrite);
                    f.b.b(sb2.toString(), new Object[0]);
                    if (iWrite <= 0) {
                        break;
                    }
                }
                if (byteBuffer.hasRemaining()) {
                    f.b.b(a.this.g() + "send request has remaining, try again", new Object[0]);
                    return 2;
                }
                this.f138692m = null;
                this.f100958d.interestOps(1);
                f.b.b(a.this.g() + "send request finish", new Object[0]);
                return 0;
            } catch (Exception e10) {
                f.b.a(3, e10, a.this.g() + "send request failed, for exception", new Object[0]);
                b();
                AbsRestDns.Statistics statistics = this.f100959e;
                statistics.errorCode = 21001;
                statistics.errorMsg = e10.getMessage();
                return 1;
            }
        }

        @Override // com.tencent.msdk.dns.core.rest.share.AbsRestDns.a
        public s.a n() {
            int iLimit;
            int i10;
            f.b.b(a.this.g() + "receive responseInternal call", new Object[0]);
            e eVar = (e) this.f100956b.f124382a.f124397e;
            if (this.f138690k == null) {
                this.f138690k = ByteBuffer.allocate(1024);
            }
            if (this.f138691l == null) {
                this.f138691l = new StringBuilder();
            }
            ByteBuffer byteBuffer = this.f138690k;
            StringBuilder sb2 = this.f138691l;
            int i11 = 0;
            do {
                try {
                    iLimit = this.f138688i.read(byteBuffer);
                    f.b.b(a.this.g() + "receive response get len:%d, lastLen:%d", Integer.valueOf(iLimit), Integer.valueOf(i11));
                    if (iLimit > 0) {
                        i11 += iLimit;
                        byteBuffer.flip();
                        iLimit = byteBuffer.limit();
                        byte[] bArr = new byte[iLimit];
                        byteBuffer.get(bArr, 0, iLimit);
                        String str = new String(bArr, Charset.forName("UTF-8"));
                        sb2.append(str);
                        if (b.a.p(str)) {
                            f.b.b(a.this.g() + "receive response check http rsp finished:%d, so break", Integer.valueOf(iLimit));
                            break;
                        }
                        byteBuffer.clear();
                    } else if (iLimit == 0) {
                        f.b.b(a.this.g() + "receive response get len:0, and break", new Object[0]);
                        break;
                    }
                } catch (Exception e10) {
                    f.b.a(3, e10, a.this.g() + "receive response failed, for exception", new Object[0]);
                    AbsRestDns.Statistics statistics = this.f100959e;
                    statistics.isGetEmptyResponse = true;
                    statistics.errorCode = 31002;
                    statistics.errorMsg = e10.getMessage();
                    return s.a.f139140e;
                }
            } while (iLimit >= 0);
            f.b.b(a.this.g() + "receive response get total len:%d", Integer.valueOf(i11));
            String string = sb2.toString();
            AbsRestDns.Statistics statistics2 = this.f100959e;
            try {
                i10 = Integer.parseInt(string.substring(9, 12));
            } catch (Exception unused) {
                i10 = 0;
            }
            statistics2.statusCode = i10;
            f.b.f(a.this.g() + "receive rspHttpRsp:{\n%s}", string);
            if (iLimit == 0) {
                f.b.b(a.this.g() + "receive response failed, need continue, for total len:%d", Integer.valueOf(i11));
                this.f100959e.errorCode = 31001;
                return s.a.f139141f;
            }
            if (i11 <= 0) {
                f.b.b(a.this.g() + "receive response failed, for total len:%d", Integer.valueOf(i11));
                AbsRestDns.Statistics statistics3 = this.f100959e;
                statistics3.isGetEmptyResponse = true;
                statistics3.errorCode = 31002;
                return s.a.f139140e;
            }
            if (TextUtils.isEmpty(string)) {
                throw new IllegalArgumentException("rawRsp".concat(" can not be empty"));
            }
            String[] strArrSplit = string.split("\r\n\r\n");
            String str2 = (2 == strArrSplit.length && strArrSplit[0].contains("OK")) ? strArrSplit[1] : "";
            String strC = a.this.c(str2, eVar.f138704c);
            f.b.b(a.this.g() + "receive rawLen:%d, raw:[%s], rsp body content:[%s]", Integer.valueOf(i11), str2, strC);
            if (TextUtils.isEmpty(strC)) {
                AbsRestDns.Statistics statistics4 = this.f100959e;
                statistics4.isGetEmptyResponse = true;
                statistics4.errorCode = 41001;
                return s.a.f139140e;
            }
            s.a aVarA = s.b.a(a.this.f138686b, strC);
            if (aVarA.f139143b.length == 0) {
                f.b.b(a.this.g() + "receive success, but no record", new Object[0]);
                AbsRestDns.Statistics statistics5 = this.f100959e;
                statistics5.isGetEmptyResponse = true;
                statistics5.errorCode = 3;
            } else {
                this.f100959e.errorCode = 0;
            }
            return aVarA;
        }
    }

    public a(int i10) {
        this.f138686b = i10;
        this.f138687c = new k.e(f(), i10);
    }

    @Override // k.g
    public LookupResult a(m<e> mVar) throws Throwable {
        if (mVar == null) {
            throw new IllegalArgumentException("lookupParams".concat(" can not be null"));
        }
        String str = mVar.f124407o;
        int i10 = mVar.f124395c;
        String str2 = mVar.f124396d;
        e eVar = (e) mVar.f124397e;
        AbsRestDns.Statistics statistics = new AbsRestDns.Statistics();
        statistics.retryTimes = mVar.f124405m;
        statistics.asyncLookup = mVar.f124404l;
        statistics.netChangeLookup = mVar.f124406n;
        statistics.startLookup();
        if (a(mVar, statistics)) {
            statistics.endLookup();
            return new LookupResult(statistics.ips, statistics);
        }
        BufferedReader bufferedReader = null;
        try {
            try {
                String strD = d(str2, str, eVar);
                if (TextUtils.isEmpty(strD)) {
                    statistics.errorCode = 1007;
                    LookupResult lookupResult = new LookupResult(statistics.ips, statistics);
                    b.a.k(null);
                    statistics.endLookup();
                    return lookupResult;
                }
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strD).openConnection();
                    httpURLConnection.setConnectTimeout(i10);
                    httpURLConnection.setReadTimeout(i10);
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    String str3 = "";
                    while (true) {
                        try {
                            try {
                                String line = bufferedReader2.readLine();
                                if (line == null) {
                                    break;
                                }
                                str3 = str3 + (line + '\n');
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader = bufferedReader2;
                                b.a.k(bufferedReader);
                                statistics.endLookup();
                                throw th;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            if (!(e instanceof SocketTimeoutException)) {
                                statistics.errorCode = 31002;
                            }
                            statistics.errorMsg = e.getMessage();
                            statistics.isGetEmptyResponse = true;
                            throw e;
                        }
                    }
                    String strSubstring = str3.length() > 0 ? str3.substring(0, str3.length() - 2) : "";
                    bufferedReader2.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    statistics.statusCode = responseCode;
                    if (responseCode == 401) {
                        try {
                            this.f100954a.b(str);
                        } catch (Exception e11) {
                            e = e11;
                            bufferedReader = bufferedReader2;
                            f.b.a(3, e, g() + "lookup failed", new Object[0]);
                            bufferedReader2 = bufferedReader;
                        }
                    }
                    String strC = c(strSubstring, eVar.f138704c);
                    f.b.b(g() + "lookup byUrl: %s, rsp:[%s]", strD, strC);
                    if (TextUtils.isEmpty(strC)) {
                        statistics.isGetEmptyResponse = true;
                        statistics.errorCode = 41001;
                    }
                    s.a aVarA = s.b.a(this.f138686b, strC);
                    f.b.b(g() + "lookup response: ====> %s", aVarA.toString());
                    if (aVarA == s.a.f139140e) {
                        statistics.isGetEmptyResponse = true;
                        statistics.errorCode = 41002;
                        if (statistics.statusCode == 200) {
                            this.f100954a.b(str);
                        }
                        LookupResult lookupResult2 = new LookupResult(statistics.ips, statistics);
                        b.a.k(bufferedReader2);
                        statistics.endLookup();
                        return lookupResult2;
                    }
                    statistics.clientIp = aVarA.f139142a;
                    statistics.ttl = aVarA.f139144c;
                    String[] strArr = aVarA.f139143b;
                    statistics.ips = strArr;
                    if (strArr.length != 0) {
                        this.f100954a.c(mVar, aVarA);
                        statistics.errorCode = 0;
                        statistics.expiredTime = statistics.getExpiredTime(aVarA.f139144c);
                        b.a.k(bufferedReader2);
                        statistics.endLookup();
                        return new LookupResult(b.a.s(statistics.ips, mVar), statistics);
                    }
                    f.b.b(g() + "receive success, but no record", new Object[0]);
                    statistics.isGetEmptyResponse = true;
                    statistics.errorCode = 3;
                    if (statistics.statusCode == 200) {
                        this.f100954a.b(str);
                    }
                    LookupResult lookupResult3 = new LookupResult(statistics.ips, statistics);
                    b.a.k(bufferedReader2);
                    statistics.endLookup();
                    return lookupResult3;
                } catch (Exception e12) {
                    e = e12;
                }
            } catch (Exception e13) {
                e = e13;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // k.g
    public k.e a() {
        return this.f138687c;
    }

    @Override // k.g
    public g.b a(k<e> kVar) {
        return new C1258a(kVar, this, null);
    }

    public abstract String c(String str, String str2);

    public abstract String d(String str, String str2, e eVar);

    public abstract SocketAddress e(String str, int i10);

    public abstract String f();

    public abstract String g();
}
