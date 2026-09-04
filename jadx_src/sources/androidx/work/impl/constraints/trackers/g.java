package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.google.android.gms.common.internal.s;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ConstraintTracker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\"\u001a\u00020\u000e\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b#\u0010$J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0014\u0010\u0007\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H&R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R$\u0010 \u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001d¨\u0006%"}, d2 = {"Landroidx/work/impl/constraints/trackers/g;", androidx.exifinterface.media.a.f23244d5, "", "Lo3/a;", s.a.f52543a, "Lkotlin/b2;", ak.aF, "g", "i", "j", "Landroidx/work/impl/utils/taskexecutor/c;", ak.av, "Landroidx/work/impl/utils/taskexecutor/c;", "taskExecutor", "Landroid/content/Context;", "b", "Landroid/content/Context;", "d", "()Landroid/content/Context;", "appContext", "Ljava/lang/Object;", "lock", "Ljava/util/LinkedHashSet;", "Ljava/util/LinkedHashSet;", "listeners", "e", "currentState", "newState", "f", "()Ljava/lang/Object;", RXScreenCaptureService.KEY_HEIGHT, "(Ljava/lang/Object;)V", "state", "initialState", com.umeng.analytics.pro.d.R, "<init>", "(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/c;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.work.impl.utils.taskexecutor.c taskExecutor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Context appContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object lock;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LinkedHashSet<o3.a<T>> listeners;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private T currentState;

    protected g(@dl.d Context context, @dl.d androidx.work.impl.utils.taskexecutor.c taskExecutor) {
        f0.p(context, "context");
        f0.p(taskExecutor, "taskExecutor");
        this.taskExecutor = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        f0.o(applicationContext, "context.applicationContext");
        this.appContext = applicationContext;
        this.lock = new Object();
        this.listeners = new LinkedHashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(List listenersList, g this$0) {
        f0.p(listenersList, "$listenersList");
        f0.p(this$0, "this$0");
        Iterator<T> it = listenersList.iterator();
        while (it.hasNext()) {
            ((o3.a) it.next()).a(this$0.currentState);
        }
    }

    public final void c(@dl.d o3.a<T> listener) {
        f0.p(listener, "listener");
        synchronized (this.lock) {
            if (this.listeners.add(listener)) {
                if (this.listeners.size() == 1) {
                    this.currentState = e();
                    androidx.work.n.e().a(h.f28937a, getClass().getSimpleName() + ": initial state = " + this.currentState);
                    i();
                }
                listener.a(this.currentState);
            }
            b2 b2Var = b2.f124493a;
        }
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    protected final Context getAppContext() {
        return this.appContext;
    }

    public abstract T e();

    public final T f() {
        T t10 = this.currentState;
        return t10 == null ? e() : t10;
    }

    public final void g(@dl.d o3.a<T> listener) {
        f0.p(listener, "listener");
        synchronized (this.lock) {
            if (this.listeners.remove(listener) && this.listeners.isEmpty()) {
                j();
            }
            b2 b2Var = b2.f124493a;
        }
    }

    public final void h(T t10) {
        synchronized (this.lock) {
            T t11 = this.currentState;
            if (t11 == null || !f0.g(t11, t10)) {
                this.currentState = t10;
                final List listQ5 = CollectionsKt___CollectionsKt.Q5(this.listeners);
                this.taskExecutor.b().execute(new Runnable() { // from class: androidx.work.impl.constraints.trackers.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.b(listQ5, this);
                    }
                });
                b2 b2Var = b2.f124493a;
            }
        }
    }

    public abstract void i();

    public abstract void j();
}
