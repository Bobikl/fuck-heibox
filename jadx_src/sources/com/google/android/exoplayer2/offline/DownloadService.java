package com.google.android.exoplayer2.offline;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.d1;
import androidx.annotation.p0;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.util.u0;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class DownloadService extends Service {
    public static final long A = 1000;
    private static final String B = "DownloadService";
    private static final HashMap<Class<? extends DownloadService>, b> C = new HashMap<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f47108l = "com.google.android.exoplayer.downloadService.action.INIT";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f47109m = "com.google.android.exoplayer.downloadService.action.RESTART";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f47110n = "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f47111o = "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f47112p = "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f47113q = "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f47114r = "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f47115s = "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f47116t = "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f47117u = "download_request";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f47118v = "content_id";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f47119w = "stop_reason";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f47120x = "requirements";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f47121y = "foreground";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f47122z = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final c f47123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final String f47124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d1
    private final int f47125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d1
    private final int f47126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f47127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f47128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f47129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f47130i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f47131j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f47132k;

    public static final class b implements r.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f47133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final r f47134b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f47135c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private final com.google.android.exoplayer2.scheduler.c f47136d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Class<? extends DownloadService> f47137e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private DownloadService f47138f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Requirements f47139g;

        private b(Context context, r rVar, boolean z10, @p0 com.google.android.exoplayer2.scheduler.c cVar, Class<? extends DownloadService> cls) {
            this.f47133a = context;
            this.f47134b = rVar;
            this.f47135c = z10;
            this.f47136d = cVar;
            this.f47137e = cls;
            rVar.e(this);
            q();
        }

        @mk.m({"scheduler"})
        private void k() {
            Requirements requirements = new Requirements(0);
            if (o(requirements)) {
                this.f47136d.cancel();
                this.f47139g = requirements;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(DownloadService downloadService) {
            downloadService.A(this.f47134b.g());
        }

        private void n() {
            if (this.f47135c) {
                try {
                    u0.s1(this.f47133a, DownloadService.s(this.f47133a, this.f47137e, DownloadService.f47109m));
                    return;
                } catch (IllegalStateException unused) {
                    com.google.android.exoplayer2.util.u.m(DownloadService.B, "Failed to restart (foreground launch restriction)");
                    return;
                }
            }
            try {
                this.f47133a.startService(DownloadService.s(this.f47133a, this.f47137e, DownloadService.f47108l));
            } catch (IllegalStateException unused2) {
                com.google.android.exoplayer2.util.u.m(DownloadService.B, "Failed to restart (process is idle)");
            }
        }

        private boolean o(Requirements requirements) {
            return !u0.c(this.f47139g, requirements);
        }

        private boolean p() {
            DownloadService downloadService = this.f47138f;
            return downloadService == null || downloadService.w();
        }

        @Override // com.google.android.exoplayer2.offline.r.d
        public /* synthetic */ void a(r rVar, boolean z10) {
            t.c(this, rVar, z10);
        }

        @Override // com.google.android.exoplayer2.offline.r.d
        public void b(r rVar, Requirements requirements, int i10) {
            q();
        }

        @Override // com.google.android.exoplayer2.offline.r.d
        public final void c(r rVar) {
            DownloadService downloadService = this.f47138f;
            if (downloadService != null) {
                downloadService.B();
            }
        }

        @Override // com.google.android.exoplayer2.offline.r.d
        public void d(r rVar) {
            DownloadService downloadService = this.f47138f;
            if (downloadService != null) {
                downloadService.A(rVar.g());
            }
        }

        @Override // com.google.android.exoplayer2.offline.r.d
        public void e(r rVar, boolean z10) {
            if (z10 || rVar.i() || !p()) {
                return;
            }
            List<e> listG = rVar.g();
            for (int i10 = 0; i10 < listG.size(); i10++) {
                if (listG.get(i10).f47236b == 0) {
                    n();
                    return;
                }
            }
        }

        @Override // com.google.android.exoplayer2.offline.r.d
        public void f(r rVar, e eVar, @p0 Exception exc) {
            DownloadService downloadService = this.f47138f;
            if (downloadService != null) {
                downloadService.y(eVar);
            }
            if (p() && DownloadService.x(eVar.f47236b)) {
                com.google.android.exoplayer2.util.u.m(DownloadService.B, "DownloadService wasn't running. Restarting.");
                n();
            }
        }

        @Override // com.google.android.exoplayer2.offline.r.d
        public void g(r rVar, e eVar) {
            DownloadService downloadService = this.f47138f;
            if (downloadService != null) {
                downloadService.z();
            }
        }

        public void j(final DownloadService downloadService) {
            com.google.android.exoplayer2.util.a.i(this.f47138f == null);
            this.f47138f = downloadService;
            if (this.f47134b.p()) {
                u0.A().postAtFrontOfQueue(new Runnable() { // from class: com.google.android.exoplayer2.offline.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f47305b.m(downloadService);
                    }
                });
            }
        }

        public void l(DownloadService downloadService) {
            com.google.android.exoplayer2.util.a.i(this.f47138f == downloadService);
            this.f47138f = null;
        }

        public boolean q() {
            boolean zQ = this.f47134b.q();
            if (this.f47136d == null) {
                return !zQ;
            }
            if (!zQ) {
                k();
                return true;
            }
            Requirements requirementsM = this.f47134b.m();
            if (!this.f47136d.a(requirementsM).equals(requirementsM)) {
                k();
                return false;
            }
            if (!o(requirementsM)) {
                return true;
            }
            if (this.f47136d.b(requirementsM, this.f47133a.getPackageName(), DownloadService.f47109m)) {
                this.f47139g = requirementsM;
                return true;
            }
            com.google.android.exoplayer2.util.u.m(DownloadService.B, "Failed to schedule restart");
            k();
            return false;
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f47140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f47141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f47142c = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f47143d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f47144e;

        public c(int i10, long j10) {
            this.f47140a = i10;
            this.f47141b = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            r rVar = ((b) com.google.android.exoplayer2.util.a.g(DownloadService.this.f47127f)).f47134b;
            Notification notificationR = DownloadService.this.r(rVar.g(), rVar.l());
            if (this.f47144e) {
                ((NotificationManager) DownloadService.this.getSystemService("notification")).notify(this.f47140a, notificationR);
            } else {
                DownloadService.this.startForeground(this.f47140a, notificationR);
                this.f47144e = true;
            }
            if (this.f47143d) {
                this.f47142c.removeCallbacksAndMessages(null);
                this.f47142c.postDelayed(new Runnable() { // from class: com.google.android.exoplayer2.offline.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f47307b.f();
                    }
                }, this.f47141b);
            }
        }

        public void b() {
            if (this.f47144e) {
                f();
            }
        }

        public void c() {
            if (this.f47144e) {
                return;
            }
            f();
        }

        public void d() {
            this.f47143d = true;
            f();
        }

        public void e() {
            this.f47143d = false;
            this.f47142c.removeCallbacksAndMessages(null);
        }
    }

    protected DownloadService(int i10) {
        this(i10, 1000L);
    }

    protected DownloadService(int i10, long j10) {
        this(i10, j10, null, 0, 0);
    }

    @Deprecated
    protected DownloadService(int i10, long j10, @p0 String str, @d1 int i11) {
        this(i10, j10, str, i11, 0);
    }

    protected DownloadService(int i10, long j10, @p0 String str, @d1 int i11, @d1 int i12) {
        if (i10 == 0) {
            this.f47123b = null;
            this.f47124c = null;
            this.f47125d = 0;
            this.f47126e = 0;
            return;
        }
        this.f47123b = new c(i10, j10);
        this.f47124c = str;
        this.f47125d = i11;
        this.f47126e = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(List<e> list) {
        if (this.f47123b != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (x(list.get(i10).f47236b)) {
                    this.f47123b.d();
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        c cVar = this.f47123b;
        if (cVar != null) {
            cVar.e();
        }
        if (((b) com.google.android.exoplayer2.util.a.g(this.f47127f)).q()) {
            if (u0.f51536a >= 28 || !this.f47130i) {
                this.f47131j |= stopSelfResult(this.f47128g);
            } else {
                stopSelf();
                this.f47131j = true;
            }
        }
    }

    public static void C(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, int i10, boolean z10) {
        M(context, i(context, cls, downloadRequest, i10, z10), z10);
    }

    public static void D(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, boolean z10) {
        M(context, j(context, cls, downloadRequest, z10), z10);
    }

    public static void E(Context context, Class<? extends DownloadService> cls, boolean z10) {
        M(context, k(context, cls, z10), z10);
    }

    public static void F(Context context, Class<? extends DownloadService> cls, boolean z10) {
        M(context, l(context, cls, z10), z10);
    }

    public static void G(Context context, Class<? extends DownloadService> cls, String str, boolean z10) {
        M(context, m(context, cls, str, z10), z10);
    }

    public static void H(Context context, Class<? extends DownloadService> cls, boolean z10) {
        M(context, n(context, cls, z10), z10);
    }

    public static void I(Context context, Class<? extends DownloadService> cls, Requirements requirements, boolean z10) {
        M(context, o(context, cls, requirements, z10), z10);
    }

    public static void J(Context context, Class<? extends DownloadService> cls, @p0 String str, int i10, boolean z10) {
        M(context, p(context, cls, str, i10, z10), z10);
    }

    public static void K(Context context, Class<? extends DownloadService> cls) {
        context.startService(s(context, cls, f47108l));
    }

    public static void L(Context context, Class<? extends DownloadService> cls) {
        u0.s1(context, t(context, cls, f47108l, true));
    }

    private static void M(Context context, Intent intent, boolean z10) {
        if (z10) {
            u0.s1(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static Intent i(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, int i10, boolean z10) {
        return t(context, cls, f47110n, z10).putExtra(f47117u, downloadRequest).putExtra(f47119w, i10);
    }

    public static Intent j(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, boolean z10) {
        return i(context, cls, downloadRequest, 0, z10);
    }

    public static Intent k(Context context, Class<? extends DownloadService> cls, boolean z10) {
        return t(context, cls, f47114r, z10);
    }

    public static Intent l(Context context, Class<? extends DownloadService> cls, boolean z10) {
        return t(context, cls, f47112p, z10);
    }

    public static Intent m(Context context, Class<? extends DownloadService> cls, String str, boolean z10) {
        return t(context, cls, f47111o, z10).putExtra(f47118v, str);
    }

    public static Intent n(Context context, Class<? extends DownloadService> cls, boolean z10) {
        return t(context, cls, f47113q, z10);
    }

    public static Intent o(Context context, Class<? extends DownloadService> cls, Requirements requirements, boolean z10) {
        return t(context, cls, f47116t, z10).putExtra(f47120x, requirements);
    }

    public static Intent p(Context context, Class<? extends DownloadService> cls, @p0 String str, int i10, boolean z10) {
        return t(context, cls, f47115s, z10).putExtra(f47118v, str).putExtra(f47119w, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Intent s(Context context, Class<? extends DownloadService> cls, String str) {
        return new Intent(context, cls).setAction(str);
    }

    private static Intent t(Context context, Class<? extends DownloadService> cls, String str, boolean z10) {
        return s(context, cls, str).putExtra(f47121y, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean w() {
        return this.f47131j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean x(int i10) {
        return i10 == 2 || i10 == 5 || i10 == 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(e eVar) {
        if (this.f47123b != null) {
            if (x(eVar.f47236b)) {
                this.f47123b.d();
            } else {
                this.f47123b.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        c cVar = this.f47123b;
        if (cVar != null) {
            cVar.b();
        }
    }

    @Override // android.app.Service
    @p0
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public void onCreate() {
        String str = this.f47124c;
        if (str != null) {
            com.google.android.exoplayer2.util.c0.a(this, str, this.f47125d, this.f47126e, 2);
        }
        Class<?> cls = getClass();
        HashMap<Class<? extends DownloadService>, b> map = C;
        b bVar = map.get(cls);
        if (bVar == null) {
            boolean z10 = this.f47123b != null;
            com.google.android.exoplayer2.scheduler.c cVarU = (z10 && (u0.f51536a < 31)) ? u() : null;
            r rVarQ = q();
            rVarQ.C();
            bVar = new b(getApplicationContext(), rVarQ, z10, cVarU, cls);
            map.put((Class<? extends DownloadService>) cls, bVar);
        }
        this.f47127f = bVar;
        bVar.j(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f47132k = true;
        ((b) com.google.android.exoplayer2.util.a.g(this.f47127f)).l(this);
        c cVar = this.f47123b;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@p0 Intent intent, int i10, int i11) {
        String stringExtra;
        c cVar;
        this.f47128g = i11;
        this.f47130i = false;
        String action = null;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra(f47118v);
            this.f47129h |= intent.getBooleanExtra(f47121y, false) || f47109m.equals(action);
        } else {
            stringExtra = null;
        }
        if (action == null) {
            action = f47108l;
        }
        r rVar = ((b) com.google.android.exoplayer2.util.a.g(this.f47127f)).f47134b;
        switch (action) {
            case "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD":
                DownloadRequest downloadRequest = (DownloadRequest) ((Intent) com.google.android.exoplayer2.util.a.g(intent)).getParcelableExtra(f47117u);
                if (downloadRequest != null) {
                    rVar.d(downloadRequest, intent.getIntExtra(f47119w, 0));
                    break;
                } else {
                    com.google.android.exoplayer2.util.u.d(B, "Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                rVar.C();
                break;
            case "com.google.android.exoplayer.downloadService.action.RESTART":
            case "com.google.android.exoplayer.downloadService.action.INIT":
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                rVar.z();
                break;
            case "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS":
                Requirements requirements = (Requirements) ((Intent) com.google.android.exoplayer2.util.a.g(intent)).getParcelableExtra(f47120x);
                if (requirements != null) {
                    rVar.G(requirements);
                    break;
                } else {
                    com.google.android.exoplayer2.util.u.d(B, "Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                rVar.x();
                break;
            case "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON":
                if (!((Intent) com.google.android.exoplayer2.util.a.g(intent)).hasExtra(f47119w)) {
                    com.google.android.exoplayer2.util.u.d(B, "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    rVar.H(stringExtra, intent.getIntExtra(f47119w, 0));
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra != null) {
                    rVar.A(stringExtra);
                    break;
                } else {
                    com.google.android.exoplayer2.util.u.d(B, "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                }
                break;
            default:
                com.google.android.exoplayer2.util.u.d(B, action.length() != 0 ? "Ignored unrecognized action: ".concat(action) : new String("Ignored unrecognized action: "));
                break;
        }
        if (u0.f51536a >= 26 && this.f47129h && (cVar = this.f47123b) != null) {
            cVar.c();
        }
        this.f47131j = false;
        if (rVar.o()) {
            B();
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        this.f47130i = true;
    }

    protected abstract r q();

    protected abstract Notification r(List<e> list, int i10);

    @p0
    protected abstract com.google.android.exoplayer2.scheduler.c u();

    protected final void v() {
        c cVar = this.f47123b;
        if (cVar == null || this.f47132k) {
            return;
        }
        cVar.b();
    }
}
