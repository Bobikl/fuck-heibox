package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: JsonUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f37794a = JsonReader.a.a("x", "y");

    /* JADX INFO: compiled from: JsonUtils.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37795a;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            f37795a = iArr;
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37795a[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37795a[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private s() {
    }

    private static PointF a(JsonReader jsonReader, float f10) throws IOException {
        jsonReader.b();
        float fI = (float) jsonReader.i();
        float fI2 = (float) jsonReader.i();
        while (jsonReader.p() != JsonReader.Token.END_ARRAY) {
            jsonReader.t();
        }
        jsonReader.d();
        return new PointF(fI * f10, fI2 * f10);
    }

    private static PointF b(JsonReader jsonReader, float f10) throws IOException {
        float fI = (float) jsonReader.i();
        float fI2 = (float) jsonReader.i();
        while (jsonReader.f()) {
            jsonReader.t();
        }
        return new PointF(fI * f10, fI2 * f10);
    }

    private static PointF c(JsonReader jsonReader, float f10) throws IOException {
        jsonReader.c();
        float fG = 0.0f;
        float fG2 = 0.0f;
        while (jsonReader.f()) {
            int iR = jsonReader.r(f37794a);
            if (iR == 0) {
                fG = g(jsonReader);
            } else if (iR != 1) {
                jsonReader.s();
                jsonReader.t();
            } else {
                fG2 = g(jsonReader);
            }
        }
        jsonReader.e();
        return new PointF(fG * f10, fG2 * f10);
    }

    @androidx.annotation.l
    static int d(JsonReader jsonReader) throws IOException {
        jsonReader.b();
        int i10 = (int) (jsonReader.i() * 255.0d);
        int i11 = (int) (jsonReader.i() * 255.0d);
        int i12 = (int) (jsonReader.i() * 255.0d);
        while (jsonReader.f()) {
            jsonReader.t();
        }
        jsonReader.d();
        return Color.argb(255, i10, i11, i12);
    }

    static PointF e(JsonReader jsonReader, float f10) throws IOException {
        int i10 = a.f37795a[jsonReader.p().ordinal()];
        if (i10 == 1) {
            return b(jsonReader, f10);
        }
        if (i10 == 2) {
            return a(jsonReader, f10);
        }
        if (i10 == 3) {
            return c(jsonReader, f10);
        }
        throw new IllegalArgumentException("Unknown point starts with " + jsonReader.p());
    }

    static List<PointF> f(JsonReader jsonReader, float f10) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.b();
        while (jsonReader.p() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.b();
            arrayList.add(e(jsonReader, f10));
            jsonReader.d();
        }
        jsonReader.d();
        return arrayList;
    }

    static float g(JsonReader jsonReader) throws IOException {
        JsonReader.Token tokenP = jsonReader.p();
        int i10 = a.f37795a[tokenP.ordinal()];
        if (i10 == 1) {
            return (float) jsonReader.i();
        }
        if (i10 != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + tokenP);
        }
        jsonReader.b();
        float fI = (float) jsonReader.i();
        while (jsonReader.f()) {
            jsonReader.t();
        }
        jsonReader.d();
        return fI;
    }
}
