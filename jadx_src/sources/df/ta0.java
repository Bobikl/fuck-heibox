package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.component.QRCodeShareView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutShareSwitchDetailBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ta0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final NestedScrollView f115921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115928h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final QRCodeShareView f115929i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115930j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115931k;

    private ta0(@androidx.annotation.n0 NestedScrollView nestedScrollView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 QRCodeShareView qRCodeShareView, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f115921a = nestedScrollView;
        this.f115922b = textView;
        this.f115923c = textView2;
        this.f115924d = imageView;
        this.f115925e = recyclerView;
        this.f115926f = textView3;
        this.f115927g = textView4;
        this.f115928h = textView5;
        this.f115929i = qRCodeShareView;
        this.f115930j = relativeLayout;
        this.f115931k = relativeLayout2;
    }

    @androidx.annotation.n0
    public static ta0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21186, new Class[]{View.class}, ta0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ta0) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_friend_code;
        TextView textView = (TextView) l3.d.a(view, R.id.et_friend_code);
        if (textView != null) {
            i10 = R.id.et_name;
            TextView textView2 = (TextView) l3.d.a(view, R.id.et_name);
            if (textView2 != null) {
                i10 = R.id.iv_avartar;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_avartar);
                if (imageView != null) {
                    i10 = R.id.rv_my_game;
                    RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_my_game);
                    if (recyclerView != null) {
                        i10 = R.id.tv_my_game;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_my_game);
                        if (textView3 != null) {
                            i10 = R.id.tv_my_game_num;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_my_game_num);
                            if (textView4 != null) {
                                i10 = R.id.tv_switch_title;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_switch_title);
                                if (textView5 != null) {
                                    i10 = R.id.v_qr_code;
                                    QRCodeShareView qRCodeShareView = (QRCodeShareView) l3.d.a(view, R.id.v_qr_code);
                                    if (qRCodeShareView != null) {
                                        i10 = R.id.vg_avartar;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_avartar);
                                        if (relativeLayout != null) {
                                            i10 = R.id.vg_user_item;
                                            RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_user_item);
                                            if (relativeLayout2 != null) {
                                                return new ta0((NestedScrollView) view, textView, textView2, imageView, recyclerView, textView3, textView4, textView5, qRCodeShareView, relativeLayout, relativeLayout2);
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
    public static ta0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21184, new Class[]{LayoutInflater.class}, ta0.class);
        return patchProxyResultProxy.isSupported ? (ta0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ta0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21185, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ta0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ta0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_share_switch_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public NestedScrollView b() {
        return this.f115921a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21187, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
