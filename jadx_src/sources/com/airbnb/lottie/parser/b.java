package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.umeng.analytics.pro.ak;
import java.io.IOException;

/* JADX INFO: compiled from: AnimatableTextPropertiesParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static JsonReader.a f37679a = JsonReader.a.a(ak.av);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static JsonReader.a f37680b = JsonReader.a.a("fc", "sc", "sw", "t");

    private b() {
    }

    public static com.airbnb.lottie.model.animatable.k a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        jsonReader.c();
        com.airbnb.lottie.model.animatable.k kVarB = null;
        while (jsonReader.f()) {
            if (jsonReader.r(f37679a) != 0) {
                jsonReader.s();
                jsonReader.t();
            } else {
                kVarB = b(jsonReader, gVar);
            }
        }
        jsonReader.e();
        return kVarB == null ? new com.airbnb.lottie.model.animatable.k(null, null, null, null) : kVarB;
    }

    private static com.airbnb.lottie.model.animatable.k b(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        jsonReader.c();
        com.airbnb.lottie.model.animatable.a aVarC = null;
        com.airbnb.lottie.model.animatable.a aVarC2 = null;
        com.airbnb.lottie.model.animatable.b bVarE = null;
        com.airbnb.lottie.model.animatable.b bVarE2 = null;
        while (jsonReader.f()) {
            int iR = jsonReader.r(f37680b);
            if (iR == 0) {
                aVarC = d.c(jsonReader, gVar);
            } else if (iR == 1) {
                aVarC2 = d.c(jsonReader, gVar);
            } else if (iR == 2) {
                bVarE = d.e(jsonReader, gVar);
            } else if (iR != 3) {
                jsonReader.s();
                jsonReader.t();
            } else {
                bVarE2 = d.e(jsonReader, gVar);
            }
        }
        jsonReader.e();
        return new com.airbnb.lottie.model.animatable.k(aVarC, aVarC2, bVarE, bVarE2);
    }
}
