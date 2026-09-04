package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.view.richtext.RichStackModelView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewBbsRankHotBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class le0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f113023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f113024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RichStackModelView f113026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBLineHeightTextView f113028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f113030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113032j;

    private le0(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 RichStackModelView richStackModelView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 HBLineHeightTextView hBLineHeightTextView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f113023a = constraintLayout;
        this.f113024b = qMUIRadiusImageView;
        this.f113025c = textView;
        this.f113026d = richStackModelView;
        this.f113027e = textView2;
        this.f113028f = hBLineHeightTextView;
        this.f113029g = linearLayout;
        this.f113030h = frameLayout;
        this.f113031i = linearLayout2;
        this.f113032j = relativeLayout;
    }

    @androidx.annotation.n0
    public static le0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21562, new Class[]{View.class}, le0.class);
        if (patchProxyResultProxy.isSupported) {
            return (le0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_img;
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_img);
        if (qMUIRadiusImageView != null) {
            i10 = R.id.tv_comment;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_comment);
            if (textView != null) {
                i10 = R.id.tv_desc;
                RichStackModelView richStackModelView = (RichStackModelView) l3.d.a(view, R.id.tv_desc);
                if (richStackModelView != null) {
                    i10 = R.id.tv_rank;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_rank);
                    if (textView2 != null) {
                        i10 = R.id.tv_title;
                        HBLineHeightTextView hBLineHeightTextView = (HBLineHeightTextView) l3.d.a(view, R.id.tv_title);
                        if (hBLineHeightTextView != null) {
                            i10 = R.id.vg_comment;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_comment);
                            if (linearLayout != null) {
                                i10 = R.id.vg_desc;
                                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_desc);
                                if (frameLayout != null) {
                                    i10 = R.id.vg_rank;
                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_rank);
                                    if (linearLayout2 != null) {
                                        i10 = R.id.vg_title;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_title);
                                        if (relativeLayout != null) {
                                            return new le0((ConstraintLayout) view, qMUIRadiusImageView, textView, richStackModelView, textView2, hBLineHeightTextView, linearLayout, frameLayout, linearLayout2, relativeLayout);
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
    public static le0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21560, new Class[]{LayoutInflater.class}, le0.class);
        return patchProxyResultProxy.isSupported ? (le0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static le0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21561, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, le0.class);
        if (patchProxyResultProxy.isSupported) {
            return (le0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_bbs_rank_hot, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f113023a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21563, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
