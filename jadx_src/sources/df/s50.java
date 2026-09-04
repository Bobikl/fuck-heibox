package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutGameAchieveShareBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class s50 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f115461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f115462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f115467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115471k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115472l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115473m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115474n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115475o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115476p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115477q;

    private s50(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 mb.o oVar2, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f115461a = relativeLayout;
        this.f115462b = oVar;
        this.f115463c = imageView;
        this.f115464d = imageView2;
        this.f115465e = imageView3;
        this.f115466f = imageView4;
        this.f115467g = oVar2;
        this.f115468h = recyclerView;
        this.f115469i = textView;
        this.f115470j = textView2;
        this.f115471k = textView3;
        this.f115472l = textView4;
        this.f115473m = textView5;
        this.f115474n = textView6;
        this.f115475o = textView7;
        this.f115476p = linearLayout;
        this.f115477q = relativeLayout2;
    }

    @androidx.annotation.n0
    public static s50 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20664, new Class[]{View.class}, s50.class);
        if (patchProxyResultProxy.isSupported) {
            return (s50) patchProxyResultProxy.result;
        }
        int i10 = R.id.barcodes_divider;
        View viewA = l3.d.a(view, R.id.barcodes_divider);
        if (viewA != null) {
            mb.o oVarA = mb.o.a(viewA);
            i10 = R.id.iv_2d_barcodes;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_2d_barcodes);
            if (imageView != null) {
                i10 = R.id.iv_game_icon;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_game_icon);
                if (imageView2 != null) {
                    i10 = R.id.iv_game_logo;
                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_game_logo);
                    if (imageView3 != null) {
                        i10 = R.id.iv_user_avatar;
                        ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_user_avatar);
                        if (imageView4 != null) {
                            i10 = R.id.recyclerview_divider;
                            View viewA2 = l3.d.a(view, R.id.recyclerview_divider);
                            if (viewA2 != null) {
                                mb.o oVarA2 = mb.o.a(viewA2);
                                i10 = R.id.rv_achievement_items;
                                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_achievement_items);
                                if (recyclerView != null) {
                                    i10 = R.id.tv_achievement;
                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_achievement);
                                    if (textView != null) {
                                        i10 = R.id.tv_achievement_num;
                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_achievement_num);
                                        if (textView2 != null) {
                                            i10 = R.id.tv_achievement_points;
                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_achievement_points);
                                            if (textView3 != null) {
                                                i10 = R.id.tv_achievement_time;
                                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_achievement_time);
                                                if (textView4 != null) {
                                                    i10 = R.id.tv_ahievement_more;
                                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_ahievement_more);
                                                    if (textView5 != null) {
                                                        i10 = R.id.tv_game_name;
                                                        TextView textView6 = (TextView) l3.d.a(view, R.id.tv_game_name);
                                                        if (textView6 != null) {
                                                            i10 = R.id.tv_user_name;
                                                            TextView textView7 = (TextView) l3.d.a(view, R.id.tv_user_name);
                                                            if (textView7 != null) {
                                                                i10 = R.id.vg_achievement_content;
                                                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_achievement_content);
                                                                if (linearLayout != null) {
                                                                    i10 = R.id.vg_game_info;
                                                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_game_info);
                                                                    if (relativeLayout != null) {
                                                                        return new s50((RelativeLayout) view, oVarA, imageView, imageView2, imageView3, imageView4, oVarA2, recyclerView, textView, textView2, textView3, textView4, textView5, textView6, textView7, linearLayout, relativeLayout);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static s50 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20662, new Class[]{LayoutInflater.class}, s50.class);
        return patchProxyResultProxy.isSupported ? (s50) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static s50 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20663, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, s50.class);
        if (patchProxyResultProxy.isSupported) {
            return (s50) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_game_achieve_share, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f115461a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20665, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
