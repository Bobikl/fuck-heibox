package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.InputStream;

/* JADX INFO: compiled from: RoundedBitmapDrawableFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20693a = "RoundedBitmapDrawableFa";

    /* JADX INFO: compiled from: RoundedBitmapDrawableFactory.java */
    public static class a extends n {
        a(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        @Override // androidx.core.graphics.drawable.n
        void f(int i10, int i11, int i12, Rect rect, Rect rect2) {
            androidx.core.view.n.b(i10, i11, i12, rect, rect2, 0);
        }

        @Override // androidx.core.graphics.drawable.n
        public boolean h() {
            Bitmap bitmap = this.f20680a;
            return bitmap != null && androidx.core.graphics.a.c(bitmap);
        }

        @Override // androidx.core.graphics.drawable.n
        public void o(boolean z10) {
            Bitmap bitmap = this.f20680a;
            if (bitmap != null) {
                androidx.core.graphics.a.d(bitmap, z10);
                invalidateSelf();
            }
        }
    }

    private o() {
    }

    @n0
    public static n a(@n0 Resources resources, @p0 Bitmap bitmap) {
        return new m(resources, bitmap);
    }

    @n0
    public static n b(@n0 Resources resources, @n0 InputStream inputStream) {
        n nVarA = a(resources, BitmapFactory.decodeStream(inputStream));
        if (nVarA.b() == null) {
            Log.w(f20693a, "RoundedBitmapDrawable cannot decode " + inputStream);
        }
        return nVarA;
    }

    @n0
    public static n c(@n0 Resources resources, @n0 String str) {
        n nVarA = a(resources, BitmapFactory.decodeFile(str));
        if (nVarA.b() == null) {
            Log.w(f20693a, "RoundedBitmapDrawable cannot decode " + str);
        }
        return nVarA;
    }
}
