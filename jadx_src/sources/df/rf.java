package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.CProgressButton;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemConceptFeedsMobileImgBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class rf implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f115211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CProgressButton f115212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final id0 f115213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f115215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115218h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115219i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115220j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115221k;

    private rf(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CProgressButton cProgressButton, @androidx.annotation.n0 id0 id0Var, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f115211a = relativeLayout;
        this.f115212b = cProgressButton;
        this.f115213c = id0Var;
        this.f115214d = imageView;
        this.f115215e = qMUIRadiusImageView;
        this.f115216f = textView;
        this.f115217g = textView2;
        this.f115218h = textView3;
        this.f115219i = textView4;
        this.f115220j = textView5;
        this.f115221k = relativeLayout2;
    }

    @androidx.annotation.n0
    public static rf a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17972, new Class[]{View.class}, rf.class);
        if (patchProxyResultProxy.isSupported) {
            return (rf) patchProxyResultProxy.result;
        }
        int i10 = R.id.cpb_download;
        CProgressButton cProgressButton = (CProgressButton) l3.d.a(view, R.id.cpb_download);
        if (cProgressButton != null) {
            i10 = R.id.divider;
            View viewA = l3.d.a(view, R.id.divider);
            if (viewA != null) {
                id0 id0VarA = id0.a(viewA);
                i10 = R.id.iv_icon;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
                if (imageView != null) {
                    i10 = R.id.iv_screenshot;
                    QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_screenshot);
                    if (qMUIRadiusImageView != null) {
                        i10 = R.id.tv_desc;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
                        if (textView != null) {
                            i10 = R.id.tv_download;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_download);
                            if (textView2 != null) {
                                i10 = R.id.tv_internal_tag;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_internal_tag);
                                if (textView3 != null) {
                                    i10 = R.id.tv_name;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_name);
                                    if (textView4 != null) {
                                        i10 = R.id.tv_title;
                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_title);
                                        if (textView5 != null) {
                                            i10 = R.id.vg_game_desc;
                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_game_desc);
                                            if (relativeLayout != null) {
                                                return new rf((RelativeLayout) view, cProgressButton, id0VarA, imageView, qMUIRadiusImageView, textView, textView2, textView3, textView4, textView5, relativeLayout);
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
    public static rf c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17970, new Class[]{LayoutInflater.class}, rf.class);
        return patchProxyResultProxy.isSupported ? (rf) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static rf d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17971, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, rf.class);
        if (patchProxyResultProxy.isSupported) {
            return (rf) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_concept_feeds_mobile_img, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f115211a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17973, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
