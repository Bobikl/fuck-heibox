package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.CoffeeDialogDataObj;
import com.max.xiaoheihe.bean.game.CoffeeDialogProgressObj;
import com.max.xiaoheihe.bean.mall.SteamWalletJsObj;
import com.max.xiaoheihe.bean.proxy.ProxyAddressObj;
import com.max.xiaoheihe.bean.webintercept.IpDirectObj;
import com.max.xiaoheihe.bean.webintercept.TagJsObj;
import com.max.xiaoheihe.module.magic.MagicUtil;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.IOException;
import java.io.Serializable;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Cookie;

/* JADX INFO: compiled from: AddToWishListActivity.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.jvm.internal.t0({"SMAP\nAddToWishListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddToWishListActivity.kt\ncom/max/xiaoheihe/module/game/AddToWishListActivity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,637:1\n37#2,2:638\n37#2,2:640\n*S KotlinDebug\n*F\n+ 1 AddToWishListActivity.kt\ncom/max/xiaoheihe/module/game/AddToWishListActivity\n*L\n394#1:638,2\n535#1:640,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class AddToWishListActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;
    public okhttp3.z O;
    public b2 P;
    public String Q;
    public String S;
    public String T;
    public SteamWalletJsObj U;

    @dl.e
    private CoffeeDialogProgressObj V;

    @dl.e
    private CoffeeDialogProgressObj W;

    @dl.e
    private List<String> X;

    @dl.e
    private List<String> Y;

    @dl.e
    private ViewGroup Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f83984a0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f83986c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @dl.d
    public static final a f83978p1 = new a(null);

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final int f83980x1 = 8;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @dl.d
    private static final String f83982y1 = "arg_appid";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @dl.d
    private static final String f83979p2 = "url_data";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dl.d
    private static final String f83981x2 = "need_follow";

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    @dl.d
    private static final Handler f83983y2 = new Handler(Looper.getMainLooper());

    @dl.d
    private final String L = "https://store.steampowered.com/api/addtowishlist";

    @dl.d
    private final String M = "https://store.steampowered.com/dynamicstore/userdata/";

    @dl.d
    private final String N = "https://store.steampowered.com/explore/followgame/";

    @dl.d
    private String R = "";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @dl.d
    private MagicUtil.ConnectType f83985b0 = MagicUtil.ConnectType.None;

    /* JADX INFO: compiled from: AddToWishListActivity.kt */
    public enum AddWishAction {
        WISHLIST,
        FOLLOW;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static AddWishAction valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 32121, new Class[]{String.class}, AddWishAction.class);
            return (AddWishAction) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(AddWishAction.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static AddWishAction[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 32120, new Class[0], AddWishAction[].class);
            return (AddWishAction[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: AddToWishListActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @xh.m
        public static /* synthetic */ void b() {
        }

        @xh.m
        public static /* synthetic */ void d() {
        }

        @xh.m
        public static /* synthetic */ void f() {
        }

        @xh.m
        private static /* synthetic */ void g() {
        }

        @dl.d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32122, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : AddToWishListActivity.f83982y1;
        }

        @dl.d
        public final String c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32124, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : AddToWishListActivity.f83981x2;
        }

        @dl.d
        public final String e() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32123, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : AddToWishListActivity.f83979p2;
        }

        @dl.d
        @xh.m
        public final Intent h(@dl.d Context context, @dl.d String appID, @dl.d SteamWalletJsObj urlData, boolean z10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, appID, urlData, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32125, new Class[]{Context.class, String.class, SteamWalletJsObj.class, Boolean.TYPE}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(appID, "appID");
            kotlin.jvm.internal.f0.p(urlData, "urlData");
            Intent intent = new Intent(context, (Class<?>) AddToWishListActivity.class);
            intent.putExtra(a(), appID);
            intent.putExtra(e(), urlData);
            intent.putExtra(c(), z10);
            return intent;
        }
    }

    /* JADX INFO: compiled from: AddToWishListActivity.kt */
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f83987a;

        static {
            int[] iArr = new int[AddWishAction.valuesCustom().length];
            try {
                iArr[AddWishAction.FOLLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AddWishAction.WISHLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f83987a = iArr;
        }
    }

    /* JADX INFO: compiled from: AddToWishListActivity.kt */
    public static final class c implements com.max.xiaoheihe.network.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: AddToWishListActivity.kt */
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AddToWishListActivity f83989b;

            a(AddToWishListActivity addToWishListActivity) {
                this.f83989b = addToWishListActivity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32128, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                AddToWishListActivity.O1(this.f83989b);
            }
        }

        /* JADX INFO: compiled from: AddToWishListActivity.kt */
        public static final class b implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ JsonObject f83990b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ AddToWishListActivity f83991c;

            b(JsonObject jsonObject, AddToWishListActivity addToWishListActivity) {
                this.f83990b = jsonObject;
                this.f83991c = addToWishListActivity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                JsonElement jsonElement;
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32129, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                JsonObject jsonObject = this.f83990b;
                if (kotlin.jvm.internal.f0.g("true", (jsonObject == null || (jsonElement = jsonObject.get("success")) == null) ? null : jsonElement.getAsString())) {
                    AddToWishListActivity.N1(this.f83991c);
                } else {
                    AddToWishListActivity.O1(this.f83991c);
                }
            }
        }

        c() {
        }

        @Override // com.max.xiaoheihe.network.h
        public void a(@dl.e Exception exc) {
            if (PatchProxy.proxy(new Object[]{exc}, this, changeQuickRedirect, false, 32127, new Class[]{Exception.class}, Void.TYPE).isSupported) {
                return;
            }
            AddToWishListActivity.f83983y2.post(new a(AddToWishListActivity.this));
        }

        @Override // com.max.xiaoheihe.network.h
        public void b(@dl.e JsonObject jsonObject, @dl.e String str, @dl.e okhttp3.s sVar, int i10) {
            if (PatchProxy.proxy(new Object[]{jsonObject, str, sVar, new Integer(i10)}, this, changeQuickRedirect, false, 32126, new Class[]{JsonObject.class, String.class, okhttp3.s.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            AddToWishListActivity.f83983y2.post(new b(jsonObject, AddToWishListActivity.this));
        }
    }

    /* JADX INFO: compiled from: AddToWishListActivity.kt */
    @kotlin.jvm.internal.t0({"SMAP\nAddToWishListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddToWishListActivity.kt\ncom/max/xiaoheihe/module/game/AddToWishListActivity$checkCookie$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,637:1\n1#2:638\n*E\n"})
    public static final class d implements okhttp3.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: AddToWishListActivity.kt */
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AddToWishListActivity f83993b;

            a(AddToWishListActivity addToWishListActivity) {
                this.f83993b = addToWishListActivity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32132, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                AddToWishListActivity.f2(this.f83993b, true);
            }
        }

        /* JADX INFO: compiled from: AddToWishListActivity.kt */
        public static final class b implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AddToWishListActivity f83994b;

            b(AddToWishListActivity addToWishListActivity) {
                this.f83994b = addToWishListActivity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32133, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                AddToWishListActivity.f2(this.f83994b, true);
            }
        }

        /* JADX INFO: compiled from: AddToWishListActivity.kt */
        public static final class c implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AddToWishListActivity f83995b;

            c(AddToWishListActivity addToWishListActivity) {
                this.f83995b = addToWishListActivity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32134, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                AddToWishListActivity.f2(this.f83995b, true);
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.AddToWishListActivity$d$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AddToWishListActivity.kt */
        public static final class RunnableC0743d implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AddToWishListActivity f83996b;

            RunnableC0743d(AddToWishListActivity addToWishListActivity) {
                this.f83996b = addToWishListActivity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32135, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                AddToWishListActivity.f2(this.f83996b, false);
            }
        }

        /* JADX INFO: compiled from: AddToWishListActivity.kt */
        public static final class e implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AddToWishListActivity f83997b;

            e(AddToWishListActivity addToWishListActivity) {
                this.f83997b = addToWishListActivity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32136, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                AddToWishListActivity.f2(this.f83997b, true);
            }
        }

        /* JADX INFO: compiled from: AddToWishListActivity.kt */
        public static final class f implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AddToWishListActivity f83998b;

            f(AddToWishListActivity addToWishListActivity) {
                this.f83998b = addToWishListActivity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32137, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                AddToWishListActivity.f2(this.f83998b, true);
            }
        }

        d() {
        }

        @Override // okhttp3.f
        public void onFailure(@dl.d okhttp3.e call, @dl.d IOException e10) {
            if (PatchProxy.proxy(new Object[]{call, e10}, this, changeQuickRedirect, false, 32130, new Class[]{okhttp3.e.class, IOException.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(call, "call");
            kotlin.jvm.internal.f0.p(e10, "e");
            e10.printStackTrace();
            AddToWishListActivity.f83983y2.post(new a(AddToWishListActivity.this));
        }

        @Override // okhttp3.f
        public void onResponse(@dl.d okhttp3.e call, @dl.d okhttp3.c0 response) throws IOException {
            if (PatchProxy.proxy(new Object[]{call, response}, this, changeQuickRedirect, false, 32131, new Class[]{okhttp3.e.class, okhttp3.c0.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(call, "call");
            kotlin.jvm.internal.f0.p(response, "response");
            try {
                try {
                    try {
                        if (call.getCanceled()) {
                            AddToWishListActivity.f83983y2.post(new b(AddToWishListActivity.this));
                            try {
                                okhttp3.d0 d0VarQ = response.q();
                                if (d0VarQ != null) {
                                    d0VarQ.close();
                                    return;
                                }
                                return;
                            } catch (Exception e10) {
                                e10.printStackTrace();
                                return;
                            }
                        }
                        if (!response.c1()) {
                            AddToWishListActivity.f83983y2.post(new c(AddToWishListActivity.this));
                            try {
                                okhttp3.d0 d0VarQ2 = response.q();
                                if (d0VarQ2 != null) {
                                    d0VarQ2.close();
                                    return;
                                }
                                return;
                            } catch (Exception e11) {
                                e11.printStackTrace();
                                return;
                            }
                        }
                        okhttp3.d0 d0VarQ3 = response.q();
                        kotlin.jvm.internal.f0.m(d0VarQ3);
                        String strString = d0VarQ3.string();
                        com.max.hbcommon.utils.d.b("zzzzgifttest", "result==" + strString);
                        if (!Pattern.compile("\"youraccount_steamid\">Steam ID.+?\\d+").matcher(strString).find()) {
                            com.max.hbcommon.utils.d.b("zzzzgifttest", "cookie invalid ---");
                            AddToWishListActivity.f83983y2.post(new e(AddToWishListActivity.this));
                            try {
                                okhttp3.d0 d0VarQ4 = response.q();
                                if (d0VarQ4 != null) {
                                    d0VarQ4.close();
                                    return;
                                }
                                return;
                            } catch (Exception e12) {
                                e12.printStackTrace();
                                return;
                            }
                        }
                        com.max.hbcommon.utils.d.b("zzzzgifttest", "cookie valid !!!");
                        okhttp3.t tVarL = okhttp3.t.INSTANCE.l(AddToWishListActivity.a2(AddToWishListActivity.this));
                        List<Cookie> listA = tVarL != null ? AddToWishListActivity.this.C2().a(tVarL) : null;
                        if (listA != null) {
                            for (Cookie cookie : listA) {
                                if (kotlin.jvm.internal.f0.g("sessionid", cookie.name())) {
                                    AddToWishListActivity.this.l3(cookie.value());
                                }
                            }
                        }
                        AddToWishListActivity.f83983y2.post(new RunnableC0743d(AddToWishListActivity.this));
                        okhttp3.d0 d0VarQ5 = response.q();
                        if (d0VarQ5 != null) {
                            d0VarQ5.close();
                        }
                    } catch (Exception e13) {
                        e13.printStackTrace();
                        AddToWishListActivity.f83983y2.post(new f(AddToWishListActivity.this));
                        okhttp3.d0 d0VarQ6 = response.q();
                        if (d0VarQ6 != null) {
                            d0VarQ6.close();
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        okhttp3.d0 d0VarQ7 = response.q();
                        if (d0VarQ7 != null) {
                            d0VarQ7.close();
                        }
                    } catch (Exception e14) {
                        e14.printStackTrace();
                    }
                    throw th2;
                }
            } catch (Exception e15) {
                e15.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: AddToWishListActivity.kt */
    public static final class e implements zf.a<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: AddToWishListActivity.kt */
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AddToWishListActivity f84000b;

            a(AddToWishListActivity addToWishListActivity) {
                this.f84000b = addToWishListActivity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z10 = false;
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32140, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                List<String> listA2 = this.f84000b.A2();
                if (listA2 != null && listA2.contains(this.f84000b.B2())) {
                    z10 = true;
                }
                if (z10) {
                    AddToWishListActivity.R1(this.f84000b);
                } else {
                    AddToWishListActivity.Q1(this.f84000b);
                }
            }
        }

        e() {
        }

        public void a(boolean z10) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32138, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            AddToWishListActivity.f83983y2.post(new a(AddToWishListActivity.this));
        }

        @Override // zf.a
        public /* bridge */ /* synthetic */ void doAction(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 32139, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(bool.booleanValue());
        }
    }

    /* JADX INFO: compiled from: AddToWishListActivity.kt */
    public static final class f implements zf.a<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: AddToWishListActivity.kt */
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AddToWishListActivity f84002b;

            a(AddToWishListActivity addToWishListActivity) {
                this.f84002b = addToWishListActivity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z10 = false;
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32143, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                List<String> listS2 = this.f84002b.S2();
                if (listS2 != null && listS2.contains(this.f84002b.B2())) {
                    z10 = true;
                }
                if (z10) {
                    AddToWishListActivity.N1(this.f84002b);
                } else {
                    AddToWishListActivity.M1(this.f84002b);
                }
            }
        }

        f() {
        }

        public void a(boolean z10) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32141, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            AddToWishListActivity.f83983y2.post(new a(AddToWishListActivity.this));
        }

        @Override // zf.a
        public /* bridge */ /* synthetic */ void doAction(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 32142, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(bool.booleanValue());
        }
    }

    /* JADX INFO: compiled from: AddToWishListActivity.kt */
    public static final class g implements com.max.xiaoheihe.network.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: AddToWishListActivity.kt */
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AddToWishListActivity f84004b;

            a(AddToWishListActivity addToWishListActivity) {
                this.f84004b = addToWishListActivity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32146, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                this.f84004b.l2();
            }
        }

        /* JADX INFO: compiled from: AddToWishListActivity.kt */
        public static final class b implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f84005b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ AddToWishListActivity f84006c;

            b(String str, AddToWishListActivity addToWishListActivity) {
                this.f84005b = str;
                this.f84006c = addToWishListActivity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32147, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                if (kotlin.jvm.internal.f0.g("true", this.f84005b)) {
                    AddToWishListActivity.R1(this.f84006c);
                } else {
                    this.f84006c.l2();
                }
            }
        }

        g() {
        }

        @Override // com.max.xiaoheihe.network.h
        public void a(@dl.e Exception exc) {
            if (PatchProxy.proxy(new Object[]{exc}, this, changeQuickRedirect, false, 32145, new Class[]{Exception.class}, Void.TYPE).isSupported) {
                return;
            }
            AddToWishListActivity.f83983y2.post(new a(AddToWishListActivity.this));
        }

        @Override // com.max.xiaoheihe.network.h
        public void b(@dl.e JsonObject jsonObject, @dl.e String str, @dl.e okhttp3.s sVar, int i10) {
            if (PatchProxy.proxy(new Object[]{jsonObject, str, sVar, new Integer(i10)}, this, changeQuickRedirect, false, 32144, new Class[]{JsonObject.class, String.class, okhttp3.s.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            AddToWishListActivity.f83983y2.post(new b(str, AddToWishListActivity.this));
        }
    }

    /* JADX INFO: compiled from: AddToWishListActivity.kt */
    public static final class h implements com.max.xiaoheihe.network.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zf.a<Boolean> f84008b;

        h(zf.a<Boolean> aVar) {
            this.f84008b = aVar;
        }

        @Override // com.max.xiaoheihe.network.h
        public void a(@dl.e Exception exc) {
            if (PatchProxy.proxy(new Object[]{exc}, this, changeQuickRedirect, false, 32149, new Class[]{Exception.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f84008b.doAction(Boolean.FALSE);
        }

        @Override // com.max.xiaoheihe.network.h
        public void b(@dl.e JsonObject jsonObject, @dl.e String str, @dl.e okhttp3.s sVar, int i10) {
            if (PatchProxy.proxy(new Object[]{jsonObject, str, sVar, new Integer(i10)}, this, changeQuickRedirect, false, 32148, new Class[]{JsonObject.class, String.class, okhttp3.s.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            JsonArray asJsonArray = jsonObject != null ? jsonObject.getAsJsonArray("rgWishlist") : null;
            if (asJsonArray != null) {
                AddToWishListActivity.this.s3(new ArrayList());
                int size = asJsonArray.size();
                for (int i11 = 0; i11 < size; i11++) {
                    String asString = asJsonArray.get(i11).getAsString();
                    kotlin.jvm.internal.f0.o(asString, "listArray.get(i).asString");
                    List<String> listS2 = AddToWishListActivity.this.S2();
                    kotlin.jvm.internal.f0.m(listS2);
                    listS2.add(asString);
                }
            }
            JsonArray asJsonArray2 = jsonObject != null ? jsonObject.getAsJsonArray("rgFollowedApps") : null;
            if (asJsonArray2 != null) {
                AddToWishListActivity.this.f3(new ArrayList());
                int size2 = asJsonArray2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    String asString2 = asJsonArray2.get(i12).getAsString();
                    kotlin.jvm.internal.f0.o(asString2, "listArr2.get(i).asString");
                    List<String> listA2 = AddToWishListActivity.this.A2();
                    kotlin.jvm.internal.f0.m(listA2);
                    listA2.add(asString2);
                }
            }
            this.f84008b.doAction(Boolean.TRUE);
        }
    }

    /* JADX INFO: compiled from: AddToWishListActivity.kt */
    public static final class i implements okhttp3.u {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f84009a;

        i(boolean z10) {
            this.f84009a = z10;
        }

        @Override // okhttp3.u
        @dl.d
        public okhttp3.c0 intercept(@dl.d okhttp3.u.a chain) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{chain}, this, changeQuickRedirect, false, 32150, new Class[]{okhttp3.u.a.class}, okhttp3.c0.class);
            if (patchProxyResultProxy.isSupported) {
                return (okhttp3.c0) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(chain, "chain");
            okhttp3.a0 a0VarRequest = chain.request();
            okhttp3.t tVarH = a0VarRequest.q().H().h();
            okhttp3.a0.a aVarN = a0VarRequest.n();
            if (!this.f84009a) {
                aVarN.n("Host", "store.steampowered.com");
            }
            return chain.proceed(aVarN.n("User-Agent", "Mozilla/5.0 AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.118 Safari/537.36 ApiMaxJia/1.0").D(tVarH).b());
        }
    }

    /* JADX INFO: compiled from: AddToWishListActivity.kt */
    public static final class j extends WebviewFragment.o0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void g(@dl.d WebView view, @dl.d String url, int i10, int i11) {
            Object[] objArr = {view, url, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 32152, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(view, "view");
            kotlin.jvm.internal.f0.p(url, "url");
            com.max.hbcommon.utils.d.b("zzzzgifttest", "needLogin==  " + AddToWishListActivity.this.J2());
            if (AddToWishListActivity.this.J2()) {
                AddToWishListActivity.this.q3(false);
                return;
            }
            com.max.hbcommon.utils.d.b("zzzzgifttest", "onPageFinished  url==" + url);
            String regular = AddToWishListActivity.this.I2().getAddwishlist_steam().getRegular();
            kotlin.jvm.internal.f0.o(regular, "mUrlData.addwishlist_steam.regular");
            if (new Regex(regular).b(url)) {
                String cookie = CookieManager.getInstance().getCookie(url);
                Matcher matcher = Pattern.compile("sessionid=(.*?);").matcher(cookie);
                if (matcher.find()) {
                    AddToWishListActivity addToWishListActivity = AddToWishListActivity.this;
                    String strGroup = matcher.group(1);
                    kotlin.jvm.internal.f0.o(strGroup, "m.group(1)");
                    addToWishListActivity.l3(StringsKt__StringsKt.F5(strGroup).toString());
                }
                Matcher matcher2 = Pattern.compile("steamLoginSecure=(.*?)%7C").matcher(cookie);
                if (matcher2.find()) {
                    AddToWishListActivity addToWishListActivity2 = AddToWishListActivity.this;
                    String strGroup2 = matcher2.group(1);
                    kotlin.jvm.internal.f0.o(strGroup2, "m2.group(1)");
                    addToWishListActivity2.n3(StringsKt__StringsKt.F5(strGroup2).toString());
                }
                Matcher matcher3 = Pattern.compile("steamCountry=(.*?)%7C").matcher(cookie);
                if (matcher3.find()) {
                    AddToWishListActivity addToWishListActivity3 = AddToWishListActivity.this;
                    String strGroup3 = matcher3.group(1);
                    kotlin.jvm.internal.f0.o(strGroup3, "m3.group(1)");
                    addToWishListActivity3.i3(StringsKt__StringsKt.F5(strGroup3).toString());
                }
                ArrayList arrayList = new ArrayList();
                AddToWishListActivity.this.W = new CoffeeDialogProgressObj("添加Steam愿望单", "1", null);
                CoffeeDialogProgressObj coffeeDialogProgressObj = AddToWishListActivity.this.W;
                kotlin.jvm.internal.f0.m(coffeeDialogProgressObj);
                arrayList.add(coffeeDialogProgressObj);
                if (AddToWishListActivity.this.x2()) {
                    AddToWishListActivity.this.V = new CoffeeDialogProgressObj("添加Steam关注", "0", null);
                    CoffeeDialogProgressObj coffeeDialogProgressObj2 = AddToWishListActivity.this.V;
                    kotlin.jvm.internal.f0.m(coffeeDialogProgressObj2);
                    arrayList.add(coffeeDialogProgressObj2);
                }
                com.max.xiaoheihe.view.l.A(new CoffeeDialogDataObj("正在添加愿望单，请稍候", arrayList, "1", null, null, false, null, null));
                AddToWishListActivity.this.h2();
            }
            super.f(view, url);
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void o(@dl.d WebView view, @dl.d String receivedTitle) {
            if (PatchProxy.proxy(new Object[]{view, receivedTitle}, this, changeQuickRedirect, false, 32151, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(view, "view");
            kotlin.jvm.internal.f0.p(receivedTitle, "receivedTitle");
            if (com.max.hbcommon.utils.c.u(receivedTitle) || ((BaseActivity) AddToWishListActivity.this).f66616q == null || ((BaseActivity) AddToWishListActivity.this).f66616q.getVisibility() != 0) {
                return;
            }
            if (kotlin.text.u.L1("about:blank", receivedTitle, true)) {
                receivedTitle = AddToWishListActivity.this.getString(R.string.loading);
            }
            ((BaseActivity) AddToWishListActivity.this).f66616q.setTitle(receivedTitle);
        }
    }

    public static final /* synthetic */ void M1(AddToWishListActivity addToWishListActivity) {
        if (PatchProxy.proxy(new Object[]{addToWishListActivity}, null, changeQuickRedirect, true, 32117, new Class[]{AddToWishListActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        addToWishListActivity.i2();
    }

    public static final /* synthetic */ void N1(AddToWishListActivity addToWishListActivity) {
        if (PatchProxy.proxy(new Object[]{addToWishListActivity}, null, changeQuickRedirect, true, 32115, new Class[]{AddToWishListActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        addToWishListActivity.j2();
    }

    public static final /* synthetic */ void O1(AddToWishListActivity addToWishListActivity) {
        if (PatchProxy.proxy(new Object[]{addToWishListActivity}, null, changeQuickRedirect, true, 32116, new Class[]{AddToWishListActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        addToWishListActivity.m2();
    }

    public static final /* synthetic */ void Q1(AddToWishListActivity addToWishListActivity) {
        if (PatchProxy.proxy(new Object[]{addToWishListActivity}, null, changeQuickRedirect, true, 32114, new Class[]{AddToWishListActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        addToWishListActivity.o2();
    }

    private final String Q2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32105, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (this.f83985b0 == MagicUtil.ConnectType.R_Proxy) {
            String r_url = I2().getAddwishlist_steam().getR_url();
            kotlin.jvm.internal.f0.o(r_url, "{\n            mUrlData.a…ist_steam.r_url\n        }");
            return r_url;
        }
        String url = I2().getAddwishlist_steam().getUrl();
        kotlin.jvm.internal.f0.o(url, "{\n            mUrlData.a…hlist_steam.url\n        }");
        return url;
    }

    public static final /* synthetic */ void R1(AddToWishListActivity addToWishListActivity) {
        if (PatchProxy.proxy(new Object[]{addToWishListActivity}, null, changeQuickRedirect, true, 32113, new Class[]{AddToWishListActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        addToWishListActivity.q2();
    }

    private final void T2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32103, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        h3(new b2(new ka.d(this.f66601b)));
        Proxy proxy = null;
        if (I2().getSteam_proxy() != null && I2().getSteam_proxy().getProxy() != null) {
            String text = com.max.xiaoheihe.utils.d.v(I2().getSteam_proxy().getProxy());
            if (!com.max.hbcommon.utils.c.u(text)) {
                kotlin.jvm.internal.f0.o(text, "text");
                String[] strArr = (String[]) StringsKt__StringsKt.U4(text, new String[]{":"}, false, 0, 6, null).toArray(new String[0]);
                if (strArr.length > 1) {
                    proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(strArr[0], com.max.hbutils.utils.n.q(strArr[1])));
                }
            }
        }
        okhttp3.z.a aVarE0 = new okhttp3.z().e0();
        if (this.f83985b0 == MagicUtil.ConnectType.Proxy) {
            aVarE0.g0(proxy);
        }
        aVarE0.o(C2());
        boolean z10 = this.f83985b0 == MagicUtil.ConnectType.R_Proxy;
        if (!z10) {
            aVarE0.Z(new e2("store.steampowered.com"));
        }
        aVarE0.d(new com.max.xiaoheihe.network.g());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVarE0.k(20L, timeUnit);
        aVarE0.j0(20L, timeUnit);
        aVarE0.c(new i(z10));
        k3(aVarE0.f());
    }

    @dl.d
    @xh.m
    public static final Intent V2(@dl.d Context context, @dl.d String str, @dl.d SteamWalletJsObj steamWalletJsObj, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, steamWalletJsObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 32112, new Class[]{Context.class, String.class, SteamWalletJsObj.class, Boolean.TYPE}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : f83978p1.h(context, str, steamWalletJsObj, z10);
    }

    private final void W2(AddWishAction addWishAction, boolean z10) {
        String str;
        if (PatchProxy.proxy(new Object[]{addWishAction, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32098, new Class[]{AddWishAction.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("app_id", B2());
        int i10 = b.f83987a[addWishAction.ordinal()];
        if (i10 == 1) {
            str = z10 ? lb.d.f131217n5 : lb.d.f131224o5;
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = z10 ? lb.d.f131203l5 : lb.d.f131210m5;
        }
        com.max.hbcommon.analytics.d.d("3", str, null, jsonObject);
    }

    private final void X2(String str, okhttp3.b0 b0Var, com.max.xiaoheihe.network.h hVar) {
        if (PatchProxy.proxy(new Object[]{str, b0Var, hVar}, this, changeQuickRedirect, false, 32107, new Class[]{String.class, okhttp3.b0.class, com.max.xiaoheihe.network.h.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.f.a(E2().a(new okhttp3.a0.a().r(b0Var).B(str).b()), hVar);
    }

    public static final /* synthetic */ String a2(AddToWishListActivity addToWishListActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{addToWishListActivity}, null, changeQuickRedirect, true, 32119, new Class[]{AddToWishListActivity.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : addToWishListActivity.Q2();
    }

    public static final /* synthetic */ void f2(AddToWishListActivity addToWishListActivity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{addToWishListActivity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 32118, new Class[]{AddToWishListActivity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        addToWishListActivity.t3(z10);
    }

    private final void i2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32102, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.W = new CoffeeDialogProgressObj("添加Steam愿望单", "3", null);
        ArrayList arrayList = new ArrayList();
        CoffeeDialogProgressObj coffeeDialogProgressObj = this.W;
        kotlin.jvm.internal.f0.m(coffeeDialogProgressObj);
        arrayList.add(coffeeDialogProgressObj);
        com.max.xiaoheihe.view.l.w(new CoffeeDialogDataObj("加入愿望单失败，请确认您的账号所在区域商店是否上架该游戏", arrayList, "0", "确定", null, false, null, null));
        W2(AddWishAction.WISHLIST, false);
    }

    private final void j2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32101, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setResult(-1);
        this.W = new CoffeeDialogProgressObj("添加Steam愿望单", "2", null);
        ArrayList arrayList = new ArrayList();
        CoffeeDialogProgressObj coffeeDialogProgressObj = this.W;
        kotlin.jvm.internal.f0.m(coffeeDialogProgressObj);
        arrayList.add(coffeeDialogProgressObj);
        if (this.f83986c0) {
            CoffeeDialogProgressObj coffeeDialogProgressObj2 = new CoffeeDialogProgressObj("添加Steam关注", "1", null);
            this.V = coffeeDialogProgressObj2;
            kotlin.jvm.internal.f0.m(coffeeDialogProgressObj2);
            arrayList.add(coffeeDialogProgressObj2);
            com.max.xiaoheihe.view.l.w(new CoffeeDialogDataObj("正在关注游戏，请稍候", arrayList, "1", null, null, false, null, null));
            n2();
        } else {
            com.max.xiaoheihe.view.l.w(new CoffeeDialogDataObj("成功", arrayList, "0", "确定", null, false, null, null));
        }
        W2(AddWishAction.WISHLIST, true);
    }

    private final void m2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32100, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        K2(new f());
    }

    private final void o2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32096, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        u3(false);
    }

    private final void q2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32095, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        u3(true);
    }

    @dl.d
    public static final String r2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 32109, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : f83978p1.a();
    }

    private final void r3(WebviewFragment webviewFragment) {
        if (PatchProxy.proxy(new Object[]{webviewFragment}, this, changeQuickRedirect, false, 32108, new Class[]{WebviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewFragment.Y7(new j());
        getSupportFragmentManager().u().b(R.id.fragment_container, webviewFragment).n();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00ab  */
    private final void t3(boolean z10) {
        String str;
        HashMap<String, String> map;
        ArrayList<TagJsObj> js_list;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32106, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f83984a0 = z10;
        x1();
        String str2 = null;
        if (I2().getHost() == null || com.max.hbcommon.utils.c.w(I2().getJs_list())) {
            if (I2().getSteam_proxy() == null || I2().getSteam_proxy().getProxy() == null) {
                str = null;
                map = null;
            } else {
                String text = com.max.xiaoheihe.utils.d.v(I2().getSteam_proxy().getProxy());
                if (com.max.hbcommon.utils.c.u(text)) {
                    str = null;
                    map = null;
                } else {
                    kotlin.jvm.internal.f0.o(text, "text");
                    String[] strArr = (String[]) StringsKt__StringsKt.U4(text, new String[]{":"}, false, 0, 6, null).toArray(new String[0]);
                    if (strArr.length > 1) {
                        String str3 = strArr[0];
                        str = strArr[1];
                        map = null;
                        str2 = str3;
                    } else {
                        str = null;
                        map = null;
                    }
                }
            }
            js_list = map;
        } else {
            HashMap<String, String> host = I2().getHost();
            js_list = I2().getJs_list();
            map = host;
            str = null;
        }
        com.max.xiaoheihe.module.webview.u uVar = new com.max.xiaoheihe.module.webview.u(Q2());
        MagicUtil.ConnectType connectType = this.f83985b0;
        if (connectType != MagicUtil.ConnectType.R_Proxy) {
            if (connectType == MagicUtil.ConnectType.Proxy) {
                uVar.t(new ProxyAddressObj(str2, str));
            } else if (connectType == MagicUtil.ConnectType.IP_Direct) {
                uVar.l(new IpDirectObj(map, js_list));
            }
        }
        WebviewFragment webviewFragmentA = uVar.a();
        r3(webviewFragmentA);
        if (isFinishing()) {
            return;
        }
        getSupportFragmentManager().u().y(R.id.fragment_container, webviewFragmentA).n();
    }

    @dl.d
    public static final String u2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 32111, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : f83978p1.c();
    }

    private final void u3(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32097, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        CoffeeDialogProgressObj coffeeDialogProgressObj = this.W;
        kotlin.jvm.internal.f0.m(coffeeDialogProgressObj);
        arrayList.add(coffeeDialogProgressObj);
        String str = z10 ? "2" : "3";
        String str2 = z10 ? "成功" : "关注失败，请确认您的账号所在区域商店是否上架该游戏";
        CoffeeDialogProgressObj coffeeDialogProgressObj2 = new CoffeeDialogProgressObj("添加Steam关注", str, null);
        this.V = coffeeDialogProgressObj2;
        kotlin.jvm.internal.f0.m(coffeeDialogProgressObj2);
        arrayList.add(coffeeDialogProgressObj2);
        com.max.xiaoheihe.view.l.w(new CoffeeDialogDataObj(str2, arrayList, "0", "确定", null, false, null, null));
        W2(AddWishAction.FOLLOW, z10);
    }

    @dl.d
    public static final String v2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 32110, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : f83978p1.e();
    }

    @dl.e
    public final List<String> A2() {
        return this.Y;
    }

    @dl.d
    public final String B2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32085, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String str = this.T;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.f0.S("mAppID");
        return null;
    }

    @dl.d
    public final b2 C2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32078, new Class[0], b2.class);
        if (patchProxyResultProxy.isSupported) {
            return (b2) patchProxyResultProxy.result;
        }
        b2 b2Var = this.P;
        if (b2Var != null) {
            return b2Var;
        }
        kotlin.jvm.internal.f0.S("mCookieJarImpl");
        return null;
    }

    @dl.d
    public final String D2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32083, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String str = this.S;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.f0.S("mCountryCode");
        return null;
    }

    @dl.d
    public final okhttp3.z E2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32076, new Class[0], okhttp3.z.class);
        if (patchProxyResultProxy.isSupported) {
            return (okhttp3.z) patchProxyResultProxy.result;
        }
        okhttp3.z zVar = this.O;
        if (zVar != null) {
            return zVar;
        }
        kotlin.jvm.internal.f0.S("mOkHttpClient");
        return null;
    }

    @dl.d
    public final String G2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32080, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String str = this.Q;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.f0.S("mSessionID");
        return null;
    }

    @dl.d
    public final String H2() {
        return this.R;
    }

    @dl.d
    public final SteamWalletJsObj I2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32087, new Class[0], SteamWalletJsObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SteamWalletJsObj) patchProxyResultProxy.result;
        }
        SteamWalletJsObj steamWalletJsObj = this.U;
        if (steamWalletJsObj != null) {
            return steamWalletJsObj;
        }
        kotlin.jvm.internal.f0.S("mUrlData");
        return null;
    }

    public final boolean J2() {
        return this.f83984a0;
    }

    public final void K2(@dl.d zf.a<Boolean> next) {
        if (PatchProxy.proxy(new Object[]{next}, this, changeQuickRedirect, false, 32091, new Class[]{zf.a.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(next, "next");
        if (this.X != null && this.Y != null) {
            next.doAction(Boolean.TRUE);
        }
        String strP2 = this.M + "?id=" + this.R + "&cc=" + D2();
        if (this.f83985b0 == MagicUtil.ConnectType.R_Proxy) {
            strP2 = kotlin.text.u.p2(strP2, "store.steampowered.com", "steamhost.info/store", false, 4, null);
        }
        Log.d("addToWishList", "getSteamWishList: " + strP2);
        com.max.xiaoheihe.network.f.a(E2().a(new okhttp3.a0.a().g().B(strP2).b()), new h(next));
    }

    @dl.d
    public final String L2() {
        return this.L;
    }

    @dl.d
    public final String O2() {
        return this.N;
    }

    @dl.d
    public final String P2() {
        return this.M;
    }

    @dl.e
    public final List<String> S2() {
        return this.X;
    }

    public final void Y2(boolean z10) {
        this.f83986c0 = z10;
    }

    public final void a3(@dl.d MagicUtil.ConnectType connectType) {
        if (PatchProxy.proxy(new Object[]{connectType}, this, changeQuickRedirect, false, 32089, new Class[]{MagicUtil.ConnectType.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(connectType, "<set-?>");
        this.f83985b0 = connectType;
    }

    public final void e3(@dl.e ViewGroup viewGroup) {
        this.Z = viewGroup;
    }

    public final void f3(@dl.e List<String> list) {
        this.Y = list;
    }

    public final void g3(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 32086, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(str, "<set-?>");
        this.T = str;
    }

    public final void h2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32099, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        okhttp3.q.a aVar = new okhttp3.q.a(null, 1, null);
        com.max.hbcommon.utils.d.b("cqtest", "sessionID: " + G2() + " \n\n APPID: " + B2());
        aVar.a("sessionid", G2());
        aVar.a("appid", B2());
        String strL2 = this.f83985b0 == MagicUtil.ConnectType.R_Proxy ? kotlin.text.u.l2(this.L, "store.steampowered.com", "steamhost.info/store", false, 4, null) : this.L;
        Log.d("addToWishList", "addToWishList: " + strL2);
        if (this.f83985b0 == MagicUtil.ConnectType.IP_Direct) {
            String strL3 = strL2;
            for (String key : I2().getHost().keySet()) {
                String str = I2().getHost().get(key);
                if (str != null) {
                    kotlin.jvm.internal.f0.o(key, "key");
                    strL3 = kotlin.text.u.l2(strL3, key, str, false, 4, null);
                }
            }
            strL2 = strL3;
        }
        X2(strL2, aVar.c(), new c());
    }

    public final void h3(@dl.d b2 b2Var) {
        if (PatchProxy.proxy(new Object[]{b2Var}, this, changeQuickRedirect, false, 32079, new Class[]{b2.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(b2Var, "<set-?>");
        this.P = b2Var;
    }

    public final void i3(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 32084, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(str, "<set-?>");
        this.S = str;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32090, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_fragment_container);
        this.f66616q.setTitle(getString(R.string.loading));
        this.f66617r.setVisibility(0);
        String stringExtra = getIntent().getStringExtra(f83982y1);
        if (stringExtra == null) {
            stringExtra = "";
        }
        g3(stringExtra);
        Serializable serializableExtra = getIntent().getSerializableExtra(f83979p2);
        kotlin.jvm.internal.f0.n(serializableExtra, "null cannot be cast to non-null type com.max.xiaoheihe.bean.mall.SteamWalletJsObj");
        p3((SteamWalletJsObj) serializableExtra);
        this.f83986c0 = getIntent().getBooleanExtra(f83981x2, false);
        this.f83985b0 = MagicUtil.f89378a.b(I2());
        T2();
        k2();
    }

    public final void k2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32104, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        String strQ2 = Q2();
        if (this.f83985b0 == MagicUtil.ConnectType.IP_Direct) {
            String strL2 = strQ2;
            for (String key : I2().getHost().keySet()) {
                String str = I2().getHost().get(key);
                if (str != null) {
                    kotlin.jvm.internal.f0.o(key, "key");
                    strL2 = kotlin.text.u.l2(strL2, key, str, false, 4, null);
                }
            }
            strQ2 = strL2;
        }
        E2().a(new okhttp3.a0.a().B(strQ2).b()).enqueue(new d());
    }

    public final void k3(@dl.d okhttp3.z zVar) {
        if (PatchProxy.proxy(new Object[]{zVar}, this, changeQuickRedirect, false, 32077, new Class[]{okhttp3.z.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(zVar, "<set-?>");
        this.O = zVar;
    }

    public final void l2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32093, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        K2(new e());
    }

    public final void l3(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 32081, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(str, "<set-?>");
        this.Q = str;
    }

    public final void n2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32094, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        List<String> list = this.Y;
        if (list == null) {
            p2();
            return;
        }
        kotlin.jvm.internal.f0.m(list);
        if (list.contains(B2())) {
            q2();
        } else {
            o2();
        }
    }

    public final void n3(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 32082, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(str, "<set-?>");
        this.R = str;
    }

    public final void p2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32092, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        okhttp3.q.a aVar = new okhttp3.q.a(null, 1, null);
        aVar.a("sessionid", G2());
        aVar.a("appid", B2());
        String strL2 = this.f83985b0 == MagicUtil.ConnectType.R_Proxy ? kotlin.text.u.l2(this.N, "store.steampowered.com", "steamhost.info/store", false, 4, null) : this.N;
        Log.d("addToWishList", "followGameImp: " + strL2);
        com.max.xiaoheihe.network.f.a(E2().a(new okhttp3.a0.a().r(aVar.c()).B(strL2).b()), new g());
    }

    public final void p3(@dl.d SteamWalletJsObj steamWalletJsObj) {
        if (PatchProxy.proxy(new Object[]{steamWalletJsObj}, this, changeQuickRedirect, false, 32088, new Class[]{SteamWalletJsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(steamWalletJsObj, "<set-?>");
        this.U = steamWalletJsObj;
    }

    public final void q3(boolean z10) {
        this.f83984a0 = z10;
    }

    public final void s3(@dl.e List<String> list) {
        this.X = list;
    }

    public final boolean x2() {
        return this.f83986c0;
    }

    @dl.d
    public final MagicUtil.ConnectType y2() {
        return this.f83985b0;
    }

    @dl.e
    public final ViewGroup z2() {
        return this.Z;
    }
}
