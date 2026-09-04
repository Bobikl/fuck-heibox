package com.vivo.push;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.igexin.sdk.PushConsts;
import com.vivo.push.sdk.PushMessageCallback;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.util.VivoPushException;
import com.vivo.push.util.t;
import com.vivo.push.util.w;
import com.vivo.push.util.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PushClientManager.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile e f106570a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f106577h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.vivo.push.util.b f106579j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f106580k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f106581l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Boolean f106584o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Long f106585p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f106586q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f106588s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f106571b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f106572c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f106573d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f106574e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f106575f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f106576g = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f106578i = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private SparseArray<a> f106582m = new SparseArray<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f106583n = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private IPushClientFactory f106587r = new d();

    /* JADX INFO: compiled from: PushClientManager.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private IPushActionListener f106589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.vivo.push.b.c f106590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private IPushActionListener f106591c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Runnable f106592d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object[] f106593e;

        public a(com.vivo.push.b.c cVar, IPushActionListener iPushActionListener) {
            this.f106590b = cVar;
            this.f106589a = iPushActionListener;
        }

        public final void a() {
            Runnable runnable = this.f106592d;
            if (runnable == null) {
                com.vivo.push.util.p.a("PushClientManager", "task is null");
            } else {
                runnable.run();
            }
        }

        public final void a(int i10, Object... objArr) {
            this.f106593e = objArr;
            IPushActionListener iPushActionListener = this.f106591c;
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(i10);
            }
            IPushActionListener iPushActionListener2 = this.f106589a;
            if (iPushActionListener2 != null) {
                iPushActionListener2.onStateChanged(i10);
            }
        }

        public final void a(IPushActionListener iPushActionListener) {
            this.f106591c = iPushActionListener;
        }

        public final void a(Runnable runnable) {
            this.f106592d = runnable;
        }

        public final Object[] b() {
            return this.f106593e;
        }
    }

    private e() {
    }

    private a a(com.vivo.push.b.b bVar, IPushActionListener iPushActionListener) {
        a aVar = new a(bVar, iPushActionListener);
        String strA = a(aVar);
        bVar.b(strA);
        aVar.a(new h(this, bVar, strA));
        return aVar;
    }

    public static synchronized e a() {
        if (f106570a == null) {
            f106570a = new e();
        }
        return f106570a;
    }

    private synchronized String a(a aVar) {
        int i10;
        this.f106582m.put(this.f106583n, aVar);
        i10 = this.f106583n;
        this.f106583n = i10 + 1;
        return Integer.toString(i10);
    }

    private static boolean a(long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return j10 == -1 || jElapsedRealtime <= j10 || jElapsedRealtime >= j10 + 2000;
    }

    private void c(String str) {
        m.c(new f(this, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized a d(String str) {
        if (str != null) {
            try {
                int i10 = Integer.parseInt(str);
                a aVar = this.f106582m.get(i10);
                this.f106582m.delete(i10);
                return aVar;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        m.a(new k(this, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.f106581l = null;
        this.f106579j.b("APP_ALIAS");
    }

    private boolean n() {
        if (this.f106584o == null) {
            this.f106584o = Boolean.valueOf(l() >= 1230 && z.d(this.f106577h));
        }
        return this.f106584o.booleanValue();
    }

    public final synchronized void a(Context context) {
        if (this.f106577h == null) {
            this.f106577h = ContextDelegate.getContext(context);
            this.f106586q = t.c(context, context.getPackageName());
            w.b().a(this.f106577h);
            a(new com.vivo.push.b.g());
            com.vivo.push.util.b bVar = new com.vivo.push.util.b();
            this.f106579j = bVar;
            bVar.a(this.f106577h, "com.vivo.push_preferences.appconfig_v1");
            this.f106580k = f();
            this.f106581l = this.f106579j.b("APP_ALIAS", (String) null);
        }
    }

    public final void a(Intent intent, PushMessageCallback pushMessageCallback) {
        o oVarCreateReceiverCommand = this.f106587r.createReceiverCommand(intent);
        Context context = a().f106577h;
        if (oVarCreateReceiverCommand == null) {
            com.vivo.push.util.p.a("PushClientManager", "sendCommand, null command!");
            if (context != null) {
                com.vivo.push.util.p.c(context, "[执行指令失败]指令空！");
                return;
            }
            return;
        }
        com.vivo.push.d.z zVarCreateReceiveTask = this.f106587r.createReceiveTask(oVarCreateReceiverCommand);
        if (zVarCreateReceiveTask != null) {
            if (context != null && !(oVarCreateReceiverCommand instanceof com.vivo.push.b.n)) {
                com.vivo.push.util.p.a(context, "[接收指令]".concat(String.valueOf(oVarCreateReceiverCommand)));
            }
            zVarCreateReceiveTask.a(pushMessageCallback);
            m.a((l) zVarCreateReceiveTask);
            return;
        }
        com.vivo.push.util.p.a("PushClientManager", "sendCommand, null command task! pushCommand = ".concat(String.valueOf(oVarCreateReceiverCommand)));
        if (context != null) {
            com.vivo.push.util.p.c(context, "[执行指令失败]指令" + oVarCreateReceiverCommand + "任务空！");
        }
    }

    final void a(IPushActionListener iPushActionListener) {
        if (this.f106577h == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
                return;
            }
            return;
        }
        String strF = f();
        this.f106580k = strF;
        if (!TextUtils.isEmpty(strF)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(0);
                return;
            }
            return;
        }
        if (!a(this.f106571b)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(1002);
                return;
            }
            return;
        }
        this.f106571b = SystemClock.elapsedRealtime();
        String packageName = this.f106577h.getPackageName();
        a aVarA = null;
        if (this.f106577h != null) {
            com.vivo.push.b.b bVar = new com.vivo.push.b.b(true, packageName);
            bVar.g();
            bVar.d();
            bVar.e();
            bVar.a(100);
            if (this.f106586q) {
                if (n()) {
                    aVarA = a(bVar, iPushActionListener);
                } else if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(101);
                }
            } else if (bVar.a(this.f106577h) == 2) {
                aVarA = a(bVar, iPushActionListener);
            } else {
                a(bVar);
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(0);
                }
            }
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(102);
        }
        if (aVarA == null) {
            return;
        }
        aVarA.a(new g(this, aVarA));
        aVarA.a();
    }

    public final void a(o oVar) {
        Context context = a().f106577h;
        if (oVar == null) {
            com.vivo.push.util.p.a("PushClientManager", "sendCommand, null command!");
            if (context != null) {
                com.vivo.push.util.p.c(context, "[执行指令失败]指令空！");
                return;
            }
            return;
        }
        l lVarCreateTask = this.f106587r.createTask(oVar);
        if (lVarCreateTask != null) {
            com.vivo.push.util.p.d("PushClientManager", "client--sendCommand, command = ".concat(String.valueOf(oVar)));
            m.a(lVarCreateTask);
            return;
        }
        com.vivo.push.util.p.a("PushClientManager", "sendCommand, null command task! pushCommand = ".concat(String.valueOf(oVar)));
        if (context != null) {
            com.vivo.push.util.p.c(context, "[执行指令失败]指令" + oVar + "任务空！");
        }
    }

    public final void a(String str) {
        this.f106580k = str;
        this.f106579j.a("APP_TOKEN", str);
    }

    public final void a(String str, int i10) {
        a aVarD = d(str);
        if (aVarD != null) {
            aVarD.a(i10, new Object[0]);
        } else {
            com.vivo.push.util.p.d("PushClientManager", "notifyStatusChanged token is null");
        }
    }

    public final void a(String str, int i10, Object... objArr) {
        a aVarD = d(str);
        if (aVarD != null) {
            aVarD.a(i10, objArr);
        } else {
            com.vivo.push.util.p.d("PushClientManager", "notifyApp token is null");
        }
    }

    final void a(String str, IPushActionListener iPushActionListener) {
        if (this.f106577h == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
                return;
            }
            return;
        }
        if (!TextUtils.isEmpty(this.f106581l) && this.f106581l.equals(str)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(0);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        com.vivo.push.b.a aVar = new com.vivo.push.b.a(true, this.f106577h.getPackageName(), arrayList);
        aVar.a(100);
        if (!this.f106586q) {
            a(aVar);
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(0);
                return;
            }
            return;
        }
        if (!n()) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(101);
                return;
            }
            return;
        }
        if (!a(this.f106573d)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(1002);
                return;
            }
            return;
        }
        this.f106573d = SystemClock.elapsedRealtime();
        String strA = a(new a(aVar, iPushActionListener));
        aVar.b(strA);
        if (TextUtils.isEmpty(this.f106580k)) {
            a(strA, PushConsts.ALIAS_ERROR_FREQUENCY);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            a(strA, PushConsts.ALIAS_OPERATE_PARAM_ERROR);
        } else if (str.length() > 70) {
            a(strA, PushConsts.ALIAS_REQUEST_FILTER);
        } else {
            a(aVar);
            e(strA);
        }
    }

    final void a(ArrayList<String> arrayList, IPushActionListener iPushActionListener) {
        Context context = this.f106577h;
        if (context == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
                return;
            }
            return;
        }
        com.vivo.push.b.z zVar = new com.vivo.push.b.z(true, context.getPackageName(), arrayList);
        zVar.a(500);
        if (!this.f106586q) {
            a(zVar);
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(0);
                return;
            }
            return;
        }
        if (!n()) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(101);
                return;
            }
            return;
        }
        if (!a(this.f106575f)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(1002);
                return;
            }
            return;
        }
        this.f106575f = SystemClock.elapsedRealtime();
        String strA = a(new a(zVar, iPushActionListener));
        zVar.b(strA);
        if (TextUtils.isEmpty(this.f106580k)) {
            a(strA, PushConsts.SETTAG_ERROR_COUNT);
            return;
        }
        if (arrayList.size() < 0) {
            a(strA, PushConsts.SETTAG_ERROR_FREQUENCY);
            return;
        }
        if (arrayList.size() + c().size() > 500) {
            a(strA, 20004);
            return;
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().length() > 70) {
                a(strA, 20003);
                return;
            }
        }
        a(zVar);
        e(strA);
    }

    public final void a(List<String> list) {
        try {
            if (list.size() <= 0) {
                return;
            }
            String strB = this.f106579j.b("APP_TAGS", (String) null);
            JSONObject jSONObject = TextUtils.isEmpty(strB) ? new JSONObject() : new JSONObject(strB);
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                jSONObject.put(it.next(), System.currentTimeMillis());
            }
            String string = jSONObject.toString();
            if (TextUtils.isEmpty(string)) {
                this.f106579j.b("APP_TAGS");
            } else {
                this.f106579j.a("APP_TAGS", string);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
            this.f106579j.b("APP_TAGS");
        }
    }

    protected final void a(boolean z10) {
        this.f106578i = z10;
    }

    protected final void b() throws VivoPushException {
        Context context = this.f106577h;
        if (context != null) {
            z.b(context);
        }
    }

    final void b(IPushActionListener iPushActionListener) {
        if (this.f106577h == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
                return;
            }
            return;
        }
        if ("".equals(this.f106580k)) {
            iPushActionListener.onStateChanged(0);
            return;
        }
        if (!a(this.f106572c)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(1002);
                return;
            }
            return;
        }
        this.f106572c = SystemClock.elapsedRealtime();
        String packageName = this.f106577h.getPackageName();
        a aVarA = null;
        if (this.f106577h != null) {
            com.vivo.push.b.b bVar = new com.vivo.push.b.b(false, packageName);
            bVar.d();
            bVar.e();
            bVar.g();
            bVar.a(100);
            if (this.f106586q) {
                if (n()) {
                    aVarA = new a(bVar, iPushActionListener);
                    String strA = a(aVarA);
                    bVar.b(strA);
                    aVarA.a(new j(this, bVar, strA));
                } else if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(101);
                }
            } else if (bVar.a(this.f106577h) == 2) {
                aVarA = a(bVar, iPushActionListener);
            } else {
                a(bVar);
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(0);
                }
            }
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(102);
        }
        if (aVarA == null) {
            return;
        }
        aVarA.a(new i(this));
        aVarA.a();
    }

    public final void b(String str) {
        this.f106581l = str;
        this.f106579j.a("APP_ALIAS", str);
    }

    final void b(String str, IPushActionListener iPushActionListener) {
        if (this.f106577h == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(this.f106581l)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(0);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        com.vivo.push.b.a aVar = new com.vivo.push.b.a(false, this.f106577h.getPackageName(), arrayList);
        aVar.a(100);
        if (!this.f106586q) {
            a(aVar);
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(0);
                return;
            }
            return;
        }
        if (!n()) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(101);
                return;
            }
            return;
        }
        if (!a(this.f106574e)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(1002);
                return;
            }
            return;
        }
        this.f106574e = SystemClock.elapsedRealtime();
        String strA = a(new a(aVar, iPushActionListener));
        aVar.b(strA);
        if (TextUtils.isEmpty(this.f106580k)) {
            a(strA, PushConsts.ALIAS_ERROR_FREQUENCY);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            a(strA, PushConsts.ALIAS_OPERATE_PARAM_ERROR);
        } else if (str.length() > 70) {
            a(strA, PushConsts.ALIAS_REQUEST_FILTER);
        } else {
            a(aVar);
            e(strA);
        }
    }

    final void b(ArrayList<String> arrayList, IPushActionListener iPushActionListener) {
        Context context = this.f106577h;
        if (context == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
                return;
            }
            return;
        }
        com.vivo.push.b.z zVar = new com.vivo.push.b.z(false, context.getPackageName(), arrayList);
        zVar.a(500);
        if (!this.f106586q) {
            a(zVar);
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(0);
                return;
            }
            return;
        }
        if (!n()) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(101);
                return;
            }
            return;
        }
        if (!a(this.f106576g)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(1002);
                return;
            }
            return;
        }
        this.f106576g = SystemClock.elapsedRealtime();
        String strA = a(new a(zVar, iPushActionListener));
        zVar.b(strA);
        if (TextUtils.isEmpty(this.f106580k)) {
            a(strA, PushConsts.SETTAG_ERROR_COUNT);
            return;
        }
        if (arrayList.size() < 0) {
            a(strA, PushConsts.SETTAG_ERROR_FREQUENCY);
            return;
        }
        if (arrayList.size() > 500) {
            a(strA, 20004);
            return;
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().length() > 70) {
                a(strA, 20003);
                return;
            }
        }
        a(zVar);
        e(strA);
    }

    public final void b(List<String> list) {
        try {
            if (list.size() <= 0) {
                return;
            }
            String strB = this.f106579j.b("APP_TAGS", (String) null);
            JSONObject jSONObject = TextUtils.isEmpty(strB) ? new JSONObject() : new JSONObject(strB);
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                jSONObject.remove(it.next());
            }
            String string = jSONObject.toString();
            if (TextUtils.isEmpty(string)) {
                this.f106579j.b("APP_TAGS");
            } else {
                this.f106579j.a("APP_TAGS", string);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
            this.f106579j.b("APP_TAGS");
        }
    }

    public final List<String> c() {
        String strB = this.f106579j.b("APP_TAGS", (String) null);
        ArrayList arrayList = new ArrayList();
        try {
            if (TextUtils.isEmpty(strB)) {
                return arrayList;
            }
            Iterator<String> itKeys = new JSONObject(strB).keys();
            while (itKeys.hasNext()) {
                arrayList.add(itKeys.next());
            }
        } catch (JSONException unused) {
            this.f106579j.b("APP_TAGS");
            arrayList.clear();
            com.vivo.push.util.p.d("PushClientManager", "getTags error");
        }
        return arrayList;
    }

    public final void c(List<String> list) {
        if (list.contains(this.f106581l)) {
            m();
        }
    }

    public final boolean d() {
        if (this.f106577h == null) {
            com.vivo.push.util.p.d("PushClientManager", "support:context is null");
            return false;
        }
        Boolean boolValueOf = Boolean.valueOf(n());
        this.f106584o = boolValueOf;
        return boolValueOf.booleanValue();
    }

    public final boolean e() {
        return this.f106586q;
    }

    public final String f() {
        if (!TextUtils.isEmpty(this.f106580k)) {
            return this.f106580k;
        }
        com.vivo.push.util.b bVar = this.f106579j;
        String strB = bVar != null ? bVar.b("APP_TOKEN", (String) null) : "";
        c(strB);
        return strB;
    }

    public final boolean g() {
        return this.f106578i;
    }

    public final Context h() {
        return this.f106577h;
    }

    public final void i() {
        this.f106579j.a();
    }

    public final String j() {
        return this.f106581l;
    }

    public final int k() {
        return this.f106588s;
    }

    public final long l() {
        Context context = this.f106577h;
        if (context == null) {
            return -1L;
        }
        if (this.f106585p == null) {
            this.f106585p = Long.valueOf(z.a(context));
        }
        return this.f106585p.longValue();
    }
}
