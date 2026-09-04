package com.flyco.tablayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.j0;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.flyco.tablayout.utils.UnreadMsgUtils;
import com.flyco.tablayout.widget.MsgView;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public class SlidingTabLayout extends HorizontalScrollView implements ViewPager.i {
    private static final int STYLE_BLOCK = 2;
    private static final int STYLE_NORMAL = 0;
    private static final int STYLE_TRIANGLE = 1;
    private static final int TEXT_BOLD_BOTH = 2;
    private static final int TEXT_BOLD_NONE = 0;
    private static final int TEXT_BOLD_WHEN_SELECT = 1;
    private Context mContext;
    private float mCurrentPositionOffset;
    private int mCurrentTab;
    private int mDividerColor;
    private float mDividerPadding;
    private Paint mDividerPaint;
    private float mDividerWidth;
    private int mHeight;
    private int mIndicatorColor;
    private float mIndicatorCornerRadius;
    private GradientDrawable mIndicatorDrawable;
    private int mIndicatorGravity;
    private float mIndicatorHeight;
    private float mIndicatorMarginBottom;
    private float mIndicatorMarginLeft;
    private float mIndicatorMarginRight;
    private float mIndicatorMarginTop;
    private Rect mIndicatorRect;
    private int mIndicatorStyle;
    private float mIndicatorWidth;
    private boolean mIndicatorWidthEqualTitle;
    private SparseArray<Boolean> mInitSetMap;
    private int mLastScrollX;
    private OnTabSelectListener mListener;
    private Paint mRectPaint;
    private boolean mSnapOnTabClick;
    private int mTabCount;
    private float mTabPadding;
    private Rect mTabRect;
    private boolean mTabSpaceEqual;
    private float mTabWidth;
    private LinearLayout mTabsContainer;
    private boolean mTextAllCaps;
    private int mTextBold;
    private Paint mTextPaint;
    private int mTextSelectColor;
    private int mTextUnselectColor;
    private float mTextsize;
    private ArrayList<String> mTitles;
    private Paint mTrianglePaint;
    private Path mTrianglePath;
    private int mUnderlineColor;
    private int mUnderlineGravity;
    private float mUnderlineHeight;
    private ViewPager mViewPager;
    private float margin;

    public class InnerPagerAdapter extends j0 {
        private ArrayList<Fragment> fragments;
        private String[] titles;

        public InnerPagerAdapter(FragmentManager fragmentManager, ArrayList<Fragment> arrayList, String[] strArr) {
            super(fragmentManager);
            new ArrayList();
            this.fragments = arrayList;
            this.titles = strArr;
        }

        @Override // androidx.fragment.app.j0, androidx.viewpager.widget.a
        public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return this.fragments.size();
        }

        @Override // androidx.fragment.app.j0
        public Fragment getItem(int i10) {
            return this.fragments.get(i10);
        }

        @Override // androidx.viewpager.widget.a
        public int getItemPosition(Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.a
        public CharSequence getPageTitle(int i10) {
            return this.titles[i10];
        }
    }

    public SlidingTabLayout(Context context) {
        this(context, null, 0);
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mIndicatorRect = new Rect();
        this.mTabRect = new Rect();
        this.mIndicatorDrawable = new GradientDrawable();
        this.mRectPaint = new Paint(1);
        this.mDividerPaint = new Paint(1);
        this.mTrianglePaint = new Paint(1);
        this.mTrianglePath = new Path();
        this.mIndicatorStyle = 0;
        this.mTextPaint = new Paint(1);
        this.mInitSetMap = new SparseArray<>();
        setFillViewport(true);
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.mContext = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.mTabsContainer = linearLayout;
        addView(linearLayout);
        obtainAttributes(context, attributeSet);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_height");
        if (attributeValue.equals("-1") || attributeValue.equals("-2")) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.layout_height});
        this.mHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -2);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void addTab(int i10, String str, View view) {
        TextView textView = (TextView) view.findViewById(R.id.tv_tab_title);
        if (textView != null && str != null) {
            textView.setText(str);
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.flyco.tablayout.SlidingTabLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                int iIndexOfChild = SlidingTabLayout.this.mTabsContainer.indexOfChild(view2);
                if (iIndexOfChild != -1) {
                    if (SlidingTabLayout.this.mViewPager.getCurrentItem() == iIndexOfChild) {
                        if (SlidingTabLayout.this.mListener != null) {
                            SlidingTabLayout.this.mListener.onTabReselect(iIndexOfChild);
                        }
                    } else {
                        if (SlidingTabLayout.this.mSnapOnTabClick) {
                            SlidingTabLayout.this.mViewPager.setCurrentItem(iIndexOfChild, false);
                        } else {
                            SlidingTabLayout.this.mViewPager.setCurrentItem(iIndexOfChild);
                        }
                        if (SlidingTabLayout.this.mListener != null) {
                            SlidingTabLayout.this.mListener.onTabSelect(iIndexOfChild);
                        }
                    }
                }
            }
        });
        LinearLayout.LayoutParams layoutParams = this.mTabSpaceEqual ? new LinearLayout.LayoutParams(0, -1, 1.0f) : new LinearLayout.LayoutParams(-2, -1);
        if (this.mTabWidth > 0.0f) {
            layoutParams = new LinearLayout.LayoutParams((int) this.mTabWidth, -1);
        }
        this.mTabsContainer.addView(view, i10, layoutParams);
    }

    private void calcIndicatorRect() {
        View childAt = this.mTabsContainer.getChildAt(this.mCurrentTab);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.mIndicatorStyle == 0 && this.mIndicatorWidthEqualTitle) {
            TextView textView = (TextView) childAt.findViewById(R.id.tv_tab_title);
            this.mTextPaint.setTextSize(this.mTextsize);
            this.margin = ((right - left) - this.mTextPaint.measureText(textView.getText().toString())) / 2.0f;
        }
        int i10 = this.mCurrentTab;
        if (i10 < this.mTabCount - 1) {
            View childAt2 = this.mTabsContainer.getChildAt(i10 + 1);
            float left2 = childAt2.getLeft();
            float right2 = childAt2.getRight();
            float f10 = this.mCurrentPositionOffset;
            left += (left2 - left) * f10;
            right += f10 * (right2 - right);
            if (this.mIndicatorStyle == 0 && this.mIndicatorWidthEqualTitle) {
                TextView textView2 = (TextView) childAt2.findViewById(R.id.tv_tab_title);
                this.mTextPaint.setTextSize(this.mTextsize);
                float fMeasureText = ((right2 - left2) - this.mTextPaint.measureText(textView2.getText().toString())) / 2.0f;
                float f11 = this.margin;
                this.margin = f11 + (this.mCurrentPositionOffset * (fMeasureText - f11));
            }
        }
        Rect rect = this.mIndicatorRect;
        int i11 = (int) left;
        rect.left = i11;
        int i12 = (int) right;
        rect.right = i12;
        if (this.mIndicatorStyle == 0 && this.mIndicatorWidthEqualTitle) {
            float f12 = this.margin;
            rect.left = (int) ((left + f12) - 1.0f);
            rect.right = (int) ((right - f12) - 1.0f);
        }
        Rect rect2 = this.mTabRect;
        rect2.left = i11;
        rect2.right = i12;
        if (this.mIndicatorWidth < 0.0f) {
            return;
        }
        float left3 = childAt.getLeft() + ((childAt.getWidth() - this.mIndicatorWidth) / 2.0f);
        int i13 = this.mCurrentTab;
        if (i13 < this.mTabCount - 1) {
            left3 += this.mCurrentPositionOffset * ((childAt.getWidth() / 2) + (this.mTabsContainer.getChildAt(i13 + 1).getWidth() / 2));
        }
        Rect rect3 = this.mIndicatorRect;
        int i14 = (int) left3;
        rect3.left = i14;
        rect3.right = (int) (i14 + this.mIndicatorWidth);
    }

    private void obtainAttributes(Context context, AttributeSet attributeSet) {
        float f10;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SlidingTabLayout);
        int i10 = typedArrayObtainStyledAttributes.getInt(R.styleable.SlidingTabLayout_tl_indicator_style, 0);
        this.mIndicatorStyle = i10;
        this.mIndicatorColor = typedArrayObtainStyledAttributes.getColor(R.styleable.SlidingTabLayout_tl_indicator_color, Color.parseColor(i10 == 2 ? "#4B6A87" : "#ffffff"));
        int i11 = R.styleable.SlidingTabLayout_tl_indicator_height;
        int i12 = this.mIndicatorStyle;
        if (i12 == 1) {
            f10 = 4.0f;
        } else {
            f10 = i12 == 2 ? -1 : 2;
        }
        this.mIndicatorHeight = typedArrayObtainStyledAttributes.getDimension(i11, dp2px(f10));
        this.mIndicatorWidth = typedArrayObtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_indicator_width, dp2px(this.mIndicatorStyle == 1 ? 10.0f : -1.0f));
        this.mIndicatorCornerRadius = typedArrayObtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_indicator_corner_radius, dp2px(this.mIndicatorStyle == 2 ? -1.0f : 0.0f));
        this.mIndicatorMarginLeft = typedArrayObtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_indicator_margin_left, dp2px(0.0f));
        this.mIndicatorMarginTop = typedArrayObtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_indicator_margin_top, dp2px(this.mIndicatorStyle == 2 ? 7.0f : 0.0f));
        this.mIndicatorMarginRight = typedArrayObtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_indicator_margin_right, dp2px(0.0f));
        this.mIndicatorMarginBottom = typedArrayObtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_indicator_margin_bottom, dp2px(this.mIndicatorStyle != 2 ? 0.0f : 7.0f));
        this.mIndicatorGravity = typedArrayObtainStyledAttributes.getInt(R.styleable.SlidingTabLayout_tl_indicator_gravity, 80);
        this.mIndicatorWidthEqualTitle = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SlidingTabLayout_tl_indicator_width_equal_title, false);
        this.mUnderlineColor = typedArrayObtainStyledAttributes.getColor(R.styleable.SlidingTabLayout_tl_underline_color, Color.parseColor("#ffffff"));
        this.mUnderlineHeight = typedArrayObtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_underline_height, dp2px(0.0f));
        this.mUnderlineGravity = typedArrayObtainStyledAttributes.getInt(R.styleable.SlidingTabLayout_tl_underline_gravity, 80);
        this.mDividerColor = typedArrayObtainStyledAttributes.getColor(R.styleable.SlidingTabLayout_tl_divider_color, Color.parseColor("#ffffff"));
        this.mDividerWidth = typedArrayObtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_divider_width, dp2px(0.0f));
        this.mDividerPadding = typedArrayObtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_divider_padding, dp2px(12.0f));
        this.mTextsize = typedArrayObtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_textsize, sp2px(14.0f));
        this.mTextSelectColor = typedArrayObtainStyledAttributes.getColor(R.styleable.SlidingTabLayout_tl_textSelectColor, Color.parseColor("#ffffff"));
        this.mTextUnselectColor = typedArrayObtainStyledAttributes.getColor(R.styleable.SlidingTabLayout_tl_textUnselectColor, Color.parseColor("#AAffffff"));
        this.mTextBold = typedArrayObtainStyledAttributes.getInt(R.styleable.SlidingTabLayout_tl_textBold, 0);
        this.mTextAllCaps = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SlidingTabLayout_tl_textAllCaps, false);
        this.mTabSpaceEqual = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SlidingTabLayout_tl_tab_space_equal, false);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_tab_width, dp2px(-1.0f));
        this.mTabWidth = dimension;
        this.mTabPadding = typedArrayObtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_tab_padding, (this.mTabSpaceEqual || dimension > 0.0f) ? dp2px(0.0f) : dp2px(20.0f));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void scrollToCurrentTab() {
        if (this.mTabCount <= 0) {
            return;
        }
        int width = (int) (this.mCurrentPositionOffset * this.mTabsContainer.getChildAt(this.mCurrentTab).getWidth());
        int left = this.mTabsContainer.getChildAt(this.mCurrentTab).getLeft() + width;
        if (this.mCurrentTab > 0 || width > 0) {
            int width2 = left - ((getWidth() / 2) - getPaddingLeft());
            calcIndicatorRect();
            Rect rect = this.mTabRect;
            left = width2 + ((rect.right - rect.left) / 2);
        }
        if (left != this.mLastScrollX) {
            this.mLastScrollX = left;
            scrollTo(left, 0);
        }
    }

    private void updateTabSelection(int i10) {
        int i11 = 0;
        while (i11 < this.mTabCount) {
            View childAt = this.mTabsContainer.getChildAt(i11);
            boolean z10 = i11 == i10;
            TextView textView = (TextView) childAt.findViewById(R.id.tv_tab_title);
            if (textView != null) {
                textView.setTextColor(z10 ? this.mTextSelectColor : this.mTextUnselectColor);
                if (this.mTextBold == 1) {
                    textView.getPaint().setFakeBoldText(z10);
                }
            }
            i11++;
        }
    }

    private void updateTabStyles() {
        int i10 = 0;
        while (i10 < this.mTabCount) {
            TextView textView = (TextView) this.mTabsContainer.getChildAt(i10).findViewById(R.id.tv_tab_title);
            if (textView != null) {
                textView.setTextColor(i10 == this.mCurrentTab ? this.mTextSelectColor : this.mTextUnselectColor);
                textView.setTextSize(0, this.mTextsize);
                float f10 = this.mTabPadding;
                textView.setPadding((int) f10, 0, (int) f10, 0);
                if (this.mTextAllCaps) {
                    textView.setText(textView.getText().toString().toUpperCase());
                }
                int i11 = this.mTextBold;
                if (i11 == 2) {
                    textView.getPaint().setFakeBoldText(true);
                } else if (i11 == 1) {
                    if (i10 == 0) {
                        textView.getPaint().setFakeBoldText(true);
                    }
                } else if (i11 == 0) {
                    textView.getPaint().setFakeBoldText(false);
                }
            }
            i10++;
        }
    }

    public void addNewTab(String str) {
        View viewInflate = View.inflate(this.mContext, R.layout.layout_tab, null);
        ArrayList<String> arrayList = this.mTitles;
        if (arrayList != null) {
            arrayList.add(str);
        }
        ArrayList<String> arrayList2 = this.mTitles;
        addTab(this.mTabCount, (arrayList2 == null ? this.mViewPager.getAdapter().getPageTitle(this.mTabCount) : arrayList2.get(this.mTabCount)).toString(), viewInflate);
        ArrayList<String> arrayList3 = this.mTitles;
        this.mTabCount = arrayList3 == null ? this.mViewPager.getAdapter().getCount() : arrayList3.size();
        updateTabStyles();
    }

    protected int dp2px(float f10) {
        return (int) ((f10 * this.mContext.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public int getCurrentTab() {
        return this.mCurrentTab;
    }

    public int getDividerColor() {
        return this.mDividerColor;
    }

    public float getDividerPadding() {
        return this.mDividerPadding;
    }

    public float getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getIndicatorColor() {
        return this.mIndicatorColor;
    }

    public float getIndicatorCornerRadius() {
        return this.mIndicatorCornerRadius;
    }

    public float getIndicatorHeight() {
        return this.mIndicatorHeight;
    }

    public float getIndicatorMarginBottom() {
        return this.mIndicatorMarginBottom;
    }

    public float getIndicatorMarginLeft() {
        return this.mIndicatorMarginLeft;
    }

    public float getIndicatorMarginRight() {
        return this.mIndicatorMarginRight;
    }

    public float getIndicatorMarginTop() {
        return this.mIndicatorMarginTop;
    }

    public int getIndicatorStyle() {
        return this.mIndicatorStyle;
    }

    public float getIndicatorWidth() {
        return this.mIndicatorWidth;
    }

    public MsgView getMsgView(int i10) {
        int i11 = this.mTabCount;
        if (i10 >= i11) {
            i10 = i11 - 1;
        }
        return (MsgView) this.mTabsContainer.getChildAt(i10).findViewById(R.id.rtv_msg_tip);
    }

    public int getTabCount() {
        return this.mTabCount;
    }

    public float getTabPadding() {
        return this.mTabPadding;
    }

    public float getTabWidth() {
        return this.mTabWidth;
    }

    public int getTextBold() {
        return this.mTextBold;
    }

    public int getTextSelectColor() {
        return this.mTextSelectColor;
    }

    public int getTextUnselectColor() {
        return this.mTextUnselectColor;
    }

    public float getTextsize() {
        return this.mTextsize;
    }

    public TextView getTitleView(int i10) {
        return (TextView) this.mTabsContainer.getChildAt(i10).findViewById(R.id.tv_tab_title);
    }

    public int getUnderlineColor() {
        return this.mUnderlineColor;
    }

    public float getUnderlineHeight() {
        return this.mUnderlineHeight;
    }

    public void hideMsg(int i10) {
        int i11 = this.mTabCount;
        if (i10 >= i11) {
            i10 = i11 - 1;
        }
        MsgView msgView = (MsgView) this.mTabsContainer.getChildAt(i10).findViewById(R.id.rtv_msg_tip);
        if (msgView != null) {
            msgView.setVisibility(8);
        }
    }

    public boolean isTabSpaceEqual() {
        return this.mTabSpaceEqual;
    }

    public boolean isTextAllCaps() {
        return this.mTextAllCaps;
    }

    public void notifyDataSetChanged() {
        this.mTabsContainer.removeAllViews();
        ArrayList<String> arrayList = this.mTitles;
        this.mTabCount = arrayList == null ? this.mViewPager.getAdapter().getCount() : arrayList.size();
        for (int i10 = 0; i10 < this.mTabCount; i10++) {
            View viewInflate = View.inflate(this.mContext, R.layout.layout_tab, null);
            ArrayList<String> arrayList2 = this.mTitles;
            addTab(i10, (arrayList2 == null ? this.mViewPager.getAdapter().getPageTitle(i10) : arrayList2.get(i10)).toString(), viewInflate);
        }
        updateTabStyles();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || this.mTabCount <= 0) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        float f10 = this.mDividerWidth;
        if (f10 > 0.0f) {
            this.mDividerPaint.setStrokeWidth(f10);
            this.mDividerPaint.setColor(this.mDividerColor);
            for (int i10 = 0; i10 < this.mTabCount - 1; i10++) {
                View childAt = this.mTabsContainer.getChildAt(i10);
                canvas.drawLine(childAt.getRight() + paddingLeft, this.mDividerPadding, childAt.getRight() + paddingLeft, height - this.mDividerPadding, this.mDividerPaint);
            }
        }
        if (this.mUnderlineHeight > 0.0f) {
            this.mRectPaint.setColor(this.mUnderlineColor);
            if (this.mUnderlineGravity == 80) {
                float f11 = height;
                canvas.drawRect(paddingLeft, f11 - this.mUnderlineHeight, this.mTabsContainer.getWidth() + paddingLeft, f11, this.mRectPaint);
            } else {
                canvas.drawRect(paddingLeft, 0.0f, this.mTabsContainer.getWidth() + paddingLeft, this.mUnderlineHeight, this.mRectPaint);
            }
        }
        calcIndicatorRect();
        int i11 = this.mIndicatorStyle;
        if (i11 == 1) {
            if (this.mIndicatorHeight > 0.0f) {
                this.mTrianglePaint.setColor(this.mIndicatorColor);
                this.mTrianglePath.reset();
                float f12 = height;
                this.mTrianglePath.moveTo(this.mIndicatorRect.left + paddingLeft, f12);
                Path path = this.mTrianglePath;
                Rect rect = this.mIndicatorRect;
                path.lineTo((rect.left / 2) + paddingLeft + (rect.right / 2), f12 - this.mIndicatorHeight);
                this.mTrianglePath.lineTo(paddingLeft + this.mIndicatorRect.right, f12);
                this.mTrianglePath.close();
                canvas.drawPath(this.mTrianglePath, this.mTrianglePaint);
                return;
            }
            return;
        }
        if (i11 == 2) {
            if (this.mIndicatorHeight < 0.0f) {
                this.mIndicatorHeight = (height - this.mIndicatorMarginTop) - this.mIndicatorMarginBottom;
            }
            float f13 = this.mIndicatorHeight;
            if (f13 > 0.0f) {
                float f14 = this.mIndicatorCornerRadius;
                if (f14 < 0.0f || f14 > f13 / 2.0f) {
                    this.mIndicatorCornerRadius = f13 / 2.0f;
                }
                this.mIndicatorDrawable.setColor(this.mIndicatorColor);
                GradientDrawable gradientDrawable = this.mIndicatorDrawable;
                int i12 = ((int) this.mIndicatorMarginLeft) + paddingLeft;
                Rect rect2 = this.mIndicatorRect;
                int i13 = i12 + rect2.left;
                float f15 = this.mIndicatorMarginTop;
                gradientDrawable.setBounds(i13, (int) f15, (int) ((paddingLeft + rect2.right) - this.mIndicatorMarginRight), (int) (f15 + this.mIndicatorHeight));
                this.mIndicatorDrawable.setCornerRadius(this.mIndicatorCornerRadius);
                this.mIndicatorDrawable.draw(canvas);
                return;
            }
            return;
        }
        if (this.mIndicatorHeight > 0.0f) {
            this.mIndicatorDrawable.setColor(this.mIndicatorColor);
            if (this.mIndicatorGravity == 80) {
                GradientDrawable gradientDrawable2 = this.mIndicatorDrawable;
                int i14 = ((int) this.mIndicatorMarginLeft) + paddingLeft;
                Rect rect3 = this.mIndicatorRect;
                int i15 = i14 + rect3.left;
                int i16 = height - ((int) this.mIndicatorHeight);
                float f16 = this.mIndicatorMarginBottom;
                gradientDrawable2.setBounds(i15, i16 - ((int) f16), (paddingLeft + rect3.right) - ((int) this.mIndicatorMarginRight), height - ((int) f16));
            } else {
                GradientDrawable gradientDrawable3 = this.mIndicatorDrawable;
                int i17 = ((int) this.mIndicatorMarginLeft) + paddingLeft;
                Rect rect4 = this.mIndicatorRect;
                int i18 = i17 + rect4.left;
                float f17 = this.mIndicatorMarginTop;
                gradientDrawable3.setBounds(i18, (int) f17, (paddingLeft + rect4.right) - ((int) this.mIndicatorMarginRight), ((int) this.mIndicatorHeight) + ((int) f17));
            }
            this.mIndicatorDrawable.setCornerRadius(this.mIndicatorCornerRadius);
            this.mIndicatorDrawable.draw(canvas);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void onPageScrollStateChanged(int i10) {
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void onPageScrolled(int i10, float f10, int i11) {
        this.mCurrentTab = i10;
        this.mCurrentPositionOffset = f10;
        scrollToCurrentTab();
        invalidate();
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void onPageSelected(int i10) {
        updateTabSelection(i10);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.mCurrentTab = bundle.getInt("mCurrentTab");
            parcelable = bundle.getParcelable("instanceState");
            if (this.mCurrentTab != 0 && this.mTabsContainer.getChildCount() > 0) {
                updateTabSelection(this.mCurrentTab);
                scrollToCurrentTab();
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mCurrentTab", this.mCurrentTab);
        return bundle;
    }

    public void setCurrentTab(int i10) {
        this.mCurrentTab = i10;
        this.mViewPager.setCurrentItem(i10);
    }

    public void setCurrentTab(int i10, boolean z10) {
        this.mCurrentTab = i10;
        this.mViewPager.setCurrentItem(i10, z10);
    }

    public void setDividerColor(int i10) {
        this.mDividerColor = i10;
        invalidate();
    }

    public void setDividerPadding(float f10) {
        this.mDividerPadding = dp2px(f10);
        invalidate();
    }

    public void setDividerWidth(float f10) {
        this.mDividerWidth = dp2px(f10);
        invalidate();
    }

    public void setIndicatorColor(int i10) {
        this.mIndicatorColor = i10;
        invalidate();
    }

    public void setIndicatorCornerRadius(float f10) {
        this.mIndicatorCornerRadius = dp2px(f10);
        invalidate();
    }

    public void setIndicatorGravity(int i10) {
        this.mIndicatorGravity = i10;
        invalidate();
    }

    public void setIndicatorHeight(float f10) {
        this.mIndicatorHeight = dp2px(f10);
        invalidate();
    }

    public void setIndicatorMargin(float f10, float f11, float f12, float f13) {
        this.mIndicatorMarginLeft = dp2px(f10);
        this.mIndicatorMarginTop = dp2px(f11);
        this.mIndicatorMarginRight = dp2px(f12);
        this.mIndicatorMarginBottom = dp2px(f13);
        invalidate();
    }

    public void setIndicatorStyle(int i10) {
        this.mIndicatorStyle = i10;
        invalidate();
    }

    public void setIndicatorWidth(float f10) {
        this.mIndicatorWidth = dp2px(f10);
        invalidate();
    }

    public void setIndicatorWidthEqualTitle(boolean z10) {
        this.mIndicatorWidthEqualTitle = z10;
        invalidate();
    }

    public void setMsgMargin(int i10, float f10, float f11) {
        float f12;
        int i11 = this.mTabCount;
        if (i10 >= i11) {
            i10 = i11 - 1;
        }
        View childAt = this.mTabsContainer.getChildAt(i10);
        MsgView msgView = (MsgView) childAt.findViewById(R.id.rtv_msg_tip);
        if (msgView != null) {
            TextView textView = (TextView) childAt.findViewById(R.id.tv_tab_title);
            this.mTextPaint.setTextSize(this.mTextsize);
            float fMeasureText = this.mTextPaint.measureText(textView.getText().toString());
            float fDescent = this.mTextPaint.descent() - this.mTextPaint.ascent();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) msgView.getLayoutParams();
            float f13 = this.mTabWidth;
            if (f13 >= 0.0f) {
                f12 = f13 / 2.0f;
                fMeasureText /= 2.0f;
            } else {
                f12 = this.mTabPadding;
            }
            marginLayoutParams.leftMargin = (int) (f12 + fMeasureText + dp2px(f10));
            int i12 = this.mHeight;
            marginLayoutParams.topMargin = i12 > 0 ? (((int) (i12 - fDescent)) / 2) - dp2px(f11) : 0;
            msgView.setLayoutParams(marginLayoutParams);
        }
    }

    public void setOnTabSelectListener(OnTabSelectListener onTabSelectListener) {
        this.mListener = onTabSelectListener;
    }

    public void setSnapOnTabClick(boolean z10) {
        this.mSnapOnTabClick = z10;
    }

    public void setTabPadding(float f10) {
        this.mTabPadding = dp2px(f10);
        updateTabStyles();
    }

    public void setTabSpaceEqual(boolean z10) {
        this.mTabSpaceEqual = z10;
        updateTabStyles();
    }

    public void setTabWidth(float f10) {
        this.mTabWidth = dp2px(f10);
        updateTabStyles();
    }

    public void setTextAllCaps(boolean z10) {
        this.mTextAllCaps = z10;
        updateTabStyles();
    }

    public void setTextBold(int i10) {
        this.mTextBold = i10;
        updateTabStyles();
    }

    public void setTextSelectColor(int i10) {
        this.mTextSelectColor = i10;
        updateTabStyles();
    }

    public void setTextUnselectColor(int i10) {
        this.mTextUnselectColor = i10;
        updateTabStyles();
    }

    public void setTextsize(float f10) {
        this.mTextsize = sp2px(f10);
        updateTabStyles();
    }

    public void setUnderlineColor(int i10) {
        this.mUnderlineColor = i10;
        invalidate();
    }

    public void setUnderlineGravity(int i10) {
        this.mUnderlineGravity = i10;
        invalidate();
    }

    public void setUnderlineHeight(float f10) {
        this.mUnderlineHeight = dp2px(f10);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        if (viewPager == null || viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager or ViewPager adapter can not be NULL !");
        }
        this.mViewPager = viewPager;
        viewPager.O(this);
        this.mViewPager.c(this);
        notifyDataSetChanged();
    }

    public void setViewPager(ViewPager viewPager, String[] strArr) {
        if (viewPager == null || viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager or ViewPager adapter can not be NULL !");
        }
        if (strArr == null || strArr.length == 0) {
            throw new IllegalStateException("Titles can not be EMPTY !");
        }
        if (strArr.length != viewPager.getAdapter().getCount()) {
            throw new IllegalStateException("Titles length must be the same as the page count !");
        }
        this.mViewPager = viewPager;
        ArrayList<String> arrayList = new ArrayList<>();
        this.mTitles = arrayList;
        Collections.addAll(arrayList, strArr);
        this.mViewPager.O(this);
        this.mViewPager.c(this);
        notifyDataSetChanged();
    }

    public void setViewPager(ViewPager viewPager, String[] strArr, FragmentActivity fragmentActivity, ArrayList<Fragment> arrayList) {
        if (viewPager == null) {
            throw new IllegalStateException("ViewPager can not be NULL !");
        }
        if (strArr == null || strArr.length == 0) {
            throw new IllegalStateException("Titles can not be EMPTY !");
        }
        this.mViewPager = viewPager;
        viewPager.setAdapter(new InnerPagerAdapter(fragmentActivity.getSupportFragmentManager(), arrayList, strArr));
        this.mViewPager.O(this);
        this.mViewPager.c(this);
        notifyDataSetChanged();
    }

    public void showDot(int i10) {
        int i11 = this.mTabCount;
        if (i10 >= i11) {
            i10 = i11 - 1;
        }
        showMsg(i10, 0);
    }

    public void showMsg(int i10, int i11) {
        int i12 = this.mTabCount;
        if (i10 >= i12) {
            i10 = i12 - 1;
        }
        MsgView msgView = (MsgView) this.mTabsContainer.getChildAt(i10).findViewById(R.id.rtv_msg_tip);
        if (msgView != null) {
            UnreadMsgUtils.show(msgView, i11);
            if (this.mInitSetMap.get(i10) == null || !this.mInitSetMap.get(i10).booleanValue()) {
                setMsgMargin(i10, 4.0f, 2.0f);
                this.mInitSetMap.put(i10, Boolean.TRUE);
            }
        }
    }

    protected int sp2px(float f10) {
        return (int) ((f10 * this.mContext.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
