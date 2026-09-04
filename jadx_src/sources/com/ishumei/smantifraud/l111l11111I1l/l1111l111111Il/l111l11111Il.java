package com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes6.dex */
public final class l111l11111Il extends l111l1111lI1l {
    private Context l1111l111111Il;

    l111l11111Il(Context context) {
        this.l1111l111111Il = context;
    }

    @Override // com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l1111lI1l
    public final String l1111l111111Il() {
        try {
            Cursor cursorQuery = this.l1111l111111Il.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"oaid"}, null);
            if (cursorQuery == null) {
                return "";
            }
            cursorQuery.moveToFirst();
            int columnIndex = cursorQuery.getColumnIndex("value");
            String string = columnIndex > 0 ? cursorQuery.getString(columnIndex) : "";
            cursorQuery.close();
            return string;
        } catch (Throwable unused) {
            return "";
        }
    }
}
