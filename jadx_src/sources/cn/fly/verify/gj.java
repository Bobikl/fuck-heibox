package cn.fly.verify;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class gj {
    public static File a(Context context, String str) {
        try {
            String strG = g(context);
            if (strG == null) {
                return null;
            }
            File file = new File(strG, str);
            if (!file.getParentFile().exists() || !file.getParentFile().isDirectory()) {
                file.getParentFile().delete();
                file.getParentFile().mkdirs();
            }
            return file;
        } catch (Throwable th2) {
            es.a().b(th2);
            return null;
        }
    }

    public static File a(Context context, String str, boolean z10) {
        File file = new File(h(context), str);
        if (z10 && !file.exists()) {
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    parentFile.mkdirs();
                }
                file.createNewFile();
            } catch (Throwable th2) {
                es.a().a(th2);
            }
        }
        return file;
    }

    public static <T> T a(Object obj) {
        return (T) a(obj, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T a(Object obj, T t10) {
        if (obj != 0) {
            try {
                if (obj instanceof Integer) {
                    return t10 instanceof Long ? (T) Long.valueOf(((Integer) obj).intValue()) : obj;
                }
                return obj;
            } catch (Throwable unused) {
            }
        }
        return t10;
    }

    public static Object a(String str) {
        File file;
        GZIPInputStream gZIPInputStream;
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        if (!TextUtils.isEmpty(str)) {
            try {
                file = new File(str);
                if (!file.exists()) {
                    file = null;
                }
            } catch (Throwable th2) {
                es.a().a(th2);
            }
            if (file != null) {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        gZIPInputStream = new GZIPInputStream(fileInputStream);
                        try {
                            objectInputStream = new ObjectInputStream(gZIPInputStream);
                            try {
                                Object object = objectInputStream.readObject();
                                objectInputStream.close();
                                el.a(objectInputStream, gZIPInputStream, fileInputStream);
                                return object;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    es.a().a(th);
                                    el.a(objectInputStream, gZIPInputStream, fileInputStream);
                                    return null;
                                } catch (Throwable th4) {
                                    el.a(objectInputStream, gZIPInputStream, fileInputStream);
                                    throw th4;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            objectInputStream = null;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        gZIPInputStream = null;
                        objectInputStream = null;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    gZIPInputStream = null;
                    fileInputStream = null;
                    objectInputStream = null;
                }
            }
        }
        return null;
    }

    public static String a(Context context, boolean z10) {
        String strH;
        if (z10) {
            strH = null;
        } else {
            try {
                strH = h(context);
            } catch (Throwable th2) {
                es.a().b(th2);
                return null;
            }
        }
        String strA = fz.d.a();
        if (strA != null) {
            strH = strA + bq.a("001m") + "fvv";
        }
        if (TextUtils.isEmpty(strH)) {
            return null;
        }
        File file = new File(strH);
        if (!file.exists() || !file.isDirectory()) {
            file.delete();
            file.mkdirs();
        }
        return strH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.io.Closeable[]] */
    public static ArrayList<HashMap<String, String>> a(String str, boolean z10) {
        GZIPInputStream gZIPInputStream;
        InputStreamReader inputStreamReader;
        ?? r10;
        ?? bufferedReader;
        File fileA = a(ax.g(), str, false);
        if (fileA.exists() && fileA.length() > 0) {
            FileInputStream fileInputStream = null;
            try {
                ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
                FileInputStream fileInputStream2 = new FileInputStream(fileA);
                try {
                    gZIPInputStream = new GZIPInputStream(fileInputStream2);
                    try {
                        inputStreamReader = new InputStreamReader(gZIPInputStream, "utf-8");
                        try {
                            bufferedReader = new BufferedReader(inputStreamReader);
                            while (true) {
                                try {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        el.a((Closeable[]) new Closeable[]{bufferedReader, inputStreamReader, gZIPInputStream, fileInputStream2});
                                        return arrayList;
                                    }
                                    if (z10) {
                                        line = new String(Base64.decode(line, 2), "utf-8");
                                    }
                                    arrayList.add(ge.a(line));
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileInputStream = fileInputStream2;
                                    r10 = bufferedReader;
                                    try {
                                        es.a().a(th);
                                        el.a((Closeable[]) new Closeable[]{r10, inputStreamReader, gZIPInputStream, fileInputStream});
                                        return new ArrayList<>();
                                    } catch (Throwable th3) {
                                        el.a((Closeable[]) new Closeable[]{r10, inputStreamReader, gZIPInputStream, fileInputStream});
                                        throw th3;
                                    }
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            bufferedReader = 0;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        inputStreamReader = null;
                        bufferedReader = inputStreamReader;
                        fileInputStream = fileInputStream2;
                        r10 = bufferedReader;
                        es.a().a(th);
                        el.a((Closeable[]) new Closeable[]{r10, inputStreamReader, gZIPInputStream, fileInputStream});
                        return new ArrayList<>();
                    }
                } catch (Throwable th6) {
                    th = th6;
                    gZIPInputStream = null;
                    inputStreamReader = null;
                }
            } catch (Throwable th7) {
                th = th7;
                gZIPInputStream = null;
                inputStreamReader = null;
                r10 = 0;
            }
        }
        return new ArrayList<>();
    }

    public static void a(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        String[] list = file.list();
        if (list == null || list.length <= 0) {
            file.delete();
            return;
        }
        for (String str : list) {
            File file2 = new File(file, str);
            if (file2.isDirectory()) {
                a(file2);
            } else {
                file2.delete();
            }
        }
        file.delete();
    }

    public static void a(File file, byte[] bArr) {
        FileChannel fileChannel;
        if (file == null || bArr == null) {
            return;
        }
        if (!file.exists()) {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            try {
                file.createNewFile();
            } catch (IOException e10) {
                es.a().a(e10);
            }
        }
        if (!file.exists()) {
            return;
        }
        FileChannel channel = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                channel = fileOutputStream.getChannel();
                channel.write(ByteBuffer.wrap(bArr));
                channel.force(true);
                el.a(channel, fileOutputStream);
            } catch (Throwable th2) {
                th = th2;
                fileChannel = channel;
                channel = fileOutputStream;
                try {
                    es.a().a(th);
                    el.a(fileChannel, channel);
                } catch (Throwable th3) {
                    el.a(fileChannel, channel);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            fileChannel = null;
        }
    }

    public static void a(ArrayList<HashMap<String, String>> arrayList, String str, boolean z10) {
        GZIPOutputStream gZIPOutputStream;
        OutputStreamWriter outputStreamWriter;
        Closeable closeable = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(a(ax.g(), str, true));
            try {
                gZIPOutputStream = new GZIPOutputStream(fileOutputStream);
                try {
                    outputStreamWriter = new OutputStreamWriter(gZIPOutputStream, "utf-8");
                    try {
                        Iterator<HashMap<String, String>> it = arrayList.iterator();
                        while (it.hasNext()) {
                            String strA = ge.a((HashMap) it.next());
                            if (z10) {
                                strA = new String(Base64.encode(strA.getBytes("utf-8"), 2), "utf-8");
                            }
                            outputStreamWriter.append((CharSequence) strA).append('\n');
                        }
                        el.a(outputStreamWriter, gZIPOutputStream, fileOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = fileOutputStream;
                        try {
                            es.a().a(th);
                            el.a(outputStreamWriter, gZIPOutputStream, closeable);
                        } catch (Throwable th3) {
                            el.a(outputStreamWriter, gZIPOutputStream, closeable);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    outputStreamWriter = null;
                }
            } catch (Throwable th5) {
                th = th5;
                gZIPOutputStream = null;
                outputStreamWriter = null;
            }
        } catch (Throwable th6) {
            th = th6;
            gZIPOutputStream = null;
            outputStreamWriter = null;
        }
    }

    public static boolean a(String str, Object obj) {
        File file;
        GZIPOutputStream gZIPOutputStream;
        ObjectOutputStream objectOutputStream;
        if (!TextUtils.isEmpty(str)) {
            FileOutputStream fileOutputStream = null;
            try {
                file = new File(str);
                if (file.exists()) {
                    file.delete();
                }
                if (obj == null) {
                    return true;
                }
                if (!file.getParentFile().exists() || !file.getParentFile().isDirectory()) {
                    file.getParentFile().delete();
                    file.getParentFile().mkdirs();
                }
                file.createNewFile();
            } catch (Throwable th2) {
                es.a().a(th2);
                file = null;
            }
            if (file != null) {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        gZIPOutputStream = new GZIPOutputStream(fileOutputStream2);
                        try {
                            objectOutputStream = new ObjectOutputStream(gZIPOutputStream);
                            try {
                                objectOutputStream.writeObject(obj);
                                objectOutputStream.flush();
                                objectOutputStream.close();
                                el.a(objectOutputStream, gZIPOutputStream, fileOutputStream2);
                                return true;
                            } catch (Throwable th3) {
                                th = th3;
                                fileOutputStream = fileOutputStream2;
                                try {
                                    es.a().a(th);
                                    el.a(objectOutputStream, gZIPOutputStream, fileOutputStream);
                                    return false;
                                } catch (Throwable th4) {
                                    el.a(objectOutputStream, gZIPOutputStream, fileOutputStream);
                                    throw th4;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            objectOutputStream = null;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        gZIPOutputStream = null;
                        objectOutputStream = null;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    gZIPOutputStream = null;
                    objectOutputStream = null;
                }
            }
        }
        return false;
    }

    public static float[] a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new float[]{displayMetrics.xdpi, displayMetrics.ydpi};
    }

    public static File b(Context context, String str) {
        return a(context, str, false);
    }

    public static byte[] b(File file) {
        FileChannel channel;
        FileInputStream fileInputStream;
        if (file != null && file.exists()) {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    channel = fileInputStream.getChannel();
                    try {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) channel.size());
                        while (channel.read(byteBufferAllocate) > 0) {
                        }
                        byte[] bArrArray = byteBufferAllocate.array();
                        el.a(channel, fileInputStream);
                        return bArrArray;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            es.a().a(th);
                            el.a(channel, fileInputStream);
                            return null;
                        } catch (Throwable th3) {
                            el.a(channel, fileInputStream);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    channel = null;
                }
            } catch (Throwable th5) {
                th = th5;
                channel = null;
                fileInputStream = null;
            }
        }
        return null;
    }

    public static int[] b(Context context) {
        WindowManager windowManager;
        Display defaultDisplay = null;
        try {
            windowManager = (WindowManager) fz.d.a("window");
        } catch (Throwable th2) {
            es.a().b(th2);
            windowManager = null;
        }
        if (windowManager != null) {
            try {
                defaultDisplay = windowManager.getDefaultDisplay();
            } catch (Throwable th3) {
                es.a().b(th3);
            }
            try {
                if (defaultDisplay == null) {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
                }
                Point point = new Point();
                Method method = defaultDisplay.getClass().getMethod(bq.a("011Pfk>gjChk+geh'fmejheFg"), Point.class);
                method.setAccessible(true);
                method.invoke(defaultDisplay, point);
                return new int[]{point.x, point.y};
            } catch (Throwable th4) {
                es.a().b(th4);
            }
        }
        return new int[]{0, 0};
    }

    public static int c(Context context) {
        return b(context)[0];
    }

    public static int d(Context context) {
        return b(context)[1];
    }

    public static double e(Context context) {
        try {
            int iC = c(context);
            int iD = d(context);
            float[] fArrA = a(context);
            if (fArrA == null || fArrA.length != 2) {
                return 0.0d;
            }
            double d10 = iC / fArrA[0];
            double d11 = iD / fArrA[1];
            return new BigDecimal(Math.sqrt((d10 * d10) + (d11 * d11))).setScale(1, 4).doubleValue();
        } catch (Throwable th2) {
            es.a().a(th2);
            return 0.0d;
        }
    }

    public static int f(Context context) {
        try {
            int iC = c(context);
            int iD = d(context);
            return (int) Math.round(Math.sqrt((iC * iC) + (iD * iD)) / e(context));
        } catch (Throwable th2) {
            es.a().a(th2);
            return 0;
        }
    }

    public static String g(Context context) {
        return a(context, false);
    }

    public static String h(Context context) {
        String str = context.getFilesDir().getAbsolutePath() + bq.a("001m") + "fvv";
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            file.delete();
            file.mkdirs();
        }
        return str;
    }
}
