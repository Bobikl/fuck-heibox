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

/* JADX INFO: compiled from: LayoutGameStatAccountMiniCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class u60 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116214k;

    private u60(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f116204a = relativeLayout;
        this.f116205b = imageView;
        this.f116206c = imageView2;
        this.f116207d = imageView3;
        this.f116208e = imageView4;
        this.f116209f = imageView5;
        this.f116210g = textView;
        this.f116211h = textView2;
        this.f116212i = textView3;
        this.f116213j = linearLayout;
        this.f116214k = linearLayout2;
    }

    @androidx.annotation.n0
    public static u60 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20776, new Class[]{View.class}, u60.class);
        if (patchProxyResultProxy.isSupported) {
            return (u60) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_app_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_app_icon);
        if (imageView != null) {
            i10 = R.id.iv_bg;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_bg);
            if (imageView2 != null) {
                i10 = R.id.iv_close_rec;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_close_rec);
                if (imageView3 != null) {
                    i10 = R.id.iv_game_data_card_role;
                    ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_game_data_card_role);
                    if (imageView4 != null) {
                        i10 = R.id.iv_level_icon;
                        ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_level_icon);
                        if (imageView5 != null) {
                            i10 = R.id.tv_data;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_data);
                            if (textView != null) {
                                i10 = R.id.tv_data_desc;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_data_desc);
                                if (textView2 != null) {
                                    i10 = R.id.tv_nick_name;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_nick_name);
                                    if (textView3 != null) {
                                        i10 = R.id.vg_data;
                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_data);
                                        if (linearLayout != null) {
                                            i10 = R.id.vg_go_binding;
                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_go_binding);
                                            if (linearLayout2 != null) {
                                                return new u60((RelativeLayout) view, imageView, imageView2, imageView3, imageView4, imageView5, textView, textView2, textView3, linearLayout, linearLayout2);
                                            }
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
    public static u60 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20774, new Class[]{LayoutInflater.class}, u60.class);
        return patchProxyResultProxy.isSupported ? (u60) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static u60 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20775, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, u60.class);
        if (patchProxyResultProxy.isSupported) {
            return (u60) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_game_stat_account_mini_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116204a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20777, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
