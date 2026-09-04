package ld;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbsearch.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import mb.o;

/* JADX INFO: compiled from: HbsearchItemSearchSuggestionBinding.java */
/* JADX INFO: loaded from: classes12.dex */
public final class i implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final RelativeLayout f131383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final o f131384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final ImageView f131385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final ImageView f131386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final TextView f131387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final TextView f131388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final TextView f131389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final LinearLayout f131390h;

    private i(@n0 RelativeLayout relativeLayout, @n0 o oVar, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 TextView textView, @n0 TextView textView2, @n0 TextView textView3, @n0 LinearLayout linearLayout) {
        this.f131383a = relativeLayout;
        this.f131384b = oVar;
        this.f131385c = imageView;
        this.f131386d = imageView2;
        this.f131387e = textView;
        this.f131388f = textView2;
        this.f131389g = textView3;
        this.f131390h = linearLayout;
    }

    @n0
    public static i a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.S8, new Class[]{View.class}, i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, i10);
        if (viewA != null) {
            o oVarA = o.a(viewA);
            i10 = R.id.iv_card_img;
            ImageView imageView = (ImageView) l3.d.a(view, i10);
            if (imageView != null) {
                i10 = R.id.iv_search_icon;
                ImageView imageView2 = (ImageView) l3.d.a(view, i10);
                if (imageView2 != null) {
                    i10 = R.id.tv_desc;
                    TextView textView = (TextView) l3.d.a(view, i10);
                    if (textView != null) {
                        i10 = R.id.tv_title;
                        TextView textView2 = (TextView) l3.d.a(view, i10);
                        if (textView2 != null) {
                            i10 = R.id.tv_tool_name;
                            TextView textView3 = (TextView) l3.d.a(view, i10);
                            if (textView3 != null) {
                                i10 = R.id.vg_tool;
                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                                if (linearLayout != null) {
                                    return new i((RelativeLayout) view, oVarA, imageView, imageView2, textView, textView2, textView3, linearLayout);
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
    public static i c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.k.Q8, new Class[]{LayoutInflater.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static i d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.R8, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbsearch_item_search_suggestion, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public RelativeLayout b() {
        return this.f131383a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.T8, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
