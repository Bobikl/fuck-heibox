package com.igexin.push.core.b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static e f63517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<com.igexin.push.core.bean.h> f63518b = new CopyOnWriteArrayList();

    private e() {
    }

    private int a(byte b10) {
        Iterator<com.igexin.push.core.bean.h> it = this.f63518b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().c() == b10) {
                i10++;
            }
        }
        return i10;
    }

    public static e a() {
        if (f63517a == null) {
            f63517a = new e();
        }
        return f63517a;
    }

    private com.igexin.push.core.bean.h a(long j10) {
        for (com.igexin.push.core.bean.h hVar : this.f63518b) {
            if (hVar.a() == j10) {
                return hVar;
            }
        }
        return null;
    }

    private static ContentValues b(com.igexin.push.core.bean.h hVar) {
        if (hVar == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(hVar.a()));
        contentValues.put("data", com.igexin.a.b.a.b(hVar.b().getBytes()));
        contentValues.put("type", Byte.valueOf(hVar.c()));
        contentValues.put("time", Long.valueOf(hVar.d()));
        return contentValues;
    }

    private void b(byte b10) {
        com.igexin.push.core.bean.h hVar = null;
        try {
            for (com.igexin.push.core.bean.h hVar2 : this.f63518b) {
                if (hVar2.c() == b10) {
                    hVar = hVar2;
                    break;
                }
            }
            if (hVar != null) {
                a(hVar.a(), true, true);
            }
        } catch (Throwable unused) {
        }
    }

    public void a(long j10, boolean z10, boolean z11) {
        com.igexin.push.core.bean.h hVarA = a(j10);
        if (hVarA != null) {
            this.f63518b.remove(hVarA);
        }
        if (z10) {
            com.igexin.a.a.b.c.b().a(new g(this, b(hVarA), j10), z11, !z11);
        }
    }

    @Override // com.igexin.push.core.b.b
    public void a(SQLiteDatabase sQLiteDatabase) {
    }

    public void a(com.igexin.push.core.bean.h hVar) {
        if (hVar != null) {
            if (this.f63518b.size() < 319 || hVar.c() == 2 || hVar.c() == 7 || hVar.c() == 9) {
                switch (hVar.c()) {
                    case 2:
                    case 7:
                    case 9:
                        b(hVar.c());
                        break;
                    case 3:
                        if (a((byte) 3) >= 300) {
                            return;
                        }
                        break;
                    case 5:
                        if (a((byte) 5) >= 3) {
                            return;
                        }
                        break;
                    case 6:
                        if (a((byte) 6) >= 10) {
                            return;
                        }
                        break;
                    case 8:
                        if (a((byte) 8) >= 3) {
                            return;
                        }
                        break;
                }
                this.f63518b.add(hVar);
                com.igexin.a.a.b.c.b().a(new f(this, b(hVar)), false, true);
            }
        }
    }

    public boolean a(long j10, long j11) {
        com.igexin.push.core.bean.h hVarA = a(j10);
        if (hVarA == null) {
            return false;
        }
        hVarA.a(j11);
        com.igexin.a.a.b.c.b().a(new h(this, b(hVarA), j10), true, true);
        return true;
    }

    public List<com.igexin.push.core.bean.h> b() {
        return this.f63518b;
    }

    @Override // com.igexin.push.core.b.b
    public void b(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("ral", new String[]{"id", "data", "type", "time"}, null, null, null, null, null);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    long j10 = cursorQuery.getLong(0);
                    byte b10 = (byte) cursorQuery.getInt(2);
                    long j11 = cursorQuery.getLong(3);
                    if (jCurrentTimeMillis - j11 > 259200000) {
                        a(j10, true, true);
                    } else {
                        this.f63518b.add(new com.igexin.push.core.bean.h(j10, new String(com.igexin.a.b.a.c(cursorQuery.getBlob(1))), b10, j11));
                    }
                }
            }
        } catch (Exception unused) {
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    @Override // com.igexin.push.core.b.b
    public void c(SQLiteDatabase sQLiteDatabase) {
    }
}
