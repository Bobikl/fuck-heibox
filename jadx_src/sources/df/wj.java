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

/* JADX INFO: compiled from: ItemFriendOnlineBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wj implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f117205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117206i;

    private wj(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f117198a = relativeLayout;
        this.f117199b = imageView;
        this.f117200c = imageView2;
        this.f117201d = imageView3;
        this.f117202e = textView;
        this.f117203f = textView2;
        this.f117204g = textView3;
        this.f117205h = view;
        this.f117206i = linearLayout;
    }

    @androidx.annotation.n0
    public static wj a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18407, new Class[]{View.class}, wj.class);
        if (patchProxyResultProxy.isSupported) {
            return (wj) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_heybox_friend;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_heybox_friend);
        if (imageView != null) {
            i10 = R.id.iv_item_friend_ranking_avatar;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_item_friend_ranking_avatar);
            if (imageView2 != null) {
                i10 = R.id.iv_item_friend_ranking_x_heybox_avatar;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_item_friend_ranking_x_heybox_avatar);
                if (imageView3 != null) {
                    i10 = R.id.tv_item_friend_online_status;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_item_friend_online_status);
                    if (textView != null) {
                        i10 = R.id.tv_item_friend_ranking_nickname;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_item_friend_ranking_nickname);
                        if (textView2 != null) {
                            i10 = R.id.tv_item_friend_ranking_x_heybox_username;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_item_friend_ranking_x_heybox_username);
                            if (textView3 != null) {
                                i10 = R.id.v_item_friend_ranking_divider;
                                View viewA = l3.d.a(view, R.id.v_item_friend_ranking_divider);
                                if (viewA != null) {
                                    i10 = R.id.vg_steam_info;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_steam_info);
                                    if (linearLayout != null) {
                                        return new wj((RelativeLayout) view, imageView, imageView2, imageView3, textView, textView2, textView3, viewA, linearLayout);
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
    public static wj c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18405, new Class[]{LayoutInflater.class}, wj.class);
        return patchProxyResultProxy.isSupported ? (wj) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static wj d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18406, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, wj.class);
        if (patchProxyResultProxy.isSupported) {
            return (wj) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_friend_online, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117198a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18408, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
