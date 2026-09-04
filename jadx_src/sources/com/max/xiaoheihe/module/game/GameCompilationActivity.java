package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameListHeaderObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
@ig.d(path = {lb.d.O2})
public class GameCompilationActivity extends BaseActivity {
    private static final String P = "game_header";
    public static ChangeQuickRedirect changeQuickRedirect;
    private GameListHeaderObj L;
    private com.max.hbcommon.base.adapter.s<GameListHeaderObj> N;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;
    private int M = 0;
    private List<GameListHeaderObj> O = new ArrayList();

    public class a extends com.max.hbcommon.base.adapter.s<GameListHeaderObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.GameCompilationActivity$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0746a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GameListHeaderObj f84148b;

            ViewOnClickListenerC0746a(GameListHeaderObj gameListHeaderObj) {
                this.f84148b = gameListHeaderObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32570, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                ((BaseActivity) GameCompilationActivity.this).f66601b.startActivity(GameCompilationDetailActivity.r2(((BaseActivity) GameCompilationActivity.this).f66601b, this.f84148b));
            }
        }

        a(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, GameListHeaderObj gameListHeaderObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameListHeaderObj}, this, changeQuickRedirect, false, 32568, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameListHeaderObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
            ((RelativeLayout.LayoutParams) imageView.getLayoutParams()).height = (((ViewUtils.L(((BaseActivity) GameCompilationActivity.this).f66601b) - (ViewUtils.f(((BaseActivity) GameCompilationActivity.this).f66601b, 4.0f) * 3)) / 2) * 78) / 165;
            com.max.hbimage.b.L(gameListHeaderObj.getBg_img(), imageView, R.drawable.common_default_placeholder_375x210);
            eVar.p(R.id.tv_name, gameListHeaderObj.getTitle());
            eVar.p(R.id.tv_num, gameListHeaderObj.getCount() + " 款游戏");
            eVar.b().setOnClickListener(new ViewOnClickListenerC0746a(gameListHeaderObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameListHeaderObj gameListHeaderObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameListHeaderObj}, this, changeQuickRedirect, false, 32569, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, gameListHeaderObj);
        }
    }

    public class b extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 32571, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            recyclerView.getAdapter().getItemCount();
            int iF = ViewUtils.f(((BaseActivity) GameCompilationActivity.this).f66601b, 4.0f);
            if (childAdapterPosition % 2 == 0) {
                rect.set(iF, childAdapterPosition == 0 ? iF : 0, iF, iF);
            } else {
                rect.set(0, childAdapterPosition == 1 ? iF : 0, iF, iF);
            }
        }
    }

    public class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 32572, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameCompilationActivity.this.M = 0;
            GameCompilationActivity.W1(GameCompilationActivity.this);
        }
    }

    public class d implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 32573, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameCompilationActivity.V1(GameCompilationActivity.this, 30);
            GameCompilationActivity.W1(GameCompilationActivity.this);
        }
    }

    public class e extends com.max.hbcommon.network.d<Result<List<GameListHeaderObj>>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32575, new Class[0], Void.TYPE).isSupported && GameCompilationActivity.this.isActive()) {
                super.onComplete();
                GameCompilationActivity.this.mRefreshLayout.A(0);
                GameCompilationActivity.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 32574, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameCompilationActivity.this.isActive()) {
                super.onError(th2);
                GameCompilationActivity.X1(GameCompilationActivity.this);
                GameCompilationActivity.this.mRefreshLayout.A(0);
                GameCompilationActivity.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<List<GameListHeaderObj>> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 32576, new Class[]{Result.class}, Void.TYPE).isSupported && GameCompilationActivity.this.isActive()) {
                super.onNext(result);
                GameCompilationActivity.Y1(GameCompilationActivity.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 32577, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<List<GameListHeaderObj>>) obj);
        }
    }

    static /* synthetic */ int V1(GameCompilationActivity gameCompilationActivity, int i10) {
        int i11 = gameCompilationActivity.M + i10;
        gameCompilationActivity.M = i11;
        return i11;
    }

    static /* synthetic */ void W1(GameCompilationActivity gameCompilationActivity) {
        if (PatchProxy.proxy(new Object[]{gameCompilationActivity}, null, changeQuickRedirect, true, 32565, new Class[]{GameCompilationActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameCompilationActivity.Z1();
    }

    static /* synthetic */ void X1(GameCompilationActivity gameCompilationActivity) {
        if (PatchProxy.proxy(new Object[]{gameCompilationActivity}, null, changeQuickRedirect, true, 32566, new Class[]{GameCompilationActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameCompilationActivity.C1();
    }

    static /* synthetic */ void Y1(GameCompilationActivity gameCompilationActivity, List list) {
        if (PatchProxy.proxy(new Object[]{gameCompilationActivity, list}, null, changeQuickRedirect, true, 32567, new Class[]{GameCompilationActivity.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        gameCompilationActivity.c2(list);
    }

    private void Z1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32562, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().h4(this.M, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    public static Intent a2(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 32560, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : new Intent(context, (Class<?>) GameCompilationActivity.class);
    }

    public static Intent b2(Context context, GameListHeaderObj gameListHeaderObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, gameListHeaderObj}, null, changeQuickRedirect, true, 32559, new Class[]{Context.class, GameListHeaderObj.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) GameCompilationActivity.class);
        intent.putExtra(P, gameListHeaderObj);
        return intent;
    }

    private void c2(List<GameListHeaderObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 32563, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (list != null && list.size() > 0) {
            if (this.M == 0) {
                this.O.clear();
            }
            this.O.addAll(list);
            this.N.notifyDataSetChanged();
        }
        if (this.O.size() > 0) {
            x1();
        } else {
            y1();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32561, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        ButterKnife.a(this);
        GameListHeaderObj gameListHeaderObj = (GameListHeaderObj) getIntent().getSerializableExtra(P);
        this.L = gameListHeaderObj;
        this.f66616q.setTitle((gameListHeaderObj == null || gameListHeaderObj.getTitle() == null) ? getString(R.string.game_compilation) : this.L.getTitle());
        this.f66617r.setVisibility(0);
        this.N = new a(this.f66601b, this.O, R.layout.item_news_subject);
        this.mRecyclerView.setLayoutManager(new GridLayoutManager(this.f66601b, 2));
        this.mRecyclerView.addItemDecoration(new b());
        this.mRecyclerView.setAdapter(this.N);
        this.mRefreshLayout.S(new c());
        this.mRefreshLayout.f0(new d());
        E1();
        Z1();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32564, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        Z1();
    }
}
