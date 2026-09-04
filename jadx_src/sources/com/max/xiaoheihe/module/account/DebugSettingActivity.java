package com.max.xiaoheihe.module.account;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.utils.MemoryManager;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbcustomview.SwitchButton.SwitchButton;
import com.max.hbcustomview.floatingview.FloatingMagnetView;
import com.max.hbexpression.widget.SimpleMarkerViewSpan;
import com.max.hbmmkv.MMKVManager;
import com.max.hbpermission.PermissionManager;
import com.max.hbutils.bean.Result;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.xiaoheihe.ComposeTestActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.DebugOption;
import com.max.xiaoheihe.bean.account.CheckVersionObj;
import com.max.xiaoheihe.flutter.BaseFlutterActivity;
import com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager;
import com.max.xiaoheihe.module.story.StoryActivity;
import com.max.xiaoheihe.module.video.sample.TXVideoTestActivity;
import com.max.xiaoheihe.module.webview.JsCoreManager;
import com.max.xiaoheihe.okflutter.FlutterHelper;
import com.max.xiaoheihe.router.protocol.HeyboxWebProtocolHandler;
import com.max.xiaoheihe.view.richtext.RichTextTestActivity;
import com.max.xiaoheihe.view.uikit.UiKitTestActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.UCrop;
import com.tencent.mmkv.MMKV;
import com.umeng.message.common.inter.ITagManager;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.e1;

/* JADX INFO: compiled from: DebugSettingActivity.kt */
/* JADX INFO: loaded from: classes9.dex */
@kotlin.jvm.internal.t0({"SMAP\nDebugSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugSettingActivity.kt\ncom/max/xiaoheihe/module/account/DebugSettingActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1165:1\n1#2:1166\n*E\n"})
@ig.d(path = {lb.d.f131181i4})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class DebugSettingActivity extends BaseActivity {

    @dl.d
    public static final a Q = new a(null);
    public static final int R = 8;
    public static final int S = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private df.s L;
    private com.max.hbcommon.base.adapter.u<DebugOption> M;

    @dl.d
    private final ArrayList<DebugOption> N = new ArrayList<>();

    @dl.d
    private final kotlinx.coroutines.q0 O = kotlinx.coroutines.r0.a(e1.c());
    private int P;

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class a0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22694, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) DebugSettingActivity.this).f66601b.startActivity(new Intent(((BaseActivity) DebugSettingActivity.this).f66601b, (Class<?>) UiKitTestActivity.class));
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class a1 implements CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a1 f77601b = new a1();
        public static ChangeQuickRedirect changeQuickRedirect;

        a1() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f77602b = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22650, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ad.a.e(ad.a.A, true ^ ad.a.a(ad.a.A, false));
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class b0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22695, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) DebugSettingActivity.this).f66601b.startActivity(new Intent(((BaseActivity) DebugSettingActivity.this).f66601b, (Class<?>) RichTextTestActivity.class));
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class b1 implements com.max.hbcommon.network.o.c<Result<CheckVersionObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b1() {
        }

        @Override // com.max.hbcommon.network.o.c
        public void a(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 22732, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            com.max.hbcommon.utils.d.b("RxPollingUtil", "onRequestError! " + e10.getMessage());
        }

        @Override // com.max.hbcommon.network.o.c
        public long b(int i10) {
            return ((long) (i10 + 1)) * 2000;
        }

        @Override // com.max.hbcommon.network.o.c
        public /* bridge */ /* synthetic */ boolean c(Result<CheckVersionObj> result) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22734, new Class[]{Object.class}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f(result);
        }

        @Override // com.max.hbcommon.network.o.c
        public /* bridge */ /* synthetic */ void d(Result<CheckVersionObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22735, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            h(result);
        }

        @Override // com.max.hbcommon.network.o.c
        public int e() {
            return 5;
        }

        public boolean f(@dl.d Result<CheckVersionObj> data) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 22730, new Class[]{Result.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            kotlin.jvm.internal.f0.p(data, "data");
            CheckVersionObj result = data.getResult();
            if (kotlin.jvm.internal.f0.g(ITagManager.SUCCESS, result != null ? result.getNeed_update() : null)) {
                return true;
            }
            CheckVersionObj result2 = data.getResult();
            return kotlin.jvm.internal.f0.g(z5.f.f141859j, result2 != null ? result2.getNeed_update() : null);
        }

        public void g(@dl.d Result<CheckVersionObj> data) {
            if (PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 22733, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(data, "data");
            CheckVersionObj result = data.getResult();
            String need_update = result != null ? result.getNeed_update() : null;
            if (kotlin.jvm.internal.f0.g(need_update, ITagManager.SUCCESS)) {
                com.max.hbcommon.utils.d.b("RxPollingUtil", "onSuccess! ");
            } else if (kotlin.jvm.internal.f0.g(need_update, "updating")) {
                com.max.hbcommon.utils.d.b("RxPollingUtil", "onPolling! ");
            } else {
                com.max.hbcommon.utils.d.b("RxPollingUtil", "onFailed! ");
            }
        }

        public void h(@dl.d Result<CheckVersionObj> data) {
            if (PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 22731, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(data, "data");
            com.max.hbcommon.utils.d.b("RxPollingUtil", "onTimeout! ");
        }

        @Override // com.max.hbcommon.network.o.c
        public /* bridge */ /* synthetic */ void onResult(Result<CheckVersionObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22736, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            g(result);
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f77604b = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22651, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ad.a.e(ad.a.f1215v, true);
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class c0 implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c0() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 22696, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (!z10) {
                ej.c.a();
                com.max.hbcache.c.C("show_ue_tool", "0");
            } else if (DebugSettingActivity.M1(DebugSettingActivity.this)) {
                ej.c.g();
                com.max.hbcache.c.C("show_ue_tool", "1");
            }
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f77606b = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22652, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcache.c.C(com.max.hbcache.c.U, "0");
            com.max.hbcache.c.C(com.max.hbcache.c.V, "0");
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class d0 implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d0() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 22697, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (!z10) {
                com.max.hbcache.c.C("memory_observer", "0");
            } else if (DebugSettingActivity.M1(DebugSettingActivity.this)) {
                x3.b.f141067a.c(DebugSettingActivity.this);
                com.max.hbcache.c.C("memory_observer", "1");
            }
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class e implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f77608b = new e();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22653, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ad.a.e(ad.a.f1214u, true);
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class e0 implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e0 f77609b = new e0();
        public static ChangeQuickRedirect changeQuickRedirect;

        e0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22698, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MMKV.mmkvWithID(ad.b.f1220a).clear();
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class f implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f77610b = new f();
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22654, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ad.a.e(ad.a.f1212s, true);
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class f0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: DebugSettingActivity.kt */
        public static final class a implements com.max.xiaoheihe.module.upload.g.e {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ DebugSettingActivity f77612a;

            a(DebugSettingActivity debugSettingActivity) {
                this.f77612a = debugSettingActivity;
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
            public void c(@dl.d String[] urls, @dl.d String extra) {
                if (PatchProxy.proxy(new Object[]{urls, extra}, this, changeQuickRedirect, false, 22700, new Class[]{String[].class, String.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(urls, "urls");
                kotlin.jvm.internal.f0.p(extra, "extra");
                if (!(urls.length == 0)) {
                    this.f77612a.V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().q6(urls[0]).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d()));
                }
                com.max.hbutils.utils.c.f("上传成功");
            }

            @Override // com.max.xiaoheihe.module.upload.g.e
            public /* synthetic */ boolean d() {
                return com.max.xiaoheihe.module.upload.h.c(this);
            }

            @Override // com.max.xiaoheihe.module.upload.g.e
            public void e(@dl.d String error) {
                if (PatchProxy.proxy(new Object[]{error}, this, changeQuickRedirect, false, 22701, new Class[]{String.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(error, "error");
                com.max.hbutils.utils.c.f("上传失败");
            }
        }

        f0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) throws IOException {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22699, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
            Activity mContext = ((BaseActivity) DebugSettingActivity.this).f66601b;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            String strH = aVar.h(mContext);
            if (strH != null) {
                com.max.xiaoheihe.module.upload.g.h(((BaseActivity) DebugSettingActivity.this).f66601b, DebugSettingActivity.this.V0(), kotlin.collections.s.k(strH), "develop", new a(DebugSettingActivity.this));
            }
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class g implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f77613b = new g();
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22655, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ad.a.e(ad.a.f1211r, true ^ ad.a.a(ad.a.f1211r, false));
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class g0 implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g0 f77614b = new g0();
        public static ChangeQuickRedirect changeQuickRedirect;

        g0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22673, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            SimpleMarkerViewSpan.a aVar = SimpleMarkerViewSpan.f70250d;
            if (aVar.a()) {
                aVar.b(false);
                com.max.hbutils.utils.x.p("已关闭调试");
            } else {
                aVar.b(true);
                com.max.hbutils.utils.x.p("已启用调试");
            }
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class h implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f77620b = new h();
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22656, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MMKVManager.f71329a.n(ad.c.f1233m, ad.c.f1234n, 0L, false);
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class h0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22703, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.upload.c cVarB = com.max.xiaoheihe.module.upload.c.f93473c.b();
            Activity mContext = ((BaseActivity) DebugSettingActivity.this).f66601b;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            io.reactivex.disposables.a compositeDisposable = DebugSettingActivity.this.V0();
            kotlin.jvm.internal.f0.o(compositeDisposable, "compositeDisposable");
            cVarB.t(mContext, compositeDisposable);
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22657, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            DebugSettingActivity.this.startActivity(new Intent(DebugSettingActivity.this, (Class<?>) DebugMMKVTestActivity.class));
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class i0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String string;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22704, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            df.s sVar = DebugSettingActivity.this.L;
            df.s sVar2 = null;
            if (sVar == null) {
                kotlin.jvm.internal.f0.S("mBinding");
                sVar = null;
            }
            if (TextUtils.isEmpty(sVar.f115351c.getText())) {
                string = "/flutter/default";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("/flutter/");
                df.s sVar3 = DebugSettingActivity.this.L;
                if (sVar3 == null) {
                    kotlin.jvm.internal.f0.S("mBinding");
                } else {
                    sVar2 = sVar3;
                }
                sb2.append((Object) sVar2.f115351c.getText());
                string = sb2.toString();
            }
            FlutterHelper.startFlutterFragmentActivity$default(FlutterHelper.INSTANCE.getInstance(), DebugSettingActivity.this, string, BaseFlutterActivity.class, null, 8, null);
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: DebugSettingActivity.kt */
        public static final class a implements com.sankuai.waimai.router.core.d {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.sankuai.waimai.router.core.d
            public void onError(@dl.d com.sankuai.waimai.router.core.i request, int i10) {
                if (PatchProxy.proxy(new Object[]{request, new Integer(i10)}, this, changeQuickRedirect, false, 22660, new Class[]{com.sankuai.waimai.router.core.i.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(request, "request");
                String str = (String) request.d(String.class, com.max.xiaoheihe.router.c.f94908n);
                if (str == null) {
                    return;
                }
                com.max.hbutils.utils.c.f(str);
            }

            @Override // com.sankuai.waimai.router.core.d
            public void onSuccess(@dl.d com.sankuai.waimai.router.core.i request) {
                if (PatchProxy.proxy(new Object[]{request}, this, changeQuickRedirect, false, 22659, new Class[]{com.sankuai.waimai.router.core.i.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(request, "request");
                String str = (String) request.d(String.class, com.max.xiaoheihe.router.c.f94908n);
                if (str == null) {
                    return;
                }
                com.max.hbutils.utils.c.f(str);
            }
        }

        j() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22658, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity activity = ((BaseActivity) DebugSettingActivity.this).f66601b;
            df.s sVar = DebugSettingActivity.this.L;
            if (sVar == null) {
                kotlin.jvm.internal.f0.S("mBinding");
                sVar = null;
            }
            hg.b.t(activity, sVar.f115351c.getText().toString(), new a());
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class j0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: DebugSettingActivity.kt */
        public static final class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ DebugSettingActivity f77626b;

            a(DebugSettingActivity debugSettingActivity) {
                this.f77626b = debugSettingActivity;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 22706, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                ((BaseActivity) this.f77626b).f66601b.startActivity(new Intent("android.settings.USAGE_ACCESS_SETTINGS"));
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: compiled from: DebugSettingActivity.kt */
        public static final class b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f77627b = new b();
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 22707, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        j0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22705, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(((BaseActivity) DebugSettingActivity.this).f66601b);
            fVar.y("游戏时长统计");
            fVar.l("时长统计需要在系统【有权查看使用情况的应用】设置中开启权限");
            fVar.a(new ib.b(20.0f));
            fVar.a(new ib.e("title"));
            fVar.a(new ib.b(20.0f));
            fVar.a(new ib.a(R.drawable.userguide_steam_155x128, 0, 0, null, 14, null));
            fVar.a(new ib.b(6.0f));
            fVar.a(new ib.d(12.0f, com.max.hbcommon.utils.l.a(R.color.red_208), "描述123123123123123"));
            fVar.a(new ib.b(40.0f));
            QMUIRadiusImageView qMUIRadiusImageView = new QMUIRadiusImageView(((BaseActivity) DebugSettingActivity.this).f66601b);
            qMUIRadiusImageView.setImageResource(R.drawable.expression_heziji_1);
            qMUIRadiusImageView.setCircle(true);
            fVar.b(qMUIRadiusImageView);
            fVar.u("去设置", new a(DebugSettingActivity.this));
            fVar.o(com.max.xiaoheihe.utils.d.n0(R.string.cancel), b.f77627b);
            fVar.F();
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22661, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            df.s sVar = DebugSettingActivity.this.L;
            if (sVar == null) {
                kotlin.jvm.internal.f0.S("mBinding");
                sVar = null;
            }
            String string = sVar.f115351c.getText().toString();
            if (com.max.hbcommon.utils.c.u(string)) {
                return;
            }
            try {
                if (StringsKt__StringsKt.W2(string, "%7B", false, 2, null) && StringsKt__StringsKt.W2(string, "%22", false, 2, null)) {
                    Activity mContext = ((BaseActivity) DebugSettingActivity.this).f66601b;
                    kotlin.jvm.internal.f0.o(mContext, "mContext");
                    com.max.xiaoheihe.base.router.b.k0(mContext, string);
                    return;
                }
                if (kotlin.text.u.v2(string, "heybox://", false, 2, null)) {
                    string = kotlin.text.u.p2(string, "heybox://", "", false, 4, null);
                }
                String strEncode = URLEncoder.encode(string, "utf-8");
                Activity mContext2 = ((BaseActivity) DebugSettingActivity.this).f66601b;
                kotlin.jvm.internal.f0.o(mContext2, "mContext");
                com.max.xiaoheihe.base.router.b.k0(mContext2, "heybox://" + strEncode);
            } catch (Throwable th2) {
                com.max.hbutils.utils.c.f(th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class k0 implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final k0 f77629b = new k0();
        public static ChangeQuickRedirect changeQuickRedirect;

        k0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22708, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcache.c.C("draft_info", null);
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22649, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.component.c.f(((BaseActivity) DebugSettingActivity.this).f66601b);
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class l0 implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l0 f77631b = new l0();
        public static ChangeQuickRedirect changeQuickRedirect;

        l0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22709, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcache.c.z(com.max.hbcache.c.M, null);
            com.max.hbsearch.o.f72358b = null;
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22663, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) DebugSettingActivity.this).f66601b.startActivity(new Intent(((BaseActivity) DebugSettingActivity.this).f66601b, (Class<?>) StoryActivity.class));
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class m0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22710, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.h(((BaseActivity) DebugSettingActivity.this).f66601b);
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class n implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final n f77634b = new n();
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22664, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcache.c.C(com.max.xiaoheihe.utils.i0.j() + "sign_in_time", "");
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class n0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: DebugSettingActivity.kt */
        public static final class a extends com.max.hbcommon.network.d<Result<?>> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ DebugSettingActivity f77636b;

            a(DebugSettingActivity debugSettingActivity) {
                this.f77636b = debugSettingActivity;
            }

            public void onNext(@dl.d Result<?> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22712, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(result, "result");
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(this.f77636b.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22713, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<?>) obj);
            }
        }

        n0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22711, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            DebugSettingActivity.this.V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().M4().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a(DebugSettingActivity.this)));
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22665, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            df.s sVar = DebugSettingActivity.this.L;
            if (sVar == null) {
                kotlin.jvm.internal.f0.S("mBinding");
                sVar = null;
            }
            String string = sVar.f115351c.getText().toString();
            if (com.max.hbcommon.utils.c.u(string)) {
                return;
            }
            if (DynamicSoManager.f77247b.d(com.max.xiaoheihe.loader.dynamic_so.a.f77295a)) {
                JsCoreManager.f94217e.a().j(string, null);
            } else {
                com.max.hbutils.utils.c.d("J2v8为加载，正在下载中");
                com.max.xiaoheihe.dynamic_so.a.a(com.max.xiaoheihe.loader.dynamic_so.a.f77295a);
            }
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class o0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22714, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcache.c.C(com.max.xiaoheihe.utils.i0.j() + "sign_in_time", "");
            DebugSettingActivity.this.V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().q3().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d()));
            com.max.hbutils.utils.c.f(DebugSettingActivity.this.getString(R.string.success));
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class p implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final p f77639b = new p();
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22666, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcache.c.L(false);
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class p0 implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: DebugSettingActivity.kt */
        public static final class a implements com.max.hbcustomview.floatingview.c {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ DebugSettingActivity f77641a;

            a(DebugSettingActivity debugSettingActivity) {
                this.f77641a = debugSettingActivity;
            }

            @Override // com.max.hbcustomview.floatingview.c
            public void a(@dl.d FloatingMagnetView magnetView) {
                if (PatchProxy.proxy(new Object[]{magnetView}, this, changeQuickRedirect, false, 22716, new Class[]{FloatingMagnetView.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(magnetView, "magnetView");
                com.max.hbcommon.utils.d.f68238c = false;
            }

            @Override // com.max.hbcustomview.floatingview.c
            public void b(@dl.d FloatingMagnetView magnetView) {
                if (PatchProxy.proxy(new Object[]{magnetView}, this, changeQuickRedirect, false, 22717, new Class[]{FloatingMagnetView.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(magnetView, "magnetView");
                com.max.hbcommon.utils.d.f68238c = !com.max.hbcommon.utils.d.f68238c;
                DebugSettingActivity.W1(this.f77641a);
            }
        }

        p0() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 22715, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (!z10) {
                com.max.hbcustomview.floatingview.a.n().remove();
                return;
            }
            com.max.hbcustomview.floatingview.a.n().c(HeyBoxApplication.C());
            DebugSettingActivity.W1(DebugSettingActivity.this);
            com.max.hbcustomview.floatingview.a.n().h(new a(DebugSettingActivity.this));
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class q implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q f77642b = new q();
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22667, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcache.c.z(com.max.hbcache.c.S, "0");
            com.max.hbcache.c.z(com.max.hbcache.c.T, "0");
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class q0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: DebugSettingActivity.kt */
        public static final class a implements com.max.hbpermission.c {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ DebugSettingActivity f77644a;

            a(DebugSettingActivity debugSettingActivity) {
                this.f77644a = debugSettingActivity;
            }

            @Override // com.max.hbpermission.c
            public void onResult() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22719, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                try {
                    this.f77644a.startService(new Intent(HeyBoxApplication.C(), Class.forName("com.max.hbuitesthelper.uihelper.UIHelperService")));
                } catch (Throwable unused) {
                }
            }
        }

        q0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22718, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PermissionManager permissionManager = PermissionManager.f71603a;
            DebugSettingActivity debugSettingActivity = DebugSettingActivity.this;
            permissionManager.N(debugSettingActivity, new a(debugSettingActivity));
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class r implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final r f77645b = new r();
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22668, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcache.c.z(com.max.hbcache.c.H0, "0");
            com.max.hbcache.c.z(com.max.hbcache.c.I0, "0");
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class r0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        r0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22702, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            new DebugLottieDialogFragment().M3(DebugSettingActivity.this.getSupportFragmentManager(), "");
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class s implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final s f77647b = new s();
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22669, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcache.c.L(false);
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class s0 implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final s0 f77648b = new s0();
        public static ChangeQuickRedirect changeQuickRedirect;

        s0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22721, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            pb.f fVarI = ob.a.i();
            if (fVarI != null) {
                fVarI.n(od.f.f132278b, od.f.f132280d, false, false);
            }
            pb.f fVarI2 = ob.a.i();
            if (fVarI2 != null) {
                fVarI2.n(na.a.f132027b, na.a.f132028c, false, false);
            }
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class t implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        t() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22670, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcache.c.N(((BaseActivity) DebugSettingActivity.this).f66601b, "maxid", "1789668");
            com.max.hbcache.c.N(((BaseActivity) DebugSettingActivity.this).f66601b, "key", "MTY3NjYwNDg3Ni42MTE4ODEwNjIzMDE3XzFhZHh4d25xb2ZkbWtia2tn");
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class t0 implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final t0 f77650b = new t0();
        public static ChangeQuickRedirect changeQuickRedirect;

        t0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22720, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ad.a.e(ad.a.E, true ^ ad.a.a(ad.a.E, false));
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class u implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        u() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22671, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            df.s sVar = DebugSettingActivity.this.L;
            if (sVar == null) {
                kotlin.jvm.internal.f0.S("mBinding");
                sVar = null;
            }
            if (com.max.hbcommon.utils.c.u(sVar.f115351c.getText().toString())) {
                return;
            }
            df.s sVar2 = DebugSettingActivity.this.L;
            if (sVar2 == null) {
                kotlin.jvm.internal.f0.S("mBinding");
                sVar2 = null;
            }
            List listU4 = StringsKt__StringsKt.U4(sVar2.f115351c.getText().toString(), new String[]{Constants.ACCEPT_TIME_SEPARATOR_SP}, false, 0, 6, null);
            String str = (String) listU4.get(0);
            String str2 = listU4.size() == 2 ? (String) listU4.get(1) : null;
            Log.d("completeJs", "js: " + str + "   param: " + str2 + "   result: " + HeyboxWebProtocolHandler.f95003a.a(str, str2));
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class u0 implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final u0 f77652b = new u0();
        public static ChangeQuickRedirect changeQuickRedirect;

        u0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22722, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ad.a.e(ad.a.C, true ^ ad.a.a(ad.a.C, false));
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class v implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        v() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22672, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) DebugSettingActivity.this).f66601b.startActivity(new Intent(((BaseActivity) DebugSettingActivity.this).f66601b, (Class<?>) ComposeTestActivity.class));
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class v0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        v0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22723, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("是否安装该应用：");
            Activity activity = ((BaseActivity) DebugSettingActivity.this).f66601b;
            df.s sVar = DebugSettingActivity.this.L;
            if (sVar == null) {
                kotlin.jvm.internal.f0.S("mBinding");
                sVar = null;
            }
            sb2.append(com.max.xiaoheihe.utils.d.H0(activity, sVar.f115351c.getText().toString()));
            com.max.hbutils.utils.c.f(sb2.toString());
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class w implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final w f77655b = new w();
        public static ChangeQuickRedirect changeQuickRedirect;

        w() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22662, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (ad.a.b(ad.a.G, false, 2, null)) {
                ad.a.e(ad.a.G, false);
                com.max.hbutils.utils.x.p("已启用");
            } else {
                ad.a.e(ad.a.G, true);
                com.max.hbutils.utils.x.p("已关闭");
            }
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class w0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        w0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22724, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("是否为北京当天时间：");
            df.s sVar = DebugSettingActivity.this.L;
            if (sVar == null) {
                kotlin.jvm.internal.f0.S("mBinding");
                sVar = null;
            }
            sb2.append(com.max.hbutils.utils.w.O(com.max.hbutils.utils.n.r(sVar.f115351c.getText().toString())));
            com.max.hbutils.utils.c.f(sb2.toString());
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class x implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        x() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22674, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) DebugSettingActivity.this).f66601b.startActivity(new Intent(((BaseActivity) DebugSettingActivity.this).f66601b, (Class<?>) TXVideoTestActivity.class));
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class x0 implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final x0 f77658b = new x0();
        public static ChangeQuickRedirect changeQuickRedirect;

        x0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22725, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ad.a.e(ad.a.D, true ^ ad.a.a(ad.a.D, false));
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class y implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final y f77659b = new y();
        public static ChangeQuickRedirect changeQuickRedirect;

        y() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22675, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = view.getContext();
            kotlin.jvm.internal.f0.o(context, "context");
            com.max.xiaoheihe.module.bbs.post_edit.c.a(context, "我是一条很长的评论我是一条很长的评论我是一条很长的评论我是一条很长的评论我是一条很长的评论我是一条很长的评论我是一条很长的评论我是一条很长的评论我是一条很长的评论");
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class y0 extends com.max.hbcommon.base.adapter.u<DebugOption> {
        public static ChangeQuickRedirect changeQuickRedirect;

        y0(Activity activity, ArrayList<DebugOption> arrayList) {
            super(activity, arrayList);
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, DebugOption debugOption) {
            Object[] objArr = {new Integer(i10), debugOption};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 22729, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, debugOption);
        }

        public int n(int i10, @dl.d DebugOption data) {
            Object[] objArr = {new Integer(i10), data};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 22727, new Class[]{cls, DebugOption.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            kotlin.jvm.internal.f0.p(data, "data");
            int type = data.getType();
            return (type == 0 || type == 1) ? R.layout.item_debug_option : R.layout.empty_layout;
        }

        public void o(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d DebugOption data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 22726, new Class[]{com.max.hbcommon.base.adapter.s.e.class, DebugOption.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.f0.p(data, "data");
            if (R.layout.item_debug_option == viewHolder.d()) {
                DebugSettingActivity.T1(DebugSettingActivity.this, viewHolder, data);
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 22728, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (DebugOption) obj);
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class z implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final z f77661b = new z();
        public static ChangeQuickRedirect changeQuickRedirect;

        z() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22693, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            V8 v8CreateV8Runtime = V8.createV8Runtime();
            MemoryManager memoryManager = new MemoryManager(v8CreateV8Runtime);
            Log.e("Test", "JS result = " + v8CreateV8Runtime.executeIntegerScript("var hello = 'hello, ';\nvar world = 'world!';\nhello.concat(world).length;\n"));
            memoryManager.release();
        }
    }

    /* JADX INFO: compiled from: DebugSettingActivity.kt */
    public static final class z0 implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final z0 f77662b = new z0();
        public static ChangeQuickRedirect changeQuickRedirect;

        z0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    public static final /* synthetic */ boolean M1(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 22646, new Class[]{Context.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : Z1(context);
    }

    public static final /* synthetic */ void T1(DebugSettingActivity debugSettingActivity, com.max.hbcommon.base.adapter.s.e eVar, DebugOption debugOption) {
        if (PatchProxy.proxy(new Object[]{debugSettingActivity, eVar, debugOption}, null, changeQuickRedirect, true, 22648, new Class[]{DebugSettingActivity.class, com.max.hbcommon.base.adapter.s.e.class, DebugOption.class}, Void.TYPE).isSupported) {
            return;
        }
        debugSettingActivity.e2(eVar, debugOption);
    }

    public static final /* synthetic */ void W1(DebugSettingActivity debugSettingActivity) {
        if (PatchProxy.proxy(new Object[]{debugSettingActivity}, null, changeQuickRedirect, true, 22647, new Class[]{DebugSettingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        debugSettingActivity.h2();
    }

    private final void X1(DebugOption debugOption) {
        if (PatchProxy.proxy(new Object[]{debugOption}, this, changeQuickRedirect, false, 22638, new Class[]{DebugOption.class}, Void.TYPE).isSupported) {
            return;
        }
        this.N.add(debugOption);
    }

    private final void Y1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22635, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        X1(new DebugOption(0, new l(), null, false, "组件列表 "));
        X1(new DebugOption(0, w.f77655b, null, false, "实验：是否应用时间格式化新规则"));
        X1(new DebugOption(0, g0.f77614b, null, false, "调试：是否绘制SimpleViewSpan调试线"));
        X1(new DebugOption(0, new r0(), null, false, "Lottie 动画加载测试"));
        X1(new DebugOption(0, t0.f77650b, null, false, "实验：翻转收藏样式优化"));
        X1(new DebugOption(0, u0.f77652b, null, false, "实验：翻转隐私设置入口显示"));
        X1(new DebugOption(0, new v0(), null, false, "是否安装该应用"));
        X1(new DebugOption(0, new w0(), null, false, "测试isTodayInTimezone "));
        X1(new DebugOption(0, x0.f77658b, null, false, "实验：翻转用户动态、历史搜索入口"));
        X1(new DebugOption(0, b.f77602b, null, false, "实验：翻转新版表情键盘开关"));
        X1(new DebugOption(0, c.f77604b, null, false, "实验：开启评论区改版"));
        X1(new DebugOption(0, d.f77606b, null, false, "sp开关：重置游戏详情页关注提示气泡"));
        X1(new DebugOption(0, e.f77608b, null, false, "实验：禁止发帖社区限制弹窗"));
        X1(new DebugOption(0, f.f77610b, null, false, "开启实验：发帖页话题社区选择入口改版"));
        X1(new DebugOption(0, g.f77613b, null, false, "翻转热搜欢迎页吸顶开关"));
        X1(new DebugOption(0, h.f77620b, null, false, "Reset本地记录CoCo上报时间戳"));
        X1(new DebugOption(0, new i(), null, false, "MMKV 测试开关"));
        X1(new DebugOption(0, new j(), null, false, "Router打开Uri测试"));
        X1(new DebugOption(0, new k(), null, false, "协议跳转测试"));
        X1(new DebugOption(0, new m(), null, false, "打开短视频"));
        X1(new DebugOption(0, n.f77634b, null, false, "清空签到本地记录"));
        X1(new DebugOption(0, new o(), null, false, "JSCORE测试j2v8"));
        X1(new DebugOption(0, p.f77639b, null, false, "重置商城购买协议同意状态"));
        X1(new DebugOption(0, q.f77642b, null, false, "重置商城新人引导气泡"));
        X1(new DebugOption(0, r.f77645b, null, false, "MAX清除个人页引导标志位"));
        X1(new DebugOption(0, s.f77647b, null, false, "重置同意购买协议状态"));
        X1(new DebugOption(0, new t(), null, false, "添加老版MAX登陆态 "));
        X1(new DebugOption(0, new u(), null, false, "测试js回调 "));
        X1(new DebugOption(0, new v(), null, false, "compose "));
        X1(new DebugOption(0, new x(), null, false, "test TX"));
        X1(new DebugOption(0, y.f77659b, null, false, "评论内容转图文发布测试"));
        X1(new DebugOption(0, new View.OnClickListener() { // from class: com.max.xiaoheihe.module.account.DebugSettingActivity$getData$32
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.DebugSettingActivity$getData$32$1, reason: invalid class name */
            /* JADX INFO: compiled from: DebugSettingActivity.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.account.DebugSettingActivity$getData$32$1", f = "DebugSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f77616b;

                AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 22678, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                    return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(cVar);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 22680, new Class[]{Object.class, Object.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                }

                @dl.e
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 22679, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22677, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    kotlin.coroutines.intrinsics.b.h();
                    if (this.f77616b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(obj);
                    com.max.hbutils.utils.c.f73533a.c("IO线程: 我是一条 showBottomHintToast");
                    return b2.f124493a;
                }
            }

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.DebugSettingActivity$getData$32$2, reason: invalid class name */
            /* JADX INFO: compiled from: DebugSettingActivity.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.account.DebugSettingActivity$getData$32$2", f = "DebugSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass2 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f77617b;

                AnonymousClass2(kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                    super(2, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 22682, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                    return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass2(cVar);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 22684, new Class[]{Object.class, Object.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                }

                @dl.e
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 22683, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22681, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    kotlin.coroutines.intrinsics.b.h();
                    if (this.f77617b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(obj);
                    com.max.hbutils.utils.c.d("IO线程: 我是一条长 Toast");
                    return b2.f124493a;
                }
            }

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.DebugSettingActivity$getData$32$3, reason: invalid class name */
            /* JADX INFO: compiled from: DebugSettingActivity.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.account.DebugSettingActivity$getData$32$3", f = "DebugSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass3 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f77618b;

                AnonymousClass3(kotlin.coroutines.c<? super AnonymousClass3> cVar) {
                    super(2, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 22686, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                    return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass3(cVar);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 22688, new Class[]{Object.class, Object.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                }

                @dl.e
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 22687, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass3) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22685, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    kotlin.coroutines.intrinsics.b.h();
                    if (this.f77618b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(obj);
                    com.max.hbutils.utils.c.d("IO线程: 我是一条长 Toast");
                    return b2.f124493a;
                }
            }

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.DebugSettingActivity$getData$32$4, reason: invalid class name */
            /* JADX INFO: compiled from: DebugSettingActivity.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.account.DebugSettingActivity$getData$32$4", f = "DebugSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass4 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f77619b;

                AnonymousClass4(kotlin.coroutines.c<? super AnonymousClass4> cVar) {
                    super(2, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 22690, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                    return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass4(cVar);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 22692, new Class[]{Object.class, Object.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                }

                @dl.e
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 22691, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass4) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22689, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    kotlin.coroutines.intrinsics.b.h();
                    if (this.f77619b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(obj);
                    com.max.hbutils.utils.c.d("IO线程: 我是一条长 Toast");
                    return b2.f124493a;
                }
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22676, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                switch (this.f77615b.P % 8) {
                    case 0:
                        com.max.hbutils.utils.c.f("我是一条短 Toast");
                        break;
                    case 1:
                        com.max.hbutils.utils.c.d("我是一条长 Toast");
                        break;
                    case 2:
                        com.max.hbutils.utils.c.f73533a.e("我是一条NotifyToast的Title", "我是一条NotifyToast的MSG");
                        break;
                    case 3:
                        com.max.hbutils.utils.c.f73533a.c("我是一条 showBottomHintToast");
                        break;
                    case 4:
                        kotlinx.coroutines.k.f(this.f77615b.O, e1.c(), null, new AnonymousClass1(null), 2, null);
                        break;
                    case 5:
                        kotlinx.coroutines.k.f(this.f77615b.O, e1.c(), null, new AnonymousClass2(null), 2, null);
                        break;
                    case 6:
                        kotlinx.coroutines.k.f(this.f77615b.O, e1.c(), null, new AnonymousClass3(null), 2, null);
                        break;
                    case 7:
                        kotlinx.coroutines.k.f(this.f77615b.O, e1.c(), null, new AnonymousClass4(null), 2, null);
                        break;
                }
                this.f77615b.P++;
            }
        }, null, false, "Toast 测试"));
        X1(new DebugOption(0, z.f77661b, null, false, "测试j2v8"));
        X1(new DebugOption(0, new a0(), null, false, "UI KIT 测试"));
        X1(new DebugOption(0, new b0(), null, false, "富文本 测试"));
        X1(new DebugOption(1, null, new c0(), com.max.hbcommon.utils.c.x(com.max.hbcache.c.o("show_ue_tool", "0")), "UE Tool - UI 测试工具"));
        X1(new DebugOption(1, null, new d0(), com.max.hbcommon.utils.c.x(com.max.hbcache.c.o("show_ue_tool", "0")), "内存监测便签条"));
        X1(new DebugOption(0, e0.f77609b, null, false, "清空记录的底部广告弹窗"));
        X1(new DebugOption(0, new f0(), null, false, "HBLog测试上传"));
        X1(new DebugOption(0, new h0(), null, false, "恢复全部上传任务"));
        X1(new DebugOption(0, new i0(), null, false, "Flutter页面"));
        X1(new DebugOption(0, new j0(), null, false, "弹窗测试"));
        X1(new DebugOption(0, k0.f77629b, null, false, "清除图片编辑草稿"));
        X1(new DebugOption(0, l0.f77631b, null, false, "清除搜索热搜"));
        X1(new DebugOption(0, new m0(), null, false, "清除cookie"));
        X1(new DebugOption(0, new n0(), null, false, "重置兴趣选择"));
        X1(new DebugOption(0, new o0(), null, false, "清除本日签到标记"));
        if (com.max.hbcommon.network.b.f68052i || c2()) {
            X1(new DebugOption(1, null, new p0(), com.max.hbcustomview.floatingview.a.n().getView() != null, "显示圈选"));
        }
        X1(new DebugOption(0, new q0(), null, false, "显示UI对比帮助框"));
        X1(new DebugOption(0, s0.f77648b, null, false, "清除本地一次性引导标志"));
        com.max.hbcommon.base.adapter.u<DebugOption> uVar = this.M;
        if (uVar == null) {
            kotlin.jvm.internal.f0.S("mAdapter");
            uVar = null;
        }
        uVar.notifyDataSetChanged();
    }

    private static final boolean Z1(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 22645, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (Settings.canDrawOverlays(context)) {
            return true;
        }
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName()));
        if (context instanceof Activity) {
            ((Activity) context).startActivityForResult(intent, 100);
        } else {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
        return false;
    }

    private final void a2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22640, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.M = new y0(this.f66601b, this.N);
        df.s sVar = this.L;
        com.max.hbcommon.base.adapter.u<DebugOption> uVar = null;
        if (sVar == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            sVar = null;
        }
        sVar.f115352d.setLayoutManager(new LinearLayoutManager(this.f66601b));
        df.s sVar2 = this.L;
        if (sVar2 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            sVar2 = null;
        }
        RecyclerView recyclerView = sVar2.f115352d;
        com.max.hbcommon.base.adapter.u<DebugOption> uVar2 = this.M;
        if (uVar2 == null) {
            kotlin.jvm.internal.f0.S("mAdapter");
        } else {
            uVar = uVar2;
        }
        recyclerView.setAdapter(uVar);
    }

    private final void b2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22641, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66616q.setTitle("调试选项列表");
        this.f66617r.setVisibility(0);
    }

    private final boolean c2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22637, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        String strJ = com.max.xiaoheihe.utils.i0.j();
        if (com.max.xiaoheihe.utils.i0.s()) {
            return kotlin.jvm.internal.f0.g(strJ, "127608") || kotlin.jvm.internal.f0.g(strJ, "892766") || kotlin.jvm.internal.f0.g(strJ, "100026") || kotlin.jvm.internal.f0.g(strJ, "7895105") || kotlin.jvm.internal.f0.g(strJ, "2636836") || kotlin.jvm.internal.f0.g(strJ, "15917935") || kotlin.jvm.internal.f0.g(strJ, "12692052") || kotlin.jvm.internal.f0.g(strJ, "22694312");
        }
        return false;
    }

    private final void e2(com.max.hbcommon.base.adapter.s.e eVar, DebugOption debugOption) {
        if (PatchProxy.proxy(new Object[]{eVar, debugOption}, this, changeQuickRedirect, false, 22639, new Class[]{com.max.hbcommon.base.adapter.s.e.class, DebugOption.class}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) eVar.i(R.id.vg_option);
        TextView textView = (TextView) eVar.i(R.id.tv_option);
        SwitchButton switchButton = (SwitchButton) eVar.i(R.id.sb_option);
        ImageView imageView = (ImageView) eVar.i(R.id.iv_arrow);
        textView.setText(debugOption.getName());
        switchButton.setOnClickListener(z0.f77662b);
        switchButton.setOnCheckedChangeListener(a1.f77601b);
        View.OnClickListener clickListener = debugOption.getClickListener();
        if (clickListener != null) {
            viewGroup.setOnClickListener(clickListener);
        }
        CompoundButton.OnCheckedChangeListener checkedChangeListener = debugOption.getCheckedChangeListener();
        if (checkedChangeListener != null) {
            switchButton.setOnCheckedChangeListener(checkedChangeListener);
            switchButton.setChecked(debugOption.getCheckedState(), false);
        }
        int type = debugOption.getType();
        if (type == 0) {
            imageView.setVisibility(0);
            switchButton.setVisibility(8);
        } else {
            if (type != 1) {
                return;
            }
            imageView.setVisibility(8);
            switchButton.setVisibility(0);
        }
    }

    private final void f2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22644, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.network.o.c(V0(), com.max.xiaoheihe.network.i.a().Pb(), new b1());
    }

    private final void h2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22636, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.d.f68238c) {
            com.max.hbcustomview.floatingview.a.n().getView().o();
        } else {
            com.max.hbcustomview.floatingview.a.n().getView().setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        }
    }

    private final void i2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22642, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        df.s sVarC = df.s.c(this.f66602c);
        kotlin.jvm.internal.f0.o(sVarC, "inflate(mInflater)");
        this.L = sVarC;
        df.s sVar = null;
        if (sVarC == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            sVarC = null;
        }
        setContentView(sVarC.b());
        df.s sVar2 = this.L;
        if (sVar2 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
        } else {
            sVar = sVar2;
        }
        sVar.f115350b.setContent(ComposableSingletons$DebugSettingActivityKt.f77586a.b());
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22634, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        i2();
        b2();
        a2();
        Y1();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        ArrayList<LocalMedia> arrayListG;
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 22643, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        if (i11 == 96) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("error, ");
            sb2.append(intent != null ? String.valueOf(UCrop.getError(intent)) : null);
            Log.d("cqtest", sb2.toString());
        } else if (i10 == 0 && i11 == -1 && (arrayListG = com.max.mediaselector.lib.basic.q.g(intent)) != null && arrayListG.size() > 0) {
            ArrayList arrayList = new ArrayList();
            Iterator<LocalMedia> it = arrayListG.iterator();
            while (it.hasNext()) {
                arrayList.add(Uri.fromFile(new File(it.next().G())));
            }
        }
        super.onActivityResult(i10, i11, intent);
    }
}
