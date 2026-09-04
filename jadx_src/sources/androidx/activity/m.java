package androidx.activity;

import androidx.annotation.RestrictTo;
import androidx.annotation.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: FullyDrawnReporter.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1#2:191\n1855#3,2:192\n*S KotlinDebug\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n*L\n154#1:192,2\n*E\n"})
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Executor f1487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.a<b2> f1488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Object f1489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @b0("lock")
    private int f1490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @b0("lock")
    private boolean f1491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @b0("lock")
    private boolean f1492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    @b0("lock")
    private final List<yh.a<b2>> f1493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final Runnable f1494h;

    public m(@dl.d Executor executor, @dl.d yh.a<b2> reportFullyDrawn) {
        f0.p(executor, "executor");
        f0.p(reportFullyDrawn, "reportFullyDrawn");
        this.f1487a = executor;
        this.f1488b = reportFullyDrawn;
        this.f1489c = new Object();
        this.f1493g = new ArrayList();
        this.f1494h = new Runnable() { // from class: androidx.activity.l
            @Override // java.lang.Runnable
            public final void run() {
                m.i(this.f1486b);
            }
        };
    }

    private final void f() {
        if (this.f1491e || this.f1490d != 0) {
            return;
        }
        this.f1491e = true;
        this.f1487a.execute(this.f1494h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(m this$0) {
        f0.p(this$0, "this$0");
        synchronized (this$0.f1489c) {
            this$0.f1491e = false;
            if (this$0.f1490d == 0 && !this$0.f1492f) {
                this$0.f1488b.invoke();
                this$0.d();
            }
            b2 b2Var = b2.f124493a;
        }
    }

    public final void b(@dl.d yh.a<b2> callback) {
        boolean z10;
        f0.p(callback, "callback");
        synchronized (this.f1489c) {
            if (this.f1492f) {
                z10 = true;
            } else {
                this.f1493g.add(callback);
                z10 = false;
            }
        }
        if (z10) {
            callback.invoke();
        }
    }

    public final void c() {
        synchronized (this.f1489c) {
            if (!this.f1492f) {
                this.f1490d++;
            }
            b2 b2Var = b2.f124493a;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void d() {
        synchronized (this.f1489c) {
            this.f1492f = true;
            Iterator<T> it = this.f1493g.iterator();
            while (it.hasNext()) {
                ((yh.a) it.next()).invoke();
            }
            this.f1493g.clear();
            b2 b2Var = b2.f124493a;
        }
    }

    public final boolean e() {
        boolean z10;
        synchronized (this.f1489c) {
            z10 = this.f1492f;
        }
        return z10;
    }

    public final void g(@dl.d yh.a<b2> callback) {
        f0.p(callback, "callback");
        synchronized (this.f1489c) {
            this.f1493g.remove(callback);
            b2 b2Var = b2.f124493a;
        }
    }

    public final void h() {
        int i10;
        synchronized (this.f1489c) {
            if (!this.f1492f && (i10 = this.f1490d) > 0) {
                this.f1490d = i10 - 1;
                f();
            }
            b2 b2Var = b2.f124493a;
        }
    }
}
