package androidx.core.graphics;

import android.graphics.Matrix;
import android.graphics.Shader;
import kotlin.b2;

/* JADX INFO: compiled from: Shader.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {
    public static final void a(@dl.d Shader shader, @dl.d yh.l<? super Matrix, b2> block) {
        kotlin.jvm.internal.f0.p(shader, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        block.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
