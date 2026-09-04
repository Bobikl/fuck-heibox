package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: MenuCollectBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ad0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f108513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f108515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f108517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f108518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108520h;

    private ad0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 View view, @androidx.annotation.n0 View view2, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f108513a = linearLayout;
        this.f108514b = imageView;
        this.f108515c = recyclerView;
        this.f108516d = textView;
        this.f108517e = view;
        this.f108518f = view2;
        this.f108519g = linearLayout2;
        this.f108520h = linearLayout3;
    }

    @androidx.annotation.n0
    public static ad0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21417, new Class[]{View.class}, ad0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ad0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_back;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_back);
        if (imageView != null) {
            i10 = R.id.rv_menu_collect;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_menu_collect);
            if (recyclerView != null) {
                i10 = R.id.tv_cancel;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_cancel);
                if (textView != null) {
                    i10 = R.id.v_margin;
                    View viewA = l3.d.a(view, R.id.v_margin);
                    if (viewA != null) {
                        i10 = R.id.v_shadow;
                        View viewA2 = l3.d.a(view, R.id.v_shadow);
                        if (viewA2 != null) {
                            i10 = R.id.vg_content;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_content);
                            if (linearLayout != null) {
                                i10 = R.id.vg_create_folder;
                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_create_folder);
                                if (linearLayout2 != null) {
                                    return new ad0((LinearLayout) view, imageView, recyclerView, textView, viewA, viewA2, linearLayout, linearLayout2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ad0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21415, new Class[]{LayoutInflater.class}, ad0.class);
        return patchProxyResultProxy.isSupported ? (ad0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ad0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21416, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ad0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ad0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.menu_collect, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f108513a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21418, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
