package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: DrawableUtils.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f2736a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f2737b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rect f2738c = new Rect();

    /* JADX INFO: compiled from: DrawableUtils.java */
    @androidx.annotation.w0(18)
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final boolean f2739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Method f2740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Field f2741c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Field f2742d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Field f2743e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Field f2744f;

        /* JADX WARN: Code duplicated, block: B:25:0x004b  */
        /* JADX WARN: Code duplicated, block: B:26:0x0058  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            boolean z10;
            Field field4;
            try {
                Class<?> cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", new Class[0]);
                try {
                    field = cls.getField(com.google.android.exoplayer2.text.ttml.d.f49793l0);
                    try {
                        field2 = cls.getField("top");
                        try {
                            field3 = cls.getField(com.google.android.exoplayer2.text.ttml.d.f49796n0);
                            try {
                                field4 = cls.getField("bottom");
                                z10 = true;
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                                z10 = false;
                                field4 = null;
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                            field3 = null;
                        }
                    } catch (ClassNotFoundException unused3) {
                        field2 = null;
                        field3 = field2;
                        z10 = false;
                        field4 = null;
                        if (z10) {
                            f2740b = method;
                            f2741c = field;
                            f2742d = field2;
                            f2743e = field3;
                            f2744f = field4;
                            f2739a = true;
                            return;
                        }
                        f2740b = null;
                        f2741c = null;
                        f2742d = null;
                        f2743e = null;
                        f2744f = null;
                        f2739a = false;
                    } catch (NoSuchFieldException unused4) {
                        field2 = null;
                        field3 = field2;
                        z10 = false;
                        field4 = null;
                        if (z10) {
                            f2740b = method;
                            f2741c = field;
                            f2742d = field2;
                            f2743e = field3;
                            f2744f = field4;
                            f2739a = true;
                            return;
                        }
                        f2740b = null;
                        f2741c = null;
                        f2742d = null;
                        f2743e = null;
                        f2744f = null;
                        f2739a = false;
                    } catch (NoSuchMethodException unused5) {
                        field2 = null;
                        field3 = field2;
                        z10 = false;
                        field4 = null;
                        if (z10) {
                            f2740b = method;
                            f2741c = field;
                            f2742d = field2;
                            f2743e = field3;
                            f2744f = field4;
                            f2739a = true;
                            return;
                        }
                        f2740b = null;
                        f2741c = null;
                        f2742d = null;
                        f2743e = null;
                        f2744f = null;
                        f2739a = false;
                    }
                } catch (ClassNotFoundException unused6) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    z10 = false;
                    field4 = null;
                    if (z10) {
                        f2740b = method;
                        f2741c = field;
                        f2742d = field2;
                        f2743e = field3;
                        f2744f = field4;
                        f2739a = true;
                        return;
                    }
                    f2740b = null;
                    f2741c = null;
                    f2742d = null;
                    f2743e = null;
                    f2744f = null;
                    f2739a = false;
                } catch (NoSuchFieldException unused7) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    z10 = false;
                    field4 = null;
                    if (z10) {
                        f2740b = method;
                        f2741c = field;
                        f2742d = field2;
                        f2743e = field3;
                        f2744f = field4;
                        f2739a = true;
                        return;
                    }
                    f2740b = null;
                    f2741c = null;
                    f2742d = null;
                    f2743e = null;
                    f2744f = null;
                    f2739a = false;
                } catch (NoSuchMethodException unused8) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    z10 = false;
                    field4 = null;
                    if (z10) {
                        f2740b = method;
                        f2741c = field;
                        f2742d = field2;
                        f2743e = field3;
                        f2744f = field4;
                        f2739a = true;
                        return;
                    }
                    f2740b = null;
                    f2741c = null;
                    f2742d = null;
                    f2743e = null;
                    f2744f = null;
                    f2739a = false;
                }
            } catch (ClassNotFoundException unused9) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused10) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused11) {
                method = null;
                field = null;
            }
            if (z10) {
                f2740b = method;
                f2741c = field;
                f2742d = field2;
                f2743e = field3;
                f2744f = field4;
                f2739a = true;
                return;
            }
            f2740b = null;
            f2741c = null;
            f2742d = null;
            f2743e = null;
            f2744f = null;
            f2739a = false;
        }

        private a() {
        }

        @androidx.annotation.n0
        static Rect a(@androidx.annotation.n0 Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f2739a) {
                try {
                    Object objInvoke = f2740b.invoke(drawable, new Object[0]);
                    if (objInvoke != null) {
                        return new Rect(f2741c.getInt(objInvoke), f2742d.getInt(objInvoke), f2743e.getInt(objInvoke), f2744f.getInt(objInvoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return b0.f2738c;
        }
    }

    /* JADX INFO: compiled from: DrawableUtils.java */
    @androidx.annotation.w0(29)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    private b0() {
    }

    public static boolean a(@androidx.annotation.n0 Drawable drawable) {
        return true;
    }

    static void b(@androidx.annotation.n0 Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || i10 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        c(drawable);
    }

    private static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f2736a);
        } else {
            drawable.setState(f2737b);
        }
        drawable.setState(state);
    }

    @androidx.annotation.n0
    public static Rect d(@androidx.annotation.n0 Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return a.a(androidx.core.graphics.drawable.d.q(drawable));
        }
        Insets insetsA = b.a(drawable);
        return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
    }

    public static PorterDuff.Mode e(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
