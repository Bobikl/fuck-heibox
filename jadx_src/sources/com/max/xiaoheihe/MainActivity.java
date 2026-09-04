package com.max.xiaoheihe;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.h0;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.core.view.z0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.j0;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.component.bubble.BubbleTipPopup;
import com.max.hbcommon.network.ConnectivityWrapper;
import com.max.hbcommon.network.NetworkState;
import com.max.hbcommon.utils.ImageViewerP;
import com.max.hbmmkv.MMKVManager;
import com.max.hbsearch.bean.SearchHotwordsObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.security.SecurityTool;
import com.max.video.AbsVideoView;
import com.max.video.player.VideoPlayerManager;
import com.max.xiaoheihe.accelworld.AccelWorldLottieKt;
import com.max.xiaoheihe.accelworld.HBDialogManagerKt;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.app.OneShotMainActivityIdleHandler;
import com.max.xiaoheihe.bean.AdsInfosObj;
import com.max.xiaoheihe.bean.AppTabsObj;
import com.max.xiaoheihe.bean.InnerAdsInfoObj;
import com.max.xiaoheihe.bean.JsListObj;
import com.max.xiaoheihe.bean.account.AppClientStaticObj;
import com.max.xiaoheihe.bean.account.CheckVersionObj;
import com.max.xiaoheihe.bean.account.HomeDataObj;
import com.max.xiaoheihe.bean.account.ImageConfigObj;
import com.max.xiaoheihe.bean.account.TipsStateObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.bean.account.UserPermissionObj;
import com.max.xiaoheihe.bean.account.tab.TabKeyObj;
import com.max.xiaoheihe.bean.ads.BubbleAdContent;
import com.max.xiaoheihe.bean.bbs.BBSAchieveResult;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.MobileGameDetailsObj;
import com.max.xiaoheihe.bean.game.MobileGameListObj;
import com.max.xiaoheihe.bean.hotfix.HotFixPatchResultObj;
import com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager;
import com.max.xiaoheihe.module.account.MeHomeFragmentx;
import com.max.xiaoheihe.module.account.MehomefragmentV2;
import com.max.xiaoheihe.module.account.ShareImageDialogFragment;
import com.max.xiaoheihe.module.bbs.CommunityFragment;
import com.max.xiaoheihe.module.bbs.StaticResourceManager;
import com.max.xiaoheihe.module.bbs.post_edit.PostTabActivity;
import com.max.xiaoheihe.module.game.GameFragment;
import com.max.xiaoheihe.module.game.dota2.ImageCacheManager;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.heybox_voice.HeyboxVoiceFragment;
import com.max.xiaoheihe.module.hotfix.HotFixManager;
import com.max.xiaoheihe.module.mall.newcomer.NewcomerManager;
import com.max.xiaoheihe.module.news.DiscoveryFragment;
import com.max.xiaoheihe.module.signin.SignInManager;
import com.max.xiaoheihe.module.webview.JsCoreManager;
import com.max.xiaoheihe.module.webview.jdcache.JDCacheResourceManager;
import com.max.xiaoheihe.module.webview.t0;
import com.max.xiaoheihe.utils.AppUpdateManager;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.imageviewer.ImageViewerHelper;
import com.max.xiaoheihe.utils.m0;
import com.max.xiaoheihe.utils.viewprioritymanager.ViewPriority;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.open.SocialConstants;
import com.umeng.analytics.MobclickAgent;
import com.umeng.message.PushAgent;
import com.umeng.message.UTrack;
import com.umeng.socialize.UMShareAPI;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.b2;

/* JADX INFO: loaded from: classes3.dex */
@ig.d(interceptors = {com.max.xiaoheihe.router.interceptors.g.class}, path = {lb.d.f131204m, "/home/moment", "/home/recommend", "/home/rank", lb.d.f131246s, lb.d.J, "/bbs/recommend", lb.d.M, "/bbs/list", "/bbs/list_v2", "/bbs/waterfall", "/bbs/web_writebox", lb.d.f131235q2, "/game/recommend", "/game/recommend_v2", "/game/rank", "/game/comment_recommend", lb.d.f131262u1, lb.d.f131269v1, lb.d.K1})
public class MainActivity extends BaseActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener, com.max.xiaoheihe.module.video.b, com.max.xiaoheihe.app.c, com.max.hbminiprogram.b {
    public static final String B4 = "pages";
    public static final String C4 = "select_game_platform";
    private static final String D4 = "share_image";
    public static int J4 = 0;
    public static long K4 = 0;
    public static long L4 = 0;
    public static long M4 = 0;
    public static long N4 = 0;
    public static long O4 = 0;
    public static long P4 = 0;
    public static long Q4 = 0;
    public static long R4 = 0;
    public static long S4 = 0;
    public static final String T3 = "topic";
    public static long T4 = 0;
    public static final String U3 = "web";
    public static long U4 = 0;
    public static final String V3 = "game";
    public static long V4 = 0;
    public static final String W3 = "me";
    public static long W4 = 0;
    public static final String X3 = "/home/moment";
    public static long X4 = 0;
    public static final String Y3 = "/home/recommend";
    public static long Y4 = 0;
    public static final String Z3 = "/home/rank";
    public static long Z4 = 0;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public static final String f76138a4 = "/bbs/recommend";

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    public static long f76139a5 = 0;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    public static final String f76140b4 = "/bbs/list";

    /* JADX INFO: renamed from: b5, reason: collision with root package name */
    public static long f76141b5 = 0;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    public static final String f76142c4 = "/bbs/web_writebox";

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static long f76143c5 = 0;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    public static final String f76144d4 = "/bbs/waterfall";

    /* JADX INFO: renamed from: d5, reason: collision with root package name */
    public static long f76145d5 = 0;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    public static final String f76146e4 = "/bbs/list_v2";

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    public static long f76147e5 = 0;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    public static final String f76148f4 = "/game/comment_recommend";

    /* JADX INFO: renamed from: f5, reason: collision with root package name */
    public static long f76149f5 = 0;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    public static final String f76150g4 = "/game/recommend";

    /* JADX INFO: renamed from: g5, reason: collision with root package name */
    public static long f76151g5 = 0;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    public static final String f76152h4 = "/game/recommend_v2";

    /* JADX INFO: renamed from: h5, reason: collision with root package name */
    public static long f76153h5 = 0;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public static final String f76154i4 = "/game/rank";

    /* JADX INFO: renamed from: i5, reason: collision with root package name */
    public static long f76155i5 = 0;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public static final String f76156j4 = "data";

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public static long f76157j5 = 0;

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    public static long f76159k5 = 0;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    public static final String f76160l4 = "link";

    /* JADX INFO: renamed from: l5, reason: collision with root package name */
    public static long f76161l5 = 0;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    public static final String f76162m4 = "topic";

    /* JADX INFO: renamed from: m5, reason: collision with root package name */
    public static long f76163m5 = 0;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    public static final String f76164n4 = "tag";

    /* JADX INFO: renamed from: n5, reason: collision with root package name */
    public static long f76165n5 = 0;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    public static final String f76166o4 = "wiki";

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    public static final String f76168p4 = "hot";

    /* JADX INFO: renamed from: p5, reason: collision with root package name */
    public static boolean f76169p5 = false;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    public static final String f76170q4 = "recommend";

    /* JADX INFO: renamed from: q5, reason: collision with root package name */
    public static TipsStateObj f76171q5 = null;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    public static final String f76172r4 = "favour";

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    public static final String f76173s4 = "hashtag";
    private com.airbnb.lottie.j G2;
    private com.airbnb.lottie.j G3;
    private String[] K3;
    private String L3;
    private RadioGroup N;
    private BubbleTipPopup N3;
    private RadioButton O;
    private BubbleTipPopup O3;
    private RadioButton P;

    @p0
    private HeyboxVoiceFragment P3;
    private RadioButton Q;
    private RadioButton R;
    private RadioButton S;
    private ImageView T;
    private ImageView U;
    private ImageView V;
    private ImageView W;
    private ImageView X;
    private ViewGroup Y;
    private View Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private ViewGroup f76181a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private RelativeLayout f76182b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private View f76183c0;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private Drawable f76185p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private com.airbnb.lottie.j f76186p3;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private TabChangeBroadcastReceiver f76188x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private Drawable f76189y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private com.airbnb.lottie.j f76190y2;
    public static final String S3 = "discovery";

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    public static final String[] f76174t4 = {S3};

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    public static final String[] f76175u4 = {"topic"};

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    public static final String[] f76176v4 = {"web"};

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    public static final String[] f76177w4 = {"game"};

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public static final String[] f76178x4 = {"me"};

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    public static final String[] f76179y4 = {"me", "data"};

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    public static final String f76158k4 = "trends";

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    public static final String[] f76180z4 = {"me", f76158k4};
    public static final String[] A4 = {"me", f76158k4, "favour", "hashtag"};
    public static boolean E4 = true;
    public static String F4 = null;
    public static boolean G4 = false;
    public static boolean H4 = false;
    public static boolean I4 = false;

    /* JADX INFO: renamed from: o5, reason: collision with root package name */
    public static String f76167o5 = "120";
    private long L = 0;
    private long M = 0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    Handler f76184p1 = new Handler();

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private boolean f76187x1 = false;
    private boolean J3 = false;
    private boolean M3 = false;
    private final BroadcastReceiver Q3 = new BroadcastReceiver() { // from class: com.max.xiaoheihe.MainActivity.1
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, bb.c.m.Ss, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.x("MainAcitivty, Login Broadcast onReceive");
            MainActivity.Y1(MainActivity.this);
        }
    };
    private final com.max.hbcommon.network.f R3 = new com.max.hbcommon.network.f() { // from class: com.max.xiaoheihe.e
        @Override // com.max.hbcommon.network.f
        public final void a(NetworkState networkState) {
            this.f77019a.D3(networkState);
        }
    };

    public class TabChangeBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        TabChangeBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, bb.c.m.Wt, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            MainActivity.this.N.check(R.id.rb_2);
        }
    }

    public class a extends com.max.hbcommon.network.d<Result<TipsStateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Ts, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            super.onComplete();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.m.Us, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
        }

        public void onNext(Result<TipsStateObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.Vs, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            MainActivity.E2(MainActivity.this, result.getResult());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Ws, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TipsStateObj>) obj);
        }
    }

    public class a0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.m.Nt, new Class[]{View.class}, Void.TYPE).isSupported || com.max.xiaoheihe.module.ads.e.d().booleanValue() || !i0.e(((BaseActivity) MainActivity.this).f66601b)) {
                return;
            }
            Intent intent = new Intent(((BaseActivity) MainActivity.this).f66601b, (Class<?>) PostTabActivity.class);
            intent.putExtra("source", "normal");
            MainActivity.this.startActivity(intent);
        }
    }

    public class b extends com.max.hbcommon.network.d<Result<BBSAchieveResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements com.max.hbimage.b.r {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Result f76196a;

            a(Result result) {
                this.f76196a = result;
            }

            @Override // com.max.hbimage.b.r
            public void a() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.bt, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.view.l.z((FragmentActivity) ((BaseActivity) MainActivity.this).f66601b, ((BBSAchieveResult) this.f76196a.getResult()).getAchieve_event());
            }
        }

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Xs, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            super.onComplete();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.m.Ys, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
        }

        public void onNext(Result<BBSAchieveResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.Zs, new Class[]{Result.class}, Void.TYPE).isSupported || result.getResult() == null) {
                return;
            }
            if (result.getResult().getAchieve_event() != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(result.getResult().getAchieve_event().getCurrentLevel().getImg());
                com.max.hbimage.b.i0(arrayList, new a(result));
            } else if (result.getResult().getMission_event() != null) {
                if (!com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.c(ViewPriority.TOP.getValue())) {
                    return;
                } else {
                    MainActivity.a2(MainActivity.this, com.max.xiaoheihe.view.l.G(((BaseActivity) MainActivity.this).f66601b, result.getResult().getMission_event()));
                }
            }
            if (result.getResult().getMilestone_event() == null || !com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.c(ViewPriority.TOP.getValue())) {
                return;
            }
            MainActivity.a2(MainActivity.this, com.max.xiaoheihe.view.l.F(((BaseActivity) MainActivity.this).f66601b, result.getResult().getMilestone_event()));
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.at, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSAchieveResult>) obj);
        }
    }

    public class b0 extends com.max.hbcommon.network.d<Result<HotFixPatchResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b0() {
        }

        public void onNext(Result<HotFixPatchResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.Ot, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            HotFixManager.g().l(result.getResult());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Pt, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<HotFixPatchResultObj>) obj);
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, bb.c.m.ct, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.b(ViewPriority.TOP.getValue());
        }
    }

    public class c0 extends com.max.hbcommon.network.d<Result<JsListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c0() {
        }

        public void onNext(Result<JsListObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.Qt, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            if (result.getResult() == null || com.max.hbcommon.utils.c.w(result.getResult().getJs_list())) {
                return;
            }
            if (!DynamicSoManager.k(com.max.xiaoheihe.loader.dynamic_so.a.f77295a)) {
                com.max.xiaoheihe.dynamic_so.a.a(com.max.xiaoheihe.loader.dynamic_so.a.f77295a);
                return;
            }
            Iterator<String> it = result.getResult().getJs_list().iterator();
            while (it.hasNext()) {
                JsCoreManager.l().j(it.next(), null);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Rt, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<JsListObj>) obj);
        }
    }

    public class d implements com.max.xiaoheihe.module.upload.g.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ void a(float f10) {
            com.max.xiaoheihe.module.upload.h.b(this, f10);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean b() {
            return com.max.xiaoheihe.module.upload.h.a(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void c(String[] strArr, String str) {
            if (!PatchProxy.proxy(new Object[]{strArr, str}, this, changeQuickRedirect, false, bb.c.m.dt, new Class[]{String[].class, String.class}, Void.TYPE).isSupported && strArr.length > 0) {
                MainActivity.this.V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().q6(strArr[0]).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.p()));
            }
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public boolean d() {
            return false;
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void e(String str) {
        }
    }

    public class d0 extends com.max.hbcommon.network.d<Result<AppClientStaticObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d0() {
        }

        public void onNext(Result<AppClientStaticObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.St, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            AppClientStaticObj result2 = result.getResult();
            if (result2 == null) {
                com.max.heybox.hblog.g.G("[MainActivity#tryGetAppClientStaticData] appClientStaticObj is null");
            } else {
                MainActivity.D2(MainActivity.this, result2.getImage_config());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Tt, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<AppClientStaticObj>) obj);
        }
    }

    public class e extends com.max.hbcommon.network.d<File> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        public void onNext(File file) {
            if (PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, bb.c.m.et, new Class[]{File.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(file);
            if (file != null) {
                HashSet hashSet = new HashSet(com.max.hbcache.c.p(com.max.hbcache.c.B));
                hashSet.add(file.getAbsolutePath());
                com.max.hbcache.c.D(com.max.hbcache.c.B, hashSet);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.ft, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((File) obj);
        }
    }

    public class e0 extends com.max.hbcommon.network.d<Result<UserPermissionObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e0() {
        }

        public void onNext(Result<UserPermissionObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.Ut, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            i0.o().setVisitor_enabled(result.getResult().getVisitor_enabled());
            i0.o().setPermission(result.getResult());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Vt, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<UserPermissionObj>) obj);
        }
    }

    public class f implements com.max.hbimage.b.s {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f76205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f76206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f76207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f76208d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f76209e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f76210f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f76211g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f76212h;

        f(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f76205a = str;
            this.f76206b = str2;
            this.f76207c = str3;
            this.f76208d = str4;
            this.f76209e = str5;
            this.f76210f = str6;
            this.f76211g = str7;
            this.f76212h = str8;
        }

        @Override // com.max.hbimage.b.s
        public String getFileName(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.m.gt, new Class[]{String.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            String str2 = this.f76205a;
            if (str2 != null && str2.equals(str)) {
                return com.max.hbcache.c.C;
            }
            String str3 = this.f76206b;
            if (str3 != null && str3.equals(str)) {
                return com.max.hbcache.c.D;
            }
            String str4 = this.f76207c;
            if (str4 != null && str4.equals(str)) {
                return com.max.hbcache.c.E;
            }
            String str5 = this.f76208d;
            if (str5 != null && str5.equals(str)) {
                return com.max.hbcache.c.F;
            }
            String str6 = this.f76209e;
            if (str6 != null && str6.equals(str)) {
                return com.max.hbcache.c.G;
            }
            String str7 = this.f76210f;
            if (str7 != null && str7.equals(str)) {
                return com.max.hbcache.c.H;
            }
            String str8 = this.f76211g;
            if (str8 != null && str8.equals(str)) {
                return com.max.hbcache.c.I;
            }
            String str9 = this.f76212h;
            return (str9 == null || !str9.equals(str)) ? com.max.hbutils.utils.s.d(str) : com.max.hbcache.c.J;
        }
    }

    public class g implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TipsStateObj f76214b;

        g(TipsStateObj tipsStateObj) {
            this.f76214b = tipsStateObj;
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity activityE;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.ht, new Class[0], Void.TYPE).isSupported || (activityE = HeyBoxApplication.C().E()) == null || activityE.isFinishing()) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(activityE, this.f76214b.getTriggle_protocol());
        }
    }

    public class h implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.jt, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            MainActivity.G4 = true;
            MainActivity.this.O.performClick();
        }
    }

    public class i implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.kt, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            MainActivity.G4 = true;
            MainActivity.this.P.performClick();
        }
    }

    public class j implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.m.mt, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (com.max.xiaoheihe.utils.c0.o("/bbs/recommend", com.max.xiaoheihe.utils.c0.a())) {
                    MainActivity.H4 = true;
                }
                Intent intent = new Intent();
                intent.setAction("com.max.xiaoheihe.news.gotop");
                ((BaseActivity) MainActivity.this).f66601b.sendBroadcast(intent);
            }
        }

        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.lt, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            MainActivity.this.O.setOnClickListener(new a());
        }
    }

    public class k implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.m.qt, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (com.max.xiaoheihe.utils.c0.o("/bbs/recommend", com.max.xiaoheihe.utils.c0.f())) {
                    MainActivity.H4 = true;
                }
                Intent intent = new Intent();
                intent.setAction("com.max.xiaoheihe.bbs.gotop");
                ((BaseActivity) MainActivity.this).f66601b.sendBroadcast(intent);
            }
        }

        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.pt, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            MainActivity.this.P.setOnClickListener(new a());
        }
    }

    public class l implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.m.st, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Intent intent = new Intent();
                intent.setAction("com.max.xiaoheihe.game.gotop");
                ((BaseActivity) MainActivity.this).f66601b.sendBroadcast(intent);
            }
        }

        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.rt, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            MainActivity.this.R.setOnClickListener(new a());
        }
    }

    public class m implements DialogInterface.OnDismissListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, bb.c.m.tt, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.b(ViewPriority.LOW.getValue());
        }
    }

    public class n extends com.max.hbcommon.network.d<Result<HomeDataObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements UTrack.ICallBack {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.umeng.message.api.UPushAliasCallback
            public void onMessage(boolean z10, String str) {
                if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, bb.c.m.yt, new Class[]{Boolean.TYPE, String.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.heybox.hblog.g.W("[UPush] addAlias: success: " + z10 + "message: " + str);
                com.max.hbcommon.utils.d.b("zzzzupush", "setAlias   " + str + "   isSuccess==" + z10);
            }
        }

        n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(Result result, DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{result, dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.xt, new Class[]{Result.class, DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.F(((BaseActivity) MainActivity.this).f66601b, ((HomeDataObj) result.getResult()).getMobile_pop_window().getAppid()).A();
            dialogInterface.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(final Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.wt, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.view.a aVarD = new com.max.hbcommon.view.a.f(((BaseActivity) MainActivity.this).f66601b).y(((HomeDataObj) result.getResult()).getMobile_pop_window().getTitle()).w(true).d();
            aVarD.u(MainActivity.this.getString(R.string.download_now), new DialogInterface.OnClickListener() { // from class: com.max.xiaoheihe.l
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f77108b.c(result, dialogInterface, i10);
                }
            });
            aVarD.show();
        }

        @SuppressLint({"AutoDispose"})
        public void onNext(final Result<HomeDataObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.ut, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            User userI = i0.i();
            userI.setGameAccountInfo(result.getResult());
            userI.setAccount_detail(result.getResult().getAccount_detail());
            userI.setProfile(result.getResult().getProfile());
            i0.z(userI);
            com.max.xiaoheihe.module.account.accelworld.a.c(userI);
            if (result.getResult().getMobile_pop_window() != null) {
                MainActivity.this.f76184p1.post(new Runnable() { // from class: com.max.xiaoheihe.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f77300b.d(result);
                    }
                });
            }
            if (com.max.hbcommon.utils.c.u(result.getResult().getAccount_detail().getUserid())) {
                return;
            }
            MobclickAgent.onProfileSignIn(result.getResult().getAccount_detail().getUserid());
            PushAgent.getInstance(HeyBoxApplication.C()).addAlias(result.getResult().getAccount_detail().getUserid(), "heybox", new a());
            if (com.max.hbcommon.push.a.b()) {
                com.max.hbcommon.push.a.a(((BaseActivity) MainActivity.this).f66601b, i0.j(), true);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        @SuppressLint({"AutoDispose"})
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.vt, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<HomeDataObj>) obj);
        }
    }

    public class o implements DialogInterface.OnDismissListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, bb.c.m.zt, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.b(ViewPriority.HIGH.getValue());
        }
    }

    public class p implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InnerAdsInfoObj f76228b;

        p(InnerAdsInfoObj innerAdsInfoObj) {
            this.f76228b = innerAdsInfoObj;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.At, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(((BaseActivity) MainActivity.this).f66601b, this.f76228b.getProtocol());
            com.max.hbcommon.utils.k.b(this.f76228b.getAd_report());
            dialogInterface.dismiss();
        }
    }

    public class q implements DialogInterface.OnDismissListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, bb.c.m.Bt, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.b(ViewPriority.HIGH.getValue());
        }
    }

    public class r implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InnerAdsInfoObj f76231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.view.a f76232c;

        r(InnerAdsInfoObj innerAdsInfoObj, com.max.hbcommon.view.a aVar) {
            this.f76231b = innerAdsInfoObj;
            this.f76232c = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.m.Ct, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(((BaseActivity) MainActivity.this).f66601b, this.f76231b.getProtocol());
            com.max.hbcommon.utils.k.b(this.f76231b.getAd_report());
            this.f76232c.dismiss();
        }
    }

    public class s implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.view.a f76234b;

        s(com.max.hbcommon.view.a aVar) {
            this.f76234b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.m.Dt, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f76234b.dismiss();
        }
    }

    public class t extends com.max.hbcommon.network.d<Result<CheckVersionObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        t() {
        }

        public void onNext(Result<CheckVersionObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.Et, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcache.c.z("version_check_time", System.currentTimeMillis() + "");
            if (result != null) {
                CheckVersionObj result2 = result.getResult();
                if (result2.getBeta_test() != null) {
                    AppUpdateManager.B((AppCompatActivity) ((BaseActivity) MainActivity.this).f66601b, result2.getBeta_test());
                } else if ("1".equals(result2.getNeed_update()) && "1".equals(result2.getForce_push())) {
                    AppUpdateManager.v((AppCompatActivity) ((BaseActivity) MainActivity.this).f66601b, result2);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Ft, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<CheckVersionObj>) obj);
        }
    }

    public class u implements j0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        u() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, bb.c.m.ot, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bool);
        }

        public void b(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, bb.c.m.nt, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
                return;
            }
            if (bool.booleanValue()) {
                MainActivity.this.N.setVisibility(8);
                MainActivity.this.f76181a0.setVisibility(8);
                MainActivity.this.Z.setVisibility(8);
            } else {
                MainActivity.this.N.setVisibility(0);
                MainActivity.this.f76181a0.setVisibility(0);
                MainActivity.this.Z.setVisibility(MainActivity.E4 ? 0 : 8);
            }
        }
    }

    public class v extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        v() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.Gt, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcache.c.z("download_place_upload", "1");
            Intent intent = new Intent();
            intent.setAction(lb.a.E);
            ((BaseActivity) MainActivity.this).f66601b.sendBroadcast(intent);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Ht, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class w implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.It, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            MainActivity.v2(MainActivity.this);
            MainActivity.x2(MainActivity.this, 7200000L);
        }
    }

    public class x extends com.max.hbcommon.network.d<Result<MobileGameListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        x() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
        }

        public void onNext(Result<MobileGameListObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.Jt, new Class[]{Result.class}, Void.TYPE).isSupported || !MainActivity.this.isActive() || com.max.hbcommon.utils.c.w(result.getResult().getGame_list())) {
                return;
            }
            for (MobileGameDetailsObj mobileGameDetailsObj : result.getResult().getGame_list()) {
                if (mobileGameDetailsObj != null) {
                    GameObj gameObjV = r1.v(mobileGameDetailsObj);
                    gameObjV.setAuto_download(true);
                    com.max.xiaoheihe.module.game.c.a(((BaseActivity) MainActivity.this).f66601b, gameObjV);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Kt, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MobileGameListObj>) obj);
        }
    }

    public class y implements com.max.xiaoheihe.module.ads.e.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        y() {
        }

        @Override // com.max.xiaoheihe.module.ads.e.f
        public void a(BubbleAdContent bubbleAdContent) {
            if (PatchProxy.proxy(new Object[]{bubbleAdContent}, this, changeQuickRedirect, false, bb.c.m.Lt, new Class[]{BubbleAdContent.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.viewprioritymanager.a aVar = com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a;
            ViewPriority viewPriority = ViewPriority.DEFAULT;
            if (aVar.c(viewPriority.getValue())) {
                com.max.heybox.hblog.g.W("[发帖气泡] 气泡展示 id" + bubbleAdContent.getIdea_id());
                aVar.a(viewPriority.getValue());
                com.max.xiaoheihe.module.ads.e.i(MainActivity.this.findViewById(R.id.vg_mid_tab), MainActivity.this, bubbleAdContent);
            }
        }
    }

    public class z implements BubbleTipPopup.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        z() {
        }

        @Override // com.max.hbcommon.component.bubble.BubbleTipPopup.b
        public void a(@p0 BubbleTipPopup bubbleTipPopup) {
            if (PatchProxy.proxy(new Object[]{bubbleTipPopup}, this, changeQuickRedirect, false, bb.c.m.Mt, new Class[]{BubbleTipPopup.class}, Void.TYPE).isSupported) {
                return;
            }
            MainActivity.this.O3 = null;
        }
    }

    private void A3(Intent intent) {
        HeyboxVoiceFragment heyboxVoiceFragment;
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, bb.c.m.Gr, new Class[]{Intent.class}, Void.TYPE).isSupported || !isActive() || intent == null || (heyboxVoiceFragment = this.P3) == null) {
            return;
        }
        heyboxVoiceFragment.onNewIntent(intent);
    }

    private void B3(Intent intent, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{intent, bundle}, this, changeQuickRedirect, false, bb.c.m.Ir, new Class[]{Intent.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        this.K3 = intent.getStringArrayExtra("pages");
        this.L3 = intent.getStringExtra(C4);
        if (bundle != null) {
            com.max.hbcommon.utils.d.b("mainactivity", "savedInstanceState!=null          " + bundle.getInt("checkedtab"));
            this.N.check(bundle.getInt("checkedtab"));
        } else {
            RadioGroup radioGroup = this.N;
            radioGroup.check(radioGroup.getChildAt(n3(p3(this.K3, 0))).getId());
        }
        J4 = this.N.getCheckedRadioButtonId();
        String stringExtra = intent.getStringExtra(com.max.hbcommon.utils.q.f68261b);
        if (com.max.hbcommon.utils.c.u(stringExtra)) {
            return;
        }
        com.max.xiaoheihe.base.router.b.k0(this.f66601b, stringExtra);
    }

    private void C3(Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, bb.c.m.Hr, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        String stringExtra = intent.getStringExtra(C4);
        if (com.max.hbcommon.utils.c.u(stringExtra)) {
            return;
        }
        for (Fragment fragment : getSupportFragmentManager().J0()) {
            if (fragment instanceof MehomefragmentV2) {
                for (Fragment fragment2 : fragment.getChildFragmentManager().J0()) {
                    if (fragment2 instanceof MeHomeFragmentx) {
                        ((MeHomeFragmentx) fragment2).a7(r1.q0(stringExtra));
                        return;
                    }
                }
                return;
            }
        }
    }

    static /* synthetic */ void D2(MainActivity mainActivity, ImageConfigObj imageConfigObj) {
        if (PatchProxy.proxy(new Object[]{mainActivity, imageConfigObj}, null, changeQuickRedirect, true, bb.c.m.Ns, new Class[]{MainActivity.class, ImageConfigObj.class}, Void.TYPE).isSupported) {
            return;
        }
        mainActivity.P3(imageConfigObj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D3(NetworkState networkState) {
        if (PatchProxy.proxy(new Object[]{networkState}, this, changeQuickRedirect, false, bb.c.m.Ls, new Class[]{NetworkState.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.x("ConnectivityCallback, networkState = " + networkState);
        if (networkState.isConnected()) {
            Q3();
            if (i0.s() && "1".equals(com.max.hbcache.c.o("valid_ws", ""))) {
                com.max.hbcommon.utils.d.b("zzzzconntest", "监听到可用网络切换,调用重连方法");
                m0.x().G();
            }
        }
    }

    static /* synthetic */ void E2(MainActivity mainActivity, TipsStateObj tipsStateObj) {
        if (PatchProxy.proxy(new Object[]{mainActivity, tipsStateObj}, null, changeQuickRedirect, true, bb.c.m.Os, new Class[]{MainActivity.class, TipsStateObj.class}, Void.TYPE).isSupported) {
            return;
        }
        mainActivity.e4(tipsStateObj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ n3 F3(View view, n3 n3Var) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, n3Var}, this, changeQuickRedirect, false, bb.c.m.Ks, new Class[]{View.class, n3.class}, n3.class);
        if (patchProxyResultProxy.isSupported) {
            return (n3) patchProxyResultProxy.result;
        }
        h0 h0VarF = n3Var.f(n3.m.i());
        com.max.hbutils.utils.t.f73584e = h0VarF.f20743b;
        com.max.heybox.hblog.g.x("MainActivity  sStatusBarHeight: " + h0VarF.f20743b + "  bottom: " + h0VarF.f20745d);
        n3 n3VarO0 = j1.o0(getWindow().getDecorView());
        if (n3VarO0 != null) {
            com.max.hbutils.utils.t.f73585f = n3VarO0.f(n3.m.g()).f20745d;
            com.max.heybox.hblog.g.x("MainActivity  sNavBarHeight: " + n3VarO0.f(n3.m.g()));
        }
        return n3.f21708c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ b2 G3(int i10, com.airbnb.lottie.j jVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), jVar}, this, changeQuickRedirect, false, bb.c.m.Js, new Class[]{Integer.TYPE, com.airbnb.lottie.j.class}, b2.class);
        if (patchProxyResultProxy.isSupported) {
            return (b2) patchProxyResultProxy.result;
        }
        jVar.D0(0.33333334f);
        this.f76190y2 = jVar;
        Drawable drawableU3 = u3(jVar, R.drawable.nav_bar_discover_normal_2);
        drawableU3.setBounds(0, 0, i10, i10);
        this.O.setCompoundDrawables(null, drawableU3, null, null);
        if (this.O.isChecked()) {
            AccelWorldLottieKt.d(jVar);
        }
        return b2.f124493a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ b2 H3(int i10, com.airbnb.lottie.j jVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), jVar}, this, changeQuickRedirect, false, bb.c.m.Is, new Class[]{Integer.TYPE, com.airbnb.lottie.j.class}, b2.class);
        if (patchProxyResultProxy.isSupported) {
            return (b2) patchProxyResultProxy.result;
        }
        jVar.D0(0.33333334f);
        this.G2 = jVar;
        Drawable drawableU3 = u3(jVar, R.drawable.nav_bar_store_normal_2);
        drawableU3.setBounds(0, 0, i10, i10);
        this.P.setCompoundDrawables(null, drawableU3, null, null);
        if (this.P.isChecked()) {
            AccelWorldLottieKt.d(jVar);
        }
        return b2.f124493a;
    }

    private void I2(Dialog dialog) {
        if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, bb.c.m.Yr, new Class[]{Dialog.class}, Void.TYPE).isSupported || dialog == null) {
            return;
        }
        com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.a(ViewPriority.TOP.getValue());
        dialog.setOnDismissListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ b2 I3(int i10, com.airbnb.lottie.j jVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), jVar}, this, changeQuickRedirect, false, bb.c.m.Hs, new Class[]{Integer.TYPE, com.airbnb.lottie.j.class}, b2.class);
        if (patchProxyResultProxy.isSupported) {
            return (b2) patchProxyResultProxy.result;
        }
        jVar.D0(0.33333334f);
        this.f76186p3 = jVar;
        Drawable drawableU3 = u3(jVar, R.drawable.nav_bar_bbs_normal_2);
        drawableU3.setBounds(0, 0, i10, i10);
        this.R.setCompoundDrawables(null, drawableU3, null, null);
        if (this.R.isChecked()) {
            AccelWorldLottieKt.d(jVar);
        }
        return b2.f124493a;
    }

    private void J2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.os, new Class[0], Void.TYPE).isSupported || "1".equals(com.max.hbcache.c.j("download_place_upload"))) {
            return;
        }
        f4();
    }

    private void K2() {
        AdsInfosObj adsInfosObjA;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.is, new Class[0], Void.TYPE).isSupported || (adsInfosObjA = com.max.xiaoheihe.module.ads.c.a()) == null || adsInfosObjA.getInner_ads() == null) {
            return;
        }
        for (InnerAdsInfoObj innerAdsInfoObj : adsInfosObjA.getInner_ads()) {
            String strO = com.max.hbcache.c.o(com.max.xiaoheihe.module.ads.b.j(innerAdsInfoObj), "");
            long jR = !TextUtils.isEmpty(strO) ? com.max.hbutils.utils.n.r(strO) : 0L;
            long jCurrentTimeMillis = System.currentTimeMillis();
            String start_time = innerAdsInfoObj.getStart_time();
            String end_time = innerAdsInfoObj.getEnd_time();
            long jR2 = !TextUtils.isEmpty(start_time) ? com.max.hbutils.utils.n.r(start_time) * 1000 : 0L;
            long jR3 = TextUtils.isEmpty(end_time) ? 0L : com.max.hbutils.utils.n.r(end_time) * 1000;
            if (jCurrentTimeMillis - jR >= com.max.hbutils.utils.n.r(innerAdsInfoObj.getShow_interval()) * 1000.0f && jR2 <= jCurrentTimeMillis && jCurrentTimeMillis <= jR3) {
                V3(innerAdsInfoObj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ b2 K3(int i10, com.airbnb.lottie.j jVar) {
        Drawable drawableU3;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), jVar}, this, changeQuickRedirect, false, bb.c.m.Gs, new Class[]{Integer.TYPE, com.airbnb.lottie.j.class}, b2.class);
        if (patchProxyResultProxy.isSupported) {
            return (b2) patchProxyResultProxy.result;
        }
        jVar.D0(0.33333334f);
        this.G3 = jVar;
        if ("1".equals(com.max.hbcache.c.o("display_steam_icon", "0"))) {
            drawableU3 = u3(jVar, R.drawable.ic_steam);
            Paint paint = new Paint();
            paint.setTextSize(12.0f);
            paint.setTypeface(Typeface.DEFAULT);
            paint.measureText("前往绑定Steam账号");
            BubbleTipPopup bubbleTipPopupR = new BubbleTipPopup.a(this.f66601b).c(this.S).p1("前往绑定Steam账号").s1(12.0f).r1(17).i0(48).x(false).y(false).z0(ViewUtils.f(this.f66601b, 14.0f)).B0(ViewUtils.f(this.f66601b, 14.0f)).z(false).p0(-ViewUtils.f(this.f66601b, 12.0f)).w(ViewUtils.f(this.f66601b, 2.0f)).n(true).o(5000L).r0(new z()).r();
            this.O3 = bubbleTipPopupR;
            bubbleTipPopupR.O();
        } else {
            drawableU3 = u3(jVar, R.drawable.nav_bar_me_normal_2);
        }
        drawableU3.setBounds(0, 0, i10, i10);
        this.S.setCompoundDrawables(null, drawableU3, null, null);
        if (this.S.isChecked()) {
            AccelWorldLottieKt.d(jVar);
        }
        return b2.f124493a;
    }

    private void L2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.ns, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Pb().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new t()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b2 L3(Context context, String[] strArr, ArrayList arrayList, Integer num) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, strArr, arrayList, num}, null, changeQuickRedirect, true, bb.c.m.Fs, new Class[]{Context.class, String[].class, ArrayList.class, Integer.class}, b2.class);
        if (patchProxyResultProxy.isSupported) {
            return (b2) patchProxyResultProxy.result;
        }
        ImageViewerHelper.a(context).m(arrayList, strArr).d(num.intValue()).p();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Es, new Class[0], Void.TYPE).isSupported || this.f76187x1) {
            return;
        }
        this.f76187x1 = true;
        Looper.getMainLooper().getQueue().addIdleHandler(new OneShotMainActivityIdleHandler(androidx.lifecycle.z.a(this), getSupportFragmentManager(), this, new yh.a() { // from class: com.max.xiaoheihe.d
            @Override // yh.a
            public final Object invoke() {
                return Boolean.valueOf(this.f77015b.isActive());
            }
        }, V0()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void N3(DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.Ds, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        dialogInterface.dismiss();
    }

    private void O2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.ms, new Class[0], Void.TYPE).isSupported || com.max.xiaoheihe.utils.d.F0()) {
            return;
        }
        String strJ = com.max.hbcache.c.j("version_check_time");
        if (com.max.hbutils.utils.w.J(!TextUtils.isEmpty(strJ) ? Long.parseLong(strJ) : 0L, System.currentTimeMillis())) {
            return;
        }
        L2();
    }

    public static void O3(ImageView imageView, ImageView imageView2) {
        if (PatchProxy.proxy(new Object[]{imageView, imageView2}, null, changeQuickRedirect, true, bb.c.m.zs, new Class[]{ImageView.class, ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        imageView2.setVisibility(8);
        imageView.setVisibility(8);
    }

    private void P2(Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, bb.c.m.Jr, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        Q2(this.K3, intent);
    }

    private void P3(ImageConfigObj imageConfigObj) {
        if (PatchProxy.proxy(new Object[]{imageConfigObj}, this, changeQuickRedirect, false, bb.c.m.Br, new Class[]{ImageConfigObj.class}, Void.TYPE).isSupported) {
            return;
        }
        MMKVManager mMKVManager = MMKVManager.f71329a;
        mMKVManager.n(ad.c.f1235o, ad.c.f1236p, System.currentTimeMillis(), false);
        if (imageConfigObj == null) {
            com.max.heybox.hblog.g.G("[MainActivity#onGetImageConfig] invalid param, imageConfigMap is null");
        } else {
            mMKVManager.o(ad.c.f1235o, ad.c.f1237q, com.max.hbutils.utils.k.p(imageConfigObj), false);
        }
    }

    private void Q2(String[] strArr, Intent intent) {
        List<Fragment> listJ0;
        if (PatchProxy.proxy(new Object[]{strArr, intent}, this, changeQuickRedirect, false, bb.c.m.Kr, new Class[]{String[].class, Intent.class}, Void.TYPE).isSupported || (listJ0 = getSupportFragmentManager().J0()) == null) {
            return;
        }
        String strP3 = p3(strArr, 0);
        String[] strArrR3 = r3(strArr, 1);
        for (Fragment fragment : listJ0) {
            if (S3.equals(strP3) && (fragment instanceof DiscoveryFragment)) {
                ((DiscoveryFragment) fragment).d4(strArrR3);
            } else if ("topic".equals(strP3) && (fragment instanceof CommunityFragment)) {
                ((CommunityFragment) fragment).W3(strArrR3);
            } else if ("game".equals(strP3) && (fragment instanceof GameFragment)) {
                ((GameFragment) fragment).T3(strArrR3);
            } else if ("me".equals(strP3) && (fragment instanceof MehomefragmentV2)) {
                ((MehomefragmentV2) fragment).o5(strArrR3, intent);
            }
        }
    }

    private void Q3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Dr, new Class[0], Void.TYPE).isSupported || !com.max.hbcommon.utils.i.c(this) || this.M3) {
            return;
        }
        this.M3 = true;
        com.max.heybox.hblog.g.W("MainAcitivty, onNetworkConnected Connecting to the Internet for the first time");
        c4();
        com.max.hbexpression.f.a();
        StaticResourceManager.f80064a.g();
        ImageCacheManager.i().g(ImageCacheManager.f87360g);
        JDCacheResourceManager.f94723a.l(null);
        com.max.xiaoheihe.utils.r.m();
    }

    private void T2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Cr, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.account.mine.l.f79078a.a();
    }

    private void T3(int i10, boolean z10) {
        Fragment fragmentY2;
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.Ur, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported || (fragmentY2 = Y2(i10)) == null) {
            return;
        }
        androidx.fragment.app.p0 p0VarU = getSupportFragmentManager().u();
        if (z10) {
            if (!fragmentY2.isAdded()) {
                p0VarU.c(R.id.fl_container, fragmentY2, i10 + "");
            }
            p0VarU.P(fragmentY2);
        } else if (!fragmentY2.isAdded()) {
            return;
        } else {
            p0VarU.u(fragmentY2);
        }
        p0VarU.n();
        getSupportFragmentManager().n0();
    }

    private void U3(InnerAdsInfoObj innerAdsInfoObj) {
        if (PatchProxy.proxy(new Object[]{innerAdsInfoObj}, this, changeQuickRedirect, false, bb.c.m.ls, new Class[]{InnerAdsInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.a(ViewPriority.HIGH.getValue());
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f66601b).inflate(R.layout.layout_inner_ads_img, (ViewGroup) null);
        com.max.hbcommon.view.a aVarD = new com.max.hbcommon.view.a.f(this.f66601b).D(viewGroup).g(true).B(true).E(0).r(new q()).d();
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.iv_cancel);
        ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.iv_img);
        String url = innerAdsInfoObj.getUrl();
        File fileP = com.max.hbimage.b.p(url);
        if (fileP == null || !fileP.exists()) {
            com.max.hbimage.b.K(url, imageView2);
        } else {
            imageView2.setImageBitmap(BitmapFactory.decodeFile(fileP.getPath()));
        }
        imageView2.setOnClickListener(new r(innerAdsInfoObj, aVarD));
        imageView.setOnClickListener(new s(aVarD));
        aVarD.show();
    }

    public static String[] V2(int i10) {
        if (i10 == 1) {
            return f76175u4;
        }
        if (i10 == 2) {
            return f76176v4;
        }
        if (i10 != 3) {
            return i10 != 4 ? f76174t4 : f76178x4;
        }
        return f76177w4;
    }

    private void V3(InnerAdsInfoObj innerAdsInfoObj) {
        if (!PatchProxy.proxy(new Object[]{innerAdsInfoObj}, this, changeQuickRedirect, false, bb.c.m.js, new Class[]{InnerAdsInfoObj.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.c(ViewPriority.HIGH.getValue())) {
            com.max.hbcommon.utils.k.c(innerAdsInfoObj.getAd_report());
            if ("text".equals(innerAdsInfoObj.getType())) {
                X3(innerAdsInfoObj);
            } else if (SocialConstants.PARAM_IMG_URL.equals(innerAdsInfoObj.getType())) {
                U3(innerAdsInfoObj);
            }
            com.max.hbcache.c.C(com.max.xiaoheihe.module.ads.b.j(innerAdsInfoObj), System.currentTimeMillis() + "");
        }
    }

    private void W2() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.vs, new Class[0], Void.TYPE).isSupported && Build.VERSION.SDK_INT >= 26) {
            String string = getString(R.string.channel_name_download);
            String string2 = getString(R.string.channel_description_download);
            NotificationChannel notificationChannel = new NotificationChannel(lb.a.f130984j0, string, 3);
            notificationChannel.setDescription(string2);
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
    }

    private void W3(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.m.gs, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        new com.max.hbcommon.view.a.f(activity).y("新首页、新机制").l("小黑盒正在试行新版首页，新的推荐机制将会为您推荐更符合您兴趣的优质内容；\n您可以随时在「设置」-「通用设置」中，对APP首页样式进行切换").u("我知道了", new DialogInterface.OnClickListener() { // from class: com.max.xiaoheihe.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                MainActivity.N3(dialogInterface, i10);
            }
        }).r(new m()).F();
        com.max.hbcache.c.z("style_switch_dialog_shown", "1");
    }

    private void X2() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.ws, new Class[0], Void.TYPE).isSupported && Build.VERSION.SDK_INT >= 26) {
            com.max.hbutils.utils.o.c();
            NotificationChannel notificationChannel = new NotificationChannel("109356", "订阅消息", 4);
            NotificationChannel notificationChannel2 = new NotificationChannel("109359", "订单消息", 4);
            NotificationChannel notificationChannel3 = new NotificationChannel("109360", "私信消息", 4);
            NotificationChannel notificationChannel4 = new NotificationChannel("109361", "新闻资讯", 3);
            NotificationChannel notificationChannel5 = new NotificationChannel("109365", "游戏折扣", 3);
            NotificationChannel notificationChannel6 = new NotificationChannel("109363", "其他消息", 3);
            NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(notificationChannel);
            notificationManager.createNotificationChannel(notificationChannel2);
            notificationManager.createNotificationChannel(notificationChannel3);
            notificationManager.createNotificationChannel(notificationChannel4);
            notificationManager.createNotificationChannel(notificationChannel5);
            notificationManager.createNotificationChannel(notificationChannel6);
        }
    }

    private void X3(InnerAdsInfoObj innerAdsInfoObj) {
        if (PatchProxy.proxy(new Object[]{innerAdsInfoObj}, this, changeQuickRedirect, false, bb.c.m.ks, new Class[]{InnerAdsInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.a(ViewPriority.HIGH.getValue());
        new com.max.hbcommon.view.a.f(this.f66601b).y(innerAdsInfoObj.getTitle()).l(innerAdsInfoObj.getDesc()).g(true).w(true).E(0).u(innerAdsInfoObj.getBtn_text(), new p(innerAdsInfoObj)).r(new o()).F();
    }

    static /* synthetic */ void Y1(MainActivity mainActivity) {
        if (PatchProxy.proxy(new Object[]{mainActivity}, null, changeQuickRedirect, true, bb.c.m.Ms, new Class[]{MainActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        mainActivity.c4();
    }

    private Fragment Y2(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.Tr, new Class[]{Integer.TYPE}, Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        Fragment fragmentS0 = getSupportFragmentManager().s0(i10 + "");
        if (fragmentS0 != null) {
            return fragmentS0;
        }
        String[] strArrR3 = n3(p3(this.K3, 0)) == i10 ? r3(this.K3, 1) : null;
        if (i10 == 0) {
            return DiscoveryFragment.k4(strArrR3);
        }
        if (i10 == 1) {
            return CommunityFragment.a4(strArrR3);
        }
        if (i10 != 3) {
            return i10 != 4 ? fragmentS0 : q3();
        }
        return GameFragment.X3(strArrR3);
    }

    private void Y3(long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.m.As, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f76184p1.postDelayed(new w(), j10);
    }

    private void Z3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.vr, new Class[0], Void.TYPE).isSupported || DynamicSoManager.k(com.max.xiaoheihe.loader.dynamic_so.a.f77296b)) {
            return;
        }
        com.max.xiaoheihe.dynamic_so.a.a(com.max.xiaoheihe.loader.dynamic_so.a.f77296b);
    }

    static /* synthetic */ void a2(MainActivity mainActivity, Dialog dialog) {
        if (PatchProxy.proxy(new Object[]{mainActivity, dialog}, null, changeQuickRedirect, true, bb.c.m.Ps, new Class[]{MainActivity.class, Dialog.class}, Void.TYPE).isSupported) {
            return;
        }
        mainActivity.I2(dialog);
    }

    @SuppressLint({"AutoDispose"})
    private void a4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Ar, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - MMKVManager.f71329a.g(ad.c.f1235o, ad.c.f1236p, 0L, false);
        if (Math.abs(jCurrentTimeMillis) >= 86400000) {
            V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().c6().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d0()));
            return;
        }
        com.max.heybox.hblog.g.x("[tryGetAppClientStaticData] skip getAppClientStatic, elapsedTimeMs: " + jCurrentTimeMillis);
    }

    @SuppressLint({"AutoDispose"})
    private void b4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.hs, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().i5().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.schedulers.b.d()).J5(new n()));
    }

    private void c4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Er, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        w3();
    }

    private void d4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.as, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (K4 <= L4 || this.N.getCheckedRadioButtonId() == R.id.rb_1) {
            this.T.setVisibility(4);
        } else {
            this.T.setVisibility(0);
        }
        ImageView imageView = this.W;
        if (M4 <= N4 || this.N.getCheckedRadioButtonId() == imageView.getId()) {
            imageView.setVisibility(4);
        } else {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = this.U;
        if (imageView2 != null) {
            if (O4 <= P4 || this.N.getCheckedRadioButtonId() == imageView2.getId()) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
            }
        }
        if (Q4 <= R4 || this.N.getCheckedRadioButtonId() == R.id.rb_5) {
            this.X.setVisibility(4);
        } else {
            this.X.setVisibility(0);
        }
    }

    public static int e3() {
        switch (J4) {
            case R.id.rb_1 /* 2131363858 */:
                return 0;
            case R.id.rb_2 /* 2131363859 */:
                return 1;
            case R.id.rb_3 /* 2131363860 */:
                return 2;
            case R.id.rb_4 /* 2131363861 */:
                return 3;
            case R.id.rb_5 /* 2131363862 */:
                return 4;
            default:
                return -1;
        }
    }

    private void e4(TipsStateObj tipsStateObj) {
        String strO;
        if (PatchProxy.proxy(new Object[]{tipsStateObj}, this, changeQuickRedirect, false, bb.c.m.Zr, new Class[]{TipsStateObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (tipsStateObj != null) {
            if (com.max.hbcommon.utils.c.x(tipsStateObj.getUpload_log()) && (strO = com.max.heybox.hblog.g.o(this.f66601b)) != null) {
                com.max.xiaoheihe.module.upload.g.h(this.f66601b, V0(), Collections.singletonList(strO), "develop", new d());
            }
            if (tipsStateObj.getApp_tabs() != null) {
                AppTabsObj app_tabs = tipsStateObj.getApp_tabs();
                String img_one_off = app_tabs.getImg_one_off();
                String img_one_on = app_tabs.getImg_one_on();
                String img_two_off = app_tabs.getImg_two_off();
                String img_two_on = app_tabs.getImg_two_on();
                String img_three_off = app_tabs.getImg_three_off();
                String img_three_on = app_tabs.getImg_three_on();
                String img_four_off = app_tabs.getImg_four_off();
                String img_four_on = app_tabs.getImg_four_on();
                com.max.hbcache.c.E(com.max.hbcache.c.K, app_tabs.getTab_off_color());
                com.max.hbcache.c.E(com.max.hbcache.c.L, app_tabs.getTab_on_color());
                com.max.hbimage.b.i(com.max.xiaoheihe.utils.d.Q(), new f(img_one_off, img_one_on, img_two_off, img_two_on, img_three_off, img_three_on, img_four_off, img_four_on), img_one_off, img_one_on, img_two_off, img_two_on, img_three_off, img_three_on, img_four_off, img_four_on).I5(io.reactivex.schedulers.b.d()).g(new e());
            } else {
                com.max.hbcache.c.D(com.max.hbcache.c.B, new HashSet());
            }
            if (com.max.hbcommon.utils.c.u(tipsStateObj.getValid_ws())) {
                com.max.hbcache.c.C("valid_ws", "0");
            } else {
                com.max.hbcache.c.C("valid_ws", tipsStateObj.getValid_ws());
                if (i0.s() && "1".equals(com.max.hbcache.c.o("valid_ws", ""))) {
                    m0.x().C();
                }
            }
            if (com.max.hbcommon.utils.c.u(tipsStateObj.getShow_steamcards_purchase())) {
                com.max.hbcache.c.C("show_steamcards_purchase", "0");
            } else {
                com.max.hbcache.c.C("show_steamcards_purchase", tipsStateObj.getShow_steamcards_purchase());
            }
            if (com.max.hbcommon.utils.c.w(tipsStateObj.getSchemes())) {
                com.max.hbcache.c.B("schemes_white_list", null);
            } else {
                com.max.hbcache.c.B("schemes_white_list", tipsStateObj.getSchemes());
            }
            if (!com.max.hbcommon.utils.c.u(tipsStateObj.getCompress_image())) {
                com.max.hbcache.c.C("compress_image", tipsStateObj.getCompress_image());
            }
            if (!com.max.hbcommon.utils.c.u(tipsStateObj.getShow_mobile_game())) {
                com.max.hbcache.c.C("show_mobile_game", tipsStateObj.getShow_mobile_game());
            }
            if (com.max.hbcommon.utils.c.u(tipsStateObj.getLogin_provider())) {
                com.max.hbcache.c.z(com.max.hbcache.c.L0, com.max.hbcache.c.M0);
            } else {
                com.max.hbcache.c.z(com.max.hbcache.c.L0, tipsStateObj.getLogin_provider());
            }
            if (!com.max.hbcommon.utils.c.u(tipsStateObj.getCopyed_token_regex())) {
                com.max.hbcache.c.z("copyed_token_regex", tipsStateObj.getCopyed_token_regex());
            }
            if (!com.max.hbcommon.utils.c.u(tipsStateObj.getChat_copyed_token_regex())) {
                com.max.hbcache.c.z("chat_copyed_token_regex", tipsStateObj.getChat_copyed_token_regex());
            }
            if (com.max.hbcommon.utils.c.u(tipsStateObj.getMall_region())) {
                com.max.hbcache.c.z("mall_region", "cn");
            } else {
                com.max.hbcache.c.z("mall_region", tipsStateObj.getMall_region());
            }
            com.max.hbcommon.network.b.f68053j = "hk".equals(com.max.hbcache.c.j("mall_region"));
            if (com.max.hbcommon.utils.c.u(tipsStateObj.getMall_region_alert_freq())) {
                com.max.hbcache.c.z("mall_region_alert_freq", "1");
            } else {
                com.max.hbcache.c.z("mall_region_alert_freq", tipsStateObj.getMall_region_alert_freq());
            }
            com.max.hbcache.c.C("news_list_group", tipsStateObj.getNews_list_group());
            com.max.hbcache.c.C("news_list_type", tipsStateObj.getNews_list_type());
            com.max.hbcache.c.z("local_html_enabled", tipsStateObj.getLocal_html_enabled());
            com.max.hbcache.c.C("inject_js_by_progress", tipsStateObj.getInject_js_by_progress());
            com.max.xiaoheihe.module.webview.d0.g().n();
            if (!com.max.hbcommon.utils.c.u(tipsStateObj.getShow_mobile_game_center_icon())) {
                com.max.hbcache.c.z("show_mobile_game_center_icon", tipsStateObj.getShow_mobile_game_center_icon());
            }
            if (!com.max.hbcommon.utils.c.u(tipsStateObj.getNews_tap_time())) {
                K4 = com.max.hbutils.utils.n.r(tipsStateObj.getNews_tap_time());
                L4 = com.max.hbutils.utils.n.r(com.max.hbcache.c.o("news_tap_time", ""));
            }
            if (!com.max.hbcommon.utils.c.u(tipsStateObj.getGame_tap_time())) {
                M4 = com.max.hbutils.utils.n.r(tipsStateObj.getGame_tap_time());
                N4 = com.max.hbutils.utils.n.r(com.max.hbcache.c.o("game_tap_time", ""));
            }
            if (!com.max.hbcommon.utils.c.u(tipsStateObj.getBbs_tap_time())) {
                O4 = com.max.hbutils.utils.n.r(tipsStateObj.getBbs_tap_time());
                P4 = com.max.hbutils.utils.n.r(com.max.hbcache.c.o("bbs_tap_time", ""));
            }
            if (!com.max.hbcommon.utils.c.u(tipsStateObj.getAccount_tap_time())) {
                Q4 = com.max.hbutils.utils.n.r(tipsStateObj.getAccount_tap_time());
                R4 = com.max.hbutils.utils.n.r(com.max.hbcache.c.o("account_tap_time", ""));
            }
            if (!com.max.hbcommon.utils.c.u(tipsStateObj.getTask_button_time())) {
                S4 = com.max.hbutils.utils.n.r(tipsStateObj.getTask_button_time());
                T4 = com.max.hbutils.utils.n.r(com.max.hbcache.c.o("task_button_time", ""));
            }
            if (!com.max.hbcommon.utils.c.u(tipsStateObj.getFavour_button_time())) {
                U4 = com.max.hbutils.utils.n.r(tipsStateObj.getFavour_button_time());
                V4 = com.max.hbutils.utils.n.r(com.max.hbcache.c.o("favour_button_time", ""));
            }
            if (!com.max.hbcommon.utils.c.u(tipsStateObj.getActivity_button_time())) {
                W4 = com.max.hbutils.utils.n.r(tipsStateObj.getActivity_button_time());
                X4 = com.max.hbutils.utils.n.r(com.max.hbcache.c.o("activity_button_time", ""));
            }
            if (!com.max.hbcommon.utils.c.u(tipsStateObj.getStore_button_time())) {
                Y4 = com.max.hbutils.utils.n.r(tipsStateObj.getStore_button_time());
                Z4 = com.max.hbutils.utils.n.r(com.max.hbcache.c.o("store_button_time", ""));
            }
            if (!com.max.hbcommon.utils.c.u(tipsStateObj.getSearch_button_time())) {
                f76139a5 = com.max.hbutils.utils.n.r(tipsStateObj.getSearch_button_time());
                f76141b5 = com.max.hbutils.utils.n.r(com.max.hbcache.c.o("search_button_time", ""));
            }
            if (!com.max.hbcommon.utils.c.u(tipsStateObj.getRank_button_time())) {
                f76143c5 = com.max.hbutils.utils.n.r(tipsStateObj.getRank_button_time());
                f76145d5 = com.max.hbutils.utils.n.r(com.max.hbcache.c.o("rank_button_time", ""));
            }
            if (!com.max.hbcommon.utils.c.u(tipsStateObj.getItem_button_time())) {
                f76147e5 = com.max.hbutils.utils.n.r(tipsStateObj.getItem_button_time());
                f76149f5 = com.max.hbutils.utils.n.r(com.max.hbcache.c.o("item_button_time", ""));
            }
            if (!com.max.hbcommon.utils.c.u(tipsStateObj.getWeapon_button_time())) {
                f76151g5 = com.max.hbutils.utils.n.r(tipsStateObj.getWeapon_button_time());
                f76153h5 = com.max.hbutils.utils.n.r(com.max.hbcache.c.o("weapon_button_time", ""));
            }
            if (!com.max.hbcommon.utils.c.u(tipsStateObj.getMobile_game_time())) {
                f76155i5 = com.max.hbutils.utils.n.r(tipsStateObj.getMobile_game_time());
                f76157j5 = com.max.hbutils.utils.n.r(com.max.hbcache.c.o("mobile_tap_time", ""));
            }
            if (!com.max.hbcommon.utils.c.u(tipsStateObj.getRoll_game_time())) {
                f76159k5 = com.max.hbutils.utils.n.r(tipsStateObj.getRoll_game_time());
                f76161l5 = com.max.hbutils.utils.n.r(com.max.hbcache.c.o("roll_tap_time", ""));
            }
            if (!com.max.hbcommon.utils.c.u(tipsStateObj.getCommunity_wiki_tab())) {
                f76163m5 = com.max.hbutils.utils.n.r(tipsStateObj.getCommunity_wiki_tab());
                f76165n5 = com.max.hbutils.utils.n.r(com.max.hbcache.c.o("wiki_tap_time", ""));
            }
            if (tipsStateObj.getEventlog104() == null || com.max.hbcommon.utils.c.u(tipsStateObj.getEventlog104().getApp_stay_duration_report_period_second())) {
                com.max.hbcache.c.z("app_stay_duration_report_period_second", "");
            } else {
                com.max.hbcache.c.z("app_stay_duration_report_period_second", tipsStateObj.getEventlog104().getApp_stay_duration_report_period_second());
            }
            if ("false".equalsIgnoreCase(tipsStateObj.getNewcomer_notify_cooldown())) {
                NewcomerManager.f90882a.h(this);
            } else {
                NewcomerManager.f90882a.f(this, "2");
            }
            if (com.max.hbcommon.utils.c.x(tipsStateObj.getShow_member_bulletin()) && i0.s()) {
                com.max.xiaoheihe.module.mall.p.f90999a.b();
            }
            com.max.hbcache.c.C(com.max.hbcache.c.R, !com.max.hbcommon.utils.c.u(tipsStateObj.getHide_platforms()) ? tipsStateObj.getHide_platforms() : "");
            com.max.hbcache.c.C(com.max.hbcache.c.D0, tipsStateObj.getDlc_v2());
            com.max.hbcache.c.C(com.max.hbcache.c.E0, tipsStateObj.getGame_global_price_dialog_v3());
            com.max.hbcache.c.C(com.max.hbcache.c.J0, tipsStateObj.getNew_topic_selector_outside());
            if (tipsStateObj.getTab_config() != null) {
                if (tipsStateObj.getTab_config().getFirst_tab() != null) {
                    com.max.hbcache.c.C(com.max.hbcache.c.f66119e0, com.max.hbutils.utils.k.p(tipsStateObj.getTab_config().getFirst_tab()));
                }
                if (tipsStateObj.getTab_config().getSecond_tab() != null) {
                    com.max.hbcache.c.C(com.max.hbcache.c.f66121f0, com.max.hbutils.utils.k.p(tipsStateObj.getTab_config().getSecond_tab()));
                }
                if (tipsStateObj.getTab_config().getThird_tab() != null) {
                    com.max.hbcache.c.C(com.max.hbcache.c.f66123g0, com.max.hbutils.utils.k.p(tipsStateObj.getTab_config().getThird_tab()));
                }
            }
            com.max.hbcache.c.C("style_switch", com.max.hbcommon.utils.c.u(tipsStateObj.getStyle_switch()) ? "" : tipsStateObj.getStyle_switch());
            if (!com.max.hbcommon.utils.c.u(tipsStateObj.getTriggle_protocol())) {
                this.f76184p1.postDelayed(new g(tipsStateObj), 1000L);
            }
            String show_post_topic_guide_once = tipsStateObj.getShow_post_topic_guide_once();
            MMKVManager mMKVManager = MMKVManager.f71329a;
            mMKVManager.k(ad.e.f1248a, ad.e.f1249b, com.max.hbcommon.utils.c.x(show_post_topic_guide_once), true);
            ad.a.e(ad.a.f1197d, com.max.hbcommon.utils.c.x(tipsStateObj.getAndroid_okhttp_custom_error_retry()));
            mMKVManager.k("webview", ad.c.f1222b, com.max.hbcommon.utils.c.x(tipsStateObj.getWeb_link_full_url()), false);
            mMKVManager.k("webview", ad.c.f1223c, com.max.hbcommon.utils.c.x(tipsStateObj.getWeb_env_src()), false);
            ad.a.e(ad.a.f1196c, com.max.hbcommon.utils.c.x(tipsStateObj.getRelease_resources()));
            ad.a.f(tipsStateObj.getClear_crash_level());
            wf.a.f141043a.a(tipsStateObj);
            mMKVManager.k("common", ad.c.f1227g, com.max.hbcommon.utils.c.x(tipsStateObj.getSsiv_end_scale_animate()), false);
            if (com.max.hbcommon.utils.c.u(tipsStateObj.getAuto_refresh_interval())) {
                f76167o5 = "0";
            } else {
                f76167o5 = tipsStateObj.getAuto_refresh_interval();
            }
            if (com.max.hbcommon.utils.c.x(tipsStateObj.getOaid_update_enable())) {
                com.max.xiaoheihe.module.cert.a.f();
            }
            if (!com.max.hbcommon.utils.c.x(tipsStateObj.getDisable_download_scan_so())) {
                Z3();
            }
            d4();
            sendBroadcast(new Intent(lb.a.F));
        }
        com.max.xiaoheihe.module.upload.c.g().t(this.f66601b, V0());
    }

    private DiscoveryFragment f3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Pr, new Class[0], DiscoveryFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (DiscoveryFragment) patchProxyResultProxy.result;
        }
        for (Fragment fragment : getSupportFragmentManager().J0()) {
            if (fragment instanceof DiscoveryFragment) {
                return (DiscoveryFragment) fragment;
            }
        }
        return null;
    }

    private void f4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.ps, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap(16);
        map.put("download_place", com.max.xiaoheihe.utils.d.t0());
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().x8("14", map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.schedulers.b.d()).J5(new v()));
    }

    private void g3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Bs, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().N6().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new x()));
    }

    @SuppressLint({"AutoDispose"})
    private void i3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.yr, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().c().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b0()));
    }

    public static Intent k3(Context context, String[] strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, strArr}, null, changeQuickRedirect, true, bb.c.m.tr, new Class[]{Context.class, String[].class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.putExtra("pages", strArr);
        return intent;
    }

    @SuppressLint({"AutoDispose"})
    private void l3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.zr, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().j8().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c0()));
    }

    private int n3(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.m.Mr, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "me":
                return 4;
            case "web":
                return 2;
            case "game":
                return 3;
            case "topic":
                return 1;
            default:
                return 0;
        }
    }

    public static String p3(String[] strArr, int i10) {
        if (strArr == null || i10 < 0 || i10 >= strArr.length) {
            return null;
        }
        return strArr[i10];
    }

    private Fragment q3() {
        String str;
        String str2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.xs, new Class[0], Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        String steamid = "-1";
        if (i0.o() != null) {
            String userid = (i0.o().getAccount_detail() == null || i0.o().getAccount_detail().getUserid() == null) ? "-1" : i0.o().getAccount_detail().getUserid();
            if (i0.o().getSteam_id_info() != null && i0.o().getSteam_id_info().getSteamid() != null) {
                steamid = i0.o().getSteam_id_info().getSteamid();
            }
            str = userid;
            str2 = steamid;
        } else {
            str = "-1";
            str2 = str;
        }
        return MehomefragmentV2.Q5(str, str2, r3(this.K3, 1), this.L3, 0, false);
    }

    public static String[] r3(String[] strArr, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{strArr, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.Lr, new Class[]{String[].class, Integer.TYPE}, String[].class);
        if (patchProxyResultProxy.isSupported) {
            return (String[]) patchProxyResultProxy.result;
        }
        if (strArr == null || i10 < 0 || i10 >= strArr.length) {
            return null;
        }
        return (String[]) Arrays.copyOfRange(strArr, i10, strArr.length);
    }

    private void s3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.ys, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbsearch.o.j() && com.max.hbsearch.o.f72359c == null) {
            String strJ = com.max.hbcache.c.j(com.max.hbcache.c.N);
            if (!com.max.hbcommon.utils.c.u(strJ)) {
                com.max.hbsearch.o.f72359c = strJ;
            }
        }
        if (com.max.hbsearch.o.f72358b == null) {
            String strJ2 = com.max.hbcache.c.j(com.max.hbcache.c.M);
            if (com.max.hbcommon.utils.c.u(strJ2)) {
                return;
            }
            com.max.hbsearch.o.f72358b = (SearchHotwordsObj) com.max.hbutils.utils.k.a(strJ2, SearchHotwordsObj.class);
        }
    }

    private Drawable t3(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, bb.c.m.Qr, new Class[]{String.class, String.class}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawableCreateFromPath = Drawable.createFromPath(str);
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, Drawable.createFromPath(str2));
        stateListDrawable.addState(new int[0], drawableCreateFromPath);
        return stateListDrawable;
    }

    private Drawable u3(Drawable drawable, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.Rr, new Class[]{Drawable.class, Integer.TYPE}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable2 = this.f66601b.getResources().getDrawable(i10);
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, drawable);
        stateListDrawable.addState(new int[0], drawable2);
        return stateListDrawable;
    }

    static /* synthetic */ void v2(MainActivity mainActivity) {
        if (PatchProxy.proxy(new Object[]{mainActivity}, null, changeQuickRedirect, true, bb.c.m.Qs, new Class[]{MainActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        mainActivity.g3();
    }

    static /* synthetic */ void x2(MainActivity mainActivity, long j10) {
        if (PatchProxy.proxy(new Object[]{mainActivity, new Long(j10)}, null, changeQuickRedirect, true, bb.c.m.Rs, new Class[]{MainActivity.class, Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        mainActivity.Y3(j10);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public boolean K1() {
        return false;
    }

    @Override // com.max.xiaoheihe.app.c
    public void P(@n0 Activity activity) {
    }

    public void R3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Nr, new Class[0], Void.TYPE).isSupported && this.M > 0) {
            SignInManager.f().c();
            try {
                int i10 = Integer.parseInt(f76167o5);
                if (i10 <= 0 || System.currentTimeMillis() - this.M <= ((long) i10) * 1000) {
                    return;
                }
                w3();
            } catch (Exception unused) {
            }
        }
    }

    public void S2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Cs, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.W("[发帖气泡] 检查气泡展示");
        com.max.xiaoheihe.module.ads.e.g(new y());
    }

    public void S3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.cs, new Class[0], Void.TYPE).isSupported && ad.a.d()) {
            com.airbnb.lottie.j jVar = this.f76190y2;
            if (jVar != null && jVar.isRunning()) {
                this.f76190y2.stop();
            }
            BubbleTipPopup bubbleTipPopup = this.N3;
            if (bubbleTipPopup != null && bubbleTipPopup.L()) {
                this.N3.G();
            }
            BubbleTipPopup bubbleTipPopup2 = this.O3;
            if (bubbleTipPopup2 == null || !bubbleTipPopup2.L()) {
                return;
            }
            this.O3.G();
        }
    }

    @Override // com.max.xiaoheihe.app.c
    public /* synthetic */ void Y(Activity activity) {
        com.max.xiaoheihe.app.b.c(this, activity);
    }

    public void a3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Xr, new Class[0], Void.TYPE).isSupported && i0.o().isLoginFlag()) {
            V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Z7(i0.o().getAccount_detail().getUserid(), "1").C1(500L, TimeUnit.MILLISECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
        }
    }

    @Override // com.max.xiaoheihe.app.c
    public /* synthetic */ void b0(Activity activity) {
        com.max.xiaoheihe.app.b.b(this, activity);
    }

    @Override // com.max.xiaoheihe.module.video.b
    public void c(AbsVideoView absVideoView, ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{absVideoView, viewGroup}, this, changeQuickRedirect, false, bb.c.m.ss, new Class[]{AbsVideoView.class, ViewGroup.class}, Void.TYPE).isSupported || absVideoView == null) {
            return;
        }
        VideoPlayerManager.f76079a.w(this, absVideoView, viewGroup, 0);
    }

    public void d(ShareImageDialogFragment shareImageDialogFragment) {
        if (PatchProxy.proxy(new Object[]{shareImageDialogFragment}, this, changeQuickRedirect, false, bb.c.m.us, new Class[]{ShareImageDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        shareImageDialogFragment.show(getSupportFragmentManager(), "share_image");
    }

    @Override // com.max.xiaoheihe.module.video.b
    public void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.ts, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        VideoPlayerManager.f76079a.e(this);
    }

    public HeyboxVoiceFragment h3() {
        return this.P3;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.qs, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(this).onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        DiscoveryFragment discoveryFragmentF3;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.ds, new Class[0], Void.TYPE).isSupported && VideoPlayerManager.f76079a.c(this) == null) {
            Boolean boolF = HeyBoxApplication.f76798t.f();
            if (boolF != null && boolF.booleanValue()) {
                HeyBoxApplication.f76798t.r(Boolean.FALSE);
                return;
            }
            if (System.currentTimeMillis() - this.L <= 2000) {
                com.max.hbutils.utils.c.f73533a.a();
                super.onBackPressed();
                return;
            }
            this.L = System.currentTimeMillis();
            if (com.max.xiaoheihe.utils.c0.a() != null && !com.max.hbcommon.utils.c.w(com.max.xiaoheihe.utils.c0.a().getEntry())) {
                Iterator<TabKeyObj> it = com.max.xiaoheihe.utils.c0.a().getEntry().iterator();
                while (it.hasNext()) {
                    if ("/bbs/recommend".equals(it.next().getKey())) {
                        this.N.check(R.id.rb_1);
                        Q2(new String[]{S3, "/bbs/recommend"}, getIntent());
                        this.f76184p1.postDelayed(new h(), 20L);
                        return;
                    }
                }
            }
            if (com.max.xiaoheihe.utils.c0.f() != null && !com.max.hbcommon.utils.c.w(com.max.xiaoheihe.utils.c0.f().getEntry())) {
                Iterator<TabKeyObj> it2 = com.max.xiaoheihe.utils.c0.f().getEntry().iterator();
                while (it2.hasNext()) {
                    if ("/bbs/recommend".equals(it2.next().getKey()) && (discoveryFragmentF3 = f3()) != null && (!this.O.isChecked() || !"/home/recommend".equals(discoveryFragmentF3.e4()))) {
                        this.N.check(R.id.rb_2);
                        Q2(new String[]{"topic", "/bbs/recommend"}, getIntent());
                        this.f76184p1.postDelayed(new i(), 20L);
                        return;
                    }
                }
            }
            com.max.hbutils.utils.x.j(getString(R.string.click_again_to_exit));
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.fs, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
        }
        com.max.hbcommon.utils.d.b("onCheckedChanged", "buttonView=" + compoundButton + "           isChecked=" + z10);
        if (z10) {
            compoundButton.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        } else {
            compoundButton.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
        }
        if (compoundButton.getId() == R.id.rb_1) {
            if (z10) {
                if (this.J3) {
                    com.airbnb.lottie.j jVar = this.f76190y2;
                    if (jVar != null && !jVar.isRunning()) {
                        AccelWorldLottieKt.e(this.f76190y2, 0);
                    }
                } else {
                    AccelWorldLottieKt.d(this.f76190y2);
                }
                this.f76184p1.postDelayed(new j(), 0L);
            } else {
                this.O.setOnClickListener(this);
            }
        } else if (compoundButton.getId() == R.id.rb_2) {
            if (z10) {
                if (this.J3) {
                    com.airbnb.lottie.j jVar2 = this.G2;
                    if (jVar2 != null && !jVar2.isRunning()) {
                        AccelWorldLottieKt.e(this.G2, 0);
                    }
                } else {
                    AccelWorldLottieKt.d(this.G2);
                }
                this.f76184p1.postDelayed(new k(), 0L);
            } else {
                this.P.setOnClickListener(this);
            }
        } else if (compoundButton.getId() == R.id.rb_4) {
            if (z10) {
                if (this.J3) {
                    com.airbnb.lottie.j jVar3 = this.f76186p3;
                    if (jVar3 != null && !jVar3.isRunning()) {
                        AccelWorldLottieKt.e(this.f76186p3, 0);
                    }
                } else {
                    AccelWorldLottieKt.d(this.f76186p3);
                }
                NewcomerManager.f90882a.f(this, "3");
                this.f76184p1.postDelayed(new l(), 0L);
            } else {
                this.R.setOnClickListener(this);
            }
        } else if (compoundButton.getId() == R.id.rb_5 && z10) {
            if (this.J3) {
                com.airbnb.lottie.j jVar4 = this.G3;
                if (jVar4 != null && !jVar4.isRunning()) {
                    AccelWorldLottieKt.e(this.G3, 0);
                }
            } else {
                AccelWorldLottieKt.d(this.G3);
            }
            BubbleTipPopup bubbleTipPopup = this.N3;
            if (bubbleTipPopup != null) {
                bubbleTipPopup.G();
            }
        }
        switch (compoundButton.getId()) {
            case R.id.rb_1 /* 2131363858 */:
                T3(0, z10);
                long j10 = K4;
                if (j10 > L4) {
                    L4 = j10;
                    com.max.hbcache.c.C("news_tap_time", String.valueOf(j10));
                    d4();
                }
                break;
            case R.id.rb_2 /* 2131363859 */:
                T3(1, z10);
                long j11 = O4;
                if (j11 > P4) {
                    P4 = j11;
                    com.max.hbcache.c.C("bbs_tap_time", String.valueOf(j11));
                    d4();
                }
                break;
            case R.id.rb_4 /* 2131363861 */:
                T3(3, z10);
                long j12 = M4;
                if (j12 > N4) {
                    N4 = j12;
                    com.max.hbcache.c.C("game_tap_time", String.valueOf(j12));
                    d4();
                }
                break;
            case R.id.rb_5 /* 2131363862 */:
                T3(4, z10);
                long j13 = Q4;
                if (j13 > R4) {
                    R4 = j13;
                    com.max.hbcache.c.C("account_tap_time", String.valueOf(j13));
                    d4();
                }
                break;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        com.airbnb.lottie.j jVar;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.m.es, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        J4 = view.getId();
        if (view.getId() == R.id.rb_5 && "1".equals(com.max.hbcache.c.o("display_steam_icon", "0")) && (jVar = this.G3) != null) {
            Drawable drawableU3 = u3(jVar, R.drawable.nav_bar_me_normal_2);
            com.max.hbcache.c.C("display_steam_icon", "0");
            int iF = ViewUtils.f(this.f66601b, 26.0f);
            drawableU3.setBounds(0, 0, iF, iF);
            this.S.setCompoundDrawables(null, drawableU3, null, null);
            if (this.G3.R()) {
                this.G3.w();
            }
            AccelWorldLottieKt.e(this.G3, 0);
            BubbleTipPopup bubbleTipPopup = this.O3;
            if (bubbleTipPopup != null) {
                bubbleTipPopup.G();
                this.O3 = null;
            }
            BubbleTipPopup bubbleTipPopup2 = this.N3;
            if (bubbleTipPopup2 != null) {
                bubbleTipPopup2.G();
            }
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z10;
        Drawable drawable;
        String str;
        String str2;
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.m.ur, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        if (!"1".equals(com.max.hbcache.c.j(lb.a.f130931a1))) {
            HeyBoxApplication.C().w();
        }
        SecurityTool.setKD("MFANEHAMGACOBHIEMIHIJLKJPMMHJMMLABCNGBPPENCENPOM", String.valueOf(System.currentTimeMillis()));
        i3();
        getWindow().setFormat(-3);
        com.max.hbcommon.utils.d.b("mainactivity", "onCreate");
        if (i0.o().isLoginFlag()) {
            y3();
            b4();
        } else {
            i0.o().setPermission(new UserPermissionObj());
        }
        setContentView(R.layout.activity_main);
        com.max.hbutils.utils.t.h0(getWindow());
        com.max.hbutils.utils.t.M(this.f66601b, true);
        j1.a2(this.f66608i, new z0() { // from class: com.max.xiaoheihe.f
            @Override // androidx.core.view.z0
            public final n3 a(View view, n3 n3Var) {
                return this.f77020b.F3(view, n3Var);
            }
        });
        findViewById(R.id.fragment_container).setVisibility(8);
        this.N = (RadioGroup) findViewById(R.id.rg_main);
        this.f76182b0 = (RelativeLayout) findViewById(R.id.vg_main_root);
        this.O = (RadioButton) findViewById(R.id.rb_1);
        this.P = (RadioButton) findViewById(R.id.rb_2);
        this.Q = (RadioButton) findViewById(R.id.rb_3);
        this.Y = (ViewGroup) findViewById(R.id.vg_tips_3);
        this.Z = findViewById(R.id.vg_mid_tab);
        this.R = (RadioButton) findViewById(R.id.rb_4);
        this.S = (RadioButton) findViewById(R.id.rb_5);
        this.T = (ImageView) findViewById(R.id.iv_tips_1);
        this.U = (ImageView) findViewById(R.id.iv_tips_2);
        this.V = (ImageView) findViewById(R.id.iv_tips_3);
        this.W = (ImageView) findViewById(R.id.iv_tips_4);
        this.X = (ImageView) findViewById(R.id.iv_tips_5);
        this.f76181a0 = (ViewGroup) findViewById(R.id.vg_tips);
        this.O.setOnCheckedChangeListener(this);
        this.P.setOnCheckedChangeListener(this);
        this.Q.setOnCheckedChangeListener(this);
        this.R.setOnCheckedChangeListener(this);
        this.S.setOnCheckedChangeListener(this);
        this.O.setOnClickListener(this);
        this.P.setOnClickListener(this);
        this.Q.setOnClickListener(this);
        this.R.setOnClickListener(this);
        this.S.setOnClickListener(this);
        TipsStateObj tipsStateObj = f76171q5;
        if (tipsStateObj != null) {
            e4(tipsStateObj);
            com.max.xiaoheihe.utils.c0.m();
        }
        HeyBoxApplication.f76798t.k(this, new u());
        final int iF = ViewUtils.f(this.f66601b, 26.0f);
        Drawable drawable2 = getResources().getDrawable(R.drawable.nav_bar_bbs);
        this.f76189y1 = drawable2;
        drawable2.setBounds(0, 0, iF, iF);
        Drawable drawable3 = getResources().getDrawable(R.drawable.nav_bar_store);
        this.f76185p2 = drawable3;
        drawable3.setBounds(0, 0, iF, iF);
        Set<String> setP = com.max.hbcache.c.p(com.max.hbcache.c.B);
        if (!(setP != null && setP.size() > 0)) {
            z10 = false;
            break;
        }
        Iterator<String> it = setP.iterator();
        z10 = false;
        while (it.hasNext()) {
            if (!new File(it.next()).exists()) {
                z10 = false;
                break;
            }
            z10 = true;
        }
        if (z10) {
            String strQ = com.max.hbcache.c.q(com.max.hbcache.c.K, "");
            String strQ2 = com.max.hbcache.c.q(com.max.hbcache.c.L, "");
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            for (String str11 : setP) {
                if (str11.contains(com.max.hbcache.c.C)) {
                    str4 = str11;
                } else if (str11.contains(com.max.hbcache.c.D)) {
                    str5 = str11;
                } else if (str11.contains(com.max.hbcache.c.E)) {
                    str6 = str11;
                } else if (str11.contains(com.max.hbcache.c.F)) {
                    str7 = str11;
                } else if (str11.contains(com.max.hbcache.c.G)) {
                    str3 = str11;
                } else if (str11.contains(com.max.hbcache.c.H)) {
                    str8 = str11;
                } else if (str11.contains(com.max.hbcache.c.I)) {
                    str10 = str11;
                } else if (str11.contains(com.max.hbcache.c.J)) {
                    str9 = str11;
                }
            }
            int[][] iArr = {new int[]{android.R.attr.state_checked}, new int[0]};
            int color = getResources().getColor(R.color.nav_bar_inactive);
            int color2 = getResources().getColor(R.color.nav_bar_active);
            if (!com.max.hbcommon.utils.c.u(strQ)) {
                color = com.max.xiaoheihe.utils.d.e1(strQ);
            }
            if (!com.max.hbcommon.utils.c.u(strQ2)) {
                color2 = com.max.xiaoheihe.utils.d.e1(strQ2);
            }
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{color2, color});
            if (str4 != null && str5 != null) {
                Drawable drawableT3 = t3(str4, str5);
                drawableT3.setBounds(0, 0, iF, iF);
                this.O.setCompoundDrawables(null, drawableT3, null, null);
                this.O.setTextColor(colorStateList);
            }
            if (str6 != null && str7 != null) {
                Drawable drawableT4 = t3(str6, str7);
                this.f76189y1 = drawableT4;
                drawableT4.setBounds(0, 0, iF, iF);
                this.P.setCompoundDrawables(null, this.f76189y1, null, null);
                this.P.setTextColor(colorStateList);
            }
            if (str3 == null || (str2 = str8) == null) {
                drawable = null;
            } else {
                Drawable drawableT5 = t3(str3, str2);
                this.f76185p2 = drawableT5;
                drawableT5.setBounds(0, 0, iF, iF);
                drawable = null;
                this.R.setCompoundDrawables(null, this.f76185p2, null, null);
                this.R.setTextColor(colorStateList);
            }
            String str12 = str10;
            if (str12 != null && (str = str9) != null) {
                Drawable drawableT6 = t3(str12, str);
                drawableT6.setBounds(0, 0, iF, iF);
                this.S.setCompoundDrawables(drawable, drawableT6, drawable, drawable);
                this.S.setTextColor(colorStateList);
            }
        } else {
            this.J3 = true;
            AccelWorldLottieKt.i(this, R.raw.nav_bar_anim_discover_v2, new yh.l() { // from class: com.max.xiaoheihe.g
                @Override // yh.l
                public final Object invoke(Object obj) {
                    return this.f77021b.G3(iF, (com.airbnb.lottie.j) obj);
                }
            });
            AccelWorldLottieKt.i(this, R.raw.nav_bar_anim_store_v2, new yh.l() { // from class: com.max.xiaoheihe.h
                @Override // yh.l
                public final Object invoke(Object obj) {
                    return this.f77024b.H3(iF, (com.airbnb.lottie.j) obj);
                }
            });
            AccelWorldLottieKt.i(this, R.raw.nav_bar_anim_bbs_v2, new yh.l() { // from class: com.max.xiaoheihe.i
                @Override // yh.l
                public final Object invoke(Object obj) {
                    return this.f77104b.I3(iF, (com.airbnb.lottie.j) obj);
                }
            });
            AccelWorldLottieKt.i(this, R.raw.nav_bar_anim_me_v2, new yh.l() { // from class: com.max.xiaoheihe.j
                @Override // yh.l
                public final Object invoke(Object obj) {
                    return this.f77106b.K3(iF, (com.airbnb.lottie.j) obj);
                }
            });
        }
        if (E4) {
            this.Q.setVisibility(4);
            this.Z.setVisibility(0);
            this.Y.setVisibility(0);
            this.Z.setOnClickListener(new a0());
        } else {
            this.Q.setVisibility(8);
            this.Z.setVisibility(8);
            this.Y.setVisibility(8);
        }
        this.O.setText(com.max.xiaoheihe.utils.c0.a().getTitle());
        this.P.setText(com.max.xiaoheihe.utils.c0.f().getTitle());
        this.R.setText(com.max.xiaoheihe.utils.c0.j().getTitle());
        if (!this.J3) {
            this.P.setCompoundDrawables(null, this.f76189y1, null, null);
            this.R.setCompoundDrawables(null, this.f76185p2, null, null);
        }
        B3(getIntent(), bundle);
        TabChangeBroadcastReceiver tabChangeBroadcastReceiver = new TabChangeBroadcastReceiver();
        this.f76188x2 = tabChangeBroadcastReceiver;
        t1(tabChangeBroadcastReceiver, "com.max.xiaoheihe.concept.channel");
        X2();
        W2();
        O2();
        K2();
        J2();
        r1.I1();
        s3();
        Y3(2000L);
        T2();
        if (i0.s() && "1".equals(com.max.hbcache.c.o("valid_ws", ""))) {
            m0.x().C();
        }
        com.max.xiaoheihe.utils.h.h(this.f66601b);
        t0.f94779a.d();
        ImageViewerP.d(new yh.r() { // from class: com.max.xiaoheihe.k
            @Override // yh.r
            public final Object U0(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainActivity.L3((Context) obj, (String[]) obj2, (ArrayList) obj3, (Integer) obj4);
            }
        });
        t1(this.Q3, lb.a.f130942c0);
        l3();
        if (!com.max.hbcommon.utils.c.u(F4)) {
            com.max.xiaoheihe.base.router.b.k0(this.f66601b, F4);
            F4 = null;
        }
        HBDialogManagerKt.f(this);
        a4();
        com.max.xiaoheihe.utils.v.h(this.f66601b);
        com.max.xiaoheihe.accelworld.i.a();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.bs, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.webview.d0.g().e();
        com.max.hbcommon.utils.k.q();
        super.onDestroy();
        m0.x().u();
        TabChangeBroadcastReceiver tabChangeBroadcastReceiver = this.f76188x2;
        if (tabChangeBroadcastReceiver != null) {
            unregisterReceiver(tabChangeBroadcastReceiver);
        }
        unregisterReceiver(this.Q3);
        this.f76184p1.removeCallbacksAndMessages(null);
        if (ad.a.d()) {
            S3();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, bb.c.m.Fr, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        Log.d("onNewIntent", "handleSelectPlatform");
        setIntent(intent);
        B3(intent, null);
        P2(intent);
        C3(intent);
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, @n0 String[] strArr, @n0 int[] iArr) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), strArr, iArr}, this, changeQuickRedirect, false, bb.c.m.rs, new Class[]{Integer.TYPE, String[].class, int[].class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.x("MainActivity, onRequestPermissionsResult, requestCode = " + i10 + ", permissions = " + strArr + ", grantResults = " + iArr);
        super.onRequestPermissionsResult(i10, strArr, iArr);
        HeyboxVoiceFragment heyboxVoiceFragment = this.P3;
        if (heyboxVoiceFragment != null) {
            heyboxVoiceFragment.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Or, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        this.M = System.currentTimeMillis();
        com.max.hbcommon.analytics.d.B();
        if (f76169p5) {
            f76171q5 = null;
            if (i0.o().isLoginFlag()) {
                y3();
                b4();
            } else {
                i0.o().setPermission(new UserPermissionObj());
                w3();
            }
            Fragment fragmentS0 = getSupportFragmentManager().s0("4");
            if (fragmentS0 instanceof MehomefragmentV2) {
                androidx.fragment.app.p0 p0VarU = getSupportFragmentManager().u();
                if (e3() == 4) {
                    p0VarU.z(R.id.fl_container, q3(), "4");
                } else {
                    p0VarU.x(fragmentS0);
                }
                p0VarU.n();
                getSupportFragmentManager().n0();
                f76169p5 = false;
            }
        }
        if (com.max.xiaoheihe.utils.h.f95396d.booleanValue() && com.max.hbcommon.utils.c.u(com.max.xiaoheihe.utils.h.f())) {
            com.max.xiaoheihe.utils.h.a();
        }
        S2();
        this.f76184p1.postDelayed(new Runnable() { // from class: com.max.xiaoheihe.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f77014b.M3();
            }
        }, 1500L);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.m.Sr, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("mainactivity", "onSaveInstanceState");
        super.onSaveInstanceState(bundle);
        bundle.putInt("checkedtab", this.N.getCheckedRadioButtonId());
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.wr, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        ConnectivityWrapper connectivityWrapper = ConnectivityWrapper.f68011a;
        connectivityWrapper.h();
        connectivityWrapper.l(this.R3);
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.xr, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStop();
        ConnectivityWrapper connectivityWrapper = ConnectivityWrapper.f68011a;
        connectivityWrapper.o(this.R3);
        connectivityWrapper.i();
    }

    @Override // com.max.xiaoheihe.app.c
    public /* synthetic */ void u(Activity activity) {
        com.max.xiaoheihe.app.b.d(this, activity);
    }

    public void w3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Wr, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (f76171q5 == null) {
            V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().o().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a()));
        } else {
            f76171q5 = null;
        }
    }

    public void y3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Vr, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().d7().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.schedulers.b.d()).J5(new e0()));
    }
}
