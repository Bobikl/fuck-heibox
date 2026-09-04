package pokercc.android.expandablerecyclerview;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.k;
import kotlin.s0;
import xh.i;

/* JADX INFO: compiled from: StickyHeaderRecyclerViewContainer.kt */
/* JADX INFO: loaded from: classes5.dex */
@k(message = "Name too long", replaceWith = @s0(expression = "StickyHeader", imports = {}))
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lpokercc/android/expandablerecyclerview/StickyHeaderRecyclerViewContainer;", "Lpokercc/android/expandablerecyclerview/StickyHeader;", com.umeng.analytics.pro.d.R, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "expandableRecyclerView_release"}, k = 1, mv = {1, 4, 1})
public final class StickyHeaderRecyclerViewContainer extends StickyHeader {
    @i
    public StickyHeaderRecyclerViewContainer(@dl.d Context context) {
        this(context, null, 0, 6, null);
    }

    @i
    public StickyHeaderRecyclerViewContainer(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public StickyHeaderRecyclerViewContainer(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
    }

    public /* synthetic */ StickyHeaderRecyclerViewContainer(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
