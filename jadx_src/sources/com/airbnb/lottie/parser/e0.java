package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.umeng.analytics.pro.ak;
import java.io.IOException;

/* JADX INFO: compiled from: RectangleShapeParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static JsonReader.a f37688a = JsonReader.a.a("nm", "p", ak.aB, "r", "hd");

    private e0() {
    }

    static com.airbnb.lottie.model.content.g a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        String strN = null;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVarB = null;
        com.airbnb.lottie.model.animatable.f fVarI = null;
        com.airbnb.lottie.model.animatable.b bVarE = null;
        boolean zG = false;
        while (jsonReader.f()) {
            int iR = jsonReader.r(f37688a);
            if (iR == 0) {
                strN = jsonReader.n();
            } else if (iR == 1) {
                mVarB = a.b(jsonReader, gVar);
            } else if (iR == 2) {
                fVarI = d.i(jsonReader, gVar);
            } else if (iR == 3) {
                bVarE = d.e(jsonReader, gVar);
            } else if (iR != 4) {
                jsonReader.t();
            } else {
                zG = jsonReader.g();
            }
        }
        return new com.airbnb.lottie.model.content.g(strN, mVarB, fVarI, bVarE, zG);
    }
}
