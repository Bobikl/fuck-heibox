package v1;

import androidx.constraintlayout.core.motion.utils.u;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.parser.d;
import androidx.constraintlayout.core.parser.f;

/* JADX INFO: compiled from: KeyParser.java */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: compiled from: KeyParser.java */
    public interface a {
        int get(int i10);
    }

    /* JADX INFO: compiled from: KeyParser.java */
    public interface b {
        int get(String str);
    }

    public static void a(String[] strArr) {
        c("{frame:22,\ntarget:'widget1',\neasing:'easeIn',\ncurveFit:'spline',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:'32',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}");
    }

    private static u b(String str, b bVar, a aVar) {
        u uVar = new u();
        try {
            f fVarD = CLParser.d(str);
            int size = fVarD.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) fVarD.E(i10);
                String strB = dVar.b();
                androidx.constraintlayout.core.parser.c cVarN0 = dVar.n0();
                int i11 = bVar.get(strB);
                if (i11 == -1) {
                    System.err.println("unknown type " + strB);
                } else {
                    int i12 = aVar.get(i11);
                    if (i12 == 1) {
                        uVar.d(i11, fVarD.getBoolean(i10));
                    } else if (i12 == 2) {
                        uVar.b(i11, cVarN0.j());
                        System.out.println("parse " + strB + " INT_MASK > " + cVarN0.j());
                    } else if (i12 == 4) {
                        uVar.a(i11, cVarN0.i());
                        System.out.println("parse " + strB + " FLOAT_MASK > " + cVarN0.i());
                    } else if (i12 == 8) {
                        uVar.c(i11, cVarN0.b());
                        System.out.println("parse " + strB + " STRING_MASK > " + cVarN0.b());
                    }
                }
            }
        } catch (CLParsingException e10) {
            e10.printStackTrace();
        }
        return uVar;
    }

    public static u c(String str) {
        return b(str, new b() { // from class: v1.a
            @Override // v1.c.b
            public final int get(String str2) {
                return v.a(str2);
            }
        }, new a() { // from class: v1.b
            @Override // v1.c.a
            public final int get(int i10) {
                return v.b(i10);
            }
        });
    }
}
