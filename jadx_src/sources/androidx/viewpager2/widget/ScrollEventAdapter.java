package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class ScrollEventAdapter extends RecyclerView.OnScrollListener {
    private static final int NO_POSITION = -1;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_PROGRESS_FAKE_DRAG = 4;
    private static final int STATE_IN_PROGRESS_IMMEDIATE_SCROLL = 3;
    private static final int STATE_IN_PROGRESS_MANUAL_DRAG = 1;
    private static final int STATE_IN_PROGRESS_SMOOTH_SCROLL = 2;
    private int mAdapterState;
    private ViewPager2.OnPageChangeCallback mCallback;
    private boolean mDataSetChangeHappened;
    private boolean mDispatchSelected;
    private int mDragStartPosition;
    private boolean mFakeDragging;

    @n0
    private final LinearLayoutManager mLayoutManager;

    @n0
    private final RecyclerView mRecyclerView;
    private boolean mScrollHappened;
    private int mScrollState;
    private ScrollEventValues mScrollValues;
    private int mTarget;

    @n0
    private final ViewPager2 mViewPager;

    public static final class ScrollEventValues {
        float mOffset;
        int mOffsetPx;
        int mPosition;

        ScrollEventValues() {
        }

        void reset() {
            this.mPosition = -1;
            this.mOffset = 0.0f;
            this.mOffsetPx = 0;
        }
    }

    ScrollEventAdapter(@n0 ViewPager2 viewPager2) {
        this.mViewPager = viewPager2;
        RecyclerView recyclerView = viewPager2.mRecyclerView;
        this.mRecyclerView = recyclerView;
        this.mLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.mScrollValues = new ScrollEventValues();
        resetState();
    }

    private void dispatchScrolled(int i10, float f10, int i11) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.mCallback;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageScrolled(i10, f10, i11);
        }
    }

    private void dispatchSelected(int i10) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.mCallback;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageSelected(i10);
        }
    }

    private void dispatchStateChanged(int i10) {
        if ((this.mAdapterState == 3 && this.mScrollState == 0) || this.mScrollState == i10) {
            return;
        }
        this.mScrollState = i10;
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.mCallback;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageScrollStateChanged(i10);
        }
    }

    private int getPosition() {
        return this.mLayoutManager.findFirstVisibleItemPosition();
    }

    private boolean isInAnyDraggingState() {
        int i10 = this.mAdapterState;
        return i10 == 1 || i10 == 4;
    }

    private void resetState() {
        this.mAdapterState = 0;
        this.mScrollState = 0;
        this.mScrollValues.reset();
        this.mDragStartPosition = -1;
        this.mTarget = -1;
        this.mDispatchSelected = false;
        this.mScrollHappened = false;
        this.mFakeDragging = false;
        this.mDataSetChangeHappened = false;
    }

    private void startDrag(boolean z10) {
        this.mFakeDragging = z10;
        this.mAdapterState = z10 ? 4 : 1;
        int i10 = this.mTarget;
        if (i10 != -1) {
            this.mDragStartPosition = i10;
            this.mTarget = -1;
        } else if (this.mDragStartPosition == -1) {
            this.mDragStartPosition = getPosition();
        }
        dispatchStateChanged(1);
    }

    private void updateScrollEventValues() {
        int top;
        ScrollEventValues scrollEventValues = this.mScrollValues;
        int iFindFirstVisibleItemPosition = this.mLayoutManager.findFirstVisibleItemPosition();
        scrollEventValues.mPosition = iFindFirstVisibleItemPosition;
        if (iFindFirstVisibleItemPosition == -1) {
            scrollEventValues.reset();
            return;
        }
        View viewFindViewByPosition = this.mLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition == null) {
            scrollEventValues.reset();
            return;
        }
        int leftDecorationWidth = this.mLayoutManager.getLeftDecorationWidth(viewFindViewByPosition);
        int rightDecorationWidth = this.mLayoutManager.getRightDecorationWidth(viewFindViewByPosition);
        int topDecorationHeight = this.mLayoutManager.getTopDecorationHeight(viewFindViewByPosition);
        int bottomDecorationHeight = this.mLayoutManager.getBottomDecorationHeight(viewFindViewByPosition);
        ViewGroup.LayoutParams layoutParams = viewFindViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = viewFindViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = viewFindViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (this.mLayoutManager.getOrientation() == 0) {
            top = (viewFindViewByPosition.getLeft() - leftDecorationWidth) - this.mRecyclerView.getPaddingLeft();
            if (this.mViewPager.isRtl()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewFindViewByPosition.getTop() - topDecorationHeight) - this.mRecyclerView.getPaddingTop();
        }
        int i10 = -top;
        scrollEventValues.mOffsetPx = i10;
        if (i10 >= 0) {
            scrollEventValues.mOffset = height == 0 ? 0.0f : i10 / height;
        } else {
            if (!new AnimateLayoutChangeDetector(this.mLayoutManager).mayHaveInterferingAnimations()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(scrollEventValues.mOffsetPx)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }

    double getRelativeScrollPosition() {
        updateScrollEventValues();
        ScrollEventValues scrollEventValues = this.mScrollValues;
        return ((double) scrollEventValues.mPosition) + ((double) scrollEventValues.mOffset);
    }

    int getScrollState() {
        return this.mScrollState;
    }

    boolean isDragging() {
        return this.mScrollState == 1;
    }

    boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    boolean isIdle() {
        return this.mScrollState == 0;
    }

    void notifyBeginFakeDrag() {
        this.mAdapterState = 4;
        startDrag(true);
    }

    void notifyDataSetChangeHappened() {
        this.mDataSetChangeHappened = true;
    }

    void notifyEndFakeDrag() {
        if (!isDragging() || this.mFakeDragging) {
            this.mFakeDragging = false;
            updateScrollEventValues();
            ScrollEventValues scrollEventValues = this.mScrollValues;
            if (scrollEventValues.mOffsetPx != 0) {
                dispatchStateChanged(2);
                return;
            }
            int i10 = scrollEventValues.mPosition;
            if (i10 != this.mDragStartPosition) {
                dispatchSelected(i10);
            }
            dispatchStateChanged(0);
            resetState();
        }
    }

    void notifyProgrammaticScroll(int i10, boolean z10) {
        this.mAdapterState = z10 ? 2 : 3;
        this.mFakeDragging = false;
        boolean z11 = this.mTarget != i10;
        this.mTarget = i10;
        dispatchStateChanged(2);
        if (z11) {
            dispatchSelected(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(@n0 RecyclerView recyclerView, int i10) {
        boolean z10 = true;
        if (!(this.mAdapterState == 1 && this.mScrollState == 1) && i10 == 1) {
            startDrag(false);
            return;
        }
        if (isInAnyDraggingState() && i10 == 2) {
            if (this.mScrollHappened) {
                dispatchStateChanged(2);
                this.mDispatchSelected = true;
                return;
            }
            return;
        }
        if (isInAnyDraggingState() && i10 == 0) {
            updateScrollEventValues();
            if (this.mScrollHappened) {
                ScrollEventValues scrollEventValues = this.mScrollValues;
                if (scrollEventValues.mOffsetPx == 0) {
                    int i11 = this.mDragStartPosition;
                    int i12 = scrollEventValues.mPosition;
                    if (i11 != i12) {
                        dispatchSelected(i12);
                    }
                } else {
                    z10 = false;
                }
            } else {
                int i13 = this.mScrollValues.mPosition;
                if (i13 != -1) {
                    dispatchScrolled(i13, 0.0f, 0);
                }
            }
            if (z10) {
                dispatchStateChanged(0);
                resetState();
            }
        }
        if (this.mAdapterState == 2 && i10 == 0 && this.mDataSetChangeHappened) {
            updateScrollEventValues();
            ScrollEventValues scrollEventValues2 = this.mScrollValues;
            if (scrollEventValues2.mOffsetPx == 0) {
                int i14 = this.mTarget;
                int i15 = scrollEventValues2.mPosition;
                if (i14 != i15) {
                    if (i15 == -1) {
                        i15 = 0;
                    }
                    dispatchSelected(i15);
                }
                dispatchStateChanged(0);
                resetState();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(@n0 RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        int i12;
        this.mScrollHappened = true;
        updateScrollEventValues();
        if (this.mDispatchSelected) {
            this.mDispatchSelected = false;
            if (i11 > 0) {
                z10 = true;
            } else {
                if (i11 == 0) {
                    if ((i10 < 0) == this.mViewPager.isRtl()) {
                        z10 = true;
                    }
                }
                z10 = false;
            }
            if (z10) {
                ScrollEventValues scrollEventValues = this.mScrollValues;
                if (scrollEventValues.mOffsetPx != 0) {
                    i12 = scrollEventValues.mPosition + 1;
                } else {
                    i12 = this.mScrollValues.mPosition;
                }
            } else {
                i12 = this.mScrollValues.mPosition;
            }
            this.mTarget = i12;
            if (this.mDragStartPosition != i12) {
                dispatchSelected(i12);
            }
        } else if (this.mAdapterState == 0) {
            int i13 = this.mScrollValues.mPosition;
            if (i13 == -1) {
                i13 = 0;
            }
            dispatchSelected(i13);
        }
        ScrollEventValues scrollEventValues2 = this.mScrollValues;
        int i14 = scrollEventValues2.mPosition;
        if (i14 == -1) {
            i14 = 0;
        }
        dispatchScrolled(i14, scrollEventValues2.mOffset, scrollEventValues2.mOffsetPx);
        ScrollEventValues scrollEventValues3 = this.mScrollValues;
        int i15 = scrollEventValues3.mPosition;
        int i16 = this.mTarget;
        if ((i15 == i16 || i16 == -1) && scrollEventValues3.mOffsetPx == 0 && this.mScrollState != 1) {
            dispatchStateChanged(0);
            resetState();
        }
    }

    void setOnPageChangeCallback(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.mCallback = onPageChangeCallback;
    }
}
