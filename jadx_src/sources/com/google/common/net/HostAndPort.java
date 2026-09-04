package com.google.common.net;

import com.google.common.base.b0;
import com.google.common.base.s;
import com.google.common.base.w;
import com.meituan.robust.Constants;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@a
@o9.b
@s9.j
public final class HostAndPort implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f58800e = -1;
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f58801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f58802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f58803d;

    private HostAndPort(String str, int i10, boolean z10) {
        this.f58801b = str;
        this.f58802c = i10;
        this.f58803d = z10;
    }

    public static HostAndPort a(String str) {
        HostAndPort hostAndPortC = c(str);
        w.u(!hostAndPortC.h(), "Host has a port: %s", str);
        return hostAndPortC;
    }

    public static HostAndPort b(String str, int i10) {
        w.k(i(i10), "Port out of range: %s", i10);
        HostAndPort hostAndPortC = c(str);
        w.u(!hostAndPortC.h(), "Host has a port: %s", str);
        return new HostAndPort(hostAndPortC.f58801b, i10, hostAndPortC.f58803d);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    @s9.a
    public static HostAndPort c(String str) {
        String str2;
        boolean z10;
        String strSubstring;
        String strSubstring2;
        w.E(str);
        int i10 = -1;
        if (!str.startsWith(Constants.ARRAY_TYPE)) {
            int iIndexOf = str.indexOf(58);
            if (iIndexOf >= 0) {
                int i11 = iIndexOf + 1;
                if (str.indexOf(58, i11) == -1) {
                    strSubstring2 = str.substring(0, iIndexOf);
                    strSubstring = str.substring(i11);
                }
                if (!b0.d(strSubstring)) {
                    w.u(strSubstring.startsWith("+") && com.google.common.base.b.f().C(strSubstring), "Unparseable port number: %s", str);
                    try {
                        i10 = Integer.parseInt(strSubstring);
                        w.u(i(i10), "Port number out of range: %s", str);
                    } catch (NumberFormatException unused) {
                        throw new IllegalArgumentException(str.length() != 0 ? "Unparseable port number: ".concat(str) : new String("Unparseable port number: "));
                    }
                }
                return new HostAndPort(str2, i10, z10);
            }
            str2 = str;
            z10 = iIndexOf >= 0;
            strSubstring = null;
            if (!b0.d(strSubstring)) {
                w.u(strSubstring.startsWith("+") && com.google.common.base.b.f().C(strSubstring), "Unparseable port number: %s", str);
                i10 = Integer.parseInt(strSubstring);
                w.u(i(i10), "Port number out of range: %s", str);
            }
            return new HostAndPort(str2, i10, z10);
        }
        String[] strArrE = e(str);
        strSubstring2 = strArrE[0];
        strSubstring = strArrE[1];
        str2 = strSubstring2;
        z10 = false;
        if (!b0.d(strSubstring)) {
            w.u(strSubstring.startsWith("+") && com.google.common.base.b.f().C(strSubstring), "Unparseable port number: %s", str);
            i10 = Integer.parseInt(strSubstring);
            w.u(i(i10), "Port number out of range: %s", str);
        }
        return new HostAndPort(str2, i10, z10);
    }

    private static String[] e(String str) {
        w.u(str.charAt(0) == '[', "Bracketed host-port string must start with a bracket: %s", str);
        int iIndexOf = str.indexOf(58);
        int iLastIndexOf = str.lastIndexOf(93);
        w.u(iIndexOf > -1 && iLastIndexOf > iIndexOf, "Invalid bracketed host/port: %s", str);
        String strSubstring = str.substring(1, iLastIndexOf);
        int i10 = iLastIndexOf + 1;
        if (i10 == str.length()) {
            return new String[]{strSubstring, ""};
        }
        w.u(str.charAt(i10) == ':', "Only a colon may follow a close bracket: %s", str);
        int i11 = iLastIndexOf + 2;
        for (int i12 = i11; i12 < str.length(); i12++) {
            w.u(Character.isDigit(str.charAt(i12)), "Port must be numeric: %s", str);
        }
        return new String[]{strSubstring, str.substring(i11)};
    }

    private static boolean i(int i10) {
        return i10 >= 0 && i10 <= 65535;
    }

    public String d() {
        return this.f58801b;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostAndPort)) {
            return false;
        }
        HostAndPort hostAndPort = (HostAndPort) obj;
        return s.a(this.f58801b, hostAndPort.f58801b) && this.f58802c == hostAndPort.f58802c;
    }

    public int f() {
        w.g0(h());
        return this.f58802c;
    }

    public int g(int i10) {
        return h() ? this.f58802c : i10;
    }

    public boolean h() {
        return this.f58802c >= 0;
    }

    public int hashCode() {
        return s.b(this.f58801b, Integer.valueOf(this.f58802c));
    }

    @s9.a
    public HostAndPort j() {
        w.u(!this.f58803d, "Possible bracketless IPv6 literal: %s", this.f58801b);
        return this;
    }

    public HostAndPort k(int i10) {
        w.d(i(i10));
        return h() ? this : new HostAndPort(this.f58801b, i10, this.f58803d);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.f58801b.length() + 8);
        if (this.f58801b.indexOf(58) >= 0) {
            sb2.append('[');
            sb2.append(this.f58801b);
            sb2.append(']');
        } else {
            sb2.append(this.f58801b);
        }
        if (h()) {
            sb2.append(':');
            sb2.append(this.f58802c);
        }
        return sb2.toString();
    }
}
