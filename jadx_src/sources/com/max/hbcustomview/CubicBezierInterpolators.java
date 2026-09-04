package com.max.hbcustomview;

import android.view.animation.Interpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class CubicBezierInterpolators {
    public static ChangeQuickRedirect changeQuickRedirect;

    public enum Type {
        EASE("EASE", 0.25f, 0.1f, 0.25f, 1.0f),
        LINEAR("LINEAR", 0.0f, 0.0f, 1.0f, 1.0f),
        EASE_IN("EASE_IN", 0.42f, 0.0f, 1.0f, 1.0f),
        EASE_OUT("EASE_OUT", 0.0f, 0.0f, 0.58f, 1.0f),
        EASE_IN_OUT("EASE_IN_OUT", 0.42f, 0.0f, 0.58f, 1.0f),
        EASE_IN_SINE("EASE_IN_SINE", 0.47f, 0.0f, 0.75f, 0.72f),
        EASE_OUT_SINE("EASE_OUT_SINE", 0.39f, 0.57f, 0.56f, 1.0f),
        EASE_IN_OUT_SINE("EASE_IN_OUT_SINE", 0.45f, 0.05f, 0.55f, 0.95f),
        EASE_IN_QUAD("EASE_IN_QUAD", 0.55f, 0.09f, 0.68f, 0.53f),
        EASE_OUT_QUAD("EASE_OUT_QUAD", 0.25f, 0.46f, 0.45f, 0.94f),
        EASE_IN_OUT_QUAD("EASE_IN_OUT_QUAD", 0.46f, 0.03f, 0.52f, 0.96f),
        EASE_IN_CUBIC("EASE_IN_CUBIC", 0.55f, 0.06f, 0.68f, 0.19f),
        EASE_OUT_CUBIC("EASE_OUT_CUBIC", 0.22f, 0.61f, 0.36f, 1.0f),
        EASE_IN_OUT_CUBIC("EASE_IN_OUT_CUBIC", 0.65f, 0.05f, 0.36f, 1.0f),
        EASE_IN_QUART("EASE_IN_QUART", 0.9f, 0.03f, 0.69f, 0.22f),
        EASE_OUT_QUART("EASE_OUT_QUART", 0.17f, 0.84f, 0.44f, 1.0f),
        EASE_IN_OUT_QUART("EASE_IN_OUT_QUART", 0.77f, 0.0f, 0.18f, 1.0f),
        EASE_IN_QUINT("EASE_IN_QUINT", 0.76f, 0.05f, 0.86f, 0.06f),
        EASE_OUT_QUINT("EASE_OUT_QUINT", 0.23f, 1.0f, 0.32f, 1.0f),
        EASE_IN_OUT_QUINT("EASE_IN_OUT_QUINT", 0.86f, 0.0f, 0.07f, 1.0f),
        EASE_IN_EXPO("EASE_IN_EXPO", 0.95f, 0.05f, 0.8f, 0.04f),
        EASE_OUT_EXPO("EASE_OUT_EXPO", 0.19f, 1.0f, 0.22f, 1.0f),
        EASE_IN_CIRC("EASE_IN_CIRC", 0.6f, 0.04f, 0.98f, 0.34f),
        EASE_OUT_CIRC("EASE_OUT_CIRC", 0.08f, 0.82f, 0.17f, 1.0f),
        EASE_IN_OUT_CIRC("EASE_IN_OUT_CIRC", 0.79f, 0.14f, 0.15f, 0.86f),
        EASE_IN_BACK("EASE_IN_BACK", 0.6f, -0.28f, 0.74f, 0.05f),
        EASE_OUT_BACK("EASE_OUT_BACK", 0.18f, 0.89f, 0.32f, 1.27f),
        EASE_IN_OUT_BACK("EASE_IN_OUT_BACK", 0.68f, -0.55f, 0.27f, 1.55f);

        public static ChangeQuickRedirect changeQuickRedirect;
        private String name;

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        private float f68392x1;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private float f68393x2;

        /* JADX INFO: renamed from: y1, reason: collision with root package name */
        private float f68394y1;

        /* JADX INFO: renamed from: y2, reason: collision with root package name */
        private float f68395y2;

        Type(float f10, float f11, float f12, float f13) {
            this.f68392x1 = f10;
            this.f68394y1 = f11;
            this.f68393x2 = f12;
            this.f68395y2 = f13;
        }

        Type(String str, float f10, float f11, float f12, float f13) {
            this.name = str;
            this.f68392x1 = f10;
            this.f68394y1 = f11;
            this.f68393x2 = f12;
            this.f68395y2 = f13;
        }

        public static Type valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.H3, new Class[]{String.class}, Type.class);
            return patchProxyResultProxy.isSupported ? (Type) patchProxyResultProxy.result : (Type) Enum.valueOf(Type.class, str);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.f.G3, new Class[0], Type[].class);
            return patchProxyResultProxy.isSupported ? (Type[]) patchProxyResultProxy.result : (Type[]) values().clone();
        }

        public Interpolator create() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.I3, new Class[0], Interpolator.class);
            return patchProxyResultProxy.isSupported ? (Interpolator) patchProxyResultProxy.result : androidx.core.view.animation.b.b(this.f68392x1, this.f68394y1, this.f68393x2, this.f68395y2);
        }

        public String getName() {
            return this.name;
        }
    }

    public static Interpolator a(Type type) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{type}, null, changeQuickRedirect, true, bb.c.f.F3, new Class[]{Type.class}, Interpolator.class);
        return patchProxyResultProxy.isSupported ? (Interpolator) patchProxyResultProxy.result : type.create();
    }
}
