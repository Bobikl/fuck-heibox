package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: PointFParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class c0 implements n0<PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f37684a = new c0();

    private c0() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(JsonReader jsonReader, float f10) throws IOException {
        JsonReader.Token tokenP = jsonReader.p();
        if (tokenP != JsonReader.Token.BEGIN_ARRAY && tokenP != JsonReader.Token.BEGIN_OBJECT) {
            if (tokenP == JsonReader.Token.NUMBER) {
                PointF pointF = new PointF(((float) jsonReader.i()) * f10, ((float) jsonReader.i()) * f10);
                while (jsonReader.f()) {
                    jsonReader.t();
                }
                return pointF;
            }
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + tokenP);
        }
        return s.e(jsonReader, f10);
    }
}
