package com.max.xiaoheihe.module.trade;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.l0;
import androidx.compose.runtime.internal.o;
import androidx.constraintlayout.core.motion.utils.w;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import androidx.viewpager.widget.ViewPager;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbshare.bean.HBShareData;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.ShareInfoObj;
import com.max.xiaoheihe.bean.trade.TradeMallFollowInfo;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryObj;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryResult;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TradeItemSkuSlideActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class TradeItemSkuSlideActivity extends BaseActivity {

    @dl.d
    public static final a X = new a(null);
    public static final int Y = 8;
    public static final int Z = 0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f93010a0 = 1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f93011b0 = 2;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f93012c0 = 3;
    public static ChangeQuickRedirect changeQuickRedirect;
    private ViewPager L;

    @dl.e
    private String M;

    @dl.e
    private TradeMallFollowInfo N;
    private List<String> O;
    private int P;
    private int Q;

    @dl.e
    private HashMap<String, String> R;
    private int S;
    private int T;
    private boolean U;
    private boolean V;

    @dl.d
    private final UMShareListener W = new g();

    /* JADX INFO: compiled from: TradeItemSkuSlideActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.d Context context, @dl.d ArrayList<String> skuList, @dl.e String str, @dl.e String str2, @dl.e HashMap<String, String> map, int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, skuList, str, str2, map, new Integer(i10)}, this, changeQuickRedirect, false, 45402, new Class[]{Context.class, ArrayList.class, String.class, String.class, HashMap.class, Integer.TYPE}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            f0.p(skuList, "skuList");
            Intent intent = new Intent(context, (Class<?>) TradeItemSkuSlideActivity.class);
            intent.putStringArrayListExtra("sku_list", skuList);
            intent.putExtra(UCropPlusActivity.ARG_INDEX, str);
            intent.putExtra(w.c.R, str2);
            intent.putExtra("params", map);
            intent.putExtra("from", i10);
            return intent;
        }
    }

    /* JADX INFO: compiled from: TradeItemSkuSlideActivity.kt */
    @t0({"SMAP\nTradeItemSkuSlideActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeItemSkuSlideActivity.kt\ncom/max/xiaoheihe/module/trade/TradeItemSkuSlideActivity$getData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,235:1\n1549#2:236\n1620#2,3:237\n*S KotlinDebug\n*F\n+ 1 TradeItemSkuSlideActivity.kt\ncom/max/xiaoheihe/module/trade/TradeItemSkuSlideActivity$getData$1\n*L\n161#1:236\n161#1:237,3\n*E\n"})
    public static final class b extends com.max.hbcommon.network.d<Result<TradeSteamInventoryResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45403, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradeItemSkuSlideActivity.this.isActive()) {
                TradeItemSkuSlideActivity.this.V = false;
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<TradeSteamInventoryResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45404, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeItemSkuSlideActivity.this.isActive()) {
                List[] listArr = new List[1];
                TradeSteamInventoryResult result2 = result.getResult();
                ViewPager viewPager = null;
                listArr[0] = result2 != null ? result2.getList() : null;
                if (com.max.hbcommon.utils.c.w(listArr)) {
                    TradeItemSkuSlideActivity.this.U = true;
                } else {
                    List list = TradeItemSkuSlideActivity.this.O;
                    if (list == null) {
                        f0.S("mList");
                        list = null;
                    }
                    TradeSteamInventoryResult result3 = result.getResult();
                    ArrayList<TradeSteamInventoryObj> list2 = result3 != null ? result3.getList() : null;
                    f0.m(list2);
                    ArrayList arrayList = new ArrayList(t.Y(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((TradeSteamInventoryObj) it.next()).getSku_id());
                    }
                    list.addAll(arrayList);
                    ViewPager viewPager2 = TradeItemSkuSlideActivity.this.L;
                    if (viewPager2 == null) {
                        f0.S("vp");
                    } else {
                        viewPager = viewPager2;
                    }
                    androidx.viewpager.widget.a adapter = viewPager.getAdapter();
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                    }
                }
                TradeItemSkuSlideActivity.this.V = false;
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45405, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeSteamInventoryResult>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeItemSkuSlideActivity.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<TradeMallFollowInfo>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        public void onNext(@dl.d Result<TradeMallFollowInfo> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45406, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeItemSkuSlideActivity.this.isActive()) {
                TradeItemSkuSlideActivity.this.N = result.getResult();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45407, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeMallFollowInfo>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeItemSkuSlideActivity.kt */
    public static final class d extends ViewPager.l {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 45408, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            TradeItemSkuSlideActivity tradeItemSkuSlideActivity = TradeItemSkuSlideActivity.this;
            List list = tradeItemSkuSlideActivity.O;
            List list2 = null;
            if (list == null) {
                f0.S("mList");
                list = null;
            }
            tradeItemSkuSlideActivity.a2((String) list.get(i10));
            List list3 = TradeItemSkuSlideActivity.this.O;
            if (list3 == null) {
                f0.S("mList");
            } else {
                list2 = list3;
            }
            if (i10 < list2.size() - 3 || TradeItemSkuSlideActivity.this.U) {
                return;
            }
            TradeItemSkuSlideActivity.M1(TradeItemSkuSlideActivity.this);
        }
    }

    /* JADX INFO: compiled from: TradeItemSkuSlideActivity.kt */
    public static final class e extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        e(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45410, new Class[0], Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            List list = TradeItemSkuSlideActivity.this.O;
            if (list == null) {
                f0.S("mList");
                list = null;
            }
            return list.size();
        }

        @Override // androidx.fragment.app.n0
        @dl.d
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 45409, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(lb.a.f131077y3);
            sb2.append("sku_id=");
            List list = TradeItemSkuSlideActivity.this.O;
            if (list == null) {
                f0.S("mList");
                list = null;
            }
            sb2.append((String) list.get(i10));
            return new com.max.xiaoheihe.module.webview.u(sb2.toString()).p(WebviewFragment.U4).u(true).a();
        }
    }

    /* JADX INFO: compiled from: TradeItemSkuSlideActivity.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: TradeItemSkuSlideActivity.kt */
        public static final class a implements l0.e {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ TradeItemSkuSlideActivity f93018a;

            a(TradeItemSkuSlideActivity tradeItemSkuSlideActivity) {
                this.f93018a = tradeItemSkuSlideActivity;
            }

            @Override // androidx.appcompat.widget.l0.e
            public final boolean onMenuItemClick(MenuItem menuItem) {
                ShareInfoObj share_info;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{menuItem}, this, changeQuickRedirect, false, 45412, new Class[]{MenuItem.class}, Boolean.TYPE);
                if (patchProxyResultProxy.isSupported) {
                    return ((Boolean) patchProxyResultProxy.result).booleanValue();
                }
                if (menuItem.getItemId() == 0) {
                    TradeMallFollowInfo tradeMallFollowInfo = this.f93018a.N;
                    if (tradeMallFollowInfo != null && (share_info = tradeMallFollowInfo.getShare_info()) != null) {
                        TradeItemSkuSlideActivity tradeItemSkuSlideActivity = this.f93018a;
                        com.max.hbshare.d.E(((BaseActivity) tradeItemSkuSlideActivity).f66601b, new HBShareData(false, true, share_info.getShare_title(), share_info.getShare_desc(), share_info.getShare_url(), null, com.max.hbcommon.utils.c.u(share_info.getShare_img()) ? null : new UMImage(((BaseActivity) tradeItemSkuSlideActivity).f66601b, share_info.getShare_img()), tradeItemSkuSlideActivity.W, null, null, null, null, null, bb.c.k.L0, null));
                    }
                } else if (menuItem.getItemId() == 1) {
                    Activity activity = ((BaseActivity) this.f93018a).f66601b;
                    Activity mContext = ((BaseActivity) this.f93018a).f66601b;
                    f0.o(mContext, "mContext");
                    TradeMallFollowInfo tradeMallFollowInfo2 = this.f93018a.N;
                    f0.m(tradeMallFollowInfo2);
                    activity.startActivity(TradeInfoUtilKt.h(mContext, tradeMallFollowInfo2.getSpu_id()));
                }
                return true;
            }
        }

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45411, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            l0 l0Var = new l0(((BaseActivity) TradeItemSkuSlideActivity.this).f66601b, view);
            l0Var.d().add(0, 0, 0, "分享");
            TradeMallFollowInfo tradeMallFollowInfo = TradeItemSkuSlideActivity.this.N;
            String spu_id = tradeMallFollowInfo != null ? tradeMallFollowInfo.getSpu_id() : null;
            if (!(spu_id == null || spu_id.length() == 0)) {
                l0Var.d().add(0, 1, 0, "前往市场");
            }
            l0Var.k(new a(TradeItemSkuSlideActivity.this));
            l0Var.l();
        }
    }

    /* JADX INFO: compiled from: TradeItemSkuSlideActivity.kt */
    public static final class g implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(@dl.e SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(@dl.e SHARE_MEDIA share_media, @dl.d Throwable t10) {
            if (PatchProxy.proxy(new Object[]{share_media, t10}, this, changeQuickRedirect, false, 45414, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(t10, "t");
            com.max.hbutils.utils.c.f(TradeItemSkuSlideActivity.this.getString(R.string.share_fail));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(@dl.e SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 45413, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(TradeItemSkuSlideActivity.this.getString(R.string.share_success));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(@dl.e SHARE_MEDIA share_media) {
        }
    }

    public static final /* synthetic */ void M1(TradeItemSkuSlideActivity tradeItemSkuSlideActivity) {
        if (PatchProxy.proxy(new Object[]{tradeItemSkuSlideActivity}, null, changeQuickRedirect, true, 45401, new Class[]{TradeItemSkuSlideActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeItemSkuSlideActivity.Z1();
    }

    private final void Z1() {
        z<Result<TradeSteamInventoryResult>> zVarT6;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45397, new Class[0], Void.TYPE).isSupported || this.V) {
            return;
        }
        this.Q += 30;
        HashMap<String, String> map = this.R;
        if (map == null || map.isEmpty()) {
            this.R = new HashMap<>();
        }
        HashMap<String, String> map2 = this.R;
        f0.m(map2);
        map2.put("idonly", "1");
        int i10 = this.S;
        if (3 == i10) {
            zVarT6 = i.a().c8(this.R, this.Q, 30);
        } else if (i10 == 0) {
            zVarT6 = i.a().Eb(this.R, this.Q, 30);
        } else if (2 != i10) {
            return;
        } else {
            zVarT6 = i.a().t6(this.R, this.Q, 30);
        }
        this.V = true;
        V((io.reactivex.disposables.b) zVarT6.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void b2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45398, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ViewPager viewPager = this.L;
        List<String> list = null;
        if (viewPager == null) {
            f0.S("vp");
            viewPager = null;
        }
        viewPager.c(new d());
        ViewPager viewPager2 = this.L;
        if (viewPager2 == null) {
            f0.S("vp");
            viewPager2 = null;
        }
        viewPager2.setAdapter(new e(getSupportFragmentManager()));
        ViewPager viewPager3 = this.L;
        if (viewPager3 == null) {
            f0.S("vp");
            viewPager3 = null;
        }
        viewPager3.setCurrentItem(this.P);
        if (this.P == 0) {
            List<String> list2 = this.O;
            if (list2 == null) {
                f0.S("mList");
            } else {
                list = list2;
            }
            a2(list.get(0));
        }
    }

    private final void c2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45396, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66616q.a0();
        this.f66616q.setActionIcon(R.drawable.common_more);
        this.f66616q.setTitle("饰品详情");
        this.f66616q.setActionIconOnClickListener(new f());
    }

    public final void a2(@dl.d String sku_id) {
        if (PatchProxy.proxy(new Object[]{sku_id}, this, changeQuickRedirect, false, 45399, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(sku_id, "sku_id");
        V((io.reactivex.disposables.b) i.a().L8(sku_id).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45395, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_vp);
        View viewFindViewById = findViewById(R.id.vp);
        f0.o(viewFindViewById, "findViewById(R.id.vp)");
        this.L = (ViewPager) viewFindViewById;
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("sku_list");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new ArrayList<>();
        }
        this.O = stringArrayListExtra;
        this.P = n.q(getIntent().getStringExtra(UCropPlusActivity.ARG_INDEX));
        this.Q = n.q(getIntent().getStringExtra(w.c.R));
        this.S = getIntent().getIntExtra("from", 0);
        this.R = (HashMap) getIntent().getSerializableExtra("params");
        c2();
        b2();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45400, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(this).onActivityResult(i10, i11, intent);
    }
}
