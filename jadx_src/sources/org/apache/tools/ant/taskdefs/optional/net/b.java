package org.apache.tools.ant.taskdefs.optional.net;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Properties;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.h1;

/* JADX INFO: compiled from: SetProxy.java */
/* JADX INFO: loaded from: classes5.dex */
public class b extends u2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f135287r = 80;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f135288s = 1080;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected String f135289k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f135290l = 80;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f135291m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f135292n = 1080;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f135293o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f135294p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f135295q = null;

    /* JADX INFO: renamed from: org.apache.tools.ant.taskdefs.optional.net.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SetProxy.java */
    public static final class C1231b extends Authenticator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private PasswordAuthentication f135296a;

        private C1231b(String str, String str2) {
            this.f135296a = new PasswordAuthentication(str, str2.toCharArray());
        }

        @Override // java.net.Authenticator
        protected PasswordAuthentication getPasswordAuthentication() {
            return this.f135296a;
        }
    }

    private void q2() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Setting proxy to ");
        String str = this.f135289k;
        if (str == null) {
            str = "''";
        }
        sb2.append(str);
        sb2.append(":");
        sb2.append(this.f135290l);
        x1(sb2.toString(), 3);
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        i2();
    }

    public void i2() {
        boolean z10;
        Properties properties = System.getProperties();
        String str = this.f135289k;
        boolean z11 = false;
        boolean z12 = true;
        if (str == null) {
            z10 = false;
        } else if (str.isEmpty()) {
            x1("resetting http proxy", 3);
            properties.remove(h1.f136786c);
            properties.remove(h1.f136787d);
            properties.remove(h1.f136795l);
            properties.remove(h1.f136796m);
            properties.remove(h1.f136788e);
            properties.remove(h1.f136789f);
            properties.remove(h1.f136790g);
            properties.remove(h1.f136791h);
            z10 = false;
            z11 = true;
        } else {
            q2();
            properties.put(h1.f136786c, this.f135289k);
            String string = Integer.toString(this.f135290l);
            properties.put(h1.f136787d, string);
            properties.put(h1.f136788e, this.f135289k);
            properties.put(h1.f136789f, string);
            properties.put(h1.f136790g, this.f135289k);
            properties.put(h1.f136791h, string);
            String str2 = this.f135293o;
            if (str2 != null) {
                properties.put(h1.f136792i, str2);
                properties.put(h1.f136793j, this.f135293o);
                properties.put(h1.f136794k, this.f135293o);
            }
            String str3 = this.f135294p;
            if (str3 != null) {
                properties.put(h1.f136795l, str3);
                properties.put(h1.f136796m, this.f135295q);
            }
            z10 = true;
            z11 = true;
        }
        String str4 = this.f135291m;
        if (str4 == null) {
            z12 = z10;
        } else if (str4.isEmpty()) {
            x1("resetting socks proxy", 3);
            properties.remove(h1.f136797n);
            properties.remove(h1.f136798o);
            properties.remove(h1.f136799p);
            properties.remove(h1.f136800q);
            z11 = true;
            z12 = z10;
        } else {
            properties.put(h1.f136797n, this.f135291m);
            properties.put(h1.f136798o, Integer.toString(this.f135292n));
            String str5 = this.f135294p;
            if (str5 != null) {
                properties.put(h1.f136799p, str5);
                properties.put(h1.f136800q, this.f135295q);
            }
            z11 = true;
        }
        if (this.f135294p != null) {
            if (z12) {
                Authenticator.setDefault(new C1231b(this.f135294p, this.f135295q));
            } else if (z11) {
                String str6 = "";
                Authenticator.setDefault(new C1231b(str6, str6));
            }
        }
    }

    public void j2(String str) {
        this.f135293o = str;
    }

    public void k2(String str) {
        this.f135289k = str;
    }

    public void l2(String str) {
        this.f135295q = str;
    }

    public void m2(int i10) {
        this.f135290l = i10;
    }

    public void n2(String str) {
        this.f135294p = str;
    }

    public void o2(String str) {
        this.f135291m = str;
    }

    public void p2(int i10) {
        this.f135292n = i10;
    }
}
