package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.Constants;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.CharBuffer;

/* JADX INFO: compiled from: Debug.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"LogConditional"})
public class c {
    public static void a(ViewGroup.LayoutParams layoutParams, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + str + "  ";
        System.out.println(" >>>>>>>>>>>>>>>>>>. dump " + str2 + "  " + layoutParams.getClass().getName());
        for (Field field : layoutParams.getClass().getFields()) {
            try {
                Object obj = field.get(layoutParams);
                String name = field.getName();
                if (name.contains("To") && !obj.toString().equals("-1")) {
                    System.out.println(str2 + "       " + name + " " + obj);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        System.out.println(" <<<<<<<<<<<<<<<<< dump " + str2);
    }

    public static void b(ViewGroup viewGroup, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + str + "  ";
        int childCount = viewGroup.getChildCount();
        System.out.println(str + " children " + childCount);
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            System.out.println(str2 + "     " + k(childAt));
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Field[] fields = layoutParams.getClass().getFields();
            for (int i11 = 0; i11 < fields.length; i11++) {
                Field field = fields[i11];
                try {
                    Object obj = field.get(layoutParams);
                    if (field.getName().contains("To") && !obj.toString().equals("-1")) {
                        System.out.println(str2 + "       " + field.getName() + " " + obj);
                    }
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public static void c(Object obj) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
        Class<?> cls = obj.getClass();
        System.out.println(str + "------------- " + cls.getName() + " --------------------");
        for (Field field : cls.getFields()) {
            try {
                Object obj2 = field.get(obj);
                if (field.getName().startsWith("layout_constraint") && ((!(obj2 instanceof Integer) || !obj2.toString().equals("-1")) && ((!(obj2 instanceof Integer) || !obj2.toString().equals("0")) && ((!(obj2 instanceof Float) || !obj2.toString().equals("1.0")) && (!(obj2 instanceof Float) || !obj2.toString().equals("0.5")))))) {
                    System.out.println(str + "    " + field.getName() + " " + obj2);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        System.out.println(str + "------------- " + cls.getSimpleName() + " --------------------");
    }

    public static String d(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        for (Field field : MotionEvent.class.getFields()) {
            try {
                if (Modifier.isStatic(field.getModifiers()) && field.getType().equals(Integer.TYPE) && field.getInt(null) == action) {
                    return field.getName();
                }
            } catch (IllegalAccessException unused) {
            }
        }
        return "---";
    }

    public static String e(int i10) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[i10 + 2];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String f() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String g() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String h() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String i(Context context, int i10) {
        if (i10 == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i10);
        } catch (Exception unused) {
            return "?" + i10;
        }
    }

    public static String j(Context context, int[] iArr) {
        String resourceEntryName;
        try {
            String str = iArr.length + Constants.ARRAY_TYPE;
            int i10 = 0;
            while (i10 < iArr.length) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(i10 == 0 ? "" : " ");
                String string = sb2.toString();
                try {
                    resourceEntryName = context.getResources().getResourceEntryName(iArr[i10]);
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = "? " + iArr[i10] + " ";
                }
                str = string + resourceEntryName;
                i10++;
            }
            return str + "]";
        } catch (Exception e10) {
            Log.v("DEBUG", e10.toString());
            return "UNKNOWN";
        }
    }

    public static String k(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static String l(MotionLayout motionLayout, int i10) {
        return m(motionLayout, i10, -1);
    }

    public static String m(MotionLayout motionLayout, int i10, int i11) {
        int length;
        if (i10 == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = motionLayout.getContext().getResources().getResourceEntryName(i10);
        if (i11 == -1) {
            return resourceEntryName;
        }
        if (resourceEntryName.length() > i11) {
            resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
        }
        if (resourceEntryName.length() <= i11 || (length = resourceEntryName.replaceAll("[^_]", "").length()) <= 0) {
            return resourceEntryName;
        }
        return resourceEntryName.replaceAll(CharBuffer.allocate((resourceEntryName.length() - i11) / length).toString().replace((char) 0, lg.a.f131414g) + lg.a.f131412e, lg.a.f131412e);
    }

    public static void n(String str, String str2, int i10) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(i10, stackTrace.length - 1);
        String str3 = " ";
        for (int i11 = 1; i11 <= iMin; i11++) {
            StackTraceElement stackTraceElement = stackTrace[i11];
            str3 = str3 + " ";
            Log.v(str, str2 + str3 + (".(" + stackTrace[i11].getFileName() + ":" + stackTrace[i11].getLineNumber() + ") " + stackTrace[i11].getMethodName()) + str3);
        }
    }

    public static void o(String str, int i10) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(i10, stackTrace.length - 1);
        String str2 = " ";
        for (int i11 = 1; i11 <= iMin; i11++) {
            StackTraceElement stackTraceElement = stackTrace[i11];
            String str3 = ".(" + stackTrace[i11].getFileName() + ":" + stackTrace[i11].getLineNumber() + ") ";
            str2 = str2 + " ";
            System.out.println(str + str2 + str3 + str2);
        }
    }
}
