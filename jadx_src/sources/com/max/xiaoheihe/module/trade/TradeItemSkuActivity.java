package com.max.xiaoheihe.module.trade;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.l0;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbshare.bean.HBShareData;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.ShareInfoObj;
import com.max.xiaoheihe.bean.trade.TradeMallFollowInfo;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TradeItemSkuActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class TradeItemSkuActivity extends BaseActivity {

    @dl.d
    public static final a R = new a(null);
    public static final int S = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private SlidingTabLayout M;

    @dl.e
    private ViewPager N;

    @dl.e
    private String O;

    @dl.e
    private TradeMallFollowInfo P;

    @dl.d
    private final ArrayList<Fragment> L = new ArrayList<>();

    @dl.d
    private final UMShareListener Q = new e();

    /* JADX INFO: compiled from: TradeItemSkuActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.d Context context, @dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 45386, new Class[]{Context.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) TradeItemSkuActivity.class);
            intent.putExtra("sku_id", str);
            return intent;
        }
    }

    /* JADX INFO: compiled from: TradeItemSkuActivity.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<TradeMallFollowInfo>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public void onNext(@dl.d Result<TradeMallFollowInfo> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45387, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeItemSkuActivity.this.isActive()) {
                TradeItemSkuActivity.this.P = result.getResult();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45388, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeMallFollowInfo>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeItemSkuActivity.kt */
    public static final class c extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        c(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45390, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : TradeItemSkuActivity.this.L.size();
        }

        @Override // androidx.fragment.app.n0
        @dl.d
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 45389, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            Object obj = TradeItemSkuActivity.this.L.get(i10);
            f0.o(obj, "mFragments[position]");
            return (Fragment) obj;
        }
    }

    /* JADX INFO: compiled from: TradeItemSkuActivity.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: TradeItemSkuActivity.kt */
        public static final class a implements l0.e {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ TradeItemSkuActivity f93008a;

            a(TradeItemSkuActivity tradeItemSkuActivity) {
                this.f93008a = tradeItemSkuActivity;
            }

            @Override // androidx.appcompat.widget.l0.e
            public final boolean onMenuItemClick(MenuItem menuItem) {
                ShareInfoObj share_info;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{menuItem}, this, changeQuickRedirect, false, 45392, new Class[]{MenuItem.class}, Boolean.TYPE);
                if (patchProxyResultProxy.isSupported) {
                    return ((Boolean) patchProxyResultProxy.result).booleanValue();
                }
                if (menuItem.getItemId() == 0) {
                    TradeMallFollowInfo tradeMallFollowInfo = this.f93008a.P;
                    if (tradeMallFollowInfo != null && (share_info = tradeMallFollowInfo.getShare_info()) != null) {
                        TradeItemSkuActivity tradeItemSkuActivity = this.f93008a;
                        com.max.hbshare.d.E(((BaseActivity) tradeItemSkuActivity).f66601b, new HBShareData(false, true, share_info.getShare_title(), share_info.getShare_desc(), share_info.getShare_url(), null, com.max.hbcommon.utils.c.u(share_info.getShare_img()) ? null : new UMImage(((BaseActivity) tradeItemSkuActivity).f66601b, share_info.getShare_img()), tradeItemSkuActivity.Q, null, null, null, null, null, bb.c.k.L0, null));
                    }
                } else if (menuItem.getItemId() == 1) {
                    Activity activity = ((BaseActivity) this.f93008a).f66601b;
                    Activity mContext = ((BaseActivity) this.f93008a).f66601b;
                    f0.o(mContext, "mContext");
                    TradeMallFollowInfo tradeMallFollowInfo2 = this.f93008a.P;
                    f0.m(tradeMallFollowInfo2);
                    activity.startActivity(TradeInfoUtilKt.h(mContext, tradeMallFollowInfo2.getSpu_id()));
                }
                return true;
            }
        }

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45391, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            l0 l0Var = new l0(((BaseActivity) TradeItemSkuActivity.this).f66601b, view);
            l0Var.d().add(0, 0, 0, "分享");
            TradeMallFollowInfo tradeMallFollowInfo = TradeItemSkuActivity.this.P;
            String spu_id = tradeMallFollowInfo != null ? tradeMallFollowInfo.getSpu_id() : null;
            if (!(spu_id == null || spu_id.length() == 0)) {
                l0Var.d().add(0, 1, 0, "前往市场");
            }
            l0Var.k(new a(TradeItemSkuActivity.this));
            l0Var.l();
        }
    }

    /* JADX INFO: compiled from: TradeItemSkuActivity.kt */
    public static final class e implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(@dl.e SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(@dl.e SHARE_MEDIA share_media, @dl.d Throwable t10) {
            if (PatchProxy.proxy(new Object[]{share_media, t10}, this, changeQuickRedirect, false, 45394, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(t10, "t");
            com.max.hbutils.utils.c.f(TradeItemSkuActivity.this.getString(R.string.share_fail));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(@dl.e SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 45393, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(TradeItemSkuActivity.this.getString(R.string.share_success));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(@dl.e SHARE_MEDIA share_media) {
        }
    }

    private final void X1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45384, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.L.clear();
        this.L.add(new com.max.xiaoheihe.module.webview.u(lb.a.f131077y3 + "sku_id=" + this.O).p(WebviewFragment.U4).u(true).a());
        ViewPager viewPager = this.N;
        if (viewPager != null) {
            viewPager.setAdapter(new c(getSupportFragmentManager()));
        }
        SlidingTabLayout slidingTabLayout = this.M;
        if (slidingTabLayout != null) {
            slidingTabLayout.setViewPager(this.N, new String[]{"饰品详情"});
        }
        SlidingTabLayout slidingTabLayout2 = this.M;
        if (slidingTabLayout2 != null) {
            slidingTabLayout2.setCurrentTab(0);
        }
    }

    private final void Y1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45382, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66616q.a0();
        this.f66616q.setActionIcon(R.drawable.common_more);
        this.f66616q.setActionIconOnClickListener(new d());
    }

    @dl.e
    public final SlidingTabLayout T1() {
        return this.M;
    }

    public final void V1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45383, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) i.a().L8(this.O).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    @dl.e
    public final ViewPager W1() {
        return this.N;
    }

    public final void Z1(@dl.e SlidingTabLayout slidingTabLayout) {
        this.M = slidingTabLayout;
    }

    public final void a2(@dl.e ViewPager viewPager) {
        this.N = viewPager;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45381, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_vp);
        this.N = (ViewPager) findViewById(R.id.vp);
        this.O = getIntent().getStringExtra("sku_id");
        Y1();
        this.M = this.f66616q.getTitleTabLayout();
        X1();
        V1();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45385, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(this).onActivityResult(i10, i11, intent);
    }
}
