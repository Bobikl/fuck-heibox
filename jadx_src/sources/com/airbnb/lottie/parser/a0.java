package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: PathKeyframeParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class a0 {
    private a0() {
    }

    static com.airbnb.lottie.animation.keyframe.i a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        return new com.airbnb.lottie.animation.keyframe.i(gVar, t.c(jsonReader, gVar, com.airbnb.lottie.utils.j.e(), b0.f37681a, jsonReader.p() == JsonReader.Token.BEGIN_OBJECT, false));
    }
}
