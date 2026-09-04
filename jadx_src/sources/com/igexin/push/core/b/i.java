package com.igexin.push.core.b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.text.TextUtils;
import com.igexin.push.util.EncryptUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class i implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63524a = "com.igexin.push.core.b.i";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static i f63525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, String> f63526c = new TreeMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f63527d;

    private i() {
    }

    public static i a() {
        if (f63525b == null) {
            f63525b = new i();
        }
        return f63525b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SQLiteDatabase sQLiteDatabase, int i10, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(i10));
        contentValues.put("value", str);
        sQLiteDatabase.replace("runtime", null, contentValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SQLiteDatabase sQLiteDatabase, int i10, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(i10));
        contentValues.put("value", bArr);
        sQLiteDatabase.replace("runtime", null, contentValues);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004d A[PHI: r11
  0x004d: PHI (r11v3 android.database.Cursor) = (r11v2 android.database.Cursor), (r11v4 android.database.Cursor) binds: [B:19:0x004b, B:12:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    private byte[] a(SQLiteDatabase sQLiteDatabase, int i10) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor = null;
        try {
            cursorQuery = sQLiteDatabase.query("runtime", new String[]{"value"}, "id=" + i10, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        byte[] bArrC = com.igexin.a.a.a.a.c(cursorQuery.getBlob(cursorQuery.getColumnIndex("value")), com.igexin.push.core.d.C);
                        cursorQuery.close();
                        return bArrC;
                    }
                } catch (Exception unused) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception unused2) {
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0047 A[PHI: r11
  0x0047: PHI (r11v3 android.database.Cursor) = (r11v2 android.database.Cursor), (r11v4 android.database.Cursor) binds: [B:19:0x0045, B:12:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    private String b(SQLiteDatabase sQLiteDatabase, int i10) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor = null;
        try {
            cursorQuery = sQLiteDatabase.query("runtime", new String[]{"value"}, "id=" + i10, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex("value"));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Exception unused) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception unused2) {
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
        }
        return null;
    }

    private void e() {
        String string = com.igexin.push.core.d.f63687u;
        if (TextUtils.isEmpty(string) || string.length() <= 8) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(androidx.exifinterface.media.a.X4);
                sb2.append(com.igexin.a.b.a.a(h() + com.igexin.push.core.d.f63669c + UUID.randomUUID()));
                string = sb2.toString();
            } catch (Throwable th2) {
                com.igexin.a.a.c.b.a(f63524a + "|" + th2.toString(), new Object[0]);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(androidx.exifinterface.media.a.X4);
                sb3.append(h());
                string = sb3.toString();
            }
        }
        String str = "A-" + string + Constants.ACCEPT_TIME_SEPARATOR_SERVER + System.currentTimeMillis();
        com.igexin.push.core.d.B = str;
        if (str.length() >= 64) {
            try {
                com.igexin.push.core.d.B = com.igexin.push.core.d.B.substring(0, 62);
            } catch (Throwable th3) {
                com.igexin.a.a.c.b.a(f63524a + "|" + th3.toString(), new Object[0]);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004a A[PHI: r1
  0x004a: PHI (r1v3 android.database.Cursor) = (r1v2 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:14:0x0048, B:8:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    private void e(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("runtime", new String[]{"value"}, "id=?", new String[]{com.tencent.connect.common.Constants.VIA_REPORT_TYPE_CHAT_AUDIO}, null, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                com.igexin.push.core.d.C = new String(com.igexin.a.a.a.a.c(cursorQuery.getBlob(cursorQuery.getColumnIndex("value")), com.igexin.a.b.a.a(com.igexin.push.core.d.f63671e.getPackageName())));
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception unused) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
        if (com.igexin.push.core.d.C == null) {
            String str = com.igexin.push.core.d.f63687u;
            if (str == null) {
                str = "cantgetimei";
            }
            com.igexin.push.core.d.C = com.igexin.a.b.a.a(str);
        }
    }

    private void f(SQLiteDatabase sQLiteDatabase) throws Throwable {
        String strB = b(sQLiteDatabase, 2);
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        if (strB.equals("null")) {
            strB = null;
        }
        com.igexin.push.core.d.f63691y = strB;
    }

    private boolean f() {
        return com.igexin.a.a.b.c.b().a(new ab(this), false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        com.igexin.push.core.e.d.a().b(com.igexin.push.core.d.f63671e, com.igexin.push.core.d.f63685s);
        com.igexin.push.core.e.d.a().a(com.igexin.push.core.d.f63671e, com.igexin.push.core.d.f63684r);
        String strC = com.igexin.push.util.d.c();
        if (strC == null || strC.length() <= 5) {
            com.igexin.push.util.d.e();
        }
    }

    private void g(SQLiteDatabase sQLiteDatabase) throws Throwable {
        String strB = b(sQLiteDatabase, 46);
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        if (strB.equals("null")) {
            strB = null;
        }
        com.igexin.push.core.d.f63692z = strB;
    }

    private String h() {
        Random random = new Random(Math.abs(new Random().nextLong()));
        String str = "";
        for (int i10 = 0; i10 < 15; i10++) {
            str = str + random.nextInt(10);
        }
        return str;
    }

    private void h(SQLiteDatabase sQLiteDatabase) throws Throwable {
        String strB = b(sQLiteDatabase, 48);
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        if (strB.equals("null")) {
            strB = null;
        }
        com.igexin.push.core.d.A = strB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] h(String str) {
        return EncryptUtils.getBytesEncrypted(str.getBytes());
    }

    private void i(SQLiteDatabase sQLiteDatabase) throws Throwable {
        String strB = b(sQLiteDatabase, 3);
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        if (strB.equals("null")) {
            strB = null;
        }
        com.igexin.push.core.d.B = strB;
    }

    private void j(SQLiteDatabase sQLiteDatabase) throws Throwable {
        byte[] bArrA = a(sQLiteDatabase, 1);
        if (bArrA != null) {
            try {
                String str = new String(bArrA);
                com.igexin.push.core.d.f63684r = str.equals("null") ? 0L : Long.parseLong(str);
            } catch (Exception unused) {
            }
            com.igexin.a.a.c.b.a(f63524a + "|db version changed, save session = " + com.igexin.push.core.d.f63684r, new Object[0]);
        }
    }

    private void k(SQLiteDatabase sQLiteDatabase) throws Throwable {
        byte[] bArrA = a(sQLiteDatabase, 20);
        if (bArrA != null) {
            String str = new String(bArrA);
            if (str.equals("null")) {
                str = null;
            }
            com.igexin.push.core.d.f63686t = str;
            com.igexin.push.core.d.f63685s = str;
            com.igexin.a.a.c.b.a(f63524a + "|db version changed, save cid = " + str, new Object[0]);
        }
    }

    @Override // com.igexin.push.core.b.b
    public void a(SQLiteDatabase sQLiteDatabase) {
    }

    public boolean a(int i10) {
        com.igexin.push.core.d.R = i10;
        return com.igexin.a.a.b.c.b().a(new p(this), false, true);
    }

    public boolean a(long j10) {
        com.igexin.push.core.d.a(j10);
        return com.igexin.a.a.b.c.b().a(new ac(this), false, true);
    }

    public boolean a(String str) {
        return com.igexin.a.a.b.c.b().a(new aa(this, str), false, true);
    }

    public boolean a(String str, String str2) {
        return com.igexin.a.a.b.c.b().a(new z(this, str, str2), false, true);
    }

    public boolean a(String str, String str2, long j10) {
        com.igexin.push.core.d.f63684r = j10;
        if (TextUtils.isEmpty(com.igexin.push.core.d.f63691y)) {
            com.igexin.push.core.d.f63691y = str2;
        }
        com.igexin.push.core.d.f63685s = str;
        return f();
    }

    public boolean a(String str, boolean z10) {
        com.igexin.a.a.b.c cVarB;
        com.igexin.a.a.d.e rVar;
        if (str == null) {
            return false;
        }
        if (z10) {
            if (!str.equals(com.igexin.push.core.d.am)) {
                com.igexin.push.core.d.am = str.equals("null") ? null : str;
                cVarB = com.igexin.a.a.b.c.b();
                rVar = new q(this, str);
                return cVarB.a(rVar, false, true);
            }
            return false;
        }
        if (!str.equals(com.igexin.push.core.d.an)) {
            com.igexin.push.core.d.an = str.equals("null") ? null : str;
            cVarB = com.igexin.a.a.b.c.b();
            rVar = new r(this, str);
            return cVarB.a(rVar, false, true);
        }
        return false;
    }

    public boolean a(boolean z10) {
        if (com.igexin.push.core.d.M == z10) {
            return false;
        }
        com.igexin.push.core.d.M = z10;
        if (!z10) {
            com.igexin.push.f.a.k();
        }
        return com.igexin.a.a.b.c.b().a(new n(this), false, true);
    }

    public void b() {
        com.igexin.a.a.b.c.b().a(new j(this), false, true);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:104:0x01be A[Catch: all -> 0x035a, Exception -> 0x036d, TryCatch #1 {Exception -> 0x036d, blocks: (B:7:0x0034, B:9:0x003a, B:55:0x00a1, B:58:0x00a9, B:59:0x00ac, B:62:0x00b4, B:63:0x00b8, B:66:0x00c0, B:67:0x00c4, B:71:0x00d1, B:70:0x00cd, B:72:0x00d5, B:75:0x00e2, B:76:0x0103, B:79:0x0110, B:80:0x0131, B:83:0x0139, B:84:0x013d, B:88:0x0149, B:87:0x0145, B:89:0x014d, B:92:0x0155, B:93:0x0159, B:96:0x0166, B:97:0x0187, B:100:0x0194, B:101:0x01b5, B:105:0x01c2, B:104:0x01be, B:106:0x01c6, B:109:0x01d3, B:110:0x01d9, B:113:0x01e6, B:114:0x01ea, B:118:0x01f6, B:117:0x01f2, B:119:0x01fa, B:122:0x0202, B:123:0x0206, B:127:0x0213, B:126:0x020f, B:128:0x0217, B:130:0x021d, B:131:0x0225, B:132:0x022e, B:135:0x0236, B:136:0x023a, B:140:0x0247, B:139:0x0243, B:141:0x024b, B:145:0x0258, B:144:0x0254, B:146:0x025c, B:149:0x0269, B:150:0x028a, B:153:0x0297, B:154:0x02b8, B:156:0x02be, B:160:0x02c7, B:161:0x02d0, B:165:0x02dd, B:164:0x02d9, B:166:0x02e1, B:170:0x02ee, B:169:0x02ea, B:171:0x02f2, B:173:0x02f8, B:178:0x0302, B:179:0x0306, B:182:0x030e, B:183:0x0312, B:186:0x031a, B:187:0x031e, B:194:0x0334, B:196:0x0339), top: B:286:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:117:0x01f2 A[Catch: all -> 0x035a, Exception -> 0x036d, TryCatch #1 {Exception -> 0x036d, blocks: (B:7:0x0034, B:9:0x003a, B:55:0x00a1, B:58:0x00a9, B:59:0x00ac, B:62:0x00b4, B:63:0x00b8, B:66:0x00c0, B:67:0x00c4, B:71:0x00d1, B:70:0x00cd, B:72:0x00d5, B:75:0x00e2, B:76:0x0103, B:79:0x0110, B:80:0x0131, B:83:0x0139, B:84:0x013d, B:88:0x0149, B:87:0x0145, B:89:0x014d, B:92:0x0155, B:93:0x0159, B:96:0x0166, B:97:0x0187, B:100:0x0194, B:101:0x01b5, B:105:0x01c2, B:104:0x01be, B:106:0x01c6, B:109:0x01d3, B:110:0x01d9, B:113:0x01e6, B:114:0x01ea, B:118:0x01f6, B:117:0x01f2, B:119:0x01fa, B:122:0x0202, B:123:0x0206, B:127:0x0213, B:126:0x020f, B:128:0x0217, B:130:0x021d, B:131:0x0225, B:132:0x022e, B:135:0x0236, B:136:0x023a, B:140:0x0247, B:139:0x0243, B:141:0x024b, B:145:0x0258, B:144:0x0254, B:146:0x025c, B:149:0x0269, B:150:0x028a, B:153:0x0297, B:154:0x02b8, B:156:0x02be, B:160:0x02c7, B:161:0x02d0, B:165:0x02dd, B:164:0x02d9, B:166:0x02e1, B:170:0x02ee, B:169:0x02ea, B:171:0x02f2, B:173:0x02f8, B:178:0x0302, B:179:0x0306, B:182:0x030e, B:183:0x0312, B:186:0x031a, B:187:0x031e, B:194:0x0334, B:196:0x0339), top: B:286:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0200  */
    /* JADX WARN: Code duplicated, block: B:125:0x020c  */
    /* JADX WARN: Code duplicated, block: B:126:0x020f A[Catch: all -> 0x035a, Exception -> 0x036d, TryCatch #1 {Exception -> 0x036d, blocks: (B:7:0x0034, B:9:0x003a, B:55:0x00a1, B:58:0x00a9, B:59:0x00ac, B:62:0x00b4, B:63:0x00b8, B:66:0x00c0, B:67:0x00c4, B:71:0x00d1, B:70:0x00cd, B:72:0x00d5, B:75:0x00e2, B:76:0x0103, B:79:0x0110, B:80:0x0131, B:83:0x0139, B:84:0x013d, B:88:0x0149, B:87:0x0145, B:89:0x014d, B:92:0x0155, B:93:0x0159, B:96:0x0166, B:97:0x0187, B:100:0x0194, B:101:0x01b5, B:105:0x01c2, B:104:0x01be, B:106:0x01c6, B:109:0x01d3, B:110:0x01d9, B:113:0x01e6, B:114:0x01ea, B:118:0x01f6, B:117:0x01f2, B:119:0x01fa, B:122:0x0202, B:123:0x0206, B:127:0x0213, B:126:0x020f, B:128:0x0217, B:130:0x021d, B:131:0x0225, B:132:0x022e, B:135:0x0236, B:136:0x023a, B:140:0x0247, B:139:0x0243, B:141:0x024b, B:145:0x0258, B:144:0x0254, B:146:0x025c, B:149:0x0269, B:150:0x028a, B:153:0x0297, B:154:0x02b8, B:156:0x02be, B:160:0x02c7, B:161:0x02d0, B:165:0x02dd, B:164:0x02d9, B:166:0x02e1, B:170:0x02ee, B:169:0x02ea, B:171:0x02f2, B:173:0x02f8, B:178:0x0302, B:179:0x0306, B:182:0x030e, B:183:0x0312, B:186:0x031a, B:187:0x031e, B:194:0x0334, B:196:0x0339), top: B:286:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0234  */
    /* JADX WARN: Code duplicated, block: B:138:0x0240  */
    /* JADX WARN: Code duplicated, block: B:139:0x0243 A[Catch: all -> 0x035a, Exception -> 0x036d, TryCatch #1 {Exception -> 0x036d, blocks: (B:7:0x0034, B:9:0x003a, B:55:0x00a1, B:58:0x00a9, B:59:0x00ac, B:62:0x00b4, B:63:0x00b8, B:66:0x00c0, B:67:0x00c4, B:71:0x00d1, B:70:0x00cd, B:72:0x00d5, B:75:0x00e2, B:76:0x0103, B:79:0x0110, B:80:0x0131, B:83:0x0139, B:84:0x013d, B:88:0x0149, B:87:0x0145, B:89:0x014d, B:92:0x0155, B:93:0x0159, B:96:0x0166, B:97:0x0187, B:100:0x0194, B:101:0x01b5, B:105:0x01c2, B:104:0x01be, B:106:0x01c6, B:109:0x01d3, B:110:0x01d9, B:113:0x01e6, B:114:0x01ea, B:118:0x01f6, B:117:0x01f2, B:119:0x01fa, B:122:0x0202, B:123:0x0206, B:127:0x0213, B:126:0x020f, B:128:0x0217, B:130:0x021d, B:131:0x0225, B:132:0x022e, B:135:0x0236, B:136:0x023a, B:140:0x0247, B:139:0x0243, B:141:0x024b, B:145:0x0258, B:144:0x0254, B:146:0x025c, B:149:0x0269, B:150:0x028a, B:153:0x0297, B:154:0x02b8, B:156:0x02be, B:160:0x02c7, B:161:0x02d0, B:165:0x02dd, B:164:0x02d9, B:166:0x02e1, B:170:0x02ee, B:169:0x02ea, B:171:0x02f2, B:173:0x02f8, B:178:0x0302, B:179:0x0306, B:182:0x030e, B:183:0x0312, B:186:0x031a, B:187:0x031e, B:194:0x0334, B:196:0x0339), top: B:286:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0251  */
    /* JADX WARN: Code duplicated, block: B:144:0x0254 A[Catch: all -> 0x035a, Exception -> 0x036d, TryCatch #1 {Exception -> 0x036d, blocks: (B:7:0x0034, B:9:0x003a, B:55:0x00a1, B:58:0x00a9, B:59:0x00ac, B:62:0x00b4, B:63:0x00b8, B:66:0x00c0, B:67:0x00c4, B:71:0x00d1, B:70:0x00cd, B:72:0x00d5, B:75:0x00e2, B:76:0x0103, B:79:0x0110, B:80:0x0131, B:83:0x0139, B:84:0x013d, B:88:0x0149, B:87:0x0145, B:89:0x014d, B:92:0x0155, B:93:0x0159, B:96:0x0166, B:97:0x0187, B:100:0x0194, B:101:0x01b5, B:105:0x01c2, B:104:0x01be, B:106:0x01c6, B:109:0x01d3, B:110:0x01d9, B:113:0x01e6, B:114:0x01ea, B:118:0x01f6, B:117:0x01f2, B:119:0x01fa, B:122:0x0202, B:123:0x0206, B:127:0x0213, B:126:0x020f, B:128:0x0217, B:130:0x021d, B:131:0x0225, B:132:0x022e, B:135:0x0236, B:136:0x023a, B:140:0x0247, B:139:0x0243, B:141:0x024b, B:145:0x0258, B:144:0x0254, B:146:0x025c, B:149:0x0269, B:150:0x028a, B:153:0x0297, B:154:0x02b8, B:156:0x02be, B:160:0x02c7, B:161:0x02d0, B:165:0x02dd, B:164:0x02d9, B:166:0x02e1, B:170:0x02ee, B:169:0x02ea, B:171:0x02f2, B:173:0x02f8, B:178:0x0302, B:179:0x0306, B:182:0x030e, B:183:0x0312, B:186:0x031a, B:187:0x031e, B:194:0x0334, B:196:0x0339), top: B:286:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0267  */
    /* JADX WARN: Code duplicated, block: B:152:0x0295  */
    /* JADX WARN: Code duplicated, block: B:159:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:163:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:164:0x02d9 A[Catch: all -> 0x035a, Exception -> 0x036d, TryCatch #1 {Exception -> 0x036d, blocks: (B:7:0x0034, B:9:0x003a, B:55:0x00a1, B:58:0x00a9, B:59:0x00ac, B:62:0x00b4, B:63:0x00b8, B:66:0x00c0, B:67:0x00c4, B:71:0x00d1, B:70:0x00cd, B:72:0x00d5, B:75:0x00e2, B:76:0x0103, B:79:0x0110, B:80:0x0131, B:83:0x0139, B:84:0x013d, B:88:0x0149, B:87:0x0145, B:89:0x014d, B:92:0x0155, B:93:0x0159, B:96:0x0166, B:97:0x0187, B:100:0x0194, B:101:0x01b5, B:105:0x01c2, B:104:0x01be, B:106:0x01c6, B:109:0x01d3, B:110:0x01d9, B:113:0x01e6, B:114:0x01ea, B:118:0x01f6, B:117:0x01f2, B:119:0x01fa, B:122:0x0202, B:123:0x0206, B:127:0x0213, B:126:0x020f, B:128:0x0217, B:130:0x021d, B:131:0x0225, B:132:0x022e, B:135:0x0236, B:136:0x023a, B:140:0x0247, B:139:0x0243, B:141:0x024b, B:145:0x0258, B:144:0x0254, B:146:0x025c, B:149:0x0269, B:150:0x028a, B:153:0x0297, B:154:0x02b8, B:156:0x02be, B:160:0x02c7, B:161:0x02d0, B:165:0x02dd, B:164:0x02d9, B:166:0x02e1, B:170:0x02ee, B:169:0x02ea, B:171:0x02f2, B:173:0x02f8, B:178:0x0302, B:179:0x0306, B:182:0x030e, B:183:0x0312, B:186:0x031a, B:187:0x031e, B:194:0x0334, B:196:0x0339), top: B:286:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:169:0x02ea A[Catch: all -> 0x035a, Exception -> 0x036d, TryCatch #1 {Exception -> 0x036d, blocks: (B:7:0x0034, B:9:0x003a, B:55:0x00a1, B:58:0x00a9, B:59:0x00ac, B:62:0x00b4, B:63:0x00b8, B:66:0x00c0, B:67:0x00c4, B:71:0x00d1, B:70:0x00cd, B:72:0x00d5, B:75:0x00e2, B:76:0x0103, B:79:0x0110, B:80:0x0131, B:83:0x0139, B:84:0x013d, B:88:0x0149, B:87:0x0145, B:89:0x014d, B:92:0x0155, B:93:0x0159, B:96:0x0166, B:97:0x0187, B:100:0x0194, B:101:0x01b5, B:105:0x01c2, B:104:0x01be, B:106:0x01c6, B:109:0x01d3, B:110:0x01d9, B:113:0x01e6, B:114:0x01ea, B:118:0x01f6, B:117:0x01f2, B:119:0x01fa, B:122:0x0202, B:123:0x0206, B:127:0x0213, B:126:0x020f, B:128:0x0217, B:130:0x021d, B:131:0x0225, B:132:0x022e, B:135:0x0236, B:136:0x023a, B:140:0x0247, B:139:0x0243, B:141:0x024b, B:145:0x0258, B:144:0x0254, B:146:0x025c, B:149:0x0269, B:150:0x028a, B:153:0x0297, B:154:0x02b8, B:156:0x02be, B:160:0x02c7, B:161:0x02d0, B:165:0x02dd, B:164:0x02d9, B:166:0x02e1, B:170:0x02ee, B:169:0x02ea, B:171:0x02f2, B:173:0x02f8, B:178:0x0302, B:179:0x0306, B:182:0x030e, B:183:0x0312, B:186:0x031a, B:187:0x031e, B:194:0x0334, B:196:0x0339), top: B:286:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x0301  */
    /* JADX WARN: Code duplicated, block: B:181:0x030c  */
    /* JADX WARN: Code duplicated, block: B:185:0x0318  */
    /* JADX WARN: Code duplicated, block: B:190:0x0329  */
    /* JADX WARN: Code duplicated, block: B:191:0x032c A[Catch: Exception -> 0x0334, all -> 0x035a, TryCatch #5 {all -> 0x035a, blocks: (B:7:0x0034, B:9:0x003a, B:55:0x00a1, B:58:0x00a9, B:59:0x00ac, B:62:0x00b4, B:63:0x00b8, B:66:0x00c0, B:67:0x00c4, B:71:0x00d1, B:70:0x00cd, B:72:0x00d5, B:75:0x00e2, B:76:0x0103, B:79:0x0110, B:80:0x0131, B:83:0x0139, B:84:0x013d, B:88:0x0149, B:87:0x0145, B:89:0x014d, B:92:0x0155, B:93:0x0159, B:96:0x0166, B:97:0x0187, B:100:0x0194, B:101:0x01b5, B:105:0x01c2, B:104:0x01be, B:106:0x01c6, B:109:0x01d3, B:110:0x01d9, B:113:0x01e6, B:114:0x01ea, B:118:0x01f6, B:117:0x01f2, B:119:0x01fa, B:122:0x0202, B:123:0x0206, B:127:0x0213, B:126:0x020f, B:128:0x0217, B:130:0x021d, B:131:0x0225, B:132:0x022e, B:135:0x0236, B:136:0x023a, B:140:0x0247, B:139:0x0243, B:141:0x024b, B:145:0x0258, B:144:0x0254, B:146:0x025c, B:149:0x0269, B:150:0x028a, B:153:0x0297, B:154:0x02b8, B:156:0x02be, B:160:0x02c7, B:161:0x02d0, B:165:0x02dd, B:164:0x02d9, B:166:0x02e1, B:170:0x02ee, B:169:0x02ea, B:171:0x02f2, B:173:0x02f8, B:178:0x0302, B:179:0x0306, B:182:0x030e, B:183:0x0312, B:186:0x031a, B:187:0x031e, B:188:0x0323, B:192:0x0330, B:191:0x032c, B:194:0x0334, B:196:0x0339), top: B:286:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:209:0x036f A[PHI: r2 r12 r14 r15
  0x036f: PHI (r2v2 android.database.Cursor) = (r2v1 android.database.Cursor), (r2v21 android.database.Cursor) binds: [B:208:0x036d, B:200:0x035e] A[DONT_GENERATE, DONT_INLINE]
  0x036f: PHI (r12v3 int) = (r12v2 int), (r12v5 int) binds: [B:208:0x036d, B:200:0x035e] A[DONT_GENERATE, DONT_INLINE]
  0x036f: PHI (r14v3 int) = (r14v2 int), (r14v5 int) binds: [B:208:0x036d, B:200:0x035e] A[DONT_GENERATE, DONT_INLINE]
  0x036f: PHI (r15v3 boolean) = (r15v2 boolean), (r15v5 boolean) binds: [B:208:0x036d, B:200:0x035e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:212:0x0378  */
    /* JADX WARN: Code duplicated, block: B:214:0x0380  */
    /* JADX WARN: Code duplicated, block: B:222:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:224:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:231:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:233:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:234:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:239:0x0413  */
    /* JADX WARN: Code duplicated, block: B:248:0x0441  */
    /* JADX WARN: Code duplicated, block: B:251:0x0468  */
    /* JADX WARN: Code duplicated, block: B:258:0x048a  */
    /* JADX WARN: Code duplicated, block: B:260:0x0494  */
    /* JADX WARN: Code duplicated, block: B:263:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:266:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:274:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:277:0x0503  */
    /* JADX WARN: Code duplicated, block: B:280:0x0510  */
    /* JADX WARN: Code duplicated, block: B:297:0x031e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x0312 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x02e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x02d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x02b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x028a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x01b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x0225 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x023a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x024b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x014d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:0x021d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:372:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x0034 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cd A[Catch: all -> 0x035a, Exception -> 0x036d, TryCatch #1 {Exception -> 0x036d, blocks: (B:7:0x0034, B:9:0x003a, B:55:0x00a1, B:58:0x00a9, B:59:0x00ac, B:62:0x00b4, B:63:0x00b8, B:66:0x00c0, B:67:0x00c4, B:71:0x00d1, B:70:0x00cd, B:72:0x00d5, B:75:0x00e2, B:76:0x0103, B:79:0x0110, B:80:0x0131, B:83:0x0139, B:84:0x013d, B:88:0x0149, B:87:0x0145, B:89:0x014d, B:92:0x0155, B:93:0x0159, B:96:0x0166, B:97:0x0187, B:100:0x0194, B:101:0x01b5, B:105:0x01c2, B:104:0x01be, B:106:0x01c6, B:109:0x01d3, B:110:0x01d9, B:113:0x01e6, B:114:0x01ea, B:118:0x01f6, B:117:0x01f2, B:119:0x01fa, B:122:0x0202, B:123:0x0206, B:127:0x0213, B:126:0x020f, B:128:0x0217, B:130:0x021d, B:131:0x0225, B:132:0x022e, B:135:0x0236, B:136:0x023a, B:140:0x0247, B:139:0x0243, B:141:0x024b, B:145:0x0258, B:144:0x0254, B:146:0x025c, B:149:0x0269, B:150:0x028a, B:153:0x0297, B:154:0x02b8, B:156:0x02be, B:160:0x02c7, B:161:0x02d0, B:165:0x02dd, B:164:0x02d9, B:166:0x02e1, B:170:0x02ee, B:169:0x02ea, B:171:0x02f2, B:173:0x02f8, B:178:0x0302, B:179:0x0306, B:182:0x030e, B:183:0x0312, B:186:0x031a, B:187:0x031e, B:194:0x0334, B:196:0x0339), top: B:286:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x010e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0137  */
    /* JADX WARN: Code duplicated, block: B:86:0x0143  */
    /* JADX WARN: Code duplicated, block: B:87:0x0145 A[Catch: all -> 0x035a, Exception -> 0x036d, TryCatch #1 {Exception -> 0x036d, blocks: (B:7:0x0034, B:9:0x003a, B:55:0x00a1, B:58:0x00a9, B:59:0x00ac, B:62:0x00b4, B:63:0x00b8, B:66:0x00c0, B:67:0x00c4, B:71:0x00d1, B:70:0x00cd, B:72:0x00d5, B:75:0x00e2, B:76:0x0103, B:79:0x0110, B:80:0x0131, B:83:0x0139, B:84:0x013d, B:88:0x0149, B:87:0x0145, B:89:0x014d, B:92:0x0155, B:93:0x0159, B:96:0x0166, B:97:0x0187, B:100:0x0194, B:101:0x01b5, B:105:0x01c2, B:104:0x01be, B:106:0x01c6, B:109:0x01d3, B:110:0x01d9, B:113:0x01e6, B:114:0x01ea, B:118:0x01f6, B:117:0x01f2, B:119:0x01fa, B:122:0x0202, B:123:0x0206, B:127:0x0213, B:126:0x020f, B:128:0x0217, B:130:0x021d, B:131:0x0225, B:132:0x022e, B:135:0x0236, B:136:0x023a, B:140:0x0247, B:139:0x0243, B:141:0x024b, B:145:0x0258, B:144:0x0254, B:146:0x025c, B:149:0x0269, B:150:0x028a, B:153:0x0297, B:154:0x02b8, B:156:0x02be, B:160:0x02c7, B:161:0x02d0, B:165:0x02dd, B:164:0x02d9, B:166:0x02e1, B:170:0x02ee, B:169:0x02ea, B:171:0x02f2, B:173:0x02f8, B:178:0x0302, B:179:0x0306, B:182:0x030e, B:183:0x0312, B:186:0x031a, B:187:0x031e, B:194:0x0334, B:196:0x0339), top: B:286:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0153  */
    /* JADX WARN: Code duplicated, block: B:95:0x0164  */
    /* JADX WARN: Code duplicated, block: B:99:0x0192  */
    /* JADX WARN: Instruction removed from duplicated block: B:248:0x0441, please report this as an issue */
    @Override // com.igexin.push.core.b.b
    public void b(SQLiteDatabase sQLiteDatabase) throws Throwable {
        boolean z10;
        int i10;
        int i11;
        Cursor cursorQuery;
        String strC;
        long j10;
        String strE;
        String str;
        long j11;
        String strB;
        long jD;
        byte[] blob;
        String string;
        int i12;
        String str2;
        String str3;
        long j12;
        long j13;
        long j14;
        long j15;
        int i13;
        String str4;
        String str5;
        long j16;
        String str6;
        String str7;
        String str8;
        String str9;
        boolean z11;
        long j17;
        long j18;
        boolean z12;
        String str10;
        long j19;
        e(sQLiteDatabase);
        Cursor cursor = null;
        try {
            try {
                z10 = false;
                i10 = 1;
                i11 = 20;
                try {
                    cursorQuery = sQLiteDatabase.query("runtime", new String[]{"id", "value"}, null, null, null, null, "id");
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                try {
                                    int i14 = cursorQuery.getInt(0);
                                    if (i14 == 1 || i14 == 14 || i14 == 19 || i14 == 20 || i14 == 23 || i14 == 25 || i14 == 22 || i14 == 31 || i14 == 30 || i14 == 49 || i14 == 50) {
                                        blob = cursorQuery.getBlob(1);
                                        if (blob != null) {
                                            blob = com.igexin.a.a.a.a.c(blob, com.igexin.push.core.d.C);
                                        }
                                        string = null;
                                        if (blob == null || string != null) {
                                            if (i14 != 1) {
                                                str10 = new String(blob);
                                                try {
                                                    if (str10.equals("null")) {
                                                        j19 = 0;
                                                    } else {
                                                        j19 = Long.parseLong(str10);
                                                    }
                                                    com.igexin.push.core.d.f63684r = j19;
                                                } catch (Exception unused) {
                                                    com.igexin.push.core.d.f63684r = 0L;
                                                }
                                            } else if (i14 != 2) {
                                                if (string.equals("null")) {
                                                    string = null;
                                                }
                                                com.igexin.push.core.d.f63691y = string;
                                            } else if (i14 != 3) {
                                                if (string.equals("null")) {
                                                    string = null;
                                                }
                                                com.igexin.push.core.d.B = string;
                                            } else if (i14 != 4) {
                                                if (!string.equals("null") || Boolean.parseBoolean(string)) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                com.igexin.push.core.d.f63677k = z12;
                                            } else if (i14 != 6) {
                                                if (string.equals("null")) {
                                                    j18 = 0;
                                                } else {
                                                    j18 = Long.parseLong(string);
                                                }
                                                com.igexin.push.core.d.G = j18;
                                            } else if (i14 != 8) {
                                                if (string.equals("null")) {
                                                    j17 = 0;
                                                } else {
                                                    j17 = Long.parseLong(string);
                                                }
                                                com.igexin.push.core.d.H = j17;
                                            } else if (i14 != 40) {
                                                if (string.equals("null") && Boolean.parseBoolean(string)) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                com.igexin.push.d.b.a().a(z11);
                                            } else if (i14 != 30) {
                                                str9 = new String(blob);
                                                if (str9.equals("null")) {
                                                    str9 = null;
                                                }
                                                com.igexin.push.core.d.an = str9;
                                                com.igexin.a.a.c.b.a(f63524a + "|DT_ read last domainWifiStatus = " + com.igexin.push.core.d.an, new Object[0]);
                                            } else if (i14 != 31) {
                                                switch (i14) {
                                                    case 11:
                                                        if (string.equals("null")) {
                                                            j13 = 0;
                                                        } else {
                                                            j13 = Long.parseLong(string);
                                                        }
                                                        com.igexin.push.core.d.J = j13;
                                                        break;
                                                    case 12:
                                                        if (string.equals("null")) {
                                                            j14 = 0;
                                                        } else {
                                                            j14 = Long.parseLong(string);
                                                        }
                                                        com.igexin.push.core.d.K = j14;
                                                        break;
                                                    case 13:
                                                        if (string.equals("null")) {
                                                            string = null;
                                                        }
                                                        com.igexin.push.core.d.L = string;
                                                        break;
                                                    case 14:
                                                        com.igexin.push.core.d.f63664ai = new String(blob);
                                                        break;
                                                    case 15:
                                                        if (!string.equals("null")) {
                                                            com.igexin.push.core.d.M = Boolean.parseBoolean(string);
                                                        }
                                                        break;
                                                    case 16:
                                                        if (string.equals("null")) {
                                                            j15 = 0;
                                                        } else {
                                                            j15 = Long.parseLong(string);
                                                        }
                                                        com.igexin.push.core.d.N = j15;
                                                        break;
                                                    case 17:
                                                        if (string.equals("null")) {
                                                            string = null;
                                                        }
                                                        com.igexin.push.core.d.P = string;
                                                        break;
                                                    case 18:
                                                        if (string.equals("null")) {
                                                            i13 = 0;
                                                        } else {
                                                            i13 = Integer.parseInt(string);
                                                        }
                                                        com.igexin.push.core.d.R = i13;
                                                        break;
                                                    case 19:
                                                        str4 = new String(blob);
                                                        if (str4.equals("null")) {
                                                            str4 = null;
                                                        }
                                                        com.igexin.push.core.d.f63690x = str4;
                                                        break;
                                                    case 20:
                                                        str5 = new String(blob);
                                                        if (str5.equals("null")) {
                                                            str5 = null;
                                                        }
                                                        com.igexin.push.core.d.f63686t = str5;
                                                        com.igexin.push.core.d.f63685s = str5;
                                                        break;
                                                    case 21:
                                                        if (string.equals("null")) {
                                                            j16 = 0;
                                                        } else {
                                                            j16 = Long.parseLong(string);
                                                        }
                                                        com.igexin.push.core.d.f63665aj = j16;
                                                        break;
                                                    case 22:
                                                        str6 = new String(blob);
                                                        if (str6.equals("null")) {
                                                            str6 = null;
                                                        }
                                                        com.igexin.push.core.d.f63667al = str6;
                                                        com.igexin.a.a.c.b.a(f63524a + "|DT_ read last wifi result = " + com.igexin.push.core.d.f63667al, new Object[0]);
                                                        break;
                                                    case 23:
                                                        str7 = new String(blob);
                                                        if (str7.equals("null")) {
                                                            str7 = null;
                                                        }
                                                        com.igexin.push.core.d.f63666ak = str7;
                                                        com.igexin.a.a.c.b.a(f63524a + "|DT_ read last mobile result = " + com.igexin.push.core.d.f63666ak, new Object[0]);
                                                        break;
                                                    default:
                                                        switch (i14) {
                                                            case 46:
                                                                if (string.equals("null")) {
                                                                    string = null;
                                                                }
                                                                com.igexin.push.core.d.f63692z = string;
                                                                break;
                                                            case 47:
                                                                if (string.equals("null")) {
                                                                    i12 = 0;
                                                                } else {
                                                                    i12 = Integer.parseInt(string);
                                                                }
                                                                com.igexin.push.core.d.as = i12;
                                                                break;
                                                            case 48:
                                                                if (string.equals("null")) {
                                                                    string = null;
                                                                }
                                                                com.igexin.push.core.d.A = string;
                                                                break;
                                                            case 49:
                                                                str2 = new String(blob);
                                                                if (str2.equals("null")) {
                                                                    str2 = null;
                                                                }
                                                                com.igexin.push.core.d.ao = str2;
                                                                com.igexin.a.a.c.b.a(f63524a + "|read last wifiRedirectCmList = " + com.igexin.push.core.d.ao, new Object[0]);
                                                                break;
                                                            case 50:
                                                                str3 = new String(blob);
                                                                if (str3.equals("null")) {
                                                                    str3 = null;
                                                                }
                                                                com.igexin.push.core.d.ap = str3;
                                                                com.igexin.a.a.c.b.a(f63524a + "|read last mobileRedirectCmList = " + com.igexin.push.core.d.ap, new Object[0]);
                                                                break;
                                                            case 51:
                                                                if (string.equals("null")) {
                                                                    j12 = 0;
                                                                } else {
                                                                    j12 = Long.parseLong(string);
                                                                }
                                                                com.igexin.push.core.d.W = j12;
                                                                break;
                                                            case 52:
                                                                if (string.equals("null")) {
                                                                    string = null;
                                                                }
                                                                com.igexin.push.core.d.av = string;
                                                                break;
                                                            case 53:
                                                                if ("null".equals(string)) {
                                                                    string = null;
                                                                }
                                                                com.igexin.push.core.d.ax = string;
                                                                break;
                                                            case 54:
                                                                if ("null".equals(string)) {
                                                                    string = null;
                                                                }
                                                                com.igexin.push.core.d.ay = string;
                                                                break;
                                                        }
                                                        break;
                                                }
                                            } else {
                                                str8 = new String(blob);
                                                if (str8.equals("null")) {
                                                    str8 = null;
                                                }
                                                com.igexin.push.core.d.am = str8;
                                                com.igexin.a.a.c.b.a(f63524a + "|DT_ read last domainMobileStatus = " + com.igexin.push.core.d.am, new Object[0]);
                                            }
                                        }
                                    } else {
                                        try {
                                            string = cursorQuery.getString(1);
                                            blob = null;
                                            if (blob == null) {
                                            }
                                            if (i14 != 1) {
                                                str10 = new String(blob);
                                                if (str10.equals("null")) {
                                                    j19 = 0;
                                                } else {
                                                    j19 = Long.parseLong(str10);
                                                }
                                                com.igexin.push.core.d.f63684r = j19;
                                            } else if (i14 != 2) {
                                                if (string.equals("null")) {
                                                    string = null;
                                                }
                                                com.igexin.push.core.d.f63691y = string;
                                            } else if (i14 != 3) {
                                                if (string.equals("null")) {
                                                    string = null;
                                                }
                                                com.igexin.push.core.d.B = string;
                                            } else if (i14 != 4) {
                                                if (string.equals("null")) {
                                                    z12 = true;
                                                } else {
                                                    z12 = true;
                                                }
                                                com.igexin.push.core.d.f63677k = z12;
                                            } else if (i14 != 6) {
                                                if (string.equals("null")) {
                                                    j18 = 0;
                                                } else {
                                                    j18 = Long.parseLong(string);
                                                }
                                                com.igexin.push.core.d.G = j18;
                                            } else if (i14 != 8) {
                                                if (string.equals("null")) {
                                                    j17 = 0;
                                                } else {
                                                    j17 = Long.parseLong(string);
                                                }
                                                com.igexin.push.core.d.H = j17;
                                            } else if (i14 != 40) {
                                                if (string.equals("null")) {
                                                    z11 = false;
                                                } else {
                                                    z11 = false;
                                                }
                                                com.igexin.push.d.b.a().a(z11);
                                            } else if (i14 != 30) {
                                                str9 = new String(blob);
                                                if (str9.equals("null")) {
                                                    str9 = null;
                                                }
                                                com.igexin.push.core.d.an = str9;
                                                com.igexin.a.a.c.b.a(f63524a + "|DT_ read last domainWifiStatus = " + com.igexin.push.core.d.an, new Object[0]);
                                            } else if (i14 != 31) {
                                                switch (i14) {
                                                    case 11:
                                                        if (string.equals("null")) {
                                                            j13 = 0;
                                                        } else {
                                                            j13 = Long.parseLong(string);
                                                        }
                                                        com.igexin.push.core.d.J = j13;
                                                        break;
                                                    case 12:
                                                        if (string.equals("null")) {
                                                            j14 = 0;
                                                        } else {
                                                            j14 = Long.parseLong(string);
                                                        }
                                                        com.igexin.push.core.d.K = j14;
                                                        break;
                                                    case 13:
                                                        if (string.equals("null")) {
                                                            string = null;
                                                        }
                                                        com.igexin.push.core.d.L = string;
                                                        break;
                                                    case 14:
                                                        com.igexin.push.core.d.f63664ai = new String(blob);
                                                        break;
                                                    case 15:
                                                        if (!string.equals("null")) {
                                                            com.igexin.push.core.d.M = Boolean.parseBoolean(string);
                                                        }
                                                        break;
                                                    case 16:
                                                        if (string.equals("null")) {
                                                            j15 = 0;
                                                        } else {
                                                            j15 = Long.parseLong(string);
                                                        }
                                                        com.igexin.push.core.d.N = j15;
                                                        break;
                                                    case 17:
                                                        if (string.equals("null")) {
                                                            string = null;
                                                        }
                                                        com.igexin.push.core.d.P = string;
                                                        break;
                                                    case 18:
                                                        if (string.equals("null")) {
                                                            i13 = 0;
                                                        } else {
                                                            i13 = Integer.parseInt(string);
                                                        }
                                                        com.igexin.push.core.d.R = i13;
                                                        break;
                                                    case 19:
                                                        str4 = new String(blob);
                                                        if (str4.equals("null")) {
                                                            str4 = null;
                                                        }
                                                        com.igexin.push.core.d.f63690x = str4;
                                                        break;
                                                    case 20:
                                                        str5 = new String(blob);
                                                        if (str5.equals("null")) {
                                                            str5 = null;
                                                        }
                                                        com.igexin.push.core.d.f63686t = str5;
                                                        com.igexin.push.core.d.f63685s = str5;
                                                        break;
                                                    case 21:
                                                        if (string.equals("null")) {
                                                            j16 = 0;
                                                        } else {
                                                            j16 = Long.parseLong(string);
                                                        }
                                                        com.igexin.push.core.d.f63665aj = j16;
                                                        break;
                                                    case 22:
                                                        str6 = new String(blob);
                                                        if (str6.equals("null")) {
                                                            str6 = null;
                                                        }
                                                        com.igexin.push.core.d.f63667al = str6;
                                                        com.igexin.a.a.c.b.a(f63524a + "|DT_ read last wifi result = " + com.igexin.push.core.d.f63667al, new Object[0]);
                                                        break;
                                                    case 23:
                                                        str7 = new String(blob);
                                                        if (str7.equals("null")) {
                                                            str7 = null;
                                                        }
                                                        com.igexin.push.core.d.f63666ak = str7;
                                                        com.igexin.a.a.c.b.a(f63524a + "|DT_ read last mobile result = " + com.igexin.push.core.d.f63666ak, new Object[0]);
                                                        break;
                                                    default:
                                                        switch (i14) {
                                                            case 46:
                                                                if (string.equals("null")) {
                                                                    string = null;
                                                                }
                                                                com.igexin.push.core.d.f63692z = string;
                                                                break;
                                                            case 47:
                                                                if (string.equals("null")) {
                                                                    i12 = 0;
                                                                } else {
                                                                    i12 = Integer.parseInt(string);
                                                                }
                                                                com.igexin.push.core.d.as = i12;
                                                                break;
                                                            case 48:
                                                                if (string.equals("null")) {
                                                                    string = null;
                                                                }
                                                                com.igexin.push.core.d.A = string;
                                                                break;
                                                            case 49:
                                                                str2 = new String(blob);
                                                                if (str2.equals("null")) {
                                                                    str2 = null;
                                                                }
                                                                com.igexin.push.core.d.ao = str2;
                                                                com.igexin.a.a.c.b.a(f63524a + "|read last wifiRedirectCmList = " + com.igexin.push.core.d.ao, new Object[0]);
                                                                break;
                                                            case 50:
                                                                str3 = new String(blob);
                                                                if (str3.equals("null")) {
                                                                    str3 = null;
                                                                }
                                                                com.igexin.push.core.d.ap = str3;
                                                                com.igexin.a.a.c.b.a(f63524a + "|read last mobileRedirectCmList = " + com.igexin.push.core.d.ap, new Object[0]);
                                                                break;
                                                            case 51:
                                                                if (string.equals("null")) {
                                                                    j12 = 0;
                                                                } else {
                                                                    j12 = Long.parseLong(string);
                                                                }
                                                                com.igexin.push.core.d.W = j12;
                                                                break;
                                                            case 52:
                                                                if (string.equals("null")) {
                                                                    string = null;
                                                                }
                                                                com.igexin.push.core.d.av = string;
                                                                break;
                                                            case 53:
                                                                if ("null".equals(string)) {
                                                                    string = null;
                                                                }
                                                                com.igexin.push.core.d.ax = string;
                                                                break;
                                                            case 54:
                                                                if ("null".equals(string)) {
                                                                    string = null;
                                                                }
                                                                com.igexin.push.core.d.ay = string;
                                                                break;
                                                        }
                                                        break;
                                                }
                                            } else {
                                                str8 = new String(blob);
                                                if (str8.equals("null")) {
                                                    str8 = null;
                                                }
                                                com.igexin.push.core.d.am = str8;
                                                com.igexin.a.a.c.b.a(f63524a + "|DT_ read last domainMobileStatus = " + com.igexin.push.core.d.am, new Object[0]);
                                            }
                                        } catch (Throwable th2) {
                                            com.igexin.a.a.c.b.a(f63524a + "|" + th2.toString(), new Object[0]);
                                        }
                                    }
                                } catch (Exception unused2) {
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Exception unused3) {
                    cursorQuery = null;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (com.igexin.push.core.d.f63684r == 0) {
                        jD = com.igexin.push.util.d.d();
                        if (jD != 0) {
                            com.igexin.push.core.d.f63684r = jD;
                            a(sQLiteDatabase, i10, EncryptUtils.getBytesEncrypted(String.valueOf(jD).getBytes()));
                        }
                    }
                    if (com.igexin.push.core.d.f63685s == null) {
                        com.igexin.push.core.d.f63686t = strB;
                        com.igexin.push.core.d.f63685s = strB;
                        a(sQLiteDatabase, i11, EncryptUtils.getBytesEncrypted(strB.getBytes()));
                    }
                    if (com.igexin.push.core.d.f63685s == null) {
                        j11 = com.igexin.push.core.d.f63684r;
                        if (j11 != 0) {
                            com.igexin.push.core.d.f63686t = com.igexin.a.b.a.a(String.valueOf(j11));
                            com.igexin.push.core.d.a(com.igexin.push.core.d.f63684r);
                            a(sQLiteDatabase, i11, EncryptUtils.getBytesEncrypted(com.igexin.push.core.d.f63685s.getBytes()));
                        }
                    }
                    if ("cfcd208495d565ef66e7dff9f98764da".equals(com.igexin.push.core.d.f63685s)) {
                        if (com.igexin.push.core.d.f63684r != 0) {
                            a().a(com.igexin.push.core.d.f63684r);
                            com.igexin.push.core.d.f63686t = com.igexin.push.core.d.f63685s;
                            com.igexin.push.util.d.f();
                        } else {
                            com.igexin.push.core.d.f63686t = null;
                            com.igexin.push.core.d.f63685s = "null";
                            com.igexin.push.core.d.f63684r = 0L;
                        }
                    } else if (com.igexin.push.core.d.f63684r != 0) {
                        a().a(com.igexin.push.core.d.f63684r);
                        com.igexin.push.core.d.f63686t = com.igexin.push.core.d.f63685s;
                        com.igexin.push.util.d.f();
                    } else {
                        com.igexin.push.core.d.f63686t = null;
                        com.igexin.push.core.d.f63685s = "null";
                        com.igexin.push.core.d.f63684r = 0L;
                    }
                    if (TextUtils.isEmpty(com.igexin.push.core.d.f63664ai)) {
                        String strA = com.igexin.a.b.a.a(32);
                        com.igexin.push.core.d.f63664ai = strA;
                        a(sQLiteDatabase, 14, EncryptUtils.getBytesEncrypted(strA.getBytes()));
                    } else {
                        String strA2 = com.igexin.a.b.a.a(32);
                        com.igexin.push.core.d.f63664ai = strA2;
                        a(sQLiteDatabase, 14, EncryptUtils.getBytesEncrypted(strA2.getBytes()));
                    }
                    strC = com.igexin.push.util.d.c();
                    if (com.igexin.push.core.d.f63691y == null) {
                        com.igexin.push.core.d.f63691y = strC;
                        a(sQLiteDatabase, 2, strC);
                    }
                    if (com.igexin.push.core.d.B == null) {
                        e();
                        a(sQLiteDatabase, 3, com.igexin.push.core.d.B);
                        com.igexin.a.a.c.b.a(f63524a, "new registerId : " + com.igexin.push.core.d.B);
                    }
                    if (com.igexin.push.config.l.H) {
                        strE = new d(com.igexin.push.core.d.f63671e).e();
                        if (!TextUtils.isEmpty(strE)) {
                            com.igexin.push.core.d.f63692z = strE;
                            a(sQLiteDatabase, 46, strE);
                        }
                    }
                    if (this.f63527d) {
                        this.f63527d = z10;
                        if (!TextUtils.isEmpty(com.igexin.push.core.d.C)) {
                            a(sQLiteDatabase, 25, com.igexin.a.a.a.a.d(com.igexin.push.core.d.C.getBytes(), com.igexin.a.b.a.a(com.igexin.push.core.d.f63671e.getPackageName())));
                        }
                        j10 = com.igexin.push.core.d.f63684r;
                        if (j10 != 0) {
                            a(sQLiteDatabase, i10, EncryptUtils.getBytesEncrypted(String.valueOf(j10).getBytes()));
                        }
                        if (!TextUtils.isEmpty(com.igexin.push.core.d.f63685s)) {
                            a(sQLiteDatabase, i11, EncryptUtils.getBytesEncrypted(com.igexin.push.core.d.f63685s.getBytes()));
                        }
                        if (!TextUtils.isEmpty(com.igexin.push.core.d.f63691y)) {
                            a(sQLiteDatabase, 2, com.igexin.push.core.d.f63691y);
                        }
                        if (!TextUtils.isEmpty(com.igexin.push.core.d.B)) {
                            a(sQLiteDatabase, 3, com.igexin.push.core.d.B);
                        }
                        if (!TextUtils.isEmpty(com.igexin.push.core.d.f63692z)) {
                            a(sQLiteDatabase, 46, com.igexin.push.core.d.f63692z);
                        }
                        if (TextUtils.isEmpty(com.igexin.push.core.d.A)) {
                        }
                        a(sQLiteDatabase, 48, com.igexin.push.core.d.A);
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception unused4) {
            z10 = false;
            i10 = 1;
            i11 = 20;
        }
        if (com.igexin.push.core.d.f63684r == 0) {
            jD = com.igexin.push.util.d.d();
            if (jD != 0) {
                com.igexin.push.core.d.f63684r = jD;
                a(sQLiteDatabase, i10, EncryptUtils.getBytesEncrypted(String.valueOf(jD).getBytes()));
            }
        }
        if (com.igexin.push.core.d.f63685s == null && (strB = com.igexin.push.util.d.b()) != null) {
            com.igexin.push.core.d.f63686t = strB;
            com.igexin.push.core.d.f63685s = strB;
            a(sQLiteDatabase, i11, EncryptUtils.getBytesEncrypted(strB.getBytes()));
        }
        if (com.igexin.push.core.d.f63685s == null) {
            j11 = com.igexin.push.core.d.f63684r;
            if (j11 != 0) {
                com.igexin.push.core.d.f63686t = com.igexin.a.b.a.a(String.valueOf(j11));
                com.igexin.push.core.d.a(com.igexin.push.core.d.f63684r);
                a(sQLiteDatabase, i11, EncryptUtils.getBytesEncrypted(com.igexin.push.core.d.f63685s.getBytes()));
            }
        }
        if ("cfcd208495d565ef66e7dff9f98764da".equals(com.igexin.push.core.d.f63685s) || ((str = com.igexin.push.core.d.f63685s) != null && !str.matches("([a-f]|[0-9]){32}"))) {
            if (com.igexin.push.core.d.f63684r != 0) {
                a().a(com.igexin.push.core.d.f63684r);
                com.igexin.push.core.d.f63686t = com.igexin.push.core.d.f63685s;
                com.igexin.push.util.d.f();
            } else {
                com.igexin.push.core.d.f63686t = null;
                com.igexin.push.core.d.f63685s = "null";
                com.igexin.push.core.d.f63684r = 0L;
            }
        }
        if (TextUtils.isEmpty(com.igexin.push.core.d.f63664ai) || "null".equals(com.igexin.push.core.d.f63664ai)) {
            String strA3 = com.igexin.a.b.a.a(32);
            com.igexin.push.core.d.f63664ai = strA3;
            a(sQLiteDatabase, 14, EncryptUtils.getBytesEncrypted(strA3.getBytes()));
        }
        strC = com.igexin.push.util.d.c();
        if (com.igexin.push.core.d.f63691y == null && strC != null && strC.length() > 5) {
            com.igexin.push.core.d.f63691y = strC;
            a(sQLiteDatabase, 2, strC);
        }
        if (com.igexin.push.core.d.B == null) {
            e();
            a(sQLiteDatabase, 3, com.igexin.push.core.d.B);
            com.igexin.a.a.c.b.a(f63524a, "new registerId : " + com.igexin.push.core.d.B);
        }
        if (com.igexin.push.config.l.H) {
            strE = new d(com.igexin.push.core.d.f63671e).e();
            if (!TextUtils.isEmpty(strE) && !strE.equals(com.igexin.push.core.d.f63692z)) {
                com.igexin.push.core.d.f63692z = strE;
                a(sQLiteDatabase, 46, strE);
            }
        }
        if (this.f63527d) {
            this.f63527d = z10;
            if (!TextUtils.isEmpty(com.igexin.push.core.d.C)) {
                a(sQLiteDatabase, 25, com.igexin.a.a.a.a.d(com.igexin.push.core.d.C.getBytes(), com.igexin.a.b.a.a(com.igexin.push.core.d.f63671e.getPackageName())));
            }
            j10 = com.igexin.push.core.d.f63684r;
            if (j10 != 0) {
                a(sQLiteDatabase, i10, EncryptUtils.getBytesEncrypted(String.valueOf(j10).getBytes()));
            }
            if (!TextUtils.isEmpty(com.igexin.push.core.d.f63685s)) {
                a(sQLiteDatabase, i11, EncryptUtils.getBytesEncrypted(com.igexin.push.core.d.f63685s.getBytes()));
            }
            if (!TextUtils.isEmpty(com.igexin.push.core.d.f63691y) && com.igexin.push.core.d.f63691y.length() > 5) {
                a(sQLiteDatabase, 2, com.igexin.push.core.d.f63691y);
            }
            if (!TextUtils.isEmpty(com.igexin.push.core.d.B)) {
                a(sQLiteDatabase, 3, com.igexin.push.core.d.B);
            }
            if (!TextUtils.isEmpty(com.igexin.push.core.d.f63692z)) {
                a(sQLiteDatabase, 46, com.igexin.push.core.d.f63692z);
            }
            if (TextUtils.isEmpty(com.igexin.push.core.d.A)) {
                a(sQLiteDatabase, 48, com.igexin.push.core.d.A);
            }
        }
    }

    public boolean b(int i10) {
        if (com.igexin.push.core.d.as == i10) {
            return false;
        }
        com.igexin.push.core.d.as = i10;
        return com.igexin.a.a.b.c.b().a(new v(this), false, true);
    }

    public boolean b(long j10) {
        com.igexin.push.core.d.f63665aj = j10;
        com.igexin.a.a.c.b.a(f63524a + "|save idc config failed time : " + j10, new Object[0]);
        return com.igexin.a.a.b.c.b().a(new k(this, j10), false, true);
    }

    public boolean b(String str) {
        com.igexin.push.core.d.f63691y = str;
        return com.igexin.a.a.b.c.b().a(new ad(this), false, true);
    }

    public boolean b(String str, boolean z10) {
        com.igexin.a.a.b.c cVarB;
        com.igexin.a.a.d.e tVar;
        if (str == null) {
            return false;
        }
        if (z10) {
            if (!str.equals(com.igexin.push.core.d.f63666ak)) {
                com.igexin.push.core.d.f63666ak = str.equals("null") ? null : str;
                cVarB = com.igexin.a.a.b.c.b();
                tVar = new s(this, str);
                return cVarB.a(tVar, false, true);
            }
            return false;
        }
        if (!str.equals(com.igexin.push.core.d.f63667al)) {
            com.igexin.push.core.d.f63667al = str.equals("null") ? null : str;
            cVarB = com.igexin.a.a.b.c.b();
            tVar = new t(this, str);
            return cVarB.a(tVar, false, true);
        }
        return false;
    }

    public boolean b(boolean z10) {
        return com.igexin.a.a.b.c.b().a(new w(this, z10), false, true);
    }

    public void c() {
        com.igexin.push.core.d.f63684r = 0L;
        com.igexin.push.core.d.f63685s = "null";
        f();
    }

    @Override // com.igexin.push.core.b.b
    public void c(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase, 1, com.igexin.a.a.a.a.d(String.valueOf(com.igexin.push.core.d.f63684r).getBytes(), com.igexin.push.core.d.C));
        a(sQLiteDatabase, 4, String.valueOf(com.igexin.push.core.d.f63677k));
        a(sQLiteDatabase, 8, String.valueOf(com.igexin.push.core.d.H));
        a(sQLiteDatabase, 3, com.igexin.push.core.d.B);
        a(sQLiteDatabase, 11, String.valueOf(com.igexin.push.core.d.J));
        a(sQLiteDatabase, 12, String.valueOf(com.igexin.push.core.d.K));
        a(sQLiteDatabase, 20, com.igexin.a.a.a.a.d(com.igexin.push.core.d.f63685s.getBytes(), com.igexin.push.core.d.C));
        a(sQLiteDatabase, 2, com.igexin.push.core.d.f63691y);
        a(sQLiteDatabase, 25, com.igexin.a.a.a.a.d(com.igexin.push.core.d.C.getBytes(), com.igexin.a.b.a.a(com.igexin.push.core.d.f63671e.getPackageName())));
    }

    public boolean c(long j10) {
        if (com.igexin.push.core.d.J == j10) {
            return false;
        }
        com.igexin.push.core.d.J = j10;
        return com.igexin.a.a.b.c.b().a(new l(this), false, true);
    }

    public boolean c(String str) {
        com.igexin.push.core.d.f63692z = str;
        return com.igexin.a.a.b.c.b().a(new ae(this), false, true);
    }

    public boolean c(String str, boolean z10) {
        if (str == null) {
            return false;
        }
        String str2 = str.equals("null") ? null : str;
        if (z10 && !TextUtils.equals(com.igexin.push.core.d.ap, str)) {
            com.igexin.push.core.d.ap = str2;
        } else {
            if (z10 || TextUtils.equals(com.igexin.push.core.d.ao, str)) {
                return false;
            }
            com.igexin.push.core.d.ao = str2;
        }
        com.igexin.a.a.c.b.a(f63524a + "|saveLastRedirectCmList isMobile = " + z10 + ", lastRedirectCmList = " + str, new Object[0]);
        return com.igexin.a.a.b.c.b().a(new y(this, z10, str), false, true);
    }

    public void d() {
        com.igexin.a.a.c.b.a(f63524a + "| found a duplicate cid " + com.igexin.push.core.d.f63685s, new Object[0]);
        com.igexin.push.core.d.B = null;
        e();
        a().a(com.igexin.push.core.d.B);
        a().c();
        com.igexin.push.core.d.f63681o = 0;
        com.igexin.push.f.b.f.i().a(SystemClock.elapsedRealtime());
    }

    public void d(SQLiteDatabase sQLiteDatabase) {
        this.f63527d = true;
        e(sQLiteDatabase);
        j(sQLiteDatabase);
        k(sQLiteDatabase);
        i(sQLiteDatabase);
        f(sQLiteDatabase);
        g(sQLiteDatabase);
        h(sQLiteDatabase);
    }

    public boolean d(long j10) {
        if (com.igexin.push.core.d.G == j10) {
            return false;
        }
        com.igexin.push.core.d.G = j10;
        return com.igexin.a.a.b.c.b().a(new u(this), false, true);
    }

    public boolean d(String str) {
        com.igexin.push.core.d.A = str;
        return com.igexin.a.a.b.c.b().a(new af(this), false, true);
    }

    public boolean e(String str) {
        if (str == null || str.equals(com.igexin.push.core.d.L)) {
            return false;
        }
        com.igexin.push.core.d.L = str;
        com.igexin.a.a.b.c.b().a(new m(this), false, true);
        return true;
    }

    public boolean f(String str) {
        if (str.equals(com.igexin.push.core.d.P)) {
            return false;
        }
        com.igexin.push.core.d.P = str;
        return com.igexin.a.a.b.c.b().a(new o(this), false, true);
    }

    public boolean g(String str) {
        com.igexin.push.core.d.av = str;
        return com.igexin.a.a.b.c.b().a(new x(this, str), false, true);
    }
}
