package com.max.hbapkinstaller;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.qcloud.core.util.IOUtils;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.u;

/* JADX INFO: compiled from: PathTool.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final e f65801a = new e();
    public static ChangeQuickRedirect changeQuickRedirect;

    private e() {
    }

    private final boolean b(Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, bb.c.b.ln, new Class[]{Uri.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f0.g("com.android.providers.downloads.documents", uri.getAuthority());
    }

    private final boolean c(Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, bb.c.b.kn, new Class[]{Uri.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f0.g("com.android.externalstorage.documents", uri.getAuthority());
    }

    private final boolean d(Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, bb.c.b.mn, new Class[]{Uri.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f0.g("com.android.providers.media.documents", uri.getAuthority());
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0109  */
    /* JADX WARN: Code duplicated, block: B:38:0x0130  */
    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public final String a(@dl.d Context mContext, @dl.d Uri uri) {
        String str;
        Uri uri2;
        Uri EXTERNAL_CONTENT_URI;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mContext, uri}, this, changeQuickRedirect, false, bb.c.b.jn, new Class[]{Context.class, Uri.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(mContext, "mContext");
        f0.p(uri, "uri");
        String[] strArr = {""};
        if (!DocumentsContract.isDocumentUri(mContext.getApplicationContext(), uri)) {
            str = "";
            uri2 = uri;
        } else {
            if (c(uri)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Environment.getExternalStorageDirectory());
                sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
                String documentId = DocumentsContract.getDocumentId(uri);
                f0.o(documentId, "getDocumentId(...)");
                sb2.append((String) StringsKt__StringsKt.U4(documentId, new String[]{":"}, false, 0, 6, null).get(1));
                return sb2.toString();
            }
            if (b(uri)) {
                Uri uri3 = Uri.parse("content://downloads/public_downloads");
                String documentId2 = DocumentsContract.getDocumentId(uri);
                f0.o(documentId2, "getDocumentId(...)");
                EXTERNAL_CONTENT_URI = ContentUris.withAppendedId(uri3, Long.parseLong(documentId2));
                f0.o(EXTERNAL_CONTENT_URI, "withAppendedId(...)");
                str = "";
            } else if (d(uri)) {
                String documentId3 = DocumentsContract.getDocumentId(uri);
                f0.o(documentId3, "getDocumentId(...)");
                String str2 = (String) StringsKt__StringsKt.U4(documentId3, new String[]{":"}, false, 0, 6, null).get(0);
                int iHashCode = str2.hashCode();
                if (iHashCode != 93166550) {
                    if (iHashCode != 100313435) {
                        if (iHashCode == 112202875 && str2.equals("video")) {
                            EXTERNAL_CONTENT_URI = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                            f0.o(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
                        } else {
                            EXTERNAL_CONTENT_URI = uri;
                        }
                    } else if (str2.equals("image")) {
                        EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                        f0.o(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
                    } else {
                        EXTERNAL_CONTENT_URI = uri;
                    }
                } else if (str2.equals("audio")) {
                    EXTERNAL_CONTENT_URI = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    f0.o(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
                } else {
                    EXTERNAL_CONTENT_URI = uri;
                }
                String documentId4 = DocumentsContract.getDocumentId(EXTERNAL_CONTENT_URI);
                f0.o(documentId4, "getDocumentId(...)");
                strArr[0] = StringsKt__StringsKt.U4(documentId4, new String[]{":"}, false, 0, 6, null).get(1);
                str = "_id=?";
            } else {
                str = "";
                uri2 = uri;
            }
            uri2 = EXTERNAL_CONTENT_URI;
        }
        if (!u.L1("content", uri2.getScheme(), true)) {
            if (!u.L1("file", uri2.getScheme(), true)) {
                return "";
            }
            String path = uri2.getPath();
            f0.m(path);
            return path;
        }
        try {
            Cursor cursorQuery = mContext.getContentResolver().query(uri2, new String[]{"_data"}, str, strArr, null);
            f0.m(cursorQuery);
            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_data");
            if (!cursorQuery.moveToFirst()) {
                return "";
            }
            String string = cursorQuery.getString(columnIndexOrThrow);
            cursorQuery.close();
            f0.m(string);
            return string;
        } catch (Exception unused) {
            return "";
        }
    }
}
