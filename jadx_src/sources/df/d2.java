package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.hbcustomview.recyclerview.UniversalRecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: ActivitySteamGameShotBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d2 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f109583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final UniversalRecyclerView f109586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f109587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.q f109591i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f109592j;

    private d2(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 UniversalRecyclerView universalRecyclerView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 mb.q qVar, @androidx.annotation.n0 CardView cardView) {
        this.f109583a = linearLayout;
        this.f109584b = imageView;
        this.f109585c = imageView2;
        this.f109586d = universalRecyclerView;
        this.f109587e = smartRefreshLayout;
        this.f109588f = textView;
        this.f109589g = textView2;
        this.f109590h = relativeLayout;
        this.f109591i = qVar;
        this.f109592j = cardView;
    }

    @androidx.annotation.n0
    public static d2 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16564, new Class[]{View.class}, d2.class);
        if (patchProxyResultProxy.isSupported) {
            return (d2) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_arrow;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_arrow);
        if (imageView != null) {
            i10 = R.id.iv_current_arrow;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_current_arrow);
            if (imageView2 != null) {
                i10 = R.id.rv;
                UniversalRecyclerView universalRecyclerView = (UniversalRecyclerView) l3.d.a(view, R.id.rv);
                if (universalRecyclerView != null) {
                    i10 = R.id.srl;
                    SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
                    if (smartRefreshLayout != null) {
                        i10 = R.id.tv_current_folder;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_current_folder);
                        if (textView != null) {
                            i10 = R.id.tv_toast_text;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_toast_text);
                            if (textView2 != null) {
                                i10 = R.id.vg_current_folder;
                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_current_folder);
                                if (relativeLayout != null) {
                                    i10 = R.id.vg_empty_view;
                                    View viewA = l3.d.a(view, R.id.vg_empty_view);
                                    if (viewA != null) {
                                        mb.q qVarA = mb.q.a(viewA);
                                        i10 = R.id.vg_share_toast;
                                        CardView cardView = (CardView) l3.d.a(view, R.id.vg_share_toast);
                                        if (cardView != null) {
                                            return new d2((LinearLayout) view, imageView, imageView2, universalRecyclerView, smartRefreshLayout, textView, textView2, relativeLayout, qVarA, cardView);
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
    public static d2 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16562, new Class[]{LayoutInflater.class}, d2.class);
        return patchProxyResultProxy.isSupported ? (d2) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static d2 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16563, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, d2.class);
        if (patchProxyResultProxy.isSupported) {
            return (d2) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_steam_game_shot, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f109583a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16565, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
