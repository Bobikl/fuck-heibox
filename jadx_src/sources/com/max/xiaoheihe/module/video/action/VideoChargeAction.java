package com.max.xiaoheihe.module.video.action;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.network.q;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.LinkBatteryInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkBatteryObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.td0;
import df.yc0;
import df.zc0;
import dl.e;
import io.reactivex.disposables.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.flow.v;

/* JADX INFO: compiled from: VideoChargeAction.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class VideoChargeAction implements com.max.video.ui.widget.f {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f93557g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private td0 f93558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private yh.a<b2> f93559b = new yh.a<b2>() { // from class: com.max.xiaoheihe.module.video.action.VideoChargeAction$chargeClickAction$1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ b2 invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46261, new Class[0], Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            invoke2();
            return b2.f124493a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private yh.l<? super Integer, b2> f93560c = new yh.l<Integer, b2>() { // from class: com.max.xiaoheihe.module.video.action.VideoChargeAction$chargedAction$1
        public static ChangeQuickRedirect changeQuickRedirect;

        public final void a(int i10) {
        }

        /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.b2] */
        @Override // yh.l
        public /* bridge */ /* synthetic */ b2 invoke(Integer num) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 46262, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            a(num.intValue());
            return b2.f124493a;
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private yh.l<? super io.reactivex.disposables.b, b2> f93561d = new yh.l<io.reactivex.disposables.b, b2>() { // from class: com.max.xiaoheihe.module.video.action.VideoChargeAction$registerDisposable$1
        public static ChangeQuickRedirect changeQuickRedirect;

        public final void a(@e b bVar) {
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
        @Override // yh.l
        public /* bridge */ /* synthetic */ b2 invoke(b bVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 46284, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            a(bVar);
            return b2.f124493a;
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private kotlinx.coroutines.flow.j<Boolean> f93562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final u<Boolean> f93563f;

    /* JADX INFO: compiled from: VideoChargeAction.kt */
    public static final class a extends q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yc0 f93564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ af.l f93565c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ VideoChargeAction f93566d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f93567e;

        a(yc0 yc0Var, af.l lVar, VideoChargeAction videoChargeAction, String str) {
            this.f93564b = yc0Var;
            this.f93565c = lVar;
            this.f93566d = videoChargeAction;
            this.f93567e = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 46255, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
            this.f93564b.f117909c.setVisibility(8);
            this.f93564b.f117917k.setVisibility(0);
            this.f93565c.r();
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 46256, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            this.f93566d.t().invoke(Integer.valueOf(n.q(this.f93567e)));
            this.f93564b.f117909c.setVisibility(8);
            this.f93564b.f117917k.setVisibility(0);
            this.f93566d.f93562e.setValue(Boolean.TRUE);
            this.f93565c.r();
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46257, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: VideoChargeAction.kt */
    public static final class b extends q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zc0 f93568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ af.l f93569c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ VideoChargeAction f93570d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f93571e;

        b(zc0 zc0Var, af.l lVar, VideoChargeAction videoChargeAction, String str) {
            this.f93568b = zc0Var;
            this.f93569c = lVar;
            this.f93570d = videoChargeAction;
            this.f93571e = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 46258, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
            this.f93568b.f118309c.setVisibility(8);
            this.f93568b.f118316j.setVisibility(0);
            this.f93569c.r();
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 46259, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            this.f93570d.t().invoke(Integer.valueOf(n.q(this.f93571e)));
            this.f93568b.f118309c.setVisibility(8);
            this.f93568b.f118316j.setVisibility(0);
            this.f93570d.f93562e.setValue(Boolean.TRUE);
            this.f93569c.r();
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46260, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: VideoChargeAction.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46263, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            VideoChargeAction.this.r().invoke();
        }
    }

    /* JADX INFO: compiled from: VideoChargeAction.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ af.l f93575b;

        d(af.l lVar) {
            this.f93575b = lVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46270, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f93575b.r();
        }
    }

    /* JADX INFO: compiled from: VideoChargeAction.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f93576b;

        e(Context context) {
            this.f93576b = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Context context;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46271, new Class[]{View.class}, Void.TYPE).isSupported || (context = this.f93576b) == null) {
                return;
            }
            Intent intent = new Intent(context, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.f130945c3);
            intent.putExtra("title", com.max.xiaoheihe.utils.d.n0(R.string.heybox_battery_faq));
            context.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: VideoChargeAction.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ af.l f93577b;

        f(af.l lVar) {
            this.f93577b = lVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46272, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f93577b.r();
        }
    }

    /* JADX INFO: compiled from: VideoChargeAction.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f93578b;

        g(Context context) {
            this.f93578b = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Context context;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46273, new Class[]{View.class}, Void.TYPE).isSupported || (context = this.f93578b) == null) {
                return;
            }
            Intent intent = new Intent(context, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.f130945c3);
            intent.putExtra("title", com.max.xiaoheihe.utils.d.n0(R.string.heybox_battery_faq));
            context.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: VideoChargeAction.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<KeyDescObj> f93579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f93580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ VideoChargeAction f93581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ af.l f93582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ yc0 f93583f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ LinearLayout f93584g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f93585h;

        /* JADX WARN: Multi-variable type inference failed */
        h(List<? extends KeyDescObj> list, KeyDescObj keyDescObj, VideoChargeAction videoChargeAction, af.l lVar, yc0 yc0Var, LinearLayout linearLayout, String str) {
            this.f93579b = list;
            this.f93580c = keyDescObj;
            this.f93581d = videoChargeAction;
            this.f93582e = lVar;
            this.f93583f = yc0Var;
            this.f93584g = linearLayout;
            this.f93585h = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46274, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.U1(this.f93579b, this.f93580c);
            VideoChargeAction.k(this.f93581d, this.f93582e, this.f93583f, this.f93584g, this.f93579b, this.f93585h);
            VideoChargeAction.m(this.f93581d, this.f93582e, this.f93583f, this.f93579b, this.f93585h);
        }
    }

    /* JADX INFO: compiled from: VideoChargeAction.kt */
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<KeyDescObj> f93586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f93587c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ VideoChargeAction f93588d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ af.l f93589e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ zc0 f93590f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ LinearLayout f93591g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f93592h;

        /* JADX WARN: Multi-variable type inference failed */
        i(List<? extends KeyDescObj> list, KeyDescObj keyDescObj, VideoChargeAction videoChargeAction, af.l lVar, zc0 zc0Var, LinearLayout linearLayout, String str) {
            this.f93586b = list;
            this.f93587c = keyDescObj;
            this.f93588d = videoChargeAction;
            this.f93589e = lVar;
            this.f93590f = zc0Var;
            this.f93591g = linearLayout;
            this.f93592h = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46275, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.U1(this.f93586b, this.f93587c);
            VideoChargeAction.l(this.f93588d, this.f93589e, this.f93590f, this.f93591g, this.f93586b, this.f93592h);
            VideoChargeAction.n(this.f93588d, this.f93589e, this.f93590f, this.f93586b, this.f93592h);
        }
    }

    /* JADX INFO: compiled from: VideoChargeAction.kt */
    public static final class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ af.l f93597c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ yc0 f93598d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f93599e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f93600f;

        j(af.l lVar, yc0 yc0Var, KeyDescObj keyDescObj, String str) {
            this.f93597c = lVar;
            this.f93598d = yc0Var;
            this.f93599e = keyDescObj;
            this.f93600f = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46276, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            VideoChargeAction videoChargeAction = VideoChargeAction.this;
            af.l lVar = this.f93597c;
            yc0 yc0Var = this.f93598d;
            KeyDescObj keyDescObj = this.f93599e;
            f0.m(keyDescObj);
            String key = keyDescObj.getKey();
            f0.o(key, "current!!.key");
            VideoChargeAction.e(videoChargeAction, lVar, yc0Var, key, this.f93600f);
        }
    }

    /* JADX INFO: compiled from: VideoChargeAction.kt */
    public static final class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ af.l f93602c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zc0 f93603d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f93604e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f93605f;

        k(af.l lVar, zc0 zc0Var, KeyDescObj keyDescObj, String str) {
            this.f93602c = lVar;
            this.f93603d = zc0Var;
            this.f93604e = keyDescObj;
            this.f93605f = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46277, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            VideoChargeAction videoChargeAction = VideoChargeAction.this;
            af.l lVar = this.f93602c;
            zc0 zc0Var = this.f93603d;
            KeyDescObj keyDescObj = this.f93604e;
            f0.m(keyDescObj);
            String key = keyDescObj.getKey();
            f0.o(key, "current!!.key");
            VideoChargeAction.f(videoChargeAction, lVar, zc0Var, key, this.f93605f);
        }
    }

    /* JADX INFO: compiled from: VideoChargeAction.kt */
    public static final class l extends com.max.hbcommon.network.d<Result<LinkBatteryInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yc0 f93606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoChargeAction f93607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f93608d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ af.l f93609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f93610f;

        l(yc0 yc0Var, VideoChargeAction videoChargeAction, Context context, af.l lVar, String str) {
            this.f93606b = yc0Var;
            this.f93607c = videoChargeAction;
            this.f93608d = context;
            this.f93609e = lVar;
            this.f93610f = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 46278, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
            this.f93606b.f117909c.setVisibility(8);
        }

        public void onNext(@dl.d Result<LinkBatteryInfoObj> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 46279, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(t10, "t");
            super.onNext(t10);
            this.f93606b.f117909c.setVisibility(8);
            VideoChargeAction.i(this.f93607c, this.f93608d, this.f93609e, this.f93606b, t10.getResult(), this.f93610f);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46280, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<LinkBatteryInfoObj>) obj);
        }
    }

    /* JADX INFO: compiled from: VideoChargeAction.kt */
    public static final class m extends com.max.hbcommon.network.d<Result<LinkBatteryInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zc0 f93611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoChargeAction f93612c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f93613d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ af.l f93614e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f93615f;

        m(zc0 zc0Var, VideoChargeAction videoChargeAction, Context context, af.l lVar, String str) {
            this.f93611b = zc0Var;
            this.f93612c = videoChargeAction;
            this.f93613d = context;
            this.f93614e = lVar;
            this.f93615f = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 46281, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
            this.f93611b.f118309c.setVisibility(8);
        }

        public void onNext(@dl.d Result<LinkBatteryInfoObj> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 46282, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(t10, "t");
            super.onNext(t10);
            this.f93611b.f118309c.setVisibility(8);
            VideoChargeAction.j(this.f93612c, this.f93613d, this.f93614e, this.f93611b, t10.getResult(), this.f93615f);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46283, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<LinkBatteryInfoObj>) obj);
        }
    }

    public VideoChargeAction() {
        kotlinx.coroutines.flow.j<Boolean> jVarA = v.a(Boolean.FALSE);
        this.f93562e = jVarA;
        this.f93563f = jVarA;
    }

    private final void A(af.l lVar, zc0 zc0Var, List<? extends KeyDescObj> list, String str) {
        if (PatchProxy.proxy(new Object[]{lVar, zc0Var, list, str}, this, changeQuickRedirect, false, 46242, new Class[]{af.l.class, zc0.class, List.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        KeyDescObj keyDescObjN = com.max.xiaoheihe.utils.d.N(list);
        boolean z10 = keyDescObjN != null;
        zc0Var.f118313g.setEnabled(z10);
        if (z10) {
            zc0Var.f118313g.setOnClickListener(new k(lVar, zc0Var, keyDescObjN, str));
        } else {
            zc0Var.f118313g.setClickable(false);
        }
    }

    private final void D(Context context, af.l lVar, yc0 yc0Var, List<? extends KeyDescObj> list, String str) {
        if (PatchProxy.proxy(new Object[]{context, lVar, yc0Var, list, str}, this, changeQuickRedirect, false, 46239, new Class[]{Context.class, af.l.class, yc0.class, List.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        LinearLayout linearLayout = yc0Var.f117917k;
        f0.o(linearLayout, "binding.vgBatteryOption");
        linearLayout.removeAllViews();
        int size = list != null ? list.size() : 0;
        if (size <= 0) {
            return;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i10 = 0;
        while (i10 < size) {
            f0.m(list);
            int iQ = n.q(list.get(i10).getKey());
            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_menu_battery_charge, (ViewGroup) linearLayout, false);
            f0.o(viewInflate, "inflater.inflate(\n      …      false\n            )");
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.height = ViewUtils.f(context, 94.0f);
            marginLayoutParams.width = ViewUtils.f(context, 80.0f);
            marginLayoutParams.leftMargin = i10 == 0 ? 0 : ViewUtils.f(context, 6.0f);
            viewInflate.setLayoutParams(marginLayoutParams);
            View viewFindViewById = viewInflate.findViewById(R.id.iv_img);
            f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView = (ImageView) viewFindViewById;
            View viewFindViewById2 = viewInflate.findViewById(R.id.tv_heybox_battery_cnt);
            f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) viewFindViewById2;
            if (iQ == 1) {
                imageView.setImageResource(R.drawable.ic_battery_1);
            } else if (iQ == 2) {
                imageView.setImageResource(R.drawable.ic_battery_2);
            } else if (iQ == 5) {
                imageView.setImageResource(R.drawable.ic_battery_5);
            }
            v0 v0Var = v0.f124986a;
            String str2 = String.format(Locale.US, "x%d", Arrays.copyOf(new Object[]{Integer.valueOf(iQ)}, 1));
            f0.o(str2, "format(locale, format, *args)");
            textView.setText(str2);
            linearLayout.addView(viewInflate);
            i10++;
        }
        x(lVar, yc0Var, linearLayout, list, str);
    }

    private final void E(Context context, af.l lVar, zc0 zc0Var, List<? extends KeyDescObj> list, String str) {
        if (PatchProxy.proxy(new Object[]{context, lVar, zc0Var, list, str}, this, changeQuickRedirect, false, 46240, new Class[]{Context.class, af.l.class, zc0.class, List.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        LinearLayout linearLayout = zc0Var.f118316j;
        f0.o(linearLayout, "binding.vgBatteryOption");
        linearLayout.removeAllViews();
        int size = list != null ? list.size() : 0;
        if (size <= 0) {
            return;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i10 = 0;
        while (i10 < size) {
            f0.m(list);
            int iQ = n.q(list.get(i10).getKey());
            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_menu_battery_charge, (ViewGroup) linearLayout, false);
            f0.o(viewInflate, "inflater.inflate(\n      …      false\n            )");
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.height = ViewUtils.f(context, 94.0f);
            marginLayoutParams.width = ViewUtils.f(context, 80.0f);
            marginLayoutParams.leftMargin = i10 == 0 ? 0 : ViewUtils.f(context, 6.0f);
            viewInflate.setLayoutParams(marginLayoutParams);
            View viewFindViewById = viewInflate.findViewById(R.id.iv_img);
            f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView = (ImageView) viewFindViewById;
            View viewFindViewById2 = viewInflate.findViewById(R.id.tv_heybox_battery_cnt);
            f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) viewFindViewById2;
            if (iQ == 1) {
                imageView.setImageResource(R.drawable.ic_battery_1);
            } else if (iQ == 2) {
                imageView.setImageResource(R.drawable.ic_battery_2);
            } else if (iQ == 5) {
                imageView.setImageResource(R.drawable.ic_battery_5);
            }
            v0 v0Var = v0.f124986a;
            String str2 = String.format(Locale.US, "x%d", Arrays.copyOf(new Object[]{Integer.valueOf(iQ)}, 1));
            f0.o(str2, "format(locale, format, *args)");
            textView.setText(str2);
            linearLayout.addView(viewInflate);
            i10++;
        }
        y(lVar, zc0Var, linearLayout, list, str);
    }

    public static final /* synthetic */ void e(VideoChargeAction videoChargeAction, af.l lVar, yc0 yc0Var, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{videoChargeAction, lVar, yc0Var, str, str2}, null, changeQuickRedirect, true, 46249, new Class[]{VideoChargeAction.class, af.l.class, yc0.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        videoChargeAction.o(lVar, yc0Var, str, str2);
    }

    public static final /* synthetic */ void f(VideoChargeAction videoChargeAction, af.l lVar, zc0 zc0Var, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{videoChargeAction, lVar, zc0Var, str, str2}, null, changeQuickRedirect, true, 46250, new Class[]{VideoChargeAction.class, af.l.class, zc0.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        videoChargeAction.p(lVar, zc0Var, str, str2);
    }

    public static final /* synthetic */ void i(VideoChargeAction videoChargeAction, Context context, af.l lVar, yc0 yc0Var, LinkBatteryInfoObj linkBatteryInfoObj, String str) {
        if (PatchProxy.proxy(new Object[]{videoChargeAction, context, lVar, yc0Var, linkBatteryInfoObj, str}, null, changeQuickRedirect, true, 46247, new Class[]{VideoChargeAction.class, Context.class, af.l.class, yc0.class, LinkBatteryInfoObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        videoChargeAction.v(context, lVar, yc0Var, linkBatteryInfoObj, str);
    }

    public static final /* synthetic */ void j(VideoChargeAction videoChargeAction, Context context, af.l lVar, zc0 zc0Var, LinkBatteryInfoObj linkBatteryInfoObj, String str) {
        if (PatchProxy.proxy(new Object[]{videoChargeAction, context, lVar, zc0Var, linkBatteryInfoObj, str}, null, changeQuickRedirect, true, 46248, new Class[]{VideoChargeAction.class, Context.class, af.l.class, zc0.class, LinkBatteryInfoObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        videoChargeAction.w(context, lVar, zc0Var, linkBatteryInfoObj, str);
    }

    public static final /* synthetic */ void k(VideoChargeAction videoChargeAction, af.l lVar, yc0 yc0Var, LinearLayout linearLayout, List list, String str) {
        if (PatchProxy.proxy(new Object[]{videoChargeAction, lVar, yc0Var, linearLayout, list, str}, null, changeQuickRedirect, true, 46251, new Class[]{VideoChargeAction.class, af.l.class, yc0.class, LinearLayout.class, List.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        videoChargeAction.x(lVar, yc0Var, linearLayout, list, str);
    }

    public static final /* synthetic */ void l(VideoChargeAction videoChargeAction, af.l lVar, zc0 zc0Var, LinearLayout linearLayout, List list, String str) {
        if (PatchProxy.proxy(new Object[]{videoChargeAction, lVar, zc0Var, linearLayout, list, str}, null, changeQuickRedirect, true, 46253, new Class[]{VideoChargeAction.class, af.l.class, zc0.class, LinearLayout.class, List.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        videoChargeAction.y(lVar, zc0Var, linearLayout, list, str);
    }

    public static final /* synthetic */ void m(VideoChargeAction videoChargeAction, af.l lVar, yc0 yc0Var, List list, String str) {
        if (PatchProxy.proxy(new Object[]{videoChargeAction, lVar, yc0Var, list, str}, null, changeQuickRedirect, true, 46252, new Class[]{VideoChargeAction.class, af.l.class, yc0.class, List.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        videoChargeAction.z(lVar, yc0Var, list, str);
    }

    public static final /* synthetic */ void n(VideoChargeAction videoChargeAction, af.l lVar, zc0 zc0Var, List list, String str) {
        if (PatchProxy.proxy(new Object[]{videoChargeAction, lVar, zc0Var, list, str}, null, changeQuickRedirect, true, 46254, new Class[]{VideoChargeAction.class, af.l.class, zc0.class, List.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        videoChargeAction.A(lVar, zc0Var, list, str);
    }

    private final void o(af.l lVar, yc0 yc0Var, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{lVar, yc0Var, str, str2}, this, changeQuickRedirect, false, 46243, new Class[]{af.l.class, yc0.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        yc0Var.f117909c.setVisibility(0);
        yc0Var.f117917k.setVisibility(8);
        this.f93561d.invoke(com.max.xiaoheihe.network.i.a().F7(str2, str, "").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a(yc0Var, lVar, this, str)));
    }

    private final void p(af.l lVar, zc0 zc0Var, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{lVar, zc0Var, str, str2}, this, changeQuickRedirect, false, 46244, new Class[]{af.l.class, zc0.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        zc0Var.f118309c.setVisibility(0);
        zc0Var.f118316j.setVisibility(8);
        this.f93561d.invoke(com.max.xiaoheihe.network.i.a().F7(str2, str, "").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(zc0Var, lVar, this, str)));
    }

    private final void v(Context context, af.l lVar, yc0 yc0Var, LinkBatteryInfoObj linkBatteryInfoObj, String str) {
        if (PatchProxy.proxy(new Object[]{context, lVar, yc0Var, linkBatteryInfoObj, str}, this, changeQuickRedirect, false, 46237, new Class[]{Context.class, af.l.class, yc0.class, LinkBatteryInfoObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        KeyDescObj keyDescObj = null;
        if ((linkBatteryInfoObj != null ? linkBatteryInfoObj.getBattery() : null) != null) {
            LinkBatteryObj battery = linkBatteryInfoObj.getBattery();
            if (com.max.hbcommon.utils.c.x(battery != null ? battery.getEnabled() : null)) {
                LinkBatteryObj battery2 = linkBatteryInfoObj.getBattery();
                yc0Var.f117911e.setText(battery2.getBalance());
                List<Integer> charge_limits = battery2.getCharge_limits();
                int size = charge_limits != null ? charge_limits.size() : 0;
                if (size > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < size; i10++) {
                        KeyDescObj keyDescObj2 = new KeyDescObj();
                        Integer num = battery2.getCharge_limits().get(i10);
                        f0.o(num, "batteryInfo.charge_limits[i]");
                        int iIntValue = num.intValue();
                        keyDescObj2.setKey("" + iIntValue);
                        boolean z10 = n.o(battery2.getBalance()) >= ((double) iIntValue);
                        keyDescObj2.setEnable(z10 ? "1" : "0");
                        if (z10 && keyDescObj == null) {
                            keyDescObj = keyDescObj2;
                        }
                        arrayList.add(keyDescObj2);
                    }
                    com.max.xiaoheihe.utils.d.U1(arrayList, keyDescObj);
                    D(context, lVar, yc0Var, arrayList, str);
                    z(lVar, yc0Var, arrayList, str);
                }
                yc0Var.f117910d.setText(battery2.getCount());
                yc0Var.f117908b.setOnClickListener(new d(lVar));
                yc0Var.f117913g.setOnClickListener(new e(context));
                return;
            }
        }
        lVar.r();
        com.max.hbutils.utils.c.f("该文章无法充电");
    }

    private final void w(Context context, af.l lVar, zc0 zc0Var, LinkBatteryInfoObj linkBatteryInfoObj, String str) {
        if (PatchProxy.proxy(new Object[]{context, lVar, zc0Var, linkBatteryInfoObj, str}, this, changeQuickRedirect, false, 46238, new Class[]{Context.class, af.l.class, zc0.class, LinkBatteryInfoObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        KeyDescObj keyDescObj = null;
        if ((linkBatteryInfoObj != null ? linkBatteryInfoObj.getBattery() : null) != null) {
            LinkBatteryObj battery = linkBatteryInfoObj.getBattery();
            if (com.max.hbcommon.utils.c.x(battery != null ? battery.getEnabled() : null)) {
                LinkBatteryObj battery2 = linkBatteryInfoObj.getBattery();
                zc0Var.f118312f.setText(battery2.getBalance());
                List<Integer> charge_limits = battery2.getCharge_limits();
                int size = charge_limits != null ? charge_limits.size() : 0;
                if (size > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < size; i10++) {
                        KeyDescObj keyDescObj2 = new KeyDescObj();
                        Integer num = battery2.getCharge_limits().get(i10);
                        f0.o(num, "batteryInfo.charge_limits[i]");
                        int iIntValue = num.intValue();
                        keyDescObj2.setKey("" + iIntValue);
                        boolean z10 = n.o(battery2.getBalance()) >= ((double) iIntValue);
                        keyDescObj2.setEnable(z10 ? "1" : "0");
                        if (z10 && keyDescObj == null) {
                            keyDescObj = keyDescObj2;
                        }
                        arrayList.add(keyDescObj2);
                    }
                    com.max.xiaoheihe.utils.d.U1(arrayList, keyDescObj);
                    E(context, lVar, zc0Var, arrayList, str);
                    A(lVar, zc0Var, arrayList, str);
                }
                zc0Var.f118311e.setText(battery2.getCount());
                zc0Var.f118308b.setOnClickListener(new f(lVar));
                zc0Var.f118314h.setOnClickListener(new g(context));
                return;
            }
        }
        lVar.r();
        com.max.hbutils.utils.c.f("该文章无法充电");
    }

    private final void x(af.l lVar, yc0 yc0Var, LinearLayout linearLayout, List<? extends KeyDescObj> list, String str) {
        if (PatchProxy.proxy(new Object[]{lVar, yc0Var, linearLayout, list, str}, this, changeQuickRedirect, false, 46245, new Class[]{af.l.class, yc0.class, LinearLayout.class, List.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        int childCount = linearLayout.getChildCount();
        if (list == null || childCount != list.size()) {
            return;
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            KeyDescObj keyDescObj = list.get(i10);
            View childAt = linearLayout.getChildAt(i10);
            f0.n(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) childAt;
            if (f0.g("1", keyDescObj.getEnable())) {
                viewGroup.setOnClickListener(new h(list, keyDescObj, this, lVar, yc0Var, linearLayout, str));
                viewGroup.setBackgroundResource(keyDescObj.isChecked() ? R.drawable.background_white_alpha20_r4_white_stroke : R.drawable.background_white_alpha20_r4);
                int childCount2 = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    viewGroup.getChildAt(i11).setAlpha(1.0f);
                }
            } else {
                viewGroup.setClickable(false);
                viewGroup.setBackgroundResource(R.drawable.divider_bg_4dp);
                int childCount3 = viewGroup.getChildCount();
                for (int i12 = 0; i12 < childCount3; i12++) {
                    viewGroup.getChildAt(i12).setAlpha(0.4f);
                }
            }
        }
    }

    private final void y(af.l lVar, zc0 zc0Var, LinearLayout linearLayout, List<? extends KeyDescObj> list, String str) {
        if (PatchProxy.proxy(new Object[]{lVar, zc0Var, linearLayout, list, str}, this, changeQuickRedirect, false, 46246, new Class[]{af.l.class, zc0.class, LinearLayout.class, List.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        int childCount = linearLayout.getChildCount();
        if (list == null || childCount != list.size()) {
            return;
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            KeyDescObj keyDescObj = list.get(i10);
            View childAt = linearLayout.getChildAt(i10);
            f0.n(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) childAt;
            if (f0.g("1", keyDescObj.getEnable())) {
                viewGroup.setOnClickListener(new i(list, keyDescObj, this, lVar, zc0Var, linearLayout, str));
                viewGroup.setBackgroundResource(keyDescObj.isChecked() ? R.drawable.background_white_alpha20_r4_white_stroke : R.drawable.background_white_alpha20_r4);
                int childCount2 = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    viewGroup.getChildAt(i11).setAlpha(1.0f);
                }
            } else {
                viewGroup.setClickable(false);
                viewGroup.setBackgroundResource(R.drawable.divider_bg_4dp);
                int childCount3 = viewGroup.getChildCount();
                for (int i12 = 0; i12 < childCount3; i12++) {
                    viewGroup.getChildAt(i12).setAlpha(0.4f);
                }
            }
        }
    }

    private final void z(af.l lVar, yc0 yc0Var, List<? extends KeyDescObj> list, String str) {
        if (PatchProxy.proxy(new Object[]{lVar, yc0Var, list, str}, this, changeQuickRedirect, false, 46241, new Class[]{af.l.class, yc0.class, List.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        KeyDescObj keyDescObjN = com.max.xiaoheihe.utils.d.N(list);
        boolean z10 = keyDescObjN != null;
        yc0Var.f117912f.setEnabled(z10);
        if (z10) {
            yc0Var.f117912f.setOnClickListener(new j(lVar, yc0Var, keyDescObjN, str));
        } else {
            yc0Var.f117912f.setClickable(false);
        }
    }

    public final void B(@dl.d Context ctx, @dl.d af.l menu, @dl.d yc0 binding, @dl.d String linkID) {
        if (PatchProxy.proxy(new Object[]{ctx, menu, binding, linkID}, this, changeQuickRedirect, false, 46235, new Class[]{Context.class, af.l.class, yc0.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(ctx, "ctx");
        f0.p(menu, "menu");
        f0.p(binding, "binding");
        f0.p(linkID, "linkID");
        binding.f117909c.setVisibility(0);
        this.f93561d.invoke(com.max.xiaoheihe.network.i.a().N4(linkID).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new l(binding, this, ctx, menu, linkID)));
    }

    public final void C(@dl.d Context ctx, @dl.d af.l menu, @dl.d zc0 binding, @dl.d String linkID) {
        if (PatchProxy.proxy(new Object[]{ctx, menu, binding, linkID}, this, changeQuickRedirect, false, 46236, new Class[]{Context.class, af.l.class, zc0.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(ctx, "ctx");
        f0.p(menu, "menu");
        f0.p(binding, "binding");
        f0.p(linkID, "linkID");
        binding.f118309c.setVisibility(0);
        this.f93561d.invoke(com.max.xiaoheihe.network.i.a().N4(linkID).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new m(binding, this, ctx, menu, linkID)));
    }

    public final void F(@dl.d yh.a<b2> aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 46227, new Class[]{yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(aVar, "<set-?>");
        this.f93559b = aVar;
    }

    public final void G(@dl.d yh.l<? super Integer, b2> lVar) {
        if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, 46228, new Class[]{yh.l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(lVar, "<set-?>");
        this.f93560c = lVar;
    }

    public final void H(@dl.d yh.l<? super io.reactivex.disposables.b, b2> lVar) {
        if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, 46229, new Class[]{yh.l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(lVar, "<set-?>");
        this.f93561d = lVar;
    }

    @Override // com.max.video.ui.widget.f
    public void a(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 46233, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        td0 td0VarC = td0.c(LayoutInflater.from(context));
        f0.o(td0VarC, "inflate(LayoutInflater.from(context))");
        this.f93558a = td0VarC;
        if (td0VarC == null) {
            f0.S("binding");
            td0VarC = null;
        }
        td0VarC.f115978c.setOnClickListener(new c());
        LifecycleCoroutineScope lifecycleCoroutineScopeC = ye.a.f141789a.c(context);
        if (lifecycleCoroutineScopeC != null) {
            lifecycleCoroutineScopeC.f(new VideoChargeAction$initExtView$2(this, null));
        }
    }

    @Override // com.max.video.ui.widget.f
    public void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46231, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        td0 td0Var = this.f93558a;
        if (td0Var == null) {
            f0.S("binding");
            td0Var = null;
        }
        td0Var.b().setVisibility(8);
    }

    @Override // com.max.video.ui.widget.f
    @dl.d
    public View c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46230, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        td0 td0Var = this.f93558a;
        if (td0Var == null) {
            f0.S("binding");
            td0Var = null;
        }
        RelativeLayout relativeLayoutB = td0Var.b();
        f0.o(relativeLayoutB, "binding.root");
        return relativeLayoutB;
    }

    @Override // com.max.video.ui.widget.f
    public void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46232, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        td0 td0Var = this.f93558a;
        if (td0Var == null) {
            f0.S("binding");
            td0Var = null;
        }
        td0Var.b().setVisibility(0);
    }

    public final void q(@dl.e LinkInfoObj linkInfoObj) {
        LinkBatteryObj battery;
        if (PatchProxy.proxy(new Object[]{linkInfoObj}, this, changeQuickRedirect, false, 46234, new Class[]{LinkInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f93562e.setValue(Boolean.valueOf((linkInfoObj == null || (battery = linkInfoObj.getBattery()) == null || !battery.getCharged()) ? false : true));
    }

    @dl.d
    public final yh.a<b2> r() {
        return this.f93559b;
    }

    @dl.d
    public final u<Boolean> s() {
        return this.f93563f;
    }

    @dl.d
    public final yh.l<Integer, b2> t() {
        return this.f93560c;
    }

    @dl.d
    public final yh.l<io.reactivex.disposables.b, b2> u() {
        return this.f93561d;
    }
}
