package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: FontCharacterParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f37716a = JsonReader.a.a("ch", UiKitSpanObj.TYPE_SIZE, RXScreenCaptureService.KEY_WIDTH, "style", "fFamily", "data");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final JsonReader.a f37717b = JsonReader.a.a("shapes");

    private m() {
    }

    static com.airbnb.lottie.model.c a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.c();
        String strN = null;
        String strN2 = null;
        double dI = 0.0d;
        double dI2 = 0.0d;
        char cCharAt = 0;
        while (jsonReader.f()) {
            int iR = jsonReader.r(f37716a);
            if (iR == 0) {
                cCharAt = jsonReader.n().charAt(0);
            } else if (iR == 1) {
                dI = jsonReader.i();
            } else if (iR == 2) {
                dI2 = jsonReader.i();
            } else if (iR == 3) {
                strN = jsonReader.n();
            } else if (iR == 4) {
                strN2 = jsonReader.n();
            } else if (iR != 5) {
                jsonReader.s();
                jsonReader.t();
            } else {
                jsonReader.c();
                while (jsonReader.f()) {
                    if (jsonReader.r(f37717b) != 0) {
                        jsonReader.s();
                        jsonReader.t();
                    } else {
                        jsonReader.b();
                        while (jsonReader.f()) {
                            arrayList.add((com.airbnb.lottie.model.content.k) h.a(jsonReader, gVar));
                        }
                        jsonReader.d();
                    }
                }
                jsonReader.e();
            }
        }
        jsonReader.e();
        return new com.airbnb.lottie.model.c(arrayList, cCharAt, dI, dI2, strN, strN2);
    }
}
