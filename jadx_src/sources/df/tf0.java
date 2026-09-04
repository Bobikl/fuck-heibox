package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewGameDetailScroeAndRuleBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class tf0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f115987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115991e;

    private tf0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f115987a = linearLayout;
        this.f115988b = textView;
        this.f115989c = textView2;
        this.f115990d = linearLayout2;
        this.f115991e = linearLayout3;
    }

    @androidx.annotation.n0
    public static tf0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21698, new Class[]{View.class}, tf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (tf0) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_score_comment;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_score_comment);
        if (textView != null) {
            i10 = R.id.tv_score_stats;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_score_stats);
            if (textView2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i10 = R.id.vg_score_stats;
                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_score_stats);
                if (linearLayout2 != null) {
                    return new tf0(linearLayout, textView, textView2, linearLayout, linearLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static tf0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21696, new Class[]{LayoutInflater.class}, tf0.class);
        return patchProxyResultProxy.isSupported ? (tf0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static tf0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21697, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, tf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (tf0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_game_detail_scroe_and_rule, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f115987a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21699, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
