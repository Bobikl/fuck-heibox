package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.umeng.analytics.pro.ak;
import java.io.IOException;

/* JADX INFO: compiled from: RepeaterParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static JsonReader.a f37690a = JsonReader.a.a("nm", ak.aF, "o", "tr", "hd");

    private f0() {
    }

    static com.airbnb.lottie.model.content.h a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        boolean zG = false;
        String strN = null;
        com.airbnb.lottie.model.animatable.b bVarF = null;
        com.airbnb.lottie.model.animatable.b bVarF2 = null;
        com.airbnb.lottie.model.animatable.l lVarG = null;
        while (jsonReader.f()) {
            int iR = jsonReader.r(f37690a);
            if (iR == 0) {
                strN = jsonReader.n();
            } else if (iR == 1) {
                bVarF = d.f(jsonReader, gVar, false);
            } else if (iR == 2) {
                bVarF2 = d.f(jsonReader, gVar, false);
            } else if (iR == 3) {
                lVarG = c.g(jsonReader, gVar);
            } else if (iR != 4) {
                jsonReader.t();
            } else {
                zG = jsonReader.g();
            }
        }
        return new com.airbnb.lottie.model.content.h(strN, bVarF, bVarF2, lVarG, zG);
    }
}
