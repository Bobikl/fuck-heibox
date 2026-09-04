package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemPubgDataBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zt implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f118459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118463e;

    private zt(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.f118459a = constraintLayout;
        this.f118460b = textView;
        this.f118461c = textView2;
        this.f118462d = textView3;
        this.f118463e = textView4;
    }

    @androidx.annotation.n0
    public static zt a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19452, new Class[]{View.class}, zt.class);
        if (patchProxyResultProxy.isSupported) {
            return (zt) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_desc;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
        if (textView != null) {
            i10 = R.id.tv_rank;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_rank);
            if (textView2 != null) {
                i10 = R.id.tv_score;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_score);
                if (textView3 != null) {
                    i10 = R.id.tv_value;
                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_value);
                    if (textView4 != null) {
                        return new zt((ConstraintLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static zt c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19450, new Class[]{LayoutInflater.class}, zt.class);
        return patchProxyResultProxy.isSupported ? (zt) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static zt d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19451, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, zt.class);
        if (patchProxyResultProxy.isSupported) {
            return (zt) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_pubg_data, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f118459a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19453, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
