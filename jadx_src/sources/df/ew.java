package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemRecommendPostBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ew implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f110312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f110315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110316f;

    private ew(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f110311a = relativeLayout;
        this.f110312b = qMUIRadiusImageView;
        this.f110313c = textView;
        this.f110314d = textView2;
        this.f110315e = oVar;
        this.f110316f = linearLayout;
    }

    @androidx.annotation.n0
    public static ew a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19680, new Class[]{View.class}, ew.class);
        if (patchProxyResultProxy.isSupported) {
            return (ew) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_icon;
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_icon);
        if (qMUIRadiusImageView != null) {
            i10 = R.id.tv_botton;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_botton);
            if (textView != null) {
                i10 = R.id.tv_desc;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc);
                if (textView2 != null) {
                    i10 = R.id.v_divider;
                    View viewA = l3.d.a(view, R.id.v_divider);
                    if (viewA != null) {
                        mb.o oVarA = mb.o.a(viewA);
                        i10 = R.id.vg_botton;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_botton);
                        if (linearLayout != null) {
                            return new ew((RelativeLayout) view, qMUIRadiusImageView, textView, textView2, oVarA, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ew c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19678, new Class[]{LayoutInflater.class}, ew.class);
        return patchProxyResultProxy.isSupported ? (ew) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ew d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19679, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ew.class);
        if (patchProxyResultProxy.isSupported) {
            return (ew) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_recommend_post, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110311a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19681, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
