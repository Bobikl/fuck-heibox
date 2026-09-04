package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameListObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.GameReleaseScheduleObj;
import com.max.xiaoheihe.bean.game.GameReleaseTimeObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class GameUnreleasedListFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f85244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<GameReleaseScheduleObj> f85245c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f f85246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private GameListObj f85247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g f85248f;

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
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 34572, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameUnreleasedListFragment.this.f85244b = 0;
            GameUnreleasedListFragment.N3(GameUnreleasedListFragment.this);
        }
    }

    public class b implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 34573, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameUnreleasedListFragment.M3(GameUnreleasedListFragment.this, 30);
            GameUnreleasedListFragment.N3(GameUnreleasedListFragment.this);
        }
    }

    public class c extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f85251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Paint f85252c = new Paint(5);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f85253d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85254e;

        c() {
            this.f85251b = ViewUtils.f(((com.max.hbcommon.base.d) GameUnreleasedListFragment.this).mContext, 12.0f);
            this.f85253d = ViewUtils.f(((com.max.hbcommon.base.d) GameUnreleasedListFragment.this).mContext, 1.0f);
            this.f85254e = ViewUtils.f(((com.max.hbcommon.base.d) GameUnreleasedListFragment.this).mContext, 2.5f);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@androidx.annotation.n0 Rect rect, @androidx.annotation.n0 View view, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 34574, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int size = GameUnreleasedListFragment.this.f85245c.size();
            if (childAdapterPosition < 0 || childAdapterPosition >= size) {
                return;
            }
            if (GameReleaseScheduleObj.ITEM_TYPE_SECTION == ((GameReleaseScheduleObj) GameUnreleasedListFragment.this.f85245c.get(childAdapterPosition)).getItemType()) {
                rect.set(0, 0, 0, 0);
                return;
            }
            GameReleaseScheduleObj gameReleaseScheduleObj = null;
            int i10 = childAdapterPosition - 1;
            if (i10 >= 0 && i10 < size) {
                gameReleaseScheduleObj = (GameReleaseScheduleObj) GameUnreleasedListFragment.this.f85245c.get(i10);
            }
            rect.set(ViewUtils.f(((com.max.hbcommon.base.d) GameUnreleasedListFragment.this).mContext, 26.0f), gameReleaseScheduleObj != null && GameReleaseScheduleObj.ITEM_TYPE_ITEM == gameReleaseScheduleObj.getItemType() ? this.f85251b : 0, this.f85251b, 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(@androidx.annotation.n0 Canvas canvas, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{canvas, recyclerView, state}, this, changeQuickRedirect, false, 34575, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = recyclerView.getChildAt(i10);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                GameReleaseScheduleObj gameReleaseScheduleObj = null;
                GameReleaseScheduleObj gameReleaseScheduleObj2 = (childAdapterPosition < 0 || childAdapterPosition >= GameUnreleasedListFragment.this.f85245c.size()) ? null : (GameReleaseScheduleObj) GameUnreleasedListFragment.this.f85245c.get(childAdapterPosition);
                if (gameReleaseScheduleObj2 != null && GameReleaseScheduleObj.ITEM_TYPE_ITEM == gameReleaseScheduleObj2.getItemType()) {
                    int i11 = childAdapterPosition - 1;
                    if (i11 >= 0 && i11 < GameUnreleasedListFragment.this.f85245c.size()) {
                        gameReleaseScheduleObj = (GameReleaseScheduleObj) GameUnreleasedListFragment.this.f85245c.get(i11);
                    }
                    boolean z10 = gameReleaseScheduleObj != null && GameReleaseScheduleObj.ITEM_TYPE_ITEM == gameReleaseScheduleObj.getItemType();
                    this.f85252c.setColor(GameUnreleasedListFragment.this.getResources().getColor(R.color.divider_color));
                    this.f85252c.setStyle(Paint.Style.FILL);
                    canvas.drawRect((childAt.getLeft() / 2.0f) - (this.f85253d / 2.0f), z10 ? childAt.getTop() - this.f85251b : childAt.getTop(), (this.f85253d / 2.0f) + (childAt.getLeft() / 2.0f), childAt.getBottom(), this.f85252c);
                    canvas.drawCircle(childAt.getLeft() / 2.0f, (childAt.getBottom() + childAt.getTop()) / 2.0f, this.f85254e, this.f85252c);
                }
            }
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<GameListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34577, new Class[0], Void.TYPE).isSupported && GameUnreleasedListFragment.this.isActive()) {
                GameUnreleasedListFragment.this.mRefreshLayout.A(0);
                GameUnreleasedListFragment.this.mRefreshLayout.p(0);
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34576, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameUnreleasedListFragment.this.isActive()) {
                super.onError(th2);
                GameUnreleasedListFragment.j4(GameUnreleasedListFragment.this);
                GameUnreleasedListFragment.this.mRefreshLayout.A(0);
                GameUnreleasedListFragment.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<GameListObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34578, new Class[]{Result.class}, Void.TYPE).isSupported && GameUnreleasedListFragment.this.isActive()) {
                super.onNext(result);
                GameUnreleasedListFragment.this.f85247e = result.getResult();
                if (GameUnreleasedListFragment.this.f85248f != null) {
                    GameUnreleasedListFragment.this.f85248f.c(GameUnreleasedListFragment.this.f85247e);
                }
                GameUnreleasedListFragment.O3(GameUnreleasedListFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34579, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameListObj>) obj);
        }
    }

    public class e extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameObj f85257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f85258c;

        e(GameObj gameObj, String str) {
            this.f85257b = gameObj;
            this.f85258c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34580, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameUnreleasedListFragment.this.isActive()) {
                super.onError(th2);
                if (GameUnreleasedListFragment.this.f85246d != null) {
                    GameUnreleasedListFragment.this.f85246d.notifyDataSetChanged();
                }
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34581, new Class[]{Result.class}, Void.TYPE).isSupported && GameUnreleasedListFragment.this.isActive()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(GameUnreleasedListFragment.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                this.f85257b.setFollow_state(this.f85258c);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34582, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class f extends com.max.hbcommon.base.adapter.u<GameReleaseScheduleObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GameObj f85261b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ LinearLayout f85262c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ TextView f85263d;

            a(GameObj gameObj, LinearLayout linearLayout, TextView textView) {
                this.f85261b = gameObj;
                this.f85262c = linearLayout;
                this.f85263d = textView;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34588, new Class[]{View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(((com.max.hbcommon.base.d) GameUnreleasedListFragment.this).mContext)) {
                    String str = "following".equalsIgnoreCase(this.f85261b.getFollow_state()) ? GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING : GameObj.SUBSCRIBE_STATE_SUBSCRIBING;
                    f.this.p(this.f85262c, this.f85263d, GameObj.SUBSCRIBE_STATE_SUBSCRIBING.equalsIgnoreCase(str));
                    GameUnreleasedListFragment.c4(GameUnreleasedListFragment.this, this.f85261b, str);
                }
            }
        }

        public class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GameObj f85265b;

            b(GameObj gameObj) {
                this.f85265b = gameObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34589, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                ((com.max.hbcommon.base.d) GameUnreleasedListFragment.this).mContext.startActivity(z.b(((com.max.hbcommon.base.d) GameUnreleasedListFragment.this).mContext, this.f85265b.getH_src(), this.f85265b.getAppid(), this.f85265b.getGame_type(), null, com.max.xiaoheihe.utils.i0.m(), com.max.xiaoheihe.utils.i0.j(), null));
            }
        }

        public f() {
            super(((com.max.hbcommon.base.d) GameUnreleasedListFragment.this).mContext, GameUnreleasedListFragment.this.f85245c);
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, GameReleaseScheduleObj gameReleaseScheduleObj) {
            Object[] objArr = {new Integer(i10), gameReleaseScheduleObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 34586, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, gameReleaseScheduleObj);
        }

        public int n(int i10, GameReleaseScheduleObj gameReleaseScheduleObj) {
            Object[] objArr = {new Integer(i10), gameReleaseScheduleObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 34583, new Class[]{cls, GameReleaseScheduleObj.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            return GameReleaseScheduleObj.ITEM_TYPE_SECTION == gameReleaseScheduleObj.getItemType() ? R.layout.item_game_release_date : R.layout.item_game_release_schedule;
        }

        public void o(com.max.hbcommon.base.adapter.s.e eVar, GameReleaseScheduleObj gameReleaseScheduleObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameReleaseScheduleObj}, this, changeQuickRedirect, false, 34584, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameReleaseScheduleObj.class}, Void.TYPE).isSupported) {
                return;
            }
            View viewB = eVar.b();
            if (eVar.d() == R.layout.item_game_release_date) {
                GameReleaseTimeObj time = gameReleaseScheduleObj.getTime();
                TextView textView = (TextView) eVar.i(R.id.tv_date);
                TextView textView2 = (TextView) eVar.i(R.id.tv_cnt);
                textView.setText(time.getRelease_date());
                textView2.setText(String.format(GameUnreleasedListFragment.this.getString(R.string.game_cnt_format), time.getGame_count()));
                viewB.setClickable(false);
                return;
            }
            GameObj game = gameReleaseScheduleObj.getGame();
            ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
            TextView textView3 = (TextView) eVar.i(R.id.tv_discount);
            TextView textView4 = (TextView) eVar.i(R.id.tv_name);
            TextView textView5 = (TextView) eVar.i(R.id.tv_game_date);
            LinearLayout linearLayout = (LinearLayout) eVar.i(R.id.ll_tags);
            LinearLayout linearLayout2 = (LinearLayout) eVar.i(R.id.ll_reserve);
            TextView textView6 = (TextView) eVar.i(R.id.tv_reserve);
            com.max.hbimage.b.L(game.getImage(), imageView, R.drawable.common_default_placeholder_375x210);
            r1.i1(textView3, game.getHeybox_price(), null);
            textView4.setText(game.getName());
            textView5.setText(game.getRelease_date());
            r1.A(eVar, game);
            List<String> tags = game.getTags();
            if (tags == null || tags.size() <= 0) {
                linearLayout.setVisibility(8);
            } else {
                linearLayout.setVisibility(0);
                linearLayout.removeAllViews();
                int i10 = 0;
                while (i10 < tags.size()) {
                    String str = tags.get(i10);
                    TextView textView7 = new TextView(((com.max.hbcommon.base.d) GameUnreleasedListFragment.this).mContext);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.leftMargin = i10 != 0 ? ViewUtils.f(((com.max.hbcommon.base.d) GameUnreleasedListFragment.this).mContext, 4.0f) : 0;
                    textView7.setLayoutParams(layoutParams);
                    textView7.setPadding(ViewUtils.f(((com.max.hbcommon.base.d) GameUnreleasedListFragment.this).mContext, 3.0f), ViewUtils.f(((com.max.hbcommon.base.d) GameUnreleasedListFragment.this).mContext, 1.0f), ViewUtils.f(((com.max.hbcommon.base.d) GameUnreleasedListFragment.this).mContext, 3.0f), ViewUtils.f(((com.max.hbcommon.base.d) GameUnreleasedListFragment.this).mContext, 1.0f));
                    textView7.setBackgroundDrawable(((com.max.hbcommon.base.d) GameUnreleasedListFragment.this).mContext.getResources().getDrawable(R.drawable.price_bg_1dp));
                    textView7.setTextSize(0, ((com.max.hbcommon.base.d) GameUnreleasedListFragment.this).mContext.getResources().getDimensionPixelSize(R.dimen.text_size_11));
                    textView7.setTextColor(((com.max.hbcommon.base.d) GameUnreleasedListFragment.this).mContext.getResources().getColor(R.color.text_primary_1_color));
                    textView7.setSingleLine(true);
                    textView7.setEllipsize(TextUtils.TruncateAt.END);
                    textView7.setText(str);
                    linearLayout.addView(textView7);
                    i10++;
                }
            }
            p(linearLayout2, textView6, GameObj.SUBSCRIBE_STATE_SUBSCRIBING.equalsIgnoreCase(game.getFollow_state()));
            textView6.setOnClickListener(new a(game, linearLayout2, textView6));
            viewB.setOnClickListener(new b(game));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 34587, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (GameReleaseScheduleObj) obj);
        }

        void p(View view, TextView textView, boolean z10) {
            if (PatchProxy.proxy(new Object[]{view, textView, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 34585, new Class[]{View.class, TextView.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            view.setBackgroundDrawable(z10 ? GameUnreleasedListFragment.this.getResources().getDrawable(R.drawable.btn_reference_2dp) : GameUnreleasedListFragment.this.getResources().getDrawable(R.drawable.btn_light_interactive_2dp));
            textView.setCompoundDrawablesWithIntrinsicBounds(z10 ? GameUnreleasedListFragment.this.getResources().getDrawable(R.drawable.ic_reserved_s) : GameUnreleasedListFragment.this.getResources().getDrawable(R.drawable.ic_reserve_s), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setTextColor(z10 ? GameUnreleasedListFragment.this.getResources().getColor(R.color.text_secondary_1_color) : GameUnreleasedListFragment.this.getResources().getColor(R.color.white));
            textView.setText(GameUnreleasedListFragment.this.getString(z10 ? R.string.reserved : R.string.reserve));
        }
    }

    public interface g {
        void c(GameListObj gameListObj);

        Map<String, String> getFilter();
    }

    static /* synthetic */ int M3(GameUnreleasedListFragment gameUnreleasedListFragment, int i10) {
        int i11 = gameUnreleasedListFragment.f85244b + i10;
        gameUnreleasedListFragment.f85244b = i11;
        return i11;
    }

    static /* synthetic */ void N3(GameUnreleasedListFragment gameUnreleasedListFragment) {
        if (PatchProxy.proxy(new Object[]{gameUnreleasedListFragment}, null, changeQuickRedirect, true, 34568, new Class[]{GameUnreleasedListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameUnreleasedListFragment.o4();
    }

    static /* synthetic */ void O3(GameUnreleasedListFragment gameUnreleasedListFragment) {
        if (PatchProxy.proxy(new Object[]{gameUnreleasedListFragment}, null, changeQuickRedirect, true, 34570, new Class[]{GameUnreleasedListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameUnreleasedListFragment.q4();
    }

    static /* synthetic */ void c4(GameUnreleasedListFragment gameUnreleasedListFragment, GameObj gameObj, String str) {
        if (PatchProxy.proxy(new Object[]{gameUnreleasedListFragment, gameObj, str}, null, changeQuickRedirect, true, 34571, new Class[]{GameUnreleasedListFragment.class, GameObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameUnreleasedListFragment.n4(gameObj, str);
    }

    static /* synthetic */ void j4(GameUnreleasedListFragment gameUnreleasedListFragment) {
        if (PatchProxy.proxy(new Object[]{gameUnreleasedListFragment}, null, changeQuickRedirect, true, 34569, new Class[]{GameUnreleasedListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameUnreleasedListFragment.showError();
    }

    private void n4(GameObj gameObj, String str) {
        if (PatchProxy.proxy(new Object[]{gameObj, str}, this, changeQuickRedirect, false, 34566, new Class[]{GameObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        io.reactivex.z<Result> zVarNb = null;
        if (GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING.equalsIgnoreCase(str)) {
            zVarNb = com.max.xiaoheihe.network.i.a().l8(gameObj.getAppid());
        } else if (GameObj.SUBSCRIBE_STATE_SUBSCRIBING.equalsIgnoreCase(str)) {
            zVarNb = com.max.xiaoheihe.network.i.a().nb(gameObj.getAppid(), null);
        }
        if (zVarNb != null) {
            addDisposable((io.reactivex.disposables.b) zVarNb.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e(gameObj, str)));
        }
    }

    private void o4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34565, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap(16);
        g gVar = this.f85248f;
        if (gVar != null && gVar.getFilter() != null) {
            for (Map.Entry<String, String> entry : this.f85248f.getFilter().entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().f2(map, this.f85244b, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    public static GameUnreleasedListFragment p4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 34559, new Class[0], GameUnreleasedListFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameUnreleasedListFragment) patchProxyResultProxy.result;
        }
        GameUnreleasedListFragment gameUnreleasedListFragment = new GameUnreleasedListFragment();
        gameUnreleasedListFragment.setArguments(new Bundle());
        return gameUnreleasedListFragment;
    }

    private void q4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34564, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (this.f85247e == null) {
            return;
        }
        if (this.f85244b == 0) {
            this.f85245c.clear();
        }
        GameReleaseScheduleObj gameReleaseScheduleObj = null;
        if (this.f85245c.size() > 0) {
            List<GameReleaseScheduleObj> list = this.f85245c;
            gameReleaseScheduleObj = list.get(list.size() - 1);
        }
        List<GameObj> games = this.f85247e.getGames();
        if (games != null) {
            for (GameObj gameObj : games) {
                if ((gameReleaseScheduleObj == null || (GameReleaseScheduleObj.ITEM_TYPE_ITEM == gameReleaseScheduleObj.getItemType() && !com.max.hbutils.utils.w.L(com.max.hbutils.utils.w.U(gameObj.getRelease_time()), com.max.hbutils.utils.w.U(gameReleaseScheduleObj.getGame().getRelease_time())))) && this.f85247e.getTime_list() != null && this.f85247e.getTime_list().size() > 0) {
                    for (GameReleaseTimeObj gameReleaseTimeObj : this.f85247e.getTime_list()) {
                        if (com.max.hbutils.utils.w.L(com.max.hbutils.utils.w.U(gameReleaseTimeObj.getRelease_time()), com.max.hbutils.utils.w.U(gameObj.getRelease_time()))) {
                            GameReleaseScheduleObj gameReleaseScheduleObj2 = new GameReleaseScheduleObj();
                            gameReleaseScheduleObj2.setItemType(GameReleaseScheduleObj.ITEM_TYPE_SECTION);
                            gameReleaseScheduleObj2.setTime(gameReleaseTimeObj);
                            this.f85245c.add(gameReleaseScheduleObj2);
                            break;
                        }
                    }
                }
                gameReleaseScheduleObj = new GameReleaseScheduleObj();
                gameReleaseScheduleObj.setItemType(GameReleaseScheduleObj.ITEM_TYPE_ITEM);
                gameReleaseScheduleObj.setGame(gameObj);
                this.f85245c.add(gameReleaseScheduleObj);
            }
        }
        this.f85246d.notifyDataSetChanged();
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34563, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        o4();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34562, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        this.mUnBinder = ButterKnife.f(this, view);
        this.mRefreshLayout.S(new a());
        this.mRefreshLayout.f0(new b());
        this.mRefreshLayout.setBackgroundDrawable(getResources().getDrawable(R.color.white));
        this.mRecyclerView.setClipToPadding(false);
        this.mRecyclerView.setClipChildren(false);
        this.mRecyclerView.setPadding(0, 0, 0, ViewUtils.f(this.mContext, 12.0f));
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.mRecyclerView.addItemDecoration(new c());
        f fVar = new f();
        this.f85246d = fVar;
        this.mRecyclerView.setAdapter(fVar);
        if (this.mIsFirst) {
            showLoading();
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 34560, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttach(context);
        if (getParentFragment() instanceof g) {
            this.f85248f = (g) getParentFragment();
            return;
        }
        if (context instanceof g) {
            this.f85248f = (g) context;
            return;
        }
        throw new RuntimeException(getParentFragment() + " or " + context + " must implement GameListListener");
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34561, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetach();
        this.f85248f = null;
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34567, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        o4();
    }
}
