package cn.fly.verify;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import com.taobao.accs.common.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class cr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static cr f36057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile gk.a f36058b;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a[] f36069a = new a[3];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f36070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HashMap<String, Object> f36071c;

        private a(long j10, HashMap<String, Object> map) {
            this.f36070b = j10;
            this.f36071c = map;
        }

        private void a() {
            try {
                a[] aVarArr = f36069a;
                synchronized (aVarArr) {
                    for (int i10 = 0; i10 < 3; i10++) {
                        if (aVarArr[i10] == null) {
                            this.f36070b = 0L;
                            HashMap<String, Object> map = this.f36071c;
                            if (map != null) {
                                map.clear();
                            }
                            this.f36071c = null;
                            aVarArr[i10] = this;
                            return;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a b(long j10, HashMap<String, Object> map) {
            a[] aVarArr = f36069a;
            synchronized (aVarArr) {
                for (int i10 = 0; i10 < 3; i10++) {
                    a aVar = aVarArr[i10];
                    if (aVar != null) {
                        aVar.f36070b = j10;
                        HashMap<String, Object> map2 = aVar.f36071c;
                        if (map2 != null) {
                            map2.clear();
                        }
                        aVar.f36071c = map;
                        aVarArr[i10] = null;
                        return aVar;
                    }
                }
                return new a(j10, map);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ef.a(ef.a(ef.f36245b), new ee() { // from class: cn.fly.verify.cr.a.1
                    @Override // cn.fly.verify.ee
                    public boolean a(gb gbVar) {
                        fz.a(ax.g()).h().a(new fz.a() { // from class: cn.fly.verify.cr.a.1.1
                            @Override // cn.fly.verify.fz.a
                            public void a(fz.b bVar) throws Throwable {
                                b bVarB;
                                ContentValues contentValues = new ContentValues();
                                contentValues.put(ei.a("004iSdidf[f"), String.valueOf(a.this.f36070b));
                                if (a.this.f36071c != null) {
                                    a.this.f36071c.put(ei.a("006djjMeh!fKec"), ek.a());
                                    a.this.f36071c.put(ei.a("006djjjVehej"), fz.d.c());
                                    a.this.f36071c.put(ei.a("006djjSdd3fCdj"), fz.d.f());
                                    long jLongValue = ((Long) by.a(ei.a("010[fi2i7dj0difDejeceedc"), 0L)).longValue();
                                    if (jLongValue != 0) {
                                        a.this.f36071c.put(ei.a("0100fi,iBdjOdif5ejeceedc"), Long.valueOf(jLongValue));
                                    }
                                }
                                contentValues.put(ei.a("004Adc9did"), Base64.encodeToString(ga.a(ga.c(fz.d.k()), ge.a(a.this.f36071c).getBytes("utf-8")), 2));
                                gk.a(cr.f36058b, contentValues);
                                long jLongValue2 = ((Long) by.a(ei.a("004 dc<fKdg@j"), 2L)).longValue();
                                if (ei.a("004e^dk3ef").equals(bVar.h())) {
                                    jLongValue2 = 120;
                                }
                                if (!by.c() || (bVarB = b.b()) == null) {
                                    return;
                                }
                                if (jLongValue2 <= 0) {
                                    bVarB.run();
                                } else {
                                    if (bq.a().a(jLongValue2, bVarB)) {
                                        return;
                                    }
                                    bVarB.c();
                                }
                            }
                        });
                        return false;
                    }
                });
            } catch (Throwable th2) {
                try {
                    es.a().a(th2);
                } finally {
                    a();
                }
            }
        }
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final b[] f36074b = {new b()};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f36075a = false;

        /* JADX INFO: Access modifiers changed from: private */
        public int a(SparseArray<String> sparseArray) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append('\'');
                    sb2.append(sparseArray.valueAt(i10));
                    sb2.append('\'');
                }
                try {
                    return gk.a(cr.f36058b, "time in (" + sb2.toString() + ")", null);
                } catch (Throwable th2) {
                    es.a().b(th2);
                    return gk.a(cr.f36058b, "time in (" + sb2.toString() + ")", null);
                }
            } catch (Throwable th3) {
                es.a().b(th3);
                return 0;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int a(String[][] strArr) {
            Cursor cursorA = null;
            int i10 = 0;
            try {
                cursorA = gk.a(cr.f36058b, new String[]{ei.a("004iBdidf!f"), ei.a("004,dc7did")}, null, null, "time desc");
                if (cursorA == null) {
                    if (cursorA != null) {
                        try {
                            cursorA.close();
                        } catch (Throwable unused) {
                        }
                    }
                    return 0;
                }
                if (!cursorA.moveToFirst()) {
                    try {
                        cursorA.close();
                    } catch (Throwable unused2) {
                    }
                    return 0;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                int i11 = 0;
                do {
                    try {
                        String[] strArr2 = {cursorA.getString(0), cursorA.getString(1)};
                        long j10 = -1;
                        try {
                            j10 = Long.parseLong(strArr2[0]);
                        } catch (Throwable unused3) {
                        }
                        if (j10 <= jCurrentTimeMillis) {
                            strArr[i11] = strArr2;
                            i11++;
                        }
                        if (i11 >= strArr.length) {
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i10 = i11;
                    }
                } while (cursorA.moveToNext());
                try {
                    cursorA.close();
                    return i11;
                } catch (Throwable unused4) {
                    return i11;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                es.a().b(th);
                return i10;
            } finally {
                if (cursorA != null) {
                    try {
                        cursorA.close();
                    } catch (Throwable unused5) {
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SparseArray<String> a(String[][] strArr, int i10, fz.b bVar) {
            SparseArray<String> sparseArray = new SparseArray<>();
            try {
                HashMap<String, Object> map = new HashMap<>();
                map.put(ei.a("004jgdi"), Integer.valueOf(fz.d.e()));
                map.put(ei.a("006Hdc2fCdddi;cf"), bVar.i());
                map.put(ei.a("005Cdfdkdc8fg"), fz.d.j());
                map.put(ei.a("004 dcdgdidc"), du.a((bd) null));
                map.put(ei.a("011efiUfgdkdjeh1i!ec;jf"), bVar.h());
                map.put(ei.a("015NdcXdid4egVfi;fgdkdjehfcec+jf"), Integer.valueOf(bVar.x()));
                ArrayList arrayList = new ArrayList();
                byte[] bArrC = ga.c(fz.d.k());
                for (int i11 = 0; i11 < i10; i11++) {
                    String[] strArr2 = strArr[i11];
                    try {
                        HashMap mapA = ge.a(new String(ga.b(bArrC, Base64.decode(strArr2[1], 2)), "utf-8").trim());
                        sparseArray.put(i11, strArr2[0]);
                        arrayList.add(mapA);
                    } catch (Throwable th2) {
                        es.a().b(th2);
                    }
                }
                if (arrayList.isEmpty()) {
                    return new SparseArray<>();
                }
                map.put(ei.a("005JdcUdid!fi"), arrayList);
                map.put(ei.a("005i?dkehTfe"), bw.a().b());
                HashMap<String, String> map2 = new HashMap<>();
                map2.put(ei.a("013(ekfi?f^djhkeedc-feiDdiYi7ec"), bu.c());
                map2.put(ei.a("004[dfdkdidc"), fc.a(ax.g()).d().ai());
                fu.a aVar = new fu.a();
                aVar.f36612a = 30000;
                aVar.f36613b = 30000;
                if (!"200".equals(String.valueOf(ge.a((String) new ft(1024, "ceeef5035212dfe7c6a0acdc0ef35ce5b118aab916477037d7381f85c6b6176fcf57b1d1c3296af0bb1c483fe5e1eb0ce9eb2953b44e494ca60777a1b033cc07", "191737288d17e660c4b61440d5d14228a0bf9854499f9d68d8274db55d6d954489371ecf314f26bec236e58fac7fffa9b27bcf923e1229c4080d49f7758739e5bd6014383ed2a75ce1be9b0ab22f283c5c5e11216c5658ba444212b6270d629f2d615b8dfdec8545fb7d4f935b0cc10b6948ab4fc1cb1dd496a8f94b51e888dd", aVar).b(false, map2, map, dy.a().a("gclg") + "/v6/gcl", false)).get(ei.a("006,fiMidi)dgfi"))))) {
                    sparseArray.clear();
                }
                return sparseArray;
            } catch (Throwable th3) {
                es.a().b(th3);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b b() {
            b[] bVarArr = f36074b;
            synchronized (bVarArr) {
                b bVar = bVarArr[0];
                if (bVar == null) {
                    return null;
                }
                bVarArr[0] = null;
                if (bVar.f36075a) {
                    bVar.f36075a = false;
                }
                return bVar;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            b[] bVarArr = f36074b;
            synchronized (bVarArr) {
                if (bVarArr[0] == null) {
                    bVarArr[0] = this;
                }
            }
            this.f36075a = false;
        }

        @Override // java.lang.Runnable
        public void run() {
            fz.a(ax.g()).i().h().x().a(new fz.a() { // from class: cn.fly.verify.cr.b.1
                @Override // cn.fly.verify.fz.a
                public void a(fz.b bVar) {
                    try {
                        String[][] strArr = new String[50][];
                        b bVar2 = b.this;
                        while (true) {
                            int iA = bVar2.a(strArr);
                            if (iA <= 0) {
                                break;
                            }
                            SparseArray sparseArrayA = b.this.a(strArr, iA, bVar);
                            if (sparseArrayA.size() == 0 && b.this.f36075a) {
                                bq.a().d();
                                break;
                            }
                            if (sparseArrayA.size() > 0) {
                                b.this.a((SparseArray<String>) sparseArrayA);
                            }
                            if (iA < 50) {
                                break;
                            } else {
                                bVar2 = b.this;
                            }
                        }
                    } finally {
                        b.this.c();
                    }
                }
            });
        }
    }

    private cr() {
        try {
            Context contextG = ax.g();
            String str = ec.f36234a;
            File fileA = gj.a(contextG, str, true);
            if (fileA.exists() && fileA.length() > 209715200) {
                fileA.delete();
                fileA = gj.a(ax.g(), str, true);
            }
            f36058b = gk.a(fileA.getAbsolutePath(), ei.a("008AflPdidQfkJfdj") + lg.a.f131412e + 1);
            f36058b.a(ei.a("004i7didf'f"), ei.a("004if(eiFi"), true);
            f36058b.a(ei.a("004 dcEdid"), ei.a("004ifNei4i"), true);
            b bVarB = b.b();
            if (bVarB != null) {
                bq.a().a(0L, 180, bVarB);
            }
        } catch (Throwable th2) {
            es.a().b(th2);
        }
    }

    public static synchronized cr a() {
        if (f36057a == null) {
            f36057a = new cr();
        }
        return f36057a;
    }

    public static String a(int[] iArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            String strF = en.f();
            if (iArr[i10] < strF.length()) {
                sb2.append((char) (strF.charAt(iArr[i10]) - 2));
            }
        }
        return sb2.toString();
    }

    public static void a(final ArrayList<HashMap<String, Object>> arrayList, final gq<Void> gqVar) throws Throwable {
        if (arrayList == null || arrayList.isEmpty()) {
            gqVar.a(null);
        } else {
            fz.a(ax.g()).i().r().l().a(new fz.a() { // from class: cn.fly.verify.cr.1
                @Override // cn.fly.verify.fz.a
                public void a(fz.b bVar) {
                    try {
                        File file = new File(ax.g().getFilesDir(), ei.a("003Nfiff)g"));
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        final ArrayList arrayList2 = new ArrayList();
                        for (HashMap map : arrayList) {
                            try {
                                Boolean bool = (Boolean) map.get(ei.a("002d,fi"));
                                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                                String str = (String) map.get(ei.a("0026efKg"));
                                String str2 = (String) map.get("m");
                                String str3 = (String) map.get("args");
                                Object obj = map.get(ei.a("002Gdidc"));
                                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                                    String strA = du.a((bd) null);
                                    HashMap map2 = new HashMap();
                                    map2.put(ei.a("004!dcdgdidc"), strA);
                                    map2.put(ei.a("005iDdkeh,fe"), bw.a().b());
                                    map2.put(ei.a("004'dfdkdidc"), fc.a(ax.g()).d().ah());
                                    map2.put(ei.a("010*fidcehgkOf5djfididk*e"), Integer.valueOf(ax.f35783a));
                                    map2.put(ei.a("006djj+eh:f2ec"), ek.a());
                                    map2.put(ei.a("009djj5el<fcGdj3fi"), ax.e());
                                    map2.put(ei.a("006LdcdkdfEd0di0e"), ax.a().a());
                                    map2.put(ei.a("010(efdkdj7cfUfkTiijKfi"), Boolean.valueOf(ax.b()));
                                    map2.put(ei.a("009Mefdkdj3cf1eeGjQddhh"), Boolean.valueOf(ax.c()));
                                    map2.put(ei.a("004fcf.ei"), Long.valueOf(((Long) by.a(ei.a("004fcfJei"), 5L)).longValue()));
                                    map2.put(ei.a("002c%dc"), (String) by.a(ei.a("002c7dc"), ei.a("006Dhehehfhfhfhf")));
                                    map2.put("usridt", bu.e());
                                    map2.put(ei.a("002Ydidc"), obj);
                                    if (!TextUtils.isEmpty(str3)) {
                                        map2.put("args", ge.a(str3));
                                    }
                                    map2.put(ei.a("008:dcSf$dddiNcf>eedc"), bVar.i());
                                    map2.put("imei", null);
                                    map2.put(Constants.KEY_IMSI, null);
                                    map2.put("sno", null);
                                    map2.put("ssno", null);
                                    map2.put("miui", bVar.r());
                                    map2.put(ei.a("005)dfdkdc.fg"), fz.d.j());
                                    map2.put(ei.a("007Xef*dciUdkdjec"), fz.d.k());
                                    map2.put(ei.a("005[ffdjTdeLdc"), fz.d.l());
                                    map2.put(ei.a("005d7dcfididc"), bVar.l());
                                    map2.put(ei.a("006djj9ddOf4dj"), fz.d.f());
                                    map2.put("appVerCode", Integer.valueOf(fz.d.m()));
                                    map2.put(ei.a("011jdcGeh:dXej'f;eg?d5dfGf"), fz.d.c());
                                    map2.put(ei.a("005@fffifididc"), null);
                                    map2.put("osint", Integer.valueOf(fz.d.g()));
                                    map2.put("osname", fz.d.h());
                                    map2.put("mdpName", eq.class.getName());
                                    String strA2 = ge.a(map2);
                                    String strA3 = ft.a(str);
                                    if (!TextUtils.isEmpty(str2)) {
                                        File file2 = new File(file, str2);
                                        if (zBooleanValue) {
                                            arrayList2.add(file2.getAbsolutePath());
                                        }
                                        cr.b(String.valueOf(obj), file2, zBooleanValue, strA3, str2, strA2);
                                    }
                                }
                            } catch (Throwable th2) {
                                dw.a().a(2, 50, th2, gj.a(map.get(ei.a("002Bdidc")), -1) + "");
                            }
                        }
                        gc.a(file, new FileFilter() { // from class: cn.fly.verify.cr.1.1
                            @Override // java.io.FileFilter
                            public boolean accept(File file3) {
                                return !arrayList2.contains(file3.getAbsolutePath());
                            }
                        });
                    } catch (Throwable th3) {
                        try {
                            dw.a().a(2, -1, th3, "-1");
                            es.a().a(th3);
                        } finally {
                            gqVar.a(null);
                        }
                    }
                }
            });
        }
    }

    public static void a(Object... objArr) {
        try {
            try {
                dx.a().a(13);
                gj.a(b(objArr));
            } catch (Throwable th2) {
                try {
                    dx.a().a(5, th2);
                    gj.a((File) null);
                } catch (Throwable th3) {
                    try {
                        gj.a((File) null);
                    } catch (Throwable th4) {
                        dx.a().a(4, th4);
                    }
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            dx.a().a(4, th5);
        }
    }

    private static File b(Object... objArr) throws Throwable {
        int i10;
        InputStream fileInputStream;
        File file;
        FileOutputStream fileOutputStream;
        dx dxVarA;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[4];
        String str4 = (String) objArr[5];
        InputStream inputStream = null;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            File file2 = new File(ax.g().getFilesDir(), ei.a("003%fi!cc"));
            byte[] bArr = (byte[]) objArr[2];
            try {
                i10 = Integer.parseInt(String.valueOf(objArr[3]));
            } catch (Throwable unused) {
                i10 = 0;
            }
            if (bArr == null || i10 <= 0 || bArr.length < i10 || !str.equals(ga.b(bArr, 0, i10))) {
                File file3 = new File(file2, ei.a("008cCdkVe<efdlfiWcc"));
                if (file3.exists() && str.equals(ga.a(file3))) {
                    fileInputStream = new FileInputStream(file3);
                } else {
                    dx.a().a(20);
                    file3.delete();
                    fileInputStream = null;
                }
            } else {
                fileInputStream = new ByteArrayInputStream(bArr, 0, i10);
            }
            if (fileInputStream != null) {
                try {
                    file = new File(file2, String.valueOf(System.currentTimeMillis()));
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    File file4 = new File(file, file.getName() + ei.a("004=dlgddi%j"));
                    try {
                        fileOutputStream = new FileOutputStream(file4);
                        try {
                            ga.a(str2, fileInputStream, fileOutputStream);
                            el.a(fileInputStream, fileOutputStream);
                            try {
                                if (dz.a().b()) {
                                    dx.a().a(14);
                                    bh.a(str, file4, str3, str4);
                                } else {
                                    dx.a().a(19);
                                }
                                try {
                                    gj.a(file);
                                } catch (Throwable th2) {
                                    th = th2;
                                    dxVarA = dx.a();
                                    dxVarA.a(4, th);
                                }
                            } catch (Throwable th3) {
                                try {
                                    dx.a().a(6, th3);
                                    try {
                                        gj.a(file);
                                    } catch (Throwable th4) {
                                        th = th4;
                                        dxVarA = dx.a();
                                        dxVarA.a(4, th);
                                    }
                                } catch (Throwable th5) {
                                    try {
                                        gj.a(file);
                                    } catch (Throwable th6) {
                                        dx.a().a(4, th6);
                                    }
                                    throw th5;
                                }
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            el.a(fileInputStream, fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        fileOutputStream = null;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    inputStream = fileInputStream;
                    el.a(inputStream);
                    throw th;
                }
            } else {
                file = null;
                inputStream = fileInputStream;
            }
            el.a(inputStream);
            return file;
        } catch (Throwable th10) {
            th = th10;
            el.a(inputStream);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final String str, final File file, final boolean z10, final String str2, final String str3, final String str4) {
        new Thread(new Runnable() { // from class: cn.fly.verify.cr.2
            @Override // java.lang.Runnable
            public void run() {
                FileOutputStream fileOutputStream;
                int i10 = 13;
                try {
                    ByteArrayOutputStream byteArrayOutputStream = null;
                    try {
                        if (z10) {
                            try {
                                if (file.exists() && str3.equals(ga.a(file))) {
                                    if (cr.b(str, 5, file.getAbsolutePath(), null, str4)) {
                                        return;
                                    }
                                    file.delete();
                                    return;
                                }
                                if (file.exists()) {
                                    file.delete();
                                }
                                try {
                                    fileOutputStream = new FileOutputStream(file);
                                    try {
                                        fu.a aVar = new fu.a();
                                        aVar.f36612a = 60000;
                                        aVar.f36613b = 15000;
                                        new fu().a(str2, fileOutputStream, aVar);
                                        el.a(fileOutputStream);
                                        if (file.length() <= 0 || !TextUtils.equals(str3, ga.a(file))) {
                                            if (file.exists()) {
                                                file.delete();
                                            }
                                        } else {
                                            if (cr.b(str, 7, file.getAbsolutePath(), null, str4)) {
                                                return;
                                            }
                                            file.delete();
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        el.a(fileOutputStream);
                                        if (file.length() <= 0 || !TextUtils.equals(str3, ga.a(file))) {
                                            if (file.exists()) {
                                                file.delete();
                                            }
                                        } else if (!cr.b(str, 7, file.getAbsolutePath(), null, str4)) {
                                            file.delete();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    fileOutputStream = null;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                i10 = 5;
                                dw.a().a(5, i10, th, str);
                                es.a().a(th);
                            }
                        } else {
                            if (file.exists()) {
                                file.delete();
                            }
                            try {
                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                try {
                                    fu.a aVar2 = new fu.a();
                                    aVar2.f36612a = 60000;
                                    aVar2.f36613b = 15000;
                                    new fu().a(str2, byteArrayOutputStream2, aVar2);
                                    el.a(byteArrayOutputStream2);
                                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                                    if (byteArray.length <= 0 || !TextUtils.equals(str3, ga.d(byteArray))) {
                                        return;
                                    }
                                    cr.b(str, 9, null, byteArray, str4);
                                } catch (Throwable th5) {
                                    th = th5;
                                    byteArrayOutputStream = byteArrayOutputStream2;
                                    el.a(byteArrayOutputStream);
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        }
                    } catch (Throwable th7) {
                        i10 = 7;
                        th = th7;
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(String str, int i10, String str2, byte[] bArr, String str3) {
        try {
            Method method = null;
            boolean z10 = false;
            for (Method method2 : fl.class.getMethods()) {
                Annotation[] annotations = method2.getAnnotations();
                if (annotations != null) {
                    for (Annotation annotation : annotations) {
                        if (annotation != null && annotation.annotationType() == fm.class) {
                            z10 = true;
                            method = method2;
                            break;
                        }
                    }
                    if (z10) {
                        break;
                    }
                }
            }
            if (bArr != null) {
                cs.a(ax.g(), bArr, str3, method);
            } else {
                cs.a(ax.g(), str2, str3, method);
            }
            return true;
        } catch (Throwable th2) {
            try {
                dw.a().a(6, i10, th2, str);
                es.a().a(th2);
            } catch (Throwable unused) {
            }
            return false;
        }
    }

    public void a(long j10, HashMap<String, Object> map) {
        boolean zA = by.a();
        es.a().a("DH PD: " + map.get(ei.a("004i@ec)jf")) + ", to: " + zA, new Object[0]);
        if (zA) {
            ep.f36341d.execute(a.b(j10, map));
        }
    }
}
