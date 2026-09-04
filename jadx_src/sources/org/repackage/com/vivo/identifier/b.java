package org.repackage.com.vivo.identifier;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

/* JADX INFO: compiled from: DataBaseOperation.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f138042b = "VMS_IDLG_SDK_DB";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f138043c = "content://com.vivo.vms.IdProvider/IdentifierId";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f138044d = "value";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f138045e = "OAID";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f138046f = "AAID";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f138047g = "VAID";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f138048h = "OAIDSTATUS";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f138049i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f138050j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f138051k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f138052l = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f138053a;

    public b(Context context) {
        this.f138053a = context;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0058  */
    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    /* JADX WARN: Code duplicated, block: B:22:0x006d  */
    public String a(int i10, String str) {
        Uri uri;
        Uri uri2;
        Cursor cursorQuery;
        String string = null;
        if (i10 == 0) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID");
        } else if (i10 == 1) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str);
        } else {
            if (i10 != 2) {
                if (i10 != 4) {
                    uri2 = null;
                } else {
                    uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAIDSTATUS");
                }
                cursorQuery = this.f138053a.getContentResolver().query(uri2, null, null, null, null);
                if (cursorQuery != null) {
                    string = cursorQuery.moveToNext() ? cursorQuery.getString(cursorQuery.getColumnIndex("value")) : null;
                    cursorQuery.close();
                } else {
                    Log.d("VMS_IDLG_SDK_DB", "return cursor is null,return");
                }
                return string;
            }
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + str);
        }
        uri2 = uri;
        cursorQuery = this.f138053a.getContentResolver().query(uri2, null, null, null, null);
        if (cursorQuery != null) {
            if (cursorQuery.moveToNext()) {
            }
            cursorQuery.close();
        } else {
            Log.d("VMS_IDLG_SDK_DB", "return cursor is null,return");
        }
        return string;
    }
}
