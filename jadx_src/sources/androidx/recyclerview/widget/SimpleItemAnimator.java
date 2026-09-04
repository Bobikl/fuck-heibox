package androidx.recyclerview.widget;

import android.view.View;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class SimpleItemAnimator extends RecyclerView.ItemAnimator {
    private static final boolean DEBUG = false;
    private static final String TAG = "SimpleItemAnimator";
    boolean mSupportsChangeAnimations = true;

    public abstract boolean animateAdd(RecyclerView.ViewHolder viewHolder);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateAppearance(@n0 RecyclerView.ViewHolder viewHolder, @p0 RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @n0 RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i10;
        int i11;
        return (itemHolderInfo == null || ((i10 = itemHolderInfo.left) == (i11 = itemHolderInfo2.left) && itemHolderInfo.top == itemHolderInfo2.top)) ? animateAdd(viewHolder) : animateMove(viewHolder, i10, itemHolderInfo.top, i11, itemHolderInfo2.top);
    }

    public abstract boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i10, int i11, int i12, int i13);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateChange(@n0 RecyclerView.ViewHolder viewHolder, @n0 RecyclerView.ViewHolder viewHolder2, @n0 RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @n0 RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i10;
        int i11;
        int i12 = itemHolderInfo.left;
        int i13 = itemHolderInfo.top;
        if (viewHolder2.shouldIgnore()) {
            int i14 = itemHolderInfo.left;
            i11 = itemHolderInfo.top;
            i10 = i14;
        } else {
            i10 = itemHolderInfo2.left;
            i11 = itemHolderInfo2.top;
        }
        return animateChange(viewHolder, viewHolder2, i12, i13, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateDisappearance(@n0 RecyclerView.ViewHolder viewHolder, @n0 RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @p0 RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i10 = itemHolderInfo.left;
        int i11 = itemHolderInfo.top;
        View view = viewHolder.itemView;
        int left = itemHolderInfo2 == null ? view.getLeft() : itemHolderInfo2.left;
        int top = itemHolderInfo2 == null ? view.getTop() : itemHolderInfo2.top;
        if (viewHolder.isRemoved() || (i10 == left && i11 == top)) {
            return animateRemove(viewHolder);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return animateMove(viewHolder, i10, i11, left, top);
    }

    public abstract boolean animateMove(RecyclerView.ViewHolder viewHolder, int i10, int i11, int i12, int i13);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animatePersistence(@n0 RecyclerView.ViewHolder viewHolder, @n0 RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @n0 RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i10 = itemHolderInfo.left;
        int i11 = itemHolderInfo2.left;
        if (i10 != i11 || itemHolderInfo.top != itemHolderInfo2.top) {
            return animateMove(viewHolder, i10, itemHolderInfo.top, i11, itemHolderInfo2.top);
        }
        dispatchMoveFinished(viewHolder);
        return false;
    }

    public abstract boolean animateRemove(RecyclerView.ViewHolder viewHolder);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(@n0 RecyclerView.ViewHolder viewHolder) {
        return !this.mSupportsChangeAnimations || viewHolder.isInvalid();
    }

    public final void dispatchAddFinished(RecyclerView.ViewHolder viewHolder) {
        onAddFinished(viewHolder);
        dispatchAnimationFinished(viewHolder);
    }

    public final void dispatchAddStarting(RecyclerView.ViewHolder viewHolder) {
        onAddStarting(viewHolder);
    }

    public final void dispatchChangeFinished(RecyclerView.ViewHolder viewHolder, boolean z10) {
        onChangeFinished(viewHolder, z10);
        dispatchAnimationFinished(viewHolder);
    }

    public final void dispatchChangeStarting(RecyclerView.ViewHolder viewHolder, boolean z10) {
        onChangeStarting(viewHolder, z10);
    }

    public final void dispatchMoveFinished(RecyclerView.ViewHolder viewHolder) {
        onMoveFinished(viewHolder);
        dispatchAnimationFinished(viewHolder);
    }

    public final void dispatchMoveStarting(RecyclerView.ViewHolder viewHolder) {
        onMoveStarting(viewHolder);
    }

    public final void dispatchRemoveFinished(RecyclerView.ViewHolder viewHolder) {
        onRemoveFinished(viewHolder);
        dispatchAnimationFinished(viewHolder);
    }

    public final void dispatchRemoveStarting(RecyclerView.ViewHolder viewHolder) {
        onRemoveStarting(viewHolder);
    }

    public boolean getSupportsChangeAnimations() {
        return this.mSupportsChangeAnimations;
    }

    public void onAddFinished(RecyclerView.ViewHolder viewHolder) {
    }

    public void onAddStarting(RecyclerView.ViewHolder viewHolder) {
    }

    public void onChangeFinished(RecyclerView.ViewHolder viewHolder, boolean z10) {
    }

    public void onChangeStarting(RecyclerView.ViewHolder viewHolder, boolean z10) {
    }

    public void onMoveFinished(RecyclerView.ViewHolder viewHolder) {
    }

    public void onMoveStarting(RecyclerView.ViewHolder viewHolder) {
    }

    public void onRemoveFinished(RecyclerView.ViewHolder viewHolder) {
    }

    public void onRemoveStarting(RecyclerView.ViewHolder viewHolder) {
    }

    public void setSupportsChangeAnimations(boolean z10) {
        this.mSupportsChangeAnimations = z10;
    }
}
