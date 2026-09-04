package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.ComposerKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import t0.r;

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes.dex */
@w
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b.\u0010/J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0085\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u0085\u0002\u0010(\u001a\u00020!2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010$\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020\u00072\b\b\u0002\u0010&\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010#R\u0017\u0010-\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"Landroidx/compose/material3/ExposedDropdownMenuDefaults;", "", "", "expanded", "Lkotlin/b2;", ak.av, "(ZLandroidx/compose/runtime/p;I)V", "Landroidx/compose/ui/graphics/l0;", "textColor", "disabledTextColor", "containerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/v;", "selectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "Landroidx/compose/material3/x1;", "d", "(JJJJJLandroidx/compose/foundation/text/selection/v;JJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/p;IIII)Landroidx/compose/material3/x1;", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", ak.aF, "Landroidx/compose/foundation/layout/m0;", "b", "Landroidx/compose/foundation/layout/m0;", "()Landroidx/compose/foundation/layout/m0;", "ItemContentPadding", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class ExposedDropdownMenuDefaults {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final ExposedDropdownMenuDefaults f9402a = new ExposedDropdownMenuDefaults();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final androidx.compose.foundation.layout.m0 ItemContentPadding = PaddingKt.b(ExposedDropdownMenuKt.f9408a, s1.h.g(0));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f9404c = 0;

    private ExposedDropdownMenuDefaults() {
    }

    @w
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public final void a(final boolean z10, @dl.e androidx.compose.runtime.p pVar, final int i10) {
        int i11;
        androidx.compose.runtime.p pVarF = pVar.F(-1803742020);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.u(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1803742020, i10, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.kt:298)");
            }
            IconKt.c(o0.f.a(n0.a.C1205a.f131925a), null, androidx.compose.ui.draw.n.a(androidx.compose.ui.n.INSTANCE, z10 ? 180.0f : 0.0f), 0L, pVarF, 48, 8);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuDefaults$TrailingIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i12) {
                this.f9405b.a(z10, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    @dl.d
    public final androidx.compose.foundation.layout.m0 b() {
        return ItemContentPadding;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final x1 c(long j10, long j11, long j12, long j13, long j14, @dl.e SelectionColors selectionColors, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, @dl.e androidx.compose.runtime.p pVar, int i10, int i11, int i12, int i13) {
        pVar.T(-83147315);
        long jK = (i13 & 1) != 0 ? ColorSchemeKt.k(t0.i0.f139849a.s(), pVar, 6) : j10;
        long jW = (i13 & 2) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.i0.f139849a.a(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jS = (i13 & 4) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j12;
        long jK2 = (i13 & 8) != 0 ? ColorSchemeKt.k(t0.i0.f139849a.I(), pVar, 6) : j13;
        long jK3 = (i13 & 16) != 0 ? ColorSchemeKt.k(t0.i0.f139849a.Q(), pVar, 6) : j14;
        SelectionColors selectionColors2 = (i13 & 32) != 0 ? (SelectionColors) pVar.K(TextSelectionColorsKt.c()) : selectionColors;
        long jK4 = (i13 & 64) != 0 ? ColorSchemeKt.k(t0.i0.f139849a.b0(), pVar, 6) : j15;
        long jK5 = (i13 & 128) != 0 ? ColorSchemeKt.k(t0.i0.f139849a.k0(), pVar, 6) : j16;
        long jW2 = (i13 & 256) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.i0.f139849a.N(), pVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long jK6 = (i13 & 512) != 0 ? ColorSchemeKt.k(t0.i0.f139849a.Y(), pVar, 6) : j18;
        long jK7 = (i13 & 1024) != 0 ? ColorSchemeKt.k(t0.i0.f139849a.a0(), pVar, 6) : j19;
        long jK8 = (i13 & 2048) != 0 ? ColorSchemeKt.k(t0.i0.f139849a.i0(), pVar, 6) : j20;
        long jW3 = (i13 & 4096) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.i0.f139849a.M(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long jK9 = (i13 & 8192) != 0 ? ColorSchemeKt.k(t0.i0.f139849a.X(), pVar, 6) : j22;
        long jK10 = (i13 & 16384) != 0 ? ColorSchemeKt.k(t0.i0.f139849a.d0(), pVar, 6) : j23;
        long jK11 = (32768 & i13) != 0 ? ColorSchemeKt.k(t0.i0.f139849a.m0(), pVar, 6) : j24;
        long jW4 = (65536 & i13) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.i0.f139849a.P(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long jK12 = (131072 & i13) != 0 ? ColorSchemeKt.k(t0.i0.f139849a.Z(), pVar, 6) : j26;
        long jK13 = (262144 & i13) != 0 ? ColorSchemeKt.k(t0.i0.f139849a.n(), pVar, 6) : j27;
        long jK14 = (524288 & i13) != 0 ? ColorSchemeKt.k(t0.i0.f139849a.u(), pVar, 6) : j28;
        long jW5 = (1048576 & i13) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.i0.f139849a.b(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j29;
        long jK15 = (2097152 & i13) != 0 ? ColorSchemeKt.k(t0.i0.f139849a.k(), pVar, 6) : j30;
        long jK16 = (4194304 & i13) != 0 ? ColorSchemeKt.k(t0.i0.f139849a.w(), pVar, 6) : j31;
        long jW6 = (i13 & 8388608) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.i0.f139849a.a(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j32;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-83147315, i10, i11, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.kt:440)");
        }
        x1 x1VarM = TextFieldDefaults.f11327a.m(jK, jW, jS, jK2, jK3, selectionColors2, jK4, jK5, jW2, jK6, jK7, jK8, jW3, jK9, jK10, jK11, jW4, jK12, jK13, jK14, jW5, jK15, jK16, jW6, 0L, 0L, 0L, 0L, pVar, (i10 & 14) | (i10 & 112) | (i10 & bb.c.b.f30796me) | (i10 & bb.c.g.f32954lc) | (i10 & 57344) | (i10 & 458752) | (i10 & 3670016) | (i10 & 29360128) | (i10 & 234881024) | (i10 & 1879048192), (i11 & 14) | (i11 & 112) | (i11 & bb.c.b.f30796me) | (i11 & bb.c.g.f32954lc) | (i11 & 57344) | (i11 & 458752) | (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), 100663296 | (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc), 251658240);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return x1VarM;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final x1 d(long j10, long j11, long j12, long j13, long j14, @dl.e SelectionColors selectionColors, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, @dl.e androidx.compose.runtime.p pVar, int i10, int i11, int i12, int i13) {
        pVar.T(-2013303349);
        long jK = (i13 & 1) != 0 ? ColorSchemeKt.k(r.f140237a.s(), pVar, 6) : j10;
        long jW = (i13 & 2) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(r.f140237a.a(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jK2 = (i13 & 4) != 0 ? ColorSchemeKt.k(r.f140237a.L(), pVar, 6) : j12;
        long jK3 = (i13 & 8) != 0 ? ColorSchemeKt.k(r.f140237a.K(), pVar, 6) : j13;
        long jK4 = (i13 & 16) != 0 ? ColorSchemeKt.k(r.f140237a.V(), pVar, 6) : j14;
        SelectionColors selectionColors2 = (i13 & 32) != 0 ? (SelectionColors) pVar.K(TextSelectionColorsKt.c()) : selectionColors;
        long jK5 = (i13 & 64) != 0 ? ColorSchemeKt.k(r.f140237a.d0(), pVar, 6) : j15;
        long jK6 = (i13 & 128) != 0 ? ColorSchemeKt.k(r.f140237a.I(), pVar, 6) : j16;
        long jW2 = (i13 & 256) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(r.f140237a.O(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long jK7 = (i13 & 512) != 0 ? ColorSchemeKt.k(r.f140237a.T(), pVar, 6) : j18;
        long jK8 = (i13 & 1024) != 0 ? ColorSchemeKt.k(r.f140237a.f0(), pVar, 6) : j19;
        long jK9 = (i13 & 2048) != 0 ? ColorSchemeKt.k(r.f140237a.l0(), pVar, 6) : j20;
        long jW3 = (i13 & 4096) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(r.f140237a.R(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long jK10 = (i13 & 8192) != 0 ? ColorSchemeKt.k(r.f140237a.b0(), pVar, 6) : j22;
        long jK11 = (i13 & 16384) != 0 ? ColorSchemeKt.k(r.f140237a.g0(), pVar, 6) : j23;
        long jK12 = (32768 & i13) != 0 ? ColorSchemeKt.k(r.f140237a.n0(), pVar, 6) : j24;
        long jW4 = (65536 & i13) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(r.f140237a.S(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long jK13 = (131072 & i13) != 0 ? ColorSchemeKt.k(r.f140237a.c0(), pVar, 6) : j26;
        long jK14 = (262144 & i13) != 0 ? ColorSchemeKt.k(r.f140237a.n(), pVar, 6) : j27;
        long jK15 = (524288 & i13) != 0 ? ColorSchemeKt.k(r.f140237a.u(), pVar, 6) : j28;
        long jK16 = (1048576 & i13) != 0 ? ColorSchemeKt.k(r.f140237a.b(), pVar, 6) : j29;
        long jK17 = (2097152 & i13) != 0 ? ColorSchemeKt.k(r.f140237a.k(), pVar, 6) : j30;
        long jK18 = (4194304 & i13) != 0 ? ColorSchemeKt.k(r.f140237a.w(), pVar, 6) : j31;
        long jW5 = (i13 & 8388608) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(r.f140237a.a(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j32;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-2013303349, i10, i11, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.kt:338)");
        }
        x1 x1VarR = TextFieldDefaults.f11327a.r(jK, jW, jK2, jK3, jK4, selectionColors2, jK5, jK6, jW2, jK7, jK8, jK9, jW3, jK10, jK11, jK12, jW4, jK13, jK14, jK15, jK16, jK17, jK18, jW5, 0L, 0L, 0L, 0L, pVar, (i10 & 14) | (i10 & 112) | (i10 & bb.c.b.f30796me) | (i10 & bb.c.g.f32954lc) | (i10 & 57344) | (i10 & 458752) | (i10 & 3670016) | (i10 & 29360128) | (i10 & 234881024) | (i10 & 1879048192), (i11 & 14) | (i11 & 112) | (i11 & bb.c.b.f30796me) | (i11 & bb.c.g.f32954lc) | (i11 & 57344) | (i11 & 458752) | (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), 100663296 | (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc), 251658240);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return x1VarR;
    }
}
