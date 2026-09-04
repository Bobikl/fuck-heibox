package vb;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: AttributeController.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f140833a;

    public a(c cVar) {
        this.f140833a = cVar;
    }

    private void b(TypedArray typedArray) {
        if (PatchProxy.proxy(new Object[]{typedArray}, this, changeQuickRedirect, false, bb.c.f.Ng, new Class[]{TypedArray.class}, Void.TYPE).isSupported) {
            return;
        }
        int integer = typedArray.getInteger(R.styleable.BannerViewPager_bvp_interval, 3000);
        boolean z10 = typedArray.getBoolean(R.styleable.BannerViewPager_bvp_auto_play, true);
        boolean z11 = typedArray.getBoolean(R.styleable.BannerViewPager_bvp_can_loop, true);
        int dimension = (int) typedArray.getDimension(R.styleable.BannerViewPager_bvp_page_margin, 0.0f);
        int dimension2 = (int) typedArray.getDimension(R.styleable.BannerViewPager_bvp_round_corner, 0.0f);
        int dimension3 = (int) typedArray.getDimension(R.styleable.BannerViewPager_bvp_reveal_width, -1000.0f);
        int i10 = typedArray.getInt(R.styleable.BannerViewPager_bvp_page_style, 0);
        int i11 = typedArray.getInt(R.styleable.BannerViewPager_bvp_scroll_duration, 0);
        this.f140833a.R(integer);
        this.f140833a.F(z10);
        this.f140833a.G(z11);
        this.f140833a.W(dimension);
        this.f140833a.a0(dimension2);
        this.f140833a.Z(dimension3);
        this.f140833a.T(dimension3);
        this.f140833a.Y(i10);
        this.f140833a.d0(i11);
    }

    private void c(TypedArray typedArray) {
        if (PatchProxy.proxy(new Object[]{typedArray}, this, changeQuickRedirect, false, bb.c.f.Mg, new Class[]{TypedArray.class}, Void.TYPE).isSupported) {
            return;
        }
        int color = typedArray.getColor(R.styleable.BannerViewPager_bvp_indicator_checked_color, Color.parseColor("#8C18171C"));
        int color2 = typedArray.getColor(R.styleable.BannerViewPager_bvp_indicator_normal_color, Color.parseColor("#8C6C6D72"));
        int dimension = (int) typedArray.getDimension(R.styleable.BannerViewPager_bvp_indicator_radius, xb.a.a(8.0f));
        int i10 = typedArray.getInt(R.styleable.BannerViewPager_bvp_indicator_gravity, 0);
        int i11 = typedArray.getInt(R.styleable.BannerViewPager_bvp_indicator_style, 0);
        int i12 = typedArray.getInt(R.styleable.BannerViewPager_bvp_indicator_slide_mode, 0);
        int i13 = typedArray.getInt(R.styleable.BannerViewPager_bvp_indicator_visibility, 0);
        this.f140833a.N(color2, color);
        this.f140833a.O(dimension, dimension);
        this.f140833a.J(i10);
        this.f140833a.P(i11);
        this.f140833a.M(i12);
        this.f140833a.Q(i13);
        this.f140833a.I(dimension);
        this.f140833a.K(dimension / 2);
    }

    public void a(@n0 Context context, @p0 AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet}, this, changeQuickRedirect, false, bb.c.f.Lg, new Class[]{Context.class, AttributeSet.class}, Void.TYPE).isSupported || attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f68739y);
        b(typedArrayObtainStyledAttributes);
        c(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
