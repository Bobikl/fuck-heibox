package androidx.compose.ui.platform;

import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: TestTag.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/n;", "", "tag", ak.av, "ui_release"}, k = 2, mv = {1, 7, 1})
public final class TestTagKt {
    @androidx.compose.runtime.j2
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d final String tag) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(tag, "tag");
        return SemanticsModifierKt.c(nVar, false, new yh.l<androidx.compose.ui.semantics.r, kotlin.b2>() { // from class: androidx.compose.ui.platform.TestTagKt$testTag$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.semantics.r semantics) {
                kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                SemanticsPropertiesKt.u0(semantics, tag);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.semantics.r rVar) {
                a(rVar);
                return kotlin.b2.f124493a;
            }
        }, 1, null);
    }
}
