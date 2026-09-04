package i9;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import androidx.annotation.f;
import androidx.annotation.n0;
import androidx.core.graphics.m0;
import androidx.core.view.animation.b;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: compiled from: MotionUtils.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f119326a = "cubic-bezier";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f119327b = "path";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f119328c = "(";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f119329d = ")";

    private a() {
    }

    private static float a(String[] strArr, int i10) {
        float f10 = Float.parseFloat(strArr[i10]);
        if (f10 >= 0.0f && f10 <= 1.0f) {
            return f10;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f10);
    }

    private static String b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static TimeInterpolator c(String str) {
        if (!e(str, f119326a)) {
            if (e(str, "path")) {
                return b.c(m0.e(b(str, "path")));
            }
            throw new IllegalArgumentException("Invalid motion easing type: " + str);
        }
        String[] strArrSplit = b(str, f119326a).split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        if (strArrSplit.length == 4) {
            return b.b(a(strArrSplit, 0), a(strArrSplit, 1), a(strArrSplit, 2), a(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    private static boolean d(String str) {
        return e(str, f119326a) || e(str, "path");
    }

    private static boolean e(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(f119328c);
        return str.startsWith(sb2.toString()) && str.endsWith(f119329d);
    }

    public static int f(@n0 Context context, @f int i10, int i11) {
        return com.google.android.material.resources.b.e(context, i10, i11);
    }

    @n0
    public static TimeInterpolator g(@n0 Context context, @f int i10, @n0 TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        return d(strValueOf) ? c(strValueOf) : AnimationUtils.loadInterpolator(context, typedValue.resourceId);
    }
}
