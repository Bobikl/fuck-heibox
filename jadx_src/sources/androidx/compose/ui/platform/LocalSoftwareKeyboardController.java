package androidx.compose.ui.platform;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: LocalSoftwareKeyboardController.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.ui.g
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0086\u0004R\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\t\u0010\u0004¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/LocalSoftwareKeyboardController;", "", "Landroidx/compose/ui/platform/u1;", ak.av, "(Landroidx/compose/runtime/p;I)Landroidx/compose/ui/platform/u1;", "softwareKeyboardController", "Landroidx/compose/runtime/k1;", "d", "Landroidx/compose/runtime/j1;", "b", "Landroidx/compose/runtime/j1;", "LocalSoftwareKeyboardController", "getCurrent$annotations", "()V", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "<init>", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class LocalSoftwareKeyboardController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final LocalSoftwareKeyboardController f15656a = new LocalSoftwareKeyboardController();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final androidx.compose.runtime.j1<u1> LocalSoftwareKeyboardController = CompositionLocalKt.d(null, new yh.a<u1>() { // from class: androidx.compose.ui.platform.LocalSoftwareKeyboardController$LocalSoftwareKeyboardController$1
        @Override // yh.a
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u1 invoke() {
            return null;
        }
    }, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f15658c = 0;

    private LocalSoftwareKeyboardController() {
    }

    @androidx.compose.runtime.h
    private final u1 a(androidx.compose.runtime.p pVar, int i10) {
        pVar.T(1835581880);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1835581880, i10, -1, "androidx.compose.ui.platform.LocalSoftwareKeyboardController.delegatingController (LocalSoftwareKeyboardController.kt:45)");
        }
        androidx.compose.ui.text.input.i0 i0Var = (androidx.compose.ui.text.input.i0) pVar.K(CompositionLocalsKt.r());
        if (i0Var == null) {
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVar.c0();
            return null;
        }
        int i11 = androidx.compose.ui.text.input.i0.f16735c;
        pVar.T(1157296644);
        boolean zS = pVar.s(i0Var);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new n0(i0Var);
            pVar.N(objU);
        }
        pVar.c0();
        n0 n0Var = (n0) objU;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return n0Var;
    }

    @androidx.compose.ui.g
    public static /* synthetic */ void c() {
    }

    @xh.h(name = "getCurrent")
    @dl.e
    @androidx.compose.runtime.h
    public final u1 b(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-1059476185);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1059476185, i10, -1, "androidx.compose.ui.platform.LocalSoftwareKeyboardController.<get-current> (LocalSoftwareKeyboardController.kt:40)");
        }
        u1 u1VarA = (u1) pVar.K(LocalSoftwareKeyboardController);
        if (u1VarA == null) {
            u1VarA = a(pVar, i10 & 14);
        }
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return u1VarA;
    }

    @dl.d
    public final androidx.compose.runtime.k1<u1> d(@dl.d u1 softwareKeyboardController) {
        kotlin.jvm.internal.f0.p(softwareKeyboardController, "softwareKeyboardController");
        return LocalSoftwareKeyboardController.f(softwareKeyboardController);
    }
}
