package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: ScaleXYParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class g0 implements n0<com.airbnb.lottie.value.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f37692a = new g0();

    private g0() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.value.k a(JsonReader jsonReader, float f10) throws IOException {
        boolean z10 = jsonReader.p() == JsonReader.Token.BEGIN_ARRAY;
        if (z10) {
            jsonReader.b();
        }
        float fI = (float) jsonReader.i();
        float fI2 = (float) jsonReader.i();
        while (jsonReader.f()) {
            jsonReader.t();
        }
        if (z10) {
            jsonReader.d();
        }
        return new com.airbnb.lottie.value.k((fI / 100.0f) * f10, (fI2 / 100.0f) * f10);
    }
}
