package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbcustomview.video.VideoViewX;
import com.max.hbutils.utils.ViewUtils;
import com.max.video.AbsVideoView;
import com.max.video.impl.CountDownV2TopPanel;
import com.max.video.impl.PlainVideoUI;
import com.max.video.player.info.PlaybackState;
import com.max.video.ui.widget.BasicCenterPanel;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.RecommendGameListItemObj;
import com.max.xiaoheihe.bean.game.recommend.GameCardVideoMovieObj;
import com.max.xiaoheihe.bean.game.recommend.GameCardVideoObj;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.max.xiaoheihe.module.game.component.GamePriceView;
import com.max.xiaoheihe.module.game.component.GameVideoCardView;
import com.max.xiaoheihe.module.game.component.InnerGameItemView;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.game.z;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameCardVideoVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class e extends r {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final a f86098i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f86099j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f86100k = R.id.video_info;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private static WeakReference<AbsVideoView> f86101l;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private RecommendVHBParam f86102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f86103h;

    /* JADX INFO: compiled from: GameCardVideoVHB.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.recommend.binder.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: GameCardVideoVHB.kt */
        public static final class ViewOnClickListenerC0776a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ VideoViewX f86104b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f86105c;

            ViewOnClickListenerC0776a(VideoViewX videoViewX, Context context) {
                this.f86104b = videoViewX;
                this.f86105c = context;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35970, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                VideoViewX videoViewX = this.f86104b;
                a aVar = e.f86098i;
                GameCardVideoObj gameCardVideoObj = (GameCardVideoObj) videoViewX.getTag(aVar.d());
                if (gameCardVideoObj != null) {
                    a.a(aVar, this.f86105c, gameCardVideoObj);
                }
            }
        }

        /* JADX INFO: compiled from: GameCardVideoVHB.kt */
        public static final class b implements xe.a {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ VideoViewX f86106a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f86107b;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.recommend.binder.e$a$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: GameCardVideoVHB.kt */
            public final /* synthetic */ class C0777a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f86108a;

                static {
                    int[] iArr = new int[PlaybackState.valuesCustom().length];
                    try {
                        iArr[PlaybackState.COMPLETE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PlaybackState.PAUSED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PlaybackState.END.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[PlaybackState.STARTED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f86108a = iArr;
                }
            }

            b(VideoViewX videoViewX, Context context) {
                this.f86106a = videoViewX;
                this.f86107b = context;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // xe.a
            public void a(@dl.d PlaybackState state) {
                GameCardVideoMovieObj movie;
                String movie_url;
                if (PatchProxy.proxy(new Object[]{state}, this, changeQuickRedirect, false, 35971, new Class[]{PlaybackState.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(state, "state");
                int i10 = C0777a.f86108a[state.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        this.f86106a.setVisibility(8);
                        GameCardVideoObj gameCardVideoObj = (GameCardVideoObj) this.f86106a.getTag(e.f86098i.d());
                        GameCardVideoMovieObj movie2 = gameCardVideoObj != null ? gameCardVideoObj.getMovie() : null;
                        if (movie2 == null) {
                            return;
                        }
                        movie2.setPlaying(false);
                        return;
                    }
                    if (i10 != 4) {
                        return;
                    }
                    this.f86106a.setVisibility(0);
                    GameCardVideoObj gameCardVideoObj2 = (GameCardVideoObj) this.f86106a.getTag(e.f86098i.d());
                    GameCardVideoMovieObj movie3 = gameCardVideoObj2 != null ? gameCardVideoObj2.getMovie() : null;
                    if (movie3 != null) {
                        movie3.setPlaying(true);
                    }
                    GameCardVideoMovieObj movie4 = gameCardVideoObj2 != null ? gameCardVideoObj2.getMovie() : null;
                    if (movie4 == null) {
                        return;
                    }
                    movie4.setCompleted(false);
                    return;
                }
                GameCardVideoObj gameCardVideoObj3 = (GameCardVideoObj) this.f86106a.getTag(e.f86098i.d());
                GameCardVideoMovieObj movie5 = gameCardVideoObj3 != null ? gameCardVideoObj3.getMovie() : null;
                if (movie5 != null) {
                    movie5.setCompleted(true);
                }
                GameCardVideoMovieObj movie6 = gameCardVideoObj3 != null ? gameCardVideoObj3.getMovie() : null;
                if (movie6 != null) {
                    movie6.setPlaying(false);
                }
                List listL = com.max.hbcache.c.l(com.max.hbcache.c.f66115c0);
                if (listL == null) {
                    listL = new ArrayList();
                }
                if (gameCardVideoObj3 != null && (movie = gameCardVideoObj3.getMovie()) != null && (movie_url = movie.getMovie_url()) != null) {
                    if (!listL.contains(movie_url)) {
                        listL.add(movie_url);
                    }
                    com.max.hbcache.c.A(com.max.hbcache.c.f66115c0, listL);
                }
                this.f86106a.S(this.f86107b);
                if (gameCardVideoObj3 != null) {
                    VideoViewX videoViewX = this.f86106a;
                    GameCardVideoMovieObj movie7 = gameCardVideoObj3.getMovie();
                    videoViewX.setVideoRes(movie7 != null ? movie7.getMovie_url() : null);
                    videoViewX.H();
                    videoViewX.O();
                }
                this.f86106a.setVisibility(8);
            }
        }

        /* JADX INFO: compiled from: GameCardVideoVHB.kt */
        public static final class c implements xe.a {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ VideoViewX f86109a;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.recommend.binder.e$a$c$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: GameCardVideoVHB.kt */
            public final /* synthetic */ class C0778a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f86110a;

                static {
                    int[] iArr = new int[PlaybackState.valuesCustom().length];
                    try {
                        iArr[PlaybackState.STARTED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f86110a = iArr;
                }
            }

            c(VideoViewX videoViewX) {
                this.f86109a = videoViewX;
            }

            @Override // xe.a
            public void a(@dl.d PlaybackState state) {
                GameCardVideoMovieObj movie;
                if (PatchProxy.proxy(new Object[]{state}, this, changeQuickRedirect, false, 35972, new Class[]{PlaybackState.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(state, "state");
                int i10 = C0778a.f86110a[state.ordinal()];
                if (i10 == 1) {
                    this.f86109a.setVisibility(0);
                    GameCardVideoObj gameCardVideoObj = (GameCardVideoObj) this.f86109a.getTag(e.f86098i.d());
                    movie = gameCardVideoObj != null ? gameCardVideoObj.getMovie() : null;
                    if (movie == null) {
                        return;
                    }
                    movie.setPlaying(true);
                    return;
                }
                if (i10 == 1) {
                    this.f86109a.setVisibility(8);
                    GameCardVideoObj gameCardVideoObj2 = (GameCardVideoObj) this.f86109a.getTag(e.f86098i.d());
                    movie = gameCardVideoObj2 != null ? gameCardVideoObj2.getMovie() : null;
                    if (movie == null) {
                        return;
                    }
                    movie.setPlaying(false);
                }
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public static final /* synthetic */ void a(a aVar, Context context, GameCardVideoObj gameCardVideoObj) {
            if (PatchProxy.proxy(new Object[]{aVar, context, gameCardVideoObj}, null, changeQuickRedirect, true, 35969, new Class[]{a.class, Context.class, GameCardVideoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            aVar.i(context, gameCardVideoObj);
        }

        private final List<String> b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35962, new Class[0], List.class);
            if (patchProxyResultProxy.isSupported) {
                return (List) patchProxyResultProxy.result;
            }
            List<String> listL = com.max.hbcache.c.l(com.max.hbcache.c.f66115c0);
            return listL == null ? new ArrayList() : listL;
        }

        private final AbsVideoView f(Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 35967, new Class[]{Context.class}, AbsVideoView.class);
            if (patchProxyResultProxy.isSupported) {
                return (AbsVideoView) patchProxyResultProxy.result;
            }
            VideoViewX videoViewX = new VideoViewX(context);
            PlainVideoUI plainVideoUI = new PlainVideoUI(context);
            CountDownV2TopPanel countDownV2TopPanel = new CountDownV2TopPanel(context);
            BasicCenterPanel basicCenterPanel = new BasicCenterPanel(context);
            plainVideoUI.setAlwaysShowTopPanel(true);
            plainVideoUI.m(countDownV2TopPanel).k(basicCenterPanel);
            ze.b bVar = new ze.b();
            bVar.c();
            bVar.a();
            bVar.d();
            bVar.b();
            videoViewX.p(plainVideoUI).o(new com.max.video.impl.f(context)).s(context);
            plainVideoUI.n(false, 0, 0L);
            videoViewX.u();
            videoViewX.setVisibility(8);
            videoViewX.setOnClickListener(new ViewOnClickListenerC0776a(videoViewX, context));
            videoViewX.setPlaybackStateChangeListener(new b(videoViewX, context));
            videoViewX.setTargetStateChangeListener(new c(videoViewX));
            return videoViewX;
        }

        private final void i(Context context, GameCardVideoObj gameCardVideoObj) {
            if (PatchProxy.proxy(new Object[]{context, gameCardVideoObj}, this, changeQuickRedirect, false, 35968, new Class[]{Context.class, GameCardVideoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            GameObj gameObjW = r1.w(gameCardVideoObj.getGame());
            Intent intentE3 = ChannelsDetailActivity.e3(z.b(context, gameObjW.getH_src(), r1.Z(gameObjW), gameObjW.getGame_type(), null, i0.m(), i0.j(), null), com.max.hbcommon.utils.c.w(gameObjW.getPlatform_infos()) ? "" : gameObjW.getPlatform_infos().get(0).getKey());
            GameCardVideoMovieObj movie = gameCardVideoObj.getMovie();
            context.startActivity(ChannelsDetailActivity.Y2(intentE3, movie != null ? movie.getSource_movie() : null, 0L, e(context).G() ? "1" : null));
        }

        @dl.e
        public final GameVideoCardView c(@dl.d Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 35965, new Class[]{Context.class}, GameVideoCardView.class);
            if (patchProxyResultProxy.isSupported) {
                return (GameVideoCardView) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            for (ViewParent parent = e(context).getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof GameVideoCardView) {
                    return (GameVideoCardView) parent;
                }
            }
            return null;
        }

        public final int d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35961, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : e.f86100k;
        }

        @dl.d
        public final synchronized AbsVideoView e(@dl.d Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 35966, new Class[]{Context.class}, AbsVideoView.class);
            if (patchProxyResultProxy.isSupported) {
                return (AbsVideoView) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            WeakReference weakReference = e.f86101l;
            AbsVideoView absVideoView = weakReference != null ? (AbsVideoView) weakReference.get() : null;
            if ((absVideoView != null ? absVideoView.getPlayer() : null) != null) {
                return absVideoView;
            }
            AbsVideoView absVideoViewF = f(context);
            e.f86101l = new WeakReference(absVideoViewF);
            return absVideoViewF;
        }

        public final boolean g(@dl.e String str) {
            List<String> listL;
            boolean z10 = true;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 35964, new Class[]{String.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (str != null && !kotlin.text.u.V1(str)) {
                z10 = false;
            }
            if (z10 || (listL = com.max.hbcache.c.l(com.max.hbcache.c.f66115c0)) == null) {
                return false;
            }
            return listL.contains(str);
        }

        public final void h() {
            WeakReference weakReference;
            AbsVideoView absVideoView;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35963, new Class[0], Void.TYPE).isSupported || (weakReference = e.f86101l) == null || (absVideoView = (AbsVideoView) weakReference.get()) == null) {
                return;
            }
            absVideoView.Z();
            absVideoView.Q();
            ViewParent parent = absVideoView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(absVideoView);
            }
        }
    }

    /* JADX INFO: compiled from: GameCardVideoVHB.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameRecommendBaseObj f86112c;

        b(GameRecommendBaseObj gameRecommendBaseObj) {
            this.f86112c = gameRecommendBaseObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35973, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            a.a(e.f86098i, e.this.y().b(), (GameCardVideoObj) this.f86112c);
        }
    }

    /* JADX INFO: compiled from: GameCardVideoVHB.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameVideoCardView f86113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameRecommendBaseObj f86114c;

        c(GameVideoCardView gameVideoCardView, GameRecommendBaseObj gameRecommendBaseObj) {
            this.f86113b = gameVideoCardView;
            this.f86114c = gameRecommendBaseObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35974, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f86113b.l((GameCardVideoObj) this.f86114c, true);
        }
    }

    public e(@dl.d RecommendVHBParam param) {
        f0.p(param, "param");
        this.f86102g = param;
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void g(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35958, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01d2  */
    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void h(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        int i10;
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35959, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        if (data instanceof GameCardVideoObj) {
            GameVideoCardView game_video_card = (GameVideoCardView) viewHolder.i(R.id.game_video_card);
            int iF = ViewUtils.f(this.f86102g.b(), 12.0f);
            if (this.f86103h == 0) {
                this.f86103h = ViewUtils.L(this.f86102g.b()) - (iF * 2);
            }
            ViewGroup.LayoutParams layoutParams = game_video_card.getLayoutParams();
            int i11 = this.f86103h;
            layoutParams.height = (i11 * bb.c.b.f30829o1) / bb.c.b.N3;
            layoutParams.width = i11;
            game_video_card.setRadius(ViewUtils.n(this.f86102g.b(), layoutParams.width, layoutParams.height, ViewUtils.ViewType.IMAGE));
            f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = iF;
            marginLayoutParams.rightMargin = iF;
            game_video_card.setLayoutParams(layoutParams);
            GameCardVideoObj gameCardVideoObj = (GameCardVideoObj) data;
            game_video_card.setLabelText(gameCardVideoObj.getTag());
            String tag_color = gameCardVideoObj.getTag_color();
            if (tag_color != null) {
                game_video_card.setLabelBackGroundColor(com.max.xiaoheihe.utils.d.e1(tag_color));
            }
            game_video_card.getIv_bg().setImageResource(R.drawable.default_game_avatar_351x351);
            com.max.hbimage.b.K(gameCardVideoObj.getImg(), game_video_card.getIv_bg());
            RecommendGameListItemObj game = gameCardVideoObj.getGame();
            if (com.max.hbcommon.utils.c.u(game != null ? game.getGame_icon() : null)) {
                game_video_card.getGame_item().getIv_icon().setVisibility(8);
            } else {
                game_video_card.getGame_item().getIv_icon().setVisibility(0);
                RecommendGameListItemObj game2 = gameCardVideoObj.getGame();
                com.max.hbimage.b.L(game2 != null ? game2.getGame_icon() : null, game_video_card.getGame_item().getIv_icon(), R.drawable.common_default_game_avatar_74x74);
            }
            game_video_card.getGame_item().setType(InnerGameItemView.Type.GAME_PRICE);
            game_video_card.getGame_item().setGamePrice(r1.w(gameCardVideoObj.getGame()), GamePriceView.ColorType.White);
            InnerGameItemView game_item = game_video_card.getGame_item();
            RecommendGameListItemObj game3 = gameCardVideoObj.getGame();
            game_item.setGameName(game3 != null ? game3.getGame_name() : null);
            InnerGameItemView game_item2 = game_video_card.getGame_item();
            RecommendGameListItemObj game4 = gameCardVideoObj.getGame();
            game_item2.b(game4 != null ? game4.getHb_rich_texts() : null);
            game_video_card.setBackgroundGradientColor(com.max.xiaoheihe.utils.d.e1(gameCardVideoObj.getBorder_start_color()), com.max.xiaoheihe.utils.d.e1(gameCardVideoObj.getBorder_end_color()));
            if (com.max.hbcommon.utils.c.u(gameCardVideoObj.getBottom_start_color()) || com.max.hbcommon.utils.c.u(gameCardVideoObj.getBottom_end_color())) {
                game_video_card.getIv_gradient().setVisibility(8);
            } else {
                game_video_card.setBottomGradientColor(com.max.xiaoheihe.utils.d.e1(gameCardVideoObj.getBottom_start_color()), com.max.xiaoheihe.utils.d.e1(gameCardVideoObj.getBottom_end_color()));
                game_video_card.getIv_gradient().setVisibility(0);
            }
            f0.o(game_video_card, "game_video_card");
            RecommendGameListItemObj game5 = gameCardVideoObj.getGame();
            String appid = game5 != null ? game5.getAppid() : null;
            int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
            RecommendGameListItemObj game6 = gameCardVideoObj.getGame();
            s(game_video_card, data, appid, bindingAdapterPosition, game6 != null ? game6.getGame_name() : null);
            game_video_card.setOnClickListener(new b(data));
            ImageView iv_video_play = game_video_card.getIv_video_play();
            if (gameCardVideoObj.getMovie() != null) {
                GameCardVideoMovieObj movie = gameCardVideoObj.getMovie();
                i10 = com.max.hbcommon.utils.c.u(movie != null ? movie.getMovie_url() : null) ? 8 : 0;
            }
            iv_video_play.setVisibility(i10);
            game_video_card.getIv_video_play().setOnClickListener(new c(game_video_card, data));
        }
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void p(@dl.d View itemView, @dl.d List<PathSrcNode> shownList, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{itemView, shownList, data}, this, changeQuickRedirect, false, 35960, new Class[]{View.class, List.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(itemView, "itemView");
        f0.p(shownList, "shownList");
        f0.p(data, "data");
        super.p(itemView, shownList, data);
    }

    @dl.d
    public final RecommendVHBParam y() {
        return this.f86102g;
    }

    public final void z(@dl.d RecommendVHBParam recommendVHBParam) {
        if (PatchProxy.proxy(new Object[]{recommendVHBParam}, this, changeQuickRedirect, false, 35957, new Class[]{RecommendVHBParam.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recommendVHBParam, "<set-?>");
        this.f86102g = recommendVHBParam;
    }
}
