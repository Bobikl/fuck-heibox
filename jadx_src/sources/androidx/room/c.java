package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: compiled from: AutoCloser.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 E2\u00020\u0001:\u0001MB\u001f\u0012\u0006\u0010G\u001a\u00020\u001f\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010J\u001a\u00020\"¢\u0006\u0004\bK\u0010LJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J'\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fR\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u001c\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010,\u001a\u00020&8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00102\u001a\u00020\u001f8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b-\u0010 \u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00104R\u0014\u00106\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u00107\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010=\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b-\u0010?\"\u0004\b@\u0010AR\u0011\u0010D\u001a\u0002038F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020&8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010)¨\u0006N"}, d2 = {"Landroidx/room/c;", "", "Lj3/h;", "delegateOpenHelper", "Lkotlin/b2;", "o", androidx.exifinterface.media.a.X4, "Lkotlin/Function1;", "Lj3/g;", "block", "g", "(Lyh/l;)Ljava/lang/Object;", "n", "e", "d", "Ljava/lang/Runnable;", "onAutoClose", "q", "Landroid/os/Handler;", "b", "Landroid/os/Handler;", "handler", ak.aF, "Ljava/lang/Runnable;", "k", "()Ljava/lang/Runnable;", ak.aG, "(Ljava/lang/Runnable;)V", "onAutoCloseCallback", "Ljava/lang/Object;", "lock", "", "J", "autoCloseTimeoutInMs", "Ljava/util/concurrent/Executor;", "f", "Ljava/util/concurrent/Executor;", "executor", "", "I", "l", "()I", "v", "(I)V", "refCount", RXScreenCaptureService.KEY_HEIGHT, "j", "()J", "t", "(J)V", "lastDecrementRefCountTimeStamp", "", "Z", "manuallyClosed", "executeAutoCloser", "autoCloser", "Lj3/h;", "i", "()Lj3/h;", ak.aB, "(Lj3/h;)V", "delegateDatabase", "Lj3/g;", "()Lj3/g;", "r", "(Lj3/g;)V", "p", "()Z", "isActive", "m", "refCountForTest", "autoCloseTimeoutAmount", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "autoCloseExecutor", "<init>", "(JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/Executor;)V", ak.av, "room-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    public static final String f27070n = "https://issuetracker.google.com/issues/new?component=413107&template=1096568";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j3.h f27071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Handler handler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Runnable onAutoCloseCallback;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object lock;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long autoCloseTimeoutInMs;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Executor executor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @androidx.annotation.b0("lock")
    private int refCount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @androidx.annotation.b0("lock")
    private long lastDecrementRefCountTimeStamp;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.b0("lock")
    @dl.e
    private j3.g f27079i;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean manuallyClosed;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Runnable executeAutoCloser;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Runnable autoCloser;

    public c(long j10, @dl.d TimeUnit autoCloseTimeUnit, @dl.d Executor autoCloseExecutor) {
        kotlin.jvm.internal.f0.p(autoCloseTimeUnit, "autoCloseTimeUnit");
        kotlin.jvm.internal.f0.p(autoCloseExecutor, "autoCloseExecutor");
        this.handler = new Handler(Looper.getMainLooper());
        this.lock = new Object();
        this.autoCloseTimeoutInMs = autoCloseTimeUnit.toMillis(j10);
        this.executor = autoCloseExecutor;
        this.lastDecrementRefCountTimeStamp = SystemClock.uptimeMillis();
        this.executeAutoCloser = new Runnable() { // from class: androidx.room.a
            @Override // java.lang.Runnable
            public final void run() {
                c.f(this.f27024b);
            }
        };
        this.autoCloser = new Runnable() { // from class: androidx.room.b
            @Override // java.lang.Runnable
            public final void run() {
                c.c(this.f27051b);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(c this$0) {
        kotlin.b2 b2Var;
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        synchronized (this$0.lock) {
            if (SystemClock.uptimeMillis() - this$0.lastDecrementRefCountTimeStamp < this$0.autoCloseTimeoutInMs) {
                return;
            }
            if (this$0.refCount != 0) {
                return;
            }
            Runnable runnable = this$0.onAutoCloseCallback;
            if (runnable != null) {
                runnable.run();
                b2Var = kotlin.b2.f124493a;
            } else {
                b2Var = null;
            }
            if (b2Var == null) {
                throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568".toString());
            }
            j3.g gVar = this$0.f27079i;
            if (gVar != null && gVar.isOpen()) {
                gVar.close();
            }
            this$0.f27079i = null;
            kotlin.b2 b2Var2 = kotlin.b2.f124493a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(c this$0) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.executor.execute(this$0.autoCloser);
    }

    public final void d() throws IOException {
        synchronized (this.lock) {
            this.manuallyClosed = true;
            j3.g gVar = this.f27079i;
            if (gVar != null) {
                gVar.close();
            }
            this.f27079i = null;
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
    }

    public final void e() {
        synchronized (this.lock) {
            int i10 = this.refCount;
            if (!(i10 > 0)) {
                throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement".toString());
            }
            int i11 = i10 - 1;
            this.refCount = i11;
            if (i11 == 0) {
                if (this.f27079i == null) {
                    return;
                } else {
                    this.handler.postDelayed(this.executeAutoCloser, this.autoCloseTimeoutInMs);
                }
            }
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
    }

    public final <V> V g(@dl.d yh.l<? super j3.g, ? extends V> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        try {
            return block.invoke(n());
        } finally {
            e();
        }
    }

    @dl.e
    /* JADX INFO: renamed from: h, reason: from getter */
    public final j3.g getF27079i() {
        return this.f27079i;
    }

    @dl.d
    public final j3.h i() {
        j3.h hVar = this.f27071a;
        if (hVar != null) {
            return hVar;
        }
        kotlin.jvm.internal.f0.S("delegateOpenHelper");
        return null;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getLastDecrementRefCountTimeStamp() {
        return this.lastDecrementRefCountTimeStamp;
    }

    @dl.e
    /* JADX INFO: renamed from: k, reason: from getter */
    public final Runnable getOnAutoCloseCallback() {
        return this.onAutoCloseCallback;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getRefCount() {
        return this.refCount;
    }

    @androidx.annotation.j1
    public final int m() {
        int i10;
        synchronized (this.lock) {
            i10 = this.refCount;
        }
        return i10;
    }

    @dl.d
    public final j3.g n() {
        synchronized (this.lock) {
            this.handler.removeCallbacks(this.executeAutoCloser);
            this.refCount++;
            if (!(!this.manuallyClosed)) {
                throw new IllegalStateException("Attempting to open already closed database.".toString());
            }
            j3.g gVar = this.f27079i;
            if (gVar != null && gVar.isOpen()) {
                return gVar;
            }
            j3.g writableDatabase = i().getWritableDatabase();
            this.f27079i = writableDatabase;
            return writableDatabase;
        }
    }

    public final void o(@dl.d j3.h delegateOpenHelper) {
        kotlin.jvm.internal.f0.p(delegateOpenHelper, "delegateOpenHelper");
        s(delegateOpenHelper);
    }

    public final boolean p() {
        return !this.manuallyClosed;
    }

    public final void q(@dl.d Runnable onAutoClose) {
        kotlin.jvm.internal.f0.p(onAutoClose, "onAutoClose");
        this.onAutoCloseCallback = onAutoClose;
    }

    public final void r(@dl.e j3.g gVar) {
        this.f27079i = gVar;
    }

    public final void s(@dl.d j3.h hVar) {
        kotlin.jvm.internal.f0.p(hVar, "<set-?>");
        this.f27071a = hVar;
    }

    public final void t(long j10) {
        this.lastDecrementRefCountTimeStamp = j10;
    }

    public final void u(@dl.e Runnable runnable) {
        this.onAutoCloseCallback = runnable;
    }

    public final void v(int i10) {
        this.refCount = i10;
    }
}
