package androidx.window.sidecar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.b0;
import androidx.annotation.j1;
import androidx.window.core.Version;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SidecarWindowBackend.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0003\r\u000e\u001fB\u0013\b\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001e\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J&\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0016\u0010\u000e\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R$\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Landroidx/window/layout/o;", "Landroidx/window/layout/q;", "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "", "j", "Lkotlin/b2;", "f", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/d;", "Landroidx/window/layout/v;", "callback", ak.av, "b", "Landroidx/window/layout/j;", "Landroidx/window/layout/j;", "g", "()Landroidx/window/layout/j;", "k", "(Landroidx/window/layout/j;)V", "windowExtension", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/layout/o$c;", "Ljava/util/concurrent/CopyOnWriteArrayList;", RXScreenCaptureService.KEY_HEIGHT, "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getWindowLayoutChangeCallbacks$annotations", "()V", "windowLayoutChangeCallbacks", "<init>", ak.aF, "window_release"}, k = 1, mv = {1, 6, 0})
public final class o implements q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f28656d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private static volatile o f28657e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    private static final String f28659g = "WindowServer";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @j1
    @b0("globalLock")
    @e
    private j windowExtension;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d
    private final CopyOnWriteArrayList<c> windowLayoutChangeCallbacks = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    private static final ReentrantLock f28658f = new ReentrantLock();

    /* JADX INFO: renamed from: androidx.window.layout.o$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SidecarWindowBackend.kt */
    @Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\b\u0010\r\u001a\u00020\fH\u0007R\u0014\u0010\u000e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/window/layout/o$a;", "", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroidx/window/layout/o;", ak.av, "Landroidx/window/layout/j;", "b", "Landroidx/window/core/Version;", "sidecarVersion", "", ak.aF, "Lkotlin/b2;", "d", "DEBUG", "Z", "", "TAG", "Ljava/lang/String;", "globalInstance", "Landroidx/window/layout/o;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @d
        public final o a(@d Context context) {
            f0.p(context, "context");
            if (o.f28657e == null) {
                ReentrantLock reentrantLock = o.f28658f;
                reentrantLock.lock();
                try {
                    if (o.f28657e == null) {
                        o.f28657e = new o(o.INSTANCE.b(context));
                    }
                    b2 b2Var = b2.f124493a;
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            o oVar = o.f28657e;
            f0.m(oVar);
            return oVar;
        }

        @e
        public final j b(@d Context context) {
            f0.p(context, "context");
            try {
                if (!c(SidecarCompat.INSTANCE.c())) {
                    return null;
                }
                SidecarCompat sidecarCompat = new SidecarCompat(context);
                if (sidecarCompat.b()) {
                    return sidecarCompat;
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        @j1
        public final boolean c(@e Version sidecarVersion) {
            return sidecarVersion != null && sidecarVersion.compareTo(Version.INSTANCE.c()) >= 0;
        }

        @j1
        public final void d() {
            o.f28657e = null;
        }
    }

    /* JADX INFO: compiled from: SidecarWindowBackend.kt */
    @j1
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¨\u0006\n"}, d2 = {"Landroidx/window/layout/o$b;", "Landroidx/window/layout/j$a;", "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "Landroidx/window/layout/v;", "newLayout", "Lkotlin/b2;", ak.av, "<init>", "(Landroidx/window/layout/o;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    public final class b implements j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f28662a;

        public b(o this$0) {
            f0.p(this$0, "this$0");
            this.f28662a = this$0;
        }

        @Override // androidx.window.layout.j.a
        @SuppressLint({"SyntheticAccessor"})
        public void a(@d Activity activity, @d v newLayout) {
            f0.p(activity, "activity");
            f0.p(newLayout, "newLayout");
            for (c cVar : this.f28662a.h()) {
                if (f0.g(cVar.getActivity(), activity)) {
                    cVar.b(newLayout);
                }
            }
        }
    }

    /* JADX INFO: compiled from: SidecarWindowBackend.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/window/layout/o$c;", "", "Landroidx/window/layout/v;", "newLayoutInfo", "Lkotlin/b2;", "b", "Landroid/app/Activity;", ak.av, "Landroid/app/Activity;", "d", "()Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/d;", ak.aF, "Landroidx/core/util/d;", "e", "()Landroidx/core/util/d;", "callback", "Landroidx/window/layout/v;", "f", "()Landroidx/window/layout/v;", "g", "(Landroidx/window/layout/v;)V", "lastInfo", "<init>", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/d;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d
        private final Activity activity;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d
        private final Executor executor;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @d
        private final androidx.core.util.d<v> callback;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @e
        private v lastInfo;

        public c(@d Activity activity, @d Executor executor, @d androidx.core.util.d<v> callback) {
            f0.p(activity, "activity");
            f0.p(executor, "executor");
            f0.p(callback, "callback");
            this.activity = activity;
            this.executor = executor;
            this.callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(c this$0, v newLayoutInfo) {
            f0.p(this$0, "this$0");
            f0.p(newLayoutInfo, "$newLayoutInfo");
            this$0.callback.accept(newLayoutInfo);
        }

        public final void b(@d final v newLayoutInfo) {
            f0.p(newLayoutInfo, "newLayoutInfo");
            this.lastInfo = newLayoutInfo;
            this.executor.execute(new Runnable() { // from class: androidx.window.layout.p
                @Override // java.lang.Runnable
                public final void run() {
                    o.c.c(this.f28667b, newLayoutInfo);
                }
            });
        }

        @d
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Activity getActivity() {
            return this.activity;
        }

        @d
        public final androidx.core.util.d<v> e() {
            return this.callback;
        }

        @e
        /* JADX INFO: renamed from: f, reason: from getter */
        public final v getLastInfo() {
            return this.lastInfo;
        }

        public final void g(@e v vVar) {
            this.lastInfo = vVar;
        }
    }

    @j1
    public o(@e j jVar) {
        this.windowExtension = jVar;
        j jVar2 = this.windowExtension;
        if (jVar2 == null) {
            return;
        }
        jVar2.a(new b(this));
    }

    @b0("sLock")
    private final void f(Activity activity) {
        j jVar;
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        boolean z10 = false;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (f0.g(((c) it.next()).getActivity(), activity)) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10 || (jVar = this.windowExtension) == null) {
            return;
        }
        jVar.d(activity);
    }

    @j1
    public static /* synthetic */ void i() {
    }

    private final boolean j(Activity activity) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        if ((copyOnWriteArrayList instanceof Collection) && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (f0.g(((c) it.next()).getActivity(), activity)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.window.sidecar.q
    public void a(@d Activity activity, @d Executor executor, @d androidx.core.util.d<v> callback) {
        v lastInfo;
        Object next;
        f0.p(activity, "activity");
        f0.p(executor, "executor");
        f0.p(callback, "callback");
        ReentrantLock reentrantLock = f28658f;
        reentrantLock.lock();
        try {
            j windowExtension = getWindowExtension();
            if (windowExtension == null) {
                callback.accept(new v(CollectionsKt__CollectionsKt.E()));
                return;
            }
            boolean zJ = j(activity);
            c cVar = new c(activity, executor, callback);
            h().add(cVar);
            if (zJ) {
                Iterator<T> it = h().iterator();
                do {
                    lastInfo = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!f0.g(activity, ((c) next).getActivity()));
                c cVar2 = (c) next;
                if (cVar2 != null) {
                    lastInfo = cVar2.getLastInfo();
                }
                if (lastInfo != null) {
                    cVar.b(lastInfo);
                }
            } else {
                windowExtension.c(activity);
            }
            b2 b2Var = b2.f124493a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.sidecar.q
    public void b(@d androidx.core.util.d<v> callback) {
        f0.p(callback, "callback");
        synchronized (f28658f) {
            if (getWindowExtension() == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (c callbackWrapper : h()) {
                if (callbackWrapper.e() == callback) {
                    f0.o(callbackWrapper, "callbackWrapper");
                    arrayList.add(callbackWrapper);
                }
            }
            h().removeAll(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f(((c) it.next()).getActivity());
            }
            b2 b2Var = b2.f124493a;
        }
    }

    @e
    /* JADX INFO: renamed from: g, reason: from getter */
    public final j getWindowExtension() {
        return this.windowExtension;
    }

    @d
    public final CopyOnWriteArrayList<c> h() {
        return this.windowLayoutChangeCallbacks;
    }

    public final void k(@e j jVar) {
        this.windowExtension = jVar;
    }
}
