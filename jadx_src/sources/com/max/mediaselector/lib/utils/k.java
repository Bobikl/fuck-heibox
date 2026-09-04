package com.max.mediaselector.lib.utils;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;

/* JADX INFO: compiled from: MediaStoreUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class k {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static ContentValues a(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.m.I8, new Class[]{String.class, String.class}, ContentValues.class);
        if (patchProxyResultProxy.isSupported) {
            return (ContentValues) patchProxyResultProxy.result;
        }
        String strL = u.l(Long.valueOf(System.currentTimeMillis()));
        ContentValues contentValues = new ContentValues(3);
        if (TextUtils.isEmpty(str) || str.lastIndexOf(".") == -1) {
            contentValues.put("_display_name", g.e("IMG_"));
        } else {
            contentValues.put("_display_name", str.replaceAll(str.substring(str.lastIndexOf(".")), ""));
        }
        if (TextUtils.isEmpty(str2) || str2.startsWith("video")) {
            str2 = "image/jpeg";
        }
        contentValues.put("mime_type", str2);
        if (o.e()) {
            contentValues.put("datetaken", strL);
            contentValues.put("relative_path", com.max.mediaselector.lib.config.f.J);
        }
        return contentValues;
    }

    public static ContentValues b(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.m.K8, new Class[]{String.class, String.class}, ContentValues.class);
        if (patchProxyResultProxy.isSupported) {
            return (ContentValues) patchProxyResultProxy.result;
        }
        String strL = u.l(Long.valueOf(System.currentTimeMillis()));
        ContentValues contentValues = new ContentValues(3);
        if (TextUtils.isEmpty(str) || str.lastIndexOf(".") == -1) {
            contentValues.put("_display_name", g.e("VID_"));
        } else {
            contentValues.put("_display_name", str.replaceAll(str.substring(str.lastIndexOf(".")), ""));
        }
        if (TextUtils.isEmpty(str2) || str2.startsWith("image")) {
            str2 = "video/mp4";
        }
        contentValues.put("mime_type", str2);
        if (o.e()) {
            contentValues.put("datetaken", strL);
            contentValues.put("relative_path", Environment.DIRECTORY_MOVIES);
        }
        return contentValues;
    }

    public static Uri c(Context context, PictureSelectionConfig pictureSelectionConfig) {
        String str;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, pictureSelectionConfig}, null, changeQuickRedirect, true, bb.c.m.F8, new Class[]{Context.class, PictureSelectionConfig.class}, Uri.class);
        if (patchProxyResultProxy.isSupported) {
            return (Uri) patchProxyResultProxy.result;
        }
        if (TextUtils.isEmpty(pictureSelectionConfig.T)) {
            str = "";
        } else if (pictureSelectionConfig.f75031c) {
            str = pictureSelectionConfig.T;
        } else {
            str = System.currentTimeMillis() + lg.a.f131412e + pictureSelectionConfig.T;
        }
        if (o.e() && TextUtils.isEmpty(pictureSelectionConfig.W)) {
            Uri uriE = e(context, str, pictureSelectionConfig.f75036g);
            pictureSelectionConfig.f75028a0 = uriE != null ? uriE.toString() : null;
            return uriE;
        }
        File fileC = n.c(context, 1, str, pictureSelectionConfig.f75034e, pictureSelectionConfig.W);
        pictureSelectionConfig.f75028a0 = fileC.getAbsolutePath();
        return n.w(context, fileC);
    }

    public static Uri d(Context context, PictureSelectionConfig pictureSelectionConfig) {
        String str;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, pictureSelectionConfig}, null, changeQuickRedirect, true, bb.c.m.G8, new Class[]{Context.class, PictureSelectionConfig.class}, Uri.class);
        if (patchProxyResultProxy.isSupported) {
            return (Uri) patchProxyResultProxy.result;
        }
        if (TextUtils.isEmpty(pictureSelectionConfig.U)) {
            str = "";
        } else if (pictureSelectionConfig.f75031c) {
            str = pictureSelectionConfig.U;
        } else {
            str = System.currentTimeMillis() + lg.a.f131412e + pictureSelectionConfig.U;
        }
        if (o.e() && TextUtils.isEmpty(pictureSelectionConfig.W)) {
            Uri uriF = f(context, str, pictureSelectionConfig.f75037h);
            pictureSelectionConfig.f75028a0 = uriF != null ? uriF.toString() : "";
            return uriF;
        }
        File fileC = n.c(context, 2, str, pictureSelectionConfig.f75035f, pictureSelectionConfig.W);
        pictureSelectionConfig.f75028a0 = fileC.getAbsolutePath();
        return n.w(context, fileC);
    }

    public static Uri e(Context context, String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, bb.c.m.H8, new Class[]{Context.class, String.class, String.class}, Uri.class);
        if (patchProxyResultProxy.isSupported) {
            return (Uri) patchProxyResultProxy.result;
        }
        Context applicationContext = context.getApplicationContext();
        Uri[] uriArr = {null};
        String externalStorageState = Environment.getExternalStorageState();
        ContentValues contentValuesA = a(str, str2);
        if (externalStorageState.equals("mounted")) {
            uriArr[0] = applicationContext.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValuesA);
        } else {
            uriArr[0] = applicationContext.getContentResolver().insert(MediaStore.Images.Media.INTERNAL_CONTENT_URI, contentValuesA);
        }
        return uriArr[0];
    }

    public static Uri f(Context context, String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, bb.c.m.J8, new Class[]{Context.class, String.class, String.class}, Uri.class);
        if (patchProxyResultProxy.isSupported) {
            return (Uri) patchProxyResultProxy.result;
        }
        Context applicationContext = context.getApplicationContext();
        Uri[] uriArr = {null};
        String externalStorageState = Environment.getExternalStorageState();
        ContentValues contentValuesB = b(str, str2);
        if (externalStorageState.equals("mounted")) {
            uriArr[0] = applicationContext.getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValuesB);
        } else {
            uriArr[0] = applicationContext.getContentResolver().insert(MediaStore.Video.Media.INTERNAL_CONTENT_URI, contentValuesB);
        }
        return uriArr[0];
    }
}
