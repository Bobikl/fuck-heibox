package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemR6MatchesTitleBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class xu implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f117638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f117639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f117641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117642e;

    private xu(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 Guideline guideline, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f117638a = constraintLayout;
        this.f117639b = guideline;
        this.f117640c = textView;
        this.f117641d = view;
        this.f117642e = linearLayout;
    }

    @androidx.annotation.n0
    public static xu a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19548, new Class[]{View.class}, xu.class);
        if (patchProxyResultProxy.isSupported) {
            return (xu) patchProxyResultProxy.result;
        }
        int i10 = R.id.line_guide;
        Guideline guideline = (Guideline) l3.d.a(view, R.id.line_guide);
        if (guideline != null) {
            i10 = R.id.tv_title_score;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_title_score);
            if (textView != null) {
                i10 = R.id.v_item_matches_divider;
                View viewA = l3.d.a(view, R.id.v_item_matches_divider);
                if (viewA != null) {
                    i10 = R.id.vg_kd;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_kd);
                    if (linearLayout != null) {
                        return new xu((ConstraintLayout) view, guideline, textView, viewA, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static xu c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19546, new Class[]{LayoutInflater.class}, xu.class);
        return patchProxyResultProxy.isSupported ? (xu) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static xu d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19547, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, xu.class);
        if (patchProxyResultProxy.isSupported) {
            return (xu) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_r6_matches_title, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f117638a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19549, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
