package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.d1;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SplitController.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.window.core.d
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003J\u0006\u0010\u000b\u001a\u00020\u0005J*\u0010\u0014\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010J\u001a\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010J\u0006\u0010\u0017\u001a\u00020\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Landroidx/window/embedding/s;", "", "", "Landroidx/window/embedding/m;", "staticRules", "Lkotlin/b2;", "m", RXScreenCaptureService.KEY_HEIGHT, x9.b.f141151p, "k", "n", "f", "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/d;", "", "Landroidx/window/embedding/t;", "consumer", "e", "l", "", "j", "Landroidx/window/embedding/j;", ak.av, "Landroidx/window/embedding/j;", "embeddingBackend", "b", "Ljava/util/Set;", "staticSplitRules", "<init>", "()V", ak.aF, "window_release"}, k = 1, mv = {1, 6, 0})
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private static volatile s f28543d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f28545f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final j embeddingBackend;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Set<? extends m> staticSplitRules;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final ReentrantLock f28544e = new ReentrantLock();

    /* JADX INFO: renamed from: androidx.window.embedding.s$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SplitController.kt */
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/window/embedding/s$a;", "", "Landroidx/window/embedding/s;", ak.av, "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "", "staticRuleResourceId", "Lkotlin/b2;", "b", "globalInstance", "Landroidx/window/embedding/s;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "sDebug", "Z", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final s a() {
            if (s.f28543d == null) {
                ReentrantLock reentrantLock = s.f28544e;
                reentrantLock.lock();
                try {
                    if (s.f28543d == null) {
                        Companion companion = s.INSTANCE;
                        s.f28543d = new s(null);
                    }
                    b2 b2Var = b2.f124493a;
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            s sVar = s.f28543d;
            f0.m(sVar);
            return sVar;
        }

        @xh.m
        public final void b(@dl.d Context context, int i10) {
            f0.p(context, "context");
            Set<m> setG = new y().g(context, i10);
            s sVarA = a();
            if (setG == null) {
                setG = d1.k();
            }
            sVarA.m(setG);
        }
    }

    private s() {
        this.embeddingBackend = p.INSTANCE.a();
        this.staticSplitRules = d1.k();
    }

    public /* synthetic */ s(kotlin.jvm.internal.u uVar) {
        this();
    }

    @dl.d
    @xh.m
    public static final s g() {
        return INSTANCE.a();
    }

    @xh.m
    public static final void i(@dl.d Context context, int i10) {
        INSTANCE.b(context, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(Set<? extends m> set) {
        this.staticSplitRules = set;
        this.embeddingBackend.a(set);
    }

    public final void e(@dl.d Activity activity, @dl.d Executor executor, @dl.d androidx.core.util.d<List<t>> consumer) {
        f0.p(activity, "activity");
        f0.p(executor, "executor");
        f0.p(consumer, "consumer");
        this.embeddingBackend.c(activity, executor, consumer);
    }

    public final void f() {
        this.embeddingBackend.a(this.staticSplitRules);
    }

    @dl.d
    public final Set<m> h() {
        return CollectionsKt___CollectionsKt.V5(this.embeddingBackend.b());
    }

    public final boolean j() {
        return this.embeddingBackend.e();
    }

    public final void k(@dl.d m rule) {
        f0.p(rule, "rule");
        this.embeddingBackend.g(rule);
    }

    public final void l(@dl.d androidx.core.util.d<List<t>> consumer) {
        f0.p(consumer, "consumer");
        this.embeddingBackend.d(consumer);
    }

    public final void n(@dl.d m rule) {
        f0.p(rule, "rule");
        this.embeddingBackend.f(rule);
    }
}
