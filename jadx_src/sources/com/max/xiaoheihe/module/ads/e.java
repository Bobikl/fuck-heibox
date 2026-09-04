package com.max.xiaoheihe.module.ads;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.p0;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.component.bubble.BubbleTipPopup;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.k;
import com.max.hbutils.utils.n;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.ads.BubbleAdContent;
import com.max.xiaoheihe.bean.ads.BubbleAdInfo;
import com.max.xiaoheihe.bean.ads.BubbleTimestampObj;
import com.max.xiaoheihe.bean.ads.CornerAdObj;
import com.max.xiaoheihe.bean.ads.OverallAdInfo;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.l0;
import com.max.xiaoheihe.utils.viewprioritymanager.ViewPriority;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.e70;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: OverallAdsManager.java */
/* JADX INFO: loaded from: classes9.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static OverallAdInfo f79474b;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f79473a = Boolean.FALSE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private static WeakReference<ViewGroup> f79475c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private static WeakReference<BubbleTipPopup> f79476d = null;

    /* JADX INFO: compiled from: OverallAdsManager.java */
    public class a extends com.max.hbcommon.network.d<Result<OverallAdInfo>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ OverallAdInfo f79477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l0.g f79478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f79479d;

        a(OverallAdInfo overallAdInfo, l0.g gVar, String str) {
            this.f79477b = overallAdInfo;
            this.f79478c = gVar;
            this.f79479d = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 25607, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            e.f79474b = this.f79477b;
            this.f79478c.a();
        }

        public void onNext(Result<OverallAdInfo> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 25608, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            if (result.getResult() == null || result.getResult().getNow_identification() == null || result.getResult().getNow_identification().equals(this.f79479d)) {
                e.f79474b = this.f79477b;
            } else {
                OverallAdInfo result2 = result.getResult();
                e.f79474b = result2;
                com.max.hbcache.c.C(com.max.hbcache.c.f66141p0, k.p(result2));
            }
            this.f79478c.a();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25609, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<OverallAdInfo>) obj);
        }
    }

    /* JADX INFO: compiled from: OverallAdsManager.java */
    public class b implements l0.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.xiaoheihe.utils.l0.g
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25610, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            e.j();
        }
    }

    /* JADX INFO: compiled from: OverallAdsManager.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BubbleTipPopup f79480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewGroup f79481c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f79482d;

        c(BubbleTipPopup bubbleTipPopup, ViewGroup viewGroup, String str) {
            this.f79480b = bubbleTipPopup;
            this.f79481c = viewGroup;
            this.f79482d = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25611, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f79480b.G();
            this.f79481c.setVisibility(8);
            com.max.hbcache.c.z(this.f79482d, "1");
        }
    }

    /* JADX INFO: compiled from: OverallAdsManager.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BubbleAdContent f79483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BubbleTipPopup f79484c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ViewGroup f79485d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f79486e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ BaseActivity f79487f;

        d(BubbleAdContent bubbleAdContent, BubbleTipPopup bubbleTipPopup, ViewGroup viewGroup, String str, BaseActivity baseActivity) {
            this.f79483b = bubbleAdContent;
            this.f79484c = bubbleTipPopup;
            this.f79485d = viewGroup;
            this.f79486e = str;
            this.f79487f = baseActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25612, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.k.b(this.f79483b.getAd_report());
            this.f79484c.G();
            this.f79485d.setVisibility(8);
            com.max.hbcache.c.z(this.f79486e, "1");
            if (com.max.hbcommon.utils.c.u(this.f79483b.getProtocol())) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f79487f, this.f79483b.getProtocol());
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.ads.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: OverallAdsManager.java */
    public class ViewOnClickListenerC0664e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CornerAdObj f79488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f79489c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e70 f79490d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f79491e;

        ViewOnClickListenerC0664e(CornerAdObj cornerAdObj, String str, e70 e70Var, Context context) {
            this.f79488b = cornerAdObj;
            this.f79489c = str;
            this.f79490d = e70Var;
            this.f79491e = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25613, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.k.b(this.f79488b.getAd_report());
            com.max.hbcache.c.z(this.f79489c, "1");
            this.f79490d.f110058b.f113178i.setVisibility(8);
            if (com.max.hbcommon.utils.c.u(this.f79488b.getProtocol())) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f79491e, this.f79488b.getProtocol());
        }
    }

    /* JADX INFO: compiled from: OverallAdsManager.java */
    public interface f {
        void a(BubbleAdContent bubbleAdContent);
    }

    public static void b(e70 e70Var, Context context) {
        if (PatchProxy.proxy(new Object[]{e70Var, context}, null, changeQuickRedirect, true, 25605, new Class[]{e70.class, Context.class}, Void.TYPE).isSupported) {
            return;
        }
        if (f79474b.getHome_corner_ad() == null) {
            e70Var.f110058b.f113182m.setVisibility(8);
            return;
        }
        CornerAdObj home_corner_ad = f79474b.getHome_corner_ad();
        String str = com.max.hbcache.c.f66133l0 + home_corner_ad.getIdea_id();
        if (!"1".equals(com.max.hbcache.c.j(str))) {
            e70Var.f110058b.f113178i.setVisibility(0);
        }
        if (!com.max.hbcommon.utils.c.u(home_corner_ad.getBorder_color())) {
            e70Var.f110058b.f113178i.setBorderColor(com.max.xiaoheihe.utils.d.e1(home_corner_ad.getBorder_color()));
            e70Var.f110058b.f113171b.setBorderColor(com.max.xiaoheihe.utils.d.e1(home_corner_ad.getBorder_color()));
        }
        e70Var.f110058b.f113180k.setVisibility(8);
        com.max.hbimage.b.K(home_corner_ad.getImg(), e70Var.f110058b.f113171b);
        e70Var.f110058b.f113182m.setVisibility(0);
        e70Var.f110058b.f113182m.setOnClickListener(new ViewOnClickListenerC0664e(home_corner_ad, str, e70Var, context));
        com.max.hbcommon.utils.k.c(home_corner_ad.getAd_report());
    }

    public static void c(l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, 25597, new Class[]{l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        f79473a = Boolean.FALSE;
        OverallAdInfo overallAdInfo = (OverallAdInfo) k.a(com.max.hbcache.c.o(com.max.hbcache.c.f66141p0, ""), OverallAdInfo.class);
        String now_identification = overallAdInfo != null ? overallAdInfo.getNow_identification() : null;
        i.a().Xa(now_identification).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new a(overallAdInfo, gVar, now_identification));
    }

    public static Boolean d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 25601, new Class[0], Boolean.class);
        if (patchProxyResultProxy.isSupported) {
            return (Boolean) patchProxyResultProxy.result;
        }
        WeakReference<ViewGroup> weakReference = f79475c;
        ViewGroup viewGroup = weakReference != null ? weakReference.get() : null;
        WeakReference<BubbleTipPopup> weakReference2 = f79476d;
        BubbleTipPopup bubbleTipPopup = weakReference2 != null ? weakReference2.get() : null;
        if (viewGroup == null || viewGroup.getVisibility() != 0 || !ViewUtils.f0(viewGroup) || bubbleTipPopup == null || !bubbleTipPopup.L()) {
            return Boolean.FALSE;
        }
        viewGroup.performClick();
        return Boolean.TRUE;
    }

    private static boolean e(long j10, BubbleAdContent bubbleAdContent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10), bubbleAdContent}, null, changeQuickRedirect, true, 25604, new Class[]{Long.TYPE, BubbleAdContent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!com.max.hbcommon.utils.c.w(bubbleAdContent.getShow_time())) {
            for (BubbleTimestampObj bubbleTimestampObj : bubbleAdContent.getShow_time()) {
                if (j10 >= bubbleTimestampObj.getStart().longValue() && j10 <= bubbleTimestampObj.getEnd().longValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(BubbleTipPopup bubbleTipPopup) {
        if (PatchProxy.proxy(new Object[]{bubbleTipPopup}, null, changeQuickRedirect, true, 25606, new Class[]{BubbleTipPopup.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.b(ViewPriority.DEFAULT.getValue());
        f79476d = null;
    }

    public static void g(f fVar) {
        OverallAdInfo overallAdInfo;
        if (PatchProxy.proxy(new Object[]{fVar}, null, changeQuickRedirect, true, 25600, new Class[]{f.class}, Void.TYPE).isSupported || (overallAdInfo = f79474b) == null || overallAdInfo.getBubble_ad() == null || com.max.hbcommon.utils.c.w(f79474b.getBubble_ad().getContents())) {
            return;
        }
        for (BubbleAdContent bubbleAdContent : f79474b.getBubble_ad().getContents()) {
            if (h(bubbleAdContent, f79474b.getBubble_ad())) {
                if (fVar != null) {
                    fVar.a(bubbleAdContent);
                    return;
                }
                return;
            }
        }
    }

    private static boolean h(BubbleAdContent bubbleAdContent, BubbleAdInfo bubbleAdInfo) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bubbleAdContent, bubbleAdInfo}, null, changeQuickRedirect, true, 25603, new Class[]{BubbleAdContent.class, BubbleAdInfo.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (com.max.hbcommon.utils.c.x(com.max.hbcache.c.j(com.max.hbcache.c.f66137n0 + bubbleAdContent.getIdea_id()))) {
            g.W("[发帖气泡] 已经点击过此内容 id" + bubbleAdContent.getIdea_id());
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - n.r(com.max.hbcache.c.j(com.max.hbcache.c.f66135m0)) < (bubbleAdContent.getIdea_id().equals(com.max.hbcache.c.j(com.max.hbcache.c.f66139o0)) ? bubbleAdInfo.getBubble_single_interval().longValue() : bubbleAdInfo.getBubble_ads_interval().longValue()) * 1000) {
            g.W("[发帖气泡] 时间小于展示间隔 id" + bubbleAdContent.getIdea_id());
            return false;
        }
        if (e(jCurrentTimeMillis / 1000, bubbleAdContent)) {
            return true;
        }
        g.W("[发帖气泡] 不在展示时间 id" + bubbleAdContent.getIdea_id());
        return false;
    }

    public static void i(View view, BaseActivity baseActivity, BubbleAdContent bubbleAdContent) {
        BubbleTipPopup bubbleTipPopup;
        if (PatchProxy.proxy(new Object[]{view, baseActivity, bubbleAdContent}, null, changeQuickRedirect, true, 25602, new Class[]{View.class, BaseActivity.class, BubbleAdContent.class}, Void.TYPE).isSupported) {
            return;
        }
        String str = com.max.hbcache.c.f66137n0 + bubbleAdContent.getIdea_id();
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(baseActivity).inflate(R.layout.layout_bubble_ad, (ViewGroup) null);
        WeakReference<BubbleTipPopup> weakReference = f79476d;
        if (weakReference != null && (bubbleTipPopup = weakReference.get()) != null) {
            bubbleTipPopup.G();
        }
        viewGroup.setVisibility(0);
        viewGroup.setAlpha(1.0f);
        f79475c = new WeakReference<>(viewGroup);
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) viewGroup.findViewById(R.id.bubble_icon);
        TextView textView = (TextView) viewGroup.findViewById(R.id.bubble_title);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.bubble_desc);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.bubble_close);
        ((TextView) viewGroup.findViewById(R.id.tv_internal_tag)).setVisibility(8);
        qMUIRadiusImageView.setCornerRadius(ViewUtils.p(baseActivity, qMUIRadiusImageView, ViewUtils.ViewType.IMAGE));
        com.max.hbimage.b.K(bubbleAdContent.getImg(), qMUIRadiusImageView);
        BubbleTipPopup bubbleTipPopupR = new BubbleTipPopup.a(baseActivity).c(view).i0(48).o0(0.0f).p0(-ViewUtils.f(baseActivity, 3.0f)).u(viewGroup, R.id.bubble_desc).p1(textView2.getText()).n1(false).d(true).f(ViewUtils.f(baseActivity, 6.0f)).y(false).x(false).e(1200L).n(true).o(n.q(bubbleAdContent.getAd_duration()) > 0 ? ((long) n.q(bubbleAdContent.getAd_duration())) * 1000 : 12000L).r0(new BubbleTipPopup.b() { // from class: com.max.xiaoheihe.module.ads.d
            @Override // com.max.hbcommon.component.bubble.BubbleTipPopup.b
            public final void a(BubbleTipPopup bubbleTipPopup2) {
                e.f(bubbleTipPopup2);
            }
        }).r();
        bubbleTipPopupR.O();
        f79476d = new WeakReference<>(bubbleTipPopupR);
        imageView.setOnClickListener(new c(bubbleTipPopupR, viewGroup, str));
        textView.setText(bubbleAdContent.getTitle());
        textView2.setText(bubbleAdContent.getSub_title());
        viewGroup.setOnClickListener(new d(bubbleAdContent, bubbleTipPopupR, viewGroup, str, baseActivity));
        com.max.hbcache.c.z(com.max.hbcache.c.f66139o0, bubbleAdContent.getIdea_id());
        com.max.hbcache.c.z(com.max.hbcache.c.f66135m0, System.currentTimeMillis() + "");
        com.max.hbcommon.utils.k.c(bubbleAdContent.getAd_report());
    }

    public static void j() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 25599, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Activity activityE = HeyBoxApplication.C().E();
        if (activityE instanceof MainActivity) {
            ((MainActivity) activityE).S2();
        } else {
            g.W("[发帖气泡] 当前不在主页，回到主页会检查气泡展示");
        }
    }

    public static void k() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 25598, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        c(new b());
    }
}
