package a4;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.p0;
import com.airbnb.lottie.model.h;
import com.airbnb.lottie.utils.f;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: FontAssetManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AssetManager f1169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.c f1170e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h<String> f1166a = new h<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<h<String>, Typeface> f1167b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Typeface> f1168c = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f1171f = ".ttf";

    public a(Drawable.Callback callback, @p0 com.airbnb.lottie.c cVar) {
        this.f1170e = cVar;
        if (callback instanceof View) {
            this.f1169d = ((View) callback).getContext().getAssets();
        } else {
            f.e("LottieDrawable must be inside of a view for images to work.");
            this.f1169d = null;
        }
    }

    private Typeface a(String str) {
        String strB;
        Typeface typeface = this.f1168c.get(str);
        if (typeface != null) {
            return typeface;
        }
        com.airbnb.lottie.c cVar = this.f1170e;
        Typeface typefaceA = cVar != null ? cVar.a(str) : null;
        com.airbnb.lottie.c cVar2 = this.f1170e;
        if (cVar2 != null && typefaceA == null && (strB = cVar2.b(str)) != null) {
            typefaceA = Typeface.createFromAsset(this.f1169d, strB);
        }
        if (typefaceA == null) {
            typefaceA = Typeface.createFromAsset(this.f1169d, "fonts/" + str + this.f1171f);
        }
        this.f1168c.put(str, typefaceA);
        return typefaceA;
    }

    private Typeface e(Typeface typeface, String str) {
        int i10;
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        if (zContains && zContains2) {
            i10 = 3;
        } else if (zContains) {
            i10 = 2;
        } else {
            i10 = zContains2 ? 1 : 0;
        }
        return typeface.getStyle() == i10 ? typeface : Typeface.create(typeface, i10);
    }

    public Typeface b(String str, String str2) {
        this.f1166a.b(str, str2);
        Typeface typeface = this.f1167b.get(this.f1166a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceE = e(a(str), str2);
        this.f1167b.put(this.f1166a, typefaceE);
        return typefaceE;
    }

    public void c(String str) {
        this.f1171f = str;
    }

    public void d(@p0 com.airbnb.lottie.c cVar) {
        this.f1170e = cVar;
    }
}
