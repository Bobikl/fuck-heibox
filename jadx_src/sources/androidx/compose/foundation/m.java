package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.HoverInteractionKt;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Indication.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/m;", "Landroidx/compose/foundation/x;", "Landroidx/compose/foundation/interaction/e;", "interactionSource", "Landroidx/compose/foundation/y;", ak.av, "(Landroidx/compose/foundation/interaction/e;Landroidx/compose/runtime/p;I)Landroidx/compose/foundation/y;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class m implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final m f7442a = new m();

    /* JADX INFO: compiled from: Indication.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B1\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/m$a;", "Landroidx/compose/foundation/y;", "Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/b2;", ak.av, "Landroidx/compose/runtime/m2;", "", "b", "Landroidx/compose/runtime/m2;", "isPressed", ak.aF, "isHovered", "d", "isFocused", "<init>", "(Landroidx/compose/runtime/m2;Landroidx/compose/runtime/m2;Landroidx/compose/runtime/m2;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements y {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final m2<Boolean> isPressed;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final m2<Boolean> isHovered;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final m2<Boolean> isFocused;

        public a(@dl.d m2<Boolean> isPressed, @dl.d m2<Boolean> isHovered, @dl.d m2<Boolean> isFocused) {
            kotlin.jvm.internal.f0.p(isPressed, "isPressed");
            kotlin.jvm.internal.f0.p(isHovered, "isHovered");
            kotlin.jvm.internal.f0.p(isFocused, "isFocused");
            this.isPressed = isPressed;
            this.isHovered = isHovered;
            this.isFocused = isFocused;
        }

        @Override // androidx.compose.foundation.y
        public void a(@dl.d androidx.compose.ui.graphics.drawscope.d dVar) {
            kotlin.jvm.internal.f0.p(dVar, "<this>");
            dVar.T0();
            if (this.isPressed.getValue().booleanValue()) {
                androidx.compose.ui.graphics.drawscope.f.K(dVar, androidx.compose.ui.graphics.l0.w(androidx.compose.ui.graphics.l0.INSTANCE.a(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, dVar.c(), 0.0f, null, null, 0, 122, null);
            } else if (this.isHovered.getValue().booleanValue() || this.isFocused.getValue().booleanValue()) {
                androidx.compose.ui.graphics.drawscope.f.K(dVar, androidx.compose.ui.graphics.l0.w(androidx.compose.ui.graphics.l0.INSTANCE.a(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, dVar.c(), 0.0f, null, null, 0, 122, null);
            }
        }
    }

    private m() {
    }

    @Override // androidx.compose.foundation.x
    @dl.d
    @androidx.compose.runtime.h
    public y a(@dl.d androidx.compose.foundation.interaction.e interactionSource, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(interactionSource, "interactionSource");
        pVar.T(1683566979);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1683566979, i10, -1, "androidx.compose.foundation.DefaultDebugIndication.rememberUpdatedInstance (Indication.kt:166)");
        }
        int i11 = i10 & 14;
        m2<Boolean> m2VarA = PressInteractionKt.a(interactionSource, pVar, i11);
        m2<Boolean> m2VarA2 = HoverInteractionKt.a(interactionSource, pVar, i11);
        m2<Boolean> m2VarA3 = FocusInteractionKt.a(interactionSource, pVar, i11);
        pVar.T(1157296644);
        boolean zS = pVar.s(interactionSource);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new a(m2VarA, m2VarA2, m2VarA3);
            pVar.N(objU);
        }
        pVar.c0();
        a aVar = (a) objU;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return aVar;
    }
}
