package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutUserCommentListHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class xb0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f117525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f117526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f117527f;

    private xb0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 View view, @androidx.annotation.n0 View view2, @androidx.annotation.n0 ConstraintLayout constraintLayout) {
        this.f117522a = relativeLayout;
        this.f117523b = textView;
        this.f117524c = textView2;
        this.f117525d = view;
        this.f117526e = view2;
        this.f117527f = constraintLayout;
    }

    @androidx.annotation.n0
    public static xb0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21301, new Class[]{View.class}, xb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (xb0) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_filter_all;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_filter_all);
        if (textView != null) {
            i10 = R.id.tv_filter_cy;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_filter_cy);
            if (textView2 != null) {
                i10 = R.id.v_filter_all;
                View viewA = l3.d.a(view, R.id.v_filter_all);
                if (viewA != null) {
                    i10 = R.id.v_filter_cy;
                    View viewA2 = l3.d.a(view, R.id.v_filter_cy);
                    if (viewA2 != null) {
                        i10 = R.id.vg_comment_filter;
                        ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.vg_comment_filter);
                        if (constraintLayout != null) {
                            return new xb0((RelativeLayout) view, textView, textView2, viewA, viewA2, constraintLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static xb0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21299, new Class[]{LayoutInflater.class}, xb0.class);
        return patchProxyResultProxy.isSupported ? (xb0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static xb0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21300, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, xb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (xb0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_user_comment_list_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117522a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21302, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
