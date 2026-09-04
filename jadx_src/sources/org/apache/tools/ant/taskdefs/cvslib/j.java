package org.apache.tools.ant.taskdefs.cvslib;

import java.io.ByteArrayOutputStream;
import java.util.StringTokenizer;

/* JADX INFO: compiled from: CvsVersion.java */
/* JADX INFO: loaded from: classes5.dex */
public class j extends org.apache.tools.ant.taskdefs.c {
    static final long N = 11102;
    static final long O = 100;
    private String J;
    private String K;
    private String L;
    private String M;

    @Override // org.apache.tools.ant.taskdefs.c, org.apache.tools.ant.u2
    public void D1() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        U2(byteArrayOutputStream);
        P2(new ByteArrayOutputStream());
        H2("version");
        super.D1();
        String string = byteArrayOutputStream.toString();
        x1("Received version response \"" + string + "\"", 4);
        StringTokenizer stringTokenizer = new StringTokenizer(string);
        String strNextToken = null;
        String str = null;
        boolean z10 = false;
        boolean z11 = false;
        loop0: while (true) {
            boolean z12 = z11;
            while (true) {
                if (!z10 && !stringTokenizer.hasMoreTokens()) {
                    break loop0;
                }
                String strNextToken2 = z10 ? strNextToken : stringTokenizer.nextToken();
                if ("Client:".equals(strNextToken2)) {
                    z11 = true;
                } else if ("Server:".equals(strNextToken2)) {
                    z12 = true;
                } else if (strNextToken2.startsWith("(CVS") && strNextToken2.endsWith(")")) {
                    if (strNextToken2.length() == 5) {
                        str = "";
                    } else {
                        str = " " + strNextToken2;
                    }
                }
                if (!z11 && !z12 && str != null && strNextToken == null && stringTokenizer.hasMoreTokens()) {
                    strNextToken = stringTokenizer.nextToken();
                    z10 = true;
                } else if (z11 && str != null) {
                    if (stringTokenizer.hasMoreTokens()) {
                        this.J = stringTokenizer.nextToken() + str;
                    }
                    str = null;
                    z10 = false;
                    z11 = false;
                } else if (z12 && str != null) {
                    if (stringTokenizer.hasMoreTokens()) {
                        this.K = stringTokenizer.nextToken() + str;
                    }
                    str = null;
                    z10 = false;
                    z12 = false;
                } else if (!"(client/server)".equals(strNextToken2) || str == null || strNextToken == null || z11 || z12) {
                    z10 = false;
                }
            }
            String str2 = strNextToken + str;
            this.K = str2;
            this.J = str2;
            strNextToken = null;
            str = null;
            z10 = false;
            z11 = true;
        }
        if (this.L != null) {
            b().n1(this.L, this.J);
        }
        if (this.M != null) {
            b().n1(this.M, this.K);
        }
    }

    public String b3() {
        return this.J;
    }

    public String c3() {
        return this.K;
    }

    public void d3(String str) {
        this.L = str;
    }

    public void e3(String str) {
        this.M = str;
    }

    public boolean f3() {
        if (this.K == null) {
            return false;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(this.K, ".");
        long j10 = 10000;
        long j11 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int i10 = 0;
            while (i10 < strNextToken.length() && Character.isDigit(strNextToken.charAt(i10))) {
                i10++;
            }
            j11 += Long.parseLong(strNextToken.substring(0, i10)) * j10;
            if (j10 == 1) {
                break;
            }
            j10 /= 100;
        }
        return j11 >= N;
    }
}
