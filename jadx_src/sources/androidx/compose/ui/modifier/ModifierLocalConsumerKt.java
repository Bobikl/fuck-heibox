package androidx.compose.ui.modifier;

import androidx.compose.runtime.j2;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ModifierLocalConsumer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/n;", "Lkotlin/Function1;", "Landroidx/compose/ui/modifier/n;", "Lkotlin/b2;", "Lkotlin/t;", "consumer", ak.av, "ui_release"}, k = 2, mv = {1, 7, 1})
public final class ModifierLocalConsumerKt {
    @j2
    @androidx.compose.ui.g
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d final yh.l<? super n, b2> consumer) {
        f0.p(nVar, "<this>");
        f0.p(consumer, "consumer");
        return nVar.s0(new f(consumer, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.ui.modifier.ModifierLocalConsumerKt$modifierLocalConsumer$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("modifierLocalConsumer");
                x0Var.getProperties().c("consumer", consumer);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }
}
