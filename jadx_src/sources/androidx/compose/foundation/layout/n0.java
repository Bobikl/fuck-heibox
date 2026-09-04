package androidx.compose.foundation.layout;

import androidx.compose.runtime.j2;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: WindowInsetsPadding.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/layout/n0;", "Landroidx/compose/foundation/layout/x;", "Landroidx/compose/foundation/layout/h1;", "modifierLocalInsets", "f", "", "other", "", "equals", "", "hashCode", "Landroidx/compose/foundation/layout/m0;", "Landroidx/compose/foundation/layout/m0;", "paddingValues", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "Lkotlin/t;", "inspectorInfo", "<init>", "(Landroidx/compose/foundation/layout/m0;Lyh/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class n0 extends x {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m0 paddingValues;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(@dl.d m0 paddingValues, @dl.d yh.l<? super androidx.compose.ui.platform.x0, b2> inspectorInfo) {
        super(inspectorInfo, null);
        kotlin.jvm.internal.f0.p(paddingValues, "paddingValues");
        kotlin.jvm.internal.f0.p(inspectorInfo, "inspectorInfo");
        this.paddingValues = paddingValues;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof n0) {
            return kotlin.jvm.internal.f0.g(((n0) other).paddingValues, this.paddingValues);
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.x
    @dl.d
    public h1 f(@dl.d h1 modifierLocalInsets) {
        kotlin.jvm.internal.f0.p(modifierLocalInsets, "modifierLocalInsets");
        return i1.e(i1.f(this.paddingValues), modifierLocalInsets);
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }
}
