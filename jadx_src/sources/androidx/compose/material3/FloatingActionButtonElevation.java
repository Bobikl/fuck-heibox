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

/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u0001B,\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u001d\u0010\u0011\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/FloatingActionButtonElevation;", "", "Landroidx/compose/foundation/interaction/e;", "interactionSource", "Landroidx/compose/runtime/m2;", "Ls1/h;", "d", "(Landroidx/compose/foundation/interaction/e;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "e", "f", "other", "", "equals", "", "hashCode", ak.av, "F", "defaultElevation", "b", "pressedElevation", ak.aF, "focusedElevation", "hoveredElevation", "<init>", "(FFFFLkotlin/jvm/internal/u;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public class FloatingActionButtonElevation {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float defaultElevation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float pressedElevation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float focusedElevation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float hoveredElevation;

    private FloatingActionButtonElevation(float f10, float f11, float f12, float f13) {
        this.defaultElevation = f10;
        this.pressedElevation = f11;
        this.focusedElevation = f12;
        this.hoveredElevation = f13;
    }

    public /* synthetic */ FloatingActionButtonElevation(float f10, float f11, float f12, float f13, kotlin.jvm.internal.u uVar) {
        this(f10, f11, f12, f13);
    }

    @androidx.compose.runtime.h
    private final m2<s1.h> d(androidx.compose.foundation.interaction.e eVar, androidx.compose.runtime.p pVar, int i10) {
        float f10;
        pVar.T(-1845106002);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1845106002, i10, -1, "androidx.compose.material3.FloatingActionButtonElevation.animateElevation (FloatingActionButton.kt:503)");
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
        int i11 = i10 & 14;
        pVar.T(511388516);
        boolean zS = pVar.s(eVar) | pVar.s(snapshotStateList);
        Object objU2 = pVar.U();
        if (zS || objU2 == companion.a()) {
            objU2 = new FloatingActionButtonElevation$animateElevation$1$1(eVar, snapshotStateList, null);
            pVar.N(objU2);
        }
        pVar.c0();
        EffectsKt.h(eVar, (yh.p) objU2, pVar, i11 | 64);
        androidx.compose.foundation.interaction.d dVar = (androidx.compose.foundation.interaction.d) CollectionsKt___CollectionsKt.q3(snapshotStateList);
        if (dVar instanceof androidx.compose.foundation.interaction.i.b) {
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
        EffectsKt.h(s1.h.d(f11), new FloatingActionButtonElevation$animateElevation$2(animatable, this, f11, dVar, null), pVar, 64);
        m2<s1.h> m2VarJ = animatable.j();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarJ;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<s1.h> e(@dl.d androidx.compose.foundation.interaction.e interactionSource, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(interactionSource, "interactionSource");
        pVar.T(-424810125);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-424810125, i10, -1, "androidx.compose.material3.FloatingActionButtonElevation.shadowElevation (FloatingActionButton.kt:493)");
        }
        m2<s1.h> m2VarD = d(interactionSource, pVar, (i10 & 112) | (i10 & 14));
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
        if (other == null || !(other instanceof FloatingActionButtonElevation)) {
            return false;
        }
        FloatingActionButtonElevation floatingActionButtonElevation = (FloatingActionButtonElevation) other;
        return s1.h.l(this.defaultElevation, floatingActionButtonElevation.defaultElevation) && s1.h.l(this.pressedElevation, floatingActionButtonElevation.pressedElevation) && s1.h.l(this.focusedElevation, floatingActionButtonElevation.focusedElevation) && s1.h.l(this.hoveredElevation, floatingActionButtonElevation.hoveredElevation);
    }

    @dl.d
    @androidx.compose.runtime.h
    public final m2<s1.h> f(@dl.d androidx.compose.foundation.interaction.e interactionSource, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(interactionSource, "interactionSource");
        pVar.T(-550096911);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-550096911, i10, -1, "androidx.compose.material3.FloatingActionButtonElevation.tonalElevation (FloatingActionButton.kt:498)");
        }
        m2<s1.h> m2VarD = d(interactionSource, pVar, (i10 & 112) | (i10 & 14));
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarD;
    }

    public int hashCode() {
        return (((((s1.h.n(this.defaultElevation) * 31) + s1.h.n(this.pressedElevation)) * 31) + s1.h.n(this.focusedElevation)) * 31) + s1.h.n(this.hoveredElevation);
    }
}
