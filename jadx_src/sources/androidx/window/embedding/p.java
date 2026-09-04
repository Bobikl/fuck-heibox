package androidx.window.embedding;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.b0;
import androidx.annotation.j1;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ExtensionEmbeddingBackend.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.window.core.d
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0003\u0007\u0004\u0013B\u0013\b\u0007\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b-\u0010\u001dJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J,\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0016J\u001c\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR&\u0010&\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u0018\u0010)\u001a\u00060'R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010+¨\u0006."}, d2 = {"Landroidx/window/embedding/p;", "Landroidx/window/embedding/j;", "", "Landroidx/window/embedding/m;", "b", "rules", "Lkotlin/b2;", ak.av, x9.b.f141151p, "g", "f", "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/d;", "", "Landroidx/window/embedding/t;", "callback", ak.aF, "consumer", "d", "", "e", "Landroidx/window/embedding/l;", "Landroidx/window/embedding/l;", "k", "()Landroidx/window/embedding/l;", "n", "(Landroidx/window/embedding/l;)V", "embeddingExtension", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/embedding/p$c;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "l", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getSplitChangeCallbacks$annotations", "()V", "splitChangeCallbacks", "Landroidx/window/embedding/p$b;", "Landroidx/window/embedding/p$b;", "splitInfoEmbeddingCallback", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "splitRules", "<init>", "window_release"}, k = 1, mv = {1, 6, 0})
public final class p implements j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private static volatile p f28524f = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final String f28526h = "EmbeddingBackend";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @j1
    @b0("globalLock")
    @dl.e
    private l embeddingExtension;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final CopyOnWriteArrayList<c> splitChangeCallbacks;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final b splitInfoEmbeddingCallback;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final CopyOnWriteArraySet<m> splitRules;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final ReentrantLock f28525g = new ReentrantLock();

    /* JADX INFO: renamed from: androidx.window.embedding.p$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ExtensionEmbeddingBackend.kt */
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/window/embedding/p$a;", "", "Landroidx/window/embedding/l;", "b", "Landroidx/window/embedding/p;", ak.av, "", "extensionVersion", "", ak.aF, "(Ljava/lang/Integer;)Z", "", "TAG", "Ljava/lang/String;", "globalInstance", "Landroidx/window/embedding/p;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        private final l b() {
            k kVar = null;
            try {
                k.Companion companion = k.INSTANCE;
                if (c(companion.b()) && companion.c()) {
                    kVar = new k();
                }
            } catch (Throwable th2) {
                Log.d(p.f28526h, f0.C("Failed to load embedding extension: ", th2));
            }
            if (kVar == null) {
                Log.d(p.f28526h, "No supported embedding extension found");
            }
            return kVar;
        }

        @dl.d
        public final p a() {
            if (p.f28524f == null) {
                ReentrantLock reentrantLock = p.f28525g;
                reentrantLock.lock();
                try {
                    if (p.f28524f == null) {
                        p.f28524f = new p(p.INSTANCE.b());
                    }
                    b2 b2Var = b2.f124493a;
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            p pVar = p.f28524f;
            f0.m(pVar);
            return pVar;
        }

        @j1
        public final boolean c(@dl.e Integer extensionVersion) {
            return extensionVersion != null && extensionVersion.intValue() >= 1;
        }
    }

    /* JADX INFO: compiled from: ExtensionEmbeddingBackend.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R*\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/window/embedding/p$b;", "Landroidx/window/embedding/l$a;", "", "Landroidx/window/embedding/t;", "splitInfo", "Lkotlin/b2;", ak.av, "Ljava/util/List;", "b", "()Ljava/util/List;", ak.aF, "(Ljava/util/List;)V", "lastInfo", "<init>", "(Landroidx/window/embedding/p;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    public final class b implements l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private List<t> lastInfo;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f28532b;

        public b(p this$0) {
            f0.p(this$0, "this$0");
            this.f28532b = this$0;
        }

        @Override // androidx.window.embedding.l.a
        public void a(@dl.d List<t> splitInfo) {
            f0.p(splitInfo, "splitInfo");
            this.lastInfo = splitInfo;
            Iterator<c> it = this.f28532b.l().iterator();
            while (it.hasNext()) {
                it.next().b(splitInfo);
            }
        }

        @dl.e
        public final List<t> b() {
            return this.lastInfo;
        }

        public final void c(@dl.e List<t> list) {
            this.lastInfo = list;
        }
    }

    /* JADX INFO: compiled from: ExtensionEmbeddingBackend.kt */
    @Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR#\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/window/embedding/p$c;", "", "", "Landroidx/window/embedding/t;", "splitInfoList", "Lkotlin/b2;", "b", "Landroid/app/Activity;", ak.av, "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/d;", ak.aF, "Landroidx/core/util/d;", "d", "()Landroidx/core/util/d;", "callback", "Ljava/util/List;", "lastValue", "<init>", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/d;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Activity activity;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Executor executor;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final androidx.core.util.d<List<t>> callback;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private List<t> lastValue;

        public c(@dl.d Activity activity, @dl.d Executor executor, @dl.d androidx.core.util.d<List<t>> callback) {
            f0.p(activity, "activity");
            f0.p(executor, "executor");
            f0.p(callback, "callback");
            this.activity = activity;
            this.executor = executor;
            this.callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(c this$0, List splitsWithActivity) {
            f0.p(this$0, "this$0");
            f0.p(splitsWithActivity, "$splitsWithActivity");
            this$0.callback.accept(splitsWithActivity);
        }

        public final void b(@dl.d List<t> splitInfoList) {
            f0.p(splitInfoList, "splitInfoList");
            final ArrayList arrayList = new ArrayList();
            for (Object obj : splitInfoList) {
                if (((t) obj).a(this.activity)) {
                    arrayList.add(obj);
                }
            }
            if (f0.g(arrayList, this.lastValue)) {
                return;
            }
            this.lastValue = arrayList;
            this.executor.execute(new Runnable() { // from class: androidx.window.embedding.q
                @Override // java.lang.Runnable
                public final void run() {
                    p.c.c(this.f28537b, arrayList);
                }
            });
        }

        @dl.d
        public final androidx.core.util.d<List<t>> d() {
            return this.callback;
        }
    }

    @j1
    public p(@dl.e l lVar) {
        this.embeddingExtension = lVar;
        b bVar = new b(this);
        this.splitInfoEmbeddingCallback = bVar;
        this.splitChangeCallbacks = new CopyOnWriteArrayList<>();
        l lVar2 = this.embeddingExtension;
        if (lVar2 != null) {
            lVar2.b(bVar);
        }
        this.splitRules = new CopyOnWriteArraySet<>();
    }

    @j1
    public static /* synthetic */ void m() {
    }

    @Override // androidx.window.embedding.j
    public void a(@dl.d Set<? extends m> rules) {
        f0.p(rules, "rules");
        this.splitRules.clear();
        this.splitRules.addAll(rules);
        l lVar = this.embeddingExtension;
        if (lVar == null) {
            return;
        }
        lVar.a(this.splitRules);
    }

    @Override // androidx.window.embedding.j
    @dl.d
    public Set<m> b() {
        return this.splitRules;
    }

    @Override // androidx.window.embedding.j
    public void c(@dl.d Activity activity, @dl.d Executor executor, @dl.d androidx.core.util.d<List<t>> callback) {
        f0.p(activity, "activity");
        f0.p(executor, "executor");
        f0.p(callback, "callback");
        ReentrantLock reentrantLock = f28525g;
        reentrantLock.lock();
        try {
            if (getEmbeddingExtension() == null) {
                Log.v(f28526h, "Extension not loaded, skipping callback registration.");
                callback.accept(CollectionsKt__CollectionsKt.E());
                return;
            }
            c cVar = new c(activity, executor, callback);
            l().add(cVar);
            if (this.splitInfoEmbeddingCallback.b() != null) {
                List<t> listB = this.splitInfoEmbeddingCallback.b();
                f0.m(listB);
                cVar.b(listB);
            } else {
                cVar.b(CollectionsKt__CollectionsKt.E());
            }
            b2 b2Var = b2.f124493a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.embedding.j
    public void d(@dl.d androidx.core.util.d<List<t>> consumer) {
        f0.p(consumer, "consumer");
        ReentrantLock reentrantLock = f28525g;
        reentrantLock.lock();
        try {
            for (c cVar : l()) {
                if (f0.g(cVar.d(), consumer)) {
                    l().remove(cVar);
                    break;
                }
            }
            b2 b2Var = b2.f124493a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.embedding.j
    public boolean e() {
        return this.embeddingExtension != null;
    }

    @Override // androidx.window.embedding.j
    public void f(@dl.d m rule) {
        f0.p(rule, "rule");
        if (this.splitRules.contains(rule)) {
            this.splitRules.remove(rule);
            l lVar = this.embeddingExtension;
            if (lVar == null) {
                return;
            }
            lVar.a(this.splitRules);
        }
    }

    @Override // androidx.window.embedding.j
    public void g(@dl.d m rule) {
        f0.p(rule, "rule");
        if (this.splitRules.contains(rule)) {
            return;
        }
        this.splitRules.add(rule);
        l lVar = this.embeddingExtension;
        if (lVar == null) {
            return;
        }
        lVar.a(this.splitRules);
    }

    @dl.e
    /* JADX INFO: renamed from: k, reason: from getter */
    public final l getEmbeddingExtension() {
        return this.embeddingExtension;
    }

    @dl.d
    public final CopyOnWriteArrayList<c> l() {
        return this.splitChangeCallbacks;
    }

    public final void n(@dl.e l lVar) {
        this.embeddingExtension = lVar;
    }
}
