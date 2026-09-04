package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.component.QRCodeShareView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutGameFollowPurchaseShareBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j60 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f112034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f112035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f112039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112042i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112043j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final QRCodeShareView f112044k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112045l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final ek f112046m;

    private j60(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 QRCodeShareView qRCodeShareView, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 ek ekVar) {
        this.f112034a = relativeLayout;
        this.f112035b = oVar;
        this.f112036c = imageView;
        this.f112037d = imageView2;
        this.f112038e = linearLayout;
        this.f112039f = recyclerView;
        this.f112040g = textView;
        this.f112041h = textView2;
        this.f112042i = textView3;
        this.f112043j = textView4;
        this.f112044k = qRCodeShareView;
        this.f112045l = linearLayout2;
        this.f112046m = ekVar;
    }

    @androidx.annotation.n0
    public static j60 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20732, new Class[]{View.class}, j60.class);
        if (patchProxyResultProxy.isSupported) {
            return (j60) patchProxyResultProxy.result;
        }
        int i10 = R.id.barcodes_divider;
        View viewA = l3.d.a(view, R.id.barcodes_divider);
        if (viewA != null) {
            mb.o oVarA = mb.o.a(viewA);
            i10 = R.id.iv_game_logo;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_game_logo);
            if (imageView != null) {
                i10 = R.id.iv_user_avatar;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_user_avatar);
                if (imageView2 != null) {
                    i10 = R.id.ll_more;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_more);
                    if (linearLayout != null) {
                        i10 = R.id.rv_games;
                        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_games);
                        if (recyclerView != null) {
                            i10 = R.id.tv_moments_desc;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_moments_desc);
                            if (textView != null) {
                                i10 = R.id.tv_moments_time;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_moments_time);
                                if (textView2 != null) {
                                    i10 = R.id.tv_more_game;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_more_game);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_user_name;
                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_user_name);
                                        if (textView4 != null) {
                                            i10 = R.id.v_qr_code;
                                            QRCodeShareView qRCodeShareView = (QRCodeShareView) l3.d.a(view, R.id.v_qr_code);
                                            if (qRCodeShareView != null) {
                                                i10 = R.id.vg_game_list;
                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_game_list);
                                                if (linearLayout2 != null) {
                                                    i10 = R.id.vg_single_game;
                                                    View viewA2 = l3.d.a(view, R.id.vg_single_game);
                                                    if (viewA2 != null) {
                                                        return new j60((RelativeLayout) view, oVarA, imageView, imageView2, linearLayout, recyclerView, textView, textView2, textView3, textView4, qRCodeShareView, linearLayout2, ek.a(viewA2));
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
    public static j60 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20730, new Class[]{LayoutInflater.class}, j60.class);
        return patchProxyResultProxy.isSupported ? (j60) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static j60 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20731, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, j60.class);
        if (patchProxyResultProxy.isSupported) {
            return (j60) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_game_follow_purchase_share, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f112034a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20733, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
