package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemChooseSwitchAvartarBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ff implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ImageView f110560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110561b;

    private ff(@androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2) {
        this.f110560a = imageView;
        this.f110561b = imageView2;
    }

    @androidx.annotation.n0
    public static ff a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17924, new Class[]{View.class}, ff.class);
        if (patchProxyResultProxy.isSupported) {
            return (ff) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ImageView imageView = (ImageView) view;
        return new ff(imageView, imageView);
    }

    @androidx.annotation.n0
    public static ff c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17922, new Class[]{LayoutInflater.class}, ff.class);
        return patchProxyResultProxy.isSupported ? (ff) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ff d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17923, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ff.class);
        if (patchProxyResultProxy.isSupported) {
            return (ff) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_choose_switch_avartar, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ImageView b() {
        return this.f110560a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17925, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
