package com.max.xiaoheihe.module.bbs.post.ui.fragments;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.google.gson.JsonObject;
import com.max.basebbs.bean.BBSLinkRecObj;
import com.max.hbcommon.network.ApiException;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.BBSShareDialogManager;
import com.max.xiaoheihe.accelworld.w;
import com.max.xiaoheihe.bean.bbs.BBSFollowedMomentObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkTreeObj;
import com.max.xiaoheihe.bean.bbs.BBSTextObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.ForbidReasonResult;
import com.max.xiaoheihe.bean.bbs.GameCommentsObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.account.ShareImageDialogFragment;
import com.max.xiaoheihe.module.bbs.post.utils.PostUtils;
import com.max.xiaoheihe.module.bbs.utils.BBSKtUtils;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.max.xiaoheihe.utils.ShareViewUtil;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import dl.e;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;
import kotlin.t0;
import kotlin.text.u;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: BasePostFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public abstract class BasePostFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f81717r = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private kf.a f81718b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private String f81720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private Result<BBSLinkTreeObj> f81721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private LinkInfoObj f81722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private String f81723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private String f81724h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f81725i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private String f81726j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private UMImage f81727k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private String f81728l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f81730n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f81731o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.e
    private BBSShareDialogManager f81732p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f81733q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f81719c = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private List<String> f81729m = new ArrayList();

    /* JADX INFO: compiled from: BasePostFragment.kt */
    public final class a implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f81734a;

        public a(boolean z10) {
            this.f81734a = z10;
        }

        public final boolean a() {
            return this.f81734a;
        }

        public final void b(boolean z10) {
            this.f81734a = z10;
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(@dl.e SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(@dl.e SHARE_MEDIA share_media, @dl.e Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 28946, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(BasePostFragment.this.getString(R.string.share_fail));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(@dl.e SHARE_MEDIA share_media) {
            kf.a aVarG4;
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 28945, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(BasePostFragment.this.getString(R.string.share_success));
            if (BasePostFragment.this.g4() != null && !this.f81734a && (aVarG4 = BasePostFragment.this.g4()) != null) {
                aVarG4.l("action_share", true);
            }
            com.max.hbshare.d.F(BasePostFragment.this.getBaseView(), BasePostFragment.this.b4(), this.f81734a ? com.max.hbshare.d.f72598t : "normal", null, null);
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(@dl.e SHARE_MEDIA share_media) {
        }
    }

    /* JADX INFO: compiled from: BasePostFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f81737c;

        b(String str) {
            this.f81737c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28947, new Class[0], Void.TYPE).isSupported && BasePostFragment.this.isActive()) {
                BasePostFragment.this.f81731o = false;
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 28948, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (BasePostFragment.this.isActive()) {
                BasePostFragment.this.f81731o = false;
                super.onError(e10);
                BasePostFragment.this.n5();
                BasePostFragment.this.l5();
            }
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28949, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (BasePostFragment.this.isActive()) {
                super.onNext(result);
                BasePostFragment.this.v4(this.f81737c);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    return;
                }
                com.max.hbutils.utils.c.f(result.getMsg());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28950, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: BasePostFragment.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f81739c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f81740d;

        c(LinkInfoObj linkInfoObj, String str) {
            this.f81739c = linkInfoObj;
            this.f81740d = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 28951, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (BasePostFragment.this.isActive()) {
                super.onError(e10);
                BasePostFragment.this.j5();
            }
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28952, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (BasePostFragment.this.isActive()) {
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(BasePostFragment.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                LinkInfoObj linkInfoObj = this.f81739c;
                if (linkInfoObj == null) {
                    return;
                }
                linkInfoObj.setFollow_status(this.f81740d);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28953, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: BasePostFragment.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f81742c;

        d(String str) {
            this.f81742c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28954, new Class[0], Void.TYPE).isSupported && BasePostFragment.this.isActive()) {
                if (f0.g("1", this.f81742c)) {
                    com.max.hbutils.utils.c.f(BasePostFragment.this.getString(R.string.collect_success));
                } else {
                    com.max.hbutils.utils.c.f(BasePostFragment.this.getString(R.string.cancel_collect_success));
                }
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 28955, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (BasePostFragment.this.isActive()) {
                super.onError(e10);
                BasePostFragment.this.h5();
            }
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28956, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (BasePostFragment.this.isActive()) {
                super.onNext(result);
                BasePostFragment.this.y4(this.f81742c);
                BasePostFragment.O3(BasePostFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28957, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: BasePostFragment.kt */
    public static final class e extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f81744c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f81745d;

        e(LinkInfoObj linkInfoObj, String str) {
            this.f81744c = linkInfoObj;
            this.f81745d = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 28958, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (BasePostFragment.this.isActive()) {
                if (!(e10 instanceof ApiException) || com.max.hbcommon.utils.c.u(e10.getMessage())) {
                    super.onError(e10);
                } else {
                    com.max.xiaoheihe.module.bbs.utils.b.X(e10.getMessage());
                }
                BasePostFragment.this.j5();
            }
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28959, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (BasePostFragment.this.isActive()) {
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(BasePostFragment.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                LinkInfoObj linkInfoObj = this.f81744c;
                if (linkInfoObj == null) {
                    return;
                }
                linkInfoObj.setFollow_status(this.f81745d);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28960, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: BasePostFragment.kt */
    public static final class f extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28961, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (BasePostFragment.this.isActive()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(BasePostFragment.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28962, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: BasePostFragment.kt */
    public static final class g implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f81748b;

        g(String str) {
            this.f81748b = str;
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 28968, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(dialog, "dialog");
            dialog.dismiss();
            BasePostFragment.this.k5(this.f81748b);
            BasePostFragment.this.T3("syncWeb('follow')");
            BasePostFragment basePostFragment = BasePostFragment.this;
            basePostFragment.R3(basePostFragment.d4(), this.f81748b);
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 28967, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(dialog, "dialog");
            dialog.dismiss();
        }
    }

    /* JADX INFO: compiled from: BasePostFragment.kt */
    public static final class h implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f81750b;

        h(String str) {
            this.f81750b = str;
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 28970, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(dialog, "dialog");
            dialog.dismiss();
            BasePostFragment.this.k5(this.f81750b);
            BasePostFragment.this.T3("syncWeb('follow')");
            BasePostFragment basePostFragment = BasePostFragment.this;
            basePostFragment.R3(basePostFragment.d4(), this.f81750b);
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 28969, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(dialog, "dialog");
            dialog.dismiss();
        }
    }

    /* JADX INFO: compiled from: BasePostFragment.kt */
    public static final class i implements w {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // com.max.xiaoheihe.accelworld.w
        @dl.e
        public io.reactivex.disposables.a a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28973, new Class[0], io.reactivex.disposables.a.class);
            return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.a) patchProxyResultProxy.result : BasePostFragment.this.getCompositeDisposable();
        }

        @Override // com.max.xiaoheihe.accelworld.w
        @dl.e
        public BBSLinkRecObj i() {
            return null;
        }

        @Override // com.max.xiaoheihe.accelworld.w
        public boolean isActive() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28974, new Class[0], Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : BasePostFragment.this.isActive();
        }

        @Override // com.max.xiaoheihe.accelworld.w
        public void k(@dl.e String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28977, new Class[]{String.class}, Void.TYPE).isSupported || BasePostFragment.this.d4() == null || BasePostFragment.this.g4() == null) {
                return;
            }
            LinkInfoObj linkInfoObjD4 = BasePostFragment.this.d4();
            f0.m(linkInfoObjD4);
            linkInfoObjD4.setDisable_comment(str);
            kf.a aVarG4 = BasePostFragment.this.g4();
            f0.m(aVarG4);
            aVarG4.k(str);
        }

        @Override // com.max.xiaoheihe.accelworld.w
        public void l(@dl.e String str, boolean z10) {
        }

        @Override // com.max.xiaoheihe.accelworld.w
        public void m() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28971, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            BasePostFragment.this.h5();
        }

        @Override // com.max.xiaoheihe.accelworld.w
        public void n(@dl.e String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28972, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            BasePostFragment.this.i5(str);
        }

        @Override // com.max.xiaoheihe.accelworld.w
        @dl.e
        public FragmentManager o() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28975, new Class[0], FragmentManager.class);
            return patchProxyResultProxy.isSupported ? (FragmentManager) patchProxyResultProxy.result : BasePostFragment.this.getChildFragmentManager();
        }

        @Override // com.max.xiaoheihe.accelworld.w
        public boolean p() {
            return false;
        }

        @Override // com.max.xiaoheihe.accelworld.w
        public void q(@dl.e String str) {
        }

        @Override // com.max.xiaoheihe.accelworld.w
        public void r(@dl.e String str) {
        }

        @Override // com.max.xiaoheihe.accelworld.w
        public void startActivityForResult(@dl.d Intent intent, int i10) {
            if (PatchProxy.proxy(new Object[]{intent, new Integer(i10)}, this, changeQuickRedirect, false, 28976, new Class[]{Intent.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(intent, "intent");
            BasePostFragment.this.startActivityForResult(intent, i10);
        }
    }

    /* JADX INFO: compiled from: BasePostFragment.kt */
    public static final class j implements com.max.xiaoheihe.module.bbs.n.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f81753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f81754c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f81755d;

        /* JADX INFO: compiled from: BasePostFragment.kt */
        public static final class a implements RadioGroup.OnCheckedChangeListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f81756a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<RadioButton> f81757b;

            a(View view, Ref.ObjectRef<RadioButton> objectRef) {
                this.f81756a = view;
                this.f81757b = objectRef;
            }

            /* JADX WARN: Type inference failed for: r9v7, types: [T, android.widget.RadioButton, android.widget.TextView] */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
                if (PatchProxy.proxy(new Object[]{radioGroup, new Integer(i10)}, this, changeQuickRedirect, false, 28985, new Class[]{RadioGroup.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                ?? r10 = (RadioButton) this.f81756a.findViewById(i10);
                RadioButton radioButton = this.f81757b.f124891b;
                if (radioButton != null) {
                    radioButton.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
                }
                if (r10 != 0) {
                    r10.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                }
                this.f81757b.f124891b = r10;
            }
        }

        /* JADX INFO: compiled from: BasePostFragment.kt */
        public static final class b implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ RadioGroup f81758b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ EditText f81759c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ BasePostFragment f81760d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f81761e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f81762f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f81763g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ String f81764h;

            b(RadioGroup radioGroup, EditText editText, BasePostFragment basePostFragment, String str, String str2, String str3, String str4) {
                this.f81758b = radioGroup;
                this.f81759c = editText;
                this.f81760d = basePostFragment;
                this.f81761e = str;
                this.f81762f = str2;
                this.f81763g = str3;
                this.f81764h = str4;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                String str;
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 28986, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                if (this.f81758b.getCheckedRadioButtonId() == R.id.rb_1) {
                    str = "259200";
                } else if (this.f81758b.getCheckedRadioButtonId() == R.id.rb_2) {
                    str = "604800";
                } else {
                    str = this.f81758b.getCheckedRadioButtonId() == R.id.rb_3 ? "1296000" : "86400";
                }
                this.f81760d.X3(this.f81761e, this.f81762f, str, null, this.f81763g, this.f81764h, !com.max.hbcommon.utils.c.u(this.f81759c.getText().toString()) ? this.f81759c.getText().toString() : null);
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: compiled from: BasePostFragment.kt */
        public static final class c implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f81765b = new c();
            public static ChangeQuickRedirect changeQuickRedirect;

            c() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 28987, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        j(String str, String str2, String str3) {
            this.f81753b = str;
            this.f81754c = str2;
            this.f81755d = str3;
        }

        /* JADX WARN: Type inference failed for: r3v6, types: [T, android.view.View] */
        @Override // com.max.xiaoheihe.module.bbs.n.d
        public final void a(View view, int i10, ForbidReasonResult<List<String>> forbidReasonResult, String str) {
            String str2;
            if (PatchProxy.proxy(new Object[]{view, new Integer(i10), forbidReasonResult, str}, this, changeQuickRedirect, false, 28984, new Class[]{View.class, Integer.TYPE, ForbidReasonResult.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            View viewInflate = ((com.max.hbcommon.base.d) BasePostFragment.this).mInflater.inflate(R.layout.layout_forbid_user, (ViewGroup) null);
            viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            View viewFindViewById = viewInflate.findViewById(R.id.rg_forbid_time);
            f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.RadioGroup");
            RadioGroup radioGroup = (RadioGroup) viewFindViewById;
            View viewFindViewById2 = viewInflate.findViewById(R.id.tv_forbid_time_remained);
            f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) viewFindViewById2;
            View viewFindViewById3 = viewInflate.findViewById(R.id.et_forbid_comment);
            f0.n(viewFindViewById3, "null cannot be cast to non-null type android.widget.EditText");
            EditText editText = (EditText) viewFindViewById3;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? FindViewById = viewInflate.findViewById(radioGroup.getCheckedRadioButtonId());
            objectRef.f124891b = FindViewById;
            RadioButton radioButton = (RadioButton) FindViewById;
            if (radioButton != null) {
                radioButton.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            }
            radioGroup.setOnCheckedChangeListener(new a(viewInflate, objectRef));
            if (forbidReasonResult == null || forbidReasonResult.getForbid_info() == null) {
                str2 = "0";
            } else {
                long jR = com.max.hbutils.utils.n.r(forbidReasonResult.getForbid_info().getRemained_seconds());
                v0 v0Var = v0.f124986a;
                str2 = String.format(Locale.US, "%.0f", Arrays.copyOf(new Object[]{Double.valueOf(Math.ceil(jR / 86400.0d))}, 1));
                f0.o(str2, "format(locale, format, *args)");
            }
            v0 v0Var2 = v0.f124986a;
            String string = BasePostFragment.this.getString(R.string.forbid_remained);
            f0.o(string, "getString(R.string.forbid_remained)");
            String str3 = String.format(string, Arrays.copyOf(new Object[]{str2}, 1));
            f0.o(str3, "format(format, *args)");
            textView.setText(str3);
            com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(((com.max.hbcommon.base.d) BasePostFragment.this).mContext);
            fVar.y(BasePostFragment.this.getString(R.string.please_choose_forbid_time)).i(viewInflate).u(BasePostFragment.this.getString(R.string.bbs_mute), new b(radioGroup, editText, BasePostFragment.this, this.f81753b, str, this.f81754c, this.f81755d)).o(BasePostFragment.this.getString(R.string.cancel), c.f81765b);
            fVar.F();
        }
    }

    /* JADX INFO: compiled from: BasePostFragment.kt */
    public static final class k implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(@dl.d SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 28991, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(share_media, "share_media");
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(@dl.d SHARE_MEDIA share_media, @dl.d Throwable throwable) {
            if (PatchProxy.proxy(new Object[]{share_media, throwable}, this, changeQuickRedirect, false, 28990, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(share_media, "share_media");
            f0.p(throwable, "throwable");
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(@dl.d SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 28989, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(share_media, "share_media");
            com.max.hbshare.d.F(BasePostFragment.this.getBaseView(), BasePostFragment.this.b4(), "normal", null, null);
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(@dl.d SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 28988, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(share_media, "share_media");
        }
    }

    /* JADX INFO: compiled from: BasePostFragment.kt */
    public static final class l implements ShareImageDialogFragment.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f81767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSFollowedMomentObj f81768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BasePostFragment f81769c;

        l(String str, BBSFollowedMomentObj bBSFollowedMomentObj, BasePostFragment basePostFragment) {
            this.f81767a = str;
            this.f81768b = bBSFollowedMomentObj;
            this.f81769c = basePostFragment;
        }

        @Override // com.max.xiaoheihe.module.account.ShareImageDialogFragment.e
        public final View a(ViewGroup viewGroup) {
            String string;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 28992, new Class[]{ViewGroup.class}, View.class);
            if (patchProxyResultProxy.isSupported) {
                return (View) patchProxyResultProxy.result;
            }
            if (f0.g(BBSFollowedMomentObj.CONTENT_TYPE_GAME_ACHIEVE, this.f81767a)) {
                GameObj game = this.f81768b.getGame();
                return ShareViewUtil.a(((com.max.hbcommon.base.d) this.f81769c).mContext, viewGroup, game.getImage(), game.getAppicon(), game.getName(), com.max.hbutils.utils.n.q(this.f81768b.getAchieve_count() != null ? this.f81768b.getAchieve_count() : this.f81768b.getAchieve_stats().getAchieved()), this.f81768b.getUnlocktime(), game.getItems(), this.f81768b.getUser().getAvartar(), this.f81768b.getUser().getUsername());
            }
            if (!f0.g(BBSFollowedMomentObj.CONTENT_TYPE_FOLLOW_GAME, this.f81767a) && !f0.g("game_purchase", this.f81767a)) {
                return null;
            }
            GameObj gameObj = this.f81768b.getGames().get(0);
            if (f0.g(BBSFollowedMomentObj.CONTENT_TYPE_FOLLOW_GAME, this.f81767a)) {
                v0 v0Var = v0.f124986a;
                String strN0 = com.max.xiaoheihe.utils.d.n0(R.string.follow_game_format);
                f0.o(strN0, "getString(R.string.follow_game_format)");
                string = String.format(strN0, Arrays.copyOf(new Object[]{this.f81768b.getFollow_count()}, 1));
                f0.o(string, "format(format, *args)");
            } else {
                String strN1 = u.L1("heybox", this.f81768b.getPurchase_channel(), true) ? com.max.xiaoheihe.utils.d.n0(R.string.at_heybox) : com.max.xiaoheihe.utils.d.n0(R.string.at_steam);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strN1);
                v0 v0Var2 = v0.f124986a;
                String strN2 = com.max.xiaoheihe.utils.d.n0(R.string.purchase_game_format);
                f0.o(strN2, "getString(R.string.purchase_game_format)");
                String str = String.format(strN2, Arrays.copyOf(new Object[]{this.f81768b.getPurchase_count()}, 1));
                f0.o(str, "format(format, *args)");
                sb2.append(str);
                string = sb2.toString();
            }
            return ShareViewUtil.c(((com.max.hbcommon.base.d) this.f81769c).mContext, viewGroup, gameObj.getImage(), string, this.f81768b.getUser().getAvartar(), this.f81768b.getUser().getUsername(), this.f81768b.getTimestamp(), this.f81768b.getGames());
        }
    }

    /* JADX INFO: compiled from: BasePostFragment.kt */
    public static final class m implements com.max.xiaoheihe.module.bbs.n.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f81771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f81772c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f81773d;

        /* JADX INFO: compiled from: BasePostFragment.kt */
        public static final class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BasePostFragment f81774b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f81775c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f81776d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f81777e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f81778f;

            a(BasePostFragment basePostFragment, String str, String str2, String str3, String str4) {
                this.f81774b = basePostFragment;
                this.f81775c = str;
                this.f81776d = str2;
                this.f81777e = str3;
                this.f81778f = str4;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 28994, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                this.f81774b.p5(this.f81775c, null, this.f81776d, this.f81777e, this.f81778f);
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: compiled from: BasePostFragment.kt */
        public static final class b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f81779b = new b();
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 28995, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        m(String str, String str2, String str3) {
            this.f81771b = str;
            this.f81772c = str2;
            this.f81773d = str3;
        }

        @Override // com.max.xiaoheihe.module.bbs.n.d
        public final void a(View view, int i10, ForbidReasonResult<List<String>> forbidReasonResult, String str) {
            if (PatchProxy.proxy(new Object[]{view, new Integer(i10), forbidReasonResult, str}, this, changeQuickRedirect, false, 28993, new Class[]{View.class, Integer.TYPE, ForbidReasonResult.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(((com.max.hbcommon.base.d) BasePostFragment.this).mContext);
            fVar.y("是否确认警告该用户").u(BasePostFragment.this.getString(R.string.confirm), new a(BasePostFragment.this, this.f81771b, this.f81772c, this.f81773d, str)).o(BasePostFragment.this.getString(R.string.cancel), b.f81779b);
            fVar.F();
        }
    }

    /* JADX INFO: compiled from: BasePostFragment.kt */
    public static final class n extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28996, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (BasePostFragment.this.isActive()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(BasePostFragment.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28997, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: BasePostFragment.kt */
    public static final class o extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28998, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (BasePostFragment.this.isActive()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(BasePostFragment.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28999, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    public static final /* synthetic */ void O3(BasePostFragment basePostFragment) {
        if (PatchProxy.proxy(new Object[]{basePostFragment}, null, changeQuickRedirect, true, 28944, new Class[]{BasePostFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        basePostFragment.g5();
    }

    public static /* synthetic */ void a4(BasePostFragment basePostFragment, String str, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{basePostFragment, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 28912, new Class[]{BasePostFragment.class, String.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLinkTree");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        basePostFragment.Z3(str);
    }

    private final void g5() {
        LinkInfoObj linkInfoObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28935, new Class[0], Void.TYPE).isSupported || (linkInfoObj = this.f81722f) == null) {
            return;
        }
        com.max.heybox.hblog.g.f74531b.q("[mLinkInfoObj] " + linkInfoObj);
        int iQ = f0.g("1", linkInfoObj.getIs_favour()) ? com.max.hbutils.utils.n.q(linkInfoObj.getFavour_count()) + 1 : Math.max(0, com.max.hbutils.utils.n.q(linkInfoObj.getFavour_count()) - 1);
        linkInfoObj.setFavour_count(String.valueOf(iQ));
        kf.a aVar = this.f81718b;
        if (aVar != null) {
            aVar.R2(iQ);
        }
    }

    public void A4(@dl.e Result<BBSLinkTreeObj> result) {
        BBSShareDialogManager bBSShareDialogManager;
        Result<BBSLinkTreeObj> result2;
        BBSLinkTreeObj result3;
        GameCommentsObj game_comment_share_info;
        BBSLinkTreeObj result4;
        if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28913, new Class[]{Result.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f81721e = result;
        this.f81722f = (result == null || (result4 = result.getResult()) == null) ? null : result4.getLink();
        if (result != null) {
            if (this.f81728l == null && (!com.max.xiaoheihe.module.bbs.utils.b.y(this.f81723g) || t4(this.f81723g))) {
                this.f81728l = s4() ? com.max.xiaoheihe.module.bbs.utils.b.q(this.mContext, this.f81722f, true) : com.max.xiaoheihe.module.bbs.utils.b.q(this.mContext, this.f81722f, false);
            }
            if (this.f81727k == null) {
                this.f81727k = com.max.xiaoheihe.module.bbs.utils.b.s(this.mContext, this.f81722f);
            }
            LinkInfoObj linkInfoObj = this.f81722f;
            if (linkInfoObj != null && (result2 = this.f81721e) != null && (result3 = result2.getResult()) != null && (game_comment_share_info = result3.getGame_comment_share_info()) != null) {
                f0.o(game_comment_share_info, "game_comment_share_info");
                linkInfoObj.setScore(game_comment_share_info.getScore());
                linkInfoObj.setPlay_state(game_comment_share_info.getPlay_state());
            }
            LinkInfoObj linkInfoObj2 = this.f81722f;
            this.f81723g = linkInfoObj2 != null ? linkInfoObj2.getLink_tag() : null;
            kf.a aVar = this.f81718b;
            if (aVar != null) {
                LinkInfoObj linkInfoObj3 = this.f81722f;
                BBSUserInfoObj user = linkInfoObj3 != null ? linkInfoObj3.getUser() : null;
                LinkInfoObj linkInfoObj4 = this.f81722f;
                aVar.r1(user, linkInfoObj4 != null ? linkInfoObj4.getFollow_status() : null);
            }
            BBSShareDialogManager bBSShareDialogManager2 = this.f81732p;
            if (f0.g(bBSShareDialogManager2 != null ? bBSShareDialogManager2.h0() : null, result) || (bBSShareDialogManager = this.f81732p) == null) {
                return;
            }
            bBSShareDialogManager.F0(result);
        }
    }

    public void B4() {
    }

    public void C4() {
    }

    public void D4() {
        LinkInfoObj linkInfoObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28932, new Class[0], Void.TYPE).isSupported || (linkInfoObj = this.f81722f) == null) {
            return;
        }
        f0.m(linkInfoObj);
        if (linkInfoObj.getRelated_status() != null) {
            LinkInfoObj linkInfoObj2 = this.f81722f;
            f0.m(linkInfoObj2);
            if (f0.g("roll_room", linkInfoObj2.getRelated_status().getContent_type())) {
                LinkInfoObj linkInfoObj3 = this.f81722f;
                f0.m(linkInfoObj3);
                BBSFollowedMomentObj related_status = linkInfoObj3.getRelated_status();
                V4(related_status.getRoom_detail().getShare_title(), related_status.getRoom_detail().getShare_desc(), related_status.getRoom_detail().getShare_url(), this.f81727k);
                return;
            }
        }
        LinkInfoObj linkInfoObj4 = this.f81722f;
        f0.m(linkInfoObj4);
        String title = linkInfoObj4.getTitle();
        String str = this.f81728l;
        LinkInfoObj linkInfoObj5 = this.f81722f;
        f0.m(linkInfoObj5);
        V4(title, str, linkInfoObj5.getShare_url(), this.f81727k);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0121  */
    public void E4() {
        String title;
        BBSUserInfoObj user;
        BBSLinkTreeObj result;
        GameObj game_info;
        BBSLinkTreeObj result2;
        BBSLinkTreeObj result3;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28929, new Class[0], Void.TYPE).isSupported || this.f81722f == null) {
            return;
        }
        u4();
        if (f0.g("18", this.f81723g) || f0.g("19", this.f81723g)) {
            LinkInfoObj linkInfoObj = this.f81722f;
            f0.m(linkInfoObj);
            if (linkInfoObj.getRelated_status() != null) {
                LinkInfoObj linkInfoObj2 = this.f81722f;
                f0.m(linkInfoObj2);
                BBSFollowedMomentObj related_status = linkInfoObj2.getRelated_status();
                LinkInfoObj linkInfoObj3 = this.f81722f;
                f0.m(linkInfoObj3);
                related_status.setUser(linkInfoObj3.getUser());
                if (f0.g("roll_room", related_status.getContent_type())) {
                    e5(related_status.getRoom_detail().getShare_title(), related_status.getRoom_detail().getShare_desc(), related_status.getRoom_detail().getShare_url(), this.f81727k);
                    return;
                } else {
                    Y4(related_status, related_status.getContent_type());
                    return;
                }
            }
        }
        if (s4()) {
            Result<BBSLinkTreeObj> result4 = this.f81721e;
            String userid = null;
            if (((result4 == null || (result3 = result4.getResult()) == null) ? null : result3.getGame_info()) != null) {
                Result<BBSLinkTreeObj> result5 = this.f81721e;
                if (((result5 == null || (result2 = result5.getResult()) == null) ? null : result2.getGame_comment_share_info()) != null) {
                    Result<BBSLinkTreeObj> result6 = this.f81721e;
                    String appid = (result6 == null || (result = result6.getResult()) == null || (game_info = result.getGame_info()) == null) ? null : game_info.getAppid();
                    LinkInfoObj linkInfoObj4 = this.f81722f;
                    if (linkInfoObj4 != null && (user = linkInfoObj4.getUser()) != null) {
                        userid = user.getUserid();
                    }
                    Z4(appid, userid);
                    return;
                }
                return;
            }
            return;
        }
        if (f0.g("21", this.f81723g)) {
            LinkInfoObj linkInfoObj5 = this.f81722f;
            f0.m(linkInfoObj5);
            if (linkInfoObj5.getUser() != null) {
                v0 v0Var = v0.f124986a;
                String string = getString(R.string.share_moments_title_format);
                f0.o(string, "getString(R.string.share_moments_title_format)");
                LinkInfoObj linkInfoObj6 = this.f81722f;
                f0.m(linkInfoObj6);
                title = String.format(string, Arrays.copyOf(new Object[]{linkInfoObj6.getUser().getUsername()}, 1));
                f0.o(title, "format(format, *args)");
            } else {
                LinkInfoObj linkInfoObj7 = this.f81722f;
                f0.m(linkInfoObj7);
                title = linkInfoObj7.getTitle();
                f0.o(title, "{\n                      …tle\n                    }");
            }
        } else {
            LinkInfoObj linkInfoObj8 = this.f81722f;
            f0.m(linkInfoObj8);
            title = linkInfoObj8.getTitle();
            f0.o(title, "{\n                      …tle\n                    }");
        }
        String str = this.f81728l;
        LinkInfoObj linkInfoObj9 = this.f81722f;
        f0.m(linkInfoObj9);
        e5(title, str, linkInfoObj9.getShare_url(), this.f81727k);
    }

    public final void F4(@dl.e BBSShareDialogManager bBSShareDialogManager) {
        this.f81732p = bBSShareDialogManager;
    }

    public final void G4(boolean z10) {
        this.f81733q = z10;
    }

    public final void H4(@dl.e String str) {
        this.f81724h = str;
    }

    public final void I4(@dl.e String str) {
        this.f81726j = str;
    }

    public final void J4(@dl.e LinkInfoObj linkInfoObj) {
        this.f81722f = linkInfoObj;
    }

    public final void K4(@dl.e String str) {
        this.f81723g = str;
    }

    public final void L4(@dl.e Result<BBSLinkTreeObj> result) {
        this.f81721e = result;
    }

    public final void M4(@dl.e kf.a aVar) {
        this.f81718b = aVar;
    }

    public final void N4(int i10) {
        this.f81719c = i10;
    }

    public final void O4(@dl.e String str) {
        this.f81720d = str;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    public final void P3(@dl.d ViewGroup ll_comment) {
        boolean z10;
        if (PatchProxy.proxy(new Object[]{ll_comment}, this, changeQuickRedirect, false, 28915, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(ll_comment, "ll_comment");
        LinkInfoObj linkInfoObj = this.f81722f;
        if (linkInfoObj == null) {
            return;
        }
        if ((linkInfoObj != null ? linkInfoObj.getRelated_status() : null) != null) {
            LinkInfoObj linkInfoObj2 = this.f81722f;
            f0.m(linkInfoObj2);
            String content_type = linkInfoObj2.getRelated_status().getContent_type();
            if (f0.g(BBSFollowedMomentObj.CONTENT_TYPE_FOLLOW_GAME, content_type) || f0.g("roll_room", content_type) || f0.g("game_purchase", content_type)) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = true;
        }
        LinkInfoObj linkInfoObj3 = this.f81722f;
        f0.m(linkInfoObj3);
        if (linkInfoObj3.getRelated_status() != null) {
            LinkInfoObj linkInfoObj4 = this.f81722f;
            f0.m(linkInfoObj4);
            if (f0.g("roll_room", linkInfoObj4.getRelated_status().getContent_type())) {
                ll_comment.removeAllViews();
                LinkInfoObj linkInfoObj5 = this.f81722f;
                f0.m(linkInfoObj5);
                if (com.max.hbcommon.utils.c.u(linkInfoObj5.getRelated_status().getRoom_detail().getRoom_desc())) {
                    return;
                }
                ExpressionTextView expressionTextView = new ExpressionTextView(this.mContext);
                expressionTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                expressionTextView.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.text_size_16));
                expressionTextView.setTextColor(getResources().getColor(R.color.text_primary_1_color));
                expressionTextView.setLineSpacing(ViewUtils.f(this.mContext, 4.0f), 1.0f);
                LinkInfoObj linkInfoObj6 = this.f81722f;
                f0.m(linkInfoObj6);
                expressionTextView.setText(linkInfoObj6.getRelated_status().getRoom_detail().getRoom_desc());
                ll_comment.addView(expressionTextView);
                return;
            }
        }
        LinkInfoObj linkInfoObj7 = this.f81722f;
        f0.m(linkInfoObj7);
        if (f0.g("1", linkInfoObj7.getIs_web())) {
            LinkInfoObj linkInfoObj8 = this.f81722f;
            f0.m(linkInfoObj8);
            if (!com.max.hbcommon.utils.c.u(linkInfoObj8.getText())) {
                LinkInfoObj linkInfoObj9 = this.f81722f;
                f0.m(linkInfoObj9);
                String text = linkInfoObj9.getText();
                f0.o(text, "mLinkInfoObj!!.text");
                if (u.v2(text, Constants.ARRAY_TYPE, false, 2, null)) {
                    LinkInfoObj linkInfoObj10 = this.f81722f;
                    f0.m(linkInfoObj10);
                    String text2 = linkInfoObj10.getText();
                    f0.o(text2, "mLinkInfoObj!!.text");
                    if (u.K1(text2, "]", false, 2, null)) {
                        ll_comment.removeAllViews();
                        LinkInfoObj linkInfoObj11 = this.f81722f;
                        f0.m(linkInfoObj11);
                        List<BBSTextObj> listB = com.max.hbutils.utils.k.b(linkInfoObj11.getText(), BBSTextObj.class);
                        PostUtils.Companion companion = PostUtils.f81983a;
                        Activity mContext = this.mContext;
                        f0.o(mContext, "mContext");
                        LayoutInflater mInflater = this.mInflater;
                        f0.o(mInflater, "mInflater");
                        companion.a(mContext, mInflater, listB, ll_comment, this.f81722f, z10);
                        return;
                    }
                }
            }
        }
        ll_comment.removeAllViews();
        LinkInfoObj linkInfoObj12 = this.f81722f;
        f0.m(linkInfoObj12);
        if (com.max.hbcommon.utils.c.u(linkInfoObj12.getText())) {
            return;
        }
        TextView textView = new TextView(this.mContext);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.text_size_16));
        textView.setTextColor(getResources().getColor(R.color.text_primary_1_color));
        textView.setLineSpacing(ViewUtils.f(this.mContext, 6.0f), 1.0f);
        LinkInfoObj linkInfoObj13 = this.f81722f;
        f0.m(linkInfoObj13);
        textView.setText(linkInfoObj13.getText());
        ll_comment.addView(textView);
    }

    public final void P4(boolean z10) {
        this.f81725i = z10;
    }

    public final void Q3(@dl.e String str, @dl.e String str2) {
        z<Result> zVarZ2;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 28922, new Class[]{String.class, String.class}, Void.TYPE).isSupported || this.f81731o) {
            return;
        }
        this.f81731o = true;
        if (s4()) {
            zVarZ2 = com.max.xiaoheihe.network.i.a().Da(str, str2, this.f81724h);
            f0.o(zVarZ2, "{\n                Servic…ype, mHSrc)\n            }");
        } else {
            zVarZ2 = com.max.xiaoheihe.network.i.a().z2(this.f81724h, str, str2, o4());
            f0.o(zVarZ2, "{\n                Servic…ecParams())\n            }");
        }
        addDisposable((io.reactivex.disposables.b) zVarZ2.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(str2)));
    }

    public final void Q4(@dl.e String str) {
        this.f81728l = str;
    }

    public final void R3(@dl.e LinkInfoObj linkInfoObj, @dl.e String str) {
        BBSUserInfoObj user;
        BBSUserInfoObj user2;
        if (PatchProxy.proxy(new Object[]{linkInfoObj, str}, this, changeQuickRedirect, false, 28926, new Class[]{LinkInfoObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        String userid = null;
        com.max.hbcommon.analytics.l.f66572a.p("0", "link", (linkInfoObj == null || (user2 = linkInfoObj.getUser()) == null) ? null : user2.getUserid(), this.f81726j);
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        if (linkInfoObj != null && (user = linkInfoObj.getUser()) != null) {
            userid = user.getUserid();
        }
        addDisposable((io.reactivex.disposables.b) eVarA.f6(userid).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(linkInfoObj, str)));
    }

    public final void R4(@dl.e UMImage uMImage) {
        this.f81727k = uMImage;
    }

    public final void S3(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 28927, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            k5("1");
        } else {
            k5("0");
        }
        T3("syncWeb('follow')");
    }

    public final void S4(boolean z10) {
        this.f81730n = z10;
    }

    public void T3(@dl.e String str) {
    }

    public final void T4(@dl.d List<String> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 28905, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.f81729m = list;
    }

    public abstract void U3(@dl.e String str, @dl.e String str2);

    public void U4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28911, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
    }

    public final void V3(@dl.e String str, @dl.e String str2, @dl.e String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 28924, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().r3(this.f81724h, str, str2, str3, o4()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(str3)));
    }

    public final void V4(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e UMImage uMImage) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, uMImage}, this, changeQuickRedirect, false, 28920, new Class[]{String.class, String.class, String.class, UMImage.class}, Void.TYPE).isSupported || this.f81721e == null) {
            return;
        }
        if (this.f81732p == null) {
            Activity activity = this.mContext;
            Result<BBSLinkTreeObj> result = this.f81721e;
            f0.m(result);
            this.f81732p = new BBSShareDialogManager(activity, result, this.f81723g, uMImage, str2, this.f81724h, this.f81725i, new i());
        }
        BBSShareDialogManager bBSShareDialogManager = this.f81732p;
        if (bBSShareDialogManager != null) {
            bBSShareDialogManager.L0(str, str2, str3, uMImage, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment$showCustomShareWindow$2
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment$showCustomShareWindow$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: BasePostFragment.kt */
                @d(c = "com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment$showCustomShareWindow$2$1", f = "BasePostFragment.kt", i = {}, l = {422}, m = "invokeSuspend", n = {}, s = {})
                public static final class AnonymousClass1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f81785b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ BasePostFragment f81786c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(BasePostFragment basePostFragment, c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.f81786c = basePostFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.d
                    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 28981, new Class[]{Object.class, c.class}, c.class);
                        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new AnonymousClass1(this.f81786c, cVar);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 28983, new Class[]{Object.class, Object.class}, Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                    }

                    @e
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 28982, new Class[]{q0.class, c.class}, Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @e
                    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28980, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        Object objH = kotlin.coroutines.intrinsics.b.h();
                        int i10 = this.f81785b;
                        if (i10 == 0) {
                            t0.n(obj);
                            this.f81785b = 1;
                            if (DelayKt.b(1000L, this) == objH) {
                                return objH;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t0.n(obj);
                        }
                        this.f81786c.G4(true);
                        this.f81786c.onRefresh();
                        return b2.f124493a;
                    }
                }

                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28979, new Class[0], Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28978, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    androidx.localbroadcastmanager.content.a.b(((com.max.hbcommon.base.d) this.f81784b).mContext).d(new Intent(lb.a.Z));
                    k.f(androidx.lifecycle.z.a(this.f81784b), e1.e(), null, new AnonymousClass1(this.f81784b, null), 2, null);
                }
            });
        }
    }

    public final void W3(@dl.e LinkInfoObj linkInfoObj, @dl.e String str) {
        BBSUserInfoObj user;
        BBSUserInfoObj user2;
        if (PatchProxy.proxy(new Object[]{linkInfoObj, str}, this, changeQuickRedirect, false, 28925, new Class[]{LinkInfoObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.analytics.l.f66572a.p("1", "link", (linkInfoObj == null || (user2 = linkInfoObj.getUser()) == null) ? null : user2.getUserid(), this.f81726j);
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().J7((linkInfoObj == null || (user = linkInfoObj.getUser()) == null) ? null : user.getUserid(), null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e(linkInfoObj, str)));
    }

    public void W4(@dl.e String str, @dl.e String str2, @dl.e String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 28938, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.bbs.n.V3(str, new j(str, str2, str3)).show(getChildFragmentManager(), "ForbidReasonFragment");
    }

    public final void X3(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5, @dl.e String str6, @dl.e String str7) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7}, this, changeQuickRedirect, false, 28916, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().n6(str, str2, str3, str4, str5, str6, str7).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    public void X4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28910, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
    }

    @dl.e
    public final BBSShareDialogManager Y3() {
        return this.f81732p;
    }

    public final void Y4(@dl.e BBSFollowedMomentObj bBSFollowedMomentObj, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{bBSFollowedMomentObj, str}, this, changeQuickRedirect, false, 28937, new Class[]{BBSFollowedMomentObj.class, String.class}, Void.TYPE).isSupported || bBSFollowedMomentObj == null) {
            return;
        }
        ShareImageDialogFragment shareImageDialogFragmentX4 = ShareImageDialogFragment.x4();
        shareImageDialogFragmentX4.Q4(com.max.hbimage.image.c.d(this.mContext));
        shareImageDialogFragmentX4.D4(new l(str, bBSFollowedMomentObj, this));
        shareImageDialogFragmentX4.S4(new k());
        kf.a aVar = this.f81718b;
        if (aVar != null) {
            f0.m(aVar);
            aVar.d(shareImageDialogFragmentX4);
        }
    }

    public abstract void Z3(@dl.e String str);

    public final void Z4(@dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 28931, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        ComponentCallbacks2 componentCallbacks2 = this.mContext;
        if (componentCallbacks2 instanceof com.max.hbcommon.base.f) {
            f0.n(componentCallbacks2, "null cannot be cast to non-null type com.max.hbcommon.base.BaseView");
            ShareViewUtil.h((com.max.hbcommon.base.f) componentCallbacks2, str, str2, null);
        }
    }

    public final void a5(@dl.e String str, @dl.e String str2, @dl.e String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 28919, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.bbs.n.V3(null, new m(str, str2, str3)).show(getChildFragmentManager(), "WarningReasonFragment");
    }

    @dl.e
    public final String b4() {
        return this.f81724h;
    }

    public final void b5(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 28906, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        super.onAttach(context);
    }

    @dl.e
    public final String c4() {
        return this.f81726j;
    }

    public final void c5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28940, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        o5("1");
        m5("1");
        T3("syncWeb('award')");
    }

    @dl.e
    public final LinkInfoObj d4() {
        return this.f81722f;
    }

    public void d5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28941, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        T3("syncWeb('favor')");
    }

    @dl.e
    public final String e4() {
        return this.f81723g;
    }

    public final void e5(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e UMImage uMImage) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, uMImage}, this, changeQuickRedirect, false, 28943, new Class[]{String.class, String.class, String.class, UMImage.class}, Void.TYPE).isSupported) {
            return;
        }
        Boolean boolF = com.max.xiaoheihe.utils.j.f(this.f81723g);
        f0.o(boolF, "checkCanForward(mLinkTag)");
        if (boolF.booleanValue()) {
            com.max.xiaoheihe.utils.j.p(getContext(), this.f81723g, this.f81726j, this.f81722f);
        } else {
            V4(str, str2, str3, uMImage);
        }
    }

    @dl.e
    public final Result<BBSLinkTreeObj> f4() {
        return this.f81721e;
    }

    public final void f5(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28918, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().f(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new n()));
    }

    @dl.e
    public final kf.a g4() {
        return this.f81718b;
    }

    public final int h4() {
        return this.f81719c;
    }

    public abstract void h5();

    @dl.e
    public final String i4() {
        return this.f81720d;
    }

    public abstract void i5(@dl.e String str);

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28909, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        super.installViews(view);
        if (getArguments() != null) {
            this.f81720d = requireArguments().getString("page_style");
        }
        kf.a aVar = this.f81718b;
        if (aVar != null) {
            f0.m(aVar);
            this.f81724h = aVar.c3();
            kf.a aVar2 = this.f81718b;
            f0.m(aVar2);
            this.f81726j = aVar2.getLinkId();
            kf.a aVar3 = this.f81718b;
            f0.m(aVar3);
            this.f81723g = aVar3.A();
            kf.a aVar4 = this.f81718b;
            f0.m(aVar4);
            this.f81730n = aVar4.w0();
        }
        X4();
    }

    @Override // com.max.hbcommon.base.d
    public boolean isNotPage() {
        return true;
    }

    public final boolean j4() {
        return this.f81725i;
    }

    public abstract void j5();

    @dl.e
    public final String k4() {
        return this.f81728l;
    }

    public abstract void k5(@dl.e String str);

    @dl.e
    public final UMImage l4() {
        return this.f81727k;
    }

    public abstract void l5();

    public final boolean m4() {
        return this.f81730n;
    }

    public abstract void m5(@dl.e String str);

    @dl.e
    public final String n4() {
        return this.f81720d;
    }

    public abstract void n5();

    @dl.d
    public final Map<String, String> o4() {
        Map<String, String> mapX;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28921, new Class[0], Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        kf.a aVar = this.f81718b;
        if (aVar != null) {
            f0.m(aVar);
            mapX = l0.X(aVar.i());
        } else {
            mapX = null;
        }
        return mapX == null ? new HashMap(16) : mapX;
    }

    public abstract void o5(@dl.e String str);

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    @SuppressLint({"MissingSuperCall"})
    public void onAttach(@dl.d Context context) {
        kf.a aVar;
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 28907, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        b5(context);
        if (getParentFragment() instanceof kf.a) {
            aVar = (kf.a) getParentFragment();
        } else {
            if (!(context instanceof kf.a)) {
                throw new RuntimeException(getParentFragment() + " or " + context + " must implement PostInteractionListener");
            }
            aVar = (kf.a) context;
        }
        this.f81718b = aVar;
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28908, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetach();
        this.f81718b = null;
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28942, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (f0.g("page_style_video_content", this.f81720d)) {
            kf.a aVar = this.f81718b;
            f0.m(aVar);
            aVar.I1();
        } else {
            showLoading();
            this.f81719c = 1;
            a4(this, null, 1, null);
        }
    }

    @dl.d
    public final List<String> p4() {
        return this.f81729m;
    }

    public final void p5(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, this, changeQuickRedirect, false, 28917, new Class[]{String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().B(str, str2, str3, str4, str5).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new o()));
    }

    @dl.e
    public com.max.hbshare.c.b q4(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 28939, new Class[]{Boolean.TYPE}, com.max.hbshare.c.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbshare.c.b) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        LinkInfoObj linkInfoObj = this.f81722f;
        if (linkInfoObj != null) {
            jsonObject.addProperty("link_id", linkInfoObj.getLinkid());
        }
        String str = this.f81724h;
        if (str != null) {
            jsonObject.addProperty("h_src", str);
        }
        if (f0.g(this.f81723g, "23")) {
            return new com.max.hbshare.c.b("wiki", new a(z10), jsonObject);
        }
        LinkInfoObj linkInfoObj2 = this.f81722f;
        f0.m(linkInfoObj2);
        if (f0.g("1", linkInfoObj2.getIs_article())) {
            return new com.max.hbshare.c.b(z10 ? com.max.hbshare.c.f72549e : "news", new a(z10), jsonObject);
        }
        return new com.max.hbshare.c.b(z10 ? com.max.hbshare.c.f72547c : "link", new a(z10), jsonObject);
    }

    public final boolean r4() {
        return this.f81733q;
    }

    public final boolean s4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28930, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return f0.g("3", this.f81723g) || f0.g("14", this.f81723g);
    }

    public final boolean t4(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28914, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return f0.g("26", str) || f0.g("27", str) || f0.g("28", str);
    }

    public final void u4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28928, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().F(this.f81724h, this.f81726j, o4()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new com.max.hbcommon.network.d());
    }

    public void v4(@dl.e String str) {
        int iQ;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28923, new Class[]{String.class}, Void.TYPE).isSupported || this.f81722f == null) {
            return;
        }
        if (f0.g("1", str)) {
            LinkInfoObj linkInfoObj = this.f81722f;
            f0.m(linkInfoObj);
            iQ = com.max.hbutils.utils.n.q(linkInfoObj.getLink_award_num()) + 1;
        } else if (f0.g("2", str)) {
            LinkInfoObj linkInfoObj2 = this.f81722f;
            f0.m(linkInfoObj2);
            iQ = Math.max(0, com.max.hbutils.utils.n.q(linkInfoObj2.getLink_award_num()) - 1);
        } else {
            LinkInfoObj linkInfoObj3 = this.f81722f;
            f0.m(linkInfoObj3);
            if (f0.g("1", linkInfoObj3.getIs_award_link())) {
                LinkInfoObj linkInfoObj4 = this.f81722f;
                f0.m(linkInfoObj4);
                iQ = Math.max(0, com.max.hbutils.utils.n.q(linkInfoObj4.getLink_award_num()) - 1);
            } else {
                LinkInfoObj linkInfoObj5 = this.f81722f;
                f0.m(linkInfoObj5);
                iQ = com.max.hbutils.utils.n.q(linkInfoObj5.getLink_award_num());
            }
        }
        LinkInfoObj linkInfoObj6 = this.f81722f;
        f0.m(linkInfoObj6);
        linkInfoObj6.setIs_award_link(str);
        LinkInfoObj linkInfoObj7 = this.f81722f;
        f0.m(linkInfoObj7);
        linkInfoObj7.setLink_award_num(String.valueOf(iQ));
        n5();
        l5();
    }

    public void w4() {
        LinkInfoObj linkInfoObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28933, new Class[0], Void.TYPE).isSupported || !i0.e(this.mContext) || (linkInfoObj = this.f81722f) == null) {
            return;
        }
        f0.m(linkInfoObj);
        if (f0.g("1", linkInfoObj.getIs_favour())) {
            i5("2");
            LinkInfoObj linkInfoObj2 = this.f81722f;
            f0.m(linkInfoObj2);
            V3(linkInfoObj2.getLinkid(), null, "2");
            T3("syncWeb('favor')");
            return;
        }
        Map<String, String> mapO4 = o4();
        String str = this.f81724h;
        if (str != null) {
            mapO4.put("h_src", str);
        }
        BBSKtUtils.Companion companion = BBSKtUtils.f83254a;
        Activity mContext = this.mContext;
        f0.o(mContext, "mContext");
        LinkInfoObj linkInfoObj3 = this.f81722f;
        f0.m(linkInfoObj3);
        String linkid = linkInfoObj3.getLinkid();
        f0.o(linkid, "mLinkInfoObj!!.linkid");
        companion.h(mContext, linkid, mapO4, this, new yh.l<Boolean, b2>() { // from class: com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment$onFavourIconClicked$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(boolean z10) {
                if (!PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 28963, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported && z10) {
                    this.f81782b.i5("1");
                    this.f81782b.T3("syncWeb('favor')");
                    this.f81782b.y4("1");
                    BasePostFragment.O3(this.f81782b);
                }
            }

            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Boolean bool) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 28964, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(bool.booleanValue());
                return b2.f124493a;
            }
        });
    }

    public final void x4() {
        LinkInfoObj linkInfoObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28934, new Class[0], Void.TYPE).isSupported || !i0.e(this.mContext) || (linkInfoObj = this.f81722f) == null) {
            return;
        }
        if (f0.g("1", linkInfoObj.getIs_favour())) {
            i5("2");
            V3(linkInfoObj.getLinkid(), null, "2");
            T3("syncWeb('favor')");
            return;
        }
        Map<String, String> mapO4 = o4();
        String str = this.f81724h;
        if (str != null) {
            mapO4.put("h_src", str);
        }
        kf.a aVar = this.f81718b;
        if (aVar != null) {
            aVar.h0(linkInfoObj, mapO4, new yh.l<Boolean, b2>() { // from class: com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment$onFavourIconClickedV2$2
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    super(1);
                }

                public final void a(boolean z10) {
                    if (!PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 28965, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported && z10) {
                        this.f81783b.i5("1");
                        this.f81783b.T3("syncWeb('favor')");
                        this.f81783b.y4("1");
                        BasePostFragment.O3(this.f81783b);
                    }
                }

                /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Boolean bool) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 28966, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    a(bool.booleanValue());
                    return b2.f124493a;
                }
            });
        }
    }

    public abstract void y4(@dl.e String str);

    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
    public void z4() {
        LinkInfoObj linkInfoObj;
        String str;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28936, new Class[0], Void.TYPE).isSupported || !i0.e(this.mContext) || (linkInfoObj = this.f81722f) == null) {
            return;
        }
        f0.m(linkInfoObj);
        if (f0.g("0", linkInfoObj.getFollow_status())) {
            str = "1";
        } else {
            LinkInfoObj linkInfoObj2 = this.f81722f;
            f0.m(linkInfoObj2);
            if (f0.g("1", linkInfoObj2.getFollow_status())) {
                str = "0";
            } else {
                LinkInfoObj linkInfoObj3 = this.f81722f;
                f0.m(linkInfoObj3);
                if (f0.g("2", linkInfoObj3.getFollow_status())) {
                    str = "3";
                } else {
                    LinkInfoObj linkInfoObj4 = this.f81722f;
                    f0.m(linkInfoObj4);
                    if (f0.g("3", linkInfoObj4.getFollow_status())) {
                        str = "2";
                    } else {
                        str = "1";
                    }
                }
            }
        }
        LinkInfoObj linkInfoObj5 = this.f81722f;
        f0.m(linkInfoObj5);
        if (f0.g("0", linkInfoObj5.getFollow_status())) {
            k5(str);
            T3("syncWeb('follow')");
            W3(this.f81722f, str);
            return;
        }
        LinkInfoObj linkInfoObj6 = this.f81722f;
        f0.m(linkInfoObj6);
        if (f0.g("1", linkInfoObj6.getFollow_status())) {
            com.max.xiaoheihe.view.l.D(this.mContext, getString(R.string.cancel_follow_user_confirm), "", getString(R.string.confirm), getString(R.string.cancel), new g(str));
            return;
        }
        LinkInfoObj linkInfoObj7 = this.f81722f;
        f0.m(linkInfoObj7);
        if (f0.g("2", linkInfoObj7.getFollow_status())) {
            k5(str);
            T3("syncWeb('follow')");
            W3(this.f81722f, str);
        } else {
            LinkInfoObj linkInfoObj8 = this.f81722f;
            f0.m(linkInfoObj8);
            if (f0.g("3", linkInfoObj8.getFollow_status())) {
                com.max.xiaoheihe.view.l.D(this.mContext, getString(R.string.cancel_follow_user_confirm), "", getString(R.string.confirm), getString(R.string.cancel), new h(str));
            }
        }
    }
}
