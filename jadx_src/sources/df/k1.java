package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityManagerAccountListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f112368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f112370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112371d;

    private k1(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f112368a = linearLayout;
        this.f112369b = imageView;
        this.f112370c = recyclerView;
        this.f112371d = linearLayout2;
    }

    @androidx.annotation.n0
    public static k1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16488, new Class[]{View.class}, k1.class);
        if (patchProxyResultProxy.isSupported) {
            return (k1) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_add_account;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_add_account);
        if (imageView != null) {
            i10 = R.id.rv_account;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_account);
            if (recyclerView != null) {
                i10 = R.id.vg_add_account;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_add_account);
                if (linearLayout != null) {
                    return new k1((LinearLayout) view, imageView, recyclerView, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static k1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16486, new Class[]{LayoutInflater.class}, k1.class);
        return patchProxyResultProxy.isSupported ? (k1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static k1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16487, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, k1.class);
        if (patchProxyResultProxy.isSupported) {
            return (k1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_manager_account_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f112368a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16489, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
