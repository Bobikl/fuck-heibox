package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import androidx.annotation.p0;
import com.airbnb.lottie.animation.content.s;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ShapeStroke implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.model.animatable.b f37504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.animatable.b> f37505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.a f37506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.d f37507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f37508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final LineCapType f37509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final LineJoinType f37510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f37511i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f37512j;

    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i10 = a.f37513a[ordinal()];
            if (i10 != 1) {
                return i10 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i10 = a.f37514b[ordinal()];
            if (i10 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i10 == 2) {
                return Paint.Join.MITER;
            }
            if (i10 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f37514b;

        static {
            int[] iArr = new int[LineJoinType.values().length];
            f37514b = iArr;
            try {
                iArr[LineJoinType.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37514b[LineJoinType.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37514b[LineJoinType.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[LineCapType.values().length];
            f37513a = iArr2;
            try {
                iArr2[LineCapType.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37513a[LineCapType.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37513a[LineCapType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ShapeStroke(String str, @p0 com.airbnb.lottie.model.animatable.b bVar, List<com.airbnb.lottie.model.animatable.b> list, com.airbnb.lottie.model.animatable.a aVar, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.b bVar2, LineCapType lineCapType, LineJoinType lineJoinType, float f10, boolean z10) {
        this.f37503a = str;
        this.f37504b = bVar;
        this.f37505c = list;
        this.f37506d = aVar;
        this.f37507e = dVar;
        this.f37508f = bVar2;
        this.f37509g = lineCapType;
        this.f37510h = lineJoinType;
        this.f37511i = f10;
        this.f37512j = z10;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.a aVar) {
        return new s(jVar, aVar, this);
    }

    public LineCapType b() {
        return this.f37509g;
    }

    public com.airbnb.lottie.model.animatable.a c() {
        return this.f37506d;
    }

    public com.airbnb.lottie.model.animatable.b d() {
        return this.f37504b;
    }

    public LineJoinType e() {
        return this.f37510h;
    }

    public List<com.airbnb.lottie.model.animatable.b> f() {
        return this.f37505c;
    }

    public float g() {
        return this.f37511i;
    }

    public String h() {
        return this.f37503a;
    }

    public com.airbnb.lottie.model.animatable.d i() {
        return this.f37507e;
    }

    public com.airbnb.lottie.model.animatable.b j() {
        return this.f37508f;
    }

    public boolean k() {
        return this.f37512j;
    }
}
