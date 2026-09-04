package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentLinkListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class s9 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f115509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.q f115511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115513e;

    private s9(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 mb.q qVar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f115509a = relativeLayout;
        this.f115510b = imageView;
        this.f115511c = qVar;
        this.f115512d = textView;
        this.f115513e = textView2;
    }

    @androidx.annotation.n0
    public static s9 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17352, new Class[]{View.class}, s9.class);
        if (patchProxyResultProxy.isSupported) {
            return (s9) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_write_post;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_write_post);
        if (imageView != null) {
            i10 = R.id.rv_empty_view;
            View viewA = l3.d.a(view, R.id.rv_empty_view);
            if (viewA != null) {
                mb.q qVarA = mb.q.a(viewA);
                i10 = R.id.tv_recommend_confirm;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_recommend_confirm);
                if (textView != null) {
                    i10 = R.id.tv_update_tips;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_update_tips);
                    if (textView2 != null) {
                        return new s9((RelativeLayout) view, imageView, qVarA, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static s9 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17350, new Class[]{LayoutInflater.class}, s9.class);
        return patchProxyResultProxy.isSupported ? (s9) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static s9 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17351, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, s9.class);
        if (patchProxyResultProxy.isSupported) {
            return (s9) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_link_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f115509a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17353, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
