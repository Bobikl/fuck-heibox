package androidx.compose.runtime;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: CompositionContext.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b>\u0010#J*\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H ¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H ¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH ¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0010¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H ¢\u0006\u0004\b\u001a\u0010\u000bJ\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H ¢\u0006\u0004\b\u001b\u0010\u000bJ/\u0010 \u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001d\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001e0\u001cj\u0002`\u001fH\u0010¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0005H\u0010¢\u0006\u0004\b$\u0010#J\u0017\u0010'\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%H ¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%H ¢\u0006\u0004\b)\u0010(J\u001f\u0010,\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2\u0006\u0010+\u001a\u00020*H ¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u0004\u0018\u00010*2\u0006\u0010&\u001a\u00020%H\u0010¢\u0006\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008 X \u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048 X \u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088 X \u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010=\u001a\u0002088 X \u0004¢\u0006\u0006\u001a\u0004\b<\u0010:¨\u0006?"}, d2 = {"Landroidx/compose/runtime/r;", "", "Landroidx/compose/runtime/z;", "composition", "Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "content", ak.av, "(Landroidx/compose/runtime/z;Lyh/p;)V", "j", "(Landroidx/compose/runtime/z;)V", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "k", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "", "Landroidx/compose/runtime/tooling/b;", "table", "n", "(Ljava/util/Set;)V", "Landroidx/compose/runtime/p;", "composer", "o", "(Landroidx/compose/runtime/p;)V", "r", "p", ak.aB, "Lu0/i;", "Landroidx/compose/runtime/v;", "Landroidx/compose/runtime/m2;", "Landroidx/compose/runtime/CompositionLocalMap;", "e", "()Lu0/i;", "q", "()V", ak.aF, "Landroidx/compose/runtime/z0;", "reference", "i", "(Landroidx/compose/runtime/z0;)V", "b", "Landroidx/compose/runtime/y0;", "data", "l", "(Landroidx/compose/runtime/z0;Landroidx/compose/runtime/y0;)V", "m", "(Landroidx/compose/runtime/z0;)Landroidx/compose/runtime/y0;", "", "f", "()I", "compoundHashKey", "", "d", "()Z", "collectingParameterInformation", "Lkotlin/coroutines/CoroutineContext;", "g", "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", RXScreenCaptureService.KEY_HEIGHT, "recomposeCoroutineContext", "<init>", "runtime_release"}, k = 1, mv = {1, 7, 1})
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f13054a = 0;

    public abstract void a(@dl.d z composition, @dl.d yh.p<? super p, ? super Integer, kotlin.b2> content);

    public abstract void b(@dl.d z0 reference);

    public void c() {
    }

    public abstract boolean d();

    @dl.d
    public u0.i<v<Object>, m2<Object>> e() {
        return s.f13086a;
    }

    public abstract int f();

    @dl.d
    /* JADX INFO: renamed from: g */
    public abstract CoroutineContext getEffectCoroutineContext();

    @dl.d
    public abstract CoroutineContext h();

    public abstract void i(@dl.d z0 reference);

    public abstract void j(@dl.d z composition);

    public abstract void k(@dl.d RecomposeScopeImpl scope);

    public abstract void l(@dl.d z0 reference, @dl.d y0 data);

    @dl.e
    public y0 m(@dl.d z0 reference) {
        kotlin.jvm.internal.f0.p(reference, "reference");
        return null;
    }

    public void n(@dl.d Set<androidx.compose.runtime.tooling.b> table) {
        kotlin.jvm.internal.f0.p(table, "table");
    }

    public void o(@dl.d p composer) {
        kotlin.jvm.internal.f0.p(composer, "composer");
    }

    public abstract void p(@dl.d z composition);

    public void q() {
    }

    public void r(@dl.d p composer) {
        kotlin.jvm.internal.f0.p(composer, "composer");
    }

    public abstract void s(@dl.d z composition);
}
