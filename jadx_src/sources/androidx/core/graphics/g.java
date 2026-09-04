package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.b2;

/* JADX INFO: compiled from: Canvas.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final void a(@dl.d Canvas canvas, float f10, float f11, float f12, float f13, @dl.d yh.l<? super Canvas, b2> block) {
        kotlin.jvm.internal.f0.p(canvas, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        int iSave = canvas.save();
        canvas.clipRect(f10, f11, f12, f13);
        try {
            block.invoke(canvas);
        } finally {
            kotlin.jvm.internal.c0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.c0.c(1);
        }
    }

    public static final void b(@dl.d Canvas canvas, int i10, int i11, int i12, int i13, @dl.d yh.l<? super Canvas, b2> block) {
        kotlin.jvm.internal.f0.p(canvas, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        int iSave = canvas.save();
        canvas.clipRect(i10, i11, i12, i13);
        try {
            block.invoke(canvas);
        } finally {
            kotlin.jvm.internal.c0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.c0.c(1);
        }
    }

    public static final void c(@dl.d Canvas canvas, @dl.d Path clipPath, @dl.d yh.l<? super Canvas, b2> block) {
        kotlin.jvm.internal.f0.p(canvas, "<this>");
        kotlin.jvm.internal.f0.p(clipPath, "clipPath");
        kotlin.jvm.internal.f0.p(block, "block");
        int iSave = canvas.save();
        canvas.clipPath(clipPath);
        try {
            block.invoke(canvas);
        } finally {
            kotlin.jvm.internal.c0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.c0.c(1);
        }
    }

    public static final void d(@dl.d Canvas canvas, @dl.d Rect clipRect, @dl.d yh.l<? super Canvas, b2> block) {
        kotlin.jvm.internal.f0.p(canvas, "<this>");
        kotlin.jvm.internal.f0.p(clipRect, "clipRect");
        kotlin.jvm.internal.f0.p(block, "block");
        int iSave = canvas.save();
        canvas.clipRect(clipRect);
        try {
            block.invoke(canvas);
        } finally {
            kotlin.jvm.internal.c0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.c0.c(1);
        }
    }

    public static final void e(@dl.d Canvas canvas, @dl.d RectF clipRect, @dl.d yh.l<? super Canvas, b2> block) {
        kotlin.jvm.internal.f0.p(canvas, "<this>");
        kotlin.jvm.internal.f0.p(clipRect, "clipRect");
        kotlin.jvm.internal.f0.p(block, "block");
        int iSave = canvas.save();
        canvas.clipRect(clipRect);
        try {
            block.invoke(canvas);
        } finally {
            kotlin.jvm.internal.c0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.c0.c(1);
        }
    }

    public static final void f(@dl.d Canvas canvas, @dl.d Matrix matrix, @dl.d yh.l<? super Canvas, b2> block) {
        kotlin.jvm.internal.f0.p(canvas, "<this>");
        kotlin.jvm.internal.f0.p(matrix, "matrix");
        kotlin.jvm.internal.f0.p(block, "block");
        int iSave = canvas.save();
        canvas.concat(matrix);
        try {
            block.invoke(canvas);
        } finally {
            kotlin.jvm.internal.c0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.c0.c(1);
        }
    }

    public static /* synthetic */ void g(Canvas canvas, Matrix matrix, yh.l block, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            matrix = new Matrix();
        }
        kotlin.jvm.internal.f0.p(canvas, "<this>");
        kotlin.jvm.internal.f0.p(matrix, "matrix");
        kotlin.jvm.internal.f0.p(block, "block");
        int iSave = canvas.save();
        canvas.concat(matrix);
        try {
            block.invoke(canvas);
        } finally {
            kotlin.jvm.internal.c0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.c0.c(1);
        }
    }

    public static final void h(@dl.d Canvas canvas, float f10, float f11, float f12, @dl.d yh.l<? super Canvas, b2> block) {
        kotlin.jvm.internal.f0.p(canvas, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        int iSave = canvas.save();
        canvas.rotate(f10, f11, f12);
        try {
            block.invoke(canvas);
        } finally {
            kotlin.jvm.internal.c0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.c0.c(1);
        }
    }

    public static /* synthetic */ void i(Canvas canvas, float f10, float f11, float f12, yh.l block, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        kotlin.jvm.internal.f0.p(canvas, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        int iSave = canvas.save();
        canvas.rotate(f10, f11, f12);
        try {
            block.invoke(canvas);
        } finally {
            kotlin.jvm.internal.c0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.c0.c(1);
        }
    }

    public static final void j(@dl.d Canvas canvas, @dl.d yh.l<? super Canvas, b2> block) {
        kotlin.jvm.internal.f0.p(canvas, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        int iSave = canvas.save();
        try {
            block.invoke(canvas);
        } finally {
            kotlin.jvm.internal.c0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.c0.c(1);
        }
    }

    public static final void k(@dl.d Canvas canvas, float f10, float f11, float f12, float f13, @dl.d yh.l<? super Canvas, b2> block) {
        kotlin.jvm.internal.f0.p(canvas, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        int iSave = canvas.save();
        canvas.scale(f10, f11, f12, f13);
        try {
            block.invoke(canvas);
        } finally {
            kotlin.jvm.internal.c0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.c0.c(1);
        }
    }

    public static /* synthetic */ void l(Canvas canvas, float f10, float f11, float f12, float f13, yh.l block, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            f13 = 0.0f;
        }
        kotlin.jvm.internal.f0.p(canvas, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        int iSave = canvas.save();
        canvas.scale(f10, f11, f12, f13);
        try {
            block.invoke(canvas);
        } finally {
            kotlin.jvm.internal.c0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.c0.c(1);
        }
    }

    public static final void m(@dl.d Canvas canvas, float f10, float f11, @dl.d yh.l<? super Canvas, b2> block) {
        kotlin.jvm.internal.f0.p(canvas, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        int iSave = canvas.save();
        canvas.skew(f10, f11);
        try {
            block.invoke(canvas);
        } finally {
            kotlin.jvm.internal.c0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.c0.c(1);
        }
    }

    public static /* synthetic */ void n(Canvas canvas, float f10, float f11, yh.l block, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        kotlin.jvm.internal.f0.p(canvas, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        int iSave = canvas.save();
        canvas.skew(f10, f11);
        try {
            block.invoke(canvas);
        } finally {
            kotlin.jvm.internal.c0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.c0.c(1);
        }
    }

    public static final void o(@dl.d Canvas canvas, float f10, float f11, @dl.d yh.l<? super Canvas, b2> block) {
        kotlin.jvm.internal.f0.p(canvas, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        int iSave = canvas.save();
        canvas.translate(f10, f11);
        try {
            block.invoke(canvas);
        } finally {
            kotlin.jvm.internal.c0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.c0.c(1);
        }
    }

    public static /* synthetic */ void p(Canvas canvas, float f10, float f11, yh.l block, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        kotlin.jvm.internal.f0.p(canvas, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        int iSave = canvas.save();
        canvas.translate(f10, f11);
        try {
            block.invoke(canvas);
        } finally {
            kotlin.jvm.internal.c0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.c0.c(1);
        }
    }
}
