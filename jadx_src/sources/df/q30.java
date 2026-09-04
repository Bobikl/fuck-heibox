package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.PlatformDataView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutCsgoGameDataCardV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class q30 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final PlatformDataView f114701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final PlatformDataView f114702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final PlatformDataView f114703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114705i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114706j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114707k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114708l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f114709m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114710n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114711o;

    private q30(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 PlatformDataView platformDataView, @androidx.annotation.n0 PlatformDataView platformDataView2, @androidx.annotation.n0 PlatformDataView platformDataView3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f114697a = relativeLayout;
        this.f114698b = imageView;
        this.f114699c = imageView2;
        this.f114700d = linearLayout;
        this.f114701e = platformDataView;
        this.f114702f = platformDataView2;
        this.f114703g = platformDataView3;
        this.f114704h = textView;
        this.f114705i = textView2;
        this.f114706j = textView3;
        this.f114707k = textView4;
        this.f114708l = textView5;
        this.f114709m = cardView;
        this.f114710n = linearLayout2;
        this.f114711o = linearLayout3;
    }

    @androidx.annotation.n0
    public static q30 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20450, new Class[]{View.class}, q30.class);
        if (patchProxyResultProxy.isSupported) {
            return (q30) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_game_data_card_bg;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_game_data_card_bg);
        if (imageView != null) {
            i10 = R.id.iv_mask;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_mask);
            if (imageView2 != null) {
                i10 = R.id.ll_tips;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_tips);
                if (linearLayout != null) {
                    i10 = R.id.pdv0;
                    PlatformDataView platformDataView = (PlatformDataView) l3.d.a(view, R.id.pdv0);
                    if (platformDataView != null) {
                        i10 = R.id.pdv1;
                        PlatformDataView platformDataView2 = (PlatformDataView) l3.d.a(view, R.id.pdv1);
                        if (platformDataView2 != null) {
                            i10 = R.id.pdv2;
                            PlatformDataView platformDataView3 = (PlatformDataView) l3.d.a(view, R.id.pdv2);
                            if (platformDataView3 != null) {
                                i10 = R.id.tv_bottom_data;
                                TextView textView = (TextView) l3.d.a(view, R.id.tv_bottom_data);
                                if (textView != null) {
                                    i10 = R.id.tv_bottom_desc;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_bottom_desc);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_map_name;
                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_map_name);
                                        if (textView3 != null) {
                                            i10 = R.id.tv_nick_name;
                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_nick_name);
                                            if (textView4 != null) {
                                                i10 = R.id.tv_not_data_desc;
                                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_not_data_desc);
                                                if (textView5 != null) {
                                                    i10 = R.id.vg_card;
                                                    CardView cardView = (CardView) l3.d.a(view, R.id.vg_card);
                                                    if (cardView != null) {
                                                        i10 = R.id.vg_game_data_card_data;
                                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_game_data_card_data);
                                                        if (linearLayout2 != null) {
                                                            i10 = R.id.vg_platform_data;
                                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_platform_data);
                                                            if (linearLayout3 != null) {
                                                                return new q30((RelativeLayout) view, imageView, imageView2, linearLayout, platformDataView, platformDataView2, platformDataView3, textView, textView2, textView3, textView4, textView5, cardView, linearLayout2, linearLayout3);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static q30 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20448, new Class[]{LayoutInflater.class}, q30.class);
        return patchProxyResultProxy.isSupported ? (q30) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static q30 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20449, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, q30.class);
        if (patchProxyResultProxy.isSupported) {
            return (q30) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_csgo_game_data_card_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114697a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20451, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
