package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.HorizontalScrollListView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemR6PlayerWeaponDataBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ev implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f110301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HorizontalScrollListView f110302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f110306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110308h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110309i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110310j;

    private ev(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 HorizontalScrollListView horizontalScrollListView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f110301a = constraintLayout;
        this.f110302b = horizontalScrollListView;
        this.f110303c = imageView;
        this.f110304d = imageView2;
        this.f110305e = linearLayout;
        this.f110306f = progressBar;
        this.f110307g = textView;
        this.f110308h = textView2;
        this.f110309i = linearLayout2;
        this.f110310j = linearLayout3;
    }

    @androidx.annotation.n0
    public static ev a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19576, new Class[]{View.class}, ev.class);
        if (patchProxyResultProxy.isSupported) {
            return (ev) patchProxyResultProxy.result;
        }
        int i10 = R.id.hsv;
        HorizontalScrollListView horizontalScrollListView = (HorizontalScrollListView) l3.d.a(view, R.id.hsv);
        if (horizontalScrollListView != null) {
            i10 = R.id.iv_gradient;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_gradient);
            if (imageView != null) {
                i10 = R.id.iv_img;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_img);
                if (imageView2 != null) {
                    i10 = R.id.ll_data_container;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_data_container);
                    if (linearLayout != null) {
                        i10 = R.id.pb_head_shot_percentage;
                        ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_head_shot_percentage);
                        if (progressBar != null) {
                            i10 = R.id.tv_head_shot_percentage;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_head_shot_percentage);
                            if (textView != null) {
                                i10 = R.id.tv_name;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_name);
                                if (textView2 != null) {
                                    i10 = R.id.vg_container;
                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_container);
                                    if (linearLayout2 != null) {
                                        i10 = R.id.vg_progress;
                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_progress);
                                        if (linearLayout3 != null) {
                                            return new ev((ConstraintLayout) view, horizontalScrollListView, imageView, imageView2, linearLayout, progressBar, textView, textView2, linearLayout2, linearLayout3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ev c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19574, new Class[]{LayoutInflater.class}, ev.class);
        return patchProxyResultProxy.isSupported ? (ev) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ev d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19575, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ev.class);
        if (patchProxyResultProxy.isSupported) {
            return (ev) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_r6_player_weapon_data, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f110301a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19577, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
