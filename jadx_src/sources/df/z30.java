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

/* JADX INFO: compiled from: LayoutDota2MatchDetailDescBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class z30 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f118187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118194h;

    private z30(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5) {
        this.f118187a = linearLayout;
        this.f118188b = imageView;
        this.f118189c = imageView2;
        this.f118190d = textView;
        this.f118191e = textView2;
        this.f118192f = textView3;
        this.f118193g = textView4;
        this.f118194h = textView5;
    }

    @androidx.annotation.n0
    public static z30 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20486, new Class[]{View.class}, z30.class);
        if (patchProxyResultProxy.isSupported) {
            return (z30) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_copy_match_id;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_copy_match_id);
        if (imageView != null) {
            i10 = R.id.iv_dan_icon;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_dan_icon);
            if (imageView2 != null) {
                i10 = R.id.tv_date;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_date);
                if (textView != null) {
                    i10 = R.id.tv_duration;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_duration);
                    if (textView2 != null) {
                        i10 = R.id.tv_match_id;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_match_id);
                        if (textView3 != null) {
                            i10 = R.id.tv_module_name;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_module_name);
                            if (textView4 != null) {
                                i10 = R.id.tv_server;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_server);
                                if (textView5 != null) {
                                    return new z30((LinearLayout) view, imageView, imageView2, textView, textView2, textView3, textView4, textView5);
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
    public static z30 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20484, new Class[]{LayoutInflater.class}, z30.class);
        return patchProxyResultProxy.isSupported ? (z30) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static z30 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20485, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, z30.class);
        if (patchProxyResultProxy.isSupported) {
            return (z30) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_dota2_match_detail_desc, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f118187a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20487, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
