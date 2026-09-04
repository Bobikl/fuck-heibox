package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemAreaBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ed implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f110140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110143d;

    private ed(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 View view, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f110140a = linearLayout;
        this.f110141b = textView;
        this.f110142c = view;
        this.f110143d = relativeLayout;
    }

    @androidx.annotation.n0
    public static ed a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17712, new Class[]{View.class}, ed.class);
        if (patchProxyResultProxy.isSupported) {
            return (ed) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_item_area_text;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_item_area_text);
        if (textView != null) {
            i10 = R.id.v_item_area_divider;
            View viewA = l3.d.a(view, R.id.v_item_area_divider);
            if (viewA != null) {
                i10 = R.id.vg_item_area_text_wrapper;
                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_item_area_text_wrapper);
                if (relativeLayout != null) {
                    return new ed((LinearLayout) view, textView, viewA, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ed c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17710, new Class[]{LayoutInflater.class}, ed.class);
        return patchProxyResultProxy.isSupported ? (ed) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ed d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17711, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ed.class);
        if (patchProxyResultProxy.isSupported) {
            return (ed) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_area, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f110140a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17713, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
