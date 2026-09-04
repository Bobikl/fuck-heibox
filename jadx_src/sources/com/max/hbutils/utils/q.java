package com.max.hbutils.utils;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.max.hbutils.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Iterator;

/* JADX INFO: compiled from: ShapeUtils.java */
/* JADX INFO: loaded from: classes13.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f73564a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f73565b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f73566c = 2;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f73567d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f73568e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f73569f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f73570g = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f73571h = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f73572i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f73573j = 9;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f73574k = 10;

    /* JADX INFO: compiled from: ShapeUtils.java */
    public class a extends ShapeDrawable.ShaderFactory {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int[] f73575a;

        a(int[] iArr) {
            this.f73575a = iArr;
        }

        @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
        public Shader resize(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.cr, new Class[]{cls, cls}, Shader.class);
            return patchProxyResultProxy.isSupported ? (Shader) patchProxyResultProxy.result : new LinearGradient(0.0f, 0.0f, i10, i11, this.f73575a, (float[]) null, Shader.TileMode.CLAMP);
        }
    }

    public static GradientDrawable A(Context context, int i10, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), new Float(f10)}, null, changeQuickRedirect, true, bb.c.k.yq, new Class[]{Context.class, Integer.TYPE, Float.TYPE}, GradientDrawable.class);
        return patchProxyResultProxy.isSupported ? (GradientDrawable) patchProxyResultProxy.result : q(context, i10, I(f10, 2));
    }

    public static GradientDrawable B(Context context, int i10, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), new Float(f10)}, null, changeQuickRedirect, true, bb.c.k.zq, new Class[]{Context.class, Integer.TYPE, Float.TYPE}, GradientDrawable.class);
        return patchProxyResultProxy.isSupported ? (GradientDrawable) patchProxyResultProxy.result : w(context, i10, I(f10, 2));
    }

    public static GradientDrawable C(Context context, int i10, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), new Float(f10)}, null, changeQuickRedirect, true, bb.c.k.Fq, new Class[]{Context.class, Integer.TYPE, Float.TYPE}, GradientDrawable.class);
        return patchProxyResultProxy.isSupported ? (GradientDrawable) patchProxyResultProxy.result : q(context, i10, I(f10, 10));
    }

    public static GradientDrawable D(Context context, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.vq, new Class[]{Context.class, Integer.TYPE}, GradientDrawable.class);
        return patchProxyResultProxy.isSupported ? (GradientDrawable) patchProxyResultProxy.result : E(context, i10, 5.0f);
    }

    public static GradientDrawable E(Context context, int i10, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), new Float(f10)}, null, changeQuickRedirect, true, bb.c.k.tq, new Class[]{Context.class, Integer.TYPE, Float.TYPE}, GradientDrawable.class);
        return patchProxyResultProxy.isSupported ? (GradientDrawable) patchProxyResultProxy.result : q(context, i10, I(f10, 3));
    }

    public static GradientDrawable F(Context context, int i10, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), new Float(f10)}, null, changeQuickRedirect, true, bb.c.k.uq, new Class[]{Context.class, Integer.TYPE, Float.TYPE}, GradientDrawable.class);
        return patchProxyResultProxy.isSupported ? (GradientDrawable) patchProxyResultProxy.result : w(context, i10, I(f10, 3));
    }

    public static GradientDrawable G(Context context, int i10, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), new Float(f10)}, null, changeQuickRedirect, true, bb.c.k.Eq, new Class[]{Context.class, Integer.TYPE, Float.TYPE}, GradientDrawable.class);
        return patchProxyResultProxy.isSupported ? (GradientDrawable) patchProxyResultProxy.result : q(context, i10, I(f10, 9));
    }

    public static GradientDrawable H(Context context, int i10, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), new Float(f10)}, null, changeQuickRedirect, true, bb.c.k.Dq, new Class[]{Context.class, Integer.TYPE, Float.TYPE}, GradientDrawable.class);
        return patchProxyResultProxy.isSupported ? (GradientDrawable) patchProxyResultProxy.result : q(context, i10, I(f10, 8));
    }

    public static float[] I(float f10, int i10) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17 = 0.0f;
        switch (i10) {
            case 1:
                f11 = f10;
                f12 = f11;
                f13 = 0.0f;
                f14 = 0.0f;
                f15 = 0.0f;
                f16 = 0.0f;
                f17 = f12;
                break;
            case 2:
                f13 = f10;
                f14 = f13;
                f15 = f14;
                f16 = f15;
                f10 = 0.0f;
                f11 = 0.0f;
                f12 = f11;
                break;
            case 3:
                f13 = f10;
                f14 = f13;
                f15 = 0.0f;
                f16 = 0.0f;
                f11 = 0.0f;
                f12 = 0.0f;
                f17 = f14;
                break;
            case 4:
                f15 = f10;
                f16 = f15;
                f11 = f16;
                f12 = f11;
                f10 = 0.0f;
                f13 = 0.0f;
                f14 = 0.0f;
                break;
            case 5:
                f13 = f10;
                f17 = f13;
                f14 = f17;
                f15 = f14;
                f16 = f15;
                f11 = f16;
                f12 = f11;
                break;
            case 6:
                f15 = f10;
                f16 = f15;
                f10 = 0.0f;
                f13 = 0.0f;
                f14 = 0.0f;
                f11 = 0.0f;
                f12 = f11;
                break;
            case 7:
                f11 = f10;
                f12 = f11;
                f10 = 0.0f;
                f13 = 0.0f;
                f14 = 0.0f;
                f15 = 0.0f;
                f16 = f15;
                break;
            case 8:
                f13 = f10;
                f14 = f13;
                f10 = 0.0f;
                f15 = 0.0f;
                f16 = f15;
                f11 = f16;
                f12 = f11;
                break;
            case 9:
                f13 = 0.0f;
                f14 = 0.0f;
                f15 = 0.0f;
                f16 = 0.0f;
                f11 = 0.0f;
                f12 = 0.0f;
                f17 = f10;
                break;
            case 10:
                f13 = f10;
                f14 = f13;
                f11 = f14;
                f12 = f11;
                f10 = 0.0f;
                f15 = 0.0f;
                f16 = f15;
                break;
            default:
                f10 = 0.0f;
                f13 = 0.0f;
                f14 = 0.0f;
                f15 = f14;
                f16 = f15;
                f11 = f16;
                f12 = f11;
                break;
        }
        return new float[]{f10, f17, f13, f14, f15, f16, f11, f12};
    }

    public static GradientDrawable J(Context context, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Lq, new Class[]{Context.class, Integer.TYPE}, GradientDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientDrawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawableO = o(context, R.color.transparent, 5.0f);
        M(gradientDrawableO, context, i10, 5.0f);
        return gradientDrawableO;
    }

    public static GradientDrawable K(Context context, int i10, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), new Float(f10)}, null, changeQuickRedirect, true, bb.c.k.Jq, new Class[]{Context.class, Integer.TYPE, Float.TYPE}, GradientDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientDrawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawableO = o(context, R.color.transparent, f10);
        M(gradientDrawableO, context, i10, f10);
        return gradientDrawableO;
    }

    public static GradientDrawable L(Context context, int i10, float f10, float f11) {
        Object[] objArr = {context, new Integer(i10), new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.Kq, new Class[]{Context.class, Integer.TYPE, cls, cls}, GradientDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientDrawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawableO = o(context, R.color.transparent, f11);
        M(gradientDrawableO, context, i10, f10);
        return gradientDrawableO;
    }

    public static GradientDrawable M(GradientDrawable gradientDrawable, Context context, int i10, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gradientDrawable, context, new Integer(i10), new Float(f10)}, null, changeQuickRedirect, true, bb.c.k.Gq, new Class[]{GradientDrawable.class, Context.class, Integer.TYPE, Float.TYPE}, GradientDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientDrawable) patchProxyResultProxy.result;
        }
        if (i10 != -1) {
            gradientDrawable.setStroke(ViewUtils.f(context, f10), context.getResources().getColor(i10));
        }
        return gradientDrawable;
    }

    public static GradientDrawable N(Context context, int i10, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), new Float(f10)}, null, changeQuickRedirect, true, bb.c.k.Iq, new Class[]{Context.class, Integer.TYPE, Float.TYPE}, GradientDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientDrawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawableO = o(context, R.color.transparent, f10);
        O(gradientDrawableO, context, i10, f10);
        return gradientDrawableO;
    }

    public static GradientDrawable O(GradientDrawable gradientDrawable, Context context, int i10, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gradientDrawable, context, new Integer(i10), new Float(f10)}, null, changeQuickRedirect, true, bb.c.k.Hq, new Class[]{GradientDrawable.class, Context.class, Integer.TYPE, Float.TYPE}, GradientDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientDrawable) patchProxyResultProxy.result;
        }
        gradientDrawable.setStroke(ViewUtils.f(context, f10), i10);
        return gradientDrawable;
    }

    public static String P(String str, Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, context}, null, changeQuickRedirect, true, bb.c.k.Yq, new Class[]{String.class, Context.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : Q(str, context, true);
    }

    public static String Q(String str, Context context, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.Zq, new Class[]{String.class, Context.class, Boolean.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str == null) {
            return null;
        }
        Gson gson = new Gson();
        JsonElement jsonElement = (JsonElement) gson.fromJson(str, JsonElement.class);
        R(jsonElement, context, z10);
        Log.d("reverseColorBefore", str);
        Log.d("reverseColorAfter", gson.toJson(jsonElement));
        return gson.toJson(jsonElement);
    }

    private static void R(JsonElement jsonElement, Context context, boolean z10) {
        if (PatchProxy.proxy(new Object[]{jsonElement, context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.ar, new Class[]{JsonElement.class, Context.class, Boolean.TYPE}, Void.TYPE).isSupported || jsonElement == null) {
            return;
        }
        if (!jsonElement.isJsonObject()) {
            if (jsonElement.isJsonArray()) {
                Iterator<JsonElement> it = jsonElement.getAsJsonArray().iterator();
                while (it.hasNext()) {
                    R(it.next(), context, z10);
                }
                return;
            }
            return;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        for (String str : asJsonObject.keySet()) {
            JsonElement jsonElement2 = asJsonObject.get(str);
            if (jsonElement2 != null && jsonElement2.isJsonPrimitive() && jsonElement2.getAsJsonPrimitive().isString()) {
                String asString = jsonElement2.getAsString();
                if (asString != null) {
                    if (!u.b(context)) {
                        Pair<String, String> pairA = r.a(asString);
                        if (pairA != null) {
                            asJsonObject.addProperty(str, (String) pairA.first);
                        }
                    } else if (z10) {
                        Pair<String, String> pairA2 = r.a(asString);
                        if (pairA2 != null) {
                            asJsonObject.addProperty(str, (String) pairA2.second);
                        } else if (asString.startsWith("#") && (asString.length() == 7 || asString.length() == 9)) {
                            try {
                                int color = Color.parseColor(asString);
                                asJsonObject.addProperty(str, "#" + Integer.toHexString(Color.argb(Color.alpha(color), 255 - Color.red(color), 255 - Color.green(color), 255 - Color.blue(color))));
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            } else {
                R(jsonElement2, context, z10);
            }
        }
    }

    public static Drawable S(Drawable drawable, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Xq, new Class[]{Drawable.class, Integer.TYPE}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        Drawable drawableR = androidx.core.graphics.drawable.d.r(drawable);
        androidx.core.graphics.drawable.d.n(drawableR, i10);
        return drawableR;
    }

    public static Drawable a(Drawable drawable, float f10, int i10, int i11) {
        Object[] objArr = {drawable, new Float(f10), new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.Uq, new Class[]{Drawable.class, Float.TYPE, cls, cls}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(new float[]{f10, f10, f10, f10, f10, f10, f10, f10});
        gradientDrawable.setStroke(i11, i10);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, gradientDrawable});
        layerDrawable.setLayerInset(0, i11, i11, i11, i11);
        return layerDrawable;
    }

    public static ShapeDrawable b(int[] iArr, float f10, float f11) {
        Object[] objArr = {iArr, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.br, new Class[]{int[].class, cls, cls}, ShapeDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (ShapeDrawable) patchProxyResultProxy.result;
        }
        float f12 = f10 - f11;
        RoundRectShape roundRectShape = new RoundRectShape(new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, new RectF(f11, f11, f11, f11), new float[]{f12, f12, f12, f12, f12, f12, f12, f12});
        a aVar = new a(iArr);
        ShapeDrawable shapeDrawable = new ShapeDrawable(roundRectShape);
        shapeDrawable.setShaderFactory(aVar);
        return shapeDrawable;
    }

    public static StateListDrawable c(Context context, int i10, int i11, float f10) {
        Object[] objArr = {context, new Integer(i10), new Integer(i11), new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.Wq, new Class[]{Context.class, cls, cls, Float.TYPE}, StateListDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (StateListDrawable) patchProxyResultProxy.result;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, o(context, i11, f10));
        stateListDrawable.addState(new int[0], o(context, i10, f10));
        return stateListDrawable;
    }

    public static StateListDrawable d(Context context, int i10, int i11, float f10) {
        Object[] objArr = {context, new Integer(i10), new Integer(i11), new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.Vq, new Class[]{Context.class, cls, cls, Float.TYPE}, StateListDrawable.class);
        return patchProxyResultProxy.isSupported ? (StateListDrawable) patchProxyResultProxy.result : c(context, i10, i11, ViewUtils.h0(context, f10));
    }

    public static Drawable e(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.Rq, new Class[]{Context.class}, Drawable.class);
        return patchProxyResultProxy.isSupported ? (Drawable) patchProxyResultProxy.result : E(context, R.color.background_layer_2_color, 12.0f);
    }

    public static Drawable f(Context context, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Float(f10)}, null, changeQuickRedirect, true, bb.c.k.Qq, new Class[]{Context.class, Float.TYPE}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {android.R.attr.state_pressed};
        int i10 = R.color.background_card_1_color;
        stateListDrawable.addState(iArr, o(context, i10, f10));
        stateListDrawable.addState(new int[0], o(context, i10, f10));
        return stateListDrawable;
    }

    public static Drawable g(Context context, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Float(f10)}, null, changeQuickRedirect, true, bb.c.k.Pq, new Class[]{Context.class, Float.TYPE}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, o(context, R.color.background_card_1_color, f10));
        stateListDrawable.addState(new int[0], o(context, R.color.divider_secondary_1_color, f10));
        return stateListDrawable;
    }

    public static Drawable h(Context context, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Float(f10)}, null, changeQuickRedirect, true, bb.c.k.Oq, new Class[]{Context.class, Float.TYPE}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_enabled, android.R.attr.state_pressed}, o(context, R.color.appbar_text_color, f10));
        stateListDrawable.addState(new int[]{-16842910}, o(context, R.color.background_layer_3_color, f10));
        stateListDrawable.addState(new int[0], o(context, R.color.text_primary_1_color, f10));
        return stateListDrawable;
    }

    public static GradientDrawable i(Context context, int i10, int i11, float f10, float f11) {
        Object[] objArr = {context, new Integer(i10), new Integer(i11), new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.Mq, new Class[]{Context.class, cls, cls, cls2, cls2}, GradientDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientDrawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawableO = o(context, i10, f11);
        M(gradientDrawableO, context, i11, f10);
        return gradientDrawableO;
    }

    public static GradientDrawable j(Context context, int i10, int i11, float f10, float f11) {
        Object[] objArr = {context, new Integer(i10), new Integer(i11), new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.Nq, new Class[]{Context.class, cls, cls, cls2, cls2}, GradientDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientDrawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawableV = v(context, i10, f11);
        O(gradientDrawableV, context, i11, f10);
        return gradientDrawableV;
    }

    public static GradientDrawable k(Context context, int i10, int i11, GradientDrawable.Orientation orientation, float[] fArr) {
        Object[] objArr = {context, new Integer(i10), new Integer(i11), orientation, fArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.mq, new Class[]{Context.class, cls, cls, GradientDrawable.Orientation.class, float[].class}, GradientDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientDrawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawableW = ViewUtils.w(0, i10, i11, orientation);
        gradientDrawableW.setShape(0);
        float[] fArr2 = new float[fArr.length];
        for (int i12 = 0; i12 < fArr.length; i12++) {
            fArr2[i12] = ViewUtils.f(context, fArr[i12]);
        }
        gradientDrawableW.setCornerRadii(fArr2);
        return gradientDrawableW;
    }

    public static Drawable l(Context context, int i10, int i11, int i12) {
        Object[] objArr = {context, new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.Tq, new Class[]{Context.class, cls, cls, cls}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        if (i10 <= 0 || i11 <= 0) {
            return null;
        }
        GradientDrawable gradientDrawableN = n(context, R.color.divider_secondary_1_color);
        Drawable drawable = context.getResources().getDrawable(R.drawable.game_heybox_platform_filled_v_40x40);
        int iMin = Math.min(i12 > 0 ? i12 / 2 : Math.min(i10, i11), ViewUtils.f(context, 44.0f));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawableN, drawable});
        int i13 = (i10 - iMin) / 2;
        int i14 = (i11 - iMin) / 2;
        layerDrawable.setLayerInset(1, i13, i14, i13, i14);
        Log.d("getPlaceHolderDrawable", "width: " + i10 + "   height: " + i11 + "   iconSize: " + iMin);
        return layerDrawable;
    }

    public static Drawable m(Context context, View view, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, view, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Sq, new Class[]{Context.class, View.class, Integer.TYPE}, Drawable.class);
        return patchProxyResultProxy.isSupported ? (Drawable) patchProxyResultProxy.result : l(context, ViewUtils.W(view), ViewUtils.V(view), i10);
    }

    public static GradientDrawable n(Context context, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.qq, new Class[]{Context.class, Integer.TYPE}, GradientDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientDrawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(ViewUtils.f(context, 5.0f));
        if (i10 != -1) {
            gradientDrawable.setColor(context.getResources().getColor(i10));
        }
        return gradientDrawable;
    }

    public static GradientDrawable o(Context context, int i10, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), new Float(f10)}, null, changeQuickRedirect, true, bb.c.k.nq, new Class[]{Context.class, Integer.TYPE, Float.TYPE}, GradientDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientDrawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(ViewUtils.f(context, f10));
        if (i10 != -1) {
            gradientDrawable.setColor(context.getResources().getColor(i10));
        }
        return gradientDrawable;
    }

    public static GradientDrawable p(Context context, int i10, float f10, float f11, float f12, float f13) {
        Object[] objArr = {context, new Integer(i10), new Float(f10), new Float(f11), new Float(f12), new Float(f13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.oq, new Class[]{Context.class, Integer.TYPE, cls, cls, cls, cls}, GradientDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientDrawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        float f14 = ViewUtils.f(context, f10);
        float f15 = ViewUtils.f(context, f11);
        float f16 = ViewUtils.f(context, f12);
        float f17 = ViewUtils.f(context, f13);
        gradientDrawable.setCornerRadii(new float[]{f14, f14, f15, f15, f16, f16, f17, f17});
        if (i10 != -1) {
            gradientDrawable.setColor(androidx.core.content.d.f(context, i10));
        }
        return gradientDrawable;
    }

    public static GradientDrawable q(Context context, int i10, float[] fArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), fArr}, null, changeQuickRedirect, true, bb.c.k.kq, new Class[]{Context.class, Integer.TYPE, float[].class}, GradientDrawable.class);
        return patchProxyResultProxy.isSupported ? (GradientDrawable) patchProxyResultProxy.result : w(context, context.getResources().getColor(i10), fArr);
    }

    public static GradientDrawable r(Context context, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.sq, new Class[]{Context.class, Integer.TYPE}, GradientDrawable.class);
        return patchProxyResultProxy.isSupported ? (GradientDrawable) patchProxyResultProxy.result : s(context, i10, 5.0f);
    }

    public static GradientDrawable s(Context context, int i10, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), new Float(f10)}, null, changeQuickRedirect, true, bb.c.k.rq, new Class[]{Context.class, Integer.TYPE, Float.TYPE}, GradientDrawable.class);
        return patchProxyResultProxy.isSupported ? (GradientDrawable) patchProxyResultProxy.result : q(context, i10, I(f10, 4));
    }

    public static GradientDrawable t(Context context, int i10, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), new Float(f10)}, null, changeQuickRedirect, true, bb.c.k.Cq, new Class[]{Context.class, Integer.TYPE, Float.TYPE}, GradientDrawable.class);
        return patchProxyResultProxy.isSupported ? (GradientDrawable) patchProxyResultProxy.result : q(context, i10, I(f10, 7));
    }

    public static GradientDrawable u(Context context, int i10, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), new Float(f10)}, null, changeQuickRedirect, true, bb.c.k.Bq, new Class[]{Context.class, Integer.TYPE, Float.TYPE}, GradientDrawable.class);
        return patchProxyResultProxy.isSupported ? (GradientDrawable) patchProxyResultProxy.result : q(context, i10, I(f10, 6));
    }

    public static GradientDrawable v(Context context, int i10, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), new Float(f10)}, null, changeQuickRedirect, true, bb.c.k.pq, new Class[]{Context.class, Integer.TYPE, Float.TYPE}, GradientDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientDrawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(ViewUtils.f(context, f10));
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    public static GradientDrawable w(Context context, int i10, float[] fArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), fArr}, null, changeQuickRedirect, true, bb.c.k.lq, new Class[]{Context.class, Integer.TYPE, float[].class}, GradientDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientDrawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        float[] fArr2 = new float[fArr.length];
        for (int i11 = 0; i11 < fArr.length; i11++) {
            fArr2[i11] = ViewUtils.f(context, fArr[i11]);
        }
        gradientDrawable.setCornerRadii(fArr2);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    public static GradientDrawable x(Context context, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.xq, new Class[]{Context.class, Integer.TYPE}, GradientDrawable.class);
        return patchProxyResultProxy.isSupported ? (GradientDrawable) patchProxyResultProxy.result : y(context, i10, 5.0f);
    }

    public static GradientDrawable y(Context context, int i10, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), new Float(f10)}, null, changeQuickRedirect, true, bb.c.k.wq, new Class[]{Context.class, Integer.TYPE, Float.TYPE}, GradientDrawable.class);
        return patchProxyResultProxy.isSupported ? (GradientDrawable) patchProxyResultProxy.result : q(context, i10, I(f10, 1));
    }

    public static GradientDrawable z(Context context, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Aq, new Class[]{Context.class, Integer.TYPE}, GradientDrawable.class);
        return patchProxyResultProxy.isSupported ? (GradientDrawable) patchProxyResultProxy.result : A(context, i10, 5.0f);
    }
}
