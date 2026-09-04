package com.umeng.analytics.pro;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* JADX INFO: compiled from: UMDBCreater.java */
/* JADX INFO: loaded from: classes4.dex */
public class c extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f104669a;

    public c(Context context, String str) {
        super(context);
        this.f104669a = str;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public File getDatabasePath(String str) {
        File file = new File(this.f104669a + str);
        if (!file.getParentFile().exists() && !file.getParentFile().isDirectory()) {
            file.getParentFile().mkdirs();
        }
        return file;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public SQLiteDatabase openOrCreateDatabase(String str, int i10, SQLiteDatabase.CursorFactory cursorFactory) {
        return SQLiteDatabase.openDatabase(getDatabasePath(str).getAbsolutePath(), cursorFactory, 268435472);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public SQLiteDatabase openOrCreateDatabase(String str, int i10, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return SQLiteDatabase.openDatabase(getDatabasePath(str).getAbsolutePath(), cursorFactory, 268435472);
    }
}
