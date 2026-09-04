package com.max.xiaoheihe.flutter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.o;
import com.google.gson.JsonObject;
import com.max.hbcommon.analytics.d;
import com.max.hbcommon.analytics.j;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbcommon.utils.c;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.flutter.pigeon.HBHybridShare;
import com.max.xiaoheihe.okflutter.containers.HBFlutterFragmentActivity;
import com.max.xiaoheihe.okflutter.pigeon.IHybridShare;
import com.max.xiaoheihe.okflutter.pigeon.IHybridWebsocket;
import com.max.xiaoheihe.utils.m0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import io.flutter.embedding.engine.FlutterEngine;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BaseFlutterActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public class BaseFlutterActivity extends HBFlutterFragmentActivity implements d.f, m0.e {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private j reporter;

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ String H() {
        return com.max.hbcommon.analytics.e.a(this);
    }

    @Override // io.flutter.embedding.android.FlutterFragmentActivity, io.flutter.embedding.android.FlutterEngineConfigurator
    public void configureFlutterEngine(@dl.d FlutterEngine flutterEngine) {
        if (PatchProxy.proxy(new Object[]{flutterEngine}, this, changeQuickRedirect, false, 21972, new Class[]{FlutterEngine.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(flutterEngine, "flutterEngine");
        super.configureFlutterEngine(flutterEngine);
        IHybridShare.HybridShareApi.CC.e(flutterEngine.getDartExecutor().getBinaryMessenger(), new HBHybridShare(this));
    }

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ boolean d2() {
        return com.max.hbcommon.analytics.e.c(this);
    }

    @Override // com.max.hbcommon.analytics.d.f
    @e
    public PathSrcNode getClickSrc() {
        return null;
    }

    @Override // com.max.hbcommon.analytics.d.f
    @e
    public String getPageAdditional() {
        JsonObject jsonObject;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21973, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String paramJson = getParamJson();
        if (c.u(paramJson) || (jsonObject = (JsonObject) k.a(paramJson, JsonObject.class)) == null) {
            return null;
        }
        jsonObject.remove("type");
        return jsonObject.toString();
    }

    @Override // com.max.hbcommon.analytics.d.f
    @e
    public String getPagePath() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21971, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : getPath();
    }

    @Override // com.max.xiaoheihe.okflutter.containers.HBFlutterFragmentActivity, com.max.xiaoheihe.okflutter.containers.HBFlutterHostDelegate.Host
    @e
    public String getParamJson() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21974, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Intent intent = getIntent();
        return FlutterRouterKt.serializeFlutterPageParams(this, intent != null ? intent.getExtras() : null, super.getParamJson());
    }

    @e
    public final j getReporter() {
        return this.reporter;
    }

    @Override // com.max.xiaoheihe.utils.m0.e
    public void handleMessage(@dl.d final String content, @dl.d final m0.f result) {
        if (PatchProxy.proxy(new Object[]{content, result}, this, changeQuickRedirect, false, 21975, new Class[]{String.class, m0.f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(content, "content");
        f0.p(result, "result");
        runOnUiThread(new Runnable() { // from class: com.max.xiaoheihe.flutter.BaseFlutterActivity.handleMessage.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public final void run() {
                IHybridWebsocket.FlutterWebsocket flutterWebsocket;
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21976, new Class[0], Void.TYPE).isSupported || (flutterWebsocket = BaseFlutterActivity.this.getFlutterWebsocket()) == null) {
                    return;
                }
                String str = content;
                final m0.f fVar = result;
                flutterWebsocket.handleMessage(str, new IHybridWebsocket.Result<IHybridWebsocket.HybridWebsocketResult>() { // from class: com.max.xiaoheihe.flutter.BaseFlutterActivity.handleMessage.1.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridWebsocket.Result
                    public void error(@dl.d Throwable p10) {
                        if (PatchProxy.proxy(new Object[]{p10}, this, changeQuickRedirect, false, 21978, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(p10, "p0");
                        fVar.a(false);
                    }

                    /* JADX INFO: renamed from: success, reason: avoid collision after fix types in other method */
                    public void success2(@dl.d IHybridWebsocket.HybridWebsocketResult p10) {
                        if (PatchProxy.proxy(new Object[]{p10}, this, changeQuickRedirect, false, 21977, new Class[]{IHybridWebsocket.HybridWebsocketResult.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(p10, "p0");
                        m0.f fVar2 = fVar;
                        Long resultCode = p10.getResultCode();
                        fVar2.a(resultCode != null && resultCode.longValue() == 1);
                    }

                    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridWebsocket.Result
                    public /* bridge */ /* synthetic */ void success(IHybridWebsocket.HybridWebsocketResult hybridWebsocketResult) {
                        if (PatchProxy.proxy(new Object[]{hybridWebsocketResult}, this, changeQuickRedirect, false, 21979, new Class[]{Object.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        success2(hybridWebsocketResult);
                    }
                });
            }
        });
    }

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ boolean isPageVisited() {
        return com.max.hbcommon.analytics.e.e(this);
    }

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ void l1(View view) {
        com.max.hbcommon.analytics.e.f(this, view);
    }

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ boolean o3() {
        return com.max.hbcommon.analytics.e.d(this);
    }

    @Override // io.flutter.embedding.android.FlutterFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 21965, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        this.reporter = new j(this, bundle != null);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21970, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        j jVar = this.reporter;
        if (jVar != null) {
            jVar.d();
        }
    }

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ void onPageVisitSuccess() {
        com.max.hbcommon.analytics.e.g(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21967, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onPause();
        m0.x().L(null);
        j jVar = this.reporter;
        f0.m(jVar);
        jVar.e();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21968, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        m0.x().L(this);
        j jVar = this.reporter;
        f0.m(jVar);
        jVar.f();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21966, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21969, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStop();
    }

    @Override // com.max.hbcommon.analytics.d.f
    public void setClickSrc(@e PathSrcNode pathSrcNode) {
    }

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ void setPageVisited(boolean z10) {
        com.max.hbcommon.analytics.e.h(this, z10);
    }

    public final void setReporter(@e j jVar) {
        this.reporter = jVar;
    }

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ String v3() {
        return com.max.hbcommon.analytics.e.b(this);
    }
}
