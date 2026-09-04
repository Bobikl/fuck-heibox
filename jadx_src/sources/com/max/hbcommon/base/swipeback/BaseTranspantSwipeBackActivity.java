package com.max.hbcommon.base.swipeback;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Bundle;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import bb.c;
import butterknife.ButterKnife;
import com.max.hbcommon.R;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcustomview.swipebacklayout.ActivitySwipeBackLayout;
import com.max.hbcustomview.swipebacklayout.e;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes9.dex */
public class BaseTranspantSwipeBackActivity extends BaseSwipeBackActivity {
    private static final int O = 300;
    private static final int P = 128;
    public static ChangeQuickRedirect changeQuickRedirect;
    protected ActivitySwipeBackLayout N;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, c.d.f31608w3, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            BaseTranspantSwipeBackActivity baseTranspantSwipeBackActivity = BaseTranspantSwipeBackActivity.this;
            baseTranspantSwipeBackActivity.N.setMaskAlpha(((ViewUtils.J(((BaseActivity) baseTranspantSwipeBackActivity).f66601b) + iIntValue) * 128) / ViewUtils.J(((BaseActivity) BaseTranspantSwipeBackActivity.this).f66601b));
            BaseTranspantSwipeBackActivity.this.N.invalidate();
            BaseTranspantSwipeBackActivity.this.N.f69531o.scrollTo(0, iIntValue);
            e.h(((BaseActivity) BaseTranspantSwipeBackActivity.this).f66601b);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66923b;

        b(int i10) {
            this.f66923b = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, c.d.f31630x3, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ActivitySwipeBackLayout activitySwipeBackLayout = BaseTranspantSwipeBackActivity.this.N;
            int i10 = this.f66923b;
            activitySwipeBackLayout.setMaskAlpha(((i10 + iIntValue) * 128) / i10);
            BaseTranspantSwipeBackActivity.this.N.invalidate();
            BaseTranspantSwipeBackActivity.this.N.f69531o.scrollTo(0, iIntValue);
            if (iIntValue >= (-this.f66923b) + 10 || !BaseTranspantSwipeBackActivity.this.isActive()) {
                return;
            }
            BaseTranspantSwipeBackActivity.W1(BaseTranspantSwipeBackActivity.this);
        }
    }

    static /* synthetic */ void W1(BaseTranspantSwipeBackActivity baseTranspantSwipeBackActivity) {
        if (PatchProxy.proxy(new Object[]{baseTranspantSwipeBackActivity}, null, changeQuickRedirect, true, c.d.f31586v3, new Class[]{BaseTranspantSwipeBackActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.max.hbcommon.base.swipeback.BaseSwipeBackActivity, com.max.hbcommon.base.BaseActivity, android.app.Activity
    public void finish() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31564u3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.finish();
        int i10 = R.anim.activity_none;
        overridePendingTransition(i10, i10);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31476q3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.k1();
        if (Build.VERSION.SDK_INT != 26 && getRequestedOrientation() != 1) {
            setRequestedOrientation(1);
        }
        ButterKnife.a(this);
        t.X(this.f66601b, 0, null);
        t.M(this.f66601b, false);
        int i10 = R.anim.activity_none;
        overridePendingTransition(i10, i10);
        ActivitySwipeBackLayout activitySwipeBackLayoutF0 = f0();
        this.N = activitySwipeBackLayoutF0;
        activitySwipeBackLayoutF0.setDirectionMode(4);
        this.N.setApartAlpha(true);
        this.N.setMaskAlpha(128);
        this.N.setSwipeBackFactor(0.2f);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31542t3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int measuredHeight = this.N.f69531o.getMeasuredHeight();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, -measuredHeight);
        valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new b(measuredHeight));
        valueAnimatorOfInt.start();
    }

    @Override // com.max.hbcommon.base.swipeback.BaseSwipeBackActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, c.d.f31498r3, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onPostCreate(bundle);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-ViewUtils.J(this.f66601b), 0);
        valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new a());
        valueAnimatorOfInt.start();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.d.f31520s3, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.onWindowFocusChanged(z10);
        e.h(this.f66601b);
    }
}
