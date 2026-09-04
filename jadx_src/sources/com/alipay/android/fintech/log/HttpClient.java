package com.alipay.android.fintech.log;

import android.content.Context;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.net.http.AndroidHttpClient;
import android.text.TextUtils;
import android.util.Log;
import com.max.hbpay.PaymentManager;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.util.EntityUtils;
import w4.a;

/* JADX INFO: loaded from: classes6.dex */
public class HttpClient extends BaseHttpClient {
    private static final String TAG = "LogHttpClient";
    private static AndroidHttpClient sAndroidHttpClient;
    private Context mContext;
    private HttpRequest mRequest;
    private long mRequestLength;
    private HttpResponse mResponse;
    private long mResponseLength;
    private String mUrl;

    public HttpClient(String str, Context context) {
        super(str, context);
        this.mRequestLength = -1L;
        this.mResponseLength = -1L;
        this.mContext = context;
        this.mUrl = str;
    }

    private boolean isGzip(HttpResponse httpResponse) {
        Header[] headers;
        String value;
        return (httpResponse == null || (headers = httpResponse.getHeaders("Content-Encoding")) == null || headers.length <= 0 || (value = headers[0].getValue()) == null || value.toLowerCase().indexOf("gzip") <= -1) ? false : true;
    }

    private void prepareHttpClientInstance() {
        if (sAndroidHttpClient == null) {
            synchronized (HttpClient.class) {
                if (sAndroidHttpClient == null) {
                    try {
                        AndroidHttpClient androidHttpClientNewInstance = AndroidHttpClient.newInstance(PaymentManager.f71422u, this.mContext);
                        sAndroidHttpClient = androidHttpClientNewInstance;
                        HttpParams params = androidHttpClientNewInstance.getParams();
                        if (params != null) {
                            params.setParameter("http.connection.timeout", 30000);
                            params.setParameter("http.socket.timeout", Integer.valueOf(a.f140984a));
                        }
                    } catch (Throwable th2) {
                        Log.w(TAG, th2);
                    }
                }
            }
        }
        AndroidHttpClient androidHttpClient = sAndroidHttpClient;
        if (androidHttpClient != null) {
            try {
                HttpParams params2 = androidHttpClient.getParams();
                if (params2 != null) {
                    params2.setParameter("http.route.default-proxy", getProxyHost());
                }
            } catch (Throwable th3) {
                Log.w(TAG, th3);
            }
        }
    }

    @Override // com.alipay.android.fintech.log.BaseHttpClient
    public void closeStreamForNextExecute() {
        InputStream content;
        this.mRequestLength = -1L;
        this.mResponseLength = -1L;
        HttpRequest httpRequest = this.mRequest;
        if (httpRequest != null) {
            try {
                if (httpRequest instanceof HttpGet) {
                    ((HttpGet) httpRequest).abort();
                } else if (httpRequest instanceof HttpPost) {
                    ((HttpPost) httpRequest).abort();
                }
            } catch (Throwable unused) {
            }
            this.mRequest = null;
        }
        HttpResponse httpResponse = this.mResponse;
        if (httpResponse != null) {
            try {
                HttpEntity entity = httpResponse.getEntity();
                if (entity != null && (content = entity.getContent()) != null) {
                    content.close();
                }
            } catch (Throwable unused2) {
            }
            this.mResponse = null;
        }
    }

    public HttpHost getProxyHost() {
        NetworkInfo activeNetworkInfo = NetUtil.getActiveNetworkInfo(this.mContext);
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable() || activeNetworkInfo.getType() != 0) {
            return null;
        }
        try {
            String defaultHost = Proxy.getDefaultHost();
            if (TextUtils.isEmpty(defaultHost)) {
                return null;
            }
            return new HttpHost(defaultHost, Proxy.getDefaultPort());
        } catch (Throwable th2) {
            Log.w(TAG, th2);
            return null;
        }
    }

    public HttpRequest getRequest() {
        return this.mRequest;
    }

    @Override // com.alipay.android.fintech.log.BaseHttpClient
    public long getRequestLength() {
        long j10 = this.mRequestLength;
        if (j10 > 0) {
            return j10;
        }
        HttpRequest httpRequest = this.mRequest;
        if (!(httpRequest instanceof HttpPost)) {
            return -1L;
        }
        try {
            HttpEntity entity = ((HttpPost) httpRequest).getEntity();
            if (entity != null) {
                return entity.getContentLength();
            }
            return -1L;
        } catch (Throwable th2) {
            Log.w(TAG, th2);
            return -1L;
        }
    }

    public HttpResponse getResponse() {
        return this.mResponse;
    }

    @Override // com.alipay.android.fintech.log.BaseHttpClient
    public int getResponseCode() {
        HttpResponse httpResponse = this.mResponse;
        if (httpResponse == null) {
            return -1;
        }
        try {
            StatusLine statusLine = httpResponse.getStatusLine();
            if (statusLine != null) {
                return statusLine.getStatusCode();
            }
            return -1;
        } catch (Throwable th2) {
            Log.w(TAG, th2);
            return -1;
        }
    }

    @Override // com.alipay.android.fintech.log.BaseHttpClient
    public String getResponseContent() {
        HttpResponse httpResponse = this.mResponse;
        if (httpResponse == null) {
            return null;
        }
        try {
            HttpEntity entity = httpResponse.getEntity();
            if (!isGzip(this.mResponse)) {
                if (entity != null) {
                    return EntityUtils.toString(entity);
                }
                return null;
            }
            byte[] bArrUnCompressGzip = ZipUtil.unCompressGzip(this.mResponse.getEntity().getContent());
            if (bArrUnCompressGzip == null) {
                return null;
            }
            this.mResponseLength = bArrUnCompressGzip.length;
            return new String(bArrUnCompressGzip, "UTF-8");
        } catch (Throwable th2) {
            Log.w(TAG, th2);
            return null;
        }
    }

    @Override // com.alipay.android.fintech.log.BaseHttpClient
    public long getResponseLength() {
        long j10 = this.mResponseLength;
        if (j10 > 0) {
            return j10;
        }
        HttpResponse httpResponse = this.mResponse;
        if (httpResponse == null) {
            return -1L;
        }
        try {
            HttpEntity entity = httpResponse.getEntity();
            if (entity != null) {
                return entity.getContentLength();
            }
            return -1L;
        } catch (Throwable th2) {
            Log.w(TAG, th2);
            return -1L;
        }
    }

    public URL getURL() {
        if (TextUtils.isEmpty(this.mUrl)) {
            return null;
        }
        try {
            return new URL(this.mUrl);
        } catch (Throwable th2) {
            Log.w(TAG, th2);
            return null;
        }
    }

    public HttpHost getUrlHost() {
        URL url = getURL();
        if (url == null) {
            return null;
        }
        String host = url.getHost();
        if (TextUtils.isEmpty(host)) {
            return null;
        }
        String protocol = url.getProtocol();
        if (TextUtils.isEmpty(protocol)) {
            return null;
        }
        int port = url.getPort();
        if (port <= 0) {
            port = "https".equalsIgnoreCase(protocol) ? 443 : 80;
        }
        try {
            return new HttpHost(host, port, protocol);
        } catch (Throwable th2) {
            Log.w(TAG, th2);
            return null;
        }
    }

    @Override // com.alipay.android.fintech.log.BaseHttpClient
    public void setContext(Context context) {
        this.mContext = context;
    }

    @Override // com.alipay.android.fintech.log.BaseHttpClient
    public void setUrl(String str) {
        this.mUrl = str;
    }

    @Override // com.alipay.android.fintech.log.BaseHttpClient
    public HttpResponse synchronousRequestByGET(Map<String, String> map) throws IllegalStateException {
        String str;
        closeStreamForNextExecute();
        try {
            String paramStringForGET = NetUtil.formatParamStringForGET(map);
            if (TextUtils.isEmpty(paramStringForGET)) {
                str = this.mUrl;
            } else {
                str = this.mUrl + '?' + paramStringForGET;
            }
            HttpGet httpGet = new HttpGet(str);
            this.mRequest = httpGet;
            httpGet.addHeader("Content-type", "text/xml");
            this.mRequest.addHeader("Accept-Encoding", "gzip");
            prepareHttpClientInstance();
            HttpResponse httpResponseExecute = sAndroidHttpClient.execute(getUrlHost(), this.mRequest);
            this.mResponse = httpResponseExecute;
            return httpResponseExecute;
        } catch (Throwable th2) {
            closeStreamForNextExecute();
            throw new IllegalStateException(th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003e A[Catch: all -> 0x0078, LOOP:0: B:13:0x0038->B:15:0x003e, LOOP_END, TryCatch #0 {all -> 0x0078, blocks: (B:4:0x0005, B:7:0x0009, B:10:0x002a, B:12:0x0030, B:13:0x0038, B:15:0x003e, B:16:0x0056, B:17:0x005d, B:19:0x0068, B:8:0x001f), top: B:24:0x0005, inners: #1 }] */
    @Override // com.alipay.android.fintech.log.BaseHttpClient
    public HttpResponse synchronousRequestByPOST(byte[] bArr, Map<String, String> map) throws IllegalStateException {
        HttpHost urlHost;
        closeStreamForNextExecute();
        if (bArr != null) {
            try {
                if (bArr.length == 0) {
                    this.mRequest = new HttpGet(this.mUrl);
                } else {
                    HttpPost httpPost = new HttpPost(this.mUrl);
                    httpPost.setEntity(new ByteArrayEntity(bArr));
                    this.mRequestLength = bArr.length;
                    this.mRequest = httpPost;
                }
                if (map != null && map.size() > 0) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        this.mRequest.addHeader(entry.getKey(), entry.getValue());
                    }
                }
                prepareHttpClientInstance();
                urlHost = getUrlHost();
                try {
                    this.mResponse = sAndroidHttpClient.execute(urlHost, this.mRequest);
                } catch (NullPointerException unused) {
                    this.mResponse = sAndroidHttpClient.execute(urlHost, this.mRequest, new BasicHttpContext());
                }
            } catch (Throwable unused2) {
                closeStreamForNextExecute();
            }
        } else {
            this.mRequest = new HttpGet(this.mUrl);
            if (map != null) {
                while (r4.hasNext()) {
                    this.mRequest.addHeader(entry.getKey(), entry.getValue());
                }
            }
            prepareHttpClientInstance();
            urlHost = getUrlHost();
            this.mResponse = sAndroidHttpClient.execute(urlHost, this.mRequest);
        }
        return this.mResponse;
    }
}
