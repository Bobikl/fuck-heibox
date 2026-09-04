package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.u1;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ContextMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\b2\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "content", "b", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lyh/p;Landroidx/compose/runtime/p;I)V", "Landroidx/compose/foundation/text/selection/SelectionManager;", ak.av, "(Landroidx/compose/foundation/text/selection/SelectionManager;Lyh/p;Landroidx/compose/runtime/p;I)V", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class ContextMenu_androidKt {
    @androidx.compose.runtime.i(scheme = "[0[0]]")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final SelectionManager manager, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10) {
        int i11;
        f0.p(manager, "manager");
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(605522716);
        if ((i10 & 112) == 0) {
            i11 = (pVarF.s(content) ? 32 : 16) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 81) == 16 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(605522716, i11, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:31)");
            }
            content.invoke(pVarF, Integer.valueOf((i11 >> 3) & 14));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i12) {
                ContextMenu_androidKt.a(manager, content, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @androidx.compose.runtime.i(scheme = "[0[0]]")
    @androidx.compose.runtime.h
    public static final void b(@dl.d final TextFieldSelectionManager manager, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10) {
        int i11;
        f0.p(manager, "manager");
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-1985516685);
        if ((i10 & 112) == 0) {
            i11 = (pVarF.s(content) ? 32 : 16) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 81) == 16 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1985516685, i11, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:23)");
            }
            content.invoke(pVarF, Integer.valueOf((i11 >> 3) & 14));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i12) {
                ContextMenu_androidKt.b(manager, content, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }
}
