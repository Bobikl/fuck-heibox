package com.tencent.open.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import androidx.core.content.FileProvider;
import com.huawei.hms.framework.common.ContainerUtils;
import com.max.xiaoheihe.module.bbs.ReportReasonFragment;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.qmsp.sdk.u.U;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f101195a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f101196b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f101197c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f101198d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f101199e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String f101200f = "0123456789ABCDEF";

    private static char a(int i10) {
        int i11 = i10 & 15;
        return (char) (i11 < 10 ? i11 + 48 : (i11 - 10) + 97);
    }

    public static long a(Context context, Uri uri) {
        Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_size"}, null, null, null);
        long j10 = 0;
        if (cursorQuery != null) {
            try {
                if (cursorQuery.getCount() != 0) {
                    try {
                        try {
                            j10 = cursorQuery.moveToFirst() ? cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_size")) : 0L;
                            cursorQuery.close();
                        } catch (Exception e10) {
                            SLog.e("openSDK_LOG.Util", "cursor exception", e10);
                            cursorQuery.close();
                        }
                        return j10;
                    } catch (Throwable th2) {
                        try {
                            cursorQuery.close();
                        } catch (Exception e11) {
                            SLog.e("openSDK_LOG.Util", "cursor exception", e11);
                        }
                        throw th2;
                    }
                }
            } catch (Exception e12) {
                SLog.e("openSDK_LOG.Util", "cursor exception", e12);
            }
        }
        return 0L;
    }

    public static Drawable a(String str, Context context) throws Throwable {
        InputStream inputStreamOpen;
        StringBuilder sb2;
        InputStream inputStream = null;
        drawableCreateFromStream = null;
        Drawable drawableCreateFromStream = null;
        if (context == null) {
            SLog.e("openSDK_LOG.Util", "context null!");
            return null;
        }
        try {
            inputStreamOpen = context.getAssets().open(str);
            try {
                try {
                    drawableCreateFromStream = Drawable.createFromStream(inputStreamOpen, str);
                    try {
                        inputStreamOpen.close();
                    } catch (Exception e10) {
                        e = e10;
                        sb2 = new StringBuilder();
                        sb2.append("inputStream close exception: ");
                        sb2.append(e.getMessage());
                        SLog.e("openSDK_LOG.Util", sb2.toString());
                    }
                } catch (IOException e11) {
                    e = e11;
                    SLog.e("openSDK_LOG.Util", "getDrawable exception: " + e.getMessage());
                    try {
                        inputStreamOpen.close();
                    } catch (Exception e12) {
                        e = e12;
                        sb2 = new StringBuilder();
                        sb2.append("inputStream close exception: ");
                        sb2.append(e.getMessage());
                        SLog.e("openSDK_LOG.Util", sb2.toString());
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStreamOpen;
                try {
                    inputStream.close();
                } catch (Exception e13) {
                    SLog.e("openSDK_LOG.Util", "inputStream close exception: " + e13.getMessage());
                }
                throw th;
            }
        } catch (IOException e14) {
            e = e14;
            inputStreamOpen = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream.close();
            throw th;
        }
        return drawableCreateFromStream;
    }

    public static Uri a(Activity activity, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            SLog.e("openSDK_LOG.Util", "grantUriPermissionToAllQQVersion -- stringForFileUri is empty");
            return null;
        }
        try {
            String authorities = Tencent.getAuthorities(str);
            if (TextUtils.isEmpty(authorities)) {
                return null;
            }
            Uri uriF = FileProvider.f(activity, authorities, new File(str2));
            activity.grantUriPermission("com.tencent.mobileqq", uriF, 3);
            activity.grantUriPermission(Constants.PACKAGE_TIM, uriF, 3);
            activity.grantUriPermission(Constants.PACKAGE_QQ_PAD, uriF, 3);
            activity.grantUriPermission(Constants.PACKAGE_QQ_SPEED, uriF, 3);
            return uriF;
        } catch (Exception e10) {
            SLog.e("openSDK_LOG.Util", "grantUriPermissionToAllQQVersion exception:", e10);
            return null;
        }
    }

    public static Bundle a(Bundle bundle, String str) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("result", str);
        return bundle;
    }

    public static Bundle a(String str) {
        Bundle bundle = new Bundle();
        if (str == null) {
            return bundle;
        }
        try {
            for (String str2 : str.split("&")) {
                String[] strArrA = a(str2, ContainerUtils.KEY_VALUE_DELIMITER);
                if (strArrA.length == 2) {
                    bundle.putString(URLDecoder.decode(strArrA[0]), URLDecoder.decode(strArrA[1]));
                }
            }
            return bundle;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bundle a(String str, String str2, String str3, String str4, String str5) {
        return a(str, str3, str4, str2, str5, "", "", "", "", "", "");
    }

    public static Bundle a(String str, String str2, String str3, String str4, String str5, String str6) {
        return a(str, str3, str4, str2, str5, str6, "", "", "", "", "", "");
    }

    public static Bundle a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        Bundle bundle = new Bundle();
        bundle.putString("openid", str);
        bundle.putString(ReportReasonFragment.f80028x, str2);
        bundle.putString("act_type", str3);
        bundle.putString(SocializeProtocolConstants.PROTOCOL_KEY_VERIFY_MEDIA, str4);
        bundle.putString("app_id", str5);
        bundle.putString("type", str6);
        bundle.putString("login_status", str7);
        bundle.putString("need_user_auth", str8);
        bundle.putString("to_uin", str9);
        bundle.putString("call_source", str10);
        bundle.putString("to_type", str11);
        bundle.putString("platform", "1");
        return bundle;
    }

    public static Bundle a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        return a(a(str, str2, str3, str4, str5, str7, str8, str9, str10, str11, str12), str6);
    }

    public static final String a(Context context) {
        CharSequence applicationLabel;
        if (context == null || (applicationLabel = context.getPackageManager().getApplicationLabel(context.getApplicationInfo())) == null) {
            return null;
        }
        return applicationLabel.toString();
    }

    public static String a(String str, int i10) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Base64.encodeToString(str.getBytes("UTF-8"), i10);
            } catch (UnsupportedEncodingException e10) {
                SLog.e("openSDK_LOG.Util", "convert2Base64String exception: " + e10.getMessage());
            }
        }
        return "";
    }

    public static final String a(String str, int i10, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "UTF-8";
        }
        try {
            if (str.getBytes(str2).length <= i10) {
                return str;
            }
            int i11 = 0;
            int length = 0;
            while (i11 < str.length()) {
                int i12 = i11 + 1;
                length += str.substring(i11, i12).getBytes(str2).length;
                if (length > i10) {
                    String strSubstring = str.substring(0, i11);
                    if (TextUtils.isEmpty(str3)) {
                        return strSubstring;
                    }
                    return strSubstring + str3;
                }
                i11 = i12;
            }
            return str;
        } catch (Exception e10) {
            SLog.e("openSDK_LOG.Util", "Util.subString has exception: " + e10.getMessage());
            return str;
        }
    }

    public static String a(String str, Activity activity, String str2, IUiListener iUiListener) {
        String str3;
        try {
            boolean zM = m(str2);
            SLog.i("openSDK_LOG.Util", "doPublishMood() check file: isAppSpecificDir=" + zM + ",hasSDPermission=" + c());
            if (!zM) {
                File fileA = g.a("Images");
                if (fileA != null) {
                    str3 = fileA.getAbsolutePath() + File.separator + Constants.QQ_SHARE_TEMP_DIR;
                } else {
                    File cacheDir = g.a().getCacheDir();
                    if (cacheDir == null) {
                        SLog.e("openSDK_LOG.Util", "getMediaFileUri error, cacheDir is null");
                        return null;
                    }
                    str3 = cacheDir.getAbsolutePath() + File.separator + Constants.QQ_SHARE_TEMP_DIR;
                }
                File file = new File(str2);
                String absolutePath = file.getAbsolutePath();
                String str4 = str3 + File.separator + file.getName();
                str2 = b(absolutePath, str4) ? str4 : null;
            }
            Uri uriA = a(activity, str, str2);
            if (uriA == null) {
                return null;
            }
            return uriA.toString();
        } catch (Exception e10) {
            SLog.e("openSDK_LOG.Util", "getMediaFileUri error", e10);
            return null;
        }
    }

    public static String a(Map<String, Object> map, String str, String str2) {
        if (map == null) {
            SLog.e("openSDK_LOG.Util", "getString error, params==null");
            return str2;
        }
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            return obj instanceof String ? (String) obj : str2;
        }
        SLog.e("openSDK_LOG.Util", "getString error, not comtain : " + str);
        return str2;
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            String string = Integer.toString(b10 & 255, 16);
            if (string.length() == 1) {
                string = "0" + string;
            }
            sb2.append(string);
        }
        return sb2.toString();
    }

    public static JSONObject a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (str != null) {
            for (String str2 : str.split("&")) {
                String[] strArrSplit = str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
                if (strArrSplit.length == 2) {
                    try {
                        strArrSplit[0] = URLDecoder.decode(strArrSplit[0]);
                        strArrSplit[1] = URLDecoder.decode(strArrSplit[1]);
                    } catch (Exception unused) {
                    }
                    try {
                        jSONObject.put(strArrSplit[0], strArrSplit[1]);
                    } catch (JSONException e10) {
                        SLog.e("openSDK_LOG.Util", "decodeUrlToJson has exception: " + e10.getMessage());
                    }
                }
            }
        }
        return jSONObject;
    }

    private static void a(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, str2));
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(1073741824);
        intent.addFlags(268435456);
        intent.setData(Uri.parse(str3));
        context.startActivity(intent);
    }

    public static boolean a() {
        return (Environment.getExternalStorageState().equals("mounted") ? Environment.getExternalStorageDirectory() : null) != null;
    }

    public static boolean a(Context context, String str) {
        boolean zG;
        try {
            zG = g(context);
            try {
                if (zG) {
                    a(context, "com.tencent.mtt", "com.tencent.mtt.MainActivity", str);
                } else {
                    a(context, "com.android.browser", "com.android.browser.BrowserActivity", str);
                }
                return true;
            } catch (Exception unused) {
                if (!zG) {
                    try {
                        try {
                            a(context, "com.google.android.browser", "com.android.browser.BrowserActivity", str);
                            return true;
                        } catch (Exception unused2) {
                            return false;
                        }
                    } catch (Exception unused3) {
                        a(context, "com.android.chrome", "com.google.android.apps.chrome.Main", str);
                        return true;
                    }
                }
                try {
                    try {
                        try {
                            a(context, "com.android.browser", "com.android.browser.BrowserActivity", str);
                            return true;
                        } catch (Exception unused4) {
                            return false;
                        }
                    } catch (Exception unused5) {
                        a(context, "com.android.chrome", "com.google.android.apps.chrome.Main", str);
                        return true;
                    }
                } catch (Exception unused6) {
                    a(context, "com.google.android.browser", "com.android.browser.BrowserActivity", str);
                    return true;
                }
            }
        } catch (Exception unused7) {
            zG = false;
        }
    }

    public static boolean a(Context context, String str, String str2) {
        boolean zB = b(str, str2);
        SLog.i("openSDK_LOG.Util", "copyFileByCheckPermission() copy success:" + zB);
        return zB;
    }

    public static boolean a(Context context, boolean z10) {
        return (c(context) && k.a(context, Constants.PACKAGE_QQ_PAD) != null) || k.c(context, U.BEACON_ID_VERSION) >= 0 || k.a(context, Constants.PACKAGE_TIM) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static boolean a(File file, File file2) throws Throwable {
        int i10;
        boolean z10 = false;
        FileOutputStream fileOutputStream = null;
        fileOutputStream = null;
        fileOutputStream = null;
        fileOutputStream = null;
        try {
            try {
                try {
                    if (file2.exists()) {
                        file2.delete();
                    }
                    if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                        file2.getParentFile().mkdirs();
                    }
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                    try {
                        file2 = new BufferedInputStream(new FileInputStream(file));
                        try {
                            byte[] bArr = new byte[102400];
                            while (true) {
                                i10 = file2.read(bArr);
                                if (i10 == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i10);
                                fileOutputStream2.flush();
                            }
                            z10 = true;
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e10) {
                                SLog.e("openSDK_LOG.Util", "copyFile error, ", e10);
                            }
                            file2.close();
                            fileOutputStream = i10;
                            file2 = file2;
                        } catch (IOException e11) {
                            e = e11;
                            fileOutputStream = fileOutputStream2;
                            file2 = file2;
                            SLog.e("openSDK_LOG.Util", "copyFile error, ", e);
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e12) {
                                    SLog.e("openSDK_LOG.Util", "copyFile error, ", e12);
                                }
                            }
                            if (file2 != 0) {
                                file2.close();
                                fileOutputStream = fileOutputStream;
                                file2 = file2;
                            }
                            return z10;
                        } catch (OutOfMemoryError e13) {
                            e = e13;
                            fileOutputStream = fileOutputStream2;
                            file2 = file2;
                            SLog.e("openSDK_LOG.Util", "copyFile error, ", e);
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e14) {
                                    SLog.e("openSDK_LOG.Util", "copyFile error, ", e14);
                                }
                            }
                            if (file2 != 0) {
                                file2.close();
                                fileOutputStream = fileOutputStream;
                                file2 = file2;
                            }
                            return z10;
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e15) {
                                    SLog.e("openSDK_LOG.Util", "copyFile error, ", e15);
                                }
                            }
                            if (file2 == 0) {
                                throw th;
                            }
                            try {
                                file2.close();
                                throw th;
                            } catch (IOException e16) {
                                SLog.e("openSDK_LOG.Util", "copyFile error, ", e16);
                                throw th;
                            }
                        }
                    } catch (IOException e17) {
                        e = e17;
                        file2 = 0;
                    } catch (OutOfMemoryError e18) {
                        e = e18;
                        file2 = 0;
                    } catch (Throwable th3) {
                        th = th3;
                        file2 = 0;
                    }
                } catch (IOException e19) {
                    SLog.e("openSDK_LOG.Util", "copyFile error, ", e19);
                }
            } catch (IOException e20) {
                e = e20;
                file2 = 0;
            } catch (OutOfMemoryError e21) {
                e = e21;
                file2 = 0;
            } catch (Throwable th4) {
                th = th4;
                file2 = 0;
            }
            return z10;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public static boolean a(Map<String, Object> map, String str, boolean z10) {
        if (map == null) {
            SLog.e("openSDK_LOG.Util", "getBoolean error, params==null");
            return z10;
        }
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z10;
        }
        SLog.e("openSDK_LOG.Util", "getBoolean error, not comtain : " + str);
        return z10;
    }

    public static String[] a(String str, String str2) {
        int iIndexOf = str.indexOf(str2);
        return iIndexOf == -1 ? new String[]{str} : new String[]{str.substring(0, iIndexOf), str.substring(iIndexOf + str2.length())};
    }

    public static Bundle b(String str) {
        try {
            URL url = new URL(str.replace("auth://", "http://"));
            Bundle bundleA = a(url.getQuery());
            bundleA.putAll(a(url.getRef()));
            return bundleA;
        } catch (MalformedURLException unused) {
            return new Bundle();
        }
    }

    public static String b() {
        File fileE = g.e();
        if (fileE == null) {
            return null;
        }
        if (!fileE.exists()) {
            fileE.mkdirs();
        }
        return fileE.toString();
    }

    @SuppressLint({"NewApi"})
    public static String b(Context context, Uri uri) {
        Uri uri2;
        if (uri == null) {
            return null;
        }
        if (!DocumentsContract.isDocumentUri(context, uri)) {
            String scheme = uri.getScheme();
            if ("content".equals(scheme)) {
                return c(context, uri);
            }
            if ("file".equals(scheme)) {
                return uri.getPath();
            }
            return null;
        }
        String authority = uri.getAuthority();
        if ("com.android.externalstorage.documents".equals(authority)) {
            String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
            String str = strArrSplit[0];
            return "primary".equals(str) ? Environment.getExternalStorageDirectory().getAbsolutePath().concat("/").concat(strArrSplit[1]) : "/storage/".concat(str).concat("/").concat(strArrSplit[1]);
        }
        if ("com.android.providers.downloads.documents".equals(authority)) {
            String documentId = DocumentsContract.getDocumentId(uri);
            return documentId.startsWith("raw:") ? documentId.replaceFirst("raw:", "") : c(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(documentId)));
        }
        if ("com.android.providers.media.documents".equals(authority)) {
            String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
            String str2 = strArrSplit2[0];
            if ("image".equals(str2)) {
                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } else if ("video".equals(str2)) {
                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            } else if ("audio".equals(str2)) {
                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            }
            return c(context, ContentUris.withAppendedId(uri2, Long.parseLong(strArrSplit2[1])));
        }
        return null;
    }

    public static void b(Context context, String str) {
        if (context == null) {
            return;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            String str2 = packageInfo.versionName;
            f101196b = str2;
            f101195a = str2.substring(0, str2.lastIndexOf(46));
            String str3 = f101196b;
            f101198d = str3.substring(str3.lastIndexOf(46) + 1, f101196b.length());
            f101199e = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            SLog.e("openSDK_LOG.Util", "getPackageInfo has exception: " + e10.getMessage());
        } catch (Exception e11) {
            SLog.e("openSDK_LOG.Util", "getPackageInfo has exception: " + e11.getMessage());
        }
    }

    public static boolean b(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || i(context, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return true;
        }
        NetworkInfo[] allNetworkInfo = null;
        try {
            allNetworkInfo = connectivityManager.getAllNetworkInfo();
        } catch (Exception e10) {
            SLog.e("openSDK_LOG.Util", "Util.isNetWorkAvailable has exception: ", e10);
        }
        if (allNetworkInfo != null && allNetworkInfo.length != 0) {
            for (NetworkInfo networkInfo : allNetworkInfo) {
                if (networkInfo.isConnectedOrConnecting()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(String str, String str2) {
        File file = new File(str);
        if (file.exists()) {
            try {
                return a(file, l(str2));
            } catch (IOException e10) {
                SLog.d("openSDK_LOG.Util", "copy fail from " + str + " to " + str2 + " ", e10);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x01e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0202 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:? A[SYNTHETIC] */
    public static String c(Context context, Uri uri) throws Throwable {
        Cursor cursorQuery;
        FileOutputStream fileOutputStream;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        return cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                    }
                } catch (Exception e10) {
                    e = e10;
                    SLog.e("openSDK_LOG.Util", "queryAbsolutePath error : " + e.getMessage());
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    try {
                        parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
                        try {
                            fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                            try {
                                File fileH = h(context, "Images");
                                if (fileH == null) {
                                    SLog.e("openSDK_LOG.Util", "getExternalFilesDir return null");
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e11) {
                                        SLog.e("openSDK_LOG.Util", "close fileIuputStream error" + e11.getMessage());
                                    }
                                    try {
                                        parcelFileDescriptorOpenFileDescriptor.close();
                                    } catch (IOException e12) {
                                        SLog.e("openSDK_LOG.Util", "close ParcelFileDescriptor error" + e12.getMessage());
                                    }
                                    return null;
                                }
                                if (!fileH.exists()) {
                                    fileH.mkdirs();
                                }
                                File file = new File(fileH, uri.getLastPathSegment());
                                if (!file.exists()) {
                                    file.createNewFile();
                                }
                                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                                try {
                                    byte[] bArr = new byte[2048];
                                    while (true) {
                                        int i10 = fileInputStream.read(bArr);
                                        if (i10 == -1) {
                                            break;
                                        }
                                        fileOutputStream2.write(bArr, 0, i10);
                                    }
                                    fileOutputStream2.flush();
                                    String absolutePath = file.getAbsolutePath();
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e13) {
                                        SLog.e("openSDK_LOG.Util", "close fileIuputStream error" + e13.getMessage());
                                    }
                                    try {
                                        fileOutputStream2.close();
                                    } catch (IOException e14) {
                                        SLog.e("openSDK_LOG.Util", "close fileOutputStream error" + e14.getMessage());
                                    }
                                    try {
                                        parcelFileDescriptorOpenFileDescriptor.close();
                                    } catch (IOException e15) {
                                        SLog.e("openSDK_LOG.Util", "close ParcelFileDescriptor error" + e15.getMessage());
                                    }
                                    return absolutePath;
                                } catch (Exception e16) {
                                    fileOutputStream = fileOutputStream2;
                                    e = e16;
                                    try {
                                        SLog.e("openSDK_LOG.Util", "copy file from uri error : " + e.getMessage());
                                        if (fileInputStream != null) {
                                            try {
                                                fileInputStream.close();
                                            } catch (IOException e17) {
                                                SLog.e("openSDK_LOG.Util", "close fileIuputStream error" + e17.getMessage());
                                            }
                                        }
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException e18) {
                                                SLog.e("openSDK_LOG.Util", "close fileOutputStream error" + e18.getMessage());
                                            }
                                        }
                                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                                            try {
                                                parcelFileDescriptorOpenFileDescriptor.close();
                                            } catch (IOException e19) {
                                                SLog.e("openSDK_LOG.Util", "close ParcelFileDescriptor error" + e19.getMessage());
                                            }
                                        }
                                        return null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileInputStream2 = fileInputStream;
                                        if (fileInputStream2 != null) {
                                            try {
                                                fileInputStream2.close();
                                            } catch (IOException e20) {
                                                SLog.e("openSDK_LOG.Util", "close fileIuputStream error" + e20.getMessage());
                                            }
                                        }
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException e21) {
                                                SLog.e("openSDK_LOG.Util", "close fileOutputStream error" + e21.getMessage());
                                            }
                                        }
                                        if (parcelFileDescriptorOpenFileDescriptor == null) {
                                            throw th;
                                        }
                                        try {
                                            parcelFileDescriptorOpenFileDescriptor.close();
                                            throw th;
                                        } catch (IOException e22) {
                                            SLog.e("openSDK_LOG.Util", "close ParcelFileDescriptor error" + e22.getMessage());
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    fileInputStream2 = fileInputStream;
                                    fileOutputStream = fileOutputStream2;
                                    th = th3;
                                    if (fileInputStream2 != null) {
                                        fileInputStream2.close();
                                    }
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                                        throw th;
                                    }
                                    parcelFileDescriptorOpenFileDescriptor.close();
                                    throw th;
                                }
                            } catch (Exception e23) {
                                e = e23;
                                fileOutputStream = null;
                            } catch (Throwable th4) {
                                th = th4;
                                fileOutputStream = null;
                                fileInputStream2 = fileInputStream;
                                if (fileInputStream2 != null) {
                                    fileInputStream2.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                if (parcelFileDescriptorOpenFileDescriptor == null) {
                                    throw th;
                                }
                                parcelFileDescriptorOpenFileDescriptor.close();
                                throw th;
                            }
                        } catch (Exception e24) {
                            e = e24;
                            fileOutputStream = null;
                            fileInputStream = null;
                        } catch (Throwable th5) {
                            th = th5;
                            fileOutputStream = null;
                        }
                    } catch (Exception e25) {
                        e = e25;
                        fileOutputStream = null;
                        parcelFileDescriptorOpenFileDescriptor = null;
                        fileInputStream = null;
                    } catch (Throwable th6) {
                        th = th6;
                        fileOutputStream = null;
                        parcelFileDescriptorOpenFileDescriptor = null;
                    }
                }
            }
            return null;
        } catch (Exception e26) {
            e = e26;
            cursorQuery = null;
        }
    }

    public static String c(Context context, String str) {
        if (context == null) {
            return "";
        }
        b(context, str);
        return f101196b;
    }

    public static JSONObject c(String str) {
        try {
            URL url = new URL(str.replace("auth://", "http://"));
            JSONObject jSONObjectA = a((JSONObject) null, url.getQuery());
            a(jSONObjectA, url.getRef());
            return jSONObjectA;
        } catch (MalformedURLException unused) {
            return new JSONObject();
        }
    }

    public static boolean c() {
        Context contextA = g.a();
        return contextA != null && contextA.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", contextA.getPackageName()) == 0;
    }

    public static boolean c(Context context) {
        double dSqrt;
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            dSqrt = Math.sqrt(Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d) + Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d));
        } catch (Throwable unused) {
            dSqrt = 0.0d;
        }
        return dSqrt > 6.5d;
    }

    public static String d(Context context, String str) {
        if (context == null) {
            return "";
        }
        b(context, str);
        return f101195a;
    }

    public static JSONObject d(String str) throws JSONException {
        if (str.equals("false")) {
            str = "{value : false}";
        }
        if (str.equals("true")) {
            str = "{value : true}";
        }
        if (str.contains("allback(")) {
            str = str.replaceFirst("[\\s\\S]*allback\\(([\\s\\S]*)\\);[^\\)]*\\z", "$1").trim();
        }
        if (str.contains("online[0]=")) {
            str = "{online:" + str.charAt(str.length() - 2) + z5.g.f141884d;
        }
        return new JSONObject(str);
    }

    public static boolean d(Context context) {
        return k.c(context, "8.1.5") >= 0;
    }

    public static String e(Context context, String str) {
        if (context == null) {
            return "";
        }
        String strD = d(context, str);
        f101197c = strD;
        return strD;
    }

    public static boolean e(Context context) {
        return k.c(context, "8.1.8") >= 0;
    }

    public static boolean e(String str) {
        return str == null || str.length() == 0;
    }

    public static String f(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            SLog.e("openSDK_LOG.Util", "urlEncode: UnsupportedEncodingException", e10);
            return "";
        }
    }

    public static boolean f(Context context) {
        return k.c(context, "5.9.5") >= 0;
    }

    public static boolean f(Context context, String str) {
        boolean z10 = !c(context) || k.a(context, Constants.PACKAGE_QQ_PAD) == null;
        if (z10 && k.a(context, Constants.PACKAGE_TIM) != null) {
            z10 = false;
        }
        if (z10) {
            return k.c(context, str) < 0;
        }
        return z10;
    }

    public static String g(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(j(str));
            byte[] bArrDigest = messageDigest.digest();
            if (bArrDigest == null) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                sb2.append(a(b10 >>> 4));
                sb2.append(a(b10));
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException e10) {
            SLog.e("openSDK_LOG.Util", "encrypt has exception: " + e10.getMessage());
            return str;
        }
    }

    private static boolean g(Context context) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.tencent.mtt", 64);
            String str = packageInfo.versionName;
            if (k.a(str, "4.3") >= 0 && !str.startsWith("4.4") && (signatureArr = packageInfo.signatures) != null) {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(signatureArr[0].toByteArray());
                    String strA = a(messageDigest.digest());
                    messageDigest.reset();
                    if (strA.equals("d8391a394d4a179e6fe7bdb8a301258b")) {
                        return true;
                    }
                } catch (NoSuchAlgorithmException e10) {
                    SLog.e("openSDK_LOG.Util", "isQQBrowerAvailable has exception: " + e10.getMessage());
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean g(Context context, String str) {
        boolean z10 = !c(context) || k.a(context, Constants.PACKAGE_QQ_PAD) == null;
        if (z10) {
            return k.c(context, str) < 0;
        }
        return z10;
    }

    public static File h(Context context, String str) {
        File[] externalFilesDirs;
        if (context == null || (externalFilesDirs = context.getExternalFilesDirs(str)) == null || externalFilesDirs.length <= 0) {
            return null;
        }
        return externalFilesDirs[0];
    }

    public static final boolean h(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }

    private static boolean i(Context context, String str) {
        try {
            return context.checkSelfPermission(str) != 0;
        } catch (Exception e10) {
            SLog.e("openSDK_LOG.Util", "checkSelfPermission exception", e10);
            return false;
        }
    }

    public static boolean i(String str) {
        return str != null && new File(str).exists();
    }

    public static byte[] j(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e10) {
            SLog.e("openSDK_LOG.Util", "getBytesUTF8: UnsupportedEncodingException", e10);
            return new byte[0];
        }
    }

    public static String k(String str) {
        return a(str, 2);
    }

    public static File l(String str) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            if (file.getParentFile() == null || file.getParentFile().exists() || file.getParentFile().mkdirs()) {
                file.createNewFile();
            } else {
                SLog.d("openSDK_LOG.Util", "createFile failed" + str);
            }
        }
        return file;
    }

    public static boolean m(String str) {
        String strB = b();
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(strB) || !str.contains(strB)) ? false : true;
    }
}
