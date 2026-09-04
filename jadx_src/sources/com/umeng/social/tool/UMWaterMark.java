package com.umeng.social.tool;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class UMWaterMark {
    static final int RELATIVE_POSITION_HORIZONTAL_LEFT = 4;
    static final int RELATIVE_POSITION_HORIZONTAL_RIGHT = 3;
    static final int RELATIVE_POSITION_VERTICAL_BOTTOM = 1;
    static final int RELATIVE_POSITION_VERTICAL_TOP = 2;
    private static final String TAG = "UMWaterMark";
    private int mBottomMargin;
    private Context mContext;
    private int mLeftMargin;
    private int mRightMargin;
    private int mTopMargin;
    private float mScale = 0.3f;
    private Rect mAnchorMarkRect = new Rect();
    private int mVerticalRelativePosition = -1;
    private int mHorizontalRelativePosition = -1;
    private int mGravity = 51;
    private boolean mIsTransparent = false;
    private boolean mIsBringToFront = false;
    private float mAlpha = -1.0f;
    private int mDegree = -1;
    private Rect mMeasureRect = new Rect();

    UMWaterMark() {
    }

    private float getDx(int i10) {
        int iDip2px = dip2px(this.mLeftMargin);
        int i11 = -dip2px(this.mRightMargin);
        int i12 = this.mGravity & 7;
        if (i12 != 1) {
            return i12 != 5 ? iDip2px : (i10 - getMarkWidth()) + i11;
        }
        if (iDip2px == 0) {
            iDip2px = i11;
        }
        return (((i10 - getMarkWidth()) * 1.0f) / 2.0f) + iDip2px;
    }

    private float getDy(int i10) {
        int i11 = -dip2px(this.mBottomMargin);
        int iDip2px = dip2px(this.mTopMargin);
        int i12 = this.mGravity & 112;
        if (i12 != 16) {
            return i12 != 80 ? iDip2px : (i10 - getMarkHeight()) + i11;
        }
        if (iDip2px != 0) {
            i11 = iDip2px;
        }
        return (((i10 - getMarkHeight()) * 1.0f) / 2.0f) + i11;
    }

    private int getMarkHeight() {
        if (getMarkBitmap() == null) {
            return -1;
        }
        return getMarkBitmap().getHeight();
    }

    private int getMarkWidth() {
        if (getMarkBitmap() == null) {
            return -1;
        }
        return getMarkBitmap().getWidth();
    }

    private float getRelativeDx(int i10) {
        Rect rect = this.mAnchorMarkRect;
        float f10 = rect.left;
        float f11 = rect.right;
        int i11 = this.mHorizontalRelativePosition;
        if (i11 == 3) {
            return dip2px(this.mLeftMargin) + f11;
        }
        if (i11 != 4) {
            return getDx(i10);
        }
        return (-dip2px(this.mRightMargin)) + (f10 - getMarkWidth());
    }

    private float getRelativeDy(int i10) {
        Rect rect = this.mAnchorMarkRect;
        float f10 = rect.top;
        float f11 = rect.bottom;
        int i11 = this.mVerticalRelativePosition;
        if (i11 == 1) {
            return dip2px(this.mTopMargin) + f11;
        }
        if (i11 != 2) {
            return getDy(i10);
        }
        return (-dip2px(this.mBottomMargin)) + (f10 - getMarkHeight());
    }

    private float getScaleAnchorX(int i10) {
        int i11 = this.mGravity & 7;
        if (i11 == 1) {
            i10 /= 2;
        } else if (i11 != 5) {
            return 0.0f;
        }
        return i10;
    }

    private float getScaleAnchorY(int i10) {
        int i11 = this.mGravity & 112;
        if (i11 == 16) {
            i10 /= 2;
        } else if (i11 != 80) {
            return 0.0f;
        }
        return i10;
    }

    private void safelyRecycleBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                bitmap.recycle();
            } catch (Exception unused) {
            }
        }
    }

    public void bringToFront() {
        this.mIsBringToFront = true;
    }

    void clearRelativePosition() {
        this.mHorizontalRelativePosition = -1;
        this.mVerticalRelativePosition = -1;
    }

    public Bitmap compound(Bitmap bitmap) {
        Bitmap bitmapCreateBitmap;
        Canvas canvas;
        try {
            if (bitmap == null) {
                Log.e(TAG, "scr bitmap is null");
                return null;
            }
            Bitmap markBitmap = getMarkBitmap();
            if (markBitmap == null) {
                Log.e(TAG, "mark bitmap is null");
                return bitmap;
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width <= 0 || height <= 0) {
                Log.e(TAG, "mark bitmap is error, markWidth:" + width + ", markHeight:" + height);
                return bitmap;
            }
            int markWidth = getMarkWidth();
            int markHeight = getMarkHeight();
            if (markWidth > 0 && markHeight > 0) {
                if (this.mIsTransparent) {
                    bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    canvas = new Canvas(bitmapCreateBitmap);
                    canvas.drawColor(0);
                } else {
                    bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
                    canvas = new Canvas(bitmapCreateBitmap);
                }
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                Matrix matrix = new Matrix();
                float fMin = (this.mScale * Math.min(bitmap.getWidth(), bitmap.getHeight())) / Math.max(markWidth, markHeight);
                matrix.postScale(fMin, fMin, getScaleAnchorX(markWidth), getScaleAnchorY(markHeight));
                int i10 = this.mDegree;
                if (i10 != -1) {
                    matrix.postRotate(i10, markWidth / 2, markHeight / 2);
                }
                matrix.postTranslate(isHorizontalRelativePosition() ? getRelativeDx(width) : getDx(width), isVerticalRelativePosition() ? getRelativeDy(height) : getDy(height));
                if (this.mAlpha != -1.0f) {
                    Paint paint = new Paint();
                    paint.setAlpha((int) (this.mAlpha * 255.0f));
                    canvas.drawBitmap(markBitmap, matrix, paint);
                } else {
                    canvas.drawBitmap(markBitmap, matrix, null);
                }
                safelyRecycleBitmap(bitmap);
                safelyRecycleBitmap(markBitmap);
                releaseResource();
                return bitmapCreateBitmap;
            }
            Log.e(TAG, "mark bitmap is error, markWidth:" + markWidth + ", markHeight:" + markHeight);
            return bitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    int dip2px(float f10) {
        return (int) ((f10 * this.mContext.getResources().getDisplayMetrics().density) + 0.5f);
    }

    Bitmap getMarkBitmap() {
        return null;
    }

    boolean isBringToFront() {
        return this.mIsBringToFront;
    }

    boolean isHorizontalRelativePosition() {
        return this.mHorizontalRelativePosition != -1;
    }

    boolean isVerticalRelativePosition() {
        return this.mVerticalRelativePosition != -1;
    }

    Rect onMeasure(int i10, int i11) {
        int dx;
        int markWidth;
        int markHeight;
        int dy = 0;
        if (isHorizontalRelativePosition()) {
            dx = 0;
            markWidth = 0;
        } else {
            dx = (int) getDx(i10);
            markWidth = getMarkWidth() + dx;
        }
        if (isVerticalRelativePosition()) {
            markHeight = 0;
        } else {
            dy = (int) getDy(i11);
            markHeight = getMarkHeight() + dy;
        }
        this.mMeasureRect.set(dx, dy, markWidth, markHeight);
        return this.mMeasureRect;
    }

    void releaseResource() {
    }

    public void setAlpha(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            return;
        }
        this.mAlpha = f10;
    }

    void setAnchorMarkHorizontalRect(Rect rect) {
        Rect rect2 = this.mAnchorMarkRect;
        rect2.set(rect.left, rect2.top, rect.right, rect2.bottom);
    }

    void setAnchorMarkVerticalRect(Rect rect) {
        this.mAnchorMarkRect = rect;
        rect.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setContext(Context context) {
        this.mContext = context;
    }

    public void setGravity(int i10) {
        if (i10 > 0 && this.mGravity != i10) {
            this.mGravity = i10;
        }
    }

    void setHorizontalRelativePosition(int i10) {
        this.mHorizontalRelativePosition = i10;
    }

    public void setMargins(int i10, int i11, int i12, int i13) {
        this.mLeftMargin = i10;
        this.mTopMargin = i11;
        this.mRightMargin = i12;
        this.mBottomMargin = i13;
    }

    public void setRotate(int i10) {
        if (i10 < 0 || i10 > 360) {
            return;
        }
        this.mDegree = i10;
    }

    public void setScale(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            return;
        }
        this.mScale = f10;
    }

    public void setTransparent() {
        this.mIsTransparent = true;
    }

    void setVerticalRelativePosition(int i10) {
        this.mVerticalRelativePosition = i10;
    }
}
