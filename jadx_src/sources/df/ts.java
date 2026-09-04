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

/* JADX INFO: compiled from: ItemPlatformsSalesBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ts implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final dk f116065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final dk f116066i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final dk f116067j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final dk f116068k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116069l;

    private ts(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 dk dkVar, @androidx.annotation.n0 dk dkVar2, @androidx.annotation.n0 dk dkVar3, @androidx.annotation.n0 dk dkVar4, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f116058a = relativeLayout;
        this.f116059b = imageView;
        this.f116060c = imageView2;
        this.f116061d = linearLayout;
        this.f116062e = linearLayout2;
        this.f116063f = linearLayout3;
        this.f116064g = textView;
        this.f116065h = dkVar;
        this.f116066i = dkVar2;
        this.f116067j = dkVar3;
        this.f116068k = dkVar4;
        this.f116069l = relativeLayout2;
    }

    @androidx.annotation.n0
    public static ts a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19328, new Class[]{View.class}, ts.class);
        if (patchProxyResultProxy.isSupported) {
            return (ts) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_arrow;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_arrow);
        if (imageView != null) {
            i10 = R.id.iv_img;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_img);
            if (imageView2 != null) {
                i10 = R.id.ll_entry;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_entry);
                if (linearLayout != null) {
                    i10 = R.id.ll_games2;
                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_games2);
                    if (linearLayout2 != null) {
                        i10 = R.id.ll_platforms;
                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.ll_platforms);
                        if (linearLayout3 != null) {
                            i10 = R.id.tv_count;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_count);
                            if (textView != null) {
                                i10 = R.id.vg_sale_game_0;
                                View viewA = l3.d.a(view, R.id.vg_sale_game_0);
                                if (viewA != null) {
                                    dk dkVarA = dk.a(viewA);
                                    i10 = R.id.vg_sale_game_1;
                                    View viewA2 = l3.d.a(view, R.id.vg_sale_game_1);
                                    if (viewA2 != null) {
                                        dk dkVarA2 = dk.a(viewA2);
                                        i10 = R.id.vg_sale_game_2;
                                        View viewA3 = l3.d.a(view, R.id.vg_sale_game_2);
                                        if (viewA3 != null) {
                                            dk dkVarA3 = dk.a(viewA3);
                                            i10 = R.id.vg_sale_game_3;
                                            View viewA4 = l3.d.a(view, R.id.vg_sale_game_3);
                                            if (viewA4 != null) {
                                                dk dkVarA4 = dk.a(viewA4);
                                                i10 = R.id.vg_title;
                                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_title);
                                                if (relativeLayout != null) {
                                                    return new ts((RelativeLayout) view, imageView, imageView2, linearLayout, linearLayout2, linearLayout3, textView, dkVarA, dkVarA2, dkVarA3, dkVarA4, relativeLayout);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ts c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19326, new Class[]{LayoutInflater.class}, ts.class);
        return patchProxyResultProxy.isSupported ? (ts) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ts d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19327, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ts.class);
        if (patchProxyResultProxy.isSupported) {
            return (ts) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_platforms_sales, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116058a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19329, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
