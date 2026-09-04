package com.baseflow.permissionhandler;

import android.content.Context;
import androidx.annotation.n0;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: MethodCallHandlerImpl.java */
/* JADX INFO: loaded from: classes6.dex */
public final class m implements MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f40258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f40259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t f40260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f40261e;

    m(Context context, a aVar, t tVar, w wVar) {
        this.f40258b = context;
        this.f40259c = aVar;
        this.f40260d = tVar;
        this.f40261e = wVar;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(@n0 MethodCall methodCall, @n0 final MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        switch (str) {
            case "checkServiceStatus":
                int i10 = Integer.parseInt(methodCall.arguments.toString());
                w wVar = this.f40261e;
                Context context = this.f40258b;
                Objects.requireNonNull(result);
                wVar.a(i10, context, new w.a() { // from class: com.baseflow.permissionhandler.d
                    @Override // com.baseflow.permissionhandler.w.a
                    public final void a(int i11) {
                        result.success(Integer.valueOf(i11));
                    }
                }, new c() { // from class: com.baseflow.permissionhandler.e
                    @Override // com.baseflow.permissionhandler.c
                    public final void a(String str2, String str3) {
                        result.error(str2, str3, null);
                    }
                });
                break;
            case "shouldShowRequestPermissionRationale":
                int i11 = Integer.parseInt(methodCall.arguments.toString());
                t tVar = this.f40260d;
                Objects.requireNonNull(result);
                tVar.i(i11, new t.c() { // from class: com.baseflow.permissionhandler.i
                    @Override // com.baseflow.permissionhandler.t.c
                    public final void onSuccess(boolean z10) {
                        result.success(Boolean.valueOf(z10));
                    }
                }, new c() { // from class: com.baseflow.permissionhandler.j
                    @Override // com.baseflow.permissionhandler.c
                    public final void a(String str2, String str3) {
                        result.error(str2, str3, null);
                    }
                });
                break;
            case "checkPermissionStatus":
                int i12 = Integer.parseInt(methodCall.arguments.toString());
                t tVar2 = this.f40260d;
                Objects.requireNonNull(result);
                tVar2.c(i12, new t.a() { // from class: com.baseflow.permissionhandler.f
                    @Override // com.baseflow.permissionhandler.t.a
                    public final void a(int i13) {
                        result.success(Integer.valueOf(i13));
                    }
                });
                break;
            case "openAppSettings":
                a aVar = this.f40259c;
                Context context2 = this.f40258b;
                Objects.requireNonNull(result);
                aVar.a(context2, new a.InterfaceC0316a() { // from class: com.baseflow.permissionhandler.k
                    @Override // com.baseflow.permissionhandler.a.InterfaceC0316a
                    public final void onSuccess(boolean z10) {
                        result.success(Boolean.valueOf(z10));
                    }
                }, new c() { // from class: com.baseflow.permissionhandler.l
                    @Override // com.baseflow.permissionhandler.c
                    public final void a(String str2, String str3) {
                        result.error(str2, str3, null);
                    }
                });
                break;
            case "requestPermissions":
                List<Integer> list = (List) methodCall.arguments();
                t tVar3 = this.f40260d;
                Objects.requireNonNull(result);
                tVar3.g(list, new t.b() { // from class: com.baseflow.permissionhandler.g
                    @Override // com.baseflow.permissionhandler.t.b
                    public final void a(Map map) {
                        result.success(map);
                    }
                }, new c() { // from class: com.baseflow.permissionhandler.h
                    @Override // com.baseflow.permissionhandler.c
                    public final void a(String str2, String str3) {
                        result.error(str2, str3, null);
                    }
                });
                break;
            default:
                result.notImplemented();
                break;
        }
    }
}
