package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import com.umeng.analytics.pro.ak;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidViewsHandler.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J0\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0014J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0017J\u001e\u0010\f\u001a\u0004\u0018\u00010\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0016\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019J\u0012\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0017J\b\u0010 \u001a\u00020\u0007H\u0016R3\u0010'\u001a\u001e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\"0!j\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\"`#8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R3\u0010*\u001a\u001e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00170!j\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0017`#8\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&¨\u0006/"}, d2 = {"Landroidx/compose/ui/platform/AndroidViewsHandler;", "Landroid/view/ViewGroup;", "", "widthMeasureSpec", "heightMeasureSpec", "Lkotlin/b2;", "onMeasure", "", "changed", "l", "t", "r", "b", "onLayout", "Landroid/view/View;", "child", "target", "onDescendantInvalidated", "", "location", "Landroid/graphics/Rect;", "dirty", "", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", sd.b.f139384b, "Landroid/graphics/Canvas;", "canvas", ak.av, "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "requestLayout", "shouldDelayChildPressedState", "Ljava/util/HashMap;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "getHolderToLayoutNode", "()Ljava/util/HashMap;", "holderToLayoutNode", ak.aF, "getLayoutNodeToHolder", "layoutNodeToHolder", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "<init>", "(Landroid/content/Context;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class AndroidViewsHandler extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final HashMap<AndroidViewHolder, LayoutNode> holderToLayoutNode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final HashMap<LayoutNode, AndroidViewHolder> layoutNodeToHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewsHandler(@dl.d Context context) {
        super(context);
        kotlin.jvm.internal.f0.p(context, "context");
        setClipChildren(false);
        this.holderToLayoutNode = new HashMap<>();
        this.layoutNodeToHolder = new HashMap<>();
    }

    public final void a(@dl.d AndroidViewHolder view, @dl.d Canvas canvas) {
        kotlin.jvm.internal.f0.p(view, "view");
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        view.draw(canvas);
    }

    @dl.e
    public Void b(@dl.e int[] location, @dl.e Rect dirty) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@dl.e MotionEvent ev) {
        return true;
    }

    @dl.d
    public final HashMap<AndroidViewHolder, LayoutNode> getHolderToLayoutNode() {
        return this.holderToLayoutNode;
    }

    @dl.d
    public final HashMap<LayoutNode, AndroidViewHolder> getLayoutNodeToHolder() {
        return this.layoutNodeToHolder;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return (ViewParent) b(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void onDescendantInvalidated(@dl.d View child, @dl.d View target) {
        kotlin.jvm.internal.f0.p(child, "child");
        kotlin.jvm.internal.f0.p(target, "target");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Set<AndroidViewHolder> setKeySet = this.holderToLayoutNode.keySet();
        kotlin.jvm.internal.f0.o(setKeySet, "holderToLayoutNode.keys");
        for (AndroidViewHolder androidViewHolder : setKeySet) {
            androidViewHolder.layout(androidViewHolder.getLeft(), androidViewHolder.getTop(), androidViewHolder.getRight(), androidViewHolder.getBottom());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (!(View.MeasureSpec.getMode(i10) == 1073741824)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(View.MeasureSpec.getMode(i11) == 1073741824)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        Set<AndroidViewHolder> setKeySet = this.holderToLayoutNode.keySet();
        kotlin.jvm.internal.f0.o(setKeySet, "holderToLayoutNode.keys");
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            ((AndroidViewHolder) it.next()).h();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            LayoutNode layoutNode = this.holderToLayoutNode.get(childAt);
            if (childAt.isLayoutRequested() && layoutNode != null) {
                LayoutNode.q1(layoutNode, false, 1, null);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
