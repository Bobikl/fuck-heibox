package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: ShapeGroupParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static JsonReader.a f37704a = JsonReader.a.a("nm", "hd", "it");

    private j0() {
    }

    static com.airbnb.lottie.model.content.k a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String strN = null;
        boolean zG = false;
        while (jsonReader.f()) {
            int iR = jsonReader.r(f37704a);
            if (iR == 0) {
                strN = jsonReader.n();
            } else if (iR == 1) {
                zG = jsonReader.g();
            } else if (iR != 2) {
                jsonReader.t();
            } else {
                jsonReader.b();
                while (jsonReader.f()) {
                    com.airbnb.lottie.model.content.c cVarA = h.a(jsonReader, gVar);
                    if (cVarA != null) {
                        arrayList.add(cVarA);
                    }
                }
                jsonReader.d();
            }
        }
        return new com.airbnb.lottie.model.content.k(strN, arrayList, zG);
    }
}
