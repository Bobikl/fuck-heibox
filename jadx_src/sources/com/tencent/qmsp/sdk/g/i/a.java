package com.tencent.qmsp.sdk.g.i;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.tencent.qmsp.sdk.base.c;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f102031a;

    public a(Context context) {
        this.f102031a = context;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0043  */
    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    public String a(int i10, String str) {
        String string;
        Uri uri;
        Cursor cursorQuery;
        StringBuilder sb2;
        String str2;
        String string2 = null;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    uri = null;
                } else {
                    sb2 = new StringBuilder();
                    str2 = "content://com.vivo.vms.IdProvider/IdentifierId/AAID_";
                }
                cursorQuery = this.f102031a.getContentResolver().query(uri, null, null, null, null);
                if (cursorQuery == null) {
                    c.b("return cursor is null,return");
                } else {
                    string2 = cursorQuery.moveToNext() ? cursorQuery.getString(cursorQuery.getColumnIndex("value")) : null;
                    cursorQuery.close();
                }
                return string2;
            }
            sb2 = new StringBuilder();
            str2 = "content://com.vivo.vms.IdProvider/IdentifierId/VAID_";
            sb2.append(str2);
            sb2.append(str);
            string = sb2.toString();
        } else {
            string = "content://com.vivo.vms.IdProvider/IdentifierId/OAID";
        }
        uri = Uri.parse(string);
        cursorQuery = this.f102031a.getContentResolver().query(uri, null, null, null, null);
        if (cursorQuery == null) {
            c.b("return cursor is null,return");
        } else {
            if (cursorQuery.moveToNext()) {
            }
            cursorQuery.close();
        }
        return string2;
    }
}
