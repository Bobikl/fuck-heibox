package com.airbnb.lottie.parser;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: GradientColorParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class o implements n0<com.airbnb.lottie.model.content.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37787a;

    public o(int i10) {
        this.f37787a = i10;
    }

    private void b(com.airbnb.lottie.model.content.d dVar, List<Float> list) {
        int i10 = this.f37787a * 4;
        if (list.size() <= i10) {
            return;
        }
        int size = (list.size() - i10) / 2;
        double[] dArr = new double[size];
        double[] dArr2 = new double[size];
        int i11 = 0;
        while (i10 < list.size()) {
            if (i10 % 2 == 0) {
                dArr[i11] = list.get(i10).floatValue();
            } else {
                dArr2[i11] = list.get(i10).floatValue();
                i11++;
            }
            i10++;
        }
        for (int i12 = 0; i12 < dVar.c(); i12++) {
            int i13 = dVar.a()[i12];
            dVar.a()[i12] = Color.argb(c(dVar.b()[i12], dArr, dArr2), Color.red(i13), Color.green(i13), Color.blue(i13));
        }
    }

    @androidx.annotation.f0(from = 0, to = 255)
    private int c(double d10, double[] dArr, double[] dArr2) {
        double dJ;
        for (int i10 = 1; i10 < dArr.length; i10++) {
            int i11 = i10 - 1;
            double d11 = dArr[i11];
            double d12 = dArr[i10];
            if (d12 >= d10) {
                dJ = com.airbnb.lottie.utils.i.j(dArr2[i11], dArr2[i10], com.airbnb.lottie.utils.i.b((d10 - d11) / (d12 - d11), 0.0d, 1.0d));
                return (int) (dJ * 255.0d);
            }
        }
        dJ = dArr2[dArr2.length - 1];
        return (int) (dJ * 255.0d);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008c  */
    @Override // com.airbnb.lottie.parser.n0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.model.content.d a(JsonReader jsonReader, float f10) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z10 = jsonReader.p() == JsonReader.Token.BEGIN_ARRAY;
        if (z10) {
            jsonReader.b();
        }
        while (jsonReader.f()) {
            arrayList.add(Float.valueOf((float) jsonReader.i()));
        }
        if (z10) {
            jsonReader.d();
        }
        if (this.f37787a == -1) {
            this.f37787a = arrayList.size() / 4;
        }
        int i10 = this.f37787a;
        float[] fArr = new float[i10];
        int[] iArr = new int[i10];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f37787a * 4; i13++) {
            int i14 = i13 / 4;
            double dFloatValue = arrayList.get(i13).floatValue();
            int i15 = i13 % 4;
            if (i15 != 0) {
                if (i15 == 1) {
                    i11 = (int) (dFloatValue * 255.0d);
                } else if (i15 == 2) {
                    i12 = (int) (dFloatValue * 255.0d);
                } else if (i15 == 3) {
                    iArr[i14] = Color.argb(255, i11, i12, (int) (dFloatValue * 255.0d));
                }
            } else if (i14 > 0) {
                float f11 = (float) dFloatValue;
                if (fArr[i14 - 1] >= f11) {
                    fArr[i14] = f11 + 0.01f;
                } else {
                    fArr[i14] = (float) dFloatValue;
                }
            } else {
                fArr[i14] = (float) dFloatValue;
            }
        }
        com.airbnb.lottie.model.content.d dVar = new com.airbnb.lottie.model.content.d(fArr, iArr);
        b(dVar, arrayList);
        return dVar;
    }
}
