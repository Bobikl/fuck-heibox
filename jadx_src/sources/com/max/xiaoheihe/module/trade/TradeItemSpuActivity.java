package com.max.xiaoheihe.module.trade;

import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.component.TitleBar;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TradeItemSpuActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class TradeItemSpuActivity extends BaseActivity {

    @dl.d
    public static final a Q = new a(null);
    public static final int R = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private SlidingTabLayout M;

    @dl.e
    private ViewPager N;

    @dl.e
    private String O;

    @dl.d
    private final ArrayList<Fragment> L = new ArrayList<>();

    @dl.d
    private final UMShareListener P = new d();

    /* JADX INFO: compiled from: TradeItemSpuActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.d Context context, @dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 45420, new Class[]{Context.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) TradeItemSpuActivity.class);
            intent.putExtra("spu_id", str);
            return intent;
        }
    }

    /* JADX INFO: compiled from: TradeItemSpuActivity.kt */
    public static final class b extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45422, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : TradeItemSpuActivity.this.L.size();
        }

        @Override // androidx.fragment.app.n0
        @dl.d
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 45421, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            Object obj = TradeItemSpuActivity.this.L.get(i10);
            f0.o(obj, "mFragments[position]");
            return (Fragment) obj;
        }
    }

    /* JADX INFO: compiled from: TradeItemSpuActivity.kt */
    public static final class c extends WebviewFragment.o0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void g(@dl.e WebView webView, @dl.e String str, int i10, int i11) {
            Object[] objArr = {webView, str, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45423, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            Matcher matcher = Pattern.compile("#spu_id=(\\d+)").matcher(str);
            if (matcher.find()) {
                String new_spu_id = matcher.group(1);
                if (f0.g(TradeItemSpuActivity.this.O, new_spu_id)) {
                    return;
                }
                TradeItemSpuActivity tradeItemSpuActivity = TradeItemSpuActivity.this;
                f0.o(new_spu_id, "new_spu_id");
                TradeItemSpuActivity.O1(tradeItemSpuActivity, new_spu_id);
            }
        }
    }

    /* JADX INFO: compiled from: TradeItemSpuActivity.kt */
    public static final class d implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(@dl.e SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(@dl.e SHARE_MEDIA share_media, @dl.d Throwable t10) {
            if (PatchProxy.proxy(new Object[]{share_media, t10}, this, changeQuickRedirect, false, 45425, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(t10, "t");
            com.max.hbutils.utils.c.f(TradeItemSpuActivity.this.getString(R.string.share_fail));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(@dl.e SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 45424, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(TradeItemSpuActivity.this.getString(R.string.share_success));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(@dl.e SHARE_MEDIA share_media) {
        }
    }

    public static final /* synthetic */ void O1(TradeItemSpuActivity tradeItemSpuActivity, String str) {
        if (PatchProxy.proxy(new Object[]{tradeItemSpuActivity, str}, null, changeQuickRedirect, true, 45419, new Class[]{TradeItemSpuActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeItemSpuActivity.V1(str);
    }

    private final void T1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45416, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.L.clear();
        WebviewFragment webviewFragmentA = new com.max.xiaoheihe.module.webview.u(lb.a.f131065w3 + "spu_id=" + this.O).p(WebviewFragment.U4).u(true).a();
        WebviewFragment webviewFragmentA2 = new com.max.xiaoheihe.module.webview.u(lb.a.f131071x3 + "spu_id=" + this.O).p(WebviewFragment.U4).u(true).a();
        webviewFragmentA.Q7(true);
        webviewFragmentA2.Q7(true);
        c cVar = new c();
        webviewFragmentA.Y7(cVar);
        webviewFragmentA2.Y7(cVar);
        this.L.add(webviewFragmentA);
        if ("1".equals(com.max.hbcache.c.j("has_trading_report"))) {
            this.L.add(webviewFragmentA2);
        }
        ViewPager viewPager = this.N;
        if (viewPager != null) {
            viewPager.setAdapter(new b(getSupportFragmentManager()));
        }
        SlidingTabLayout slidingTabLayout = this.M;
        if (slidingTabLayout != null) {
            slidingTabLayout.setViewPager(this.N, "1".equals(com.max.hbcache.c.j("has_trading_report")) ? new String[]{"饰品详情", "成交数据"} : new String[]{"饰品详情"});
        }
        SlidingTabLayout slidingTabLayout2 = this.M;
        if (slidingTabLayout2 != null) {
            slidingTabLayout2.setCurrentTab(0);
        }
    }

    private final void V1(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 45417, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.O = str;
        UMShareListener uMShareListener = this.P;
        TitleBar mTitleBar = this.f66616q;
        f0.o(mTitleBar, "mTitleBar");
        String str2 = this.O;
        f0.m(str2);
        TradeInfoUtilKt.l(this, uMShareListener, mTitleBar, str2, "spu");
        int i10 = 0;
        for (Fragment fragment : this.L) {
            int i11 = i10 + 1;
            ViewPager viewPager = this.N;
            if (!(viewPager != null && i10 == viewPager.getCurrentItem()) && (fragment instanceof WebviewFragment)) {
                ((WebviewFragment) fragment).H6("window.resetPage(" + str + ')', null);
            }
            i10 = i11;
        }
    }

    @dl.e
    public final SlidingTabLayout Q1() {
        return this.M;
    }

    @dl.e
    public final ViewPager R1() {
        return this.N;
    }

    public final void W1(@dl.e SlidingTabLayout slidingTabLayout) {
        this.M = slidingTabLayout;
    }

    public final void X1(@dl.e ViewPager viewPager) {
        this.N = viewPager;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45415, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_vp);
        this.N = (ViewPager) findViewById(R.id.vp);
        this.O = getIntent().getStringExtra("spu_id");
        this.f66616q.a0();
        UMShareListener uMShareListener = this.P;
        TitleBar mTitleBar = this.f66616q;
        f0.o(mTitleBar, "mTitleBar");
        String str = this.O;
        f0.m(str);
        TradeInfoUtilKt.l(this, uMShareListener, mTitleBar, str, "spu");
        this.M = this.f66616q.getTitleTabLayout();
        T1();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45418, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(this).onActivityResult(i10, i11, intent);
    }
}
