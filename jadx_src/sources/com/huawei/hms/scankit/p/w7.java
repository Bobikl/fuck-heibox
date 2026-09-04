package com.huawei.hms.scankit.p;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.huawei.hms.framework.common.SystemPropUtils;
import com.huawei.hms.hmsscankit.ScanUtil;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanBase;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes7.dex */
public class w7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f62537a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f62538b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f62539c = true;

    public static int a(int i10) {
        if (i10 <= 0) {
            return 8191;
        }
        if (((i10 - 1) & i10) == 0) {
            return i10;
        }
        int i11 = HmsScanBase.AZTEC_SCAN_TYPE;
        int iB = (i10 & i11) != 0 ? 0 | b(i11) : 0;
        int i12 = HmsScanBase.CODABAR_SCAN_TYPE;
        if ((i10 & i12) != 0) {
            iB |= b(i12);
        }
        int i13 = HmsScanBase.CODE39_SCAN_TYPE;
        if ((i10 & i13) != 0) {
            iB |= b(i13);
        }
        int i14 = HmsScanBase.CODE93_SCAN_TYPE;
        if ((i10 & i14) != 0) {
            iB |= b(i14);
        }
        int i15 = HmsScanBase.CODE128_SCAN_TYPE;
        if ((i10 & i15) != 0) {
            iB |= b(i15);
        }
        int i16 = HmsScanBase.DATAMATRIX_SCAN_TYPE;
        if ((i10 & i16) != 0) {
            iB |= b(i16);
        }
        int i17 = HmsScanBase.EAN8_SCAN_TYPE;
        if ((i10 & i17) != 0) {
            iB |= b(i17);
        }
        int i18 = HmsScanBase.EAN13_SCAN_TYPE;
        if ((i10 & i18) != 0) {
            iB |= b(i18);
        }
        int i19 = HmsScanBase.QRCODE_SCAN_TYPE;
        if ((i10 & i19) != 0) {
            iB |= b(i19);
        }
        int i20 = HmsScanBase.ITF14_SCAN_TYPE;
        if ((i10 & i20) != 0) {
            iB |= b(i20);
        }
        int i21 = HmsScanBase.PDF417_SCAN_TYPE;
        if ((i10 & i21) != 0) {
            iB |= b(i21);
        }
        int i22 = HmsScanBase.UPCCODE_A_SCAN_TYPE;
        if ((i10 & i22) != 0) {
            iB |= b(i22);
        }
        int i23 = HmsScanBase.UPCCODE_E_SCAN_TYPE;
        if ((i10 & i23) != 0) {
            iB |= b(i23);
        }
        int i24 = HmsScanBase.MULTI_FUNCTIONAL_SCAN_TYPE;
        if ((i10 & i24) != 0) {
            iB |= b(i24);
        }
        int i25 = HmsScanBase.WX_SCAN_TYPE;
        return (i10 & i25) != 0 ? iB | b(i25) : iB;
    }

    public static int a(Activity activity) {
        try {
            Class<?> cls = Class.forName("com.huawei.android.app.ActivityManagerEx");
            Method declaredMethod = cls.getDeclaredMethod("getActivityWindowMode", Activity.class);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(cls, activity);
            if (objInvoke == null) {
                return -1;
            }
            return Integer.valueOf(String.valueOf(objInvoke)).intValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | NumberFormatException | InvocationTargetException unused) {
            return -1;
        }
    }

    public static int a(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == -1 ? -1 : 0;
    }

    public static ResolveInfo a(Intent intent, String str, Activity activity) {
        intent.setPackage(str);
        List<ResolveInfo> listQueryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 0);
        if (listQueryIntentActivities.isEmpty()) {
            return null;
        }
        return listQueryIntentActivities.get(0);
    }

    public static Bitmap a(Context context, Intent intent) {
        Bitmap bitmapA;
        Bitmap bitmapCompressBitmap;
        if (b(context)) {
            Uri data = intent.getData();
            if (data == null || (bitmapA = a(context, data)) == null) {
                return null;
            }
            return bitmapA;
        }
        String strB = b(context, intent);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        if (Build.VERSION.SDK_INT <= 28 || context.getApplicationInfo() == null || context.getApplicationInfo().targetSdkVersion <= 28) {
            o4.a("ScanBitmap", "compressBitmap below android 29");
            bitmapCompressBitmap = ScanUtil.compressBitmap(context, strB);
        } else {
            o4.a("ScanBitmap", "compressBitmap above android 29");
            bitmapCompressBitmap = ScanUtil.compressBitmapForAndroid29(context, strB);
        }
        if (bitmapCompressBitmap != null) {
            return bitmapCompressBitmap;
        }
        o4.a("ScanBitmap", "compressBitmap above android 29");
        return ScanUtil.compressBitmapForAndroid29(context, strB);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static Bitmap a(Context context, Uri uri) throws Throwable {
        InputStream inputStreamOpenInputStream;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        ?? r10 = 0;
        try {
            try {
                try {
                    inputStreamOpenInputStream = context.getApplicationContext().getContentResolver().openInputStream(uri);
                    if (inputStreamOpenInputStream == null) {
                        if (inputStreamOpenInputStream != null) {
                            inputStreamOpenInputStream.close();
                        }
                        return null;
                    }
                    try {
                        byte[] bArrA = a(inputStreamOpenInputStream);
                        BitmapFactory.decodeByteArray(bArrA, 0, bArrA.length, options);
                        a(context, options);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrA, 0, bArrA.length, options);
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException unused) {
                            o4.b("ScankitUtils", "IOException in getImagePath");
                        }
                        return bitmapDecodeByteArray;
                    } catch (IOException unused2) {
                        o4.b("ScankitUtils", "compressBitmapFromUri IOException");
                        if (inputStreamOpenInputStream != null) {
                            inputStreamOpenInputStream.close();
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r10 = uri;
                    if (r10 != 0) {
                        try {
                            r10.close();
                        } catch (IOException unused3) {
                            o4.b("ScankitUtils", "IOException in getImagePath");
                        }
                    }
                    throw th;
                }
            } catch (IOException unused4) {
                inputStreamOpenInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                if (r10 != 0) {
                    r10.close();
                }
                throw th;
            }
        } catch (IOException unused5) {
            o4.b("ScankitUtils", "IOException in getImagePath");
        }
    }

    public static Bitmap a(Bitmap bitmap, float f10) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setRotate(f10, width / 2, height / 2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        if (!bitmapCreateBitmap.equals(bitmap) && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap a(Bitmap bitmap, float f10, float f11) {
        if (f10 <= 0.0f || f11 <= 0.0f) {
            return null;
        }
        float f12 = 1.0f / f10;
        float f13 = 1.0f / f11;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i10 = (int) (width * f10);
        int i11 = (int) (height * f11);
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int[] iArr2 = new int[i10 * i11];
        for (int i12 = 0; i12 < i11; i12++) {
            for (int i13 = 0; i13 < i10; i13++) {
                iArr2[(i12 * i10) + i13] = iArr[(((int) (i12 * f13)) * width) + ((int) (i13 * f12))];
            }
        }
        Log.d(">>>", "dstPixels:" + i10 + " x " + i11);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArr2, 0, i10, 0, 0, i10, i11);
        return bitmapCreateBitmap;
    }

    public static Bitmap a(Bitmap bitmap, int i10) {
        if (i10 == 0) {
            return a(bitmap, 90.0f);
        }
        if (i10 != 2) {
            return i10 != 3 ? bitmap : a(bitmap, 180.0f);
        }
        return a(bitmap, 270.0f);
    }

    public static Bitmap a(Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return null;
        }
        return a(bitmap, i10 / bitmap.getWidth(), i11 / bitmap.getHeight());
    }

    private static String a() {
        String str = Build.BRAND;
        if (TextUtils.isEmpty(str) || str.equalsIgnoreCase("HUAWEI")) {
            return "navigationbar_is_min";
        }
        if (str.equalsIgnoreCase("XIAOMI")) {
            return "force_fsg_nav_bar";
        }
        return (str.equalsIgnoreCase(com.max.hbutils.utils.o.f73560f) || str.equalsIgnoreCase(com.max.hbutils.utils.o.f73559e)) ? "navigation_gesture_on" : "navigationbar_is_min";
    }

    private static String a(Context context, Uri uri, String str) {
        String string = null;
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, null, null);
            if (cursorQuery != null) {
                string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndex("_data")) : null;
                cursorQuery.close();
            }
            return string;
        } catch (IllegalStateException unused) {
            o4.b("ScankitUtils", "IllegalStateException in getImagePath");
            return null;
        } catch (Exception unused2) {
            o4.b("ScankitUtils", "Exception in getImagePath");
            return null;
        }
    }

    public static String a(String str) {
        return AppOpsManager.permissionToOp(str);
    }

    private static void a(Context context, BitmapFactory.Options options) {
        boolean z10;
        int i10 = options.outWidth;
        int i11 = options.outHeight;
        if (i10 == 0 || i11 == 0) {
            return;
        }
        if (i10 > i11) {
            i10 = i11;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            z10 = ((double) memoryInfo.totalMem) / Math.pow(1024.0d, 3.0d) < 5.5d;
        } catch (NullPointerException unused) {
            o4.b("exception", "NullPointerException");
        } catch (Exception unused2) {
            o4.b("exception", "Exception");
        }
        int i12 = z10 ? 1200 : 3000;
        options.inSampleSize = i10 > i12 ? Math.round(i10 / i12) : 1;
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inPurgeable = true;
        options.inInputShareable = true;
    }

    public static boolean a(Context context) {
        return b(context) || context.checkPermission("android.permission.CAMERA", Process.myPid(), Process.myUid()) == 0;
    }

    public static boolean a(String str, Activity activity) {
        PackageInfo packageInfo;
        try {
            packageInfo = activity.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            o4.d("Utils", "NameNotFoundException Exception");
            packageInfo = null;
        }
        if (packageInfo == null) {
            return false;
        }
        int i10 = packageInfo.applicationInfo.flags;
        return ((i10 & 1) == 1) || ((i10 & 128) == 1);
    }

    public static boolean a(byte[] bArr, int i10) {
        return i10 >= 0 && i10 < bArr.length;
    }

    public static boolean a(float[] fArr, int i10) {
        return i10 >= 0 && i10 < fArr.length;
    }

    public static boolean a(int[] iArr, int i10) {
        return i10 >= 0 && i10 < iArr.length;
    }

    public static boolean a(String[] strArr, int i10) {
        return i10 >= 0 && i10 < strArr.length;
    }

    public static boolean a(byte[][] bArr, int i10) {
        return i10 >= 0 && i10 < bArr.length;
    }

    public static boolean a(int[][] iArr, int i10) {
        return i10 >= 0 && i10 < iArr.length;
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    public static HmsScan[] a(HmsScan[] hmsScanArr) {
        if (hmsScanArr != null && hmsScanArr.length != 0) {
            for (HmsScan hmsScan : hmsScanArr) {
                if (hmsScan != null) {
                    hmsScan.scanType = b(hmsScan.scanType);
                }
            }
        }
        return hmsScanArr;
    }

    public static int b(int i10) {
        if (i10 == 8191) {
            return 8191;
        }
        if (i10 == HmsScanBase.QRCODE_SCAN_TYPE) {
            return 256;
        }
        if (i10 == HmsScanBase.AZTEC_SCAN_TYPE) {
            return 4096;
        }
        if (i10 == HmsScanBase.DATAMATRIX_SCAN_TYPE) {
            return 16;
        }
        if (i10 == HmsScanBase.PDF417_SCAN_TYPE) {
            return 2048;
        }
        if (i10 == HmsScanBase.CODE39_SCAN_TYPE) {
            return 2;
        }
        if (i10 == HmsScanBase.CODE93_SCAN_TYPE) {
            return 4;
        }
        if (i10 == HmsScanBase.CODE128_SCAN_TYPE) {
            return 1;
        }
        if (i10 == HmsScanBase.EAN13_SCAN_TYPE) {
            return 32;
        }
        if (i10 == HmsScanBase.EAN8_SCAN_TYPE) {
            return 64;
        }
        if (i10 == HmsScanBase.ITF14_SCAN_TYPE) {
            return 128;
        }
        if (i10 == HmsScanBase.UPCCODE_A_SCAN_TYPE) {
            return 512;
        }
        if (i10 == HmsScanBase.UPCCODE_E_SCAN_TYPE) {
            return 1024;
        }
        if (i10 == HmsScanBase.CODABAR_SCAN_TYPE) {
            return 8;
        }
        if (i10 == HmsScanBase.WX_SCAN_TYPE) {
            return 16384;
        }
        if (i10 == HmsScanBase.MULTI_FUNCTIONAL_SCAN_TYPE) {
            return 8192;
        }
        return i10;
    }

    private static String b(Context context, Intent intent) {
        Uri data = new Intent(intent).getData();
        if (!DocumentsContract.isDocumentUri(context, data)) {
            if ("content".equalsIgnoreCase(data.getScheme())) {
                return a(context, data, (String) null);
            }
            return null;
        }
        String documentId = DocumentsContract.getDocumentId(data);
        if ("com.android.providers.media.documents".equals(data.getAuthority())) {
            return a(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=" + documentId.split(":")[1]);
        }
        if (!"com.android.providers.downloads.documents".equals(data.getAuthority())) {
            return null;
        }
        try {
            return a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(documentId)), (String) null);
        } catch (NumberFormatException unused) {
            o4.b("ScankitUtils", "NumberFormatException in withAppendedId");
            return null;
        } catch (Exception unused2) {
            o4.b("ScankitUtils", "Exception in withAppendedId");
            return null;
        }
    }

    public static boolean b() {
        try {
            return "-1".equalsIgnoreCase(SystemPropUtils.getProperty("get", "sys.multiwin_for_camera", "android.os.SystemProperties", "UNKNOWN"));
        } catch (RuntimeException | Exception unused) {
            return false;
        }
    }

    public static boolean b(Activity activity) {
        return a(activity) == 102;
    }

    public static boolean b(Context context) {
        if (TextUtils.isEmpty(f62537a)) {
            try {
                f62537a = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("scanExt", "unSet");
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("scanerror", "checkPermission NameNotFoundException");
            } catch (Exception unused2) {
                Log.e("scanerror", "checkPermission Exception");
            }
        }
        return "readUri".equals(f62537a);
    }

    public static boolean c() {
        String str = Build.MANUFACTURER;
        return str.equalsIgnoreCase("HUAWEI") || str.equalsIgnoreCase("honor");
    }

    public static boolean c(Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        return rotation == 0 || rotation == 2;
    }

    public static boolean c(Context context) {
        if (b(context) && TextUtils.isEmpty(f62538b)) {
            f62538b = context.getSharedPreferences("scanExt", 0).getString("scanExt", "unSet");
        }
        return "forbid".equals(f62538b);
    }

    public static int d(Context context) {
        int identifier;
        if (context.getResources() == null || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(identifier);
    }

    public static boolean d() {
        return "ar".equals(Locale.getDefault().getLanguage()) || "ur".equals(Locale.getDefault().getLanguage()) || "ug".equals(Locale.getDefault().getLanguage()) || "iw".equals(Locale.getDefault().getLanguage()) || "fa".equals(Locale.getDefault().getLanguage());
    }

    public static boolean e() {
        try {
            return "-1".equalsIgnoreCase(SystemPropUtils.getProperty("get", "sys.hw_multiwin_for_camera", "android.os.SystemProperties", "UNKNOWN"));
        } catch (RuntimeException | Exception unused) {
            return false;
        }
    }

    public static boolean e(Context context) {
        String string = context.getResources().getConfiguration().toString();
        return string.contains("hwMultiwindow-magic") || string.contains("hw-magic-windows");
    }

    public static boolean f() {
        String str = Build.BRAND;
        return str != null && str.toLowerCase().equals("samsung");
    }

    public static boolean f(Context context) {
        return Build.VERSION.SDK_INT >= 24 && (context instanceof Activity) && ((Activity) context).isInMultiWindowMode();
    }

    public static boolean g(Context context) {
        try {
            return com.huawei.hms.feature.dynamic.f.e.f60734e.equalsIgnoreCase(SystemPropUtils.getProperty("get", "ro.hw.country", "android.os.SystemProperties", "UNKNOWN"));
        } catch (RuntimeException | Exception unused) {
            return false;
        }
    }

    public static boolean h(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return Math.sqrt(Math.pow((double) (((float) displayMetrics.widthPixels) / displayMetrics.xdpi), 2.0d) + Math.pow((double) (((float) displayMetrics.heightPixels) / displayMetrics.ydpi), 2.0d)) >= 5.5d;
    }

    public static boolean i(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return Math.sqrt(Math.pow((double) (((float) displayMetrics.widthPixels) / displayMetrics.xdpi), 2.0d) + Math.pow((double) (((float) displayMetrics.heightPixels) / displayMetrics.ydpi), 2.0d)) >= 8.0d && ((float) displayMetrics.widthPixels) / ((float) displayMetrics.heightPixels) > 1.3f;
    }

    public static boolean j(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return Math.sqrt(Math.pow((double) (((float) displayMetrics.widthPixels) / displayMetrics.xdpi), 2.0d) + Math.pow((double) (((float) displayMetrics.heightPixels) / displayMetrics.ydpi), 2.0d)) >= 7.0d;
    }

    public static boolean k(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), a(), 0) == 0;
    }
}
