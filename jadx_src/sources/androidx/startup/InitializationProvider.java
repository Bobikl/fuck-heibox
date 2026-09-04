package androidx.startup;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes6.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(@n0 Uri uri, @p0 String str, @p0 String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    @p0
    public final String getType(@n0 Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    @p0
    public final Uri insert(@n0 Uri uri, @p0 ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new StartupException("Context cannot be null");
        }
        if (context.getApplicationContext() == null) {
            return true;
        }
        a.e(context).a();
        return true;
    }

    @Override // android.content.ContentProvider
    @p0
    public final Cursor query(@n0 Uri uri, @p0 String[] strArr, @p0 String str, @p0 String[] strArr2, @p0 String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(@n0 Uri uri, @p0 ContentValues contentValues, @p0 String str, @p0 String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
