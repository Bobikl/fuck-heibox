package androidx.documentfile.provider;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.taobao.accs.common.Constants;

/* JADX INFO: compiled from: DocumentsContractApi19.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(19)
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22781a = "DocumentFile";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f22782b = 512;

    private b() {
    }

    public static boolean a(Context context, Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(g(context, uri));
    }

    public static boolean b(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String strG = g(context, uri);
        int iN = n(context, uri, Constants.KEY_FLAGS, 0);
        if (TextUtils.isEmpty(strG)) {
            return false;
        }
        if ((iN & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(strG) || (iN & 8) == 0) {
            return (TextUtils.isEmpty(strG) || (iN & 2) == 0) ? false : true;
        }
        return true;
    }

    private static void c(@p0 AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean d(Context context, Uri uri) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
            return cursorQuery.getCount() > 0;
        } catch (Exception e10) {
            Log.w(f22781a, "Failed query: " + e10);
            return false;
        } finally {
            c(cursorQuery);
        }
    }

    public static long e(Context context, Uri uri) {
        return o(context, uri, Constants.KEY_FLAGS, 0L);
    }

    @p0
    public static String f(Context context, Uri uri) {
        return p(context, uri, "_display_name", null);
    }

    @p0
    private static String g(Context context, Uri uri) {
        return p(context, uri, "mime_type", null);
    }

    @p0
    public static String h(Context context, Uri uri) {
        String strG = g(context, uri);
        if ("vnd.android.document/directory".equals(strG)) {
            return null;
        }
        return strG;
    }

    public static boolean i(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(g(context, uri));
    }

    public static boolean j(Context context, Uri uri) {
        String strG = g(context, uri);
        return ("vnd.android.document/directory".equals(strG) || TextUtils.isEmpty(strG)) ? false : true;
    }

    public static boolean k(Context context, Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri) && (e(context, uri) & 512) != 0;
    }

    public static long l(Context context, Uri uri) {
        return o(context, uri, "last_modified", 0L);
    }

    public static long m(Context context, Uri uri) {
        return o(context, uri, "_size", 0L);
    }

    private static int n(Context context, Uri uri, String str, int i10) {
        return (int) o(context, uri, str, i10);
    }

    private static long o(Context context, Uri uri, String str, long j10) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            return (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) ? j10 : cursorQuery.getLong(0);
        } catch (Exception e10) {
            Log.w(f22781a, "Failed query: " + e10);
            return j10;
        } finally {
            c(cursorQuery);
        }
        c(cursorQuery);
    }

    @p0
    private static String p(Context context, Uri uri, String str, @p0 String str2) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            return (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) ? str2 : cursorQuery.getString(0);
        } catch (Exception e10) {
            Log.w(f22781a, "Failed query: " + e10);
            return str2;
        } finally {
            c(cursorQuery);
        }
        c(cursorQuery);
    }
}
