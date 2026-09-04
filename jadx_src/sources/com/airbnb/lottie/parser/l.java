package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: FloatParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class l implements n0<Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f37713a = new l();

    private l() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float a(JsonReader jsonReader, float f10) throws IOException {
        return Float.valueOf(s.g(jsonReader) * f10);
    }
}
