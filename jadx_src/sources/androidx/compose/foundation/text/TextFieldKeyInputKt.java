package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.text.input.TextFieldValue;
import com.umeng.analytics.pro.ak;
import com.umeng.commonsdk.framework.UMModuleRegister;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TextFieldKeyInput.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aZ\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/foundation/text/TextFieldState;", "state", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Lkotlin/Function1;", "Lkotlin/b2;", "onValueChange", "", "editable", "singleLine", "Landroidx/compose/ui/text/input/x;", "offsetMapping", "Landroidx/compose/foundation/text/a0;", "undoManager", ak.av, "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class TextFieldKeyInputKt {
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d final TextFieldState state, @dl.d final TextFieldSelectionManager manager, @dl.d final TextFieldValue value, @dl.d final yh.l<? super TextFieldValue, b2> onValueChange, final boolean z10, final boolean z11, @dl.d final androidx.compose.ui.text.input.x offsetMapping, @dl.d final a0 undoManager) {
        f0.p(nVar, "<this>");
        f0.p(state, "state");
        f0.p(manager, "manager");
        f0.p(value, "value");
        f0.p(onValueChange, "onValueChange");
        f0.p(offsetMapping, "offsetMapping");
        f0.p(undoManager, "undoManager");
        return ComposedModifierKt.l(nVar, null, new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.text.TextFieldKeyInputKt$textFieldKeyInput$2

            /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldKeyInputKt$textFieldKeyInput$2$1, reason: invalid class name */
            /* JADX INFO: compiled from: TextFieldKeyInput.kt */
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements yh.l<androidx.compose.ui.input.key.b, Boolean> {
                AnonymousClass1(Object obj) {
                    super(1, obj, TextFieldKeyInput.class, UMModuleRegister.PROCESS, "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
                }

                @dl.d
                public final Boolean i(@dl.d KeyEvent p10) {
                    f0.p(p10, "p0");
                    return Boolean.valueOf(((TextFieldKeyInput) this.receiver).o(p10));
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.key.b bVar) {
                    return i(bVar.h());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                f0.p(composed, "$this$composed");
                pVar.T(58482146);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(58482146, i10, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:241)");
                }
                pVar.T(-492369756);
                Object objU = pVar.U();
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new androidx.compose.foundation.text.selection.u();
                    pVar.N(objU);
                }
                pVar.c0();
                androidx.compose.ui.n nVarB = KeyInputModifierKt.b(androidx.compose.ui.n.INSTANCE, new AnonymousClass1(new TextFieldKeyInput(state, manager, value, z10, z11, (androidx.compose.foundation.text.selection.u) objU, offsetMapping, undoManager, null, onValueChange, 256, null)));
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
        }, 1, null);
    }
}
