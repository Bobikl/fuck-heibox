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

/* JADX INFO: compiled from: ItemR6PlayerMapDataBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class av implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f108631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HorizontalScrollListView f108632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f108636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108640j;

    private av(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 HorizontalScrollListView horizontalScrollListView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f108631a = constraintLayout;
        this.f108632b = horizontalScrollListView;
        this.f108633c = imageView;
        this.f108634d = imageView2;
        this.f108635e = linearLayout;
        this.f108636f = progressBar;
        this.f108637g = textView;
        this.f108638h = textView2;
        this.f108639i = linearLayout2;
        this.f108640j = linearLayout3;
    }

    @androidx.annotation.n0
    public static av a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19560, new Class[]{View.class}, av.class);
        if (patchProxyResultProxy.isSupported) {
            return (av) patchProxyResultProxy.result;
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
                        i10 = R.id.pb_won_per;
                        ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_won_per);
                        if (progressBar != null) {
                            i10 = R.id.tv_name;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
                            if (textView != null) {
                                i10 = R.id.tv_won_per;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_won_per);
                                if (textView2 != null) {
                                    i10 = R.id.vg_container;
                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_container);
                                    if (linearLayout2 != null) {
                                        i10 = R.id.vg_progress;
                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_progress);
                                        if (linearLayout3 != null) {
                                            return new av((ConstraintLayout) view, horizontalScrollListView, imageView, imageView2, linearLayout, progressBar, textView, textView2, linearLayout2, linearLayout3);
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
    public static av c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19558, new Class[]{LayoutInflater.class}, av.class);
        return patchProxyResultProxy.isSupported ? (av) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static av d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19559, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, av.class);
        if (patchProxyResultProxy.isSupported) {
            return (av) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_r6_player_map_data, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f108631a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19561, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
