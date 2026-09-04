package com.alipay.zoloz.android.phone.mrpc.core;

import java.util.ArrayList;
import org.apache.http.HeaderElement;
import org.apache.http.message.BasicHeaderValueParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.CharArrayBuffer;

/* JADX INFO: compiled from: Headers.java */
/* JADX INFO: loaded from: classes6.dex */
public final class f {
    public static final String D = "refresh";
    private static final int F = 1274458357;
    private static final int G = -1132779846;
    private static final int H = 785670158;
    private static final int I = 2095084583;
    private static final int J = -775651618;
    private static final int K = 1901043637;
    private static final int L = 285929373;
    private static final int M = -243037365;
    private static final int N = -301767724;
    private static final int O = -1267267485;
    private static final int P = 1397189435;
    private static final int Q = -1309235404;
    private static final int R = -208775662;
    private static final int S = 150043680;
    private static final int T = 3123477;
    private static final int U = 1237214767;
    private static final int V = -980228804;
    private static final int W = 1085444827;
    private static final int X = -1345594014;
    private static final int Y = 0;
    private static final int Z = 1;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final int f39640a0 = 2;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f39641b0 = 3;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int f39642c0 = 4;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final int f39643d0 = 5;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final int f39644e0 = 6;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final int f39645f0 = 7;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final int f39646g0 = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f39647h = 1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final int f39648h0 = 9;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f39649i = 2;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final int f39650i0 = 10;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f39651j = 0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final int f39652j0 = 11;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f39653k = 0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final int f39654k0 = 12;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f39655l = -1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final int f39656l0 = 13;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final int f39658m0 = 14;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final int f39660n0 = 15;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f39661o = "content-type";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final int f39662o0 = 16;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f39664p0 = 17;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final int f39666q0 = 18;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f39667r = "location";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final int f39668r0 = 19;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f39657m = "transfer-encoding";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f39659n = "content-length";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f39663p = "content-encoding";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f39665q = "connection";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f39669s = "proxy-connection";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f39671t = "www-authenticate";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f39672u = "proxy-authenticate";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f39673v = "content-disposition";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f39674w = "accept-ranges";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f39675x = "expires";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f39676y = "cache-control";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f39677z = "last-modified";
    public static final String A = "etag";
    public static final String B = "set-cookie";
    public static final String C = "pragma";
    public static final String E = "x-permitted-cross-domain-policies";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final String[] f39670s0 = {f39657m, f39659n, "content-type", f39663p, f39665q, "location", f39669s, f39671t, f39672u, f39673v, f39674w, f39675x, f39676y, f39677z, A, B, C, "refresh", E};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList<String> f39681d = new ArrayList<>(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String[] f39682e = new String[19];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<String> f39683f = new ArrayList<>(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList<String> f39684g = new ArrayList<>(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f39678a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f39679b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39680c = 0;

    /* JADX INFO: compiled from: Headers.java */
    public interface a {
        void a(String str, String str2);
    }

    private void w(CharArrayBuffer charArrayBuffer, int i10) {
        if (c.a(charArrayBuffer, i10, "Close")) {
            this.f39680c = 1;
        } else if (c.a(charArrayBuffer, i10, com.google.common.net.c.f58866u0)) {
            this.f39680c = 2;
        }
    }

    public void A(String str) {
        this.f39682e[2] = str;
    }

    public void B(String str) {
        this.f39682e[14] = str;
    }

    public void C(String str) {
        this.f39682e[11] = str;
    }

    public void D(String str) {
        this.f39682e[13] = str;
    }

    public void E(String str) {
        this.f39682e[5] = str;
    }

    public void F(String str) {
        this.f39682e[8] = str;
    }

    public void G(String str) {
        this.f39682e[7] = str;
    }

    public void H(String str) {
        this.f39682e[18] = str;
    }

    public String a() {
        return this.f39682e[10];
    }

    public String b() {
        return this.f39682e[12];
    }

    public int c() {
        return this.f39680c;
    }

    public String d() {
        return this.f39682e[9];
    }

    public String e() {
        return this.f39682e[3];
    }

    public long f() {
        return this.f39679b;
    }

    public String g() {
        return this.f39682e[2];
    }

    public String h() {
        return this.f39682e[14];
    }

    public String i() {
        return this.f39682e[11];
    }

    public void j(a aVar) {
        for (int i10 = 0; i10 < 19; i10++) {
            String str = this.f39682e[i10];
            if (str != null) {
                aVar.a(f39670s0[i10], str);
            }
        }
        int size = this.f39683f.size();
        for (int i11 = 0; i11 < size; i11++) {
            aVar.a(this.f39683f.get(i11), this.f39684g.get(i11));
        }
    }

    public String k() {
        return this.f39682e[13];
    }

    public String l() {
        return this.f39682e[5];
    }

    public String m() {
        return this.f39682e[16];
    }

    public String n() {
        return this.f39682e[8];
    }

    public String o() {
        return this.f39682e[17];
    }

    public ArrayList<String> p() {
        return this.f39681d;
    }

    public long q() {
        return this.f39678a;
    }

    public String r() {
        return this.f39682e[7];
    }

    public String s() {
        return this.f39682e[18];
    }

    public void t(CharArrayBuffer charArrayBuffer) {
        int iB = c.b(charArrayBuffer, 58);
        if (iB == -1) {
        }
        String strSubstringTrimmed = charArrayBuffer.substringTrimmed(0, iB);
        if (strSubstringTrimmed.length() == 0) {
            return;
        }
        int i10 = iB + 1;
        String strSubstringTrimmed2 = charArrayBuffer.substringTrimmed(i10, charArrayBuffer.length());
        switch (strSubstringTrimmed) {
            case "x-permitted-cross-domain-policies":
                this.f39682e[18] = strSubstringTrimmed2;
                break;
            case "expires":
                this.f39682e[11] = strSubstringTrimmed2;
                break;
            case "content-disposition":
                this.f39682e[9] = strSubstringTrimmed2;
                break;
            case "content-length":
                this.f39682e[1] = strSubstringTrimmed2;
                try {
                    this.f39679b = Long.parseLong(strSubstringTrimmed2);
                } catch (NumberFormatException unused) {
                    return;
                }
                break;
            case "pragma":
                this.f39682e[16] = strSubstringTrimmed2;
                break;
            case "connection":
                this.f39682e[4] = strSubstringTrimmed2;
                w(charArrayBuffer, i10);
                break;
            case "proxy-authenticate":
                this.f39682e[8] = strSubstringTrimmed2;
                break;
            case "www-authenticate":
                this.f39682e[7] = strSubstringTrimmed2;
                break;
            case "cache-control":
                String str = this.f39682e[12];
                if (str != null && str.length() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    String[] strArr = this.f39682e;
                    sb2.append(strArr[12]);
                    sb2.append(',');
                    sb2.append(strSubstringTrimmed2);
                    strArr[12] = sb2.toString();
                } else {
                    this.f39682e[12] = strSubstringTrimmed2;
                }
                break;
            case "etag":
                this.f39682e[14] = strSubstringTrimmed2;
                break;
            case "last-modified":
                this.f39682e[13] = strSubstringTrimmed2;
                break;
            case "proxy-connection":
                this.f39682e[6] = strSubstringTrimmed2;
                w(charArrayBuffer, i10);
                break;
            case "content-type":
                this.f39682e[2] = strSubstringTrimmed2;
                break;
            case "refresh":
                this.f39682e[17] = strSubstringTrimmed2;
                break;
            case "set-cookie":
                this.f39682e[15] = strSubstringTrimmed2;
                this.f39681d.add(strSubstringTrimmed2);
                break;
            case "transfer-encoding":
                this.f39682e[0] = strSubstringTrimmed2;
                HeaderElement[] elements = BasicHeaderValueParser.DEFAULT.parseElements(charArrayBuffer, new ParserCursor(i10, charArrayBuffer.length()));
                int length = elements.length;
                if ("identity".equalsIgnoreCase(strSubstringTrimmed2)) {
                    this.f39678a = -1L;
                } else if (length > 0 && "chunked".equalsIgnoreCase(elements[length - 1].getName())) {
                    this.f39678a = -2L;
                } else {
                    this.f39678a = -1L;
                }
                break;
            case "accept-ranges":
                this.f39682e[10] = strSubstringTrimmed2;
                break;
            case "location":
                this.f39682e[5] = strSubstringTrimmed2;
                break;
            case "content-encoding":
                this.f39682e[3] = strSubstringTrimmed2;
                break;
            default:
                this.f39683f.add(strSubstringTrimmed);
                this.f39684g.add(strSubstringTrimmed2);
                break;
        }
    }

    public void u(String str) {
        this.f39682e[10] = str;
    }

    public void v(String str) {
        this.f39682e[12] = str;
    }

    public void x(String str) {
        this.f39682e[9] = str;
    }

    public void y(String str) {
        this.f39682e[3] = str;
    }

    public void z(long j10) {
        this.f39679b = j10;
    }
}
