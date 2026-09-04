package cn.fly.verify;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public class FlyVerifyProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context;
        String string;
        String str;
        Bundle bundle;
        String string2 = null;
        try {
            context = getContext();
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
                if (packageInfo == null || (bundle = packageInfo.applicationInfo.metaData) == null) {
                    str = null;
                } else {
                    string = bundle.getString("custom-AppKey");
                    try {
                        string2 = bundle.getString("custom-AppSecret");
                    } catch (Throwable unused) {
                    }
                    str = string2;
                    string2 = string;
                }
            } catch (Throwable unused2) {
                string = null;
            }
        } catch (Throwable unused3) {
            context = null;
            string = null;
        }
        try {
            FlyVerify.init(context, string2, str);
            return false;
        } catch (Throwable unused4) {
            return false;
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
