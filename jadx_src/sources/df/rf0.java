package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.max.xiaoheihe.module.game.component.GameCommentLikeDislikeHappyView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewGameDetailCommentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class rf0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f115222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final id0 f115224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameCommentLikeDislikeHappyView f115226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115230i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115231j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115232k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f115233l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115234m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115235n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final br f115236o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSUserSectionView f115237p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewStub f115238q;

    private rf0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 id0 id0Var, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 GameCommentLikeDislikeHappyView gameCommentLikeDislikeHappyView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 View view, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 br brVar, @androidx.annotation.n0 BBSUserSectionView bBSUserSectionView, @androidx.annotation.n0 ViewStub viewStub) {
        this.f115222a = linearLayout;
        this.f115223b = linearLayout2;
        this.f115224c = id0Var;
        this.f115225d = relativeLayout;
        this.f115226e = gameCommentLikeDislikeHappyView;
        this.f115227f = imageView;
        this.f115228g = imageView2;
        this.f115229h = imageView3;
        this.f115230i = linearLayout3;
        this.f115231j = linearLayout4;
        this.f115232k = textView;
        this.f115233l = view;
        this.f115234m = relativeLayout2;
        this.f115235n = relativeLayout3;
        this.f115236o = brVar;
        this.f115237p = bBSUserSectionView;
        this.f115238q = viewStub;
    }

    @androidx.annotation.n0
    public static rf0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21690, new Class[]{View.class}, rf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (rf0) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = (LinearLayout) view;
        int i10 = R.id.game_comment_divider;
        View viewA = l3.d.a(view, R.id.game_comment_divider);
        if (viewA != null) {
            id0 id0VarA = id0.a(viewA);
            i10 = R.id.game_detail_body;
            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.game_detail_body);
            if (relativeLayout != null) {
                i10 = R.id.gcldh;
                GameCommentLikeDislikeHappyView gameCommentLikeDislikeHappyView = (GameCommentLikeDislikeHappyView) l3.d.a(view, R.id.gcldh);
                if (gameCommentLikeDislikeHappyView != null) {
                    i10 = R.id.iv_developer;
                    ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_developer);
                    if (imageView != null) {
                        i10 = R.id.iv_more_scrim;
                        ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_more_scrim);
                        if (imageView2 != null) {
                            i10 = R.id.iv_steam_tag;
                            ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_steam_tag);
                            if (imageView3 != null) {
                                i10 = R.id.ll_comments;
                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_comments);
                                if (linearLayout2 != null) {
                                    i10 = R.id.ll_rich_tags;
                                    LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.ll_rich_tags);
                                    if (linearLayout3 != null) {
                                        i10 = R.id.tv_description;
                                        TextView textView = (TextView) l3.d.a(view, R.id.tv_description);
                                        if (textView != null) {
                                            i10 = R.id.v_developers_divider;
                                            View viewA2 = l3.d.a(view, R.id.v_developers_divider);
                                            if (viewA2 != null) {
                                                i10 = R.id.vg_bottom_bar;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_bottom_bar);
                                                if (relativeLayout2 != null) {
                                                    i10 = R.id.vg_developers_comment;
                                                    RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_developers_comment);
                                                    if (relativeLayout3 != null) {
                                                        i10 = R.id.vg_interactive_bar;
                                                        View viewA3 = l3.d.a(view, R.id.vg_interactive_bar);
                                                        if (viewA3 != null) {
                                                            br brVarA = br.a(viewA3);
                                                            i10 = R.id.vg_title;
                                                            BBSUserSectionView bBSUserSectionView = (BBSUserSectionView) l3.d.a(view, R.id.vg_title);
                                                            if (bBSUserSectionView != null) {
                                                                i10 = R.id.vt_official_comment_tip;
                                                                ViewStub viewStub = (ViewStub) l3.d.a(view, R.id.vt_official_comment_tip);
                                                                if (viewStub != null) {
                                                                    return new rf0(linearLayout, linearLayout, id0VarA, relativeLayout, gameCommentLikeDislikeHappyView, imageView, imageView2, imageView3, linearLayout2, linearLayout3, textView, viewA2, relativeLayout2, relativeLayout3, brVarA, bBSUserSectionView, viewStub);
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
    public static rf0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21688, new Class[]{LayoutInflater.class}, rf0.class);
        return patchProxyResultProxy.isSupported ? (rf0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static rf0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21689, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, rf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (rf0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_game_detail_comment, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f115222a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21691, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
