package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class hw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f107319a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String f562a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private List<hp> f563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f107320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f107321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f107322d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f107323a = new a("internal-server-error");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f107324b = new a("forbidden");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f107325c = new a("bad-request");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f107326d = new a("conflict");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f107327e = new a("feature-not-implemented");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f107328f = new a("gone");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f107329g = new a("item-not-found");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f107330h = new a("jid-malformed");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f107331i = new a("not-acceptable");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f107332j = new a("not-allowed");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f107333k = new a("not-authorized");

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f107334l = new a("payment-required");

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f107335m = new a("recipient-unavailable");

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f107336n = new a("redirect");

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f107337o = new a("registration-required");

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final a f107338p = new a("remote-server-error");

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f107339q = new a("remote-server-not-found");

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f107340r = new a("remote-server-timeout");

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final a f107341s = new a("resource-constraint");

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final a f107342t = new a("service-unavailable");

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final a f107343u = new a("subscription-required");

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f107344v = new a("undefined-condition");

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final a f107345w = new a("unexpected-request");

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final a f107346x = new a("request-timeout");

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private String f564a;

        public a(String str) {
            this.f564a = str;
        }

        public String toString() {
            return this.f564a;
        }
    }

    public hw(int i10, String str, String str2, String str3, String str4, List<hp> list) {
        this.f107319a = i10;
        this.f562a = str;
        this.f107321c = str2;
        this.f107320b = str3;
        this.f107322d = str4;
        this.f563a = list;
    }

    public hw(Bundle bundle) {
        this.f563a = null;
        this.f107319a = bundle.getInt("ext_err_code");
        if (bundle.containsKey("ext_err_type")) {
            this.f562a = bundle.getString("ext_err_type");
        }
        this.f107320b = bundle.getString("ext_err_cond");
        this.f107321c = bundle.getString("ext_err_reason");
        this.f107322d = bundle.getString("ext_err_msg");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f563a = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                hp hpVarA = hp.a((Bundle) parcelable);
                if (hpVarA != null) {
                    this.f563a.add(hpVarA);
                }
            }
        }
    }

    public hw(a aVar) {
        this.f563a = null;
        a(aVar);
        this.f107322d = null;
    }

    private void a(a aVar) {
        this.f107320b = aVar.f564a;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        String str = this.f562a;
        if (str != null) {
            bundle.putString("ext_err_type", str);
        }
        bundle.putInt("ext_err_code", this.f107319a);
        String str2 = this.f107321c;
        if (str2 != null) {
            bundle.putString("ext_err_reason", str2);
        }
        String str3 = this.f107320b;
        if (str3 != null) {
            bundle.putString("ext_err_cond", str3);
        }
        String str4 = this.f107322d;
        if (str4 != null) {
            bundle.putString("ext_err_msg", str4);
        }
        List<hp> list = this.f563a;
        if (list != null) {
            Bundle[] bundleArr = new Bundle[list.size()];
            int i10 = 0;
            Iterator<hp> it = this.f563a.iterator();
            while (it.hasNext()) {
                Bundle bundleA = it.next().a();
                if (bundleA != null) {
                    bundleArr[i10] = bundleA;
                    i10++;
                }
            }
            bundle.putParcelableArray("ext_exts", bundleArr);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m460a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<error code=\"");
        sb2.append(this.f107319a);
        sb2.append("\"");
        if (this.f562a != null) {
            sb2.append(" type=\"");
            sb2.append(this.f562a);
            sb2.append("\"");
        }
        if (this.f107321c != null) {
            sb2.append(" reason=\"");
            sb2.append(this.f107321c);
            sb2.append("\"");
        }
        sb2.append(">");
        if (this.f107320b != null) {
            sb2.append("<");
            sb2.append(this.f107320b);
            sb2.append(" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\"/>");
        }
        if (this.f107322d != null) {
            sb2.append("<text xml:lang=\"en\" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\">");
            sb2.append(this.f107322d);
            sb2.append("</text>");
        }
        Iterator<hp> it = m461a().iterator();
        while (it.hasNext()) {
            sb2.append(it.next().d());
        }
        sb2.append("</error>");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized List<hp> m461a() {
        List<hp> list = this.f563a;
        if (list == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f107320b;
        if (str != null) {
            sb2.append(str);
        }
        sb2.append("(");
        sb2.append(this.f107319a);
        sb2.append(")");
        if (this.f107322d != null) {
            sb2.append(" ");
            sb2.append(this.f107322d);
        }
        return sb2.toString();
    }
}
