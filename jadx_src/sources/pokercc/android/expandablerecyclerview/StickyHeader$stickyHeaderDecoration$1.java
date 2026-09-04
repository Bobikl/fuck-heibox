package pokercc.android.expandablerecyclerview;

import android.view.View;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.f0;
import yh.p;

/* JADX INFO: compiled from: StickyHeader.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "p1", "", "p2", "Lkotlin/b2;", "i", "(Landroid/view/View;F)V"}, k = 3, mv = {1, 4, 1})
public final /* synthetic */ class StickyHeader$stickyHeaderDecoration$1 extends FunctionReferenceImpl implements p<View, Float, b2> {
    StickyHeader$stickyHeaderDecoration$1(StickyHeader stickyHeader) {
        super(2, stickyHeader, StickyHeader.class, "onShowHeader", "onShowHeader(Landroid/view/View;F)V", 0);
    }

    public final void i(@dl.d View p10, float f10) {
        f0.p(p10, "p1");
        ((StickyHeader) this.receiver).b(p10, f10);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ b2 invoke(View view, Float f10) {
        i(view, f10.floatValue());
        return b2.f124493a;
    }
}
