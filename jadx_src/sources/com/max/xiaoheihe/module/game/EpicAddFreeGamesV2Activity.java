package com.max.xiaoheihe.module.game;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.PostEncryptParamsObj;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.SteamAcceptGameParams;
import com.max.xiaoheihe.bean.game.epic.EpicCheckCookiesObj;
import com.max.xiaoheihe.bean.game.epic.EpicDetailInfo;
import com.max.xiaoheihe.bean.game.epic.EpicLoginParam;
import com.max.xiaoheihe.bean.game.epic.EpicOrderConfirmObj;
import com.max.xiaoheihe.bean.game.epic.EpicOrderGameObj;
import com.max.xiaoheihe.bean.game.epic.EpicOrderPreviewObj;
import com.max.xiaoheihe.bean.mall.SteamWalletJsObj;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.qcloud.core.util.IOUtils;
import df.ca0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: EpicAddFreeGamesV2Activity.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.jvm.internal.t0({"SMAP\nEpicAddFreeGamesV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EpicAddFreeGamesV2Activity.kt\ncom/max/xiaoheihe/module/game/EpicAddFreeGamesV2Activity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,888:1\n1#2:889\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class EpicAddFreeGamesV2Activity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @dl.d
    public static final String f84071p2 = "purchase_token_regex";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @dl.d
    public static final String f84073y1 = "ids";
    private ca0 L;

    @dl.e
    private EpicLoginParam M;

    @dl.e
    private Dialog N;

    @dl.e
    private okhttp3.z O;

    @dl.e
    private com.max.xiaoheihe.module.game.j P;

    @dl.d
    private List<EpicOrderGameObj> Q = new ArrayList();
    private int R;

    @dl.e
    private ProgressBar S;

    @dl.e
    private TextView T;

    @dl.e
    private TextView U;

    @dl.e
    private ImageView V;

    @dl.e
    private View W;

    @dl.e
    private TextView X;

    @dl.e
    private String Y;

    @dl.e
    private String Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.e
    private String f84074a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @dl.e
    private SteamWalletJsObj f84075b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f84076c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @dl.d
    public static final a f84070p1 = new a(null);

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final int f84072x1 = 8;

    /* JADX INFO: compiled from: EpicAddFreeGamesV2Activity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final Intent a(@dl.d Context context, @dl.e String str, @dl.e String str2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2}, this, changeQuickRedirect, false, 32395, new Class[]{Context.class, String.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) EpicAddFreeGamesV2Activity.class);
            intent.putExtra(EpicAddFreeGamesV2Activity.f84073y1, str);
            intent.putExtra(EpicAddFreeGamesV2Activity.f84071p2, str2);
            return intent;
        }
    }

    /* JADX INFO: compiled from: EpicAddFreeGamesV2Activity.kt */
    public interface b {
        void next();
    }

    /* JADX INFO: compiled from: EpicAddFreeGamesV2Activity.kt */
    public static final class c implements okhttp3.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // okhttp3.f
        public void onFailure(@dl.d okhttp3.e call, @dl.d IOException e10) {
            if (PatchProxy.proxy(new Object[]{call, e10}, this, changeQuickRedirect, false, 32396, new Class[]{okhttp3.e.class, IOException.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(call, "call");
            kotlin.jvm.internal.f0.p(e10, "e");
            e10.printStackTrace();
            EpicAddFreeGamesV2Activity.o2(EpicAddFreeGamesV2Activity.this);
        }

        @Override // okhttp3.f
        public void onResponse(@dl.d okhttp3.e call, @dl.d okhttp3.c0 response) throws IOException {
            if (PatchProxy.proxy(new Object[]{call, response}, this, changeQuickRedirect, false, 32397, new Class[]{okhttp3.e.class, okhttp3.c0.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(call, "call");
            kotlin.jvm.internal.f0.p(response, "response");
            try {
                try {
                    try {
                        if (call.getCanceled()) {
                            EpicAddFreeGamesV2Activity.o2(EpicAddFreeGamesV2Activity.this);
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
                            EpicAddFreeGamesV2Activity.o2(EpicAddFreeGamesV2Activity.this);
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
                        String strString = d0VarQ3 != null ? d0VarQ3.string() : null;
                        if (com.max.hbcommon.utils.c.u(strString)) {
                            EpicAddFreeGamesV2Activity.o2(EpicAddFreeGamesV2Activity.this);
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
                        EpicCheckCookiesObj epicCheckCookiesObj = (EpicCheckCookiesObj) new Gson().fromJson(strString, EpicCheckCookiesObj.class);
                        if (epicCheckCookiesObj == null) {
                            EpicAddFreeGamesV2Activity.o2(EpicAddFreeGamesV2Activity.this);
                            try {
                                okhttp3.d0 d0VarQ5 = response.q();
                                if (d0VarQ5 != null) {
                                    d0VarQ5.close();
                                    return;
                                }
                                return;
                            } catch (Exception e13) {
                                e13.printStackTrace();
                                return;
                            }
                        }
                        if (!epicCheckCookiesObj.isSuccess()) {
                            EpicAddFreeGamesV2Activity.o2(EpicAddFreeGamesV2Activity.this);
                            try {
                                okhttp3.d0 d0VarQ6 = response.q();
                                if (d0VarQ6 != null) {
                                    d0VarQ6.close();
                                    return;
                                }
                                return;
                            } catch (Exception e14) {
                                e14.printStackTrace();
                                return;
                            }
                        }
                        Log.d("checkForCookie", "onResponse" + strString);
                        okhttp3.t tVarL = okhttp3.t.INSTANCE.l(com.max.xiaoheihe.module.game.j.f87763d);
                        if (tVarL != null) {
                            com.max.xiaoheihe.module.game.j jVar = EpicAddFreeGamesV2Activity.this.P;
                            kotlin.jvm.internal.f0.m(jVar);
                            jVar.a(tVarL);
                        }
                        EpicAddFreeGamesV2Activity.O1(EpicAddFreeGamesV2Activity.this, 0);
                        okhttp3.d0 d0VarQ7 = response.q();
                        if (d0VarQ7 != null) {
                            d0VarQ7.close();
                        }
                    } catch (Exception e15) {
                        e15.printStackTrace();
                    }
                } catch (Exception e16) {
                    e16.printStackTrace();
                    EpicAddFreeGamesV2Activity.o2(EpicAddFreeGamesV2Activity.this);
                    okhttp3.d0 d0VarQ8 = response.q();
                    if (d0VarQ8 != null) {
                        d0VarQ8.close();
                    }
                }
            } catch (Throwable th2) {
                try {
                    okhttp3.d0 d0VarQ9 = response.q();
                    if (d0VarQ9 != null) {
                        d0VarQ9.close();
                    }
                } catch (Exception e17) {
                    e17.printStackTrace();
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: EpicAddFreeGamesV2Activity.kt */
    public static final class d implements okhttp3.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f84079c;

        d(int i10) {
            this.f84079c = i10;
        }

        @Override // okhttp3.f
        public void onFailure(@dl.d okhttp3.e call, @dl.d IOException e10) {
            if (PatchProxy.proxy(new Object[]{call, e10}, this, changeQuickRedirect, false, 32398, new Class[]{okhttp3.e.class, IOException.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(call, "call");
            kotlin.jvm.internal.f0.p(e10, "e");
            if (EpicAddFreeGamesV2Activity.this.isActive()) {
                com.max.hbcommon.utils.d.b("zzzzgifttest", "checkGameIsOwned onFailure" + e10);
                e10.printStackTrace();
                EpicAddFreeGamesV2Activity.N1(EpicAddFreeGamesV2Activity.this, this.f84079c + 1);
            }
        }

        @Override // okhttp3.f
        public void onResponse(@dl.d okhttp3.e call, @dl.d okhttp3.c0 response) throws IOException {
            SteamAcceptGameParams addfreelicense_epic;
            if (PatchProxy.proxy(new Object[]{call, response}, this, changeQuickRedirect, false, 32399, new Class[]{okhttp3.e.class, okhttp3.c0.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(call, "call");
            kotlin.jvm.internal.f0.p(response, "response");
            try {
                try {
                    if (!EpicAddFreeGamesV2Activity.this.isActive()) {
                        return;
                    }
                    try {
                        if (call.getCanceled()) {
                            throw new Exception("call.isCanceled()");
                        }
                        if (!response.c1()) {
                            throw new Exception("response.is not Successful()");
                        }
                        String strM0 = com.max.xiaoheihe.utils.d.m0(response);
                        SteamWalletJsObj steamWalletJsObj = EpicAddFreeGamesV2Activity.this.f84075b0;
                        if (!Pattern.compile((steamWalletJsObj == null || (addfreelicense_epic = steamWalletJsObj.getAddfreelicense_epic()) == null) ? null : addfreelicense_epic.getIs_owned_regex()).matcher(strM0).find()) {
                            throw new Exception("purchaseEpicGames");
                        }
                        com.max.hbutils.utils.c.f(EpicAddFreeGamesV2Activity.this.getResources().getString(R.string.already_own) + ((EpicOrderGameObj) EpicAddFreeGamesV2Activity.this.Q.get(EpicAddFreeGamesV2Activity.this.R)).getName());
                        EpicAddFreeGamesV2Activity epicAddFreeGamesV2Activity = EpicAddFreeGamesV2Activity.this;
                        epicAddFreeGamesV2Activity.f84076c0 = epicAddFreeGamesV2Activity.f84076c0 + 1;
                        EpicAddFreeGamesV2Activity.f2(EpicAddFreeGamesV2Activity.this);
                        okhttp3.d0 d0VarQ = response.q();
                        if (d0VarQ != null) {
                            d0VarQ.close();
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        EpicAddFreeGamesV2Activity.k2(EpicAddFreeGamesV2Activity.this);
                        okhttp3.d0 d0VarQ2 = response.q();
                        if (d0VarQ2 != null) {
                            d0VarQ2.close();
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        okhttp3.d0 d0VarQ3 = response.q();
                        if (d0VarQ3 != null) {
                            d0VarQ3.close();
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    throw th2;
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: EpicAddFreeGamesV2Activity.kt */
    public static final class e implements com.max.xiaoheihe.network.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f84081b;

        e(int i10) {
            this.f84081b = i10;
        }

        @Override // com.max.xiaoheihe.network.h
        public void a(@dl.e Exception exc) {
            if (!PatchProxy.proxy(new Object[]{exc}, this, changeQuickRedirect, false, 32401, new Class[]{Exception.class}, Void.TYPE).isSupported && EpicAddFreeGamesV2Activity.this.isActive()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onFailed getEpicId");
                sb2.append(exc != null ? exc.getMessage() : null);
                com.max.hbcommon.utils.d.b("zzzzgifttest", sb2.toString());
                int i10 = this.f84081b;
                if (i10 < 5) {
                    EpicAddFreeGamesV2Activity.O1(EpicAddFreeGamesV2Activity.this, i10 + 1);
                } else {
                    EpicAddFreeGamesV2Activity.i2(EpicAddFreeGamesV2Activity.this);
                }
            }
        }

        @Override // com.max.xiaoheihe.network.h
        public void b(@dl.e JsonObject jsonObject, @dl.e String str, @dl.e okhttp3.s sVar, int i10) {
            JsonElement jsonElement;
            JsonArray asJsonArray;
            JsonElement jsonElement2;
            JsonObject asJsonObject;
            JsonElement jsonElement3;
            if (!PatchProxy.proxy(new Object[]{jsonObject, str, sVar, new Integer(i10)}, this, changeQuickRedirect, false, 32400, new Class[]{JsonObject.class, String.class, okhttp3.s.class, Integer.TYPE}, Void.TYPE).isSupported && EpicAddFreeGamesV2Activity.this.isActive()) {
                com.max.hbcommon.utils.d.b("zzzzgifttest", "onResponse getEpicId" + jsonObject);
                EpicAddFreeGamesV2Activity.this.Z = (jsonObject == null || (jsonElement = jsonObject.get("data")) == null || (asJsonArray = jsonElement.getAsJsonArray()) == null || (jsonElement2 = asJsonArray.get(0)) == null || (asJsonObject = jsonElement2.getAsJsonObject()) == null || (jsonElement3 = asJsonObject.get("accountId")) == null) ? null : jsonElement3.getAsString();
                EpicAddFreeGamesV2Activity.i2(EpicAddFreeGamesV2Activity.this);
            }
        }
    }

    /* JADX INFO: compiled from: EpicAddFreeGamesV2Activity.kt */
    public static final class f extends com.max.hbcommon.network.d<Result<EpicLoginParam>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 32402, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (EpicAddFreeGamesV2Activity.this.isActive()) {
                EpicAddFreeGamesV2Activity.E2(EpicAddFreeGamesV2Activity.this);
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<EpicLoginParam> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 32403, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (EpicAddFreeGamesV2Activity.this.isActive()) {
                super.onNext(result);
                EpicAddFreeGamesV2Activity.this.M = result.getResult();
                if (EpicAddFreeGamesV2Activity.this.M != null) {
                    EpicAddFreeGamesV2Activity epicAddFreeGamesV2Activity = EpicAddFreeGamesV2Activity.this;
                    EpicLoginParam epicLoginParam = epicAddFreeGamesV2Activity.M;
                    kotlin.jvm.internal.f0.m(epicLoginParam);
                    WebviewFragment loginFragment = WebviewFragment.u7(epicLoginParam.getLogin_param().getUrl());
                    kotlin.jvm.internal.f0.o(loginFragment, "loginFragment");
                    EpicAddFreeGamesV2Activity.B2(epicAddFreeGamesV2Activity, loginFragment);
                    EpicAddFreeGamesV2Activity.D2(epicAddFreeGamesV2Activity);
                    epicAddFreeGamesV2Activity.getSupportFragmentManager().u().y(R.id.fragment_container, loginFragment).n();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 32404, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<EpicLoginParam>) obj);
        }
    }

    /* JADX INFO: compiled from: EpicAddFreeGamesV2Activity.kt */
    public static final class g implements b {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.xiaoheihe.module.game.EpicAddFreeGamesV2Activity.b
        public void next() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32405, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            EpicAddFreeGamesV2Activity.this.finish();
        }
    }

    /* JADX INFO: compiled from: EpicAddFreeGamesV2Activity.kt */
    public static final class h extends com.max.hbcommon.network.d<Result<SteamWalletJsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 32406, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (EpicAddFreeGamesV2Activity.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<SteamWalletJsObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 32407, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (EpicAddFreeGamesV2Activity.this.isActive()) {
                super.onNext(result);
                EpicAddFreeGamesV2Activity.this.f84075b0 = result.getResult();
                EpicAddFreeGamesV2Activity.N1(EpicAddFreeGamesV2Activity.this, 0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 32408, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SteamWalletJsObj>) obj);
        }
    }

    /* JADX INFO: compiled from: EpicAddFreeGamesV2Activity.kt */
    public static final class i implements okhttp3.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EpicOrderGameObj f84086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f84087d;

        i(EpicOrderGameObj epicOrderGameObj, int i10) {
            this.f84086c = epicOrderGameObj;
            this.f84087d = i10;
        }

        @Override // okhttp3.f
        public void onFailure(@dl.d okhttp3.e call, @dl.d IOException e10) {
            if (PatchProxy.proxy(new Object[]{call, e10}, this, changeQuickRedirect, false, 32409, new Class[]{okhttp3.e.class, IOException.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(call, "call");
            kotlin.jvm.internal.f0.p(e10, "e");
            if (EpicAddFreeGamesV2Activity.this.isActive()) {
                com.max.hbcommon.utils.d.b("zzzzgifttest", "onFailure" + e10);
                e10.printStackTrace();
                EpicAddFreeGamesV2Activity.Q1(EpicAddFreeGamesV2Activity.this, this.f84086c, this.f84087d, e10);
            }
        }

        @Override // okhttp3.f
        public void onResponse(@dl.d okhttp3.e call, @dl.d okhttp3.c0 response) throws IOException {
            if (PatchProxy.proxy(new Object[]{call, response}, this, changeQuickRedirect, false, 32410, new Class[]{okhttp3.e.class, okhttp3.c0.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(call, "call");
            kotlin.jvm.internal.f0.p(response, "response");
            try {
                try {
                    if (!EpicAddFreeGamesV2Activity.this.isActive()) {
                        return;
                    }
                    try {
                        if (call.getCanceled()) {
                            throw new Exception("call.isCanceled()");
                        }
                        if (!response.c1()) {
                            throw new Exception("response.is not Successful()");
                        }
                        try {
                            Matcher matcher = Pattern.compile(EpicAddFreeGamesV2Activity.this.f84074a0).matcher(com.max.xiaoheihe.utils.d.m0(response));
                            if (!matcher.find()) {
                                throw new Exception("no purchaseToken");
                            }
                            String purchaseToken = matcher.group();
                            if (com.max.hbcommon.utils.c.u(purchaseToken)) {
                                throw new Exception("no purchaseToken");
                            }
                            EpicAddFreeGamesV2Activity epicAddFreeGamesV2Activity = EpicAddFreeGamesV2Activity.this;
                            EpicOrderGameObj epicOrderGameObj = this.f84086c;
                            kotlin.jvm.internal.f0.o(purchaseToken, "purchaseToken");
                            EpicAddFreeGamesV2Activity.m2(epicAddFreeGamesV2Activity, epicOrderGameObj, purchaseToken, 0);
                            okhttp3.d0 d0VarQ = response.q();
                            if (d0VarQ != null) {
                                d0VarQ.close();
                            }
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            EpicAddFreeGamesV2Activity.Q1(EpicAddFreeGamesV2Activity.this, this.f84086c, this.f84087d, e10);
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        EpicAddFreeGamesV2Activity.Q1(EpicAddFreeGamesV2Activity.this, this.f84086c, this.f84087d, e11);
                        okhttp3.d0 d0VarQ2 = response.q();
                        if (d0VarQ2 != null) {
                            d0VarQ2.close();
                        }
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            } catch (Throwable th2) {
                try {
                    okhttp3.d0 d0VarQ3 = response.q();
                    if (d0VarQ3 != null) {
                        d0VarQ3.close();
                    }
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: EpicAddFreeGamesV2Activity.kt */
    public static final class j implements okhttp3.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EpicOrderGameObj f84089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f84090d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ EpicOrderPreviewObj f84091e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f84092f;

        j(EpicOrderGameObj epicOrderGameObj, String str, EpicOrderPreviewObj epicOrderPreviewObj, int i10) {
            this.f84089c = epicOrderGameObj;
            this.f84090d = str;
            this.f84091e = epicOrderPreviewObj;
            this.f84092f = i10;
        }

        @Override // okhttp3.f
        public void onFailure(@dl.d okhttp3.e call, @dl.d IOException e10) {
            if (PatchProxy.proxy(new Object[]{call, e10}, this, changeQuickRedirect, false, 32411, new Class[]{okhttp3.e.class, IOException.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(call, "call");
            kotlin.jvm.internal.f0.p(e10, "e");
            if (EpicAddFreeGamesV2Activity.this.isActive()) {
                com.max.hbcommon.utils.d.b("zzzzgifttest", "onFailure" + e10);
                e10.printStackTrace();
                EpicAddFreeGamesV2Activity.j2(EpicAddFreeGamesV2Activity.this, this.f84089c, this.f84090d, this.f84091e, this.f84092f, e10);
            }
        }

        @Override // okhttp3.f
        public void onResponse(@dl.d okhttp3.e call, @dl.d okhttp3.c0 response) throws IOException {
            if (PatchProxy.proxy(new Object[]{call, response}, this, changeQuickRedirect, false, 32412, new Class[]{okhttp3.e.class, okhttp3.c0.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(call, "call");
            kotlin.jvm.internal.f0.p(response, "response");
            try {
                try {
                    if (!EpicAddFreeGamesV2Activity.this.isActive()) {
                        return;
                    }
                    try {
                        if (call.getCanceled()) {
                            throw new Exception("call.isCanceled()");
                        }
                        okhttp3.d0 d0VarQ = response.q();
                        kotlin.jvm.internal.f0.m(d0VarQ);
                        String strString = d0VarQ.string();
                        if (StringsKt__StringsKt.W2(strString, "already own this item", false, 2, null)) {
                            ((EpicOrderGameObj) EpicAddFreeGamesV2Activity.this.Q.get(EpicAddFreeGamesV2Activity.this.R)).setErrorMsg("already own this item");
                            com.max.hbutils.utils.c.f(EpicAddFreeGamesV2Activity.this.getResources().getString(R.string.already_own) + ((EpicOrderGameObj) EpicAddFreeGamesV2Activity.this.Q.get(EpicAddFreeGamesV2Activity.this.R)).getName());
                            EpicAddFreeGamesV2Activity epicAddFreeGamesV2Activity = EpicAddFreeGamesV2Activity.this;
                            epicAddFreeGamesV2Activity.f84076c0 = epicAddFreeGamesV2Activity.f84076c0 + 1;
                        } else {
                            if (!response.c1()) {
                                throw new Exception("response.is not Successful()");
                            }
                            ((EpicOrderGameObj) EpicAddFreeGamesV2Activity.this.Q.get(EpicAddFreeGamesV2Activity.this.R)).setGetSuccess(true);
                            com.max.hbutils.utils.c.f(EpicAddFreeGamesV2Activity.this.getResources().getString(R.string.receive_succeed) + ((EpicOrderGameObj) EpicAddFreeGamesV2Activity.this.Q.get(EpicAddFreeGamesV2Activity.this.R)).getName());
                        }
                        EpicAddFreeGamesV2Activity.q2(EpicAddFreeGamesV2Activity.this, this.f84089c.getAppid(), 1, null);
                        EpicAddFreeGamesV2Activity.f2(EpicAddFreeGamesV2Activity.this);
                        Log.d("purchaseOrderConfirm", strString);
                        okhttp3.d0 d0VarQ2 = response.q();
                        if (d0VarQ2 != null) {
                            d0VarQ2.close();
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        EpicAddFreeGamesV2Activity.j2(EpicAddFreeGamesV2Activity.this, this.f84089c, this.f84090d, this.f84091e, 5, e10);
                        okhttp3.d0 d0VarQ3 = response.q();
                        if (d0VarQ3 != null) {
                            d0VarQ3.close();
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        okhttp3.d0 d0VarQ4 = response.q();
                        if (d0VarQ4 != null) {
                            d0VarQ4.close();
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    throw th2;
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: EpicAddFreeGamesV2Activity.kt */
    public static final class k implements okhttp3.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EpicOrderGameObj f84094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f84095d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f84096e;

        k(EpicOrderGameObj epicOrderGameObj, String str, int i10) {
            this.f84094c = epicOrderGameObj;
            this.f84095d = str;
            this.f84096e = i10;
        }

        @Override // okhttp3.f
        public void onFailure(@dl.d okhttp3.e call, @dl.d IOException e10) {
            if (PatchProxy.proxy(new Object[]{call, e10}, this, changeQuickRedirect, false, 32413, new Class[]{okhttp3.e.class, IOException.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(call, "call");
            kotlin.jvm.internal.f0.p(e10, "e");
            if (EpicAddFreeGamesV2Activity.this.isActive()) {
                com.max.hbcommon.utils.d.b("zzzzgifttest", "onFailure" + e10);
                e10.printStackTrace();
                EpicAddFreeGamesV2Activity.n2(EpicAddFreeGamesV2Activity.this, this.f84094c, this.f84095d, this.f84096e, e10);
            }
        }

        @Override // okhttp3.f
        public void onResponse(@dl.d okhttp3.e call, @dl.d okhttp3.c0 response) throws IOException {
            if (PatchProxy.proxy(new Object[]{call, response}, this, changeQuickRedirect, false, 32414, new Class[]{okhttp3.e.class, okhttp3.c0.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(call, "call");
            kotlin.jvm.internal.f0.p(response, "response");
            try {
                try {
                    if (EpicAddFreeGamesV2Activity.this.isActive()) {
                        try {
                            if (call.getCanceled()) {
                                throw new Exception("call.isCanceled()");
                            }
                            if (!response.c1()) {
                                throw new Exception("response.is not Successful()");
                            }
                            okhttp3.d0 d0VarQ = response.q();
                            kotlin.jvm.internal.f0.m(d0VarQ);
                            String strString = d0VarQ.string();
                            EpicOrderPreviewObj epicOrderPreviewObj = (EpicOrderPreviewObj) new Gson().fromJson(strString, EpicOrderPreviewObj.class);
                            if (epicOrderPreviewObj == null) {
                                throw new Exception(strString);
                            }
                            EpicAddFreeGamesV2Activity.l2(EpicAddFreeGamesV2Activity.this, this.f84094c, this.f84095d, epicOrderPreviewObj, 0);
                            okhttp3.d0 d0VarQ2 = response.q();
                            if (d0VarQ2 != null) {
                                d0VarQ2.close();
                            }
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            EpicAddFreeGamesV2Activity.n2(EpicAddFreeGamesV2Activity.this, this.f84094c, this.f84095d, this.f84096e, e10);
                            okhttp3.d0 d0VarQ3 = response.q();
                            if (d0VarQ3 != null) {
                                d0VarQ3.close();
                            }
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } catch (Throwable th2) {
                try {
                    okhttp3.d0 d0VarQ4 = response.q();
                    if (d0VarQ4 != null) {
                        d0VarQ4.close();
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: EpicAddFreeGamesV2Activity.kt */
    public static final class l implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32415, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            EpicAddFreeGamesV2Activity.p2(EpicAddFreeGamesV2Activity.this);
        }
    }

    /* JADX INFO: compiled from: EpicAddFreeGamesV2Activity.kt */
    public static final class m extends WebviewFragment.o0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: EpicAddFreeGamesV2Activity.kt */
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ EpicAddFreeGamesV2Activity f84099b;

            a(EpicAddFreeGamesV2Activity epicAddFreeGamesV2Activity) {
                this.f84099b = epicAddFreeGamesV2Activity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32418, new Class[0], Void.TYPE).isSupported && this.f84099b.isActive()) {
                    this.f84099b.Y = "status_not_activate";
                    EpicAddFreeGamesV2Activity.C2(this.f84099b);
                }
            }
        }

        /* JADX INFO: compiled from: EpicAddFreeGamesV2Activity.kt */
        public static final class b implements okhttp3.u {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f84100a = new b();
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // okhttp3.u
            @dl.d
            public final okhttp3.c0 intercept(@dl.d okhttp3.u.a chain) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{chain}, this, changeQuickRedirect, false, 32419, new Class[]{okhttp3.u.a.class}, okhttp3.c0.class);
                if (patchProxyResultProxy.isSupported) {
                    return (okhttp3.c0) patchProxyResultProxy.result;
                }
                kotlin.jvm.internal.f0.p(chain, "chain");
                okhttp3.a0 a0VarRequest = chain.request();
                return chain.proceed(a0VarRequest.n().n("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/93.0.4577.63 Safari/537.36").D(a0VarRequest.q().H().h()).b());
            }
        }

        m() {
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void i(@dl.e WebView webView, @dl.e String str, int i10, int i11) {
            boolean zG;
            SteamAcceptGameParams login_param;
            String regular;
            SteamAcceptGameParams login_success_param;
            String regular2;
            SteamAcceptGameParams login_success_param2;
            String regular3;
            boolean zG2 = false;
            Object[] objArr = {webView, str, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 32417, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            super.i(webView, str, i10, i11);
            Boolean boolValueOf = null;
            if (str != null) {
                EpicLoginParam epicLoginParam = EpicAddFreeGamesV2Activity.this.M;
                zG = kotlin.jvm.internal.f0.g((epicLoginParam == null || (login_success_param2 = epicLoginParam.getLogin_success_param()) == null || (regular3 = login_success_param2.getRegular()) == null) ? null : Boolean.valueOf(new Regex(regular3).b(str)), Boolean.TRUE);
            } else {
                zG = false;
            }
            if (!zG) {
                if (str != null) {
                    EpicLoginParam epicLoginParam2 = EpicAddFreeGamesV2Activity.this.M;
                    if (epicLoginParam2 != null && (login_param = epicLoginParam2.getLogin_param()) != null && (regular = login_param.getRegular()) != null) {
                        boolValueOf = Boolean.valueOf(new Regex(regular).b(str));
                    }
                    zG2 = kotlin.jvm.internal.f0.g(boolValueOf, Boolean.TRUE);
                }
                if (zG2) {
                    EpicAddFreeGamesV2Activity.h2(EpicAddFreeGamesV2Activity.this);
                    return;
                }
                return;
            }
            EpicAddFreeGamesV2Activity epicAddFreeGamesV2Activity = EpicAddFreeGamesV2Activity.this;
            epicAddFreeGamesV2Activity.runOnUiThread(new a(epicAddFreeGamesV2Activity));
            if (i11 - 1 == 0) {
                EpicLoginParam epicLoginParam3 = EpicAddFreeGamesV2Activity.this.M;
                if (epicLoginParam3 != null && (login_success_param = epicLoginParam3.getLogin_success_param()) != null && (regular2 = login_success_param.getRegular()) != null && new Regex(regular2).b(str)) {
                    zG2 = true;
                }
                if (zG2) {
                    EpicAddFreeGamesV2Activity epicAddFreeGamesV2Activity2 = EpicAddFreeGamesV2Activity.this;
                    epicAddFreeGamesV2Activity2.P = new com.max.xiaoheihe.module.game.j(new ka.d(((BaseActivity) epicAddFreeGamesV2Activity2).f66601b));
                    if (EpicAddFreeGamesV2Activity.this.P != null) {
                        EpicAddFreeGamesV2Activity epicAddFreeGamesV2Activity3 = EpicAddFreeGamesV2Activity.this;
                        okhttp3.z.a aVarE0 = new okhttp3.z().e0();
                        com.max.xiaoheihe.module.game.j jVar = epicAddFreeGamesV2Activity3.P;
                        kotlin.jvm.internal.f0.m(jVar);
                        epicAddFreeGamesV2Activity3.O = aVarE0.o(jVar).d(new com.max.xiaoheihe.network.g()).c(b.f84100a).f();
                    }
                    EpicAddFreeGamesV2Activity.M1(EpicAddFreeGamesV2Activity.this);
                }
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void o(@dl.d WebView view, @dl.d String receivedTitle) {
            if (PatchProxy.proxy(new Object[]{view, receivedTitle}, this, changeQuickRedirect, false, 32416, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(view, "view");
            kotlin.jvm.internal.f0.p(receivedTitle, "receivedTitle");
            if (com.max.hbcommon.utils.c.u(receivedTitle) || ((BaseActivity) EpicAddFreeGamesV2Activity.this).f66616q == null || ((BaseActivity) EpicAddFreeGamesV2Activity.this).f66616q.getVisibility() != 0) {
                return;
            }
            if (kotlin.text.u.L1("about:blank", receivedTitle, true)) {
                receivedTitle = EpicAddFreeGamesV2Activity.this.getString(R.string.loading);
            }
            ((BaseActivity) EpicAddFreeGamesV2Activity.this).f66616q.setTitle(receivedTitle);
        }
    }

    /* JADX INFO: compiled from: EpicAddFreeGamesV2Activity.kt */
    public static final class n implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f84102c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f84103d;

        /* JADX INFO: compiled from: EpicAddFreeGamesV2Activity.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f84104b;

            a(b bVar) {
                this.f84104b = bVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b bVar;
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32421, new Class[]{View.class}, Void.TYPE).isSupported || (bVar = this.f84104b) == null) {
                    return;
                }
                bVar.next();
            }
        }

        /* JADX INFO: compiled from: EpicAddFreeGamesV2Activity.kt */
        public static final class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f84105b;

            b(b bVar) {
                this.f84105b = bVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b bVar;
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32422, new Class[]{View.class}, Void.TYPE).isSupported || (bVar = this.f84105b) == null) {
                    return;
                }
                bVar.next();
            }
        }

        n(String str, b bVar) {
            this.f84102c = str;
            this.f84103d = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32420, new Class[0], Void.TYPE).isSupported || EpicAddFreeGamesV2Activity.this.N == null) {
                return;
            }
            Dialog dialog = EpicAddFreeGamesV2Activity.this.N;
            kotlin.jvm.internal.f0.m(dialog);
            if (dialog.isShowing()) {
                if (kotlin.jvm.internal.f0.g("status_not_activate", EpicAddFreeGamesV2Activity.this.Y) || kotlin.jvm.internal.f0.g("status_activating", EpicAddFreeGamesV2Activity.this.Y)) {
                    ProgressBar progressBarX2 = EpicAddFreeGamesV2Activity.this.X2();
                    kotlin.jvm.internal.f0.m(progressBarX2);
                    progressBarX2.setVisibility(0);
                    TextView textViewW2 = EpicAddFreeGamesV2Activity.this.W2();
                    kotlin.jvm.internal.f0.m(textViewW2);
                    textViewW2.setText(EpicAddFreeGamesV2Activity.this.getString(R.string.receiving_please_wait));
                    TextView textViewV2 = EpicAddFreeGamesV2Activity.this.V2();
                    kotlin.jvm.internal.f0.m(textViewV2);
                    textViewV2.setTextColor(EpicAddFreeGamesV2Activity.this.getResources().getColor(R.color.interactive_color));
                    TextView textViewV3 = EpicAddFreeGamesV2Activity.this.V2();
                    kotlin.jvm.internal.f0.m(textViewV3);
                    textViewV3.setText(this.f84102c);
                    Drawable drawable = EpicAddFreeGamesV2Activity.this.getResources().getDrawable(R.drawable.pb_loading);
                    kotlin.jvm.internal.f0.n(drawable, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                    AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
                    ImageView imageViewT2 = EpicAddFreeGamesV2Activity.this.T2();
                    kotlin.jvm.internal.f0.m(imageViewT2);
                    imageViewT2.setImageDrawable(animationDrawable);
                    animationDrawable.start();
                    View viewQ2 = EpicAddFreeGamesV2Activity.this.Q2();
                    kotlin.jvm.internal.f0.m(viewQ2);
                    viewQ2.setVisibility(8);
                    return;
                }
                if (kotlin.jvm.internal.f0.g("status_all_activate_succeed", EpicAddFreeGamesV2Activity.this.Y)) {
                    ProgressBar progressBarX3 = EpicAddFreeGamesV2Activity.this.X2();
                    kotlin.jvm.internal.f0.m(progressBarX3);
                    progressBarX3.setVisibility(8);
                    TextView textViewW3 = EpicAddFreeGamesV2Activity.this.W2();
                    kotlin.jvm.internal.f0.m(textViewW3);
                    textViewW3.setText(EpicAddFreeGamesV2Activity.this.getString(R.string.receive_completed));
                    TextView textViewV4 = EpicAddFreeGamesV2Activity.this.V2();
                    kotlin.jvm.internal.f0.m(textViewV4);
                    textViewV4.setText(this.f84102c);
                    TextView textViewV5 = EpicAddFreeGamesV2Activity.this.V2();
                    kotlin.jvm.internal.f0.m(textViewV5);
                    textViewV5.setTextColor(EpicAddFreeGamesV2Activity.this.getResources().getColor(R.color.interactive_color));
                    ImageView imageViewT3 = EpicAddFreeGamesV2Activity.this.T2();
                    kotlin.jvm.internal.f0.m(imageViewT3);
                    imageViewT3.setImageResource(R.color.interactive_color);
                    View viewQ3 = EpicAddFreeGamesV2Activity.this.Q2();
                    kotlin.jvm.internal.f0.m(viewQ3);
                    viewQ3.setVisibility(0);
                    TextView textViewS2 = EpicAddFreeGamesV2Activity.this.S2();
                    kotlin.jvm.internal.f0.m(textViewS2);
                    textViewS2.setVisibility(0);
                    TextView textViewS3 = EpicAddFreeGamesV2Activity.this.S2();
                    kotlin.jvm.internal.f0.m(textViewS3);
                    textViewS3.setOnClickListener(new a(this.f84103d));
                    return;
                }
                if (kotlin.jvm.internal.f0.g("status_all_activate_failed", EpicAddFreeGamesV2Activity.this.Y)) {
                    ProgressBar progressBarX4 = EpicAddFreeGamesV2Activity.this.X2();
                    kotlin.jvm.internal.f0.m(progressBarX4);
                    progressBarX4.setVisibility(8);
                    TextView textViewW4 = EpicAddFreeGamesV2Activity.this.W2();
                    kotlin.jvm.internal.f0.m(textViewW4);
                    textViewW4.setText(EpicAddFreeGamesV2Activity.this.getString(R.string.receive_failed));
                    TextView textViewV6 = EpicAddFreeGamesV2Activity.this.V2();
                    kotlin.jvm.internal.f0.m(textViewV6);
                    textViewV6.setText(this.f84102c);
                    TextView textViewV7 = EpicAddFreeGamesV2Activity.this.V2();
                    kotlin.jvm.internal.f0.m(textViewV7);
                    textViewV7.setTextColor(EpicAddFreeGamesV2Activity.this.getResources().getColor(R.color.badge_bg_color));
                    Drawable drawable2 = EpicAddFreeGamesV2Activity.this.getResources().getDrawable(R.drawable.pb_loading_timeout);
                    kotlin.jvm.internal.f0.n(drawable2, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                    ImageView imageViewT4 = EpicAddFreeGamesV2Activity.this.T2();
                    kotlin.jvm.internal.f0.m(imageViewT4);
                    imageViewT4.setImageDrawable((AnimationDrawable) drawable2);
                    View viewQ4 = EpicAddFreeGamesV2Activity.this.Q2();
                    kotlin.jvm.internal.f0.m(viewQ4);
                    viewQ4.setVisibility(0);
                    TextView textViewS4 = EpicAddFreeGamesV2Activity.this.S2();
                    kotlin.jvm.internal.f0.m(textViewS4);
                    textViewS4.setVisibility(0);
                    TextView textViewS5 = EpicAddFreeGamesV2Activity.this.S2();
                    kotlin.jvm.internal.f0.m(textViewS5);
                    textViewS5.setOnClickListener(new b(this.f84103d));
                }
            }
        }
    }

    private final void A3(WebviewFragment webviewFragment) {
        if (PatchProxy.proxy(new Object[]{webviewFragment}, this, changeQuickRedirect, false, 32350, new Class[]{WebviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewFragment.Y7(new m());
    }

    public static final /* synthetic */ void B2(EpicAddFreeGamesV2Activity epicAddFreeGamesV2Activity, WebviewFragment webviewFragment) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesV2Activity, webviewFragment}, null, changeQuickRedirect, true, 32380, new Class[]{EpicAddFreeGamesV2Activity.class, WebviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesV2Activity.A3(webviewFragment);
    }

    private final void B3() {
        Activity activity;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32370, new Class[0], Void.TYPE).isSupported || (activity = this.f66601b) == null || activity.isFinishing()) {
            return;
        }
        if (this.N == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f66601b);
            View viewInflate = this.f66602c.inflate(R.layout.dialog_activation, (ViewGroup) null, false);
            View viewFindViewById = viewInflate.findViewById(R.id.pb_title);
            kotlin.jvm.internal.f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.ProgressBar");
            this.S = (ProgressBar) viewFindViewById;
            View viewFindViewById2 = viewInflate.findViewById(R.id.tv_title);
            kotlin.jvm.internal.f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.T = (TextView) viewFindViewById2;
            View viewFindViewById3 = viewInflate.findViewById(R.id.tv_progress_0);
            kotlin.jvm.internal.f0.n(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
            this.U = (TextView) viewFindViewById3;
            View viewFindViewById4 = viewInflate.findViewById(R.id.tv_progress_desc_0);
            kotlin.jvm.internal.f0.n(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) viewFindViewById4;
            View viewFindViewById5 = viewInflate.findViewById(R.id.pb_0);
            kotlin.jvm.internal.f0.n(viewFindViewById5, "null cannot be cast to non-null type android.widget.ImageView");
            this.V = (ImageView) viewFindViewById5;
            this.W = viewInflate.findViewById(R.id.vg_button_panel);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_negative_button);
            this.X = (TextView) viewInflate.findViewById(R.id.tv_positive_button);
            TextView textView3 = this.U;
            if (textView3 != null) {
                textView3.setText((CharSequence) null);
            }
            textView.setText((CharSequence) null);
            textView2.setVisibility(8);
            AlertDialog alertDialogCreate = builder.setView(viewInflate).setCancelable(true).create();
            this.N = alertDialogCreate;
            Window window = alertDialogCreate != null ? alertDialogCreate.getWindow() : null;
            if (window != null) {
                window.setBackgroundDrawableResource(android.R.color.transparent);
            }
        }
        Dialog dialog = this.N;
        if (dialog != null && !dialog.isShowing()) {
            z10 = true;
        }
        if (z10) {
            Dialog dialog2 = this.N;
            if (dialog2 != null) {
                dialog2.show();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.R + 1);
            sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb2.append(this.Q.size());
            D3(sb2.toString(), null);
        }
    }

    public static final /* synthetic */ void C2(EpicAddFreeGamesV2Activity epicAddFreeGamesV2Activity) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesV2Activity}, null, changeQuickRedirect, true, 32376, new Class[]{EpicAddFreeGamesV2Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesV2Activity.B3();
    }

    public static final /* synthetic */ void D2(EpicAddFreeGamesV2Activity epicAddFreeGamesV2Activity) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesV2Activity}, null, changeQuickRedirect, true, 32381, new Class[]{EpicAddFreeGamesV2Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesV2Activity.x1();
    }

    private final void D3(String str, b bVar) {
        if (!PatchProxy.proxy(new Object[]{str, bVar}, this, changeQuickRedirect, false, 32373, new Class[]{String.class, b.class}, Void.TYPE).isSupported && isActive()) {
            runOnUiThread(new n(str, bVar));
        }
    }

    public static final /* synthetic */ void E2(EpicAddFreeGamesV2Activity epicAddFreeGamesV2Activity) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesV2Activity}, null, changeQuickRedirect, true, 32379, new Class[]{EpicAddFreeGamesV2Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesV2Activity.C1();
    }

    private final void G2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32352, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        okhttp3.a0.a aVarB = new okhttp3.a0.a().B(com.max.xiaoheihe.module.game.j.f87763d);
        okhttp3.z zVar = this.O;
        kotlin.jvm.internal.f0.m(zVar);
        zVar.a(aVarB.b()).enqueue(new c());
    }

    private final void H2(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 32354, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String strI2 = I2();
        if (strI2 == null) {
            h3();
            return;
        }
        okhttp3.z zVar = this.O;
        kotlin.jvm.internal.f0.m(zVar);
        zVar.a(new okhttp3.a0.a().g().B(strI2).b()).enqueue(new d(i10));
    }

    private final String I2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32355, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        SteamWalletJsObj steamWalletJsObj = this.f84075b0;
        if (steamWalletJsObj == null) {
            return null;
        }
        kotlin.jvm.internal.f0.m(steamWalletJsObj);
        SteamAcceptGameParams addfreelicense_epic = steamWalletJsObj.getAddfreelicense_epic();
        EpicOrderGameObj epicOrderGameObj = this.Q.get(this.R);
        String checkUrl = kotlin.jvm.internal.f0.g("bundle", epicOrderGameObj.getType()) ? addfreelicense_epic.getUrl_bundle() : addfreelicense_epic.getUrl();
        String name = epicOrderGameObj.getName();
        if (name == null) {
            return null;
        }
        kotlin.jvm.internal.f0.o(checkUrl, "checkUrl");
        String key = addfreelicense_epic.getKey();
        kotlin.jvm.internal.f0.o(key, "params.key");
        return new Regex(key).m(checkUrl, name);
    }

    private final void J2(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 32365, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        r3(EpicDetailInfo.EPIC_ID_URL, new e(i10), true);
    }

    private final void K2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32351, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Y3().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    private final void L2(EpicOrderGameObj epicOrderGameObj, int i10, Exception exc) {
        if (PatchProxy.proxy(new Object[]{epicOrderGameObj, new Integer(i10), exc}, this, changeQuickRedirect, false, 32361, new Class[]{EpicOrderGameObj.class, Integer.TYPE, Exception.class}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 < 5) {
            g3(epicOrderGameObj, i10 + 1);
        } else {
            O2(epicOrderGameObj, exc);
        }
    }

    public static final /* synthetic */ void M1(EpicAddFreeGamesV2Activity epicAddFreeGamesV2Activity) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesV2Activity}, null, changeQuickRedirect, true, 32377, new Class[]{EpicAddFreeGamesV2Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesV2Activity.G2();
    }

    public static final /* synthetic */ void N1(EpicAddFreeGamesV2Activity epicAddFreeGamesV2Activity, int i10) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesV2Activity, new Integer(i10)}, null, changeQuickRedirect, true, 32384, new Class[]{EpicAddFreeGamesV2Activity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesV2Activity.H2(i10);
    }

    public static final /* synthetic */ void O1(EpicAddFreeGamesV2Activity epicAddFreeGamesV2Activity, int i10) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesV2Activity, new Integer(i10)}, null, changeQuickRedirect, true, 32383, new Class[]{EpicAddFreeGamesV2Activity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesV2Activity.J2(i10);
    }

    private final void O2(EpicOrderGameObj epicOrderGameObj, Exception exc) {
        if (PatchProxy.proxy(new Object[]{epicOrderGameObj, exc}, this, changeQuickRedirect, false, 32364, new Class[]{EpicOrderGameObj.class, Exception.class}, Void.TYPE).isSupported) {
            return;
        }
        epicOrderGameObj.setErrorMsg(exc.getMessage());
        q3(epicOrderGameObj.getAppid(), 4, exc.getMessage());
        Y2();
    }

    @dl.d
    @xh.m
    public static final Intent P2(@dl.d Context context, @dl.e String str, @dl.e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, 32375, new Class[]{Context.class, String.class, String.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : f84070p1.a(context, str, str2);
    }

    public static final /* synthetic */ void Q1(EpicAddFreeGamesV2Activity epicAddFreeGamesV2Activity, EpicOrderGameObj epicOrderGameObj, int i10, Exception exc) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesV2Activity, epicOrderGameObj, new Integer(i10), exc}, null, changeQuickRedirect, true, 32387, new Class[]{EpicAddFreeGamesV2Activity.class, EpicOrderGameObj.class, Integer.TYPE, Exception.class}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesV2Activity.L2(epicOrderGameObj, i10, exc);
    }

    private final void Y2() {
        String str;
        int i10 = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32360, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int i11 = this.R + 1;
        this.R = i11;
        if (i11 < this.Q.size()) {
            this.Y = "status_not_activate";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.R + 1);
            sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb2.append(this.Q.size());
            D3(sb2.toString(), null);
            H2(0);
            return;
        }
        Iterator<EpicOrderGameObj> it = this.Q.iterator();
        while (it.hasNext()) {
            if (it.next().isGetSuccess()) {
                i10++;
            }
        }
        if (i10 == 0 && this.f84076c0 == 0) {
            this.Y = "status_all_activate_failed";
            str = "领取失败" + this.Q.size() + (char) 27454;
        } else if (i10 == this.Q.size()) {
            this.Y = "status_all_activate_succeed";
            str = "领取成功" + i10 + (char) 27454;
        } else {
            this.Y = "status_all_activate_succeed";
            str = "领取成功" + i10 + "款 已拥有" + this.f84076c0 + "款 领取失败" + ((this.Q.size() - i10) - this.f84076c0) + (char) 27454;
        }
        D3(str, new g());
    }

    private final void a3() {
        Activity activity;
        Dialog dialog;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32371, new Class[0], Void.TYPE).isSupported || (activity = this.f66601b) == null || activity.isFinishing()) {
            return;
        }
        Dialog dialog2 = this.N;
        if (dialog2 != null && dialog2.isShowing()) {
            z10 = true;
        }
        if (!z10 || (dialog = this.N) == null) {
            return;
        }
        dialog.dismiss();
    }

    private final void e3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32353, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.R = 0;
        this.f84076c0 = 0;
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().h7("addfreelicense_epic").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h()));
    }

    public static final /* synthetic */ void f2(EpicAddFreeGamesV2Activity epicAddFreeGamesV2Activity) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesV2Activity}, null, changeQuickRedirect, true, 32385, new Class[]{EpicAddFreeGamesV2Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesV2Activity.Y2();
    }

    private final void f3(EpicOrderGameObj epicOrderGameObj, String str, EpicOrderPreviewObj epicOrderPreviewObj, int i10, Exception exc) {
        if (PatchProxy.proxy(new Object[]{epicOrderGameObj, str, epicOrderPreviewObj, new Integer(i10), exc}, this, changeQuickRedirect, false, 32363, new Class[]{EpicOrderGameObj.class, String.class, EpicOrderPreviewObj.class, Integer.TYPE, Exception.class}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 < 5) {
            i3(epicOrderGameObj, str, epicOrderPreviewObj, i10 + 1);
        } else {
            O2(epicOrderGameObj, exc);
        }
    }

    private final void g3(EpicOrderGameObj epicOrderGameObj, int i10) {
        if (PatchProxy.proxy(new Object[]{epicOrderGameObj, new Integer(i10)}, this, changeQuickRedirect, false, 32357, new Class[]{EpicOrderGameObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String str = (EpicDetailInfo.EPIC_PURCHASE_URL + "&namespace=" + epicOrderGameObj.getNamespace()) + "&offers=" + epicOrderGameObj.getOfferId() + "#/purchase/payment-methods";
        okhttp3.z zVar = this.O;
        kotlin.jvm.internal.f0.m(zVar);
        zVar.a(new okhttp3.a0.a().g().B(str).b()).enqueue(new i(epicOrderGameObj, i10));
    }

    public static final /* synthetic */ void h2(EpicAddFreeGamesV2Activity epicAddFreeGamesV2Activity) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesV2Activity}, null, changeQuickRedirect, true, 32378, new Class[]{EpicAddFreeGamesV2Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesV2Activity.a3();
    }

    private final void h3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32356, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.R < this.Q.size()) {
            g3(this.Q.get(this.R), 0);
        } else {
            Y2();
        }
    }

    public static final /* synthetic */ void i2(EpicAddFreeGamesV2Activity epicAddFreeGamesV2Activity) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesV2Activity}, null, changeQuickRedirect, true, 32393, new Class[]{EpicAddFreeGamesV2Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesV2Activity.e3();
    }

    private final void i3(EpicOrderGameObj epicOrderGameObj, String str, EpicOrderPreviewObj epicOrderPreviewObj, int i10) {
        if (PatchProxy.proxy(new Object[]{epicOrderGameObj, str, epicOrderPreviewObj, new Integer(i10)}, this, changeQuickRedirect, false, 32359, new Class[]{EpicOrderGameObj.class, String.class, EpicOrderPreviewObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        okhttp3.z zVar = this.O;
        EpicOrderConfirmObj epicOrderConfirmObj = new EpicOrderConfirmObj(epicOrderPreviewObj.getUseDefault(), epicOrderPreviewObj.getUseDefault(), epicOrderPreviewObj.getNamespace(), epicOrderPreviewObj.getCountry(), epicOrderPreviewObj.getCountryName(), epicOrderPreviewObj.getOrderId(), epicOrderPreviewObj.getOrderComplete(), epicOrderPreviewObj.getOrderError(), epicOrderPreviewObj.getOrderPending(), epicOrderPreviewObj.getOffers(), epicOrderPreviewObj.getOfferPrice(), null, false, 0, "", "", "", null, epicOrderPreviewObj.getSyncToken(), null, null, true, true);
        okhttp3.b0.Companion companion = okhttp3.b0.INSTANCE;
        String json = new Gson().toJson(epicOrderConfirmObj);
        kotlin.jvm.internal.f0.o(json, "Gson().toJson(orderConfirmObj)");
        okhttp3.e eVarA = zVar != null ? zVar.a(new okhttp3.a0.a().a("Accept", "application/json, text/plain, */*").a("Content-Type", FastJsonJsonView.DEFAULT_CONTENT_TYPE).a("x-requested-with", str).r(companion.b(json, okhttp3.v.INSTANCE.d(FastJsonJsonView.DEFAULT_CONTENT_TYPE))).B(EpicDetailInfo.EPIC_ORDER_CONFIRM_ENDPOINT).b()) : null;
        if (eVarA != null) {
            eVarA.enqueue(new j(epicOrderGameObj, str, epicOrderPreviewObj, i10));
        }
    }

    public static final /* synthetic */ void j2(EpicAddFreeGamesV2Activity epicAddFreeGamesV2Activity, EpicOrderGameObj epicOrderGameObj, String str, EpicOrderPreviewObj epicOrderPreviewObj, int i10, Exception exc) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesV2Activity, epicOrderGameObj, str, epicOrderPreviewObj, new Integer(i10), exc}, null, changeQuickRedirect, true, 32391, new Class[]{EpicAddFreeGamesV2Activity.class, EpicOrderGameObj.class, String.class, EpicOrderPreviewObj.class, Integer.TYPE, Exception.class}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesV2Activity.f3(epicOrderGameObj, str, epicOrderPreviewObj, i10, exc);
    }

    public static final /* synthetic */ void k2(EpicAddFreeGamesV2Activity epicAddFreeGamesV2Activity) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesV2Activity}, null, changeQuickRedirect, true, 32386, new Class[]{EpicAddFreeGamesV2Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesV2Activity.h3();
    }

    private final void k3(EpicOrderGameObj epicOrderGameObj, String str, int i10) {
        if (PatchProxy.proxy(new Object[]{epicOrderGameObj, str, new Integer(i10)}, this, changeQuickRedirect, false, 32358, new Class[]{EpicOrderGameObj.class, String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        okhttp3.z zVar = this.O;
        ArrayList arrayList = new ArrayList();
        String offerId = epicOrderGameObj.getOfferId();
        if (offerId != null) {
            arrayList.add(offerId);
        }
        EpicOrderPreviewObj epicOrderPreviewObj = new EpicOrderPreviewObj(true, false, epicOrderGameObj.getNamespace(), null, null, null, null, null, null, arrayList, "", null);
        okhttp3.b0.Companion companion = okhttp3.b0.INSTANCE;
        String json = new Gson().toJson(epicOrderPreviewObj);
        kotlin.jvm.internal.f0.o(json, "Gson().toJson(epicOrderPreviewObj)");
        okhttp3.e eVarA = zVar != null ? zVar.a(new okhttp3.a0.a().a("x-requested-with", str).r(companion.b(json, okhttp3.v.INSTANCE.d(FastJsonJsonView.DEFAULT_CONTENT_TYPE))).B(EpicDetailInfo.EPIC_ORDER_PREVIEW_ENDPOINT).b()) : null;
        if (eVarA != null) {
            eVarA.enqueue(new k(epicOrderGameObj, str, i10));
        }
    }

    public static final /* synthetic */ void l2(EpicAddFreeGamesV2Activity epicAddFreeGamesV2Activity, EpicOrderGameObj epicOrderGameObj, String str, EpicOrderPreviewObj epicOrderPreviewObj, int i10) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesV2Activity, epicOrderGameObj, str, epicOrderPreviewObj, new Integer(i10)}, null, changeQuickRedirect, true, 32390, new Class[]{EpicAddFreeGamesV2Activity.class, EpicOrderGameObj.class, String.class, EpicOrderPreviewObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesV2Activity.i3(epicOrderGameObj, str, epicOrderPreviewObj, i10);
    }

    private final void l3(EpicOrderGameObj epicOrderGameObj, String str, int i10, Exception exc) {
        if (PatchProxy.proxy(new Object[]{epicOrderGameObj, str, new Integer(i10), exc}, this, changeQuickRedirect, false, 32362, new Class[]{EpicOrderGameObj.class, String.class, Integer.TYPE, Exception.class}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 < 5) {
            k3(epicOrderGameObj, str, i10 + 1);
        } else {
            O2(epicOrderGameObj, exc);
        }
    }

    public static final /* synthetic */ void m2(EpicAddFreeGamesV2Activity epicAddFreeGamesV2Activity, EpicOrderGameObj epicOrderGameObj, String str, int i10) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesV2Activity, epicOrderGameObj, str, new Integer(i10)}, null, changeQuickRedirect, true, 32388, new Class[]{EpicAddFreeGamesV2Activity.class, EpicOrderGameObj.class, String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesV2Activity.k3(epicOrderGameObj, str, i10);
    }

    public static final /* synthetic */ void n2(EpicAddFreeGamesV2Activity epicAddFreeGamesV2Activity, EpicOrderGameObj epicOrderGameObj, String str, int i10, Exception exc) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesV2Activity, epicOrderGameObj, str, new Integer(i10), exc}, null, changeQuickRedirect, true, 32389, new Class[]{EpicAddFreeGamesV2Activity.class, EpicOrderGameObj.class, String.class, Integer.TYPE, Exception.class}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesV2Activity.l3(epicOrderGameObj, str, i10, exc);
    }

    private final void n3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32368, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        runOnUiThread(new l());
    }

    public static final /* synthetic */ void o2(EpicAddFreeGamesV2Activity epicAddFreeGamesV2Activity) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesV2Activity}, null, changeQuickRedirect, true, 32382, new Class[]{EpicAddFreeGamesV2Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesV2Activity.n3();
    }

    public static final /* synthetic */ void p2(EpicAddFreeGamesV2Activity epicAddFreeGamesV2Activity) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesV2Activity}, null, changeQuickRedirect, true, 32394, new Class[]{EpicAddFreeGamesV2Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesV2Activity.p3();
    }

    private final void p3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32369, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.R = 0;
        Activity activity = this.f66601b;
        EpicLoginParam epicLoginParam = this.M;
        kotlin.jvm.internal.f0.m(epicLoginParam);
        com.max.xiaoheihe.utils.d.k(activity, epicLoginParam.getLogin_param().getUrl());
        EpicLoginParam epicLoginParam2 = this.M;
        kotlin.jvm.internal.f0.m(epicLoginParam2);
        WebviewFragment webviewFragmentA = new com.max.xiaoheihe.module.webview.u(epicLoginParam2.getLogin_param().getUrl()).v(true).a();
        A3(webviewFragmentA);
        getSupportFragmentManager().u().y(R.id.fragment_container, webviewFragmentA).n();
    }

    public static final /* synthetic */ void q2(EpicAddFreeGamesV2Activity epicAddFreeGamesV2Activity, String str, int i10, String str2) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesV2Activity, str, new Integer(i10), str2}, null, changeQuickRedirect, true, 32392, new Class[]{EpicAddFreeGamesV2Activity.class, String.class, Integer.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesV2Activity.q3(str, i10, str2);
    }

    private final void q3(String str, int i10, String str2) {
        if (PatchProxy.proxy(new Object[]{str, new Integer(i10), str2}, this, changeQuickRedirect, false, 32367, new Class[]{String.class, Integer.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("appid", str);
        jsonObject.addProperty("result_type", Integer.valueOf(i10));
        jsonObject.addProperty(androidx.core.app.o0.N0, str2);
        jsonObject.addProperty("epic_id", this.Z);
        PostEncryptParamsObj postEncryptParamsObjU0 = com.max.xiaoheihe.utils.d.u0(com.max.hbutils.utils.k.q(jsonObject));
        com.max.xiaoheihe.network.i.a().K9("epic", postEncryptParamsObjU0.getData(), postEncryptParamsObjU0.getKey(), postEncryptParamsObjU0.getSid(), postEncryptParamsObjU0.getTime()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.p());
    }

    private final void r3(String str, com.max.xiaoheihe.network.h hVar, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, hVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32366, new Class[]{String.class, com.max.xiaoheihe.network.h.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        okhttp3.z zVar = this.O;
        kotlin.jvm.internal.f0.m(zVar);
        com.max.xiaoheihe.network.f.a(zVar.a(new okhttp3.a0.a().g().B(str).b()), hVar);
    }

    public final void C3() {
        Dialog dialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32372, new Class[0], Void.TYPE).isSupported || this.N == null) {
            return;
        }
        if ((kotlin.jvm.internal.f0.g("status_not_activate", this.Y) || kotlin.jvm.internal.f0.g("status_activating", this.Y)) && (dialog = this.N) != null) {
            dialog.setCancelable(true);
        }
    }

    @dl.e
    public final View Q2() {
        return this.W;
    }

    @dl.e
    public final TextView S2() {
        return this.X;
    }

    @dl.e
    public final ImageView T2() {
        return this.V;
    }

    @dl.e
    public final TextView V2() {
        return this.U;
    }

    @dl.e
    public final TextView W2() {
        return this.T;
    }

    @dl.e
    public final ProgressBar X2() {
        return this.S;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32349, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.k1();
        ca0 ca0VarC = ca0.c(getLayoutInflater());
        kotlin.jvm.internal.f0.o(ca0VarC, "inflate(layoutInflater)");
        this.L = ca0VarC;
        if (ca0VarC == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            ca0VarC = null;
        }
        setContentView(ca0VarC.b());
        String stringExtra = getIntent().getStringExtra(f84073y1);
        String stringExtra2 = getIntent().getStringExtra(f84071p2);
        this.f84074a0 = stringExtra2;
        if (!com.max.hbcommon.utils.c.u(stringExtra2)) {
            this.f84074a0 = "(?<=id=\"purchaseToken\" value=\")((?!\").)*";
        }
        if (com.max.hbcommon.utils.c.u(stringExtra)) {
            com.max.hbutils.utils.c.f(getString(R.string.receive_failed));
            finish();
            return;
        }
        List<EpicOrderGameObj> listB = com.max.hbutils.utils.k.b(stringExtra, EpicOrderGameObj.class);
        kotlin.jvm.internal.f0.o(listB, "deserializeList(mIds, Ep…OrderGameObj::class.java)");
        this.Q = listB;
        if (com.max.hbcommon.utils.c.w(listB)) {
            com.max.hbutils.utils.c.f(getString(R.string.receive_failed));
            finish();
        } else {
            this.f66616q.setTitle("获取Epic游戏");
            K2();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32374, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.n1();
        this.R = 0;
        a3();
        E1();
        K2();
    }

    public final void s3(@dl.e TextView textView) {
        this.X = textView;
    }

    public final void setMDialogButtonPanelView(@dl.e View view) {
        this.W = view;
    }

    public final void t3(@dl.e ImageView imageView) {
        this.V = imageView;
    }

    public final void u3(@dl.e TextView textView) {
        this.U = textView;
    }

    public final void w3(@dl.e TextView textView) {
        this.T = textView;
    }

    public final void y3(@dl.e ProgressBar progressBar) {
        this.S = progressBar;
    }
}
