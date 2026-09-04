package com.max.xiaoheihe.module.webview;

import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import com.bumptech.glide.Glide;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.ImageInjectInfo;
import com.max.xiaoheihe.module.bbs.StaticResourceManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: WebResourceInterceptUtils.java */
/* JADX INFO: loaded from: classes12.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f94820a = "WebResourceInter";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static File a(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 47156, new Class[]{String.class}, File.class);
        if (patchProxyResultProxy.isSupported) {
            return (File) patchProxyResultProxy.result;
        }
        try {
            String str2 = g() + e(str);
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
            File file = Glide.F(HeyBoxApplication.C()).u().load(str).V1().get(60L, TimeUnit.SECONDS);
            if (file == null) {
                return null;
            }
            File file2 = new File(str2);
            if (!file2.exists() && !file2.mkdirs()) {
                return null;
            }
            File file3 = new File(file2 + "." + fileExtensionFromUrl);
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return file3;
                }
                fileOutputStream.write(bArr, 0, i10);
            }
        } catch (Throwable th2) {
            Log.e(f94820a, "downloadFileError" + th2.getMessage());
            return null;
        }
    }

    public static String b(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 47164, new Class[]{String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : str.replaceAll(ImageInjectInfo.local_prefix, "");
    }

    public static WebResourceResponse c(Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri}, null, changeQuickRedirect, true, 47157, new Class[]{Uri.class}, WebResourceResponse.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebResourceResponse) patchProxyResultProxy.result;
        }
        if (uri == null) {
            return null;
        }
        try {
            File file = new File(b(uri.toString()));
            if (!file.exists()) {
                return null;
            }
            WebResourceResponse webResourceResponse = new WebResourceResponse(MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString())), "UTF-8", new FileInputStream(file));
            Log.d(f94820a, "load local resource success " + uri);
            return webResourceResponse;
        } catch (Throwable th2) {
            Log.e(f94820a, "" + th2.getMessage());
            return null;
        }
    }

    @androidx.annotation.p0
    public static WebResourceResponse d(View view, Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, uri}, null, changeQuickRedirect, true, 47158, new Class[]{View.class, Uri.class}, WebResourceResponse.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebResourceResponse) patchProxyResultProxy.result;
        }
        if (uri == null) {
            return null;
        }
        Log.d("zzzzwebpost", "getLocalResourceResponse " + uri);
        try {
            File file = new File(StaticResourceManager.f80064a.d(), com.max.xiaoheihe.utils.d.a1(uri.toString()));
            if (!file.exists()) {
                file = Glide.G(view).u().load(uri.toString()).V1().get(60L, TimeUnit.SECONDS);
            }
            if (file == null || !file.exists()) {
                return null;
            }
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()));
            WebResourceResponse webResourceResponse = new WebResourceResponse(mimeTypeFromExtension, "UTF-8", new FileInputStream(file));
            Log.d("zzzzwebpost", "load local resource success " + uri + "   type==" + mimeTypeFromExtension);
            return webResourceResponse;
        } catch (Throwable th2) {
            Log.e("zzzzwebpost", "" + th2.getMessage());
            return null;
        }
    }

    public static String e(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 47165, new Class[]{String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : com.max.xiaoheihe.utils.d.a1(str);
    }

    public static Uri f(Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri}, null, changeQuickRedirect, true, 47161, new Class[]{Uri.class}, Uri.class);
        if (patchProxyResultProxy.isSupported) {
            return (Uri) patchProxyResultProxy.result;
        }
        if (uri == null) {
            return null;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if ("hbhttp".equals(uri.getScheme())) {
            builderBuildUpon.scheme("http");
        } else if ("hbhttps".equals(uri.getScheme())) {
            builderBuildUpon.scheme("https");
        }
        return Uri.parse(builderBuildUpon.build().toString().replaceAll("&uri_type=(avatar|image)|\\?uri_type=(avatar|image)", ""));
    }

    public static String g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 47154, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HeyBoxApplication.C().getFilesDir());
        String str = File.separator;
        sb2.append(str);
        sb2.append("web_cache");
        sb2.append(str);
        return sb2.toString();
    }

    public static String h(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 47155, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return g() + e(str) + "." + MimeTypeMap.getFileExtensionFromUrl(str);
    }

    public static boolean i(Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri}, null, changeQuickRedirect, true, 47160, new Class[]{Uri.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        com.max.hbcommon.utils.d.b("zzzzwebpost", "isHBPictureType " + uri.toString());
        return com.max.xiaoheihe.module.upload.g.f93525b.equals(uri.getQueryParameter("uri_type")) || "image".equals(uri.getQueryParameter("uri_type"));
    }

    public static boolean j(Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri}, null, changeQuickRedirect, true, 47162, new Class[]{Uri.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        com.max.hbcommon.utils.d.b("zzzzwebpost", "isHBWebResRequest " + uri.toString());
        return "hbhttp".equals(uri.getScheme()) || "hbhttps".equals(uri.getScheme());
    }

    public static boolean k(Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri}, null, changeQuickRedirect, true, 47163, new Class[]{Uri.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (uri != null) {
            return uri.toString().startsWith(ImageInjectInfo.local_prefix);
        }
        return false;
    }

    public static boolean l(Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri}, null, changeQuickRedirect, true, 47159, new Class[]{Uri.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        com.max.hbcommon.utils.d.b("zzzzwebpost", "isPictureType " + uri.toString());
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()));
        return mimeTypeFromExtension != null && mimeTypeFromExtension.startsWith("image/");
    }
}
