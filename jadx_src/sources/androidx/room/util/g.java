package androidx.room.util;

import android.database.Cursor;
import com.tencent.open.SocialConstants;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.c1;
import kotlin.collections.r0;
import kotlin.collections.s;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TableInfo.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002\u001a$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a \u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\"\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¨\u0006\u0017"}, d2 = {"Lj3/g;", "database", "", "tableName", "Landroidx/room/util/f;", "f", "", "Landroidx/room/util/f$d;", ak.aF, "Landroid/database/Cursor;", "cursor", "", "Landroidx/room/util/f$e;", "b", "", "Landroidx/room/util/f$a;", ak.av, "Landroidx/room/util/f$f;", "e", "name", "", "unique", "d", "room-runtime_release"}, k = 2, mv = {1, 7, 1})
public final class g {
    private static final Map<String, f.a> a(j3.g gVar, String str) {
        Cursor cursorD1 = gVar.D1("PRAGMA table_info(`" + str + "`)");
        try {
            if (cursorD1.getColumnCount() <= 0) {
                Map<String, f.a> mapZ = s0.z();
                kotlin.io.b.a(cursorD1, null);
                return mapZ;
            }
            int columnIndex = cursorD1.getColumnIndex("name");
            int columnIndex2 = cursorD1.getColumnIndex("type");
            int columnIndex3 = cursorD1.getColumnIndex("notnull");
            int columnIndex4 = cursorD1.getColumnIndex("pk");
            int columnIndex5 = cursorD1.getColumnIndex("dflt_value");
            Map mapG = r0.g();
            while (cursorD1.moveToNext()) {
                String name = cursorD1.getString(columnIndex);
                String type = cursorD1.getString(columnIndex2);
                boolean z10 = cursorD1.getInt(columnIndex3) != 0;
                int i10 = cursorD1.getInt(columnIndex4);
                String string = cursorD1.getString(columnIndex5);
                f0.o(name, "name");
                f0.o(type, "type");
                mapG.put(name, new f.a(name, type, z10, i10, string, 2));
            }
            Map<String, f.a> mapD = r0.d(mapG);
            kotlin.io.b.a(cursorD1, null);
            return mapD;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.b.a(cursorD1, th2);
                throw th3;
            }
        }
    }

    private static final List<f.e> b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List listI = s.i();
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(columnIndex);
            int i11 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            f0.o(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            f0.o(string2, "cursor.getString(toColumnIndex)");
            listI.add(new f.e(i10, i11, string, string2));
        }
        return CollectionsKt___CollectionsKt.l5(s.a(listI));
    }

    private static final Set<f.d> c(j3.g gVar, String str) {
        Cursor cursorD1 = gVar.D1("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorD1.getColumnIndex("id");
            int columnIndex2 = cursorD1.getColumnIndex("seq");
            int columnIndex3 = cursorD1.getColumnIndex("table");
            int columnIndex4 = cursorD1.getColumnIndex("on_delete");
            int columnIndex5 = cursorD1.getColumnIndex("on_update");
            List<f.e> listB = b(cursorD1);
            cursorD1.moveToPosition(-1);
            Set setD = c1.d();
            while (cursorD1.moveToNext()) {
                if (cursorD1.getInt(columnIndex2) == 0) {
                    int i10 = cursorD1.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<f.e> arrayList3 = new ArrayList();
                    for (Object obj : listB) {
                        if (((f.e) obj).getId() == i10) {
                            arrayList3.add(obj);
                        }
                    }
                    for (f.e eVar : arrayList3) {
                        arrayList.add(eVar.getFrom());
                        arrayList2.add(eVar.getTo());
                    }
                    String string = cursorD1.getString(columnIndex3);
                    f0.o(string, "cursor.getString(tableColumnIndex)");
                    String string2 = cursorD1.getString(columnIndex4);
                    f0.o(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = cursorD1.getString(columnIndex5);
                    f0.o(string3, "cursor.getString(onUpdateColumnIndex)");
                    setD.add(new f.d(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set<f.d> setA = c1.a(setD);
            kotlin.io.b.a(cursorD1, null);
            return setA;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.b.a(cursorD1, th2);
                throw th3;
            }
        }
    }

    private static final f.C0217f d(j3.g gVar, String str, boolean z10) {
        Cursor cursorD1 = gVar.D1("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorD1.getColumnIndex("seqno");
            int columnIndex2 = cursorD1.getColumnIndex("cid");
            int columnIndex3 = cursorD1.getColumnIndex("name");
            int columnIndex4 = cursorD1.getColumnIndex(SocialConstants.PARAM_APP_DESC);
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorD1.moveToNext()) {
                    if (cursorD1.getInt(columnIndex2) >= 0) {
                        int i10 = cursorD1.getInt(columnIndex);
                        String columnName = cursorD1.getString(columnIndex3);
                        String str2 = cursorD1.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i10);
                        f0.o(columnName, "columnName");
                        treeMap.put(numValueOf, columnName);
                        treeMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                f0.o(collectionValues, "columnsMap.values");
                List listQ5 = CollectionsKt___CollectionsKt.Q5(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                f0.o(collectionValues2, "ordersMap.values");
                f.C0217f c0217f = new f.C0217f(str, z10, listQ5, CollectionsKt___CollectionsKt.Q5(collectionValues2));
                kotlin.io.b.a(cursorD1, null);
                return c0217f;
            }
            kotlin.io.b.a(cursorD1, null);
            return null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.b.a(cursorD1, th2);
                throw th3;
            }
        }
    }

    private static final Set<f.C0217f> e(j3.g gVar, String str) {
        Cursor cursorD1 = gVar.D1("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorD1.getColumnIndex("name");
            int columnIndex2 = cursorD1.getColumnIndex("origin");
            int columnIndex3 = cursorD1.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                Set setD = c1.d();
                while (cursorD1.moveToNext()) {
                    if (f0.g(ak.aF, cursorD1.getString(columnIndex2))) {
                        String name = cursorD1.getString(columnIndex);
                        boolean z10 = true;
                        if (cursorD1.getInt(columnIndex3) != 1) {
                            z10 = false;
                        }
                        f0.o(name, "name");
                        f.C0217f c0217fD = d(gVar, name, z10);
                        if (c0217fD == null) {
                            kotlin.io.b.a(cursorD1, null);
                            return null;
                        }
                        setD.add(c0217fD);
                    }
                }
                Set<f.C0217f> setA = c1.a(setD);
                kotlin.io.b.a(cursorD1, null);
                return setA;
            }
            kotlin.io.b.a(cursorD1, null);
            return null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.b.a(cursorD1, th2);
                throw th3;
            }
        }
    }

    @dl.d
    public static final f f(@dl.d j3.g database, @dl.d String tableName) {
        f0.p(database, "database");
        f0.p(tableName, "tableName");
        return new f(tableName, a(database, tableName), c(database, tableName), e(database, tableName));
    }
}
