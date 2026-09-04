package com.flyco.tablayout;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
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
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.flyco.tablayout.utils.FragmentChangeManager;
import com.flyco.tablayout.utils.UnreadMsgUtils;
import com.flyco.tablayout.widget.MsgView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class CommonTabLayout extends FrameLayout implements ValueAnimator.AnimatorUpdateListener {
    private static final int STYLE_BLOCK = 2;
    private static final int STYLE_NORMAL = 0;
    private static final int STYLE_TRIANGLE = 1;
    private static final int TEXT_BOLD_BOTH = 2;
    private static final int TEXT_BOLD_NONE = 0;
    private static final int TEXT_BOLD_WHEN_SELECT = 1;
    private Context mContext;
    private IndicatorPoint mCurrentP;
    private int mCurrentTab;
    private int mDividerColor;
    private float mDividerPadding;
    private Paint mDividerPaint;
    private float mDividerWidth;
    private FragmentChangeManager mFragmentChangeManager;
    private int mHeight;
    private int mIconGravity;
    private float mIconHeight;
    private float mIconMargin;
    private boolean mIconVisible;
    private float mIconWidth;
    private long mIndicatorAnimDuration;
    private boolean mIndicatorAnimEnable;
    private boolean mIndicatorBounceEnable;
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
    private SparseArray<Boolean> mInitSetMap;
    private OvershootInterpolator mInterpolator;
    private boolean mIsFirstDraw;
    private IndicatorPoint mLastP;
    private int mLastTab;
    private OnTabSelectListener mListener;
    private Paint mRectPaint;
    private int mTabCount;
    private ArrayList<CustomTabEntity> mTabEntitys;
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
    private Paint mTrianglePaint;
    private Path mTrianglePath;
    private int mUnderlineColor;
    private int mUnderlineGravity;
    private float mUnderlineHeight;
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
            IndicatorPoint indicatorPoint3 = CommonTabLayout.this.new IndicatorPoint();
            indicatorPoint3.left = f12;
            indicatorPoint3.right = f14;
            return indicatorPoint3;
        }
    }

    public CommonTabLayout(Context context) {
        this(context, null, 0);
    }

    public CommonTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommonTabLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mTabEntitys = new ArrayList<>();
        this.mIndicatorRect = new Rect();
        this.mIndicatorDrawable = new GradientDrawable();
        this.mRectPaint = new Paint(1);
        this.mDividerPaint = new Paint(1);
        this.mTrianglePaint = new Paint(1);
        this.mTrianglePath = new Path();
        this.mIndicatorStyle = 0;
        this.mInterpolator = new OvershootInterpolator(1.5f);
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
        ((TextView) view.findViewById(R.id.tv_tab_title)).setText(this.mTabEntitys.get(i10).getTabTitle());
        ((ImageView) view.findViewById(R.id.iv_tab_icon)).setImageResource(this.mTabEntitys.get(i10).getTabUnselectedIcon());
        view.setOnClickListener(new View.OnClickListener() { // from class: com.flyco.tablayout.CommonTabLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                int iIntValue = ((Integer) view2.getTag()).intValue();
                if (CommonTabLayout.this.mCurrentTab == iIntValue) {
                    if (CommonTabLayout.this.mListener != null) {
                        CommonTabLayout.this.mListener.onTabReselect(iIntValue);
                    }
                } else {
                    CommonTabLayout.this.setCurrentTab(iIntValue);
                    if (CommonTabLayout.this.mListener != null) {
                        CommonTabLayout.this.mListener.onTabSelect(iIntValue);
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
        if (this.mIndicatorWidth < 0.0f) {
            return;
        }
        float left2 = childAt.getLeft();
        float width = childAt.getWidth();
        float f10 = this.mIndicatorWidth;
        float f11 = left2 + ((width - f10) / 2.0f);
        Rect rect2 = this.mIndicatorRect;
        int i10 = (int) f11;
        rect2.left = i10;
        rect2.right = (int) (i10 + f10);
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
        float f10;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CommonTabLayout);
        int i10 = typedArrayObtainStyledAttributes.getInt(R.styleable.CommonTabLayout_tl_indicator_style, 0);
        this.mIndicatorStyle = i10;
        this.mIndicatorColor = typedArrayObtainStyledAttributes.getColor(R.styleable.CommonTabLayout_tl_indicator_color, Color.parseColor(i10 == 2 ? "#4B6A87" : "#ffffff"));
        int i11 = R.styleable.CommonTabLayout_tl_indicator_height;
        int i12 = this.mIndicatorStyle;
        if (i12 == 1) {
            f10 = 4.0f;
        } else {
            f10 = i12 == 2 ? -1 : 2;
        }
        this.mIndicatorHeight = typedArrayObtainStyledAttributes.getDimension(i11, dp2px(f10));
        this.mIndicatorWidth = typedArrayObtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_indicator_width, dp2px(this.mIndicatorStyle == 1 ? 10.0f : -1.0f));
        this.mIndicatorCornerRadius = typedArrayObtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_indicator_corner_radius, dp2px(this.mIndicatorStyle == 2 ? -1.0f : 0.0f));
        this.mIndicatorMarginLeft = typedArrayObtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_indicator_margin_left, dp2px(0.0f));
        this.mIndicatorMarginTop = typedArrayObtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_indicator_margin_top, dp2px(this.mIndicatorStyle == 2 ? 7.0f : 0.0f));
        this.mIndicatorMarginRight = typedArrayObtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_indicator_margin_right, dp2px(0.0f));
        this.mIndicatorMarginBottom = typedArrayObtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_indicator_margin_bottom, dp2px(this.mIndicatorStyle != 2 ? 0.0f : 7.0f));
        this.mIndicatorAnimEnable = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CommonTabLayout_tl_indicator_anim_enable, true);
        this.mIndicatorBounceEnable = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CommonTabLayout_tl_indicator_bounce_enable, true);
        this.mIndicatorAnimDuration = typedArrayObtainStyledAttributes.getInt(R.styleable.CommonTabLayout_tl_indicator_anim_duration, -1);
        this.mIndicatorGravity = typedArrayObtainStyledAttributes.getInt(R.styleable.CommonTabLayout_tl_indicator_gravity, 80);
        this.mUnderlineColor = typedArrayObtainStyledAttributes.getColor(R.styleable.CommonTabLayout_tl_underline_color, Color.parseColor("#ffffff"));
        this.mUnderlineHeight = typedArrayObtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_underline_height, dp2px(0.0f));
        this.mUnderlineGravity = typedArrayObtainStyledAttributes.getInt(R.styleable.CommonTabLayout_tl_underline_gravity, 80);
        this.mDividerColor = typedArrayObtainStyledAttributes.getColor(R.styleable.CommonTabLayout_tl_divider_color, Color.parseColor("#ffffff"));
        this.mDividerWidth = typedArrayObtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_divider_width, dp2px(0.0f));
        this.mDividerPadding = typedArrayObtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_divider_padding, dp2px(12.0f));
        this.mTextsize = typedArrayObtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_textsize, sp2px(13.0f));
        this.mTextSelectColor = typedArrayObtainStyledAttributes.getColor(R.styleable.CommonTabLayout_tl_textSelectColor, Color.parseColor("#ffffff"));
        this.mTextUnselectColor = typedArrayObtainStyledAttributes.getColor(R.styleable.CommonTabLayout_tl_textUnselectColor, Color.parseColor("#AAffffff"));
        this.mTextBold = typedArrayObtainStyledAttributes.getInt(R.styleable.CommonTabLayout_tl_textBold, 0);
        this.mTextAllCaps = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CommonTabLayout_tl_textAllCaps, false);
        this.mIconVisible = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CommonTabLayout_tl_iconVisible, true);
        this.mIconGravity = typedArrayObtainStyledAttributes.getInt(R.styleable.CommonTabLayout_tl_iconGravity, 48);
        this.mIconWidth = typedArrayObtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_iconWidth, dp2px(0.0f));
        this.mIconHeight = typedArrayObtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_iconHeight, dp2px(0.0f));
        this.mIconMargin = typedArrayObtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_iconMargin, dp2px(2.5f));
        this.mTabSpaceEqual = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CommonTabLayout_tl_tab_space_equal, true);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_tab_width, dp2px(-1.0f));
        this.mTabWidth = dimension;
        this.mTabPadding = typedArrayObtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_tab_padding, (this.mTabSpaceEqual || dimension > 0.0f) ? dp2px(0.0f) : dp2px(10.0f));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void updateTabSelection(int i10) {
        int i11 = 0;
        while (i11 < this.mTabCount) {
            View childAt = this.mTabsContainer.getChildAt(i11);
            boolean z10 = i11 == i10;
            TextView textView = (TextView) childAt.findViewById(R.id.tv_tab_title);
            textView.setTextColor(z10 ? this.mTextSelectColor : this.mTextUnselectColor);
            ImageView imageView = (ImageView) childAt.findViewById(R.id.iv_tab_icon);
            CustomTabEntity customTabEntity = this.mTabEntitys.get(i11);
            imageView.setImageResource(z10 ? customTabEntity.getTabSelectedIcon() : customTabEntity.getTabUnselectedIcon());
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
            ImageView imageView = (ImageView) childAt.findViewById(R.id.iv_tab_icon);
            if (this.mIconVisible) {
                imageView.setVisibility(0);
                CustomTabEntity customTabEntity = this.mTabEntitys.get(i10);
                imageView.setImageResource(i10 == this.mCurrentTab ? customTabEntity.getTabSelectedIcon() : customTabEntity.getTabUnselectedIcon());
                float f11 = this.mIconWidth;
                int i12 = f11 <= 0.0f ? -2 : (int) f11;
                float f12 = this.mIconHeight;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i12, f12 > 0.0f ? (int) f12 : -2);
                int i13 = this.mIconGravity;
                if (i13 == 3) {
                    layoutParams.rightMargin = (int) this.mIconMargin;
                } else if (i13 == 5) {
                    layoutParams.leftMargin = (int) this.mIconMargin;
                } else if (i13 == 80) {
                    layoutParams.topMargin = (int) this.mIconMargin;
                } else {
                    layoutParams.bottomMargin = (int) this.mIconMargin;
                }
                imageView.setLayoutParams(layoutParams);
            } else {
                imageView.setVisibility(8);
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

    public int getIconGravity() {
        return this.mIconGravity;
    }

    public float getIconHeight() {
        return this.mIconHeight;
    }

    public float getIconMargin() {
        return this.mIconMargin;
    }

    public ImageView getIconView(int i10) {
        return (ImageView) this.mTabsContainer.getChildAt(i10).findViewById(R.id.iv_tab_icon);
    }

    public float getIconWidth() {
        return this.mIconWidth;
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

    public boolean isIconVisible() {
        return this.mIconVisible;
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
        View viewInflate;
        this.mTabsContainer.removeAllViews();
        this.mTabCount = this.mTabEntitys.size();
        for (int i10 = 0; i10 < this.mTabCount; i10++) {
            int i11 = this.mIconGravity;
            if (i11 == 3) {
                viewInflate = View.inflate(this.mContext, R.layout.layout_tab_left, null);
            } else if (i11 == 5) {
                viewInflate = View.inflate(this.mContext, R.layout.layout_tab_right, null);
            } else {
                viewInflate = i11 == 80 ? View.inflate(this.mContext, R.layout.layout_tab_bottom, null) : View.inflate(this.mContext, R.layout.layout_tab_top, null);
            }
            viewInflate.setTag(Integer.valueOf(i10));
            addTab(i10, viewInflate);
        }
        updateTabStyles();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        View childAt = this.mTabsContainer.getChildAt(this.mCurrentTab);
        IndicatorPoint indicatorPoint = (IndicatorPoint) valueAnimator.getAnimatedValue();
        Rect rect = this.mIndicatorRect;
        float f10 = indicatorPoint.left;
        rect.left = (int) f10;
        rect.right = (int) indicatorPoint.right;
        if (this.mIndicatorWidth >= 0.0f) {
            float width = childAt.getWidth();
            float f11 = this.mIndicatorWidth;
            float f12 = f10 + ((width - f11) / 2.0f);
            Rect rect2 = this.mIndicatorRect;
            int i10 = (int) f12;
            rect2.left = i10;
            rect2.right = (int) (i10 + f11);
        }
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
        if (!this.mIndicatorAnimEnable) {
            calcIndicatorRect();
        } else if (this.mIsFirstDraw) {
            this.mIsFirstDraw = false;
            calcIndicatorRect();
        }
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

    public void setIconGravity(int i10) {
        this.mIconGravity = i10;
        notifyDataSetChanged();
    }

    public void setIconHeight(float f10) {
        this.mIconHeight = dp2px(f10);
        updateTabStyles();
    }

    public void setIconMargin(float f10) {
        this.mIconMargin = dp2px(f10);
        updateTabStyles();
    }

    public void setIconVisible(boolean z10) {
        this.mIconVisible = z10;
        updateTabStyles();
    }

    public void setIconWidth(float f10) {
        this.mIconWidth = dp2px(f10);
        updateTabStyles();
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
            float intrinsicHeight = this.mIconHeight;
            float f12 = 0.0f;
            if (this.mIconVisible) {
                if (intrinsicHeight <= 0.0f) {
                    intrinsicHeight = this.mContext.getResources().getDrawable(this.mTabEntitys.get(i10).getTabSelectedIcon()).getIntrinsicHeight();
                }
                f12 = this.mIconMargin;
            }
            int i12 = this.mIconGravity;
            if (i12 == 48 || i12 == 80) {
                marginLayoutParams.leftMargin = dp2px(f10);
                int i13 = this.mHeight;
                marginLayoutParams.topMargin = i13 > 0 ? (((int) (((i13 - fDescent) - intrinsicHeight) - f12)) / 2) - dp2px(f11) : dp2px(f11);
            } else {
                marginLayoutParams.leftMargin = dp2px(f10);
                int i14 = this.mHeight;
                marginLayoutParams.topMargin = i14 > 0 ? (((int) (i14 - Math.max(fDescent, intrinsicHeight))) / 2) - dp2px(f11) : dp2px(f11);
            }
            msgView.setLayoutParams(marginLayoutParams);
        }
    }

    public void setOnTabSelectListener(OnTabSelectListener onTabSelectListener) {
        this.mListener = onTabSelectListener;
    }

    public void setTabData(ArrayList<CustomTabEntity> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            throw new IllegalStateException("TabEntitys can not be NULL or EMPTY !");
        }
        this.mTabEntitys.clear();
        this.mTabEntitys.addAll(arrayList);
        notifyDataSetChanged();
    }

    public void setTabData(ArrayList<CustomTabEntity> arrayList, FragmentActivity fragmentActivity, int i10, ArrayList<Fragment> arrayList2) {
        this.mFragmentChangeManager = new FragmentChangeManager(fragmentActivity.getSupportFragmentManager(), i10, arrayList2);
        setTabData(arrayList);
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
                if (this.mIconVisible) {
                    int i13 = this.mIconGravity;
                    setMsgMargin(i10, 0.0f, (i13 == 3 || i13 == 5) ? 4.0f : 0.0f);
                } else {
                    setMsgMargin(i10, 2.0f, 2.0f);
                }
                this.mInitSetMap.put(i10, Boolean.TRUE);
            }
        }
    }

    protected int sp2px(float f10) {
        return (int) ((f10 * this.mContext.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
