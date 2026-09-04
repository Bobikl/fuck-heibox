package org.apache.tools.ant.taskdefs;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: HostInfo.java */
/* JADX INFO: loaded from: classes5.dex */
public class e2 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f134078q = "::";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f134079r = "0.0.0.0";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f134080s = "::1";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f134081t = "127.0.0.1";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f134082u = "localhost";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f134083v = "localdomain";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f134084w = "DOMAIN";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f134085x = "NAME";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f134086y = "ADDR4";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f134087z = "ADDR6";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f134088k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f134089l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private InetAddress f134090m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private InetAddress f134091n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private InetAddress f134092o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<InetAddress> f134093p;

    private void j2() {
        try {
            this.f134093p = new LinkedList();
            Collections.list(NetworkInterface.getNetworkInterfaces()).forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.d2
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f134040b.m2((NetworkInterface) obj);
                }
            });
            n2();
            InetAddress inetAddress = this.f134090m;
            if (inetAddress == null || !l2(inetAddress)) {
                s2(f134084w, f134083v);
                s2(f134085x, "localhost");
            } else {
                p2(this.f134090m.getCanonicalHostName());
            }
            InetAddress inetAddress2 = this.f134092o;
            if (inetAddress2 != null) {
                s2(f134086y, inetAddress2.getHostAddress());
            } else {
                s2(f134086y, f134081t);
            }
            InetAddress inetAddress3 = this.f134091n;
            if (inetAddress3 != null) {
                s2(f134087z, inetAddress3.getHostAddress());
            } else {
                s2(f134087z, f134080s);
            }
        } catch (Exception e10) {
            X1("Error retrieving local host information", e10, 1);
            s2(f134084w, f134083v);
            s2(f134085x, "localhost");
            s2(f134086y, f134081t);
            s2(f134087z, f134080s);
        }
    }

    private void k2() {
        try {
            this.f134093p = Arrays.asList(InetAddress.getAllByName(this.f134089l));
            n2();
            InetAddress inetAddress = this.f134090m;
            if (inetAddress == null || !l2(inetAddress)) {
                p2(this.f134089l);
            } else {
                p2(this.f134090m.getCanonicalHostName());
            }
            InetAddress inetAddress2 = this.f134092o;
            if (inetAddress2 != null) {
                s2(f134086y, inetAddress2.getHostAddress());
            } else {
                s2(f134086y, f134079r);
            }
            InetAddress inetAddress3 = this.f134091n;
            if (inetAddress3 != null) {
                s2(f134087z, inetAddress3.getHostAddress());
            } else {
                s2(f134087z, f134078q);
            }
        } catch (Exception e10) {
            X1("Error retrieving remote host information for host:" + this.f134089l + ".", e10, 1);
            p2(this.f134089l);
            s2(f134086y, f134079r);
            s2(f134087z, f134078q);
        }
    }

    private boolean l2(InetAddress inetAddress) {
        return !inetAddress.getHostAddress().equals(inetAddress.getCanonicalHostName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m2(NetworkInterface networkInterface) {
        this.f134093p.addAll(Collections.list(networkInterface.getInetAddresses()));
    }

    private void n2() {
        for (InetAddress inetAddress : this.f134093p) {
            if (!inetAddress.isMulticastAddress()) {
                if (inetAddress instanceof Inet4Address) {
                    this.f134092o = o2(this.f134092o, inetAddress);
                } else if (inetAddress instanceof Inet6Address) {
                    this.f134091n = o2(this.f134091n, inetAddress);
                }
            }
        }
        this.f134090m = o2(this.f134092o, this.f134091n);
    }

    private InetAddress o2(InetAddress inetAddress, InetAddress inetAddress2) {
        if (inetAddress != null) {
            if (inetAddress2 == null || inetAddress2.isLoopbackAddress()) {
                return inetAddress;
            }
            if (inetAddress2.isLinkLocalAddress()) {
                if (!inetAddress.isLoopbackAddress()) {
                    return inetAddress;
                }
            } else if (inetAddress2.isSiteLocalAddress()) {
                if (!inetAddress.isLoopbackAddress() && !inetAddress.isLinkLocalAddress() && (!inetAddress.isSiteLocalAddress() || l2(inetAddress))) {
                    return inetAddress;
                }
            } else if (!inetAddress.isLoopbackAddress() && !inetAddress.isLinkLocalAddress() && !inetAddress.isSiteLocalAddress() && l2(inetAddress)) {
                return inetAddress;
            }
        }
        return inetAddress2;
    }

    private void p2(String str) {
        int iIndexOf = str.indexOf(46);
        if (iIndexOf > 0) {
            s2(f134085x, str.substring(0, iIndexOf));
            s2(f134084w, str.substring(iIndexOf + 1));
        } else {
            s2(f134085x, str);
            s2(f134084w, f134083v);
        }
    }

    private void s2(String str, String str2) {
        b().n1(this.f134088k + str, str2);
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        String str = this.f134089l;
        if (str == null || str.isEmpty()) {
            j2();
        } else {
            k2();
        }
    }

    public void q2(String str) {
        this.f134089l = str;
    }

    public void r2(String str) {
        this.f134088k = str;
        if (str.endsWith(".")) {
            return;
        }
        this.f134088k += ".";
    }
}
