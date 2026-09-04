package com.umeng.socialize.shareboard.widgets;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SocializeViewPager extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DEFAULT_WIDTH_FACTOR = 1;
    private static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private int mActivePointerId;
    private SocializePagerAdapter mAdapter;
    private boolean mCalledSuper;
    private int mCloseEnough;
    private int mCurPosition;
    private int mDefaultGutterSize;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private List<ItemInfo> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private PagerObserver mObserver;
    private int mOffscreenPageLimit;
    private List<OnPageChangeListener> mOnPageChangeListeners;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private int mScrollState;
    private Scroller mScroller;
    private final ItemInfo mTempItem;
    private final Rect mTempRect;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    private static final Comparator<ItemInfo> COMPARATOR = new Comparator<ItemInfo>() { // from class: com.umeng.socialize.shareboard.widgets.SocializeViewPager.2
        @Override // java.util.Comparator
        public int compare(ItemInfo itemInfo, ItemInfo itemInfo2) {
            return itemInfo.position - itemInfo2.position;
        }
    };
    private static final Interpolator sInterpolator = new Interpolator() { // from class: com.umeng.socialize.shareboard.widgets.SocializeViewPager.3
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    };
    static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};

    public static class ItemInfo {
        Object object;
        float offset;
        int position;
        boolean scrolling;

        ItemInfo() {
        }
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {
        int childIndex;
        public int gravity;
        public boolean isDecor;
        boolean needsMeasure;
        int position;
        float widthFactor;

        public LayoutParams() {
            super(-1, -1);
            this.widthFactor = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.widthFactor = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, SocializeViewPager.LAYOUT_ATTRS);
            this.gravity = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public interface OnPageChangeListener {
        void onPageScrollStateChanged(int i10);

        void onPageScrolled(int i10, float f10, int i11);

        void onPageSelected(int i10);
    }

    public class PagerObserver extends DataSetObserver {
        PagerObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            SocializeViewPager.this.dataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            SocializeViewPager.this.dataSetChanged();
        }
    }

    public SocializeViewPager(Context context) {
        super(context);
        this.mActivePointerId = -1;
        this.mOffscreenPageLimit = 1;
        this.mItems = new ArrayList();
        this.mTempItem = new ItemInfo();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mTempRect = new Rect();
        this.mEndScrollRunnable = new Runnable() { // from class: com.umeng.socialize.shareboard.widgets.SocializeViewPager.1
            @Override // java.lang.Runnable
            public void run() {
                SocializeViewPager.this.setScrollState(0);
                SocializeViewPager.this.populate();
            }
        };
        this.mScrollState = 0;
        init();
    }

    public SocializeViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mActivePointerId = -1;
        this.mOffscreenPageLimit = 1;
        this.mItems = new ArrayList();
        this.mTempItem = new ItemInfo();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mTempRect = new Rect();
        this.mEndScrollRunnable = new Runnable() { // from class: com.umeng.socialize.shareboard.widgets.SocializeViewPager.1
            @Override // java.lang.Runnable
            public void run() {
                SocializeViewPager.this.setScrollState(0);
                SocializeViewPager.this.populate();
            }
        };
        this.mScrollState = 0;
        init();
    }

    public SocializeViewPager(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mActivePointerId = -1;
        this.mOffscreenPageLimit = 1;
        this.mItems = new ArrayList();
        this.mTempItem = new ItemInfo();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mTempRect = new Rect();
        this.mEndScrollRunnable = new Runnable() { // from class: com.umeng.socialize.shareboard.widgets.SocializeViewPager.1
            @Override // java.lang.Runnable
            public void run() {
                SocializeViewPager.this.setScrollState(0);
                SocializeViewPager.this.populate();
            }
        };
        this.mScrollState = 0;
        init();
    }

    @TargetApi(21)
    public SocializeViewPager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.mActivePointerId = -1;
        this.mOffscreenPageLimit = 1;
        this.mItems = new ArrayList();
        this.mTempItem = new ItemInfo();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mTempRect = new Rect();
        this.mEndScrollRunnable = new Runnable() { // from class: com.umeng.socialize.shareboard.widgets.SocializeViewPager.1
            @Override // java.lang.Runnable
            public void run() {
                SocializeViewPager.this.setScrollState(0);
                SocializeViewPager.this.populate();
            }
        };
        this.mScrollState = 0;
        init();
    }

    private void calculatePageOffsets(ItemInfo itemInfo, int i10, ItemInfo itemInfo2) {
        int i11;
        int i12;
        ItemInfo itemInfo3;
        ItemInfo itemInfo4;
        int count = this.mAdapter.getCount();
        if (itemInfo2 != null) {
            int i13 = itemInfo2.position;
            int i14 = itemInfo.position;
            if (i13 < i14) {
                int i15 = 0;
                float pageWidth = itemInfo2.offset + 1.0f + 0.0f;
                while (true) {
                    i13++;
                    if (i13 > itemInfo.position || i15 >= this.mItems.size()) {
                        break;
                    }
                    ItemInfo itemInfo5 = this.mItems.get(i15);
                    while (true) {
                        itemInfo4 = itemInfo5;
                        if (i13 <= itemInfo4.position || i15 >= this.mItems.size() - 1) {
                            break;
                        }
                        i15++;
                        itemInfo5 = this.mItems.get(i15);
                    }
                    while (i13 < itemInfo4.position) {
                        pageWidth += this.mAdapter.getPageWidth(i13) + 0.0f;
                        i13++;
                    }
                    itemInfo4.offset = pageWidth;
                    pageWidth += 1.0f;
                }
            } else if (i13 > i14) {
                int size = this.mItems.size() - 1;
                float pageWidth2 = itemInfo2.offset;
                while (true) {
                    i13--;
                    if (i13 < itemInfo.position || size < 0) {
                        break;
                    }
                    ItemInfo itemInfo6 = this.mItems.get(size);
                    while (true) {
                        itemInfo3 = itemInfo6;
                        if (i13 >= itemInfo3.position || size <= 0) {
                            break;
                        }
                        size--;
                        itemInfo6 = this.mItems.get(size);
                    }
                    while (i13 > itemInfo3.position) {
                        pageWidth2 -= this.mAdapter.getPageWidth(i13) + 0.0f;
                        i13--;
                    }
                    pageWidth2 -= 1.0f;
                    itemInfo3.offset = pageWidth2;
                }
            }
        }
        int size2 = this.mItems.size();
        float pageWidth3 = itemInfo.offset;
        int i16 = itemInfo.position;
        int i17 = i16 - 1;
        this.mFirstOffset = i16 == 0 ? pageWidth3 : -3.4028235E38f;
        int i18 = count - 1;
        this.mLastOffset = i16 == i18 ? (pageWidth3 + 1.0f) - 1.0f : Float.MAX_VALUE;
        int i19 = i10 - 1;
        while (i19 >= 0) {
            ItemInfo itemInfo7 = this.mItems.get(i19);
            while (true) {
                i12 = itemInfo7.position;
                if (i17 <= i12) {
                    break;
                }
                pageWidth3 -= this.mAdapter.getPageWidth(i17) + 0.0f;
                i17--;
            }
            pageWidth3 -= 1.0f;
            itemInfo7.offset = pageWidth3;
            if (i12 == 0) {
                this.mFirstOffset = pageWidth3;
            }
            i19--;
            i17--;
        }
        float pageWidth4 = itemInfo.offset + 1.0f + 0.0f;
        int i20 = itemInfo.position + 1;
        int i21 = i10 + 1;
        while (i21 < size2) {
            ItemInfo itemInfo8 = this.mItems.get(i21);
            while (true) {
                i11 = itemInfo8.position;
                if (i20 >= i11) {
                    break;
                }
                pageWidth4 += this.mAdapter.getPageWidth(i20) + 0.0f;
                i20++;
            }
            if (i11 == i18) {
                this.mLastOffset = (pageWidth4 + 1.0f) - 1.0f;
            }
            itemInfo8.offset = pageWidth4;
            pageWidth4 += 1.0f;
            i21++;
            i20++;
        }
    }

    private void completeScroll(boolean z10) {
        boolean z11 = this.mScrollState == 2;
        if (z11 && (!this.mScroller.isFinished())) {
            this.mScroller.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (currX != scrollX) {
                    pageScrolled(currX);
                }
            }
        }
        this.mPopulatePending = false;
        for (int i10 = 0; i10 < this.mItems.size(); i10++) {
            ItemInfo itemInfo = this.mItems.get(i10);
            if (itemInfo.scrolling) {
                itemInfo.scrolling = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                ViewCompat.postOnAnimation(this, this.mEndScrollRunnable);
            } else {
                this.mEndScrollRunnable.run();
            }
        }
    }

    private int determineTargetPage(int i10, float f10, int i11, int i12) {
        if (Math.abs(i12) <= this.mFlingDistance || Math.abs(i11) <= this.mMinimumVelocity) {
            i10 += (int) (f10 + (i10 >= this.mCurPosition ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        if (this.mItems.size() <= 0) {
            return i10;
        }
        ItemInfo itemInfo = this.mItems.get(0);
        List<ItemInfo> list = this.mItems;
        return Math.max(itemInfo.position, Math.min(i10, list.get(list.size() - 1).position));
    }

    private void dispatchOnPageScrolled(int i10, float f10, int i11) {
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                OnPageChangeListener onPageChangeListener = this.mOnPageChangeListeners.get(i12);
                if (onPageChangeListener != null) {
                    onPageChangeListener.onPageScrolled(i10, f10, i11);
                }
            }
        }
    }

    private void dispatchOnPageSelected(int i10) {
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                OnPageChangeListener onPageChangeListener = this.mOnPageChangeListeners.get(i11);
                if (onPageChangeListener != null) {
                    onPageChangeListener.onPageSelected(i10);
                }
            }
        }
    }

    private void dispatchOnScrollStateChanged(int i10) {
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                OnPageChangeListener onPageChangeListener = this.mOnPageChangeListeners.get(i11);
                if (onPageChangeListener != null) {
                    onPageChangeListener.onPageScrollStateChanged(i10);
                }
            }
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private ItemInfo infoForCurrentScrollPosition() {
        int i10;
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        ItemInfo itemInfo = null;
        int i11 = -1;
        float f10 = 0.0f;
        int i12 = 0;
        boolean z10 = true;
        while (i12 < this.mItems.size()) {
            ItemInfo itemInfo2 = this.mItems.get(i12);
            if (!z10 && itemInfo2.position != (i10 = i11 + 1)) {
                itemInfo2 = this.mTempItem;
                itemInfo2.offset = f10 + 0.0f + 0.0f;
                itemInfo2.position = i10;
                i12--;
            }
            f10 = itemInfo2.offset;
            float f11 = 1.0f + f10 + 0.0f;
            if (!z10 && scrollX < f10) {
                return itemInfo;
            }
            if (scrollX < f11 || i12 == this.mItems.size() - 1) {
                return itemInfo2;
            }
            i11 = itemInfo2.position;
            i12++;
            z10 = false;
            itemInfo = itemInfo2;
        }
        return itemInfo;
    }

    private void init() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f10);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mCloseEnough = (int) (2.0f * f10);
        this.mFlingDistance = (int) (25.0f * f10);
        this.mDefaultGutterSize = (int) (f10 * 16.0f);
        ViewCompat.setOnApplyWindowInsetsListener(this, new ViewCompat.OnApplyWindowInsetsListener() { // from class: com.umeng.socialize.shareboard.widgets.SocializeViewPager.4
            @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets = ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
                if (windowInsetsCompatOnApplyWindowInsets.isConsumed()) {
                    return windowInsetsCompatOnApplyWindowInsets;
                }
                Rect rect = SocializeViewPager.this.mTempRect;
                rect.left = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetLeft();
                rect.top = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetTop();
                rect.right = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetRight();
                rect.bottom = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetBottom();
                int childCount = SocializeViewPager.this.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    WindowInsetsCompat windowInsetsCompatDispatchApplyWindowInsets = ViewCompat.dispatchApplyWindowInsets(SocializeViewPager.this.getChildAt(i10), windowInsetsCompatOnApplyWindowInsets);
                    rect.left = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetLeft(), rect.left);
                    rect.top = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetTop(), rect.top);
                    rect.right = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetRight(), rect.right);
                    rect.bottom = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetBottom(), rect.bottom);
                }
                return windowInsetsCompatOnApplyWindowInsets.replaceSystemWindowInsets(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    private boolean isGutterDrag(float f10, float f11) {
        return (f10 < ((float) this.mGutterSize) && f11 > 0.0f) || (f10 > ((float) (getWidth() - this.mGutterSize)) && f11 < 0.0f);
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.mLastMotionX = motionEvent.getX(i10);
            this.mActivePointerId = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean pageScrolled(int i10) {
        if (this.mItems.size() == 0) {
            if (this.mFirstLayout) {
                return false;
            }
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        ItemInfo itemInfoInfoForCurrentScrollPosition = infoForCurrentScrollPosition();
        int clientWidth = getClientWidth();
        int i11 = itemInfoInfoForCurrentScrollPosition.position;
        float f10 = clientWidth;
        float f11 = ((i10 / f10) - itemInfoInfoForCurrentScrollPosition.offset) / 1.0f;
        this.mCalledSuper = false;
        onPageScrolled(i11, f11, (int) (f10 * f11));
        if (this.mCalledSuper) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean performDrag(float f10) {
        boolean z10;
        float f11 = this.mLastMotionX - f10;
        this.mLastMotionX = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.mFirstOffset * clientWidth;
        float f13 = this.mLastOffset * clientWidth;
        boolean z11 = false;
        ItemInfo itemInfo = this.mItems.get(0);
        List<ItemInfo> list = this.mItems;
        boolean z12 = true;
        ItemInfo itemInfo2 = list.get(list.size() - 1);
        if (itemInfo.position != 0) {
            f12 = itemInfo.offset * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (itemInfo2.position != this.mAdapter.getCount() - 1) {
            f13 = itemInfo2.offset * clientWidth;
            z12 = false;
        }
        if (scrollX < f12) {
            scrollX = f12;
            z11 = z10;
        } else if (scrollX > f13) {
            scrollX = f13;
            z11 = z12;
        }
        int i10 = (int) scrollX;
        this.mLastMotionX += scrollX - i10;
        scrollTo(i10, getScrollY());
        pageScrolled(i10);
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void populate() {
        populate(this.mCurPosition);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00ff A[PHI: r7 r11 r15
  0x00ff: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:60:0x00f4, B:57:0x00e1, B:51:0x00cd] A[DONT_GENERATE, DONT_INLINE]
  0x00ff: PHI (r11v9 int) = (r11v1 int), (r11v8 int), (r11v12 int) binds: [B:60:0x00f4, B:57:0x00e1, B:51:0x00cd] A[DONT_GENERATE, DONT_INLINE]
  0x00ff: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:60:0x00f4, B:57:0x00e1, B:51:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x015c A[PHI: r3 r12
  0x015c: PHI (r3v20 int) = (r3v18 int), (r3v19 int), (r3v17 int) binds: [B:94:0x0184, B:91:0x016d, B:84:0x0151] A[DONT_GENERATE, DONT_INLINE]
  0x015c: PHI (r12v7 float) = (r12v5 float), (r12v6 float), (r12v4 float) binds: [B:94:0x0184, B:91:0x016d, B:84:0x0151] A[DONT_GENERATE, DONT_INLINE]] */
    private void populate(int i10) {
        ItemInfo itemInfoInfoForPosition;
        String hexString;
        ItemInfo itemInfoAddNewItem;
        ItemInfo itemInfoInfoForChild;
        ItemInfo itemInfo;
        int i11 = this.mCurPosition;
        if (i11 != i10) {
            itemInfoInfoForPosition = infoForPosition(i11);
            this.mCurPosition = i10;
        } else {
            itemInfoInfoForPosition = null;
        }
        if (this.mAdapter == null || this.mPopulatePending || getWindowToken() == null) {
            return;
        }
        this.mAdapter.startUpdate((ViewGroup) this);
        int i12 = this.mOffscreenPageLimit;
        int iMax = Math.max(0, this.mCurPosition - i12);
        int count = this.mAdapter.getCount();
        int iMin = Math.min(count - 1, this.mCurPosition + i12);
        if (count != this.mExpectedAdapterCount) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's SocializePagerAdapter changed the adapter's contents without calling SocializePagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.mExpectedAdapterCount + ", found: " + count + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.mAdapter.getClass());
        }
        int i13 = 0;
        while (true) {
            if (i13 < this.mItems.size()) {
                itemInfoAddNewItem = this.mItems.get(i13);
                int i14 = itemInfoAddNewItem.position;
                int i15 = this.mCurPosition;
                if (i14 >= i15) {
                    if (i14 != i15) {
                        break;
                    } else {
                        break;
                    }
                }
                i13++;
            }
            itemInfoAddNewItem = null;
            break;
        }
        if (itemInfoAddNewItem == null && count > 0) {
            itemInfoAddNewItem = addNewItem(this.mCurPosition, i13);
        }
        if (itemInfoAddNewItem != null) {
            int i16 = i13 - 1;
            ItemInfo itemInfo2 = i16 >= 0 ? this.mItems.get(i16) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + 1.0f;
            Log.d(TAG, "populate leftWidthNeeded:" + paddingLeft);
            float f10 = 0.0f;
            for (int i17 = this.mCurPosition + (-1); i17 >= 0; i17--) {
                if (f10 < paddingLeft || i17 >= iMax) {
                    if (itemInfo2 == null || i17 != itemInfo2.position) {
                        addNewItem(i17, i16 + 1);
                        f10 += 1.0f;
                        i13++;
                        if (i16 >= 0) {
                            itemInfo = this.mItems.get(i16);
                        } else {
                            itemInfo = null;
                        }
                    } else {
                        f10 += 1.0f;
                        i16--;
                        if (i16 >= 0) {
                            itemInfo = this.mItems.get(i16);
                        } else {
                            itemInfo = null;
                        }
                    }
                    itemInfo2 = itemInfo;
                } else {
                    if (itemInfo2 == null) {
                        break;
                    }
                    if (i17 == itemInfo2.position && !itemInfo2.scrolling) {
                        this.mItems.remove(i16);
                        this.mAdapter.destroyItem((ViewGroup) this, i17, itemInfo2.object);
                        i16--;
                        i13--;
                        if (i16 >= 0) {
                            itemInfo = this.mItems.get(i16);
                        } else {
                            itemInfo = null;
                        }
                        itemInfo2 = itemInfo;
                    }
                }
            }
            int i18 = i13 + 1;
            ItemInfo itemInfo3 = i18 < this.mItems.size() ? this.mItems.get(i18) : null;
            float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
            float f11 = 1.0f;
            for (int i19 = this.mCurPosition + 1; i19 < count; i19++) {
                if (f11 >= paddingRight && i19 > iMin) {
                    if (itemInfo3 == null) {
                        break;
                    }
                    if (i19 == itemInfo3.position && !itemInfo3.scrolling) {
                        this.mItems.remove(i18);
                        this.mAdapter.destroyItem((ViewGroup) this, i19, itemInfo3.object);
                        if (i18 < this.mItems.size()) {
                            itemInfo3 = this.mItems.get(i18);
                        } else {
                            itemInfo3 = null;
                        }
                    }
                } else if (itemInfo3 == null || i19 != itemInfo3.position) {
                    addNewItem(i19, i18);
                    i18++;
                    f11 += 1.0f;
                    if (i18 < this.mItems.size()) {
                        itemInfo3 = this.mItems.get(i18);
                    } else {
                        itemInfo3 = null;
                    }
                } else {
                    f11 += 1.0f;
                    i18++;
                    if (i18 < this.mItems.size()) {
                        itemInfo3 = this.mItems.get(i18);
                    } else {
                        itemInfo3 = null;
                    }
                }
            }
            calculatePageOffsets(itemInfoAddNewItem, i13, itemInfoInfoForPosition);
        }
        this.mAdapter.setPrimaryItem((ViewGroup) this, this.mCurPosition, itemInfoAddNewItem != null ? itemInfoAddNewItem.object : null);
        this.mAdapter.finishUpdate((ViewGroup) this);
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            layoutParams.childIndex = i20;
            if (!layoutParams.isDecor && layoutParams.widthFactor == 0.0f && (itemInfoInfoForChild = infoForChild(childAt)) != null) {
                layoutParams.widthFactor = 1.0f;
                layoutParams.position = itemInfoInfoForChild.position;
            }
        }
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            ItemInfo itemInfoInfoForAnyChild = viewFindFocus != null ? infoForAnyChild(viewFindFocus) : null;
            if (itemInfoInfoForAnyChild == null || itemInfoInfoForAnyChild.position != this.mCurPosition) {
                for (int i21 = 0; i21 < getChildCount(); i21++) {
                    View childAt2 = getChildAt(i21);
                    ItemInfo itemInfoInfoForChild2 = infoForChild(childAt2);
                    if (itemInfoInfoForChild2 != null && itemInfoInfoForChild2.position == this.mCurPosition && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    private void recomputeScrollPosition(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.mItems.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        ItemInfo itemInfoInfoForPosition = infoForPosition(this.mCurPosition);
        int iMin = (int) ((itemInfoInfoForPosition != null ? Math.min(itemInfoInfoForPosition.offset, this.mLastOffset) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            completeScroll(false);
            scrollTo(iMin, getScrollY());
        }
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        return true;
    }

    private void scrollToItem(int i10, boolean z10, int i11, boolean z11) {
        ItemInfo itemInfoInfoForPosition = infoForPosition(i10);
        int clientWidth = itemInfoInfoForPosition != null ? (int) (getClientWidth() * Math.max(this.mFirstOffset, Math.min(itemInfoInfoForPosition.offset, this.mLastOffset))) : 0;
        if (z10) {
            smoothScrollTo(clientWidth, 0, i11);
            if (z11) {
                dispatchOnPageSelected(i10);
                return;
            }
            return;
        }
        if (z11) {
            dispatchOnPageSelected(i10);
        }
        completeScroll(false);
        scrollTo(clientWidth, 0);
        pageScrolled(clientWidth);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        ItemInfo itemInfoInfoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (itemInfoInfoForChild = infoForChild(childAt)) != null && itemInfoInfoForChild.position == this.mCurPosition) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    ItemInfo addNewItem(int i10, int i11) {
        ItemInfo itemInfo = new ItemInfo();
        itemInfo.position = i10;
        itemInfo.object = this.mAdapter.instantiateItem((ViewGroup) this, i10);
        if (i11 < 0 || i11 >= this.mItems.size()) {
            this.mItems.add(itemInfo);
        } else {
            this.mItems.add(i11, itemInfo);
        }
        return itemInfo;
    }

    public void addOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(onPageChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        ItemInfo itemInfoInfoForChild;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (itemInfoInfoForChild = infoForChild(childAt)) != null && itemInfoInfoForChild.position == this.mCurPosition) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean z10 = layoutParams2.isDecor | false;
        layoutParams2.isDecor = z10;
        if (!this.mInLayout) {
            super.addView(view, i10, layoutParams);
        } else {
            if (z10) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.needsMeasure = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    public boolean arrowScroll(int i10) {
        boolean z10;
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        boolean zPageLeft = false;
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    z10 = false;
                    break;
                }
                if (parent == this) {
                    z10 = true;
                    break;
                }
                parent = parent.getParent();
            }
            if (!z10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(viewFindFocus.getClass().getSimpleName());
                for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb2.append(" => ");
                    sb2.append(parent2.getClass().getSimpleName());
                }
                Log.e(TAG, "arrowScroll tried to find focus based on non-child current focused view " + sb2.toString());
                viewFindFocus = null;
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            if (i10 == 17) {
                zRequestFocus = (viewFindFocus == null || getChildRectInPagerCoordinates(this.mTempRect, viewFindNextFocus).left < getChildRectInPagerCoordinates(this.mTempRect, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : pageLeft();
            } else if (i10 == 66) {
                zRequestFocus = (viewFindFocus == null || getChildRectInPagerCoordinates(this.mTempRect, viewFindNextFocus).left > getChildRectInPagerCoordinates(this.mTempRect, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : pageRight();
            }
            zPageLeft = zRequestFocus;
        } else if (i10 == 17 || i10 == 1) {
            zPageLeft = pageLeft();
        } else if (i10 == 66 || i10 == 2) {
            zPageLeft = pageRight();
        }
        if (zPageLeft) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
        }
        return zPageLeft;
    }

    protected boolean canScroll(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && canScroll(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && ViewCompat.canScrollHorizontally(view, -i10);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void clearOnPageChangeListeners() {
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            completeScroll(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!pageScrolled(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    void dataSetChanged() {
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        boolean z10 = this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count;
        int iMax = this.mCurPosition;
        int i10 = 0;
        boolean z11 = false;
        while (i10 < this.mItems.size()) {
            ItemInfo itemInfo = this.mItems.get(i10);
            int itemPosition = this.mAdapter.getItemPosition(itemInfo.object);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i10);
                    i10--;
                    if (!z11) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z11 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, itemInfo.position, itemInfo.object);
                    int i11 = this.mCurPosition;
                    if (i11 == itemInfo.position) {
                        iMax = Math.max(0, Math.min(i11, count - 1));
                    }
                } else {
                    int i12 = itemInfo.position;
                    if (i12 != itemPosition) {
                        if (i12 == this.mCurPosition) {
                            iMax = itemPosition;
                        }
                        itemInfo.position = itemPosition;
                    }
                }
                z10 = true;
            }
            i10++;
        }
        if (z11) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z10) {
            setCurrentItemInternal(iMax, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ItemInfo itemInfoInfoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (itemInfoInfoForChild = infoForChild(childAt)) != null && itemInfoInfoForChild.position == this.mCurPosition && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    float distanceInfluenceForSnapDuration(float f10) {
        return (float) Math.sin((float) (((double) (f10 - 0.5f)) * 0.4712389167638204d));
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return arrowScroll(17);
            }
            if (keyCode == 22) {
                return arrowScroll(66);
            }
            if (keyCode == 61) {
                if (KeyEventCompat.hasNoModifiers(keyEvent)) {
                    return arrowScroll(2);
                }
                if (KeyEventCompat.hasModifiers(keyEvent, 1)) {
                    return arrowScroll(1);
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public int getCurrentItem() {
        return this.mCurPosition;
    }

    ItemInfo infoForAnyChild(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return infoForChild(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    ItemInfo infoForChild(View view) {
        for (int i10 = 0; i10 < this.mItems.size(); i10++) {
            ItemInfo itemInfo = this.mItems.get(i10);
            if (this.mAdapter.isViewFromObject(view, itemInfo.object)) {
                return itemInfo;
            }
        }
        return null;
    }

    ItemInfo infoForPosition(int i10) {
        for (int i11 = 0; i11 < this.mItems.size(); i11++) {
            ItemInfo itemInfo = this.mItems.get(i11);
            if (itemInfo.position == i10) {
                return itemInfo;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            resetTouch();
            return false;
        }
        if (action != 0) {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.mInitialMotionX = x10;
            this.mLastMotionX = x10;
            float y10 = motionEvent.getY();
            this.mInitialMotionY = y10;
            this.mLastMotionY = y10;
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.mIsUnableToDrag = false;
            this.mIsScrollStarted = true;
            this.mScroller.computeScrollOffset();
            if (this.mScrollState != 2 || Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.mCloseEnough) {
                completeScroll(false);
                this.mIsBeingDragged = false;
            } else {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                this.mIsBeingDragged = true;
                requestParentDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.mActivePointerId;
            if (i10 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                float x11 = motionEvent.getX(iFindPointerIndex);
                float f10 = x11 - this.mLastMotionX;
                float fAbs = Math.abs(f10);
                float y11 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y11 - this.mInitialMotionY);
                if (f10 != 0.0f && !isGutterDrag(this.mLastMotionX, f10) && canScroll(this, false, (int) f10, (int) x11, (int) y11)) {
                    this.mLastMotionX = x11;
                    this.mLastMotionY = y11;
                    this.mIsUnableToDrag = true;
                    return false;
                }
                int i11 = this.mTouchSlop;
                if (fAbs > i11 && fAbs * 0.5f > fAbs2) {
                    this.mIsBeingDragged = true;
                    requestParentDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                    float f11 = this.mInitialMotionX;
                    float f12 = this.mTouchSlop;
                    this.mLastMotionX = f10 > 0.0f ? f11 + f12 : f11 - f12;
                    this.mLastMotionY = y11;
                } else if (fAbs2 > i11) {
                    this.mIsUnableToDrag = true;
                }
                if (this.mIsBeingDragged && performDrag(x11)) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
            }
        } else if (action == 6) {
            onSecondaryPointerUp(motionEvent);
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        return this.mIsBeingDragged;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ItemInfo itemInfoInfoForChild;
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int i16 = (i14 - paddingLeft) - paddingRight;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (!layoutParams.isDecor && (itemInfoInfoForChild = infoForChild(childAt)) != null) {
                    float f10 = i16;
                    int i18 = ((int) (itemInfoInfoForChild.offset * f10)) + paddingLeft;
                    if (layoutParams.needsMeasure) {
                        layoutParams.needsMeasure = false;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (f10 * layoutParams.widthFactor), 1073741824), View.MeasureSpec.makeMeasureSpec((i15 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt.layout(i18, paddingTop, childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + paddingTop);
                }
            }
        }
        if (this.mFirstLayout) {
            scrollToItem(this.mCurPosition, false, 0, false);
        }
        this.mFirstLayout = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        LayoutParams layoutParams;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt.getLayoutParams()) == null || !layoutParams.isDecor)) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft * 1, 1073741824), iMakeMeasureSpec);
            }
        }
    }

    protected void onPageScrolled(int i10, float f10, int i11) {
        dispatchOnPageScrolled(i10, f10, i11);
        this.mCalledSuper = true;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        ItemInfo itemInfoInfoForChild;
        int childCount = getChildCount();
        int i13 = -1;
        if ((i10 & 2) != 0) {
            i13 = childCount;
            i11 = 0;
            i12 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
        }
        while (i11 != i13) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (itemInfoInfoForChild = infoForChild(childAt)) != null && itemInfoInfoForChild.position == this.mCurPosition && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i12;
        }
        return false;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            recomputeScrollPosition(i10, i12, 0, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00d4  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        SocializePagerAdapter socializePagerAdapter;
        boolean zResetTouch = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (socializePagerAdapter = this.mAdapter) == null || socializePagerAdapter.getCount() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mScroller.abortAnimation();
            this.mPopulatePending = false;
            populate();
            float x10 = motionEvent.getX();
            this.mInitialMotionX = x10;
            this.mLastMotionX = x10;
            float y10 = motionEvent.getY();
            this.mInitialMotionY = y10;
            this.mLastMotionY = y10;
            this.mActivePointerId = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                        this.mLastMotionX = motionEvent.getX(actionIndex);
                        this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        onSecondaryPointerUp(motionEvent);
                        this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                    }
                } else if (this.mIsBeingDragged) {
                    scrollToItem(this.mCurPosition, true, 0, false);
                    zResetTouch = resetTouch();
                }
            } else if (!this.mIsBeingDragged) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                if (iFindPointerIndex == -1) {
                    zResetTouch = resetTouch();
                } else {
                    float x11 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x11 - this.mLastMotionX);
                    float y11 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y11 - this.mLastMotionY);
                    if (fAbs > this.mTouchSlop && fAbs > fAbs2) {
                        this.mIsBeingDragged = true;
                        requestParentDisallowInterceptTouchEvent(true);
                        float f10 = this.mInitialMotionX;
                        this.mLastMotionX = x11 - f10 > 0.0f ? f10 + this.mTouchSlop : f10 - this.mTouchSlop;
                        this.mLastMotionY = y11;
                        setScrollState(1);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.mIsBeingDragged) {
                        zResetTouch = false | performDrag(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                    }
                }
            } else if (this.mIsBeingDragged) {
                zResetTouch = false | performDrag(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
            }
        } else if (this.mIsBeingDragged) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int xVelocity = (int) VelocityTrackerCompat.getXVelocity(velocityTracker, this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            ItemInfo itemInfoInfoForCurrentScrollPosition = infoForCurrentScrollPosition();
            setCurrentItemInternal(determineTargetPage(itemInfoInfoForCurrentScrollPosition.position, ((scrollX / clientWidth) - itemInfoInfoForCurrentScrollPosition.offset) / 1.0f, xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
            zResetTouch = resetTouch();
        }
        if (zResetTouch) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        return true;
    }

    boolean pageLeft() {
        int i10 = this.mCurPosition;
        if (i10 <= 0) {
            return false;
        }
        setCurrentItem(i10 - 1, true);
        return true;
    }

    boolean pageRight() {
        SocializePagerAdapter socializePagerAdapter = this.mAdapter;
        if (socializePagerAdapter == null || this.mCurPosition >= socializePagerAdapter.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurPosition + 1, true);
        return true;
    }

    public void removeOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(onPageChangeListener);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(SocializePagerAdapter socializePagerAdapter) {
        SocializePagerAdapter socializePagerAdapter2 = this.mAdapter;
        if (socializePagerAdapter2 != null) {
            socializePagerAdapter2.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i10 = 0; i10 < this.mItems.size(); i10++) {
                ItemInfo itemInfo = this.mItems.get(i10);
                this.mAdapter.destroyItem((ViewGroup) this, itemInfo.position, itemInfo.object);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeAllViews();
            this.mCurPosition = 0;
            scrollTo(0, 0);
        }
        this.mAdapter = socializePagerAdapter;
        this.mExpectedAdapterCount = 0;
        if (socializePagerAdapter != null) {
            if (this.mObserver == null) {
                this.mObserver = new PagerObserver();
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z10 = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem < 0) {
                if (z10) {
                    requestLayout();
                    return;
                } else {
                    populate();
                    return;
                }
            }
            this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
            setCurrentItemInternal(this.mRestoredCurItem, false, true);
            this.mRestoredCurItem = -1;
            this.mRestoredAdapterState = null;
            this.mRestoredClassLoader = null;
        }
    }

    public void setCurrentItem(int i10) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i10, !this.mFirstLayout, false);
    }

    public void setCurrentItem(int i10, boolean z10) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i10, z10, false);
    }

    void setCurrentItemInternal(int i10, boolean z10, boolean z11) {
        setCurrentItemInternal(i10, z10, z11, 0);
    }

    void setCurrentItemInternal(int i10, boolean z10, boolean z11, int i11) {
        SocializePagerAdapter socializePagerAdapter = this.mAdapter;
        if (socializePagerAdapter == null || socializePagerAdapter.getCount() <= 0) {
            return;
        }
        if (z11 || this.mCurPosition != i10 || this.mItems.size() == 0) {
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.mAdapter.getCount()) {
                i10 = this.mAdapter.getCount() - 1;
            }
            int i12 = this.mOffscreenPageLimit;
            int i13 = this.mCurPosition;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < this.mItems.size(); i14++) {
                    this.mItems.get(i14).scrolling = true;
                }
            }
            boolean z12 = this.mCurPosition != i10;
            if (!this.mFirstLayout) {
                populate(i10);
                scrollToItem(i10, z10, i11, z12);
            } else {
                this.mCurPosition = i10;
                if (z12) {
                    dispatchOnPageSelected(i10);
                }
                requestLayout();
            }
        }
    }

    void setScrollState(int i10) {
        if (this.mScrollState == i10) {
            return;
        }
        this.mScrollState = i10;
        dispatchOnScrollStateChanged(i10);
    }

    void smoothScrollTo(int i10, int i11) {
        smoothScrollTo(i10, i11, 0);
    }

    void smoothScrollTo(int i10, int i11, int i12) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            return;
        }
        Scroller scroller = this.mScroller;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.mIsScrollStarted ? this.mScroller.getCurrX() : this.mScroller.getStartX();
            this.mScroller.abortAnimation();
        } else {
            scrollX = getScrollX();
        }
        int i13 = scrollX;
        int scrollY = getScrollY();
        int i14 = i10 - i13;
        int i15 = i11 - scrollY;
        if (i14 == 0 && i15 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i16 = clientWidth / 2;
        float f10 = clientWidth;
        float f11 = i16;
        float fDistanceInfluenceForSnapDuration = f11 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i14) * 1.0f) / f10)) * f11);
        int iAbs2 = Math.abs(i12);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fDistanceInfluenceForSnapDuration / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i14) / (f10 * this.mAdapter.getPageWidth(this.mCurPosition))) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i13, scrollY, i14, i15, iMin);
        ViewCompat.postInvalidateOnAnimation(this);
    }
}
