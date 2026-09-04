package org.apache.tools.ant.taskdefs.optional.vss;

import java.io.File;
import java.text.SimpleDateFormat;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.o;
import org.apache.tools.ant.types.w;

/* JADX INFO: compiled from: MSVSSHISTORY.java */
/* JADX INFO: loaded from: classes5.dex */
public class i extends org.apache.tools.ant.taskdefs.optional.vss.a {

    /* JADX INFO: compiled from: MSVSSHISTORY.java */
    public static class a extends w {
        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{g.C2, g.D2, g.E2, "default"};
        }
    }

    @Override // org.apache.tools.ant.taskdefs.optional.vss.a
    o i2() {
        o oVar = new o();
        if (E2() == null) {
            throw new BuildException("vsspath attribute must be set!", w1());
        }
        oVar.w(w2());
        oVar.h().O1(g.A2);
        oVar.h().O1(E2());
        oVar.h().O1(g.P2);
        oVar.h().O1(B2());
        oVar.h().O1(D2());
        oVar.h().O1(v2());
        oVar.h().O1(y2());
        oVar.h().O1(s2());
        oVar.h().O1(t2());
        return oVar;
    }

    public void j3(String str) {
        super.M2(new SimpleDateFormat(str));
    }

    public void k3(String str) {
        super.P2(str);
    }

    public void l3(String str) {
        super.Q2(str);
    }

    public void m3(int i10) {
        super.U2(i10);
    }

    public void n3(File file) {
        if (file != null) {
            super.V2(file.getAbsolutePath());
        }
    }

    public void o3(boolean z10) {
        super.X2(z10);
    }

    public void p3(a aVar) {
        String strD = aVar.d();
        strD.hashCode();
        switch (strD) {
            case "nofile":
                super.Y2(g.f135458g3);
                return;
            case "codediff":
                super.Y2(g.f135460i3);
                return;
            case "brief":
                super.Y2(g.f135459h3);
                return;
            case "default":
                super.Y2("");
                return;
            default:
                throw new BuildException("Style " + aVar + " unknown.", w1());
        }
    }

    public void q3(String str) {
        super.Z2(str);
    }

    public void r3(String str) {
        super.a3(str);
    }

    public void s3(String str) {
        super.b3(str);
    }
}
