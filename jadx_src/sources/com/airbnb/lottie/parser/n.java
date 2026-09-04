package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: FontParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f37786a = JsonReader.a.a("fFamily", "fName", "fStyle", "ascent");

    private n() {
    }

    static com.airbnb.lottie.model.b a(JsonReader jsonReader) throws IOException {
        jsonReader.c();
        String strN = null;
        String strN2 = null;
        float fI = 0.0f;
        String strN3 = null;
        while (jsonReader.f()) {
            int iR = jsonReader.r(f37786a);
            if (iR == 0) {
                strN = jsonReader.n();
            } else if (iR == 1) {
                strN3 = jsonReader.n();
            } else if (iR == 2) {
                strN2 = jsonReader.n();
            } else if (iR != 3) {
                jsonReader.s();
                jsonReader.t();
            } else {
                fI = (float) jsonReader.i();
            }
        }
        jsonReader.e();
        return new com.airbnb.lottie.model.b(strN, strN3, strN2, fI);
    }
}
