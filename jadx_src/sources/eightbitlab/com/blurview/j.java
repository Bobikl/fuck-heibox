package eightbitlab.com.blurview;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.annotation.n0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: RenderScriptBlur.java */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class j implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RenderScript f118719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScriptIntrinsicBlur f118720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Allocation f118721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f118722d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f118723e = -1;

    @w0(api = 17)
    public j(Context context) {
        RenderScript renderScriptCreate = RenderScript.create(context);
        this.f118719a = renderScriptCreate;
        this.f118720b = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
    }

    private boolean e(Bitmap bitmap) {
        return bitmap.getHeight() == this.f118723e && bitmap.getWidth() == this.f118722d;
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
        return 8.0f;
    }

    @Override // eightbitlab.com.blurview.b
    @w0(api = 17)
    public final Bitmap d(Bitmap bitmap, float f10) {
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(this.f118719a, bitmap);
        if (!e(bitmap)) {
            Allocation allocation = this.f118721c;
            if (allocation != null) {
                allocation.destroy();
            }
            this.f118721c = Allocation.createTyped(this.f118719a, allocationCreateFromBitmap.getType());
            this.f118722d = bitmap.getWidth();
            this.f118723e = bitmap.getHeight();
        }
        this.f118720b.setRadius(f10);
        this.f118720b.setInput(allocationCreateFromBitmap);
        this.f118720b.forEach(this.f118721c);
        this.f118721c.copyTo(bitmap);
        allocationCreateFromBitmap.destroy();
        return bitmap;
    }

    @Override // eightbitlab.com.blurview.b
    public final void destroy() {
        this.f118720b.destroy();
        this.f118719a.destroy();
        Allocation allocation = this.f118721c;
        if (allocation != null) {
            allocation.destroy();
        }
    }
}
