package com.zhpan.indicator.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tekartik.sqflite.b;
import com.umeng.analytics.pro.ak;
import com.umeng.analytics.pro.d;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import dl.e;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BaseIndicatorView.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001D\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010P\u001a\u00020O\u0012\b\u0010R\u001a\u0004\u0018\u00010Q\u0012\u0006\u0010S\u001a\u00020\u0003¢\u0006\u0004\bT\u0010UJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J \u0010\f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0011\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0003J\u0006\u0010\u0016\u001a\u00020\u0003J\u000e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0005J\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0005J\u0010\u0010\u001b\u001a\u00020\u00072\b\b\u0001\u0010\u001a\u001a\u00020\u0003J\u0006\u0010\u001c\u001a\u00020\u0003J\u0010\u0010\u001d\u001a\u00020\u00072\b\b\u0001\u0010\u001a\u001a\u00020\u0003J\u0006\u0010\u001e\u001a\u00020\u0005J\u000e\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0005J\u0006\u0010!\u001a\u00020\u0003J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0003J\u001a\u0010%\u001a\u00020\u00002\b\b\u0001\u0010\u001a\u001a\u00020\u00032\b\b\u0001\u0010$\u001a\u00020\u0003J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0005J\u0016\u0010)\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0005J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0005J\u0006\u0010,\u001a\u00020\u0003J\u000e\u0010.\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0003J\u000e\u00100\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0003J\u000e\u00102\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u0005J\u000e\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u000203J\u000e\u00105\u001a\u00020\u00072\u0006\u00107\u001a\u000206J\u000e\u0010:\u001a\u00020\u00072\u0006\u00109\u001a\u000208J\u0010\u0010<\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0003H\u0016J\u0010\u0010?\u001a\u00020\u00072\u0006\u0010>\u001a\u00020=H\u0016R\u0018\u0010A\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010@R\u0018\u0010C\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010BR\u0014\u0010F\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010ER\"\u0010G\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0011\u0010\u0012\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006V"}, d2 = {"Lcom/zhpan/indicator/base/BaseIndicatorView;", "Landroid/view/View;", "Lcom/zhpan/indicator/base/a;", "", CommonNetImpl.POSITION, "", "positionOffset", "Lkotlin/b2;", ak.aF, "l", "onPageSelected", "positionOffsetPixels", "onPageScrolled", ak.av, "getNormalSlideWidth", "normalSliderWidth", "setNormalSlideWidth", "getCheckedSlideWidth", "checkedSliderWidth", "setCheckedSlideWidth", "currentPosition", "setCurrentPosition", "getCurrentPosition", "indicatorGap", "b", "setIndicatorGap", "normalColor", "setCheckedColor", "getCheckedColor", "setNormalColor", "getSlideProgress", "slideProgress", "setSlideProgress", "getPageSize", "pageSize", "e", "selectedColor", "g", "sliderWidth", "j", "selectedSliderWidth", "k", "sliderGap", RXScreenCaptureService.KEY_HEIGHT, "getSlideMode", "slideMode", "f", "indicatorStyle", "d", "sliderHeight", "i", "Landroidx/viewpager/widget/ViewPager;", "viewPager", "setupWithViewPager", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager2", "", "showIndicatorWhenOneItem", "m", "state", "onPageScrollStateChanged", "Lch/b;", b.f98586e, "setIndicatorOptions", "Landroidx/viewpager/widget/ViewPager;", "mViewPager", "Landroidx/viewpager2/widget/ViewPager2;", "mViewPager2", "com/zhpan/indicator/base/BaseIndicatorView$a", "Lcom/zhpan/indicator/base/BaseIndicatorView$a;", "mOnPageChangeCallback", "mIndicatorOptions", "Lch/b;", "getMIndicatorOptions", "()Lch/b;", "setMIndicatorOptions", "(Lch/b;)V", "getCheckedSliderWidth", "()F", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "indicator_release"}, k = 1, mv = {1, 4, 0})
public class BaseIndicatorView extends View implements com.zhpan.indicator.base.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private ch.b f108068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private ViewPager mViewPager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ViewPager2 mViewPager2;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a mOnPageChangeCallback;

    /* JADX INFO: compiled from: BaseIndicatorView.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"com/zhpan/indicator/base/BaseIndicatorView$a", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "", CommonNetImpl.POSITION, "", "positionOffset", "positionOffsetPixels", "Lkotlin/b2;", "onPageScrolled", "onPageSelected", "state", "onPageScrollStateChanged", "indicator_release"}, k = 1, mv = {1, 4, 0})
    public static final class a extends ViewPager2.OnPageChangeCallback {
        a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i10) {
            BaseIndicatorView.this.onPageScrollStateChanged(i10);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i10, float f10, int i11) {
            BaseIndicatorView.this.onPageScrolled(i10, f10, i11);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            BaseIndicatorView.this.onPageSelected(i10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseIndicatorView(@dl.d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.q(context, "context");
        this.mOnPageChangeCallback = new a();
        this.f108068b = new ch.b();
    }

    private final void c(int i10, float f10) {
        if (this.f108068b.getF35650c() == 4 || this.f108068b.getF35650c() == 5) {
            setCurrentPosition(i10);
            setSlideProgress(f10);
        } else if (i10 % getPageSize() != getPageSize() - 1) {
            setCurrentPosition(i10);
            setSlideProgress(f10);
        } else if (f10 < 0.5d) {
            setCurrentPosition(i10);
            setSlideProgress(0.0f);
        } else {
            setCurrentPosition(0);
            setSlideProgress(0.0f);
        }
    }

    private final void l() {
        ViewPager viewPager = this.mViewPager;
        if (viewPager != null) {
            if (viewPager != null) {
                viewPager.O(this);
            }
            ViewPager viewPager2 = this.mViewPager;
            if (viewPager2 != null) {
                viewPager2.c(this);
            }
            ViewPager viewPager3 = this.mViewPager;
            if (viewPager3 != null && viewPager3.getAdapter() != null) {
                ViewPager viewPager4 = this.mViewPager;
                if (viewPager4 == null) {
                    f0.L();
                }
                androidx.viewpager.widget.a adapter = viewPager4.getAdapter();
                if (adapter == null) {
                    f0.L();
                }
                f0.h(adapter, "mViewPager!!.adapter!!");
                e(adapter.getCount());
            }
        }
        ViewPager2 viewPager5 = this.mViewPager2;
        if (viewPager5 != null) {
            if (viewPager5 != null) {
                viewPager5.unregisterOnPageChangeCallback(this.mOnPageChangeCallback);
            }
            ViewPager2 viewPager6 = this.mViewPager2;
            if (viewPager6 != null) {
                viewPager6.registerOnPageChangeCallback(this.mOnPageChangeCallback);
            }
            ViewPager2 viewPager7 = this.mViewPager2;
            if (viewPager7 == null || viewPager7.getAdapter() == null) {
                return;
            }
            ViewPager2 viewPager8 = this.mViewPager2;
            if (viewPager8 == null) {
                f0.L();
            }
            RecyclerView.Adapter adapter2 = viewPager8.getAdapter();
            if (adapter2 == null) {
                f0.L();
            }
            f0.h(adapter2, "mViewPager2!!.adapter!!");
            e(adapter2.getItemCount());
        }
    }

    public void a() {
        l();
        requestLayout();
        invalidate();
    }

    public final void b(float f10) {
        this.f108068b.A(f10);
    }

    @dl.d
    public final BaseIndicatorView d(int indicatorStyle) {
        this.f108068b.r(indicatorStyle);
        return this;
    }

    @dl.d
    public final BaseIndicatorView e(int pageSize) {
        this.f108068b.v(pageSize);
        return this;
    }

    @dl.d
    public final BaseIndicatorView f(int slideMode) {
        this.f108068b.x(slideMode);
        return this;
    }

    @dl.d
    public final BaseIndicatorView g(@l int normalColor, @l int selectedColor) {
        this.f108068b.z(normalColor, selectedColor);
        return this;
    }

    public final int getCheckedColor() {
        return this.f108068b.getF35653f();
    }

    public final float getCheckedSlideWidth() {
        return this.f108068b.getF35657j();
    }

    public final float getCheckedSliderWidth() {
        return this.f108068b.getF35657j();
    }

    public final int getCurrentPosition() {
        return this.f108068b.getF35658k();
    }

    @dl.d
    /* JADX INFO: renamed from: getMIndicatorOptions, reason: from getter */
    public final ch.b getF108068b() {
        return this.f108068b;
    }

    public final float getNormalSlideWidth() {
        return this.f108068b.getF35656i();
    }

    public final int getPageSize() {
        return this.f108068b.getF35651d();
    }

    public final int getSlideMode() {
        return this.f108068b.getF35650c();
    }

    public final float getSlideProgress() {
        return this.f108068b.getF35659l();
    }

    @dl.d
    public final BaseIndicatorView h(float sliderGap) {
        this.f108068b.A(sliderGap);
        return this;
    }

    @dl.d
    public final BaseIndicatorView i(float sliderHeight) {
        this.f108068b.B(sliderHeight);
        return this;
    }

    @dl.d
    public final BaseIndicatorView j(float sliderWidth) {
        this.f108068b.C(sliderWidth);
        return this;
    }

    @dl.d
    public final BaseIndicatorView k(float normalSliderWidth, float selectedSliderWidth) {
        this.f108068b.D(normalSliderWidth, selectedSliderWidth);
        return this;
    }

    public final void m(boolean z10) {
        this.f108068b.w(z10);
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void onPageScrollStateChanged(int i10) {
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void onPageScrolled(int i10, float f10, int i11) {
        if (getSlideMode() == 0 || getPageSize() <= 1) {
            return;
        }
        c(i10, f10);
        invalidate();
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void onPageSelected(int i10) {
        if (getSlideMode() == 0) {
            setCurrentPosition(i10);
            setSlideProgress(0.0f);
            invalidate();
        }
    }

    public final void setCheckedColor(@l int i10) {
        this.f108068b.o(i10);
    }

    public final void setCheckedSlideWidth(float f10) {
        this.f108068b.p(f10);
    }

    public final void setCurrentPosition(int i10) {
        this.f108068b.q(i10);
    }

    public final void setIndicatorGap(float f10) {
        this.f108068b.A(f10);
    }

    public void setIndicatorOptions(@dl.d ch.b options) {
        f0.q(options, "options");
        this.f108068b = options;
    }

    public final void setMIndicatorOptions(@dl.d ch.b bVar) {
        f0.q(bVar, "<set-?>");
        this.f108068b = bVar;
    }

    public final void setNormalColor(@l int i10) {
        this.f108068b.s(i10);
    }

    public final void setNormalSlideWidth(float f10) {
        this.f108068b.t(f10);
    }

    public final void setSlideProgress(float f10) {
        this.f108068b.y(f10);
    }

    public final void setupWithViewPager(@dl.d ViewPager viewPager) {
        f0.q(viewPager, "viewPager");
        this.mViewPager = viewPager;
        a();
    }

    public final void setupWithViewPager(@dl.d ViewPager2 viewPager2) {
        f0.q(viewPager2, "viewPager2");
        this.mViewPager2 = viewPager2;
        a();
    }
}
