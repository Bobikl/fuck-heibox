package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AnimatedVisibility.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0017R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8gX§\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/c;", "", "Landroidx/compose/ui/n;", "Landroidx/compose/animation/f;", "enter", "Landroidx/compose/animation/h;", com.alipay.sdk.m.x.d.A, "", BasePuzzleInfo.PUZZLE_TYPE_LABEL, ak.av, "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "b", "()Landroidx/compose/animation/core/Transition;", "getTransition$annotations", "()V", "transition", "animation_release"}, k = 1, mv = {1, 7, 1})
public interface c {

    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @j
        @dl.d
        @Deprecated
        public static androidx.compose.ui.n a(@dl.d c cVar, @dl.d androidx.compose.ui.n receiver, @dl.d f enter, @dl.d h exit, @dl.d String label) {
            f0.p(receiver, "$receiver");
            f0.p(enter, "enter");
            f0.p(exit, "exit");
            f0.p(label, "label");
            return AnimatedVisibilityScope$CC.a(cVar, receiver, enter, exit, label);
        }

        @j
        public static /* synthetic */ void c() {
        }
    }

    @j
    @dl.d
    androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d f fVar, @dl.d h hVar, @dl.d String str);

    @j
    @dl.d
    Transition<EnterExitState> b();
}
