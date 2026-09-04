package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.view.m;
import androidx.recyclerview.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ItemTouchHelper extends RecyclerView.ItemDecoration implements RecyclerView.OnChildAttachStateChangeListener {
    static final int ACTION_MODE_DRAG_MASK = 16711680;
    private static final int ACTION_MODE_IDLE_MASK = 255;
    static final int ACTION_MODE_SWIPE_MASK = 65280;
    public static final int ACTION_STATE_DRAG = 2;
    public static final int ACTION_STATE_IDLE = 0;
    public static final int ACTION_STATE_SWIPE = 1;
    private static final int ACTIVE_POINTER_ID_NONE = -1;
    public static final int ANIMATION_TYPE_DRAG = 8;
    public static final int ANIMATION_TYPE_SWIPE_CANCEL = 4;
    public static final int ANIMATION_TYPE_SWIPE_SUCCESS = 2;
    private static final boolean DEBUG = false;
    static final int DIRECTION_FLAG_COUNT = 8;
    public static final int DOWN = 2;
    public static final int END = 32;
    public static final int LEFT = 4;
    private static final int PIXELS_PER_SECOND = 1000;
    public static final int RIGHT = 8;
    public static final int START = 16;
    private static final String TAG = "ItemTouchHelper";
    public static final int UP = 1;

    @n0
    Callback mCallback;
    private List<Integer> mDistances;
    private long mDragScrollStartTimeInMs;
    float mDx;
    float mDy;
    m mGestureDetector;
    float mInitialTouchX;
    float mInitialTouchY;
    private ItemTouchHelperGestureListener mItemTouchHelperGestureListener;
    private float mMaxSwipeVelocity;
    RecyclerView mRecyclerView;
    int mSelectedFlags;
    private float mSelectedStartX;
    private float mSelectedStartY;
    private int mSlop;
    private List<RecyclerView.ViewHolder> mSwapTargets;
    private float mSwipeEscapeVelocity;
    private Rect mTmpRect;
    VelocityTracker mVelocityTracker;
    final List<View> mPendingCleanup = new ArrayList();
    private final float[] mTmpPosition = new float[2];
    RecyclerView.ViewHolder mSelected = null;
    int mActivePointerId = -1;
    private int mActionState = 0;

    @j1
    List<RecoverAnimation> mRecoverAnimations = new ArrayList();
    final Runnable mScrollRunnable = new Runnable() { // from class: androidx.recyclerview.widget.ItemTouchHelper.1
        @Override // java.lang.Runnable
        public void run() {
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            if (itemTouchHelper.mSelected == null || !itemTouchHelper.scrollIfNecessary()) {
                return;
            }
            ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
            RecyclerView.ViewHolder viewHolder = itemTouchHelper2.mSelected;
            if (viewHolder != null) {
                itemTouchHelper2.moveIfNecessary(viewHolder);
            }
            ItemTouchHelper itemTouchHelper3 = ItemTouchHelper.this;
            itemTouchHelper3.mRecyclerView.removeCallbacks(itemTouchHelper3.mScrollRunnable);
            androidx.core.view.j1.p1(ItemTouchHelper.this.mRecyclerView, this);
        }
    };
    private RecyclerView.ChildDrawingOrderCallback mChildDrawingOrderCallback = null;
    View mOverdrawChild = null;
    int mOverdrawChildPosition = -1;
    private final RecyclerView.OnItemTouchListener mOnItemTouchListener = new RecyclerView.OnItemTouchListener() { // from class: androidx.recyclerview.widget.ItemTouchHelper.2
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(@n0 RecyclerView recyclerView, @n0 MotionEvent motionEvent) {
            int iFindPointerIndex;
            RecoverAnimation recoverAnimationFindAnimation;
            ItemTouchHelper.this.mGestureDetector.b(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                ItemTouchHelper.this.mActivePointerId = motionEvent.getPointerId(0);
                ItemTouchHelper.this.mInitialTouchX = motionEvent.getX();
                ItemTouchHelper.this.mInitialTouchY = motionEvent.getY();
                ItemTouchHelper.this.obtainVelocityTracker();
                ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                if (itemTouchHelper.mSelected == null && (recoverAnimationFindAnimation = itemTouchHelper.findAnimation(motionEvent)) != null) {
                    ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                    itemTouchHelper2.mInitialTouchX -= recoverAnimationFindAnimation.mX;
                    itemTouchHelper2.mInitialTouchY -= recoverAnimationFindAnimation.mY;
                    itemTouchHelper2.endRecoverAnimation(recoverAnimationFindAnimation.mViewHolder, true);
                    if (ItemTouchHelper.this.mPendingCleanup.remove(recoverAnimationFindAnimation.mViewHolder.itemView)) {
                        ItemTouchHelper itemTouchHelper3 = ItemTouchHelper.this;
                        itemTouchHelper3.mCallback.clearView(itemTouchHelper3.mRecyclerView, recoverAnimationFindAnimation.mViewHolder);
                    }
                    ItemTouchHelper.this.select(recoverAnimationFindAnimation.mViewHolder, recoverAnimationFindAnimation.mActionState);
                    ItemTouchHelper itemTouchHelper4 = ItemTouchHelper.this;
                    itemTouchHelper4.updateDxDy(motionEvent, itemTouchHelper4.mSelectedFlags, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                ItemTouchHelper itemTouchHelper5 = ItemTouchHelper.this;
                itemTouchHelper5.mActivePointerId = -1;
                itemTouchHelper5.select(null, 0);
            } else {
                int i10 = ItemTouchHelper.this.mActivePointerId;
                if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                    ItemTouchHelper.this.checkSelectForSwipe(actionMasked, motionEvent, iFindPointerIndex);
                }
            }
            VelocityTracker velocityTracker = ItemTouchHelper.this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return ItemTouchHelper.this.mSelected != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z10) {
            if (z10) {
                ItemTouchHelper.this.select(null, 0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(@n0 RecyclerView recyclerView, @n0 MotionEvent motionEvent) {
            ItemTouchHelper.this.mGestureDetector.b(motionEvent);
            VelocityTracker velocityTracker = ItemTouchHelper.this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (ItemTouchHelper.this.mActivePointerId == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(ItemTouchHelper.this.mActivePointerId);
            if (iFindPointerIndex >= 0) {
                ItemTouchHelper.this.checkSelectForSwipe(actionMasked, motionEvent, iFindPointerIndex);
            }
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            RecyclerView.ViewHolder viewHolder = itemTouchHelper.mSelected;
            if (viewHolder == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        itemTouchHelper.updateDxDy(motionEvent, itemTouchHelper.mSelectedFlags, iFindPointerIndex);
                        ItemTouchHelper.this.moveIfNecessary(viewHolder);
                        ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                        itemTouchHelper2.mRecyclerView.removeCallbacks(itemTouchHelper2.mScrollRunnable);
                        ItemTouchHelper.this.mScrollRunnable.run();
                        ItemTouchHelper.this.mRecyclerView.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    ItemTouchHelper itemTouchHelper3 = ItemTouchHelper.this;
                    if (pointerId == itemTouchHelper3.mActivePointerId) {
                        itemTouchHelper3.mActivePointerId = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        ItemTouchHelper itemTouchHelper4 = ItemTouchHelper.this;
                        itemTouchHelper4.updateDxDy(motionEvent, itemTouchHelper4.mSelectedFlags, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = itemTouchHelper.mVelocityTracker;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            ItemTouchHelper.this.select(null, 0);
            ItemTouchHelper.this.mActivePointerId = -1;
        }
    };

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ItemTouchHelper$5, reason: invalid class name */
    public class AnonymousClass5 implements RecyclerView.ChildDrawingOrderCallback {
        AnonymousClass5() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback
        public int onGetChildDrawingOrder(int i10, int i11) {
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            View view = itemTouchHelper.mOverdrawChild;
            if (view == null) {
                return i11;
            }
            int iIndexOfChild = itemTouchHelper.mOverdrawChildPosition;
            if (iIndexOfChild == -1) {
                iIndexOfChild = itemTouchHelper.mRecyclerView.indexOfChild(view);
                ItemTouchHelper.this.mOverdrawChildPosition = iIndexOfChild;
            }
            if (i11 == i10 - 1) {
                return iIndexOfChild;
            }
            return i11 < iIndexOfChild ? i11 : i11 + 1;
        }
    }

    public static abstract class Callback {
        private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
        static final int RELATIVE_DIR_FLAGS = 3158064;
        private static final Interpolator sDragScrollInterpolator = new Interpolator() { // from class: androidx.recyclerview.widget.ItemTouchHelper.Callback.1
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f10) {
                return f10 * f10 * f10 * f10 * f10;
            }
        };
        private static final Interpolator sDragViewScrollCapInterpolator = new Interpolator() { // from class: androidx.recyclerview.widget.ItemTouchHelper.Callback.2
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f10) {
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            }
        };
        private int mCachedMaxScrollSpeed = -1;

        public static int convertToRelativeDirection(int i10, int i11) {
            int i12;
            int i13 = i10 & ABS_HORIZONTAL_DIR_FLAGS;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 << 2;
            } else {
                int i15 = i13 << 1;
                i14 |= (-789517) & i15;
                i12 = (i15 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
            }
            return i14 | i12;
        }

        @n0
        public static ItemTouchUIUtil getDefaultUIUtil() {
            return ItemTouchUIUtilImpl.INSTANCE;
        }

        private int getMaxDragScroll(RecyclerView recyclerView) {
            if (this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.mCachedMaxScrollSpeed;
        }

        public static int makeFlag(int i10, int i11) {
            return i11 << (i10 * 8);
        }

        public static int makeMovementFlags(int i10, int i11) {
            return makeFlag(2, i10) | makeFlag(1, i11) | makeFlag(0, i11 | i10);
        }

        public boolean canDropOver(@n0 RecyclerView recyclerView, @n0 RecyclerView.ViewHolder viewHolder, @n0 RecyclerView.ViewHolder viewHolder2) {
            return true;
        }

        public RecyclerView.ViewHolder chooseDropTarget(@n0 RecyclerView.ViewHolder viewHolder, @n0 List<RecyclerView.ViewHolder> list, int i10, int i11) {
            int bottom;
            int iAbs;
            int top;
            int iAbs2;
            int left;
            int iAbs3;
            int right;
            int iAbs4;
            int width = i10 + viewHolder.itemView.getWidth();
            int height = i11 + viewHolder.itemView.getHeight();
            int left2 = i10 - viewHolder.itemView.getLeft();
            int top2 = i11 - viewHolder.itemView.getTop();
            int size = list.size();
            RecyclerView.ViewHolder viewHolder2 = null;
            int i12 = -1;
            for (int i13 = 0; i13 < size; i13++) {
                RecyclerView.ViewHolder viewHolder3 = list.get(i13);
                if (left2 > 0 && (right = viewHolder3.itemView.getRight() - width) < 0 && viewHolder3.itemView.getRight() > viewHolder.itemView.getRight() && (iAbs4 = Math.abs(right)) > i12) {
                    viewHolder2 = viewHolder3;
                    i12 = iAbs4;
                }
                if (left2 < 0 && (left = viewHolder3.itemView.getLeft() - i10) > 0 && viewHolder3.itemView.getLeft() < viewHolder.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i12) {
                    viewHolder2 = viewHolder3;
                    i12 = iAbs3;
                }
                if (top2 < 0 && (top = viewHolder3.itemView.getTop() - i11) > 0 && viewHolder3.itemView.getTop() < viewHolder.itemView.getTop() && (iAbs2 = Math.abs(top)) > i12) {
                    viewHolder2 = viewHolder3;
                    i12 = iAbs2;
                }
                if (top2 > 0 && (bottom = viewHolder3.itemView.getBottom() - height) < 0 && viewHolder3.itemView.getBottom() > viewHolder.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i12) {
                    viewHolder2 = viewHolder3;
                    i12 = iAbs;
                }
            }
            return viewHolder2;
        }

        public void clearView(@n0 RecyclerView recyclerView, @n0 RecyclerView.ViewHolder viewHolder) {
            ItemTouchUIUtilImpl.INSTANCE.clearView(viewHolder.itemView);
        }

        public int convertToAbsoluteDirection(int i10, int i11) {
            int i12;
            int i13 = i10 & RELATIVE_DIR_FLAGS;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 >> 2;
            } else {
                int i15 = i13 >> 1;
                i14 |= (-3158065) & i15;
                i12 = (i15 & RELATIVE_DIR_FLAGS) >> 2;
            }
            return i14 | i12;
        }

        final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return convertToAbsoluteDirection(getMovementFlags(recyclerView, viewHolder), androidx.core.view.j1.Z(recyclerView));
        }

        public long getAnimationDuration(@n0 RecyclerView recyclerView, int i10, float f10, float f11) {
            RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i10 == 8 ? 200L : 250L;
            }
            return i10 == 8 ? itemAnimator.getMoveDuration() : itemAnimator.getRemoveDuration();
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(@n0 RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        public abstract int getMovementFlags(@n0 RecyclerView recyclerView, @n0 RecyclerView.ViewHolder viewHolder);

        public float getSwipeEscapeVelocity(float f10) {
            return f10;
        }

        public float getSwipeThreshold(@n0 RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        public float getSwipeVelocityThreshold(float f10) {
            return f10;
        }

        boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return (getAbsoluteMovementFlags(recyclerView, viewHolder) & ItemTouchHelper.ACTION_MODE_DRAG_MASK) != 0;
        }

        boolean hasSwipeFlag(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return (getAbsoluteMovementFlags(recyclerView, viewHolder) & 65280) != 0;
        }

        public int interpolateOutOfBoundsScroll(@n0 RecyclerView recyclerView, int i10, int i11, int i12, long j10) {
            int iSignum = (int) (((int) (((int) Math.signum(i11)) * getMaxDragScroll(recyclerView) * sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (Math.abs(i11) * 1.0f) / i10)))) * sDragScrollInterpolator.getInterpolation(j10 <= 2000 ? j10 / 2000.0f : 1.0f));
            if (iSignum == 0) {
                return i11 > 0 ? 1 : -1;
            }
            return iSignum;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public void onChildDraw(@n0 Canvas canvas, @n0 RecyclerView recyclerView, @n0 RecyclerView.ViewHolder viewHolder, float f10, float f11, int i10, boolean z10) {
            ItemTouchUIUtilImpl.INSTANCE.onDraw(canvas, recyclerView, viewHolder.itemView, f10, f11, i10, z10);
        }

        public void onChildDrawOver(@n0 Canvas canvas, @n0 RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f10, float f11, int i10, boolean z10) {
            ItemTouchUIUtilImpl.INSTANCE.onDrawOver(canvas, recyclerView, viewHolder.itemView, f10, f11, i10, z10);
        }

        void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<RecoverAnimation> list, int i10, float f10, float f11) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                RecoverAnimation recoverAnimation = list.get(i11);
                recoverAnimation.update();
                int iSave = canvas.save();
                onChildDraw(canvas, recyclerView, recoverAnimation.mViewHolder, recoverAnimation.mX, recoverAnimation.mY, recoverAnimation.mActionState, false);
                canvas.restoreToCount(iSave);
            }
            if (viewHolder != null) {
                int iSave2 = canvas.save();
                onChildDraw(canvas, recyclerView, viewHolder, f10, f11, i10, true);
                canvas.restoreToCount(iSave2);
            }
        }

        void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<RecoverAnimation> list, int i10, float f10, float f11) {
            int size = list.size();
            boolean z10 = false;
            for (int i11 = 0; i11 < size; i11++) {
                RecoverAnimation recoverAnimation = list.get(i11);
                int iSave = canvas.save();
                onChildDrawOver(canvas, recyclerView, recoverAnimation.mViewHolder, recoverAnimation.mX, recoverAnimation.mY, recoverAnimation.mActionState, false);
                canvas.restoreToCount(iSave);
            }
            if (viewHolder != null) {
                int iSave2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, viewHolder, f10, f11, i10, true);
                canvas.restoreToCount(iSave2);
            }
            for (int i12 = size - 1; i12 >= 0; i12--) {
                RecoverAnimation recoverAnimation2 = list.get(i12);
                boolean z11 = recoverAnimation2.mEnded;
                if (z11 && !recoverAnimation2.mIsPendingCleanup) {
                    list.remove(i12);
                } else if (!z11) {
                    z10 = true;
                }
            }
            if (z10) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean onMove(@n0 RecyclerView recyclerView, @n0 RecyclerView.ViewHolder viewHolder, @n0 RecyclerView.ViewHolder viewHolder2);

        /* JADX WARN: Multi-variable type inference failed */
        public void onMoved(@n0 RecyclerView recyclerView, @n0 RecyclerView.ViewHolder viewHolder, int i10, @n0 RecyclerView.ViewHolder viewHolder2, int i11, int i12, int i13) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof ViewDropHandler) {
                ((ViewDropHandler) layoutManager).prepareForDrop(viewHolder.itemView, viewHolder2.itemView, i12, i13);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(viewHolder2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i11);
                }
                if (layoutManager.getDecoratedRight(viewHolder2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i11);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(viewHolder2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i11);
                }
                if (layoutManager.getDecoratedBottom(viewHolder2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i11);
                }
            }
        }

        public void onSelectedChanged(@p0 RecyclerView.ViewHolder viewHolder, int i10) {
            if (viewHolder != null) {
                ItemTouchUIUtilImpl.INSTANCE.onSelected(viewHolder.itemView);
            }
        }

        public abstract void onSwiped(@n0 RecyclerView.ViewHolder viewHolder, int i10);
    }

    public class ItemTouchHelperGestureListener extends GestureDetector.SimpleOnGestureListener {
        private boolean mShouldReactToLongPress = true;

        ItemTouchHelperGestureListener() {
        }

        void doNotReactToLongPress() {
            this.mShouldReactToLongPress = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View viewFindChildView;
            RecyclerView.ViewHolder childViewHolder;
            if (!this.mShouldReactToLongPress || (viewFindChildView = ItemTouchHelper.this.findChildView(motionEvent)) == null || (childViewHolder = ItemTouchHelper.this.mRecyclerView.getChildViewHolder(viewFindChildView)) == null) {
                return;
            }
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            if (itemTouchHelper.mCallback.hasDragFlag(itemTouchHelper.mRecyclerView, childViewHolder)) {
                int pointerId = motionEvent.getPointerId(0);
                int i10 = ItemTouchHelper.this.mActivePointerId;
                if (pointerId == i10) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                    float x10 = motionEvent.getX(iFindPointerIndex);
                    float y10 = motionEvent.getY(iFindPointerIndex);
                    ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                    itemTouchHelper2.mInitialTouchX = x10;
                    itemTouchHelper2.mInitialTouchY = y10;
                    itemTouchHelper2.mDy = 0.0f;
                    itemTouchHelper2.mDx = 0.0f;
                    if (itemTouchHelper2.mCallback.isLongPressDragEnabled()) {
                        ItemTouchHelper.this.select(childViewHolder, 2);
                    }
                }
            }
        }
    }

    @j1
    public static class RecoverAnimation implements Animator.AnimatorListener {
        final int mActionState;
        final int mAnimationType;
        private float mFraction;
        boolean mIsPendingCleanup;
        final float mStartDx;
        final float mStartDy;
        final float mTargetX;
        final float mTargetY;

        @j1
        final ValueAnimator mValueAnimator;
        final RecyclerView.ViewHolder mViewHolder;
        float mX;
        float mY;
        boolean mOverridden = false;
        boolean mEnded = false;

        RecoverAnimation(RecyclerView.ViewHolder viewHolder, int i10, int i11, float f10, float f11, float f12, float f13) {
            this.mActionState = i11;
            this.mAnimationType = i10;
            this.mViewHolder = viewHolder;
            this.mStartDx = f10;
            this.mStartDy = f11;
            this.mTargetX = f12;
            this.mTargetY = f13;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.mValueAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    RecoverAnimation.this.setFraction(valueAnimator.getAnimatedFraction());
                }
            });
            valueAnimatorOfFloat.setTarget(viewHolder.itemView);
            valueAnimatorOfFloat.addListener(this);
            setFraction(0.0f);
        }

        public void cancel() {
            this.mValueAnimator.cancel();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            setFraction(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.mEnded) {
                this.mViewHolder.setIsRecyclable(true);
            }
            this.mEnded = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public void setDuration(long j10) {
            this.mValueAnimator.setDuration(j10);
        }

        public void setFraction(float f10) {
            this.mFraction = f10;
        }

        public void start() {
            this.mViewHolder.setIsRecyclable(false);
            this.mValueAnimator.start();
        }

        public void update() {
            float f10 = this.mStartDx;
            float f11 = this.mTargetX;
            if (f10 == f11) {
                this.mX = this.mViewHolder.itemView.getTranslationX();
            } else {
                this.mX = f10 + (this.mFraction * (f11 - f10));
            }
            float f12 = this.mStartDy;
            float f13 = this.mTargetY;
            if (f12 == f13) {
                this.mY = this.mViewHolder.itemView.getTranslationY();
            } else {
                this.mY = f12 + (this.mFraction * (f13 - f12));
            }
        }
    }

    public static abstract class SimpleCallback extends Callback {
        private int mDefaultDragDirs;
        private int mDefaultSwipeDirs;

        public SimpleCallback(int i10, int i11) {
            this.mDefaultSwipeDirs = i11;
            this.mDefaultDragDirs = i10;
        }

        public int getDragDirs(@n0 RecyclerView recyclerView, @n0 RecyclerView.ViewHolder viewHolder) {
            return this.mDefaultDragDirs;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(@n0 RecyclerView recyclerView, @n0 RecyclerView.ViewHolder viewHolder) {
            return Callback.makeMovementFlags(getDragDirs(recyclerView, viewHolder), getSwipeDirs(recyclerView, viewHolder));
        }

        public int getSwipeDirs(@n0 RecyclerView recyclerView, @n0 RecyclerView.ViewHolder viewHolder) {
            return this.mDefaultSwipeDirs;
        }

        public void setDefaultDragDirs(int i10) {
            this.mDefaultDragDirs = i10;
        }

        public void setDefaultSwipeDirs(int i10) {
            this.mDefaultSwipeDirs = i10;
        }
    }

    public interface ViewDropHandler {
        void prepareForDrop(@n0 View view, @n0 View view2, int i10, int i11);
    }

    public ItemTouchHelper(@n0 Callback callback) {
        this.mCallback = callback;
    }

    private void addChildDrawingOrderCallback() {
    }

    private int checkHorizontalSwipe(RecyclerView.ViewHolder viewHolder, int i10) {
        if ((i10 & 12) == 0) {
            return 0;
        }
        int i11 = this.mDx > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null && this.mActivePointerId > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.mCallback.getSwipeVelocityThreshold(this.mMaxSwipeVelocity));
            float xVelocity = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
            float yVelocity = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
            int i12 = xVelocity <= 0.0f ? 4 : 8;
            float fAbs = Math.abs(xVelocity);
            if ((i12 & i10) != 0 && i11 == i12 && fAbs >= this.mCallback.getSwipeEscapeVelocity(this.mSwipeEscapeVelocity) && fAbs > Math.abs(yVelocity)) {
                return i12;
            }
        }
        float width = this.mRecyclerView.getWidth() * this.mCallback.getSwipeThreshold(viewHolder);
        if ((i10 & i11) == 0 || Math.abs(this.mDx) <= width) {
            return 0;
        }
        return i11;
    }

    private int checkVerticalSwipe(RecyclerView.ViewHolder viewHolder, int i10) {
        if ((i10 & 3) == 0) {
            return 0;
        }
        int i11 = this.mDy > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null && this.mActivePointerId > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.mCallback.getSwipeVelocityThreshold(this.mMaxSwipeVelocity));
            float xVelocity = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
            float yVelocity = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
            int i12 = yVelocity <= 0.0f ? 1 : 2;
            float fAbs = Math.abs(yVelocity);
            if ((i12 & i10) != 0 && i12 == i11 && fAbs >= this.mCallback.getSwipeEscapeVelocity(this.mSwipeEscapeVelocity) && fAbs > Math.abs(xVelocity)) {
                return i12;
            }
        }
        float height = this.mRecyclerView.getHeight() * this.mCallback.getSwipeThreshold(viewHolder);
        if ((i10 & i11) == 0 || Math.abs(this.mDy) <= height) {
            return 0;
        }
        return i11;
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeItemDecoration(this);
        this.mRecyclerView.removeOnItemTouchListener(this.mOnItemTouchListener);
        this.mRecyclerView.removeOnChildAttachStateChangeListener(this);
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            RecoverAnimation recoverAnimation = this.mRecoverAnimations.get(0);
            recoverAnimation.cancel();
            this.mCallback.clearView(this.mRecyclerView, recoverAnimation.mViewHolder);
        }
        this.mRecoverAnimations.clear();
        this.mOverdrawChild = null;
        this.mOverdrawChildPosition = -1;
        releaseVelocityTracker();
        stopGestureDetection();
    }

    private List<RecyclerView.ViewHolder> findSwapTargets(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        List<RecyclerView.ViewHolder> list = this.mSwapTargets;
        if (list == null) {
            this.mSwapTargets = new ArrayList();
            this.mDistances = new ArrayList();
        } else {
            list.clear();
            this.mDistances.clear();
        }
        int boundingBoxMargin = this.mCallback.getBoundingBoxMargin();
        int iRound = Math.round(this.mSelectedStartX + this.mDx) - boundingBoxMargin;
        int iRound2 = Math.round(this.mSelectedStartY + this.mDy) - boundingBoxMargin;
        int i10 = boundingBoxMargin * 2;
        int width = viewHolder2.itemView.getWidth() + iRound + i10;
        int height = viewHolder2.itemView.getHeight() + iRound2 + i10;
        int i11 = (iRound + width) / 2;
        int i12 = (iRound2 + height) / 2;
        RecyclerView.LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = layoutManager.getChildAt(i13);
            if (childAt != viewHolder2.itemView && childAt.getBottom() >= iRound2 && childAt.getTop() <= height && childAt.getRight() >= iRound && childAt.getLeft() <= width) {
                RecyclerView.ViewHolder childViewHolder = this.mRecyclerView.getChildViewHolder(childAt);
                if (this.mCallback.canDropOver(this.mRecyclerView, this.mSelected, childViewHolder)) {
                    int iAbs = Math.abs(i11 - ((childAt.getLeft() + childAt.getRight()) / 2));
                    int iAbs2 = Math.abs(i12 - ((childAt.getTop() + childAt.getBottom()) / 2));
                    int i14 = (iAbs * iAbs) + (iAbs2 * iAbs2);
                    int size = this.mSwapTargets.size();
                    int i15 = 0;
                    for (int i16 = 0; i16 < size && i14 > this.mDistances.get(i16).intValue(); i16++) {
                        i15++;
                    }
                    this.mSwapTargets.add(i15, childViewHolder);
                    this.mDistances.add(i15, Integer.valueOf(i14));
                }
            }
            i13++;
            viewHolder2 = viewHolder;
        }
        return this.mSwapTargets;
    }

    private RecyclerView.ViewHolder findSwipedView(MotionEvent motionEvent) {
        View viewFindChildView;
        RecyclerView.LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        int i10 = this.mActivePointerId;
        if (i10 == -1) {
            return null;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
        float x10 = motionEvent.getX(iFindPointerIndex) - this.mInitialTouchX;
        float y10 = motionEvent.getY(iFindPointerIndex) - this.mInitialTouchY;
        float fAbs = Math.abs(x10);
        float fAbs2 = Math.abs(y10);
        int i11 = this.mSlop;
        if (fAbs < i11 && fAbs2 < i11) {
            return null;
        }
        if (fAbs > fAbs2 && layoutManager.canScrollHorizontally()) {
            return null;
        }
        if ((fAbs2 <= fAbs || !layoutManager.canScrollVertically()) && (viewFindChildView = findChildView(motionEvent)) != null) {
            return this.mRecyclerView.getChildViewHolder(viewFindChildView);
        }
        return null;
    }

    private void getSelectedDxDy(float[] fArr) {
        if ((this.mSelectedFlags & 12) != 0) {
            fArr[0] = (this.mSelectedStartX + this.mDx) - this.mSelected.itemView.getLeft();
        } else {
            fArr[0] = this.mSelected.itemView.getTranslationX();
        }
        if ((this.mSelectedFlags & 3) != 0) {
            fArr[1] = (this.mSelectedStartY + this.mDy) - this.mSelected.itemView.getTop();
        } else {
            fArr[1] = this.mSelected.itemView.getTranslationY();
        }
    }

    private static boolean hitTest(View view, float f10, float f11, float f12, float f13) {
        return f10 >= f12 && f10 <= f12 + ((float) view.getWidth()) && f11 >= f13 && f11 <= f13 + ((float) view.getHeight());
    }

    private void releaseVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private void setupCallbacks() {
        this.mSlop = ViewConfiguration.get(this.mRecyclerView.getContext()).getScaledTouchSlop();
        this.mRecyclerView.addItemDecoration(this);
        this.mRecyclerView.addOnItemTouchListener(this.mOnItemTouchListener);
        this.mRecyclerView.addOnChildAttachStateChangeListener(this);
        startGestureDetection();
    }

    private void startGestureDetection() {
        this.mItemTouchHelperGestureListener = new ItemTouchHelperGestureListener();
        this.mGestureDetector = new m(this.mRecyclerView.getContext(), this.mItemTouchHelperGestureListener);
    }

    private void stopGestureDetection() {
        ItemTouchHelperGestureListener itemTouchHelperGestureListener = this.mItemTouchHelperGestureListener;
        if (itemTouchHelperGestureListener != null) {
            itemTouchHelperGestureListener.doNotReactToLongPress();
            this.mItemTouchHelperGestureListener = null;
        }
        if (this.mGestureDetector != null) {
            this.mGestureDetector = null;
        }
    }

    private int swipeIfNecessary(RecyclerView.ViewHolder viewHolder) {
        if (this.mActionState == 2) {
            return 0;
        }
        int movementFlags = this.mCallback.getMovementFlags(this.mRecyclerView, viewHolder);
        int iConvertToAbsoluteDirection = (this.mCallback.convertToAbsoluteDirection(movementFlags, androidx.core.view.j1.Z(this.mRecyclerView)) & 65280) >> 8;
        if (iConvertToAbsoluteDirection == 0) {
            return 0;
        }
        int i10 = (movementFlags & 65280) >> 8;
        if (Math.abs(this.mDx) > Math.abs(this.mDy)) {
            int iCheckHorizontalSwipe = checkHorizontalSwipe(viewHolder, iConvertToAbsoluteDirection);
            if (iCheckHorizontalSwipe > 0) {
                return (i10 & iCheckHorizontalSwipe) == 0 ? Callback.convertToRelativeDirection(iCheckHorizontalSwipe, androidx.core.view.j1.Z(this.mRecyclerView)) : iCheckHorizontalSwipe;
            }
            int iCheckVerticalSwipe = checkVerticalSwipe(viewHolder, iConvertToAbsoluteDirection);
            if (iCheckVerticalSwipe > 0) {
                return iCheckVerticalSwipe;
            }
        } else {
            int iCheckVerticalSwipe2 = checkVerticalSwipe(viewHolder, iConvertToAbsoluteDirection);
            if (iCheckVerticalSwipe2 > 0) {
                return iCheckVerticalSwipe2;
            }
            int iCheckHorizontalSwipe2 = checkHorizontalSwipe(viewHolder, iConvertToAbsoluteDirection);
            if (iCheckHorizontalSwipe2 > 0) {
                return (i10 & iCheckHorizontalSwipe2) == 0 ? Callback.convertToRelativeDirection(iCheckHorizontalSwipe2, androidx.core.view.j1.Z(this.mRecyclerView)) : iCheckHorizontalSwipe2;
            }
        }
        return 0;
    }

    public void attachToRecyclerView(@p0 RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            destroyCallbacks();
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.mSwipeEscapeVelocity = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.mMaxSwipeVelocity = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            setupCallbacks();
        }
    }

    void checkSelectForSwipe(int i10, MotionEvent motionEvent, int i11) {
        RecyclerView.ViewHolder viewHolderFindSwipedView;
        int absoluteMovementFlags;
        if (this.mSelected != null || i10 != 2 || this.mActionState == 2 || !this.mCallback.isItemViewSwipeEnabled() || this.mRecyclerView.getScrollState() == 1 || (viewHolderFindSwipedView = findSwipedView(motionEvent)) == null || (absoluteMovementFlags = (this.mCallback.getAbsoluteMovementFlags(this.mRecyclerView, viewHolderFindSwipedView) & 65280) >> 8) == 0) {
            return;
        }
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x10 - this.mInitialTouchX;
        float f11 = y10 - this.mInitialTouchY;
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        int i12 = this.mSlop;
        if (fAbs >= i12 || fAbs2 >= i12) {
            if (fAbs > fAbs2) {
                if (f10 < 0.0f && (absoluteMovementFlags & 4) == 0) {
                    return;
                }
                if (f10 > 0.0f && (absoluteMovementFlags & 8) == 0) {
                    return;
                }
            } else {
                if (f11 < 0.0f && (absoluteMovementFlags & 1) == 0) {
                    return;
                }
                if (f11 > 0.0f && (absoluteMovementFlags & 2) == 0) {
                    return;
                }
            }
            this.mDy = 0.0f;
            this.mDx = 0.0f;
            this.mActivePointerId = motionEvent.getPointerId(0);
            select(viewHolderFindSwipedView, 1);
        }
    }

    void endRecoverAnimation(RecyclerView.ViewHolder viewHolder, boolean z10) {
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            RecoverAnimation recoverAnimation = this.mRecoverAnimations.get(size);
            if (recoverAnimation.mViewHolder == viewHolder) {
                recoverAnimation.mOverridden |= z10;
                if (!recoverAnimation.mEnded) {
                    recoverAnimation.cancel();
                }
                this.mRecoverAnimations.remove(size);
                return;
            }
        }
    }

    RecoverAnimation findAnimation(MotionEvent motionEvent) {
        if (this.mRecoverAnimations.isEmpty()) {
            return null;
        }
        View viewFindChildView = findChildView(motionEvent);
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            RecoverAnimation recoverAnimation = this.mRecoverAnimations.get(size);
            if (recoverAnimation.mViewHolder.itemView == viewFindChildView) {
                return recoverAnimation;
            }
        }
        return null;
    }

    View findChildView(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        RecyclerView.ViewHolder viewHolder = this.mSelected;
        if (viewHolder != null) {
            View view = viewHolder.itemView;
            if (hitTest(view, x10, y10, this.mSelectedStartX + this.mDx, this.mSelectedStartY + this.mDy)) {
                return view;
            }
        }
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            RecoverAnimation recoverAnimation = this.mRecoverAnimations.get(size);
            View view2 = recoverAnimation.mViewHolder.itemView;
            if (hitTest(view2, x10, y10, recoverAnimation.mX, recoverAnimation.mY)) {
                return view2;
            }
        }
        return this.mRecyclerView.findChildViewUnder(x10, y10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.setEmpty();
    }

    boolean hasRunningRecoverAnim() {
        int size = this.mRecoverAnimations.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.mRecoverAnimations.get(i10).mEnded) {
                return true;
            }
        }
        return false;
    }

    void moveIfNecessary(RecyclerView.ViewHolder viewHolder) {
        if (!this.mRecyclerView.isLayoutRequested() && this.mActionState == 2) {
            float moveThreshold = this.mCallback.getMoveThreshold(viewHolder);
            int i10 = (int) (this.mSelectedStartX + this.mDx);
            int i11 = (int) (this.mSelectedStartY + this.mDy);
            if (Math.abs(i11 - viewHolder.itemView.getTop()) >= viewHolder.itemView.getHeight() * moveThreshold || Math.abs(i10 - viewHolder.itemView.getLeft()) >= viewHolder.itemView.getWidth() * moveThreshold) {
                List<RecyclerView.ViewHolder> listFindSwapTargets = findSwapTargets(viewHolder);
                if (listFindSwapTargets.size() == 0) {
                    return;
                }
                RecyclerView.ViewHolder viewHolderChooseDropTarget = this.mCallback.chooseDropTarget(viewHolder, listFindSwapTargets, i10, i11);
                if (viewHolderChooseDropTarget == null) {
                    this.mSwapTargets.clear();
                    this.mDistances.clear();
                    return;
                }
                int absoluteAdapterPosition = viewHolderChooseDropTarget.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = viewHolder.getAbsoluteAdapterPosition();
                if (this.mCallback.onMove(this.mRecyclerView, viewHolder, viewHolderChooseDropTarget)) {
                    this.mCallback.onMoved(this.mRecyclerView, viewHolder, absoluteAdapterPosition2, viewHolderChooseDropTarget, absoluteAdapterPosition, i10, i11);
                }
            }
        }
    }

    void obtainVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.mVelocityTracker = VelocityTracker.obtain();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewAttachedToWindow(@n0 View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewDetachedFromWindow(@n0 View view) {
        removeChildDrawingOrderCallbackIfNecessary(view);
        RecyclerView.ViewHolder childViewHolder = this.mRecyclerView.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.mSelected;
        if (viewHolder != null && childViewHolder == viewHolder) {
            select(null, 0);
            return;
        }
        endRecoverAnimation(childViewHolder, false);
        if (this.mPendingCleanup.remove(childViewHolder.itemView)) {
            this.mCallback.clearView(this.mRecyclerView, childViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f10;
        float f11;
        this.mOverdrawChildPosition = -1;
        if (this.mSelected != null) {
            getSelectedDxDy(this.mTmpPosition);
            float[] fArr = this.mTmpPosition;
            float f12 = fArr[0];
            f11 = fArr[1];
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        this.mCallback.onDraw(canvas, recyclerView, this.mSelected, this.mRecoverAnimations, this.mActionState, f10, f11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f10;
        float f11;
        if (this.mSelected != null) {
            getSelectedDxDy(this.mTmpPosition);
            float[] fArr = this.mTmpPosition;
            float f12 = fArr[0];
            f11 = fArr[1];
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        this.mCallback.onDrawOver(canvas, recyclerView, this.mSelected, this.mRecoverAnimations, this.mActionState, f10, f11);
    }

    void postDispatchSwipe(final RecoverAnimation recoverAnimation, final int i10) {
        this.mRecyclerView.post(new Runnable() { // from class: androidx.recyclerview.widget.ItemTouchHelper.4
            @Override // java.lang.Runnable
            public void run() {
                RecyclerView recyclerView = ItemTouchHelper.this.mRecyclerView;
                if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                RecoverAnimation recoverAnimation2 = recoverAnimation;
                if (recoverAnimation2.mOverridden || recoverAnimation2.mViewHolder.getAbsoluteAdapterPosition() == -1) {
                    return;
                }
                RecyclerView.ItemAnimator itemAnimator = ItemTouchHelper.this.mRecyclerView.getItemAnimator();
                if ((itemAnimator == null || !itemAnimator.isRunning(null)) && !ItemTouchHelper.this.hasRunningRecoverAnim()) {
                    ItemTouchHelper.this.mCallback.onSwiped(recoverAnimation.mViewHolder, i10);
                } else {
                    ItemTouchHelper.this.mRecyclerView.post(this);
                }
            }
        });
    }

    void removeChildDrawingOrderCallbackIfNecessary(View view) {
        if (view == this.mOverdrawChild) {
            this.mOverdrawChild = null;
            if (this.mChildDrawingOrderCallback != null) {
                this.mRecyclerView.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c4  */
    boolean scrollIfNecessary() {
        int iInterpolateOutOfBoundsScroll;
        int iInterpolateOutOfBoundsScroll2;
        int i10;
        int width;
        if (this.mSelected == null) {
            this.mDragScrollStartTimeInMs = Long.MIN_VALUE;
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.mDragScrollStartTimeInMs;
        long j11 = j10 == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j10;
        RecyclerView.LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        if (this.mTmpRect == null) {
            this.mTmpRect = new Rect();
        }
        layoutManager.calculateItemDecorationsForChild(this.mSelected.itemView, this.mTmpRect);
        if (layoutManager.canScrollHorizontally()) {
            int i11 = (int) (this.mSelectedStartX + this.mDx);
            int paddingLeft = (i11 - this.mTmpRect.left) - this.mRecyclerView.getPaddingLeft();
            float f10 = this.mDx;
            if (f10 < 0.0f && paddingLeft < 0) {
                iInterpolateOutOfBoundsScroll = paddingLeft;
            } else if (f10 <= 0.0f || (width = ((i11 + this.mSelected.itemView.getWidth()) + this.mTmpRect.right) - (this.mRecyclerView.getWidth() - this.mRecyclerView.getPaddingRight())) <= 0) {
                iInterpolateOutOfBoundsScroll = 0;
            } else {
                iInterpolateOutOfBoundsScroll = width;
            }
        } else {
            iInterpolateOutOfBoundsScroll = 0;
        }
        if (layoutManager.canScrollVertically()) {
            int i12 = (int) (this.mSelectedStartY + this.mDy);
            int paddingTop = (i12 - this.mTmpRect.top) - this.mRecyclerView.getPaddingTop();
            float f11 = this.mDy;
            if (f11 < 0.0f && paddingTop < 0) {
                iInterpolateOutOfBoundsScroll2 = paddingTop;
            } else if (f11 <= 0.0f || (iInterpolateOutOfBoundsScroll2 = ((i12 + this.mSelected.itemView.getHeight()) + this.mTmpRect.bottom) - (this.mRecyclerView.getHeight() - this.mRecyclerView.getPaddingBottom())) <= 0) {
                iInterpolateOutOfBoundsScroll2 = 0;
            }
        } else {
            iInterpolateOutOfBoundsScroll2 = 0;
        }
        if (iInterpolateOutOfBoundsScroll != 0) {
            iInterpolateOutOfBoundsScroll = this.mCallback.interpolateOutOfBoundsScroll(this.mRecyclerView, this.mSelected.itemView.getWidth(), iInterpolateOutOfBoundsScroll, this.mRecyclerView.getWidth(), j11);
        }
        int i13 = iInterpolateOutOfBoundsScroll;
        if (iInterpolateOutOfBoundsScroll2 != 0) {
            i10 = i13;
            iInterpolateOutOfBoundsScroll2 = this.mCallback.interpolateOutOfBoundsScroll(this.mRecyclerView, this.mSelected.itemView.getHeight(), iInterpolateOutOfBoundsScroll2, this.mRecyclerView.getHeight(), j11);
        } else {
            i10 = i13;
        }
        if (i10 == 0 && iInterpolateOutOfBoundsScroll2 == 0) {
            this.mDragScrollStartTimeInMs = Long.MIN_VALUE;
            return false;
        }
        if (this.mDragScrollStartTimeInMs == Long.MIN_VALUE) {
            this.mDragScrollStartTimeInMs = jCurrentTimeMillis;
        }
        this.mRecyclerView.scrollBy(i10, iInterpolateOutOfBoundsScroll2);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0121  */
    void select(@p0 RecyclerView.ViewHolder viewHolder, int i10) {
        boolean z10;
        boolean z11;
        float fSignum;
        float fSignum2;
        int i11;
        if (viewHolder == this.mSelected && i10 == this.mActionState) {
            return;
        }
        this.mDragScrollStartTimeInMs = Long.MIN_VALUE;
        int i12 = this.mActionState;
        endRecoverAnimation(viewHolder, true);
        this.mActionState = i10;
        if (i10 == 2) {
            if (viewHolder == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.mOverdrawChild = viewHolder.itemView;
            addChildDrawingOrderCallback();
        }
        int i13 = (1 << ((i10 * 8) + 8)) - 1;
        final RecyclerView.ViewHolder viewHolder2 = this.mSelected;
        if (viewHolder2 != null) {
            if (viewHolder2.itemView.getParent() != null) {
                int iSwipeIfNecessary = i12 == 2 ? 0 : swipeIfNecessary(viewHolder2);
                releaseVelocityTracker();
                if (iSwipeIfNecessary == 1 || iSwipeIfNecessary == 2) {
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.mDy) * this.mRecyclerView.getHeight();
                } else if (iSwipeIfNecessary == 4 || iSwipeIfNecessary == 8 || iSwipeIfNecessary == 16 || iSwipeIfNecessary == 32) {
                    fSignum2 = 0.0f;
                    fSignum = Math.signum(this.mDx) * this.mRecyclerView.getWidth();
                } else {
                    fSignum = 0.0f;
                    fSignum2 = 0.0f;
                }
                if (i12 == 2) {
                    i11 = 8;
                } else {
                    i11 = iSwipeIfNecessary > 0 ? 2 : 4;
                }
                getSelectedDxDy(this.mTmpPosition);
                float[] fArr = this.mTmpPosition;
                float f10 = fArr[0];
                float f11 = fArr[1];
                final int i14 = iSwipeIfNecessary;
                RecoverAnimation recoverAnimation = new RecoverAnimation(viewHolder2, i11, i12, f10, f11, fSignum, fSignum2) { // from class: androidx.recyclerview.widget.ItemTouchHelper.3
                    @Override // androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        if (this.mOverridden) {
                            return;
                        }
                        if (i14 <= 0) {
                            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                            itemTouchHelper.mCallback.clearView(itemTouchHelper.mRecyclerView, viewHolder2);
                        } else {
                            ItemTouchHelper.this.mPendingCleanup.add(viewHolder2.itemView);
                            this.mIsPendingCleanup = true;
                            int i15 = i14;
                            if (i15 > 0) {
                                ItemTouchHelper.this.postDispatchSwipe(this, i15);
                            }
                        }
                        ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                        View view = itemTouchHelper2.mOverdrawChild;
                        View view2 = viewHolder2.itemView;
                        if (view == view2) {
                            itemTouchHelper2.removeChildDrawingOrderCallbackIfNecessary(view2);
                        }
                    }
                };
                recoverAnimation.setDuration(this.mCallback.getAnimationDuration(this.mRecyclerView, i11, fSignum - f10, fSignum2 - f11));
                this.mRecoverAnimations.add(recoverAnimation);
                recoverAnimation.start();
                z10 = true;
            } else {
                removeChildDrawingOrderCallbackIfNecessary(viewHolder2.itemView);
                this.mCallback.clearView(this.mRecyclerView, viewHolder2);
                z10 = false;
            }
            this.mSelected = null;
        } else {
            z10 = false;
        }
        if (viewHolder != null) {
            this.mSelectedFlags = (this.mCallback.getAbsoluteMovementFlags(this.mRecyclerView, viewHolder) & i13) >> (this.mActionState * 8);
            this.mSelectedStartX = viewHolder.itemView.getLeft();
            this.mSelectedStartY = viewHolder.itemView.getTop();
            this.mSelected = viewHolder;
            if (i10 == 2) {
                z11 = false;
                viewHolder.itemView.performHapticFeedback(0);
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        ViewParent parent = this.mRecyclerView.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(this.mSelected != null ? true : z11);
        }
        if (!z10) {
            this.mRecyclerView.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        this.mCallback.onSelectedChanged(this.mSelected, this.mActionState);
        this.mRecyclerView.invalidate();
    }

    public void startDrag(@n0 RecyclerView.ViewHolder viewHolder) {
        if (!this.mCallback.hasDragFlag(this.mRecyclerView, viewHolder)) {
            Log.e(TAG, "Start drag has been called but dragging is not enabled");
            return;
        }
        if (viewHolder.itemView.getParent() != this.mRecyclerView) {
            Log.e(TAG, "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        obtainVelocityTracker();
        this.mDy = 0.0f;
        this.mDx = 0.0f;
        select(viewHolder, 2);
    }

    public void startSwipe(@n0 RecyclerView.ViewHolder viewHolder) {
        if (!this.mCallback.hasSwipeFlag(this.mRecyclerView, viewHolder)) {
            Log.e(TAG, "Start swipe has been called but swiping is not enabled");
            return;
        }
        if (viewHolder.itemView.getParent() != this.mRecyclerView) {
            Log.e(TAG, "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
            return;
        }
        obtainVelocityTracker();
        this.mDy = 0.0f;
        this.mDx = 0.0f;
        select(viewHolder, 1);
    }

    void updateDxDy(MotionEvent motionEvent, int i10, int i11) {
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x10 - this.mInitialTouchX;
        this.mDx = f10;
        this.mDy = y10 - this.mInitialTouchY;
        if ((i10 & 4) == 0) {
            this.mDx = Math.max(0.0f, f10);
        }
        if ((i10 & 8) == 0) {
            this.mDx = Math.min(0.0f, this.mDx);
        }
        if ((i10 & 1) == 0) {
            this.mDy = Math.max(0.0f, this.mDy);
        }
        if ((i10 & 2) == 0) {
            this.mDy = Math.min(0.0f, this.mDy);
        }
    }
}
