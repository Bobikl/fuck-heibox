package com.lzy.okserver;

import com.lzy.okgo.db.i;
import com.lzy.okgo.model.Progress;
import com.lzy.okgo.request.base.Request;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: OkUpload.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, com.lzy.okserver.upload.b<?>> f64848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.lzy.okserver.upload.c f64849b;

    /* JADX INFO: compiled from: OkUpload.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f64850a = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        private b() {
        }
    }

    private c() {
        this.f64849b = new com.lzy.okserver.upload.c();
        this.f64848a = new LinkedHashMap();
        List<Progress> listQ = i.P().Q();
        for (Progress progress : listQ) {
            int i10 = progress.f64785k;
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                progress.f64785k = 0;
            }
        }
        i.P().C(listQ);
    }

    public static c b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.Mc, new Class[0], c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : b.f64850a;
    }

    public static <T> com.lzy.okserver.upload.b<T> k(String str, Request<T, ? extends Request> request) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, request}, null, changeQuickRedirect, true, bb.c.b.Nc, new Class[]{String.class, Request.class}, com.lzy.okserver.upload.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.lzy.okserver.upload.b) patchProxyResultProxy.result;
        }
        Map<String, com.lzy.okserver.upload.b<?>> mapD = b().d();
        com.lzy.okserver.upload.b<T> bVar = (com.lzy.okserver.upload.b) mapD.get(str);
        if (bVar != null) {
            return bVar;
        }
        com.lzy.okserver.upload.b<T> bVar2 = new com.lzy.okserver.upload.b<>(str, request);
        mapD.put(str, bVar2);
        return bVar2;
    }

    public static <T> com.lzy.okserver.upload.b<T> l(Progress progress) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{progress}, null, changeQuickRedirect, true, bb.c.b.Oc, new Class[]{Progress.class}, com.lzy.okserver.upload.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.lzy.okserver.upload.b) patchProxyResultProxy.result;
        }
        Map<String, com.lzy.okserver.upload.b<?>> mapD = b().d();
        com.lzy.okserver.upload.b<T> bVar = (com.lzy.okserver.upload.b) mapD.get(progress.f64776b);
        if (bVar != null) {
            return bVar;
        }
        com.lzy.okserver.upload.b<T> bVar2 = new com.lzy.okserver.upload.b<>(progress);
        mapD.put(progress.f64776b, bVar2);
        return bVar2;
    }

    public static List<com.lzy.okserver.upload.b<?>> m(List<Progress> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, null, changeQuickRedirect, true, bb.c.b.Pc, new Class[]{List.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        Map<String, com.lzy.okserver.upload.b<?>> mapD = b().d();
        ArrayList arrayList = new ArrayList();
        for (Progress progress : list) {
            com.lzy.okserver.upload.b<?> bVar = mapD.get(progress.f64776b);
            if (bVar == null) {
                bVar = new com.lzy.okserver.upload.b<>(progress);
                mapD.put(progress.f64776b, bVar);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public void a(com.lzy.okserver.task.c.InterfaceC0528c interfaceC0528c) {
        if (PatchProxy.proxy(new Object[]{interfaceC0528c}, this, changeQuickRedirect, false, bb.c.b.Wc, new Class[]{com.lzy.okserver.task.c.InterfaceC0528c.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f64849b.b().a(interfaceC0528c);
    }

    public com.lzy.okserver.upload.b<?> c(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.Tc, new Class[]{String.class}, com.lzy.okserver.upload.b.class);
        return patchProxyResultProxy.isSupported ? (com.lzy.okserver.upload.b) patchProxyResultProxy.result : this.f64848a.get(str);
    }

    public Map<String, com.lzy.okserver.upload.b<?>> d() {
        return this.f64848a;
    }

    public com.lzy.okserver.upload.c e() {
        return this.f64849b;
    }

    public boolean f(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.Uc, new Class[]{String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f64848a.containsKey(str);
    }

    public void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Rc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (Map.Entry<String, com.lzy.okserver.upload.b<?>> entry : this.f64848a.entrySet()) {
            com.lzy.okserver.upload.b<?> value = entry.getValue();
            if (value == null) {
                la.d.l("can't find task with tag = " + entry.getKey());
            } else if (value.f64905b.f64785k != 2) {
                value.e();
            }
        }
        for (Map.Entry<String, com.lzy.okserver.upload.b<?>> entry2 : this.f64848a.entrySet()) {
            com.lzy.okserver.upload.b<?> value2 = entry2.getValue();
            if (value2 == null) {
                la.d.l("can't find task with tag = " + entry2.getKey());
            } else if (value2.f64905b.f64785k == 2) {
                value2.e();
            }
        }
    }

    public void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Sc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap(this.f64848a);
        for (Map.Entry entry : map.entrySet()) {
            com.lzy.okserver.upload.b bVar = (com.lzy.okserver.upload.b) entry.getValue();
            if (bVar == null) {
                la.d.l("can't find task with tag = " + ((String) entry.getKey()));
            } else if (bVar.f64905b.f64785k != 2) {
                bVar.o();
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            com.lzy.okserver.upload.b bVar2 = (com.lzy.okserver.upload.b) entry2.getValue();
            if (bVar2 == null) {
                la.d.l("can't find task with tag = " + ((String) entry2.getKey()));
            } else if (bVar2.f64905b.f64785k == 2) {
                bVar2.o();
            }
        }
    }

    public void i(com.lzy.okserver.task.c.InterfaceC0528c interfaceC0528c) {
        if (PatchProxy.proxy(new Object[]{interfaceC0528c}, this, changeQuickRedirect, false, bb.c.b.Xc, new Class[]{com.lzy.okserver.task.c.InterfaceC0528c.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f64849b.b().c(interfaceC0528c);
    }

    public com.lzy.okserver.upload.b<?> j(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.Vc, new Class[]{String.class}, com.lzy.okserver.upload.b.class);
        return patchProxyResultProxy.isSupported ? (com.lzy.okserver.upload.b) patchProxyResultProxy.result : this.f64848a.remove(str);
    }

    public void n() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Qc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (Map.Entry<String, com.lzy.okserver.upload.b<?>> entry : this.f64848a.entrySet()) {
            com.lzy.okserver.upload.b<?> value = entry.getValue();
            if (value == null) {
                la.d.l("can't find task with tag = " + entry.getKey());
            } else {
                value.r();
            }
        }
    }
}
