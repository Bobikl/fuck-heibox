package com.max.xiaoheihe.accelworld;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.d1;
import androidx.core.view.j1;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.qcloud.core.util.IOUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.v0;
import kotlin.s0;

/* JADX INFO: compiled from: AccelWorld.kt */
/* JADX INFO: loaded from: classes3.dex */
@t0({"SMAP\nAccelWorld.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccelWorld.kt\ncom/max/xiaoheihe/accelworld/AccelWorldKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,346:1\n13579#2,2:347\n3792#2:349\n4307#2,2:350\n*S KotlinDebug\n*F\n+ 1 AccelWorld.kt\ncom/max/xiaoheihe/accelworld/AccelWorldKt\n*L\n226#1:347,2\n308#1:349\n308#1:350,2\n*E\n"})
public final class l {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final <T extends Comparable<? super T>> boolean a(@dl.e List<? extends T> list, @dl.e List<? extends T> list2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, list2}, null, changeQuickRedirect, true, bb.c.m.Fw, new Class[]{List.class, List.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return f0.g(list != null ? CollectionsKt___CollectionsKt.l5(list) : null, list2 != null ? CollectionsKt___CollectionsKt.l5(list2) : null);
    }

    public static final /* synthetic */ <T> T b(T t10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{t10}, null, changeQuickRedirect, true, bb.c.m.Dw, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        String strP = com.max.hbutils.utils.k.p(t10);
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        return (T) com.max.hbutils.utils.k.a(strP, Object.class);
    }

    @kotlin.k(message = "废弃，发现迁移一下", replaceWith = @s0(expression = "dp2px(context, Float)", imports = {"com.max.accelworld.AccelWorldDimensionKt"}))
    public static final int c(float f10, @dl.d Context context) {
        f0.p(context, "context");
        return ViewUtils.f(context, f10);
    }

    @kotlin.k(message = "废弃，发现迁移一下", replaceWith = @s0(expression = "dp2px(context, Int)", imports = {"com.max.accelworld.AccelWorldDimensionKt"}))
    public static final int d(int i10, @dl.d Context context) {
        f0.p(context, "context");
        return ViewUtils.f(context, i10);
    }

    @dl.d
    public static final Spannable e(@dl.d t... colorStrings) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{colorStrings}, null, changeQuickRedirect, true, bb.c.m.yw, new Class[]{t[].class}, Spannable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Spannable) patchProxyResultProxy.result;
        }
        f0.p(colorStrings, "colorStrings");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        try {
            int length = 0;
            for (t tVar : colorStrings) {
                spannableStringBuilder.append((CharSequence) tVar.b());
                spannableStringBuilder.setSpan(new ForegroundColorSpan(tVar.a()), length, tVar.b().length() + length, 33);
                length += tVar.b().length();
            }
        } catch (Exception unused) {
        }
        return spannableStringBuilder;
    }

    @dl.d
    public static final String f(@dl.d String str, @dl.d Context context, @d1 int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, context, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.Aw, new Class[]{String.class, Context.class, Integer.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(str, "<this>");
        f0.p(context, "context");
        String string = context.getResources().getString(i10);
        f0.o(string, "context.resources.getString(resInt)");
        v0 v0Var = v0.f124986a;
        String str2 = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        f0.o(str2, "format(format, *args)");
        return str2;
    }

    @dl.d
    public static final String g(@dl.e String str, @dl.e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.m.xw, new Class[]{String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "1";
        }
        sb2.append(str);
        sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
        if (str2 == null) {
            str2 = "1";
        }
        sb2.append(str2);
        return sb2.toString();
    }

    @androidx.annotation.l
    public static final int h(@dl.e Context context, @androidx.annotation.n int i10) {
        Object[] objArr = {context, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.jw, new Class[]{Context.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (context == null) {
            return 0;
        }
        return androidx.core.content.d.f(context, i10);
    }

    @dl.d
    public static final String i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.Ew, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return com.max.xiaoheihe.utils.d.x0() + ".916";
    }

    @dl.d
    public static final String j(@dl.d String... elements) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{elements}, null, changeQuickRedirect, true, bb.c.m.Bw, new Class[]{String[].class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(elements, "elements");
        ArrayList arrayList = new ArrayList();
        int length = elements.length;
        for (int i10 = 0; i10 < length; i10++) {
            String str = elements[i10];
            if (!(str == null || str.length() == 0)) {
                arrayList.add(str);
            }
        }
        return CollectionsKt___CollectionsKt.h3(arrayList, "·", null, null, 0, null, null, 62, null);
    }

    public static final void k(@dl.e ImageView imageView, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{imageView, str}, null, changeQuickRedirect, true, bb.c.m.uw, new Class[]{ImageView.class, String.class}, Void.TYPE).isSupported || imageView == null) {
            return;
        }
        if (str == null || kotlin.text.u.V1(str)) {
            return;
        }
        com.max.hbimage.b.K(str, imageView);
    }

    @dl.d
    public static final GradientDrawable l(@dl.d Context context, int i10, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), new Float(f10)}, null, changeQuickRedirect, true, bb.c.m.nw, new Class[]{Context.class, Integer.TYPE, Float.TYPE}, GradientDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientDrawable) patchProxyResultProxy.result;
        }
        f0.p(context, "<this>");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(c(f10, context));
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    @dl.e
    public static final BitmapDrawable m(@dl.e Context context, @androidx.annotation.v int i10, float f10) {
        Drawable drawableI;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), new Float(f10)}, null, changeQuickRedirect, true, bb.c.m.ow, new Class[]{Context.class, Integer.TYPE, Float.TYPE}, BitmapDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (BitmapDrawable) patchProxyResultProxy.result;
        }
        if (context == null || (drawableI = androidx.core.content.d.i(context, i10)) == null) {
            return null;
        }
        Bitmap bitmapB = androidx.core.graphics.drawable.e.b(drawableI, 0, 0, null, 7, null);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapB.getWidth(), bitmapB.getHeight(), Bitmap.Config.ARGB_8888);
        f0.o(bitmapCreateBitmap, "createBitmap(originalBit… Bitmap.Config.ARGB_8888)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(j1.f21601t);
        Rect rect = new Rect(0, 0, bitmapB.getWidth(), bitmapB.getHeight());
        canvas.drawRoundRect(new RectF(rect), f10, f10, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmapB, rect, rect, paint);
        return new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
    }

    @dl.e
    public static final GradientDrawable n(@dl.e Context context, @androidx.annotation.n int i10, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), new Float(f10)}, null, changeQuickRedirect, true, bb.c.m.kw, new Class[]{Context.class, Integer.TYPE, Float.TYPE}, GradientDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientDrawable) patchProxyResultProxy.result;
        }
        if (context == null) {
            return null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(c(f10, context));
        if (i10 != -1) {
            gradientDrawable.setColor(h(context, i10));
        }
        return gradientDrawable;
    }

    @dl.d
    public static final GradientDrawable o(@dl.d Context context, @androidx.annotation.n int i10, float f10, float f11, float f12, float f13) {
        Object[] objArr = {context, new Integer(i10), new Float(f10), new Float(f11), new Float(f12), new Float(f13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.mw, new Class[]{Context.class, Integer.TYPE, cls, cls, cls, cls}, GradientDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientDrawable) patchProxyResultProxy.result;
        }
        f0.p(context, "<this>");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        float fA = com.max.accelworld.c.a(f10, context);
        float fA2 = com.max.accelworld.c.a(f11, context);
        float fA3 = com.max.accelworld.c.a(f12, context);
        float fA4 = com.max.accelworld.c.a(f13, context);
        gradientDrawable.setCornerRadii(new float[]{fA, fA, fA2, fA2, fA3, fA3, fA4, fA4});
        if (i10 != -1) {
            gradientDrawable.setColor(h(context, i10));
        }
        return gradientDrawable;
    }

    public static final void p(@dl.e View view, @androidx.annotation.v int i10) {
        if (PatchProxy.proxy(new Object[]{view, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.tw, new Class[]{View.class, Integer.TYPE}, Void.TYPE).isSupported || view == null) {
            return;
        }
        view.setBackground(androidx.core.content.d.i(view.getContext(), i10));
    }

    public static final void q(@dl.e View view, @androidx.annotation.n int i10, float f10) {
        GradientDrawable gradientDrawableN;
        if (PatchProxy.proxy(new Object[]{view, new Integer(i10), new Float(f10)}, null, changeQuickRedirect, true, bb.c.m.qw, new Class[]{View.class, Integer.TYPE, Float.TYPE}, Void.TYPE).isSupported || view == null || (gradientDrawableN = n(view.getContext(), i10, f10)) == null) {
            return;
        }
        view.setBackground(gradientDrawableN);
    }

    public static final void r(@dl.e View view, @androidx.annotation.n int i10, float f10, float f11, float f12, float f13) {
        Object[] objArr = {view, new Integer(i10), new Float(f10), new Float(f11), new Float(f12), new Float(f13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.lw, new Class[]{View.class, Integer.TYPE, cls, cls, cls, cls}, Void.TYPE).isSupported || view == null) {
            return;
        }
        Context context = view.getContext();
        f0.o(context, "this.context");
        view.setBackground(o(context, i10, f10, f12, f13, f11));
    }

    public static final void s(@dl.e View view, int i10, float f10) {
        if (PatchProxy.proxy(new Object[]{view, new Integer(i10), new Float(f10)}, null, changeQuickRedirect, true, bb.c.m.pw, new Class[]{View.class, Integer.TYPE, Float.TYPE}, Void.TYPE).isSupported || view == null) {
            return;
        }
        Context context = view.getContext();
        f0.o(context, "this.context");
        view.setBackground(l(context, i10, f10));
    }

    public static final void t(@dl.e View view, @androidx.annotation.v int i10, float f10) {
        BitmapDrawable bitmapDrawableM;
        if (PatchProxy.proxy(new Object[]{view, new Integer(i10), new Float(f10)}, null, changeQuickRedirect, true, bb.c.m.sw, new Class[]{View.class, Integer.TYPE, Float.TYPE}, Void.TYPE).isSupported || view == null || (bitmapDrawableM = m(view.getContext(), i10, f10)) == null) {
            return;
        }
        view.setBackground(bitmapDrawableM);
    }

    public static final void u(@dl.e View view, @androidx.annotation.n int i10, float f10, @androidx.annotation.n int i11, float f11) {
        GradientDrawable gradientDrawableN;
        Object[] objArr = {view, new Integer(i10), new Float(f10), new Integer(i11), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Float.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.rw, new Class[]{View.class, cls, cls2, cls, cls2}, Void.TYPE).isSupported || view == null || (gradientDrawableN = n(view.getContext(), i10, f10)) == null) {
            return;
        }
        int iF = androidx.core.content.d.f(view.getContext(), i11);
        Context context = view.getContext();
        f0.o(context, "context");
        gradientDrawableN.setStroke(c(f11, context), iF);
        view.setBackground(gradientDrawableN);
    }

    public static final void v(@dl.d TextView textView, @androidx.annotation.n int i10) {
        if (PatchProxy.proxy(new Object[]{textView, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.ww, new Class[]{TextView.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<this>");
        textView.setTextColor(com.max.xiaoheihe.utils.d.E(i10));
    }

    @dl.d
    public static final Bitmap w(@dl.d Bitmap bitmap, int i10, int i11) {
        Object[] objArr = {bitmap, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.Cw, new Class[]{Bitmap.class, cls, cls}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        f0.p(bitmap, "bitmap");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        f0.o(bitmapCreateBitmap, "createBitmap(width, heig… Bitmap.Config.ARGB_8888)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawCircle(i10 / 2.0f, i11 / 2.0f, fi.u.B(i10, i11) / 2.0f, paint);
        canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, i10, i11), paint);
        return bitmapCreateBitmap;
    }

    public static final void x(@dl.e ImageView imageView, @androidx.annotation.v int i10, @androidx.annotation.n int i11) {
        Object[] objArr = {imageView, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.vw, new Class[]{ImageView.class, cls, cls}, Void.TYPE).isSupported || imageView == null) {
            return;
        }
        Drawable drawableI = androidx.core.content.d.i(imageView.getContext(), i10);
        int iF = androidx.core.content.d.f(imageView.getContext(), i11);
        if (drawableI != null) {
            Drawable drawableMutate = androidx.core.graphics.drawable.d.r(drawableI).mutate();
            f0.o(drawableMutate, "wrap(it).mutate()");
            androidx.core.graphics.drawable.d.n(drawableMutate, iF);
            imageView.setImageDrawable(drawableMutate);
        }
    }

    @dl.d
    public static final String y(long j10, @dl.d Context context) {
        String str;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10), context}, null, changeQuickRedirect, true, bb.c.m.zw, new Class[]{Long.TYPE, Context.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        if (j10 == 0) {
            return "";
        }
        Resources resources = context.getResources();
        String string = resources.getString(R.string.just_now);
        f0.o(string, "resources.getString(R.string.just_now)");
        long j11 = j10 * 1000;
        long jCurrentTimeMillis = System.currentTimeMillis() - j11;
        if (jCurrentTimeMillis <= 0) {
            return string;
        }
        if (jCurrentTimeMillis > 604800000) {
            String str2 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(j11));
            f0.o(str2, "SimpleDateFormat(\"yyyy-M…).format(Date(timestamp))");
            return str2;
        }
        if (jCurrentTimeMillis > 86400000) {
            str = com.max.hbutils.utils.w.c(jCurrentTimeMillis, 86400000L) + resources.getString(R.string.day);
        } else if (jCurrentTimeMillis > 3600000) {
            str = com.max.hbutils.utils.w.c(jCurrentTimeMillis, 3600000L) + resources.getString(R.string.hour);
        } else if (jCurrentTimeMillis > 60000) {
            str = com.max.hbutils.utils.w.c(jCurrentTimeMillis, 60000L) + resources.getString(R.string.minute);
        } else {
            if (jCurrentTimeMillis <= 1000) {
                return string;
            }
            str = com.max.hbutils.utils.w.c(jCurrentTimeMillis, 1000L) + resources.getString(R.string.second);
        }
        v0 v0Var = v0.f124986a;
        String string2 = resources.getString(R.string.relative_time_span);
        f0.o(string2, "resources.getString(R.string.relative_time_span)");
        String str3 = String.format(string2, Arrays.copyOf(new Object[]{str}, 1));
        f0.o(str3, "format(format, *args)");
        return str3;
    }
}
