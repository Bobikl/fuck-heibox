package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ErrorViewBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class r implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f131723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f131724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f131725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f131726d;

    private r(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 View view) {
        this.f131723a = linearLayout;
        this.f131724b = linearLayout2;
        this.f131725c = linearLayout3;
        this.f131726d = view;
    }

    @androidx.annotation.n0
    public static r a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.L6, new Class[]{View.class}, r.class);
        if (patchProxyResultProxy.isSupported) {
            return (r) patchProxyResultProxy.result;
        }
        int i10 = R.id.error_content;
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
        if (linearLayout != null) {
            LinearLayout linearLayout2 = (LinearLayout) view;
            int i11 = R.id.top_view;
            View viewA = l3.d.a(view, i11);
            if (viewA != null) {
                return new r(linearLayout2, linearLayout, linearLayout2, viewA);
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static r c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.J6, new Class[]{LayoutInflater.class}, r.class);
        return patchProxyResultProxy.isSupported ? (r) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static r d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.K6, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, r.class);
        if (patchProxyResultProxy.isSupported) {
            return (r) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.error_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f131723a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.M6, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
