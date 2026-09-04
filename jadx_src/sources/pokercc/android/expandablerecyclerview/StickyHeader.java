package pokercc.android.expandablerecyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.i;

/* JADX INFO: compiled from: StickyHeader.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lpokercc/android/expandablerecyclerview/StickyHeader;", "Landroid/widget/FrameLayout;", "Landroid/view/View;", "header", "", "y", "Lkotlin/b2;", "b", "child", "onViewAdded", "onViewRemoved", "Lpokercc/android/expandablerecyclerview/d;", "Lpokercc/android/expandablerecyclerview/d;", "stickyHeaderDecoration", ak.aF, "Landroid/view/View;", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "expandableRecyclerView_release"}, k = 1, mv = {1, 4, 1})
public class StickyHeader extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d stickyHeaderDecoration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private View header;

    @i
    public StickyHeader(@dl.d Context context) {
        this(context, null, 0, 6, null);
    }

    @i
    public StickyHeader(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public StickyHeader(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.stickyHeaderDecoration = new d(new StickyHeader$stickyHeaderDecoration$1(this));
    }

    public /* synthetic */ StickyHeader(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(View view, float f10) {
        if (f0.g(this.header, view)) {
            View view2 = this.header;
            if (view2 != null) {
                view2.setY(f10);
                return;
            }
            return;
        }
        View view3 = this.header;
        if (view3 != null) {
            removeView(view3);
        }
        this.header = view;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams != null ? new FrameLayout.LayoutParams(layoutParams) : new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 48;
        addView(view, layoutParams2);
        View view4 = this.header;
        if (view4 != null) {
            view4.setY(f10);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(@dl.d View child) {
        f0.p(child, "child");
        super.onViewAdded(child);
        if (child instanceof ExpandableRecyclerView) {
            ExpandableRecyclerView expandableRecyclerView = (ExpandableRecyclerView) child;
            expandableRecyclerView.addItemDecoration(this.stickyHeaderDecoration);
            expandableRecyclerView.getAdapter();
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(@dl.d View child) {
        f0.p(child, "child");
        super.onViewRemoved(child);
        if (child instanceof ExpandableRecyclerView) {
            ((ExpandableRecyclerView) child).removeItemDecoration(this.stickyHeaderDecoration);
        }
    }
}
