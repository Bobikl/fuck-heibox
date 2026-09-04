package com.sina.weibo.sdk.b;

import android.annotation.TargetApi;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.max.mediaselector.lib.config.h;
import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    @TargetApi(19)
    public static String a(Context context, Uri uri) {
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (b(uri)) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(strArrSplit[0])) {
                    return Environment.getExternalStorageDirectory() + "/" + strArrSplit[1];
                }
            } else {
                if (c(uri)) {
                    return a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
                }
                if (d(uri)) {
                    String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str = strArrSplit2[0];
                    if ("image".equals(str)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(str)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(str)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    return a(context, uri2, "_id=?", new String[]{strArrSplit2[1]});
                }
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return e(uri) ? uri.getLastPathSegment() : b(context, uri);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0033 A[PHI: r7
  0x0033: PHI (r7v3 android.database.Cursor) = (r7v2 android.database.Cursor), (r7v4 android.database.Cursor) binds: [B:16:0x0031, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    private static String a(Context context, Uri uri, String str, String[] strArr) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                cursorQuery.close();
                return string;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception unused) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
        return b(context, uri);
    }

    public static String b(Context context, Uri uri) {
        String string = uri.toString();
        return new File(context.getExternalFilesDir(null), string.substring(string.lastIndexOf("/"))).getAbsolutePath();
    }

    public static String b(File file) {
        try {
            String absolutePath = file.getAbsolutePath();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(absolutePath, options);
            String str = options.outMimeType;
            if (!str.contains("jpg") && !str.contains("gif") && !str.contains("png") && !str.contains("jpeg")) {
                return null;
            }
            return h.f75165f;
        } catch (Exception unused) {
            return "*/*";
        }
    }

    private static boolean b(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    private static boolean c(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean c(File file) {
        if (file.getParent() != null) {
            file = new File(file.getParentFile().getCanonicalFile(), file.getName());
        }
        return !file.getCanonicalFile().equals(file.getAbsoluteFile());
    }

    private static boolean d(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static long e(String str) {
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return 0L;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        return Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
    }

    private static boolean e(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }
}
