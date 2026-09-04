package com.tencent.beacon.base.net.a;

import android.text.TextUtils;
import androidx.annotation.n0;
import com.tencent.beacon.base.net.BodyType;
import com.tencent.beacon.base.net.HttpMethod;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: HttpRequestEntity.java */
/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f98854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HttpMethod f98855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, String> f98856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, String> f98857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f98858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BodyType f98859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f98860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f98861h;

    /* JADX INFO: compiled from: HttpRequestEntity.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HttpMethod f98862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f98863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f98864c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Map<String, String> f98865d = new HashMap(3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map<String, String> f98866e = new HashMap(3);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f98867f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private BodyType f98868g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private byte[] f98869h;

        private void a(BodyType bodyType) {
            if (this.f98868g == null) {
                this.f98868g = bodyType;
            }
            if (this.f98868g != bodyType) {
                throw new IllegalStateException("bodyType already set!");
            }
        }

        public a a(HttpMethod httpMethod) {
            this.f98862a = httpMethod;
            return this;
        }

        public a a(String str) {
            this.f98864c = str;
            return this;
        }

        public a a(@n0 Map<String, String> map) {
            a(BodyType.FORM);
            this.f98865d.putAll(map);
            return this;
        }

        public f a() {
            if (this.f98862a == null) {
                throw new NullPointerException("request method == null");
            }
            if (TextUtils.isEmpty(this.f98863b)) {
                throw new NullPointerException("request url == null!");
            }
            BodyType bodyType = this.f98868g;
            if (bodyType == null) {
                throw new NullPointerException("bodyType == null");
            }
            int i10 = e.f98853a[bodyType.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3 && this.f98869h == null) {
                        throw new NullPointerException("data request body == null");
                    }
                } else if (this.f98865d.isEmpty()) {
                    throw new NullPointerException("form request body == null");
                }
            } else if (TextUtils.isEmpty(this.f98867f)) {
                throw new NullPointerException("json request body == null");
            }
            return new f(this.f98862a, this.f98863b, this.f98866e, this.f98868g, this.f98867f, this.f98865d, this.f98869h, this.f98864c, null);
        }

        public a b(@n0 String str) {
            this.f98863b = str;
            return this;
        }
    }

    private f(HttpMethod httpMethod, String str, Map<String, String> map, BodyType bodyType, String str2, Map<String, String> map2, byte[] bArr, String str3) {
        this.f98855b = httpMethod;
        this.f98854a = str;
        this.f98856c = map;
        this.f98859f = bodyType;
        this.f98860g = str2;
        this.f98857d = map2;
        this.f98861h = bArr;
        this.f98858e = str3;
    }

    /* synthetic */ f(HttpMethod httpMethod, String str, Map map, BodyType bodyType, String str2, Map map2, byte[] bArr, String str3, e eVar) {
        this(httpMethod, str, map, bodyType, str2, map2, bArr, str3);
    }

    public static a b() {
        return new a();
    }

    public BodyType a() {
        return this.f98859f;
    }

    public byte[] c() {
        return this.f98861h;
    }

    public Map<String, String> d() {
        return this.f98857d;
    }

    public Map<String, String> e() {
        return this.f98856c;
    }

    public String f() {
        return this.f98860g;
    }

    public HttpMethod g() {
        return this.f98855b;
    }

    public String h() {
        return this.f98858e;
    }

    public String i() {
        return this.f98854a;
    }

    public String toString() {
        return "HttpRequestEntity{url='" + this.f98854a + "', method=" + this.f98855b + ", headers=" + this.f98856c + ", formParams=" + this.f98857d + ", bodyType=" + this.f98859f + ", json='" + this.f98860g + "', tag='" + this.f98858e + "'}";
    }
}
