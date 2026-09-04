package org.apache.tools.ant.taskdefs.condition;

import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.b2;

/* JADX INFO: compiled from: IsReachable.java */
/* JADX INFO: loaded from: classes5.dex */
public class p extends b2 implements d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f133934h = 30;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f133935i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f133936j = "No hostname defined";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f133937k = "Invalid timeout value";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f133938l = "Unknown host: ";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f133939m = "network error to ";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f133940n = "Both url and host have been specified";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f133941o = "cannot do a proper reachability test on this Java version";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f133942p = "Bad URL ";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f133943q = "No hostname in URL ";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final String f133944r = "isReachable";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f133945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f133946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f133947g = 30;

    private boolean B1(String str) {
        return str == null || str.isEmpty();
    }

    public void D1(String str) {
        this.f133945e = str;
    }

    public void G1(int i10) {
        this.f133947g = i10;
    }

    public void H1(String str) {
        this.f133946f = str;
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() throws BuildException {
        if (B1(this.f133945e) && B1(this.f133946f)) {
            throw new BuildException(f133936j);
        }
        if (this.f133947g < 0) {
            throw new BuildException(f133937k);
        }
        String host = this.f133945e;
        if (!B1(this.f133946f)) {
            if (!B1(this.f133945e)) {
                throw new BuildException(f133940n);
            }
            try {
                host = new URL(this.f133946f).getHost();
                if (B1(host)) {
                    throw new BuildException(f133943q + this.f133946f);
                }
            } catch (MalformedURLException e10) {
                throw new BuildException(f133942p + this.f133946f, e10);
            }
        }
        x1("Probing host " + host, 3);
        boolean zIsReachable = false;
        try {
            InetAddress byName = InetAddress.getByName(host);
            x1("Host address = " + byName.getHostAddress(), 3);
            try {
                zIsReachable = byName.isReachable(this.f133947g * 1000);
            } catch (IOException e11) {
                log(f133939m + host + ": " + e11.toString());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("host is");
            sb2.append(zIsReachable ? "" : " not");
            sb2.append(" reachable");
            x1(sb2.toString(), 3);
            return zIsReachable;
        } catch (UnknownHostException unused) {
            log(f133938l + host);
            return false;
        }
    }
}
