package com.tencent.qimei.r;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.p0;
import com.tencent.qimei.log.IObservableLog;
import com.tencent.qimei.sdk.IAsyncQimeiListener;
import com.tencent.qimei.sdk.IQimeiSDK;
import com.tencent.qimei.sdk.Qimei;
import com.tencent.qimei.sdk.QimeiSDK;
import com.tencent.qimei.sdk.debug.IDebugger;
import com.tencent.qimei.strategy.terminal.ITerminalStrategy;
import com.tencent.qimei.upload.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: QimeiSDKInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public class n implements IQimeiSDK, com.tencent.qimei.u.b, com.tencent.qimei.u.c, com.tencent.qimei.h.b, com.tencent.qimei.v.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, n> f101414a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f101415b = QimeiSDK.class.getCanonicalName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f101417d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IDebugger f101423j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<IAsyncQimeiListener> f101416c = Collections.synchronizedList(new ArrayList(8));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f101418e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f101419f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f101420g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f101421h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap<String, String> f101422i = new HashMap<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.tencent.qimei.x.b f101424k = new com.tencent.qimei.x.b();

    public n(String str) {
        this.f101417d = str;
        this.f101423j = new com.tencent.qimei.s.a(str);
    }

    public static synchronized IQimeiSDK a(String str) {
        n nVar;
        Map<String, n> map = f101414a;
        nVar = map.get(str);
        if (nVar == null) {
            nVar = new n(str);
            map.put(str, nVar);
        }
        return nVar;
    }

    @Override // com.tencent.qimei.u.b
    public String D() {
        Qimei qimei = getQimei();
        return qimei == null ? "" : qimei.getQimei36();
    }

    @Override // com.tencent.qimei.u.b
    public String E() {
        return this.f101420g;
    }

    @Override // com.tencent.qimei.u.c
    @p0
    public Context F() {
        if (this.f101418e == null) {
            com.tencent.qimei.n.a.b("SDK_INIT", "Context has been destroyed!!", new Object[0]);
        }
        return this.f101418e;
    }

    @Override // com.tencent.qimei.u.b
    public String G() {
        return new JSONObject(this.f101422i).toString();
    }

    @Override // com.tencent.qimei.u.b
    public String H() {
        return this.f101421h;
    }

    @Override // com.tencent.qimei.u.b
    public void I() {
        synchronized (this.f101416c) {
            Qimei qimei = getQimei();
            if (qimei != null && !qimei.isEmpty()) {
                Iterator<IAsyncQimeiListener> it = this.f101416c.iterator();
                while (it.hasNext()) {
                    it.next().onQimeiDispatch(qimei);
                }
                this.f101416c.clear();
            }
        }
    }

    @Override // com.tencent.qimei.u.b
    public String J() {
        Qimei qimei = getQimei();
        return qimei == null ? "" : qimei.getQimei16();
    }

    @Override // com.tencent.qimei.u.c
    public String K() {
        return com.tencent.qimei.p.b.a().b();
    }

    @Override // com.tencent.qimei.h.b
    public void a() {
        g();
    }

    public final void a(IAsyncQimeiListener iAsyncQimeiListener) {
        synchronized (this.f101416c) {
            if (!this.f101416c.contains(iAsyncQimeiListener)) {
                this.f101416c.add(iAsyncQimeiListener);
            }
        }
    }

    @Override // com.tencent.qimei.sdk.IQimeiSDK
    public IQimeiSDK addUserId(String str, String str2) {
        this.f101422i.put(str, str2);
        return this;
    }

    @Override // com.tencent.qimei.h.b
    public void b() {
    }

    @Override // com.tencent.qimei.v.k
    public void c() {
        b.a(this.f101417d).e();
    }

    public final synchronized boolean d() {
        if (TextUtils.isEmpty(this.f101417d)) {
            throw new AssertionError("Assertion failed: AppKey Forgot Set!");
        }
        return this.f101418e != null;
    }

    public final void e() {
        com.tencent.qimei.u.d.a(this);
        a.a().a(this.f101418e);
        com.tencent.qimei.u.a.a(this, this.f101417d);
        com.tencent.qimei.k.f fVarB = com.tencent.qimei.k.f.b(this.f101417d);
        Context context = this.f101418e;
        String str = f101415b;
        fVarB.a(context, str);
        b.a(this.f101417d).a(this.f101418e);
        com.tencent.qimei.v.d.a(this.f101418e, this.f101417d, this.f101424k, this);
        com.tencent.qimei.q.j.a().a(this.f101418e);
        com.tencent.qimei.d.a.a(this.f101417d);
        com.tencent.qimei.h.a.a(this.f101418e, this);
        if (!com.tencent.qimei.m.b.b().a(this.f101418e, str)) {
            com.tencent.qimei.q.c.c(this.f101417d);
        }
        com.tencent.qimei.o.d.a(this.f101417d).a(new l(this));
    }

    public final synchronized boolean f() {
        boolean z10;
        z10 = d() && this.f101419f;
        if (!z10) {
            com.tencent.qimei.n.a.a("SDK_INIT", "appkey:%s 未初始化", this.f101417d);
        }
        return z10;
    }

    public final void g() {
        boolean z10;
        if (p.k(this.f101417d)) {
            z10 = true;
        } else {
            if (!p.l(this.f101417d)) {
                com.tencent.qimei.n.a.b("SDK_INIT ｜ QIMEI", "无需更新QIMEI(appKey: %s)", this.f101417d);
                I();
                return;
            }
            z10 = !p.b(this.f101417d, this.f101418e);
        }
        if (z10) {
            com.tencent.qimei.c.a.a().a(j.a(this.f101417d));
            return;
        }
        int iA = p.a(this.f101417d);
        com.tencent.qimei.c.a.a().a(iA, j.a(this.f101417d));
        com.tencent.qimei.n.a.b("SDK_INIT ｜ QIMEI", "错峰%d,更新QIMEI(appKey: %s)", Integer.valueOf(iA), this.f101417d);
    }

    @Override // com.tencent.qimei.sdk.IQimeiSDK
    public String getBeaconTicket() {
        return !f() ? "" : p.g(this.f101417d);
    }

    @Override // com.tencent.qimei.sdk.IQimeiSDK
    public IDebugger getDebugger() {
        return this.f101423j;
    }

    @Override // com.tencent.qimei.sdk.IQimeiSDK
    public Qimei getQimei() {
        if (f()) {
            return p.c(this.f101417d);
        }
        return null;
    }

    @Override // com.tencent.qimei.sdk.IQimeiSDK
    public synchronized void getQimei(IAsyncQimeiListener iAsyncQimeiListener) {
        if (f()) {
            com.tencent.qimei.c.a.a().a(new k(this, iAsyncQimeiListener));
        } else {
            a(iAsyncQimeiListener);
        }
    }

    @Override // com.tencent.qimei.sdk.IQimeiSDK, com.tencent.qimei.u.c
    public String getSdkVersion() {
        return BuildConfig.SDK_VERSION;
    }

    @Override // com.tencent.qimei.sdk.IQimeiSDK
    public ITerminalStrategy getStrategy() {
        return this.f101424k.D();
    }

    @Override // com.tencent.qimei.sdk.IQimeiSDK
    public String getToken() {
        return !f() ? "" : r.a(this.f101417d).a();
    }

    public final void h() {
        getQimei(new m(this));
    }

    @Override // com.tencent.qimei.sdk.IQimeiSDK
    public synchronized boolean init(Context context) {
        if (this.f101419f) {
            return true;
        }
        com.tencent.qimei.n.a.b("SDK_INIT", "\n\n\n\n_____________________________________\n< Welcome to QimeiSDK! Your AppKey is: %s >\n -------------------------------------\n        \\   ^__^\n         \\  (oo)\\_______\n            (__)\\       )\\/\\\n                ||----w |\n                ||     || \n\n\n\n", this.f101417d);
        this.f101418e = context;
        if (!d()) {
            com.tencent.qimei.n.a.a("SDK_INIT", "appkey:%s 参数异常", this.f101417d);
            return false;
        }
        e();
        com.tencent.qimei.n.a.b("SDK_INIT", "\n\n\n\n\t\t\t\t ----- 初始化结束! From appkey:%s ----- \n\n\n\n\t\t\t\t", this.f101417d);
        this.f101419f = true;
        return true;
    }

    @Override // com.tencent.qimei.sdk.IQimeiSDK
    public boolean isQimeiValid(String str, String str2) {
        return true;
    }

    @Override // com.tencent.qimei.sdk.IQimeiSDK
    public IQimeiSDK setAppVersion(String str) {
        com.tencent.qimei.d.a.d(str);
        return this;
    }

    @Override // com.tencent.qimei.sdk.IQimeiSDK
    public IQimeiSDK setChannelID(String str) {
        this.f101420g = str;
        return this;
    }

    @Override // com.tencent.qimei.sdk.IQimeiSDK
    public synchronized IQimeiSDK setLogAble(boolean z10) {
        com.tencent.qimei.n.a.a(z10);
        com.tencent.qimei.n.a.b(z10);
        return this;
    }

    @Override // com.tencent.qimei.sdk.IQimeiSDK
    public synchronized IQimeiSDK setLogObserver(IObservableLog iObservableLog) {
        com.tencent.qimei.n.a.a(iObservableLog);
        return this;
    }

    @Override // com.tencent.qimei.sdk.IQimeiSDK
    public IQimeiSDK setSdkName(String str) {
        if (!this.f101419f) {
            this.f101421h = str;
        }
        return this;
    }
}
