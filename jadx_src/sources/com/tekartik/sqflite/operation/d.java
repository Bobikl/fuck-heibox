package com.tekartik.sqflite.operation;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: compiled from: MethodCallOperation.java */
/* JADX INFO: loaded from: classes4.dex */
public class d extends com.tekartik.sqflite.operation.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f98695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final MethodCall f98696b;

    /* JADX INFO: compiled from: MethodCallOperation.java */
    public class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final MethodChannel.Result f98697a;

        a(MethodChannel.Result result) {
            this.f98697a = result;
        }

        @Override // com.tekartik.sqflite.operation.f
        public void error(String str, String str2, Object obj) {
            this.f98697a.error(str, str2, obj);
        }

        @Override // com.tekartik.sqflite.operation.f
        public void success(Object obj) {
            this.f98697a.success(obj);
        }
    }

    public d(MethodCall methodCall, MethodChannel.Result result) {
        this.f98696b = methodCall;
        this.f98695a = new a(result);
    }

    @Override // com.tekartik.sqflite.operation.e
    public <T> T a(String str) {
        return (T) this.f98696b.argument(str);
    }

    @Override // com.tekartik.sqflite.operation.e
    public boolean b(String str) {
        return this.f98696b.hasArgument(str);
    }

    @Override // com.tekartik.sqflite.operation.e
    public String getMethod() {
        return this.f98696b.method;
    }

    @Override // com.tekartik.sqflite.operation.a, com.tekartik.sqflite.operation.b
    public f i() {
        return this.f98695a;
    }
}
