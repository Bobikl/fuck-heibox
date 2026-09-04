package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: ShapePathParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static JsonReader.a f37712a = JsonReader.a.a("nm", "ind", "ks", "hd");

    private k0() {
    }

    static com.airbnb.lottie.model.content.l a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        int iK = 0;
        String strN = null;
        com.airbnb.lottie.model.animatable.h hVarK = null;
        boolean zG = false;
        while (jsonReader.f()) {
            int iR = jsonReader.r(f37712a);
            if (iR == 0) {
                strN = jsonReader.n();
            } else if (iR == 1) {
                iK = jsonReader.k();
            } else if (iR == 2) {
                hVarK = d.k(jsonReader, gVar);
            } else if (iR != 3) {
                jsonReader.t();
            } else {
                zG = jsonReader.g();
            }
        }
        return new com.airbnb.lottie.model.content.l(strN, iK, hVarK, zG);
    }
}
