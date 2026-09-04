package com.max.xiaoheihe.module.news;

import android.animation.ArgbEvaluator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.p0;
import androidx.core.content.res.i;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import androidx.lifecycle.j0;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.JsonObject;
import com.max.hbcommon.analytics.m;
import com.max.hbcustomview.CanSetScrollViewPager;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.t;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.account.tab.TabKeyObj;
import com.max.xiaoheihe.bean.ads.OverallAdInfo;
import com.max.xiaoheihe.module.game.GameCenterActivity;
import com.max.xiaoheihe.module.search.SearchHelper;
import com.max.xiaoheihe.utils.c0;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.e70;
import df.lz;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
@m(path = lb.d.f131204m)
public class DiscoveryFragment extends com.max.hbcommon.base.d implements com.max.xiaoheihe.view.callback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f91187j = "pages";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String[] f91189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.viewpager.widget.a f91190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private NewMsgBroadcastReceiver f91191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f91192f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private e70 f91194h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f91188b = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f91193g = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View.OnClickListener f91195i = new a();

    public class NewMsgBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private NewMsgBroadcastReceiver() {
        }

        /* synthetic */ NewMsgBroadcastReceiver(DiscoveryFragment discoveryFragment, a aVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 42445, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            String action = intent.getAction();
            if (lb.a.f131025q.equals(action)) {
                DiscoveryFragment.R3(DiscoveryFragment.this);
                return;
            }
            if (lb.a.F.equals(action)) {
                MainActivity.O3(DiscoveryFragment.this.f91194h.f110058b.f113176g, DiscoveryFragment.this.f91194h.f110058b.f113172c);
                return;
            }
            if ("com.max.xiaoheihe.news.gotop".equals(action)) {
                DiscoveryFragment.this.D3();
            } else if (lb.a.f131031r.equals(action)) {
                DiscoveryFragment.O3(DiscoveryFragment.this, true);
            } else if (lb.a.f131037s.equals(action)) {
                DiscoveryFragment.O3(DiscoveryFragment.this, false);
            }
        }
    }

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42432, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.x0(((com.max.hbcommon.base.d) DiscoveryFragment.this).mContext, SearchHelper.c().e("main")).A();
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42433, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.R1(((com.max.hbcommon.base.d) DiscoveryFragment.this).mContext);
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42434, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MainActivity.f76157j5 = MainActivity.f76155i5;
            com.max.hbcache.c.C("mobile_tap_time", String.valueOf(MainActivity.f76155i5));
            ((com.max.hbcommon.base.d) DiscoveryFragment.this).mContext.sendBroadcast(new Intent(lb.a.F));
            DiscoveryFragment discoveryFragment = DiscoveryFragment.this;
            discoveryFragment.startActivity(GameCenterActivity.N1(((com.max.hbcommon.base.d) discoveryFragment).mContext, GameCenterActivity.V));
        }
    }

    public class d extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        d(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42436, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : c0.a().getLegalKeyNum();
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 42435, new Class[]{Integer.TYPE}, Fragment.class);
            return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : c0.c(c0.a().getLegalEntry(i10).getKey(), DiscoveryFragment.this.f91189c);
        }

        @Override // androidx.viewpager.widget.a
        @p0
        public CharSequence getPageTitle(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 42437, new Class[]{Integer.TYPE}, CharSequence.class);
            return patchProxyResultProxy.isSupported ? (CharSequence) patchProxyResultProxy.result : c0.a().getLegalEntry(i10).getTitle();
        }
    }

    public class e implements j0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void c(View view) {
            if (PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 42440, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            HeyBoxApplication.f76798t.r(Boolean.FALSE);
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 42439, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            d(bool);
        }

        public void d(Boolean bool) {
            if (!PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 42438, new Class[]{Boolean.class}, Void.TYPE).isSupported && DiscoveryFragment.this.f91194h.f110059c.getCurrentItem() == DiscoveryFragment.this.f91192f) {
                if (!bool.booleanValue()) {
                    DiscoveryFragment.this.f91194h.f110059c.setNoScroll(false);
                    DiscoveryFragment.this.f91194h.f110058b.f113179j.setVisibility(0);
                    DiscoveryFragment.this.f91194h.f110058b.f113183n.setVisibility(8);
                } else {
                    DiscoveryFragment.this.f91194h.f110059c.setNoScroll(true);
                    DiscoveryFragment.this.f91194h.f110058b.f113179j.setVisibility(8);
                    DiscoveryFragment.this.f91194h.f110058b.f113183n.setVisibility(0);
                    DiscoveryFragment.this.f91194h.f110058b.f113183n.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.news.e
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DiscoveryFragment.e.c(view);
                        }
                    });
                }
            }
        }
    }

    public class f extends ViewPager.l {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f91202b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f91203c = 0.0f;

        f() {
        }

        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
        public void onPageScrolled(int i10, float f10, int i11) {
            Object[] objArr = {new Integer(i10), new Float(f10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42442, new Class[]{cls, Float.TYPE, cls}, Void.TYPE).isSupported) {
                return;
            }
            TabLayout.h hVarD = DiscoveryFragment.this.f91194h.f110058b.f113179j.D(i10);
            float f11 = 0.1f * f10;
            TabLayout.h hVarD2 = i11 > 0 ? DiscoveryFragment.this.f91194h.f110058b.f113179j.D(i10 + 1) : DiscoveryFragment.this.f91194h.f110058b.f113179j.D(i10 - 1);
            if (hVarD != null && hVarD2 != null && f11 > 0.0f) {
                float f12 = this.f91203c;
                if (f12 > f10 || ((f12 == 0.0f && f10 > 0.5f) || f10 > 0.01d)) {
                    DiscoveryFragment.b4(DiscoveryFragment.this, hVarD, f11);
                    DiscoveryFragment.b4(DiscoveryFragment.this, hVarD2, -f11);
                }
            }
            this.f91203c = f10;
            if (f10 != 0.0f || !this.f91202b) {
                if (f10 == 0.0f) {
                    DiscoveryFragment.P3(DiscoveryFragment.this);
                }
            } else {
                if (DiscoveryFragment.this.f91194h.f110058b.f113179j.D(i10) != null && DiscoveryFragment.this.f91188b) {
                    DiscoveryFragment.this.D3();
                }
                DiscoveryFragment.O3(DiscoveryFragment.this, false);
                DiscoveryFragment.P3(DiscoveryFragment.this);
                this.f91202b = false;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 42441, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (i10 == DiscoveryFragment.this.f91192f) {
                this.f91202b = true;
            } else if (i10 == DiscoveryFragment.this.f91193g) {
                com.max.hbcache.c.z("hot_news_dot_shown", "1");
            }
        }
    }

    public class g implements l0.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.xiaoheihe.utils.l0.g
        public void a() {
            OverallAdInfo overallAdInfo;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42443, new Class[0], Void.TYPE).isSupported || (overallAdInfo = com.max.xiaoheihe.module.ads.e.f79474b) == null) {
                return;
            }
            if (overallAdInfo.getHome_corner_ad() != null) {
                com.max.xiaoheihe.module.ads.e.b(DiscoveryFragment.this.f91194h, ((com.max.hbcommon.base.d) DiscoveryFragment.this).mContext);
            }
            if (com.max.xiaoheihe.module.ads.e.f79474b.getBubble_ad() != null) {
                com.max.xiaoheihe.module.ads.e.j();
            }
        }
    }

    public static class h implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<DiscoveryFragment> f91206b;

        public h(DiscoveryFragment discoveryFragment) {
            this.f91206b = new WeakReference<>(discoveryFragment);
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragment discoveryFragment;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42444, new Class[0], Void.TYPE).isSupported || (discoveryFragment = this.f91206b.get()) == null) {
                return;
            }
            if (!DiscoveryFragment.S3(discoveryFragment)) {
                discoveryFragment.f91194h.f110059c.postDelayed(this, 500L);
            } else if (((com.max.hbcommon.base.d) discoveryFragment).mContext instanceof MainActivity) {
                ((MainActivity) ((com.max.hbcommon.base.d) discoveryFragment).mContext).a3();
            }
        }
    }

    static /* synthetic */ void O3(DiscoveryFragment discoveryFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{discoveryFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 42428, new Class[]{DiscoveryFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        discoveryFragment.l4(z10);
    }

    static /* synthetic */ void P3(DiscoveryFragment discoveryFragment) {
        if (PatchProxy.proxy(new Object[]{discoveryFragment}, null, changeQuickRedirect, true, 42429, new Class[]{DiscoveryFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        discoveryFragment.n4();
    }

    static /* synthetic */ void R3(DiscoveryFragment discoveryFragment) {
        if (PatchProxy.proxy(new Object[]{discoveryFragment}, null, changeQuickRedirect, true, 42430, new Class[]{DiscoveryFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        discoveryFragment.m4();
    }

    static /* synthetic */ boolean S3(DiscoveryFragment discoveryFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{discoveryFragment}, null, changeQuickRedirect, true, 42431, new Class[]{DiscoveryFragment.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : i4(discoveryFragment);
    }

    static /* synthetic */ void b4(DiscoveryFragment discoveryFragment, TabLayout.h hVar, float f10) {
        if (PatchProxy.proxy(new Object[]{discoveryFragment, hVar, new Float(f10)}, null, changeQuickRedirect, true, 42427, new Class[]{DiscoveryFragment.class, TabLayout.h.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        discoveryFragment.o4(hVar, f10);
    }

    private int f4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42412, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        for (int i10 = 0; i10 < c0.a().getLegalKeyNum(); i10++) {
            if ("/home/rank".equals(c0.a().getLegalEntry(i10).getKey())) {
                return i10;
            }
        }
        return -1;
    }

    private int g4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42414, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String strP3 = MainActivity.p3(this.f91189c, 0);
        if (strP3 == null) {
            strP3 = c0.a().getDefault_checked_key();
        }
        return Math.max(0, c0.i(strP3)[1].intValue());
    }

    private View h4(final int i10, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 42422, new Class[]{Integer.TYPE, Boolean.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = this.mInflater.inflate(R.layout.item_timeline_tab, (ViewGroup) null);
        p4(viewInflate, i10, z10);
        if (!ad.a.a(ad.a.H, false)) {
            viewInflate.setOnTouchListener(new View.OnTouchListener() { // from class: com.max.xiaoheihe.module.news.d
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f91320b.j4(i10, view, motionEvent);
                }
            });
        }
        return viewInflate;
    }

    private static boolean i4(DiscoveryFragment discoveryFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{discoveryFragment}, null, changeQuickRedirect, true, 42423, new Class[]{DiscoveryFragment.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        ArrayList<View> arrayList = new ArrayList<>();
        discoveryFragment.f91194h.f110059c.findViewsWithText(arrayList, com.max.xiaoheihe.utils.d.n0(R.string.loading_view_content_desc), 2);
        for (View view : arrayList) {
            if (view != null && ViewUtils.f0(view)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean j4(int i10, View view, MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), view, motionEvent}, this, changeQuickRedirect, false, 42426, new Class[]{Integer.TYPE, View.class, MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this.f91194h.f110059c.getCurrentItem() != i10) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            D3();
            if (Objects.equals(e4(), "/bbs/recommend")) {
                MainActivity.I4 = true;
            }
            view.performClick();
            TabKeyObj legalEntry = c0.a() != null ? c0.a().getLegalEntry(this.f91194h.f110059c.getCurrentItem()) : null;
            String title = legalEntry == null ? "" : legalEntry.getTitle();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("tab_title", title);
            jsonObject.addProperty("page", lb.d.f131204m);
            com.max.hbcommon.analytics.d.d("4", lb.d.f131162g, null, jsonObject);
        }
        return true;
    }

    public static DiscoveryFragment k4(String[] strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{strArr}, null, changeQuickRedirect, true, 42410, new Class[]{String[].class}, DiscoveryFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (DiscoveryFragment) patchProxyResultProxy.result;
        }
        DiscoveryFragment discoveryFragment = new DiscoveryFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArray("pages", strArr);
        discoveryFragment.setArguments(bundle);
        return discoveryFragment;
    }

    private void l4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 42419, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || z10 == this.f91188b) {
            return;
        }
        this.f91188b = z10;
        if (!z10) {
            com.max.hbcache.c.C(com.max.hbcache.c.f66142q, null);
        }
        n4();
    }

    private void m4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42416, new Class[0], Void.TYPE).isSupported || this.f91194h.f110058b.f113177h == null) {
            return;
        }
        if (i0.s() && com.max.hbcache.c.v()) {
            this.f91194h.f110058b.f113177h.setVisibility(0);
        } else {
            this.f91194h.f110058b.f113177h.setVisibility(8);
        }
    }

    private void n4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42420, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int i10 = 0;
        while (i10 < this.f91194h.f110058b.f113179j.getTabCount()) {
            TabLayout.h hVarD = this.f91194h.f110058b.f113179j.D(i10);
            if (hVarD != null) {
                hVarD.v(p4(hVarD.g(), i10, this.f91194h.f110059c.getCurrentItem() == i10));
            }
            i10++;
        }
    }

    private void o4(TabLayout.h hVar, float f10) {
        View viewG;
        if (PatchProxy.proxy(new Object[]{hVar, new Float(f10)}, this, changeQuickRedirect, false, 42413, new Class[]{TabLayout.h.class, Float.TYPE}, Void.TYPE).isSupported || (viewG = hVar.g()) == null) {
            return;
        }
        int iE = ic.a.f119343a.e(viewG) / 2;
        TextView textView = (TextView) viewG.findViewById(R.id.tv_tab_name);
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        if (f10 > 0.0f) {
            int iIntValue = ((Integer) argbEvaluator.evaluate(10.0f * f10, Integer.valueOf(getResources().getColor(R.color.text_primary_1_color)), Integer.valueOf(getResources().getColor(R.color.text_primary_2_color)))).intValue();
            if (textView != null) {
                textView.setTextSize(1, (1.0f - (f10 * 2.0f)) * 20.0f);
                textView.setTextColor(iIntValue);
                textView.requestLayout();
                return;
            }
            return;
        }
        int iIntValue2 = ((Integer) argbEvaluator.evaluate(1.0f - ((-10.0f) * f10), Integer.valueOf(getResources().getColor(R.color.text_primary_1_color)), Integer.valueOf(getResources().getColor(R.color.text_primary_2_color)))).intValue();
        if (textView != null) {
            textView.setTextSize(1, (0.8f - (f10 * 2.0f)) * 20.0f);
            textView.setTextColor(iIntValue2);
            textView.requestLayout();
        }
    }

    private View p4(View view, int i10, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 42421, new Class[]{View.class, Integer.TYPE, Boolean.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (view == null) {
            return null;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_tab_avatar);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_tab_dot);
        TextView textView = (TextView) view.findViewById(R.id.tv_tab_name);
        RelativeLayout.LayoutParams layoutParams = imageView2.getLayoutParams() instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) imageView2.getLayoutParams() : null;
        int i11 = com.max.hbresource.a.f71894b;
        if (z10) {
            i11 = com.max.hbresource.a.f71895c;
        }
        textView.setTypeface(com.max.hbresource.a.f71893a.a(i11));
        String strO = com.max.hbcache.c.o(com.max.hbcache.c.f66142q, null);
        CharSequence pageTitle = this.f91190d.getPageTitle(i10);
        if (z10) {
            textView.setVisibility(0);
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
            textView.setText(pageTitle);
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(i.e(getResources(), R.color.text_primary_1_color, null));
        } else if (this.f91192f != i10) {
            textView.setVisibility(0);
            imageView.setVisibility(8);
            if (i10 != this.f91193g || com.max.hbcommon.utils.c.x(com.max.hbcache.c.j("hot_news_dot_shown"))) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                if (layoutParams != null) {
                    layoutParams.addRule(6, R.id.tv_tab_name);
                }
            }
            textView.setText(pageTitle);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(i.e(getResources(), R.color.text_primary_2_color, null));
        } else if (!this.f91188b) {
            textView.setVisibility(0);
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
            textView.setText(pageTitle);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(i.e(getResources(), R.color.text_primary_2_color, null));
        } else if (strO != null) {
            imageView.setVisibility(0);
            textView.setVisibility(8);
            com.max.hbimage.b.H(strO, imageView);
            imageView2.setVisibility(0);
            if (layoutParams != null) {
                layoutParams.addRule(6, R.id.iv_tab_avatar);
            }
        } else {
            textView.setVisibility(0);
            imageView.setVisibility(8);
            textView.setText(pageTitle);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(i.e(getResources(), R.color.text_primary_2_color, null));
            imageView2.setVisibility(0);
            if (layoutParams != null) {
                layoutParams.addRule(6, R.id.tv_tab_name);
            }
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        }
        layoutParams2.width = -2;
        layoutParams2.height = -1;
        view.setLayoutParams(layoutParams2);
        return view;
    }

    @Override // com.max.xiaoheihe.view.callback.a
    public void D3() {
        CanSetScrollViewPager canSetScrollViewPager;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42418, new Class[0], Void.TYPE).isSupported || (canSetScrollViewPager = this.f91194h.f110059c) == null) {
            return;
        }
        Object objInstantiateItem = this.f91190d.instantiateItem((ViewGroup) canSetScrollViewPager, canSetScrollViewPager.getCurrentItem());
        if (objInstantiateItem instanceof com.max.xiaoheihe.view.callback.a) {
            ((com.max.xiaoheihe.view.callback.a) objInstantiateItem).D3();
        }
    }

    public void d4(String[] strArr) {
        CanSetScrollViewPager canSetScrollViewPager;
        if (PatchProxy.proxy(new Object[]{strArr}, this, changeQuickRedirect, false, 42415, new Class[]{String[].class}, Void.TYPE).isSupported || (canSetScrollViewPager = this.f91194h.f110059c) == null) {
            return;
        }
        this.f91189c = strArr;
        canSetScrollViewPager.setCurrentItem(g4());
    }

    public String e4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42424, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            return c0.a().getLegalEntry(this.f91194h.f110059c.getCurrentItem()).getKey();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42411, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        e70 e70VarC = e70.c(this.mInflater);
        this.f91194h = e70VarC;
        setContentView(e70VarC);
        a aVar = null;
        t.c(t.n(this.mContext), (ViewGroup) view, null);
        this.f91193g = f4();
        if (getArguments() != null) {
            this.f91189c = getArguments().getStringArray("pages");
        }
        m4();
        lz lzVar = this.f91194h.f110058b;
        MainActivity.O3(lzVar.f113176g, lzVar.f113172c);
        this.f91194h.f110058b.f113175f.setOnClickListener(this.f91195i);
        this.f91194h.f110058b.f113173d.setOnClickListener(new b());
        this.f91194h.f110058b.f113172c.setOnClickListener(new c());
        this.f91192f = 0;
        this.f91190d = new d(getChildFragmentManager());
        this.f91194h.f110059c.h();
        this.f91194h.f110059c.setAdapter(this.f91190d);
        this.f91194h.f110059c.setOffscreenPageLimit(3);
        e70 e70Var = this.f91194h;
        e70Var.f110058b.f113179j.setupWithViewPager(e70Var.f110059c);
        for (int i10 = 0; i10 < this.f91194h.f110058b.f113179j.getTabCount(); i10++) {
            TabLayout.h hVarD = this.f91194h.f110058b.f113179j.D(i10);
            if (hVarD != null) {
                hVarD.f55494i.setLongClickable(false);
                if (Build.VERSION.SDK_INT >= 26) {
                    hVarD.f55494i.setTooltipText("");
                }
                if (i10 == 1) {
                    hVarD.v(h4(i10, true));
                } else {
                    hVarD.v(h4(i10, false));
                }
            }
        }
        this.f91194h.f110059c.setNoScroll(false);
        HeyBoxApplication.f76798t.k(getViewLifecycleOwner(), new e());
        this.f91194h.f110059c.c(new f());
        d4(this.f91189c);
        this.f91191e = new NewMsgBroadcastReceiver(this, aVar);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.max.xiaoheihe.news.gotop");
        intentFilter.addAction(lb.a.f131025q);
        intentFilter.addAction(lb.a.F);
        intentFilter.addAction(lb.a.f131031r);
        intentFilter.addAction(lb.a.f131037s);
        registerReceiver(this.f91191e, intentFilter);
        com.max.xiaoheihe.module.ads.e.c(new g());
        this.f91194h.f110059c.postDelayed(new h(this), 500L);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42425, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f91190d = null;
        if (ad.a.d()) {
            this.f91191e = null;
        }
        super.onDestroy();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42417, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        unregisterReceiver(this.f91191e);
    }
}
