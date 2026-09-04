package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemMomentsInteractiveBarBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class br implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f109008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109014g;

    private br(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4) {
        this.f109008a = linearLayout;
        this.f109009b = imageView;
        this.f109010c = textView;
        this.f109011d = textView2;
        this.f109012e = linearLayout2;
        this.f109013f = linearLayout3;
        this.f109014g = linearLayout4;
    }

    @androidx.annotation.n0
    public static br a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19152, new Class[]{View.class}, br.class);
        if (patchProxyResultProxy.isSupported) {
            return (br) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_arrow;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_arrow);
        if (imageView != null) {
            i10 = R.id.tv_related_desc;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_related_desc);
            if (textView != null) {
                i10 = R.id.tv_related_name;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_related_name);
                if (textView2 != null) {
                    i10 = R.id.vg_icon;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_icon);
                    if (linearLayout != null) {
                        LinearLayout linearLayout2 = (LinearLayout) view;
                        i10 = R.id.vg_related_events;
                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_related_events);
                        if (linearLayout3 != null) {
                            return new br(linearLayout2, imageView, textView, textView2, linearLayout, linearLayout2, linearLayout3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static br c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19150, new Class[]{LayoutInflater.class}, br.class);
        return patchProxyResultProxy.isSupported ? (br) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static br d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19151, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, br.class);
        if (patchProxyResultProxy.isSupported) {
            return (br) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_moments_interactive_bar, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f109008a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19153, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
