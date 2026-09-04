package com.tekartik.sqflite;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: SqflitePlugin.java */
/* JADX INFO: loaded from: classes4.dex */
public class f0 implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static String f98638i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static p f98642m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f98643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MethodChannel f98644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Map<String, Integer> f98633d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SuppressLint({"UseSparseArrays"})
    static final Map<Integer, j> f98634e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f98635f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f98636g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static int f98637h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f98639j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f98640k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f98641l = 0;

    /* JADX INFO: compiled from: SqflitePlugin.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f98645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f98646c;

        a(j jVar, MethodChannel.Result result) {
            this.f98645b = jVar;
            this.f98646c = result;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (f0.f98636g) {
                f0.this.l(this.f98645b);
            }
            this.f98646c.success(null);
        }
    }

    /* JADX INFO: compiled from: SqflitePlugin.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f98648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f98649c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f98650d;

        b(j jVar, String str, MethodChannel.Result result) {
            this.f98648b = jVar;
            this.f98649c = str;
            this.f98650d = result;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (f0.f98636g) {
                j jVar = this.f98648b;
                if (jVar != null) {
                    f0.this.l(jVar);
                }
                try {
                    if (u.c(f0.f98637h)) {
                        Log.d(com.tekartik.sqflite.b.J, "delete database " + this.f98649c);
                    }
                    j.o(this.f98649c);
                } catch (Exception e10) {
                    Log.e(com.tekartik.sqflite.b.J, "error " + e10 + " while closing database " + f0.f98641l);
                }
            }
            this.f98650d.success(null);
        }
    }

    public f0() {
    }

    public f0(Context context) {
        this.f98643b = context.getApplicationContext();
    }

    private void A(Context context, BinaryMessenger binaryMessenger) {
        this.f98643b = context;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "com.tekartik.sqflite", StandardMethodCodec.INSTANCE, binaryMessenger.makeBackgroundTaskQueue());
        this.f98644c = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    private void B(final MethodCall methodCall, final MethodChannel.Result result) {
        final j jVarP = p(methodCall, result);
        if (jVarP == null) {
            return;
        }
        f98642m.c(jVarP, new Runnable() { // from class: com.tekartik.sqflite.e0
            @Override // java.lang.Runnable
            public final void run() {
                jVarP.h(methodCall, result);
            }
        });
    }

    private void C(MethodCall methodCall, MethodChannel.Result result) {
        int iIntValue = ((Integer) methodCall.argument("id")).intValue();
        j jVarP = p(methodCall, result);
        if (jVarP == null) {
            return;
        }
        if (u.b(jVarP.f98664d)) {
            Log.d(com.tekartik.sqflite.b.J, jVarP.B() + "closing " + iIntValue + " " + jVarP.f98662b);
        }
        String str = jVarP.f98662b;
        synchronized (f98635f) {
            f98634e.remove(Integer.valueOf(iIntValue));
            if (jVarP.f98661a) {
                f98633d.remove(str);
            }
        }
        f98642m.c(jVarP, new a(jVarP, result));
    }

    private void D(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Boolean.valueOf(j.y((String) methodCall.argument(FlutterActivityLaunchConfigs.EXTRA_PATH))));
    }

    private void E(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) methodCall.argument(com.taobao.agoo.a.a.b.JSON_CMD);
        HashMap map = new HashMap();
        if ("get".equals(str)) {
            int i10 = f98637h;
            if (i10 > 0) {
                map.put("logLevel", Integer.valueOf(i10));
            }
            Map<Integer, j> map2 = f98634e;
            if (!map2.isEmpty()) {
                HashMap map3 = new HashMap();
                for (Map.Entry<Integer, j> entry : map2.entrySet()) {
                    j value = entry.getValue();
                    HashMap map4 = new HashMap();
                    map4.put(FlutterActivityLaunchConfigs.EXTRA_PATH, value.f98662b);
                    map4.put("singleInstance", Boolean.valueOf(value.f98661a));
                    int i11 = value.f98664d;
                    if (i11 > 0) {
                        map4.put("logLevel", Integer.valueOf(i11));
                    }
                    map3.put(entry.getKey().toString(), map4);
                }
                map.put("databases", map3);
            }
        }
        result.success(map);
    }

    private void F(MethodCall methodCall, MethodChannel.Result result) {
        xg.a.f141314a = Boolean.TRUE.equals(methodCall.arguments());
        xg.a.f141316c = xg.a.f141315b && xg.a.f141314a;
        if (!xg.a.f141314a) {
            f98637h = 0;
        } else if (xg.a.f141316c) {
            f98637h = 2;
        } else if (xg.a.f141314a) {
            f98637h = 1;
        }
        result.success(null);
    }

    private void G(MethodCall methodCall, MethodChannel.Result result) {
        j jVar;
        Map<Integer, j> map;
        String str = (String) methodCall.argument(FlutterActivityLaunchConfigs.EXTRA_PATH);
        synchronized (f98635f) {
            if (u.c(f98637h)) {
                Log.d(com.tekartik.sqflite.b.J, "Look for " + str + " in " + f98633d.keySet());
            }
            Map<String, Integer> map2 = f98633d;
            Integer num = map2.get(str);
            if (num == null || (jVar = (map = f98634e).get(num)) == null || !jVar.f98669i.isOpen()) {
                jVar = null;
            } else {
                if (u.c(f98637h)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(jVar.B());
                    sb2.append("found single instance ");
                    sb2.append(jVar.G() ? "(in transaction) " : "");
                    sb2.append(num);
                    sb2.append(" ");
                    sb2.append(str);
                    Log.d(com.tekartik.sqflite.b.J, sb2.toString());
                }
                map.remove(num);
                map2.remove(str);
            }
        }
        b bVar = new b(jVar, str, result);
        p pVar = f98642m;
        if (pVar != null) {
            pVar.c(jVar, bVar);
        } else {
            bVar.run();
        }
    }

    private void H(final MethodCall methodCall, final MethodChannel.Result result) {
        final j jVarP = p(methodCall, result);
        if (jVarP == null) {
            return;
        }
        f98642m.c(jVarP, new Runnable() { // from class: com.tekartik.sqflite.a0
            @Override // java.lang.Runnable
            public final void run() {
                f0.s(methodCall, result, jVarP);
            }
        });
    }

    private void J(final MethodCall methodCall, final MethodChannel.Result result) {
        final j jVarP = p(methodCall, result);
        if (jVarP == null) {
            return;
        }
        f98642m.c(jVarP, new Runnable() { // from class: com.tekartik.sqflite.x
            @Override // java.lang.Runnable
            public final void run() {
                f0.t(methodCall, result, jVarP);
            }
        });
    }

    private void K(final MethodCall methodCall, final MethodChannel.Result result) {
        final int i10;
        j jVar;
        final String str = (String) methodCall.argument(FlutterActivityLaunchConfigs.EXTRA_PATH);
        final Boolean bool = (Boolean) methodCall.argument("readOnly");
        final boolean zQ = q(str);
        boolean z10 = (Boolean.FALSE.equals(methodCall.argument("singleInstance")) || zQ) ? false : true;
        if (z10) {
            synchronized (f98635f) {
                if (u.c(f98637h)) {
                    Log.d(com.tekartik.sqflite.b.J, "Look for " + str + " in " + f98633d.keySet());
                }
                Integer num = f98633d.get(str);
                if (num != null && (jVar = f98634e.get(num)) != null) {
                    if (jVar.f98669i.isOpen()) {
                        if (u.c(f98637h)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(jVar.B());
                            sb2.append("re-opened single instance ");
                            sb2.append(jVar.G() ? "(in transaction) " : "");
                            sb2.append(num);
                            sb2.append(" ");
                            sb2.append(str);
                            Log.d(com.tekartik.sqflite.b.J, sb2.toString());
                        }
                        result.success(z(num.intValue(), true, jVar.G()));
                        return;
                    }
                    if (u.c(f98637h)) {
                        Log.d(com.tekartik.sqflite.b.J, jVar.B() + "single instance database of " + str + " not opened");
                    }
                }
            }
        }
        Object obj = f98635f;
        synchronized (obj) {
            i10 = f98641l + 1;
            f98641l = i10;
        }
        final j jVar2 = new j(this.f98643b, str, i10, z10, f98637h);
        synchronized (obj) {
            if (f98642m == null) {
                p pVarB = o.b(com.tekartik.sqflite.b.J, f98640k, f98639j);
                f98642m = pVarB;
                pVarB.start();
                if (u.b(jVar2.f98664d)) {
                    Log.d(com.tekartik.sqflite.b.J, jVar2.B() + "starting worker pool with priority " + f98639j);
                }
            }
            jVar2.f98668h = f98642m;
            if (u.b(jVar2.f98664d)) {
                Log.d(com.tekartik.sqflite.b.J, jVar2.B() + "opened " + i10 + " " + str);
            }
            final boolean z11 = z10;
            f98642m.c(jVar2, new Runnable() { // from class: com.tekartik.sqflite.c0
                @Override // java.lang.Runnable
                public final void run() {
                    f0.u(zQ, str, result, bool, jVar2, methodCall, z11, i10);
                }
            });
        }
    }

    private void M(final MethodCall methodCall, final MethodChannel.Result result) {
        final j jVarP = p(methodCall, result);
        if (jVarP == null) {
            return;
        }
        f98642m.c(jVarP, new Runnable() { // from class: com.tekartik.sqflite.b0
            @Override // java.lang.Runnable
            public final void run() {
                f0.v(methodCall, result, jVarP);
            }
        });
    }

    private void N(final MethodCall methodCall, final MethodChannel.Result result) {
        final j jVarP = p(methodCall, result);
        if (jVarP == null) {
            return;
        }
        f98642m.c(jVarP, new Runnable() { // from class: com.tekartik.sqflite.y
            @Override // java.lang.Runnable
            public final void run() {
                f0.w(methodCall, result, jVarP);
            }
        });
    }

    private void O(final MethodCall methodCall, final MethodChannel.Result result) {
        final j jVarP = p(methodCall, result);
        if (jVarP == null) {
            return;
        }
        f98642m.c(jVarP, new Runnable() { // from class: com.tekartik.sqflite.d0
            @Override // java.lang.Runnable
            public final void run() {
                f0.x(methodCall, jVarP, result);
            }
        });
    }

    private void P(final MethodCall methodCall, final MethodChannel.Result result) {
        final j jVarP = p(methodCall, result);
        if (jVarP == null) {
            return;
        }
        f98642m.c(jVarP, new Runnable() { // from class: com.tekartik.sqflite.z
            @Override // java.lang.Runnable
            public final void run() {
                f0.y(methodCall, result, jVarP);
            }
        });
    }

    private static String Q(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof byte[])) {
            return obj instanceof Map ? m((Map) obj).toString() : obj.toString();
        }
        ArrayList arrayList = new ArrayList();
        for (byte b10 : (byte[]) obj) {
            arrayList.add(Integer.valueOf(b10));
        }
        return arrayList.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(j jVar) {
        try {
            if (u.b(jVar.f98664d)) {
                Log.d(com.tekartik.sqflite.b.J, jVar.B() + "closing database ");
            }
            jVar.k();
        } catch (Exception e10) {
            Log.e(com.tekartik.sqflite.b.J, "error " + e10 + " while closing database " + f98641l);
        }
        synchronized (f98635f) {
            if (f98634e.isEmpty() && f98642m != null) {
                if (u.b(jVar.f98664d)) {
                    Log.d(com.tekartik.sqflite.b.J, jVar.B() + "stopping thread");
                }
                f98642m.b();
                f98642m = null;
            }
        }
    }

    private static Map<String, Object> m(Map<Object, Object> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            map2.put(Q(entry.getKey()), value instanceof Map ? m((Map) value) : Q(value));
        }
        return map2;
    }

    private Context n() {
        return this.f98643b;
    }

    private j o(int i10) {
        return f98634e.get(Integer.valueOf(i10));
    }

    private j p(MethodCall methodCall, MethodChannel.Result result) {
        int iIntValue = ((Integer) methodCall.argument("id")).intValue();
        j jVarO = o(iIntValue);
        if (jVarO != null) {
            return jVarO;
        }
        result.error("sqlite_error", "database_closed " + iIntValue, null);
        return null;
    }

    static boolean q(String str) {
        return str == null || str.equals(":memory:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(MethodCall methodCall, MethodChannel.Result result, j jVar) {
        jVar.w(new com.tekartik.sqflite.operation.d(methodCall, result));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(MethodCall methodCall, MethodChannel.Result result, j jVar) {
        jVar.F(new com.tekartik.sqflite.operation.d(methodCall, result));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(boolean z10, String str, MethodChannel.Result result, Boolean bool, j jVar, MethodCall methodCall, boolean z11, int i10) {
        synchronized (f98636g) {
            if (!z10) {
                try {
                    File file = new File(new File(str).getParent());
                    if (!file.exists() && !file.mkdirs() && !file.exists()) {
                        result.error("sqlite_error", "open_failed " + str, null);
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            try {
                if (Boolean.TRUE.equals(bool)) {
                    jVar.O();
                } else {
                    jVar.N();
                }
                synchronized (f98635f) {
                    if (z11) {
                        f98633d.put(str, Integer.valueOf(i10));
                        f98634e.put(Integer.valueOf(i10), jVar);
                    } else {
                        f98634e.put(Integer.valueOf(i10), jVar);
                    }
                    throw th;
                }
                if (u.b(jVar.f98664d)) {
                    Log.d(com.tekartik.sqflite.b.J, jVar.B() + "opened " + i10 + " " + str);
                }
                result.success(z(i10, false, false));
            } catch (Exception e10) {
                jVar.E(e10, new com.tekartik.sqflite.operation.d(methodCall, result));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(MethodCall methodCall, MethodChannel.Result result, j jVar) {
        jVar.P(new com.tekartik.sqflite.operation.d(methodCall, result));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(MethodCall methodCall, MethodChannel.Result result, j jVar) {
        jVar.Q(new com.tekartik.sqflite.operation.d(methodCall, result));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(MethodCall methodCall, j jVar, MethodChannel.Result result) {
        try {
            jVar.f98669i.setLocale(h0.e((String) methodCall.argument("locale")));
            result.success(null);
        } catch (Exception e10) {
            result.error("sqlite_error", "Error calling setLocale: " + e10.getMessage(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y(MethodCall methodCall, MethodChannel.Result result, j jVar) {
        jVar.S(new com.tekartik.sqflite.operation.d(methodCall, result));
    }

    static Map z(int i10, boolean z10, boolean z11) {
        HashMap map = new HashMap();
        map.put("id", Integer.valueOf(i10));
        if (z10) {
            map.put(com.tekartik.sqflite.b.f98600s, Boolean.TRUE);
        }
        if (z11) {
            map.put(com.tekartik.sqflite.b.f98601t, Boolean.TRUE);
        }
        return map;
    }

    void I(MethodCall methodCall, MethodChannel.Result result) {
        if (f98638i == null) {
            f98638i = this.f98643b.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        result.success(f98638i);
    }

    void L(MethodCall methodCall, MethodChannel.Result result) {
        Object objArgument = methodCall.argument("androidThreadPriority");
        if (objArgument != null) {
            f98639j = ((Integer) objArgument).intValue();
        }
        Object objArgument2 = methodCall.argument("androidThreadCount");
        if (objArgument2 != null && !objArgument2.equals(Integer.valueOf(f98640k))) {
            f98640k = ((Integer) objArgument2).intValue();
            p pVar = f98642m;
            if (pVar != null) {
                pVar.b();
                f98642m = null;
            }
        }
        Integer numA = u.a(methodCall);
        if (numA != null) {
            f98637h = numA.intValue();
        }
        result.success(null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        A(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f98643b = null;
        this.f98644c.setMethodCallHandler(null);
        this.f98644c = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        switch (str) {
            case "execute":
                H(methodCall, result);
                break;
            case "closeDatabase":
                C(methodCall, result);
                break;
            case "options":
                L(methodCall, result);
                break;
            case "insert":
                J(methodCall, result);
                break;
            case "update":
                P(methodCall, result);
                break;
            case "androidSetLocale":
                O(methodCall, result);
                break;
            case "deleteDatabase":
                G(methodCall, result);
                break;
            case "debugMode":
                F(methodCall, result);
                break;
            case "openDatabase":
                K(methodCall, result);
                break;
            case "batch":
                B(methodCall, result);
                break;
            case "debug":
                E(methodCall, result);
                break;
            case "query":
                M(methodCall, result);
                break;
            case "databaseExists":
                D(methodCall, result);
                break;
            case "queryCursorNext":
                N(methodCall, result);
                break;
            case "getPlatformVersion":
                result.success("Android " + Build.VERSION.RELEASE);
                break;
            case "getDatabasesPath":
                I(methodCall, result);
                break;
            default:
                result.notImplemented();
                break;
        }
    }
}
