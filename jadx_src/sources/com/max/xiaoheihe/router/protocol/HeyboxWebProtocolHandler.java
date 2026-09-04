package com.max.xiaoheihe.router.protocol;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.TypeReference;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbcommon.network.ApiException;
import com.max.hbcommon.network.interceptor.ErrorHandleInterceptor;
import com.max.hblogistics.AddressListActivity;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.AccelWorldLottieKt;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.bean.bbs.GamesInfoResultObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.webintercept.TagJsObj;
import com.max.xiaoheihe.module.bbs.ReportReasonFragment;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.littleprogram.MiniProgramContainerActivity;
import com.max.xiaoheihe.module.littleprogram.fragment.webwithnative.WebWithNativeContainerFragment;
import com.max.xiaoheihe.module.mall.BottomBarManager;
import com.max.xiaoheihe.module.miniprogram.MiniProgramHostActivity;
import com.max.xiaoheihe.module.trade.TradeInfoUtilKt;
import com.max.xiaoheihe.module.trade.TradePurchaseInventoryDialogFragment;
import com.max.xiaoheihe.module.trade.TradePurchaseRegisterActivity;
import com.max.xiaoheihe.module.voice.HeyboxMicFragment;
import com.max.xiaoheihe.module.webview.TransparentWebActionActivity;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.module.webview.WebFragmentDialog;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.mmkv.MMKV;
import com.tencent.open.SocialConstants;
import com.tencent.qcloud.core.util.IOUtils;
import com.xiaomi.mipush.sdk.Constants;
import dl.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.v0;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Cookie;

/* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
/* JADX INFO: loaded from: classes13.dex */
@t0({"SMAP\nHeyboxWebProtocolHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeyboxWebProtocolHandler.kt\ncom/max/xiaoheihe/router/protocol/HeyboxWebProtocolHandler\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,3660:1\n37#2,2:3661\n37#2,2:3666\n1#3:3663\n1855#4,2:3664\n*S KotlinDebug\n*F\n+ 1 HeyboxWebProtocolHandler.kt\ncom/max/xiaoheihe/router/protocol/HeyboxWebProtocolHandler\n*L\n1599#1:3661,2\n2278#1:3666,2\n2267#1:3664,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class HeyboxWebProtocolHandler implements com.max.xiaoheihe.router.protocol.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f95003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f95004b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f95005c = null;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final String f95006d = "UNIMPLEMENTED_PROTOCOL";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final String[] f95007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final String f95008f = "heyboxchat_protocol";

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.e
        @xh.m
        public final String a(@dl.e String str, @dl.e String str2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 48236, new Class[]{String.class, String.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            if (com.max.hbcommon.utils.c.u(str)) {
                return null;
            }
            kotlin.jvm.internal.f0.m(str);
            String str3 = "()";
            if (kotlin.text.u.K1(str, ")", false, 2, null) && !kotlin.text.u.K1(str, "()", false, 2, null)) {
                return str;
            }
            String strL2 = kotlin.text.u.l2(str, "()", "", false, 4, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strL2);
            if (str2 != null) {
                str3 = '(' + str2 + ')';
            }
            sb2.append(str3);
            return sb2.toString();
        }

        @dl.d
        public final String[] b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48237, new Class[0], String[].class);
            return patchProxyResultProxy.isSupported ? (String[]) patchProxyResultProxy.result : HeyboxWebProtocolHandler.f95007e;
        }

        public final String c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48234, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : HeyboxWebProtocolHandler.f95005c;
        }

        public final void d(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48235, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            HeyboxWebProtocolHandler.f95005c = str;
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class a0 implements r1.a1 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebView f95009a;

        a0(WebView webView) {
            this.f95009a = webView;
        }

        @Override // com.max.xiaoheihe.module.game.r1.a1
        public void onError() {
            WebView webView;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48293, new Class[0], Void.TYPE).isSupported || (webView = this.f95009a) == null) {
                return;
            }
            webView.loadUrl("javascript:subscribeFailedCallback()");
        }

        @Override // com.max.xiaoheihe.module.game.r1.a1
        public void onSuccess() {
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class b {
        public static ChangeQuickRedirect changeQuickRedirect = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f95010e = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final Context f95011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private final WebView f95012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final WebProtocolObj f95013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.e
        private final com.max.xiaoheihe.module.webview.t f95014d;

        public b(@dl.d Context context, @dl.e WebView webView, @dl.d WebProtocolObj webProtocolObj, @dl.e com.max.xiaoheihe.module.webview.t tVar) {
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(webProtocolObj, "webProtocolObj");
            this.f95011a = context;
            this.f95012b = webView;
            this.f95013c = webProtocolObj;
            this.f95014d = tVar;
        }

        @dl.d
        public final Context a() {
            return this.f95011a;
        }

        @dl.e
        public final com.max.xiaoheihe.module.webview.t b() {
            return this.f95014d;
        }

        @dl.d
        public final WebProtocolObj c() {
            return this.f95013c;
        }

        @dl.e
        public final WebView d() {
            return this.f95012b;
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class b0 implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebView f95016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f95017c;

        b0(WebView webView, String str) {
            this.f95016b = webView;
            this.f95017c = str;
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 48295, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(dialog, "dialog");
            HeyboxWebProtocolHandler.b(HeyboxWebProtocolHandler.this, this.f95016b, GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING, null, this.f95017c);
            dialog.dismiss();
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 48294, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(dialog, "dialog");
            dialog.dismiss();
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class c implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebviewFragment f95018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f95019c;

        c(WebviewFragment webviewFragment, int i10) {
            this.f95018b = webviewFragment;
            this.f95019c = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            WebviewFragment webviewFragment;
            WebView webViewU6;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48238, new Class[0], Void.TYPE).isSupported || (webviewFragment = this.f95018b) == null || (webViewU6 = webviewFragment.U6()) == null) {
                return;
            }
            webViewU6.setBackgroundColor(this.f95019c);
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class c0 extends TypeToken<Map<String, ? extends String>> {
        c0() {
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class d implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebActionActivity f95020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WebProtocolObj f95021c;

        d(WebActionActivity webActionActivity, WebProtocolObj webProtocolObj) {
            this.f95020b = webActionActivity;
            this.f95021c = webProtocolObj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48241, new Class[0], Void.TYPE).isSupported && this.f95020b.isActive()) {
                WebActionActivity.O2(this.f95021c, this.f95020b);
            }
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class d0 extends TypeToken<List<? extends KeyDescObj>> {
        d0() {
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class e extends com.max.hbcommon.network.d<Result<GamesInfoResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        public void onNext(@dl.d Result<GamesInfoResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 48242, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            super.onNext(result);
            if (result.getResult() != null) {
                GamesInfoResultObj result2 = result.getResult();
                kotlin.jvm.internal.f0.m(result2);
                if (com.max.hbcommon.utils.c.w(result2.getBase_infos())) {
                    return;
                }
                GamesInfoResultObj result3 = result.getResult();
                kotlin.jvm.internal.f0.m(result3);
                com.max.xiaoheihe.module.game.c.l(result3.getBase_infos().get(0));
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 48243, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GamesInfoResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class e0 implements com.max.xiaoheihe.module.game.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f95023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebView f95024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.module.webview.t f95025c;

        e0(String str, WebView webView, com.max.xiaoheihe.module.webview.t tVar) {
            this.f95023a = str;
            this.f95024b = webView;
            this.f95025c = tVar;
        }

        @Override // com.max.xiaoheihe.module.game.f
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48297, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            HeyboxWebProtocolHandler.g(this.f95023a, this.f95024b, this.f95025c, false);
        }

        @Override // com.max.xiaoheihe.module.game.f
        public void onSuccess() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48296, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            HeyboxWebProtocolHandler.g(this.f95023a, this.f95024b, this.f95025c, true);
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class f extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f95026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WebView f95027c;

        f(String str, WebView webView) {
            this.f95026b = str;
            this.f95027c = webView;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            WebView webView;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48244, new Class[0], Void.TYPE).isSupported || !kotlin.text.u.L1(GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING, this.f95026b, true) || (webView = this.f95027c) == null) {
                return;
            }
            webView.loadUrl("javascript:subscribeSuccessCallback()");
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 48245, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            WebView webView = this.f95027c;
            if (webView != null) {
                webView.loadUrl("javascript:subscribeFailedCallback()");
            }
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class f0 implements com.max.xiaoheihe.network.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebProtocolObj f95028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f95029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f95030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ WebView f95031d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.module.webview.t f95032e;

        /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
        public static final class a implements com.max.xiaoheihe.module.webview.t.b {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ JsonObject f95033a;

            a(JsonObject jsonObject) {
                this.f95033a = jsonObject;
            }

            @Override // com.max.xiaoheihe.module.webview.t.b
            public final void a(@dl.d JsonObject message) {
                if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 48300, new Class[]{JsonObject.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(message, "message");
                message.add("data", this.f95033a);
            }
        }

        /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
        public static final class b implements com.max.xiaoheihe.module.webview.t.b {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ JsonObject f95034a;

            b(JsonObject jsonObject) {
                this.f95034a = jsonObject;
            }

            @Override // com.max.xiaoheihe.module.webview.t.b
            public final void a(@dl.d JsonObject message) {
                if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 48301, new Class[]{JsonObject.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(message, "message");
                message.add("data", this.f95034a);
            }
        }

        f0(WebProtocolObj webProtocolObj, String str, String str2, WebView webView, com.max.xiaoheihe.module.webview.t tVar) {
            this.f95028a = webProtocolObj;
            this.f95029b = str;
            this.f95030c = str2;
            this.f95031d = webView;
            this.f95032e = tVar;
        }

        @Override // com.max.xiaoheihe.network.h
        public void a(@dl.e Exception exc) {
            String message;
            if (PatchProxy.proxy(new Object[]{exc}, this, changeQuickRedirect, false, 48299, new Class[]{Exception.class}, Void.TYPE).isSupported) {
                return;
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("id", this.f95028a.valueOf("id"));
            if (exc != null && (message = exc.getMessage()) != null) {
                jsonObject.addProperty("error", message);
            }
            com.max.xiaoheihe.utils.l0.k(!kotlin.jvm.internal.f0.g("false", this.f95029b), HeyboxWebProtocolHandler.f95003a.a(this.f95030c, jsonObject.toString()), this.f95031d, new a(jsonObject), this.f95032e);
            Log.d("sendRequestV2", "onFailed: " + jsonObject);
        }

        @Override // com.max.xiaoheihe.network.h
        public void b(@dl.e JsonObject jsonObject, @dl.e String str, @dl.e okhttp3.s sVar, int i10) {
            if (PatchProxy.proxy(new Object[]{jsonObject, str, sVar, new Integer(i10)}, this, changeQuickRedirect, false, 48298, new Class[]{JsonObject.class, String.class, okhttp3.s.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("id", this.f95028a.valueOf("id"));
            if (jsonObject != null) {
                jsonObject2.add("content", jsonObject);
            }
            if (str != null) {
                jsonObject2.addProperty("content", str);
            }
            if (sVar != null) {
                try {
                    JsonObject jsonObject3 = new JsonObject();
                    for (Map.Entry<String, List<String>> entry : sVar.u().entrySet()) {
                        String key = entry.getKey();
                        List<String> value = entry.getValue();
                        if (!com.max.hbcommon.utils.c.w(value)) {
                            StringBuilder sb2 = new StringBuilder();
                            for (String str2 : value) {
                                if (sb2.length() > 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(str2);
                            }
                            jsonObject3.addProperty(key, sb2.toString());
                        }
                    }
                    jsonObject2.add("responseHeaders", (JsonElement) com.max.hbutils.utils.k.a(com.max.hbutils.utils.k.p(jsonObject3), JsonObject.class));
                } catch (Throwable unused) {
                }
            }
            jsonObject2.addProperty("responseStatus", Integer.valueOf(i10));
            com.max.xiaoheihe.utils.l0.k(!kotlin.jvm.internal.f0.g("false", this.f95029b), HeyboxWebProtocolHandler.f95003a.a(this.f95030c, jsonObject2.toString()), this.f95031d, new b(jsonObject2), this.f95032e);
            Log.d("sendRequestV2", "onResponse StatusCode: " + i10 + ' ' + this.f95028a.valueOf("url"));
            StringBuilder sb3 = new StringBuilder();
            sb3.append("onResponse: ");
            sb3.append(jsonObject2);
            Log.d("sendRequestV2", sb3.toString());
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class g extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f95035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Intent f95036c;

        g(Context context, Intent intent) {
            this.f95035b = context;
            this.f95036c = intent;
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 48246, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (((BaseActivity) this.f95035b).isActive()) {
                Object obj = result.getKeyMap().get("certificated");
                kotlin.jvm.internal.f0.n(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                String str = result.getKeyMap().get("msg");
                User userI = com.max.xiaoheihe.utils.i0.i();
                userI.setCertificated(zBooleanValue);
                com.max.xiaoheihe.utils.i0.z(userI);
                if (!zBooleanValue) {
                    com.max.xiaoheihe.utils.i0.B(null, null);
                    return;
                }
                if (!com.max.hbcommon.utils.c.u(str)) {
                    com.max.hbutils.utils.c.d(str);
                    return;
                }
                com.max.xiaoheihe.utils.l0.x0(this.f95035b, this.f95036c, 111);
                Context context = this.f95035b;
                kotlin.jvm.internal.f0.n(context, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context).overridePendingTransition(R.anim.activity_bottom_in, R.anim.activity_stay);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 48247, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class g0 implements com.max.hbcommon.component.bottomsheet.t {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f95037a;

        g0(String str) {
            this.f95037a = str;
        }

        @Override // com.max.hbcommon.component.bottomsheet.t
        public void onDismiss() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48302, new Class[0], Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f95037a)) {
                return;
            }
            com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.b(com.max.hbutils.utils.n.q(this.f95037a));
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class h implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebProtocolObj f95038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f95039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.module.webview.t f95040d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ HeyboxWebProtocolHandler f95041e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ WebView f95042f;

        /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
        public static final class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ WebProtocolObj f95043b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.max.xiaoheihe.module.webview.t f95044c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ EditText f95045d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Context f95046e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ HeyboxWebProtocolHandler f95047f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ WebView f95048g;

            /* JADX INFO: renamed from: com.max.xiaoheihe.router.protocol.HeyboxWebProtocolHandler$h$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
            public static final class C0899a implements com.max.xiaoheihe.module.webview.t.a {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ EditText f95049a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ WebView f95050b;

                C0899a(EditText editText, WebView webView) {
                    this.f95049a = editText;
                    this.f95050b = webView;
                }

                @Override // com.max.xiaoheihe.module.webview.t.a
                public final void a() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48252, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    v0 v0Var = v0.f124986a;
                    String str = String.format("maxAlertConfirmCallback('%s')", Arrays.copyOf(new Object[]{this.f95049a.getText().toString()}, 1));
                    kotlin.jvm.internal.f0.o(str, "format(format, *args)");
                    com.max.xiaoheihe.utils.l0.j(true, str, this.f95050b);
                }
            }

            a(WebProtocolObj webProtocolObj, com.max.xiaoheihe.module.webview.t tVar, EditText editText, Context context, HeyboxWebProtocolHandler heyboxWebProtocolHandler, WebView webView) {
                this.f95043b = webProtocolObj;
                this.f95044c = tVar;
                this.f95045d = editText;
                this.f95046e = context;
                this.f95047f = heyboxWebProtocolHandler;
                this.f95048g = webView;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48251, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                if (kotlin.jvm.internal.f0.g("true", this.f95043b.valueOf("show_input"))) {
                    com.max.xiaoheihe.accelworld.j.f("maxAlertConfirmCallback", this.f95044c, this.f95045d.getText().toString(), new C0899a(this.f95045d, this.f95048g), null);
                    com.max.xiaoheihe.utils.d.E0(this.f95046e, this.f95045d);
                } else {
                    WebProtocolObj webProtocolObj = (WebProtocolObj) this.f95043b.objectOf("confirm_protocol", WebProtocolObj.class);
                    if (webProtocolObj != null) {
                        this.f95047f.C(this.f95046e, this.f95048g, webProtocolObj, this.f95044c);
                    }
                }
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
        public static final class b implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ WebProtocolObj f95051b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ HeyboxWebProtocolHandler f95052c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Context f95053d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ WebView f95054e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ com.max.xiaoheihe.module.webview.t f95055f;

            b(WebProtocolObj webProtocolObj, HeyboxWebProtocolHandler heyboxWebProtocolHandler, Context context, WebView webView, com.max.xiaoheihe.module.webview.t tVar) {
                this.f95051b = webProtocolObj;
                this.f95052c = heyboxWebProtocolHandler;
                this.f95053d = context;
                this.f95054e = webView;
                this.f95055f = tVar;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48253, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                WebProtocolObj webProtocolObj = (WebProtocolObj) this.f95051b.objectOf("cancel_protocol", WebProtocolObj.class);
                if (webProtocolObj != null) {
                    this.f95052c.C(this.f95053d, this.f95054e, webProtocolObj, this.f95055f);
                }
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
        public static final class c implements DialogInterface.OnDismissListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f95056b;

            c(int i10) {
                this.f95056b = i10;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                if (PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, 48254, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.b(this.f95056b);
            }
        }

        h(WebProtocolObj webProtocolObj, Context context, com.max.xiaoheihe.module.webview.t tVar, HeyboxWebProtocolHandler heyboxWebProtocolHandler, WebView webView) {
            this.f95038b = webProtocolObj;
            this.f95039c = context;
            this.f95040d = tVar;
            this.f95041e = heyboxWebProtocolHandler;
            this.f95042f = webView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48250, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            String strValueOf = this.f95038b.valueOf("priority_on_conflict");
            int iQ = com.max.hbutils.utils.n.q(strValueOf);
            if (com.max.hbcommon.utils.c.u(strValueOf) || com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.c(iQ)) {
                if (!com.max.hbcommon.utils.c.u(strValueOf)) {
                    com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.a(iQ);
                }
                com.max.hbcommon.view.a.f fVarL = new com.max.hbcommon.view.a.f(this.f95039c).y(this.f95038b.valueOf("title")).l(this.f95038b.valueOf(SocialConstants.PARAM_APP_DESC));
                kotlin.jvm.internal.f0.o(fVarL, "Builder(context)\n       …tocolObj.valueOf(\"desc\"))");
                EditText editText = new EditText(this.f95039c);
                if (!com.max.hbcommon.utils.c.u(this.f95038b.valueOf(qb.a.f138641d))) {
                    fVarL.u(this.f95038b.valueOf(qb.a.f138641d), new a(this.f95038b, this.f95040d, editText, this.f95039c, this.f95041e, this.f95042f));
                }
                if (!com.max.hbcommon.utils.c.u(this.f95038b.valueOf("cancel"))) {
                    fVarL.o(this.f95038b.valueOf("cancel"), new b(this.f95038b, this.f95041e, this.f95039c, this.f95042f, this.f95040d));
                }
                if (kotlin.jvm.internal.f0.g("true", this.f95038b.valueOf("show_input"))) {
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.leftMargin = ViewUtils.f(this.f95039c, 14.0f);
                    layoutParams.rightMargin = ViewUtils.f(this.f95039c, 14.0f);
                    layoutParams.topMargin = ViewUtils.f(this.f95039c, 20.0f);
                    layoutParams.bottomMargin = ViewUtils.f(this.f95039c, 23.0f);
                    layoutParams.height = ViewUtils.f(this.f95039c, 40.0f);
                    layoutParams.width = -1;
                    editText.setGravity(17);
                    editText.setLayoutParams(layoutParams);
                    editText.setTextSize(14.0f);
                    editText.setSingleLine();
                    editText.setHint(this.f95038b.valueOf("placeholder"));
                    editText.setBackgroundResource(R.color.background_layer_2_color);
                    fVarL.i(editText);
                }
                fVarL.r(new c(iQ));
                if (((BaseActivity) this.f95039c).isFinishing()) {
                    return;
                }
                fVarL.F();
            }
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class h0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebProtocolObj f95057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HeyboxWebProtocolHandler f95058c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ FragmentActivity f95059d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ WebView f95060e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.module.webview.t f95061f;

        h0(WebProtocolObj webProtocolObj, HeyboxWebProtocolHandler heyboxWebProtocolHandler, FragmentActivity fragmentActivity, WebView webView, com.max.xiaoheihe.module.webview.t tVar) {
            this.f95057b = webProtocolObj;
            this.f95058c = heyboxWebProtocolHandler;
            this.f95059d = fragmentActivity;
            this.f95060e = webView;
            this.f95061f = tVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            WebProtocolObj webProtocolObj;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48303, new Class[]{View.class}, Void.TYPE).isSupported || (webProtocolObj = this.f95057b) == null) {
                return;
            }
            this.f95058c.C(this.f95059d, this.f95060e, webProtocolObj, this.f95061f);
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class i extends TypeReference<HashMap<String, Object>> {
        i() {
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class i0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DatePicker f95062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TimePicker f95063c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f95064d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ b f95065e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ WebView f95066f;

        /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
        public static final class a implements com.max.xiaoheihe.module.webview.t.b {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f95067a;

            a(String str) {
                this.f95067a = str;
            }

            @Override // com.max.xiaoheihe.module.webview.t.b
            public final void a(@dl.d JsonObject it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 48305, new Class[]{JsonObject.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(it, "it");
                it.addProperty("data", this.f95067a);
            }
        }

        /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
        public static final class b implements com.max.xiaoheihe.module.webview.t.a {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ WebView f95068a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f95069b;

            b(WebView webView, String str) {
                this.f95068a = webView;
                this.f95069b = str;
            }

            @Override // com.max.xiaoheihe.module.webview.t.a
            public final void a() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48306, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                WebView webView = this.f95068a;
                v0 v0Var = v0.f124986a;
                String str = String.format("javascript:clientDateCallback(%s)", Arrays.copyOf(new Object[]{this.f95069b}, 1));
                kotlin.jvm.internal.f0.o(str, "format(format, *args)");
                webView.loadUrl(str);
            }
        }

        i0(DatePicker datePicker, TimePicker timePicker, int i10, b bVar, WebView webView) {
            this.f95062b = datePicker;
            this.f95063c = timePicker;
            this.f95064d = i10;
            this.f95065e = bVar;
            this.f95066f = webView;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(@dl.d DialogInterface currentDialog, int i10) {
            String strS;
            if (PatchProxy.proxy(new Object[]{currentDialog, new Integer(i10)}, this, changeQuickRedirect, false, 48304, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(currentDialog, "currentDialog");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f95062b.getYear());
            sb2.append('-');
            sb2.append(this.f95062b.getMonth() + 1);
            sb2.append('-');
            sb2.append(this.f95062b.getDayOfMonth());
            String string = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f95063c.getCurrentHour().intValue());
            sb3.append(':');
            sb3.append(this.f95063c.getCurrentMinute().intValue());
            String string2 = sb3.toString();
            int i11 = this.f95064d;
            if (i11 == 0) {
                strS = com.max.hbutils.utils.w.S(string2, "HH:mm");
                kotlin.jvm.internal.f0.o(strS, "timeString2UnixTimeStamp(timeString, \"HH:mm\")");
            } else if (i11 != 1) {
                strS = com.max.hbutils.utils.w.S(string + ' ' + string2, com.max.hbutils.utils.w.f73605l);
                kotlin.jvm.internal.f0.o(strS, "timeString2UnixTimeStamp…mm\"\n                    )");
            } else {
                strS = com.max.hbutils.utils.w.S(string, "yyyy-MM-dd");
                kotlin.jvm.internal.f0.o(strS, "timeString2UnixTimeStamp(dateString, \"yyyy-MM-dd\")");
            }
            com.max.xiaoheihe.accelworld.j.e("clientDateCallback", this.f95065e.b(), new a(strS), new b(this.f95066f, strS), null);
            currentDialog.dismiss();
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class j implements com.max.xiaoheihe.utils.l0.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f95070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebProtocolObj f95071b;

        j(Context context, WebProtocolObj webProtocolObj) {
            this.f95070a = context;
            this.f95071b = webProtocolObj;
        }

        @Override // com.max.xiaoheihe.utils.l0.g
        public final void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48255, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            if (kotlin.jvm.internal.f0.g("1", com.max.hbcache.c.j("trade_purchase_exam_pass"))) {
                Context context = this.f95070a;
                com.max.xiaoheihe.utils.d.G1(context, TradePurchaseRegisterActivity.f93214p2.a(context, this.f95071b.valueOf("spu_id")));
            } else {
                BaseActivity baseActivity = (BaseActivity) this.f95070a;
                kotlin.jvm.internal.f0.m(baseActivity);
                TradeInfoUtilKt.S(baseActivity, "purchase");
            }
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class j0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckBox f95072b;

        j0(CheckBox checkBox) {
            this.f95072b = checkBox;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48307, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            CheckBox checkBox = this.f95072b;
            checkBox.setChecked(true ^ checkBox.isChecked());
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class k implements com.max.xiaoheihe.utils.l0.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f95073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebProtocolObj f95074b;

        k(Context context, WebProtocolObj webProtocolObj) {
            this.f95073a = context;
            this.f95074b = webProtocolObj;
        }

        @Override // com.max.xiaoheihe.utils.l0.g
        public final void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48256, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            if (!kotlin.jvm.internal.f0.g("1", com.max.hbcache.c.j("trade_purchase_exam_pass"))) {
                BaseActivity baseActivity = (BaseActivity) this.f95073a;
                kotlin.jvm.internal.f0.m(baseActivity);
                TradeInfoUtilKt.S(baseActivity, "purchase");
            } else if (this.f95073a instanceof BaseActivity) {
                String strValueOf = this.f95074b.valueOf("pcs_id");
                TradePurchaseInventoryDialogFragment tradePurchaseInventoryDialogFragmentA = strValueOf != null ? TradePurchaseInventoryDialogFragment.K.a(strValueOf) : null;
                if (tradePurchaseInventoryDialogFragmentA != null) {
                    Context context = this.f95073a;
                    kotlin.jvm.internal.f0.n(context, "null cannot be cast to non-null type com.max.hbcommon.base.BaseActivity");
                    tradePurchaseInventoryDialogFragmentA.show(((BaseActivity) context).getSupportFragmentManager(), "tag_inventory_fragment");
                }
            }
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class k0 implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f95075b;

        k0(TextView textView) {
            this.f95075b = textView;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(@dl.e CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 48308, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f95075b.setEnabled(z10);
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class l implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f95076a;

        l(Context context) {
            this.f95076a = context;
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 48249, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(dialog, "dialog");
            com.max.xiaoheihe.utils.d.I1(this.f95076a);
            dialog.dismiss();
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 48248, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(dialog, "dialog");
            dialog.dismiss();
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class l0 extends com.max.hbcustomview.spans.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f95077d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l0(Context context, int i10) {
            super(i10);
            this.f95077d = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@dl.d View arg0) {
            if (PatchProxy.proxy(new Object[]{arg0}, this, changeQuickRedirect, false, 48309, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(arg0, "arg0");
            Intent intentC0 = com.max.xiaoheihe.utils.l0.c0(this.f95077d);
            intentC0.putExtra("title", "用户协议");
            intentC0.putExtra("pageurl", lb.a.D1);
            com.max.xiaoheihe.utils.l0.w0(this.f95077d, intentC0);
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class m implements com.max.xiaoheihe.module.webview.t.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JsonObject f95078a;

        m(JsonObject jsonObject) {
            this.f95078a = jsonObject;
        }

        @Override // com.max.xiaoheihe.module.webview.t.b
        public final void a(@dl.d JsonObject message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 48259, new Class[]{JsonObject.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(message, "message");
            message.add("data", this.f95078a);
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class m0 extends com.max.hbcustomview.spans.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f95079d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m0(Context context, int i10) {
            super(i10);
            this.f95079d = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@dl.d View arg0) {
            if (PatchProxy.proxy(new Object[]{arg0}, this, changeQuickRedirect, false, 48310, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(arg0, "arg0");
            Intent intentC0 = com.max.xiaoheihe.utils.l0.c0(this.f95079d);
            intentC0.putExtra("title", "隐私政策");
            intentC0.putExtra("pageurl", lb.a.E1);
            com.max.xiaoheihe.utils.l0.w0(this.f95079d, intentC0);
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class n implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f95080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f95081c;

        n(Activity activity, String str) {
            this.f95080b = activity;
            this.f95081c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48260, new Class[0], Void.TYPE).isSupported && ((WebActionActivity) this.f95080b).isActive()) {
                if (kotlin.jvm.internal.f0.g("dark", this.f95081c)) {
                    com.max.hbutils.utils.t.M(this.f95080b, true);
                    ((WebActionActivity) this.f95080b).B0(true);
                } else if (kotlin.jvm.internal.f0.g(AccelWorldLottieKt.f76443a, this.f95081c)) {
                    com.max.hbutils.utils.t.M(this.f95080b, false);
                    ((WebActionActivity) this.f95080b).B0(false);
                }
            }
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class n0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f95082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EditText f95083c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ EditText f95084d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Dialog f95085e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.utils.l0.g f95086f;

        n0(Context context, EditText editText, EditText editText2, Dialog dialog, com.max.xiaoheihe.utils.l0.g gVar) {
            this.f95082b = context;
            this.f95083c = editText;
            this.f95084d = editText2;
            this.f95085e = dialog;
            this.f95086f = gVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48311, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = this.f95082b;
            kotlin.jvm.internal.f0.n(context, "null cannot be cast to non-null type android.app.Activity");
            if (com.max.hbcommon.utils.c.g((Activity) context, this.f95083c, "姓名不能为空") || com.max.hbcommon.utils.c.g((Activity) this.f95082b, this.f95084d, "证件号不能为空")) {
                return;
            }
            com.max.xiaoheihe.module.game.mobilelicense.a.a(this.f95085e, this.f95084d.getText().toString(), this.f95083c.getText().toString(), null, null, this.f95086f);
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class o implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f95087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f95088c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<KeyDescObj> f95089d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f95090e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ WebProtocolObj f95091f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b f95092g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ WebView f95093h;

        /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
        public static final class a implements HeyBoxPopupMenu.h {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f95094a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f95095b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ WebView f95096c;

            /* JADX INFO: renamed from: com.max.xiaoheihe.router.protocol.HeyboxWebProtocolHandler$o$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
            public static final class C0900a implements com.max.xiaoheihe.module.webview.t.b {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ KeyDescObj f95097a;

                C0900a(KeyDescObj keyDescObj) {
                    this.f95097a = keyDescObj;
                }

                @Override // com.max.xiaoheihe.module.webview.t.b
                public final void a(@dl.d JsonObject it) {
                    if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 48265, new Class[]{JsonObject.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    kotlin.jvm.internal.f0.p(it, "it");
                    it.addProperty("data", String.valueOf(this.f95097a.getIndex()));
                }
            }

            /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
            public static final class b implements com.max.xiaoheihe.module.webview.t.a {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ KeyDescObj f95098a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ WebView f95099b;

                b(KeyDescObj keyDescObj, WebView webView) {
                    this.f95098a = keyDescObj;
                    this.f95099b = webView;
                }

                @Override // com.max.xiaoheihe.module.webview.t.a
                public final void a() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48266, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    v0 v0Var = v0.f124986a;
                    String str = String.format("pickerSelectedCallback(%s)", Arrays.copyOf(new Object[]{Integer.valueOf(this.f95098a.getIndex())}, 1));
                    kotlin.jvm.internal.f0.o(str, "format(format, *args)");
                    com.max.xiaoheihe.utils.l0.j(true, str, this.f95099b);
                }
            }

            a(Context context, b bVar, WebView webView) {
                this.f95094a = context;
                this.f95095b = bVar;
                this.f95096c = webView;
            }

            @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
            public final void a(View view, KeyDescObj keyDescObj) {
                if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 48264, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (!com.max.hbcommon.utils.c.u(keyDescObj.getProtocol())) {
                    com.max.xiaoheihe.base.router.b.j0(this.f95094a, keyDescObj.getProtocol());
                }
                com.max.xiaoheihe.accelworld.j.e("pickerSelectedCallback", this.f95095b.b(), new C0900a(keyDescObj), new b(keyDescObj, this.f95096c), null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        o(Activity activity, Context context, List<? extends KeyDescObj> list, Ref.BooleanRef booleanRef, WebProtocolObj webProtocolObj, b bVar, WebView webView) {
            this.f95087b = activity;
            this.f95088c = context;
            this.f95089d = list;
            this.f95090e = booleanRef;
            this.f95091f = webProtocolObj;
            this.f95092g = bVar;
            this.f95093h = webView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48263, new Class[0], Void.TYPE).isSupported || this.f95087b.isFinishing()) {
                return;
            }
            Context context = this.f95088c;
            List<KeyDescObj> list = this.f95089d;
            kotlin.jvm.internal.f0.n(list, "null cannot be cast to non-null type java.util.ArrayList<com.max.hbcommon.bean.KeyDescObj?>{ kotlin.collections.TypeAliasesKt.ArrayList<com.max.hbcommon.bean.KeyDescObj?> }");
            HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(context, R.style.FullScreenDialog, (ArrayList) list, false, this.f95090e.f124884b, true);
            heyBoxPopupMenu.Y(true);
            String strValueOf = this.f95091f.valueOf("bg_color");
            heyBoxPopupMenu.setTitle(this.f95091f.valueOf("title"));
            if (strValueOf != null) {
                heyBoxPopupMenu.V(true);
                heyBoxPopupMenu.M(Color.parseColor(strValueOf));
            }
            heyBoxPopupMenu.R(new a(this.f95088c, this.f95092g, this.f95093h));
            heyBoxPopupMenu.show();
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class o0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f95100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f95101c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Dialog f95102d;

        /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f95103b;

            a(Context context) {
                this.f95103b = context;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48313, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                ((Activity) this.f95103b).finish();
            }
        }

        o0(boolean z10, Context context, Dialog dialog) {
            this.f95100b = z10;
            this.f95101c = context;
            this.f95102d = dialog;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@dl.e View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48312, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!this.f95100b) {
                Context context = this.f95101c;
                if (context instanceof Activity) {
                    new Handler().postDelayed(new a(context), 300L);
                }
            }
            Dialog dialog = this.f95102d;
            if (dialog == null || !dialog.isShowing()) {
                return;
            }
            this.f95102d.dismiss();
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class p implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f95104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WebProtocolObj f95105c;

        p(Context context, WebProtocolObj webProtocolObj) {
            this.f95104b = context;
            this.f95105c = webProtocolObj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48269, new Class[0], Void.TYPE).isSupported && ((WebActionActivity) this.f95104b).isActive()) {
                ((WebActionActivity) this.f95104b).X2(this.f95105c);
            }
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class p0 implements DialogInterface.OnCancelListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f95106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f95107c;

        p0(boolean z10, Context context) {
            this.f95106b = z10;
            this.f95107c = context;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(@dl.e DialogInterface dialogInterface) {
            if (PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, 48314, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!this.f95106b) {
                Context context = this.f95107c;
                if (context instanceof Activity) {
                    ((Activity) context).finish();
                }
            }
            if (dialogInterface != null) {
                com.max.hbcommon.view.a aVar = (com.max.hbcommon.view.a) dialogInterface;
                if (aVar.isShowing()) {
                    aVar.dismiss();
                }
            }
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class q implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebProtocolObj f95138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HeyboxWebProtocolHandler f95139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f95140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ WebView f95141d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.module.webview.t f95142e;

        q(WebProtocolObj webProtocolObj, HeyboxWebProtocolHandler heyboxWebProtocolHandler, Context context, WebView webView, com.max.xiaoheihe.module.webview.t tVar) {
            this.f95138a = webProtocolObj;
            this.f95139b = heyboxWebProtocolHandler;
            this.f95140c = context;
            this.f95141d = webView;
            this.f95142e = tVar;
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 48258, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(dialog, "dialog");
            dialog.dismiss();
            WebProtocolObj webProtocolObj = this.f95138a;
            if (webProtocolObj != null) {
                this.f95139b.C(this.f95140c, this.f95141d, webProtocolObj, this.f95142e);
            }
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 48257, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(dialog, "dialog");
            dialog.dismiss();
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class r implements com.max.hbimage.b.r {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f95144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WebView f95145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ WebProtocolObj f95146d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.module.webview.t f95147e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f95148f;

        r(Context context, WebView webView, WebProtocolObj webProtocolObj, com.max.xiaoheihe.module.webview.t tVar, String str) {
            this.f95144b = context;
            this.f95145c = webView;
            this.f95146d = webProtocolObj;
            this.f95147e = tVar;
            this.f95148f = str;
        }

        @Override // com.max.hbimage.b.r
        public final void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48272, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            HeyboxWebProtocolHandler.this.G((FragmentActivity) this.f95144b, this.f95145c, this.f95146d, this.f95147e, this.f95148f);
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class s implements com.max.xiaoheihe.utils.l0.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f95149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebView f95150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.module.webview.t f95151c;

        s(String str, WebView webView, com.max.xiaoheihe.module.webview.t tVar) {
            this.f95149a = str;
            this.f95150b = webView;
            this.f95151c = tVar;
        }

        @Override // com.max.xiaoheihe.utils.l0.g
        public final void a() {
            String str;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48273, new Class[0], Void.TYPE).isSupported || (str = this.f95149a) == null) {
                return;
            }
            com.max.xiaoheihe.utils.l0.k(true, str, this.f95150b, null, this.f95151c);
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class t implements ErrorHandleInterceptor.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<String> f95152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebView f95153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.module.webview.t f95154c;

        t(Ref.ObjectRef<String> objectRef, WebView webView, com.max.xiaoheihe.module.webview.t tVar) {
            this.f95152a = objectRef;
            this.f95153b = webView;
            this.f95154c = tVar;
        }

        @Override // com.max.hbcommon.network.interceptor.ErrorHandleInterceptor.b
        public void a() {
        }

        @Override // com.max.hbcommon.network.interceptor.ErrorHandleInterceptor.b
        public void b(@dl.d String code, @dl.e String str) {
            if (PatchProxy.proxy(new Object[]{code, str}, this, changeQuickRedirect, false, 48274, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(code, "code");
            String strA = HeyboxWebProtocolHandler.f95003a.a(this.f95152a.f124891b, null);
            if (strA == null) {
                return;
            }
            com.max.xiaoheihe.utils.l0.k(true, strA, this.f95153b, null, this.f95154c);
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class u implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebProtocolObj f95155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HeyboxWebProtocolHandler f95156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f95157c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ WebView f95158d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.module.webview.t f95159e;

        u(WebProtocolObj webProtocolObj, HeyboxWebProtocolHandler heyboxWebProtocolHandler, Context context, WebView webView, com.max.xiaoheihe.module.webview.t tVar) {
            this.f95155a = webProtocolObj;
            this.f95156b = heyboxWebProtocolHandler;
            this.f95157c = context;
            this.f95158d = webView;
            this.f95159e = tVar;
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 48271, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(dialog, "dialog");
            dialog.dismiss();
            WebProtocolObj webProtocolObj = this.f95155a;
            if (webProtocolObj != null) {
                this.f95156b.C(this.f95157c, this.f95158d, webProtocolObj, this.f95159e);
            }
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 48270, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(dialog, "dialog");
            dialog.dismiss();
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class v implements qb.b.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<String> f95160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebView f95161b;

        v(Ref.ObjectRef<String> objectRef, WebView webView) {
            this.f95160a = objectRef;
            this.f95161b = webView;
        }

        @Override // qb.b.a
        public void a() {
            String str;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48277, new Class[0], Void.TYPE).isSupported || (str = this.f95160a.f124891b) == null) {
                return;
            }
            com.max.xiaoheihe.utils.l0.j(true, str, this.f95161b);
        }

        @Override // qb.b.a
        public void onCanceled() {
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class w implements ReportReasonFragment.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f95162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebProtocolObj f95163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WebView f95164c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.module.webview.t f95165d;

        w(String str, WebProtocolObj webProtocolObj, WebView webView, com.max.xiaoheihe.module.webview.t tVar) {
            this.f95162a = str;
            this.f95163b = webProtocolObj;
            this.f95164c = webView;
            this.f95165d = tVar;
        }

        @Override // com.max.xiaoheihe.module.bbs.ReportReasonFragment.b
        public void a(@dl.d String report_reason, @dl.e String str) {
            if (PatchProxy.proxy(new Object[]{report_reason, str}, this, changeQuickRedirect, false, 48281, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(report_reason, "report_reason");
            com.max.xiaoheihe.module.bbs.utils.b.T(this.f95162a, report_reason, str, null);
            com.max.xiaoheihe.utils.l0.k(!kotlin.jvm.internal.f0.g("false", this.f95163b.valueOf("jsInWeb")), HeyboxWebProtocolHandler.f95003a.a(this.f95163b.valueOf("jsCallbackFunc"), null), this.f95164c, null, this.f95165d);
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class x implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebProtocolObj f95166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HeyboxWebProtocolHandler f95167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f95168c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ WebView f95169d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.module.webview.t f95170e;

        x(WebProtocolObj webProtocolObj, HeyboxWebProtocolHandler heyboxWebProtocolHandler, Context context, WebView webView, com.max.xiaoheihe.module.webview.t tVar) {
            this.f95166a = webProtocolObj;
            this.f95167b = heyboxWebProtocolHandler;
            this.f95168c = context;
            this.f95169d = webView;
            this.f95170e = tVar;
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 48276, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(dialog, "dialog");
            dialog.dismiss();
            WebProtocolObj webProtocolObj = this.f95166a;
            if (webProtocolObj != null) {
                this.f95167b.C(this.f95168c, this.f95169d, webProtocolObj, this.f95170e);
            }
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 48275, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(dialog, "dialog");
            dialog.dismiss();
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class y implements com.max.xiaoheihe.utils.l0.j {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f95171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebProtocolObj f95172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f95173c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ WebView f95174d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.module.webview.t f95175e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f95176f;

        /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
        public static final class a implements com.max.xiaoheihe.module.webview.t.b {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ JsonObject f95177a;

            a(JsonObject jsonObject) {
                this.f95177a = jsonObject;
            }

            @Override // com.max.xiaoheihe.module.webview.t.b
            public final void a(@dl.d JsonObject message) {
                if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 48291, new Class[]{JsonObject.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(message, "message");
                message.add("data", this.f95177a);
            }
        }

        /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
        public static final class b implements com.max.xiaoheihe.module.webview.t.b {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ JsonObject f95178a;

            b(JsonObject jsonObject) {
                this.f95178a = jsonObject;
            }

            @Override // com.max.xiaoheihe.module.webview.t.b
            public final void a(@dl.d JsonObject message) {
                if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 48292, new Class[]{JsonObject.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(message, "message");
                message.add("data", this.f95178a);
            }
        }

        y(String str, WebProtocolObj webProtocolObj, String str2, WebView webView, com.max.xiaoheihe.module.webview.t tVar, Context context) {
            this.f95171a = str;
            this.f95172b = webProtocolObj;
            this.f95173c = str2;
            this.f95174d = webView;
            this.f95175e = tVar;
            this.f95176f = context;
        }

        @Override // com.max.xiaoheihe.utils.l0.j
        public void a(@dl.e Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 48289, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!com.max.hbcommon.utils.c.u(this.f95171a)) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("id", this.f95172b.valueOf("id"));
                jsonObject.add("content", (JsonObject) com.max.hbutils.utils.k.a(com.max.hbutils.utils.k.p(result), JsonObject.class));
                com.max.xiaoheihe.utils.l0.k(true ^ kotlin.jvm.internal.f0.g("false", this.f95173c), HeyboxWebProtocolHandler.f95003a.a(this.f95171a, jsonObject.toString()), this.f95174d, new b(jsonObject), this.f95175e);
            }
            if (com.max.hbcommon.utils.c.u(this.f95172b.valueOf("success"))) {
                return;
            }
            Context context = this.f95176f;
            String strValueOf = this.f95172b.valueOf("success");
            kotlin.jvm.internal.f0.m(strValueOf);
            com.max.xiaoheihe.base.router.b.l0(context, strValueOf, this.f95174d, null, null);
        }

        @Override // com.max.xiaoheihe.utils.l0.j
        public void b() {
        }

        @Override // com.max.xiaoheihe.utils.l0.j
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 48290, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("id", this.f95172b.valueOf("id"));
            jsonObject.addProperty("error", e10.getMessage());
            if (e10 instanceof ApiException) {
                jsonObject.addProperty("cat", "hb_server");
            }
            com.max.heybox.hblog.g.f74531b.v("sendRequestV2 onError: " + kotlin.jvm.internal.n0.d(e10.getClass()).F() + ' ' + com.max.hbutils.utils.k.p(jsonObject));
            com.max.xiaoheihe.utils.l0.k(true ^ kotlin.jvm.internal.f0.g("false", this.f95173c), HeyboxWebProtocolHandler.f95003a.a(this.f95171a, jsonObject.toString()), this.f95174d, new a(jsonObject), this.f95175e);
            com.max.xiaoheihe.module.webview.t tVar = this.f95175e;
            if (tVar != null) {
                tVar.A1(this.f95172b, e10);
                return;
            }
            if (com.max.hbcommon.utils.c.x(this.f95172b.valueOf("show_toast")) && !com.max.hbcommon.utils.c.u(e10.getMessage())) {
                com.max.hbutils.utils.c.f(e10.getMessage());
            }
            if (com.max.hbcommon.utils.c.u(this.f95172b.valueOf(z5.f.f141859j))) {
                return;
            }
            Context context = this.f95176f;
            String strValueOf = this.f95172b.valueOf(z5.f.f141859j);
            kotlin.jvm.internal.f0.m(strValueOf);
            com.max.xiaoheihe.base.router.b.l0(context, strValueOf, this.f95174d, null, null);
        }
    }

    /* JADX INFO: compiled from: HeyboxWebProtocolHandler.kt */
    public static final class z implements r1.y0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        z() {
        }

        @Override // com.max.xiaoheihe.module.game.r1.y0
        public void a() {
        }

        @Override // com.max.xiaoheihe.module.game.r1.y0
        public void b() {
        }
    }

    static {
        a aVar = new a(null);
        f95003a = aVar;
        f95005c = aVar.getClass().getSimpleName();
        f95007e = new String[]{"acceptInvitation"};
    }

    private final void A(Context context, WebProtocolObj webProtocolObj, String str, String str2, String str3, HashMap<String, String> map, ArrayList<TagJsObj> arrayList, String str4) {
        if (PatchProxy.proxy(new Object[]{context, webProtocolObj, str, str2, str3, map, arrayList, str4}, this, changeQuickRedirect, false, 48210, new Class[]{Context.class, WebProtocolObj.class, String.class, String.class, String.class, HashMap.class, ArrayList.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (kotlin.jvm.internal.f0.g("openWindowAlert", webProtocolObj.getProtocol_type())) {
            x(context, webProtocolObj, str, str2, str3, map, arrayList, str4);
        } else if (kotlin.jvm.internal.f0.g("openGameWindow", webProtocolObj.getProtocol_type())) {
            z(context, webProtocolObj, str, str2, str3, str4);
        } else {
            y(context, webProtocolObj, str, str2, str3, map, arrayList, str4);
        }
    }

    static /* synthetic */ void B(HeyboxWebProtocolHandler heyboxWebProtocolHandler, Context context, WebProtocolObj webProtocolObj, String str, String str2, String str3, HashMap map, ArrayList arrayList, String str4, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{heyboxWebProtocolHandler, context, webProtocolObj, str, str2, str3, map, arrayList, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 48211, new Class[]{HeyboxWebProtocolHandler.class, Context.class, WebProtocolObj.class, String.class, String.class, String.class, HashMap.class, ArrayList.class, String.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        heyboxWebProtocolHandler.A(context, webProtocolObj, str, str2, str3, (i10 & 32) != 0 ? null : map, (i10 & 64) != 0 ? null : arrayList, (i10 & 128) != 0 ? null : str4);
    }

    private static final void D(CookieManager cookieManager, HeyboxWebProtocolHandler heyboxWebProtocolHandler, ArrayList<String> arrayList, String str) {
        if (PatchProxy.proxy(new Object[]{cookieManager, heyboxWebProtocolHandler, arrayList, str}, null, changeQuickRedirect, true, 48228, new Class[]{CookieManager.class, HeyboxWebProtocolHandler.class, ArrayList.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        String cookieManagerString = cookieManager.getCookie(str);
        if (com.max.hbcommon.utils.c.u(cookieManagerString)) {
            return;
        }
        String strS = heyboxWebProtocolHandler.s(str);
        kotlin.jvm.internal.f0.o(cookieManagerString, "cookieManagerString");
        for (String str2 : StringsKt__StringsKt.U4(cookieManagerString, new String[]{Constants.ACCEPT_TIME_SEPARATOR_SP}, false, 0, 6, null)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(";Path=");
            sb2.append(strS == null ? "/" : strS);
            arrayList.add(sb2.toString());
        }
    }

    private static final void E(String str, WebView webView, com.max.xiaoheihe.module.webview.t tVar, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, webView, tVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 48227, new Class[]{String.class, WebView.class, com.max.xiaoheihe.module.webview.t.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String strA = f95003a.a(str, z10 ? "1" : "0");
        if (strA == null) {
            return;
        }
        com.max.xiaoheihe.utils.l0.k(true, strA, webView, null, tVar);
    }

    private final void F(String str, WebView webView) {
        if (PatchProxy.proxy(new Object[]{str, webView}, this, changeQuickRedirect, false, 48223, new Class[]{String.class, WebView.class}, Void.TYPE).isSupported) {
            return;
        }
        v0 v0Var = v0.f124986a;
        String str2 = String.format("javascript:clientDateCallback(%s)", Arrays.copyOf(new Object[]{str}, 1));
        kotlin.jvm.internal.f0.o(str2, "format(format, *args)");
        webView.loadUrl(str2);
    }

    private final void H(b bVar) {
        String strValueOf;
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 48222, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        Context contextA = bVar.a();
        WebView webViewD = bVar.d();
        if (webViewD == null || (strValueOf = bVar.c().valueOf("mode")) == null) {
            return;
        }
        int i10 = Integer.parseInt(strValueOf);
        String strValueOf2 = bVar.c().valueOf(org.apache.tools.ant.types.selectors.o.f136589m);
        if (strValueOf2 == null) {
            return;
        }
        long j10 = Long.parseLong(strValueOf2);
        String strValueOf3 = bVar.c().valueOf(org.apache.tools.ant.types.selectors.o.f136588l);
        if (strValueOf3 == null) {
            return;
        }
        long j11 = Long.parseLong(strValueOf3);
        String strValueOf4 = bVar.c().valueOf(AddressListActivity.N);
        View viewInflate = LayoutInflater.from(contextA).inflate(R.layout.dialog_date_time_picker, (ViewGroup) null, false);
        DatePicker datePicker = (DatePicker) viewInflate.findViewById(R.id.dp_date);
        long j12 = 1000;
        datePicker.setMaxDate(j10 * j12);
        datePicker.setMinDate(j11 * j12);
        if (strValueOf4 != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date(Long.parseLong(strValueOf4) * j12));
            datePicker.updateDate(calendar.get(1), calendar.get(2), calendar.get(5));
        }
        TimePicker timePicker = (TimePicker) viewInflate.findViewById(R.id.tp_time);
        if (i10 == 0) {
            datePicker.setVisibility(8);
        } else if (i10 == 1) {
            timePicker.setVisibility(8);
        }
        new com.max.hbcommon.view.a.f(contextA).i(viewInflate).u("确定", new i0(datePicker, timePicker, i10, bVar, webViewD)).d().show();
    }

    private final void I(Context context, com.max.xiaoheihe.utils.l0.g gVar, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, gVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 48218, new Class[]{Context.class, com.max.xiaoheihe.utils.l0.g.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (context.getResources().getConfiguration().orientation == 1) {
            com.max.xiaoheihe.utils.i0.C(SwitchDetailActivity.P, gVar);
        } else {
            J(context, gVar, z10);
        }
    }

    private final void J(Context context, com.max.xiaoheihe.utils.l0.g gVar, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, gVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 48219, new Class[]{Context.class, com.max.xiaoheihe.utils.l0.g.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.dialog_real_name_auth_landscape, (ViewGroup) null, false);
        com.max.hbcommon.view.a aVarD = new com.max.hbcommon.view.a.f(context).D(viewInflate).p(new p0(z10, context)).d();
        View viewFindViewById = viewInflate.findViewById(R.id.et_name);
        kotlin.jvm.internal.f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText = (EditText) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.et_id_card);
        kotlin.jvm.internal.f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText2 = (EditText) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.vg_checkbox);
        kotlin.jvm.internal.f0.n(viewFindViewById3, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewFindViewById4 = viewInflate.findViewById(R.id.cb_agreement);
        kotlin.jvm.internal.f0.n(viewFindViewById4, "null cannot be cast to non-null type android.widget.CheckBox");
        CheckBox checkBox = (CheckBox) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.tv_confirm);
        kotlin.jvm.internal.f0.n(viewFindViewById5, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(R.id.tv_agreement);
        kotlin.jvm.internal.f0.n(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById6;
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.rl_container);
        ((ViewGroup) viewFindViewById3).setOnClickListener(new j0(checkBox));
        checkBox.setOnCheckedChangeListener(new k0(textView));
        SpannableString spannableString = new SpannableString("我已阅读并同意《用户协议》、《隐私政策》");
        spannableString.setSpan(new l0(context, androidx.core.content.res.i.e(context.getResources(), R.color.click_blue, null)), 7, 13, 33);
        spannableString.setSpan(new m0(context, context.getResources().getColor(R.color.click_blue)), 14, 20, 33);
        textView2.setText(spannableString);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setOnClickListener(new n0(context, editText, editText2, aVarD, gVar));
        relativeLayout.setOnClickListener(new o0(z10, context, aVarD));
        kotlin.jvm.internal.f0.m(aVarD);
        aVarD.show();
    }

    public static final /* synthetic */ void b(HeyboxWebProtocolHandler heyboxWebProtocolHandler, WebView webView, String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{heyboxWebProtocolHandler, webView, str, str2, str3}, null, changeQuickRedirect, true, 48232, new Class[]{HeyboxWebProtocolHandler.class, WebView.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        heyboxWebProtocolHandler.q(webView, str, str2, str3);
    }

    public static final /* synthetic */ void e(HeyboxWebProtocolHandler heyboxWebProtocolHandler, com.sankuai.waimai.router.core.i iVar, com.sankuai.waimai.router.core.f fVar) {
        if (PatchProxy.proxy(new Object[]{heyboxWebProtocolHandler, iVar, fVar}, null, changeQuickRedirect, true, 48230, new Class[]{HeyboxWebProtocolHandler.class, com.sankuai.waimai.router.core.i.class, com.sankuai.waimai.router.core.f.class}, Void.TYPE).isSupported) {
            return;
        }
        heyboxWebProtocolHandler.w(iVar, fVar);
    }

    public static final /* synthetic */ void f(HeyboxWebProtocolHandler heyboxWebProtocolHandler, Context context, WebProtocolObj webProtocolObj, String str, String str2, String str3, HashMap map, ArrayList arrayList, String str4) {
        if (PatchProxy.proxy(new Object[]{heyboxWebProtocolHandler, context, webProtocolObj, str, str2, str3, map, arrayList, str4}, null, changeQuickRedirect, true, 48231, new Class[]{HeyboxWebProtocolHandler.class, Context.class, WebProtocolObj.class, String.class, String.class, String.class, HashMap.class, ArrayList.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        heyboxWebProtocolHandler.A(context, webProtocolObj, str, str2, str3, map, arrayList, str4);
    }

    public static final /* synthetic */ void g(String str, WebView webView, com.max.xiaoheihe.module.webview.t tVar, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, webView, tVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 48233, new Class[]{String.class, WebView.class, com.max.xiaoheihe.module.webview.t.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        E(str, webView, tVar, z10);
    }

    private final void i(Intent intent, WebProtocolObj webProtocolObj, String str, String str2, String str3, HashMap<String, String> map, ArrayList<TagJsObj> arrayList) {
        if (PatchProxy.proxy(new Object[]{intent, webProtocolObj, str, str2, str3, map, arrayList}, this, changeQuickRedirect, false, 48215, new Class[]{Intent.class, WebProtocolObj.class, String.class, String.class, String.class, HashMap.class, ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        intent.putExtra("web_protocol", webProtocolObj);
        if (!com.max.hbcommon.utils.c.v(str, str2)) {
            intent.putExtra("host", str);
            intent.putExtra(HeyboxMicFragment.f93763y, str2);
        }
        if (!com.max.hbcommon.utils.c.u(str3)) {
            intent.putExtra("message", str3);
        }
        if (map != null && arrayList != null) {
            intent.putExtra("hosts", map);
            intent.putExtra(WebviewFragment.K4, arrayList);
        }
        intent.putExtra("active_js", true);
    }

    static /* synthetic */ void j(HeyboxWebProtocolHandler heyboxWebProtocolHandler, Intent intent, WebProtocolObj webProtocolObj, String str, String str2, String str3, HashMap map, ArrayList arrayList, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{heyboxWebProtocolHandler, intent, webProtocolObj, str, str2, str3, map, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, 48216, new Class[]{HeyboxWebProtocolHandler.class, Intent.class, WebProtocolObj.class, String.class, String.class, String.class, HashMap.class, ArrayList.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        heyboxWebProtocolHandler.i(intent, webProtocolObj, str, str2, str3, (i10 & 32) != 0 ? null : map, (i10 & 64) != 0 ? null : arrayList);
    }

    @dl.e
    @xh.m
    public static final String m(@dl.e String str, @dl.e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 48229, new Class[]{String.class, String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : f95003a.a(str, str2);
    }

    private final void n(WebProtocolObj webProtocolObj) {
        if (PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 48204, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported) {
            return;
        }
        final String strValueOf = webProtocolObj.valueOf("idea_id");
        if (strValueOf != null) {
            BottomBarManager.f89397a.h(strValueOf);
        }
        if (MMKV.mmkvWithID(ad.b.f1220a).containsKey(strValueOf) || strValueOf == null) {
            return;
        }
        com.max.hbmmkv.c.a(ad.b.f1220a, new yh.l<com.max.hbmmkv.b, b2>() { // from class: com.max.xiaoheihe.router.protocol.HeyboxWebProtocolHandler$doCloseBottomADBar$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d com.max.hbmmkv.b withMMKV) {
                if (PatchProxy.proxy(new Object[]{withMMKV}, this, changeQuickRedirect, false, 48239, new Class[]{com.max.hbmmkv.b.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(withMMKV, "$this$withMMKV");
                withMMKV.i(strValueOf, true, true);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(com.max.hbmmkv.b bVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 48240, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(bVar);
                return b2.f124493a;
            }
        });
    }

    private final void o(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 48225, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        Context contextA = bVar.a();
        WebActionActivity webActionActivity = contextA instanceof WebActionActivity ? (WebActionActivity) contextA : null;
        if (webActionActivity == null) {
            return;
        }
        webActionActivity.runOnUiThread(new d(webActionActivity, bVar.c()));
    }

    private final void p(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48224, new Class[]{String.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
    }

    @SuppressLint({"CheckResult"})
    private final void q(WebView webView, String str, String str2, String str3) {
        io.reactivex.z<Result> zVarI5;
        io.reactivex.z<Result> zVarA4;
        if (PatchProxy.proxy(new Object[]{webView, str, str2, str3}, this, changeQuickRedirect, false, 48217, new Class[]{WebView.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        io.reactivex.z<Result> zVarNb = null;
        if (kotlin.text.u.L1("unfollowing", str, true)) {
            zVarNb = com.max.xiaoheihe.network.i.a().x3(str3);
        } else if (kotlin.text.u.L1("following", str, true)) {
            zVarNb = com.max.xiaoheihe.network.i.a().cb(str3);
        } else if (kotlin.text.u.L1(GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING, str, true)) {
            zVarNb = com.max.xiaoheihe.network.i.a().l8(str3);
        } else if (kotlin.text.u.L1(GameObj.SUBSCRIBE_STATE_SUBSCRIBING, str, true)) {
            zVarNb = com.max.xiaoheihe.network.i.a().nb(str3, str2);
        }
        if (zVarNb == null || (zVarI5 = zVarNb.I5(io.reactivex.schedulers.b.d())) == null || (zVarA4 = zVarI5.a4(io.reactivex.android.schedulers.a.c())) == null) {
            return;
        }
    }

    private final String s(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48226, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            List<String> pathSegments = Uri.parse(str).getPathSegments();
            kotlin.jvm.internal.f0.o(pathSegments, "pathSegments");
            if (!(true ^ pathSegments.isEmpty())) {
                return null;
            }
            return IOUtils.DIR_SEPARATOR_UNIX + pathSegments.get(0);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private final String t(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48220, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        v0 v0Var = v0.f124986a;
        String str2 = String.format("HeyboxGame.emit(\"real_name_authentication\", \"%s\");", Arrays.copyOf(new Object[]{str}, 1));
        kotlin.jvm.internal.f0.o(str2, "format(format, *args)");
        return str2;
    }

    private final String u(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48221, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        v0 v0Var = v0.f124986a;
        String str2 = String.format("HeyboxGame.emit(\"get_user_agent\", %s);", Arrays.copyOf(new Object[]{str}, 1));
        kotlin.jvm.internal.f0.o(str2, "format(format, *args)");
        return str2;
    }

    private final List<WebProtocolObj> v(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48209, new Class[]{String.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        List<WebProtocolObj> listB = com.max.hbutils.utils.k.b(str, WebProtocolObj.class);
        kotlin.jvm.internal.f0.o(listB, "deserializeList(listStr,…bProtocolObj::class.java)");
        return listB;
    }

    private final void w(com.sankuai.waimai.router.core.i iVar, com.sankuai.waimai.router.core.f fVar) {
        if (PatchProxy.proxy(new Object[]{iVar, fVar}, this, changeQuickRedirect, false, 48201, new Class[]{com.sankuai.waimai.router.core.i.class, com.sankuai.waimai.router.core.f.class}, Void.TYPE).isSupported) {
            return;
        }
        Context contextB = iVar.b();
        kotlin.jvm.internal.f0.o(contextB, "request.context");
        WebProtocolObj webProtocolObjE0 = com.max.xiaoheihe.utils.l0.e0(iVar.m().toString());
        if (webProtocolObjE0 == null) {
            return;
        }
        com.max.xiaoheihe.module.webview.t tVar = (com.max.xiaoheihe.module.webview.t) iVar.d(com.max.xiaoheihe.module.webview.t.class, com.max.xiaoheihe.router.c.f94905k);
        WebView webView = (WebView) iVar.d(WebView.class, com.max.xiaoheihe.router.c.f94907m);
        com.max.heybox.hblog.g.f74531b.M("WebProtocolHandler, request.uri = " + iVar.m());
        iVar.s(com.max.xiaoheihe.router.c.f94908n, C(contextB, webView, webProtocolObjE0, tVar));
    }

    private final void x(Context context, WebProtocolObj webProtocolObj, String str, String str2, String str3, HashMap<String, String> map, ArrayList<TagJsObj> arrayList, String str4) {
        if (PatchProxy.proxy(new Object[]{context, webProtocolObj, str, str2, str3, map, arrayList, str4}, this, changeQuickRedirect, false, 48214, new Class[]{Context.class, WebProtocolObj.class, String.class, String.class, String.class, HashMap.class, ArrayList.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) TransparentWebActionActivity.class);
        i(intent, webProtocolObj, str, str2, str3, map, arrayList);
        intent.putExtra(com.max.xiaoheihe.module.proxy.a.f91563d, str4);
        intent.putExtra(WebviewFragment.T4, true);
        com.max.xiaoheihe.utils.l0.x0(context, intent, 111);
    }

    private final void y(Context context, WebProtocolObj webProtocolObj, String str, String str2, String str3, HashMap<String, String> map, ArrayList<TagJsObj> arrayList, String str4) {
        if (PatchProxy.proxy(new Object[]{context, webProtocolObj, str, str2, str3, map, arrayList, str4}, this, changeQuickRedirect, false, 48213, new Class[]{Context.class, WebProtocolObj.class, String.class, String.class, String.class, HashMap.class, ArrayList.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.x(webProtocolObj.valueOf("bottom_sheet")) && (context instanceof FragmentActivity)) {
            WebFragmentDialog.f94313n.f(webProtocolObj.getWebview().getUrl()).show(((FragmentActivity) context).getSupportFragmentManager(), "WebFragmentDialog");
            return;
        }
        Intent intent = com.max.xiaoheihe.utils.l0.d0(context, kotlin.jvm.internal.f0.g("1", webProtocolObj.valueOf(ob.b.f132259k)));
        kotlin.jvm.internal.f0.o(intent, "intent");
        i(intent, webProtocolObj, str, str2, str3, map, arrayList);
        intent.putExtra(com.max.xiaoheihe.module.proxy.a.f91563d, str4);
        com.max.xiaoheihe.utils.l0.x0(context, intent, 111);
    }

    private final void z(Context context, WebProtocolObj webProtocolObj, String str, String str2, String str3, String str4) {
        if (PatchProxy.proxy(new Object[]{context, webProtocolObj, str, str2, str3, str4}, this, changeQuickRedirect, false, 48212, new Class[]{Context.class, WebProtocolObj.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) WebActionActivity.class);
        j(this, intent, webProtocolObj, str, str2, str3, null, null, 96, null);
        intent.putExtra("game_window", true);
        intent.putExtra("game_name", webProtocolObj.valueOf("game"));
        intent.putExtra(com.max.xiaoheihe.module.proxy.a.f91563d, str4);
        if (!com.max.xiaoheihe.utils.l0.o().contains(webProtocolObj.valueOf("game"))) {
            if (context instanceof BaseActivity) {
                ((BaseActivity) context).V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Z5(null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g(context, intent)));
            }
        } else {
            com.max.xiaoheihe.utils.l0.x0(context, intent, 111);
            if (context instanceof Activity) {
                ((Activity) context).overridePendingTransition(R.anim.activity_bottom_in, R.anim.activity_stay);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:1557:0x2600  */
    /* JADX WARN: Code duplicated, block: B:903:0x16b9  */
    /* JADX WARN: Code restructure failed: missing block: B:1006:0x198b, code lost:
    
        if (r1.equals(com.max.xiaoheihe.bean.WebProtocolObj.PROTOCOL_TYPE_SET_TENCENT_CAPTCHA_SIZE) == false) goto L1557;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1008:0x198f, code lost:
    
        if (r40 == null) goto L1010;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1009:0x1991, code lost:
    
        r40.z2(r39);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1010:0x1994, code lost:
    
        r0 = kotlin.b2.f124493a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1034:0x1a11, code lost:
    
        if (r1.equals("openH5PayWindow") == false) goto L1557;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1037:0x1a1c, code lost:
    
        if (r1.equals("openGameWindow") == false) goto L1557;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1040:0x1a2a, code lost:
    
        if (kotlin.jvm.internal.f0.g(r39.getProtocol_type(), "openGameStatWindow") == false) goto L1042;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1041:0x1a2c, code lost:
    
        r39.setValue(com.max.xiaoheihe.module.webview.WebviewFragment.P4, "1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:1043:0x1a35, code lost:
    
        if (r39.getWebview() == null) goto L1047;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1045:0x1a43, code lost:
    
        if (com.max.hbcommon.utils.c.u(r39.getWebview().getUrl()) != false) goto L1047;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1046:0x1a45, code lost:
    
        r6 = r39.getWebview().getUrl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:1047:0x1a4e, code lost:
    
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1049:0x1a53, code lost:
    
        if (com.max.xiaoheihe.utils.l0.o0(r37, r6, r39) != false) goto L1056;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1051:0x1a59, code lost:
    
        if (r39.getWebview() == null) goto L1055;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1053:0x1a63, code lost:
    
        if (r39.getWebview().isProxy() == false) goto L1055;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1054:0x1a65, code lost:
    
        com.max.xiaoheihe.network.i.a().i9(r6).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new com.max.xiaoheihe.router.protocol.HeyboxWebProtocolHandler$process$5(r37, r39, r6, r36));
     */
    /* JADX WARN: Code restructure failed: missing block: B:1055:0x1a86, code lost:
    
        B(r36, r37, r39, null, null, null, null, null, null, 224, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1056:0x1a9a, code lost:
    
        r0 = kotlin.b2.f124493a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0700, code lost:
    
        if (r1.equals(com.max.xiaoheihe.bean.WebProtocolObj.PROTOCOL_TYPE_TENCENT_CAPTCHA_CALLBACK) == false) goto L1557;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x070b, code lost:
    
        if (r1.equals(com.max.xiaoheihe.bean.WebProtocolObj.PROTOCOL_TYPE_OPEN_PURCHASE_VIEW) == false) goto L1557;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0920, code lost:
    
        if (r1.equals(com.max.xiaoheihe.bean.WebProtocolObj.PROTOCOL_TYPE_OPEN_ADDRESS_LIST) == false) goto L1557;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0985, code lost:
    
        if (r1.equals(com.max.xiaoheihe.bean.WebProtocolObj.PROTOCOL_TYPE_STEAM_CALLBACK) == false) goto L1557;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0989, code lost:
    
        r13 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01a5, code lost:
    
        if (r1.equals("openGameStatWindow") == false) goto L1557;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x106f, code lost:
    
        if (r1.equals("openWindow") == false) goto L1557;
     */
    /* JADX WARN: Code restructure failed: missing block: B:858:0x15a8, code lost:
    
        if (r1.equals("openWindowAlert") == false) goto L1557;
     */
    /* JADX WARN: Code restructure failed: missing block: B:860:0x15ac, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v29, types: [T, java.lang.String] */
    @dl.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String C(@dl.d final android.content.Context r37, @dl.e final android.webkit.WebView r38, @dl.d final com.max.xiaoheihe.bean.WebProtocolObj r39, @dl.e final com.max.xiaoheihe.module.webview.t r40) {
        /*
            Method dump skipped, instruction units count: 10454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.max.xiaoheihe.router.protocol.HeyboxWebProtocolHandler.C(android.content.Context, android.webkit.WebView, com.max.xiaoheihe.bean.WebProtocolObj, com.max.xiaoheihe.module.webview.t):java.lang.String");
    }

    public final void G(@dl.d FragmentActivity context, @dl.e WebView webView, @dl.d WebProtocolObj webProtocolObj, @dl.e com.max.xiaoheihe.module.webview.t tVar, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{context, webView, webProtocolObj, tVar, str}, this, changeQuickRedirect, false, 48207, new Class[]{FragmentActivity.class, WebView.class, WebProtocolObj.class, com.max.xiaoheihe.module.webview.t.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(webProtocolObj, "webProtocolObj");
        String strValueOf = webProtocolObj.valueOf("highlight_text");
        String strValueOf2 = webProtocolObj.valueOf("title");
        if (strValueOf2 == null) {
            strValueOf2 = "";
        }
        String strValueOf3 = webProtocolObj.valueOf(SocialConstants.PARAM_APP_DESC);
        if (strValueOf3 == null) {
            strValueOf3 = "";
        }
        SpannableString spannableString = new SpannableString(strValueOf3);
        if (strValueOf != null) {
            int iS3 = StringsKt__StringsKt.s3(spannableString, strValueOf, 0, false, 6, null);
            spannableString.setSpan(new ForegroundColorSpan(com.max.hbcommon.utils.l.a(R.color.text_primary_1_color)), iS3, strValueOf.length() + iS3, 33);
        }
        WebProtocolObj webProtocolObj2 = (WebProtocolObj) webProtocolObj.objectOf("btn_protocol", WebProtocolObj.class);
        com.max.hbcommon.component.bottomsheet.a aVarL = new com.max.hbcommon.component.bottomsheet.a().o(webProtocolObj.valueOf("icon_url")).i(webProtocolObj.valueOf("small_icon_url")).k(false).x(com.max.hbcommon.utils.c.x(webProtocolObj.valueOf("show_close"))).z(strValueOf2).l(spannableString);
        String strValueOf4 = webProtocolObj.valueOf("btn_text");
        com.max.hbcommon.component.bottomsheet.q qVarA = aVarL.v(strValueOf4 == null ? "" : strValueOf4, true, new h0(webProtocolObj2, this, context, webView, tVar)).a();
        qVarA.y4(new g0(str));
        qVarA.M3(context.getSupportFragmentManager(), "bottomsheet");
    }

    public final void K(@dl.d Context context) {
        Map<String, List<Cookie>> allCookiesWithHost;
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 48203, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        if (!ad.a.a(ad.a.f1217x, false) || (allCookiesWithHost = new ka.d(context).i()) == null) {
            return;
        }
        kotlin.jvm.internal.f0.o(allCookiesWithHost, "allCookiesWithHost");
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        for (Map.Entry<String, List<Cookie>> entry : allCookiesWithHost.entrySet()) {
            entry.getKey();
            List<Cookie> value = entry.getValue();
            if (!com.max.hbcommon.utils.c.w(value)) {
                for (Cookie cookie : value) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("https://");
                    sb2.append(cookie.domain());
                    String strPath = cookie.path();
                    if (strPath == null) {
                        strPath = "";
                    }
                    sb2.append(strPath);
                    cookieManager.setCookie(sb2.toString(), cookie.toString());
                }
            }
        }
        cookieManager.flush();
    }

    @Override // com.max.xiaoheihe.router.protocol.b
    public void a(@dl.d com.sankuai.waimai.router.core.i request, @dl.d com.sankuai.waimai.router.core.f callback) {
        if (PatchProxy.proxy(new Object[]{request, callback}, this, changeQuickRedirect, false, 48200, new Class[]{com.sankuai.waimai.router.core.i.class, com.sankuai.waimai.router.core.f.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(request, "request");
        kotlin.jvm.internal.f0.p(callback, "callback");
        w(request, callback);
    }

    public final void k(@dl.d Long[] ia2) {
        if (PatchProxy.proxy(new Object[]{ia2}, this, changeQuickRedirect, false, 48206, new Class[]{Long[].class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(ia2, "ia");
        int length = ia2.length;
        for (int i10 = 0; i10 < length; i10++) {
            int length2 = (ia2.length - i10) - 1;
            int i11 = 0;
            while (i11 < length2) {
                int i12 = i11 + 1;
                if (ia2[i11].longValue() > ia2[i12].longValue()) {
                    long jLongValue = ia2[i12].longValue();
                    ia2[i12] = ia2[i11];
                    ia2[i11] = Long.valueOf(jLongValue);
                }
                i11 = i12;
            }
        }
    }

    public final void l(int i10) {
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 48208, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && (com.max.hbutils.utils.e.b().a() instanceof BaseActivity)) {
            Activity activityA = com.max.hbutils.utils.e.b().a();
            kotlin.jvm.internal.f0.n(activityA, "null cannot be cast to non-null type com.max.hbcommon.base.BaseActivity");
            BaseActivity baseActivity = (BaseActivity) activityA;
            List<Fragment> listJ0 = baseActivity.getSupportFragmentManager().J0();
            kotlin.jvm.internal.f0.o(listJ0, "currentActivity.supportFragmentManager.fragments");
            WebviewFragment webviewFragment = null;
            if (!com.max.hbcommon.utils.c.w(listJ0)) {
                int size = listJ0.size();
                for (int i11 = 0; i11 < size; i11++) {
                    if (listJ0.get(i11) instanceof WebviewFragment) {
                        Fragment fragment = listJ0.get(i11);
                        kotlin.jvm.internal.f0.n(fragment, "null cannot be cast to non-null type com.max.xiaoheihe.module.webview.WebviewFragment");
                        webviewFragment = (WebviewFragment) fragment;
                    }
                }
            }
            if (webviewFragment == null || baseActivity.isFinishing()) {
                return;
            }
            baseActivity.runOnUiThread(new c(webviewFragment, i10));
        }
    }

    @dl.e
    public final WebWithNativeContainerFragment r(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 48205, new Class[]{Context.class}, WebWithNativeContainerFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebWithNativeContainerFragment) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        if (context instanceof MiniProgramContainerActivity) {
            Fragment fragmentT = ((MiniProgramContainerActivity) context).T();
            if (fragmentT instanceof WebWithNativeContainerFragment) {
                return (WebWithNativeContainerFragment) fragmentT;
            }
            return null;
        }
        if (!(context instanceof MiniProgramHostActivity)) {
            return null;
        }
        Fragment fragmentT2 = ((MiniProgramHostActivity) context).T();
        if (fragmentT2 instanceof WebWithNativeContainerFragment) {
            return (WebWithNativeContainerFragment) fragmentT2;
        }
        return null;
    }
}
