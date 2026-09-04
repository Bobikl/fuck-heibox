package com.tencent.beacon.base.net.a;

import android.text.TextUtils;
import androidx.annotation.n0;
import com.tencent.beacon.base.net.RequestType;
import com.tencent.beacon.pack.AbstractJceStruct;
import com.tencent.beacon.pack.RequestPackageV2;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: JceRequestEntity.java */
/* JADX INFO: loaded from: classes4.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RequestType f98878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f98879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f98880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f98881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f98882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f98883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, String> f98884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f98885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f98886i;

    /* JADX INFO: compiled from: JceRequestEntity.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f98887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f98888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f98889c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f98890d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f98891e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private RequestType f98892f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f98893g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Map<String, String> f98894h = new ConcurrentHashMap(5);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Map<String, String> f98895i = new LinkedHashMap(10);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte[] f98896j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private AbstractJceStruct f98897k;

        public a a(int i10) {
            this.f98890d = i10;
            return this;
        }

        public a a(RequestType requestType) {
            this.f98892f = requestType;
            return this;
        }

        public a a(AbstractJceStruct abstractJceStruct) {
            this.f98897k = abstractJceStruct;
            return this;
        }

        public a a(String str) {
            this.f98889c = str;
            return this;
        }

        public a a(String str, int i10) {
            this.f98893g = str;
            this.f98888b = i10;
            return this;
        }

        public a a(@n0 String str, String str2) {
            this.f98894h.put(str, str2);
            return this;
        }

        public a a(Map<String, String> map) {
            if (map != null) {
                this.f98895i.putAll(map);
            }
            return this;
        }

        public m a() {
            if (TextUtils.isEmpty(this.f98887a) && TextUtils.isEmpty(this.f98893g)) {
                throw new IllegalArgumentException("url || domain == null");
            }
            if (TextUtils.isEmpty(this.f98889c)) {
                throw new IllegalArgumentException("appKey == null");
            }
            com.tencent.beacon.base.net.d dVarC = com.tencent.beacon.base.net.d.c();
            this.f98894h.putAll(com.tencent.beacon.base.net.c.d.a());
            if (this.f98892f == RequestType.EVENT) {
                this.f98896j = dVarC.f98934f.c().a((RequestPackageV2) this.f98897k);
            } else {
                AbstractJceStruct abstractJceStruct = this.f98897k;
                this.f98896j = dVarC.f98933e.c().a(com.tencent.beacon.base.net.c.d.a(this.f98890d, abstractJceStruct == null ? "".getBytes() : abstractJceStruct.toByteArray(), this.f98895i, this.f98889c));
            }
            return new m(this.f98892f, this.f98887a, this.f98893g, this.f98888b, this.f98889c, this.f98896j, this.f98894h, this.f98890d, this.f98891e);
        }

        public a b(int i10) {
            this.f98891e = i10;
            return this;
        }

        public a b(String str) {
            this.f98887a = str;
            return this;
        }

        public a b(String str, String str2) {
            if (str2 == null) {
                str2 = "";
            }
            this.f98895i.put(str, str2);
            return this;
        }
    }

    private m(RequestType requestType, String str, String str2, int i10, String str3, byte[] bArr, Map<String, String> map, int i11, int i12) {
        this.f98878a = requestType;
        this.f98879b = str;
        this.f98880c = str2;
        this.f98881d = i10;
        this.f98882e = str3;
        this.f98883f = bArr;
        this.f98884g = map;
        this.f98885h = i11;
        this.f98886i = i12;
    }

    public static a a() {
        return new a();
    }

    public byte[] b() {
        return this.f98883f;
    }

    public String c() {
        return this.f98880c;
    }

    public Map<String, String> d() {
        return this.f98884g;
    }

    public int e() {
        return this.f98881d;
    }

    public int f() {
        return this.f98886i;
    }

    public RequestType g() {
        return this.f98878a;
    }

    public String h() {
        return this.f98879b;
    }

    public String toString() {
        return "JceRequestEntity{type=" + this.f98878a + ", url='" + this.f98879b + "', domain='" + this.f98880c + "', port=" + this.f98881d + ", appKey='" + this.f98882e + "', content.length=" + this.f98883f.length + ", header=" + this.f98884g + ", requestCmd=" + this.f98885h + ", responseCmd=" + this.f98886i + '}';
    }
}
