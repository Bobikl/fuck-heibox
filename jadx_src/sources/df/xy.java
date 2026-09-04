package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemSteamFriendRequestBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class xy implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117658i;

    private xy(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5) {
        this.f117650a = relativeLayout;
        this.f117651b = imageView;
        this.f117652c = imageView2;
        this.f117653d = imageView3;
        this.f117654e = textView;
        this.f117655f = textView2;
        this.f117656g = textView3;
        this.f117657h = textView4;
        this.f117658i = textView5;
    }

    @androidx.annotation.n0
    public static xy a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19960, new Class[]{View.class}, xy.class);
        if (patchProxyResultProxy.isSupported) {
            return (xy) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_heybox_avartar;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_heybox_avartar);
        if (imageView != null) {
            i10 = R.id.iv_steam_avartar;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_steam_avartar);
            if (imageView2 != null) {
                i10 = R.id.iv_steam_logo;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_steam_logo);
                if (imageView3 != null) {
                    i10 = R.id.tv_accept;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_accept);
                    if (textView != null) {
                        i10 = R.id.tv_heybox_name;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_heybox_name);
                        if (textView2 != null) {
                            i10 = R.id.tv_refuse;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_refuse);
                            if (textView3 != null) {
                                i10 = R.id.tv_request_state;
                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_request_state);
                                if (textView4 != null) {
                                    i10 = R.id.tv_steam_name;
                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_steam_name);
                                    if (textView5 != null) {
                                        return new xy((RelativeLayout) view, imageView, imageView2, imageView3, textView, textView2, textView3, textView4, textView5);
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
    public static xy c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19958, new Class[]{LayoutInflater.class}, xy.class);
        return patchProxyResultProxy.isSupported ? (xy) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static xy d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19959, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, xy.class);
        if (patchProxyResultProxy.isSupported) {
            return (xy) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_steam_friend_request, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117650a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19961, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
