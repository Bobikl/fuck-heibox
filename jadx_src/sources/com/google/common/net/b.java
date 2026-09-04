package com.google.common.net;

import com.google.common.base.w;
import java.net.InetAddress;
import java.text.ParseException;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: HostSpecifier.java */
/* JADX INFO: loaded from: classes7.dex */
@a
@o9.c
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f58804a;

    private b(String str) {
        this.f58804a = str;
    }

    @s9.a
    public static b a(String str) throws ParseException {
        try {
            return b(str);
        } catch (IllegalArgumentException e10) {
            String strValueOf = String.valueOf(str);
            ParseException parseException = new ParseException(strValueOf.length() != 0 ? "Invalid host specifier: ".concat(strValueOf) : new String("Invalid host specifier: "), 0);
            parseException.initCause(e10);
            throw parseException;
        }
    }

    public static b b(String str) {
        HostAndPort hostAndPortC = HostAndPort.c(str);
        w.d(!hostAndPortC.h());
        String strD = hostAndPortC.d();
        InetAddress inetAddressG = null;
        try {
            inetAddressG = d.g(strD);
        } catch (IllegalArgumentException unused) {
        }
        if (inetAddressG != null) {
            return new b(d.O(inetAddressG));
        }
        e eVarD = e.d(strD);
        if (eVarD.f()) {
            return new b(eVarD.toString());
        }
        String strValueOf = String.valueOf(strD);
        throw new IllegalArgumentException(strValueOf.length() != 0 ? "Domain name does not have a recognized public suffix: ".concat(strValueOf) : new String("Domain name does not have a recognized public suffix: "));
    }

    public static boolean c(String str) {
        try {
            b(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f58804a.equals(((b) obj).f58804a);
        }
        return false;
    }

    public int hashCode() {
        return this.f58804a.hashCode();
    }

    public String toString() {
        return this.f58804a;
    }
}
