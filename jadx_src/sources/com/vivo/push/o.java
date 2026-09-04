package com.vivo.push;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: compiled from: PushCommand.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f106624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f106625b;

    public o(int i10) {
        this.f106624a = -1;
        if (i10 < 0) {
            throw new IllegalArgumentException("PushCommand: the value of command must > 0.");
        }
        this.f106624a = i10;
    }

    private void e(a aVar) {
        aVar.a("command", this.f106624a);
        aVar.a("client_pkgname", this.f106625b);
        c(aVar);
    }

    public final String a() {
        return this.f106625b;
    }

    public final void a(Intent intent) {
        a aVarA = a.a(intent);
        if (aVarA == null) {
            com.vivo.push.util.p.b("PushCommand", "bundleWapper is null");
            return;
        }
        a(aVarA);
        Bundle bundleB = aVarA.b();
        if (bundleB != null) {
            intent.putExtras(bundleB);
        }
    }

    public final void a(a aVar) {
        String strA = p.a(this.f106624a);
        if (strA == null) {
            strA = "";
        }
        aVar.a("method", strA);
        e(aVar);
    }

    public final void a(String str) {
        this.f106625b = str;
    }

    public final int b() {
        return this.f106624a;
    }

    public final void b(Intent intent) {
        a aVarA = a.a(intent);
        if (aVarA == null) {
            com.vivo.push.util.p.b("PushCommand", "bundleWapper is null");
            return;
        }
        aVarA.a("method", this.f106624a);
        e(aVarA);
        Bundle bundleB = aVarA.b();
        if (bundleB != null) {
            intent.putExtras(bundleB);
        }
    }

    public final void b(a aVar) {
        String strA = aVar.a();
        if (TextUtils.isEmpty(strA)) {
            this.f106625b = aVar.a("client_pkgname");
        } else {
            this.f106625b = strA;
        }
        d(aVar);
    }

    protected abstract void c(a aVar);

    public boolean c() {
        return false;
    }

    protected abstract void d(a aVar);

    public String toString() {
        return getClass().getSimpleName();
    }
}
