package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.max.hbcustomview.CProgressButton;
import com.max.hbcustomview.GradientTextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ComponentGameGameListMobileBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r3 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f115060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CProgressButton f115061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.p f115062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final FlexboxLayout f115063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f115064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115065f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115066g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final GradientTextView f115067h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ec f115068i;

    private r3(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CProgressButton cProgressButton, @androidx.annotation.n0 mb.p pVar, @androidx.annotation.n0 FlexboxLayout flexboxLayout, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 GradientTextView gradientTextView, @androidx.annotation.n0 ec ecVar) {
        this.f115060a = relativeLayout;
        this.f115061b = cProgressButton;
        this.f115062c = pVar;
        this.f115063d = flexboxLayout;
        this.f115064e = qMUIRadiusImageView;
        this.f115065f = textView;
        this.f115066g = textView2;
        this.f115067h = gradientTextView;
        this.f115068i = ecVar;
    }

    @androidx.annotation.n0
    public static r3 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16724, new Class[]{View.class}, r3.class);
        if (patchProxyResultProxy.isSupported) {
            return (r3) patchProxyResultProxy.result;
        }
        int i10 = R.id.cpb_download;
        CProgressButton cProgressButton = (CProgressButton) l3.d.a(view, R.id.cpb_download);
        if (cProgressButton != null) {
            i10 = R.id.divider;
            View viewA = l3.d.a(view, R.id.divider);
            if (viewA != null) {
                mb.p pVarA = mb.p.a(viewA);
                i10 = R.id.fl_tags;
                FlexboxLayout flexboxLayout = (FlexboxLayout) l3.d.a(view, R.id.fl_tags);
                if (flexboxLayout != null) {
                    i10 = R.id.iv_img;
                    QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_img);
                    if (qMUIRadiusImageView != null) {
                        i10 = R.id.tv_download;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_download);
                        if (textView != null) {
                            i10 = R.id.tv_name;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_name);
                            if (textView2 != null) {
                                i10 = R.id.tv_rank;
                                GradientTextView gradientTextView = (GradientTextView) l3.d.a(view, R.id.tv_rank);
                                if (gradientTextView != null) {
                                    i10 = R.id.vg_score;
                                    View viewA2 = l3.d.a(view, R.id.vg_score);
                                    if (viewA2 != null) {
                                        return new r3((RelativeLayout) view, cProgressButton, pVarA, flexboxLayout, qMUIRadiusImageView, textView, textView2, gradientTextView, ec.a(viewA2));
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
    public static r3 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16722, new Class[]{LayoutInflater.class}, r3.class);
        return patchProxyResultProxy.isSupported ? (r3) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static r3 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16723, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, r3.class);
        if (patchProxyResultProxy.isSupported) {
            return (r3) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.component_game_game_list_mobile, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f115060a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16725, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
