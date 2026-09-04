package l5;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z5.e;
import z5.h;
import z5.l;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static final String A0 = "cfg_max_time";
    public static final String B0 = "get_oa_id";
    public static final String C0 = "notifyFailApp";
    public static final String D0 = "startactivity_in_ui_thread";
    public static final String E = "DynCon";
    public static final String E0 = "scheme_pay_2";
    public static final int F = 10000;
    public static final String F0 = "intercept_batch";
    public static final String G = "https://h5.m.taobao.com/mlapp/olist.html";
    public static final String G0 = "bind_with_startActivity";
    public static final int H = 10;
    public static final String H0 = "startActivity_InsteadOf_Scheme";
    public static final boolean I = true;
    public static final String I0 = "enableStartActivityFallback";
    public static final boolean J = true;
    public static final String J0 = "enableBindExFallback";
    public static final boolean K = false;
    public static a K0 = null;
    public static final boolean L = true;
    public static final boolean M = true;
    public static final String N = "";
    public static final boolean O = false;
    public static final boolean P = false;
    public static final boolean Q = false;
    public static final boolean R = false;
    public static final boolean S = true;
    public static final String T = "";
    public static final boolean U = false;
    public static final boolean V = false;
    public static final boolean W = false;
    public static final int X = 1000;
    public static final boolean Y = true;
    public static final String Z = "";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final boolean f130832a0 = false;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final boolean f130833b0 = false;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final boolean f130834c0 = false;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f130835d0 = 1000;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f130836e0 = 20000;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final boolean f130837f0 = false;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f130838g0 = "alipay_cashier_dynamic_config";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f130839h0 = "timeout";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f130840i0 = "h5_port_degrade";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f130841j0 = "st_sdk_config";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f130842k0 = "tbreturl";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final String f130843l0 = "launchAppSwitch";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final String f130844m0 = "configQueryInterval";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final String f130845n0 = "deg_log_mcgw";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final String f130846o0 = "deg_start_srv_first";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String f130847p0 = "prev_jump_dual";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String f130848q0 = "use_sc_only";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f130849r0 = "retry_aidl_activity_not_start";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f130850s0 = "bind_use_imp";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String f130851t0 = "retry_bnd_once";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final String f130852u0 = "skip_trans";

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final String f130853v0 = "start_trans";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final String f130854w0 = "up_before_pay";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final String f130855x0 = "lck_k";

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final String f130856y0 = "use_sc_lck_a";

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final String f130857z0 = "utdid_factor";
    public JSONObject A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f130858a = 10000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f130859b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f130860c = G;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f130861d = 10;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f130862e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f130863f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f130864g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f130865h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f130866i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f130867j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f130868k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f130869l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f130870m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f130871n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f130872o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f130873p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f130874q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f130875r = "";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f130876s = "";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f130877t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f130878u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f130879v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f130880w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f130881x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f130882y = 1000;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f130883z = false;
    public boolean B = true;
    public List<b> C = null;
    public int D = -1;

    /* JADX INFO: renamed from: l5.a$a, reason: collision with other inner class name */
    public class RunnableC1197a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x5.a f130884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f130885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f130886d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f130887e;

        public RunnableC1197a(x5.a aVar, Context context, boolean z10, int i10) {
            this.f130884b = aVar;
            this.f130885c = context;
            this.f130886d = z10;
            this.f130887e = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                r5.b bVarH = new t5.b().h(this.f130884b, this.f130885c);
                if (bVarH != null) {
                    a.this.m(this.f130884b, bVarH.a());
                    a.this.k(x5.a.w());
                    h5.a.c(this.f130884b, h5.b.f119113l, "offcfg|" + this.f130886d + "|" + this.f130887e);
                }
            } catch (Throwable th2) {
                e.d(th2);
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f130889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f130890b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f130891c;

        public b(String str, int i10, String str2) {
            this.f130889a = str;
            this.f130890b = i10;
            this.f130891c = str2;
        }

        public static List<b> a(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                b bVarB = b(jSONArray.optJSONObject(i10));
                if (bVarB != null) {
                    arrayList.add(bVarB);
                }
            }
            return arrayList;
        }

        public static b b(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            return new b(jSONObject.optString("pn"), jSONObject.optInt("v", 0), jSONObject.optString("pk"));
        }

        public static JSONArray c(List<b> list) {
            if (list == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<b> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(d(it.next()));
            }
            return jSONArray;
        }

        public static JSONObject d(b bVar) {
            if (bVar == null) {
                return null;
            }
            try {
                return new JSONObject().put("pn", bVar.f130889a).put("v", bVar.f130890b).put("pk", bVar.f130891c);
            } catch (JSONException e10) {
                e.d(e10);
                return null;
            }
        }

        public String toString() {
            return String.valueOf(d(this));
        }
    }

    private int c() {
        return this.f130882y;
    }

    public static a d() {
        if (K0 == null) {
            a aVar = new a();
            K0 = aVar;
            aVar.H();
        }
        return K0;
    }

    private JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f130839h0, y());
        jSONObject.put(f130840i0, M());
        jSONObject.put(f130842k0, F());
        jSONObject.put(f130844m0, r());
        jSONObject.put(f130843l0, b.c(z()));
        jSONObject.put(E0, w());
        jSONObject.put(F0, v());
        jSONObject.put(f130845n0, s());
        jSONObject.put(f130846o0, t());
        jSONObject.put(f130847p0, A());
        jSONObject.put(f130848q0, u());
        jSONObject.put(f130850s0, p());
        jSONObject.put(f130851t0, B());
        jSONObject.put(f130852u0, D());
        jSONObject.put(f130853v0, b());
        jSONObject.put(f130854w0, G());
        jSONObject.put(f130856y0, C());
        jSONObject.put(f130855x0, x());
        jSONObject.put(G0, q());
        jSONObject.put(H0, E());
        jSONObject.put(f130849r0, a());
        jSONObject.put(A0, c());
        jSONObject.put(B0, L());
        jSONObject.put(C0, J());
        jSONObject.put(I0, K());
        jSONObject.put(J0, I());
        jSONObject.put(D0, N());
        jSONObject.put(z5.a.f141850b, f());
        return jSONObject;
    }

    private void g(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            j(new JSONObject(str));
        } catch (Throwable th2) {
            e.d(th2);
        }
    }

    private void j(JSONObject jSONObject) {
        this.f130858a = jSONObject.optInt(f130839h0, 10000);
        this.f130859b = jSONObject.optBoolean(f130840i0, false);
        this.f130860c = jSONObject.optString(f130842k0, G).trim();
        this.f130861d = jSONObject.optInt(f130844m0, 10);
        this.C = b.a(jSONObject.optJSONArray(f130843l0));
        this.f130862e = jSONObject.optBoolean(E0, true);
        this.f130863f = jSONObject.optBoolean(F0, true);
        this.f130866i = jSONObject.optBoolean(f130845n0, false);
        this.f130867j = jSONObject.optBoolean(f130846o0, true);
        this.f130868k = jSONObject.optBoolean(f130847p0, true);
        this.f130869l = jSONObject.optString(f130848q0, "");
        this.f130870m = jSONObject.optBoolean(f130850s0, false);
        this.f130871n = jSONObject.optBoolean(f130851t0, false);
        this.f130872o = jSONObject.optBoolean(f130852u0, false);
        this.f130873p = jSONObject.optBoolean(f130853v0, false);
        this.f130874q = jSONObject.optBoolean(f130854w0, true);
        this.f130875r = jSONObject.optString(f130855x0, "");
        this.f130880w = jSONObject.optBoolean(f130856y0, false);
        this.f130881x = jSONObject.optBoolean(f130849r0, false);
        this.f130883z = jSONObject.optBoolean(C0, false);
        this.f130876s = jSONObject.optString(G0, "");
        this.f130877t = jSONObject.optBoolean(H0, false);
        this.f130882y = jSONObject.optInt(A0, 1000);
        this.B = jSONObject.optBoolean(B0, true);
        this.f130878u = jSONObject.optBoolean(I0, false);
        this.f130879v = jSONObject.optBoolean(J0, false);
        this.f130864g = jSONObject.optBoolean(D0, false);
        this.A = jSONObject.optJSONObject(z5.a.f141850b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(x5.a aVar) {
        try {
            JSONObject jSONObjectE = e();
            h.e(aVar, x5.b.e().c(), f130838g0, jSONObjectE.toString());
        } catch (Exception e10) {
            e.d(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(x5.a aVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(f130841j0);
            z5.a.e(aVar, jSONObjectOptJSONObject, z5.a.b(aVar, jSONObject));
            if (jSONObjectOptJSONObject != null) {
                j(jSONObjectOptJSONObject);
            } else {
                e.j(E, "empty config");
            }
        } catch (Throwable th2) {
            e.d(th2);
        }
    }

    public boolean A() {
        return this.f130868k;
    }

    public boolean B() {
        return this.f130871n;
    }

    public boolean C() {
        return this.f130880w;
    }

    public boolean D() {
        return this.f130872o;
    }

    public boolean E() {
        return this.f130877t;
    }

    public String F() {
        return this.f130860c;
    }

    public boolean G() {
        return this.f130874q;
    }

    public void H() {
        Context contextC = x5.b.e().c();
        String strB = h.b(x5.a.w(), contextC, f130838g0, null);
        try {
            this.D = Integer.parseInt(h.b(x5.a.w(), contextC, f130857z0, "-1"));
        } catch (Exception unused) {
        }
        g(strB);
    }

    public boolean I() {
        return this.f130879v;
    }

    public boolean J() {
        return this.f130883z;
    }

    public boolean K() {
        return this.f130878u;
    }

    public boolean L() {
        return this.B;
    }

    public boolean M() {
        return this.f130859b;
    }

    public boolean N() {
        return this.f130864g;
    }

    public boolean a() {
        return this.f130881x;
    }

    public boolean b() {
        return this.f130873p;
    }

    public JSONObject f() {
        return this.A;
    }

    public void l(x5.a aVar, Context context, boolean z10, int i10) {
        h5.a.c(aVar, h5.b.f119113l, "oncfg|" + z10 + "|" + i10);
        RunnableC1197a runnableC1197a = new RunnableC1197a(aVar, context, z10, i10);
        if (!z10 || l.d0()) {
            Thread thread = new Thread(runnableC1197a);
            thread.setName("AlipayDCP");
            thread.start();
            return;
        }
        int iC = c();
        if (l.v(iC, runnableC1197a, "AlipayDCPBlok")) {
            return;
        }
        h5.a.i(aVar, h5.b.f119113l, h5.b.f119116m0, "" + iC);
    }

    public void n(boolean z10) {
        this.f130865h = z10;
    }

    public boolean o(Context context, int i10) {
        if (this.D == -1) {
            this.D = l.a();
            h.e(x5.a.w(), context, f130857z0, String.valueOf(this.D));
        }
        return this.D < i10;
    }

    public boolean p() {
        return this.f130870m;
    }

    public String q() {
        return this.f130876s;
    }

    public int r() {
        return this.f130861d;
    }

    public boolean s() {
        return this.f130866i;
    }

    public boolean t() {
        return this.f130867j;
    }

    public String u() {
        return this.f130869l;
    }

    public boolean v() {
        return this.f130863f;
    }

    public boolean w() {
        return this.f130862e;
    }

    public String x() {
        return this.f130875r;
    }

    public int y() {
        int i10 = this.f130858a;
        if (i10 < 1000 || i10 > 20000) {
            e.g(E, "time(def) = 10000");
            return 10000;
        }
        e.g(E, "time = " + this.f130858a);
        return this.f130858a;
    }

    public List<b> z() {
        return this.C;
    }
}
