package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: AnimatablePathValueParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f37678a = JsonReader.a.a("k", "x", "y");

    private a() {
    }

    public static com.airbnb.lottie.model.animatable.e a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.p() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.b();
            while (jsonReader.f()) {
                arrayList.add(a0.a(jsonReader, gVar));
            }
            jsonReader.d();
            u.b(arrayList);
        } else {
            arrayList.add(new com.airbnb.lottie.value.a(s.e(jsonReader, com.airbnb.lottie.utils.j.e())));
        }
        return new com.airbnb.lottie.model.animatable.e(arrayList);
    }

    static com.airbnb.lottie.model.animatable.m<PointF, PointF> b(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        jsonReader.c();
        com.airbnb.lottie.model.animatable.e eVarA = null;
        com.airbnb.lottie.model.animatable.b bVarE = null;
        boolean z10 = false;
        com.airbnb.lottie.model.animatable.b bVarE2 = null;
        while (jsonReader.p() != JsonReader.Token.END_OBJECT) {
            int iR = jsonReader.r(f37678a);
            if (iR == 0) {
                eVarA = a(jsonReader, gVar);
            } else if (iR != 1) {
                if (iR != 2) {
                    jsonReader.s();
                    jsonReader.t();
                } else if (jsonReader.p() == JsonReader.Token.STRING) {
                    jsonReader.t();
                    z10 = true;
                } else {
                    bVarE = d.e(jsonReader, gVar);
                }
            } else if (jsonReader.p() == JsonReader.Token.STRING) {
                jsonReader.t();
                z10 = true;
            } else {
                bVarE2 = d.e(jsonReader, gVar);
            }
        }
        jsonReader.e();
        if (z10) {
            gVar.a("Lottie doesn't support expressions.");
        }
        return eVarA != null ? eVarA : new com.airbnb.lottie.model.animatable.i(bVarE2, bVarE);
    }
}
