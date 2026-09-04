package org.apache.tools.ant.util;

import java.io.IOException;
import java.io.Reader;

/* JADX INFO: compiled from: LineTokenizer.java */
/* JADX INFO: loaded from: classes5.dex */
public class z0 extends org.apache.tools.ant.b2 implements p2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f137034h = -2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f137035e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f137036f = -2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f137037g = false;

    public void B1(boolean z10) {
        this.f137037g = z10;
    }

    @Override // org.apache.tools.ant.util.p2
    public String X0() {
        return this.f137037g ? "" : this.f137035e;
    }

    @Override // org.apache.tools.ant.util.p2
    public String h(Reader reader) throws IOException {
        int i10 = this.f137036f;
        if (i10 == -2) {
            i10 = reader.read();
        } else {
            this.f137036f = -2;
        }
        if (i10 == -1) {
            return null;
        }
        this.f137035e = "";
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            if (i10 != -1) {
                if (z11) {
                    if (i10 != 10) {
                        this.f137036f = i10;
                        this.f137035e = "\r";
                        break;
                    }
                    this.f137035e = "\r\n";
                    break;
                }
                if (i10 == 13) {
                    z11 = true;
                } else if (i10 == 10) {
                    this.f137035e = "\n";
                } else {
                    sb2.append((char) i10);
                }
                i10 = reader.read();
            }
            z10 = z11;
            break;
        }
        if (i10 == -1 && z10) {
            this.f137035e = "\r";
        }
        if (this.f137037g) {
            sb2.append(this.f137035e);
        }
        return sb2.toString();
    }
}
