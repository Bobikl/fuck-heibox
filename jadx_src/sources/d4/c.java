package d4;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Window;
import android.view.WindowManager;
import com.alibaba.fastjson.JSON;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.UUID;

/* JADX INFO: compiled from: MiscUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {
    public static byte[] a(String str) {
        try {
            return Base64.decode(str, 2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b(String str) {
        try {
            return Base64.encodeToString(str.getBytes(), 2);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String c(byte[] bArr) {
        try {
            return Base64.encodeToString(bArr, 2);
        } catch (Exception unused) {
            return "";
        }
    }

    public static byte[] d(Bitmap bitmap) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (bitmap != null) {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                        byteArrayOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        r(byteArrayOutputStream);
                        return byteArray;
                    } catch (IOException e10) {
                        e = e10;
                        e.printStackTrace();
                        r(byteArrayOutputStream);
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    r(byteArrayOutputStream2);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                byteArrayOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                r(byteArrayOutputStream2);
                throw th;
            }
        } else {
            r(null);
        }
        return null;
    }

    public static String e(Bitmap bitmap) throws Throwable {
        String strEncodeToString = "";
        ByteArrayOutputStream byteArrayOutputStream = null;
        if (bitmap != null) {
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream2);
                        byteArrayOutputStream2.flush();
                        strEncodeToString = Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 2);
                        byteArrayOutputStream = byteArrayOutputStream2;
                    } catch (IOException e10) {
                        e = e10;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        e.printStackTrace();
                    } catch (Throwable th2) {
                        th = th2;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        r(byteArrayOutputStream);
                        throw th;
                    }
                } catch (IOException e11) {
                    e = e11;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        r(byteArrayOutputStream);
        return strEncodeToString;
    }

    public static String f(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder("");
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            sb2.append(hexString);
        }
        return sb2.toString().trim();
    }

    public static Bitmap g(Bitmap bitmap, RectF rectF) {
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f10 = width;
            float f11 = rectF.left;
            int i10 = (int) (f10 * f11);
            float f12 = height;
            float f13 = rectF.top;
            return Bitmap.createBitmap(bitmap, i10, (int) (f12 * f13), (int) (f10 * (rectF.right - f11)), (int) (f12 * (rectF.bottom - f13)), (Matrix) null, false);
        } catch (Exception e10) {
            e10.printStackTrace();
            return bitmap;
        }
    }

    public static String h(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(lg.a.f131412e);
        sb2.append(str2);
        sb2.append(lg.a.f131412e);
        String string = UUID.randomUUID().toString();
        sb2.append(string.substring(string.length() - 4));
        sb2.append(".");
        sb2.append(str3);
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public static byte[] i(Context context, String str) throws Throwable {
        InputStream inputStreamOpen;
        ?? r10 = 0;
        byte[] bArrC = null;
        try {
            try {
                inputStreamOpen = context.getAssets().open(str);
                try {
                    bArrC = b.c(inputStreamOpen);
                    context = inputStreamOpen;
                } catch (IOException e10) {
                    e = e10;
                    e.printStackTrace();
                    context = inputStreamOpen;
                }
            } catch (Throwable th2) {
                th = th2;
                r10 = context;
                b.a(r10);
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            inputStreamOpen = null;
        } catch (Throwable th3) {
            th = th3;
            b.a(r10);
            throw th;
        }
        b.a(context);
        return bArrC;
    }

    public static String j(String str) throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            try {
                File file = new File(str);
                if (!file.exists()) {
                    q(null);
                    return "";
                }
                int length = (int) file.length();
                byte[] bArr = new byte[length];
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    if (fileInputStream2.read(bArr, 0, length) != length) {
                        q(fileInputStream2);
                        return "";
                    }
                    String strK = k(bArr);
                    q(fileInputStream2);
                    return strK;
                } catch (Exception e10) {
                    e = e10;
                    fileInputStream = fileInputStream2;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    q(fileInputStream);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        e.printStackTrace();
        q(fileInputStream);
        return "";
    }

    public static String k(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return f(messageDigest.digest());
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static boolean l(String str) {
        return !TextUtils.isEmpty(str) && str.length() >= 1 && str.length() <= 100;
    }

    public static boolean m(String str) {
        return !TextUtils.isEmpty(str) && str.length() == 18;
    }

    public static <T> T n(String str, Class<T> cls) {
        try {
            return (T) JSON.parseObject(str, cls);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String o(Context context, String str) {
        try {
            StringBuilder sb2 = new StringBuilder();
            InputStream inputStreamOpen = context.getResources().getAssets().open(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = inputStreamOpen.read(bArr);
                if (-1 == i10) {
                    return sb2.toString();
                }
                sb2.append(new String(bArr, 0, i10));
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public static byte[] p(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                fileInputStream = new FileInputStream(str);
                while (true) {
                    try {
                        int i10 = fileInputStream.read(bArr, 0, 1024);
                        if (-1 == i10) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            q(fileInputStream);
                            r(byteArrayOutputStream);
                            return byteArray;
                        }
                        byteArrayOutputStream.write(bArr, 0, i10);
                    } catch (Exception unused) {
                        q(fileInputStream);
                        r(byteArrayOutputStream);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        q(fileInputStream2);
                        r(byteArrayOutputStream);
                        throw th;
                    }
                }
            } catch (Exception unused2) {
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception unused3) {
            byteArrayOutputStream = null;
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
    }

    public static void q(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void r(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public static Bitmap s(Bitmap bitmap, int i10) {
        if (bitmap == null) {
            return bitmap;
        }
        try {
            return Bitmap.createScaledBitmap(bitmap, i10, (int) ((bitmap.getHeight() / bitmap.getWidth()) * i10), true);
        } catch (Exception e10) {
            e10.printStackTrace();
            return bitmap;
        }
    }

    public static void t(Activity activity, float f10) {
        Window window = activity.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = f10;
            window.setAttributes(attributes);
        }
    }
}
