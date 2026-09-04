package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentUpdateaccountDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class vb implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f116762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116764d;

    private vb(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f116761a = relativeLayout;
        this.f116762b = recyclerView;
        this.f116763c = textView;
        this.f116764d = linearLayout;
    }

    @androidx.annotation.n0
    public static vb a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17572, new Class[]{View.class}, vb.class);
        if (patchProxyResultProxy.isSupported) {
            return (vb) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv_item;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_item);
        if (recyclerView != null) {
            i10 = R.id.tv_title;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_title);
            if (textView != null) {
                i10 = R.id.vg_content;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_content);
                if (linearLayout != null) {
                    return new vb((RelativeLayout) view, recyclerView, textView, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static vb c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17570, new Class[]{LayoutInflater.class}, vb.class);
        return patchProxyResultProxy.isSupported ? (vb) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static vb d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17571, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, vb.class);
        if (patchProxyResultProxy.isSupported) {
            return (vb) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_updateaccount_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116761a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17573, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
