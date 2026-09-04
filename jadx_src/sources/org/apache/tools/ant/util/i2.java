package org.apache.tools.ant.util;

import java.io.IOException;
import java.io.Reader;

/* JADX INFO: compiled from: StringTokenizer.java */
/* JADX INFO: loaded from: classes5.dex */
public class i2 extends org.apache.tools.ant.b2 implements p2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f136819k = -2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f136820e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f136821f = -2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private char[] f136822g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f136823h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f136824i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f136825j = false;

    private boolean B1(char c10) {
        char[] cArr = this.f136822g;
        if (cArr == null) {
            return Character.isWhitespace(c10);
        }
        for (char c11 : cArr) {
            if (c11 == c10) {
                return true;
            }
        }
        return false;
    }

    public void D1(String str) {
        this.f136822g = j2.k(str).toCharArray();
    }

    public void G1(boolean z10) {
        this.f136823h = z10;
    }

    public void H1(boolean z10) {
        this.f136825j = z10;
    }

    public void I1(boolean z10) {
        this.f136824i = z10;
    }

    @Override // org.apache.tools.ant.util.p2
    public String X0() {
        return (this.f136824i || this.f136825j) ? "" : this.f136820e;
    }

    @Override // org.apache.tools.ant.util.p2
    public String h(Reader reader) throws IOException {
        int i10 = this.f136821f;
        if (i10 != -2) {
            this.f136821f = -2;
        } else {
            i10 = reader.read();
        }
        if (i10 == -1) {
            return null;
        }
        boolean z10 = true;
        this.f136820e = "";
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        while (i10 != -1) {
            char c10 = (char) i10;
            boolean zB1 = B1(c10);
            if (!z10) {
                if (!zB1) {
                    this.f136821f = i10;
                    break;
                }
                sb3.append(c10);
                i10 = reader.read();
            } else {
                if (!zB1) {
                    sb2.append(c10);
                } else {
                    if (this.f136823h) {
                        if (sb2.length() <= 0) {
                            sb2.append(c10);
                            break;
                        }
                        this.f136821f = i10;
                        break;
                    }
                    sb3.append(c10);
                    z10 = false;
                }
                i10 = reader.read();
            }
        }
        String string = sb3.toString();
        this.f136820e = string;
        if (this.f136825j) {
            sb2.append(string);
        }
        return sb2.toString();
    }
}
