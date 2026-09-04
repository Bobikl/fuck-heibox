package io.flutter.embedding.engine.systemchannels;

import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.FlutterInjector;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class DeferredComponentChannel {
    private static final String TAG = "DeferredComponentChannel";

    @n0
    private final MethodChannel channel;

    @n0
    private Map<String, List<MethodChannel.Result>> componentNameToResults;

    @p0
    private DeferredComponentManager deferredComponentManager;

    @j1
    @n0
    final MethodChannel.MethodCallHandler parsingMethodHandler;

    public DeferredComponentChannel(@n0 DartExecutor dartExecutor) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.DeferredComponentChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(@n0 MethodCall methodCall, @n0 MethodChannel.Result result) {
                if (DeferredComponentChannel.this.deferredComponentManager == null) {
                }
                String str = methodCall.method;
                Map map = (Map) methodCall.arguments();
                Log.v(DeferredComponentChannel.TAG, "Received '" + str + "' message.");
                int iIntValue = ((Integer) map.get("loadingUnitId")).intValue();
                String str2 = (String) map.get("componentName");
                str.hashCode();
                switch (str) {
                    case "uninstallDeferredComponent":
                        DeferredComponentChannel.this.deferredComponentManager.uninstallDeferredComponent(iIntValue, str2);
                        result.success(null);
                        break;
                    case "getDeferredComponentInstallState":
                        result.success(DeferredComponentChannel.this.deferredComponentManager.getDeferredComponentInstallState(iIntValue, str2));
                        break;
                    case "installDeferredComponent":
                        DeferredComponentChannel.this.deferredComponentManager.installDeferredComponent(iIntValue, str2);
                        if (!DeferredComponentChannel.this.componentNameToResults.containsKey(str2)) {
                            DeferredComponentChannel.this.componentNameToResults.put(str2, new ArrayList());
                        }
                        ((List) DeferredComponentChannel.this.componentNameToResults.get(str2)).add(result);
                        break;
                    default:
                        result.notImplemented();
                        break;
                }
            }
        };
        this.parsingMethodHandler = methodCallHandler;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/deferredcomponent", StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
        this.deferredComponentManager = FlutterInjector.instance().deferredComponentManager();
        this.componentNameToResults = new HashMap();
    }

    public void completeInstallError(String str, String str2) {
        if (this.componentNameToResults.containsKey(str)) {
            Iterator<MethodChannel.Result> it = this.componentNameToResults.get(str).iterator();
            while (it.hasNext()) {
                it.next().error("DeferredComponent Install failure", str2, null);
            }
            this.componentNameToResults.get(str).clear();
        }
    }

    public void completeInstallSuccess(String str) {
        if (this.componentNameToResults.containsKey(str)) {
            Iterator<MethodChannel.Result> it = this.componentNameToResults.get(str).iterator();
            while (it.hasNext()) {
                it.next().success(null);
            }
            this.componentNameToResults.get(str).clear();
        }
    }

    @j1
    public void setDeferredComponentManager(@p0 DeferredComponentManager deferredComponentManager) {
        this.deferredComponentManager = deferredComponentManager;
    }
}
