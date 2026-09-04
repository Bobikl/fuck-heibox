package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.umeng.analytics.pro.ak;
import java.io.IOException;

/* JADX INFO: compiled from: CircleShapeParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static JsonReader.a f37689a = JsonReader.a.a("nm", "p", ak.aB, "hd", "d");

    private f() {
    }

    static com.airbnb.lottie.model.content.b a(JsonReader jsonReader, com.airbnb.lottie.g gVar, int i10) throws IOException {
        boolean z10 = i10 == 3;
        boolean zG = false;
        String strN = null;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVarB = null;
        com.airbnb.lottie.model.animatable.f fVarI = null;
        while (jsonReader.f()) {
            int iR = jsonReader.r(f37689a);
            if (iR == 0) {
                strN = jsonReader.n();
            } else if (iR == 1) {
                mVarB = a.b(jsonReader, gVar);
            } else if (iR == 2) {
                fVarI = d.i(jsonReader, gVar);
            } else if (iR == 3) {
                zG = jsonReader.g();
            } else if (iR != 4) {
                jsonReader.s();
                jsonReader.t();
            } else {
                z10 = jsonReader.k() == 3;
            }
        }
        return new com.airbnb.lottie.model.content.b(strN, mVarB, fVarI, z10, zG);
    }
}
