package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: ShapeStrokeParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static JsonReader.a f37714a = JsonReader.a.a("nm", ak.aF, RXScreenCaptureService.KEY_WIDTH, "o", "lc", "lj", "ml", "hd", "d");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final JsonReader.a f37715b = JsonReader.a.a("n", "v");

    private l0() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    static ShapeStroke a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean zG = false;
        float fI = 0.0f;
        String strN = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.a aVarC = null;
        com.airbnb.lottie.model.animatable.b bVarE = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        com.airbnb.lottie.model.animatable.d dVar = null;
        while (jsonReader.f()) {
            switch (jsonReader.r(f37714a)) {
                case 0:
                    strN = jsonReader.n();
                    break;
                case 1:
                    aVarC = d.c(jsonReader, gVar);
                    break;
                case 2:
                    bVarE = d.e(jsonReader, gVar);
                    break;
                case 3:
                    dVar = d.h(jsonReader, gVar);
                    break;
                case 4:
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.k() - 1];
                    break;
                case 5:
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.k() - 1];
                    break;
                case 6:
                    fI = (float) jsonReader.i();
                    break;
                case 7:
                    zG = jsonReader.g();
                    break;
                case 8:
                    jsonReader.b();
                    while (jsonReader.f()) {
                        jsonReader.c();
                        String strN2 = null;
                        com.airbnb.lottie.model.animatable.b bVarE2 = null;
                        while (jsonReader.f()) {
                            int iR = jsonReader.r(f37715b);
                            if (iR == 0) {
                                strN2 = jsonReader.n();
                            } else if (iR != 1) {
                                jsonReader.s();
                                jsonReader.t();
                            } else {
                                bVarE2 = d.e(jsonReader, gVar);
                            }
                        }
                        jsonReader.e();
                        strN2.hashCode();
                        switch (strN2) {
                            case "d":
                            case "g":
                                gVar.y(true);
                                arrayList.add(bVarE2);
                                break;
                            case "o":
                                bVar = bVarE2;
                                break;
                        }
                    }
                    jsonReader.d();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    break;
                default:
                    jsonReader.t();
                    break;
            }
        }
        if (dVar == null) {
            dVar = new com.airbnb.lottie.model.animatable.d(Collections.singletonList(new com.airbnb.lottie.value.a(100)));
        }
        return new ShapeStroke(strN, bVar, arrayList, aVarC, dVar, bVarE, lineCapType, lineJoinType, fI, zG);
    }
}
