package z5;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.alipay.android.app.IAlixPay;
import com.alipay.android.app.IRemoteServiceCallback;
import com.alipay.sdk.app.APayEntranceActivity;
import com.alipay.sdk.app.AlipayResultActivity;
import com.vivo.push.PushClientConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f141859j = "failed";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f141860k = "scheme_failed";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f141861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile IAlixPay f141862b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f141864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f141865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x5.a f141866f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f141863c = IAlixPay.class;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f141867g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f141868h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f141869i = null;

    public class a implements AlipayResultActivity.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f141870a;

        public a(CountDownLatch countDownLatch) {
            this.f141870a = countDownLatch;
        }

        @Override // com.alipay.sdk.app.AlipayResultActivity.a
        public void a(int i10, String str, String str2) {
            f.this.f141868h = f5.b.b(i10, str, str2);
            this.f141870a.countDown();
        }
    }

    public class b implements APayEntranceActivity.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f141872a;

        public b(Object obj) {
            this.f141872a = obj;
        }

        @Override // com.alipay.sdk.app.APayEntranceActivity.a
        public void a(String str) {
            f.this.f141869i = str;
            synchronized (this.f141872a) {
                try {
                    this.f141872a.notify();
                } catch (Throwable th2) {
                    h5.a.e(f.this.f141866f, h5.b.f119113l, "BSAResultEx", th2);
                }
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ APayEntranceActivity.a f141874b;

        public c(APayEntranceActivity.a aVar) {
            this.f141874b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (f.this.f141866f == null || f.this.f141866f.q()) {
                return;
            }
            h5.a.i(f.this.f141866f, h5.b.f119113l, h5.b.f119105e0, "");
            if (l5.a.d().K()) {
                f.this.f141866f.l(true);
                this.f141874b.a(f5.b.a());
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Intent f141876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f141877c;

        public d(Intent intent, Object obj) {
            this.f141876b = intent;
            this.f141877c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (f.this.f141861a != null) {
                    f.this.f141861a.startActivity(this.f141876b);
                } else {
                    h5.a.i(f.this.f141866f, h5.b.f119113l, h5.b.f119103c0, "");
                    Context contextA = f.this.f141866f.a();
                    if (contextA != null) {
                        contextA.startActivity(this.f141876b);
                    }
                }
            } catch (Throwable th2) {
                h5.a.e(f.this.f141866f, h5.b.f119113l, h5.b.f119104d0, th2);
                l.u("alipaySdk", j5.b.f124292q, f.this.f141861a, f.this.f141866f);
                synchronized (this.f141877c) {
                    try {
                        f.this.f141869i = f.f141860k;
                        this.f141877c.notify();
                    } catch (Throwable th3) {
                        h5.a.e(f.this.f141866f, h5.b.f119113l, "BSAResultEx", th3);
                    }
                }
            }
        }
    }

    public class e extends IRemoteServiceCallback.Stub {
        public e() {
        }

        public /* synthetic */ e(f fVar, a aVar) {
            this();
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public int getVersion() throws RemoteException {
            return 4;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public boolean isHideLoadingScreen() throws RemoteException {
            return false;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void payEnd(boolean z10, String str) throws RemoteException {
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void r03(String str, String str2, Map map) throws RemoteException {
            h5.a.d(f.this.f141866f, h5.b.f119121p, str, str2);
            if (TextUtils.equals(str2, "ActivityStartSuccess")) {
                if (f.this.f141865e != null) {
                    f.this.f141865e.a();
                }
                if (f.this.f141866f != null) {
                    f.this.f141866f.o(true);
                }
            }
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void startActivity(String str, String str2, int i10, Bundle bundle) throws RemoteException {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            if (bundle == null) {
                bundle = new Bundle();
            }
            try {
                bundle.putInt("CallingPid", i10);
                intent.putExtras(bundle);
            } catch (Exception e10) {
                h5.a.e(f.this.f141866f, h5.b.f119113l, h5.b.Z, e10);
            }
            intent.setClassName(str, str2);
            try {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                h5.a.d(f.this.f141866f, h5.b.f119113l, "isFg", runningAppProcessInfo.processName + "|" + runningAppProcessInfo.importance + "|");
            } catch (Throwable unused) {
            }
            try {
                if (f.this.f141861a == null) {
                    h5.a.i(f.this.f141866f, h5.b.f119113l, h5.b.f119101a0, "");
                    Context contextA = f.this.f141866f.a();
                    if (contextA != null) {
                        contextA.startActivity(intent);
                        return;
                    }
                    return;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                f.this.f141861a.startActivity(intent);
                h5.a.d(f.this.f141866f, h5.b.f119113l, "stAct2", "" + (SystemClock.elapsedRealtime() - jElapsedRealtime));
            } catch (Throwable th2) {
                h5.a.e(f.this.f141866f, h5.b.f119113l, h5.b.f119102b0, th2);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: z5.f$f, reason: collision with other inner class name */
    public class ServiceConnectionC1286f implements ServiceConnection {
        public ServiceConnectionC1286f() {
        }

        public /* synthetic */ ServiceConnectionC1286f(f fVar, a aVar) {
            this();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            h5.a.c(f.this.f141866f, h5.b.f119113l, "srvCon");
            synchronized (f.this.f141863c) {
                f.this.f141862b = IAlixPay.Stub.asInterface(iBinder);
                f.this.f141863c.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            h5.a.c(f.this.f141866f, h5.b.f119113l, "srvDis");
            f.this.f141862b = null;
        }
    }

    public interface g {
        void a();

        void b();
    }

    public f(Activity activity, x5.a aVar, g gVar) {
        this.f141861a = activity;
        this.f141866f = aVar;
        this.f141865e = gVar;
        z5.e.i(j5.a.f124275z, "alipaySdk");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Pair<String, Boolean> a(String str, String str2, x5.a aVar) {
        int i10;
        ServiceConnectionC1286f serviceConnectionC1286f;
        IRemoteServiceCallback eVar;
        Activity activity;
        int version;
        String strA;
        Activity activity2;
        Activity activity3;
        String strPay;
        Activity activity4;
        Intent intent = new Intent();
        intent.setPackage(str2);
        intent.setAction(l.M(str2));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("");
        sb2.append(jElapsedRealtime);
        sb2.append("|");
        sb2.append(str != null ? str.length() : 0);
        h5.a.d(aVar, h5.b.f119113l, h5.b.R, sb2.toString());
        h5.a.b(this.f141861a, aVar, str, aVar.f141085d);
        try {
            try {
                if (l5.a.d().t()) {
                    h5.a.d(aVar, h5.b.f119113l, "stSrv", "skipped");
                } else {
                    ComponentName componentNameStartService = this.f141861a.getApplication().startService(intent);
                    h5.a.d(aVar, h5.b.f119113l, "stSrv", componentNameStartService != null ? componentNameStartService.getPackageName() : "null");
                }
            } catch (Throwable th2) {
                h5.a.e(aVar, h5.b.f119113l, h5.b.J, th2);
                l.u("alipaySdk", j5.b.f124289n, this.f141861a, this.f141866f);
                return new Pair<>(f141859j, Boolean.TRUE);
            }
        } catch (Throwable th3) {
            h5.a.e(aVar, h5.b.f119113l, h5.b.K, th3);
        }
        if (l5.a.d().p()) {
            i10 = 65;
            h5.a.d(aVar, h5.b.f119113l, "bindFlg", "imp");
        } else {
            i10 = 1;
        }
        a aVar2 = null;
        ServiceConnectionC1286f serviceConnectionC1286f2 = new ServiceConnectionC1286f(this, aVar2);
        if (!this.f141861a.getApplicationContext().bindService(intent, serviceConnectionC1286f2, i10)) {
            throw new Throwable("bindService fail");
        }
        synchronized (this.f141863c) {
            if (this.f141862b == null) {
                try {
                    this.f141863c.wait(l5.a.d().y());
                } catch (InterruptedException e10) {
                    h5.a.e(aVar, h5.b.f119113l, h5.b.L, e10);
                }
            }
        }
        IAlixPay iAlixPay = this.f141862b;
        try {
            if (iAlixPay == null) {
                h5.a.i(aVar, h5.b.f119113l, h5.b.E, "");
                l.u("alipaySdk", j5.b.f124290o, this.f141861a, this.f141866f);
                Pair<String, Boolean> pair = new Pair<>(f141859j, Boolean.TRUE);
                try {
                    this.f141861a.getApplicationContext().unbindService(serviceConnectionC1286f2);
                } catch (Throwable th4) {
                    z5.e.d(th4);
                }
                h5.a.d(aVar, h5.b.f119113l, h5.b.T, "" + SystemClock.elapsedRealtime());
                h5.a.b(this.f141861a, aVar, str, aVar.f141085d);
                this.f141862b = null;
                if (this.f141864d && (activity4 = this.f141861a) != null) {
                    activity4.setRequestedOrientation(0);
                    this.f141864d = false;
                }
                return pair;
            }
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            h5.a.d(aVar, h5.b.f119113l, h5.b.S, "" + jElapsedRealtime2);
            g gVar = this.f141865e;
            if (gVar != null) {
                gVar.b();
            }
            if (this.f141861a.getRequestedOrientation() == 0) {
                this.f141861a.setRequestedOrientation(1);
                this.f141864d = true;
            }
            try {
                version = iAlixPay.getVersion();
            } catch (Throwable th5) {
                z5.e.d(th5);
                version = 0;
            }
            eVar = new e(this, aVar2);
            try {
                if (version >= 3) {
                    iAlixPay.registerCallback03(eVar, str, null);
                } else {
                    iAlixPay.registerCallback(eVar);
                }
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                StringBuilder sb3 = new StringBuilder();
                try {
                    sb3.append("");
                    sb3.append(jElapsedRealtime3);
                    h5.a.d(aVar, h5.b.f119113l, h5.b.U, sb3.toString());
                    if (version >= 3) {
                        iAlixPay.r03(h5.b.f119113l, "bind_pay", null);
                    }
                    try {
                        if (version >= 2) {
                            Map mapF = x5.a.f(aVar);
                            mapF.put("ts_bind", String.valueOf(jElapsedRealtime));
                            mapF.put("ts_bend", String.valueOf(jElapsedRealtime2));
                            mapF.put("ts_pay", String.valueOf(jElapsedRealtime3));
                            strPay = iAlixPay.pay02(str, mapF);
                        } else {
                            strPay = iAlixPay.Pay(str);
                        }
                        strA = strPay;
                        serviceConnectionC1286f = serviceConnectionC1286f2;
                    } catch (Throwable th6) {
                        x5.a aVar3 = this.f141866f;
                        if (aVar3 != null && !aVar3.t()) {
                            h5.a.e(aVar, h5.b.f119113l, h5.b.H, th6);
                            l.u("alipaySdk", j5.b.f124291p, this.f141861a, this.f141866f);
                            if (l5.a.d().I()) {
                                Pair<String, Boolean> pair2 = new Pair<>(f141859j, Boolean.FALSE);
                                try {
                                    iAlixPay.unregisterCallback(eVar);
                                } catch (Throwable th7) {
                                    z5.e.d(th7);
                                }
                                try {
                                    this.f141861a.getApplicationContext().unbindService(serviceConnectionC1286f2);
                                } catch (Throwable th8) {
                                    z5.e.d(th8);
                                }
                                h5.a.d(aVar, h5.b.f119113l, h5.b.T, "" + SystemClock.elapsedRealtime());
                                h5.a.b(this.f141861a, aVar, str, aVar.f141085d);
                                this.f141862b = null;
                                if (this.f141864d && (activity2 = this.f141861a) != null) {
                                    activity2.setRequestedOrientation(0);
                                    this.f141864d = false;
                                }
                                return pair2;
                            }
                        }
                        serviceConnectionC1286f = serviceConnectionC1286f2;
                        try {
                            strA = f5.b.a();
                        } catch (Throwable th9) {
                            th = th9;
                        }
                    }
                    try {
                        iAlixPay.unregisterCallback(eVar);
                    } catch (Throwable th10) {
                        z5.e.d(th10);
                    }
                    try {
                        this.f141861a.getApplicationContext().unbindService(serviceConnectionC1286f);
                    } catch (Throwable th11) {
                        z5.e.d(th11);
                    }
                    h5.a.d(aVar, h5.b.f119113l, h5.b.T, "" + SystemClock.elapsedRealtime());
                    h5.a.b(this.f141861a, aVar, str, aVar.f141085d);
                    this.f141862b = null;
                    if (this.f141864d && (activity3 = this.f141861a) != null) {
                        activity3.setRequestedOrientation(0);
                        this.f141864d = false;
                    }
                    return new Pair<>(strA, Boolean.FALSE);
                } catch (Throwable th12) {
                    th = th12;
                    serviceConnectionC1286f = serviceConnectionC1286f2;
                }
            } catch (Throwable th13) {
                th = th13;
                serviceConnectionC1286f = serviceConnectionC1286f2;
            }
        } catch (Throwable th14) {
            th = th14;
            serviceConnectionC1286f = serviceConnectionC1286f2;
            eVar = null;
        }
        try {
            h5.a.f(aVar, h5.b.f119113l, h5.b.E, th, "in_bind");
            return new Pair<>(f141859j, Boolean.TRUE);
        } finally {
            if (eVar != null) {
                try {
                    iAlixPay.unregisterCallback(eVar);
                } catch (Throwable th15) {
                    z5.e.d(th15);
                }
            }
            try {
                this.f141861a.getApplicationContext().unbindService(serviceConnectionC1286f);
            } catch (Throwable th16) {
                z5.e.d(th16);
            }
            h5.a.d(aVar, h5.b.f119113l, h5.b.T, "" + SystemClock.elapsedRealtime());
            h5.a.b(this.f141861a, aVar, str, aVar.f141085d);
            this.f141862b = null;
            if (this.f141864d && (activity = this.f141861a) != null) {
                activity.setRequestedOrientation(0);
                this.f141864d = 0 == true ? 1 : 0;
            }
        }
    }

    private String c(String str, String str2) {
        String str3;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        String strG = l.g(32);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        h5.a.d(this.f141866f, h5.b.f119113l, "BSPStart", strG + "|" + jElapsedRealtime);
        x5.a.C1277a.d(this.f141866f, strG);
        AlipayResultActivity.f39428b.put(strG, new a(countDownLatch));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sourcePid", Binder.getCallingPid());
            jSONObject.put(j5.b.f124279d, str);
            jSONObject.put(PushClientConstants.TAG_PKG_NAME, this.f141861a.getPackageName());
            jSONObject.put(com.umeng.analytics.pro.d.aw, strG);
            String strEncodeToString = Base64.encodeToString(jSONObject.toString().getBytes("UTF-8"), 2);
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("alipays").authority("platformapi").path("startapp").appendQueryParameter("appId", "20000125");
            builderAppendQueryParameter.appendQueryParameter("mqpSchemePay", strEncodeToString);
            try {
                HashMap<String, String> mapF = x5.a.f(this.f141866f);
                mapF.put("ts_scheme", String.valueOf(jElapsedRealtime));
                builderAppendQueryParameter.appendQueryParameter("mqpLoc", new JSONObject(mapF).toString());
            } catch (Throwable th2) {
                h5.a.e(this.f141866f, h5.b.f119113l, "BSPLocEx", th2);
            }
            String string = builderAppendQueryParameter.build().toString();
            Intent intent = new Intent();
            intent.setPackage(str2);
            intent.addFlags(268435456);
            intent.setData(Uri.parse(string));
            Activity activity = this.f141861a;
            x5.a aVar = this.f141866f;
            h5.a.b(activity, aVar, str, aVar.f141085d);
            this.f141861a.startActivity(intent);
            z5.e.i(j5.a.f124275z, "pay scheme waiting " + string);
            countDownLatch.await();
            String str4 = this.f141868h;
            try {
                str3 = j.d(this.f141866f, str4).get(j.f141892a);
                if (str3 == null) {
                    str3 = "null";
                }
            } catch (Throwable th3) {
                h5.a.e(this.f141866f, h5.b.f119113l, "BSPStatEx", th3);
                str3 = "unknown";
            }
            h5.a.c(this.f141866f, h5.b.f119113l, "BSPDone-" + str3);
            if (!TextUtils.isEmpty(str4)) {
                return str4;
            }
            h5.a.c(this.f141866f, h5.b.f119113l, "BSPEmpty");
            return f141860k;
        } catch (InterruptedException e10) {
            h5.a.e(this.f141866f, h5.b.f119113l, "BSPWaiting", e10);
            com.alipay.sdk.m.j.c cVar = com.alipay.sdk.m.j.c.PAY_WAITTING;
            return f5.b.b(cVar.b(), cVar.a(), "");
        } catch (Throwable th4) {
            h5.a.e(this.f141866f, h5.b.f119113l, "BSPEx", th4);
            return f141860k;
        }
    }

    private String d(String str, String str2, PackageInfo packageInfo) {
        String str3 = packageInfo != null ? packageInfo.versionName : "";
        z5.e.i(j5.a.f124275z, "pay payInvokeAct");
        h5.a.d(this.f141866f, h5.b.f119113l, h5.b.X, str2 + "|" + str3);
        Activity activity = this.f141861a;
        x5.a aVar = this.f141866f;
        h5.a.b(activity, aVar, str, aVar.f141085d);
        return m(str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00df  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:50:0x0103  */
    /* JADX WARN: Code duplicated, block: B:62:0x012e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0138  */
    /* JADX WARN: Code duplicated, block: B:66:0x013c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0156  */
    /* JADX WARN: Code duplicated, block: B:85:0x0189 A[RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00e9, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x013c, please report this as an issue */
    private String e(String str, String str2, PackageInfo packageInfo, l.c cVar) {
        String str3;
        x5.a aVar;
        Activity activity;
        boolean zContains = false;
        int i10 = packageInfo != null ? packageInfo.versionCode : 0;
        z5.e.i(j5.a.f124275z, "pay bind or scheme");
        x5.a aVar2 = this.f141866f;
        if (aVar2 != null && !TextUtils.isEmpty(aVar2.f141088g)) {
            zContains = this.f141866f.f141088g.toLowerCase().contains("auth");
        }
        if (zContains || !l.g0()) {
            if (zContains || !l.R(this.f141866f, str2)) {
                if (cVar != null) {
                    try {
                        if (!l5.a.d().D()) {
                            j(cVar);
                        }
                    } catch (Throwable unused) {
                    }
                }
                Pair<String, Boolean> pairA = a(str, str2, this.f141866f);
                str3 = (String) pairA.first;
                try {
                    if (f141859j.equals(str3) && ((Boolean) pairA.second).booleanValue() && l5.a.d().B()) {
                        h5.a.c(this.f141866f, h5.b.f119113l, "BindRetry");
                        str3 = (String) a(str, str2, this.f141866f).first;
                    }
                } catch (Throwable th2) {
                    h5.a.e(this.f141866f, h5.b.f119113l, "BindRetryEx", th2);
                }
            } else {
                if (cVar != null) {
                    try {
                        if (l5.a.d().b()) {
                            j(cVar);
                        }
                    } catch (Throwable unused2) {
                    }
                }
                h5.a.c(this.f141866f, h5.b.f119113l, "BindSkipByL");
            }
            z5.e.i(j5.a.f124275z, "pay bind result: " + str3);
            Activity activity2 = this.f141861a;
            x5.a aVar3 = this.f141866f;
            h5.a.b(activity2, aVar3, str, aVar3.f141085d);
            if (f141859j.equals(str3)) {
                return str3;
            }
            if (!l.f141897b.equals(str2)) {
                h5.a.d(this.f141866f, h5.b.f119113l, "BSPNotStartByAlipay", str2 + "|" + i10);
                return str3;
            }
            boolean zE = l5.a.d().E();
            if (i10 < 460 && zE && !zContains && (activity = this.f141861a) != null && o(str2, activity, this.f141866f)) {
                return d(str, str2, packageInfo);
            }
            if (!l5.a.d().w()) {
                h5.a.d(this.f141866f, h5.b.f119113l, "BSPNotStartByConfig", "");
                return str3;
            }
            if (i10 > 125) {
                h5.a.d(this.f141866f, h5.b.f119113l, "BSPNotStartByPkg", str2 + "|" + i10);
                return str3;
            }
            if (l5.a.d().A() || (aVar = this.f141866f) == null || l.C(aVar.f141087f) == 0) {
                Activity activity3 = this.f141861a;
                return (activity3 == null || !k(str2, activity3, this.f141866f)) ? f141860k : c(str, str2);
            }
            h5.a.c(this.f141866f, h5.b.f119113l, "BSPNotStartByUsr");
            return str3;
        }
        if (cVar != null) {
            try {
                if (l5.a.d().b()) {
                    j(cVar);
                }
            } catch (Throwable unused3) {
            }
        }
        h5.a.c(this.f141866f, h5.b.f119113l, "BindSkipByModel");
        str3 = f141859j;
        z5.e.i(j5.a.f124275z, "pay bind result: " + str3);
        Activity activity4 = this.f141861a;
        x5.a aVar4 = this.f141866f;
        h5.a.b(activity4, aVar4, str, aVar4.f141085d);
        if (f141859j.equals(str3)) {
            return str3;
        }
        if (!l.f141897b.equals(str2)) {
            h5.a.d(this.f141866f, h5.b.f119113l, "BSPNotStartByAlipay", str2 + "|" + i10);
            return str3;
        }
        boolean zE2 = l5.a.d().E();
        if (i10 < 460) {
        }
        if (!l5.a.d().w()) {
            h5.a.d(this.f141866f, h5.b.f119113l, "BSPNotStartByConfig", "");
            return str3;
        }
        if (i10 > 125) {
            if (l5.a.d().A()) {
            }
            Activity activity5 = this.f141861a;
            if (activity5 == null) {
                return f141860k;
            }
        }
        h5.a.d(this.f141866f, h5.b.f119113l, "BSPNotStartByPkg", str2 + "|" + i10);
        return str3;
    }

    private void j(l.c cVar) throws InterruptedException {
        PackageInfo packageInfo;
        if (cVar == null || (packageInfo = cVar.f141907a) == null) {
            return;
        }
        String str = packageInfo.packageName;
        Intent intent = new Intent();
        intent.setClassName(str, "com.alipay.android.app.TransProcessPayActivity");
        try {
            this.f141861a.startActivity(intent);
        } catch (Throwable th2) {
            h5.a.e(this.f141866f, h5.b.f119113l, h5.b.f119107g0, th2);
        }
        Thread.sleep(200L);
    }

    public static boolean k(String str, Context context, x5.a aVar) {
        try {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.setClassName(str, "com.alipay.android.msp.ui.views.MspContainerActivity");
            if (intent.resolveActivityInfo(context.getPackageManager(), 0) != null) {
                return true;
            }
            h5.a.c(aVar, h5.b.f119113l, "BSPDetectFail");
            return false;
        } catch (Throwable th2) {
            h5.a.e(aVar, h5.b.f119113l, "BSPDetectFail", th2);
            return false;
        }
    }

    private String m(String str, String str2) {
        JSONObject jSONObject;
        Object obj = new Object();
        String strG = l.g(32);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        h5.a.d(this.f141866f, h5.b.f119113l, "BSAStart", strG + "|" + jElapsedRealtime);
        x5.a.C1277a.d(this.f141866f, strG);
        b bVar = new b(obj);
        APayEntranceActivity.f39424i.put(strG, bVar);
        try {
            HashMap<String, String> mapF = x5.a.f(this.f141866f);
            mapF.put("ts_intent", String.valueOf(jElapsedRealtime));
            jSONObject = new JSONObject(mapF);
        } catch (Throwable th2) {
            try {
                h5.a.e(this.f141866f, h5.b.f119113l, "BSALocEx", th2);
                jSONObject = null;
            } catch (InterruptedException e10) {
                h5.a.e(this.f141866f, h5.b.f119113l, "BSAWaiting", e10);
                com.alipay.sdk.m.j.c cVar = com.alipay.sdk.m.j.c.PAY_WAITTING;
                return f5.b.b(cVar.b(), cVar.a(), "");
            } catch (Throwable th3) {
                h5.a.e(this.f141866f, h5.b.f119113l, "BSAEx", th3);
                l.u("alipaySdk", j5.b.f124292q, this.f141861a, this.f141866f);
                return f141860k;
            }
        }
        Intent intent = new Intent(this.f141861a, (Class<?>) APayEntranceActivity.class);
        intent.putExtra(APayEntranceActivity.f39420e, str);
        intent.putExtra(APayEntranceActivity.f39421f, str2);
        intent.putExtra(APayEntranceActivity.f39422g, strG);
        if (jSONObject != null) {
            intent.putExtra(APayEntranceActivity.f39423h, jSONObject.toString());
        }
        new Handler(Looper.getMainLooper()).postDelayed(new c(bVar), l5.a.d().y());
        Activity activity = this.f141861a;
        x5.a aVar = this.f141866f;
        h5.a.b(activity, aVar, str, aVar.f141085d);
        if (l5.a.d().N()) {
            new Handler(Looper.getMainLooper()).post(new d(intent, obj));
        } else {
            try {
                Activity activity2 = this.f141861a;
                if (activity2 != null) {
                    activity2.startActivity(intent);
                } else {
                    h5.a.i(this.f141866f, h5.b.f119113l, h5.b.f119101a0, "");
                    Context contextA = this.f141866f.a();
                    if (contextA != null) {
                        contextA.startActivity(intent);
                    }
                }
            } catch (Throwable th4) {
                h5.a.e(this.f141866f, h5.b.f119113l, h5.b.f119102b0, th4);
                throw th4;
            }
        }
        synchronized (obj) {
            obj.wait();
        }
        String str3 = this.f141869i;
        String str4 = "unknown";
        try {
            String str5 = j.d(this.f141866f, str3).get(j.f141892a);
            str4 = str5 == null ? "null" : str5;
        } catch (Throwable th5) {
            h5.a.e(this.f141866f, h5.b.f119113l, "BSAStatEx", th5);
        }
        h5.a.c(this.f141866f, h5.b.f119113l, "BSADone-" + str4);
        if (!TextUtils.isEmpty(str3)) {
            return str3;
        }
        h5.a.c(this.f141866f, h5.b.f119113l, "BSAEmpty");
        return f141860k;
    }

    public static boolean o(String str, Context context, x5.a aVar) {
        try {
            Intent intent = new Intent();
            intent.setClassName(str, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            if (intent.resolveActivityInfo(context.getPackageManager(), 0) != null) {
                return true;
            }
            h5.a.c(aVar, h5.b.f119113l, "BSADetectFail");
            return false;
        } catch (Throwable th2) {
            h5.a.e(aVar, h5.b.f119113l, "BSADetectFail", th2);
            return false;
        }
    }

    public String f(String str, boolean z10) {
        l.c cVarT;
        String strD = "";
        PackageInfo packageInfo = null;
        try {
            List<l5.a.b> listZ = l5.a.d().z();
            if (!l5.a.d().f130865h || listZ == null) {
                listZ = f5.a.f118751d;
            }
            cVarT = l.t(this.f141866f, this.f141861a, listZ);
            if (cVarT != null) {
                try {
                    if (cVarT.b(this.f141866f) || cVarT.a() || l.w(cVarT.f141907a)) {
                        return f141859j;
                    }
                    PackageInfo packageInfo2 = cVarT.f141907a;
                    strD = (packageInfo2 == null || l.f141897b.equals(packageInfo2.packageName)) ? l.D() : cVarT.f141907a.packageName;
                    PackageInfo packageInfo3 = cVarT.f141907a;
                    packageInfo = packageInfo3 != null ? packageInfo3 : null;
                    String strQ = l5.a.d().q();
                    if (strQ != null && strQ.length() > 0) {
                        try {
                            JSONObject jSONObjectOptJSONObject = new JSONObject(strQ).optJSONObject(strD);
                            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    int i10 = Integer.parseInt(next);
                                    if (packageInfo != null && packageInfo.versionCode >= i10) {
                                        try {
                                            boolean zO = l5.a.d().o(this.f141861a, Integer.parseInt(jSONObjectOptJSONObject.getString(next)));
                                            this.f141867g = zO;
                                            if (zO) {
                                                break;
                                            }
                                        } catch (Exception unused) {
                                            continue;
                                        }
                                    }
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    h5.a.e(this.f141866f, h5.b.f119113l, h5.b.N, th);
                }
                return ((z10 || this.f141867g) && !l.J(this.f141866f) && o(strD, this.f141861a, this.f141866f)) ? d(str, strD, packageInfo) : e(str, strD, packageInfo, cVarT);
            }
            return f141859j;
        } catch (Throwable th3) {
            th = th3;
            cVarT = null;
        }
    }

    public void i() {
        this.f141861a = null;
        this.f141865e = null;
    }
}
