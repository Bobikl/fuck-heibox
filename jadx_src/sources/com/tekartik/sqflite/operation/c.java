package com.tekartik.sqflite.operation;

import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: BatchOperation.java */
/* JADX INFO: loaded from: classes4.dex */
public class c extends com.tekartik.sqflite.operation.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<String, Object> f98687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final a f98688b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f98689c;

    /* JADX INFO: compiled from: BatchOperation.java */
    public class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f98690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f98691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f98692c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f98693d;

        public a() {
        }

        @Override // com.tekartik.sqflite.operation.f
        public void error(String str, String str2, Object obj) {
            this.f98691b = str;
            this.f98692c = str2;
            this.f98693d = obj;
        }

        @Override // com.tekartik.sqflite.operation.f
        public void success(Object obj) {
            this.f98690a = obj;
        }
    }

    public c(Map<String, Object> map, boolean z10) {
        this.f98687a = map;
        this.f98689c = z10;
    }

    @Override // com.tekartik.sqflite.operation.e
    public <T> T a(String str) {
        return (T) this.f98687a.get(str);
    }

    @Override // com.tekartik.sqflite.operation.e
    public boolean b(String str) {
        return this.f98687a.containsKey(str);
    }

    @Override // com.tekartik.sqflite.operation.b, com.tekartik.sqflite.operation.e
    public boolean f() {
        return this.f98689c;
    }

    @Override // com.tekartik.sqflite.operation.e
    public String getMethod() {
        return (String) this.f98687a.get("method");
    }

    @Override // com.tekartik.sqflite.operation.a, com.tekartik.sqflite.operation.b
    public f i() {
        return this.f98688b;
    }

    public Map<String, Object> l() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("code", this.f98688b.f98691b);
        map2.put("message", this.f98688b.f98692c);
        map2.put("data", this.f98688b.f98693d);
        map.put("error", map2);
        return map;
    }

    public Map<String, Object> m() {
        HashMap map = new HashMap();
        map.put("result", this.f98688b.f98690a);
        return map;
    }

    public void n(MethodChannel.Result result) {
        a aVar = this.f98688b;
        result.error(aVar.f98691b, aVar.f98692c, aVar.f98693d);
    }

    public void o(List<Map<String, Object>> list) {
        if (f()) {
            return;
        }
        list.add(l());
    }

    public void p(List<Map<String, Object>> list) {
        if (f()) {
            return;
        }
        list.add(m());
    }
}
