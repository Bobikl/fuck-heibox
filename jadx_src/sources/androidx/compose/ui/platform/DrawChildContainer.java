package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.R;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ViewLayerContainer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0014J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0014J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J\b\u0010\u0011\u001a\u00020\u0004H\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/platform/DrawChildContainer;", "Landroid/view/ViewGroup;", "", "changed", "", "l", "t", "r", "b", "Lkotlin/b2;", "onLayout", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "getChildCount", "Landroidx/compose/ui/graphics/d0;", "Landroid/view/View;", sd.b.f139384b, "", "drawingTime", ak.av, "(Landroidx/compose/ui/graphics/d0;Landroid/view/View;J)V", "Z", "isDrawing", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "<init>", "(Landroid/content/Context;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public class DrawChildContainer extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isDrawing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawChildContainer(@dl.d Context context) {
        super(context);
        kotlin.jvm.internal.f0.p(context, "context");
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(@dl.d androidx.compose.ui.graphics.d0 canvas, @dl.d View view, long drawingTime) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        kotlin.jvm.internal.f0.p(view, "view");
        super.drawChild(androidx.compose.ui.graphics.c.d(canvas), view, drawingTime);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@dl.d Canvas canvas) {
        boolean z10;
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        int childCount = super.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                z10 = false;
                break;
            }
            View childAt = getChildAt(i10);
            kotlin.jvm.internal.f0.n(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((ViewLayer) childAt).getIsInvalidated()) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            this.isDrawing = true;
            try {
                super.dispatchDraw(canvas);
            } finally {
                this.isDrawing = false;
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.isDrawing) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }
}
