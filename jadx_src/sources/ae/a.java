package ae;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GradientSpan.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class a extends CharacterStyle implements UpdateAppearance {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f1260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private final CharSequence f1261e;

    public a(int i10, int i11, float f10, @e CharSequence charSequence) {
        this.f1258b = i10;
        this.f1259c = i11;
        this.f1260d = f10;
        this.f1261e = charSequence;
    }

    @e
    public final CharSequence a() {
        return this.f1261e;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@d TextPaint tp) {
        if (PatchProxy.proxy(new Object[]{tp}, this, changeQuickRedirect, false, c.k.gy, new Class[]{TextPaint.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tp, "tp");
        float f10 = this.f1260d;
        tp.setShader(new LinearGradient(f10, 0.0f, f10 + tp.measureText(String.valueOf(this.f1261e)), 0.0f, this.f1258b, this.f1259c, Shader.TileMode.CLAMP));
    }
}
