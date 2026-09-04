package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\r\u001a\f\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0007\u001a%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b\"\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b\"\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u000b\"\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013\"\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000b\"\u0014\u0010\u001a\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000b\"\u0014\u0010\u001c\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000b\"\u0014\u0010\u001e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/n;", "d", "Landroidx/compose/foundation/layout/f;", "windowInsets", "Landroidx/compose/foundation/layout/k1;", "side", "Landroidx/compose/ui/input/nestedscroll/b;", "e", "(Landroidx/compose/foundation/layout/f;ILandroidx/compose/runtime/p;I)Landroidx/compose/ui/input/nestedscroll/b;", "", ak.av, "F", "Inflection", "b", "PlatformFlingScrollFriction", ak.aF, "GravityEarth", "InchesPerMeter", "", "D", "DecelerationRate", "f", "DecelMinusOne", "g", "StartTension", RXScreenCaptureService.KEY_HEIGHT, "EndTension", "i", "P1", "j", "P2", "foundation-layout_release"}, k = 2, mv = {1, 7, 1})
public final class WindowInsetsConnection_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f6157a = 0.35f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f6158b = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f6159c = 9.80665f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f6160d = 39.37f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final double f6161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final double f6162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f6163g = 0.5f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f6164h = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f6165i = 0.175f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f6166j = 0.35000002f;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f6161e = dLog;
        f6162f = dLog - 1.0d;
    }

    @t
    @dl.d
    public static final androidx.compose.ui.n d(@dl.d androidx.compose.ui.n nVar) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        if (Build.VERSION.SDK_INT < 30) {
            return nVar;
        }
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$imeNestedScroll$$inlined$debugInspectorInfo$1
            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("imeNestedScroll");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$imeNestedScroll$2
            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(-369978792);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-369978792, i10, -1, "androidx.compose.foundation.layout.imeNestedScroll.<anonymous> (WindowInsetsConnection.android.kt:78)");
                }
                androidx.compose.ui.n nVarB = NestedScrollModifierKt.b(composed, WindowInsetsConnection_androidKt.e(WindowInsetsHolder.f6170v.c(pVar, 8).h(), k1.INSTANCE.e(), pVar, 48), null, 2, null);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return nVarB;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    @t
    @dl.d
    @androidx.compose.runtime.h
    public static final androidx.compose.ui.input.nestedscroll.b e(@dl.d f windowInsets, int i10, @dl.e androidx.compose.runtime.p pVar, int i11) {
        kotlin.jvm.internal.f0.p(windowInsets, "windowInsets");
        pVar.T(-1011341039);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1011341039, i11, -1, "androidx.compose.foundation.layout.rememberWindowInsetsConnection (WindowInsetsConnection.android.kt:104)");
        }
        if (Build.VERSION.SDK_INT < 30) {
            r rVar = r.f6381b;
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVar.c0();
            return rVar;
        }
        a1 a1VarA = a1.INSTANCE.a(i10, (LayoutDirection) pVar.K(CompositionLocalsKt.p()));
        View view = (View) pVar.K(AndroidCompositionLocals_androidKt.k());
        s1.e eVar = (s1.e) pVar.K(CompositionLocalsKt.i());
        Object[] objArr = {windowInsets, view, a1VarA, eVar};
        pVar.T(-568225417);
        boolean zS = false;
        for (int i12 = 0; i12 < 4; i12++) {
            zS |= pVar.s(objArr[i12]);
        }
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new WindowInsetsNestedScrollConnection(windowInsets, view, a1VarA, eVar);
            pVar.N(objU);
        }
        pVar.c0();
        final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = (WindowInsetsNestedScrollConnection) objU;
        EffectsKt.c(windowInsetsNestedScrollConnection, new yh.l<androidx.compose.runtime.f0, androidx.compose.runtime.e0>() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1

            /* JADX INFO: compiled from: Effects.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
            public static final class a implements androidx.compose.runtime.e0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ WindowInsetsNestedScrollConnection f6169a;

                public a(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection) {
                    this.f6169a = windowInsetsNestedScrollConnection;
                }

                @Override // androidx.compose.runtime.e0
                public void dispose() {
                    this.f6169a.o();
                }
            }

            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.runtime.e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                kotlin.jvm.internal.f0.p(DisposableEffect, "$this$DisposableEffect");
                return new a(windowInsetsNestedScrollConnection);
            }
        }, pVar, 8);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return windowInsetsNestedScrollConnection;
    }
}
