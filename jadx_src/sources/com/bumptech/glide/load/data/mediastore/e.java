package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: ThumbnailStreamOpener.java */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f40884f = "ThumbStreamOpener";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f40885g = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f40886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f40887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f40888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ContentResolver f40889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<ImageHeaderParser> f40890e;

    e(List<ImageHeaderParser> list, a aVar, d dVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, ContentResolver contentResolver) {
        this.f40886a = aVar;
        this.f40887b = dVar;
        this.f40888c = bVar;
        this.f40889d = contentResolver;
        this.f40890e = list;
    }

    e(List<ImageHeaderParser> list, d dVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, ContentResolver contentResolver) {
        this(list, f40885g, dVar, bVar, contentResolver);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004b  */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0048: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:27:0x0048 */
    @p0
    private String b(@n0 Uri uri) throws Throwable {
        Cursor cursorA;
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            try {
                cursorA = this.f40887b.a(uri);
                if (cursorA != null) {
                    try {
                        if (cursorA.moveToFirst()) {
                            String string = cursorA.getString(0);
                            cursorA.close();
                            return string;
                        }
                    } catch (SecurityException e10) {
                        e = e10;
                        if (Log.isLoggable(f40884f, 3)) {
                            Log.d(f40884f, "Failed to query for thumbnail for Uri: " + uri, e);
                        }
                        if (cursorA != null) {
                            cursorA.close();
                        }
                        return null;
                    }
                }
                if (cursorA != null) {
                    cursorA.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SecurityException e11) {
            e = e11;
            cursorA = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    private boolean c(File file) {
        return this.f40886a.a(file) && 0 < this.f40886a.c(file);
    }

    int a(Uri uri) {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = this.f40889d.openInputStream(uri);
                return com.bumptech.glide.load.b.b(this.f40890e, inputStreamOpenInputStream, this.f40888c);
            } finally {
                if (0 != 0) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                }
            }
        } catch (IOException | NullPointerException e10) {
            if (Log.isLoggable(f40884f, 3)) {
                Log.d(f40884f, "Failed to open uri: " + uri, e10);
            }
            if (inputStreamOpenInputStream == null) {
                return -1;
            }
            try {
                inputStreamOpenInputStream.close();
                return -1;
            } catch (IOException unused2) {
                return -1;
            }
        }
    }

    public InputStream d(Uri uri) throws Throwable {
        String strB = b(uri);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        File fileB = this.f40886a.b(strB);
        if (!c(fileB)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileB);
        try {
            return this.f40889d.openInputStream(uriFromFile);
        } catch (NullPointerException e10) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e10));
        }
    }
}
