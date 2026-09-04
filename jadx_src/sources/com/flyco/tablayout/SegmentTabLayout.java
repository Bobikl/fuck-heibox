package com.flyco.tablayout;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.flyco.tablayout.utils.FragmentChangeManager;
import com.flyco.tablayout.utils.UnreadMsgUtils;
import com.flyco.tablayout.widget.MsgView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class SegmentTabLayout extends FrameLayout implements ValueAnimator.AnimatorUpdateListener {
    private static final int TEXT_BOLD_BOTH = 2;
    private static final int TEXT_BOLD_NONE = 0;
    private static final int TEXT_BOLD_WHEN_SELECT = 1;
    private int mBarColor;
    private int mBarStrokeColor;
    private float mBarStrokeWidth;
    private Context mContext;
    private IndicatorPoint mCurrentP;
    private int mCurrentTab;
    private int mDividerColor;
    private float mDividerPadding;
    private Paint mDividerPaint;
    private float mDividerWidth;
    private FragmentChangeManager mFragmentChangeManager;
    private int mHeight;
    private long mIndicatorAnimDuration;
    private boolean mIndicatorAnimEnable;
    private boolean mIndicatorBounceEnable;
    private int mIndicatorColor;
    private float mIndicatorCornerRadius;
    private GradientDrawable mIndicatorDrawable;
    private float mIndicatorHeight;
    private float mIndicatorMarginBottom;
    private float mIndicatorMarginLeft;
    private float mIndicatorMarginRight;
    private float mIndicatorMarginTop;
    private Rect mIndicatorRect;
    private SparseArray<Boolean> mInitSetMap;
    private OvershootInterpolator mInterpolator;
    private boolean mIsFirstDraw;
    private IndicatorPoint mLastP;
    private int mLastTab;
    private OnTabSelectListener mListener;
    private float[] mRadiusArr;
    private GradientDrawable mRectDrawable;
    private int mTabCount;
    private float mTabPadding;
    private boolean mTabSpaceEqual;
    private float mTabWidth;
    private LinearLayout mTabsContainer;
    private boolean mTextAllCaps;
    private int mTextBold;
    private Paint mTextPaint;
    private int mTextSelectColor;
    private int mTextUnselectColor;
    private float mTextsize;
    private String[] mTitles;
    private ValueAnimator mValueAnimator;

    public class IndicatorPoint {
        public float left;
        public float right;

        IndicatorPoint() {
        }
    }

    public class PointEvaluator implements TypeEvaluator<IndicatorPoint> {
        PointEvaluator() {
        }

        @Override // android.animation.TypeEvaluator
        public IndicatorPoint evaluate(float f10, IndicatorPoint indicatorPoint, IndicatorPoint indicatorPoint2) {
            float f11 = indicatorPoint.left;
            float f12 = f11 + ((indicatorPoint2.left - f11) * f10);
            float f13 = indicatorPoint.right;
            float f14 = f13 + (f10 * (indicatorPoint2.right - f13));
            IndicatorPoint indicatorPoint3 = SegmentTabLayout.this.new IndicatorPoint();
            indicatorPoint3.left = f12;
            indicatorPoint3.right = f14;
            return indicatorPoint3;
        }
    }

    public SegmentTabLayout(Context context) {
        this(context, null, 0);
    }

    public SegmentTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SegmentTabLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mIndicatorRect = new Rect();
        this.mIndicatorDrawable = new GradientDrawable();
        this.mRectDrawable = new GradientDrawable();
        this.mDividerPaint = new Paint(1);
        this.mInterpolator = new OvershootInterpolator(0.8f);
        this.mRadiusArr = new float[8];
        this.mIsFirstDraw = true;
        this.mTextPaint = new Paint(1);
        this.mInitSetMap = new SparseArray<>();
        this.mCurrentP = new IndicatorPoint();
        this.mLastP = new IndicatorPoint();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.mContext = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.mTabsContainer = linearLayout;
        addView(linearLayout);
        obtainAttributes(context, attributeSet);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_height");
        if (!attributeValue.equals("-1") && !attributeValue.equals("-2")) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.layout_height});
            this.mHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -2);
            typedArrayObtainStyledAttributes.recycle();
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new PointEvaluator(), this.mLastP, this.mCurrentP);
        this.mValueAnimator = valueAnimatorOfObject;
        valueAnimatorOfObject.addUpdateListener(this);
    }

    private void addTab(int i10, View view) {
        ((TextView) view.findViewById(R.id.tv_tab_title)).setText(this.mTitles[i10]);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.flyco.tablayout.SegmentTabLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                int iIntValue = ((Integer) view2.getTag()).intValue();
                if (SegmentTabLayout.this.mCurrentTab == iIntValue) {
                    if (SegmentTabLayout.this.mListener != null) {
                        SegmentTabLayout.this.mListener.onTabReselect(iIntValue);
                    }
                } else {
                    SegmentTabLayout.this.setCurrentTab(iIntValue);
                    if (SegmentTabLayout.this.mListener != null) {
                        SegmentTabLayout.this.mListener.onTabSelect(iIntValue);
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
        Rect rect = this.mIndicatorRect;
        rect.left = (int) left;
        rect.right = (int) right;
        if (this.mIndicatorAnimEnable) {
            float[] fArr = this.mRadiusArr;
            float f10 = this.mIndicatorCornerRadius;
            fArr[0] = f10;
            fArr[1] = f10;
            fArr[2] = f10;
            fArr[3] = f10;
            fArr[4] = f10;
            fArr[5] = f10;
            fArr[6] = f10;
            fArr[7] = f10;
            return;
        }
        int i10 = this.mCurrentTab;
        if (i10 == 0) {
            float[] fArr2 = this.mRadiusArr;
            float f11 = this.mIndicatorCornerRadius;
            fArr2[0] = f11;
            fArr2[1] = f11;
            fArr2[2] = 0.0f;
            fArr2[3] = 0.0f;
            fArr2[4] = 0.0f;
            fArr2[5] = 0.0f;
            fArr2[6] = f11;
            fArr2[7] = f11;
            return;
        }
        if (i10 != this.mTabCount - 1) {
            float[] fArr3 = this.mRadiusArr;
            fArr3[0] = 0.0f;
            fArr3[1] = 0.0f;
            fArr3[2] = 0.0f;
            fArr3[3] = 0.0f;
            fArr3[4] = 0.0f;
            fArr3[5] = 0.0f;
            fArr3[6] = 0.0f;
            fArr3[7] = 0.0f;
            return;
        }
        float[] fArr4 = this.mRadiusArr;
        fArr4[0] = 0.0f;
        fArr4[1] = 0.0f;
        float f12 = this.mIndicatorCornerRadius;
        fArr4[2] = f12;
        fArr4[3] = f12;
        fArr4[4] = f12;
        fArr4[5] = f12;
        fArr4[6] = 0.0f;
        fArr4[7] = 0.0f;
    }

    private void calcOffset() {
        View childAt = this.mTabsContainer.getChildAt(this.mCurrentTab);
        this.mCurrentP.left = childAt.getLeft();
        this.mCurrentP.right = childAt.getRight();
        View childAt2 = this.mTabsContainer.getChildAt(this.mLastTab);
        this.mLastP.left = childAt2.getLeft();
        this.mLastP.right = childAt2.getRight();
        IndicatorPoint indicatorPoint = this.mLastP;
        float f10 = indicatorPoint.left;
        IndicatorPoint indicatorPoint2 = this.mCurrentP;
        if (f10 == indicatorPoint2.left && indicatorPoint.right == indicatorPoint2.right) {
            invalidate();
            return;
        }
        this.mValueAnimator.setObjectValues(indicatorPoint, indicatorPoint2);
        if (this.mIndicatorBounceEnable) {
            this.mValueAnimator.setInterpolator(this.mInterpolator);
        }
        if (this.mIndicatorAnimDuration < 0) {
            this.mIndicatorAnimDuration = this.mIndicatorBounceEnable ? 500L : 250L;
        }
        this.mValueAnimator.setDuration(this.mIndicatorAnimDuration);
        this.mValueAnimator.start();
    }

    private void obtainAttributes(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SegmentTabLayout);
        this.mIndicatorColor = typedArrayObtainStyledAttributes.getColor(R.styleable.SegmentTabLayout_tl_indicator_color, Color.parseColor("#222831"));
        this.mIndicatorHeight = typedArrayObtainStyledAttributes.getDimension(R.styleable.SegmentTabLayout_tl_indicator_height, -1.0f);
        this.mIndicatorCornerRadius = typedArrayObtainStyledAttributes.getDimension(R.styleable.SegmentTabLayout_tl_indicator_corner_radius, -1.0f);
        this.mIndicatorMarginLeft = typedArrayObtainStyledAttributes.getDimension(R.styleable.SegmentTabLayout_tl_indicator_margin_left, dp2px(0.0f));
        this.mIndicatorMarginTop = typedArrayObtainStyledAttributes.getDimension(R.styleable.SegmentTabLayout_tl_indicator_margin_top, 0.0f);
        this.mIndicatorMarginRight = typedArrayObtainStyledAttributes.getDimension(R.styleable.SegmentTabLayout_tl_indicator_margin_right, dp2px(0.0f));
        this.mIndicatorMarginBottom = typedArrayObtainStyledAttributes.getDimension(R.styleable.SegmentTabLayout_tl_indicator_margin_bottom, 0.0f);
        this.mIndicatorAnimEnable = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SegmentTabLayout_tl_indicator_anim_enable, false);
        this.mIndicatorBounceEnable = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SegmentTabLayout_tl_indicator_bounce_enable, true);
        this.mIndicatorAnimDuration = typedArrayObtainStyledAttributes.getInt(R.styleable.SegmentTabLayout_tl_indicator_anim_duration, -1);
        this.mDividerColor = typedArrayObtainStyledAttributes.getColor(R.styleable.SegmentTabLayout_tl_divider_color, this.mIndicatorColor);
        this.mDividerWidth = typedArrayObtainStyledAttributes.getDimension(R.styleable.SegmentTabLayout_tl_divider_width, dp2px(1.0f));
        this.mDividerPadding = typedArrayObtainStyledAttributes.getDimension(R.styleable.SegmentTabLayout_tl_divider_padding, 0.0f);
        this.mTextsize = typedArrayObtainStyledAttributes.getDimension(R.styleable.SegmentTabLayout_tl_textsize, sp2px(13.0f));
        this.mTextSelectColor = typedArrayObtainStyledAttributes.getColor(R.styleable.SegmentTabLayout_tl_textSelectColor, Color.parseColor("#ffffff"));
        this.mTextUnselectColor = typedArrayObtainStyledAttributes.getColor(R.styleable.SegmentTabLayout_tl_textUnselectColor, this.mIndicatorColor);
        this.mTextBold = typedArrayObtainStyledAttributes.getInt(R.styleable.SegmentTabLayout_tl_textBold, 0);
        this.mTextAllCaps = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SegmentTabLayout_tl_textAllCaps, false);
        this.mTabSpaceEqual = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SegmentTabLayout_tl_tab_space_equal, true);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.SegmentTabLayout_tl_tab_width, dp2px(-1.0f));
        this.mTabWidth = dimension;
        this.mTabPadding = typedArrayObtainStyledAttributes.getDimension(R.styleable.SegmentTabLayout_tl_tab_padding, (this.mTabSpaceEqual || dimension > 0.0f) ? dp2px(0.0f) : dp2px(10.0f));
        this.mBarColor = typedArrayObtainStyledAttributes.getColor(R.styleable.SegmentTabLayout_tl_bar_color, 0);
        this.mBarStrokeColor = typedArrayObtainStyledAttributes.getColor(R.styleable.SegmentTabLayout_tl_bar_stroke_color, this.mIndicatorColor);
        this.mBarStrokeWidth = typedArrayObtainStyledAttributes.getDimension(R.styleable.SegmentTabLayout_tl_bar_stroke_width, dp2px(1.0f));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void updateTabSelection(int i10) {
        int i11 = 0;
        while (i11 < this.mTabCount) {
            View childAt = this.mTabsContainer.getChildAt(i11);
            boolean z10 = i11 == i10;
            TextView textView = (TextView) childAt.findViewById(R.id.tv_tab_title);
            textView.setTextColor(z10 ? this.mTextSelectColor : this.mTextUnselectColor);
            if (this.mTextBold == 1) {
                textView.getPaint().setFakeBoldText(z10);
            }
            i11++;
        }
    }

    private void updateTabStyles() {
        int i10 = 0;
        while (i10 < this.mTabCount) {
            View childAt = this.mTabsContainer.getChildAt(i10);
            float f10 = this.mTabPadding;
            childAt.setPadding((int) f10, 0, (int) f10, 0);
            TextView textView = (TextView) childAt.findViewById(R.id.tv_tab_title);
            textView.setTextColor(i10 == this.mCurrentTab ? this.mTextSelectColor : this.mTextUnselectColor);
            textView.setTextSize(0, this.mTextsize);
            if (this.mTextAllCaps) {
                textView.setText(textView.getText().toString().toUpperCase());
            }
            int i11 = this.mTextBold;
            if (i11 == 2) {
                textView.getPaint().setFakeBoldText(true);
            } else if (i11 == 0) {
                textView.getPaint().setFakeBoldText(false);
            }
            i10++;
        }
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

    public long getIndicatorAnimDuration() {
        return this.mIndicatorAnimDuration;
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

    public boolean isIndicatorAnimEnable() {
        return this.mIndicatorAnimEnable;
    }

    public boolean isIndicatorBounceEnable() {
        return this.mIndicatorBounceEnable;
    }

    public boolean isTabSpaceEqual() {
        return this.mTabSpaceEqual;
    }

    public boolean isTextAllCaps() {
        return this.mTextAllCaps;
    }

    public void notifyDataSetChanged() {
        this.mTabsContainer.removeAllViews();
        this.mTabCount = this.mTitles.length;
        for (int i10 = 0; i10 < this.mTabCount; i10++) {
            View viewInflate = View.inflate(this.mContext, R.layout.layout_tab_segment, null);
            viewInflate.setTag(Integer.valueOf(i10));
            addTab(i10, viewInflate);
        }
        updateTabStyles();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        IndicatorPoint indicatorPoint = (IndicatorPoint) valueAnimator.getAnimatedValue();
        Rect rect = this.mIndicatorRect;
        rect.left = (int) indicatorPoint.left;
        rect.right = (int) indicatorPoint.right;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || this.mTabCount <= 0) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        if (this.mIndicatorHeight < 0.0f) {
            this.mIndicatorHeight = (height - this.mIndicatorMarginTop) - this.mIndicatorMarginBottom;
        }
        float f10 = this.mIndicatorCornerRadius;
        if (f10 < 0.0f || f10 > this.mIndicatorHeight / 2.0f) {
            this.mIndicatorCornerRadius = this.mIndicatorHeight / 2.0f;
        }
        this.mRectDrawable.setColor(this.mBarColor);
        this.mRectDrawable.setStroke((int) this.mBarStrokeWidth, this.mBarStrokeColor);
        this.mRectDrawable.setCornerRadius(this.mIndicatorCornerRadius);
        this.mRectDrawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.mRectDrawable.draw(canvas);
        if (!this.mIndicatorAnimEnable) {
            float f11 = this.mDividerWidth;
            if (f11 > 0.0f) {
                this.mDividerPaint.setStrokeWidth(f11);
                this.mDividerPaint.setColor(this.mDividerColor);
                for (int i10 = 0; i10 < this.mTabCount - 1; i10++) {
                    View childAt = this.mTabsContainer.getChildAt(i10);
                    canvas.drawLine(childAt.getRight() + paddingLeft, this.mDividerPadding, childAt.getRight() + paddingLeft, height - this.mDividerPadding, this.mDividerPaint);
                }
            }
        }
        if (!this.mIndicatorAnimEnable) {
            calcIndicatorRect();
        } else if (this.mIsFirstDraw) {
            this.mIsFirstDraw = false;
            calcIndicatorRect();
        }
        this.mIndicatorDrawable.setColor(this.mIndicatorColor);
        GradientDrawable gradientDrawable = this.mIndicatorDrawable;
        int i11 = ((int) this.mIndicatorMarginLeft) + paddingLeft;
        Rect rect = this.mIndicatorRect;
        int i12 = i11 + rect.left;
        float f12 = this.mIndicatorMarginTop;
        gradientDrawable.setBounds(i12, (int) f12, (int) ((paddingLeft + rect.right) - this.mIndicatorMarginRight), (int) (f12 + this.mIndicatorHeight));
        this.mIndicatorDrawable.setCornerRadii(this.mRadiusArr);
        this.mIndicatorDrawable.draw(canvas);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.mCurrentTab = bundle.getInt("mCurrentTab");
            parcelable = bundle.getParcelable("instanceState");
            if (this.mCurrentTab != 0 && this.mTabsContainer.getChildCount() > 0) {
                updateTabSelection(this.mCurrentTab);
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mCurrentTab", this.mCurrentTab);
        return bundle;
    }

    public void setCurrentTab(int i10) {
        this.mLastTab = this.mCurrentTab;
        this.mCurrentTab = i10;
        updateTabSelection(i10);
        FragmentChangeManager fragmentChangeManager = this.mFragmentChangeManager;
        if (fragmentChangeManager != null) {
            fragmentChangeManager.setFragments(i10);
        }
        if (this.mIndicatorAnimEnable) {
            calcOffset();
        } else {
            invalidate();
        }
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

    public void setIndicatorAnimDuration(long j10) {
        this.mIndicatorAnimDuration = j10;
    }

    public void setIndicatorAnimEnable(boolean z10) {
        this.mIndicatorAnimEnable = z10;
    }

    public void setIndicatorBounceEnable(boolean z10) {
        this.mIndicatorBounceEnable = z10;
    }

    public void setIndicatorColor(int i10) {
        this.mIndicatorColor = i10;
        invalidate();
    }

    public void setIndicatorCornerRadius(float f10) {
        this.mIndicatorCornerRadius = dp2px(f10);
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

    public void setMsgMargin(int i10, float f10, float f11) {
        int i11 = this.mTabCount;
        if (i10 >= i11) {
            i10 = i11 - 1;
        }
        View childAt = this.mTabsContainer.getChildAt(i10);
        MsgView msgView = (MsgView) childAt.findViewById(R.id.rtv_msg_tip);
        if (msgView != null) {
            TextView textView = (TextView) childAt.findViewById(R.id.tv_tab_title);
            this.mTextPaint.setTextSize(this.mTextsize);
            this.mTextPaint.measureText(textView.getText().toString());
            float fDescent = this.mTextPaint.descent() - this.mTextPaint.ascent();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) msgView.getLayoutParams();
            marginLayoutParams.leftMargin = dp2px(f10);
            int i12 = this.mHeight;
            marginLayoutParams.topMargin = i12 > 0 ? (((int) (i12 - fDescent)) / 2) - dp2px(f11) : dp2px(f11);
            msgView.setLayoutParams(marginLayoutParams);
        }
    }

    public void setOnTabSelectListener(OnTabSelectListener onTabSelectListener) {
        this.mListener = onTabSelectListener;
    }

    public void setTabData(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalStateException("Titles can not be NULL or EMPTY !");
        }
        this.mTitles = strArr;
        notifyDataSetChanged();
    }

    public void setTabData(String[] strArr, FragmentActivity fragmentActivity, int i10, ArrayList<Fragment> arrayList) {
        this.mFragmentChangeManager = new FragmentChangeManager(fragmentActivity.getSupportFragmentManager(), i10, arrayList);
        setTabData(strArr);
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
                setMsgMargin(i10, 2.0f, 2.0f);
                this.mInitSetMap.put(i10, Boolean.TRUE);
            }
        }
    }

    protected int sp2px(float f10) {
        return (int) ((f10 * this.mContext.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
