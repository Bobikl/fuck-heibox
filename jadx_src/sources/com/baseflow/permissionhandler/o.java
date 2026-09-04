package com.baseflow.permissionhandler;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: compiled from: PermissionHandlerPlugin.java */
/* JADX INFO: loaded from: classes6.dex */
public final class o implements FlutterPlugin, ActivityAware {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private t f40292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MethodChannel f40293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private ActivityPluginBinding f40294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private m f40295e;

    private void a() {
        ActivityPluginBinding activityPluginBinding = this.f40294d;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this.f40292b);
            this.f40294d.removeRequestPermissionsResultListener(this.f40292b);
        }
    }

    private void b() {
        ActivityPluginBinding activityPluginBinding = this.f40294d;
        if (activityPluginBinding != null) {
            activityPluginBinding.addActivityResultListener(this.f40292b);
            this.f40294d.addRequestPermissionsResultListener(this.f40292b);
        }
    }

    private void c(Context context, BinaryMessenger binaryMessenger) {
        this.f40293c = new MethodChannel(binaryMessenger, "flutter.baseflow.com/permissions/methods");
        m mVar = new m(context, new a(), this.f40292b, new w());
        this.f40295e = mVar;
        this.f40293c.setMethodCallHandler(mVar);
    }

    private void d(Activity activity) {
        t tVar = this.f40292b;
        if (tVar != null) {
            tVar.h(activity);
        }
    }

    private void e() {
        this.f40293c.setMethodCallHandler(null);
        this.f40293c = null;
        this.f40295e = null;
    }

    private void f() {
        t tVar = this.f40292b;
        if (tVar != null) {
            tVar.h(null);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(@n0 ActivityPluginBinding activityPluginBinding) {
        d(activityPluginBinding.getActivity());
        this.f40294d = activityPluginBinding;
        b();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f40292b = new t(flutterPluginBinding.getApplicationContext());
        c(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        f();
        a();
        this.f40294d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        e();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(@n0 ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
