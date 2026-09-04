package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: ShapeDataParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class h0 implements n0<com.airbnb.lottie.model.content.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f37694a = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final JsonReader.a f37695b = JsonReader.a.a(ak.aF, "v", "i", "o");

    private h0() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.model.content.i a(JsonReader jsonReader, float f10) throws IOException {
        if (jsonReader.p() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.b();
        }
        jsonReader.c();
        List<PointF> listF = null;
        List<PointF> listF2 = null;
        List<PointF> listF3 = null;
        boolean zG = false;
        while (jsonReader.f()) {
            int iR = jsonReader.r(f37695b);
            if (iR == 0) {
                zG = jsonReader.g();
            } else if (iR == 1) {
                listF = s.f(jsonReader, f10);
            } else if (iR == 2) {
                listF2 = s.f(jsonReader, f10);
            } else if (iR != 3) {
                jsonReader.s();
                jsonReader.t();
            } else {
                listF3 = s.f(jsonReader, f10);
            }
        }
        jsonReader.e();
        if (jsonReader.p() == JsonReader.Token.END_ARRAY) {
            jsonReader.d();
        }
        if (listF == null || listF2 == null || listF3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listF.isEmpty()) {
            return new com.airbnb.lottie.model.content.i(new PointF(), false, Collections.emptyList());
        }
        int size = listF.size();
        PointF pointF = listF.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 1; i10 < size; i10++) {
            PointF pointF2 = listF.get(i10);
            int i11 = i10 - 1;
            arrayList.add(new com.airbnb.lottie.model.a(com.airbnb.lottie.utils.i.a(listF.get(i11), listF3.get(i11)), com.airbnb.lottie.utils.i.a(pointF2, listF2.get(i10)), pointF2));
        }
        if (zG) {
            PointF pointF3 = listF.get(0);
            int i12 = size - 1;
            arrayList.add(new com.airbnb.lottie.model.a(com.airbnb.lottie.utils.i.a(listF.get(i12), listF3.get(i12)), com.airbnb.lottie.utils.i.a(pointF3, listF2.get(0)), pointF3));
        }
        return new com.airbnb.lottie.model.content.i(pointF, zG, arrayList);
    }
}
