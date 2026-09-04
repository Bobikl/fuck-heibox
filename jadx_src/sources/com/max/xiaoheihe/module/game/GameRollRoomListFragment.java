package com.max.xiaoheihe.module.game;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.bean.FiltersObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxTabLayout;
import com.max.hbcustomview.SwitchButton.SwitchButton;
import com.max.hbminiprogram.NativeLittleProgramFragment;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameListObj;
import com.max.xiaoheihe.bean.game.GameRollRoomObj;
import com.max.xiaoheihe.bean.game.RollGameListObj;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
@com.max.hbcommon.analytics.m(path = lb.d.G2)
@n9.a({com.max.hbminiprogram.d.class})
public class GameRollRoomListFragment extends NativeLittleProgramFragment implements com.max.hbminiprogram.d {
    private static final String F = "page_type";
    private static final String G = "relate_type";
    public static final String H = "joined_room_id";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String A;
    private int B;
    private RefreshBroadcastReceiver C;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    @BindView(R.id.sticky_layout_header)
    RelativeLayout mStickyLayoutHeaderView;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ViewGroup f84735p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ViewGroup f84736q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private HeyBoxTabLayout f84737r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private SwitchButton f84738s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private EditText f84739t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f84740u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List<FiltersObj> f84741v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.t f84743x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f84744y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f84745z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List<GameRollRoomObj> f84742w = new ArrayList();
    private boolean D = false;
    private boolean E = true;

    public class RefreshBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private RefreshBroadcastReceiver() {
        }

        /* synthetic */ RefreshBroadcastReceiver(GameRollRoomListFragment gameRollRoomListFragment, e eVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int i10 = 0;
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 33678, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported && lb.a.f131067x.equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra(GameRollRoomListFragment.H);
                if (com.max.hbcommon.utils.c.u(stringExtra)) {
                    GameRollRoomListFragment.this.f84744y = 0;
                    GameRollRoomListFragment.Q4(GameRollRoomListFragment.this);
                    return;
                }
                if (!GameRollRoomListFragment.this.isActive() || GameRollRoomListFragment.this.f84743x == null) {
                    return;
                }
                while (true) {
                    if (i10 >= GameRollRoomListFragment.this.f84742w.size()) {
                        i10 = -1;
                        break;
                    }
                    GameRollRoomObj gameRollRoomObj = (GameRollRoomObj) GameRollRoomListFragment.this.f84742w.get(i10);
                    if (stringExtra.equals(gameRollRoomObj.getRoom_id())) {
                        gameRollRoomObj.setJoined("1");
                        break;
                    }
                    i10++;
                }
                if (i10 != -1) {
                    GameRollRoomListFragment.this.f84743x.notifyItemChanged(GameRollRoomListFragment.this.f84743x.u() + i10);
                }
            }
        }
    }

    public class a implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 33663, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!"search".equals(GameRollRoomListFragment.this.f84745z)) {
                GameRollRoomListFragment.this.f84744y = 0;
                GameRollRoomListFragment.Q4(GameRollRoomListFragment.this);
            } else if (com.max.hbcommon.utils.c.u(GameRollRoomListFragment.e5(GameRollRoomListFragment.this))) {
                GameRollRoomListFragment.this.mRefreshLayout.A(0);
                GameRollRoomListFragment.this.mRefreshLayout.p(0);
            } else {
                GameRollRoomListFragment.this.f84744y = 0;
                GameRollRoomListFragment.Q4(GameRollRoomListFragment.this);
            }
        }
    }

    public class b implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 33664, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameRollRoomListFragment.P4(GameRollRoomListFragment.this, 30);
            GameRollRoomListFragment.Q4(GameRollRoomListFragment.this);
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<RollGameListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33666, new Class[0], Void.TYPE).isSupported && GameRollRoomListFragment.this.isActive()) {
                GameRollRoomListFragment.this.mRefreshLayout.A(0);
                GameRollRoomListFragment.this.mRefreshLayout.p(0);
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 33665, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameRollRoomListFragment.this.isActive()) {
                super.onError(th2);
                if (!"search".equals(GameRollRoomListFragment.this.f84745z)) {
                    GameRollRoomListFragment.R4(GameRollRoomListFragment.this);
                }
                GameRollRoomListFragment.this.mRefreshLayout.A(0);
                GameRollRoomListFragment.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<RollGameListObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33667, new Class[]{Result.class}, Void.TYPE).isSupported && GameRollRoomListFragment.this.isActive()) {
                super.onNext(result);
                GameRollRoomListFragment.S4(GameRollRoomListFragment.this, result.getResult());
                GameRollRoomListFragment.this.E = false;
                com.max.hbcache.c.C("roll_list_refresh_time", System.currentTimeMillis() + "");
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33668, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<RollGameListObj>) obj);
        }
    }

    public class d implements HeyBoxTabLayout.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.component.HeyBoxTabLayout.c
        public void a(HeyBoxTabLayout.i iVar) {
        }

        @Override // com.max.hbcommon.component.HeyBoxTabLayout.c
        public void b(HeyBoxTabLayout.i iVar) {
        }

        @Override // com.max.hbcommon.component.HeyBoxTabLayout.c
        public void c(HeyBoxTabLayout.i iVar) {
            if (PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, 33669, new Class[]{HeyBoxTabLayout.i.class}, Void.TYPE).isSupported) {
                return;
            }
            GameRollRoomListFragment.this.f84740u = (String) iVar.i();
            GameRollRoomListFragment.this.f84744y = 0;
            GameRollRoomListFragment.Q4(GameRollRoomListFragment.this);
        }
    }

    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33662, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.littleprogram.b.p(((com.max.hbcommon.base.d) GameRollRoomListFragment.this).mContext, com.max.xiaoheihe.module.littleprogram.b.f88740a.h(), null);
        }
    }

    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33670, new Class[]{View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(((com.max.hbcommon.base.d) GameRollRoomListFragment.this).mContext)) {
                com.max.xiaoheihe.module.littleprogram.b.p(((com.max.hbcommon.base.d) GameRollRoomListFragment.this).mContext, com.max.xiaoheihe.module.littleprogram.b.f88740a.g(), null);
            }
        }
    }

    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33671, new Class[]{View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(((com.max.hbcommon.base.d) GameRollRoomListFragment.this).mContext)) {
                com.max.xiaoheihe.module.littleprogram.b.p(((com.max.hbcommon.base.d) GameRollRoomListFragment.this).mContext, com.max.xiaoheihe.module.littleprogram.b.f88740a.e(), null);
            }
        }
    }

    public class h implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 33672, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            GameRollRoomListFragment.this.D = z10;
            GameRollRoomListFragment.this.mRecyclerView.scrollToPosition(0);
            GameRollRoomListFragment.this.mRefreshLayout.F();
        }
    }

    public class i extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 33673, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            if (GameRollRoomListFragment.this.f84735p.getTop() < 0 && GameRollRoomListFragment.this.f84735p.getChildCount() > 1) {
                ViewGroup.LayoutParams layoutParams = GameRollRoomListFragment.this.f84735p.getLayoutParams();
                layoutParams.height = ViewUtils.V(GameRollRoomListFragment.this.f84735p);
                GameRollRoomListFragment.this.f84735p.setLayoutParams(layoutParams);
                GameRollRoomListFragment.this.f84735p.removeView(GameRollRoomListFragment.this.f84736q);
                GameRollRoomListFragment gameRollRoomListFragment = GameRollRoomListFragment.this;
                gameRollRoomListFragment.mStickyLayoutHeaderView.addView(gameRollRoomListFragment.f84736q);
                return;
            }
            if (GameRollRoomListFragment.this.f84735p.getTop() < 0 || GameRollRoomListFragment.this.mStickyLayoutHeaderView.getChildCount() <= 0) {
                return;
            }
            GameRollRoomListFragment gameRollRoomListFragment2 = GameRollRoomListFragment.this;
            gameRollRoomListFragment2.mStickyLayoutHeaderView.removeView(gameRollRoomListFragment2.f84736q);
            ViewGroup.LayoutParams layoutParams2 = GameRollRoomListFragment.this.f84735p.getLayoutParams();
            layoutParams2.height = -2;
            GameRollRoomListFragment.this.f84735p.setLayoutParams(layoutParams2);
            GameRollRoomListFragment.this.f84735p.addView(GameRollRoomListFragment.this.f84736q);
        }
    }

    public class j extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@androidx.annotation.n0 Rect rect, @androidx.annotation.n0 View view, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 33674, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                rect.set(0, 0, 0, 0);
            } else if (childAdapterPosition == 1) {
                rect.set(GameRollRoomListFragment.this.B, 0, GameRollRoomListFragment.this.B, 0);
            } else {
                rect.set(GameRollRoomListFragment.this.B, 0, GameRollRoomListFragment.this.B, GameRollRoomListFragment.this.B);
            }
        }
    }

    public class k implements TextView.OnEditorActionListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{textView, new Integer(i10), keyEvent}, this, changeQuickRedirect, false, 33675, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (i10 == 3) {
                String strE5 = GameRollRoomListFragment.e5(GameRollRoomListFragment.this);
                GameRollRoomListFragment gameRollRoomListFragment = GameRollRoomListFragment.this;
                GameRollRoomListFragment.M4(gameRollRoomListFragment, gameRollRoomListFragment.f84739t);
                if (!com.max.hbcommon.utils.c.u(strE5)) {
                    GameRollRoomListFragment.this.mRecyclerView.scrollToPosition(0);
                    GameRollRoomListFragment.this.mRefreshLayout.F();
                    return true;
                }
            }
            return false;
        }
    }

    public class l extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@androidx.annotation.n0 Rect rect, @androidx.annotation.n0 View view, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 33676, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.set(GameRollRoomListFragment.this.B, GameRollRoomListFragment.this.B, GameRollRoomListFragment.this.B, GameRollRoomListFragment.this.B);
            } else {
                rect.set(GameRollRoomListFragment.this.B, 0, GameRollRoomListFragment.this.B, GameRollRoomListFragment.this.B);
            }
        }
    }

    public class m extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@androidx.annotation.n0 Rect rect, @androidx.annotation.n0 View view, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 33677, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.set(GameRollRoomListFragment.this.B, GameRollRoomListFragment.this.B, GameRollRoomListFragment.this.B, GameRollRoomListFragment.this.B);
            } else {
                rect.set(GameRollRoomListFragment.this.B, 0, GameRollRoomListFragment.this.B, GameRollRoomListFragment.this.B);
            }
        }
    }

    static /* synthetic */ void M4(GameRollRoomListFragment gameRollRoomListFragment, View view) {
        if (PatchProxy.proxy(new Object[]{gameRollRoomListFragment, view}, null, changeQuickRedirect, true, 33658, new Class[]{GameRollRoomListFragment.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        gameRollRoomListFragment.h5(view);
    }

    static /* synthetic */ int P4(GameRollRoomListFragment gameRollRoomListFragment, int i10) {
        int i11 = gameRollRoomListFragment.f84744y + i10;
        gameRollRoomListFragment.f84744y = i11;
        return i11;
    }

    static /* synthetic */ void Q4(GameRollRoomListFragment gameRollRoomListFragment) {
        if (PatchProxy.proxy(new Object[]{gameRollRoomListFragment}, null, changeQuickRedirect, true, 33659, new Class[]{GameRollRoomListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameRollRoomListFragment.g5();
    }

    static /* synthetic */ void R4(GameRollRoomListFragment gameRollRoomListFragment) {
        if (PatchProxy.proxy(new Object[]{gameRollRoomListFragment}, null, changeQuickRedirect, true, 33660, new Class[]{GameRollRoomListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameRollRoomListFragment.showError();
    }

    static /* synthetic */ void S4(GameRollRoomListFragment gameRollRoomListFragment, RollGameListObj rollGameListObj) {
        if (PatchProxy.proxy(new Object[]{gameRollRoomListFragment, rollGameListObj}, null, changeQuickRedirect, true, 33661, new Class[]{GameRollRoomListFragment.class, RollGameListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameRollRoomListFragment.k5(rollGameListObj);
    }

    static /* synthetic */ String e5(GameRollRoomListFragment gameRollRoomListFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameRollRoomListFragment}, null, changeQuickRedirect, true, 33657, new Class[]{GameRollRoomListFragment.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : gameRollRoomListFragment.r();
    }

    private void g5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33647, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap(16);
        if (!com.max.hbcommon.utils.c.u(this.f84740u)) {
            map.put("sort_types", this.f84740u);
        }
        if (!com.max.hbcommon.utils.c.u(this.f84745z)) {
            map.put("page_type", this.f84745z);
        }
        if (!com.max.hbcommon.utils.c.u(this.A)) {
            map.put(G, this.A);
        }
        String strR = r();
        if (!com.max.hbcommon.utils.c.u(strR)) {
            map.put("room_id", strR);
        }
        if (this.D) {
            map.put("filter_passwd", "2");
        } else {
            map.put("filter_passwd", "1");
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().l3(map, this.f84744y, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private void h5(View view) {
        InputMethodManager inputMethodManager;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33652, new Class[]{View.class}, Void.TYPE).isSupported || (inputMethodManager = (InputMethodManager) this.mContext.getSystemService("input_method")) == null || view == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i5(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33656, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent(this.mContext, (Class<?>) WebActionActivity.class);
        intent.putExtra("pageurl", lb.a.M2);
        intent.putExtra("title", com.max.xiaoheihe.utils.d.n0(R.string.rules));
        startActivity(intent);
    }

    public static GameRollRoomListFragment j5(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 33642, new Class[]{String.class, String.class}, GameRollRoomListFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameRollRoomListFragment) patchProxyResultProxy.result;
        }
        GameRollRoomListFragment gameRollRoomListFragment = new GameRollRoomListFragment();
        Bundle bundle = new Bundle();
        bundle.putString("page_type", str);
        bundle.putString(G, str2);
        gameRollRoomListFragment.setArguments(bundle);
        return gameRollRoomListFragment;
    }

    private void k5(RollGameListObj rollGameListObj) {
        if (PatchProxy.proxy(new Object[]{rollGameListObj}, this, changeQuickRedirect, false, 33648, new Class[]{RollGameListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (rollGameListObj == null) {
            showContentView();
            return;
        }
        if (this.f84744y == 0) {
            if (GameListObj.ROLL_PAGE_TYPE_HOME.equals(this.f84745z)) {
                m5(rollGameListObj.getSort_types(), rollGameListObj.getFilters());
            }
            this.f84742w.clear();
        }
        if (rollGameListObj.getRooms() != null) {
            this.f84742w.addAll(rollGameListObj.getRooms());
        }
        this.f84743x.notifyDataSetChanged();
        if (!"me".equals(this.f84745z)) {
            showContentView();
        } else if (this.f84742w.isEmpty()) {
            showEmpty(R.drawable.common_tag_common_45x45, R.string.not_available);
        } else {
            showContentView();
        }
    }

    private void l5(View view) {
        InputMethodManager inputMethodManager;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33651, new Class[]{View.class}, Void.TYPE).isSupported || !view.requestFocus() || (inputMethodManager = (InputMethodManager) this.mContext.getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.showSoftInput(view, 1);
    }

    private void m5(List<KeyDescObj> list, List<FiltersObj> list2) {
        if (!PatchProxy.proxy(new Object[]{list, list2}, this, changeQuickRedirect, false, 33649, new Class[]{List.class, List.class}, Void.TYPE).isSupported && this.f84741v == null) {
            if (list != null && list.size() > 0) {
                this.f84737r.H();
                this.f84737r.d(new d());
                for (KeyDescObj keyDescObj : list) {
                    HeyBoxTabLayout.i iVarV = this.f84737r.E().x(keyDescObj.getDesc()).v(keyDescObj.getKey());
                    String str = this.f84740u;
                    if (str != null && str.equals(keyDescObj.getKey())) {
                        iVarV.m();
                    }
                    this.f84737r.e(iVarV);
                }
            }
            if (list2 == null || list2.size() <= 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            this.f84741v = arrayList;
            arrayList.addAll(list2);
        }
    }

    private String r() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33650, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        EditText editText = this.f84739t;
        return editText != null ? editText.getText().toString() : "";
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.d
    @androidx.annotation.n0
    public Fragment a2(@androidx.annotation.p0 Map<String, ?> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 33655, new Class[]{Map.class}, Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : j5(GameListObj.ROLL_PAGE_TYPE_HOME, null);
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 33643, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        setContentView(R.layout.layout_sample_refresh_rv_with_sticky_header);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            this.f84745z = getArguments().getString("page_type");
            this.A = getArguments().getString(G);
        }
        if (GameListObj.ROLL_PAGE_TYPE_HOME.equals(this.f84745z)) {
            this.mTitleBar.setTitle("ROLL房间");
            this.mTitleBar.setLeftActionIcon(R.drawable.common_question);
            this.mTitleBar.setLeftActionIconOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.j0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f87765b.i5(view2);
                }
            });
        }
        this.B = ViewUtils.f(this.mContext, 4.0f);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.f84743x = new com.max.hbcommon.base.adapter.t(new com.max.xiaoheihe.module.game.adapter.x(this.mContext, getCompositeDisposable(), this.f84742w, this.f84745z));
        if (GameListObj.ROLL_PAGE_TYPE_HOME.equals(this.f84745z)) {
            View viewInflate = this.mInflater.inflate(R.layout.item_game_roll_room_list_header, (ViewGroup) this.mRecyclerView, false);
            EditText editText = (EditText) viewInflate.findViewById(R.id.et_search_roll_room);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_my_roll_room);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_create_roll_room);
            editText.setFocusable(false);
            editText.setOnClickListener(new e());
            textView.setOnClickListener(new f());
            textView2.setOnClickListener(new g());
            this.f84743x.p(R.layout.item_game_roll_room_list_header, viewInflate);
            RelativeLayout relativeLayout = (RelativeLayout) this.mInflater.inflate(R.layout.layout_roll_room_tab_header, (ViewGroup) this.mRecyclerView, false);
            this.f84735p = relativeLayout;
            ViewGroup viewGroup = (ViewGroup) relativeLayout.findViewById(R.id.rv_filter);
            this.f84736q = viewGroup;
            this.f84737r = (HeyBoxTabLayout) viewGroup.findViewById(R.id.tl_sort_type);
            SwitchButton switchButton = (SwitchButton) this.f84736q.findViewById(R.id.sb_privacy);
            this.f84738s = switchButton;
            switchButton.setChecked(this.D, false);
            this.f84738s.setOnCheckedChangeListener(new h());
            this.f84743x.p(R.layout.layout_roll_room_tab_header, this.f84735p);
            this.mRecyclerView.clearOnScrollListeners();
            this.mRecyclerView.addOnScrollListener(new i());
            RelativeLayout relativeLayout2 = this.mStickyLayoutHeaderView;
            int i10 = this.B;
            relativeLayout2.setPadding(i10, 0, i10, 0);
            this.mRecyclerView.addItemDecoration(new j());
        } else if ("search".equals(this.f84745z)) {
            View viewInflate2 = this.mInflater.inflate(R.layout.item_game_roll_room_list_header, (ViewGroup) this.mRecyclerView, false);
            View viewFindViewById = viewInflate2.findViewById(R.id.vg_search_roll_room);
            this.f84739t = (EditText) viewInflate2.findViewById(R.id.et_search_roll_room);
            TextView textView3 = (TextView) viewInflate2.findViewById(R.id.tv_my_roll_room);
            TextView textView4 = (TextView) viewInflate2.findViewById(R.id.tv_create_roll_room);
            viewFindViewById.setPadding(ViewUtils.f(this.mContext, 10.0f), viewFindViewById.getPaddingTop(), ViewUtils.f(this.mContext, 10.0f), viewFindViewById.getPaddingBottom());
            this.f84739t.setFocusable(true);
            this.f84739t.setFocusableInTouchMode(true);
            this.f84739t.setImeOptions(3);
            this.f84739t.setOnEditorActionListener(new k());
            l5(this.f84739t);
            textView3.setVisibility(8);
            textView4.setVisibility(8);
            this.f84743x.p(R.layout.item_game_roll_room_list_header, viewInflate2);
            this.mRecyclerView.addItemDecoration(new l());
        } else if ("me".equals(this.f84745z)) {
            this.mRecyclerView.addItemDecoration(new m());
        }
        this.mRecyclerView.setAdapter(this.f84743x);
        this.mRefreshLayout.S(new a());
        if ("search".equals(this.f84745z)) {
            this.mRefreshLayout.b0(false);
        }
        this.mRefreshLayout.f0(new b());
        if (!this.mIsFirst || "search".equals(this.f84745z)) {
            return;
        }
        showLoading();
    }

    public void f5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33654, new Class[0], Void.TYPE).isSupported || !isActive() || this.E) {
            return;
        }
        this.mRecyclerView.scrollToPosition(0);
        this.mRefreshLayout.F();
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33646, new Class[0], Void.TYPE).isSupported || "search".equals(this.f84745z)) {
            return;
        }
        showLoading();
        g5();
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33653, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRefresh();
        if ("search".equals(this.f84745z)) {
            return;
        }
        showLoading();
        g5();
    }

    @Override // com.max.hbcommon.base.d
    public void onRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33644, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRegisterReceiver();
        RefreshBroadcastReceiver refreshBroadcastReceiver = new RefreshBroadcastReceiver(this, null);
        this.C = refreshBroadcastReceiver;
        registerReceiver(refreshBroadcastReceiver, lb.a.f131067x);
    }

    @Override // com.max.hbcommon.base.d
    public void onUnRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33645, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onUnRegisterReceiver();
        unregisterReceiver(this.C);
    }
}
