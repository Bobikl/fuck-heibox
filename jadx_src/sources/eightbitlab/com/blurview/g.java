package eightbitlab.com.blurview;

import android.graphics.Bitmap;
import androidx.annotation.n0;

/* JADX INFO: compiled from: NoOpBlurAlgorithm.java */
/* JADX INFO: loaded from: classes4.dex */
public class g implements b {
    g() {
    }

    @Override // eightbitlab.com.blurview.b
    @n0
    public Bitmap.Config a() {
        return Bitmap.Config.ARGB_8888;
    }

    @Override // eightbitlab.com.blurview.b
    public boolean b() {
        return true;
    }

    @Override // eightbitlab.com.blurview.b
    public float c() {
        return 1.0f;
    }

    @Override // eightbitlab.com.blurview.b
    public Bitmap d(Bitmap bitmap, float f10) {
        return bitmap;
    }

    @Override // eightbitlab.com.blurview.b
    public void destroy() {
    }
}
