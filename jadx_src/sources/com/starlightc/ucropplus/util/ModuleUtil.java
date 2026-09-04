package com.starlightc.ucropplus.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.annotation.l;
import androidx.core.view.j1;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.max.hbcommon.utils.c;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import com.starlightc.ucropplus.model.TextColorInfo;
import com.starlightc.ucropplus.model.puzzle.BackgroundObj;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.starlightc.ucropplus.model.puzzle.ContentPicturePuzzle;
import com.starlightc.ucropplus.model.puzzle.HBRectF;
import com.starlightc.ucropplus.model.puzzle.ImageModuleObj;
import com.starlightc.ucropplus.model.puzzle.PuzzleDataObj;
import com.starlightc.ucropplus.model.puzzle.StaticPicturePuzzle;
import dl.d;
import dl.e;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import org.jsoup.parser.ParseErrorList;
import zb.a;
import zb.b;

/* JADX INFO: compiled from: ModuleUtil.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ModuleUtil {

    @d
    public static final ModuleUtil INSTANCE = new ModuleUtil();
    public static final int STANDARD_WIDTH = 375;
    public static ChangeQuickRedirect changeQuickRedirect;

    private ModuleUtil() {
    }

    public static /* synthetic */ Drawable generateCircleDrawable$default(ModuleUtil moduleUtil, Context context, int i10, boolean z10, int i11, Object obj) {
        Object[] objArr = {moduleUtil, context, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 50961, new Class[]{ModuleUtil.class, Context.class, cls, Boolean.TYPE, cls, Object.class}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return moduleUtil.generateCircleDrawable(context, i10, z10);
    }

    @e
    public final <T extends Serializable> T clone(T t10) {
        ClassNotFoundException e10;
        T t11;
        IOException e11;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 50957, new Class[]{Serializable.class}, Serializable.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(t10);
            objectOutputStream.close();
            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
            t11 = (T) objectInputStream.readObject();
            try {
                objectInputStream.close();
            } catch (IOException e12) {
                e11 = e12;
                e11.printStackTrace();
            } catch (ClassNotFoundException e13) {
                e10 = e13;
                e10.printStackTrace();
            }
        } catch (IOException e14) {
            e11 = e14;
            t11 = null;
        } catch (ClassNotFoundException e15) {
            e10 = e15;
            t11 = null;
        }
        return t11;
    }

    @d
    public final <T extends Serializable> ArrayList<T> copyList(@d ArrayList<T> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 50956, new Class[]{ArrayList.class}, ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        f0.p(list, "list");
        ParseErrorList parseErrorList = (ArrayList<T>) new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Serializable serializableClone = clone(it.next());
            if (serializableClone != null) {
                parseErrorList.add(serializableClone);
            }
        }
        return parseErrorList;
    }

    @d
    public final Bitmap cropBitmap(@d Bitmap bit1, float f10, float f11, float f12, float f13, float f14, float f15) {
        Object[] objArr = {bit1, new Float(f10), new Float(f11), new Float(f12), new Float(f13), new Float(f14), new Float(f15)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50950, new Class[]{Bitmap.class, cls, cls, cls, cls, cls, cls}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        f0.p(bit1, "bit1");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bit1.getWidth(), bit1.getHeight(), Bitmap.Config.ARGB_8888);
        f0.o(bitmapCreateBitmap, "createBitmap(...)");
        Paint paint = new Paint();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        paint.setFlags(3);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        canvas.drawBitmap(bit1, 0.0f, 0.0f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        float f16 = 2;
        canvas.rotate(f15, (f10 + f12) / f16, (f11 + f13) / f16);
        canvas.drawRoundRect(f10, f11, f12, f13, f14, f14, paint);
        canvas.save();
        return bitmapCreateBitmap;
    }

    @e
    public final Bitmap drawableToBitmap(@e Drawable drawable, int i10, int i11) {
        Object[] objArr = {drawable, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50952, new Class[]{Drawable.class, cls, cls}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        if (drawable == null) {
            return null;
        }
        if (i10 <= 0) {
            i10 = ViewUtils.L(BaseApplication.a());
        }
        if (i11 <= 0) {
            i11 = ViewUtils.L(BaseApplication.a());
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        f0.o(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, i10, i11);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    @d
    public final Drawable generateCircleDrawable(@d Context context, @l int i10, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 50960, new Class[]{Context.class, Integer.TYPE, Boolean.TYPE}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(ViewUtils.f(context, 14.0f));
        gradientDrawable.setColor(i10);
        if (z10) {
            gradientDrawable.setStroke(ViewUtils.f(context, 1.0f), -1);
        }
        return gradientDrawable;
    }

    @d
    public final Bitmap getColorBitmap(int i10, int i11, int i12) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50951, new Class[]{cls, cls, cls}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
        f0.o(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i10);
        canvas.drawPaint(paint);
        return bitmapCreateBitmap;
    }

    @d
    public final ArrayList<TextColorInfo> getColorList() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50959, new Class[0], ArrayList.class);
        return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : CollectionsKt__CollectionsKt.r(new TextColorInfo(-1, 0), new TextColorInfo(j1.f21601t, 1), new TextColorInfo(Color.parseColor("#CB3E3C"), 2), new TextColorInfo(Color.parseColor("#E46C8F"), 3), new TextColorInfo(Color.parseColor("#FFE0E3"), 4), new TextColorInfo(Color.parseColor("#EF903D"), 5), new TextColorInfo(Color.parseColor("#FADB4D"), 6), new TextColorInfo(Color.parseColor("#FDF5A8"), 7), new TextColorInfo(Color.parseColor("#E2F9D3"), 8), new TextColorInfo(Color.parseColor("#91B54C"), 9), new TextColorInfo(Color.parseColor("#6BD9A1"), 10), new TextColorInfo(Color.parseColor("#A7FBFD"), 11), new TextColorInfo(Color.parseColor("#6192E2"), 12), new TextColorInfo(Color.parseColor("#2028F0"), 13), new TextColorInfo(Color.parseColor("#A983EA"), 14), new TextColorInfo(Color.parseColor("#A9CFFB"), 15), new TextColorInfo(Color.parseColor("#BDBFFA"), 16), new TextColorInfo(Color.parseColor("#A6BB8F"), 17), new TextColorInfo(Color.parseColor("#577061"), 18), new TextColorInfo(Color.parseColor("#CCCCCC"), 19), new TextColorInfo(Color.parseColor("#999999"), 20), new TextColorInfo(Color.parseColor("#615954"), 21));
    }

    @e
    public final StaticPicturePuzzle getModuleBackgroundPuzzle(@d Context context, @d ImageModuleObj module, @e String str, @e String str2) throws Throwable {
        int width;
        int width2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, module, str, str2}, this, changeQuickRedirect, false, 50947, new Class[]{Context.class, ImageModuleObj.class, String.class, String.class}, StaticPicturePuzzle.class);
        if (patchProxyResultProxy.isSupported) {
            return (StaticPicturePuzzle) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(module, "module");
        PuzzleDataObj puzzle_data = module.getPuzzle_data();
        if ((puzzle_data != null ? puzzle_data.getBackground() : null) == null) {
            return null;
        }
        PuzzleDataObj puzzle_data2 = module.getPuzzle_data();
        BackgroundObj background = puzzle_data2 != null ? puzzle_data2.getBackground() : null;
        f0.m(background);
        StaticPicturePuzzle staticPicturePuzzle = new StaticPicturePuzzle(null, null, null);
        int iL = ViewUtils.L(context);
        PuzzleDataObj puzzle_data3 = module.getPuzzle_data();
        float f10 = iL;
        int iP = (int) ((n.p(puzzle_data3 != null ? puzzle_data3.getHeight() : null) * f10) / 375);
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        float f11 = iP;
        if (bitmapDecodeFile.getWidth() / bitmapDecodeFile.getHeight() >= f10 / f11) {
            width = (bitmapDecodeFile.getHeight() * iL) / iP;
            width2 = bitmapDecodeFile.getHeight();
        } else {
            width = bitmapDecodeFile.getWidth();
            width2 = (bitmapDecodeFile.getWidth() * iP) / iL;
        }
        int iAbs = Math.abs((bitmapDecodeFile.getWidth() - width) / 2);
        int iAbs2 = Math.abs((bitmapDecodeFile.getHeight() - width2) / 2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, Math.max(0, iAbs), Math.max(0, iAbs2), Math.min(width, bitmapDecodeFile.getWidth() - iAbs), Math.min(width2, bitmapDecodeFile.getHeight() - iAbs2));
        if (c.x(background.getBlur())) {
            b bVar = new b();
            bVar.f141959a = width;
            bVar.f141960b = width2;
            bVar.f141962d = 6;
            bitmapCreateBitmap = a.b(context, bitmapCreateBitmap, bVar);
        }
        int iP2 = (int) n.p(background.getBackground_alpha());
        if (iP2 > 0) {
            ModuleUtil moduleUtil = INSTANCE;
            f0.m(bitmapCreateBitmap);
            bitmapCreateBitmap = moduleUtil.getTransparentBitmap(bitmapCreateBitmap, iP2);
        }
        ModuleUtil moduleUtil2 = INSTANCE;
        f0.m(bitmapCreateBitmap);
        Bitmap bitmapScaleBitMap = moduleUtil2.scaleBitMap(bitmapCreateBitmap, f10, f11);
        if (moduleUtil2.isLegalRectF(background.getBackground_crop_rect())) {
            HBRectF background_crop_rect = background.getBackground_crop_rect();
            f0.m(background_crop_rect);
            RectF pxRectF = background_crop_rect.toPxRectF(context);
            f0.m(bitmapScaleBitMap);
            bitmapScaleBitMap = moduleUtil2.cropBitmap(bitmapScaleBitMap, pxRectF.left, pxRectF.top, pxRectF.right, pxRectF.bottom, ViewUtils.f(context, n.p(background.getBackground_crop_radius())), n.p(background.getRotation()));
        }
        staticPicturePuzzle.setPath(com.max.hbimage.b.q0(bitmapScaleBitMap, str2).getPath());
        staticPicturePuzzle.setType(BasePuzzleInfo.PUZZLE_TYPE_STATIC_PICTURE);
        PuzzleDataObj puzzle_data4 = module.getPuzzle_data();
        staticPicturePuzzle.setRect(new HBRectF(0.0f, 0.0f, 375.0f, n.p(puzzle_data4 != null ? puzzle_data4.getHeight() : null)));
        staticPicturePuzzle.setCan_edit("0");
        return staticPicturePuzzle;
    }

    @d
    public final Bitmap getTransparentBitmap(@d Bitmap sourceImg, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sourceImg, new Integer(i10)}, this, changeQuickRedirect, false, 50954, new Class[]{Bitmap.class, Integer.TYPE}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        f0.p(sourceImg, "sourceImg");
        int width = sourceImg.getWidth() * sourceImg.getHeight();
        int[] iArr = new int[width];
        sourceImg.getPixels(iArr, 0, sourceImg.getWidth(), 0, 0, sourceImg.getWidth(), sourceImg.getHeight());
        int i11 = (i10 * 255) / 100;
        for (int i12 = 0; i12 < width; i12++) {
            iArr[i12] = (i11 << 24) | (iArr[i12] & 16777215);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, sourceImg.getWidth(), sourceImg.getHeight(), Bitmap.Config.ARGB_8888);
        f0.o(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    @d
    public final ContentPicturePuzzle handleContentPuzzle(@d Bitmap bitmap, @d ContentPicturePuzzle puzzleData) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap, puzzleData}, this, changeQuickRedirect, false, 50953, new Class[]{Bitmap.class, ContentPicturePuzzle.class}, ContentPicturePuzzle.class);
        if (patchProxyResultProxy.isSupported) {
            return (ContentPicturePuzzle) patchProxyResultProxy.result;
        }
        f0.p(bitmap, "bitmap");
        f0.p(puzzleData, "puzzleData");
        HBRectF rect = puzzleData.getRect();
        f0.m(rect);
        float right = rect.getRight();
        HBRectF rect2 = puzzleData.getRect();
        f0.m(rect2);
        float left = right - rect2.getLeft();
        HBRectF rect3 = puzzleData.getRect();
        f0.m(rect3);
        float bottom = rect3.getBottom();
        HBRectF rect4 = puzzleData.getRect();
        f0.m(rect4);
        float top = bottom - rect4.getTop();
        float f10 = left / top;
        if (f10 < bitmap.getWidth() / bitmap.getHeight()) {
            float width = (((top * bitmap.getWidth()) / bitmap.getHeight()) - left) / 2;
            HBRectF rect5 = puzzleData.getRect();
            f0.m(rect5);
            rect5.setLeft(rect5.getLeft() - width);
            HBRectF rect6 = puzzleData.getRect();
            f0.m(rect6);
            rect6.setRight(rect6.getRight() + width);
        } else if (f10 > bitmap.getWidth() / bitmap.getHeight()) {
            float height = (((left * bitmap.getHeight()) / bitmap.getWidth()) - top) / 2;
            HBRectF rect7 = puzzleData.getRect();
            f0.m(rect7);
            rect7.setTop(rect7.getTop() - height);
            HBRectF rect8 = puzzleData.getRect();
            f0.m(rect8);
            rect8.setBottom(rect8.getBottom() + height);
        }
        return puzzleData;
    }

    public final boolean isLegalRectF(@e HBRectF hBRectF) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hBRectF}, this, changeQuickRedirect, false, 50949, new Class[]{HBRectF.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return hBRectF != null && (hBRectF.getLeft() > 0.0f || hBRectF.getTop() > 0.0f || hBRectF.getRight() > 0.0f || hBRectF.getBottom() > 0.0f);
    }

    public final boolean isWifiNetwork(@e Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 50958, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (context != null) {
            Object systemService = context.getSystemService("connectivity");
            f0.n(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1) {
                return true;
            }
        }
        return false;
    }

    @d
    public final Bitmap scaleBitMap(@d Bitmap src, float f10, float f11) {
        Object[] objArr = {src, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50948, new Class[]{Bitmap.class, cls, cls}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        f0.p(src, "src");
        Matrix matrix = new Matrix();
        matrix.postScale(f10 / src.getWidth(), f11 / src.getHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(src, 0, 0, src.getWidth(), src.getHeight(), matrix, false);
        f0.o(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    @d
    public final Dialog showLoadingDialog(@d Context context, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 50955, new Class[]{Context.class, String.class}, Dialog.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dialog) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        LayoutInflater layoutInflater = ((Activity) context).getLayoutInflater();
        f0.o(layoutInflater, "getLayoutInflater(...)");
        View viewInflate = layoutInflater.inflate(R.layout.dialog_loading, (ViewGroup) null, false);
        f0.o(viewInflate, "inflate(...)");
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) viewInflate.findViewById(R.id.img_progress);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_msg);
        circularProgressIndicator.p();
        textView.setText(str);
        AlertDialog alertDialogCreate = builder.setView(viewInflate).setCancelable(false).create();
        f0.o(alertDialogCreate, "create(...)");
        alertDialogCreate.setCancelable(false);
        Window window = alertDialogCreate.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.color.transparent);
        }
        alertDialogCreate.show();
        return alertDialogCreate;
    }
}
