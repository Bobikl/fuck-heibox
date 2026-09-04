package com.xiaomi.push.providers;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.taobao.accs.common.Constants;
import com.xiaomi.channel.commonutils.logger.b;

/* JADX INFO: loaded from: classes4.dex */
public class a extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f107824a = 1;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static final Object f940a = new Object();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final String[] f941a = {"package_name", "TEXT", "message_ts", " LONG DEFAULT 0 ", "bytes", " LONG DEFAULT 0 ", "network_type", " INT DEFAULT -1 ", "rcv", " INT DEFAULT -1 ", Constants.KEY_IMSI, "TEXT"};

    public a(Context context) {
        super(context, "traffic.db", (SQLiteDatabase.CursorFactory) null, f107824a);
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb2 = new StringBuilder("CREATE TABLE traffic(_id INTEGER  PRIMARY KEY ,");
        int i10 = 0;
        while (true) {
            String[] strArr = f941a;
            if (i10 >= strArr.length - 1) {
                sb2.append(");");
                sQLiteDatabase.execSQL(sb2.toString());
                return;
            }
            if (i10 != 0) {
                sb2.append(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb2.append(strArr[i10]);
            sb2.append(" ");
            sb2.append(strArr[i10 + 1]);
            i10 += 2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        synchronized (f940a) {
            try {
                a(sQLiteDatabase);
            } catch (SQLException e10) {
                b.a(e10);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
