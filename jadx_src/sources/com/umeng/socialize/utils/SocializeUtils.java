package com.umeng.socialize.utils;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.core.content.FileProvider;
import bb.c;
import com.huawei.hms.framework.common.ContainerUtils;
import com.umeng.socialize.Config;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.net.dplus.cache1.DplueCache;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class SocializeUtils {
    protected static final String TAG = "SocializeUtils";
    private static final char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static Set<Uri> deleteUris = new HashSet();
    private static Pattern mDoubleByte_Pattern = null;
    private static int smDip = 0;

    public static byte[] File2byte(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = fileInputStream.read(bArr);
                if (i10 == -1) {
                    fileInputStream.close();
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (FileNotFoundException e10) {
            SLog.error(e10);
            return null;
        } catch (IOException e11) {
            SLog.error(e11);
            return null;
        }
    }

    public static boolean assertBinaryInvalid(byte[] bArr) {
        return bArr != null && bArr.length > 0;
    }

    public static Map<String, String> bundleTomap(Bundle bundle) {
        if (bundle == null || bundle.isEmpty()) {
            return null;
        }
        Set<String> setKeySet = bundle.keySet();
        HashMap map = new HashMap();
        for (String str : setKeySet) {
            if (str.equals("com.sina.weibo.intent.extra.USER_ICON")) {
                map.put("icon_url", bundle.getString(str));
            }
            map.put(str, bundle.getString(str));
        }
        return map;
    }

    public static int countContentLength(String str) {
        String strTrim = str.trim();
        int i10 = 0;
        while (getDoubleBytePattern().matcher(strTrim).find()) {
            i10++;
        }
        int length = strTrim.length() - i10;
        return i10 + (length % 2 != 0 ? (length + 1) / 2 : length / 2);
    }

    public static Bundle decodeUrl(String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            for (String str2 : str.split("&")) {
                String[] strArrSplit = str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
                bundle.putString(URLDecoder.decode(strArrSplit[0]), URLDecoder.decode(strArrSplit[1]));
            }
        }
        return bundle;
    }

    public static int dip2Px(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static String getAppkey(Context context) {
        Object obj;
        if (context == null) {
            return "";
        }
        String str = SocializeConstants.APPKEY;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            return (applicationInfo == null || (obj = applicationInfo.metaData.get("UMENG_APPKEY")) == null) ? str : obj.toString();
        } catch (Exception e10) {
            SLog.error(e10);
            return str;
        }
    }

    private static Pattern getDoubleBytePattern() {
        if (mDoubleByte_Pattern == null) {
            mDoubleByte_Pattern = Pattern.compile("[^\\x00-\\xff]");
        }
        return mDoubleByte_Pattern;
    }

    public static int[] getFloatWindowSize(Context context) {
        return context == null ? new int[2] : new int[]{c.b.f30698i8, c.b.M3};
    }

    public static String hexdigest(String str) {
        try {
            return md5(str.getBytes());
        } catch (Exception e10) {
            SLog.error(e10);
            return null;
        }
    }

    public static Uri insertImage(Context context, String str) {
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            try {
                String strInsertImage = MediaStore.Images.Media.insertImage(context.getContentResolver(), str, "umeng_social_shareimg", (String) null);
                if (!TextUtils.isEmpty(strInsertImage)) {
                    return Uri.parse(strInsertImage);
                }
            } catch (Throwable th2) {
                SLog.error(th2);
            }
            try {
                return (PlatformConfig.getFileProvider() == null || Build.VERSION.SDK_INT < 24) ? Uri.fromFile(new File(str)) : FileProvider.f(context, PlatformConfig.getFileProvider(), new File(str));
            } catch (Throwable th3) {
                SLog.error(th3);
            }
        }
        return null;
    }

    public static boolean isFloatWindowStyle(Context context) {
        if (context != null && SocializeConstants.SUPPORT_PAD) {
            if (smDip == 0) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                int width = defaultDisplay.getWidth();
                int height = defaultDisplay.getHeight();
                if (width > height) {
                    width = height;
                }
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                smDip = (int) ((width / displayMetrics.density) + 0.5f);
            }
            if ((context.getResources().getConfiguration().screenLayout & 15) >= 3 && smDip >= 550) {
                return true;
            }
        }
        return false;
    }

    public static boolean isHasDplusCache() {
        File filePath = DplueCache.getFilePath("s_e");
        File filePath2 = DplueCache.getFilePath("auth");
        File filePath3 = DplueCache.getFilePath("userinfo");
        File filePath4 = DplueCache.getFilePath("dau");
        File filePath5 = DplueCache.getFilePath("stats");
        return ((filePath == null || filePath.listFiles() == null || filePath.listFiles().length <= 0) && (filePath2 == null || filePath2.listFiles() == null || filePath2.listFiles().length <= 0) && ((filePath3 == null || filePath3.listFiles() == null || filePath3.listFiles().length <= 0) && ((filePath4 == null || filePath4.listFiles() == null || filePath4.listFiles().length <= 0) && (filePath5 == null || filePath5.listFiles() == null || filePath5.listFiles().length <= 0)))) ? false : true;
    }

    public static boolean isToday(long j10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(System.currentTimeMillis()));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(j10));
        return calendar2.get(1) == calendar.get(1) && calendar2.get(6) - calendar.get(6) == 0;
    }

    public static JSONObject jsonObjectExt(String str) {
        new HashMap();
        try {
            return new JSONObject(str);
        } catch (Exception e10) {
            SLog.error(e10);
            return null;
        }
    }

    public static Map<String, String> jsonToMap(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.get(next) + "");
            }
        } catch (Exception e10) {
            SLog.error(e10);
        }
        return map;
    }

    public static Bundle mapToBundle(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, map.get(str));
        }
        return bundle;
    }

    public static String md5(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr = new char[32];
            int i10 = 0;
            for (int i11 = 0; i11 < 16; i11++) {
                byte b10 = bArrDigest[i11];
                int i12 = i10 + 1;
                char[] cArr2 = hexDigits;
                cArr[i10] = cArr2[(b10 >>> 4) & 15];
                i10 = i12 + 1;
                cArr[i12] = cArr2[b10 & 15];
            }
            return new String(cArr);
        } catch (Exception e10) {
            SLog.error(e10);
            return null;
        }
    }

    public static void openApplicationMarket(Context context, String str) throws Exception {
        if (Config.isJumptoAppStore) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("market://details?id=" + str));
            context.startActivity(intent);
        }
    }

    public static Bundle parseUrl(String str) {
        try {
            URL url = new URL(str);
            Bundle bundleDecodeUrl = decodeUrl(url.getQuery());
            bundleDecodeUrl.putAll(decodeUrl(url.getRef()));
            return bundleDecodeUrl;
        } catch (MalformedURLException unused) {
            return new Bundle();
        }
    }

    public static void safeCloseDialog(Dialog dialog) {
        if (dialog != null) {
            try {
                if (dialog.isShowing()) {
                    dialog.dismiss();
                }
            } catch (Exception e10) {
                SLog.error(e10);
            }
        }
    }

    public static void safeShowDialog(Dialog dialog) {
        if (dialog != null) {
            try {
                if (dialog.isShowing()) {
                    return;
                }
                dialog.show();
            } catch (Exception e10) {
                SLog.error(e10);
            }
        }
    }
}
