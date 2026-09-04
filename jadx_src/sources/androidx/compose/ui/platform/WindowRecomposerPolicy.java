package androidx.compose.ui.platform;

import android.os.Handler;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import com.umeng.analytics.pro.ak;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@androidx.compose.ui.h
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0001J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J/\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/platform/WindowRecomposerPolicy;", "", "Landroidx/compose/ui/platform/q2;", "factory", ak.aF, "expected", "", ak.av, "Lkotlin/b2;", "d", "R", "Lkotlin/Function0;", "block", "e", "(Landroidx/compose/ui/platform/q2;Lyh/a;)Ljava/lang/Object;", "Landroid/view/View;", "rootView", "Landroidx/compose/runtime/Recomposer;", "b", "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class WindowRecomposerPolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final WindowRecomposerPolicy f15731a = new WindowRecomposerPolicy();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final AtomicReference<q2> factory = new AtomicReference<>(q2.INSTANCE.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f15733c = 8;

    /* JADX INFO: compiled from: WindowRecomposer.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"androidx/compose/ui/platform/WindowRecomposerPolicy$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Lkotlin/b2;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.d2 f15734b;

        a(kotlinx.coroutines.d2 d2Var) {
            this.f15734b = d2Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@dl.d View v10) {
            kotlin.jvm.internal.f0.p(v10, "v");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@dl.d View v10) {
            kotlin.jvm.internal.f0.p(v10, "v");
            v10.removeOnAttachStateChangeListener(this);
            kotlinx.coroutines.d2.a.b(this.f15734b, null, 1, null);
        }
    }

    private WindowRecomposerPolicy() {
    }

    @kotlin.r0
    public final boolean a(@dl.d q2 expected, @dl.d q2 factory2) {
        kotlin.jvm.internal.f0.p(expected, "expected");
        kotlin.jvm.internal.f0.p(factory2, "factory");
        return androidx.compose.animation.core.s0.a(factory, expected, factory2);
    }

    @dl.d
    public final Recomposer b(@dl.d View rootView) {
        kotlin.jvm.internal.f0.p(rootView, "rootView");
        Recomposer recomposerA = factory.get().a(rootView);
        WindowRecomposer_androidKt.j(rootView, recomposerA);
        kotlinx.coroutines.v1 v1Var = kotlinx.coroutines.v1.f130503b;
        Handler handler = rootView.getHandler();
        kotlin.jvm.internal.f0.o(handler, "rootView.handler");
        rootView.addOnAttachStateChangeListener(new a(kotlinx.coroutines.k.f(v1Var, kotlinx.coroutines.android.f.g(handler, "windowRecomposer cleanup").t0(), null, new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(recomposerA, rootView, null), 2, null)));
        return recomposerA;
    }

    @dl.d
    @kotlin.r0
    public final q2 c(@dl.d q2 factory2) {
        kotlin.jvm.internal.f0.p(factory2, "factory");
        q2 andSet = factory.getAndSet(factory2);
        kotlin.jvm.internal.f0.o(andSet, "factory.getAndSet(factory)");
        return andSet;
    }

    public final void d(@dl.d q2 factory2) {
        kotlin.jvm.internal.f0.p(factory2, "factory");
        factory.set(factory2);
    }

    public final <R> R e(@dl.d q2 factory2, @dl.d yh.a<? extends R> block) throws IllegalAccessException, InvocationTargetException {
        kotlin.jvm.internal.f0.p(factory2, "factory");
        kotlin.jvm.internal.f0.p(block, "block");
        q2 q2VarC = c(factory2);
        try {
            R rInvoke = block.invoke();
            kotlin.jvm.internal.c0.d(1);
            if (!a(factory2, q2VarC)) {
                throw new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state");
            }
            kotlin.jvm.internal.c0.c(1);
            return rInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jvm.internal.c0.d(1);
                if (a(factory2, q2VarC)) {
                    kotlin.jvm.internal.c0.c(1);
                    throw th3;
                }
                kotlin.o.a(th2, new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state"));
                throw th2;
            }
        }
    }
}
