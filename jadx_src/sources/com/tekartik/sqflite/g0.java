package com.tekartik.sqflite;

import android.database.sqlite.SQLiteProgram;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: SqlCommand.java */
/* JADX INFO: loaded from: classes4.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f98653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Object> f98654b;

    public g0(String str, List<Object> list) {
        this.f98653a = str;
        this.f98654b = list == null ? new ArrayList<>() : list;
    }

    private Object[] e(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(f(it.next()));
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    private static Object f(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        byte[] bArr = new byte[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            bArr[i10] = (byte) ((Integer) list.get(i10)).intValue();
        }
        return bArr;
    }

    public void a(SQLiteProgram sQLiteProgram) {
        List<Object> list = this.f98654b;
        if (list != null) {
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                Object objF = f(this.f98654b.get(i10));
                int i11 = i10 + 1;
                if (objF == null) {
                    sQLiteProgram.bindNull(i11);
                } else if (objF instanceof byte[]) {
                    sQLiteProgram.bindBlob(i11, (byte[]) objF);
                } else if (objF instanceof Double) {
                    sQLiteProgram.bindDouble(i11, ((Double) objF).doubleValue());
                } else if (objF instanceof Integer) {
                    sQLiteProgram.bindLong(i11, ((Integer) objF).intValue());
                } else if (objF instanceof Long) {
                    sQLiteProgram.bindLong(i11, ((Long) objF).longValue());
                } else if (objF instanceof String) {
                    sQLiteProgram.bindString(i11, (String) objF);
                } else {
                    if (!(objF instanceof Boolean)) {
                        throw new IllegalArgumentException("Could not bind " + objF + " from index " + i10 + ": Supported types are null, byte[], double, long, boolean and String");
                    }
                    sQLiteProgram.bindLong(i11, ((Boolean) objF).booleanValue() ? 1L : 0L);
                }
                i10 = i11;
            }
        }
    }

    public List<Object> b() {
        return this.f98654b;
    }

    public String c() {
        return this.f98653a;
    }

    public Object[] d() {
        return e(this.f98654b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        String str = this.f98653a;
        if (str != null) {
            if (!str.equals(g0Var.f98653a)) {
                return false;
            }
        } else if (g0Var.f98653a != null) {
            return false;
        }
        if (this.f98654b.size() != g0Var.f98654b.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f98654b.size(); i10++) {
            if ((this.f98654b.get(i10) instanceof byte[]) && (g0Var.f98654b.get(i10) instanceof byte[])) {
                if (!Arrays.equals((byte[]) this.f98654b.get(i10), (byte[]) g0Var.f98654b.get(i10))) {
                    return false;
                }
            } else if (!this.f98654b.get(i10).equals(g0Var.f98654b.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this.f98653a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f98653a);
        List<Object> list = this.f98654b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + this.f98654b;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
