package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.j2;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B4\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\tJ(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u001d\u0010\u0012\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0014\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001d\u0010\u0016\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001d\u0010\u0017\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u001d\u0010\u0018\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/material3/ButtonElevation;", "", "", "enabled", "Landroidx/compose/foundation/interaction/e;", "interactionSource", "Landroidx/compose/runtime/m2;", "Ls1/h;", "d", "(ZLandroidx/compose/foundation/interaction/e;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "f", "e", "other", "equals", "", "hashCode", ak.av, "F", "defaultElevation", "b", "pressedElevation", ak.aF, "focusedElevation", "hoveredElevation", "disabledElevation", "<init>", "(FFFFFLkotlin/jvm/internal/u;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class ButtonElevation {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float defaultElevation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float pressedElevation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float focusedElevation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float hoveredElevation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float disabledElevation;

    private ButtonElevation(float f10, float f11, float f12, float f13, float f14) {
        this.defaultElevation = f10;
        this.pressedElevation = f11;
        this.focusedElevation = f12;
        this.hoveredElevation = f13;
        this.disabledElevation = f14;
    }

    public /* synthetic */ ButtonElevation(float f10, float f11, float f12, float f13, float f14, kotlin.jvm.internal.u uVar) {
        this(f10, f11, f12, f13, f14);
    }

    @androidx.compose.runtime.h
    private final m2<s1.h> d(boolean z10, androidx.compose.foundation.interaction.e eVar, androidx.compose.runtime.p pVar, int i10) {
        float f10;
        pVar.T(-1312510462);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1312510462, i10, -1, "androidx.compose.material3.ButtonElevation.animateElevation (Button.kt:803)");
        }
        pVar.T(-492369756);
        Object objU = pVar.U();
        androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
        if (objU == companion.a()) {
            objU = androidx.compose.runtime.e2.f();
            pVar.N(objU);
        }
        pVar.c0();
        SnapshotStateList snapshotStateList = (SnapshotStateList) objU;
        int i11 = (i10 >> 3) & 14;
        pVar.T(511388516);
        boolean zS = pVar.s(eVar) | pVar.s(snapshotStateList);
        Object objU2 = pVar.U();
        if (zS || objU2 == companion.a()) {
            objU2 = new ButtonElevation$animateElevation$1$1(eVar, snapshotStateList, null);
            pVar.N(objU2);
        }
        pVar.c0();
        EffectsKt.h(eVar, (yh.p) objU2, pVar, i11 | 64);
        androidx.compose.foundation.interaction.d dVar = (androidx.compose.foundation.interaction.d) CollectionsKt___CollectionsKt.q3(snapshotStateList);
        if (!z10) {
            f10 = this.disabledElevation;
        } else if (dVar instanceof androidx.compose.foundation.interaction.i.b) {
            f10 = this.pressedElevation;
        } else if (dVar instanceof androidx.compose.foundation.interaction.c.a) {
            f10 = this.hoveredElevation;
        } else {
            f10 = dVar instanceof androidx.compose.foundation.interaction.b.a ? this.focusedElevation : this.defaultElevation;
        }
        float f11 = f10;
        pVar.T(-492369756);
        Object objU3 = pVar.U();
        if (objU3 == companion.a()) {
            objU3 = new Animatable(s1.h.d(f11), VectorConvertersKt.g(s1.h.f139219c), null, 4, null);
            pVar.N(objU3);
        }
        pVar.c0();
        Animatable animatable = (Animatable) objU3;
        if (z10) {
            pVar.T(-719929769);
            EffectsKt.h(s1.h.d(f11), new ButtonElevation$animateElevation$3(animatable, this, f11, dVar, null), pVar, 64);
            pVar.c0();
        } else {
            pVar.T(-719929912);
            EffectsKt.h(s1.h.d(f11), new ButtonElevation$animateElevation$2(animatable, f11, null), pVar, 64);
            pVar.c0();
        }
        m2<s1.h> m2VarJ = animatable.j();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarJ;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<s1.h> e(boolean z10, @dl.d androidx.compose.foundation.interaction.e interactionSource, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(interactionSource, "interactionSource");
        pVar.T(-2045116089);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-2045116089, i10, -1, "androidx.compose.material3.ButtonElevation.shadowElevation (Button.kt:795)");
        }
        m2<s1.h> m2VarD = d(z10, interactionSource, pVar, (i10 & bb.c.b.f30796me) | (i10 & 14) | (i10 & 112));
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarD;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof ButtonElevation)) {
            return false;
        }
        ButtonElevation buttonElevation = (ButtonElevation) other;
        return s1.h.l(this.defaultElevation, buttonElevation.defaultElevation) && s1.h.l(this.pressedElevation, buttonElevation.pressedElevation) && s1.h.l(this.focusedElevation, buttonElevation.focusedElevation) && s1.h.l(this.hoveredElevation, buttonElevation.hoveredElevation) && s1.h.l(this.disabledElevation, buttonElevation.disabledElevation);
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<s1.h> f(boolean z10, @dl.d androidx.compose.foundation.interaction.e interactionSource, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(interactionSource, "interactionSource");
        pVar.T(-423890235);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-423890235, i10, -1, "androidx.compose.material3.ButtonElevation.tonalElevation (Button.kt:779)");
        }
        m2<s1.h> m2VarD = d(z10, interactionSource, pVar, (i10 & bb.c.b.f30796me) | (i10 & 14) | (i10 & 112));
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarD;
    }

    public int hashCode() {
        return (((((((s1.h.n(this.defaultElevation) * 31) + s1.h.n(this.pressedElevation)) * 31) + s1.h.n(this.focusedElevation)) * 31) + s1.h.n(this.hoveredElevation)) * 31) + s1.h.n(this.disabledElevation);
    }
}
