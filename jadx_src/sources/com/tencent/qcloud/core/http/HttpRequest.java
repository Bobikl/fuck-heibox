package com.tencent.qcloud.core.http;

import com.tencent.qcloud.core.auth.QCloudSelfSigner;
import com.tencent.qcloud.core.auth.QCloudSigner;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.util.QCloudStringUtils;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.d;
import okhttp3.s;
import okhttp3.t;
import okhttp3.v;

/* JADX INFO: loaded from: classes4.dex */
public class HttpRequest<T> {
    protected final boolean calculateContentMD5;
    protected final Map<String, List<String>> headers;
    protected final String keyTime;
    protected final String method;
    protected final Set<String> noSignHeaders;
    protected final Set<String> noSignParams;
    protected final Map<String, String> queries;
    protected final b0 requestBody;
    protected final a0.a requestBuilder;
    protected final ResponseBodyConverter<T> responseBodyConverter;
    protected final Object tag;
    protected final URL url;

    public static class Builder<T> {
        boolean calculateContentMD5;
        String keyTime;
        String method;
        RequestBodySerializer requestBodySerializer;
        ResponseBodyConverter<T> responseBodyConverter;
        Object tag;
        Map<String, List<String>> headers = new HashMap(10);
        Map<String, String> queries = new HashMap(10);
        Set<String> noSignHeaderKeys = new HashSet();
        Set<String> noSignParamsKeys = new HashSet();
        boolean isCacheEnabled = true;
        t.a httpUrlBuilder = new t.a();
        a0.a requestBuilder = new a0.a();

        public Builder<T> addHeader(String str, String str2) {
            if (str != null && str2 != null) {
                this.requestBuilder.a(str, str2);
                HttpRequest.addHeaderNameValue(this.headers, str, str2);
            }
            return this;
        }

        public Builder<T> addHeaders(Map<String, List<String>> map) {
            if (map != null) {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    for (String str : entry.getValue()) {
                        if (key != null && str != null) {
                            this.requestBuilder.a(key, str);
                            HttpRequest.addHeaderNameValue(this.headers, key, str);
                        }
                    }
                }
            }
            return this;
        }

        public Builder<T> addHeadersUnsafeNonAscii(Map<String, List<String>> map) {
            if (map != null) {
                s.a aVar = new s.a();
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    for (String str : entry.getValue()) {
                        if (key != null && str != null) {
                            aVar.h(key, str);
                            HttpRequest.addHeaderNameValue(this.headers, key, str);
                        }
                    }
                }
                this.requestBuilder.o(aVar.i());
            }
            return this;
        }

        public Builder<T> addNoSignHeaderKeys(Set<String> set) {
            this.noSignHeaderKeys.addAll(set);
            return this;
        }

        public Builder<T> addNoSignParamKeys(Set<String> set) {
            this.noSignParamsKeys.addAll(set);
            return this;
        }

        public Builder<T> body(RequestBodySerializer requestBodySerializer) {
            this.requestBodySerializer = requestBodySerializer;
            return this;
        }

        public HttpRequest<T> build() {
            prepareBuild();
            return new HttpRequest<>(this);
        }

        public Builder<T> contentMD5() {
            this.calculateContentMD5 = true;
            return this;
        }

        public Builder<T> converter(ResponseBodyConverter<T> responseBodyConverter) {
            this.responseBodyConverter = responseBodyConverter;
            return this;
        }

        public Builder<T> encodedQuery(String str) {
            this.httpUrlBuilder.m(str);
            return this;
        }

        public Builder<T> encodedQuery(String str, String str2) {
            if (str != null) {
                this.queries.put(str, str2);
                this.httpUrlBuilder.c(str, str2);
            }
            return this;
        }

        public Builder<T> encodedQuery(Map<String, String> map) {
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        this.queries.put(key, entry.getValue());
                        this.httpUrlBuilder.c(key, entry.getValue());
                    }
                }
            }
            return this;
        }

        public Set<String> getNoSignHeaderKeys() {
            return this.noSignHeaderKeys;
        }

        public Set<String> getNoSignParamsKeys() {
            return this.noSignParamsKeys;
        }

        public Builder<T> host(String str) {
            this.httpUrlBuilder.x(str);
            return this;
        }

        public Builder<T> method(String str) {
            this.method = str;
            return this;
        }

        public Builder<T> path(String str) {
            if (str.startsWith("/")) {
                str = str.substring(1);
            }
            if (str.length() > 0) {
                this.httpUrlBuilder.e(str);
            }
            return this;
        }

        public Builder<T> port(int i10) {
            this.httpUrlBuilder.D(i10);
            return this;
        }

        protected void prepareBuild() {
            this.requestBuilder.D(this.httpUrlBuilder.h());
            if (!this.isCacheEnabled) {
                this.requestBuilder.c(d.f132451n);
            }
            if (this.responseBodyConverter == null) {
                this.responseBodyConverter = (ResponseBodyConverter<T>) ResponseBodyConverter.string();
            }
        }

        public Builder<T> query(String str, String str2) {
            if (str != null) {
                this.queries.put(str, str2);
                this.httpUrlBuilder.g(str, str2);
            }
            return this;
        }

        public Builder<T> query(Map<String, String> map) {
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        this.queries.put(key, entry.getValue());
                        this.httpUrlBuilder.g(key, entry.getValue());
                    }
                }
            }
            return this;
        }

        public Builder<T> removeHeader(String str) {
            this.requestBuilder.t(str);
            this.headers.remove(str);
            return this;
        }

        public Builder<T> scheme(String str) {
            this.httpUrlBuilder.M(str);
            return this;
        }

        public Builder<T> setKeyTime(String str) {
            this.keyTime = str;
            return this;
        }

        public Builder<T> setUseCache(boolean z10) {
            this.isCacheEnabled = z10;
            return this;
        }

        public Builder<T> tag(Object obj) {
            this.tag = obj;
            return this;
        }

        public Builder<T> url(URL url) {
            t tVarE = t.E(url);
            if (tVarE != null) {
                this.httpUrlBuilder = tVarE.H();
                return this;
            }
            throw new IllegalArgumentException("url is not legal : " + url);
        }

        public Builder<T> userAgent(String str) {
            this.requestBuilder.a("User-Agent", str);
            HttpRequest.addHeaderNameValue(this.headers, "User-Agent", str);
            return this;
        }
    }

    HttpRequest(Builder<T> builder) {
        a0.a aVar = builder.requestBuilder;
        this.requestBuilder = aVar;
        this.responseBodyConverter = builder.responseBodyConverter;
        this.headers = builder.headers;
        this.queries = builder.queries;
        this.noSignHeaders = builder.noSignHeaderKeys;
        this.noSignParams = builder.noSignParamsKeys;
        this.keyTime = builder.keyTime;
        this.method = builder.method;
        this.calculateContentMD5 = builder.calculateContentMD5;
        Object obj = builder.tag;
        if (obj == null) {
            this.tag = toString();
        } else {
            this.tag = obj;
        }
        this.url = builder.httpUrlBuilder.h().a0();
        RequestBodySerializer requestBodySerializer = builder.requestBodySerializer;
        if (requestBodySerializer != null) {
            this.requestBody = requestBodySerializer.body();
        } else {
            this.requestBody = null;
        }
        aVar.p(builder.method, this.requestBody);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void addHeaderNameValue(Map<String, List<String>> map, String str, String str2) {
        List<String> arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>(2);
            map.put(str, arrayList);
        }
        arrayList.add(str2.trim());
    }

    public void addHeader(String str, String str2) {
        List<String> list = this.headers.get(str);
        if (list == null || list.size() < 1) {
            this.requestBuilder.a(str, str2);
            addHeaderNameValue(this.headers, str, str2);
        }
    }

    public void addQuery(String str, String str2) {
        if (str != null) {
            this.queries.put(str, str2);
        }
    }

    public a0 buildRealRequest() {
        return this.requestBuilder.b();
    }

    public long contentLength() throws IOException {
        b0 b0Var = this.requestBody;
        if (b0Var == null) {
            return -1L;
        }
        return b0Var.contentLength();
    }

    public String contentType() {
        v vVarContentType;
        b0 b0Var = this.requestBody;
        if (b0Var == null || (vVarContentType = b0Var.getF132381b()) == null) {
            return null;
        }
        return vVarContentType.getMediaType();
    }

    public String getKeyTime() {
        return this.keyTime;
    }

    public Set<String> getNoSignHeaders() {
        return this.noSignHeaders;
    }

    public Set<String> getNoSignParams() {
        return this.noSignParams;
    }

    QCloudSelfSigner getQCloudSelfSigner() throws QCloudClientException {
        return null;
    }

    QCloudSigner getQCloudSigner() throws QCloudClientException {
        return null;
    }

    public b0 getRequestBody() {
        return this.requestBody;
    }

    public ResponseBodyConverter<T> getResponseBodyConverter() {
        return this.responseBodyConverter;
    }

    public String header(String str) {
        List<String> list = this.headers.get(str);
        if (list != null) {
            return list.get(0);
        }
        return null;
    }

    public Map<String, List<String>> headers() {
        return this.headers;
    }

    public String host() {
        return this.url.getHost();
    }

    public String method() {
        return this.method;
    }

    public Map<String, String> queries() {
        return this.queries;
    }

    public void removeHeader(String str) {
        this.requestBuilder.t(str);
        this.headers.remove(str);
    }

    public void setOkHttpRequestTag(String str) {
        this.requestBuilder.A(str);
    }

    public void setUrl(String str) {
        this.requestBuilder.B(str);
    }

    public boolean shouldCalculateContentMD5() {
        return this.calculateContentMD5 && QCloudStringUtils.isEmpty(header("Content-MD5"));
    }

    public Object tag() {
        return this.tag;
    }

    public URL url() {
        return this.url;
    }
}
