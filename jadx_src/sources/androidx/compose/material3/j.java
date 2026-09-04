package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m2;
import androidx.compose.ui.state.ToggleableState;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: Checkbox.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001Bd\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0005\u0012\u0006\u0010\"\u001a\u00020\u0005\u0012\u0006\u0010$\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b%\u0010&J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u001d\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u001d\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u001d\u0010\u0014\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u001d\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001d\u0010\u0018\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u001d\u0010\u001a\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u001d\u0010\u001c\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u001d\u0010\u001e\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u001d\u0010 \u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011R\u001d\u0010\"\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b!\u0010\u0011R\u001d\u0010$\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b#\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/material3/j;", "", "Landroidx/compose/ui/state/ToggleableState;", "state", "Landroidx/compose/runtime/m2;", "Landroidx/compose/ui/graphics/l0;", ak.aF, "(Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "", "enabled", "b", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", ak.av, "other", "equals", "", "hashCode", "J", "checkedCheckmarkColor", "uncheckedCheckmarkColor", "checkedBoxColor", "d", "uncheckedBoxColor", "e", "disabledCheckedBoxColor", "f", "disabledUncheckedBoxColor", "g", "disabledIndeterminateBoxColor", RXScreenCaptureService.KEY_HEIGHT, "checkedBorderColor", "i", "uncheckedBorderColor", "j", "disabledBorderColor", "k", "disabledIndeterminateBorderColor", "<init>", "(JJJJJJJJJJJLkotlin/jvm/internal/u;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long checkedCheckmarkColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long uncheckedCheckmarkColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long checkedBoxColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long uncheckedBoxColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long disabledCheckedBoxColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long disabledUncheckedBoxColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long disabledIndeterminateBoxColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long checkedBorderColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long uncheckedBorderColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long disabledBorderColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long disabledIndeterminateBorderColor;

    /* JADX INFO: compiled from: Checkbox.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11986a;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            iArr[ToggleableState.On.ordinal()] = 1;
            iArr[ToggleableState.Indeterminate.ordinal()] = 2;
            iArr[ToggleableState.Off.ordinal()] = 3;
            f11986a = iArr;
        }
    }

    private j(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20) {
        this.checkedCheckmarkColor = j10;
        this.uncheckedCheckmarkColor = j11;
        this.checkedBoxColor = j12;
        this.uncheckedBoxColor = j13;
        this.disabledCheckedBoxColor = j14;
        this.disabledUncheckedBoxColor = j15;
        this.disabledIndeterminateBoxColor = j16;
        this.checkedBorderColor = j17;
        this.uncheckedBorderColor = j18;
        this.disabledBorderColor = j19;
        this.disabledIndeterminateBorderColor = j20;
    }

    public /* synthetic */ j(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20);
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> a(boolean z10, @dl.d ToggleableState state, @dl.e androidx.compose.runtime.p pVar, int i10) {
        long j10;
        m2<androidx.compose.ui.graphics.l0> m2VarT;
        kotlin.jvm.internal.f0.p(state, "state");
        pVar.T(1009643462);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1009643462, i10, -1, "androidx.compose.material3.CheckboxColors.borderColor (Checkbox.kt:446)");
        }
        if (z10) {
            int i11 = a.f11986a[state.ordinal()];
            if (i11 == 1 || i11 == 2) {
                j10 = this.checkedBorderColor;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j10 = this.uncheckedBorderColor;
            }
        } else {
            int i12 = a.f11986a[state.ordinal()];
            if (i12 == 1) {
                j10 = this.disabledBorderColor;
            } else if (i12 != 2) {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j10 = this.disabledBorderColor;
            } else {
                j10 = this.disabledIndeterminateBorderColor;
            }
        }
        long j11 = j10;
        if (z10) {
            pVar.T(1209369334);
            m2VarT = androidx.compose.animation.q.b(j11, androidx.compose.animation.core.i.q(state == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, pVar, 0, 4);
            pVar.c0();
        } else {
            pVar.T(1209369520);
            m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(j11), pVar, 0);
            pVar.c0();
        }
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> b(boolean z10, @dl.d ToggleableState state, @dl.e androidx.compose.runtime.p pVar, int i10) {
        long j10;
        m2<androidx.compose.ui.graphics.l0> m2VarT;
        kotlin.jvm.internal.f0.p(state, "state");
        pVar.T(360729865);
        if (ComposerKt.g0()) {
            ComposerKt.w0(360729865, i10, -1, "androidx.compose.material3.CheckboxColors.boxColor (Checkbox.kt:415)");
        }
        if (z10) {
            int i11 = a.f11986a[state.ordinal()];
            if (i11 == 1 || i11 == 2) {
                j10 = this.checkedBoxColor;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j10 = this.uncheckedBoxColor;
            }
        } else {
            int i12 = a.f11986a[state.ordinal()];
            if (i12 == 1) {
                j10 = this.disabledCheckedBoxColor;
            } else if (i12 == 2) {
                j10 = this.disabledIndeterminateBoxColor;
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j10 = this.disabledUncheckedBoxColor;
            }
        }
        long j11 = j10;
        if (z10) {
            pVar.T(1143718194);
            m2VarT = androidx.compose.animation.q.b(j11, androidx.compose.animation.core.i.q(state == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, pVar, 0, 4);
            pVar.c0();
        } else {
            pVar.T(1143718380);
            m2VarT = androidx.compose.runtime.e2.t(androidx.compose.ui.graphics.l0.n(j11), pVar, 0);
            pVar.c0();
        }
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<androidx.compose.ui.graphics.l0> c(@dl.d ToggleableState state, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(state, "state");
        pVar.T(-507585681);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-507585681, i10, -1, "androidx.compose.material3.CheckboxColors.checkmarkColor (Checkbox.kt:396)");
        }
        ToggleableState toggleableState = ToggleableState.Off;
        m2<androidx.compose.ui.graphics.l0> m2VarB = androidx.compose.animation.q.b(state == toggleableState ? this.uncheckedCheckmarkColor : this.checkedCheckmarkColor, androidx.compose.animation.core.i.q(state == toggleableState ? 100 : 50, 0, null, 6, null), null, pVar, 0, 4);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarB;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof j)) {
            return false;
        }
        j jVar = (j) other;
        return androidx.compose.ui.graphics.l0.y(this.checkedCheckmarkColor, jVar.checkedCheckmarkColor) && androidx.compose.ui.graphics.l0.y(this.uncheckedCheckmarkColor, jVar.uncheckedCheckmarkColor) && androidx.compose.ui.graphics.l0.y(this.checkedBoxColor, jVar.checkedBoxColor) && androidx.compose.ui.graphics.l0.y(this.uncheckedBoxColor, jVar.uncheckedBoxColor) && androidx.compose.ui.graphics.l0.y(this.disabledCheckedBoxColor, jVar.disabledCheckedBoxColor) && androidx.compose.ui.graphics.l0.y(this.disabledUncheckedBoxColor, jVar.disabledUncheckedBoxColor) && androidx.compose.ui.graphics.l0.y(this.disabledIndeterminateBoxColor, jVar.disabledIndeterminateBoxColor) && androidx.compose.ui.graphics.l0.y(this.checkedBorderColor, jVar.checkedBorderColor) && androidx.compose.ui.graphics.l0.y(this.uncheckedBorderColor, jVar.uncheckedBorderColor) && androidx.compose.ui.graphics.l0.y(this.disabledBorderColor, jVar.disabledBorderColor) && androidx.compose.ui.graphics.l0.y(this.disabledIndeterminateBorderColor, jVar.disabledIndeterminateBorderColor);
    }

    public int hashCode() {
        return (((((((((((((((((((androidx.compose.ui.graphics.l0.K(this.checkedCheckmarkColor) * 31) + androidx.compose.ui.graphics.l0.K(this.uncheckedCheckmarkColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.checkedBoxColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.uncheckedBoxColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledCheckedBoxColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledUncheckedBoxColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledIndeterminateBoxColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.checkedBorderColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.uncheckedBorderColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledBorderColor)) * 31) + androidx.compose.ui.graphics.l0.K(this.disabledIndeterminateBorderColor);
    }
}
