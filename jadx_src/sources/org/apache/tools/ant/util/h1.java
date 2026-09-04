package org.apache.tools.ant.util;

import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: ProxySetup.java */
/* JADX INFO: loaded from: classes5.dex */
public class h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f136785b = "java.net.useSystemProxies";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f136786c = "http.proxyHost";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f136787d = "http.proxyPort";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f136788e = "https.proxyHost";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f136789f = "https.proxyPort";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f136790g = "ftp.proxyHost";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f136791h = "ftp.proxyPort";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f136792i = "http.nonProxyHosts";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f136793j = "https.nonProxyHosts";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f136794k = "ftp.nonProxyHosts";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f136795l = "http.proxyUser";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f136796m = "http.proxyPassword";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f136797n = "socksProxyHost";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f136798o = "socksProxyPort";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f136799p = "java.net.socks.username";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f136800q = "java.net.socks.password";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Project f136801a;

    public h1(Project project) {
        this.f136801a = project;
    }

    public static String b() {
        try {
            return System.getProperty(f136785b);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public void a() {
        if (b() == null) {
            String strU0 = this.f136801a.u0(f136785b);
            if (strU0 == null || Project.t1(strU0)) {
                strU0 = "true";
            }
            String str = "setting java.net.useSystemProxies to " + strU0;
            try {
                this.f136801a.M0(str, 4);
                System.setProperty(f136785b, strU0);
            } catch (SecurityException unused) {
                this.f136801a.L0("Security Exception when " + str);
            }
        }
    }
}
