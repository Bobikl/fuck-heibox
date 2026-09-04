package com.airbnb.lottie.parser;

import android.graphics.Path;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: compiled from: ShapeFillParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f37698a = JsonReader.a.a("nm", ak.aF, "o", "fillEnabled", "r", "hd");

    private i0() {
    }

    static com.airbnb.lottie.model.content.j a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        com.airbnb.lottie.model.animatable.d dVarH = null;
        boolean zG = false;
        boolean zG2 = false;
        int iK = 1;
        String strN = null;
        com.airbnb.lottie.model.animatable.a aVarC = null;
        while (jsonReader.f()) {
            int iR = jsonReader.r(f37698a);
            if (iR == 0) {
                strN = jsonReader.n();
            } else if (iR == 1) {
                aVarC = d.c(jsonReader, gVar);
            } else if (iR == 2) {
                dVarH = d.h(jsonReader, gVar);
            } else if (iR == 3) {
                zG = jsonReader.g();
            } else if (iR == 4) {
                iK = jsonReader.k();
            } else if (iR != 5) {
                jsonReader.s();
                jsonReader.t();
            } else {
                zG2 = jsonReader.g();
            }
        }
        return new com.airbnb.lottie.model.content.j(strN, zG, iK == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVarC, dVarH == null ? new com.airbnb.lottie.model.animatable.d(Collections.singletonList(new com.airbnb.lottie.value.a(100))) : dVarH, zG2);
    }
}
