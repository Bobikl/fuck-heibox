package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutAllBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h20 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111224g;

    private h20(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3) {
        this.f111218a = relativeLayout;
        this.f111219b = imageView;
        this.f111220c = imageView2;
        this.f111221d = linearLayout;
        this.f111222e = textView;
        this.f111223f = textView2;
        this.f111224g = textView3;
    }

    @androidx.annotation.n0
    public static h20 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20310, new Class[]{View.class}, h20.class);
        if (patchProxyResultProxy.isSupported) {
            return (h20) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_layout_all_action;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_layout_all_action);
        if (imageView != null) {
            i10 = R.id.iv_layout_all_icon;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_layout_all_icon);
            if (imageView2 != null) {
                i10 = R.id.ll_layout_all_action;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_layout_all_action);
                if (linearLayout != null) {
                    i10 = R.id.tv_layout_all_action_text;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_layout_all_action_text);
                    if (textView != null) {
                        i10 = R.id.tv_layout_all_subtitle;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_layout_all_subtitle);
                        if (textView2 != null) {
                            i10 = R.id.tv_layout_all_title;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_layout_all_title);
                            if (textView3 != null) {
                                return new h20((RelativeLayout) view, imageView, imageView2, linearLayout, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static h20 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20308, new Class[]{LayoutInflater.class}, h20.class);
        return patchProxyResultProxy.isSupported ? (h20) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static h20 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20309, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, h20.class);
        if (patchProxyResultProxy.isSupported) {
            return (h20) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_all, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111218a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20311, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
