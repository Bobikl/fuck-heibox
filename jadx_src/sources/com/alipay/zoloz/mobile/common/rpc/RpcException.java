package com.alipay.zoloz.mobile.common.rpc;

import com.meituan.robust.Constants;

/* JADX INFO: loaded from: classes6.dex */
public class RpcException extends RuntimeException {
    private static final long serialVersionUID = -2875437994101380406L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f39779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f39781d;

    public interface a {
        public static final int A = 4003;
        public static final int B = 5000;
        public static final int C = 6000;
        public static final int D = 6001;
        public static final int E = 6002;
        public static final int F = 6003;
        public static final int G = 6004;
        public static final int H = 6005;
        public static final int I = 6666;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f39782a = 1000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f39783b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f39784c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f39785d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f39786e = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f39787f = 4;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f39788g = 5;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f39789h = 6;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f39790i = 7;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f39791j = 8;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f39792k = 9;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f39793l = 10;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f39794m = 11;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f39795n = 12;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f39796o = 13;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f39797p = 14;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f39798q = 15;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f39799r = 16;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f39800s = 1001;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f39801t = 1002;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f39802u = 2000;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f39803v = 3000;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f39804w = 3001;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f39805x = 3002;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f39806y = 4001;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int f39807z = 4002;
    }

    public RpcException(Integer num, String str) {
        super(c(num, str));
        this.f39780c = num.intValue();
        this.f39781d = str;
    }

    public RpcException(Integer num, String str, Throwable th2) {
        super(c(num, str), th2);
        this.f39780c = num.intValue();
        this.f39781d = str;
    }

    public RpcException(Integer num, Throwable th2) {
        super(th2);
        this.f39780c = num.intValue();
    }

    public RpcException(String str) {
        super(str);
        this.f39780c = 0;
        this.f39781d = str;
    }

    protected static String c(Integer num, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("RPCException: ");
        if (num != null) {
            sb2.append(Constants.ARRAY_TYPE);
            sb2.append(num);
            sb2.append("]");
        }
        sb2.append(" : ");
        if (str != null) {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public int a() {
        return this.f39780c;
    }

    public String b() {
        return this.f39781d;
    }

    public String d() {
        return this.f39779b;
    }

    public void e(String str) {
        this.f39779b = str;
    }
}
