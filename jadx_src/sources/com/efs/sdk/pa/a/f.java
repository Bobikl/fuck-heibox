package com.efs.sdk.pa.a;

import android.util.Log;
import com.efs.sdk.pa.PAMsgListener;
import java.io.BufferedOutputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    PAMsgListener f42802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f42803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f42804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    BufferedOutputStream f42805d;

    f() {
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    private static com.efs.sdk.pa.b b(String str, long j10, long j11) {
        String strSubstring;
        int i10;
        String strSubstring2;
        int iLastIndexOf;
        int i11;
        int i12;
        if (str == null) {
            return null;
        }
        com.efs.sdk.pa.b bVar = new com.efs.sdk.pa.b();
        try {
            int iIndexOf = str.indexOf(":");
            String strSubstring3 = "";
            if (iIndexOf != -1) {
                int i13 = iIndexOf + 2;
                if (i13 < str.length()) {
                    strSubstring = str.substring(i13, str.length());
                } else {
                    strSubstring = "";
                }
            } else {
                strSubstring = "";
            }
            bVar.f42809a = strSubstring;
            if (str.contains("(") && str.contains(")")) {
                int iIndexOf2 = str.indexOf("(");
                int iIndexOf3 = str.indexOf(")");
                if (iIndexOf2 == -1 || iIndexOf3 == -1 || (i12 = iIndexOf2 + 1) >= str.length() || iIndexOf3 <= i12) {
                    strSubstring2 = "";
                } else {
                    strSubstring2 = str.substring(i12, iIndexOf3);
                }
            } else if (str.contains("{") && str.contains(z5.g.f141884d)) {
                int iIndexOf4 = str.indexOf("{");
                int iIndexOf5 = str.indexOf(z5.g.f141884d);
                if (iIndexOf4 == -1 || iIndexOf5 == -1 || (i10 = iIndexOf4 + 1) >= str.length() || iIndexOf5 <= i10) {
                    strSubstring2 = "";
                } else {
                    strSubstring2 = str.substring(i10, iIndexOf5);
                }
            } else {
                strSubstring2 = "";
            }
            bVar.f42810b = strSubstring2;
            if (!str.contains("null") && str.contains(z5.g.f141884d) && (iLastIndexOf = str.lastIndexOf(z5.g.f141884d)) != -1 && (i11 = iLastIndexOf + 1) < str.length()) {
                strSubstring3 = str.substring(i11, str.length());
            }
            bVar.f42811c = strSubstring3;
            bVar.f42812d = j10;
            bVar.f42813e = j11;
            return bVar;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // com.efs.sdk.pa.a.d
    public final void a(String str, long j10, long j11) {
        com.efs.sdk.pa.b bVarB = b(str, j10, j11);
        if (bVarB != null) {
            if (this.f42803b) {
                Log.e("PerformanceAnalyze", bVarB.toString());
            }
            if (this.f42804c != null) {
                try {
                    this.f42805d.write((bVarB.toString() + "\n").getBytes());
                } catch (Exception unused) {
                }
            }
            this.f42802a.msg(bVarB);
        }
    }
}
