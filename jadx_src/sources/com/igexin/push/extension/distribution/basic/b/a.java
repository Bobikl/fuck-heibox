package com.igexin.push.extension.distribution.basic.b;

import com.igexin.push.core.bean.BaseAction;
import com.umeng.message.common.UPushNotificationChannel;

/* JADX INFO: loaded from: classes6.dex */
public class a extends BaseAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f63917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63918b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f63925i;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f63931o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f63932p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f63919c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f63920d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f63921e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f63922f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f63923g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f63924h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f63926j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f63927k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f63928l = UPushNotificationChannel.DEFAULT_NOTIFICATION_CHANNEL_NAME;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f63929m = UPushNotificationChannel.DEFAULT_NOTIFICATION_CHANNEL_NAME;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f63930n = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f63933q = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f63934r = "";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f63935s = "";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f63936t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f63937u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f63938v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f63939w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f63940x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f63941y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f63942z = null;
    private String A = null;
    private boolean B = true;
    private boolean C = true;
    private int D = 0;
    private int E = 0;

    public boolean A() {
        return this.f63919c;
    }

    public boolean B() {
        return this.f63920d;
    }

    public String C() {
        return this.f63926j;
    }

    public int D() {
        return this.f63927k;
    }

    public boolean E() {
        return this.f63921e;
    }

    public String a() {
        return this.f63933q;
    }

    public void a(int i10) {
        if (i10 > 4 || i10 < 0) {
            i10 = 3;
        }
        this.f63930n = i10;
    }

    public void a(String str) {
        this.f63933q = str;
    }

    public void a(boolean z10) {
        this.f63932p = z10;
    }

    public String b() {
        return this.f63934r;
    }

    public void b(int i10) {
        this.f63936t = i10;
    }

    public void b(String str) {
        this.f63934r = str;
    }

    public void b(boolean z10) {
        this.f63938v = z10;
    }

    public String c() {
        return this.f63935s;
    }

    public void c(int i10) {
        this.f63941y = i10;
    }

    public void c(String str) {
        this.f63935s = str;
    }

    public void c(boolean z10) {
        this.C = z10;
    }

    public void d(int i10) {
        this.E = i10;
    }

    public void d(String str) {
        this.f63928l = str;
    }

    public void d(boolean z10) {
        this.B = z10;
    }

    public boolean d() {
        return this.f63932p;
    }

    public String e() {
        return this.f63928l;
    }

    public void e(int i10) {
        this.D = i10;
    }

    public void e(String str) {
        this.f63929m = str;
    }

    public void e(boolean z10) {
        this.f63919c = z10;
    }

    public String f() {
        return this.f63929m;
    }

    public void f(int i10) {
        this.f63924h = i10;
    }

    public void f(String str) {
        this.f63937u = str;
    }

    public void f(boolean z10) {
        this.f63920d = z10;
    }

    public int g() {
        return this.f63930n;
    }

    public void g(int i10) {
        this.f63931o = i10;
    }

    public void g(String str) {
        this.f63940x = str;
    }

    public void g(boolean z10) {
        this.f63921e = z10;
    }

    public int h() {
        return this.f63936t;
    }

    public void h(int i10) {
        this.f63927k = i10;
    }

    public void h(String str) {
        this.A = str;
    }

    public String i() {
        return this.f63937u;
    }

    public void i(String str) {
        this.f63939w = str;
    }

    public void j(String str) {
        this.f63917a = str;
    }

    public boolean j() {
        return this.f63938v;
    }

    public String k() {
        return this.f63940x;
    }

    public void k(String str) {
        this.f63918b = str;
    }

    public int l() {
        return this.f63941y;
    }

    public void l(String str) {
        this.f63922f = str;
    }

    public String m() {
        return this.A;
    }

    public void m(String str) {
        this.f63923g = str;
    }

    public void n(String str) {
        this.f63942z = str;
    }

    public boolean n() {
        return this.C;
    }

    public int o() {
        return this.E;
    }

    public void o(String str) {
        this.f63925i = str;
    }

    public String p() {
        return this.f63939w;
    }

    public void p(String str) {
        this.f63926j = str;
    }

    public String q() {
        return this.f63917a;
    }

    public String r() {
        return this.f63918b;
    }

    public String s() {
        return this.f63922f;
    }

    public String t() {
        return this.f63923g;
    }

    public String u() {
        return this.f63942z;
    }

    public boolean v() {
        return this.B;
    }

    public int w() {
        return this.D;
    }

    public int x() {
        return this.f63924h;
    }

    public String y() {
        return this.f63925i;
    }

    public int z() {
        return this.f63931o;
    }
}
