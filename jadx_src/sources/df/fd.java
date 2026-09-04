package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemAreaCodeBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class fd implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110524b;

    private fd(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView) {
        this.f110523a = relativeLayout;
        this.f110524b = textView;
    }

    @androidx.annotation.n0
    public static fd a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17716, new Class[]{View.class}, fd.class);
        if (patchProxyResultProxy.isSupported) {
            return (fd) patchProxyResultProxy.result;
        }
        TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
        if (textView != null) {
            return new fd((RelativeLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tv_name)));
    }

    @androidx.annotation.n0
    public static fd c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17714, new Class[]{LayoutInflater.class}, fd.class);
        return patchProxyResultProxy.isSupported ? (fd) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static fd d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17715, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, fd.class);
        if (patchProxyResultProxy.isSupported) {
            return (fd) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_area_code, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110523a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17717, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
