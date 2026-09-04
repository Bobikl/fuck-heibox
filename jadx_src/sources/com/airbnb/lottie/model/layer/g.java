package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.annotation.p0;
import androidx.collection.x0;
import com.airbnb.lottie.animation.keyframe.o;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.j;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.animatable.k;
import com.airbnb.lottie.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: TextLayer.java */
/* JADX INFO: loaded from: classes6.dex */
public class g extends com.airbnb.lottie.model.layer.a {
    private final StringBuilder F;
    private final RectF G;
    private final Matrix H;
    private final Paint I;
    private final Paint J;
    private final Map<com.airbnb.lottie.model.c, List<com.airbnb.lottie.animation.content.d>> K;
    private final x0<String> L;
    private final o M;
    private final j N;
    private final com.airbnb.lottie.g O;

    @p0
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> P;

    @p0
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> Q;

    @p0
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> R;

    @p0
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> S;

    @p0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> T;

    @p0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> U;

    @p0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> V;

    @p0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> W;

    @p0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> X;

    @p0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> Y;

    @p0
    private com.airbnb.lottie.animation.keyframe.a<Typeface, Typeface> Z;

    /* JADX INFO: compiled from: TextLayer.java */
    public class a extends Paint {
        a(int i10) {
            super(i10);
            setStyle(Paint.Style.FILL);
        }
    }

    /* JADX INFO: compiled from: TextLayer.java */
    public class b extends Paint {
        b(int i10) {
            super(i10);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* JADX INFO: compiled from: TextLayer.java */
    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37645a;

        static {
            int[] iArr = new int[DocumentData.Justification.values().length];
            f37645a = iArr;
            try {
                iArr[DocumentData.Justification.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37645a[DocumentData.Justification.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37645a[DocumentData.Justification.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    g(j jVar, Layer layer) {
        com.airbnb.lottie.model.animatable.b bVar;
        com.airbnb.lottie.model.animatable.b bVar2;
        com.airbnb.lottie.model.animatable.a aVar;
        com.airbnb.lottie.model.animatable.a aVar2;
        super(jVar, layer);
        this.F = new StringBuilder(2);
        this.G = new RectF();
        this.H = new Matrix();
        this.I = new a(1);
        this.J = new b(1);
        this.K = new HashMap();
        this.L = new x0<>();
        this.N = jVar;
        this.O = layer.b();
        o oVarQ = layer.s().q();
        this.M = oVarQ;
        oVarQ.a(this);
        i(oVarQ);
        k kVarT = layer.t();
        if (kVarT != null && (aVar2 = kVarT.f37461a) != null) {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVarQ = aVar2.q();
            this.P = aVarQ;
            aVarQ.a(this);
            i(this.P);
        }
        if (kVarT != null && (aVar = kVarT.f37462b) != null) {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVarQ2 = aVar.q();
            this.R = aVarQ2;
            aVarQ2.a(this);
            i(this.R);
        }
        if (kVarT != null && (bVar2 = kVarT.f37463c) != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarQ3 = bVar2.q();
            this.T = aVarQ3;
            aVarQ3.a(this);
            i(this.T);
        }
        if (kVarT == null || (bVar = kVarT.f37464d) == null) {
            return;
        }
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarQ4 = bVar.q();
        this.V = aVarQ4;
        aVarQ4.a(this);
        i(this.V);
    }

    private void N(DocumentData.Justification justification, Canvas canvas, float f10) {
        int i10 = c.f37645a[justification.ordinal()];
        if (i10 == 2) {
            canvas.translate(-f10, 0.0f);
        } else {
            if (i10 != 3) {
                return;
            }
            canvas.translate((-f10) / 2.0f, 0.0f);
        }
    }

    private String O(String str, int i10) {
        int iCodePointAt = str.codePointAt(i10);
        int iCharCount = Character.charCount(iCodePointAt) + i10;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!b0(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j10 = iCodePointAt;
        if (this.L.d(j10)) {
            return this.L.g(j10);
        }
        this.F.setLength(0);
        while (i10 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i10);
            this.F.appendCodePoint(iCodePointAt3);
            i10 += Character.charCount(iCodePointAt3);
        }
        String string = this.F.toString();
        this.L.m(j10, string);
        return string;
    }

    private void P(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private void Q(com.airbnb.lottie.model.c cVar, Matrix matrix, float f10, DocumentData documentData, Canvas canvas) {
        List<com.airbnb.lottie.animation.content.d> listX = X(cVar);
        for (int i10 = 0; i10 < listX.size(); i10++) {
            Path path = listX.get(i10).getPath();
            path.computeBounds(this.G, false);
            this.H.set(matrix);
            this.H.preTranslate(0.0f, (-documentData.f37450g) * com.airbnb.lottie.utils.j.e());
            this.H.preScale(f10, f10);
            path.transform(this.H);
            if (documentData.f37454k) {
                T(path, this.I, canvas);
                T(path, this.J, canvas);
            } else {
                T(path, this.J, canvas);
                T(path, this.I, canvas);
            }
        }
    }

    private void R(String str, DocumentData documentData, Canvas canvas) {
        if (documentData.f37454k) {
            P(str, this.I, canvas);
            P(str, this.J, canvas);
        } else {
            P(str, this.J, canvas);
            P(str, this.I, canvas);
        }
    }

    private void S(String str, DocumentData documentData, Canvas canvas, float f10) {
        int length = 0;
        while (length < str.length()) {
            String strO = O(str, length);
            length += strO.length();
            R(strO, documentData, canvas);
            canvas.translate(this.I.measureText(strO) + f10, 0.0f);
        }
    }

    private void T(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void U(String str, DocumentData documentData, Matrix matrix, com.airbnb.lottie.model.b bVar, Canvas canvas, float f10, float f11) {
        float fFloatValue;
        for (int i10 = 0; i10 < str.length(); i10++) {
            com.airbnb.lottie.model.c cVarG = this.O.c().g(com.airbnb.lottie.model.c.e(str.charAt(i10), bVar.b(), bVar.d()));
            if (cVarG != null) {
                Q(cVarG, matrix, f11, documentData, canvas);
                float fD = ((float) cVarG.d()) * f11 * com.airbnb.lottie.utils.j.e() * f10;
                float f12 = documentData.f37448e / 10.0f;
                com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar = this.W;
                if (aVar != null) {
                    fFloatValue = aVar.h().floatValue();
                } else {
                    com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.V;
                    if (aVar2 != null) {
                        fFloatValue = aVar2.h().floatValue();
                    }
                    canvas.translate(fD + (f12 * f10), 0.0f);
                }
                f12 += fFloatValue;
                canvas.translate(fD + (f12 * f10), 0.0f);
            }
        }
    }

    private void V(DocumentData documentData, Matrix matrix, com.airbnb.lottie.model.b bVar, Canvas canvas) {
        float fFloatValue;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar = this.Y;
        if (aVar != null) {
            fFloatValue = aVar.h().floatValue();
        } else {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.X;
            fFloatValue = aVar2 != null ? aVar2.h().floatValue() : documentData.f37446c;
        }
        float f10 = fFloatValue / 100.0f;
        float fG = com.airbnb.lottie.utils.j.g(matrix);
        String str = documentData.f37444a;
        float fE = documentData.f37449f * com.airbnb.lottie.utils.j.e();
        List<String> listZ = Z(str);
        int size = listZ.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str2 = listZ.get(i10);
            float fY = Y(str2, bVar, f10, fG);
            canvas.save();
            N(documentData.f37447d, canvas, fY);
            canvas.translate(0.0f, (i10 * fE) - (((size - 1) * fE) / 2.0f));
            U(str2, documentData, matrix, bVar, canvas, fG, f10);
            canvas.restore();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009a A[LOOP:0: B:23:0x0098->B:24:0x009a, LOOP_END] */
    private void W(DocumentData documentData, com.airbnb.lottie.model.b bVar, Matrix matrix, Canvas canvas) {
        float fFloatValue;
        float fFloatValue2;
        float fE;
        List<String> listZ;
        int size;
        int i10;
        Typeface typefaceA0 = a0(bVar);
        if (typefaceA0 == null) {
            return;
        }
        String strB = documentData.f37444a;
        v vVarN = this.N.N();
        if (vVarN != null) {
            strB = vVarN.b(strB);
        }
        this.I.setTypeface(typefaceA0);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar = this.Y;
        if (aVar != null) {
            fFloatValue = aVar.h().floatValue();
        } else {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.X;
            fFloatValue = aVar2 != null ? aVar2.h().floatValue() : documentData.f37446c;
        }
        this.I.setTextSize(com.airbnb.lottie.utils.j.e() * fFloatValue);
        this.J.setTypeface(this.I.getTypeface());
        this.J.setTextSize(this.I.getTextSize());
        float fE2 = documentData.f37449f * com.airbnb.lottie.utils.j.e();
        float f10 = documentData.f37448e / 10.0f;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar3 = this.W;
        if (aVar3 == null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar4 = this.V;
            if (aVar4 != null) {
                fFloatValue2 = aVar4.h().floatValue();
            }
            fE = ((f10 * com.airbnb.lottie.utils.j.e()) * fFloatValue) / 100.0f;
            listZ = Z(strB);
            size = listZ.size();
            for (i10 = 0; i10 < size; i10++) {
                String str = listZ.get(i10);
                float fMeasureText = this.J.measureText(str) + ((str.length() - 1) * fE);
                canvas.save();
                N(documentData.f37447d, canvas, fMeasureText);
                canvas.translate(0.0f, (i10 * fE2) - (((size - 1) * fE2) / 2.0f));
                S(str, documentData, canvas, fE);
                canvas.restore();
            }
        }
        fFloatValue2 = aVar3.h().floatValue();
        f10 += fFloatValue2;
        fE = ((f10 * com.airbnb.lottie.utils.j.e()) * fFloatValue) / 100.0f;
        listZ = Z(strB);
        size = listZ.size();
        while (i10 < size) {
            String str2 = listZ.get(i10);
            float fMeasureText2 = this.J.measureText(str2) + ((str2.length() - 1) * fE);
            canvas.save();
            N(documentData.f37447d, canvas, fMeasureText2);
            canvas.translate(0.0f, (i10 * fE2) - (((size - 1) * fE2) / 2.0f));
            S(str2, documentData, canvas, fE);
            canvas.restore();
        }
    }

    private List<com.airbnb.lottie.animation.content.d> X(com.airbnb.lottie.model.c cVar) {
        if (this.K.containsKey(cVar)) {
            return this.K.get(cVar);
        }
        List<com.airbnb.lottie.model.content.k> listA = cVar.a();
        int size = listA.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new com.airbnb.lottie.animation.content.d(this.N, this, listA.get(i10)));
        }
        this.K.put(cVar, arrayList);
        return arrayList;
    }

    private float Y(String str, com.airbnb.lottie.model.b bVar, float f10, float f11) {
        float fD = 0.0f;
        for (int i10 = 0; i10 < str.length(); i10++) {
            com.airbnb.lottie.model.c cVarG = this.O.c().g(com.airbnb.lottie.model.c.e(str.charAt(i10), bVar.b(), bVar.d()));
            if (cVarG != null) {
                fD = (float) (((double) fD) + (cVarG.d() * ((double) f10) * ((double) com.airbnb.lottie.utils.j.e()) * ((double) f11)));
            }
        }
        return fD;
    }

    private List<String> Z(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    @p0
    private Typeface a0(com.airbnb.lottie.model.b bVar) {
        Typeface typefaceH;
        com.airbnb.lottie.animation.keyframe.a<Typeface, Typeface> aVar = this.Z;
        if (aVar != null && (typefaceH = aVar.h()) != null) {
            return typefaceH;
        }
        Typeface typefaceO = this.N.O(bVar.b(), bVar.d());
        return typefaceO != null ? typefaceO : bVar.e();
    }

    private boolean b0(int i10) {
        return Character.getType(i10) == 16 || Character.getType(i10) == 27 || Character.getType(i10) == 6 || Character.getType(i10) == 28 || Character.getType(i10) == 19;
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.animation.content.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        super.a(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, this.O.b().width(), this.O.b().height());
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.model.e
    public <T> void f(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        super.f(t10, jVar);
        if (t10 == com.airbnb.lottie.o.f37650a) {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar = this.Q;
            if (aVar != null) {
                F(aVar);
            }
            if (jVar == null) {
                this.Q = null;
                return;
            }
            q qVar = new q(jVar);
            this.Q = qVar;
            qVar.a(this);
            i(this.Q);
            return;
        }
        if (t10 == com.airbnb.lottie.o.f37651b) {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2 = this.S;
            if (aVar2 != null) {
                F(aVar2);
            }
            if (jVar == null) {
                this.S = null;
                return;
            }
            q qVar2 = new q(jVar);
            this.S = qVar2;
            qVar2.a(this);
            i(this.S);
            return;
        }
        if (t10 == com.airbnb.lottie.o.f37668s) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar3 = this.U;
            if (aVar3 != null) {
                F(aVar3);
            }
            if (jVar == null) {
                this.U = null;
                return;
            }
            q qVar3 = new q(jVar);
            this.U = qVar3;
            qVar3.a(this);
            i(this.U);
            return;
        }
        if (t10 == com.airbnb.lottie.o.f37669t) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar4 = this.W;
            if (aVar4 != null) {
                F(aVar4);
            }
            if (jVar == null) {
                this.W = null;
                return;
            }
            q qVar4 = new q(jVar);
            this.W = qVar4;
            qVar4.a(this);
            i(this.W);
            return;
        }
        if (t10 == com.airbnb.lottie.o.F) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar5 = this.Y;
            if (aVar5 != null) {
                F(aVar5);
            }
            if (jVar == null) {
                this.Y = null;
                return;
            }
            q qVar5 = new q(jVar);
            this.Y = qVar5;
            qVar5.a(this);
            i(this.Y);
            return;
        }
        if (t10 == com.airbnb.lottie.o.M) {
            com.airbnb.lottie.animation.keyframe.a<Typeface, Typeface> aVar6 = this.Z;
            if (aVar6 != null) {
                F(aVar6);
            }
            if (jVar == null) {
                this.Z = null;
                return;
            }
            q qVar6 = new q(jVar);
            this.Z = qVar6;
            qVar6.a(this);
            i(this.Z);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    void t(Canvas canvas, Matrix matrix, int i10) {
        canvas.save();
        if (!this.N.I0()) {
            canvas.concat(matrix);
        }
        DocumentData documentDataH = this.M.h();
        com.airbnb.lottie.model.b bVar = this.O.g().get(documentDataH.f37445b);
        if (bVar == null) {
            canvas.restore();
            return;
        }
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar = this.Q;
        if (aVar != null) {
            this.I.setColor(aVar.h().intValue());
        } else {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2 = this.P;
            if (aVar2 != null) {
                this.I.setColor(aVar2.h().intValue());
            } else {
                this.I.setColor(documentDataH.f37451h);
            }
        }
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar3 = this.S;
        if (aVar3 != null) {
            this.J.setColor(aVar3.h().intValue());
        } else {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar4 = this.R;
            if (aVar4 != null) {
                this.J.setColor(aVar4.h().intValue());
            } else {
                this.J.setColor(documentDataH.f37452i);
            }
        }
        int iIntValue = ((this.f37634v.h() == null ? 100 : this.f37634v.h().h().intValue()) * 255) / 100;
        this.I.setAlpha(iIntValue);
        this.J.setAlpha(iIntValue);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar5 = this.U;
        if (aVar5 != null) {
            this.J.setStrokeWidth(aVar5.h().floatValue());
        } else {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar6 = this.T;
            if (aVar6 != null) {
                this.J.setStrokeWidth(aVar6.h().floatValue());
            } else {
                this.J.setStrokeWidth(documentDataH.f37453j * com.airbnb.lottie.utils.j.e() * com.airbnb.lottie.utils.j.g(matrix));
            }
        }
        if (this.N.I0()) {
            V(documentDataH, matrix, bVar, canvas);
        } else {
            W(documentDataH, bVar, matrix, canvas);
        }
        canvas.restore();
    }
}
