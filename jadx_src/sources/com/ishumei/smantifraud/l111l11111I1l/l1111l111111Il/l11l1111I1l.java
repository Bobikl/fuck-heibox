package com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes6.dex */
public final class l11l1111I1l extends l111l1111lI1l {
    private Context l1111l111111Il;

    l11l1111I1l(Context context) {
        this.l1111l111111Il = context;
    }

    @Override // com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l1111lI1l
    public final String l1111l111111Il() {
        Uri uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID");
        ContentResolver contentResolver = this.l1111l111111Il.getContentResolver();
        String string = "";
        if (contentResolver == null) {
            return "";
        }
        Cursor cursorQuery = contentResolver.query(uri, null, null, null, null);
        if (cursorQuery != null) {
            cursorQuery.moveToNext();
            int columnIndex = cursorQuery.getColumnIndex("value");
            string = columnIndex >= 0 ? cursorQuery.getString(columnIndex) : "";
            cursorQuery.close();
        }
        return string;
    }
}
