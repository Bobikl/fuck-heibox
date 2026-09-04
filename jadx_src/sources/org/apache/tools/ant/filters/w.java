package org.apache.tools.ant.filters;

import java.io.IOException;
import java.io.Reader;
import org.apache.tools.ant.types.m0;

/* JADX INFO: compiled from: SuffixLines.java */
/* JADX INFO: loaded from: classes5.dex */
public final class w extends b implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f133274h = "suffix";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f133275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f133276g;

    public w() {
        this.f133275f = null;
        this.f133276g = null;
    }

    public w(Reader reader) {
        super(reader);
        this.f133275f = null;
        this.f133276g = null;
    }

    private String i() {
        return this.f133275f;
    }

    private void k() {
        m0[] m0VarArrG = g();
        if (m0VarArrG != null) {
            for (m0 m0Var : m0VarArrG) {
                if (f133274h.equals(m0Var.a())) {
                    this.f133275f = m0Var.c();
                    return;
                }
            }
        }
    }

    public void m(String str) {
        this.f133275f = str;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        if (!a()) {
            k();
            e(true);
        }
        String str = this.f133276g;
        if (str != null && str.isEmpty()) {
            this.f133276g = null;
        }
        String str2 = this.f133276g;
        if (str2 != null) {
            char cCharAt = str2.charAt(0);
            String strSubstring = this.f133276g.substring(1);
            this.f133276g = strSubstring;
            if (!strSubstring.isEmpty()) {
                return cCharAt;
            }
            this.f133276g = null;
            return cCharAt;
        }
        String strD = d();
        this.f133276g = strD;
        if (strD == null) {
            return -1;
        }
        if (this.f133275f != null) {
            String str3 = "\r\n";
            if (!strD.endsWith("\r\n")) {
                str3 = this.f133276g.endsWith("\n") ? "\n" : "";
            }
            StringBuilder sb2 = new StringBuilder();
            String str4 = this.f133276g;
            sb2.append(str4.substring(0, str4.length() - str3.length()));
            sb2.append(this.f133275f);
            sb2.append(str3);
            this.f133276g = sb2.toString();
        }
        return read();
    }

    @Override // org.apache.tools.ant.filters.c
    public Reader t0(Reader reader) {
        w wVar = new w(reader);
        wVar.m(i());
        wVar.e(true);
        return wVar;
    }
}
