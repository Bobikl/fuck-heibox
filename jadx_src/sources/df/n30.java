package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.component.ExpandMoreButton;
import com.max.hbcustomview.recyclerview.SlideHorRecyclerView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.max.xiaoheihe.module.bbs.post.ui.RecordLastDownEventLayout;
import com.max.xiaoheihe.module.bbs.post.ui.SimplePostLikeFrameLayout;
import com.max.xiaoheihe.module.bbs.widget.LinkPostInfoDecoratorWidget;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutConceptLinkContentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n30 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final LinearLayout A;

    @androidx.annotation.n0
    public final RecyclerView B;

    @androidx.annotation.n0
    public final FrameLayout C;

    @androidx.annotation.n0
    public final NestedScrollView D;

    @androidx.annotation.n0
    public final LinearLayout E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final NestedScrollView f113638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinkPostInfoDecoratorWidget f113639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpandMoreButton f113640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f113641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113646i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f113647j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecordLastDownEventLayout f113648k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final SimplePostLikeFrameLayout f113649l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final SlideHorRecyclerView f113650m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f113651n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f113652o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f113653p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f113654q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113655r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113656s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113657t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f113658u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113659v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSUserSectionView f113660w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113661x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final ls f113662y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113663z;

    private n30(@androidx.annotation.n0 NestedScrollView nestedScrollView, @androidx.annotation.n0 LinkPostInfoDecoratorWidget linkPostInfoDecoratorWidget, @androidx.annotation.n0 ExpandMoreButton expandMoreButton, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 RecordLastDownEventLayout recordLastDownEventLayout, @androidx.annotation.n0 SimplePostLikeFrameLayout simplePostLikeFrameLayout, @androidx.annotation.n0 SlideHorRecyclerView slideHorRecyclerView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 RecyclerView recyclerView3, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 ExpressionTextView expressionTextView2, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 BBSUserSectionView bBSUserSectionView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ls lsVar, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 RecyclerView recyclerView4, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 NestedScrollView nestedScrollView2, @androidx.annotation.n0 LinearLayout linearLayout4) {
        this.f113638a = nestedScrollView;
        this.f113639b = linkPostInfoDecoratorWidget;
        this.f113640c = expandMoreButton;
        this.f113641d = oVar;
        this.f113642e = textView;
        this.f113643f = imageView;
        this.f113644g = imageView2;
        this.f113645h = textView2;
        this.f113646i = imageView3;
        this.f113647j = constraintLayout;
        this.f113648k = recordLastDownEventLayout;
        this.f113649l = simplePostLikeFrameLayout;
        this.f113650m = slideHorRecyclerView;
        this.f113651n = recyclerView;
        this.f113652o = recyclerView2;
        this.f113653p = recyclerView3;
        this.f113654q = expressionTextView;
        this.f113655r = textView3;
        this.f113656s = textView4;
        this.f113657t = textView5;
        this.f113658u = expressionTextView2;
        this.f113659v = textView6;
        this.f113660w = bBSUserSectionView;
        this.f113661x = linearLayout;
        this.f113662y = lsVar;
        this.f113663z = linearLayout2;
        this.A = linearLayout3;
        this.B = recyclerView4;
        this.C = frameLayout;
        this.D = nestedScrollView2;
        this.E = linearLayout4;
    }

    @androidx.annotation.n0
    public static n30 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20438, new Class[]{View.class}, n30.class);
        if (patchProxyResultProxy.isSupported) {
            return (n30) patchProxyResultProxy.result;
        }
        int i10 = R.id.cl_link_post_info_container;
        LinkPostInfoDecoratorWidget linkPostInfoDecoratorWidget = (LinkPostInfoDecoratorWidget) l3.d.a(view, R.id.cl_link_post_info_container);
        if (linkPostInfoDecoratorWidget != null) {
            i10 = R.id.emb_more;
            ExpandMoreButton expandMoreButton = (ExpandMoreButton) l3.d.a(view, R.id.emb_more);
            if (expandMoreButton != null) {
                i10 = R.id.image_div;
                View viewA = l3.d.a(view, R.id.image_div);
                if (viewA != null) {
                    mb.o oVarA = mb.o.a(viewA);
                    i10 = R.id.iv_article_collection_index;
                    TextView textView = (TextView) l3.d.a(view, R.id.iv_article_collection_index);
                    if (textView != null) {
                        i10 = R.id.iv_article_collection_left_icon;
                        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_article_collection_left_icon);
                        if (imageView != null) {
                            i10 = R.id.iv_article_collection_right_icon;
                            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_article_collection_right_icon);
                            if (imageView2 != null) {
                                i10 = R.id.iv_article_collection_text;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.iv_article_collection_text);
                                if (textView2 != null) {
                                    i10 = R.id.iv_tool_icon;
                                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_tool_icon);
                                    if (imageView3 != null) {
                                        i10 = R.id.ll_article_collection;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.ll_article_collection);
                                        if (constraintLayout != null) {
                                            i10 = R.id.post_content_container;
                                            RecordLastDownEventLayout recordLastDownEventLayout = (RecordLastDownEventLayout) l3.d.a(view, R.id.post_content_container);
                                            if (recordLastDownEventLayout != null) {
                                                i10 = R.id.post_like;
                                                SimplePostLikeFrameLayout simplePostLikeFrameLayout = (SimplePostLikeFrameLayout) l3.d.a(view, R.id.post_like);
                                                if (simplePostLikeFrameLayout != null) {
                                                    i10 = R.id.rv_images;
                                                    SlideHorRecyclerView slideHorRecyclerView = (SlideHorRecyclerView) l3.d.a(view, R.id.rv_images);
                                                    if (slideHorRecyclerView != null) {
                                                        i10 = R.id.rv_indicator;
                                                        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_indicator);
                                                        if (recyclerView != null) {
                                                            i10 = R.id.rv_post_guide;
                                                            RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_post_guide);
                                                            if (recyclerView2 != null) {
                                                                i10 = R.id.rv_tool_card;
                                                                RecyclerView recyclerView3 = (RecyclerView) l3.d.a(view, R.id.rv_tool_card);
                                                                if (recyclerView3 != null) {
                                                                    i10 = R.id.tv_desc;
                                                                    ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_desc);
                                                                    if (expressionTextView != null) {
                                                                        i10 = R.id.tv_index;
                                                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_index);
                                                                        if (textView3 != null) {
                                                                            i10 = R.id.tv_only_me_view;
                                                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_only_me_view);
                                                                            if (textView4 != null) {
                                                                                i10 = R.id.tv_time;
                                                                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_time);
                                                                                if (textView5 != null) {
                                                                                    i10 = R.id.tv_title;
                                                                                    ExpressionTextView expressionTextView2 = (ExpressionTextView) l3.d.a(view, R.id.tv_title);
                                                                                    if (expressionTextView2 != null) {
                                                                                        i10 = R.id.tv_tool_name;
                                                                                        TextView textView6 = (TextView) l3.d.a(view, R.id.tv_tool_name);
                                                                                        if (textView6 != null) {
                                                                                            i10 = R.id.v_user_section;
                                                                                            BBSUserSectionView bBSUserSectionView = (BBSUserSectionView) l3.d.a(view, R.id.v_user_section);
                                                                                            if (bBSUserSectionView != null) {
                                                                                                i10 = R.id.vg_concept_bottom;
                                                                                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_concept_bottom);
                                                                                                if (linearLayout != null) {
                                                                                                    i10 = R.id.vg_event_entry;
                                                                                                    View viewA2 = l3.d.a(view, R.id.vg_event_entry);
                                                                                                    if (viewA2 != null) {
                                                                                                        ls lsVarA = ls.a(viewA2);
                                                                                                        i10 = R.id.vg_gamecard;
                                                                                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_gamecard);
                                                                                                        if (linearLayout2 != null) {
                                                                                                            i10 = R.id.vg_gamecard_list;
                                                                                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_gamecard_list);
                                                                                                            if (linearLayout3 != null) {
                                                                                                                i10 = R.id.vg_hashtag;
                                                                                                                RecyclerView recyclerView4 = (RecyclerView) l3.d.a(view, R.id.vg_hashtag);
                                                                                                                if (recyclerView4 != null) {
                                                                                                                    i10 = R.id.vg_image;
                                                                                                                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_image);
                                                                                                                    if (frameLayout != null) {
                                                                                                                        NestedScrollView nestedScrollView = (NestedScrollView) view;
                                                                                                                        i10 = R.id.vg_tool_info;
                                                                                                                        LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_tool_info);
                                                                                                                        if (linearLayout4 != null) {
                                                                                                                            return new n30(nestedScrollView, linkPostInfoDecoratorWidget, expandMoreButton, oVarA, textView, imageView, imageView2, textView2, imageView3, constraintLayout, recordLastDownEventLayout, simplePostLikeFrameLayout, slideHorRecyclerView, recyclerView, recyclerView2, recyclerView3, expressionTextView, textView3, textView4, textView5, expressionTextView2, textView6, bBSUserSectionView, linearLayout, lsVarA, linearLayout2, linearLayout3, recyclerView4, frameLayout, nestedScrollView, linearLayout4);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static n30 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20436, new Class[]{LayoutInflater.class}, n30.class);
        return patchProxyResultProxy.isSupported ? (n30) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static n30 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20437, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, n30.class);
        if (patchProxyResultProxy.isSupported) {
            return (n30) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_concept_link_content, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public NestedScrollView b() {
        return this.f113638a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20439, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
