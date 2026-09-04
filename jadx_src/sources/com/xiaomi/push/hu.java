package com.xiaomi.push;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public class hu extends hs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f107303a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private a f558a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private b f559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f107304b;

    public enum a {
        chat,
        available,
        away,
        xa,
        dnd
    }

    public enum b {
        available,
        unavailable,
        subscribe,
        subscribed,
        unsubscribe,
        unsubscribed,
        error,
        probe
    }

    public hu(Bundle bundle) {
        super(bundle);
        this.f559a = b.available;
        this.f107304b = null;
        this.f107303a = Integer.MIN_VALUE;
        this.f558a = null;
        if (bundle.containsKey("ext_pres_type")) {
            this.f559a = b.valueOf(bundle.getString("ext_pres_type"));
        }
        if (bundle.containsKey("ext_pres_status")) {
            this.f107304b = bundle.getString("ext_pres_status");
        }
        if (bundle.containsKey("ext_pres_prio")) {
            this.f107303a = bundle.getInt("ext_pres_prio");
        }
        if (bundle.containsKey("ext_pres_mode")) {
            this.f558a = a.valueOf(bundle.getString("ext_pres_mode"));
        }
    }

    public hu(b bVar) {
        this.f559a = b.available;
        this.f107304b = null;
        this.f107303a = Integer.MIN_VALUE;
        this.f558a = null;
        a(bVar);
    }

    @Override // com.xiaomi.push.hs
    public Bundle a() {
        Bundle bundleA = super.a();
        b bVar = this.f559a;
        if (bVar != null) {
            bundleA.putString("ext_pres_type", bVar.toString());
        }
        String str = this.f107304b;
        if (str != null) {
            bundleA.putString("ext_pres_status", str);
        }
        int i10 = this.f107303a;
        if (i10 != Integer.MIN_VALUE) {
            bundleA.putInt("ext_pres_prio", i10);
        }
        a aVar = this.f558a;
        if (aVar != null && aVar != a.available) {
            bundleA.putString("ext_pres_mode", aVar.toString());
        }
        return bundleA;
    }

    @Override // com.xiaomi.push.hs
    /* JADX INFO: renamed from: a */
    public String mo456a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<presence");
        if (p() != null) {
            sb2.append(" xmlns=\"");
            sb2.append(p());
            sb2.append("\"");
        }
        if (j() != null) {
            sb2.append(" id=\"");
            sb2.append(j());
            sb2.append("\"");
        }
        if (l() != null) {
            sb2.append(" to=\"");
            sb2.append(id.a(l()));
            sb2.append("\"");
        }
        if (m() != null) {
            sb2.append(" from=\"");
            sb2.append(id.a(m()));
            sb2.append("\"");
        }
        if (k() != null) {
            sb2.append(" chid=\"");
            sb2.append(id.a(k()));
            sb2.append("\"");
        }
        if (this.f559a != null) {
            sb2.append(" type=\"");
            sb2.append(this.f559a);
            sb2.append("\"");
        }
        sb2.append(">");
        if (this.f107304b != null) {
            sb2.append("<status>");
            sb2.append(id.a(this.f107304b));
            sb2.append("</status>");
        }
        if (this.f107303a != Integer.MIN_VALUE) {
            sb2.append("<priority>");
            sb2.append(this.f107303a);
            sb2.append("</priority>");
        }
        a aVar = this.f558a;
        if (aVar != null && aVar != a.available) {
            sb2.append("<show>");
            sb2.append(this.f558a);
            sb2.append("</show>");
        }
        sb2.append(o());
        hw hwVarM457a = m457a();
        if (hwVarM457a != null) {
            sb2.append(hwVarM457a.m460a());
        }
        sb2.append("</presence>");
        return sb2.toString();
    }

    public void a(int i10) {
        if (i10 >= -128 && i10 <= 128) {
            this.f107303a = i10;
            return;
        }
        throw new IllegalArgumentException("Priority value " + i10 + " is not valid. Valid range is -128 through 128.");
    }

    public void a(a aVar) {
        this.f558a = aVar;
    }

    public void a(b bVar) {
        if (bVar == null) {
            throw new NullPointerException("Type cannot be null");
        }
        this.f559a = bVar;
    }

    public void a(String str) {
        this.f107304b = str;
    }
}
