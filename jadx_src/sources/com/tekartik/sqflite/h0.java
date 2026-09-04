package com.tekartik.sqflite;

import android.database.Cursor;
import android.util.Log;
import androidx.annotation.w0;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes4.dex */
public class h0 {
    public static List<Object> a(Cursor cursor, int i10) {
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            Object objB = b(cursor, i11);
            if (xg.a.f141316c) {
                String name = null;
                if (objB != null) {
                    name = objB.getClass().isArray() ? "array(" + objB.getClass().getComponentType().getName() + ")" : objB.getClass().getName();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("column ");
                sb2.append(i11);
                sb2.append(" ");
                sb2.append(cursor.getType(i11));
                sb2.append(": ");
                sb2.append(objB);
                sb2.append(name == null ? "" : " (" + name + ")");
                Log.d(b.J, sb2.toString());
            }
            arrayList.add(objB);
        }
        return arrayList;
    }

    public static Object b(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            return null;
        }
        return cursor.getBlob(i10);
    }

    @w0(api = 21)
    static Locale c(String str) {
        return Locale.forLanguageTag(str);
    }

    static Locale d(String str) {
        String str2;
        String str3;
        String[] strArrSplit = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        String str4 = "";
        if (strArrSplit.length > 0) {
            String str5 = strArrSplit[0];
            if (strArrSplit.length > 1) {
                str3 = strArrSplit[1];
                str2 = strArrSplit.length > 2 ? strArrSplit[strArrSplit.length - 1] : "";
            } else {
                str2 = "";
                str3 = str2;
            }
            str4 = str5;
        } else {
            str2 = "";
            str3 = str2;
        }
        return new Locale(str4, str3, str2);
    }

    static Locale e(String str) {
        return c(str);
    }
}
