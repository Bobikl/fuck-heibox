package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemSearchFeedbackV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class kx implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f112756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f112757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112758c;

    private kx(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView) {
        this.f112756a = linearLayout;
        this.f112757b = recyclerView;
        this.f112758c = textView;
    }

    @androidx.annotation.n0
    public static kx a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19808, new Class[]{View.class}, kx.class);
        if (patchProxyResultProxy.isSupported) {
            return (kx) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv_feedback;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_feedback);
        if (recyclerView != null) {
            i10 = R.id.tv_title;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_title);
            if (textView != null) {
                return new kx((LinearLayout) view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static kx c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19806, new Class[]{LayoutInflater.class}, kx.class);
        return patchProxyResultProxy.isSupported ? (kx) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static kx d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19807, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, kx.class);
        if (patchProxyResultProxy.isSupported) {
            return (kx) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_search_feedback_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f112756a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19809, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
