package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemDota2MatchDataRightBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ii implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f111818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f111819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111820d;

    private ii(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView) {
        this.f111817a = relativeLayout;
        this.f111818b = qMUIRadiusImageView;
        this.f111819c = progressBar;
        this.f111820d = textView;
    }

    @androidx.annotation.n0
    public static ii a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18247, new Class[]{View.class}, ii.class);
        if (patchProxyResultProxy.isSupported) {
            return (ii) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_icon;
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_icon);
        if (qMUIRadiusImageView != null) {
            i10 = R.id.f76248pb;
            ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.f76248pb);
            if (progressBar != null) {
                i10 = R.id.tv_value;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_value);
                if (textView != null) {
                    return new ii((RelativeLayout) view, qMUIRadiusImageView, progressBar, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ii c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18245, new Class[]{LayoutInflater.class}, ii.class);
        return patchProxyResultProxy.isSupported ? (ii) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ii d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18246, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ii.class);
        if (patchProxyResultProxy.isSupported) {
            return (ii) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_dota2_match_data_right, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111817a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18248, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
