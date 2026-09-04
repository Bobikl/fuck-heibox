package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.d0;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.v;
import androidx.annotation.w0;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    @j1
    static final String A = "obj";

    @j1
    static final String B = "int1";

    @j1
    static final String C = "int2";

    @j1
    static final String D = "tint_list";

    @j1
    static final String E = "tint_mode";

    @j1
    static final String F = "string1";
    static final PorterDuff.Mode G = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f20648k = "IconCompat";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f20649l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f20650m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f20651n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f20652o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f20653p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f20654q = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f20655r = 6;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final float f20656s = 0.25f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f20657t = 0.6666667f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final float f20658u = 0.9166667f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final float f20659v = 0.010416667f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final float f20660w = 0.020833334f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f20661x = 61;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f20662y = 30;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @j1
    static final String f20663z = "type";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int f20664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f20665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @p0
    public byte[] f20666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @p0
    public Parcelable f20667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f20668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f20669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @p0
    public ColorStateList f20670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f20671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @p0
    public String f20672i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @p0
    public String f20673j;

    @w0(23)
    public static class a {
        private a() {
        }

        @p0
        static IconCompat a(@n0 Context context, @n0 Icon icon) {
            int iE = e(icon);
            if (iE == 2) {
                String strD = d(icon);
                try {
                    return IconCompat.w(IconCompat.A(context, strD), strD, c(icon));
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            }
            if (iE == 4) {
                return IconCompat.s(f(icon));
            }
            if (iE == 6) {
                return IconCompat.p(f(icon));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f20665b = icon;
            return iconCompat;
        }

        static IconCompat b(@n0 Object obj) {
            androidx.core.util.o.l(obj);
            int iE = e(obj);
            if (iE == 2) {
                return IconCompat.w(null, d(obj), c(obj));
            }
            if (iE == 4) {
                return IconCompat.s(f(obj));
            }
            if (iE == 6) {
                return IconCompat.p(f(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f20665b = obj;
            return iconCompat;
        }

        @d0
        @v
        static int c(@n0 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e(IconCompat.f20648k, "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e(IconCompat.f20648k, "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e(IconCompat.f20648k, "Unable to get icon resource", e12);
                return 0;
            }
        }

        @p0
        static String d(@n0 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e(IconCompat.f20648k, "Unable to get icon package", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e(IconCompat.f20648k, "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e(IconCompat.f20648k, "Unable to get icon package", e12);
                return null;
            }
        }

        static int e(@n0 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e(IconCompat.f20648k, "Unable to get icon type " + obj, e10);
                return -1;
            } catch (NoSuchMethodException e11) {
                Log.e(IconCompat.f20648k, "Unable to get icon type " + obj, e11);
                return -1;
            } catch (InvocationTargetException e12) {
                Log.e(IconCompat.f20648k, "Unable to get icon type " + obj, e12);
                return -1;
            }
        }

        @u
        @p0
        static Uri f(@n0 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e(IconCompat.f20648k, "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e(IconCompat.f20648k, "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e(IconCompat.f20648k, "Unable to get icon uri", e12);
                return null;
            }
        }

        @u
        static Drawable g(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        @u
        static Icon h(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f20664a) {
                case -1:
                    return (Icon) iconCompat.f20665b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f20665b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.z(), iconCompat.f20668e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f20665b, iconCompat.f20668e, iconCompat.f20669f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f20665b);
                    break;
                case 5:
                    iconCreateWithBitmap = Build.VERSION.SDK_INT < 26 ? Icon.createWithBitmap(IconCompat.n((Bitmap) iconCompat.f20665b, false)) : b.b((Bitmap) iconCompat.f20665b);
                    break;
                case 6:
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        iconCreateWithBitmap = d.a(iconCompat.C());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.C());
                        }
                        InputStream inputStreamD = iconCompat.D(context);
                        if (inputStreamD == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.C());
                        }
                        if (i10 < 26) {
                            iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.n(BitmapFactory.decodeStream(inputStreamD), false));
                        } else {
                            iconCreateWithBitmap = b.b(BitmapFactory.decodeStream(inputStreamD));
                        }
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.f20670g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f20671h;
            if (mode != IconCompat.G) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    @w0(26)
    public static class b {
        private b() {
        }

        @u
        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        @u
        static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    @w0(28)
    public static class c {
        private c() {
        }

        @u
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        @u
        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        @u
        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        @u
        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    @w0(30)
    public static class d {
        private d() {
        }

        @u
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface e {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public IconCompat() {
        this.f20664a = -1;
        this.f20666c = null;
        this.f20667d = null;
        this.f20668e = 0;
        this.f20669f = 0;
        this.f20670g = null;
        this.f20671h = G;
        this.f20672i = null;
    }

    IconCompat(int i10) {
        this.f20666c = null;
        this.f20667d = null;
        this.f20668e = 0;
        this.f20669f = 0;
        this.f20670g = null;
        this.f20671h = G;
        this.f20672i = null;
        this.f20664a = i10;
    }

    static Resources A(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e(f20648k, String.format("Unable to find pkg=%s for icon", str), e10);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private Drawable F(Context context) {
        switch (this.f20664a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f20665b);
            case 2:
                String strZ = z();
                if (TextUtils.isEmpty(strZ)) {
                    strZ = context.getPackageName();
                }
                try {
                    return androidx.core.content.res.i.g(A(context, strZ), this.f20668e, context.getTheme());
                } catch (RuntimeException e10) {
                    Log.e(f20648k, String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.f20668e), this.f20665b), e10);
                }
                break;
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f20665b, this.f20668e, this.f20669f));
            case 4:
                InputStream inputStreamD = D(context);
                if (inputStreamD != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(inputStreamD));
                }
                return null;
            case 5:
                return new BitmapDrawable(context.getResources(), n((Bitmap) this.f20665b, false));
            case 6:
                InputStream inputStreamD2 = D(context);
                if (inputStreamD2 != null) {
                    return Build.VERSION.SDK_INT >= 26 ? b.a(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(inputStreamD2))) : new BitmapDrawable(context.getResources(), n(BitmapFactory.decodeStream(inputStreamD2), false));
                }
                return null;
            default:
                return null;
        }
    }

    private static String M(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    @p0
    public static IconCompat e(@n0 Bundle bundle) {
        int i10 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i10);
        iconCompat.f20668e = bundle.getInt(B);
        iconCompat.f20669f = bundle.getInt(C);
        iconCompat.f20673j = bundle.getString(F);
        if (bundle.containsKey(D)) {
            iconCompat.f20670g = (ColorStateList) bundle.getParcelable(D);
        }
        if (bundle.containsKey(E)) {
            iconCompat.f20671h = PorterDuff.Mode.valueOf(bundle.getString(E));
        }
        switch (i10) {
            case -1:
            case 1:
            case 5:
                iconCompat.f20665b = bundle.getParcelable(A);
                return iconCompat;
            case 0:
            default:
                Log.w(f20648k, "Unknown type " + i10);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f20665b = bundle.getString(A);
                return iconCompat;
            case 3:
                iconCompat.f20665b = bundle.getByteArray(A);
                return iconCompat;
        }
    }

    @w0(23)
    @p0
    public static IconCompat f(@n0 Context context, @n0 Icon icon) {
        androidx.core.util.o.l(icon);
        return a.a(context, icon);
    }

    @w0(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @p0
    public static IconCompat g(@n0 Icon icon) {
        return a.b(icon);
    }

    @w0(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @p0
    public static IconCompat h(@n0 Icon icon) {
        if (a.e(icon) == 2 && a.c(icon) == 0) {
            return null;
        }
        return a.b(icon);
    }

    @j1
    static Bitmap n(Bitmap bitmap, boolean z10) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * f20657t);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f10 = iMin;
        float f11 = 0.5f * f10;
        float f12 = f20658u * f11;
        if (z10) {
            float f13 = f20659v * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * f20660w, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(androidx.core.view.j1.f21601t);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    @n0
    public static IconCompat o(@n0 Bitmap bitmap) {
        androidx.core.util.j.d(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f20665b = bitmap;
        return iconCompat;
    }

    @n0
    public static IconCompat p(@n0 Uri uri) {
        androidx.core.util.j.d(uri);
        return q(uri.toString());
    }

    @n0
    public static IconCompat q(@n0 String str) {
        androidx.core.util.j.d(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f20665b = str;
        return iconCompat;
    }

    @n0
    public static IconCompat r(@n0 Bitmap bitmap) {
        androidx.core.util.j.d(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f20665b = bitmap;
        return iconCompat;
    }

    @n0
    public static IconCompat s(@n0 Uri uri) {
        androidx.core.util.j.d(uri);
        return t(uri.toString());
    }

    @n0
    public static IconCompat t(@n0 String str) {
        androidx.core.util.j.d(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f20665b = str;
        return iconCompat;
    }

    @n0
    public static IconCompat u(@n0 byte[] bArr, int i10, int i11) {
        androidx.core.util.j.d(bArr);
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.f20665b = bArr;
        iconCompat.f20668e = i10;
        iconCompat.f20669f = i11;
        return iconCompat;
    }

    @n0
    public static IconCompat v(@n0 Context context, @v int i10) {
        androidx.core.util.j.d(context);
        return w(context.getResources(), context.getPackageName(), i10);
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static IconCompat w(@p0 Resources resources, @n0 String str, @v int i10) {
        androidx.core.util.j.d(str);
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f20668e = i10;
        if (resources != null) {
            try {
                iconCompat.f20665b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f20665b = str;
        }
        iconCompat.f20673j = str;
        return iconCompat;
    }

    public int B() {
        int i10 = this.f20664a;
        return i10 == -1 ? a.e(this.f20665b) : i10;
    }

    @n0
    public Uri C() {
        int i10 = this.f20664a;
        if (i10 == -1) {
            return a.f(this.f20665b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f20665b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @p0
    public InputStream D(@n0 Context context) {
        Uri uriC = C();
        String scheme = uriC.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriC);
            } catch (Exception e10) {
                Log.w(f20648k, "Unable to load image from URI: " + uriC, e10);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f20665b));
        } catch (FileNotFoundException e11) {
            Log.w(f20648k, "Unable to load image from path: " + uriC, e11);
            return null;
        }
    }

    @p0
    public Drawable E(@n0 Context context) {
        d(context);
        return a.g(L(context), context);
    }

    @n0
    public IconCompat G(@androidx.annotation.l int i10) {
        return H(ColorStateList.valueOf(i10));
    }

    @n0
    public IconCompat H(@p0 ColorStateList colorStateList) {
        this.f20670g = colorStateList;
        return this;
    }

    @n0
    public IconCompat I(@p0 PorterDuff.Mode mode) {
        this.f20671h = mode;
        return this;
    }

    @n0
    public Bundle J() {
        Bundle bundle = new Bundle();
        switch (this.f20664a) {
            case -1:
                bundle.putParcelable(A, (Parcelable) this.f20665b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable(A, (Bitmap) this.f20665b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString(A, (String) this.f20665b);
                break;
            case 3:
                bundle.putByteArray(A, (byte[]) this.f20665b);
                break;
        }
        bundle.putInt("type", this.f20664a);
        bundle.putInt(B, this.f20668e);
        bundle.putInt(C, this.f20669f);
        bundle.putString(F, this.f20673j);
        ColorStateList colorStateList = this.f20670g;
        if (colorStateList != null) {
            bundle.putParcelable(D, colorStateList);
        }
        PorterDuff.Mode mode = this.f20671h;
        if (mode != G) {
            bundle.putString(E, mode.name());
        }
        return bundle;
    }

    @n0
    @w0(23)
    @Deprecated
    public Icon K() {
        return L(null);
    }

    @n0
    @w0(23)
    public Icon L(@p0 Context context) {
        return a.h(this, context);
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void a() {
        this.f20671h = PorterDuff.Mode.valueOf(this.f20672i);
        switch (this.f20664a) {
            case -1:
                Parcelable parcelable = this.f20667d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f20665b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f20667d;
                if (parcelable2 != null) {
                    this.f20665b = parcelable2;
                    return;
                }
                byte[] bArr = this.f20666c;
                this.f20665b = bArr;
                this.f20664a = 3;
                this.f20668e = 0;
                this.f20669f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f20666c, Charset.forName("UTF-16"));
                this.f20665b = str;
                if (this.f20664a == 2 && this.f20673j == null) {
                    this.f20673j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f20665b = this.f20666c;
                return;
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void b(boolean z10) {
        this.f20672i = this.f20671h.name();
        switch (this.f20664a) {
            case -1:
                if (z10) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f20667d = (Parcelable) this.f20665b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z10) {
                    this.f20667d = (Parcelable) this.f20665b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f20665b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f20666c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f20666c = ((String) this.f20665b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f20666c = (byte[]) this.f20665b;
                return;
            case 4:
            case 6:
                this.f20666c = this.f20665b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void c(@n0 Intent intent, @p0 Drawable drawable, @n0 Context context) {
        Bitmap bitmapCopy;
        d(context);
        int i10 = this.f20664a;
        if (i10 == 1) {
            bitmapCopy = (Bitmap) this.f20665b;
            if (drawable != null) {
                bitmapCopy = bitmapCopy.copy(bitmapCopy.getConfig(), true);
            }
        } else if (i10 == 2) {
            try {
                Context contextCreatePackageContext = context.createPackageContext(z(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(contextCreatePackageContext, this.f20668e));
                    return;
                }
                Drawable drawableI = androidx.core.content.d.i(contextCreatePackageContext, this.f20668e);
                if (drawableI.getIntrinsicWidth() <= 0 || drawableI.getIntrinsicHeight() <= 0) {
                    int launcherLargeIconSize = ((ActivityManager) contextCreatePackageContext.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY)).getLauncherLargeIconSize();
                    bitmapCopy = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                } else {
                    bitmapCopy = Bitmap.createBitmap(drawableI.getIntrinsicWidth(), drawableI.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                }
                drawableI.setBounds(0, 0, bitmapCopy.getWidth(), bitmapCopy.getHeight());
                drawableI.draw(new Canvas(bitmapCopy));
            } catch (PackageManager.NameNotFoundException e10) {
                throw new IllegalArgumentException("Can't find package " + this.f20665b, e10);
            }
        } else {
            if (i10 != 5) {
                throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
            }
            bitmapCopy = n((Bitmap) this.f20665b, true);
        }
        if (drawable != null) {
            int width = bitmapCopy.getWidth();
            int height = bitmapCopy.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmapCopy));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmapCopy);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void d(@n0 Context context) {
        Object obj;
        if (this.f20664a != 2 || (obj = this.f20665b) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(":")) {
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                Log.i(f20648k, "Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            String strZ = z();
            int identifier = A(context, strZ).getIdentifier(str4, str3, str5);
            if (this.f20668e != identifier) {
                Log.i(f20648k, "Id has changed for " + strZ + " " + str);
                this.f20668e = identifier;
            }
        }
    }

    @n0
    public String toString() {
        if (this.f20664a == -1) {
            return String.valueOf(this.f20665b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(M(this.f20664a));
        switch (this.f20664a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f20665b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f20665b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f20673j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(y())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f20668e);
                if (this.f20669f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f20669f);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f20665b);
                break;
        }
        if (this.f20670g != null) {
            sb2.append(" tint=");
            sb2.append(this.f20670g);
        }
        if (this.f20671h != G) {
            sb2.append(" mode=");
            sb2.append(this.f20671h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @p0
    public Bitmap x() {
        int i10 = this.f20664a;
        if (i10 == -1) {
            Object obj = this.f20665b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i10 == 1) {
            return (Bitmap) this.f20665b;
        }
        if (i10 == 5) {
            return n((Bitmap) this.f20665b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    @v
    public int y() {
        int i10 = this.f20664a;
        if (i10 == -1) {
            return a.c(this.f20665b);
        }
        if (i10 == 2) {
            return this.f20668e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    @n0
    public String z() {
        int i10 = this.f20664a;
        if (i10 == -1) {
            return a.d(this.f20665b);
        }
        if (i10 == 2) {
            String str = this.f20673j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f20665b).split(":", -1)[0] : this.f20673j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }
}
