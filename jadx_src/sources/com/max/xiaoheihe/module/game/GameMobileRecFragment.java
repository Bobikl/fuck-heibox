package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.video.AbsVideoView;
import com.max.video.impl.PlainVideoUI;
import com.max.video.impl.StatusInfoTopPanel;
import com.max.video.player.info.PlaybackState;
import com.max.video.ui.widget.BasicBottomPanel;
import com.max.video.ui.widget.BasicCenterPanel;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.GameScreenshotObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class GameMobileRecFragment extends com.max.hbcommon.base.d implements com.max.xiaoheihe.view.callback.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f84511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f84512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<GameObj> f84513d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a2 f84514e = new a2();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<AbsVideoView> f84515f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.max.xiaoheihe.module.video.b f84516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AbsVideoView f84517h;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    public class a implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 33273, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameMobileRecFragment.this.f84511b = 0;
            GameMobileRecFragment.N3(GameMobileRecFragment.this);
        }
    }

    public class b implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 33274, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameMobileRecFragment.M3(GameMobileRecFragment.this, 30);
            GameMobileRecFragment.N3(GameMobileRecFragment.this);
        }
    }

    public class c extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 33275, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported || i11 == 0) {
                return;
            }
            GameMobileRecFragment.Z3(GameMobileRecFragment.this, i11);
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<List<GameObj>>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33276, new Class[0], Void.TYPE).isSupported && GameMobileRecFragment.this.isActive()) {
                super.onComplete();
                GameMobileRecFragment.this.mRefreshLayout.A(0);
                GameMobileRecFragment.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 33277, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameMobileRecFragment.this.isActive()) {
                super.onError(th2);
                GameMobileRecFragment.j4(GameMobileRecFragment.this);
                GameMobileRecFragment.this.mRefreshLayout.A(0);
                GameMobileRecFragment.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<List<GameObj>> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33278, new Class[]{Result.class}, Void.TYPE).isSupported && GameMobileRecFragment.this.isActive()) {
                super.onNext(result);
                GameMobileRecFragment.k4(GameMobileRecFragment.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33279, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<List<GameObj>>) obj);
        }
    }

    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class f extends com.max.hbcommon.base.adapter.u<GameObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f84523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f84524c;

        public class a implements ze.a {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewGroup f84526a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbsVideoView f84527b;

            a(ViewGroup viewGroup, AbsVideoView absVideoView) {
                this.f84526a = viewGroup;
                this.f84527b = absVideoView;
            }

            @Override // ze.a
            public void a(boolean z10) {
                if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 33285, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                GameMobileRecFragment.R3(GameMobileRecFragment.this, this.f84526a, this.f84527b, z10);
            }
        }

        public class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewGroup f84529b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbsVideoView f84530c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ GameScreenshotObj f84531d;

            public class a implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                a() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            }

            b(ViewGroup viewGroup, AbsVideoView absVideoView, GameScreenshotObj gameScreenshotObj) {
                this.f84529b = viewGroup;
                this.f84530c = absVideoView;
                this.f84531d = gameScreenshotObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33286, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f84529b.setOnClickListener(new a());
                if (GameMobileRecFragment.this.f84517h != null && this.f84530c != GameMobileRecFragment.this.f84517h) {
                    GameMobileRecFragment.this.f84517h.Q();
                    f.this.notifyDataSetChanged();
                }
                GameMobileRecFragment.this.f84517h = this.f84530c;
                if (this.f84531d.getUrl() != null) {
                    this.f84530c.setVideoRes(this.f84531d.getUrl());
                    this.f84530c.M();
                }
            }
        }

        public class c implements xe.a {
            public static ChangeQuickRedirect changeQuickRedirect;

            c() {
            }

            @Override // xe.a
            public void a(@androidx.annotation.n0 PlaybackState playbackState) {
                PlaybackState playbackState2 = PlaybackState.COMPLETE;
            }
        }

        public class d implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            d() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        public class e implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            e() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33287, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                f.this.notifyDataSetChanged();
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.GameMobileRecFragment$f$f, reason: collision with other inner class name */
        public class C0749f extends com.max.hbcommon.base.adapter.s<GameObj> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GameObj f84537b;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.GameMobileRecFragment$f$f$a */
            public class a implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ GameObj f84539b;

                a(GameObj gameObj) {
                    this.f84539b = gameObj;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33290, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    ((com.max.hbcommon.base.d) GameMobileRecFragment.this).mContext.startActivity(z.b(((com.max.hbcommon.base.d) GameMobileRecFragment.this).mContext, this.f84539b.getH_src(), this.f84539b.getAppid(), C0749f.this.f84537b.getGame_type(), null, com.max.xiaoheihe.utils.i0.m(), com.max.xiaoheihe.utils.i0.j(), null));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0749f(Context context, List list, int i10, GameObj gameObj) {
                super(context, list, i10);
                this.f84537b = gameObj;
            }

            public void m(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj) {
                if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 33288, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                TextView textView = (TextView) eVar.i(R.id.tv_name);
                ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
                textView.setText(gameObj.getName());
                com.max.hbimage.b.d0(gameObj.getAppicon(), imageView, ViewUtils.f(((com.max.hbcommon.base.d) GameMobileRecFragment.this).mContext, 10.0f));
                eVar.b().setOnClickListener(new a(gameObj));
            }

            @Override // com.max.hbcommon.base.adapter.s
            public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj) {
                if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 33289, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                m(eVar, gameObj);
            }
        }

        public class g implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GameObj f84541b;

            g(GameObj gameObj) {
                this.f84541b = gameObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33291, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                GameMobileRecFragment gameMobileRecFragment = GameMobileRecFragment.this;
                gameMobileRecFragment.startActivity(GameRecommendListActivity.Z1(((com.max.hbcommon.base.d) gameMobileRecFragment).mContext, this.f84541b.getCollection_id()));
            }
        }

        public class h extends com.max.hbcommon.base.adapter.s<List<GameObj>> {
            public static ChangeQuickRedirect changeQuickRedirect;

            h(Context context, List list, int i10) {
                super(context, list, i10);
            }

            public void m(com.max.hbcommon.base.adapter.s.e eVar, List<GameObj> list) {
                if (PatchProxy.proxy(new Object[]{eVar, list}, this, changeQuickRedirect, false, 33292, new Class[]{com.max.hbcommon.base.adapter.s.e.class, List.class}, Void.TYPE).isSupported) {
                    return;
                }
                for (GameObj gameObj : list) {
                    View viewInflate = this.mInflater.inflate(R.layout.item_mobile_rec_row, (ViewGroup) null, false);
                    r1.E1(new com.max.hbcommon.base.adapter.s.e(R.layout.item_mobile_rec_row, viewInflate), gameObj, GameMobileRecFragment.this.f84514e);
                    ((LinearLayout) eVar.b()).addView(viewInflate);
                }
                for (int i10 = 0; i10 < 3 - list.size(); i10++) {
                    View viewInflate2 = this.mInflater.inflate(R.layout.item_mobile_rec_row, (ViewGroup) null, false);
                    LinearLayout linearLayout = (LinearLayout) eVar.b();
                    viewInflate2.findViewById(R.id.tv_download).setVisibility(8);
                    linearLayout.addView(viewInflate2);
                }
            }

            @Override // com.max.hbcommon.base.adapter.s
            public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, List<GameObj> list) {
                if (PatchProxy.proxy(new Object[]{eVar, list}, this, changeQuickRedirect, false, 33293, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                m(eVar, list);
            }
        }

        public class i implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GameObj f84544b;

            i(GameObj gameObj) {
                this.f84544b = gameObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33294, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                GameMobileRecFragment gameMobileRecFragment = GameMobileRecFragment.this;
                gameMobileRecFragment.startActivity(GameRecommendListActivity.Z1(((com.max.hbcommon.base.d) gameMobileRecFragment).mContext, this.f84544b.getCollection_id()));
            }
        }

        public f() {
            super(((com.max.hbcommon.base.d) GameMobileRecFragment.this).mContext, GameMobileRecFragment.this.f84513d);
            this.f84523b = true;
            this.f84524c = ViewUtils.L(((com.max.hbcommon.base.d) GameMobileRecFragment.this).mContext) - ViewUtils.f(((com.max.hbcommon.base.d) GameMobileRecFragment.this).mContext, 24.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(AbsVideoView absVideoView, ViewGroup viewGroup) {
            if (PatchProxy.proxy(new Object[]{absVideoView, viewGroup}, this, changeQuickRedirect, false, 33284, new Class[]{AbsVideoView.class, ViewGroup.class}, Void.TYPE).isSupported) {
                return;
            }
            if (absVideoView.D()) {
                GameMobileRecFragment.R3(GameMobileRecFragment.this, viewGroup, absVideoView, false);
            } else {
                ((com.max.hbcommon.base.d) GameMobileRecFragment.this).mContext.finish();
            }
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, GameObj gameObj) {
            Object[] objArr = {new Integer(i10), gameObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 33282, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : o(i10, gameObj);
        }

        public int o(int i10, GameObj gameObj) {
            byte b10 = 2;
            Object[] objArr = {new Integer(i10), gameObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 33280, new Class[]{cls, GameObj.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            if (gameObj.getType() == null) {
                return R.layout.empty_layout;
            }
            String type = gameObj.getType();
            type.hashCode();
            switch (type.hashCode()) {
                case 3165170:
                    b10 = !type.equals("game") ? (byte) -1 : (byte) 0;
                    break;
                case 311241997:
                    b10 = !type.equals(GameObj.REC_TYPE_COLLECTION_3X3) ? (byte) -1 : (byte) 1;
                    break;
                case 1058507719:
                    if (!type.equals(GameObj.REC_TYPE_COLLECTION_1X10)) {
                        b10 = -1;
                    }
                    break;
                case 1183756900:
                    b10 = !type.equals(GameObj.REC_TYPE_HEADER_GAME) ? (byte) -1 : (byte) 3;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    return R.layout.item_rec_game;
                case 1:
                    return R.layout.item_rec_list_header_multi;
                case 2:
                    return R.layout.item_rec_list_header;
                case 3:
                    return R.layout.item_rec_header_game;
                default:
                    return R.layout.empty_layout;
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 33283, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            q(eVar, (GameObj) obj);
        }

        public void q(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj) {
            boolean z10;
            boolean z11 = true;
            if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 33281, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class}, Void.TYPE).isSupported) {
                return;
            }
            if (R.layout.item_rec_header_game != eVar.d() && R.layout.item_rec_game != eVar.d()) {
                if (R.layout.item_rec_list_header == eVar.d()) {
                    TextView textView = (TextView) eVar.i(R.id.tv_title);
                    ViewGroup viewGroup = (ViewGroup) eVar.i(R.id.vg_more);
                    RecyclerView recyclerView = (RecyclerView) eVar.i(R.id.rv_container);
                    List<GameObj> game_list = gameObj.getGame_list();
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(((com.max.hbcommon.base.d) GameMobileRecFragment.this).mContext);
                    linearLayoutManager.setOrientation(0);
                    C0749f c0749f = new C0749f(((com.max.hbcommon.base.d) GameMobileRecFragment.this).mContext, game_list, R.layout.item_mobile_rec_small, gameObj);
                    recyclerView.setLayoutManager(linearLayoutManager);
                    recyclerView.setAdapter(c0749f);
                    textView.setText(gameObj.getTitle());
                    viewGroup.setOnClickListener(new g(gameObj));
                    return;
                }
                if (R.layout.item_rec_list_header_multi == eVar.d()) {
                    TextView textView2 = (TextView) eVar.i(R.id.tv_title);
                    ViewGroup viewGroup2 = (ViewGroup) eVar.i(R.id.vg_more);
                    ViewPager2 viewPager2 = (ViewPager2) eVar.i(R.id.vp_container);
                    List<GameObj> game_list2 = gameObj.getGame_list();
                    ArrayList arrayList = new ArrayList();
                    if (game_list2 != null) {
                        for (int i10 = 0; i10 < (game_list2.size() / 3) + 1; i10++) {
                            int i11 = i10 * 3;
                            int i12 = i11 + 3;
                            if (i12 < game_list2.size()) {
                                arrayList.add(game_list2.subList(i11, i12));
                            } else {
                                arrayList.add(game_list2.subList(i11, game_list2.size()));
                            }
                        }
                    }
                    viewPager2.setAdapter(new h(((com.max.hbcommon.base.d) GameMobileRecFragment.this).mContext, arrayList, R.layout.item_simple_list));
                    textView2.setText(gameObj.getTitle());
                    viewGroup2.setOnClickListener(new i(gameObj));
                    return;
                }
                return;
            }
            final ViewGroup viewGroup3 = (ViewGroup) eVar.i(R.id.vg_screenshots);
            final AbsVideoView absVideoView = (AbsVideoView) eVar.i(R.id.video_view);
            r1.L1(eVar, gameObj, this.f84524c, GameMobileRecFragment.this.f84514e);
            if (com.max.hbcommon.utils.c.w(gameObj.getScreenshots()) || "image".equals(gameObj.getScreenshots().get(0).getType())) {
                eVar.itemView.setTag(null);
                return;
            }
            GameScreenshotObj gameScreenshotObj = gameObj.getScreenshots().get(0);
            absVideoView.setTag(gameObj);
            eVar.itemView.setTag(gameObj);
            ze.d ui2 = absVideoView.getUi();
            com.max.video.player.a player = absVideoView.getPlayer();
            if (ui2 == null || !(ui2.getPanelTop() instanceof StatusInfoTopPanel)) {
                StatusInfoTopPanel statusInfoTopPanel = new StatusInfoTopPanel(((com.max.hbcommon.base.d) GameMobileRecFragment.this).mContext);
                BasicCenterPanel basicCenterPanel = new BasicCenterPanel(((com.max.hbcommon.base.d) GameMobileRecFragment.this).mContext);
                BasicBottomPanel basicBottomPanel = new BasicBottomPanel(((com.max.hbcommon.base.d) GameMobileRecFragment.this).mContext);
                statusInfoTopPanel.setBackwardAction(new ze.e() { // from class: com.max.xiaoheihe.module.game.f0
                    @Override // ze.e
                    public final void invoke() {
                        this.f87416a.p(absVideoView, viewGroup3);
                    }
                });
                basicBottomPanel.setFullScreenAction(new a(viewGroup3, absVideoView));
                PlainVideoUI plainVideoUI = new PlainVideoUI(((com.max.hbcommon.base.d) GameMobileRecFragment.this).mContext);
                plainVideoUI.m(statusInfoTopPanel).k(basicCenterPanel).q(basicBottomPanel);
                plainVideoUI.getCoverView().setOnClickListener(new b(viewGroup3, absVideoView, gameScreenshotObj));
                absVideoView.p(plainVideoUI);
                ui2 = plainVideoUI;
                z10 = true;
            } else {
                z10 = false;
            }
            if (player == null) {
                absVideoView.o(new com.max.video.impl.f(((com.max.hbcommon.base.d) GameMobileRecFragment.this).mContext));
            } else {
                z11 = z10;
            }
            if (z11) {
                absVideoView.s(((com.max.hbcommon.base.d) GameMobileRecFragment.this).mContext);
            }
            absVideoView.setPlaybackStateChangeListener(new c());
            if (com.max.xiaoheihe.module.bbs.utils.b.f83396a) {
                absVideoView.H();
            } else {
                absVideoView.a0();
            }
            if (com.max.hbcommon.utils.i.e(((com.max.hbcommon.base.d) GameMobileRecFragment.this).mContext) && this.f84523b) {
                this.f84523b = false;
                ui2.i();
                viewGroup3.setOnClickListener(new d());
                if (GameMobileRecFragment.this.f84517h != null && absVideoView != GameMobileRecFragment.this.f84517h) {
                    GameMobileRecFragment.this.f84517h.Q();
                    eVar.itemView.post(new e());
                }
                GameMobileRecFragment.this.f84517h = absVideoView;
                if (gameScreenshotObj.getUrl() != null) {
                    absVideoView.setVideoRes(gameScreenshotObj.getUrl());
                    absVideoView.M();
                }
            }
            if (GameMobileRecFragment.this.f84515f.contains(absVideoView)) {
                return;
            }
            GameMobileRecFragment.this.f84515f.add(absVideoView);
        }
    }

    static /* synthetic */ int M3(GameMobileRecFragment gameMobileRecFragment, int i10) {
        int i11 = gameMobileRecFragment.f84511b + i10;
        gameMobileRecFragment.f84511b = i11;
        return i11;
    }

    static /* synthetic */ void N3(GameMobileRecFragment gameMobileRecFragment) {
        if (PatchProxy.proxy(new Object[]{gameMobileRecFragment}, null, changeQuickRedirect, true, 33268, new Class[]{GameMobileRecFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameMobileRecFragment.q4();
    }

    static /* synthetic */ void R3(GameMobileRecFragment gameMobileRecFragment, ViewGroup viewGroup, AbsVideoView absVideoView, boolean z10) {
        if (PatchProxy.proxy(new Object[]{gameMobileRecFragment, viewGroup, absVideoView, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 33272, new Class[]{GameMobileRecFragment.class, ViewGroup.class, AbsVideoView.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gameMobileRecFragment.u4(viewGroup, absVideoView, z10);
    }

    static /* synthetic */ void Z3(GameMobileRecFragment gameMobileRecFragment, int i10) {
        if (PatchProxy.proxy(new Object[]{gameMobileRecFragment, new Integer(i10)}, null, changeQuickRedirect, true, 33269, new Class[]{GameMobileRecFragment.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gameMobileRecFragment.t4(i10);
    }

    static /* synthetic */ void j4(GameMobileRecFragment gameMobileRecFragment) {
        if (PatchProxy.proxy(new Object[]{gameMobileRecFragment}, null, changeQuickRedirect, true, 33270, new Class[]{GameMobileRecFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameMobileRecFragment.showError();
    }

    static /* synthetic */ void k4(GameMobileRecFragment gameMobileRecFragment, List list) {
        if (PatchProxy.proxy(new Object[]{gameMobileRecFragment, list}, null, changeQuickRedirect, true, 33271, new Class[]{GameMobileRecFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        gameMobileRecFragment.s4(list);
    }

    private void q4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33260, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().A5(this.f84511b, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    public static GameMobileRecFragment r4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 33255, new Class[0], GameMobileRecFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameMobileRecFragment) patchProxyResultProxy.result;
        }
        GameMobileRecFragment gameMobileRecFragment = new GameMobileRecFragment();
        gameMobileRecFragment.setArguments(new Bundle());
        return gameMobileRecFragment;
    }

    private void s4(List<GameObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 33261, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f84511b == 0) {
            this.f84513d.clear();
        }
        if (list != null) {
            this.f84513d.addAll(list);
        }
        this.f84512c.notifyDataSetChanged();
        if (this.f84513d.isEmpty()) {
            showEmpty();
        } else {
            showContentView();
        }
    }

    private void t4(int i10) {
        RecyclerView recyclerView;
        AbsVideoView absVideoView;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 33266, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (recyclerView = this.mRecyclerView) == null || !(recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.mRecyclerView.getLayoutManager();
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (((iFindFirstVisibleItemPosition == -1 || iFindLastVisibleItemPosition == -1) ? 0 : (iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition) + 1) > 0) {
            while (iFindFirstVisibleItemPosition < iFindLastVisibleItemPosition + 1) {
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                if (viewFindViewByPosition != null && (viewFindViewByPosition.getTag() instanceof GameObj)) {
                    Rect rect = new Rect();
                    int height = viewFindViewByPosition.getHeight();
                    if (height > 0 && viewFindViewByPosition.getLocalVisibleRect(rect)) {
                        int i11 = ((rect.bottom - rect.top) * 100) / height;
                        ImageView imageView = (ImageView) viewFindViewByPosition.findViewById(R.id.iv_screenshot);
                        ImageView imageView2 = (ImageView) viewFindViewByPosition.findViewById(R.id.iv_video_play);
                        ViewGroup viewGroup = (ViewGroup) viewFindViewByPosition.findViewById(R.id.vg_screenshots);
                        if (i11 < 50) {
                            AbsVideoView absVideoView2 = (AbsVideoView) viewFindViewByPosition.findViewById(R.id.video_view);
                            imageView.setVisibility(0);
                            imageView2.setVisibility(0);
                            viewGroup.setClickable(false);
                            if (absVideoView2 != null) {
                                absVideoView2.Z();
                            }
                        } else if (i11 == 100 && com.max.hbcommon.utils.i.e(this.mContext) && ((absVideoView = this.f84517h) == null || !absVideoView.G())) {
                            GameScreenshotObj gameScreenshotObj = ((GameObj) viewFindViewByPosition.getTag()).getScreenshots().get(0);
                            AbsVideoView absVideoView3 = (AbsVideoView) viewFindViewByPosition.findViewById(R.id.video_view);
                            imageView.setVisibility(8);
                            imageView2.setVisibility(8);
                            viewGroup.setOnClickListener(new e());
                            AbsVideoView absVideoView4 = this.f84517h;
                            if (absVideoView4 != null && absVideoView3 != absVideoView4) {
                                absVideoView4.Q();
                            }
                            this.f84517h = absVideoView3;
                            if (gameScreenshotObj.getUrl() != null) {
                                absVideoView3.setVideoRes(gameScreenshotObj.getUrl());
                                absVideoView3.M();
                            }
                        }
                    }
                }
                iFindFirstVisibleItemPosition++;
            }
        }
    }

    private void u4(ViewGroup viewGroup, AbsVideoView absVideoView, boolean z10) {
        if (PatchProxy.proxy(new Object[]{viewGroup, absVideoView, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 33265, new Class[]{ViewGroup.class, AbsVideoView.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            if (this.f84516g != null) {
                viewGroup.removeView(absVideoView);
                this.f84516g.c(absVideoView, null);
                return;
            }
            return;
        }
        com.max.xiaoheihe.module.video.b bVar = this.f84516g;
        if (bVar != null) {
            bVar.e();
            viewGroup.addView(absVideoView, 0);
        }
    }

    @Override // com.max.xiaoheihe.view.callback.a
    public void D3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33267, new Class[0], Void.TYPE).isSupported && isActive()) {
            this.mRecyclerView.scrollToPosition(0);
            this.mRefreshLayout.F();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33259, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        q4();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33258, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        this.mUnBinder = ButterKnife.f(this, view);
        this.mRefreshLayout.setBackgroundColor(getResources().getColor(R.color.white));
        this.f84512c = new f();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.mRecyclerView.setAdapter(this.f84512c);
        this.mRefreshLayout.S(new a());
        this.mRefreshLayout.f0(new b());
        this.mRecyclerView.addOnScrollListener(new c());
        if (this.mIsFirst) {
            showLoading();
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 33256, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttach(context);
        if (getParentFragment() instanceof com.max.xiaoheihe.module.video.b) {
            this.f84516g = (com.max.xiaoheihe.module.video.b) getParentFragment();
            return;
        }
        if (context instanceof com.max.xiaoheihe.module.video.b) {
            this.f84516g = (com.max.xiaoheihe.module.video.b) context;
            return;
        }
        throw new RuntimeException(getParentFragment() + " or " + context + " must implement FullscreenInteractionListener");
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33264, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f84514e.f();
        if (this.f84515f.size() > 0) {
            Iterator<AbsVideoView> it = this.f84515f.iterator();
            while (it.hasNext()) {
                it.next().Q();
            }
            this.f84515f.clear();
        }
        super.onDestroyView();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33257, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetach();
        this.f84516g = null;
    }

    @Override // com.max.hbcommon.base.d
    public void onFragmentHide() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33263, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onFragmentHide();
        if (this.f84515f.size() > 0) {
            Iterator<AbsVideoView> it = this.f84515f.iterator();
            while (it.hasNext()) {
                it.next().Z();
            }
        }
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33262, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        q4();
    }
}
