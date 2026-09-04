package com.starlightc.ucropplus.util;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.n0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class FileUtils {
    private static final String TAG = "FileUtils";
    public static ChangeQuickRedirect changeQuickRedirect;

    private FileUtils() {
    }

    public static void copyFile(@n0 Context context, @n0 Uri uri, @n0 Uri uri2) throws IOException {
        OutputStream outputStream;
        if (PatchProxy.proxy(new Object[]{context, uri, uri2}, null, changeQuickRedirect, true, 50928, new Class[]{Context.class, Uri.class, Uri.class}, Void.TYPE).isSupported || uri.equals(uri2)) {
            return;
        }
        InputStream inputStream = null;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri2);
                if (!(inputStreamOpenInputStream instanceof FileInputStream) || !(outputStreamOpenOutputStream instanceof FileOutputStream)) {
                    throw new IllegalArgumentException("The input or output URI don't represent a file. uCrop requires then to represent files in order to work properly.");
                }
                FileChannel channel = ((FileInputStream) inputStreamOpenInputStream).getChannel();
                channel.transferTo(0L, channel.size(), ((FileOutputStream) outputStreamOpenOutputStream).getChannel());
                if (inputStreamOpenInputStream != null) {
                    inputStreamOpenInputStream.close();
                }
                if (outputStreamOpenOutputStream != null) {
                    outputStreamOpenOutputStream.close();
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStreamOpenInputStream;
                outputStream = null;
                try {
                    Log.e("copyFile", th.getMessage());
                } finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (outputStream != null) {
                        outputStream.close();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
        }
    }

    public static void copyFile(@n0 String str, @n0 String str2) throws Throwable {
        FileChannel fileChannel;
        if (PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 50927, new Class[]{String.class, String.class}, Void.TYPE).isSupported || str.equalsIgnoreCase(str2)) {
            return;
        }
        FileChannel channel = null;
        try {
            FileChannel channel2 = new FileInputStream(new File(str)).getChannel();
            try {
                channel = new FileOutputStream(new File(str2)).getChannel();
                channel2.transferTo(0L, channel2.size(), channel);
                channel2.close();
                if (channel != null) {
                    channel.close();
                }
            } catch (Throwable th2) {
                th = th2;
                FileChannel fileChannel2 = channel;
                channel = channel2;
                fileChannel = fileChannel2;
                if (channel != null) {
                    channel.close();
                }
                if (fileChannel != null) {
                    fileChannel.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileChannel = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    public static String getDataColumn(Context context, Uri uri, String str, String[] strArr) throws Throwable {
        Cursor cursorQuery;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, uri, str, strArr}, null, changeQuickRedirect, true, 50925, new Class[]{Context.class, Uri.class, String.class, String[].class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Cursor cursor = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (cursorQuery != null) {
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            cursorQuery.close();
                            return string;
                        }
                    } catch (IllegalArgumentException e10) {
                        e = e10;
                        Log.i(TAG, String.format(Locale.getDefault(), "getDataColumn: _data - [%s]", e.getMessage()));
                        if (cursorQuery != null) {
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (IllegalArgumentException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    public static String getPath(Context context, Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, uri}, null, changeQuickRedirect, true, 50926, new Class[]{Context.class, Uri.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (isExternalStorageDocument(uri)) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(strArrSplit[0])) {
                    return Environment.getExternalStorageDirectory() + "/" + strArrSplit[1];
                }
            } else if (isDownloadsDocument(uri)) {
                String documentId = DocumentsContract.getDocumentId(uri);
                if (!TextUtils.isEmpty(documentId)) {
                    try {
                        return getDataColumn(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
                    } catch (NumberFormatException e10) {
                        Log.i(TAG, e10.getMessage());
                        return null;
                    }
                }
            } else if (isMediaDocument(uri)) {
                String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
                String str = strArrSplit2[0];
                if ("image".equals(str)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(str)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return getDataColumn(context, uri2, "_id=?", new String[]{strArrSplit2[1]});
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return isGooglePhotosUri(uri) ? uri.getLastPathSegment() : getDataColumn(context, uri, null, null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    public static boolean isDownloadsDocument(Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri}, null, changeQuickRedirect, true, 50922, new Class[]{Uri.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isExternalStorageDocument(Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri}, null, changeQuickRedirect, true, 50921, new Class[]{Uri.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isGooglePhotosUri(Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri}, null, changeQuickRedirect, true, 50924, new Class[]{Uri.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean isMediaDocument(Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri}, null, changeQuickRedirect, true, 50923, new Class[]{Uri.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : "com.android.providers.media.documents".equals(uri.getAuthority());
    }
}
