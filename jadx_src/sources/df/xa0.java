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

/* JADX INFO: compiled from: LayoutSteamBotAcceptDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class xa0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f117500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117507h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117508i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117509j;

    private xa0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f117500a = linearLayout;
        this.f117501b = imageView;
        this.f117502c = imageView2;
        this.f117503d = textView;
        this.f117504e = textView2;
        this.f117505f = textView3;
        this.f117506g = textView4;
        this.f117507h = textView5;
        this.f117508i = linearLayout2;
        this.f117509j = linearLayout3;
    }

    @androidx.annotation.n0
    public static xa0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21201, new Class[]{View.class}, xa0.class);
        if (patchProxyResultProxy.isSupported) {
            return (xa0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_faq;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_faq);
        if (imageView != null) {
            i10 = R.id.iv_image;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_image);
            if (imageView2 != null) {
                i10 = R.id.tv_bot_steam_id;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_bot_steam_id);
                if (textView != null) {
                    i10 = R.id.tv_copy;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_copy);
                    if (textView2 != null) {
                        i10 = R.id.tv_desc;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_desc);
                        if (textView3 != null) {
                            i10 = R.id.tv_tips;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_tips);
                            if (textView4 != null) {
                                i10 = R.id.tv_title;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_title);
                                if (textView5 != null) {
                                    i10 = R.id.vg_bot_steam_id_info;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_bot_steam_id_info);
                                    if (linearLayout != null) {
                                        i10 = R.id.vg_title;
                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_title);
                                        if (linearLayout2 != null) {
                                            return new xa0((LinearLayout) view, imageView, imageView2, textView, textView2, textView3, textView4, textView5, linearLayout, linearLayout2);
                                        }
                                    }
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
    public static xa0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21199, new Class[]{LayoutInflater.class}, xa0.class);
        return patchProxyResultProxy.isSupported ? (xa0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static xa0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21200, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, xa0.class);
        if (patchProxyResultProxy.isSupported) {
            return (xa0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_steam_bot_accept_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f117500a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21202, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
