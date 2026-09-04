package ld;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.hbsearch.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HbsearchItemHotSearchPageListBinding.java */
/* JADX INFO: loaded from: classes12.dex */
public final class f implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final ConstraintLayout f131363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final ImageView f131364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final ImageView f131365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final Space f131366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final TextView f131367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final TextView f131368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final TextView f131369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final HBLineHeightTextView f131370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    public final View f131371i;

    private f(@n0 ConstraintLayout constraintLayout, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 Space space, @n0 TextView textView, @n0 TextView textView2, @n0 TextView textView3, @n0 HBLineHeightTextView hBLineHeightTextView, @n0 View view) {
        this.f131363a = constraintLayout;
        this.f131364b = imageView;
        this.f131365c = imageView2;
        this.f131366d = space;
        this.f131367e = textView;
        this.f131368f = textView2;
        this.f131369g = textView3;
        this.f131370h = hBLineHeightTextView;
        this.f131371i = view;
    }

    @n0
    public static f a(@n0 View view) {
        View viewA;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.G8, new Class[]{View.class}, f.class);
        if (patchProxyResultProxy.isSupported) {
            return (f) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_game_icon;
        ImageView imageView = (ImageView) l3.d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.iv_hot_search_image;
            ImageView imageView2 = (ImageView) l3.d.a(view, i10);
            if (imageView2 != null) {
                i10 = R.id.space;
                Space space = (Space) l3.d.a(view, i10);
                if (space != null) {
                    i10 = R.id.tv_hot_desc;
                    TextView textView = (TextView) l3.d.a(view, i10);
                    if (textView != null) {
                        i10 = R.id.tv_hot_tag;
                        TextView textView2 = (TextView) l3.d.a(view, i10);
                        if (textView2 != null) {
                            i10 = R.id.tv_hot_title;
                            TextView textView3 = (TextView) l3.d.a(view, i10);
                            if (textView3 != null) {
                                i10 = R.id.tv_index;
                                HBLineHeightTextView hBLineHeightTextView = (HBLineHeightTextView) l3.d.a(view, i10);
                                if (hBLineHeightTextView != null && (viewA = l3.d.a(view, (i10 = R.id.v_background))) != null) {
                                    return new f((ConstraintLayout) view, imageView, imageView2, space, textView, textView2, textView3, hBLineHeightTextView, viewA);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static f c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.k.E8, new Class[]{LayoutInflater.class}, f.class);
        return patchProxyResultProxy.isSupported ? (f) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static f d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.F8, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, f.class);
        if (patchProxyResultProxy.isSupported) {
            return (f) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbsearch_item_hot_search_page_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public ConstraintLayout b() {
        return this.f131363a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.H8, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
