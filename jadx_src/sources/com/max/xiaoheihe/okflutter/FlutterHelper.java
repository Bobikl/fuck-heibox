package com.max.xiaoheihe.okflutter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.y;
import com.google.common.base.CaseFormat;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.max.xiaoheihe.okflutter.containers.HBFlutterActivity;
import com.max.xiaoheihe.okflutter.containers.HBFlutterFragment;
import com.max.xiaoheihe.okflutter.containers.HBFlutterFragmentActivity;
import com.max.xiaoheihe.okflutter.entity.HybridResult;
import com.max.xiaoheihe.okflutter.executors.MessageHandler;
import com.max.xiaoheihe.okflutter.executors.NetworkRequestExecutor;
import com.max.xiaoheihe.okflutter.executors.ProtocolExecutor;
import com.max.xiaoheihe.okflutter.pigeon.IHeyboxProtocol;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.qcloud.core.util.IOUtils;
import com.umeng.analytics.pro.d;
import dl.e;
import io.flutter.FlutterInjector;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.FlutterEngineGroup;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.loader.FlutterLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.text.StringsKt__StringsKt;
import kotlin.z;
import org.json.JSONObject;
import xh.m;
import yh.l;
import yh.q;

/* JADX INFO: compiled from: FlutterHelper.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {}, d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 t2\u00020\u0001:\u0001tB\t\b\u0002¢\u0006\u0004\br\u0010sJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J_\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052O\u0010\u000e\u001aK\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007J;\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00022#\u0010\u0016\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\r0\u0013J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J4\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001a0\u00192\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J \u0010\u001d\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002JE\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022#\u0010\u0016\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\r0\u0013J\u0016\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u0002J \u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002J\u000e\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u0002J\u0016\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002J*\u0010+\u001a\u00020*2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010)\u001a\u00020(J \u0010,\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002J&\u00102\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020*2\u000e\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000/R\"\u00104\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00020=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00020=8\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010AR\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00020=8\u0006¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010AR$\u0010G\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010N\u001a\u0004\u0018\u00010M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010U\u001a\u0004\u0018\u00010T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR \u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R8\u0010`\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010_0^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR$\u0010f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kRk\u0010l\u001aK\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010q¨\u0006u"}, d2 = {"Lcom/max/xiaoheihe/okflutter/FlutterHelper;", "", "", FlutterActivityLaunchConfigs.EXTRA_PATH, "convertRoutePathToEntryPoint", "Landroid/content/Context;", d.R, "Lkotlin/Function3;", "Lkotlin/m0;", "name", "paramJson", "", "requestCode", "Lkotlin/b2;", "routeLambda", "initFlutter", "Landroidx/lifecycle/y;", "lifecycleOwner", "nodeEngineID", "Lkotlin/Function1;", "Lcom/max/xiaoheihe/okflutter/entity/HybridResult;", "result", "onResult", "registryNode", "sendResult", "Ljava/lang/Class;", "Lcom/max/xiaoheihe/okflutter/containers/HBFlutterFragmentActivity;", "activityClass", "startFlutterFragmentActivity", "startFlutterActivity", "Landroidx/appcompat/app/AppCompatActivity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "startFlutterActivityForResult", "Landroid/app/Activity;", "Lcom/max/xiaoheihe/okflutter/containers/HBFlutterFragment;", "getFlutterFragment", "engineID", "flutterExit", "url", "bringToFront", "", "isNightModeOn", "Lio/flutter/embedding/engine/FlutterEngine;", "createEngineFromGroup", "createEngine", SwitchDetailActivity.P, "engine", "Lcom/max/xiaoheihe/okflutter/pigeon/IHeyboxProtocol$NullableResult;", "Lcom/max/xiaoheihe/okflutter/pigeon/IHeyboxProtocol$ProtocolResponse;", "callback", "executeFlutterProtocol", "Lio/flutter/embedding/engine/FlutterEngineGroup;", "engineGroup", "Lio/flutter/embedding/engine/FlutterEngineGroup;", "getEngineGroup", "()Lio/flutter/embedding/engine/FlutterEngineGroup;", "setEngineGroup", "(Lio/flutter/embedding/engine/FlutterEngineGroup;)V", "Lio/flutter/embedding/engine/dart/DartExecutor$DartEntrypoint;", "hybridDartEntryPoint", "Lio/flutter/embedding/engine/dart/DartExecutor$DartEntrypoint;", "Ljava/util/ArrayList;", "entryPointPathList", "Ljava/util/ArrayList;", "getEntryPointPathList", "()Ljava/util/ArrayList;", "pathList", "getPathList", "instanceIDs", "getInstanceIDs", "Lcom/max/xiaoheihe/okflutter/executors/ProtocolExecutor;", "protocolExecutor", "Lcom/max/xiaoheihe/okflutter/executors/ProtocolExecutor;", "getProtocolExecutor", "()Lcom/max/xiaoheihe/okflutter/executors/ProtocolExecutor;", "setProtocolExecutor", "(Lcom/max/xiaoheihe/okflutter/executors/ProtocolExecutor;)V", "Lcom/max/xiaoheihe/okflutter/executors/NetworkRequestExecutor;", "networkRequestExecutor", "Lcom/max/xiaoheihe/okflutter/executors/NetworkRequestExecutor;", "getNetworkRequestExecutor", "()Lcom/max/xiaoheihe/okflutter/executors/NetworkRequestExecutor;", "setNetworkRequestExecutor", "(Lcom/max/xiaoheihe/okflutter/executors/NetworkRequestExecutor;)V", "Lcom/max/xiaoheihe/okflutter/executors/MessageHandler;", "messageHandler", "Lcom/max/xiaoheihe/okflutter/executors/MessageHandler;", "getMessageHandler", "()Lcom/max/xiaoheihe/okflutter/executors/MessageHandler;", "setMessageHandler", "(Lcom/max/xiaoheihe/okflutter/executors/MessageHandler;)V", "Ljava/util/HashMap;", "engineInstanceCount", "Ljava/util/HashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "Landroidx/lifecycle/i0;", "nodeMap", "Ljava/util/concurrent/ConcurrentHashMap;", "getNodeMap", "()Ljava/util/concurrent/ConcurrentHashMap;", "setNodeMap", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "waitEngineID", "Ljava/lang/String;", "getWaitEngineID", "()Ljava/lang/String;", "setWaitEngineID", "(Ljava/lang/String;)V", "routeAction", "Lyh/q;", "getRouteAction", "()Lyh/q;", "setRouteAction", "(Lyh/q;)V", "<init>", "()V", "Companion", "heybox_okflutter_android_release"}, k = 1, mv = {1, 7, 1})
public final class FlutterHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    public FlutterEngineGroup engineGroup;

    @dl.d
    private final HashMap<String, Integer> engineInstanceCount;

    @dl.d
    private final ArrayList<String> entryPointPathList;
    private DartExecutor.DartEntrypoint hybridDartEntryPoint;

    @dl.d
    private final ArrayList<String> instanceIDs;

    @e
    private MessageHandler messageHandler;

    @e
    private NetworkRequestExecutor networkRequestExecutor;

    @dl.d
    private ConcurrentHashMap<String, i0<HybridResult>> nodeMap;

    @dl.d
    private final ArrayList<String> pathList;

    @e
    private ProtocolExecutor protocolExecutor;

    @dl.d
    private q<? super String, ? super String, ? super Integer, b2> routeAction;

    @e
    private String waitEngineID;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    @dl.d
    private static final z<FlutterHelper> instance$delegate = b0.b(LazyThreadSafetyMode.SYNCHRONIZED, new yh.a<FlutterHelper>() { // from class: com.max.xiaoheihe.okflutter.FlutterHelper$Companion$instance$2
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // yh.a
        @dl.d
        public final FlutterHelper invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47726, new Class[0], FlutterHelper.class);
            return patchProxyResultProxy.isSupported ? (FlutterHelper) patchProxyResultProxy.result : new FlutterHelper(null);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.okflutter.FlutterHelper, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ FlutterHelper invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47727, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
        }
    });

    /* JADX INFO: compiled from: FlutterHelper.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\bR!\u0010\t\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/max/xiaoheihe/okflutter/FlutterHelper$Companion;", "", "Lcom/max/xiaoheihe/okflutter/FlutterHelper;", "instance$delegate", "Lkotlin/z;", "getInstance", "()Lcom/max/xiaoheihe/okflutter/FlutterHelper;", "getInstance$annotations", "()V", "instance", "<init>", "heybox_okflutter_android_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @m
        public static /* synthetic */ void getInstance$annotations() {
        }

        @dl.d
        public final FlutterHelper getInstance() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47725, new Class[0], FlutterHelper.class);
            return patchProxyResultProxy.isSupported ? (FlutterHelper) patchProxyResultProxy.result : (FlutterHelper) FlutterHelper.instance$delegate.getValue();
        }
    }

    private FlutterHelper() {
        this.entryPointPathList = new ArrayList<>();
        this.pathList = new ArrayList<>();
        this.routeAction = new q<String, String, Integer, b2>() { // from class: com.max.xiaoheihe.okflutter.FlutterHelper$routeAction$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.q
            public /* bridge */ /* synthetic */ b2 invoke(String str, String str2, Integer num) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, num}, this, changeQuickRedirect, false, 47729, new Class[]{Object.class, Object.class, Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2(str, str2, num);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.d String str, @e String str2, @e Integer num) {
                if (PatchProxy.proxy(new Object[]{str, str2, num}, this, changeQuickRedirect, false, 47728, new Class[]{String.class, String.class, Integer.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(str, "<anonymous parameter 0>");
            }
        };
        this.instanceIDs = new ArrayList<>();
        this.engineInstanceCount = new HashMap<>();
        this.nodeMap = new ConcurrentHashMap<>();
    }

    public /* synthetic */ FlutterHelper(u uVar) {
        this();
    }

    private final String convertRoutePathToEntryPoint(String path) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{path}, this, changeQuickRedirect, false, 47706, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (f0.g("/", path) || f0.g("", path) || f0.g("/main", path)) {
            return "main";
        }
        String str = CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_CAMEL, kotlin.text.u.k2(StringsKt__StringsKt.d4(path, "/"), IOUtils.DIR_SEPARATOR_UNIX, '-', false, 4, null));
        f0.o(str, "LOWER_HYPHEN.to(CaseFormat.LOWER_CAMEL, tmp)");
        return str;
    }

    public static /* synthetic */ FlutterEngine createEngineFromGroup$default(FlutterHelper flutterHelper, Context context, String str, String str2, boolean z10, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{flutterHelper, context, str, str2, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 47720, new Class[]{FlutterHelper.class, Context.class, String.class, String.class, Boolean.TYPE, Integer.TYPE, Object.class}, FlutterEngine.class);
        if (patchProxyResultProxy.isSupported) {
            return (FlutterEngine) patchProxyResultProxy.result;
        }
        return flutterHelper.createEngineFromGroup(context, str, str2, (i10 & 8) == 0 ? z10 ? 1 : 0 : false);
    }

    @dl.d
    public static final FlutterHelper getInstance() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 47724, new Class[0], FlutterHelper.class);
        return patchProxyResultProxy.isSupported ? (FlutterHelper) patchProxyResultProxy.result : INSTANCE.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: registryNode$lambda-0, reason: not valid java name */
    public static final void m42registryNode$lambda0(l onResult, HybridResult hybridResult) {
        if (PatchProxy.proxy(new Object[]{onResult, hybridResult}, null, changeQuickRedirect, true, 47723, new Class[]{l.class, HybridResult.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(onResult, "$onResult");
        onResult.invoke(hybridResult);
    }

    public static /* synthetic */ void startFlutterFragmentActivity$default(FlutterHelper flutterHelper, Context context, String str, Class cls, String str2, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{flutterHelper, context, str, cls, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 47711, new Class[]{FlutterHelper.class, Context.class, String.class, Class.class, String.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        flutterHelper.startFlutterFragmentActivity(context, str, cls, (i10 & 8) != 0 ? null : str2);
    }

    public final void bringToFront(@dl.d String url, @dl.d String engineID) {
        if (PatchProxy.proxy(new Object[]{url, engineID}, this, changeQuickRedirect, false, 47718, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(url, "url");
        f0.p(engineID, "engineID");
        if (this.instanceIDs.contains(engineID)) {
            ArrayList<String> arrayList = this.instanceIDs;
            String str = arrayList.get(arrayList.indexOf(engineID));
            f0.o(str, "instanceIDs[instanceIDs.indexOf(engineID)]");
            String str2 = str;
            this.instanceIDs.remove(str2);
            this.instanceIDs.add(str2);
        }
    }

    @dl.d
    public final String createEngine(@dl.d Context context, @dl.d String path, @e String paramJson) {
        Integer num = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, path, paramJson}, this, changeQuickRedirect, false, 47721, new Class[]{Context.class, String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(path, "path");
        LinkedList linkedList = new LinkedList();
        linkedList.add(path);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(path);
        Integer num2 = this.engineInstanceCount.get(path);
        if (num2 == null) {
            num2 = num;
        }
        sb2.append(num2.intValue());
        String string = sb2.toString();
        linkedList.add(string);
        if (paramJson != null) {
            linkedList.add(paramJson);
        }
        FlutterEngineGroup.Options options = new FlutterEngineGroup.Options(context);
        DartExecutor.DartEntrypoint dartEntrypoint = this.hybridDartEntryPoint;
        if (dartEntrypoint == null) {
            f0.S("hybridDartEntryPoint");
            dartEntrypoint = null;
        }
        FlutterEngineCache.getInstance().put(string, getEngineGroup().createAndRunEngine(options.setDartEntrypoint(dartEntrypoint).setInitialRoute(null).setDartEntrypointArgs(linkedList)));
        HashMap<String, Integer> map = this.engineInstanceCount;
        Integer num3 = map.get(path);
        map.put(path, Integer.valueOf(1 + (num3 != null ? num3 : 0).intValue()));
        this.instanceIDs.add(string);
        return string;
    }

    @dl.d
    public final FlutterEngine createEngineFromGroup(@dl.d Context context, @dl.d String path, @e String paramJson, boolean isNightModeOn) {
        JSONObject jsonObject;
        Integer num = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, path, paramJson, new Byte(isNightModeOn ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 47719, new Class[]{Context.class, String.class, String.class, Boolean.TYPE}, FlutterEngine.class);
        if (patchProxyResultProxy.isSupported) {
            return (FlutterEngine) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(path, "path");
        LinkedList linkedList = new LinkedList();
        linkedList.add(path);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(path);
        Integer num2 = this.engineInstanceCount.get(path);
        if (num2 == null) {
            num2 = num;
        }
        sb2.append(num2.intValue());
        String string = sb2.toString();
        linkedList.add(string);
        DartExecutor.DartEntrypoint dartEntrypoint = null;
        if (isNightModeOn) {
            paramJson = String.valueOf((paramJson == null || (jsonObject = FlutterHelperKt.getJsonObject(paramJson)) == null) ? null : jsonObject.put("init_ui_mode", "dark"));
        }
        if (paramJson != null) {
            linkedList.add(paramJson);
        }
        FlutterEngineGroup.Options options = new FlutterEngineGroup.Options(context);
        DartExecutor.DartEntrypoint dartEntrypoint2 = this.hybridDartEntryPoint;
        if (dartEntrypoint2 == null) {
            f0.S("hybridDartEntryPoint");
        } else {
            dartEntrypoint = dartEntrypoint2;
        }
        FlutterEngine engine = getEngineGroup().createAndRunEngine(options.setDartEntrypoint(dartEntrypoint).setDartEntrypointArgs(linkedList));
        HashMap<String, Integer> map = this.engineInstanceCount;
        Integer num3 = map.get(path);
        map.put(path, Integer.valueOf(1 + (num3 != null ? num3 : 0).intValue()));
        this.instanceIDs.add(string);
        f0.o(engine, "engine");
        return engine;
    }

    public final void executeFlutterProtocol(@dl.d String protocol, @dl.d FlutterEngine engine, @dl.d IHeyboxProtocol.NullableResult<IHeyboxProtocol.ProtocolResponse> callback) {
        if (PatchProxy.proxy(new Object[]{protocol, engine, callback}, this, changeQuickRedirect, false, 47722, new Class[]{String.class, FlutterEngine.class, IHeyboxProtocol.NullableResult.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(protocol, "protocol");
        f0.p(engine, "engine");
        f0.p(callback, "callback");
        new IHeyboxProtocol.FlutterProtocol(engine.getDartExecutor().getBinaryMessenger()).execute(protocol, callback);
    }

    public final void flutterExit(@dl.d String engineID) {
        if (PatchProxy.proxy(new Object[]{engineID}, this, changeQuickRedirect, false, 47717, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(engineID, "engineID");
        if (FlutterEngineCache.getInstance().contains(engineID)) {
            FlutterEngineCache.getInstance().get(engineID);
            FlutterEngineCache.getInstance().remove(engineID);
            if (this.instanceIDs.contains(engineID)) {
                this.instanceIDs.remove(engineID);
            }
        }
    }

    @dl.d
    public final FlutterEngineGroup getEngineGroup() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47702, new Class[0], FlutterEngineGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (FlutterEngineGroup) patchProxyResultProxy.result;
        }
        FlutterEngineGroup flutterEngineGroup = this.engineGroup;
        if (flutterEngineGroup != null) {
            return flutterEngineGroup;
        }
        f0.S("engineGroup");
        return null;
    }

    @dl.d
    public final ArrayList<String> getEntryPointPathList() {
        return this.entryPointPathList;
    }

    @dl.d
    public final HBFlutterFragment getFlutterFragment(@dl.d Activity activity, @dl.d String path) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity, path}, this, changeQuickRedirect, false, 47715, new Class[]{Activity.class, String.class}, HBFlutterFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (HBFlutterFragment) patchProxyResultProxy.result;
        }
        f0.p(activity, "activity");
        f0.p(path, "path");
        return getFlutterFragment(activity, path, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public final HBFlutterFragment getFlutterFragment(@dl.d Activity activity, @dl.d String path, @e String paramJson) {
        int i10 = 1;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity, path, paramJson}, this, changeQuickRedirect, false, 47716, new Class[]{Activity.class, String.class, String.class}, HBFlutterFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (HBFlutterFragment) patchProxyResultProxy.result;
        }
        f0.p(activity, "activity");
        f0.p(path, "path");
        return new HBFlutterFragment.FlutterFragmentBuilder(null, i10, 0 == true ? 1 : 0).path(path).paramJson(paramJson).build();
    }

    @dl.d
    public final ArrayList<String> getInstanceIDs() {
        return this.instanceIDs;
    }

    @e
    public final MessageHandler getMessageHandler() {
        return this.messageHandler;
    }

    @e
    public final NetworkRequestExecutor getNetworkRequestExecutor() {
        return this.networkRequestExecutor;
    }

    @dl.d
    public final ConcurrentHashMap<String, i0<HybridResult>> getNodeMap() {
        return this.nodeMap;
    }

    @dl.d
    public final ArrayList<String> getPathList() {
        return this.pathList;
    }

    @e
    public final ProtocolExecutor getProtocolExecutor() {
        return this.protocolExecutor;
    }

    @dl.d
    public final q<String, String, Integer, b2> getRouteAction() {
        return this.routeAction;
    }

    @e
    public final String getWaitEngineID() {
        return this.waitEngineID;
    }

    public final void initFlutter(@dl.d Context context, @dl.d q<? super String, ? super String, ? super Integer, b2> routeLambda) {
        if (PatchProxy.proxy(new Object[]{context, routeLambda}, this, changeQuickRedirect, false, 47707, new Class[]{Context.class, q.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(routeLambda, "routeLambda");
        setEngineGroup(new FlutterEngineGroup(context));
        FlutterLoader flutterLoader = FlutterInjector.instance().flutterLoader();
        f0.o(flutterLoader, "instance().flutterLoader()");
        if (!flutterLoader.initialized()) {
            throw new AssertionError("DartEntryPoints can only be created once a FlutterEngine is created.");
        }
        getEngineGroup().createAndRunEngine(context, new DartExecutor.DartEntrypoint(flutterLoader.findAppBundlePath(), "hybridMain"));
        this.hybridDartEntryPoint = new DartExecutor.DartEntrypoint(flutterLoader.findAppBundlePath(), "hybridMain");
        this.routeAction = routeLambda;
    }

    public final void registryNode(@dl.d y lifecycleOwner, @dl.d String nodeEngineID, @dl.d final l<? super HybridResult, b2> onResult) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, nodeEngineID, onResult}, this, changeQuickRedirect, false, 47708, new Class[]{y.class, String.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(lifecycleOwner, "lifecycleOwner");
        f0.p(nodeEngineID, "nodeEngineID");
        f0.p(onResult, "onResult");
        i0<HybridResult> i0Var = new i0<>();
        this.nodeMap.put(nodeEngineID, i0Var);
        i0Var.k(lifecycleOwner, new j0() { // from class: com.max.xiaoheihe.okflutter.a
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                FlutterHelper.m42registryNode$lambda0(onResult, (HybridResult) obj);
            }
        });
    }

    public final void sendResult(@dl.d String nodeEngineID, @e HybridResult hybridResult) {
        if (PatchProxy.proxy(new Object[]{nodeEngineID, hybridResult}, this, changeQuickRedirect, false, 47709, new Class[]{String.class, HybridResult.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(nodeEngineID, "nodeEngineID");
        i0<HybridResult> i0Var = this.nodeMap.get(nodeEngineID);
        if (i0Var != null) {
            i0Var.r(hybridResult);
        }
        this.nodeMap.remove(nodeEngineID);
    }

    public final void setEngineGroup(@dl.d FlutterEngineGroup flutterEngineGroup) {
        if (PatchProxy.proxy(new Object[]{flutterEngineGroup}, this, changeQuickRedirect, false, 47703, new Class[]{FlutterEngineGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(flutterEngineGroup, "<set-?>");
        this.engineGroup = flutterEngineGroup;
    }

    public final void setMessageHandler(@e MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    public final void setNetworkRequestExecutor(@e NetworkRequestExecutor networkRequestExecutor) {
        this.networkRequestExecutor = networkRequestExecutor;
    }

    public final void setNodeMap(@dl.d ConcurrentHashMap<String, i0<HybridResult>> concurrentHashMap) {
        if (PatchProxy.proxy(new Object[]{concurrentHashMap}, this, changeQuickRedirect, false, 47705, new Class[]{ConcurrentHashMap.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(concurrentHashMap, "<set-?>");
        this.nodeMap = concurrentHashMap;
    }

    public final void setProtocolExecutor(@e ProtocolExecutor protocolExecutor) {
        this.protocolExecutor = protocolExecutor;
    }

    public final void setRouteAction(@dl.d q<? super String, ? super String, ? super Integer, b2> qVar) {
        if (PatchProxy.proxy(new Object[]{qVar}, this, changeQuickRedirect, false, 47704, new Class[]{q.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(qVar, "<set-?>");
        this.routeAction = qVar;
    }

    public final void setWaitEngineID(@e String str) {
        this.waitEngineID = str;
    }

    public final void startFlutterActivity(@dl.d Context context, @dl.d String path) {
        if (PatchProxy.proxy(new Object[]{context, path}, this, changeQuickRedirect, false, 47712, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(path, "path");
        startFlutterActivity(context, path, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void startFlutterActivity(@dl.d Context context, @dl.d String path, @e String str) {
        int i10 = 1;
        if (PatchProxy.proxy(new Object[]{context, path, str}, this, changeQuickRedirect, false, 47713, new Class[]{Context.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(path, "path");
        Intent intentBuild = new HBFlutterActivity.FlutterActivityIntentBuilder(null, i10, 0 == true ? 1 : 0).path(path).paramJson(str).build(context);
        if (!(context instanceof Activity)) {
            intentBuild.setFlags(268435456);
        }
        context.startActivity(intentBuild);
    }

    public final void startFlutterActivityForResult(@dl.d AppCompatActivity activity, @dl.d String path, @e String str, @dl.d l<? super HybridResult, b2> onResult) {
        if (PatchProxy.proxy(new Object[]{activity, path, str, onResult}, this, changeQuickRedirect, false, 47714, new Class[]{AppCompatActivity.class, String.class, String.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        f0.p(path, "path");
        f0.p(onResult, "onResult");
        String strCreateEngine = createEngine(activity, path, str);
        this.waitEngineID = strCreateEngine;
        registryNode(activity, strCreateEngine, onResult);
        Intent intentBuild = new FlutterActivity.CachedEngineIntentBuilder(HBFlutterActivity.class, strCreateEngine).build(activity);
        f0.o(intentBuild, "CachedEngineIntentBuilde…         .build(activity)");
        activity.startActivity(intentBuild);
    }

    public final void startFlutterFragmentActivity(@dl.d Context context, @dl.d String path, @dl.d Class<? extends HBFlutterFragmentActivity> activityClass, @e String str) {
        if (PatchProxy.proxy(new Object[]{context, path, activityClass, str}, this, changeQuickRedirect, false, 47710, new Class[]{Context.class, String.class, Class.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(path, "path");
        f0.p(activityClass, "activityClass");
        Intent intentBuild = new HBFlutterFragmentActivity.FlutterFragmentActivityIntentBuilder(activityClass).path(path).paramJson(str).build(context);
        if (!(context instanceof Activity)) {
            intentBuild.setFlags(268435456);
        }
        context.startActivity(intentBuild);
    }
}
