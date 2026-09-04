package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.core.app.l2;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.b3;
import com.google.android.exoplayer2.c3;
import com.google.android.exoplayer2.e3;
import com.google.android.exoplayer2.e4;
import com.google.android.exoplayer2.f3;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.m2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.p1;
import com.google.android.exoplayer2.z3;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class PlayerNotificationManager {
    public static final String O = "com.google.android.exoplayer.play";
    public static final String P = "com.google.android.exoplayer.pause";
    public static final String Q = "com.google.android.exoplayer.prev";
    public static final String R = "com.google.android.exoplayer.next";
    public static final String S = "com.google.android.exoplayer.ffwd";
    public static final String T = "com.google.android.exoplayer.rewind";
    public static final String U = "com.google.android.exoplayer.stop";
    public static final String V = "INSTANCE_ID";
    private static final String W = "com.google.android.exoplayer.dismiss";
    private static final int X = 0;
    private static final int Y = 1;
    private static int Z;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private int F;
    private boolean G;
    private int H;
    private int I;

    @androidx.annotation.v
    private int J;
    private int K;
    private int L;
    private boolean M;

    @androidx.annotation.p0
    private String N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f50472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f50473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f50474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f50475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private final f f50476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private final d f50477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f50478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final l2 f50479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final IntentFilter f50480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final c3.h f50481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final NotificationBroadcastReceiver f50482k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<String, androidx.core.app.o0.b> f50483l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map<String, androidx.core.app.o0.b> f50484m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final PendingIntent f50485n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f50486o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.core.app.o0.n f50487p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.p0
    private List<androidx.core.app.o0.b> f50488q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.p0
    private c3 f50489r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f50490s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f50491t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.p0
    private MediaSessionCompat.Token f50492u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f50493v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f50494w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f50495x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f50496y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f50497z;

    public class NotificationBroadcastReceiver extends BroadcastReceiver {
        private NotificationBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            c3 c3Var = PlayerNotificationManager.this.f50489r;
            if (c3Var != null && PlayerNotificationManager.this.f50490s && intent.getIntExtra(PlayerNotificationManager.V, PlayerNotificationManager.this.f50486o) == PlayerNotificationManager.this.f50486o) {
                String action = intent.getAction();
                if (PlayerNotificationManager.O.equals(action)) {
                    if (c3Var.getPlaybackState() == 1) {
                        c3Var.prepare();
                    } else if (c3Var.getPlaybackState() == 4) {
                        c3Var.E0(c3Var.Z1());
                    }
                    c3Var.play();
                    return;
                }
                if (PlayerNotificationManager.P.equals(action)) {
                    c3Var.pause();
                    return;
                }
                if (PlayerNotificationManager.Q.equals(action)) {
                    c3Var.m1();
                    return;
                }
                if (PlayerNotificationManager.T.equals(action)) {
                    c3Var.i2();
                    return;
                }
                if (PlayerNotificationManager.S.equals(action)) {
                    c3Var.P0();
                    return;
                }
                if (PlayerNotificationManager.R.equals(action)) {
                    c3Var.y1();
                    return;
                }
                if (PlayerNotificationManager.U.equals(action)) {
                    c3Var.r0(true);
                    return;
                }
                if (PlayerNotificationManager.W.equals(action)) {
                    PlayerNotificationManager.this.Q(true);
                } else {
                    if (action == null || PlayerNotificationManager.this.f50477f == null || !PlayerNotificationManager.this.f50484m.containsKey(action)) {
                        return;
                    }
                    PlayerNotificationManager.this.f50477f.c(c3Var, action, intent);
                }
            }
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f50499a;

        private b(int i10) {
            this.f50499a = i10;
        }

        public void a(Bitmap bitmap) {
            if (bitmap != null) {
                PlayerNotificationManager.this.s(bitmap, this.f50499a);
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Context f50501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final int f50502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final String f50503c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        protected f f50504d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        protected d f50505e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected e f50506f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        protected int f50507g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        protected int f50508h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        protected int f50509i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        protected int f50510j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        protected int f50511k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        protected int f50512l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        protected int f50513m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        protected int f50514n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        protected int f50515o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        protected int f50516p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        protected int f50517q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @androidx.annotation.p0
        protected String f50518r;

        public c(Context context, @androidx.annotation.f0(from = 1) int i10, String str) {
            com.google.android.exoplayer2.util.a.a(i10 > 0);
            this.f50501a = context;
            this.f50502b = i10;
            this.f50503c = str;
            this.f50509i = 2;
            this.f50506f = new com.google.android.exoplayer2.ui.f(null);
            this.f50510j = R.drawable.exo_notification_small_icon;
            this.f50512l = R.drawable.exo_notification_play;
            this.f50513m = R.drawable.exo_notification_pause;
            this.f50514n = R.drawable.exo_notification_stop;
            this.f50511k = R.drawable.exo_notification_rewind;
            this.f50515o = R.drawable.exo_notification_fastforward;
            this.f50516p = R.drawable.exo_notification_previous;
            this.f50517q = R.drawable.exo_notification_next;
        }

        @Deprecated
        public c(Context context, int i10, String str, e eVar) {
            this(context, i10, str);
            this.f50506f = eVar;
        }

        public PlayerNotificationManager a() {
            int i10 = this.f50507g;
            if (i10 != 0) {
                com.google.android.exoplayer2.util.c0.a(this.f50501a, this.f50503c, i10, this.f50508h, this.f50509i);
            }
            return new PlayerNotificationManager(this.f50501a, this.f50503c, this.f50502b, this.f50506f, this.f50504d, this.f50505e, this.f50510j, this.f50512l, this.f50513m, this.f50514n, this.f50511k, this.f50515o, this.f50516p, this.f50517q, this.f50518r);
        }

        public c b(int i10) {
            this.f50508h = i10;
            return this;
        }

        public c c(int i10) {
            this.f50509i = i10;
            return this;
        }

        public c d(int i10) {
            this.f50507g = i10;
            return this;
        }

        public c e(d dVar) {
            this.f50505e = dVar;
            return this;
        }

        public c f(int i10) {
            this.f50515o = i10;
            return this;
        }

        public c g(String str) {
            this.f50518r = str;
            return this;
        }

        public c h(e eVar) {
            this.f50506f = eVar;
            return this;
        }

        public c i(int i10) {
            this.f50517q = i10;
            return this;
        }

        public c j(f fVar) {
            this.f50504d = fVar;
            return this;
        }

        public c k(int i10) {
            this.f50513m = i10;
            return this;
        }

        public c l(int i10) {
            this.f50512l = i10;
            return this;
        }

        public c m(int i10) {
            this.f50516p = i10;
            return this;
        }

        public c n(int i10) {
            this.f50511k = i10;
            return this;
        }

        public c o(int i10) {
            this.f50510j = i10;
            return this;
        }

        public c p(int i10) {
            this.f50514n = i10;
            return this;
        }
    }

    public interface d {
        List<String> a(c3 c3Var);

        Map<String, androidx.core.app.o0.b> b(Context context, int i10);

        void c(c3 c3Var, String str, Intent intent);
    }

    public interface e {
        @androidx.annotation.p0
        PendingIntent a(c3 c3Var);

        CharSequence b(c3 c3Var);

        @androidx.annotation.p0
        CharSequence c(c3 c3Var);

        @androidx.annotation.p0
        Bitmap d(c3 c3Var, b bVar);

        @androidx.annotation.p0
        CharSequence e(c3 c3Var);
    }

    public interface f {
        void a(int i10, Notification notification, boolean z10);

        void b(int i10, boolean z10);
    }

    public class g implements c3.h {
        private g() {
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void B(int i10) {
            f3.b(this, i10);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void F(int i10, boolean z10) {
            f3.f(this, i10, z10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void H() {
            e3.v(this);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void K(com.google.android.exoplayer2.audio.f fVar) {
            f3.a(this, fVar);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void V(com.google.android.exoplayer2.p pVar) {
            f3.e(this, pVar);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void X() {
            f3.u(this);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.audio.t
        public /* synthetic */ void a(boolean z10) {
            f3.z(this, z10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void b(b3 b3Var) {
            f3.n(this, b3Var);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void c(c3.l lVar, c3.l lVar2, int i10) {
            f3.t(this, lVar, lVar2, i10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void d(z3 z3Var, int i10) {
            f3.B(this, z3Var, i10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void d0(p1 p1Var, com.google.android.exoplayer2.trackselection.p pVar) {
            e3.z(this, p1Var, pVar);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void e(m2 m2Var) {
            f3.k(this, m2Var);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void f(boolean z10) {
            f3.y(this, z10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void f0(com.google.android.exoplayer2.trackselection.u uVar) {
            e3.y(this, uVar);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.video.y
        public /* synthetic */ void g(com.google.android.exoplayer2.video.a0 a0Var) {
            f3.D(this, a0Var);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void g0(int i10, int i11) {
            f3.A(this, i10, i11);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void h(PlaybackException playbackException) {
            f3.r(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void h0(int i10) {
            e3.q(this, i10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void i(PlaybackException playbackException) {
            f3.q(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void j(long j10) {
            f3.x(this, j10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void k(boolean z10, int i10) {
            f3.m(this, z10, i10);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void k0(float f10) {
            f3.E(this, f10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void l(boolean z10) {
            f3.i(this, z10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void l0(boolean z10, int i10) {
            e3.o(this, z10, i10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void m(int i10) {
            f3.p(this, i10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void n(e4 e4Var) {
            f3.C(this, e4Var);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void o(c3.c cVar) {
            f3.c(this, cVar);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void onRepeatModeChanged(int i10) {
            f3.v(this, i10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void p(int i10) {
            f3.o(this, i10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void p0(long j10) {
            e3.f(this, j10);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void q(Metadata metadata) {
            f3.l(this, metadata);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void r(long j10) {
            f3.w(this, j10);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void t(List list) {
            f3.d(this, list);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void u(boolean z10) {
            f3.h(this, z10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public void v(c3 c3Var, c3.g gVar) {
            if (gVar.b(4, 5, 7, 0, 12, 11, 8, 9, 14)) {
                PlayerNotificationManager.this.r();
            }
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void w(i2 i2Var, int i10) {
            f3.j(this, i2Var, i10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void x(m2 m2Var) {
            f3.s(this, m2Var);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void y(boolean z10) {
            e3.e(this, z10);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface h {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface i {
    }

    protected PlayerNotificationManager(Context context, String str, int i10, e eVar, @androidx.annotation.p0 f fVar, @androidx.annotation.p0 d dVar, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, @androidx.annotation.p0 String str2) {
        Context applicationContext = context.getApplicationContext();
        this.f50472a = applicationContext;
        this.f50473b = str;
        this.f50474c = i10;
        this.f50475d = eVar;
        this.f50476e = fVar;
        this.f50477f = dVar;
        this.J = i11;
        this.N = str2;
        int i19 = Z;
        Z = i19 + 1;
        this.f50486o = i19;
        this.f50478g = com.google.android.exoplayer2.util.u0.x(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.exoplayer2.ui.n
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f50741b.p(message);
            }
        });
        this.f50479h = l2.p(applicationContext);
        this.f50481j = new g();
        this.f50482k = new NotificationBroadcastReceiver();
        this.f50480i = new IntentFilter();
        this.f50493v = true;
        this.f50494w = true;
        this.D = true;
        this.f50497z = true;
        this.A = true;
        this.G = true;
        this.M = true;
        this.I = 0;
        this.H = 0;
        this.L = -1;
        this.F = 1;
        this.K = 1;
        Map<String, androidx.core.app.o0.b> mapL = l(applicationContext, i19, i12, i13, i14, i15, i16, i17, i18);
        this.f50483l = mapL;
        Iterator<String> it = mapL.keySet().iterator();
        while (it.hasNext()) {
            this.f50480i.addAction(it.next());
        }
        Map<String, androidx.core.app.o0.b> mapB = dVar != null ? dVar.b(applicationContext, this.f50486o) : Collections.emptyMap();
        this.f50484m = mapB;
        Iterator<String> it2 = mapB.keySet().iterator();
        while (it2.hasNext()) {
            this.f50480i.addAction(it2.next());
        }
        this.f50485n = j(W, applicationContext, this.f50486o);
        this.f50480i.addAction(W);
    }

    private boolean O(c3 c3Var) {
        return (c3Var.getPlaybackState() == 4 || c3Var.getPlaybackState() == 1 || !c3Var.p0()) ? false : true;
    }

    private void P(c3 c3Var, @androidx.annotation.p0 Bitmap bitmap) {
        boolean zO = o(c3Var);
        androidx.core.app.o0.n nVarK = k(c3Var, this.f50487p, zO, bitmap);
        this.f50487p = nVarK;
        if (nVarK == null) {
            Q(false);
            return;
        }
        Notification notificationH = nVarK.h();
        this.f50479h.C(this.f50474c, notificationH);
        if (!this.f50490s) {
            this.f50472a.registerReceiver(this.f50482k, this.f50480i);
        }
        f fVar = this.f50476e;
        if (fVar != null) {
            fVar.a(this.f50474c, notificationH, zO || !this.f50490s);
        }
        this.f50490s = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(boolean z10) {
        if (this.f50490s) {
            this.f50490s = false;
            this.f50478g.removeMessages(0);
            this.f50479h.b(this.f50474c);
            this.f50472a.unregisterReceiver(this.f50482k);
            f fVar = this.f50476e;
            if (fVar != null) {
                fVar.b(this.f50474c, z10);
            }
        }
    }

    private static PendingIntent j(String str, Context context, int i10) {
        Intent intent = new Intent(str).setPackage(context.getPackageName());
        intent.putExtra(V, i10);
        return PendingIntent.getBroadcast(context, i10, intent, com.google.android.exoplayer2.util.u0.f51536a >= 23 ? 201326592 : 134217728);
    }

    private static Map<String, androidx.core.app.o0.b> l(Context context, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        HashMap map = new HashMap();
        map.put(O, new androidx.core.app.o0.b(i11, context.getString(R.string.exo_controls_play_description), j(O, context, i10)));
        map.put(P, new androidx.core.app.o0.b(i12, context.getString(R.string.exo_controls_pause_description), j(P, context, i10)));
        map.put(U, new androidx.core.app.o0.b(i13, context.getString(R.string.exo_controls_stop_description), j(U, context, i10)));
        map.put(T, new androidx.core.app.o0.b(i14, context.getString(R.string.exo_controls_rewind_description), j(T, context, i10)));
        map.put(S, new androidx.core.app.o0.b(i15, context.getString(R.string.exo_controls_fastforward_description), j(S, context, i10)));
        map.put(Q, new androidx.core.app.o0.b(i16, context.getString(R.string.exo_controls_previous_description), j(Q, context, i10)));
        map.put(R, new androidx.core.app.o0.b(i17, context.getString(R.string.exo_controls_next_description), j(R, context, i10)));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            c3 c3Var = this.f50489r;
            if (c3Var != null) {
                P(c3Var, null);
            }
        } else {
            if (i10 != 1) {
                return false;
            }
            c3 c3Var2 = this.f50489r;
            if (c3Var2 != null && this.f50490s && this.f50491t == message.arg1) {
                P(c3Var2, (Bitmap) message.obj);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (this.f50478g.hasMessages(0)) {
            return;
        }
        this.f50478g.sendEmptyMessage(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(Bitmap bitmap, int i10) {
        this.f50478g.obtainMessage(1, i10, -1, bitmap).sendToTarget();
    }

    private static void x(androidx.core.app.o0.n nVar, @androidx.annotation.p0 Bitmap bitmap) {
        nVar.c0(bitmap);
    }

    public final void A(int i10) {
        if (this.L == i10) {
            return;
        }
        if (i10 != -2 && i10 != -1 && i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException();
        }
        this.L = i10;
        q();
    }

    public final void B(@androidx.annotation.v int i10) {
        if (this.J != i10) {
            this.J = i10;
            q();
        }
    }

    public final void C(boolean z10) {
        if (this.M != z10) {
            this.M = z10;
            q();
        }
    }

    public final void D(boolean z10) {
        if (this.A != z10) {
            this.A = z10;
            q();
        }
    }

    public final void E(boolean z10) {
        if (this.C != z10) {
            this.C = z10;
            if (z10) {
                this.f50496y = false;
            }
            q();
        }
    }

    public final void F(boolean z10) {
        if (this.f50494w != z10) {
            this.f50494w = z10;
            q();
        }
    }

    public final void G(boolean z10) {
        if (this.f50496y != z10) {
            this.f50496y = z10;
            if (z10) {
                this.C = false;
            }
            q();
        }
    }

    public final void H(boolean z10) {
        if (this.D != z10) {
            this.D = z10;
            q();
        }
    }

    public final void I(boolean z10) {
        if (this.f50493v != z10) {
            this.f50493v = z10;
            q();
        }
    }

    public final void J(boolean z10) {
        if (this.f50495x != z10) {
            this.f50495x = z10;
            if (z10) {
                this.B = false;
            }
            q();
        }
    }

    public final void K(boolean z10) {
        if (this.f50497z != z10) {
            this.f50497z = z10;
            q();
        }
    }

    public final void L(boolean z10) {
        if (this.B != z10) {
            this.B = z10;
            if (z10) {
                this.f50495x = false;
            }
            q();
        }
    }

    public final void M(boolean z10) {
        if (this.E == z10) {
            return;
        }
        this.E = z10;
        q();
    }

    public final void N(int i10) {
        if (this.K == i10) {
            return;
        }
        if (i10 != -1 && i10 != 0 && i10 != 1) {
            throw new IllegalStateException();
        }
        this.K = i10;
        q();
    }

    @androidx.annotation.p0
    protected androidx.core.app.o0.n k(c3 c3Var, @androidx.annotation.p0 androidx.core.app.o0.n nVar, boolean z10, @androidx.annotation.p0 Bitmap bitmap) {
        if (c3Var.getPlaybackState() == 1 && c3Var.w1().x()) {
            this.f50488q = null;
            return null;
        }
        List<String> listN = n(c3Var);
        ArrayList arrayList = new ArrayList(listN.size());
        for (int i10 = 0; i10 < listN.size(); i10++) {
            String str = listN.get(i10);
            androidx.core.app.o0.b bVar = this.f50483l.containsKey(str) ? this.f50483l.get(str) : this.f50484m.get(str);
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        if (nVar == null || !arrayList.equals(this.f50488q)) {
            nVar = new androidx.core.app.o0.n(this.f50472a, this.f50473b);
            this.f50488q = arrayList;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                nVar.b((androidx.core.app.o0.b) arrayList.get(i11));
            }
        }
        androidx.media.app.a.e eVar = new androidx.media.app.a.e();
        MediaSessionCompat.Token token = this.f50492u;
        if (token != null) {
            eVar.H(token);
        }
        eVar.I(m(listN, c3Var));
        eVar.J(!z10);
        eVar.G(this.f50485n);
        nVar.z0(eVar);
        nVar.U(this.f50485n);
        nVar.E(this.F).i0(z10).J(this.I).K(this.G).t0(this.J).G0(this.K).k0(this.L).T(this.H);
        if (com.google.android.exoplayer2.util.u0.f51536a < 21 || !this.M || !c3Var.isPlaying() || c3Var.O() || c3Var.t1() || c3Var.g().f44371b != 1.0f) {
            nVar.r0(false).E0(false);
        } else {
            nVar.H0(System.currentTimeMillis() - c3Var.Q1()).r0(true).E0(true);
        }
        nVar.P(this.f50475d.b(c3Var));
        nVar.O(this.f50475d.c(c3Var));
        nVar.A0(this.f50475d.e(c3Var));
        if (bitmap == null) {
            e eVar2 = this.f50475d;
            int i12 = this.f50491t + 1;
            this.f50491t = i12;
            bitmap = eVar2.d(c3Var, new b(i12));
        }
        x(nVar, bitmap);
        nVar.N(this.f50475d.a(c3Var));
        String str2 = this.N;
        if (str2 != null) {
            nVar.Z(str2);
        }
        nVar.j0(true);
        return nVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    protected int[] m(List<String> list, c3 c3Var) {
        int iIndexOf;
        int iIndexOf2;
        int i10;
        int iIndexOf3 = list.indexOf(P);
        int iIndexOf4 = list.indexOf(O);
        if (this.f50495x) {
            iIndexOf = list.indexOf(Q);
        } else {
            iIndexOf = this.B ? list.indexOf(T) : -1;
        }
        if (this.f50496y) {
            iIndexOf2 = list.indexOf(R);
        } else {
            iIndexOf2 = this.C ? list.indexOf(S) : -1;
        }
        int[] iArr = new int[3];
        int i11 = 0;
        if (iIndexOf != -1) {
            iArr[0] = iIndexOf;
            i11 = 1;
        }
        boolean zO = O(c3Var);
        if (iIndexOf3 == -1 || !zO) {
            if (iIndexOf4 != -1 && !zO) {
                i10 = i11 + 1;
                iArr[i11] = iIndexOf4;
            }
            if (iIndexOf2 != -1) {
                iArr[i11] = iIndexOf2;
                i11++;
            }
            return Arrays.copyOf(iArr, i11);
        }
        i10 = i11 + 1;
        iArr[i11] = iIndexOf3;
        i11 = i10;
        if (iIndexOf2 != -1) {
            iArr[i11] = iIndexOf2;
            i11++;
        }
        return Arrays.copyOf(iArr, i11);
    }

    protected List<String> n(c3 c3Var) {
        boolean zG0 = c3Var.g0(7);
        boolean zG1 = c3Var.g0(11);
        boolean zG2 = c3Var.g0(12);
        boolean zG3 = c3Var.g0(9);
        ArrayList arrayList = new ArrayList();
        if (this.f50493v && zG0) {
            arrayList.add(Q);
        }
        if (this.f50497z && zG1) {
            arrayList.add(T);
        }
        if (this.D) {
            if (O(c3Var)) {
                arrayList.add(P);
            } else {
                arrayList.add(O);
            }
        }
        if (this.A && zG2) {
            arrayList.add(S);
        }
        if (this.f50494w && zG3) {
            arrayList.add(R);
        }
        d dVar = this.f50477f;
        if (dVar != null) {
            arrayList.addAll(dVar.a(c3Var));
        }
        if (this.E) {
            arrayList.add(U);
        }
        return arrayList;
    }

    protected boolean o(c3 c3Var) {
        int playbackState = c3Var.getPlaybackState();
        return (playbackState == 2 || playbackState == 3) && c3Var.p0();
    }

    public final void q() {
        if (this.f50490s) {
            r();
        }
    }

    public final void t(int i10) {
        if (this.F == i10) {
            return;
        }
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException();
        }
        this.F = i10;
        q();
    }

    public final void u(int i10) {
        if (this.I != i10) {
            this.I = i10;
            q();
        }
    }

    public final void v(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            q();
        }
    }

    public final void w(int i10) {
        if (this.H != i10) {
            this.H = i10;
            q();
        }
    }

    public final void y(MediaSessionCompat.Token token) {
        if (com.google.android.exoplayer2.util.u0.c(this.f50492u, token)) {
            return;
        }
        this.f50492u = token;
        q();
    }

    public final void z(@androidx.annotation.p0 c3 c3Var) {
        boolean z10 = true;
        com.google.android.exoplayer2.util.a.i(Looper.myLooper() == Looper.getMainLooper());
        if (c3Var != null && c3Var.x1() != Looper.getMainLooper()) {
            z10 = false;
        }
        com.google.android.exoplayer2.util.a.a(z10);
        c3 c3Var2 = this.f50489r;
        if (c3Var2 == c3Var) {
            return;
        }
        if (c3Var2 != null) {
            c3Var2.U(this.f50481j);
            if (c3Var == null) {
                Q(false);
            }
        }
        this.f50489r = c3Var;
        if (c3Var != null) {
            c3Var.S1(this.f50481j);
            r();
        }
    }
}
