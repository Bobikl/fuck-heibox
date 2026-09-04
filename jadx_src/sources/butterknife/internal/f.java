package butterknife.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.d0;
import androidx.annotation.i1;
import androidx.annotation.q;
import androidx.annotation.v;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TypedValue f35559a = new TypedValue();

    private f() {
        throw new AssertionError("No instances.");
    }

    @SafeVarargs
    public static <T> T[] a(T... tArr) {
        int length = tArr.length;
        int i10 = 0;
        for (T t10 : tArr) {
            if (t10 != null) {
                tArr[i10] = t10;
                i10++;
            }
        }
        return i10 == length ? tArr : (T[]) Arrays.copyOf(tArr, i10);
    }

    public static <T> T b(Object obj, String str, int i10, String str2, int i11, Class<T> cls) {
        try {
            return cls.cast(obj);
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Parameter #" + (i10 + 1) + " of method '" + str + "' was of the wrong type for parameter #" + (i11 + 1) + " of method '" + str2 + "'. See cause for more info.", e10);
        }
    }

    public static <T> T c(View view, @d0 int i10, String str, Class<T> cls) {
        try {
            return cls.cast(view);
        } catch (ClassCastException e10) {
            throw new IllegalStateException("View '" + h(view, i10) + "' with ID " + i10 + " for " + str + " was of the wrong type. See cause for more info.", e10);
        }
    }

    public static <T> T d(View view, @d0 int i10, String str, Class<T> cls) {
        return (T) c(view.findViewById(i10), i10, str, cls);
    }

    public static View e(View view, @d0 int i10, String str) {
        View viewFindViewById = view.findViewById(i10);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalStateException("Required view '" + h(view, i10) + "' with ID " + i10 + " for " + str + " was not found. If this view is optional add '@Nullable' (fields) or '@Optional' (methods) annotation.");
    }

    public static <T> T f(View view, @d0 int i10, String str, Class<T> cls) {
        return (T) c(e(view, i10, str), i10, str, cls);
    }

    @i1
    public static float g(Context context, @q int i10) {
        TypedValue typedValue = f35559a;
        context.getResources().getValue(i10, typedValue, true);
        if (typedValue.type == 4) {
            return typedValue.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i10) + " type #0x" + Integer.toHexString(typedValue.type) + " is not valid");
    }

    private static String h(View view, @d0 int i10) {
        return view.isInEditMode() ? "<unavailable while editing>" : view.getContext().getResources().getResourceEntryName(i10);
    }

    @i1
    public static Drawable i(Context context, @v int i10, @androidx.annotation.f int i11) {
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = f35559a;
        if (theme.resolveAttribute(i11, typedValue, true)) {
            Drawable drawableR = androidx.core.graphics.drawable.d.r(androidx.core.content.d.i(context, i10).mutate());
            androidx.core.graphics.drawable.d.n(drawableR, androidx.core.content.d.f(context, typedValue.resourceId));
            return drawableR;
        }
        throw new Resources.NotFoundException("Required tint color attribute with name " + context.getResources().getResourceEntryName(i11) + " and attribute ID " + i11 + " was not found.");
    }

    @SafeVarargs
    public static <T> List<T> j(T... tArr) {
        return new d(a(tArr));
    }
}
