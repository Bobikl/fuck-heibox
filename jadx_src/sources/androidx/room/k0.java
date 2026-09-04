package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: compiled from: MultiInstanceInvalidationClient.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010D\u001a\u00020\u0016\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010F\u001a\u00020E\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\bG\u0010HJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001a\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010 \u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010.\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0017\u00102\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b#\u00100\u001a\u0004\b\u0011\u00101R\u0017\u00108\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010=\u001a\u0002098\u0006¢\u0006\f\n\u0004\b*\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010B\u001a\u00020>8\u0006¢\u0006\f\n\u0004\b;\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010C\u001a\u00020>8\u0006¢\u0006\f\n\u0004\b@\u0010?\u001a\u0004\b4\u0010A¨\u0006I"}, d2 = {"Landroidx/room/k0;", "", "Lkotlin/b2;", ak.aB, "", ak.av, "Ljava/lang/String;", "g", "()Ljava/lang/String;", "name", "Landroidx/room/f0;", "b", "Landroidx/room/f0;", "f", "()Landroidx/room/f0;", "invalidationTracker", "Ljava/util/concurrent/Executor;", ak.aF, "Ljava/util/concurrent/Executor;", "e", "()Ljava/util/concurrent/Executor;", "executor", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "d", "Landroid/content/Context;", "appContext", "", "I", "()I", "o", "(I)V", "clientId", "Landroidx/room/f0$c;", "Landroidx/room/f0$c;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/room/f0$c;", "p", "(Landroidx/room/f0$c;)V", "observer", "Landroidx/room/a0;", "Landroidx/room/a0;", "j", "()Landroidx/room/a0;", "q", "(Landroidx/room/a0;)V", "service", "Landroidx/room/z;", "Landroidx/room/z;", "()Landroidx/room/z;", "callback", "Ljava/util/concurrent/atomic/AtomicBoolean;", "i", "Ljava/util/concurrent/atomic/AtomicBoolean;", "m", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "stopped", "Landroid/content/ServiceConnection;", "Landroid/content/ServiceConnection;", "k", "()Landroid/content/ServiceConnection;", "serviceConnection", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "l", "()Ljava/lang/Runnable;", "setUpRunnable", "removeObserverRunnable", com.umeng.analytics.pro.d.R, "Landroid/content/Intent;", "serviceIntent", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroidx/room/f0;Ljava/util/concurrent/Executor;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f0 invalidationTracker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Executor executor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int clientId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public f0.c observer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private a0 service;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final z callback;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AtomicBoolean stopped;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ServiceConnection serviceConnection;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Runnable setUpRunnable;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Runnable removeObserverRunnable;

    /* JADX INFO: compiled from: MultiInstanceInvalidationClient.kt */
    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"androidx/room/k0$a", "Landroidx/room/f0$c;", "", "", "tables", "Lkotlin/b2;", ak.aF, "", "b", "()Z", "isRemote", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends f0.c {
        a(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.f0.c
        public boolean b() {
            return true;
        }

        @Override // androidx.room.f0.c
        public void c(@dl.d Set<String> tables) {
            kotlin.jvm.internal.f0.p(tables, "tables");
            if (k0.this.getStopped().get()) {
                return;
            }
            try {
                a0 service = k0.this.getService();
                if (service != null) {
                    int clientId = k0.this.getClientId();
                    Object[] array = tables.toArray(new String[0]);
                    kotlin.jvm.internal.f0.n(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    service.R0(clientId, (String[]) array);
                }
            } catch (RemoteException e10) {
                Log.w(t1.f27263b, "Cannot broadcast invalidation", e10);
            }
        }
    }

    /* JADX INFO: compiled from: MultiInstanceInvalidationClient.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/room/k0$b", "Landroidx/room/z$b;", "", "", "tables", "Lkotlin/b2;", RXScreenCaptureService.KEY_HEIGHT, "([Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends z.b {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r0(k0 this$0, String[] tables) {
            kotlin.jvm.internal.f0.p(this$0, "this$0");
            kotlin.jvm.internal.f0.p(tables, "$tables");
            this$0.getInvalidationTracker().o((String[]) Arrays.copyOf(tables, tables.length));
        }

        @Override // androidx.room.z
        public void h(@dl.d final String[] tables) {
            kotlin.jvm.internal.f0.p(tables, "tables");
            Executor executor = k0.this.getExecutor();
            final k0 k0Var = k0.this;
            executor.execute(new Runnable() { // from class: androidx.room.l0
                @Override // java.lang.Runnable
                public final void run() {
                    k0.b.r0(k0Var, tables);
                }
            });
        }
    }

    /* JADX INFO: compiled from: MultiInstanceInvalidationClient.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"androidx/room/k0$c", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "service", "Lkotlin/b2;", "onServiceConnected", "onServiceDisconnected", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class c implements ServiceConnection {
        c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@dl.d ComponentName name, @dl.d IBinder service) {
            kotlin.jvm.internal.f0.p(name, "name");
            kotlin.jvm.internal.f0.p(service, "service");
            k0.this.q(a0.b.g(service));
            k0.this.getExecutor().execute(k0.this.getSetUpRunnable());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@dl.d ComponentName name) {
            kotlin.jvm.internal.f0.p(name, "name");
            k0.this.getExecutor().execute(k0.this.getRemoveObserverRunnable());
            k0.this.q(null);
        }
    }

    public k0(@dl.d Context context, @dl.d String name, @dl.d Intent serviceIntent, @dl.d f0 invalidationTracker, @dl.d Executor executor) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(name, "name");
        kotlin.jvm.internal.f0.p(serviceIntent, "serviceIntent");
        kotlin.jvm.internal.f0.p(invalidationTracker, "invalidationTracker");
        kotlin.jvm.internal.f0.p(executor, "executor");
        this.name = name;
        this.invalidationTracker = invalidationTracker;
        this.executor = executor;
        Context applicationContext = context.getApplicationContext();
        this.appContext = applicationContext;
        this.callback = new b();
        this.stopped = new AtomicBoolean(false);
        c cVar = new c();
        this.serviceConnection = cVar;
        this.setUpRunnable = new Runnable() { // from class: androidx.room.i0
            @Override // java.lang.Runnable
            public final void run() {
                k0.r(this.f27189b);
            }
        };
        this.removeObserverRunnable = new Runnable() { // from class: androidx.room.j0
            @Override // java.lang.Runnable
            public final void run() {
                k0.n(this.f27215b);
            }
        };
        Object[] array = invalidationTracker.l().keySet().toArray(new String[0]);
        kotlin.jvm.internal.f0.n(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        p(new a((String[]) array));
        applicationContext.bindService(serviceIntent, cVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(k0 this$0) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.invalidationTracker.s(this$0.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(k0 this$0) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        try {
            a0 a0Var = this$0.service;
            if (a0Var != null) {
                this$0.clientId = a0Var.V0(this$0.callback, this$0.name);
                this$0.invalidationTracker.b(this$0.h());
            }
        } catch (RemoteException e10) {
            Log.w(t1.f27263b, "Cannot register multi-instance invalidation callback", e10);
        }
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final z getCallback() {
        return this.callback;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getClientId() {
        return this.clientId;
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Executor getExecutor() {
        return this.executor;
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final f0 getInvalidationTracker() {
        return this.invalidationTracker;
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @dl.d
    public final f0.c h() {
        f0.c cVar = this.observer;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.f0.S("observer");
        return null;
    }

    @dl.d
    /* JADX INFO: renamed from: i, reason: from getter */
    public final Runnable getRemoveObserverRunnable() {
        return this.removeObserverRunnable;
    }

    @dl.e
    /* JADX INFO: renamed from: j, reason: from getter */
    public final a0 getService() {
        return this.service;
    }

    @dl.d
    /* JADX INFO: renamed from: k, reason: from getter */
    public final ServiceConnection getServiceConnection() {
        return this.serviceConnection;
    }

    @dl.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public final Runnable getSetUpRunnable() {
        return this.setUpRunnable;
    }

    @dl.d
    /* JADX INFO: renamed from: m, reason: from getter */
    public final AtomicBoolean getStopped() {
        return this.stopped;
    }

    public final void o(int i10) {
        this.clientId = i10;
    }

    public final void p(@dl.d f0.c cVar) {
        kotlin.jvm.internal.f0.p(cVar, "<set-?>");
        this.observer = cVar;
    }

    public final void q(@dl.e a0 a0Var) {
        this.service = a0Var;
    }

    public final void s() {
        if (this.stopped.compareAndSet(false, true)) {
            this.invalidationTracker.s(h());
            try {
                a0 a0Var = this.service;
                if (a0Var != null) {
                    a0Var.o1(this.callback, this.clientId);
                }
            } catch (RemoteException e10) {
                Log.w(t1.f27263b, "Cannot unregister multi-instance invalidation callback", e10);
            }
            this.appContext.unbindService(this.serviceConnection);
        }
    }
}
