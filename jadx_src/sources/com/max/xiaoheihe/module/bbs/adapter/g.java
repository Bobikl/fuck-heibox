package com.max.xiaoheihe.module.bbs.adapter;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.AccountDetailObj;
import com.max.xiaoheihe.bean.bbs.BBSFollowedMomentObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.FollowedMomentsWrapperObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.bbs.LinkMomentsActivity;
import com.max.xiaoheihe.module.bbs.component.BBSLinkListBottomBar;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.max.xiaoheihe.module.game.component.GameCard;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: FollowedMomentsAdapter.java */
/* JADX INFO: loaded from: classes10.dex */
public class g extends com.max.hbcommon.base.adapter.u<FollowedMomentsWrapperObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f80426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private io.reactivex.disposables.a f80427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private q f80428d;

    /* JADX INFO: compiled from: FollowedMomentsAdapter.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameObj f80429b;

        a(GameObj gameObj) {
            this.f80429b = gameObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27277, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            g.o(g.this, this.f80429b);
        }
    }

    /* JADX INFO: compiled from: FollowedMomentsAdapter.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameCard f80431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameObj f80432c;

        b(GameCard gameCard, GameObj gameObj) {
            this.f80431b = gameCard;
            this.f80432c = gameObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27278, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            g.q(g.this, this.f80431b.f86637c, this.f80432c);
        }
    }

    /* JADX INFO: compiled from: FollowedMomentsAdapter.java */
    public class c implements r1.y0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f80434a;

        c(TextView textView) {
            this.f80434a = textView;
        }

        @Override // com.max.xiaoheihe.module.game.r1.y0
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27280, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            r1.n2(this.f80434a, GameObj.SUBSCRIBE_STATE_SUBSCRIBING, true, true);
        }

        @Override // com.max.xiaoheihe.module.game.r1.y0
        public void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27279, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            r1.n2(this.f80434a, GameObj.SUBSCRIBE_STATE_SUBSCRIBING, true, true);
        }
    }

    /* JADX INFO: compiled from: FollowedMomentsAdapter.java */
    public class d extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f80436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameObj f80437c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f80438d;

        d(TextView textView, GameObj gameObj, String str) {
            this.f80436b = textView;
            this.f80437c = gameObj;
            this.f80438d = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 27281, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.fail));
            r1.n2(this.f80436b, this.f80437c.getFollow_state(), true, true);
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 27282, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            this.f80437c.setFollow_state(this.f80438d);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 27283, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: FollowedMomentsAdapter.java */
    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSFollowedMomentObj f80440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f80441c;

        e(BBSFollowedMomentObj bBSFollowedMomentObj, int i10) {
            this.f80440b = bBSFollowedMomentObj;
            this.f80441c = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27284, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (BBSFollowedMomentObj bBSFollowedMomentObj : this.f80440b.getEvents()) {
                if (BBSFollowedMomentObj.CONTENT_TYPE_POST_LINK.equals(bBSFollowedMomentObj.getContent_type()) && bBSFollowedMomentObj.getLink() != null) {
                    bBSFollowedMomentObj.getLink().setUser(this.f80440b.getUser());
                    bBSFollowedMomentObj.getLink().setFrom("6");
                }
                bBSFollowedMomentObj.setUser(this.f80440b.getUser());
                FollowedMomentsWrapperObj followedMomentsWrapperObj = new FollowedMomentsWrapperObj();
                followedMomentsWrapperObj.setItemType(0);
                followedMomentsWrapperObj.setMoments(bBSFollowedMomentObj);
                arrayList.add(followedMomentsWrapperObj);
            }
            g.this.getDataList().addAll(this.f80441c + 1, arrayList);
            this.f80440b.setEvents(null);
            if (g.this.f80428d != null) {
                g.this.f80428d.O(this.f80441c + 1, arrayList.size());
            }
            view.setVisibility(8);
        }
    }

    /* JADX INFO: compiled from: FollowedMomentsAdapter.java */
    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSFollowedMomentObj f80443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f80444c;

        f(BBSFollowedMomentObj bBSFollowedMomentObj, int i10) {
            this.f80443b = bBSFollowedMomentObj;
            this.f80444c = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27285, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (BBSFollowedMomentObj bBSFollowedMomentObj : this.f80443b.getEvents()) {
                if (BBSFollowedMomentObj.CONTENT_TYPE_POST_LINK.equals(bBSFollowedMomentObj.getContent_type()) && bBSFollowedMomentObj.getLink() != null) {
                    bBSFollowedMomentObj.getLink().setUser(bBSFollowedMomentObj.getUser());
                    bBSFollowedMomentObj.getLink().setFrom("6");
                }
                bBSFollowedMomentObj.setGames(this.f80443b.getGames());
                FollowedMomentsWrapperObj followedMomentsWrapperObj = new FollowedMomentsWrapperObj();
                followedMomentsWrapperObj.setItemType(0);
                followedMomentsWrapperObj.setMoments(bBSFollowedMomentObj);
                arrayList.add(followedMomentsWrapperObj);
            }
            g.this.getDataList().addAll(this.f80444c + 1, arrayList);
            this.f80443b.setEvents(null);
            if (g.this.f80428d != null) {
                g.this.f80428d.O(this.f80444c + 1, arrayList.size());
            }
            view.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.adapter.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FollowedMomentsAdapter.java */
    public class C0680g implements com.max.xiaoheihe.module.bbs.utils.b.y {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0680g() {
        }

        @Override // com.max.xiaoheihe.module.bbs.utils.b.y
        public void a(com.max.hbcommon.base.adapter.s.e eVar, BBSLinkObj bBSLinkObj) {
        }
    }

    /* JADX INFO: compiled from: FollowedMomentsAdapter.java */
    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27276, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.I(g.this.f80426b, com.max.xiaoheihe.module.account.utils.c.i(), "recommend", null).A();
        }
    }

    /* JADX INFO: compiled from: FollowedMomentsAdapter.java */
    public class i extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FollowedMomentsWrapperObj f80448b;

        i(FollowedMomentsWrapperObj followedMomentsWrapperObj) {
            this.f80448b = followedMomentsWrapperObj;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@n0 Rect rect, @n0 View view, @n0 RecyclerView recyclerView, @n0 RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 27286, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            if (recyclerView.getChildAdapterPosition(view) == this.f80448b.getRecUsers().getItems().size() - 1) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(0, 0, ViewUtils.f(g.this.f80426b, 20.0f), 0);
            }
        }
    }

    /* JADX INFO: compiled from: FollowedMomentsAdapter.java */
    public class j implements com.max.xiaoheihe.module.bbs.adapter.r.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // com.max.xiaoheihe.module.bbs.adapter.r.e
        public void a(BBSUserInfoObj bBSUserInfoObj) {
        }

        @Override // com.max.xiaoheihe.module.bbs.adapter.r.e
        public boolean b(BBSUserInfoObj bBSUserInfoObj) {
            return false;
        }
    }

    /* JADX INFO: compiled from: FollowedMomentsAdapter.java */
    public class k extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 27287, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int itemCount = recyclerView.getAdapter().getItemCount();
            if (childAdapterPosition == 0) {
                rect.set(ViewUtils.f(g.this.f80426b, 10.0f), 0, 0, 0);
            } else if (childAdapterPosition == itemCount - 1) {
                rect.set(ViewUtils.f(g.this.f80426b, 8.0f), 0, ViewUtils.f(g.this.f80426b, 11.0f), 0);
            } else {
                rect.set(ViewUtils.f(g.this.f80426b, 8.0f), 0, 0, 0);
            }
        }
    }

    /* JADX INFO: compiled from: FollowedMomentsAdapter.java */
    public class l extends com.max.hbcommon.base.adapter.s<GameObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: FollowedMomentsAdapter.java */
        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GameObj f80453b;

            a(GameObj gameObj) {
                this.f80453b = gameObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27290, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                g.o(g.this, this.f80453b);
            }
        }

        l(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 27288, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_image);
            TextView textView = (TextView) eVar.i(R.id.tv_name);
            TextView textView2 = (TextView) eVar.i(R.id.tv_purchase_game);
            View viewB = eVar.b();
            int iL = (int) (((ViewUtils.L(g.this.f80426b) - ViewUtils.f(g.this.f80426b, 46.0f)) / 3.0f) + 0.5f);
            int i10 = (int) (((iL * 57.0f) / 110.0f) + 0.5f);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams.width != iL || layoutParams.height != i10) {
                layoutParams.width = iL;
                layoutParams.height = i10;
                imageView.setLayoutParams(layoutParams);
            }
            com.max.hbimage.b.d0(gameObj.getImage(), imageView, ViewUtils.f(g.this.f80426b, 4.0f));
            r1.P1(eVar, gameObj.getScore_desc(), gameObj.getScore());
            textView.setText(gameObj.getName());
            r1.A(eVar, gameObj);
            textView2.setVisibility(8);
            viewB.setOnClickListener(new a(gameObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 27289, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, gameObj);
        }
    }

    /* JADX INFO: compiled from: FollowedMomentsAdapter.java */
    public class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FollowedMomentsWrapperObj f80455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f80456c;

        m(FollowedMomentsWrapperObj followedMomentsWrapperObj, com.max.hbcommon.base.adapter.s.e eVar) {
            this.f80455b = followedMomentsWrapperObj;
            this.f80456c = eVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27291, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f80455b.getMoments().getLink() == null) {
                g.this.f80426b.startActivity(LinkMomentsActivity.Q1(g.this.f80426b, this.f80455b.getMoments().getGroup_id(), this.f80455b.getMoments().getUserid(), this.f80455b.getMoments().getContent_type()));
                return;
            }
            if (g.this.f80428d != null) {
                g.this.f80428d.t1(this.f80456c, this.f80455b);
            }
            com.max.xiaoheihe.module.bbs.utils.b.E(g.this.f80426b, this.f80455b.getMoments().getLink());
        }
    }

    /* JADX INFO: compiled from: FollowedMomentsAdapter.java */
    public class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FollowedMomentsWrapperObj f80458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f80459c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ GameObj f80460d;

        n(FollowedMomentsWrapperObj followedMomentsWrapperObj, com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj) {
            this.f80458b = followedMomentsWrapperObj;
            this.f80459c = eVar;
            this.f80460d = gameObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27292, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f80458b.getMoments().getLink() == null) {
                g.o(g.this, this.f80460d);
                return;
            }
            if (g.this.f80428d != null) {
                g.this.f80428d.t1(this.f80459c, this.f80458b);
            }
            com.max.xiaoheihe.module.bbs.utils.b.E(g.this.f80426b, this.f80458b.getMoments().getLink());
        }
    }

    /* JADX INFO: compiled from: FollowedMomentsAdapter.java */
    public class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f80462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FollowedMomentsWrapperObj f80463c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f80464d;

        o(com.max.hbcommon.base.adapter.s.e eVar, FollowedMomentsWrapperObj followedMomentsWrapperObj, BBSLinkObj bBSLinkObj) {
            this.f80462b = eVar;
            this.f80463c = followedMomentsWrapperObj;
            this.f80464d = bBSLinkObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27293, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (g.this.f80428d != null) {
                g.this.f80428d.t1(this.f80462b, this.f80463c);
            }
            com.max.xiaoheihe.module.bbs.utils.b.E(g.this.f80426b, this.f80464d);
        }
    }

    /* JADX INFO: compiled from: FollowedMomentsAdapter.java */
    public class p implements com.max.xiaoheihe.module.bbs.utils.b.y {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FollowedMomentsWrapperObj f80466a;

        p(FollowedMomentsWrapperObj followedMomentsWrapperObj) {
            this.f80466a = followedMomentsWrapperObj;
        }

        @Override // com.max.xiaoheihe.module.bbs.utils.b.y
        public void a(com.max.hbcommon.base.adapter.s.e eVar, BBSLinkObj bBSLinkObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSLinkObj}, this, changeQuickRedirect, false, 27294, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported || g.this.f80428d == null) {
                return;
            }
            g.this.f80428d.t1(eVar, this.f80466a);
        }
    }

    /* JADX INFO: compiled from: FollowedMomentsAdapter.java */
    public interface q {
        void O(int i10, int i11);

        void t1(com.max.hbcommon.base.adapter.s.e eVar, FollowedMomentsWrapperObj followedMomentsWrapperObj);
    }

    /* JADX INFO: compiled from: FollowedMomentsAdapter.java */
    public class r implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        BBSUserInfoObj f80468b;

        public r(BBSUserInfoObj bBSUserInfoObj) {
            this.f80468b = bBSUserInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27295, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.T(g.this.f80426b, this.f80468b.getUserid()).A();
        }
    }

    public g(Context context, io.reactivex.disposables.a aVar, q qVar, List<FollowedMomentsWrapperObj> list) {
        super(context, list);
        this.f80426b = context;
        this.f80428d = qVar;
        this.f80427c = aVar;
    }

    private void A(GameCard gameCard, GameObj gameObj) {
        if (PatchProxy.proxy(new Object[]{gameCard, gameObj}, this, changeQuickRedirect, false, 27264, new Class[]{GameCard.class, GameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameCard.setBackgroundDrawable(this.f80426b.getResources().getDrawable(R.drawable.game_bg_in_post));
        gameCard.setOnClickListener(new a(gameObj));
        gameCard.b(gameObj);
        if (gameObj.getHeybox_price() != null) {
            gameCard.f86637c.setClickable(false);
        } else {
            gameCard.f86637c.setOnClickListener(new b(gameCard, gameObj));
        }
    }

    static /* synthetic */ void o(g gVar, GameObj gameObj) {
        if (PatchProxy.proxy(new Object[]{gVar, gameObj}, null, changeQuickRedirect, true, 27274, new Class[]{g.class, GameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.u(gameObj);
    }

    static /* synthetic */ void q(g gVar, TextView textView, GameObj gameObj) {
        if (PatchProxy.proxy(new Object[]{gVar, textView, gameObj}, null, changeQuickRedirect, true, 27275, new Class[]{g.class, TextView.class, GameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.v(textView, gameObj);
    }

    private void r(TextView textView, GameObj gameObj, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{textView, gameObj, str, str2}, this, changeQuickRedirect, false, 27269, new Class[]{TextView.class, GameObj.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        io.reactivex.z<Result> zVarNb = null;
        if ("unfollowing".equalsIgnoreCase(str)) {
            zVarNb = com.max.xiaoheihe.network.i.a().x3(gameObj.getAppid());
        } else if ("following".equalsIgnoreCase(str)) {
            zVarNb = com.max.xiaoheihe.network.i.a().cb(gameObj.getAppid());
        } else if (GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING.equalsIgnoreCase(str)) {
            zVarNb = com.max.xiaoheihe.network.i.a().l8(gameObj.getAppid());
        } else if (GameObj.SUBSCRIBE_STATE_SUBSCRIBING.equalsIgnoreCase(str)) {
            zVarNb = com.max.xiaoheihe.network.i.a().nb(gameObj.getAppid(), str2);
        }
        if (zVarNb != null) {
            this.f80427c.c((io.reactivex.disposables.b) zVarNb.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(textView, gameObj, str)));
        }
    }

    private void u(GameObj gameObj) {
        if (PatchProxy.proxy(new Object[]{gameObj}, this, changeQuickRedirect, false, 27267, new Class[]{GameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = this.f80426b;
        context.startActivity(com.max.xiaoheihe.module.game.z.b(context, gameObj.getH_src(), gameObj.getAppid(), gameObj.getGame_type(), null, i0.m(), i0.j(), null));
    }

    private void v(TextView textView, GameObj gameObj) {
        if (PatchProxy.proxy(new Object[]{textView, gameObj}, this, changeQuickRedirect, false, 27268, new Class[]{TextView.class, GameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.hbcommon.utils.c.u(gameObj.getDownload_url_android())) {
            l0.z0(this.f80426b, gameObj.getDownload_url_android(), gameObj.getBundle_id());
            return;
        }
        if (i0.e(this.f80426b)) {
            if (GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING.equalsIgnoreCase(gameObj.getFollow_state())) {
                String strX0 = r1.x0();
                r1.h2((BaseActivity) this.f80426b, com.max.hbcommon.utils.c.B(strX0) ? strX0 : null, r1.Z(gameObj), new c(textView));
            } else if (!GameObj.SUBSCRIBE_STATE_SUBSCRIBING.equalsIgnoreCase(gameObj.getFollow_state())) {
                GameObj.FOLLOW_STATE_OWNED.equalsIgnoreCase(gameObj.getFollow_state());
            } else {
                r1.n2(textView, GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING, true, true);
                r(textView, gameObj, GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING, null);
            }
        }
    }

    private void w(Context context, ViewGroup viewGroup, BBSLinkObj bBSLinkObj) {
        if (PatchProxy.proxy(new Object[]{context, viewGroup, bBSLinkObj}, this, changeQuickRedirect, false, 27271, new Class[]{Context.class, ViewGroup.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_forward_post, viewGroup, false);
        bBSLinkObj.setIndex(getDataList().indexOf(bBSLinkObj) + "");
        com.max.xiaoheihe.module.bbs.utils.b.P(context, viewInflate, bBSLinkObj, com.max.xiaoheihe.module.bbs.utils.b.f83401f, 0, null, new C0680g());
        viewGroup.addView(viewInflate);
    }

    private void x(BBSLinkObj bBSLinkObj, BBSLinkListBottomBar bBSLinkListBottomBar) {
        if (PatchProxy.proxy(new Object[]{bBSLinkObj, bBSLinkListBottomBar}, this, changeQuickRedirect, false, 27266, new Class[]{BBSLinkObj.class, BBSLinkListBottomBar.class}, Void.TYPE).isSupported || bBSLinkObj == null) {
            return;
        }
        String comment_num = bBSLinkObj.getComment_num();
        String link_award_num = bBSLinkObj.getLink_award_num();
        bBSLinkListBottomBar.f80805b.f80993d.setNum(comment_num);
        bBSLinkListBottomBar.f80805b.f80991b.setNum(link_award_num);
    }

    private void y(BBSUserInfoObj bBSUserInfoObj, BBSUserSectionView bBSUserSectionView) {
        if (PatchProxy.proxy(new Object[]{bBSUserInfoObj, bBSUserSectionView}, this, changeQuickRedirect, false, 27265, new Class[]{BBSUserInfoObj.class, BBSUserSectionView.class}, Void.TYPE).isSupported || bBSUserInfoObj == null) {
            return;
        }
        r rVar = new r(bBSUserInfoObj);
        bBSUserSectionView.f80846b.setAvatar(bBSUserInfoObj.getAvartar(), bBSUserInfoObj.getAvatar_decoration());
        bBSUserSectionView.f80846b.setOnClickListener(rVar);
        bBSUserSectionView.setName(bBSUserInfoObj.getUsername());
        bBSUserSectionView.f80847c.setOnClickListener(rVar);
        AccountDetailObj accountDetailObjV1 = com.max.xiaoheihe.utils.d.V1(bBSUserInfoObj);
        bBSUserSectionView.a(accountDetailObjV1.getBbs_medal(), accountDetailObjV1.getMedals(), accountDetailObjV1.getUserid());
        if (bBSUserInfoObj.getLevel_info() == null) {
            bBSUserSectionView.f80850f.setVisibility(8);
        } else {
            bBSUserSectionView.f80850f.setVisibility(0);
            bBSUserSectionView.setLevel(com.max.hbutils.utils.n.q(bBSUserInfoObj.getLevel_info().getLevel()));
        }
    }

    private void z(com.max.hbcommon.base.adapter.s.e eVar, BBSFollowedMomentObj bBSFollowedMomentObj, int i10) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSFollowedMomentObj, new Integer(i10)}, this, changeQuickRedirect, false, 27270, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSFollowedMomentObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) eVar.i(R.id.vg_related_events);
        if (com.max.hbcommon.utils.c.w(bBSFollowedMomentObj.getEvents())) {
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        Context context = this.f80426b;
        viewGroup.setBackground(com.max.hbutils.utils.q.o(this.f80426b, R.color.divider_secondary_2_color, ViewUtils.h0(context, ViewUtils.m(context, ViewUtils.L(context), ViewUtils.V(viewGroup)))));
        LinearLayout linearLayout = (LinearLayout) eVar.i(R.id.vg_icon);
        TextView textView = (TextView) eVar.i(R.id.tv_related_name);
        TextView textView2 = (TextView) eVar.i(R.id.tv_related_desc);
        int iF = ViewUtils.f(this.f80426b, 20.0f);
        if ("single_user".equals(bBSFollowedMomentObj.getGroup_type())) {
            linearLayout.removeAllViews();
            ImageView imageView = new ImageView(this.f80426b);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iF, iF);
            layoutParams.rightMargin = ViewUtils.f(this.f80426b, 6.0f);
            imageView.setLayoutParams(layoutParams);
            com.max.hbimage.b.I(bBSFollowedMomentObj.getUser().getAvartar(), imageView, R.drawable.common_default_avatar_40x40);
            linearLayout.addView(imageView);
            textView.setText(bBSFollowedMomentObj.getUser().getUsername());
            textView.setVisibility(0);
            textView2.setText(String.format(com.max.xiaoheihe.utils.d.n0(R.string.moments_single_user_desc), Integer.valueOf(bBSFollowedMomentObj.getEvents().size())));
            viewGroup.setOnClickListener(new e(bBSFollowedMomentObj, i10));
            return;
        }
        linearLayout.removeAllViews();
        int i11 = 0;
        for (int i12 = 3; i11 < Math.min(i12, bBSFollowedMomentObj.getEvents().size()); i12 = 3) {
            ImageView imageView2 = new ImageView(this.f80426b);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iF, iF);
            layoutParams2.rightMargin = ViewUtils.f(this.f80426b, 6.0f);
            imageView2.setLayoutParams(layoutParams2);
            com.max.hbimage.b.I(bBSFollowedMomentObj.getEvents().get(i11).getUser().getAvartar(), imageView2, R.drawable.common_default_avatar_40x40);
            linearLayout.addView(imageView2);
            i11++;
        }
        textView.setVisibility(8);
        textView2.setText(String.format(com.max.xiaoheihe.utils.d.n0(R.string.moments_multi_user_desc), Integer.valueOf(bBSFollowedMomentObj.getEvents().size()), BBSFollowedMomentObj.CONTENT_TYPE_FOLLOW_GAME.equals(bBSFollowedMomentObj.getContent_type()) ? "关注" : "game_purchase".equals(bBSFollowedMomentObj.getContent_type()) ? "购买" : ""));
        viewGroup.setOnClickListener(new f(bBSFollowedMomentObj, i10));
    }

    @Override // com.max.hbcommon.base.adapter.u
    public /* bridge */ /* synthetic */ int m(int i10, FollowedMomentsWrapperObj followedMomentsWrapperObj) {
        Object[] objArr = {new Integer(i10), followedMomentsWrapperObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27272, new Class[]{cls, Object.class}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : s(i10, followedMomentsWrapperObj);
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
        if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 27273, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        t(eVar, (FollowedMomentsWrapperObj) obj);
    }

    public int s(int i10, FollowedMomentsWrapperObj followedMomentsWrapperObj) {
        byte b10 = 2;
        Object[] objArr = {new Integer(i10), followedMomentsWrapperObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27262, new Class[]{cls, FollowedMomentsWrapperObj.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (1 == followedMomentsWrapperObj.getItemType()) {
            return R.layout.item_recommend_user_hsv;
        }
        String content_type = followedMomentsWrapperObj.getMoments().getContent_type();
        if (content_type == null) {
            return R.layout.item_concept_moments_link;
        }
        switch (content_type.hashCode()) {
            case -895758574:
                b10 = !content_type.equals("game_comment") ? (byte) -1 : (byte) 0;
                break;
            case 347028142:
                b10 = !content_type.equals("game_purchase") ? (byte) -1 : (byte) 1;
                break;
            case 1596223424:
                if (!content_type.equals(BBSFollowedMomentObj.CONTENT_TYPE_FOLLOW_GAME)) {
                    b10 = -1;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return R.layout.item_moments_game_comment;
            case 1:
            case 2:
                return R.layout.item_moments_follow_game;
            default:
                return R.layout.item_concept_moments_link;
        }
    }

    public void t(com.max.hbcommon.base.adapter.s.e eVar, FollowedMomentsWrapperObj followedMomentsWrapperObj) {
        if (PatchProxy.proxy(new Object[]{eVar, followedMomentsWrapperObj}, this, changeQuickRedirect, false, 27263, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FollowedMomentsWrapperObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (eVar.i(R.id.vg_interactive_bar) != null) {
            if (followedMomentsWrapperObj.getMoments().getLink() != null) {
                eVar.i(R.id.vg_interactive_bar).setVisibility(0);
                eVar.i(R.id.vg_interactive_bar).getLayoutParams().height = -2;
                z(eVar, followedMomentsWrapperObj.getMoments(), getDataList().indexOf(followedMomentsWrapperObj));
            } else {
                eVar.i(R.id.vg_interactive_bar).getLayoutParams().height = ViewUtils.f(this.f80426b, 10.0f);
                eVar.i(R.id.vg_interactive_bar).setVisibility(4);
            }
        }
        if (eVar.i(R.id.ll_origin_post) != null) {
            ((ViewGroup) eVar.i(R.id.ll_origin_post)).removeAllViews();
        }
        if (followedMomentsWrapperObj.getMoments() != null && followedMomentsWrapperObj.getMoments().getLink() != null && followedMomentsWrapperObj.getMoments().getLink().getForward() != null) {
            eVar.i(R.id.ll_origin_post).setVisibility(0);
            w(this.f80426b, (ViewGroup) eVar.i(R.id.ll_origin_post), followedMomentsWrapperObj.getMoments().getLink().getForward());
        }
        if (eVar.d() == R.layout.item_recommend_user_hsv) {
            eVar.b().setTag(null);
            RecyclerView recyclerView = (RecyclerView) eVar.i(R.id.rv_recommend);
            if (recyclerView.getLayoutManager() == null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(this.f80426b, 0, false));
            }
            eVar.i(R.id.lsh).setOnClickListener(new h());
            if (recyclerView.getItemDecorationCount() <= 0) {
                recyclerView.addItemDecoration(new i(followedMomentsWrapperObj));
            }
            recyclerView.setAdapter(new com.max.xiaoheihe.module.bbs.adapter.r(this.f80426b, followedMomentsWrapperObj.getRecUsers().getItems(), new j()));
            return;
        }
        if (eVar.d() == R.layout.item_moments_follow_game) {
            BBSUserSectionView bBSUserSectionView = (BBSUserSectionView) eVar.i(R.id.vg_title);
            BBSLinkListBottomBar bBSLinkListBottomBar = (BBSLinkListBottomBar) eVar.i(R.id.vg_bottom_bar);
            GameCard gameCard = (GameCard) eVar.i(R.id.vg_single_game);
            RecyclerView recyclerView2 = (RecyclerView) eVar.i(R.id.rv_games);
            View viewB = eVar.b();
            viewB.setTag(followedMomentsWrapperObj.getMoments().getLink());
            y(followedMomentsWrapperObj.getMoments().getUser(), bBSUserSectionView);
            BBSUserSectionView.BBSUserSectionType bBSUserSectionType = BBSUserSectionView.BBSUserSectionType.Link;
            bBSUserSectionView.setType(bBSUserSectionType);
            bBSLinkListBottomBar.setType(bBSUserSectionType);
            x(followedMomentsWrapperObj.getMoments().getLink(), bBSLinkListBottomBar);
            if (followedMomentsWrapperObj.getMoments().getLink() != null && followedMomentsWrapperObj.getMoments().getLink().getBottom_rich_text() != null) {
                bBSLinkListBottomBar.f80807d.setRichStackData(followedMomentsWrapperObj.getMoments().getLink().getBottom_rich_text());
            }
            if (followedMomentsWrapperObj.getMoments().getGames() == null) {
                gameCard.setVisibility(8);
                recyclerView2.setVisibility(8);
                viewB.setClickable(false);
                return;
            }
            List<GameObj> games = followedMomentsWrapperObj.getMoments().getGames();
            if (games.size() > 1) {
                gameCard.setVisibility(8);
                recyclerView2.setVisibility(0);
                if (recyclerView2.getLayoutManager() == null) {
                    recyclerView2.setLayoutManager(new LinearLayoutManager(this.f80426b, 0, false));
                    recyclerView2.addItemDecoration(new k());
                }
                recyclerView2.setAdapter(new l(this.f80426b, games, R.layout.item_game_recommendations));
                viewB.setOnClickListener(new m(followedMomentsWrapperObj, eVar));
                return;
            }
            if (games.size() <= 0) {
                gameCard.setVisibility(8);
                recyclerView2.setVisibility(8);
                viewB.setClickable(false);
                return;
            } else {
                gameCard.setVisibility(0);
                recyclerView2.setVisibility(8);
                GameObj gameObj = games.get(0);
                A(gameCard, gameObj);
                viewB.setOnClickListener(new n(followedMomentsWrapperObj, eVar, gameObj));
                return;
            }
        }
        if (eVar.d() != R.layout.item_moments_game_comment) {
            BBSUserSectionView bBSUserSectionView2 = (BBSUserSectionView) eVar.i(R.id.vg_title);
            BBSLinkListBottomBar bBSLinkListBottomBar2 = (BBSLinkListBottomBar) eVar.i(R.id.vg_bottom_bar);
            BBSUserSectionView.BBSUserSectionType bBSUserSectionType2 = BBSUserSectionView.BBSUserSectionType.Link;
            bBSUserSectionView2.setType(bBSUserSectionType2);
            bBSLinkListBottomBar2.setType(bBSUserSectionType2);
            if (followedMomentsWrapperObj.getMoments().getLink() != null && followedMomentsWrapperObj.getMoments().getLink().getBottom_rich_text() != null) {
                bBSLinkListBottomBar2.f80807d.setRichStackData(followedMomentsWrapperObj.getMoments().getLink().getBottom_rich_text());
            }
            BBSLinkObj link = followedMomentsWrapperObj.getMoments().getLink();
            if (link != null) {
                x(link, bBSLinkListBottomBar2);
                link.setIndex(getDataList().indexOf(followedMomentsWrapperObj) + "");
                com.max.xiaoheihe.module.bbs.utils.b.M(eVar, link, com.max.xiaoheihe.module.bbs.utils.b.f83401f, 0, null, new p(followedMomentsWrapperObj));
                return;
            }
            return;
        }
        BBSUserSectionView bBSUserSectionView3 = (BBSUserSectionView) eVar.i(R.id.vg_title);
        BBSLinkListBottomBar bBSLinkListBottomBar3 = (BBSLinkListBottomBar) eVar.i(R.id.vg_bottom_bar);
        GameCard gameCard2 = (GameCard) eVar.i(R.id.vg_single_game);
        TextView textView = (TextView) eVar.i(R.id.tv_game_comments);
        View viewB2 = eVar.b();
        viewB2.setTag(followedMomentsWrapperObj.getMoments().getLink());
        y(followedMomentsWrapperObj.getMoments().getUser(), bBSUserSectionView3);
        bBSUserSectionView3.setType(BBSUserSectionView.BBSUserSectionType.Link);
        bBSLinkListBottomBar3.setType(BBSUserSectionView.BBSUserSectionType.GameComment);
        x(followedMomentsWrapperObj.getMoments().getLink(), bBSLinkListBottomBar3);
        if (followedMomentsWrapperObj.getMoments().getLink() != null && followedMomentsWrapperObj.getMoments().getLink().getBottom_rich_text() != null) {
            bBSLinkListBottomBar3.f80807d.setRichStackData(followedMomentsWrapperObj.getMoments().getLink().getBottom_rich_text());
        }
        if (followedMomentsWrapperObj.getMoments().getLink() == null || followedMomentsWrapperObj.getMoments().getGames() == null || followedMomentsWrapperObj.getMoments().getGames().size() <= 0) {
            return;
        }
        BBSLinkObj link2 = followedMomentsWrapperObj.getMoments().getLink();
        if (com.max.hbcommon.utils.c.u(link2.getScore())) {
            bBSLinkListBottomBar3.c(false);
        } else {
            bBSLinkListBottomBar3.c(true);
            bBSLinkListBottomBar3.setRating(com.max.hbutils.utils.n.q(link2.getScore()));
        }
        A(gameCard2, followedMomentsWrapperObj.getMoments().getGames().get(0));
        textView.setText(link2.getDescription());
        viewB2.setOnClickListener(new o(eVar, followedMomentsWrapperObj, link2));
    }
}
