package com.airbnb.lottie.parser;

import android.graphics.Path;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: compiled from: GradientFillParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f37788a = JsonReader.a.a("nm", "g", "o", "t", ak.aB, "e", "r", "hd");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final JsonReader.a f37789b = JsonReader.a.a("p", "k");

    private p() {
    }

    static com.airbnb.lottie.model.content.e a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        com.airbnb.lottie.model.animatable.d dVarH = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strN = null;
        GradientType gradientType = null;
        com.airbnb.lottie.model.animatable.c cVarG = null;
        com.airbnb.lottie.model.animatable.f fVarI = null;
        com.airbnb.lottie.model.animatable.f fVarI2 = null;
        boolean zG = false;
        while (jsonReader.f()) {
            switch (jsonReader.r(f37788a)) {
                case 0:
                    strN = jsonReader.n();
                    break;
                case 1:
                    int iK = -1;
                    jsonReader.c();
                    while (jsonReader.f()) {
                        int iR = jsonReader.r(f37789b);
                        if (iR == 0) {
                            iK = jsonReader.k();
                        } else if (iR != 1) {
                            jsonReader.s();
                            jsonReader.t();
                        } else {
                            cVarG = d.g(jsonReader, gVar, iK);
                        }
                    }
                    jsonReader.e();
                    break;
                case 2:
                    dVarH = d.h(jsonReader, gVar);
                    break;
                case 3:
                    gradientType = jsonReader.k() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                    break;
                case 4:
                    fVarI = d.i(jsonReader, gVar);
                    break;
                case 5:
                    fVarI2 = d.i(jsonReader, gVar);
                    break;
                case 6:
                    fillType = jsonReader.k() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    zG = jsonReader.g();
                    break;
                default:
                    jsonReader.s();
                    jsonReader.t();
                    break;
            }
        }
        return new com.airbnb.lottie.model.content.e(strN, gradientType, fillType, cVarG, dVarH == null ? new com.airbnb.lottie.model.animatable.d(Collections.singletonList(new com.airbnb.lottie.value.a(100))) : dVarH, fVarI, fVarI2, null, null, zG);
    }
}
