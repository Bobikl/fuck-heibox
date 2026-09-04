package androidx.compose.animation;

import androidx.compose.runtime.j2;
import androidx.compose.runtime.m0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\t\b\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\u0002J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\f\u001a\u00020\t8 X \u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0001\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/animation/h;", "", com.alipay.sdk.m.x.d.A, ak.aF, "other", "", "equals", "", "hashCode", "Landroidx/compose/animation/x;", "b", "()Landroidx/compose/animation/x;", "data", "<init>", "()V", ak.av, "Landroidx/compose/animation/i;", "animation_release"}, k = 1, mv = {1, 7, 1})
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final h f4592b = new i(new TransitionData(null, null, null, null, 15, null));

    /* JADX INFO: renamed from: androidx.compose.animation.h$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/animation/h$a;", "", "Landroidx/compose/animation/h;", d4.d.f108133a, "Landroidx/compose/animation/h;", ak.av, "()Landroidx/compose/animation/h;", "<init>", "()V", "animation_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final h a() {
            return h.f4592b;
        }
    }

    private h() {
    }

    public /* synthetic */ h(kotlin.jvm.internal.u uVar) {
        this();
    }

    @dl.d
    public abstract TransitionData b();

    @j2
    @dl.d
    public final h c(@dl.d h exit) {
        f0.p(exit, "exit");
        Fade fadeH = b().h();
        if (fadeH == null) {
            fadeH = exit.b().h();
        }
        Slide slideJ = b().j();
        if (slideJ == null) {
            slideJ = exit.b().j();
        }
        ChangeSize changeSizeG = b().g();
        if (changeSizeG == null) {
            changeSizeG = exit.b().g();
        }
        Scale scaleI = b().i();
        if (scaleI == null) {
            scaleI = exit.b().i();
        }
        return new i(new TransitionData(fadeH, slideJ, changeSizeG, scaleI));
    }

    public boolean equals(@dl.e Object other) {
        return (other instanceof h) && f0.g(((h) other).b(), b());
    }

    public int hashCode() {
        return b().hashCode();
    }
}
