package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.component.SearchView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemMyGameTitleBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class fr implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final SearchView f110662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110667j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110668k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110669l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110670m;

    private fr(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 SearchView searchView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3) {
        this.f110658a = relativeLayout;
        this.f110659b = imageView;
        this.f110660c = imageView2;
        this.f110661d = imageView3;
        this.f110662e = searchView;
        this.f110663f = textView;
        this.f110664g = textView2;
        this.f110665h = textView3;
        this.f110666i = textView4;
        this.f110667j = textView5;
        this.f110668k = linearLayout;
        this.f110669l = relativeLayout2;
        this.f110670m = relativeLayout3;
    }

    @androidx.annotation.n0
    public static fr a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19168, new Class[]{View.class}, fr.class);
        if (patchProxyResultProxy.isSupported) {
            return (fr) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_item_game_title_achievement;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_item_game_title_achievement);
        if (imageView != null) {
            i10 = R.id.iv_item_game_title_all;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_item_game_title_all);
            if (imageView2 != null) {
                i10 = R.id.iv_item_game_title_weeks;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_item_game_title_weeks);
                if (imageView3 != null) {
                    i10 = R.id.sv_game;
                    SearchView searchView = (SearchView) l3.d.a(view, R.id.sv_game);
                    if (searchView != null) {
                        i10 = R.id.tv_item_game_title_achievement;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_item_game_title_achievement);
                        if (textView != null) {
                            i10 = R.id.tv_item_game_title_all;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_item_game_title_all);
                            if (textView2 != null) {
                                i10 = R.id.tv_item_game_title_weeks;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_item_game_title_weeks);
                                if (textView3 != null) {
                                    i10 = R.id.tv_item_my_game_title_count;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_item_my_game_title_count);
                                    if (textView4 != null) {
                                        i10 = R.id.tv_item_my_game_title_title;
                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_item_my_game_title_title);
                                        if (textView5 != null) {
                                            i10 = R.id.vg_item_game_title_achievement_wrapper;
                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_item_game_title_achievement_wrapper);
                                            if (linearLayout != null) {
                                                i10 = R.id.vg_item_game_title_all_wrapper;
                                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_item_game_title_all_wrapper);
                                                if (relativeLayout != null) {
                                                    i10 = R.id.vg_item_game_title_weeks_wrapper;
                                                    RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_item_game_title_weeks_wrapper);
                                                    if (relativeLayout2 != null) {
                                                        return new fr((RelativeLayout) view, imageView, imageView2, imageView3, searchView, textView, textView2, textView3, textView4, textView5, linearLayout, relativeLayout, relativeLayout2);
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
    public static fr c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19166, new Class[]{LayoutInflater.class}, fr.class);
        return patchProxyResultProxy.isSupported ? (fr) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static fr d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19167, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, fr.class);
        if (patchProxyResultProxy.isSupported) {
            return (fr) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_my_game_title, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110658a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19169, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
