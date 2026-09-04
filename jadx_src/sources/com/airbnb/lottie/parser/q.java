package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: GradientStrokeParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static JsonReader.a f37790a = JsonReader.a.a("nm", "g", "o", "t", ak.aB, "e", RXScreenCaptureService.KEY_WIDTH, "lc", "lj", "ml", "hd", "d");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final JsonReader.a f37791b = JsonReader.a.a("p", "k");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final JsonReader.a f37792c = JsonReader.a.a("n", "v");

    private q() {
    }

    static com.airbnb.lottie.model.content.f a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        float fI = 0.0f;
        String strN = null;
        GradientType gradientType = null;
        com.airbnb.lottie.model.animatable.c cVarG = null;
        com.airbnb.lottie.model.animatable.f fVarI = null;
        com.airbnb.lottie.model.animatable.f fVarI2 = null;
        com.airbnb.lottie.model.animatable.b bVarE = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        boolean zG = false;
        com.airbnb.lottie.model.animatable.d dVar = null;
        while (jsonReader.f()) {
            switch (jsonReader.r(f37790a)) {
                case 0:
                    strN = jsonReader.n();
                    break;
                case 1:
                    int iK = -1;
                    jsonReader.c();
                    while (jsonReader.f()) {
                        int iR = jsonReader.r(f37791b);
                        if (iR == 0) {
                            iK = jsonReader.k();
                        } else if (iR != 1) {
                            jsonReader.s();
                            jsonReader.t();
                        } else {
                            cVarG = d.g(jsonReader, gVar, iK);
                        }
                        cVarG = cVarG;
                    }
                    jsonReader.e();
                    break;
                case 2:
                    dVar = d.h(jsonReader, gVar);
                    break;
                case 3:
                    gradientType = jsonReader.k() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                    break;
                case 4:
                    fVarI = d.i(jsonReader, gVar);
                    break;
                case 5:
                    fVarI2 = d.i(jsonReader, gVar);
                    break;
                case 6:
                    bVarE = d.e(jsonReader, gVar);
                    break;
                case 7:
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.k() - 1];
                    break;
                case 8:
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.k() - 1];
                    break;
                case 9:
                    fI = (float) jsonReader.i();
                    break;
                case 10:
                    zG = jsonReader.g();
                    break;
                case 11:
                    jsonReader.b();
                    while (jsonReader.f()) {
                        jsonReader.c();
                        String strN2 = null;
                        com.airbnb.lottie.model.animatable.b bVarE2 = null;
                        while (jsonReader.f()) {
                            int iR2 = jsonReader.r(f37792c);
                            if (iR2 != 0) {
                                com.airbnb.lottie.model.animatable.b bVar2 = bVar;
                                if (iR2 != 1) {
                                    jsonReader.s();
                                    jsonReader.t();
                                } else {
                                    bVarE2 = d.e(jsonReader, gVar);
                                }
                                bVar = bVar2;
                            } else {
                                strN2 = jsonReader.n();
                            }
                        }
                        com.airbnb.lottie.model.animatable.b bVar3 = bVar;
                        jsonReader.e();
                        if (strN2.equals("o")) {
                            bVar = bVarE2;
                        } else {
                            if (strN2.equals("d") || strN2.equals("g")) {
                                gVar.y(true);
                                arrayList.add(bVarE2);
                            }
                            bVar = bVar3;
                        }
                    }
                    com.airbnb.lottie.model.animatable.b bVar4 = bVar;
                    jsonReader.d();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    bVar = bVar4;
                    break;
                default:
                    jsonReader.s();
                    jsonReader.t();
                    break;
            }
        }
        if (dVar == null) {
            dVar = new com.airbnb.lottie.model.animatable.d(Collections.singletonList(new com.airbnb.lottie.value.a(100)));
        }
        return new com.airbnb.lottie.model.content.f(strN, gradientType, cVarG, dVar, fVarI, fVarI2, bVarE, lineCapType, lineJoinType, fI, arrayList, bVar, zG);
    }
}
