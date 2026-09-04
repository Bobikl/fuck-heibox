package z5;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.alipay.sdk.app.EnvUtils;

/* JADX INFO: loaded from: classes6.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f141895a = "content://com.alipay.android.app.settings.data.ServerProvider/current_server";

    public static String a(Context context) {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse(f141895a), null, null, null, null);
        String string = null;
        if (cursorQuery != null && cursorQuery.getCount() > 0) {
            string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndex("url")) : null;
            cursorQuery.close();
        }
        return string;
    }

    public static String b(Context context) {
        if (EnvUtils.b()) {
            return j5.a.f124251b;
        }
        if (context == null) {
            return j5.a.f124250a;
        }
        String str = j5.a.f124250a;
        return TextUtils.isEmpty(str) ? j5.a.f124250a : str;
    }
}
