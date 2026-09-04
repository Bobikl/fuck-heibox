package com.apm.lite.runtime.a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b {
    private static long A = -1;
    private static volatile b B = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static boolean f40126v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static boolean f40127w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static boolean f40128x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static int f40129y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static boolean f40130z = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Application f40131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f40132b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f40138h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f40139i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f40140j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f40141k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f40142l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f40143m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f40144n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f40145o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f40146p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f40147q;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f40151u;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f40133c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<Long> f40134d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<String> f40135e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<Long> f40136f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private LinkedList<C0314b> f40137g = new LinkedList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f40148r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f40149s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f40150t = 50;

    public class a implements Application.ActivityLifecycleCallbacks {
        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            b.this.f40138h = activity.getClass().getName();
            b.this.f40139i = System.currentTimeMillis();
            boolean unused = b.f40127w = bundle != null;
            boolean unused2 = b.f40128x = true;
            b.this.f40133c.add(b.this.f40138h);
            b.this.f40134d.add(Long.valueOf(b.this.f40139i));
            b bVar = b.this;
            bVar.k(bVar.f40138h, b.this.f40139i, "onCreate");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            String name = activity.getClass().getName();
            int iIndexOf = b.this.f40133c.indexOf(name);
            if (iIndexOf > -1 && iIndexOf < b.this.f40133c.size()) {
                b.this.f40133c.remove(iIndexOf);
                b.this.f40134d.remove(iIndexOf);
            }
            b.this.f40135e.add(name);
            long jCurrentTimeMillis = System.currentTimeMillis();
            b.this.f40136f.add(Long.valueOf(jCurrentTimeMillis));
            b.this.k(name, jCurrentTimeMillis, "onDestroy");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            b.this.f40144n = activity.getClass().getName();
            b.this.f40145o = System.currentTimeMillis();
            b.S(b.this);
            if (b.this.f40151u == 0) {
                b.this.f40148r = false;
                boolean unused = b.f40128x = false;
                b.this.f40149s = SystemClock.uptimeMillis();
            } else if (b.this.f40151u < 0) {
                b.this.f40151u = 0;
                b.this.f40148r = false;
                boolean unused2 = b.f40128x = false;
                b.this.f40149s = SystemClock.uptimeMillis();
            }
            b bVar = b.this;
            bVar.k(bVar.f40144n, b.this.f40145o, "onPause");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            int i10;
            b.this.f40142l = activity.getClass().getName();
            b.this.f40143m = System.currentTimeMillis();
            b.I(b.this);
            if (!b.this.f40148r) {
                b.this.f40148r = true;
                if (b.f40126v) {
                    boolean unused = b.f40126v = false;
                    int unused2 = b.f40129y = 1;
                    long unused3 = b.A = b.this.f40143m;
                }
                if (b.this.f40142l.equals(b.this.f40144n)) {
                    if (!b.f40128x || b.f40127w) {
                        i10 = b.f40128x ? 4 : 3;
                    }
                    int unused4 = b.f40129y = i10;
                    long unused5 = b.A = b.this.f40143m;
                }
            }
            b bVar = b.this;
            bVar.k(bVar.f40142l, b.this.f40143m, "onResume");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            b.this.f40140j = activity.getClass().getName();
            b.this.f40141k = System.currentTimeMillis();
            b bVar = b.this;
            bVar.k(bVar.f40140j, b.this.f40141k, "onStart");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            b.this.f40146p = activity.getClass().getName();
            b.this.f40147q = System.currentTimeMillis();
            b bVar = b.this;
            bVar.k(bVar.f40146p, b.this.f40147q, "onStop");
        }
    }

    /* JADX INFO: renamed from: com.apm.lite.runtime.a.b$b, reason: collision with other inner class name */
    public static class C0314b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f40153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f40154b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f40155c;

        C0314b(String str, String str2, long j10) {
            this.f40154b = str2;
            this.f40155c = j10;
            this.f40153a = str;
        }

        public String toString() {
            return com.apm.lite.k.b.a().format(new Date(this.f40155c)) + " : " + this.f40153a + ' ' + this.f40154b;
        }
    }

    private b(Application application) {
        this.f40132b = application;
        this.f40131a = application;
        try {
            V();
        } catch (Throwable unused) {
        }
    }

    static /* synthetic */ int I(b bVar) {
        int i10 = bVar.f40151u;
        bVar.f40151u = i10 + 1;
        return i10;
    }

    static /* synthetic */ int S(b bVar) {
        int i10 = bVar.f40151u;
        bVar.f40151u = i10 - 1;
        return i10;
    }

    private void V() {
        if (this.f40131a != null) {
            this.f40131a.registerActivityLifecycleCallbacks(new a());
        }
    }

    private JSONArray X() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f40133c;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < this.f40133c.size(); i10++) {
                try {
                    jSONArray.put(h(this.f40133c.get(i10), this.f40134d.get(i10).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    private JSONArray Z() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f40135e;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < this.f40135e.size(); i10++) {
                try {
                    jSONArray.put(h(this.f40135e.get(i10), this.f40136f.get(i10).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    private C0314b e(String str, String str2, long j10) {
        C0314b c0314bPoll;
        if (this.f40137g.size() >= this.f40150t) {
            c0314bPoll = this.f40137g.poll();
            if (c0314bPoll != null) {
                this.f40137g.add(c0314bPoll);
            }
        } else {
            c0314bPoll = null;
        }
        if (c0314bPoll != null) {
            return c0314bPoll;
        }
        C0314b c0314b = new C0314b(str, str2, j10);
        this.f40137g.add(c0314b);
        return c0314b;
    }

    private JSONObject h(String str, long j10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("time", j10);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static void i() {
        f40130z = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(String str, long j10, String str2) {
        try {
            C0314b c0314bE = e(str, str2, j10);
            c0314bE.f40154b = str2;
            c0314bE.f40153a = str;
            c0314bE.f40155c = j10;
        } catch (Throwable unused) {
        }
    }

    public static int n() {
        int i10 = f40129y;
        if (i10 == 1) {
            return f40130z ? 2 : 1;
        }
        return i10;
    }

    public static long s() {
        return A;
    }

    public static b y() {
        if (B == null) {
            synchronized (b.class) {
                if (B == null) {
                    B = new b(com.apm.lite.e.n());
                }
            }
        }
        return B;
    }

    public long B() {
        return SystemClock.uptimeMillis() - this.f40149s;
    }

    public boolean H() {
        return this.f40148r;
    }

    public JSONObject J() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("last_create_activity", h(this.f40138h, this.f40139i));
            jSONObject.put("last_start_activity", h(this.f40140j, this.f40141k));
            jSONObject.put("last_resume_activity", h(this.f40142l, this.f40143m));
            jSONObject.put("last_pause_activity", h(this.f40144n, this.f40145o));
            jSONObject.put("last_stop_activity", h(this.f40146p, this.f40147q));
            jSONObject.put("alive_activities", X());
            jSONObject.put("finish_activities", Z());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String K() {
        return String.valueOf(this.f40142l);
    }

    public JSONArray N() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = new ArrayList(this.f40137g).iterator();
        while (it.hasNext()) {
            jSONArray.put(((C0314b) it.next()).toString());
        }
        return jSONArray;
    }
}
