package com.max.xiaoheihe.module.game.pubg;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.t;
import com.max.hbcommon.bean.FiltersObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.PlayerRankObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGRankResultObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import ng.j;

/* JADX INFO: loaded from: classes11.dex */
public class PUBGFriendRankFragment extends com.max.hbcommon.base.d implements View.OnClickListener, com.max.xiaoheihe.module.game.adapter.e.b {
    public static ChangeQuickRedirect changeQuickRedirect;
    private PopupWindow A;
    private RecyclerView B;
    private com.max.xiaoheihe.module.game.adapter.f C;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f88077b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f88079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f88080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f88081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f88082g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private i f88085j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private t f88088m;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private s<PlayerRankObj> f88089n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private LinearLayout f88090o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private LinearLayout f88091p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private LinearLayout f88092q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f88093r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private TextView f88094s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TextView f88095t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ImageView f88096u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ImageView f88097v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ImageView f88098w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private TextView f88099x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private TextView f88100y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private FiltersObj f88101z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f88078c = "all";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f88083h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private HashSet<Integer> f88084i = new HashSet<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    List<PlayerRankObj> f88086k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<FiltersObj> f88087l = new ArrayList();

    public class a extends s<PlayerRankObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(s.e eVar, PlayerRankObj playerRankObj) {
            if (PatchProxy.proxy(new Object[]{eVar, playerRankObj}, this, changeQuickRedirect, false, 38272, new Class[]{s.e.class, PlayerRankObj.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.game.pubg.utils.b.k(eVar, playerRankObj, eVar.getAdapterPosition() == 1, eVar.getAdapterPosition() == getItemCount(), !PUBGFriendRankFragment.this.f88084i.contains(Integer.valueOf(eVar.getAdapterPosition())), true, null, true);
            if (PUBGFriendRankFragment.this.f88084i.contains(Integer.valueOf(eVar.getAdapterPosition()))) {
                return;
            }
            PUBGFriendRankFragment.this.f88084i.add(Integer.valueOf(eVar.getAdapterPosition()));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, PlayerRankObj playerRankObj) {
            if (PatchProxy.proxy(new Object[]{eVar, playerRankObj}, this, changeQuickRedirect, false, 38273, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, playerRankObj);
        }
    }

    public class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public void k(j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 38274, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            PUBGFriendRankFragment.this.f88083h = 0;
            PUBGFriendRankFragment.this.f88084i.clear();
            PUBGFriendRankFragment.P3(PUBGFriendRankFragment.this);
        }
    }

    public class c implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.b
        public void f(j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 38275, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            PUBGFriendRankFragment.O3(PUBGFriendRankFragment.this, 30);
            PUBGFriendRankFragment.P3(PUBGFriendRankFragment.this);
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<PUBGRankResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38277, new Class[0], Void.TYPE).isSupported && PUBGFriendRankFragment.this.isActive()) {
                PUBGFriendRankFragment.this.mRefreshLayout.A(0);
                PUBGFriendRankFragment.this.mRefreshLayout.p(0);
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 38276, new Class[]{Throwable.class}, Void.TYPE).isSupported && PUBGFriendRankFragment.this.isActive()) {
                PUBGFriendRankFragment.this.mRefreshLayout.A(0);
                PUBGFriendRankFragment.this.mRefreshLayout.p(0);
                PUBGFriendRankFragment.Q3(PUBGFriendRankFragment.this);
            }
        }

        public void onNext(Result<PUBGRankResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38278, new Class[]{Result.class}, Void.TYPE).isSupported && PUBGFriendRankFragment.this.isActive()) {
                PUBGFriendRankFragment.R3(PUBGFriendRankFragment.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38279, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PUBGRankResultObj>) obj);
        }
    }

    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88106b;

        e(Context context) {
            this.f88106b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38280, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PUBGFriendRankFragment pUBGFriendRankFragment = PUBGFriendRankFragment.this;
            pUBGFriendRankFragment.Y3(this.f88106b, pUBGFriendRankFragment.A, PUBGFriendRankFragment.this.B);
        }
    }

    public class f implements PopupWindow.OnDismissListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f88108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f88109c;

        f(View view, Context context) {
            this.f88108b = view;
            this.f88109c = context;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            View view;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38281, new Class[0], Void.TYPE).isSupported || (view = this.f88108b) == null || !(view instanceof ViewGroup)) {
                return;
            }
            ((TextView) ((ViewGroup) view).getChildAt(0)).setTextColor(this.f88109c.getResources().getColor(R.color.white_alpha80));
            ((ImageView) ((ViewGroup) this.f88108b).getChildAt(1)).setImageResource(R.drawable.common_arrow_down_filled_24x24);
        }
    }

    public class g implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 38282, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            PUBGFriendRankFragment.this.B.setVisibility(0);
        }
    }

    public class h implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView f88112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PopupWindow f88113b;

        h(RecyclerView recyclerView, PopupWindow popupWindow) {
            this.f88112a = recyclerView;
            this.f88113b = popupWindow;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 38283, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f88112a.setVisibility(8);
            this.f88113b.dismiss();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public interface i {
        void b1(List<KeyDescObj> list);
    }

    static /* synthetic */ int O3(PUBGFriendRankFragment pUBGFriendRankFragment, int i10) {
        int i11 = pUBGFriendRankFragment.f88083h + i10;
        pUBGFriendRankFragment.f88083h = i11;
        return i11;
    }

    static /* synthetic */ void P3(PUBGFriendRankFragment pUBGFriendRankFragment) {
        if (PatchProxy.proxy(new Object[]{pUBGFriendRankFragment}, null, changeQuickRedirect, true, 38269, new Class[]{PUBGFriendRankFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGFriendRankFragment.V3();
    }

    static /* synthetic */ void Q3(PUBGFriendRankFragment pUBGFriendRankFragment) {
        if (PatchProxy.proxy(new Object[]{pUBGFriendRankFragment}, null, changeQuickRedirect, true, 38270, new Class[]{PUBGFriendRankFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGFriendRankFragment.showError();
    }

    static /* synthetic */ void R3(PUBGFriendRankFragment pUBGFriendRankFragment, PUBGRankResultObj pUBGRankResultObj) {
        if (PatchProxy.proxy(new Object[]{pUBGFriendRankFragment, pUBGRankResultObj}, null, changeQuickRedirect, true, 38271, new Class[]{PUBGFriendRankFragment.class, PUBGRankResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGFriendRankFragment.e4(pUBGRankResultObj);
    }

    private KeyDescObj U3(FiltersObj filtersObj) {
        List<KeyDescObj> values;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{filtersObj}, this, changeQuickRedirect, false, 38265, new Class[]{FiltersObj.class}, KeyDescObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (KeyDescObj) patchProxyResultProxy.result;
        }
        if (filtersObj == null || (values = filtersObj.getValues()) == null) {
            return null;
        }
        for (KeyDescObj keyDescObj : values) {
            if (keyDescObj.isChecked()) {
                return keyDescObj;
            }
        }
        return null;
    }

    private void V3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38258, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().r4(this.f88083h, 30, this.f88079d, this.f88081f, this.f88078c, this.f88077b, this.f88082g, this.f88080e).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    private FiltersObj W3(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 38261, new Class[]{String.class}, FiltersObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (FiltersObj) patchProxyResultProxy.result;
        }
        FiltersObj filtersObj = null;
        if (!com.max.hbcommon.utils.c.w(this.f88087l)) {
            for (FiltersObj filtersObj2 : this.f88087l) {
                if (str.equals(filtersObj2.getKey())) {
                    filtersObj = filtersObj2;
                }
            }
        }
        return filtersObj;
    }

    private void X3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38254, new Class[0], Void.TYPE).isSupported || getArguments() == null) {
            return;
        }
        this.f88079d = getArguments().getString("nickname");
        this.f88081f = getArguments().getString("season");
        this.f88077b = getArguments().getString("region");
        this.f88082g = getArguments().getString(PUBGFriendRankActivity.Y);
        String string = getArguments().getString("player_id");
        this.f88080e = string;
        if (TextUtils.isEmpty(string)) {
            this.f88080e = this.f88079d;
        }
    }

    private void Z3(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38257, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f88090o = (LinearLayout) view.findViewById(R.id.ll_mode);
        this.f88091p = (LinearLayout) view.findViewById(R.id.ll_season);
        this.f88092q = (LinearLayout) view.findViewById(R.id.ll_region);
        this.f88093r = (TextView) view.findViewById(R.id.tv_mode);
        this.f88094s = (TextView) view.findViewById(R.id.tv_season);
        this.f88095t = (TextView) view.findViewById(R.id.tv_region);
        this.f88099x = (TextView) view.findViewById(R.id.tv_header_rank_desc);
        this.f88100y = (TextView) view.findViewById(R.id.tv_col_friend);
        this.f88096u = (ImageView) view.findViewById(R.id.iv_mode_arrow);
        this.f88097v = (ImageView) view.findViewById(R.id.iv_season_arrow);
        this.f88098w = (ImageView) view.findViewById(R.id.iv_region_arrow);
        this.f88100y.setText(getString(com.max.xiaoheihe.module.account.utils.c.e(this.f88079d) == 1 ? R.string.my_friend : R.string.his_friend));
        this.f88090o.setOnClickListener(this);
        this.f88091p.setOnClickListener(this);
        this.f88092q.setOnClickListener(this);
    }

    private void a4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38256, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        View viewInflate = this.mContext.getLayoutInflater().inflate(R.layout.layout_pubg_friend_rank_header, (ViewGroup) this.mRecyclerView, false);
        Z3(viewInflate);
        a aVar = new a(this.mContext, this.f88086k, R.layout.layout_item_friend_ranking_x_v2);
        this.f88089n = aVar;
        t tVar = new t(aVar);
        this.f88088m = tVar;
        tVar.p(R.layout.layout_pubg_friend_rank_header, viewInflate);
        this.mRecyclerView.setAdapter(this.f88088m);
        this.mRefreshLayout.a(true);
        this.mRefreshLayout.S(new b());
        this.mRefreshLayout.f0(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b4(com.max.xiaoheihe.module.game.adapter.e.b bVar, CompoundButton compoundButton, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{bVar, compoundButton, keyDescObj}, null, changeQuickRedirect, true, 38268, new Class[]{com.max.xiaoheihe.module.game.adapter.e.b.class, CompoundButton.class, KeyDescObj.class}, Void.TYPE).isSupported || bVar == null) {
            return;
        }
        bVar.a(compoundButton, keyDescObj);
    }

    public static PUBGFriendRankFragment c4(String str, String str2, String str3, String str4, String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, null, changeQuickRedirect, true, 38250, new Class[]{String.class, String.class, String.class, String.class, String.class}, PUBGFriendRankFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (PUBGFriendRankFragment) patchProxyResultProxy.result;
        }
        PUBGFriendRankFragment pUBGFriendRankFragment = new PUBGFriendRankFragment();
        Bundle bundle = new Bundle();
        bundle.putString("nickname", str);
        bundle.putString("season", str2);
        bundle.putString("region", str3);
        bundle.putString(PUBGFriendRankActivity.Y, str4);
        bundle.putString("player_id", str5);
        pUBGFriendRankFragment.setArguments(bundle);
        return pUBGFriendRankFragment;
    }

    private void e4(PUBGRankResultObj pUBGRankResultObj) {
        if (PatchProxy.proxy(new Object[]{pUBGRankResultObj}, this, changeQuickRedirect, false, 38259, new Class[]{PUBGRankResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.hbcommon.utils.c.w(pUBGRankResultObj.getFilter())) {
            this.f88087l.clear();
            this.f88087l.addAll(pUBGRankResultObj.getFilter());
            for (FiltersObj filtersObj : this.f88087l) {
                if ("mode".equals(filtersObj.getKey())) {
                    for (KeyDescObj keyDescObj : filtersObj.getValues()) {
                        if (this.f88078c.equals(keyDescObj.getKey())) {
                            keyDescObj.setChecked(true);
                            this.f88093r.setText(keyDescObj.getValue());
                            break;
                        }
                    }
                }
                if ("season".equals(filtersObj.getKey())) {
                    for (KeyDescObj keyDescObj2 : filtersObj.getValues()) {
                        if (this.f88081f.equals(keyDescObj2.getKey())) {
                            keyDescObj2.setChecked(true);
                            this.f88094s.setText(keyDescObj2.getValue());
                            break;
                        }
                    }
                }
                if ("region".equals(filtersObj.getKey())) {
                    for (KeyDescObj keyDescObj3 : filtersObj.getValues()) {
                        if (keyDescObj3.getKey().equals(this.f88077b)) {
                            keyDescObj3.setChecked(true);
                            this.f88095t.setText(keyDescObj3.getValue());
                            break;
                        }
                    }
                }
                if (PUBGFriendRankActivity.Y.equals(filtersObj.getKey())) {
                    i iVar = this.f88085j;
                    if (iVar != null) {
                        iVar.b1(filtersObj.getValues());
                    }
                    for (KeyDescObj keyDescObj4 : filtersObj.getValues()) {
                        if (keyDescObj4.getKey().equals(this.f88082g)) {
                            this.f88099x.setText(keyDescObj4.getValue());
                            break;
                        }
                    }
                }
            }
        }
        if (this.f88083h == 0) {
            this.f88086k.clear();
            this.f88086k.add(pUBGRankResultObj.getUser_rank());
        }
        if (pUBGRankResultObj.getBoard() != null) {
            this.f88086k.addAll(pUBGRankResultObj.getBoard());
        }
        showContentView();
        this.f88088m.notifyDataSetChanged();
    }

    private void f4(Context context, View view, List<KeyDescObj> list, final com.max.xiaoheihe.module.game.adapter.e.b bVar) {
        if (PatchProxy.proxy(new Object[]{context, view, list, bVar}, this, changeQuickRedirect, false, 38263, new Class[]{Context.class, View.class, List.class, com.max.xiaoheihe.module.game.adapter.e.b.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.layout_filter_rv, (ViewGroup) null);
        viewInflate.findViewById(R.id.divider_top);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv_filter);
        this.B = recyclerView;
        recyclerView.setBackgroundResource(R.drawable.pubg_filter_bg_v2);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this.mContext);
        flexboxLayoutManager.setFlexWrap(1);
        flexboxLayoutManager.setFlexDirection(0);
        this.B.setLayoutManager(flexboxLayoutManager);
        com.max.xiaoheihe.module.game.adapter.f fVar = new com.max.xiaoheihe.module.game.adapter.f(context, list, U3(this.f88101z), new com.max.xiaoheihe.module.game.adapter.f.a() { // from class: com.max.xiaoheihe.module.game.pubg.d
            @Override // com.max.xiaoheihe.module.game.adapter.f.a
            public final void a(CompoundButton compoundButton, KeyDescObj keyDescObj) {
                PUBGFriendRankFragment.b4(bVar, compoundButton, keyDescObj);
            }
        }, R.layout.item_filter_trans);
        this.C = fVar;
        this.B.setAdapter(fVar);
        this.C.notifyDataSetChanged();
        PopupWindow popupWindow = this.A;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.A = new PopupWindow(viewInflate, -1, -1, true);
        viewInflate.setOnClickListener(new e(context));
        this.A.setTouchable(true);
        this.A.setBackgroundDrawable(new BitmapDrawable());
        this.A.setAnimationStyle(0);
        this.A.setOnDismissListener(new f(view, context));
        if (this.A.isShowing() || view == null) {
            return;
        }
        ViewUtils.o0(this.A, view);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.mContext, R.anim.filter_slide_in);
        animationLoadAnimation.setAnimationListener(new g());
        this.B.startAnimation(animationLoadAnimation);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            ((TextView) viewGroup.getChildAt(0)).setTextColor(context.getResources().getColor(R.color.white));
            ((ImageView) viewGroup.getChildAt(1)).setImageResource(R.drawable.common_arrow_down_filled_24x24);
        }
    }

    private void g4(FiltersObj filtersObj, KeyDescObj keyDescObj) {
        List<KeyDescObj> values;
        if (PatchProxy.proxy(new Object[]{filtersObj, keyDescObj}, this, changeQuickRedirect, false, 38266, new Class[]{FiltersObj.class, KeyDescObj.class}, Void.TYPE).isSupported || filtersObj == null || keyDescObj == null || (values = filtersObj.getValues()) == null) {
            return;
        }
        for (KeyDescObj keyDescObj2 : values) {
            if (keyDescObj2.getKey() == null || !keyDescObj2.getKey().equals(keyDescObj.getKey())) {
                keyDescObj2.setChecked(false);
            } else {
                keyDescObj2.setChecked(true);
                if ("mode".equals(filtersObj.getKey())) {
                    this.f88078c = keyDescObj2.getKey();
                    this.f88093r.setText(keyDescObj2.getValue());
                } else if ("season".equals(filtersObj.getKey())) {
                    this.f88081f = keyDescObj2.getKey();
                    this.f88094s.setText(keyDescObj2.getValue());
                } else if ("region".equals(filtersObj.getKey())) {
                    this.f88077b = keyDescObj2.getKey();
                    this.f88095t.setText(keyDescObj2.getValue());
                }
            }
        }
    }

    public void Y3(Context context, PopupWindow popupWindow, RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{context, popupWindow, recyclerView}, this, changeQuickRedirect, false, 38264, new Class[]{Context.class, PopupWindow.class, RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        if (((context instanceof Activity) && ((Activity) context).isFinishing()) || popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.mContext, R.anim.filter_slide_out);
        animationLoadAnimation.setAnimationListener(new h(recyclerView, popupWindow));
        recyclerView.startAnimation(animationLoadAnimation);
    }

    @Override // com.max.xiaoheihe.module.game.adapter.e.b
    public void a(CompoundButton compoundButton, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{compoundButton, keyDescObj}, this, changeQuickRedirect, false, 38267, new Class[]{CompoundButton.class, KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        g4(this.f88101z, keyDescObj);
        Y3(this.mContext, this.A, this.B);
        this.f88083h = 0;
        this.f88084i.clear();
        V3();
    }

    public void d4(String str) {
        this.f88082g = str;
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38255, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f88083h = 0;
        this.f88084i.clear();
        V3();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38253, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        this.mUnBinder = ButterKnife.f(this, view);
        this.mRefreshLayout.setBackgroundColor(0);
        X3();
        a4();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 38251, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttach(context);
        if (getParentFragment() instanceof i) {
            this.f88085j = (i) getParentFragment();
            return;
        }
        if (context instanceof i) {
            this.f88085j = (i) context;
            return;
        }
        throw new RuntimeException(getParentFragment() + " or " + context + " must implement OnGetSortTypesCompletedListener");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38260, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        int id2 = view.getId();
        if (id2 == R.id.ll_mode) {
            this.f88101z = W3("mode");
        } else if (id2 == R.id.ll_region) {
            this.f88101z = W3("region");
        } else if (id2 == R.id.ll_season) {
            this.f88101z = W3("season");
        }
        f4(this.mContext, view, this.f88101z.getValues(), this);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38252, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetach();
        this.f88085j = null;
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38262, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V3();
    }

    @Override // com.max.hbcommon.base.d
    public boolean shouldKeepViewOnDestroyView() {
        return this.mContext instanceof com.max.hbminiprogram.h;
    }
}
