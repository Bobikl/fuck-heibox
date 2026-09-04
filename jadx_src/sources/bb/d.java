package bb;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.widget.TextView;
import com.max.hbutils.core.BaseApplication;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: TypefaceManager.java */
/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35185b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f35186c = 1;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f35187d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f35188e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f35189f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f35190g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static d f35191h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SparseArray<Typeface> f35192a = new SparseArray<>();

    /* JADX INFO: compiled from: TypefaceManager.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private d() {
    }

    public static d a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.b.Yq, new Class[0], d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        if (f35191h == null) {
            synchronized (d.class) {
                if (f35191h == null) {
                    f35191h = new d();
                }
            }
        }
        return f35191h;
    }

    public static void c(Paint paint, int i10) {
        Typeface typefaceB;
        if (PatchProxy.proxy(new Object[]{paint, new Integer(i10)}, null, changeQuickRedirect, true, c.b.ar, new Class[]{Paint.class, Integer.TYPE}, Void.TYPE).isSupported || (typefaceB = a().b(i10)) == null || typefaceB == paint.getTypeface()) {
            return;
        }
        paint.setTypeface(typefaceB);
    }

    public static void d(TextView textView, int i10) {
        Typeface typefaceB;
        if (PatchProxy.proxy(new Object[]{textView, new Integer(i10)}, null, changeQuickRedirect, true, c.b.Zq, new Class[]{TextView.class, Integer.TYPE}, Void.TYPE).isSupported || (typefaceB = a().b(i10)) == null || typefaceB == textView.getTypeface()) {
            return;
        }
        textView.setTypeface(typefaceB);
    }

    public Typeface b(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.b.br, new Class[]{Integer.TYPE}, Typeface.class);
        if (patchProxyResultProxy.isSupported) {
            return (Typeface) patchProxyResultProxy.result;
        }
        Typeface typefaceCreateFromAsset = this.f35192a.get(i10);
        if (typefaceCreateFromAsset != null) {
            return typefaceCreateFromAsset;
        }
        String str = null;
        if (i10 == 0) {
            str = "fonts/fontawesome-webfont.ttf";
        } else if (i10 == 1) {
            str = "fonts/impact.ttf";
        } else if (i10 == 2) {
            str = "fonts/Helvetica.ttf";
        } else if (i10 == 3) {
            str = "fonts/ptdin.ttf";
        } else if (i10 == 4) {
            str = "fonts/ALIBABA-LETTER.ttf";
        } else if (i10 == 5) {
            str = "fonts/Helvetica-Bold.ttf";
        }
        try {
            typefaceCreateFromAsset = Typeface.createFromAsset(BaseApplication.a().getAssets(), str);
            this.f35192a.put(i10, typefaceCreateFromAsset);
            return typefaceCreateFromAsset;
        } catch (Exception e10) {
            e10.printStackTrace();
            return typefaceCreateFromAsset;
        }
    }
}
