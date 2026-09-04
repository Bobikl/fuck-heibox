package com.airbnb.lottie.parser;

import androidx.annotation.p0;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: BlurEffectParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f37686a = JsonReader.a.a("ef");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final JsonReader.a f37687b = JsonReader.a.a(x5.a.f141074s, "v");

    e() {
    }

    @p0
    private static com.airbnb.lottie.model.content.a a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        jsonReader.c();
        com.airbnb.lottie.model.content.a aVar = null;
        while (true) {
            boolean z10 = false;
            while (true) {
                if (!jsonReader.f()) {
                    jsonReader.e();
                    return aVar;
                }
                int iR = jsonReader.r(f37687b);
                if (iR != 0) {
                    if (iR != 1) {
                        jsonReader.s();
                        jsonReader.t();
                    } else if (z10) {
                        aVar = new com.airbnb.lottie.model.content.a(d.e(jsonReader, gVar));
                    } else {
                        jsonReader.t();
                    }
                } else if (jsonReader.k() == 0) {
                    z10 = true;
                }
            }
        }
    }

    @p0
    static com.airbnb.lottie.model.content.a b(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        com.airbnb.lottie.model.content.a aVar = null;
        while (jsonReader.f()) {
            if (jsonReader.r(f37686a) != 0) {
                jsonReader.s();
                jsonReader.t();
            } else {
                jsonReader.b();
                while (jsonReader.f()) {
                    com.airbnb.lottie.model.content.a aVarA = a(jsonReader, gVar);
                    if (aVarA != null) {
                        aVar = aVarA;
                    }
                }
                jsonReader.d();
            }
        }
        return aVar;
    }
}
