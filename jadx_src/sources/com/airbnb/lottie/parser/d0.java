package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.umeng.analytics.pro.ak;
import java.io.IOException;

/* JADX INFO: compiled from: PolystarShapeParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f37685a = JsonReader.a.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", ak.f104422ae, "hd");

    private d0() {
    }

    static PolystarShape a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        boolean zG = false;
        String strN = null;
        PolystarShape.Type typeForValue = null;
        com.airbnb.lottie.model.animatable.b bVarF = null;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVarB = null;
        com.airbnb.lottie.model.animatable.b bVarF2 = null;
        com.airbnb.lottie.model.animatable.b bVarE = null;
        com.airbnb.lottie.model.animatable.b bVarE2 = null;
        com.airbnb.lottie.model.animatable.b bVarF3 = null;
        com.airbnb.lottie.model.animatable.b bVarF4 = null;
        while (jsonReader.f()) {
            switch (jsonReader.r(f37685a)) {
                case 0:
                    strN = jsonReader.n();
                    break;
                case 1:
                    typeForValue = PolystarShape.Type.forValue(jsonReader.k());
                    break;
                case 2:
                    bVarF = d.f(jsonReader, gVar, false);
                    break;
                case 3:
                    mVarB = a.b(jsonReader, gVar);
                    break;
                case 4:
                    bVarF2 = d.f(jsonReader, gVar, false);
                    break;
                case 5:
                    bVarE2 = d.e(jsonReader, gVar);
                    break;
                case 6:
                    bVarF4 = d.f(jsonReader, gVar, false);
                    break;
                case 7:
                    bVarE = d.e(jsonReader, gVar);
                    break;
                case 8:
                    bVarF3 = d.f(jsonReader, gVar, false);
                    break;
                case 9:
                    zG = jsonReader.g();
                    break;
                default:
                    jsonReader.s();
                    jsonReader.t();
                    break;
            }
        }
        return new PolystarShape(strN, typeForValue, bVarF, mVarB, bVarF2, bVarE, bVarE2, bVarF3, bVarF4, zG);
    }
}
