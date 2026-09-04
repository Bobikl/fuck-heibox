package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.umeng.analytics.pro.ak;
import java.io.IOException;

/* JADX INFO: compiled from: ShapeTrimPathParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static JsonReader.a f37718a = JsonReader.a.a(ak.aB, "e", "o", "nm", "m", "hd");

    private m0() {
    }

    static ShapeTrimPath a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        boolean zG = false;
        String strN = null;
        ShapeTrimPath.Type typeForId = null;
        com.airbnb.lottie.model.animatable.b bVarF = null;
        com.airbnb.lottie.model.animatable.b bVarF2 = null;
        com.airbnb.lottie.model.animatable.b bVarF3 = null;
        while (jsonReader.f()) {
            int iR = jsonReader.r(f37718a);
            if (iR == 0) {
                bVarF = d.f(jsonReader, gVar, false);
            } else if (iR == 1) {
                bVarF2 = d.f(jsonReader, gVar, false);
            } else if (iR == 2) {
                bVarF3 = d.f(jsonReader, gVar, false);
            } else if (iR == 3) {
                strN = jsonReader.n();
            } else if (iR == 4) {
                typeForId = ShapeTrimPath.Type.forId(jsonReader.k());
            } else if (iR != 5) {
                jsonReader.t();
            } else {
                zG = jsonReader.g();
            }
        }
        return new ShapeTrimPath(strN, typeForId, bVarF, bVarF2, bVarF3, zG);
    }
}
