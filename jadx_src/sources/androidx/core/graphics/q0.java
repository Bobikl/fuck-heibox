package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;
import kotlin.b2;

/* JADX INFO: compiled from: Picture.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {
    @dl.d
    public static final Picture a(@dl.d Picture picture, int i10, int i11, @dl.d yh.l<? super Canvas, b2> block) {
        kotlin.jvm.internal.f0.p(picture, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        Canvas canvasBeginRecording = picture.beginRecording(i10, i11);
        kotlin.jvm.internal.f0.o(canvasBeginRecording, "beginRecording(width, height)");
        try {
            block.invoke(canvasBeginRecording);
            return picture;
        } finally {
            kotlin.jvm.internal.c0.d(1);
            picture.endRecording();
            kotlin.jvm.internal.c0.c(1);
        }
    }
}
