package anet.channel.session;

import android.os.Build;
import android.util.Pair;
import anet.channel.RequestCb;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.bytes.ByteArray;
import anet.channel.request.Request;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import com.taobao.accs.common.Constants;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: compiled from: Taobao */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f29829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f29830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Map<String, List<String>> f29831c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f29832d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f29833e;
    }

    private b() {
    }

    private static int a(HttpURLConnection httpURLConnection, Request request) {
        int i10 = 0;
        if (request.containsBody()) {
            OutputStream outputStream = null;
            try {
                try {
                    outputStream = httpURLConnection.getOutputStream();
                    int iPostBody = request.postBody(outputStream);
                    if (outputStream != null) {
                        try {
                            outputStream.flush();
                            outputStream.close();
                        } catch (IOException e10) {
                            ALog.e("awcn.HttpConnector", "postData", request.getSeq(), e10, new Object[0]);
                        }
                    }
                    i10 = iPostBody;
                } catch (Exception e11) {
                    ALog.e("awcn.HttpConnector", "postData error", request.getSeq(), e11, new Object[0]);
                    if (outputStream != null) {
                        try {
                            outputStream.flush();
                            outputStream.close();
                        } catch (IOException e12) {
                            ALog.e("awcn.HttpConnector", "postData", request.getSeq(), e12, new Object[0]);
                        }
                    }
                }
                long j10 = i10;
                request.f29773a.reqBodyInflateSize = j10;
                request.f29773a.reqBodyDeflateSize = j10;
                request.f29773a.sendDataSize = j10;
            } catch (Throwable th2) {
                if (outputStream != null) {
                    try {
                        outputStream.flush();
                        outputStream.close();
                    } catch (IOException e13) {
                        ALog.e("awcn.HttpConnector", "postData", request.getSeq(), e13, new Object[0]);
                    }
                }
                throw th2;
            }
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02ab A[Catch: all -> 0x028e, TryCatch #21 {all -> 0x028e, blocks: (B:12:0x0033, B:14:0x003d, B:22:0x00a3, B:24:0x00a8, B:26:0x00b1, B:28:0x00b7, B:30:0x0119, B:32:0x0123, B:34:0x0129, B:36:0x0132, B:96:0x0296, B:98:0x029c, B:100:0x02a3, B:102:0x02ab, B:104:0x02bf, B:103:0x02ba, B:43:0x0196, B:45:0x01ad, B:47:0x01cf, B:56:0x01e2, B:58:0x01fd, B:60:0x020b, B:61:0x0212, B:65:0x022f, B:68:0x0246, B:70:0x025f, B:63:0x0220, B:64:0x0227, B:129:0x033c, B:131:0x0367, B:140:0x03a4, B:142:0x03cf, B:112:0x02e0, B:120:0x0315, B:150:0x0409, B:158:0x0431, B:166:0x0457, B:174:0x047d), top: B:211:0x0033, inners: #27, #31, #32, #29 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x02ba A[Catch: all -> 0x028e, TryCatch #21 {all -> 0x028e, blocks: (B:12:0x0033, B:14:0x003d, B:22:0x00a3, B:24:0x00a8, B:26:0x00b1, B:28:0x00b7, B:30:0x0119, B:32:0x0123, B:34:0x0129, B:36:0x0132, B:96:0x0296, B:98:0x029c, B:100:0x02a3, B:102:0x02ab, B:104:0x02bf, B:103:0x02ba, B:43:0x0196, B:45:0x01ad, B:47:0x01cf, B:56:0x01e2, B:58:0x01fd, B:60:0x020b, B:61:0x0212, B:65:0x022f, B:68:0x0246, B:70:0x025f, B:63:0x0220, B:64:0x0227, B:129:0x033c, B:131:0x0367, B:140:0x03a4, B:142:0x03cf, B:112:0x02e0, B:120:0x0315, B:150:0x0409, B:158:0x0431, B:166:0x0457, B:174:0x047d), top: B:211:0x0033, inners: #27, #31, #32, #29 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0367 A[Catch: all -> 0x028e, TRY_LEAVE, TryCatch #21 {all -> 0x028e, blocks: (B:12:0x0033, B:14:0x003d, B:22:0x00a3, B:24:0x00a8, B:26:0x00b1, B:28:0x00b7, B:30:0x0119, B:32:0x0123, B:34:0x0129, B:36:0x0132, B:96:0x0296, B:98:0x029c, B:100:0x02a3, B:102:0x02ab, B:104:0x02bf, B:103:0x02ba, B:43:0x0196, B:45:0x01ad, B:47:0x01cf, B:56:0x01e2, B:58:0x01fd, B:60:0x020b, B:61:0x0212, B:65:0x022f, B:68:0x0246, B:70:0x025f, B:63:0x0220, B:64:0x0227, B:129:0x033c, B:131:0x0367, B:140:0x03a4, B:142:0x03cf, B:112:0x02e0, B:120:0x0315, B:150:0x0409, B:158:0x0431, B:166:0x0457, B:174:0x047d), top: B:211:0x0033, inners: #27, #31, #32, #29 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x03cf A[Catch: all -> 0x028e, TRY_LEAVE, TryCatch #21 {all -> 0x028e, blocks: (B:12:0x0033, B:14:0x003d, B:22:0x00a3, B:24:0x00a8, B:26:0x00b1, B:28:0x00b7, B:30:0x0119, B:32:0x0123, B:34:0x0129, B:36:0x0132, B:96:0x0296, B:98:0x029c, B:100:0x02a3, B:102:0x02ab, B:104:0x02bf, B:103:0x02ba, B:43:0x0196, B:45:0x01ad, B:47:0x01cf, B:56:0x01e2, B:58:0x01fd, B:60:0x020b, B:61:0x0212, B:65:0x022f, B:68:0x0246, B:70:0x025f, B:63:0x0220, B:64:0x0227, B:129:0x033c, B:131:0x0367, B:140:0x03a4, B:142:0x03cf, B:112:0x02e0, B:120:0x0315, B:150:0x0409, B:158:0x0431, B:166:0x0457, B:174:0x047d), top: B:211:0x0033, inners: #27, #31, #32, #29 }] */
    /* JADX WARN: Code duplicated, block: B:207:0x038d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x02cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x03f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x029c A[Catch: all -> 0x028e, TryCatch #21 {all -> 0x028e, blocks: (B:12:0x0033, B:14:0x003d, B:22:0x00a3, B:24:0x00a8, B:26:0x00b1, B:28:0x00b7, B:30:0x0119, B:32:0x0123, B:34:0x0129, B:36:0x0132, B:96:0x0296, B:98:0x029c, B:100:0x02a3, B:102:0x02ab, B:104:0x02bf, B:103:0x02ba, B:43:0x0196, B:45:0x01ad, B:47:0x01cf, B:56:0x01e2, B:58:0x01fd, B:60:0x020b, B:61:0x0212, B:65:0x022f, B:68:0x0246, B:70:0x025f, B:63:0x0220, B:64:0x0227, B:129:0x033c, B:131:0x0367, B:140:0x03a4, B:142:0x03cf, B:112:0x02e0, B:120:0x0315, B:150:0x0409, B:158:0x0431, B:166:0x0457, B:174:0x047d), top: B:211:0x0033, inners: #27, #31, #32, #29 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x02a1  */
    public static a a(Request request, RequestCb requestCb) {
        String str;
        String str2;
        String str3;
        SSLException sSLException;
        SSLHandshakeException sSLHandshakeException;
        Exception exc;
        String message;
        int i10;
        String singleHeaderFieldByKey;
        String str4 = "hostnameVerifier";
        String str5 = "sslSocketFactory";
        String str6 = "SSL Error Info.";
        String str7 = "";
        a aVar = new a();
        Throwable th2 = null;
        if (request == null || request.getUrl() == null) {
            if (requestCb != null) {
                requestCb.onFinish(-102, ErrorConstant.getErrMsg(-102), new RequestStatistic(null, null));
            }
            return aVar;
        }
        Request requestBuild = request;
        HttpURLConnection httpURLConnectionA = null;
        try {
            while (true) {
                if (NetworkStatusHelper.isConnected()) {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                httpURLConnectionA = a(requestBuild);
                                                if (ALog.isPrintLog(2)) {
                                                    try {
                                                        ALog.i("awcn.HttpConnector", str7, requestBuild.getSeq(), "request URL", httpURLConnectionA.getURL().toString());
                                                        ALog.i("awcn.HttpConnector", str7, requestBuild.getSeq(), "request Method", httpURLConnectionA.getRequestMethod());
                                                        ALog.i("awcn.HttpConnector", str7, requestBuild.getSeq(), "request headers", httpURLConnectionA.getRequestProperties().toString());
                                                    } catch (SSLHandshakeException e10) {
                                                        sSLHandshakeException = e10;
                                                        str = str4;
                                                        str2 = str5;
                                                        str3 = str6;
                                                        anet.channel.strategy.c.a.f29911a.b(requestBuild.getHost());
                                                        a(requestBuild, aVar, requestCb, -402, sSLHandshakeException);
                                                        ALog.e("awcn.HttpConnector", "HTTP Connect SSLHandshakeException", requestBuild.getSeq(), "host", requestBuild.getHost(), sSLHandshakeException);
                                                        if (httpURLConnectionA instanceof HttpsURLConnection) {
                                                            ALog.e("awcn.HttpConnector", str3, requestBuild.getSeq(), str2, ((HttpsURLConnection) httpURLConnectionA).getSSLSocketFactory(), str, ((HttpsURLConnection) httpURLConnectionA).getHostnameVerifier());
                                                        }
                                                        if (httpURLConnectionA != null) {
                                                            try {
                                                                httpURLConnectionA.disconnect();
                                                            } catch (Exception e11) {
                                                                ALog.e("awcn.HttpConnector", "http disconnect", null, e11, new Object[0]);
                                                            }
                                                        }
                                                    } catch (SSLException e12) {
                                                        sSLException = e12;
                                                        str = str4;
                                                        str2 = str5;
                                                        str3 = str6;
                                                        anet.channel.strategy.c.a.f29911a.b(requestBuild.getHost());
                                                        a(requestBuild, aVar, requestCb, -402, sSLException);
                                                        ALog.e("awcn.HttpConnector", "connect SSLException", requestBuild.getSeq(), "host", requestBuild.getHost(), sSLException);
                                                        if (httpURLConnectionA instanceof HttpsURLConnection) {
                                                            ALog.e("awcn.HttpConnector", str3, requestBuild.getSeq(), str2, ((HttpsURLConnection) httpURLConnectionA).getSSLSocketFactory(), str, ((HttpsURLConnection) httpURLConnectionA).getHostnameVerifier());
                                                        }
                                                        if (httpURLConnectionA != null) {
                                                            try {
                                                                httpURLConnectionA.disconnect();
                                                            } catch (Exception e13) {
                                                                ALog.e("awcn.HttpConnector", "http disconnect", null, e13, new Object[0]);
                                                            }
                                                        }
                                                    } catch (Exception e14) {
                                                        exc = e14;
                                                        str7 = str7;
                                                        if (exc.getMessage() != null) {
                                                            message = exc.getMessage();
                                                        } else {
                                                            message = str7;
                                                        }
                                                        if (message.contains("not verified")) {
                                                            anet.channel.strategy.c.a.f29911a.b(requestBuild.getHost());
                                                            a(requestBuild, aVar, requestCb, -403, exc);
                                                        } else {
                                                            a(requestBuild, aVar, requestCb, -101, exc);
                                                        }
                                                        ALog.e("awcn.HttpConnector", "HTTP Exception", requestBuild.getSeq(), exc, new Object[0]);
                                                        if (httpURLConnectionA != null) {
                                                            try {
                                                                httpURLConnectionA.disconnect();
                                                            } catch (Exception e15) {
                                                                ALog.e("awcn.HttpConnector", "http disconnect", null, e15, new Object[0]);
                                                            }
                                                        }
                                                    }
                                                }
                                                String str8 = str4;
                                                str2 = str5;
                                                try {
                                                    requestBuild.f29773a.sendStart = System.currentTimeMillis();
                                                    RequestStatistic requestStatistic = requestBuild.f29773a;
                                                    str3 = str6;
                                                    try {
                                                        str = str8;
                                                        try {
                                                            requestStatistic.processTime = requestStatistic.sendStart - requestBuild.f29773a.start;
                                                            httpURLConnectionA.connect();
                                                            a(httpURLConnectionA, requestBuild);
                                                            requestBuild.f29773a.sendEnd = System.currentTimeMillis();
                                                            RequestStatistic requestStatistic2 = requestBuild.f29773a;
                                                            requestStatistic2.sendDataTime = requestStatistic2.sendEnd - requestBuild.f29773a.sendStart;
                                                            aVar.f29829a = httpURLConnectionA.getResponseCode();
                                                            aVar.f29831c = HttpHelper.cloneMap(httpURLConnectionA.getHeaderFields());
                                                            ALog.i("awcn.HttpConnector", str7, requestBuild.getSeq(), "response code", Integer.valueOf(aVar.f29829a));
                                                            ALog.i("awcn.HttpConnector", str7, requestBuild.getSeq(), "response headers", aVar.f29831c);
                                                            if (!HttpHelper.checkRedirect(requestBuild, aVar.f29829a) || (singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(aVar.f29831c, "Location")) == null) {
                                                                break;
                                                            }
                                                            HttpUrl httpUrl = HttpUrl.parse(singleHeaderFieldByKey);
                                                            if (httpUrl == null) {
                                                                ALog.e("awcn.HttpConnector", "redirect url is invalid!", requestBuild.getSeq(), "redirect url", singleHeaderFieldByKey);
                                                                break;
                                                            }
                                                            str7 = str7;
                                                            try {
                                                                ALog.i("awcn.HttpConnector", "redirect", requestBuild.getSeq(), "to url", httpUrl.toString());
                                                                requestBuild = requestBuild.newBuilder().setMethod("GET").setBody(null).setUrl(httpUrl).setRedirectTimes(requestBuild.getRedirectTimes() + 1).setSslSocketFactory(null).setHostnameVerifier(null).build();
                                                                requestBuild.f29773a.recordRedirect(aVar.f29829a, httpUrl.simpleUrlString());
                                                                requestBuild.f29773a.locationUrl = singleHeaderFieldByKey;
                                                                try {
                                                                    httpURLConnectionA.disconnect();
                                                                } catch (Exception e16) {
                                                                    ALog.e("awcn.HttpConnector", "http disconnect", null, e16, new Object[0]);
                                                                }
                                                                str6 = str3;
                                                                str5 = str2;
                                                                str4 = str;
                                                                str7 = str7;
                                                                th2 = null;
                                                            } catch (Exception e17) {
                                                                e = e17;
                                                            }
                                                            e = e17;
                                                        } catch (SSLHandshakeException e18) {
                                                            e = e18;
                                                            sSLHandshakeException = e;
                                                            anet.channel.strategy.c.a.f29911a.b(requestBuild.getHost());
                                                            a(requestBuild, aVar, requestCb, -402, sSLHandshakeException);
                                                            ALog.e("awcn.HttpConnector", "HTTP Connect SSLHandshakeException", requestBuild.getSeq(), "host", requestBuild.getHost(), sSLHandshakeException);
                                                            if (httpURLConnectionA instanceof HttpsURLConnection) {
                                                                ALog.e("awcn.HttpConnector", str3, requestBuild.getSeq(), str2, ((HttpsURLConnection) httpURLConnectionA).getSSLSocketFactory(), str, ((HttpsURLConnection) httpURLConnectionA).getHostnameVerifier());
                                                            }
                                                            if (httpURLConnectionA != null) {
                                                                httpURLConnectionA.disconnect();
                                                            }
                                                        } catch (SSLException e19) {
                                                            e = e19;
                                                            sSLException = e;
                                                            anet.channel.strategy.c.a.f29911a.b(requestBuild.getHost());
                                                            a(requestBuild, aVar, requestCb, -402, sSLException);
                                                            ALog.e("awcn.HttpConnector", "connect SSLException", requestBuild.getSeq(), "host", requestBuild.getHost(), sSLException);
                                                            if (httpURLConnectionA instanceof HttpsURLConnection) {
                                                                ALog.e("awcn.HttpConnector", str3, requestBuild.getSeq(), str2, ((HttpsURLConnection) httpURLConnectionA).getSSLSocketFactory(), str, ((HttpsURLConnection) httpURLConnectionA).getHostnameVerifier());
                                                            }
                                                            if (httpURLConnectionA != null) {
                                                                httpURLConnectionA.disconnect();
                                                            }
                                                        }
                                                    } catch (SSLHandshakeException e20) {
                                                        e = e20;
                                                        str = str8;
                                                        sSLHandshakeException = e;
                                                        anet.channel.strategy.c.a.f29911a.b(requestBuild.getHost());
                                                        a(requestBuild, aVar, requestCb, -402, sSLHandshakeException);
                                                        ALog.e("awcn.HttpConnector", "HTTP Connect SSLHandshakeException", requestBuild.getSeq(), "host", requestBuild.getHost(), sSLHandshakeException);
                                                        if (httpURLConnectionA instanceof HttpsURLConnection) {
                                                            ALog.e("awcn.HttpConnector", str3, requestBuild.getSeq(), str2, ((HttpsURLConnection) httpURLConnectionA).getSSLSocketFactory(), str, ((HttpsURLConnection) httpURLConnectionA).getHostnameVerifier());
                                                        }
                                                        if (httpURLConnectionA != null) {
                                                            httpURLConnectionA.disconnect();
                                                        }
                                                        return aVar;
                                                    } catch (SSLException e21) {
                                                        e = e21;
                                                        str = str8;
                                                        sSLException = e;
                                                        anet.channel.strategy.c.a.f29911a.b(requestBuild.getHost());
                                                        a(requestBuild, aVar, requestCb, -402, sSLException);
                                                        ALog.e("awcn.HttpConnector", "connect SSLException", requestBuild.getSeq(), "host", requestBuild.getHost(), sSLException);
                                                        if (httpURLConnectionA instanceof HttpsURLConnection) {
                                                            ALog.e("awcn.HttpConnector", str3, requestBuild.getSeq(), str2, ((HttpsURLConnection) httpURLConnectionA).getSSLSocketFactory(), str, ((HttpsURLConnection) httpURLConnectionA).getHostnameVerifier());
                                                        }
                                                        if (httpURLConnectionA != null) {
                                                            httpURLConnectionA.disconnect();
                                                        }
                                                        return aVar;
                                                    }
                                                } catch (SSLHandshakeException e22) {
                                                    e = e22;
                                                    str3 = str6;
                                                } catch (SSLException e23) {
                                                    e = e23;
                                                    str3 = str6;
                                                }
                                            } catch (Exception e24) {
                                                e = e24;
                                                str7 = str7;
                                            }
                                        } catch (Throwable th3) {
                                            if (httpURLConnectionA == null) {
                                                throw th3;
                                            }
                                            try {
                                                httpURLConnectionA.disconnect();
                                                throw th3;
                                            } catch (Exception e25) {
                                                ALog.e("awcn.HttpConnector", "http disconnect", null, e25, new Object[0]);
                                                throw th3;
                                            }
                                        }
                                    } catch (ConnectException e26) {
                                        a(requestBuild, aVar, requestCb, -406, e26);
                                        ALog.e("awcn.HttpConnector", "HTTP Connect Exception", requestBuild.getSeq(), e26, new Object[0]);
                                        NetworkStatusHelper.printNetworkDetail();
                                        if (httpURLConnectionA != null) {
                                            try {
                                                httpURLConnectionA.disconnect();
                                            } catch (Exception e27) {
                                                ALog.e("awcn.HttpConnector", "http disconnect", null, e27, new Object[0]);
                                            }
                                        }
                                    }
                                } catch (IOException e28) {
                                    a(requestBuild, aVar, requestCb, -404, e28);
                                    ALog.e("awcn.HttpConnector", "IO Exception", requestBuild.getSeq(), "host", requestBuild.getHost(), e28);
                                    NetworkStatusHelper.printNetworkDetail();
                                    if (httpURLConnectionA != null) {
                                        try {
                                            httpURLConnectionA.disconnect();
                                        } catch (Exception e29) {
                                            ALog.e("awcn.HttpConnector", "http disconnect", null, e29, new Object[0]);
                                        }
                                    }
                                }
                            } catch (UnknownHostException e30) {
                                a(requestBuild, aVar, requestCb, -405, e30);
                                ALog.e("awcn.HttpConnector", "Unknown Host Exception", requestBuild.getSeq(), "host", requestBuild.getHost(), e30);
                                NetworkStatusHelper.printNetworkDetail();
                                if (httpURLConnectionA != null) {
                                    try {
                                        httpURLConnectionA.disconnect();
                                    } catch (Exception e31) {
                                        ALog.e("awcn.HttpConnector", "http disconnect", null, e31, new Object[0]);
                                    }
                                }
                            } catch (ConnectTimeoutException e32) {
                                a(requestBuild, aVar, requestCb, ErrorConstant.ERROR_CONN_TIME_OUT, e32);
                                ALog.e("awcn.HttpConnector", "HTTP Connect Timeout", requestBuild.getSeq(), e32, new Object[0]);
                                NetworkStatusHelper.printNetworkDetail();
                                if (httpURLConnectionA != null) {
                                    try {
                                        httpURLConnectionA.disconnect();
                                    } catch (Exception e33) {
                                        ALog.e("awcn.HttpConnector", "http disconnect", null, e33, new Object[0]);
                                    }
                                }
                            }
                        } catch (SSLHandshakeException e34) {
                            e = e34;
                            str = str4;
                            str2 = str5;
                            str3 = str6;
                        } catch (SSLException e35) {
                            e = e35;
                            str = str4;
                            str2 = str5;
                            str3 = str6;
                        }
                    } catch (SocketTimeoutException e36) {
                        a(requestBuild, aVar, requestCb, -401, e36);
                        ALog.e("awcn.HttpConnector", "HTTP Socket Timeout", requestBuild.getSeq(), e36, new Object[0]);
                        NetworkStatusHelper.printNetworkDetail();
                        if (httpURLConnectionA != null) {
                            try {
                                httpURLConnectionA.disconnect();
                            } catch (Exception e37) {
                                ALog.e("awcn.HttpConnector", "http disconnect", null, e37, new Object[0]);
                            }
                        }
                    } catch (CancellationException e38) {
                        a(requestBuild, aVar, requestCb, -204, e38);
                        ALog.e("awcn.HttpConnector", "HTTP Request Cancel", requestBuild.getSeq(), e38, new Object[0]);
                        if (httpURLConnectionA != null) {
                            try {
                                httpURLConnectionA.disconnect();
                            } catch (Exception e39) {
                                ALog.e("awcn.HttpConnector", "http disconnect", null, e39, new Object[0]);
                            }
                        }
                    }
                    exc = e;
                    if (exc.getMessage() != null) {
                        message = exc.getMessage();
                    } else {
                        message = str7;
                    }
                    if (message.contains("not verified")) {
                        anet.channel.strategy.c.a.f29911a.b(requestBuild.getHost());
                        a(requestBuild, aVar, requestCb, -403, exc);
                    } else {
                        a(requestBuild, aVar, requestCb, -101, exc);
                    }
                    ALog.e("awcn.HttpConnector", "HTTP Exception", requestBuild.getSeq(), exc, new Object[0]);
                    if (httpURLConnectionA != null) {
                        httpURLConnectionA.disconnect();
                    }
                } else {
                    a(requestBuild, aVar, requestCb, -200, th2);
                }
                return aVar;
            }
            httpURLConnectionA.disconnect();
        } catch (Exception e40) {
            ALog.e("awcn.HttpConnector", "http disconnect", null, e40, new Object[0]);
        }
        requestBuild.f29773a.contentEncoding = HttpHelper.getSingleHeaderFieldByKey(aVar.f29831c, "Content-Encoding");
        requestBuild.f29773a.contentType = HttpHelper.getSingleHeaderFieldByKey(aVar.f29831c, "Content-Type");
        if ("HEAD".equals(requestBuild.getMethod()) || (i10 = aVar.f29829a) == 304 || i10 == 204 || (i10 >= 100 && i10 < 200)) {
            if (requestCb != null) {
                requestCb.onResponseCode(aVar.f29829a, aVar.f29831c);
            }
            requestBuild.f29773a.rspStart = System.currentTimeMillis();
        } else {
            int contentLength = HttpHelper.parseContentLength(aVar.f29831c);
            aVar.f29832d = contentLength;
            requestBuild.f29773a.contentLength = contentLength;
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(requestBuild.f29773a.contentEncoding);
            aVar.f29833e = zEqualsIgnoreCase;
            if (zEqualsIgnoreCase) {
                aVar.f29831c.remove("Content-Encoding");
                aVar.f29831c.remove("Content-Length");
            }
            if (requestCb != null) {
                requestCb.onResponseCode(aVar.f29829a, aVar.f29831c);
            }
            requestBuild.f29773a.rspStart = System.currentTimeMillis();
            a(httpURLConnectionA, requestBuild, aVar, requestCb);
        }
        RequestStatistic requestStatistic3 = requestBuild.f29773a;
        requestStatistic3.firstDataTime = requestStatistic3.rspStart - requestBuild.f29773a.sendEnd;
        if (!requestBuild.f29773a.isDone.get()) {
            requestBuild.f29773a.ret = 1;
            requestBuild.f29773a.statusCode = aVar.f29829a;
            requestBuild.f29773a.msg = "SUCCESS";
            requestBuild.f29773a.rspEnd = System.currentTimeMillis();
        }
        if (requestCb != null) {
            requestCb.onFinish(aVar.f29829a, "SUCCESS", requestBuild.f29773a);
        }
        return aVar;
    }

    private static HttpURLConnection a(Request request) throws IOException {
        Pair<String, Integer> wifiProxy = NetworkStatusHelper.getWifiProxy();
        Proxy proxy = wifiProxy != null ? new Proxy(Proxy.Type.HTTP, new InetSocketAddress((String) wifiProxy.first, ((Integer) wifiProxy.second).intValue())) : null;
        anet.channel.util.g gVarA = anet.channel.util.g.a();
        if (NetworkStatusHelper.getStatus().isMobile() && gVarA != null) {
            proxy = gVarA.b();
        }
        URL url = request.getUrl();
        HttpURLConnection httpURLConnection = proxy != null ? (HttpURLConnection) url.openConnection(proxy) : (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(request.getConnectTimeout());
        httpURLConnection.setReadTimeout(request.getReadTimeout());
        httpURLConnection.setRequestMethod(request.getMethod());
        if (request.containsBody()) {
            httpURLConnection.setDoOutput(true);
        }
        Map<String, String> headers = request.getHeaders();
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
        }
        String host = headers.get("Host");
        if (host == null) {
            host = request.getHost();
        }
        String strConcatString = request.getHttpUrl().containsNonDefaultPort() ? StringUtils.concatString(host, ":", String.valueOf(request.getHttpUrl().getPort())) : host;
        httpURLConnection.setRequestProperty("Host", strConcatString);
        if (NetworkStatusHelper.getApn().equals("cmwap")) {
            httpURLConnection.setRequestProperty(HttpConstant.X_ONLINE_HOST, strConcatString);
        }
        if (!headers.containsKey("Accept-Encoding")) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        }
        if (gVarA != null) {
            httpURLConnection.setRequestProperty("Authorization", gVarA.c());
        }
        if (url.getProtocol().equalsIgnoreCase("https")) {
            a(httpURLConnection, request, host);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }

    private static void a(Request request, a aVar, RequestCb requestCb, int i10, Throwable th2) {
        String errMsg = ErrorConstant.getErrMsg(i10);
        ALog.e("awcn.HttpConnector", "onException", request.getSeq(), Constants.KEY_ERROR_CODE, Integer.valueOf(i10), "errMsg", errMsg, "url", request.getUrlString(), "host", request.getHost());
        if (aVar != null) {
            aVar.f29829a = i10;
        }
        if (!request.f29773a.isDone.get()) {
            request.f29773a.statusCode = i10;
            request.f29773a.msg = errMsg;
            request.f29773a.rspEnd = System.currentTimeMillis();
            if (i10 != -204) {
                AppMonitor.getInstance().commitStat(new ExceptionStatistic(i10, errMsg, request.f29773a, th2));
            }
        }
        if (requestCb != null) {
            requestCb.onFinish(i10, errMsg, request.f29773a);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, Request request, a aVar, RequestCb requestCb) throws Throwable {
        InputStream errorStream;
        ByteArrayOutputStream byteArrayOutputStream;
        httpURLConnection.getURL().toString();
        anet.channel.util.a aVar2 = null;
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (IOException e10) {
            if (e10 instanceof FileNotFoundException) {
                ALog.w("awcn.HttpConnector", "File not found", request.getSeq(), "url", request.getUrlString());
            }
            try {
                errorStream = httpURLConnection.getErrorStream();
            } catch (Exception e11) {
                ALog.e("awcn.HttpConnector", "get error stream failed.", request.getSeq(), e11, new Object[0]);
                errorStream = null;
            }
        }
        if (errorStream == null) {
            a(request, aVar, requestCb, -404, null);
            return;
        }
        if (requestCb == null) {
            int i10 = aVar.f29832d;
            if (i10 <= 0) {
                i10 = 1024;
            } else if (aVar.f29833e) {
                i10 *= 2;
            }
            byteArrayOutputStream = new ByteArrayOutputStream(i10);
        } else {
            byteArrayOutputStream = null;
        }
        try {
            anet.channel.util.a aVar3 = new anet.channel.util.a(errorStream);
            try {
                InputStream gZIPInputStream = aVar.f29833e ? new GZIPInputStream(aVar3) : aVar3;
                ByteArray byteArrayA = null;
                while (!Thread.currentThread().isInterrupted()) {
                    if (byteArrayA == null) {
                        byteArrayA = anet.channel.bytes.a.C0240a.f29622a.a(2048);
                    }
                    int from = byteArrayA.readFrom(gZIPInputStream);
                    if (from == -1) {
                        if (byteArrayOutputStream != null) {
                            byteArrayA.recycle();
                        } else {
                            requestCb.onDataReceive(byteArrayA, true);
                        }
                        if (byteArrayOutputStream != null) {
                            aVar.f29830b = byteArrayOutputStream.toByteArray();
                        }
                        request.f29773a.recDataTime = System.currentTimeMillis() - request.f29773a.rspStart;
                        request.f29773a.rspBodyDeflateSize = aVar3.a();
                        try {
                            gZIPInputStream.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayA.writeTo(byteArrayOutputStream);
                    } else {
                        requestCb.onDataReceive(byteArrayA, false);
                        byteArrayA = null;
                    }
                    long j10 = from;
                    request.f29773a.recDataSize += j10;
                    request.f29773a.rspBodyInflateSize += j10;
                }
                throw new CancellationException("task cancelled");
            } catch (Throwable th2) {
                th = th2;
                aVar2 = aVar3;
                request.f29773a.recDataTime = System.currentTimeMillis() - request.f29773a.rspStart;
                request.f29773a.rspBodyDeflateSize = aVar2.a();
                try {
                    errorStream.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static void a(HttpURLConnection httpURLConnection, Request request, String str) {
        if (Integer.parseInt(Build.VERSION.SDK) < 8) {
            ALog.e("awcn.HttpConnector", "supportHttps", "[supportHttps]Froyo 以下版本不支持https", new Object[0]);
            return;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
        if (request.getSslSocketFactory() != null) {
            httpsURLConnection.setSSLSocketFactory(request.getSslSocketFactory());
        } else {
            SSLSocketFactory sSLSocketFactory = anet.channel.util.b.f30000a;
            if (sSLSocketFactory != null) {
                httpsURLConnection.setSSLSocketFactory(sSLSocketFactory);
                if (ALog.isPrintLog(2)) {
                    ALog.i("awcn.HttpConnector", "HttpSslUtil", request.getSeq(), "SslSocketFactory", anet.channel.util.b.f30000a);
                }
            }
        }
        if (request.getHostnameVerifier() != null) {
            httpsURLConnection.setHostnameVerifier(request.getHostnameVerifier());
            return;
        }
        HostnameVerifier hostnameVerifier = anet.channel.util.b.f30001b;
        if (hostnameVerifier == null) {
            httpsURLConnection.setHostnameVerifier(new c(str));
            return;
        }
        httpsURLConnection.setHostnameVerifier(hostnameVerifier);
        if (ALog.isPrintLog(2)) {
            ALog.i("awcn.HttpConnector", "HttpSslUtil", request.getSeq(), "HostnameVerifier", anet.channel.util.b.f30001b);
        }
    }
}
