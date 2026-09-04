package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewDota2UserItemBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class if0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f111789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f111791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111794i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111795j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f111796k;

    private if0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 FrameLayout frameLayout) {
        this.f111786a = relativeLayout;
        this.f111787b = imageView;
        this.f111788c = imageView2;
        this.f111789d = qMUIRadiusImageView;
        this.f111790e = imageView3;
        this.f111791f = progressBar;
        this.f111792g = textView;
        this.f111793h = textView2;
        this.f111794i = textView3;
        this.f111795j = textView4;
        this.f111796k = frameLayout;
    }

    @androidx.annotation.n0
    public static if0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21654, new Class[]{View.class}, if0.class);
        if (patchProxyResultProxy.isSupported) {
            return (if0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_arrow;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_arrow);
        if (imageView != null) {
            i10 = R.id.iv_authentication;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_authentication);
            if (imageView2 != null) {
                i10 = R.id.iv_avatar;
                QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_avatar);
                if (qMUIRadiusImageView != null) {
                    i10 = R.id.iv_dan_icon;
                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_dan_icon);
                    if (imageView3 != null) {
                        i10 = R.id.f76248pb;
                        ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.f76248pb);
                        if (progressBar != null) {
                            i10 = R.id.tv_dan_number;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_dan_number);
                            if (textView != null) {
                                i10 = R.id.tv_match_num;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_match_num);
                                if (textView2 != null) {
                                    i10 = R.id.tv_name;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_name);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_win_rate;
                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_win_rate);
                                        if (textView4 != null) {
                                            i10 = R.id.vg_dan;
                                            FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_dan);
                                            if (frameLayout != null) {
                                                return new if0((RelativeLayout) view, imageView, imageView2, qMUIRadiusImageView, imageView3, progressBar, textView, textView2, textView3, textView4, frameLayout);
                                            }
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
    public static if0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21652, new Class[]{LayoutInflater.class}, if0.class);
        return patchProxyResultProxy.isSupported ? (if0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static if0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21653, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, if0.class);
        if (patchProxyResultProxy.isSupported) {
            return (if0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_dota2_user_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111786a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21655, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
