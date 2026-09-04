package com.tencent.qmsp.oaid2;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f101631a;

    public l0(Context context) {
        this.f101631a = context;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    /* JADX WARN: Code duplicated, block: B:18:0x005b  */
    public String a(int i10, String str) {
        Uri uri;
        Uri uri2;
        Cursor cursorQuery;
        String string = null;
        if (i10 == 0) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID");
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    uri2 = null;
                } else {
                    uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + str);
                }
                cursorQuery = this.f101631a.getContentResolver().query(uri2, null, null, null, null);
                if (cursorQuery == null) {
                    c.b("return cursor is null,return");
                } else {
                    string = cursorQuery.moveToNext() ? cursorQuery.getString(cursorQuery.getColumnIndex("value")) : null;
                    cursorQuery.close();
                }
                return string;
            }
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str);
        }
        uri2 = uri;
        cursorQuery = this.f101631a.getContentResolver().query(uri2, null, null, null, null);
        if (cursorQuery == null) {
            c.b("return cursor is null,return");
        } else {
            if (cursorQuery.moveToNext()) {
            }
            cursorQuery.close();
        }
        return string;
    }
}
