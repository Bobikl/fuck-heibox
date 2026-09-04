package com.xiaomi.push;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes4.dex */
public class ct implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f106931a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ cr.a f256a;

    ct(cr.a aVar, Context context) {
        this.f256a = aVar;
        this.f106931a = context;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0027 A[Catch: Exception -> 0x002b, DONT_GENERATE, TRY_LEAVE, TryCatch #2 {Exception -> 0x002b, blocks: (B:9:0x001e, B:10:0x0021, B:12:0x0027), top: B:44:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:24:0x003e A[Catch: Exception -> 0x0042, DONT_GENERATE, TRY_LEAVE, TryCatch #4 {Exception -> 0x0042, blocks: (B:21:0x0035, B:22:0x0038, B:24:0x003e), top: B:47:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0059 A[Catch: Exception -> 0x005d, FINALLY_INSNS, TRY_LEAVE, TryCatch #1 {Exception -> 0x005d, blocks: (B:31:0x0050, B:32:0x0053, B:34:0x0059), top: B:42:0x0050 }] */
    @Override // java.lang.Runnable
    public void run() {
        cp cpVar;
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            sQLiteDatabaseA = this.f256a.a();
            if (sQLiteDatabaseA != null && sQLiteDatabaseA.isOpen()) {
                sQLiteDatabaseA.beginTransaction();
                this.f256a.a(this.f106931a, sQLiteDatabaseA);
                sQLiteDatabaseA.setTransactionSuccessful();
            }
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.endTransaction();
                    if (this.f256a.f247a != null) {
                    }
                } catch (Exception e10) {
                    e = e10;
                    com.xiaomi.channel.commonutils.logger.b.a(e);
                }
            } else if (this.f256a.f247a != null) {
            }
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.endTransaction();
                    if (this.f256a.f247a != null) {
                    }
                } catch (Exception e12) {
                    e = e12;
                    com.xiaomi.channel.commonutils.logger.b.a(e);
                }
            } else if (this.f256a.f247a != null) {
            }
        } finally {
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.endTransaction();
                    cpVar = this.f256a.f247a;
                    if (cpVar != null) {
                        cpVar.close();
                    }
                } catch (Exception e13) {
                    com.xiaomi.channel.commonutils.logger.b.a(e13);
                    this.f256a.a(this.f106931a);
                }
            } else {
                cpVar = this.f256a.f247a;
                if (cpVar != null) {
                    cpVar.close();
                }
            }
            this.f256a.a(this.f106931a);
        }
    }
}
