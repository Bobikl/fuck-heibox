package io.flutter.plugin.text;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.systemchannels.ProcessTextChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ProcessTextPlugin implements FlutterPlugin, ActivityAware, PluginRegistry.ActivityResultListener, ProcessTextChannel.ProcessTextMethodHandler {
    private static final String TAG = "ProcessTextPlugin";

    @p0
    private ActivityPluginBinding activityBinding;

    @n0
    private final PackageManager packageManager;

    @n0
    private final ProcessTextChannel processTextChannel;

    @n0
    private Map<Integer, MethodChannel.Result> requestsByCode = new HashMap();
    private Map<String, ResolveInfo> resolveInfosById;

    public ProcessTextPlugin(@n0 ProcessTextChannel processTextChannel) {
        this.processTextChannel = processTextChannel;
        this.packageManager = processTextChannel.packageManager;
        processTextChannel.setMethodHandler(this);
    }

    private void cacheResolveInfos() {
        this.resolveInfosById = new HashMap();
        int i10 = Build.VERSION.SDK_INT;
        Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        for (ResolveInfo resolveInfo : i10 >= 33 ? this.packageManager.queryIntentActivities(type, PackageManager.ResolveInfoFlags.of(0L)) : this.packageManager.queryIntentActivities(type, 0)) {
            String str = resolveInfo.activityInfo.name;
            resolveInfo.loadLabel(this.packageManager).toString();
            this.resolveInfosById.put(str, resolveInfo);
        }
    }

    public void destroy() {
        this.processTextChannel.setMethodHandler(null);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    @w0(23)
    @TargetApi(23)
    public boolean onActivityResult(int i10, int i11, @p0 Intent intent) {
        if (!this.requestsByCode.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        this.requestsByCode.remove(Integer.valueOf(i10)).success(i11 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(@n0 ActivityPluginBinding activityPluginBinding) {
        this.activityBinding = activityPluginBinding;
        activityPluginBinding.addActivityResultListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.activityBinding.removeActivityResultListener(this);
        this.activityBinding = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.activityBinding.removeActivityResultListener(this);
        this.activityBinding = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(@n0 ActivityPluginBinding activityPluginBinding) {
        this.activityBinding = activityPluginBinding;
        activityPluginBinding.addActivityResultListener(this);
    }

    @Override // io.flutter.embedding.engine.systemchannels.ProcessTextChannel.ProcessTextMethodHandler
    public void processTextAction(@n0 String str, @n0 String str2, @n0 boolean z10, @n0 MethodChannel.Result result) {
        if (this.activityBinding == null) {
            result.error("error", "Plugin not bound to an Activity", null);
            return;
        }
        Map<String, ResolveInfo> map = this.resolveInfosById;
        if (map == null) {
            result.error("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = map.get(str);
        if (resolveInfo == null) {
            result.error("error", "Text processing activity not found", null);
            return;
        }
        Integer numValueOf = Integer.valueOf(result.hashCode());
        this.requestsByCode.put(numValueOf, result);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z10);
        this.activityBinding.getActivity().startActivityForResult(intent, numValueOf.intValue());
    }

    @Override // io.flutter.embedding.engine.systemchannels.ProcessTextChannel.ProcessTextMethodHandler
    public Map<String, String> queryTextActions() {
        if (this.resolveInfosById == null) {
            cacheResolveInfos();
        }
        HashMap map = new HashMap();
        for (String str : this.resolveInfosById.keySet()) {
            map.put(str, this.resolveInfosById.get(str).loadLabel(this.packageManager).toString());
        }
        return map;
    }
}
