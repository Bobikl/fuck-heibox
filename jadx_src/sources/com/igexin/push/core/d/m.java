package com.igexin.push.core.d;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class m extends g {
    public m() {
        super("com.meizu.flyme.openidsdk", "");
    }

    @Override // com.igexin.push.core.d.g, com.igexin.push.core.d.c
    public boolean a(Context context) {
        if (super.a(context)) {
            g.f63712c = true;
        } else {
            try {
                Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"support"}, null);
                if (cursorQuery == null) {
                    return false;
                }
                cursorQuery.moveToFirst();
                int columnIndex = cursorQuery.getColumnIndex("value");
                if (columnIndex >= 0) {
                    String string = cursorQuery.getString(columnIndex);
                    if (TextUtils.isEmpty(string)) {
                        return false;
                    }
                    g.f63712c = "0".equals(string);
                } else {
                    g.f63712c = false;
                }
            } catch (Throwable unused) {
                g.f63712c = false;
                return false;
            }
        }
        this.f63716d = true;
        return g.f63712c;
    }

    @Override // com.igexin.push.core.d.g, com.igexin.push.core.d.c
    public String b(Context context) {
        a(new String[]{"oaid"});
        return super.b(context);
    }
}
