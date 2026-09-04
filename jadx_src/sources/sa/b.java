package sa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.component.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemComponentBinding.java */
/* JADX INFO: loaded from: classes8.dex */
public final class b implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final LinearLayout f139353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final ImageView f139354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final TextView f139355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final TextView f139356d;

    private b(@n0 LinearLayout linearLayout, @n0 ImageView imageView, @n0 TextView textView, @n0 TextView textView2) {
        this.f139353a = linearLayout;
        this.f139354b = imageView;
        this.f139355c = textView;
        this.f139356d = textView2;
    }

    @n0
    public static b a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.b.um, new Class[]{View.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv;
        ImageView imageView = (ImageView) l3.d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.tv_android_name;
            TextView textView = (TextView) l3.d.a(view, i10);
            if (textView != null) {
                i10 = R.id.tv_design_name;
                TextView textView2 = (TextView) l3.d.a(view, i10);
                if (textView2 != null) {
                    return new b((LinearLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static b c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.b.sm, new Class[]{LayoutInflater.class}, b.class);
        return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static b d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.b.tm, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_component, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public LinearLayout b() {
        return this.f139353a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.vm, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
