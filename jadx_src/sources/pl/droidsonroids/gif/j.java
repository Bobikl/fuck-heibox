package pl.droidsonroids.gif;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.n0;
import androidx.annotation.u0;
import androidx.annotation.v;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: GifViewUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f138372a = "http://schemas.android.com/apk/res/android";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final List<String> f138373b = Arrays.asList("raw", "drawable", "mipmap");

    /* JADX INFO: compiled from: GifViewUtils.java */
    public static class a extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f138374c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f138375d;

        a() {
            this.f138374c = 0;
            this.f138375d = 0;
        }

        a(ImageView imageView, AttributeSet attributeSet, int i10, int i11) {
            super(imageView, attributeSet, i10, i11);
            this.f138374c = a(imageView, attributeSet, true);
            this.f138375d = a(imageView, attributeSet, false);
        }

        private static int a(ImageView imageView, AttributeSet attributeSet, boolean z10) {
            int attributeResourceValue = attributeSet.getAttributeResourceValue(j.f138372a, z10 ? com.max.hbsearch.l.W : UiKitSpanObj.TYPE_BACKGROUND, 0);
            if (attributeResourceValue > 0) {
                if (j.f138373b.contains(imageView.getResources().getResourceTypeName(attributeResourceValue)) && !j.e(imageView, z10, attributeResourceValue)) {
                    return attributeResourceValue;
                }
            }
            return 0;
        }
    }

    /* JADX INFO: compiled from: GifViewUtils.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f138376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f138377b;

        b() {
            this.f138376a = false;
            this.f138377b = -1;
        }

        b(View view, AttributeSet attributeSet, int i10, int i11) {
            TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, R.styleable.f138336b, i10, i11);
            this.f138376a = typedArrayObtainStyledAttributes.getBoolean(R.styleable.GifView_freezesAnimation, false);
            this.f138377b = typedArrayObtainStyledAttributes.getInt(R.styleable.GifView_loopCount, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private j() {
    }

    static void a(int i10, Drawable drawable) {
        if (drawable instanceof d) {
            ((d) drawable).H(i10);
        }
    }

    static float b(@n0 Resources resources, @u0 @v int i10) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.density;
        if (i11 == 0) {
            i11 = 160;
        } else if (i11 == 65535) {
            i11 = 0;
        }
        int i12 = resources.getDisplayMetrics().densityDpi;
        if (i11 <= 0 || i12 <= 0) {
            return 1.0f;
        }
        return i12 / i11;
    }

    static a c(ImageView imageView, AttributeSet attributeSet, int i10, int i11) {
        if (attributeSet == null || imageView.isInEditMode()) {
            return new a();
        }
        a aVar = new a(imageView, attributeSet, i10, i11);
        int i12 = aVar.f138377b;
        if (i12 >= 0) {
            a(i12, imageView.getDrawable());
            a(i12, imageView.getBackground());
        }
        return aVar;
    }

    static boolean d(ImageView imageView, Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            imageView.setImageDrawable(new d(imageView.getContext().getContentResolver(), uri));
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    static boolean e(ImageView imageView, boolean z10, int i10) {
        Resources resources = imageView.getResources();
        if (resources != null) {
            try {
                if (!f138373b.contains(resources.getResourceTypeName(i10))) {
                    return false;
                }
                d dVar = new d(resources, i10);
                if (z10) {
                    imageView.setImageDrawable(dVar);
                    return true;
                }
                imageView.setBackground(dVar);
                return true;
            } catch (Resources.NotFoundException | IOException unused) {
            }
        }
        return false;
    }
}
