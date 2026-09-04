package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutTopicHashtagNewEntryBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class sb0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f115569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Group f115570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final Group f115571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115576h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115577i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115578j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115579k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115580l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115581m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115582n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115583o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f115584p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f115585q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f115586r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f115587s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f115588t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f115589u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f115590v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f115591w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f115592x;

    private sb0(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 Group group, @androidx.annotation.n0 Group group2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 RecyclerView recyclerView3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 View view, @androidx.annotation.n0 View view2, @androidx.annotation.n0 View view3, @androidx.annotation.n0 View view4, @androidx.annotation.n0 View view5, @androidx.annotation.n0 View view6, @androidx.annotation.n0 View view7, @androidx.annotation.n0 View view8, @androidx.annotation.n0 View view9) {
        this.f115569a = constraintLayout;
        this.f115570b = group;
        this.f115571c = group2;
        this.f115572d = imageView;
        this.f115573e = imageView2;
        this.f115574f = linearLayout;
        this.f115575g = recyclerView;
        this.f115576h = recyclerView2;
        this.f115577i = recyclerView3;
        this.f115578j = textView;
        this.f115579k = textView2;
        this.f115580l = textView3;
        this.f115581m = textView4;
        this.f115582n = textView5;
        this.f115583o = textView6;
        this.f115584p = view;
        this.f115585q = view2;
        this.f115586r = view3;
        this.f115587s = view4;
        this.f115588t = view5;
        this.f115589u = view6;
        this.f115590v = view7;
        this.f115591w = view8;
        this.f115592x = view9;
    }

    @androidx.annotation.n0
    public static sb0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21281, new Class[]{View.class}, sb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (sb0) patchProxyResultProxy.result;
        }
        int i10 = R.id.group_recommend_topics;
        Group group = (Group) l3.d.a(view, R.id.group_recommend_topics);
        if (group != null) {
            i10 = R.id.group_selected_hashtags;
            Group group2 = (Group) l3.d.a(view, R.id.group_selected_hashtags);
            if (group2 != null) {
                i10 = R.id.iv_hashtag_right_arrow;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_hashtag_right_arrow);
                if (imageView != null) {
                    i10 = R.id.iv_topic_right_arrow;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_topic_right_arrow);
                    if (imageView2 != null) {
                        i10 = R.id.ll_selected_topic;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_selected_topic);
                        if (linearLayout != null) {
                            i10 = R.id.rv_recommend_topic;
                            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_recommend_topic);
                            if (recyclerView != null) {
                                i10 = R.id.rv_selected_hashtag;
                                RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_selected_hashtag);
                                if (recyclerView2 != null) {
                                    i10 = R.id.rv_selected_topic;
                                    RecyclerView recyclerView3 = (RecyclerView) l3.d.a(view, R.id.rv_selected_topic);
                                    if (recyclerView3 != null) {
                                        i10 = R.id.tv_empty_selected_topic_tip;
                                        TextView textView = (TextView) l3.d.a(view, R.id.tv_empty_selected_topic_tip);
                                        if (textView != null) {
                                            i10 = R.id.tv_hashtag_select_and_available;
                                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_hashtag_select_and_available);
                                            if (textView2 != null) {
                                                i10 = R.id.tv_recommend_topic_tip;
                                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_recommend_topic_tip);
                                                if (textView3 != null) {
                                                    i10 = R.id.tv_selected_hashtag_tip;
                                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_selected_hashtag_tip);
                                                    if (textView4 != null) {
                                                        i10 = R.id.tv_selected_topic_tip;
                                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_selected_topic_tip);
                                                        if (textView5 != null) {
                                                            i10 = R.id.tv_topic_select_and_available;
                                                            TextView textView6 = (TextView) l3.d.a(view, R.id.tv_topic_select_and_available);
                                                            if (textView6 != null) {
                                                                i10 = R.id.v_bg_recommend_topic;
                                                                View viewA = l3.d.a(view, R.id.v_bg_recommend_topic);
                                                                if (viewA != null) {
                                                                    i10 = R.id.v_bg_selected_hashtag;
                                                                    View viewA2 = l3.d.a(view, R.id.v_bg_selected_hashtag);
                                                                    if (viewA2 != null) {
                                                                        i10 = R.id.v_divider_bottom;
                                                                        View viewA3 = l3.d.a(view, R.id.v_divider_bottom);
                                                                        if (viewA3 != null) {
                                                                            i10 = R.id.v_divider_recommend_topic;
                                                                            View viewA4 = l3.d.a(view, R.id.v_divider_recommend_topic);
                                                                            if (viewA4 != null) {
                                                                                i10 = R.id.v_divider_selected_hashtag;
                                                                                View viewA5 = l3.d.a(view, R.id.v_divider_selected_hashtag);
                                                                                if (viewA5 != null) {
                                                                                    i10 = R.id.v_divider_selected_topic;
                                                                                    View viewA6 = l3.d.a(view, R.id.v_divider_selected_topic);
                                                                                    if (viewA6 != null) {
                                                                                        i10 = R.id.v_mask_recommend_topic;
                                                                                        View viewA7 = l3.d.a(view, R.id.v_mask_recommend_topic);
                                                                                        if (viewA7 != null) {
                                                                                            i10 = R.id.v_mask_selected_hashtag;
                                                                                            View viewA8 = l3.d.a(view, R.id.v_mask_selected_hashtag);
                                                                                            if (viewA8 != null) {
                                                                                                i10 = R.id.v_mask_selected_topic;
                                                                                                View viewA9 = l3.d.a(view, R.id.v_mask_selected_topic);
                                                                                                if (viewA9 != null) {
                                                                                                    return new sb0((ConstraintLayout) view, group, group2, imageView, imageView2, linearLayout, recyclerView, recyclerView2, recyclerView3, textView, textView2, textView3, textView4, textView5, textView6, viewA, viewA2, viewA3, viewA4, viewA5, viewA6, viewA7, viewA8, viewA9);
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
    public static sb0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21279, new Class[]{LayoutInflater.class}, sb0.class);
        return patchProxyResultProxy.isSupported ? (sb0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static sb0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21280, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, sb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (sb0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_topic_hashtag_new_entry, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f115569a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21282, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
