package com.lzy.okgo.db;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: TableEntity.java */
/* JADX INFO: loaded from: classes6.dex */
public class h {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f64721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<c> f64722b = new ArrayList();

    public h(String str) {
        this.f64721a = str;
    }

    public h a(c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.b.f30835o7, new Class[]{c.class}, h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        this.f64722b.add(cVar);
        return this;
    }

    public String b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30858p7, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb2.append(this.f64721a);
        sb2.append('(');
        for (c cVar : this.f64722b) {
            if (cVar.f64703c != null) {
                sb2.append("PRIMARY KEY (");
                for (String str : cVar.f64703c) {
                    sb2.append(str);
                    sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb2.deleteCharAt(sb2.length() - 1);
                sb2.append(")");
            } else {
                sb2.append(cVar.f64701a);
                sb2.append(" ");
                sb2.append(cVar.f64702b);
                if (cVar.f64705e) {
                    sb2.append(" NOT NULL");
                }
                if (cVar.f64704d) {
                    sb2.append(" PRIMARY KEY");
                }
                if (cVar.f64706f) {
                    sb2.append(" AUTOINCREMENT");
                }
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
        }
        if (sb2.toString().endsWith(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        sb2.append(')');
        return sb2.toString();
    }

    public int c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30903r7, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f64722b.size();
    }

    public int d(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.f30925s7, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iC = c();
        for (int i10 = 0; i10 < iC; i10++) {
            if (this.f64722b.get(i10).f64701a.equals(str)) {
                return i10;
            }
        }
        return -1;
    }

    public String e(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.f30881q7, new Class[]{Integer.TYPE}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : this.f64722b.get(i10).f64701a;
    }
}
