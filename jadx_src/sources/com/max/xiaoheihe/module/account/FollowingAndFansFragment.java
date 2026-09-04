package com.max.xiaoheihe.module.account;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.FilterButtonView;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbcommon.network.ApiException;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.Resultx;
import com.max.xiaoheihe.bean.SteamNativeListObj;
import com.max.xiaoheihe.bean.account.SteamNativeObj;
import com.max.xiaoheihe.bean.bbs.BBSFollowingResult;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.RecUsersResult;
import com.max.xiaoheihe.module.account.utils.HBSteamInfoUtilsKt;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class FollowingAndFansFragment extends com.max.hbcommon.base.d implements com.max.xiaoheihe.module.bbs.adapter.y.d {
    private static final String A = "sort_type_frequency";
    private static final String B = "sort_type_release_time";
    private static final String C = "sort_type_online_status";
    private static final String D = "sort_type_follow_at";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f77740u = "user_id";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f77741v = "type";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f77742w = "from";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f77743x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f77744y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f77745z = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f77747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f77748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f77749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f77750f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s f77752h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.max.xiaoheihe.module.bbs.adapter.y f77753i;

    @BindView(R.id.iv_del)
    ImageView ivDel;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.max.xiaoheihe.module.bbs.adapter.y f77754j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.max.xiaoheihe.module.bbs.adapter.y f77755k;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    @BindView(R.id.et_search)
    EditText mSearchEditText;

    @BindView(R.id.vg_search_header)
    View mSearchHeader;

    @BindView(R.id.fbv_sort)
    FilterButtonView mSortTextView;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f77762r;

    @BindView(R.id.rv_empty_view)
    View rv_empty_view;

    @BindView(R.id.v_div_4dp)
    View vDiv4dp;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f77746b = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f77751g = C;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<BBSUserInfoObj> f77756l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<BBSUserInfoObj> f77757m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<BBSUserInfoObj> f77758n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<BBSUserInfoObj> f77759o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<BBSUserInfoObj> f77760p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List<BBSUserInfoObj> f77761q = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f77763s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private q f77764t = new q(this);

    public class a extends com.max.hbcommon.network.d<Result<RecUsersResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22884, new Class[0], Void.TYPE).isSupported && FollowingAndFansFragment.this.isActive()) {
                FollowingAndFansFragment.this.mRefreshLayout.A(0);
                FollowingAndFansFragment.this.mRefreshLayout.p(0);
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 22883, new Class[]{Throwable.class}, Void.TYPE).isSupported && FollowingAndFansFragment.this.isActive()) {
                FollowingAndFansFragment.this.mRefreshLayout.A(0);
                FollowingAndFansFragment.this.mRefreshLayout.p(0);
                FollowingAndFansFragment.g4(FollowingAndFansFragment.this);
            }
        }

        public void onNext(Result<RecUsersResult> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22885, new Class[]{Result.class}, Void.TYPE).isSupported && FollowingAndFansFragment.this.isActive()) {
                FollowingAndFansFragment.N3(FollowingAndFansFragment.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22886, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<RecUsersResult>) obj);
        }
    }

    public class b extends com.max.hbcommon.network.d<BBSFollowingResult> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f77766b;

        b(boolean z10) {
            this.f77766b = z10;
        }

        public void a(BBSFollowingResult bBSFollowingResult) {
            if (!PatchProxy.proxy(new Object[]{bBSFollowingResult}, this, changeQuickRedirect, false, 22889, new Class[]{BBSFollowingResult.class}, Void.TYPE).isSupported && FollowingAndFansFragment.this.isActive()) {
                FollowingAndFansFragment.P3(FollowingAndFansFragment.this, bBSFollowingResult, this.f77766b);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22888, new Class[0], Void.TYPE).isSupported && FollowingAndFansFragment.this.isActive()) {
                super.onComplete();
                FollowingAndFansFragment.this.mRefreshLayout.A(0);
                FollowingAndFansFragment.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 22887, new Class[]{Throwable.class}, Void.TYPE).isSupported && FollowingAndFansFragment.this.isActive()) {
                super.onError(th2);
                FollowingAndFansFragment.O3(FollowingAndFansFragment.this);
                FollowingAndFansFragment.this.mRefreshLayout.A(0);
                FollowingAndFansFragment.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22890, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((BBSFollowingResult) obj);
        }
    }

    public class c extends com.max.hbcommon.network.d<BBSFollowingResult> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        public void a(BBSFollowingResult bBSFollowingResult) {
            if (!PatchProxy.proxy(new Object[]{bBSFollowingResult}, this, changeQuickRedirect, false, 22893, new Class[]{BBSFollowingResult.class}, Void.TYPE).isSupported && FollowingAndFansFragment.this.isActive()) {
                FollowingAndFansFragment.R3(FollowingAndFansFragment.this, bBSFollowingResult.getFollow_list());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22892, new Class[0], Void.TYPE).isSupported && FollowingAndFansFragment.this.isActive()) {
                super.onComplete();
                FollowingAndFansFragment.this.mRefreshLayout.A(0);
                FollowingAndFansFragment.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 22891, new Class[]{Throwable.class}, Void.TYPE).isSupported && FollowingAndFansFragment.this.isActive()) {
                super.onError(th2);
                FollowingAndFansFragment.Q3(FollowingAndFansFragment.this);
                FollowingAndFansFragment.this.mRefreshLayout.A(0);
                FollowingAndFansFragment.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22894, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((BBSFollowingResult) obj);
        }
    }

    public class d extends com.max.hbcommon.network.d<Resultx<SteamNativeListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f77769b;

        public class a implements com.max.xiaoheihe.module.account.utils.b {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.module.account.utils.b
            public void onError() {
            }

            @Override // com.max.xiaoheihe.module.account.utils.b
            public void onSuccess() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22899, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                FollowingAndFansFragment.this.f77752h.notifyDataSetChanged();
            }
        }

        d(Fragment fragment) {
            this.f77769b = fragment;
        }

        public void a(Resultx<SteamNativeListObj> resultx) {
            if (PatchProxy.proxy(new Object[]{resultx}, this, changeQuickRedirect, false, 22897, new Class[]{Resultx.class}, Void.TYPE).isSupported || !FollowingAndFansFragment.this.isActive() || resultx == null || resultx.getResponse() == null || resultx.getResponse().getPlayers() == null) {
                return;
            }
            List<SteamNativeObj> players = resultx.getResponse().getPlayers();
            StringBuilder sb2 = new StringBuilder("");
            Iterator<SteamNativeObj> it = players.iterator();
            while (it.hasNext()) {
                String gameid = it.next().getGameid();
                if (!com.max.hbcommon.utils.c.u(gameid) && !com.max.xiaoheihe.module.account.utils.g.f79313a.b(gameid)) {
                    if (sb2.length() > 0) {
                        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                    sb2.append(gameid);
                }
            }
            if (sb2.length() > 0) {
                HBSteamInfoUtilsKt.j(sb2.toString(), new a(), this.f77769b);
            }
            if (FollowingAndFansFragment.this.f77750f == 0) {
                com.max.xiaoheihe.module.account.utils.l.U(players, FollowingAndFansFragment.this.f77756l, 0);
            } else {
                com.max.xiaoheihe.module.account.utils.l.U(players, FollowingAndFansFragment.this.f77758n, 0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22896, new Class[0], Void.TYPE).isSupported && FollowingAndFansFragment.this.isActive()) {
                FollowingAndFansFragment.U3(FollowingAndFansFragment.this);
                if (FollowingAndFansFragment.this.f77763s <= 0) {
                    FollowingAndFansFragment.f4(FollowingAndFansFragment.this);
                }
                FollowingAndFansFragment.this.f77752h.notifyDataSetChanged();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 22895, new Class[]{Throwable.class}, Void.TYPE).isSupported && FollowingAndFansFragment.this.isActive()) {
                super.onError(th2);
                FollowingAndFansFragment.S3(FollowingAndFansFragment.this);
                FollowingAndFansFragment.U3(FollowingAndFansFragment.this);
                FollowingAndFansFragment.this.f77752h.notifyDataSetChanged();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22898, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((Resultx) obj);
        }
    }

    public class e extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f77772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSUserInfoObj f77773c;

        e(String str, BBSUserInfoObj bBSUserInfoObj) {
            this.f77772b = str;
            this.f77773c = bBSUserInfoObj;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 22900, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!(th2 instanceof ApiException) || com.max.hbcommon.utils.c.u(th2.getMessage())) {
                super.onError(th2);
            } else {
                com.max.xiaoheihe.module.bbs.utils.b.X(th2.getMessage());
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22901, new Class[]{Result.class}, Void.TYPE).isSupported && FollowingAndFansFragment.this.isActive()) {
                if ("2".equals(this.f77772b)) {
                    this.f77773c.setIs_follow("3");
                } else {
                    this.f77773c.setIs_follow("1");
                }
                FollowingAndFansFragment.this.f77752h.notifyDataSetChanged();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22902, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class f extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f77775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSUserInfoObj f77776c;

        f(String str, BBSUserInfoObj bBSUserInfoObj) {
            this.f77775b = str;
            this.f77776c = bBSUserInfoObj;
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22903, new Class[]{Result.class}, Void.TYPE).isSupported && FollowingAndFansFragment.this.isActive()) {
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(FollowingAndFansFragment.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                if ("3".equals(this.f77775b)) {
                    this.f77776c.setIs_follow("2");
                } else {
                    this.f77776c.setIs_follow("0");
                }
                FollowingAndFansFragment.this.f77752h.notifyDataSetChanged();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22904, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class g extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@androidx.annotation.n0 RecyclerView recyclerView, int i10) {
            if (!PatchProxy.proxy(new Object[]{recyclerView, new Integer(i10)}, this, changeQuickRedirect, false, 22882, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE).isSupported && i10 == 1) {
                FollowingAndFansFragment.L3(FollowingAndFansFragment.this, recyclerView);
            }
        }
    }

    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22905, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            FollowingAndFansFragment.M3(FollowingAndFansFragment.this);
        }
    }

    public class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22906, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            FollowingAndFansFragment.this.mSearchEditText.setText("");
        }
    }

    public class j implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 22907, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            FollowingAndFansFragment.this.f77764t.removeCallbacksAndMessages(null);
            Message messageObtainMessage = FollowingAndFansFragment.this.f77764t.obtainMessage();
            messageObtainMessage.obj = editable.toString();
            FollowingAndFansFragment.this.f77764t.sendMessageDelayed(messageObtainMessage, 100L);
            if (editable.length() > 0) {
                FollowingAndFansFragment.this.ivDel.setVisibility(0);
            } else {
                FollowingAndFansFragment.this.ivDel.setVisibility(8);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class k implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 22908, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            FollowingAndFansFragment.Z3(FollowingAndFansFragment.this, false);
        }
    }

    public class l implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 22909, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            FollowingAndFansFragment.Z3(FollowingAndFansFragment.this, true);
        }
    }

    public class m implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public void a(View view, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 22910, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            FollowingAndFansFragment.this.f77751g = keyDescObj.getKey();
            if (FollowingAndFansFragment.this.f77750f == 1) {
                if (FollowingAndFansFragment.A.equals(FollowingAndFansFragment.this.f77751g) || FollowingAndFansFragment.B.equals(FollowingAndFansFragment.this.f77751g)) {
                    FollowingAndFansFragment.this.f77754j.f80750h = false;
                } else {
                    FollowingAndFansFragment.this.f77754j.f80750h = true;
                }
            }
            FollowingAndFansFragment.this.mSortTextView.setChecked(true);
            FollowingAndFansFragment.e4(FollowingAndFansFragment.this);
            FollowingAndFansFragment.f4(FollowingAndFansFragment.this);
        }
    }

    public class n implements Comparator<BBSUserInfoObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        public int a(BBSUserInfoObj bBSUserInfoObj, BBSUserInfoObj bBSUserInfoObj2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSUserInfoObj, bBSUserInfoObj2}, this, changeQuickRedirect, false, 22911, new Class[]{BBSUserInfoObj.class, BBSUserInfoObj.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Integer.valueOf(bBSUserInfoObj2.getFollow_score()).compareTo(Integer.valueOf(bBSUserInfoObj.getFollow_score()));
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(BBSUserInfoObj bBSUserInfoObj, BBSUserInfoObj bBSUserInfoObj2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSUserInfoObj, bBSUserInfoObj2}, this, changeQuickRedirect, false, 22912, new Class[]{Object.class, Object.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : a(bBSUserInfoObj, bBSUserInfoObj2);
        }
    }

    public class o implements Comparator<BBSUserInfoObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        public int a(BBSUserInfoObj bBSUserInfoObj, BBSUserInfoObj bBSUserInfoObj2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSUserInfoObj, bBSUserInfoObj2}, this, changeQuickRedirect, false, 22913, new Class[]{BBSUserInfoObj.class, BBSUserInfoObj.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Integer.valueOf(bBSUserInfoObj2.getLast_event_at()).compareTo(Integer.valueOf(bBSUserInfoObj.getLast_event_at()));
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(BBSUserInfoObj bBSUserInfoObj, BBSUserInfoObj bBSUserInfoObj2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSUserInfoObj, bBSUserInfoObj2}, this, changeQuickRedirect, false, 22914, new Class[]{Object.class, Object.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : a(bBSUserInfoObj, bBSUserInfoObj2);
        }
    }

    public class p implements Comparator<BBSUserInfoObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        public int a(BBSUserInfoObj bBSUserInfoObj, BBSUserInfoObj bBSUserInfoObj2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSUserInfoObj, bBSUserInfoObj2}, this, changeQuickRedirect, false, 22915, new Class[]{BBSUserInfoObj.class, BBSUserInfoObj.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Double.valueOf(com.max.hbutils.utils.n.o(bBSUserInfoObj2.getFollow_at())).compareTo(Double.valueOf(com.max.hbutils.utils.n.o(bBSUserInfoObj.getFollow_at())));
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(BBSUserInfoObj bBSUserInfoObj, BBSUserInfoObj bBSUserInfoObj2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSUserInfoObj, bBSUserInfoObj2}, this, changeQuickRedirect, false, 22916, new Class[]{Object.class, Object.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : a(bBSUserInfoObj, bBSUserInfoObj2);
        }
    }

    public static class q extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<FollowingAndFansFragment> f77788a;

        public q(FollowingAndFansFragment followingAndFansFragment) {
            this.f77788a = new WeakReference<>(followingAndFansFragment);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 22917, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            super.handleMessage(message);
            FollowingAndFansFragment followingAndFansFragment = this.f77788a.get();
            if (followingAndFansFragment != null) {
                followingAndFansFragment.r4((String) message.obj);
            }
        }
    }

    private void A4(List list, int i10, int i11) {
        Object[] objArr = {list, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 22859, new Class[]{List.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (!list.isEmpty()) {
            this.rv_empty_view.setVisibility(8);
            showContentView();
            this.mRefreshLayout.i0(true);
            if (this.f77750f == 1) {
                this.mRefreshLayout.b0(false);
                return;
            } else {
                this.mRefreshLayout.b0(true);
                return;
            }
        }
        this.mRefreshLayout.i0(false);
        this.mRefreshLayout.b0(false);
        this.rv_empty_view.setVisibility(0);
        ImageView imageView = (ImageView) this.rv_empty_view.findViewById(R.id.iv_empty);
        TextView textView = (TextView) this.rv_empty_view.findViewById(R.id.tv_empty);
        imageView.setImageResource(i10);
        textView.setText(i11);
        View view = this.rv_empty_view;
        if (view == null || this.mSearchHeader == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.setMargins(0, ViewUtils.V(this.mSearchHeader) + ViewUtils.f(this.mContext, 4.0f), 0, 0);
        this.rv_empty_view.setLayoutParams(layoutParams);
    }

    static /* synthetic */ void L3(FollowingAndFansFragment followingAndFansFragment, View view) {
        if (PatchProxy.proxy(new Object[]{followingAndFansFragment, view}, null, changeQuickRedirect, true, 22870, new Class[]{FollowingAndFansFragment.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        followingAndFansFragment.n4(view);
    }

    static /* synthetic */ void M3(FollowingAndFansFragment followingAndFansFragment) {
        if (PatchProxy.proxy(new Object[]{followingAndFansFragment}, null, changeQuickRedirect, true, 22871, new Class[]{FollowingAndFansFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        followingAndFansFragment.y4();
    }

    static /* synthetic */ void N3(FollowingAndFansFragment followingAndFansFragment, RecUsersResult recUsersResult) {
        if (PatchProxy.proxy(new Object[]{followingAndFansFragment, recUsersResult}, null, changeQuickRedirect, true, 22876, new Class[]{FollowingAndFansFragment.class, RecUsersResult.class}, Void.TYPE).isSupported) {
            return;
        }
        followingAndFansFragment.u4(recUsersResult);
    }

    static /* synthetic */ void O3(FollowingAndFansFragment followingAndFansFragment) {
        if (PatchProxy.proxy(new Object[]{followingAndFansFragment}, null, changeQuickRedirect, true, 22877, new Class[]{FollowingAndFansFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        followingAndFansFragment.showError();
    }

    static /* synthetic */ void P3(FollowingAndFansFragment followingAndFansFragment, BBSFollowingResult bBSFollowingResult, boolean z10) {
        if (PatchProxy.proxy(new Object[]{followingAndFansFragment, bBSFollowingResult, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 22878, new Class[]{FollowingAndFansFragment.class, BBSFollowingResult.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        followingAndFansFragment.t4(bBSFollowingResult, z10);
    }

    static /* synthetic */ void Q3(FollowingAndFansFragment followingAndFansFragment) {
        if (PatchProxy.proxy(new Object[]{followingAndFansFragment}, null, changeQuickRedirect, true, 22879, new Class[]{FollowingAndFansFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        followingAndFansFragment.showError();
    }

    static /* synthetic */ void R3(FollowingAndFansFragment followingAndFansFragment, List list) {
        if (PatchProxy.proxy(new Object[]{followingAndFansFragment, list}, null, changeQuickRedirect, true, 22880, new Class[]{FollowingAndFansFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        followingAndFansFragment.s4(list);
    }

    static /* synthetic */ void S3(FollowingAndFansFragment followingAndFansFragment) {
        if (PatchProxy.proxy(new Object[]{followingAndFansFragment}, null, changeQuickRedirect, true, 22881, new Class[]{FollowingAndFansFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        followingAndFansFragment.showContentView();
    }

    static /* synthetic */ int U3(FollowingAndFansFragment followingAndFansFragment) {
        int i10 = followingAndFansFragment.f77763s;
        followingAndFansFragment.f77763s = i10 - 1;
        return i10;
    }

    static /* synthetic */ void Z3(FollowingAndFansFragment followingAndFansFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{followingAndFansFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 22872, new Class[]{FollowingAndFansFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        followingAndFansFragment.i4(z10);
    }

    static /* synthetic */ void e4(FollowingAndFansFragment followingAndFansFragment) {
        if (PatchProxy.proxy(new Object[]{followingAndFansFragment}, null, changeQuickRedirect, true, 22873, new Class[]{FollowingAndFansFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        followingAndFansFragment.v4();
    }

    static /* synthetic */ void f4(FollowingAndFansFragment followingAndFansFragment) {
        if (PatchProxy.proxy(new Object[]{followingAndFansFragment}, null, changeQuickRedirect, true, 22874, new Class[]{FollowingAndFansFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        followingAndFansFragment.z4();
    }

    static /* synthetic */ void g4(FollowingAndFansFragment followingAndFansFragment) {
        if (PatchProxy.proxy(new Object[]{followingAndFansFragment}, null, changeQuickRedirect, true, 22875, new Class[]{FollowingAndFansFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        followingAndFansFragment.showError();
    }

    private void i4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 22857, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int i10 = this.f77750f;
        if (i10 == 0) {
            if (z10) {
                this.f77748d += 30;
            } else {
                this.f77748d = 0;
            }
            m4();
            return;
        }
        if (i10 == 1) {
            k4(this.mRefreshLayout.getState() == RefreshState.Refreshing);
        } else {
            if (i10 != 2) {
                return;
            }
            if (z10) {
                this.f77749e += 30;
            } else {
                this.f77749e = 0;
            }
            j4();
        }
    }

    private void j4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22856, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().a6(this.f77747c, this.f77749e, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private void k4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 22855, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().f0(this.f77747c, this.f77748d, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(z10)));
    }

    private void l4(String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 22861, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.module.account.mine.l.f79078a.c(str, z10).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(this)));
    }

    private void m4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22854, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().e9(null, this.f77748d, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a()));
    }

    private void n4(View view) {
        InputMethodManager inputMethodManager;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22868, new Class[]{View.class}, Void.TYPE).isSupported || (inputMethodManager = (InputMethodManager) this.mContext.getSystemService("input_method")) == null || view == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static FollowingAndFansFragment o4(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 22843, new Class[]{String.class}, FollowingAndFansFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (FollowingAndFansFragment) patchProxyResultProxy.result;
        }
        FollowingAndFansFragment followingAndFansFragment = new FollowingAndFansFragment();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        followingAndFansFragment.setArguments(bundle);
        return followingAndFansFragment;
    }

    public static FollowingAndFansFragment p4(String str, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Integer(i10)}, null, changeQuickRedirect, true, 22844, new Class[]{String.class, Integer.TYPE}, FollowingAndFansFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (FollowingAndFansFragment) patchProxyResultProxy.result;
        }
        FollowingAndFansFragment followingAndFansFragment = new FollowingAndFansFragment();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        bundle.putInt("type", i10);
        followingAndFansFragment.setArguments(bundle);
        return followingAndFansFragment;
    }

    public static FollowingAndFansFragment q4(String str, int i10, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Integer(i10), str2}, null, changeQuickRedirect, true, 22845, new Class[]{String.class, Integer.TYPE, String.class}, FollowingAndFansFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (FollowingAndFansFragment) patchProxyResultProxy.result;
        }
        FollowingAndFansFragment followingAndFansFragment = new FollowingAndFansFragment();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        bundle.putInt("type", i10);
        bundle.putString("from", str2);
        followingAndFansFragment.setArguments(bundle);
        return followingAndFansFragment;
    }

    private void s4(List<BBSUserInfoObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 22863, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (list != null) {
            if (this.f77749e == 0) {
                this.f77760p.clear();
            }
            this.f77760p.addAll(list);
            h4(r());
            this.f77752h.notifyDataSetChanged();
            A4(this.f77760p, R.drawable.common_tag_favour_46x45, R.string.no_follower);
        }
    }

    private void t4(BBSFollowingResult bBSFollowingResult, boolean z10) {
        if (PatchProxy.proxy(new Object[]{bBSFollowingResult, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 22862, new Class[]{BBSFollowingResult.class, Boolean.TYPE}, Void.TYPE).isSupported || bBSFollowingResult.getFollow_list() == null) {
            return;
        }
        this.f77758n.clear();
        this.f77758n.addAll(bBSFollowingResult.getFollow_list());
        h4(r());
        z4();
        if (com.max.hbcommon.utils.c.o(bBSFollowingResult.getSummary_url()) > 0) {
            this.f77763s = bBSFollowingResult.getSummary_url().size();
            Iterator<String> it = bBSFollowingResult.getSummary_url().iterator();
            while (it.hasNext()) {
                l4(it.next(), z10);
            }
        } else {
            showContentView();
            this.f77752h.notifyDataSetChanged();
        }
        A4(this.f77758n, R.drawable.common_tag_favour_46x45, R.string.no_following);
    }

    private void u4(RecUsersResult recUsersResult) {
        if (PatchProxy.proxy(new Object[]{recUsersResult}, this, changeQuickRedirect, false, 22860, new Class[]{RecUsersResult.class}, Void.TYPE).isSupported || recUsersResult.getRec_users() == null) {
            return;
        }
        if (this.f77748d == 0) {
            this.f77756l.clear();
        }
        this.f77756l.addAll(recUsersResult.getRec_users());
        h4(r());
        showContentView();
        this.f77752h.notifyDataSetChanged();
        A4(this.f77757m, R.drawable.common_tag_post_46x45, R.string.empty_view_def_text);
    }

    private void v4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22847, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String string = getString(R.string.follow_at);
        String str = this.f77751g;
        if (str != null) {
            str.hashCode();
            switch (str) {
                case "sort_type_online_status":
                    string = getString(R.string.online_status);
                    break;
                case "sort_type_release_time":
                    string = getString(R.string.latest_release);
                    break;
                case "sort_type_frequency":
                    string = getString(R.string.access_frequency);
                    break;
                case "sort_type_follow_at":
                    string = getString(R.string.follow_at);
                    break;
            }
        }
        this.mSortTextView.setText(string);
    }

    private void w4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22858, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int i10 = this.f77750f;
        if (i10 == 0) {
            this.f77752h = this.f77753i;
            this.mSearchHeader.setVisibility(8);
            this.vDiv4dp.setVisibility(8);
            this.mRecyclerView.setAdapter(this.f77752h);
            return;
        }
        if (i10 == 1) {
            this.f77752h = this.f77754j;
            this.mSearchHeader.setVisibility(0);
            this.vDiv4dp.setVisibility(0);
            this.mRecyclerView.setAdapter(this.f77752h);
            return;
        }
        if (i10 != 2) {
            return;
        }
        this.f77752h = this.f77755k;
        this.mSearchHeader.setVisibility(0);
        this.vDiv4dp.setVisibility(0);
        this.mRecyclerView.setAdapter(this.f77752h);
    }

    private void x4(View view) {
        InputMethodManager inputMethodManager;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22867, new Class[]{View.class}, Void.TYPE).isSupported || !view.requestFocus() || (inputMethodManager = (InputMethodManager) this.mContext.getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.showSoftInput(view, 1);
    }

    private void y4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22848, new Class[0], Void.TYPE).isSupported || this.mContext.isFinishing()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setKey(A);
        keyDescObj.setChecked(A.equals(this.f77751g));
        keyDescObj.setDesc(getString(R.string.access_frequency));
        arrayList.add(keyDescObj);
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj2.setKey(B);
        keyDescObj2.setChecked(B.equals(this.f77751g));
        keyDescObj2.setDesc(getString(R.string.latest_release));
        arrayList.add(keyDescObj2);
        KeyDescObj keyDescObj3 = new KeyDescObj();
        keyDescObj3.setKey(D);
        keyDescObj3.setChecked(D.equals(this.f77751g));
        keyDescObj3.setDesc(getString(R.string.follow_at));
        arrayList.add(keyDescObj3);
        KeyDescObj keyDescObj4 = new KeyDescObj();
        keyDescObj4.setKey(C);
        keyDescObj4.setChecked(C.equals(this.f77751g));
        keyDescObj4.setDesc(getString(R.string.online_status));
        arrayList.add(keyDescObj4);
        HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(this.mContext, arrayList);
        heyBoxPopupMenu.R(new m());
        heyBoxPopupMenu.show();
    }

    private void z4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22849, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int i10 = this.f77750f;
        if (i10 == 0) {
            com.max.xiaoheihe.module.account.utils.l.e0(this.f77757m);
        } else if (i10 == 1) {
            String str = this.f77751g;
            if (str != null) {
                str.hashCode();
                switch (str) {
                    case "sort_type_online_status":
                        com.max.xiaoheihe.module.account.utils.l.e0(this.f77759o);
                        break;
                    case "sort_type_release_time":
                        Collections.sort(this.f77759o, new o());
                        break;
                    case "sort_type_frequency":
                        Collections.sort(this.f77759o, new n());
                        break;
                    case "sort_type_follow_at":
                        Collections.sort(this.f77759o, new p());
                        break;
                }
            }
        } else if (C.equals(this.f77751g)) {
            com.max.xiaoheihe.module.account.utils.l.e0(this.f77759o);
        } else {
            Collections.sort(this.f77759o, new p());
        }
        this.f77752h.notifyDataSetChanged();
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.y.d
    public void H2(BBSUserInfoObj bBSUserInfoObj) {
        if (PatchProxy.proxy(new Object[]{bBSUserInfoObj}, this, changeQuickRedirect, false, 22866, new Class[]{BBSUserInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().m5(bBSUserInfoObj.getUserid(), bBSUserInfoObj.getH_src()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f(bBSUserInfoObj.getIs_follow(), bBSUserInfoObj)));
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.y.d
    public void V2(BBSUserInfoObj bBSUserInfoObj) {
        if (PatchProxy.proxy(new Object[]{bBSUserInfoObj}, this, changeQuickRedirect, false, 22865, new Class[]{BBSUserInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().V6(bBSUserInfoObj.getUserid(), null, bBSUserInfoObj.getH_src()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e(bBSUserInfoObj.getIs_follow(), bBSUserInfoObj)));
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @androidx.annotation.p0
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22869, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        int i10 = this.f77750f;
        if (i10 == 1) {
            jsonObject.addProperty("key", "following");
        } else if (i10 == 2) {
            jsonObject.addProperty("key", lb.c.f131110f);
        }
        return jsonObject.toString();
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @androidx.annotation.p0
    public String getPagePath() {
        int i10 = this.f77750f;
        if (i10 == 1 || i10 == 2) {
            return lb.d.f131276w1;
        }
        return null;
    }

    public void h4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22853, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        int i10 = this.f77750f;
        if (i10 == 0) {
            if (com.max.hbcommon.utils.c.u(str)) {
                this.f77757m.clear();
                this.f77757m.addAll(this.f77756l);
            } else {
                this.f77757m.clear();
                for (BBSUserInfoObj bBSUserInfoObj : this.f77756l) {
                    if (bBSUserInfoObj.getUsername() != null) {
                        String username = bBSUserInfoObj.getUsername();
                        Locale locale = Locale.US;
                        if (username.toLowerCase(locale).contains(str.toLowerCase(locale))) {
                            this.f77757m.add(bBSUserInfoObj);
                        }
                    }
                }
            }
        } else if (i10 == 1) {
            if (com.max.hbcommon.utils.c.u(str)) {
                this.f77759o.clear();
                this.f77759o.addAll(this.f77758n);
            } else {
                this.f77759o.clear();
                for (BBSUserInfoObj bBSUserInfoObj2 : this.f77758n) {
                    if (bBSUserInfoObj2.getUsername() != null) {
                        String username2 = bBSUserInfoObj2.getUsername();
                        Locale locale2 = Locale.US;
                        if (username2.toLowerCase(locale2).contains(str.toLowerCase(locale2))) {
                            this.f77759o.add(bBSUserInfoObj2);
                        }
                    }
                }
            }
        } else if (i10 == 2) {
            this.f77761q.clear();
            if (com.max.hbcommon.utils.c.u(str)) {
                this.f77761q.addAll(this.f77760p);
            } else {
                for (BBSUserInfoObj bBSUserInfoObj3 : this.f77760p) {
                    if (bBSUserInfoObj3.getUsername() != null) {
                        String username3 = bBSUserInfoObj3.getUsername();
                        Locale locale3 = Locale.US;
                        if (username3.toLowerCase(locale3).contains(str.toLowerCase(locale3))) {
                            this.f77761q.add(bBSUserInfoObj3);
                        }
                    }
                }
            }
        }
        this.f77752h.notifyDataSetChanged();
        A4(this.f77752h.getDataList(), R.drawable.common_tag_common_45x45, R.string.empty_content);
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        String string;
        String string2;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22846, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.fragment_following_and_fans);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            this.f77747c = getArguments().getString("user_id");
            this.f77750f = getArguments().getInt("type", 0);
            this.f77746b = getArguments().getString("from");
            string = getArguments().getString("msg");
            string2 = getArguments().getString(SendToFriendActivity.R);
        } else {
            string = null;
            string2 = null;
        }
        if (BBSLinkObj.REC_MARK_TIMELINE.equals(this.f77746b)) {
            this.f77751g = A;
        }
        this.f77762r = com.max.xiaoheihe.module.account.utils.c.c(this.f77747c) == 1;
        this.f77753i = new com.max.xiaoheihe.module.bbs.adapter.y(this.mContext, this, this.f77757m);
        this.f77754j = new com.max.xiaoheihe.module.bbs.adapter.y(this.mContext, this, this.f77759o, R.layout.item_heybox_user_v2, string, string2);
        if (BBSLinkObj.REC_MARK_TIMELINE.equals(this.f77746b)) {
            this.f77754j.f80750h = false;
        } else {
            this.f77754j.f80750h = true;
        }
        this.f77755k = new com.max.xiaoheihe.module.bbs.adapter.y(this.mContext, this, this.f77761q);
        this.mRecyclerView.setClipToPadding(false);
        this.mRecyclerView.setClipChildren(false);
        this.mRecyclerView.setPadding(0, 0, 0, ViewUtils.f(this.mContext, 4.0f));
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.mRecyclerView.addOnScrollListener(new g());
        if (this.f77750f == 1) {
            this.mSortTextView.setVisibility(0);
            this.mSearchHeader.setPadding(ViewUtils.f(this.mContext, 12.0f), 0, 0, 0);
            v4();
            this.mSortTextView.setOnClickListener(new h());
        } else {
            this.mSortTextView.setVisibility(8);
            this.mSearchHeader.setPadding(ViewUtils.f(this.mContext, 12.0f), 0, ViewUtils.f(this.mContext, 12.0f), 0);
        }
        this.mSearchEditText.setHint(getString(R.string.search_friend));
        this.mSearchEditText.setFocusableInTouchMode(true);
        this.ivDel.setOnClickListener(new i());
        this.mSearchEditText.addTextChangedListener(new j());
        this.mRefreshLayout.a(true);
        this.mRefreshLayout.S(new k());
        this.mRefreshLayout.f0(new l());
        showLoading();
        w4();
        i4(false);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22850, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f77764t.removeCallbacksAndMessages(null);
        super.onDestroyView();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22864, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        i4(false);
    }

    public String r() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22851, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        EditText editText = this.mSearchEditText;
        return editText != null ? editText.getText().toString() : "";
    }

    public void r4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22852, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        h4(str);
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.y.d
    public String w() {
        return this.f77750f == 1 ? com.max.xiaoheihe.module.bbs.adapter.y.f80743j : com.max.xiaoheihe.module.bbs.adapter.y.f80742i;
    }
}
