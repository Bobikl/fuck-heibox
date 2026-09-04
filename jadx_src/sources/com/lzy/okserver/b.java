package com.lzy.okserver;

import android.os.Environment;
import com.lzy.okgo.db.g;
import com.lzy.okgo.model.Progress;
import com.lzy.okgo.request.base.Request;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: OkDownload.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f64844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.lzy.okserver.download.c f64845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, com.lzy.okserver.download.b> f64846c;

    /* JADX INFO: renamed from: com.lzy.okserver.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: OkDownload.java */
    public static class C0526b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f64847a = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        private C0526b() {
        }
    }

    private b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Environment.getExternalStorageDirectory());
        String str = File.separator;
        sb2.append(str);
        sb2.append(ChannelsDetailActivity.f79595e4);
        sb2.append(str);
        String string = sb2.toString();
        this.f64844a = string;
        la.c.j(string);
        this.f64845b = new com.lzy.okserver.download.c();
        this.f64846c = new ConcurrentHashMap<>();
        List<Progress> listO = g.Q().O();
        for (Progress progress : listO) {
            int i10 = progress.f64785k;
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                progress.f64785k = 0;
            }
        }
        g.Q().C(listO);
    }

    public static b c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.f31084zc, new Class[0], b.class);
        return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : C0526b.f64847a;
    }

    public static com.lzy.okserver.download.b m(String str, Request<File, ? extends Request> request) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, request}, null, changeQuickRedirect, true, bb.c.b.Ac, new Class[]{String.class, Request.class}, com.lzy.okserver.download.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.lzy.okserver.download.b) patchProxyResultProxy.result;
        }
        Map<String, com.lzy.okserver.download.b> mapE = c().e();
        com.lzy.okserver.download.b bVar = mapE.get(str);
        if (bVar != null) {
            return bVar;
        }
        com.lzy.okserver.download.b bVar2 = new com.lzy.okserver.download.b(str, request);
        mapE.put(str, bVar2);
        return bVar2;
    }

    public static com.lzy.okserver.download.b n(Progress progress) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{progress}, null, changeQuickRedirect, true, bb.c.b.Bc, new Class[]{Progress.class}, com.lzy.okserver.download.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.lzy.okserver.download.b) patchProxyResultProxy.result;
        }
        Map<String, com.lzy.okserver.download.b> mapE = c().e();
        com.lzy.okserver.download.b bVar = mapE.get(progress.f64776b);
        if (bVar != null) {
            return bVar;
        }
        com.lzy.okserver.download.b bVar2 = new com.lzy.okserver.download.b(progress);
        mapE.put(progress.f64776b, bVar2);
        return bVar2;
    }

    public static List<com.lzy.okserver.download.b> o(List<Progress> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, null, changeQuickRedirect, true, bb.c.b.Cc, new Class[]{List.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        Map<String, com.lzy.okserver.download.b> mapE = c().e();
        ArrayList arrayList = new ArrayList();
        for (Progress progress : list) {
            com.lzy.okserver.download.b bVar = mapE.get(progress.f64776b);
            if (bVar == null) {
                bVar = new com.lzy.okserver.download.b(progress);
                mapE.put(progress.f64776b, bVar);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public void a(com.lzy.okserver.task.c.InterfaceC0528c interfaceC0528c) {
        if (PatchProxy.proxy(new Object[]{interfaceC0528c}, this, changeQuickRedirect, false, bb.c.b.Kc, new Class[]{com.lzy.okserver.task.c.InterfaceC0528c.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f64845b.b().a(interfaceC0528c);
    }

    public String b() {
        return this.f64844a;
    }

    public com.lzy.okserver.download.b d(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.Hc, new Class[]{String.class}, com.lzy.okserver.download.b.class);
        return patchProxyResultProxy.isSupported ? (com.lzy.okserver.download.b) patchProxyResultProxy.result : this.f64846c.get(str);
    }

    public Map<String, com.lzy.okserver.download.b> e() {
        return this.f64846c;
    }

    public com.lzy.okserver.download.c f() {
        return this.f64845b;
    }

    public boolean g(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.Ic, new Class[]{String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f64846c.containsKey(str);
    }

    public void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Ec, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (Map.Entry<String, com.lzy.okserver.download.b> entry : this.f64846c.entrySet()) {
            com.lzy.okserver.download.b value = entry.getValue();
            if (value == null) {
                la.d.l("can't find task with tag = " + entry.getKey());
            } else if (value.f64853b.f64785k != 2) {
                value.h();
            }
        }
        for (Map.Entry<String, com.lzy.okserver.download.b> entry2 : this.f64846c.entrySet()) {
            com.lzy.okserver.download.b value2 = entry2.getValue();
            if (value2 == null) {
                la.d.l("can't find task with tag = " + entry2.getKey());
            } else if (value2.f64853b.f64785k == 2) {
                value2.h();
            }
        }
    }

    public void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Fc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        j(false);
    }

    public void j(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.b.Gc, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap(this.f64846c);
        for (Map.Entry entry : map.entrySet()) {
            com.lzy.okserver.download.b bVar = (com.lzy.okserver.download.b) entry.getValue();
            if (bVar == null) {
                la.d.l("can't find task with tag = " + ((String) entry.getKey()));
            } else if (bVar.f64853b.f64785k != 2) {
                bVar.r(z10);
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            com.lzy.okserver.download.b bVar2 = (com.lzy.okserver.download.b) entry2.getValue();
            if (bVar2 == null) {
                la.d.l("can't find task with tag = " + ((String) entry2.getKey()));
            } else if (bVar2.f64853b.f64785k == 2) {
                bVar2.r(z10);
            }
        }
    }

    public void k(com.lzy.okserver.task.c.InterfaceC0528c interfaceC0528c) {
        if (PatchProxy.proxy(new Object[]{interfaceC0528c}, this, changeQuickRedirect, false, bb.c.b.Lc, new Class[]{com.lzy.okserver.task.c.InterfaceC0528c.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f64845b.b().c(interfaceC0528c);
    }

    public com.lzy.okserver.download.b l(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.Jc, new Class[]{String.class}, com.lzy.okserver.download.b.class);
        return patchProxyResultProxy.isSupported ? (com.lzy.okserver.download.b) patchProxyResultProxy.result : this.f64846c.remove(str);
    }

    public b p(String str) {
        this.f64844a = str;
        return this;
    }

    public void q() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Dc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (Map.Entry<String, com.lzy.okserver.download.b> entry : this.f64846c.entrySet()) {
            com.lzy.okserver.download.b value = entry.getValue();
            if (value == null) {
                la.d.l("can't find task with tag = " + entry.getKey());
            } else {
                value.v();
            }
        }
    }
}
