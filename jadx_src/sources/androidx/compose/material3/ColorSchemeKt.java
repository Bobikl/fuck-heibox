package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: ColorScheme.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\u001aµ\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001aµ\u0002\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010 \u001a\u001f\u0010#\u001a\u00020\u0000*\u00020\u001e2\u0006\u0010\"\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001a\u001d\u0010%\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001a)\u0010)\u001a\u00020\u0000*\u00020\u001e2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001a\u001f\u0010+\u001a\u00020\u0000*\u00020\u001e2\u0006\u0010(\u001a\u00020'ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,\u001a\u0014\u0010/\u001a\u00020.*\u00020\u001e2\u0006\u0010-\u001a\u00020\u001eH\u0000\u001a\u001e\u00102\u001a\u00020\u0000*\u00020\u001e2\u0006\u00101\u001a\u000200H\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103\u001a\u0016\u00104\u001a\u00020\u0000*\u000200H\u0001ø\u0001\u0001¢\u0006\u0004\b4\u00105\" \u0010:\u001a\b\u0012\u0004\u0012\u00020\u001e068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u00107\u001a\u0004\b8\u00109\"\u0014\u0010=\u001a\u00020;8\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010<\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006>"}, d2 = {"Landroidx/compose/ui/graphics/l0;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", UiKitSpanObj.TYPE_BACKGROUND, "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "Landroidx/compose/material3/o;", RXScreenCaptureService.KEY_HEIGHT, "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/o;", "d", com.google.android.exoplayer2.text.ttml.d.H, "b", "(Landroidx/compose/material3/o;J)J", ak.aF, "(JLandroidx/compose/runtime/p;I)J", "Ls1/h;", "elevation", ak.av, "(Landroidx/compose/material3/o;JF)J", "j", "(Landroidx/compose/material3/o;F)J", "other", "Lkotlin/b2;", "l", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "value", "f", "(Landroidx/compose/material3/o;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J", "k", "(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/p;I)J", "Landroidx/compose/runtime/j1;", "Landroidx/compose/runtime/j1;", "g", "()Landroidx/compose/runtime/j1;", "LocalColorScheme", "", "F", "DisabledAlpha", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class ColorSchemeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<ColorScheme> f9286a = CompositionLocalKt.e(new yh.a<ColorScheme>() { // from class: androidx.compose.material3.ColorSchemeKt$LocalColorScheme$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ColorScheme invoke() {
            return ColorSchemeKt.i(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 536870911, null);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f9287b = 0.38f;

    /* JADX INFO: compiled from: ColorScheme.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9289a;

        static {
            int[] iArr = new int[ColorSchemeKeyTokens.values().length];
            iArr[ColorSchemeKeyTokens.Background.ordinal()] = 1;
            iArr[ColorSchemeKeyTokens.Error.ordinal()] = 2;
            iArr[ColorSchemeKeyTokens.ErrorContainer.ordinal()] = 3;
            iArr[ColorSchemeKeyTokens.InverseOnSurface.ordinal()] = 4;
            iArr[ColorSchemeKeyTokens.InversePrimary.ordinal()] = 5;
            iArr[ColorSchemeKeyTokens.InverseSurface.ordinal()] = 6;
            iArr[ColorSchemeKeyTokens.OnBackground.ordinal()] = 7;
            iArr[ColorSchemeKeyTokens.OnError.ordinal()] = 8;
            iArr[ColorSchemeKeyTokens.OnErrorContainer.ordinal()] = 9;
            iArr[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 10;
            iArr[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 11;
            iArr[ColorSchemeKeyTokens.OnSecondary.ordinal()] = 12;
            iArr[ColorSchemeKeyTokens.OnSecondaryContainer.ordinal()] = 13;
            iArr[ColorSchemeKeyTokens.OnSurface.ordinal()] = 14;
            iArr[ColorSchemeKeyTokens.OnSurfaceVariant.ordinal()] = 15;
            iArr[ColorSchemeKeyTokens.SurfaceTint.ordinal()] = 16;
            iArr[ColorSchemeKeyTokens.OnTertiary.ordinal()] = 17;
            iArr[ColorSchemeKeyTokens.OnTertiaryContainer.ordinal()] = 18;
            iArr[ColorSchemeKeyTokens.Outline.ordinal()] = 19;
            iArr[ColorSchemeKeyTokens.OutlineVariant.ordinal()] = 20;
            iArr[ColorSchemeKeyTokens.Primary.ordinal()] = 21;
            iArr[ColorSchemeKeyTokens.PrimaryContainer.ordinal()] = 22;
            iArr[ColorSchemeKeyTokens.Scrim.ordinal()] = 23;
            iArr[ColorSchemeKeyTokens.Secondary.ordinal()] = 24;
            iArr[ColorSchemeKeyTokens.SecondaryContainer.ordinal()] = 25;
            iArr[ColorSchemeKeyTokens.Surface.ordinal()] = 26;
            iArr[ColorSchemeKeyTokens.SurfaceVariant.ordinal()] = 27;
            iArr[ColorSchemeKeyTokens.Tertiary.ordinal()] = 28;
            iArr[ColorSchemeKeyTokens.TertiaryContainer.ordinal()] = 29;
            f9289a = iArr;
        }
    }

    public static final long a(@dl.d ColorScheme applyTonalElevation, long j10, float f10) {
        kotlin.jvm.internal.f0.p(applyTonalElevation, "$this$applyTonalElevation");
        return androidx.compose.ui.graphics.l0.y(j10, applyTonalElevation.A()) ? j(applyTonalElevation, f10) : j10;
    }

    public static final long b(@dl.d ColorScheme contentColorFor, long j10) {
        kotlin.jvm.internal.f0.p(contentColorFor, "$this$contentColorFor");
        if (androidx.compose.ui.graphics.l0.y(j10, contentColorFor.v())) {
            return contentColorFor.l();
        }
        if (androidx.compose.ui.graphics.l0.y(j10, contentColorFor.y())) {
            return contentColorFor.n();
        }
        if (androidx.compose.ui.graphics.l0.y(j10, contentColorFor.D())) {
            return contentColorFor.r();
        }
        if (androidx.compose.ui.graphics.l0.y(j10, contentColorFor.c())) {
            return contentColorFor.i();
        }
        if (androidx.compose.ui.graphics.l0.y(j10, contentColorFor.d())) {
            return contentColorFor.j();
        }
        if (androidx.compose.ui.graphics.l0.y(j10, contentColorFor.A())) {
            return contentColorFor.p();
        }
        if (androidx.compose.ui.graphics.l0.y(j10, contentColorFor.C())) {
            return contentColorFor.q();
        }
        if (androidx.compose.ui.graphics.l0.y(j10, contentColorFor.w())) {
            return contentColorFor.m();
        }
        if (androidx.compose.ui.graphics.l0.y(j10, contentColorFor.z())) {
            return contentColorFor.o();
        }
        if (androidx.compose.ui.graphics.l0.y(j10, contentColorFor.E())) {
            return contentColorFor.s();
        }
        if (androidx.compose.ui.graphics.l0.y(j10, contentColorFor.e())) {
            return contentColorFor.k();
        }
        return androidx.compose.ui.graphics.l0.y(j10, contentColorFor.h()) ? contentColorFor.f() : androidx.compose.ui.graphics.l0.INSTANCE.u();
    }

    @androidx.compose.runtime.m1
    @androidx.compose.runtime.h
    public static final long c(long j10, @dl.e androidx.compose.runtime.p pVar, int i10) {
        if (ComposerKt.g0()) {
            ComposerKt.w0(509589638, i10, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:473)");
        }
        long jB = b(o0.f12059a.a(pVar, 6), j10);
        if (!(jB != androidx.compose.ui.graphics.l0.INSTANCE.u())) {
            jB = ((androidx.compose.ui.graphics.l0) pVar.K(ContentColorKt.a())).M();
        }
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return jB;
    }

    @dl.d
    public static final ColorScheme d(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38) {
        return new ColorScheme(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, null);
    }

    public static /* synthetic */ ColorScheme e(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, int i10, Object obj) {
        long jT = (i10 & 1) != 0 ? t0.f.f139700a.t() : j10;
        return d(jT, (i10 & 2) != 0 ? t0.f.f139700a.j() : j11, (i10 & 4) != 0 ? t0.f.f139700a.u() : j12, (i10 & 8) != 0 ? t0.f.f139700a.k() : j13, (i10 & 16) != 0 ? t0.f.f139700a.e() : j14, (i10 & 32) != 0 ? t0.f.f139700a.w() : j15, (i10 & 64) != 0 ? t0.f.f139700a.l() : j16, (i10 & 128) != 0 ? t0.f.f139700a.x() : j17, (i10 & 256) != 0 ? t0.f.f139700a.m() : j18, (i10 & 512) != 0 ? t0.f.f139700a.B() : j19, (i10 & 1024) != 0 ? t0.f.f139700a.p() : j20, (i10 & 2048) != 0 ? t0.f.f139700a.C() : j21, (i10 & 4096) != 0 ? t0.f.f139700a.q() : j22, (i10 & 8192) != 0 ? t0.f.f139700a.a() : j23, (i10 & 16384) != 0 ? t0.f.f139700a.g() : j24, (i10 & 32768) != 0 ? t0.f.f139700a.y() : j25, (i10 & 65536) != 0 ? t0.f.f139700a.n() : j26, (i10 & 131072) != 0 ? t0.f.f139700a.A() : j27, (i10 & 262144) != 0 ? t0.f.f139700a.o() : j28, (i10 & 524288) != 0 ? jT : j29, (i10 & 1048576) != 0 ? t0.f.f139700a.f() : j30, (i10 & 2097152) != 0 ? t0.f.f139700a.d() : j31, (i10 & 4194304) != 0 ? t0.f.f139700a.b() : j32, (i10 & 8388608) != 0 ? t0.f.f139700a.h() : j33, (i10 & 16777216) != 0 ? t0.f.f139700a.c() : j34, (i10 & 33554432) != 0 ? t0.f.f139700a.i() : j35, (i10 & 67108864) != 0 ? t0.f.f139700a.r() : j36, (i10 & 134217728) != 0 ? t0.f.f139700a.s() : j37, (i10 & 268435456) != 0 ? t0.f.f139700a.v() : j38);
    }

    public static final long f(@dl.d ColorScheme colorScheme, @dl.d ColorSchemeKeyTokens value) {
        kotlin.jvm.internal.f0.p(colorScheme, "<this>");
        kotlin.jvm.internal.f0.p(value, "value");
        switch (a.f9289a[value.ordinal()]) {
            case 1:
                return colorScheme.c();
            case 2:
                return colorScheme.d();
            case 3:
                return colorScheme.e();
            case 4:
                return colorScheme.f();
            case 5:
                return colorScheme.g();
            case 6:
                return colorScheme.h();
            case 7:
                return colorScheme.i();
            case 8:
                return colorScheme.j();
            case 9:
                return colorScheme.k();
            case 10:
                return colorScheme.l();
            case 11:
                return colorScheme.m();
            case 12:
                return colorScheme.n();
            case 13:
                return colorScheme.o();
            case 14:
                return colorScheme.p();
            case 15:
                return colorScheme.q();
            case 16:
                return colorScheme.B();
            case 17:
                return colorScheme.r();
            case 18:
                return colorScheme.s();
            case 19:
                return colorScheme.t();
            case 20:
                return colorScheme.u();
            case 21:
                return colorScheme.v();
            case 22:
                return colorScheme.w();
            case 23:
                return colorScheme.x();
            case 24:
                return colorScheme.y();
            case 25:
                return colorScheme.z();
            case 26:
                return colorScheme.A();
            case 27:
                return colorScheme.C();
            case 28:
                return colorScheme.D();
            case 29:
                return colorScheme.E();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @dl.d
    public static final androidx.compose.runtime.j1<ColorScheme> g() {
        return f9286a;
    }

    @dl.d
    public static final ColorScheme h(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38) {
        return new ColorScheme(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, null);
    }

    public static /* synthetic */ ColorScheme i(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, int i10, Object obj) {
        long jT = (i10 & 1) != 0 ? t0.g.f139752a.t() : j10;
        return h(jT, (i10 & 2) != 0 ? t0.g.f139752a.j() : j11, (i10 & 4) != 0 ? t0.g.f139752a.u() : j12, (i10 & 8) != 0 ? t0.g.f139752a.k() : j13, (i10 & 16) != 0 ? t0.g.f139752a.e() : j14, (i10 & 32) != 0 ? t0.g.f139752a.w() : j15, (i10 & 64) != 0 ? t0.g.f139752a.l() : j16, (i10 & 128) != 0 ? t0.g.f139752a.x() : j17, (i10 & 256) != 0 ? t0.g.f139752a.m() : j18, (i10 & 512) != 0 ? t0.g.f139752a.B() : j19, (i10 & 1024) != 0 ? t0.g.f139752a.p() : j20, (i10 & 2048) != 0 ? t0.g.f139752a.C() : j21, (i10 & 4096) != 0 ? t0.g.f139752a.q() : j22, (i10 & 8192) != 0 ? t0.g.f139752a.a() : j23, (i10 & 16384) != 0 ? t0.g.f139752a.g() : j24, (i10 & 32768) != 0 ? t0.g.f139752a.y() : j25, (i10 & 65536) != 0 ? t0.g.f139752a.n() : j26, (i10 & 131072) != 0 ? t0.g.f139752a.A() : j27, (i10 & 262144) != 0 ? t0.g.f139752a.o() : j28, (i10 & 524288) != 0 ? jT : j29, (i10 & 1048576) != 0 ? t0.g.f139752a.f() : j30, (i10 & 2097152) != 0 ? t0.g.f139752a.d() : j31, (i10 & 4194304) != 0 ? t0.g.f139752a.b() : j32, (i10 & 8388608) != 0 ? t0.g.f139752a.h() : j33, (i10 & 16777216) != 0 ? t0.g.f139752a.c() : j34, (i10 & 33554432) != 0 ? t0.g.f139752a.i() : j35, (i10 & 67108864) != 0 ? t0.g.f139752a.r() : j36, (i10 & 134217728) != 0 ? t0.g.f139752a.s() : j37, (i10 & 268435456) != 0 ? t0.g.f139752a.v() : j38);
    }

    public static final long j(@dl.d ColorScheme surfaceColorAtElevation, float f10) {
        kotlin.jvm.internal.f0.p(surfaceColorAtElevation, "$this$surfaceColorAtElevation");
        if (s1.h.l(f10, s1.h.g(0))) {
            return surfaceColorAtElevation.A();
        }
        return androidx.compose.ui.graphics.n0.i(androidx.compose.ui.graphics.l0.w(surfaceColorAtElevation.B(), ((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), surfaceColorAtElevation.A());
    }

    @androidx.compose.runtime.m1
    @androidx.compose.runtime.h
    public static final long k(@dl.d ColorSchemeKeyTokens colorSchemeKeyTokens, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(colorSchemeKeyTokens, "<this>");
        if (ComposerKt.g0()) {
            ComposerKt.w0(1330949347, i10, -1, "androidx.compose.material3.toColor (ColorScheme.kt:611)");
        }
        long jF = f(o0.f12059a.a(pVar, 6), colorSchemeKeyTokens);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return jF;
    }

    public static final void l(@dl.d ColorScheme colorScheme, @dl.d ColorScheme other) {
        kotlin.jvm.internal.f0.p(colorScheme, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        colorScheme.Y(other.v());
        colorScheme.O(other.l());
        colorScheme.Z(other.w());
        colorScheme.P(other.m());
        colorScheme.J(other.g());
        colorScheme.b0(other.y());
        colorScheme.Q(other.n());
        colorScheme.c0(other.z());
        colorScheme.R(other.o());
        colorScheme.g0(other.D());
        colorScheme.U(other.r());
        colorScheme.h0(other.E());
        colorScheme.V(other.s());
        colorScheme.F(other.c());
        colorScheme.L(other.i());
        colorScheme.d0(other.A());
        colorScheme.S(other.p());
        colorScheme.f0(other.C());
        colorScheme.T(other.q());
        colorScheme.e0(other.B());
        colorScheme.K(other.h());
        colorScheme.I(other.f());
        colorScheme.G(other.d());
        colorScheme.M(other.j());
        colorScheme.H(other.e());
        colorScheme.N(other.k());
        colorScheme.W(other.t());
        colorScheme.X(other.u());
        colorScheme.a0(other.x());
    }
}
