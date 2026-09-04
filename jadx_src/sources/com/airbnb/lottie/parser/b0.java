package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: PathParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class b0 implements n0<PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f37681a = new b0();

    private b0() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(JsonReader jsonReader, float f10) throws IOException {
        return s.e(jsonReader, f10);
    }
}
