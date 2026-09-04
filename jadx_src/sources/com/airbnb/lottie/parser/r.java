package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: IntegerParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class r implements n0<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f37793a = new r();

    private r() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(JsonReader jsonReader, float f10) throws IOException {
        return Integer.valueOf(Math.round(s.g(jsonReader) * f10));
    }
}
