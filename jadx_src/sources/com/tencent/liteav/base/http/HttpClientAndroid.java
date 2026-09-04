package com.tencent.liteav.base.http;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.HttpDnsUtil;
import com.tencent.liteav.base.util.LiteavLog;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PasswordAuthentication;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav")
public class HttpClientAndroid {
    private static final int ERROR_CODE_INVALID_REQUEST = 0;
    private static final String HTTPS_PREFIX = "https://";
    private static final String HTTP_PREFIX = "http://";
    private static final String METHOD_GET = "GET";
    private static final String METHOD_POST = "POST";
    private static final String METHOD_PUT = "PUT";
    private static final int READ_STREAM_SIZE = 8192;
    private static final int REDIRECT_REQUEST_MAX = 3;
    private static final String TAG = "HttpClientAndroid";
    private static final Object mLock = new Object();
    private HttpURLConnection mConnection;
    private b mHttpConfig;
    private final Handler mHttpHandler;
    private String mLastRequestURL;
    private long mNativeHttpClientAndroidJni;
    private final ConcurrentHashMap<Long, d> mRunningRequestMap = new ConcurrentHashMap<>();
    private final Object mLocker = new Object();
    private volatile c mInternalState = c.NONE;
    private long mTotalReadBytes = 0;
    private long mStartReadTime = 0;
    byte[] mReadDataBytes = new byte[8192];
    private boolean mPausedRepeatDownloading = false;
    private g mRepeatDownloadingStatusCode = g.kUnknownError;

    public static final class a extends Authenticator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f99582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f99583b;

        a(String str, String str2) {
            this.f99582a = str;
            this.f99583b = str2;
        }

        @Override // java.net.Authenticator
        protected final PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(this.f99582a, this.f99583b.toCharArray());
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f99584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f99585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f99586c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f99587d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f99588e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f99589f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f99590g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        String f99591h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        String f99592i;

        b(int i10, int i11, int i12, boolean z10, int i13, int i14, String str, String str2, String str3) {
            this.f99584a = i10;
            this.f99585b = i11;
            this.f99586c = i12;
            this.f99587d = z10;
            this.f99588e = i13;
            this.f99589f = i14;
            this.f99590g = str;
            this.f99591h = str2;
            this.f99592i = str3;
        }
    }

    public enum c {
        NONE,
        RUNNING_REPEAT,
        RUNNING_ONCE
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f99597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f99598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f99599c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        byte[] f99600d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Map<String, String> f99601e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f99602f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f99603g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f99604h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        String f99605i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        byte[] f99606j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        byte[] f99607k;

        d(String str, String str2, byte[] bArr, Map<String, String> map, boolean z10) {
            this(str, str2, bArr, map, z10, "", null, null);
        }

        d(String str, String str2, byte[] bArr, Map<String, String> map, boolean z10, String str3, byte[] bArr2, byte[] bArr3) {
            this.f99598b = str;
            this.f99599c = str2;
            this.f99600d = bArr;
            this.f99601e = map;
            this.f99602f = 0;
            this.f99603g = "";
            this.f99604h = z10;
            this.f99605i = str3;
            this.f99606j = bArr2;
            this.f99607k = bArr3;
        }

        final boolean a() {
            if (TextUtils.isEmpty(this.f99598b)) {
                return false;
            }
            return this.f99598b.startsWith(HttpClientAndroid.HTTP_PREFIX) || this.f99598b.startsWith(HttpClientAndroid.HTTPS_PREFIX);
        }

        final boolean b() {
            byte[] bArr = this.f99600d;
            return bArr != null && bArr.length > 0;
        }

        final boolean c() {
            return "POST".equals(d()) || "PUT".equals(d());
        }

        final String d() {
            if (TextUtils.isEmpty(this.f99599c)) {
                return "";
            }
            if ("POST".equalsIgnoreCase(this.f99599c)) {
                return "POST";
            }
            if ("GET".equalsIgnoreCase(this.f99599c)) {
                return "GET";
            }
            return "PUT".equalsIgnoreCase(this.f99599c) ? "PUT" : "";
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Request{requestId=");
            sb2.append(this.f99597a);
            sb2.append(", url='");
            sb2.append(this.f99598b);
            sb2.append('\'');
            sb2.append(", method='");
            sb2.append(this.f99599c);
            sb2.append('\'');
            sb2.append(", body.size=");
            sb2.append(b() ? this.f99600d.length : 0);
            sb2.append(", headers=");
            sb2.append(this.f99601e);
            sb2.append(", autoRedirect=");
            sb2.append(this.f99604h);
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ByteBuffer f99610c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g f99608a = g.kUnknownError;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f99609b = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f99611d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f99612e = "";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Map<String, String> f99613f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f99614g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f99615h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        String f99616i = "";
    }

    public enum f {
        CONNECTED(0),
        DISCONNECTED(1),
        FINISHED(2);

        int nativeValue;

        f(int i10) {
            this.nativeValue = i10;
        }
    }

    public enum g {
        kHTTP200OK(200),
        kHTTP204NoContent(204),
        kHTTP206PartialContent(206),
        kHTTP301MovedPermanently(301),
        kHTTP302Found(302),
        kHTTP303SeeOther(303),
        kHTTP304NotModified(304),
        kHTTP307TemporaryRedirect(307),
        kHTTP308PermanentRedirect(308),
        kHTTP403Forbidden(403),
        kHTTP404NotFound(404),
        kHTTP405MethodNotAllowed(405),
        kHTTP503ServiceUnavailable(503),
        kSystemFileOpenFailed(1001),
        kSystemFileWriteFailed(1002),
        kSystemUnknownHost(1003),
        kSystemConnectHostFailed(1004),
        kSystemCreateSocketFailed(1005),
        kSystemNetworkDisabled(1006),
        kSystemConnectTimeout(1007),
        kSystemConnectRefused(1008),
        kSystemProtocolError(1009),
        kSystemSSLError(1010),
        kUnknownError(bb.c.b.zz);

        final int nativeValue;

        g(int i10) {
            this.nativeValue = i10;
        }
    }

    public HttpClientAndroid(int i10, int i11, int i12, boolean z10, int i13, int i14, String str, String str2, String str3, long j10) {
        this.mHttpConfig = new b(i10, i11, i12, z10, i13, i14, str, str2, str3);
        this.mNativeHttpClientAndroidJni = j10;
        HandlerThread handlerThread = new HandlerThread("HttpClient_" + hashCode());
        handlerThread.start();
        LiteavLog.i(TAG, "Create http client(" + hashCode() + "). [ThreadName:" + handlerThread.getName() + "][ThreadId:" + handlerThread.getId() + "]");
        this.mHttpHandler = new Handler(handlerThread.getLooper());
    }

    private boolean checkNativeValid() {
        boolean z10;
        synchronized (this.mLocker) {
            z10 = this.mNativeHttpClientAndroidJni != -1;
        }
        return z10;
    }

    private boolean checkRequestValid(long j10) {
        return this.mRunningRequestMap.containsKey(Long.valueOf(j10));
    }

    private void closeConnectionSafely(HttpURLConnection httpURLConnection) {
        try {
            if (httpURLConnection != null) {
                closeIO(httpURLConnection.getInputStream());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        } finally {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    private void closeIO(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private HttpURLConnection createConnection(d dVar) throws Exception {
        Proxy proxy;
        HttpURLConnection httpURLConnectionCreateConnectionUseCustomHttpDNS;
        String strReplace = dVar.f99598b.replace(" ", "%20");
        URL url = new URL(strReplace);
        if (TextUtils.isEmpty(this.mHttpConfig.f99590g) || this.mHttpConfig.f99589f <= 0) {
            proxy = ("127.0.0.1".equals(url.getHost()) || org.apache.tools.mail.b.f137245k.equals(url.getHost())) ? Proxy.NO_PROXY : null;
        } else {
            Proxy.Type type = Proxy.Type.SOCKS;
            b bVar = this.mHttpConfig;
            proxy = new Proxy(type, new InetSocketAddress(bVar.f99590g, bVar.f99589f));
            b bVar2 = this.mHttpConfig;
            Authenticator.setDefault(new a(bVar2.f99591h, bVar2.f99592i));
        }
        if (proxy != null) {
            httpURLConnectionCreateConnectionUseCustomHttpDNS = (HttpURLConnection) url.openConnection(proxy);
        } else if (HttpDnsUtil.verifyCustomHttpDNS(url.getHost())) {
            try {
                httpURLConnectionCreateConnectionUseCustomHttpDNS = HttpDnsUtil.createConnectionUseCustomHttpDNS(strReplace, url.getHost());
            } catch (Exception e10) {
                LiteavLog.w(TAG, "(" + hashCode() + ")createConnectionUseCustomHttpDNS failed. error: " + Log.getStackTraceString(e10));
                httpURLConnectionCreateConnectionUseCustomHttpDNS = (HttpURLConnection) url.openConnection();
            }
        } else {
            httpURLConnectionCreateConnectionUseCustomHttpDNS = (HttpURLConnection) url.openConnection();
        }
        httpURLConnectionCreateConnectionUseCustomHttpDNS.setInstanceFollowRedirects(false);
        httpURLConnectionCreateConnectionUseCustomHttpDNS.setConnectTimeout(this.mHttpConfig.f99584a);
        httpURLConnectionCreateConnectionUseCustomHttpDNS.setReadTimeout(this.mHttpConfig.f99585b);
        httpURLConnectionCreateConnectionUseCustomHttpDNS.setRequestProperty("Accept-Encoding", "identity");
        httpURLConnectionCreateConnectionUseCustomHttpDNS.setRequestMethod(dVar.d());
        if (dVar.c()) {
            httpURLConnectionCreateConnectionUseCustomHttpDNS.setDoOutput(true);
        }
        if (this.mHttpConfig.f99587d) {
            httpURLConnectionCreateConnectionUseCustomHttpDNS.setRequestProperty("Connection", com.google.common.net.c.f58866u0);
        } else {
            httpURLConnectionCreateConnectionUseCustomHttpDNS.setRequestProperty("Connection", "close");
        }
        Map<String, String> map = dVar.f99601e;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : dVar.f99601e.entrySet()) {
                httpURLConnectionCreateConnectionUseCustomHttpDNS.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        return httpURLConnectionCreateConnectionUseCustomHttpDNS;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0079 */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r0 = th;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void doCallbackAndResetState(com.tencent.liteav.base.http.HttpClientAndroid.f r22, long r23, com.tencent.liteav.base.http.HttpClientAndroid.e r25, boolean r26) throws java.lang.Throwable {
        /*
            r21 = this;
            r1 = r21
            r0 = r25
            java.lang.Object r2 = r1.mLocker
            monitor-enter(r2)
            boolean r3 = r21.checkNativeValid()     // Catch: java.lang.Throwable -> L79
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L1b
            r10 = r23
            boolean r3 = r1.checkRequestValid(r10)     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L1d
            if (r0 == 0) goto L1d
            r3 = r4
            goto L1e
        L1b:
            r10 = r23
        L1d:
            r3 = r5
        L1e:
            com.tencent.liteav.base.http.HttpClientAndroid$c r6 = com.tencent.liteav.base.http.HttpClientAndroid.c.RUNNING_REPEAT     // Catch: java.lang.Throwable -> L79
            com.tencent.liteav.base.http.HttpClientAndroid$c r7 = r1.mInternalState     // Catch: java.lang.Throwable -> L79
            if (r6 != r7) goto L26
            r8 = r4
            goto L27
        L26:
            r8 = r5
        L27:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.liteav.base.http.HttpClientAndroid$d> r4 = r1.mRunningRequestMap     // Catch: java.lang.Throwable -> L79
            java.lang.Long r5 = java.lang.Long.valueOf(r23)     // Catch: java.lang.Throwable -> L79
            r4.remove(r5)     // Catch: java.lang.Throwable -> L79
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.liteav.base.http.HttpClientAndroid$d> r4 = r1.mRunningRequestMap     // Catch: java.lang.Throwable -> L79
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L79
            if (r4 != 0) goto L3c
            com.tencent.liteav.base.http.HttpClientAndroid$c r4 = com.tencent.liteav.base.http.HttpClientAndroid.c.NONE     // Catch: java.lang.Throwable -> L79
            r1.mInternalState = r4     // Catch: java.lang.Throwable -> L79
        L3c:
            if (r3 == 0) goto L67
            long r6 = r1.mNativeHttpClientAndroidJni     // Catch: java.lang.Throwable -> L75
            r3 = r22
            int r9 = r3.nativeValue     // Catch: java.lang.Throwable -> L75
            com.tencent.liteav.base.http.HttpClientAndroid$g r3 = r0.f99608a     // Catch: java.lang.Throwable -> L75
            int r12 = r3.nativeValue     // Catch: java.lang.Throwable -> L75
            java.lang.String r13 = r0.f99609b     // Catch: java.lang.Throwable -> L75
            int r14 = r0.f99614g     // Catch: java.lang.Throwable -> L75
            java.nio.ByteBuffer r15 = r0.f99610c     // Catch: java.lang.Throwable -> L75
            java.lang.String r3 = r0.f99612e     // Catch: java.lang.Throwable -> L75
            java.util.Map<java.lang.String, java.lang.String> r4 = r0.f99613f     // Catch: java.lang.Throwable -> L75
            int r5 = r0.f99611d     // Catch: java.lang.Throwable -> L75
            int r1 = r0.f99615h     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = r0.f99616i     // Catch: java.lang.Throwable -> L75
            r10 = r23
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r1
            r20 = r0
            nativeOnCallback(r6, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L75
        L67:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L75
            r1 = r21
            if (r26 == 0) goto L74
            java.net.HttpURLConnection r0 = r1.mConnection
            r1.closeConnectionSafely(r0)
            r0 = 0
            r1.mConnection = r0
        L74:
            return
        L75:
            r0 = move-exception
            r1 = r21
            goto L7a
        L79:
            r0 = move-exception
        L7a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.base.http.HttpClientAndroid.doCallbackAndResetState(com.tencent.liteav.base.http.HttpClientAndroid$f, long, com.tencent.liteav.base.http.HttpClientAndroid$e, boolean):void");
    }

    private boolean doOnCallback(f fVar, long j10, e eVar) {
        synchronized (this.mLocker) {
            if (!checkNativeValid() || !checkRequestValid(j10) || eVar == null) {
                return false;
            }
            return nativeOnCallback(this.mNativeHttpClientAndroidJni, c.RUNNING_REPEAT == this.mInternalState, fVar.nativeValue, j10, eVar.f99608a.nativeValue, eVar.f99609b, eVar.f99614g, eVar.f99610c, eVar.f99612e, eVar.f99613f, eVar.f99611d, eVar.f99615h, eVar.f99616i);
        }
    }

    private void doReadData(long j10, e eVar) throws Throwable {
        boolean z10;
        long jElapsedRealtime;
        int i10;
        if (!checkRequestValid(j10)) {
            closeConnectionSafely(this.mConnection);
            LiteavLog.w(TAG, "(" + hashCode() + ")Do read data failed. Invalid request id. id:" + j10);
            return;
        }
        try {
            InputStream inputStream = this.mConnection.getInputStream();
            synchronized (this.mLocker) {
                z10 = this.mInternalState == c.RUNNING_ONCE;
            }
            long j11 = 0;
            if (z10) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                do {
                    try {
                        i10 = inputStream.read(this.mReadDataBytes);
                        if (i10 > 0) {
                            byteArrayOutputStream.write(this.mReadDataBytes, 0, i10);
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        LiteavLog.e(TAG, "(" + hashCode() + ")Do read data failed. Catch error when reading.");
                        eVar.f99608a = getStatusCode(e10);
                        eVar.f99609b = e10.toString();
                        doCallbackAndResetState(f.DISCONNECTED, j10, eVar, true);
                        return;
                    }
                } while (i10 > 0 && checkRequestValid(j10));
                int size = byteArrayOutputStream.size();
                if (size > 0) {
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(size);
                    eVar.f99610c = byteBufferAllocateDirect;
                    byteBufferAllocateDirect.put(byteArrayOutputStream.toByteArray(), 0, size);
                    eVar.f99611d = size;
                }
                jElapsedRealtime = 0;
            } else {
                try {
                    int i11 = inputStream.read(this.mReadDataBytes);
                    this.mTotalReadBytes += (long) i11;
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    if (i11 > 0) {
                        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(i11);
                        eVar.f99610c = byteBufferAllocateDirect2;
                        byteBufferAllocateDirect2.put(this.mReadDataBytes, 0, i11);
                        eVar.f99611d = i11;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    LiteavLog.e(TAG, "(" + hashCode() + ")Do read data failed. Catch error when reading.");
                    eVar.f99608a = getStatusCode(e11);
                    eVar.f99609b = e11.toString();
                    doCallbackAndResetState(f.DISCONNECTED, j10, eVar, true);
                    return;
                }
            }
            if (eVar.f99611d == 0 && !z10) {
                LiteavLog.w(TAG, "(" + hashCode() + ")Do read data failed. Rsp size is 0.");
                doCallbackAndResetState(f.FINISHED, j10, eVar, this.mHttpConfig.f99587d ^ true);
                return;
            }
            if (z10) {
                doCallbackAndResetState(f.FINISHED, j10, eVar, !this.mHttpConfig.f99587d);
                return;
            }
            boolean zDoOnCallback = doOnCallback(f.CONNECTED, j10, eVar);
            this.mPausedRepeatDownloading = zDoOnCallback;
            this.mRepeatDownloadingStatusCode = eVar.f99608a;
            if (zDoOnCallback) {
                return;
            }
            int i12 = this.mHttpConfig.f99588e;
            if (i12 > 0) {
                long j12 = this.mStartReadTime;
                long j13 = jElapsedRealtime - j12 == 0 ? 1L : jElapsedRealtime - j12;
                long j14 = this.mTotalReadBytes;
                if (j14 / j13 > i12 / 1000) {
                    j11 = ((j14 * 1000) / ((long) i12)) - j13;
                }
            }
            this.mHttpHandler.postDelayed(com.tencent.liteav.base.http.f.a(this, eVar, j10), j11);
        } catch (Exception e12) {
            e12.printStackTrace();
            LiteavLog.e(TAG, "(" + hashCode() + ")Do read data failed. Fail to get InputStream.");
            eVar.f99608a = getStatusCode(e12);
            eVar.f99609b = e12.toString();
            doCallbackAndResetState(f.DISCONNECTED, j10, eVar, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doRequest(d dVar) throws Throwable {
        g gVar;
        e eVarInternalRequest = null;
        for (int i10 = 0; i10 < 4; i10++) {
            eVarInternalRequest = internalRequest(dVar);
            if (eVarInternalRequest == null) {
                return;
            }
            if (!dVar.f99604h || ((gVar = eVarInternalRequest.f99608a) != g.kHTTP301MovedPermanently && gVar != g.kHTTP302Found)) {
                break;
            }
            String headerField = this.mConnection.getHeaderField("Location");
            dVar.f99598b = headerField;
            dVar.f99602f++;
            dVar.f99603g = headerField;
        }
        this.mTotalReadBytes = 0L;
        this.mStartReadTime = SystemClock.elapsedRealtime();
        doReadData(dVar.f99597a, eVarInternalRequest);
    }

    public static HashMap getJavaHashMap(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr.length == 0 || strArr2 == null || strArr2.length == 0) {
            return new HashMap();
        }
        if (strArr.length != strArr2.length) {
            LiteavLog.w(TAG, "Invalid parameter, keys and values do not match.");
            return new HashMap();
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            map.put(strArr[i10], strArr2[i10]);
        }
        return map;
    }

    public static String[] getMapKeys(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return new String[0];
        }
        Set<String> setKeySet = map.keySet();
        return (String[]) setKeySet.toArray(new String[setKeySet.size()]);
    }

    public static String[] getMapValue(Map<String, String> map, String[] strArr) {
        if (map == null || map.isEmpty() || strArr == null || strArr.length == 0) {
            return new String[0];
        }
        String[] strArr2 = new String[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            strArr2[i10] = map.get(strArr[i10]);
        }
        return strArr2;
    }

    private Map<String, String> getResponseHeaders(Map<String, List<String>> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey())) {
                map2.put(entry.getKey(), entry.getValue().get(0));
            }
        }
        return map2;
    }

    private g getStatusCode(int i10) {
        g gVar = g.kUnknownError;
        if (i10 == 200) {
            return g.kHTTP200OK;
        }
        if (i10 == 204) {
            return g.kHTTP204NoContent;
        }
        if (i10 == 206) {
            return g.kHTTP206PartialContent;
        }
        if (i10 == 301) {
            return g.kHTTP301MovedPermanently;
        }
        if (i10 == 302) {
            return g.kHTTP302Found;
        }
        if (i10 == 303) {
            return g.kHTTP303SeeOther;
        }
        if (i10 == 304) {
            return g.kHTTP304NotModified;
        }
        if (i10 == 307) {
            return g.kHTTP307TemporaryRedirect;
        }
        if (i10 == 308) {
            return g.kHTTP308PermanentRedirect;
        }
        if (i10 == 403) {
            return g.kHTTP403Forbidden;
        }
        if (i10 == 404) {
            return g.kHTTP404NotFound;
        }
        if (i10 == 405) {
            return g.kHTTP405MethodNotAllowed;
        }
        if (i10 == 503) {
            return g.kHTTP503ServiceUnavailable;
        }
        Log.w(TAG, "(" + hashCode() + ")Failed to convert status code：" + i10, new Object[0]);
        return gVar;
    }

    private g getStatusCode(Exception exc) {
        g gVar = g.kUnknownError;
        if (exc instanceof FileNotFoundException) {
            return g.kSystemFileOpenFailed;
        }
        if (exc instanceof EOFException) {
            return g.kSystemFileWriteFailed;
        }
        if (exc instanceof UnknownHostException) {
            return g.kSystemUnknownHost;
        }
        if (exc instanceof NoRouteToHostException) {
            return g.kSystemConnectHostFailed;
        }
        if ((exc instanceof SocketException) || (exc instanceof MalformedURLException)) {
            return g.kSystemCreateSocketFailed;
        }
        if (exc instanceof SocketTimeoutException) {
            return g.kSystemConnectTimeout;
        }
        if (exc instanceof ConnectException) {
            return g.kSystemConnectRefused;
        }
        if (exc instanceof ProtocolException) {
            return g.kSystemProtocolError;
        }
        if (exc instanceof SSLException) {
            return g.kSystemSSLError;
        }
        Log.w(TAG, "(" + hashCode() + ")Failed to convert status code, exception：", exc.toString());
        return gVar;
    }

    private e internalRequest(d dVar) throws Throwable {
        boolean z10;
        if (!dVar.a()) {
            LiteavLog.e(TAG, "(" + hashCode() + ")Send request failed. Invalid request url(" + dVar.f99598b + ").");
            return null;
        }
        if (!checkRequestValid(dVar.f99597a)) {
            LiteavLog.w(TAG, "(" + hashCode() + ")Do send failed. ignore request when cancelled. request:" + dVar);
            return null;
        }
        e eVar = new e();
        eVar.f99615h = dVar.f99602f;
        eVar.f99616i = dVar.f99603g;
        synchronized (this.mLocker) {
            z10 = this.mInternalState == c.RUNNING_ONCE;
        }
        if (z10 && this.mConnection != null && !dVar.f99598b.equals(this.mLastRequestURL)) {
            closeConnectionSafely(this.mConnection);
            this.mConnection = null;
        }
        this.mLastRequestURL = dVar.f99598b;
        try {
            this.mConnection = createConnection(dVar);
            writeRequestBody(dVar);
            try {
                eVar.f99608a = getStatusCode(this.mConnection.getResponseCode());
                eVar.f99609b = this.mConnection.getResponseMessage();
                eVar.f99612e = parseHostAddress(this.mConnection.getURL().getHost());
                eVar.f99614g = this.mConnection.getURL().getPort();
                eVar.f99613f = getResponseHeaders(this.mConnection.getHeaderFields());
                if (checkRequestValid(dVar.f99597a)) {
                    return eVar;
                }
                closeConnectionSafely(this.mConnection);
                LiteavLog.w(TAG, "(" + hashCode() + ")Do send failed. Invalid request, abort request.");
                return null;
            } catch (Exception e10) {
                e10.printStackTrace();
                LiteavLog.e(TAG, "(" + hashCode() + ")Do send failed. Catch error. ex= " + Log.getStackTraceString(e10));
                eVar.f99608a = getStatusCode(e10);
                eVar.f99609b = e10.toString();
                doCallbackAndResetState(f.DISCONNECTED, dVar.f99597a, eVar, true);
                return null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            LiteavLog.e(TAG, "(" + hashCode() + ")Do send failed. Fail to create http connection. ex= " + Log.getStackTraceString(e11));
            eVar.f99608a = getStatusCode(e11);
            eVar.f99609b = e11.toString();
            doCallbackAndResetState(f.DISCONNECTED, dVar.f99597a, eVar, true);
            return null;
        }
    }

    static /* synthetic */ void lambda$cancelAll$1(HttpClientAndroid httpClientAndroid) {
        httpClientAndroid.closeConnectionSafely(httpClientAndroid.mConnection);
        httpClientAndroid.mConnection = null;
    }

    static /* synthetic */ void lambda$destroy$4(HttpClientAndroid httpClientAndroid) {
        httpClientAndroid.closeConnectionSafely(httpClientAndroid.mConnection);
        httpClientAndroid.mConnection = null;
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 18) {
            httpClientAndroid.mHttpHandler.getLooper().quitSafely();
        } else {
            httpClientAndroid.mHttpHandler.getLooper().quit();
        }
    }

    static /* synthetic */ void lambda$doReadData$5(HttpClientAndroid httpClientAndroid, e eVar, long j10) throws Throwable {
        e eVar2 = new e();
        eVar2.f99608a = eVar.f99608a;
        httpClientAndroid.doReadData(j10, eVar2);
    }

    static /* synthetic */ void lambda$resumeRepeatDownload$2(HttpClientAndroid httpClientAndroid, Long l10) throws Throwable {
        e eVar = new e();
        eVar.f99608a = httpClientAndroid.mRepeatDownloadingStatusCode;
        httpClientAndroid.doReadData(l10.longValue(), eVar);
    }

    static /* synthetic */ void lambda$resumeRepeatDownload$3(HttpClientAndroid httpClientAndroid, long j10) throws Throwable {
        e eVar = new e();
        eVar.f99608a = httpClientAndroid.mRepeatDownloadingStatusCode;
        httpClientAndroid.doReadData(j10, eVar);
    }

    private static native boolean nativeOnCallback(long j10, boolean z10, int i10, long j11, int i11, String str, int i12, ByteBuffer byteBuffer, String str2, Map map, int i13, int i14, String str3);

    private static native void nativeOnUploadProgress(long j10, long j11, long j12, long j13);

    private String parseHostAddress(String str) {
        try {
            return InetAddress.getByName(str).getHostAddress();
        } catch (Exception unused) {
            LiteavLog.w(TAG, "(" + hashCode() + ")Parse host error. host:" + str);
            return "";
        }
    }

    private long sendInternal(long j10, d dVar, boolean z10) {
        if (dVar == null || !dVar.a()) {
            LiteavLog.e(TAG, "(" + hashCode() + ")upload file failed. Invalid request url(" + dVar.f99598b + ").");
            return 0L;
        }
        boolean z11 = true;
        if (!(!TextUtils.isEmpty(dVar.d()))) {
            LiteavLog.e(TAG, "(" + hashCode() + ")upload file failed. Request method(" + dVar.f99599c + ") is not supported.");
            return 0L;
        }
        synchronized (this.mLocker) {
            if (this.mInternalState == c.NONE) {
                this.mInternalState = z10 ? c.RUNNING_REPEAT : c.RUNNING_ONCE;
            } else if (this.mInternalState != c.RUNNING_ONCE) {
                z11 = false;
            }
            if (z11) {
                dVar.f99597a = j10;
                this.mRunningRequestMap.put(Long.valueOf(j10), dVar);
                this.mHttpHandler.post(com.tencent.liteav.base.http.a.a(this, dVar));
                return dVar.f99597a;
            }
            LiteavLog.e(TAG, "(" + hashCode() + ")Send request failed. Invalid state:" + this.mInternalState);
            return 0L;
        }
    }

    private void uploadFileByPath(d dVar, OutputStream outputStream) throws Exception {
        Object obj;
        if (TextUtils.isEmpty(dVar.f99605i)) {
            return;
        }
        Closeable closeable = null;
        try {
            File file = new File(dVar.f99605i);
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[524288];
                long j10 = 0;
                long length = file.length();
                while (true) {
                    int i10 = fileInputStream.read(bArr);
                    if (i10 == -1) {
                        break;
                    }
                    Object obj2 = this.mLocker;
                    synchronized (obj2) {
                        try {
                            if (checkRequestValid(dVar.f99597a) && checkNativeValid()) {
                                j10 += (long) i10;
                                outputStream.write(bArr, 0, i10);
                                obj = obj2;
                                try {
                                    nativeOnUploadProgress(this.mNativeHttpClientAndroidJni, dVar.f99597a, j10, length);
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            obj = obj2;
                        }
                    }
                    break;
                }
                closeIO(fileInputStream);
            } catch (Throwable th4) {
                th = th4;
                closeable = fileInputStream;
                closeIO(closeable);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    private void writeRequestBody(d dVar) {
        OutputStream outputStream = null;
        try {
            if (dVar.c() && dVar.b()) {
                outputStream = this.mConnection.getOutputStream();
                outputStream.write(dVar.f99600d);
                outputStream.flush();
            } else if (dVar.c() && (!TextUtils.isEmpty(dVar.f99605i))) {
                outputStream = this.mConnection.getOutputStream();
                byte[] bArr = dVar.f99606j;
                if (bArr != null && bArr.length > 0) {
                    outputStream.write(bArr);
                }
                uploadFileByPath(dVar, outputStream);
                byte[] bArr2 = dVar.f99607k;
                if (bArr2 != null && bArr2.length > 0) {
                    outputStream.write(bArr2);
                }
                outputStream.flush();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            LiteavLog.w(TAG, "(" + hashCode() + ")Do write request body failed.");
        } finally {
            closeIO(null);
        }
    }

    public void cancel(long j10) {
        synchronized (this.mLocker) {
            if (!checkNativeValid()) {
                LiteavLog.e(TAG, "(" + hashCode() + ")Cancel request failed. Invalid native handle.");
                return;
            }
            if (this.mRunningRequestMap.size() == 0) {
                return;
            }
            LiteavLog.i(TAG, "(" + hashCode() + ")Cancel request. request:" + this.mRunningRequestMap.remove(Long.valueOf(j10)));
            if (this.mRunningRequestMap.size() == 0) {
                this.mInternalState = c.NONE;
            }
        }
    }

    public void cancelAll() {
        synchronized (this.mLocker) {
            if (!checkNativeValid()) {
                LiteavLog.e(TAG, "(" + hashCode() + ")Cancel all request failed. Invalid native handle.");
                return;
            }
            c cVar = this.mInternalState;
            c cVar2 = c.NONE;
            if (cVar == cVar2) {
                return;
            }
            this.mInternalState = cVar2;
            LiteavLog.i(TAG, "(" + hashCode() + ")Cancel all. size:" + this.mRunningRequestMap.size());
            this.mRunningRequestMap.clear();
            this.mHttpHandler.post(com.tencent.liteav.base.http.b.a(this));
        }
    }

    public void destroy() {
        synchronized (this.mLocker) {
            this.mRunningRequestMap.clear();
            this.mNativeHttpClientAndroidJni = -1L;
            this.mHttpHandler.post(com.tencent.liteav.base.http.e.a(this));
        }
    }

    public void resumeRepeatDownload(long j10) {
        synchronized (this.mLocker) {
            if (!checkNativeValid()) {
                LiteavLog.e(TAG, "(" + hashCode() + ")Cancel request failed. Invalid native handle.");
                return;
            }
            if (this.mRunningRequestMap.size() == 0) {
                return;
            }
            if (this.mInternalState == c.RUNNING_REPEAT && this.mPausedRepeatDownloading) {
                this.mPausedRepeatDownloading = false;
                if (j10 == 0) {
                    Iterator<Long> it = this.mRunningRequestMap.keySet().iterator();
                    while (it.hasNext()) {
                        this.mHttpHandler.post(com.tencent.liteav.base.http.c.a(this, it.next()));
                    }
                } else if (checkRequestValid(j10)) {
                    if (this.mRunningRequestMap.get(Long.valueOf(j10)) == null) {
                    } else {
                        this.mHttpHandler.post(com.tencent.liteav.base.http.d.a(this, j10));
                    }
                }
            }
        }
    }

    public long send(long j10, String str, String str2, byte[] bArr, Map<String, String> map, boolean z10, boolean z11) {
        if (checkNativeValid()) {
            return sendInternal(j10, new d(str, str2, bArr, map, z11), z10);
        }
        LiteavLog.e(TAG, "(" + hashCode() + ")Send request failed. Invalid native handle.");
        return 0L;
    }

    public void updateConfig(final int i10, final int i11, final int i12, final boolean z10, final int i13, final int i14, final String str, final String str2, final String str3, long j10) {
        this.mHttpHandler.post(new Runnable() { // from class: com.tencent.liteav.base.http.HttpClientAndroid.1
            @Override // java.lang.Runnable
            public final void run() {
                HttpClientAndroid.this.mHttpConfig = new b(i10, i11, i12, z10, i13, i14, str, str2, str3);
                if (i13 > 0) {
                    HttpClientAndroid.this.mTotalReadBytes = 0L;
                    HttpClientAndroid.this.mStartReadTime = SystemClock.elapsedRealtime();
                }
            }
        });
    }

    public long uploadFile(long j10, String str, String str2, byte[] bArr, Map<String, String> map, boolean z10, boolean z11, String str3, byte[] bArr2, byte[] bArr3) {
        if (!checkNativeValid()) {
            LiteavLog.e(TAG, "(" + hashCode() + ")upload file failed. Invalid native handle.");
            return 0L;
        }
        if (!str3.isEmpty()) {
            return sendInternal(j10, new d(str, str2, bArr, map, z11, str3, bArr2, bArr3), z10);
        }
        LiteavLog.e(TAG, "(" + hashCode() + ")upload file failed. Invalid file path(" + str3 + ").");
        return 0L;
    }
}
