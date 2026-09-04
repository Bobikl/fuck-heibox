package com.umeng.socialize.shareboard;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.umeng.socialize.shareboard.widgets.SocializeViewPager;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class UMActionFrame extends LinearLayout {
    private ShareBoardConfig mConfig;
    private PopupWindow.OnDismissListener mDismissListener;

    public UMActionFrame(Context context) {
        super(context);
    }

    public UMActionFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @TargetApi(11)
    public UMActionFrame(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @TargetApi(21)
    public UMActionFrame(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    private View createShareTitle() {
        TextView textView = new TextView(getContext());
        textView.setText(this.mConfig.mTitleText);
        textView.setTextColor(this.mConfig.mTitleTextColor);
        textView.setTextSize(16.0f);
        textView.setGravity(17);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dip2px(20.0f);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    private View createShareboardLayout(List<SnsPlatform> list) {
        final IndicatorView indicatorViewCreateIndicatorView;
        int i10;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setBackgroundColor(this.mConfig.mShareboardBgColor);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        ShareBoardConfig shareBoardConfig = this.mConfig;
        if (shareBoardConfig.mShareboardPosition == ShareBoardConfig.SHAREBOARD_POSITION_CENTER && (i10 = shareBoardConfig.mTopMargin) != 0) {
            layoutParams.topMargin = i10;
        }
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        if (this.mConfig.mTitleVisibility) {
            linearLayout.addView(createShareTitle());
        }
        int iCalculateMenuHeightInDp = this.mConfig.calculateMenuHeightInDp(list.size());
        ViewPager viewPagerCreateViewPagerInstance = createViewPagerInstance();
        if (viewPagerCreateViewPagerInstance != null) {
            SocializeMenuPagerAdapter socializeMenuPagerAdapter = new SocializeMenuPagerAdapter(getContext(), this.mConfig);
            socializeMenuPagerAdapter.setData(list);
            settingMenuLayout(viewPagerCreateViewPagerInstance, iCalculateMenuHeightInDp);
            linearLayout.addView(viewPagerCreateViewPagerInstance);
            viewPagerCreateViewPagerInstance.setAdapter(socializeMenuPagerAdapter);
            indicatorViewCreateIndicatorView = this.mConfig.mIndicatorVisibility ? createIndicatorView() : null;
            if (indicatorViewCreateIndicatorView != null) {
                indicatorViewCreateIndicatorView.setPageCount(socializeMenuPagerAdapter.getCount());
                linearLayout.addView(indicatorViewCreateIndicatorView);
            }
            ViewPager.i iVar = new ViewPager.i() { // from class: com.umeng.socialize.shareboard.UMActionFrame.2
                @Override // androidx.viewpager.widget.ViewPager.i
                public void onPageScrollStateChanged(int i11) {
                }

                @Override // androidx.viewpager.widget.ViewPager.i
                public void onPageScrolled(int i11, float f10, int i12) {
                }

                @Override // androidx.viewpager.widget.ViewPager.i
                public void onPageSelected(int i11) {
                    IndicatorView indicatorView = indicatorViewCreateIndicatorView;
                    if (indicatorView != null) {
                        indicatorView.setSelectedPosition(i11);
                    }
                }
            };
            if (verifyMethodExists()) {
                viewPagerCreateViewPagerInstance.c(iVar);
            } else {
                viewPagerCreateViewPagerInstance.setOnPageChangeListener(iVar);
            }
        } else {
            SocializeViewPager socializeViewPagerCreateSocializeViewPagerInstance = createSocializeViewPagerInstance();
            if (socializeViewPagerCreateSocializeViewPagerInstance == null) {
                return null;
            }
            SocializeMenuAdapter socializeMenuAdapter = new SocializeMenuAdapter(getContext(), this.mConfig);
            socializeMenuAdapter.setData(list);
            settingMenuLayout(socializeViewPagerCreateSocializeViewPagerInstance, iCalculateMenuHeightInDp);
            linearLayout.addView(socializeViewPagerCreateSocializeViewPagerInstance);
            socializeViewPagerCreateSocializeViewPagerInstance.setAdapter(socializeMenuAdapter);
            indicatorViewCreateIndicatorView = this.mConfig.mIndicatorVisibility ? createIndicatorView() : null;
            if (indicatorViewCreateIndicatorView != null) {
                indicatorViewCreateIndicatorView.setPageCount(socializeMenuAdapter.getCount());
                linearLayout.addView(indicatorViewCreateIndicatorView);
            }
            socializeViewPagerCreateSocializeViewPagerInstance.addOnPageChangeListener(new SocializeViewPager.OnPageChangeListener() { // from class: com.umeng.socialize.shareboard.UMActionFrame.3
                @Override // com.umeng.socialize.shareboard.widgets.SocializeViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int i11) {
                }

                @Override // com.umeng.socialize.shareboard.widgets.SocializeViewPager.OnPageChangeListener
                public void onPageScrolled(int i11, float f10, int i12) {
                }

                @Override // com.umeng.socialize.shareboard.widgets.SocializeViewPager.OnPageChangeListener
                public void onPageSelected(int i11) {
                    IndicatorView indicatorView = indicatorViewCreateIndicatorView;
                    if (indicatorView != null) {
                        indicatorView.setSelectedPosition(i11);
                    }
                }
            });
        }
        if (this.mConfig.mCancelBtnVisibility) {
            linearLayout.addView(createCancelBtn());
        }
        return linearLayout;
    }

    private SocializeViewPager createSocializeViewPagerInstance() {
        try {
            return (SocializeViewPager) Class.forName("com.umeng.socialize.shareboard.widgets.SocializeViewPager").getConstructor(Context.class).newInstance(getContext());
        } catch (Exception e10) {
            SLog.error(UmengText.SHAREBOARD.NULLJAR, e10);
            return null;
        }
    }

    private ViewPager createViewPagerInstance() {
        try {
            return (ViewPager) Class.forName("androidx.viewpager.widget.ViewPager").getConstructor(Context.class).newInstance(getContext());
        } catch (Exception e10) {
            SLog.error(e10);
            return null;
        }
    }

    private int dip2px(float f10) {
        return (int) ((f10 * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    private StateListDrawable getBtnBg() {
        ColorDrawable colorDrawable = new ColorDrawable(this.mConfig.mCancelBtnBgColor);
        ColorDrawable colorDrawable2 = new ColorDrawable(this.mConfig.mCancelBtnBgPressedColor);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, colorDrawable2);
        stateListDrawable.addState(new int[0], colorDrawable);
        return stateListDrawable;
    }

    private void init(List<SnsPlatform> list) {
        setBackgroundColor(Color.argb(50, 0, 0, 0));
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(100L);
        setAnimation(alphaAnimation);
        setOrientation(1);
        int i10 = this.mConfig.mShareboardPosition;
        if (i10 == ShareBoardConfig.SHAREBOARD_POSITION_BOTTOM) {
            setGravity(80);
        } else if (i10 == ShareBoardConfig.SHAREBOARD_POSITION_CENTER) {
            setGravity(17);
            int iDip2px = dip2px(36.0f);
            setPadding(iDip2px, 0, iDip2px, 0);
        }
        setOnClickListener(new View.OnClickListener() { // from class: com.umeng.socialize.shareboard.UMActionFrame.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (UMActionFrame.this.mDismissListener != null) {
                    UMActionFrame.this.mDismissListener.onDismiss();
                }
            }
        });
        View viewCreateShareboardLayout = createShareboardLayout(list);
        if (viewCreateShareboardLayout == null) {
            return;
        }
        viewCreateShareboardLayout.setClickable(true);
        addView(viewCreateShareboardLayout);
    }

    private void settingMenuLayout(View view, int i10) {
        int iDip2px = dip2px(20.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, dip2px(i10));
        layoutParams.topMargin = iDip2px;
        int iDip2px2 = dip2px(10.0f);
        layoutParams.rightMargin = iDip2px2;
        layoutParams.leftMargin = iDip2px2;
        view.setLayoutParams(layoutParams);
        view.setPadding(0, 0, 0, iDip2px);
    }

    private boolean verifyMethodExists() {
        try {
            return Class.forName("androidx.viewpager.widget.ViewPager").getMethod("addOnPageChangeListener", ViewPager.i.class) != null;
        } catch (Exception e10) {
            SLog.error(e10);
        }
    }

    public View createCancelBtn() {
        TextView textView = new TextView(getContext());
        textView.setText(this.mConfig.mCancelBtnText);
        textView.setTextColor(this.mConfig.mCancelBtnColor);
        textView.setClickable(true);
        textView.setTextSize(15.0f);
        textView.setGravity(17);
        ShareBoardConfig shareBoardConfig = this.mConfig;
        if (shareBoardConfig.mCancelBtnBgPressedColor != 0) {
            textView.setBackground(getBtnBg());
        } else {
            textView.setBackgroundColor(shareBoardConfig.mCancelBtnBgColor);
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.umeng.socialize.shareboard.UMActionFrame.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (UMActionFrame.this.mDismissListener != null) {
                    UMActionFrame.this.mDismissListener.onDismiss();
                }
            }
        });
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, dip2px(50.0f)));
        return textView;
    }

    public IndicatorView createIndicatorView() {
        int iDip2px = dip2px(20.0f);
        IndicatorView indicatorView = new IndicatorView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = iDip2px;
        indicatorView.setLayoutParams(layoutParams);
        ShareBoardConfig shareBoardConfig = this.mConfig;
        indicatorView.setIndicatorColor(shareBoardConfig.mIndicatorNormalColor, shareBoardConfig.mIndicatorSelectedColor);
        indicatorView.setIndicator(3, 5);
        return indicatorView;
    }

    void setDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.mDismissListener = onDismissListener;
    }

    public void setSnsPlatformData(List<SnsPlatform> list) {
        setSnsPlatformData(list, new ShareBoardConfig());
    }

    public void setSnsPlatformData(List<SnsPlatform> list, ShareBoardConfig shareBoardConfig) {
        if (shareBoardConfig == null) {
            this.mConfig = new ShareBoardConfig();
        } else {
            this.mConfig = shareBoardConfig;
        }
        init(list);
    }
}
