package q1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.ui.graphics.c2;
import b1.m;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ShaderBrushSpan.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R-\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Lq1/a;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Landroid/text/TextPaint;", "textPaint", "Lkotlin/b2;", "updateDrawState", "Landroidx/compose/ui/graphics/c2;", "shaderBrush", "Landroidx/compose/ui/graphics/c2;", "b", "()Landroidx/compose/ui/graphics/c2;", "", "alpha", "F", ak.av, "()F", "Lb1/m;", UiKitSpanObj.TYPE_SIZE, "Lb1/m;", ak.aF, "()Lb1/m;", "d", "(Lb1/m;)V", "<init>", "(Landroidx/compose/ui/graphics/c2;F)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class a extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final c2 f138576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f138577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private m f138578d;

    public a(@d c2 shaderBrush, float f10) {
        f0.p(shaderBrush, "shaderBrush");
        this.f138576b = shaderBrush;
        this.f138577c = f10;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getF138577c() {
        return this.f138577c;
    }

    @d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final c2 getF138576b() {
        return this.f138576b;
    }

    @e
    /* JADX INFO: renamed from: c, reason: from getter */
    public final m getF138578d() {
        return this.f138578d;
    }

    public final void d(@e m mVar) {
        this.f138578d = mVar;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@e TextPaint textPaint) {
        if (textPaint != null) {
            m mVar = this.f138578d;
            if (mVar != null) {
                textPaint.setShader(this.f138576b.c(mVar.getF30389a()));
            }
            androidx.compose.ui.text.platform.m.c(textPaint, this.f138577c);
        }
    }
}
