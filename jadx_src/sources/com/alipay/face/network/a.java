package com.alipay.face.network;

import java.util.HashMap;

/* JADX INFO: compiled from: Env.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    private static final String A = "http://mdap.alipaylog.com";
    private static final String B = "http://mdap.alipaylog.com";
    private static final String C = "http://cn-hangzhou-mas-log.cloud.alipay.com/loggw/logUpload.do";
    private static final int D = 4;
    private static final int E = 3;
    private static final int F = 2;
    private static final int G = 0;
    public static final String H = "bid-log-key-public_t.key";
    private static final String I = "bid-log-key-public_t.key";
    private static final String J = "bid-log-key-public_t.key";
    public static final String K = "bid-log-key-public.key";
    private static final String L = "bid-log-key-public.key";
    private static final String M = "bid-log-key-public.key";
    public static final String N = "meta_serializer";
    public static final int O = 1;
    public static final int P = 2;
    public static final a Q;
    public static final a R;
    public static final a S;
    public static final a T;
    public static final a U;
    public static final a V;
    public static final a W;
    private static final HashMap<String, a> X;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f38778g = "dev";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f38779h = "test";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f38780i = "pre";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f38781j = "online";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f38782k = "ant_cloud_pre";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f38783l = "ant_cloud_online";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f38784m = "ant_cloud_sit";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f38785n = "http://mobilegw.aaa.alipay.net/mgw.htm";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f38786o = "http://mobilegw.test.alipay.net/mgw.htm";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f38787p = "https://mobilegwpre.alipay.com/mgw.htm";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f38788q = "https://mobilegw.alipay.com/mgw.htm";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f38789r = "https://cn-hangzhou-mgs-gw.cloud.alipay.com/mgw.htm";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f38790s = "http://openapi.stable.alipay.net/gateway.do";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f38791t = "http://openapi-1-64.test.alipay.net/gateway.do";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f38792u = "https://openapi.prefromoffice.alipay.net/gateway.do";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f38793v = "https://openapi.alipay.com/gateway.do";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f38794w = "http://139.224.138.243/gateway/identification/simulate/face/initialize";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f38795x = "http://139.224.94.200/gateway/identification/simulate/face/initialize";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f38796y = "http://mdap-1-64.test.alipay.net";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f38797z = "http://mdap-1-64.test.alipay.net";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f38799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f38800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f38801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f38803f;

    static {
        a aVar = new a(f38778g, f38785n, f38790s, "http://mdap-1-64.test.alipay.net", 4, H);
        Q = aVar;
        a aVar2 = new a("test", f38786o, f38791t, "http://mdap-1-64.test.alipay.net", 3, H);
        R = aVar2;
        a aVar3 = new a("pre", f38787p, f38792u, "http://mdap.alipaylog.com", 2, "bid-log-key-public.key");
        S = aVar3;
        a aVar4 = new a("online", f38788q, f38793v, "http://mdap.alipaylog.com", 0, "bid-log-key-public.key");
        T = aVar4;
        a aVar5 = new a(f38782k, f38789r, f38794w, C, 2, "bid-log-key-public.key");
        U = aVar5;
        a aVar6 = new a(f38784m, f38789r, f38794w, C, 3, "bid-log-key-public.key");
        V = aVar6;
        a aVar7 = new a(f38783l, f38789r, f38795x, C, 0, "bid-log-key-public.key");
        W = aVar7;
        HashMap<String, a> map = new HashMap<>();
        X = map;
        map.put(aVar.f38798a, aVar);
        map.put(aVar2.f38798a, aVar2);
        map.put(aVar3.f38798a, aVar3);
        map.put(aVar4.f38798a, aVar4);
        map.put(aVar5.f38798a, aVar5);
        map.put(aVar7.f38798a, aVar7);
        map.put(aVar6.f38798a, aVar6);
    }

    public a(String str, String str2, String str3, String str4, int i10, String str5) {
        this.f38798a = str;
        this.f38799b = str2;
        this.f38800c = str3;
        this.f38801d = str4;
        this.f38802e = i10;
        this.f38803f = str5;
    }

    public String toString() {
        return "Env{name='" + this.f38798a + "', publicKeyAssetsName='" + this.f38803f + "'}";
    }
}
