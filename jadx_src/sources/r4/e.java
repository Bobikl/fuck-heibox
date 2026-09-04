package r4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes6.dex */
public class e implements p4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f138793a = "content://cn.nubia.provider.deviceid.dataid/oaid";

    @Override // p4.b
    public String a(Context context) {
        String string = null;
        if (context == null) {
            return null;
        }
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse(f138793a), null, null, null, null);
        if (cursorQuery != null) {
            string = cursorQuery.moveToNext() ? cursorQuery.getString(cursorQuery.getColumnIndex("device_ids_grndid")) : null;
            cursorQuery.close();
        }
        return string;
    }
}
