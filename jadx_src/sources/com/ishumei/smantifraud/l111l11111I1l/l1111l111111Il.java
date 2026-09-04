package com.ishumei.smantifraud.l111l11111I1l;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArraySet;
import android.util.Base64;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.xiaomi.mipush.sdk.Constants;
import dalvik.system.BaseDexClassLoader;
import g0.a;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class l1111l111111Il {
    private static final String l1111l111111Il = "eJy1Wt9P5DYQ/l9WPPQktBHcG1SVDriiVYFbEdpKoHtwkiHrrmOnsbPAnfq/d5xNgpM4u9k4vOyheH5883k8Htv39HO2hrfZ2QwYJMDV7HgWMvLjB36JCNvQtSffpILEu4LXJVGrGyrV0ddaNgG1EhEKK+GrjPIYv0ka44dfPt38QzbEY4TH3nbsHAdTkpFkdvb0/Xim3lKYnZ38d1xBoFwu17GBgPAoEzTySJp6X9KU0ZAoKviShGsSwy3h+JuZKGJQCy4VYQyiUkq+I1qUkHJFmacDMQGhdzWzoZIpWj2xoBLS8wtulplIIVO08GVieXfd5WI3PTM9ONeD85LXGtppC9rp5NDcwR4PxA/hFkobf5qJDY0g83xQCrXlkQ9hnkEriHbK3VT6oeAKE9S73P57D1KwDWSHR1YanJcG5y2DQwONYGPLIIWLLl0J/uY9VH/Zk/oKNjSEReSyuhCDLVUcMCz2kNe3ojiu4g0YWN6tZPDMIFTerYjoM21ioPKuUqxIeLTF3OA9yG0FBdfHVTlkmC8+YeA4yRxBQHSAp5iJgLCh2XxdSHcql3JL5cUHZG6Wc4TfV5NDnA+qehLmPucczWLhxioUgpRmLd5Vim05gzgUkWsXIA+o77wbIA4JmV4JLlD8rQlnNOiQ8ufe6Rm4ZRpyi6213q0BYbYTM028loF9e0NfNOk6niCacnBcJIby2Ciwi0G4U3UxhoJztsArhNaqi1mpaNLYXUvZQe1LubwH9i/mhKdRsanQyIAVisSrKMNIIOOEGbvUEn8BPb6+fcAeGcvkcESo5F37twWwD8CUyjwYSZOfB+UymBoUZgt16mgWaMAVgFM70wQwtpUJVEJCC4yA5aCEUCvvovrrS0RS1a29UZTh2nGhIgTGmLChGEzGJZq4EdsyY0LpGjIlhwALVxiIba9sp6oiCnQlA95EJ7jp8rIwZ6TuPoif/rI1RbXwvBG5LQgUdUr0G8rh5C5PgmJk9CSjP6d0t8IYm/U0DGnkxIpPE+yBKGHuzBRgnLjpBTP6gIMrPnXi5w7Ui8jW3/DwTpRw4qcA48RPLxgnfjhJYEqO7kgCzjxpUFNy1QQ1li9JE8d8whSfIpcKIK5rbbo8KuA455EByTWHakBTcTRN/tBEunVr2EjKMKNYHF3bRunWtdmBjOUlXYUi57Yrm8GAiublsrRS8bLYQ8OLvWnECuS90Gfq/Y0/lsb9loQTtItSNs4RQ537/uLKxW2Gfke4vd+qDWUWzY2Krizbjeze5ysYyeSFK5XooPhmd12F0nX8sFU6gEs8eo7y5Nd6w51RfVxw23ppvAqEZlB39c0LoEPvGwkeXRzxfGHMHYcMCc/6JqDOsp5iibr3IHOmHC5etQ+pD2fjMOgRv1QfXB711T8nARvjk0o98LVQ33uBb179gGLEthWw8nToGQfkxskKP6o8MgO8GuCrsHOwL8HjQ50xItWaixduvyPouOw5P6KVP7SV7jWB7XKw1/qIS8Ly9USOB780TJSgH3feoAZCMCD2C4EApNKYxsO5QAsVJMtNRm3lMqNKn0vPH/f0N9W1RqU5rzRnu155zGoXRYyOJRiVr1OpF3kujRuc3rBq4aNK+ryxOrvhdDWsUcSp1JVq/MTUfgbBt6X5++CwgPpmgydAxk/HHWoPmYlvXEveYkOJRoZOhlXpA+LI4N8cF0ol8Wca4S6yc2Yq0fut5nm/RB1rLSIkDur/K/H+Sb/XLIFHuGgWxQNRz2VizUzLP8r2ihizU8kIOd8iML4hhHkDgv2K8rVZ2vXTAAqH+k0rISlJqVe+We4r8sL2CjiwmtuQPVPWOJsXVYwK73fKGk8lv1JO1W87t5QG9f1F7XPT+ekkzg+Gs6vsfm5sbUFOWdShyHxWu9ASzalqI36ahK8KTYezA9G0N1YLFD0414MmkO//A9zgF+k=";

    /* JADX INFO: renamed from: com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il$1, reason: invalid class name */
    public static class AnonymousClass1 {
        public static Map<String, Integer> l1111l111111Il() {
            HashMap map = new HashMap();
            Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
            if (context == null) {
                return map;
            }
            try {
                Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null) {
                    return map;
                }
                int intExtra = intentRegisterReceiver.getIntExtra("status", 0);
                int intExtra2 = intentRegisterReceiver.getIntExtra("level", 0);
                int intExtra3 = intentRegisterReceiver.getIntExtra("scale", 100);
                int intExtra4 = intentRegisterReceiver.getIntExtra("temperature", 0);
                int intExtra5 = intentRegisterReceiver.getIntExtra("voltage", 0);
                map.put("status", Integer.valueOf(intExtra));
                map.put("level", Integer.valueOf(intExtra2));
                map.put("scale", Integer.valueOf(intExtra3));
                map.put("temp", Integer.valueOf(intExtra4));
                map.put("vol", Integer.valueOf(intExtra5));
            } catch (Exception unused) {
            }
            return map;
        }
    }

    /* JADX INFO: renamed from: com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il$l1111l111111Il, reason: collision with other inner class name */
    public static final class C0513l1111l111111Il {
        private static int l1111l111111Il = 1;
        private static int l111l11111I1l = 3;
        private static int l111l11111lIl = 2;
        private String l111l11111Il;
        private String l111l1111l1Il;
        private List<String> l111l1111lI1l;
        private int l111l1111lIl;
        private String l111l1111llIl;

        private C0513l1111l111111Il() {
        }

        /* synthetic */ C0513l1111l111111Il(byte b10) {
            this();
        }

        private String l111l1111l1Il() {
            return this.l111l11111Il;
        }

        public final String l1111l111111Il() {
            return this.l111l1111l1Il;
        }

        public final void l1111l111111Il(int i10) {
            this.l111l1111lIl = i10;
        }

        public final void l1111l111111Il(String str) {
            this.l111l11111Il = str;
        }

        public final void l1111l111111Il(List<String> list) {
            this.l111l1111lI1l = list;
        }

        public final List<String> l111l11111I1l() {
            return this.l111l1111lI1l;
        }

        public final void l111l11111I1l(String str) {
            this.l111l1111llIl = str;
        }

        public final int l111l11111Il() {
            return this.l111l1111lIl;
        }

        public final String l111l11111lIl() {
            return this.l111l1111llIl;
        }

        public final void l111l11111lIl(String str) {
            this.l111l1111l1Il = str;
        }
    }

    private static int l1111l111111Il(boolean z10) {
        return z10 ? 1 : 0;
    }

    public static Map<String, Object> l1111l111111Il() {
        String strL1111l111111Il;
        HashMap map = new HashMap();
        try {
            ArrayList<C0513l1111l111111Il> arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(l11l111l1lll());
            byte b10 = 0;
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    String string = jSONObject.getString("key");
                    String string2 = jSONObject.getString("clazz");
                    String string3 = jSONObject.getString("method");
                    JSONArray jSONArray2 = jSONObject.getJSONArray(RemoteMessageConst.MessageBody.PARAM);
                    int i11 = jSONObject.getInt("type");
                    C0513l1111l111111Il c0513l1111l111111Il = new C0513l1111l111111Il(b10);
                    c0513l1111l111111Il.l1111l111111Il(string);
                    c0513l1111l111111Il.l111l11111lIl(string2);
                    c0513l1111l111111Il.l111l11111I1l(string3);
                    c0513l1111l111111Il.l1111l111111Il(i11);
                    ArrayList arrayList2 = new ArrayList();
                    for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                        arrayList2.add(jSONArray2.getString(i12));
                    }
                    c0513l1111l111111Il.l1111l111111Il(arrayList2);
                    arrayList.add(c0513l1111l111111Il);
                } catch (Exception unused) {
                }
            }
            for (C0513l1111l111111Il c0513l1111l111111Il2 : arrayList) {
                try {
                    Class<?> cls = Class.forName(c0513l1111l111111Il2.l1111l111111Il().replace("/", "."));
                    int iL111l11111Il = c0513l1111l111111Il2.l111l11111Il();
                    List<String> listL111l11111I1l = c0513l1111l111111Il2.l111l11111I1l();
                    if (iL111l11111Il != 3) {
                        if (Modifier.isNative(((listL111l11111I1l == null || listL111l11111I1l.size() == 0) ? cls.getDeclaredMethod(c0513l1111l111111Il2.l111l11111lIl(), new Class[0]) : cls.getDeclaredMethod(c0513l1111l111111Il2.l111l11111lIl(), l1111l111111Il(listL111l11111I1l))).getModifiers())) {
                            strL1111l111111Il = c0513l1111l111111Il2.l1111l111111Il();
                            map.put(strL1111l111111Il, 1);
                        }
                    } else if (Modifier.isNative(((listL111l11111I1l == null || listL111l11111I1l.size() == 0) ? cls.getConstructor(new Class[0]) : cls.getConstructor(l1111l111111Il(listL111l11111I1l))).getModifiers())) {
                        strL1111l111111Il = c0513l1111l111111Il2.l1111l111111Il();
                        map.put(strL1111l111111Il, 1);
                    }
                } catch (Exception unused2) {
                }
            }
        } catch (Exception unused3) {
        }
        return map;
    }

    private static void l1111l111111Il(Class<?> cls, String str, Set<Object> set) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            set.addAll(((Map) declaredField.get(null)).keySet());
        } catch (Throwable unused) {
        }
    }

    private static boolean l1111l111111Il(ClassLoader classLoader, String str) {
        if (classLoader == null || !(classLoader instanceof BaseDexClassLoader)) {
            return false;
        }
        try {
            Class<?> cls = Class.forName("dalvik.system.DexPathList");
            Method method = Class.forName("dalvik.system.DexPathList$Element").getMethod("toString", null);
            Field declaredField = cls.getDeclaredField("dexElements");
            declaredField.setAccessible(true);
            Field declaredField2 = BaseDexClassLoader.class.getDeclaredField("pathList");
            declaredField2.setAccessible(true);
            Object[] objArr = (Object[]) declaredField.get(declaredField2.get(classLoader));
            for (Object obj : objArr) {
                String str2 = (String) method.invoke(obj, null);
                if (str2 != null && str2.contains(str)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean l1111l111111Il(String str) {
        try {
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            if (l1111l111111Il(systemClassLoader, str) || l1111l111111Il(systemClassLoader.getParent(), str)) {
                return true;
            }
            ClassLoader classLoader = l1111l111111Il.class.getClassLoader();
            return l1111l111111Il(classLoader, str) || l1111l111111Il(classLoader.getParent(), str);
        } catch (Exception unused) {
            return false;
        }
    }

    private static Class[] l1111l111111Il(List<String> list) throws ClassNotFoundException {
        Class<?> cls;
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.hashCode();
            switch (str) {
                case "double":
                    cls = Double.TYPE;
                    break;
                case "int":
                    cls = Integer.TYPE;
                    break;
                case "byte":
                    cls = Byte.TYPE;
                    break;
                case "char":
                    cls = Character.TYPE;
                    break;
                case "long":
                    cls = Long.TYPE;
                    break;
                case "boolean":
                    cls = Boolean.TYPE;
                    break;
                case "float":
                    cls = Float.TYPE;
                    break;
                case "short":
                    cls = Short.TYPE;
                    break;
                default:
                    cls = Class.forName(str);
                    break;
            }
            arrayList.add(cls);
        }
        Class[] clsArr = new Class[arrayList.size()];
        arrayList.toArray(clsArr);
        return clsArr;
    }

    private static String[] l1111l111111Il(Throwable th2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            th2.printStackTrace(new PrintStream(byteArrayOutputStream));
            return byteArrayOutputStream.toString().split("\n");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean l111l11111I1l() {
        try {
            return l1111l111111Il("XposedBridge.jar");
        } catch (Exception unused) {
            return false;
        }
    }

    public static Set<Object> l111l11111Il() {
        HashSet hashSet = new HashSet();
        try {
            Class<?> clsLoadClass = ClassLoader.getSystemClassLoader().loadClass("de.robv.android.xposed.XposedHelpers");
            l1111l111111Il(clsLoadClass, "fieldCache", hashSet);
            l1111l111111Il(clsLoadClass, "methodCache", hashSet);
            l1111l111111Il(clsLoadClass, "constructorCache", hashSet);
        } catch (Throwable unused) {
        }
        return hashSet;
    }

    public static List<String> l111l11111lIl() {
        InputMethodManager inputMethodManager;
        List<InputMethodInfo> inputMethodList;
        ArrayList arrayList = new ArrayList();
        try {
            Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
            if (context == null || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null || (inputMethodList = inputMethodManager.getInputMethodList()) == null) {
                return arrayList;
            }
            Iterator<InputMethodInfo> it = inputMethodList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toString());
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static Map<String, Object> l111l1111l1Il() {
        boolean z10;
        Field field;
        Class<?> clsLoadClass;
        Method declaredMethod;
        HashMap map = new HashMap();
        try {
            Field[] declaredFields = ClassLoader.getSystemClassLoader().loadClass("de.robv.android.xposed.XposedBridge").getDeclaredFields();
            int length = declaredFields.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = false;
                    field = null;
                    break;
                }
                field = declaredFields[i10];
                if ("sHookedMethodCallbacks".equals(field.getName())) {
                    z10 = false;
                    break;
                }
                if ("hookedMethodCallbacks".equals(field.getName())) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (field == null) {
                return map;
            }
            field.setAccessible(true);
            Map map2 = (Map) field.get(null);
            if (z10) {
                clsLoadClass = null;
                declaredMethod = null;
            } else {
                clsLoadClass = ClassLoader.getSystemClassLoader().loadClass("de.robv.android.xposed.XposedBridge$CopyOnWriteSortedSet");
                declaredMethod = clsLoadClass.getDeclaredMethod("getSnapshot", new Class[0]);
                declaredMethod.setAccessible(true);
            }
            for (Object obj : map2.entrySet()) {
                String string = ((Map.Entry) obj).getKey().toString();
                Set hashSet = (Set) map.get(string);
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(string, hashSet);
                }
                Object value = ((Map.Entry) obj).getValue();
                Object[] array = (clsLoadClass == null || !clsLoadClass.isInstance(value)) ? TreeSet.class.isInstance(value) ? ((TreeSet) value).toArray() : null : (Object[]) declaredMethod.invoke(value, new Object[0]);
                if (array != null) {
                    for (Object obj2 : array) {
                        hashSet.add(obj2.getClass().getName());
                    }
                }
            }
        } catch (Exception unused) {
        }
        return map;
    }

    public static String l111l1111lI1l() {
        Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
        if (context == null) {
            return "";
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[7];
        objArr[0] = Integer.valueOf(l1111l111111Il(context.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0));
        objArr[1] = Integer.valueOf(l1111l111111Il(context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0));
        objArr[2] = Integer.valueOf(l1111l111111Il(context.checkSelfPermission("android.permission.WRITE_SETTINGS") == 0));
        objArr[3] = Integer.valueOf(l1111l111111Il(context.checkSelfPermission("android.permission.ACCESS_WIFI_STATE") == 0));
        objArr[4] = Integer.valueOf(l1111l111111Il(context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0));
        objArr[5] = Integer.valueOf(l1111l111111Il(context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0));
        objArr[6] = Integer.valueOf(l1111l111111Il(context.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0));
        return String.format(locale, "%d%d%d%d%d%d%d", objArr);
    }

    public static String l111l1111lIl() {
        StringBuilder sb2 = new StringBuilder();
        try {
            Method method = Class.forName("android.os.ServiceManager").getMethod("getService", String.class);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, "location");
            Object objInvoke2 = method.invoke(null, a.f118921e);
            sb2.append("locateServiceName:");
            sb2.append(objInvoke.getClass().getName());
            sb2.append("|");
            sb2.append("phoneServiceName:");
            sb2.append(objInvoke2.getClass().getName());
        } catch (Throwable unused) {
        }
        return sb2.toString();
    }

    public static Map<String, Object> l111l1111llIl() {
        HashMap map = new HashMap();
        try {
            Object objInvoke = Class.forName("android.content.Context").getDeclaredMethod("getSystemService", String.class).invoke(com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il, "accessibility");
            Method declaredMethod = objInvoke.getClass().getDeclaredMethod("isEnabled", new Class[0]);
            Method declaredMethod2 = objInvoke.getClass().getDeclaredMethod("getEnabledAccessibilityServiceList", Integer.TYPE);
            Object objInvoke2 = declaredMethod.invoke(objInvoke, new Object[0]);
            List list = (List) declaredMethod2.invoke(objInvoke, -1);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Object objInvoke3 = obj.getClass().getDeclaredMethod("getId", new Class[0]).invoke(obj, new Object[0]);
                if (objInvoke3 == null) {
                    Object objInvoke4 = obj.getClass().getDeclaredMethod("getResolveInfo", new Class[0]).invoke(obj, new Object[0]);
                    arrayList.add(objInvoke4 == null ? obj.toString() : objInvoke4.toString());
                } else {
                    arrayList.add((String) objInvoke3);
                }
            }
            map.put("enable", ((Boolean) objInvoke2).booleanValue() ? "1" : "0");
            map.put("service", arrayList);
            map.put("suc", "1");
        } catch (Throwable th2) {
            map.put("e", th2.getMessage());
            map.put("suc", "-1");
        }
        return map;
    }

    public static String l11l1111I11l() {
        ArrayList arrayList = new ArrayList();
        try {
            Field declaredField = Class.forName("de.robv.android.xposed.XposedInit").getDeclaredField("loadedModules");
            declaredField.setAccessible(true);
            Iterator it = ((ArraySet) declaredField.get(null)).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toString());
            }
        } catch (Throwable unused) {
        }
        return TextUtils.join("|", arrayList);
    }

    public static String l11l1111I1l() {
        if (Build.VERSION.SDK_INT >= 28) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        try {
            Class<?> cls = Class.forName("android.app.ApplicationLoaders");
            Field declaredField = cls.getDeclaredField("gApplicationLoaders");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Field declaredField2 = cls.getDeclaredField("mLoaders");
            declaredField2.setAccessible(true);
            for (Map.Entry entry : ((Map) declaredField2.get(obj)).entrySet()) {
                String str = (String) entry.getKey();
                try {
                    Class.forName("com.elderdrivers.riru.edxp.config.EdXpConfigGlobal", false, (ClassLoader) entry.getValue());
                    arrayList.add(str);
                } catch (ClassNotFoundException unused) {
                }
            }
        } catch (Throwable unused2) {
        }
        return TextUtils.join("|", arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007a A[Catch: Exception -> 0x00c6, TRY_LEAVE, TryCatch #4 {Exception -> 0x00c6, blocks: (B:31:0x0066, B:32:0x0074, B:34:0x007a), top: B:61:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x009f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2 A[Catch: Exception -> 0x0074, TryCatch #7 {Exception -> 0x0074, blocks: (B:36:0x0082, B:39:0x008b, B:41:0x0099, B:45:0x00aa, B:44:0x00a2), top: B:65:0x0082 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0074 A[SYNTHETIC] */
    public static List<String> l11l1111I1ll() throws Throwable {
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Object obj;
        Object obj2;
        Object obj3;
        String string;
        ArrayList arrayList = new ArrayList();
        HashSet<String> hashSet = new HashSet();
        Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
        if (context == null) {
            return arrayList;
        }
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/proc/self/maps"));
                while (true) {
                    try {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            try {
                                int iIndexOf = line.indexOf("/data/app/");
                                if (iIndexOf != -1) {
                                    int iIndexOf2 = line.indexOf(Constants.ACCEPT_TIME_SEPARATOR_SERVER, iIndexOf);
                                    if (iIndexOf2 == -1) {
                                        iIndexOf2 = line.indexOf("/", iIndexOf + 10);
                                    }
                                    String strSubstring = line.substring(iIndexOf + 10, iIndexOf2);
                                    if (!strSubstring.equals(context.getPackageName())) {
                                        hashSet.add(strSubstring);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (Exception unused3) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        packageManager = context.getPackageManager();
                        for (String str : hashSet) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo(str, 128);
                                bundle = applicationInfo.metaData;
                                if (bundle == null) {
                                    obj = bundle.get("xposedmodule");
                                    obj2 = bundle.get("xposedminversion");
                                    obj3 = bundle.get("xposeddescription");
                                    if (obj == null) {
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            string = "";
                                        } else {
                                            string = applicationInfo.loadLabel(packageManager).toString();
                                        }
                                        arrayList.add(TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, new Object[]{str, string, obj, obj2, obj3}));
                                    }
                                }
                            } catch (Exception unused4) {
                            }
                        }
                        return arrayList;
                    }
                }
                bufferedReader2.close();
            } catch (IOException unused5) {
            }
        } catch (Exception unused6) {
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            packageManager = context.getPackageManager();
            while (r1.hasNext()) {
                applicationInfo = packageManager.getApplicationInfo(str, 128);
                bundle = applicationInfo.metaData;
                if (bundle == null) {
                    obj = bundle.get("xposedmodule");
                    obj2 = bundle.get("xposedminversion");
                    obj3 = bundle.get("xposeddescription");
                    if (obj == null) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            string = "";
                        } else {
                            string = applicationInfo.loadLabel(packageManager).toString();
                        }
                        arrayList.add(TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, new Object[]{str, string, obj, obj2, obj3}));
                    }
                }
            }
        } catch (Exception unused7) {
        }
        return arrayList;
    }

    public static int l11l1111Il() {
        Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
        if (context == null) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getFilesDir());
        sb2.append(File.separator);
        sb2.append("exp_base.apk");
        return new File(sb2.toString()).exists() ? 1 : 0;
    }

    public static List<String> l11l1111Il1l() {
        boolean z10;
        String[] strArr = {"java.lang.Throwable", "at com.ishumei", "at android.view.View", "at android.os.Handler", "at android.os.Looper", "at android.app.ActivityThread", "at java.lang.reflect.Method", "at com.android.internal.os"};
        String[] strArrL1111l111111Il = l1111l111111Il(new Throwable());
        ArrayList arrayList = new ArrayList();
        if (strArrL1111l111111Il == null) {
            return arrayList;
        }
        for (String str : strArrL1111l111111Il) {
            int i10 = 0;
            while (true) {
                if (i10 >= 8) {
                    z10 = false;
                    break;
                }
                if (str.trim().startsWith(strArr[i10])) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (!z10) {
                arrayList.add(str.trim());
            }
        }
        return arrayList;
    }

    public static List<String> l11l1111Ill() {
        String line;
        try {
            ArrayList arrayList = new ArrayList();
            Process processExec = Runtime.getRuntime().exec(new String[]{"sh", "-c", "set"});
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            while (true) {
                line = bufferedReader.readLine();
                if (TextUtils.isEmpty(line)) {
                    break;
                }
                if (line.contains("V_SO_PATH") || line.contains("V_SO_PATH") || line.contains("V_REPLACE") || line.contains("VMOS_ROOT_DIR")) {
                    arrayList.add(line);
                }
            }
            for (String line2 = new BufferedReader(new InputStreamReader(processExec.getErrorStream())).readLine(); !TextUtils.isEmpty(line2); line2 = bufferedReader.readLine()) {
                if (line2.contains("libva.so")) {
                    arrayList.add(line);
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String l11l1111lIIl() {
        ArrayList arrayList = new ArrayList();
        try {
            Field declaredField = Class.forName("de.robv.android.xposed.XposedInit").getDeclaredField("loadedPackagesInProcess");
            declaredField.setAccessible(true);
            arrayList.addAll((Set) declaredField.get(null));
        } catch (Throwable unused) {
        }
        return TextUtils.join("|", arrayList);
    }

    public static boolean l11l111l11Il() {
        try {
            Class.forName("de.robv.android.xposed.XposedHelpers");
        } catch (Throwable th2) {
            String[] strArrL1111l111111Il = l1111l111111Il(th2);
            if (strArrL1111l111111Il != null) {
                for (String str : strArrL1111l111111Il) {
                    if (str.contains("de.robvf.android.xposed.XposedHelpers")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static String l11l111l1lll() {
        try {
            return new String(com.ishumei.smantifraud.l111l1111llIl.l111l1111lI1l.l1111l111111Il(Base64.decode(l1111l111111Il, 0)));
        } catch (Exception unused) {
            return "";
        }
    }

    public static Map<String, Object> l11l11IlIIll() {
        Location location = new Location("gps");
        if (location.getLongitude() < 1.0E-4d || location.getLatitude() < 1.0E-4d) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("location", location.toString());
        map.put("lo", Double.valueOf(location.getLongitude()));
        map.put("la", Double.valueOf(location.getLatitude()));
        return map;
    }
}
