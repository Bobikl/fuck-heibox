package com.umeng.social.tool;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.core.view.j1;

/* JADX INFO: loaded from: classes4.dex */
public class ComposeTool {
    public static ComposeDirection direction = ComposeDirection.CUSTOM;
    public static int textColor = j1.f21601t;
    public static int textsize = 18;
    public static int backgroundColor = -1;
    public static Typeface typeface = Typeface.DEFAULT;

    public enum ComposeDirection {
        UP,
        DOWN,
        LEFT,
        RIGHT,
        LEFTUP,
        LEFTDOWN,
        RIGHTUP,
        RIGHTDOWN,
        CUSTOM
    }

    public static Bitmap createCompose(Bitmap bitmap, Bitmap bitmap2, boolean z10, int i10) {
        if (bitmap == null || bitmap2 == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int width2 = bitmap2.getWidth();
        int height2 = bitmap2.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(z10 ? Math.max(width, width2) : width2 + width + i10, z10 ? height2 + height + i10 : Math.max(height, height2), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        if (z10) {
            canvas.drawBitmap(bitmap2, 0.0f, height + i10, (Paint) null);
        } else {
            canvas.drawBitmap(bitmap2, width + i10, 0.0f, (Paint) null);
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap createTextImage(String str, Bitmap bitmap, int i10, int i11) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(textColor);
        textPaint.setTextSize(textsize);
        textPaint.setDither(true);
        textPaint.setFilterBitmap(true);
        textPaint.setTypeface(typeface);
        StaticLayout staticLayout = new StaticLayout(str, textPaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        textPaint.getTextBounds(str, 0, str.length(), new Rect());
        Bitmap bitmapCopy = bitmap.copy(config, true);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width + (i10 * 2), height + staticLayout.getHeight() + (i11 * 4), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(backgroundColor);
        float f10 = i10;
        canvas.drawBitmap(bitmapCopy, f10, staticLayout.getHeight() + (i11 * 3), (Paint) null);
        canvas.translate(f10, i11);
        staticLayout.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static Bitmap createWaterMask(Bitmap bitmap, Bitmap bitmap2, int i10, int i11) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int width2 = bitmap2.getWidth();
        int height2 = bitmap2.getHeight();
        int i12 = (width / 2) - (width2 / 2);
        int i13 = (height / 2) - (height2 / 2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        if (direction == ComposeDirection.CUSTOM) {
            canvas.drawBitmap(bitmap2, i10, i11, (Paint) null);
        } else if (direction == ComposeDirection.UP) {
            canvas.drawBitmap(bitmap2, i12, 0.0f, (Paint) null);
        } else if (direction == ComposeDirection.DOWN) {
            canvas.drawBitmap(bitmap2, i12, height - height2, (Paint) null);
        } else if (direction == ComposeDirection.LEFT) {
            canvas.drawBitmap(bitmap2, 0.0f, i13, (Paint) null);
        } else if (direction == ComposeDirection.RIGHT) {
            canvas.drawBitmap(bitmap2, width - width2, i13, (Paint) null);
        } else if (direction == ComposeDirection.LEFTUP) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        } else if (direction == ComposeDirection.LEFTDOWN) {
            canvas.drawBitmap(bitmap2, 0.0f, height - height2, (Paint) null);
        } else if (direction == ComposeDirection.RIGHTUP) {
            canvas.drawBitmap(bitmap2, width - width2, 0.0f, (Paint) null);
        } else if (direction == ComposeDirection.RIGHTDOWN) {
            canvas.drawBitmap(bitmap2, width - width2, height - height2, (Paint) null);
        }
        return bitmapCreateBitmap;
    }
}
