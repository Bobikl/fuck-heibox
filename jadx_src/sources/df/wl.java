package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.GameAvatarView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameOverviewHeaderSmallBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wl implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameAvatarView f117212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117213e;

    private wl(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 GameAvatarView gameAvatarView, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f117209a = relativeLayout;
        this.f117210b = textView;
        this.f117211c = textView2;
        this.f117212d = gameAvatarView;
        this.f117213e = linearLayout;
    }

    @androidx.annotation.n0
    public static wl a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18612, new Class[]{View.class}, wl.class);
        if (patchProxyResultProxy.isSupported) {
            return (wl) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_name;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
        if (textView != null) {
            i10 = R.id.tv_steam_id;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_steam_id);
            if (textView2 != null) {
                i10 = R.id.v_game_avatar;
                GameAvatarView gameAvatarView = (GameAvatarView) l3.d.a(view, R.id.v_game_avatar);
                if (gameAvatarView != null) {
                    i10 = R.id.vg_steam_id;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_steam_id);
                    if (linearLayout != null) {
                        return new wl((RelativeLayout) view, textView, textView2, gameAvatarView, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static wl c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18610, new Class[]{LayoutInflater.class}, wl.class);
        return patchProxyResultProxy.isSupported ? (wl) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static wl d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18611, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, wl.class);
        if (patchProxyResultProxy.isSupported) {
            return (wl) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_overview_header_small, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117209a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18613, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
