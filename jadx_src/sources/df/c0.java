package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityGameCommentSuccessBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CoordinatorLayout f109080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final CollapsingToolbarLayout f109083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f109087h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109088i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109089j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final Toolbar f109090k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109091l;

    private c0(@androidx.annotation.n0 CoordinatorLayout coordinatorLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 CollapsingToolbarLayout collapsingToolbarLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 Toolbar toolbar, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f109080a = coordinatorLayout;
        this.f109081b = textView;
        this.f109082c = textView2;
        this.f109083d = collapsingToolbarLayout;
        this.f109084e = imageView;
        this.f109085f = imageView2;
        this.f109086g = imageView3;
        this.f109087h = recyclerView;
        this.f109088i = textView3;
        this.f109089j = linearLayout;
        this.f109090k = toolbar;
        this.f109091l = linearLayout2;
    }

    @androidx.annotation.n0
    public static c0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16352, new Class[]{View.class}, c0.class);
        if (patchProxyResultProxy.isSupported) {
            return (c0) patchProxyResultProxy.result;
        }
        int i10 = R.id.button_left;
        TextView textView = (TextView) l3.d.a(view, R.id.button_left);
        if (textView != null) {
            i10 = R.id.button_right;
            TextView textView2 = (TextView) l3.d.a(view, R.id.button_right);
            if (textView2 != null) {
                i10 = R.id.ctl_toolbar_wrapper;
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) l3.d.a(view, R.id.ctl_toolbar_wrapper);
                if (collapsingToolbarLayout != null) {
                    i10 = R.id.iv_game_comment_success_back;
                    ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_game_comment_success_back);
                    if (imageView != null) {
                        i10 = R.id.iv_head_img;
                        ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_head_img);
                        if (imageView2 != null) {
                            i10 = R.id.iv_success_icon;
                            ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_success_icon);
                            if (imageView3 != null) {
                                i10 = R.id.rv_game;
                                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_game);
                                if (recyclerView != null) {
                                    i10 = R.id.tv_comment_success_desc;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_comment_success_desc);
                                    if (textView3 != null) {
                                        i10 = R.id.vg_comment_success;
                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_comment_success);
                                        if (linearLayout != null) {
                                            i10 = R.id.vg_game_comment_success_title_bar;
                                            Toolbar toolbar = (Toolbar) l3.d.a(view, R.id.vg_game_comment_success_title_bar);
                                            if (toolbar != null) {
                                                i10 = R.id.vg_game_list;
                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_game_list);
                                                if (linearLayout2 != null) {
                                                    return new c0((CoordinatorLayout) view, textView, textView2, collapsingToolbarLayout, imageView, imageView2, imageView3, recyclerView, textView3, linearLayout, toolbar, linearLayout2);
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
    public static c0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16350, new Class[]{LayoutInflater.class}, c0.class);
        return patchProxyResultProxy.isSupported ? (c0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static c0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16351, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, c0.class);
        if (patchProxyResultProxy.isSupported) {
            return (c0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_game_comment_success, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CoordinatorLayout b() {
        return this.f109080a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16353, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
