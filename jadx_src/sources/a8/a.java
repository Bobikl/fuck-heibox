package a8;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Set;
import z5.g;

/* JADX INFO: compiled from: ObjectToStringUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    private static void a(Bundle bundle, StringBuilder sb2) {
        boolean z10 = true;
        for (String str : bundle.keySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(str);
            sb2.append(n5.a.f132013h);
            Object obj = bundle.get(str);
            if (obj instanceof int[]) {
                sb2.append(Arrays.toString((int[]) obj));
            } else if (obj instanceof byte[]) {
                sb2.append(Arrays.toString((byte[]) obj));
            } else if (obj instanceof boolean[]) {
                sb2.append(Arrays.toString((boolean[]) obj));
            } else if (obj instanceof short[]) {
                sb2.append(Arrays.toString((short[]) obj));
            } else if (obj instanceof long[]) {
                sb2.append(Arrays.toString((long[]) obj));
            } else if (obj instanceof float[]) {
                sb2.append(Arrays.toString((float[]) obj));
            } else if (obj instanceof double[]) {
                sb2.append(Arrays.toString((double[]) obj));
            } else if (obj instanceof String[]) {
                sb2.append(Arrays.toString((String[]) obj));
            } else if (obj instanceof CharSequence[]) {
                sb2.append(Arrays.toString((CharSequence[]) obj));
            } else if (obj instanceof Parcelable[]) {
                sb2.append(Arrays.toString((Parcelable[]) obj));
            } else if (obj instanceof Bundle) {
                sb2.append(b((Bundle) obj));
            } else {
                sb2.append(obj);
            }
            z10 = false;
        }
    }

    public static String b(Bundle bundle) {
        if (bundle == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("Bundle[{");
        a(bundle, sb2);
        sb2.append("}]");
        return sb2.toString();
    }

    private static void c(Intent intent, StringBuilder sb2) {
        boolean z10;
        String action = intent.getAction();
        boolean z11 = true;
        boolean z12 = false;
        if (action != null) {
            sb2.append("act=");
            sb2.append(action);
            z10 = false;
        } else {
            z10 = true;
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            if (!z10) {
                sb2.append(' ');
            }
            sb2.append("cat=[");
            for (String str : categories) {
                if (!z11) {
                    sb2.append(',');
                }
                sb2.append(str);
                z11 = false;
            }
            sb2.append("]");
            z10 = false;
        }
        Uri data = intent.getData();
        if (data != null) {
            if (!z10) {
                sb2.append(' ');
            }
            sb2.append("dat=");
            sb2.append(e(data));
            z10 = false;
        }
        String type = intent.getType();
        if (type != null) {
            if (!z10) {
                sb2.append(' ');
            }
            sb2.append("typ=");
            sb2.append(type);
            z10 = false;
        }
        int flags = intent.getFlags();
        if (flags != 0) {
            if (!z10) {
                sb2.append(' ');
            }
            sb2.append("flg=0x");
            sb2.append(Integer.toHexString(flags));
            z10 = false;
        }
        String str2 = intent.getPackage();
        if (str2 != null) {
            if (!z10) {
                sb2.append(' ');
            }
            sb2.append("pkg=");
            sb2.append(str2);
            z10 = false;
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            if (!z10) {
                sb2.append(' ');
            }
            sb2.append("cmp=");
            sb2.append(component.flattenToShortString());
            z10 = false;
        }
        Rect sourceBounds = intent.getSourceBounds();
        if (sourceBounds != null) {
            if (!z10) {
                sb2.append(' ');
            }
            sb2.append("bnds=");
            sb2.append(sourceBounds.toShortString());
            z10 = false;
        }
        if (intent.getClipData() != null) {
            if (!z10) {
                sb2.append(' ');
            }
            sb2.append("(has clip)");
        } else {
            z12 = z10;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            if (!z12) {
                sb2.append(' ');
            }
            sb2.append("extras={");
            a(extras, sb2);
            sb2.append('}');
        }
        Intent selector = intent.getSelector();
        if (selector != null) {
            sb2.append(" sel=");
            c(selector, sb2);
            sb2.append(g.f141884d);
        }
    }

    public static String d(Intent intent) {
        if (intent == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("Intent { ");
        c(intent, sb2);
        sb2.append(" }");
        return sb2.toString();
    }

    private static String e(Uri uri) {
        try {
            Method declaredMethod = Uri.class.getDeclaredMethod("toSafeString", new Class[0]);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(uri, new Object[0]);
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
            return uri.toString();
        } catch (NoSuchMethodException e11) {
            e11.printStackTrace();
            return uri.toString();
        } catch (InvocationTargetException e12) {
            e12.printStackTrace();
            return uri.toString();
        }
    }
}
