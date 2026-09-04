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

/* JADX INFO: compiled from: LayoutPubgStatusBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class q90 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f114802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f114803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ah0 f114806e;

    private q90(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 ah0 ah0Var) {
        this.f114802a = linearLayout;
        this.f114803b = recyclerView;
        this.f114804c = textView;
        this.f114805d = linearLayout2;
        this.f114806e = ah0Var;
    }

    @androidx.annotation.n0
    public static q90 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21070, new Class[]{View.class}, q90.class);
        if (patchProxyResultProxy.isSupported) {
            return (q90) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv_all_status;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_all_status);
        if (recyclerView != null) {
            i10 = R.id.tv_all_status_expand;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_all_status_expand);
            if (textView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i10 = R.id.vg_radar;
                View viewA = l3.d.a(view, R.id.vg_radar);
                if (viewA != null) {
                    return new q90(linearLayout, recyclerView, textView, linearLayout, ah0.a(viewA));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static q90 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21068, new Class[]{LayoutInflater.class}, q90.class);
        return patchProxyResultProxy.isSupported ? (q90) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static q90 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21069, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, q90.class);
        if (patchProxyResultProxy.isSupported) {
            return (q90) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_pubg_status, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f114802a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21071, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
