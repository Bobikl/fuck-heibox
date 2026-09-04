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

/* JADX INFO: compiled from: ItemMatchCsgoBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class iq implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111865i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111866j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111867k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f111868l;

    private iq(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 View view) {
        this.f111857a = relativeLayout;
        this.f111858b = imageView;
        this.f111859c = imageView2;
        this.f111860d = linearLayout;
        this.f111861e = textView;
        this.f111862f = textView2;
        this.f111863g = textView3;
        this.f111864h = textView4;
        this.f111865i = textView5;
        this.f111866j = textView6;
        this.f111867k = textView7;
        this.f111868l = view;
    }

    @androidx.annotation.n0
    public static iq a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19076, new Class[]{View.class}, iq.class);
        if (patchProxyResultProxy.isSupported) {
            return (iq) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_more;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_more);
        if (imageView != null) {
            i10 = R.id.iv_rank;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_rank);
            if (imageView2 != null) {
                i10 = R.id.ll_settlement;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_settlement);
                if (linearLayout != null) {
                    i10 = R.id.tv_class_name;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_class_name);
                    if (textView != null) {
                        i10 = R.id.tv_kad_detail;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_kad_detail);
                        if (textView2 != null) {
                            i10 = R.id.tv_map_name;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_map_name);
                            if (textView3 != null) {
                                i10 = R.id.tv_rating;
                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_rating);
                                if (textView4 != null) {
                                    i10 = R.id.tv_result;
                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_result);
                                    if (textView5 != null) {
                                        i10 = R.id.tv_score;
                                        TextView textView6 = (TextView) l3.d.a(view, R.id.tv_score);
                                        if (textView6 != null) {
                                            i10 = R.id.tv_time;
                                            TextView textView7 = (TextView) l3.d.a(view, R.id.tv_time);
                                            if (textView7 != null) {
                                                i10 = R.id.view_rank_highlight;
                                                View viewA = l3.d.a(view, R.id.view_rank_highlight);
                                                if (viewA != null) {
                                                    return new iq((RelativeLayout) view, imageView, imageView2, linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, viewA);
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
    public static iq c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19074, new Class[]{LayoutInflater.class}, iq.class);
        return patchProxyResultProxy.isSupported ? (iq) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static iq d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19075, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, iq.class);
        if (patchProxyResultProxy.isSupported) {
            return (iq) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_match_csgo, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111857a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19077, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
