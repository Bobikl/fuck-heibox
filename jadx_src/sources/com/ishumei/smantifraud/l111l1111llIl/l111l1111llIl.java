package com.ishumei.smantifraud.l111l1111llIl;

import android.app.Application;
import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Patterns;
import com.ishumei.smantifraud.l1111l111111Il.l11l1111Ill;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class l111l1111llIl {
    public static Context l1111l111111Il() {
        try {
            return (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Object l1111l111111Il(Field field, Object obj) {
        try {
            Class<?> type = field.getType();
            if (type == Integer.class || type == Double.class || type == Float.class || type == Long.class) {
                if (obj == null) {
                    return -1;
                }
                return obj;
            }
            if (type == String.class) {
                return obj == null ? "" : obj;
            }
            if (type == Map.class) {
                return obj == null ? new JSONObject() : new JSONObject((Map) obj);
            }
            if (type != List.class && type != Set.class) {
                return obj == null ? type.newInstance() : obj;
            }
            return obj == null ? new JSONArray() : new JSONArray((Collection) obj);
        } catch (Exception unused) {
            return new Object();
        }
    }

    private static String l1111l111111Il(File file) throws Throwable {
        Throwable th2;
        BufferedReader bufferedReader;
        if (!file.exists()) {
            throw new IOException("not exist");
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                return line;
            } catch (Throwable th3) {
                th2 = th3;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            bufferedReader = null;
        }
    }

    public static String l1111l111111Il(byte[] bArr) throws IOException {
        try {
            return Base64.encodeToString(bArr, 2);
        } catch (Exception e10) {
            throw new IOException(e10);
        }
    }

    private static List<String> l1111l111111Il(File file, Set<String> set, int i10) throws Throwable {
        ArrayList arrayList = new ArrayList();
        if (!file.exists() || !file.canRead() || !file.isFile() || set == null || set.size() == 0) {
            return arrayList;
        }
        HashSet hashSet = new HashSet(set);
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            l1111l111111Il((Closeable) bufferedReader2);
                            return arrayList;
                        }
                        if (!l111l11111Il.l1111l111111Il(line)) {
                            Iterator it = hashSet.iterator();
                            if (i10 == 0) {
                                while (it.hasNext()) {
                                    String str = (String) it.next();
                                    if (line.contains(str)) {
                                        arrayList.add(str);
                                        it.remove();
                                    }
                                }
                            } else if (i10 == 1) {
                                String lowerCase = line.toLowerCase();
                                while (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    if (lowerCase.contains(str2.toLowerCase())) {
                                        arrayList.add(str2);
                                        it.remove();
                                    }
                                }
                            } else if (i10 == 2) {
                                while (it.hasNext()) {
                                    Matcher matcher = Pattern.compile((String) it.next()).matcher(line);
                                    while (matcher.find()) {
                                        arrayList.add(matcher.group(0));
                                    }
                                }
                            }
                        }
                    } catch (Exception e10) {
                        e = e10;
                        throw new IOException(e);
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        l1111l111111Il((Closeable) bufferedReader);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    private static List<String> l1111l111111Il(String str, Set<String> set, int i10) {
        return l1111l111111Il(new File(str), set, i10);
    }

    private static List<Object> l1111l111111Il(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object objOpt = jSONArray.opt(i10);
            if (objOpt != null) {
                arrayList.add(l111l11111I1l(objOpt));
            }
        }
        return arrayList;
    }

    private static Map<String, Object> l1111l111111Il(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (jSONObject == null) {
            return map;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                map.put(next, l111l11111I1l(objOpt));
            }
        }
        return map;
    }

    private static JSONArray l1111l111111Il(Object obj) throws JSONException {
        if (!obj.getClass().isArray()) {
            throw new JSONException("Not a primitive data: " + obj.getClass());
        }
        int length = Array.getLength(obj);
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < length; i10++) {
            jSONArray.put(l111l11111lIl(Array.get(obj, i10)));
        }
        return jSONArray;
    }

    private static JSONArray l1111l111111Il(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                jSONArray.put(l111l11111lIl(it.next()));
            }
        }
        return jSONArray;
    }

    public static JSONObject l1111l111111Il(Object obj, Set<String> set) {
        JSONObject jSONObject = new JSONObject();
        if (obj == null) {
            return jSONObject;
        }
        for (Field field : obj.getClass().getDeclaredFields()) {
            try {
                if (!field.getName().equals("serialVersionUID")) {
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    l11l1111Ill l11l1111ill = (l11l1111Ill) field.getAnnotation(l11l1111Ill.class);
                    if (l11l1111ill != null) {
                        String strL1111l111111Il = l11l1111ill.l1111l111111Il();
                        if (!l111l11111Il((Object) strL1111l111111Il) && !l111l11111Il(obj2) && (set == null || set.contains(strL1111l111111Il))) {
                            jSONObject.put(strL1111l111111Il, l1111l111111Il(field, obj2));
                        }
                    } else if (set == null || set.contains(field.getName())) {
                        jSONObject.put(field.getName(), obj2);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    private static JSONObject l1111l111111Il(Map<?, ?> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new NullPointerException("key == null");
                }
                try {
                    jSONObject.put(str, l111l11111lIl(entry.getValue()));
                } catch (JSONException unused) {
                }
            }
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    public static void l1111l111111Il(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    private static void l1111l111111Il(File file, String str) throws Throwable {
        if (file == null || l111l11111Il.l1111l111111Il(str)) {
            throw new IOException("file or bytes empty");
        }
        FileWriter fileWriter = null;
        try {
            FileWriter fileWriter2 = new FileWriter(file);
            try {
                fileWriter2.write(str);
                fileWriter2.close();
            } catch (Throwable th2) {
                th = th2;
                fileWriter = fileWriter2;
                if (fileWriter != null) {
                    fileWriter.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x004e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0053  */
    private static void l1111l111111Il(File file, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream;
        FileLock fileLock;
        if (bArr == null) {
            throw new IOException("file or bytes empty");
        }
        FileLock fileLockLock = null;
        FileChannel channel = null;
        fileLockLock = null;
        fileLockLock = null;
        fileLockLock = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                channel = fileOutputStream.getChannel();
                try {
                    fileLockLock = channel.lock();
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                    while (byteBufferWrap.hasRemaining()) {
                        channel.write(byteBufferWrap);
                    }
                    fileOutputStream.flush();
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    channel.close();
                    l1111l111111Il((Closeable) fileOutputStream);
                } catch (Exception e10) {
                    e = e10;
                    fileLock = fileLockLock;
                    fileOutputStream2 = fileOutputStream;
                    try {
                        throw new IOException(e);
                    } catch (Throwable th2) {
                        th = th2;
                        FileLock fileLock2 = fileLock;
                        fileOutputStream = fileOutputStream2;
                        fileLockLock = fileLock2;
                        if (fileLockLock != null) {
                            fileLockLock.release();
                        }
                        if (channel != null) {
                            channel.close();
                        }
                        l1111l111111Il((Closeable) fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    l1111l111111Il((Closeable) fileOutputStream);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                fileOutputStream2 = fileOutputStream;
                fileLock = fileLockLock;
                throw new IOException(e);
            } catch (Throwable th4) {
                th = th4;
                channel = null;
            }
        } catch (Exception e12) {
            e = e12;
        } catch (Throwable th5) {
            th = th5;
            channel = null;
            fileOutputStream = null;
        }
    }

    private static void l1111l111111Il(String str, String str2) throws Throwable {
        if (l111l11111Il.l1111l111111Il(str) || l111l11111Il.l1111l111111Il(str2)) {
            throw new IOException("file or bytes empty");
        }
        byte[] bytes = str2.getBytes("utf-8");
        if (l111l11111Il.l1111l111111Il(str) || bytes == null) {
            throw new IOException("filename or byes empty");
        }
        try {
            l1111l111111Il(new File(str), bytes);
        } catch (Exception e10) {
            throw new IOException(e10);
        }
    }

    private static void l1111l111111Il(String str, byte[] bArr) throws Throwable {
        if (l111l11111Il.l1111l111111Il(str) || bArr == null) {
            throw new IOException("filename or byes empty");
        }
        try {
            l1111l111111Il(new File(str), bArr);
        } catch (Exception e10) {
            throw new IOException(e10);
        }
    }

    private static void l1111l111111Il(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception unused) {
            }
        }
    }

    public static boolean l1111l111111Il(String str) {
        try {
            return new File(Environment.getExternalStorageDirectory() + "/" + str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    private static byte[] l1111l111111Il(FileChannel fileChannel) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(100);
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        int i12 = fileChannel.read(byteBufferAllocate, i10);
                        if (i12 <= 0) {
                            break;
                        }
                        i10 += i12;
                        i11 += i12;
                    }
                    byte[] bArrArray = byteBufferAllocate.array();
                    if (i11 >= 4 && (bArrArray[0] & 255) == 0 && (bArrArray[1] & 255) == 0 && (bArrArray[2] & 255) == 0 && (bArrArray[3] & 255) == 0) {
                        throw new IOException("read bytes not utf-8");
                    }
                    byteArrayOutputStream2.write(bArrArray, 0, i11);
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    l1111l111111Il((Closeable) byteArrayOutputStream2);
                    return byteArray;
                } catch (Exception e10) {
                    e = e10;
                    throw new IOException(e);
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    l1111l111111Il((Closeable) byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    private static Object l111l11111I1l(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return l1111l111111Il((JSONObject) obj);
        }
        return obj instanceof JSONArray ? l1111l111111Il((JSONArray) obj) : obj;
    }

    private static String l111l11111I1l(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuilder sb2 = new StringBuilder(bArrDigest.length << 1);
            for (byte b10 : bArrDigest) {
                int i10 = b10 & 255;
                if (i10 < 16) {
                    sb2.append("0");
                }
                sb2.append(Integer.toHexString(i10));
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException unused) {
            throw new IOException("fail to md5 data");
        }
    }

    public static boolean l111l11111I1l(String str) {
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public static List<String> l111l11111Il(String str) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th2;
        Exception e10;
        ArrayList arrayList = new ArrayList();
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(str)));
            while (true) {
                try {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            l1111l111111Il((Closeable) bufferedReader);
                            return arrayList;
                        }
                        if (!l111l11111Il.l1111l111111Il(line)) {
                            arrayList.add(line);
                        }
                    } catch (Exception e11) {
                        e10 = e11;
                        throw new IOException(e10);
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                }
                th2 = th3;
                l1111l111111Il((Closeable) bufferedReader);
                throw th2;
            }
        } catch (Exception e12) {
            bufferedReader = null;
            e10 = e12;
        } catch (Throwable th4) {
            bufferedReader = null;
            th2 = th4;
        }
    }

    private static boolean l111l11111Il(Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof String) {
            return TextUtils.isEmpty((String) obj);
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).isEmpty();
        }
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    private static Object l111l11111lIl(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(l111l11111lIl(it.next()));
                }
                return jSONArray;
            }
            if (obj.getClass().isArray()) {
                return l1111l111111Il(obj);
            }
            if (obj instanceof Map) {
                return l1111l111111Il((Map<?, ?>) obj);
            }
            if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                return obj;
            }
            if (obj.getClass().getPackage().getName().startsWith("java.")) {
                return obj.toString();
            }
            return null;
        } catch (Exception unused) {
        }
    }

    private static String l111l11111lIl(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b10 : bArr) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append(":");
            }
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    private static List<String> l111l11111lIl(File file, Set<String> set, int i10) {
        String[] list;
        ArrayList arrayList = new ArrayList();
        if (file.isDirectory() && set != null && set.size() != 0 && (list = file.list()) != null && list.length != 0) {
            HashSet hashSet = new HashSet(set);
            for (String str : list) {
                Iterator it = hashSet.iterator();
                if (i10 == 0) {
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        if (str.contains(str2)) {
                            arrayList.add(str2);
                        }
                    }
                } else if (i10 == 1) {
                    String lowerCase = str.toLowerCase();
                    while (it.hasNext()) {
                        String str3 = (String) it.next();
                        if (lowerCase.contains(str3.toLowerCase())) {
                            arrayList.add(str3);
                        }
                    }
                } else if (i10 == 2) {
                    while (it.hasNext()) {
                        if (Pattern.compile((String) it.next()).matcher(str).find()) {
                            arrayList.add(str);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private static List<String> l111l11111lIl(String str, Set<String> set, int i10) {
        return TextUtils.isEmpty(str) ? Collections.emptyList() : l111l11111lIl(new File(str), set, i10);
    }

    public static boolean l111l11111lIl(String str) {
        Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
        return context != null && context.checkSelfPermission(str) == 0;
    }

    public static String l111l1111l1Il(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return l111l11111I1l(str.getBytes("utf-8"));
        } catch (Exception unused) {
            return "";
        }
    }

    private static String l111l1111lI1l(String str) throws IOException {
        try {
            return l1111l111111Il(new File(str));
        } catch (Exception e10) {
            throw new IOException(e10);
        }
    }

    private static String l111l1111lIl(String str) {
        return (str == null || str.isEmpty()) ? "" : str.replaceAll(":", "").toLowerCase();
    }

    public static byte[] l111l1111llIl(String str) throws IOException {
        try {
            return Base64.decode(str.getBytes("utf-8"), 0);
        } catch (Exception e10) {
            throw new IOException(e10);
        }
    }

    private static String l11l1111I11l(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = Patterns.DOMAIN_NAME.matcher(str);
        if (matcher.find()) {
            return matcher.group(0);
        }
        return null;
    }

    private static boolean l11l1111I1l(String str) {
        if (str == null) {
            return false;
        }
        return Patterns.IP_ADDRESS.matcher(str).matches();
    }

    private static String l11l1111lIIl(String str) {
        if (str != null && str.length() != 0) {
            try {
                return URLEncoder.encode(str, "UTF-8");
            } catch (Exception unused) {
            }
        }
        return "";
    }
}
