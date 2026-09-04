package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.k1;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public abstract class d<T extends IInterface> {

    @v8.a
    public static final int D = 1;

    @v8.a
    public static final int E = 4;

    @v8.a
    public static final int F = 5;

    @androidx.annotation.n0
    @v8.a
    public static final String G = "pendingIntent";

    @androidx.annotation.n0
    @v8.a
    public static final String H = "<<default account>>";
    private boolean A;

    @androidx.annotation.p0
    private volatile zzj B;

    @androidx.annotation.n0
    @z8.d0
    protected AtomicInteger C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f52475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f52476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f52477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f52478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f52479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private volatile String f52480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @z8.d0
    a1 f52481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f52482h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Looper f52483i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f f52484j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.common.e f52485k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final Handler f52486l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f52487m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f52488n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @GuardedBy("mServiceBrokerLock")
    @androidx.annotation.p0
    private l f52489o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    @z8.d0
    protected c f52490p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @GuardedBy("mLock")
    @androidx.annotation.p0
    private IInterface f52491q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ArrayList f52492r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @GuardedBy("mLock")
    @androidx.annotation.p0
    private k0 f52493s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @GuardedBy("mLock")
    private int f52494t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.p0
    private final a f52495u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.p0
    private final b f52496v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f52497w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f52498x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.p0
    private volatile String f52499y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.p0
    private ConnectionResult f52500z;
    private static final Feature[] J = new Feature[0];

    @androidx.annotation.n0
    @v8.a
    public static final String[] I = {"service_esmobile", "service_googleme"};

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @v8.a
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @v8.a
        public static final int f52501a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @v8.a
        public static final int f52502b = 3;

        @v8.a
        void a(@androidx.annotation.p0 Bundle bundle);

        @v8.a
        void onConnectionSuspended(int i10);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @v8.a
    public interface b {
        @v8.a
        void a(@androidx.annotation.n0 ConnectionResult connectionResult);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @v8.a
    public interface c {
        @v8.a
        void a(@androidx.annotation.n0 ConnectionResult connectionResult);
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public class C0410d implements c {
        @v8.a
        public C0410d() {
        }

        @Override // com.google.android.gms.common.internal.d.c
        public final void a(@androidx.annotation.n0 ConnectionResult connectionResult) {
            if (connectionResult.h()) {
                d dVar = d.this;
                dVar.v(null, dVar.w());
            } else if (d.this.f52496v != null) {
                d.this.f52496v.a(connectionResult);
            }
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @v8.a
    public interface e {
        @v8.a
        void a();
    }

    @v8.a
    @z8.d0
    protected d(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Handler handler, @androidx.annotation.n0 f fVar, @androidx.annotation.n0 com.google.android.gms.common.e eVar, int i10, @androidx.annotation.p0 a aVar, @androidx.annotation.p0 b bVar) {
        this.f52480f = null;
        this.f52487m = new Object();
        this.f52488n = new Object();
        this.f52492r = new ArrayList();
        this.f52494t = 1;
        this.f52500z = null;
        this.A = false;
        this.B = null;
        this.C = new AtomicInteger(0);
        p.m(context, "Context must not be null");
        this.f52482h = context;
        p.m(handler, "Handler must not be null");
        this.f52486l = handler;
        this.f52483i = handler.getLooper();
        p.m(fVar, "Supervisor must not be null");
        this.f52484j = fVar;
        p.m(eVar, "API availability must not be null");
        this.f52485k = eVar;
        this.f52497w = i10;
        this.f52495u = aVar;
        this.f52496v = bVar;
        this.f52498x = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @v8.a
    protected d(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Looper looper, int i10, @androidx.annotation.p0 a aVar, @androidx.annotation.p0 b bVar, @androidx.annotation.p0 String str) {
        f fVarD = f.d(context);
        com.google.android.gms.common.e eVarI = com.google.android.gms.common.e.i();
        p.l(aVar);
        p.l(bVar);
        this(context, looper, fVarD, eVarI, i10, aVar, bVar, str);
    }

    @v8.a
    @z8.d0
    protected d(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Looper looper, @androidx.annotation.n0 f fVar, @androidx.annotation.n0 com.google.android.gms.common.e eVar, int i10, @androidx.annotation.p0 a aVar, @androidx.annotation.p0 b bVar, @androidx.annotation.p0 String str) {
        this.f52480f = null;
        this.f52487m = new Object();
        this.f52488n = new Object();
        this.f52492r = new ArrayList();
        this.f52494t = 1;
        this.f52500z = null;
        this.A = false;
        this.B = null;
        this.C = new AtomicInteger(0);
        p.m(context, "Context must not be null");
        this.f52482h = context;
        p.m(looper, "Looper must not be null");
        this.f52483i = looper;
        p.m(fVar, "Supervisor must not be null");
        this.f52484j = fVar;
        p.m(eVar, "API availability must not be null");
        this.f52485k = eVar;
        this.f52486l = new h0(this, looper);
        this.f52497w = i10;
        this.f52495u = aVar;
        this.f52496v = bVar;
        this.f52498x = str;
    }

    static /* bridge */ /* synthetic */ void e0(d dVar, zzj zzjVar) {
        dVar.B = zzjVar;
        if (dVar.U()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.f52582e;
            r.b().c(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.j());
        }
    }

    static /* bridge */ /* synthetic */ void f0(d dVar, int i10) {
        int i11;
        int i12;
        synchronized (dVar.f52487m) {
            i11 = dVar.f52494t;
        }
        if (i11 == 3) {
            dVar.A = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = dVar.f52486l;
        handler.sendMessage(handler.obtainMessage(i12, dVar.C.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean i0(d dVar, int i10, int i11, IInterface iInterface) {
        synchronized (dVar.f52487m) {
            if (dVar.f52494t != i10) {
                return false;
            }
            dVar.k0(i11, iInterface);
            return true;
        }
    }

    static /* bridge */ /* synthetic */ boolean j0(d dVar) {
        if (dVar.A || TextUtils.isEmpty(dVar.z()) || TextUtils.isEmpty(dVar.s())) {
            return false;
        }
        try {
            Class.forName(dVar.z());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(int i10, @androidx.annotation.p0 IInterface iInterface) {
        a1 a1Var;
        p.a((i10 == 4) == (iInterface != null));
        synchronized (this.f52487m) {
            this.f52494t = i10;
            this.f52491q = iInterface;
            if (i10 == 1) {
                k0 k0Var = this.f52493s;
                if (k0Var != null) {
                    f fVar = this.f52484j;
                    String strC = this.f52481g.c();
                    p.l(strC);
                    fVar.j(strC, this.f52481g.b(), this.f52481g.a(), k0Var, Z(), this.f52481g.d());
                    this.f52493s = null;
                }
            } else if (i10 == 2 || i10 == 3) {
                k0 k0Var2 = this.f52493s;
                if (k0Var2 != null && (a1Var = this.f52481g) != null) {
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + a1Var.c() + " on " + a1Var.b());
                    f fVar2 = this.f52484j;
                    String strC2 = this.f52481g.c();
                    p.l(strC2);
                    fVar2.j(strC2, this.f52481g.b(), this.f52481g.a(), k0Var2, Z(), this.f52481g.d());
                    this.C.incrementAndGet();
                }
                k0 k0Var3 = new k0(this, this.C.get());
                this.f52493s = k0Var3;
                a1 a1Var2 = (this.f52494t != 3 || s() == null) ? new a1(C(), B(), false, f.c(), E()) : new a1(n().getPackageName(), s(), true, f.c(), false);
                this.f52481g = a1Var2;
                if (a1Var2.d() && u() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f52481g.c())));
                }
                f fVar3 = this.f52484j;
                String strC3 = this.f52481g.c();
                p.l(strC3);
                if (!fVar3.k(new s0(strC3, this.f52481g.b(), this.f52481g.a(), this.f52481g.d()), k0Var3, Z(), l())) {
                    Log.w("GmsClient", "unable to connect to service: " + this.f52481g.c() + " on " + this.f52481g.b());
                    g0(16, null, this.C.get());
                }
            } else if (i10 == 4) {
                p.l(iInterface);
                I(iInterface);
            }
        }
    }

    @androidx.annotation.n0
    @v8.a
    public Intent A() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @androidx.annotation.n0
    @v8.a
    protected abstract String B();

    @androidx.annotation.n0
    @v8.a
    protected String C() {
        return "com.google.android.gms";
    }

    @v8.a
    @androidx.annotation.p0
    public ConnectionTelemetryConfiguration D() {
        zzj zzjVar = this.B;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.f52582e;
    }

    @v8.a
    protected boolean E() {
        return u() >= 211700000;
    }

    @v8.a
    public boolean F() {
        return this.B != null;
    }

    @v8.a
    public boolean G() {
        boolean z10;
        synchronized (this.f52487m) {
            z10 = this.f52494t == 4;
        }
        return z10;
    }

    @v8.a
    public boolean H() {
        boolean z10;
        synchronized (this.f52487m) {
            int i10 = this.f52494t;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    @androidx.annotation.i
    @v8.a
    protected void I(@androidx.annotation.n0 T t10) {
        this.f52477c = System.currentTimeMillis();
    }

    @androidx.annotation.i
    @v8.a
    protected void J(@androidx.annotation.n0 ConnectionResult connectionResult) {
        this.f52478d = connectionResult.b();
        this.f52479e = System.currentTimeMillis();
    }

    @androidx.annotation.i
    @v8.a
    protected void K(int i10) {
        this.f52475a = i10;
        this.f52476b = System.currentTimeMillis();
    }

    @v8.a
    protected void L(int i10, @androidx.annotation.p0 IBinder iBinder, @androidx.annotation.p0 Bundle bundle, int i11) {
        Handler handler = this.f52486l;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, new l0(this, i10, iBinder, bundle)));
    }

    @v8.a
    public void M(@androidx.annotation.n0 e eVar) {
        eVar.a();
    }

    @v8.a
    public boolean N() {
        return false;
    }

    @v8.a
    public boolean O() {
        return false;
    }

    @v8.a
    public boolean P() {
        return true;
    }

    @v8.a
    public boolean Q() {
        return false;
    }

    @v8.a
    public void R(@androidx.annotation.n0 String str) {
        this.f52499y = str;
    }

    @v8.a
    public void S(int i10) {
        Handler handler = this.f52486l;
        handler.sendMessage(handler.obtainMessage(6, this.C.get(), i10));
    }

    @v8.a
    @z8.d0
    protected void T(@androidx.annotation.n0 c cVar, int i10, @androidx.annotation.p0 PendingIntent pendingIntent) {
        p.m(cVar, "Connection progress callbacks cannot be null.");
        this.f52490p = cVar;
        Handler handler = this.f52486l;
        handler.sendMessage(handler.obtainMessage(3, this.C.get(), i10, pendingIntent));
    }

    @v8.a
    public boolean U() {
        return false;
    }

    @androidx.annotation.n0
    protected final String Z() {
        String str = this.f52498x;
        return str == null ? this.f52482h.getClass().getName() : str;
    }

    @v8.a
    public void a() {
        int iK = this.f52485k.k(this.f52482h, u());
        if (iK == 0) {
            c(new C0410d());
        } else {
            k0(1, null);
            T(new C0410d(), iK, null);
        }
    }

    @v8.a
    protected final void b() {
        if (!G()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    @v8.a
    public void c(@androidx.annotation.n0 c cVar) {
        p.m(cVar, "Connection progress callbacks cannot be null.");
        this.f52490p = cVar;
        k0(2, null);
    }

    @v8.a
    @androidx.annotation.p0
    protected abstract T d(@androidx.annotation.n0 IBinder iBinder);

    @v8.a
    public void e() {
        this.C.incrementAndGet();
        synchronized (this.f52492r) {
            int size = this.f52492r.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((i0) this.f52492r.get(i10)).d();
            }
            this.f52492r.clear();
        }
        synchronized (this.f52488n) {
            this.f52489o = null;
        }
        k0(1, null);
    }

    @v8.a
    public void f(@androidx.annotation.n0 String str) {
        this.f52480f = str;
        e();
    }

    @v8.a
    public void g(@androidx.annotation.n0 String str, @androidx.annotation.n0 FileDescriptor fileDescriptor, @androidx.annotation.n0 PrintWriter printWriter, @androidx.annotation.n0 String[] strArr) {
        int i10;
        IInterface iInterface;
        l lVar;
        synchronized (this.f52487m) {
            i10 = this.f52494t;
            iInterface = this.f52491q;
        }
        synchronized (this.f52488n) {
            lVar = this.f52489o;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i10 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i10 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i10 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i10 == 4) {
            printWriter.print("CONNECTED");
        } else if (i10 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) z()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (lVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(lVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f52477c > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.f52477c;
            printWriterAppend.println(j10 + " " + simpleDateFormat.format(new Date(j10)));
        }
        if (this.f52476b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.f52475a;
            if (i11 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i11 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i11 != 3) {
                printWriter.append((CharSequence) String.valueOf(i11));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.f52476b;
            printWriterAppend2.println(j11 + " " + simpleDateFormat.format(new Date(j11)));
        }
        if (this.f52479e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) com.google.android.gms.common.api.a.a(this.f52478d));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j12 = this.f52479e;
            printWriterAppend3.println(j12 + " " + simpleDateFormat.format(new Date(j12)));
        }
    }

    protected final void g0(int i10, @androidx.annotation.p0 Bundle bundle, int i11) {
        Handler handler = this.f52486l;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, new m0(this, i10, null)));
    }

    @v8.a
    protected boolean h() {
        return false;
    }

    @v8.a
    @androidx.annotation.p0
    public Account i() {
        return null;
    }

    @androidx.annotation.n0
    @v8.a
    public Feature[] j() {
        return J;
    }

    @v8.a
    @androidx.annotation.p0
    public final Feature[] k() {
        zzj zzjVar = this.B;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.f52580c;
    }

    @v8.a
    @androidx.annotation.p0
    protected Executor l() {
        return null;
    }

    @v8.a
    @androidx.annotation.p0
    public Bundle m() {
        return null;
    }

    @androidx.annotation.n0
    @v8.a
    public final Context n() {
        return this.f52482h;
    }

    @androidx.annotation.n0
    @v8.a
    public String o() {
        a1 a1Var;
        if (!G() || (a1Var = this.f52481g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return a1Var.b();
    }

    @v8.a
    public int p() {
        return this.f52497w;
    }

    @androidx.annotation.n0
    @v8.a
    protected Bundle q() {
        return new Bundle();
    }

    @v8.a
    @androidx.annotation.p0
    public String r() {
        return this.f52480f;
    }

    @v8.a
    @androidx.annotation.p0
    protected String s() {
        return null;
    }

    @androidx.annotation.n0
    @v8.a
    public final Looper t() {
        return this.f52483i;
    }

    @v8.a
    public int u() {
        return com.google.android.gms.common.e.f52411a;
    }

    @k1
    @v8.a
    public void v(@androidx.annotation.p0 i iVar, @androidx.annotation.n0 Set<Scope> set) {
        Bundle bundleQ = q();
        int i10 = this.f52497w;
        String str = this.f52499y;
        int i11 = com.google.android.gms.common.e.f52411a;
        Scope[] scopeArr = GetServiceRequest.f52448p;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f52449q;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i10, i11, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f52453e = this.f52482h.getPackageName();
        getServiceRequest.f52456h = bundleQ;
        if (set != null) {
            getServiceRequest.f52455g = (Scope[]) set.toArray(new Scope[0]);
        }
        if (Q()) {
            Account accountI = i();
            if (accountI == null) {
                accountI = new Account("<<default account>>", com.google.android.gms.common.internal.b.f52473a);
            }
            getServiceRequest.f52457i = accountI;
            if (iVar != null) {
                getServiceRequest.f52454f = iVar.asBinder();
            }
        } else if (O()) {
            getServiceRequest.f52457i = i();
        }
        getServiceRequest.f52458j = J;
        getServiceRequest.f52459k = j();
        if (U()) {
            getServiceRequest.f52462n = true;
        }
        try {
            synchronized (this.f52488n) {
                l lVar = this.f52489o;
                if (lVar != null) {
                    lVar.S(new j0(this, this.C.get()), getServiceRequest);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            S(3);
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            L(8, null, null, this.C.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            L(8, null, null, this.C.get());
        }
    }

    @androidx.annotation.n0
    @v8.a
    protected Set<Scope> w() {
        return Collections.emptySet();
    }

    @androidx.annotation.n0
    @v8.a
    public final T x() throws DeadObjectException {
        T t10;
        synchronized (this.f52487m) {
            if (this.f52494t == 5) {
                throw new DeadObjectException();
            }
            b();
            t10 = (T) this.f52491q;
            p.m(t10, "Client is connected but service is null");
        }
        return t10;
    }

    @v8.a
    @androidx.annotation.p0
    public IBinder y() {
        synchronized (this.f52488n) {
            l lVar = this.f52489o;
            if (lVar == null) {
                return null;
            }
            return lVar.asBinder();
        }
    }

    @androidx.annotation.n0
    @v8.a
    protected abstract String z();
}
