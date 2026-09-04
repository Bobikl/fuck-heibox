package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.max.video.AbsVideoView;
import com.max.video.impl.CountDownV2TopPanel;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.recommend.GameCardVideoMovieObj;
import com.max.xiaoheihe.bean.game.recommend.GameCardVideoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameVideoCardView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class GameVideoCardView extends CardView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f86858s = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RelativeLayout f86859k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f86860l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f86861m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InnerGameItemView f86862n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f86863o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewGroup f86864p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CardView f86865q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ImageView f86866r;

    public GameVideoCardView(@e Context context) {
        this(context, null);
    }

    public GameVideoCardView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameVideoCardView(@e Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.m(context);
        j();
    }

    private final void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36782, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setRadius(ViewUtils.f(getContext(), 4.0f));
        setCardElevation(0.0f);
        super.setCardBackgroundColor(getContext().getResources().getColor(R.color.transparent));
        View.inflate(getContext(), R.layout.view_game_video_card, this);
        View viewFindViewById = findViewById(R.id.vg_container);
        f0.o(viewFindViewById, "findViewById(R.id.vg_container)");
        setVg_container((RelativeLayout) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.iv_bg);
        f0.o(viewFindViewById2, "findViewById(R.id.iv_bg)");
        setIv_bg((ImageView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.tv_left_top_label);
        f0.o(viewFindViewById3, "findViewById(R.id.tv_left_top_label)");
        setTv_left_top_label((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.game_item);
        f0.o(viewFindViewById4, "findViewById(R.id.game_item)");
        setGame_item((InnerGameItemView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.iv_gradient);
        f0.o(viewFindViewById5, "findViewById(R.id.iv_gradient)");
        setIv_gradient((ImageView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.vg_video_thump);
        f0.o(viewFindViewById6, "findViewById(R.id.vg_video_thump)");
        setVg_video_thump((ViewGroup) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.card_video_container);
        f0.o(viewFindViewById7, "findViewById(R.id.card_video_container)");
        this.f86865q = (CardView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.iv_video_play);
        f0.o(viewFindViewById8, "findViewById(R.id.iv_video_play)");
        setIv_video_play((ImageView) viewFindViewById8);
        getIv_gradient().setScaleType(ImageView.ScaleType.FIT_XY);
        int iF = ViewUtils.f(getContext(), 3.0f);
        getIv_gradient().setVisibility(0);
        getVg_container().setPadding(iF, iF, iF, iF);
        int iF2 = ViewUtils.f(getContext(), 9.0f);
        ViewGroup.LayoutParams layoutParams = getGame_item().getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = iF2;
        ViewGroup.LayoutParams layoutParams2 = getGame_item().getLayoutParams();
        f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = iF2;
        ViewGroup.LayoutParams layoutParams3 = getGame_item().getLayoutParams();
        f0.n(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = iF2;
        int iL = (ViewUtils.L(getContext()) * 22) / 375;
        CardView cardView = this.f86865q;
        if (cardView == null) {
            f0.S("card_video_container");
            cardView = null;
        }
        ViewGroup.LayoutParams layoutParams4 = cardView.getLayoutParams();
        f0.n(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = iL;
        ViewGroup.LayoutParams layoutParams5 = getVg_video_thump().getLayoutParams();
        f0.n(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = iL;
    }

    @d
    public final InnerGameItemView getGame_item() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36774, new Class[0], InnerGameItemView.class);
        if (patchProxyResultProxy.isSupported) {
            return (InnerGameItemView) patchProxyResultProxy.result;
        }
        InnerGameItemView innerGameItemView = this.f86862n;
        if (innerGameItemView != null) {
            return innerGameItemView;
        }
        f0.S("game_item");
        return null;
    }

    @d
    public final ImageView getIv_bg() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36770, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86860l;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_bg");
        return null;
    }

    @d
    public final ImageView getIv_gradient() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36776, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86863o;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_gradient");
        return null;
    }

    @d
    public final ImageView getIv_video_play() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36780, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86866r;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_video_play");
        return null;
    }

    @d
    public final TextView getTv_left_top_label() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36772, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86861m;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_left_top_label");
        return null;
    }

    @d
    public final RelativeLayout getVg_container() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36768, new Class[0], RelativeLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (RelativeLayout) patchProxyResultProxy.result;
        }
        RelativeLayout relativeLayout = this.f86859k;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        f0.S("vg_container");
        return null;
    }

    @d
    public final ViewGroup getVg_video_thump() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36778, new Class[0], ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        ViewGroup viewGroup = this.f86864p;
        if (viewGroup != null) {
            return viewGroup;
        }
        f0.S("vg_video_thump");
        return null;
    }

    @d
    public final AbsVideoView getVideo() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36792, new Class[0], AbsVideoView.class);
        if (patchProxyResultProxy.isSupported) {
            return (AbsVideoView) patchProxyResultProxy.result;
        }
        CardView cardView = this.f86865q;
        if (cardView == null) {
            f0.S("card_video_container");
            cardView = null;
        }
        View childAt = cardView.getChildAt(0);
        f0.n(childAt, "null cannot be cast to non-null type com.max.video.AbsVideoView");
        return (AbsVideoView) childAt;
    }

    public final void h(@d AbsVideoView video) {
        if (PatchProxy.proxy(new Object[]{video}, this, changeQuickRedirect, false, 36789, new Class[]{AbsVideoView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(video, "video");
        CardView cardView = this.f86865q;
        CardView cardView2 = null;
        if (cardView == null) {
            f0.S("card_video_container");
            cardView = null;
        }
        cardView.removeAllViews();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        CardView cardView3 = this.f86865q;
        if (cardView3 == null) {
            f0.S("card_video_container");
        } else {
            cardView2 = cardView3;
        }
        cardView2.addView(video, layoutParams);
    }

    public final boolean i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36791, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        CardView cardView = this.f86865q;
        if (cardView == null) {
            f0.S("card_video_container");
            cardView = null;
        }
        return cardView.getChildCount() > 0;
    }

    public final void k() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36790, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        CardView cardView = this.f86865q;
        if (cardView == null) {
            f0.S("card_video_container");
            cardView = null;
        }
        cardView.removeAllViews();
    }

    public final void l(@d GameCardVideoObj videoObj, boolean z10) {
        AbsVideoView video;
        GameCardVideoMovieObj movie;
        if (PatchProxy.proxy(new Object[]{videoObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 36788, new Class[]{GameCardVideoObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(videoObj, "videoObj");
        GameCardVideoMovieObj movie2 = videoObj.getMovie();
        if (movie2 != null) {
            if (i()) {
                video = getVideo();
            } else {
                com.max.xiaoheihe.module.game.adapter.recommend.binder.e.a aVar = com.max.xiaoheihe.module.game.adapter.recommend.binder.e.f86098i;
                Context context = getContext();
                f0.o(context, "context");
                video = aVar.e(context);
            }
            com.max.xiaoheihe.module.game.adapter.recommend.binder.e.a aVar2 = com.max.xiaoheihe.module.game.adapter.recommend.binder.e.f86098i;
            GameCardVideoObj gameCardVideoObj = (GameCardVideoObj) video.getTag(aVar2.d());
            if (gameCardVideoObj != null && !z10) {
                GameCardVideoMovieObj movie3 = gameCardVideoObj.getMovie();
                if (f0.g(movie3 != null ? movie3.getMovie_url() : null, movie2.getMovie_url()) && (movie2.isPlaying() || movie2.isCompleted())) {
                    return;
                }
            }
            if (!i()) {
                ViewParent parent = video.getParent();
                if (parent != null) {
                    f0.o(parent, "parent");
                    ((ViewGroup) parent).removeView(video);
                }
                h(video);
            }
            if (f0.g((gameCardVideoObj == null || (movie = gameCardVideoObj.getMovie()) == null) ? null : movie.getMovie_url(), movie2.getMovie_url()) && gameCardVideoObj != null && (!z10 || !movie2.isCompleted())) {
                video.H();
                video.Y();
                return;
            }
            if (video.G()) {
                video.Z();
            }
            Context context2 = getContext();
            f0.o(context2, "context");
            video.S(context2);
            int iP = (int) n.p(movie2.getMovie_end_time());
            ze.d ui2 = video.getUi();
            CountDownV2TopPanel countDownV2TopPanel = (CountDownV2TopPanel) (ui2 != null ? ui2.getPanelTop() : null);
            if (countDownV2TopPanel != null) {
                if (iP <= ((int) n.p(movie2.getMovie_start_time()))) {
                    iP = -1;
                }
                countDownV2TopPanel.setLimitedTime(iP);
            }
            video.setTag(aVar2.d(), videoObj);
            video.setVideoRes(movie2.getMovie_url());
            if (com.max.hbcommon.utils.c.u(movie2.getMovie_start_time())) {
                video.O();
            } else {
                video.P((int) n.p(movie2.getMovie_start_time()));
            }
            video.H();
            video.Y();
        }
    }

    @Override // android.view.View
    public void setBackground(@e Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 36784, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        getVg_container().setBackground(drawable);
    }

    public final void setBackgroundGradientColor(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36783, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        setBackground(ViewUtils.x(0, i10, i11));
    }

    public final void setBottomGradientColor(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36787, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        Drawable drawableX = ViewUtils.x(0, i10, i11);
        drawableX.setBounds(0, 0, ViewUtils.L(getContext()), ViewUtils.L(getContext()));
        getIv_gradient().setImageBitmap(com.max.mediaselector.lib.utils.c.o(com.max.mediaselector.lib.utils.c.e(drawableX, ViewUtils.L(getContext())), 255.0f, 0.63f));
    }

    public final void setGame_item(@d InnerGameItemView innerGameItemView) {
        if (PatchProxy.proxy(new Object[]{innerGameItemView}, this, changeQuickRedirect, false, 36775, new Class[]{InnerGameItemView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(innerGameItemView, "<set-?>");
        this.f86862n = innerGameItemView;
    }

    public final void setIv_bg(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36771, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86860l = imageView;
    }

    public final void setIv_gradient(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36777, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86863o = imageView;
    }

    public final void setIv_video_play(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36781, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86866r = imageView;
    }

    public final void setLabelBackGroundColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 36785, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getTv_left_top_label().setBackground(q.w(getContext(), i10, new float[]{2.0f, 2.0f, 0.0f, 0.0f, 6.0f, 6.0f, 0.0f, 0.0f}));
    }

    public final void setLabelText(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36786, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_left_top_label().setText(str);
    }

    public final void setTv_left_top_label(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36773, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86861m = textView;
    }

    public final void setVg_container(@d RelativeLayout relativeLayout) {
        if (PatchProxy.proxy(new Object[]{relativeLayout}, this, changeQuickRedirect, false, 36769, new Class[]{RelativeLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(relativeLayout, "<set-?>");
        this.f86859k = relativeLayout;
    }

    public final void setVg_video_thump(@d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 36779, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewGroup, "<set-?>");
        this.f86864p = viewGroup;
    }
}
