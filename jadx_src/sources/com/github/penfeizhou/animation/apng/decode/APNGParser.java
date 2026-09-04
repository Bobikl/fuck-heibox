package com.github.penfeizhou.animation.apng.decode;

import android.content.Context;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class APNGParser {

    public static class FormatException extends IOException {
        FormatException() {
            super("APNG Format error");
        }
    }

    public static boolean a(Context context, int i10) {
        InputStream inputStreamOpenRawResource = null;
        try {
            inputStreamOpenRawResource = context.getResources().openRawResource(i10);
            return c(new com.github.penfeizhou.animation.io.f(inputStreamOpenRawResource));
        } catch (Exception unused) {
            return false;
        } finally {
            if (inputStreamOpenRawResource != null) {
                try {
                    inputStreamOpenRawResource.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public static boolean b(Context context, String str) {
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            return c(new com.github.penfeizhou.animation.io.f(inputStreamOpen));
        } catch (Exception unused) {
            return false;
        } finally {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public static boolean c(com.github.penfeizhou.animation.io.e eVar) {
        com.github.penfeizhou.animation.apng.io.a aVar = eVar instanceof com.github.penfeizhou.animation.apng.io.a ? (com.github.penfeizhou.animation.apng.io.a) eVar : new com.github.penfeizhou.animation.apng.io.a(eVar);
        try {
            if (!aVar.c("\u0089PNG") || !aVar.c("\r\n\u001a\n")) {
                throw new FormatException();
            }
            while (aVar.available() > 0) {
                if (f(aVar) instanceof a) {
                    return true;
                }
            }
            return false;
        } catch (IOException e10) {
            if (e10 instanceof FormatException) {
                return false;
            }
            e10.printStackTrace();
            return false;
        }
    }

    public static boolean d(String str) throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                boolean zC = c(new com.github.penfeizhou.animation.io.f(fileInputStream2));
                try {
                    fileInputStream2.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                return zC;
            } catch (Exception unused) {
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static List<d> e(com.github.penfeizhou.animation.apng.io.a aVar) throws IOException {
        if (!aVar.c("\u0089PNG") || !aVar.c("\r\n\u001a\n")) {
            throw new FormatException();
        }
        ArrayList arrayList = new ArrayList();
        while (aVar.available() > 0) {
            arrayList.add(f(aVar));
        }
        return arrayList;
    }

    private static d f(com.github.penfeizhou.animation.apng.io.a aVar) throws IOException {
        d iVar;
        int iPosition = aVar.position();
        int iE = aVar.e();
        int iD = aVar.d();
        if (iD == a.f43186g) {
            iVar = new a();
        } else if (iD == e.f43209n) {
            iVar = new e();
        } else if (iD == f.f43224f) {
            iVar = new f();
        } else if (iD == g.f43226e) {
            iVar = new g();
        } else if (iD == h.f43227e) {
            iVar = new h();
        } else {
            iVar = iD == i.f43228h ? new i() : new d();
        }
        iVar.f43208d = iPosition;
        iVar.f43206b = iD;
        iVar.f43205a = iE;
        iVar.c(aVar);
        iVar.f43207c = aVar.e();
        return iVar;
    }
}
