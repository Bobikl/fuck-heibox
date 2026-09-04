package com.airbnb.lottie.parser;

import android.graphics.Rect;
import androidx.collection.l2;
import androidx.collection.x0;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: LottieCompositionMoshiParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f37806a = JsonReader.a.a(RXScreenCaptureService.KEY_WIDTH, RXScreenCaptureService.KEY_HEIGHT, "ip", "op", SocializeProtocolConstants.PROTOCOL_KEY_FR, "v", "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static JsonReader.a f37807b = JsonReader.a.a("id", "layers", RXScreenCaptureService.KEY_WIDTH, RXScreenCaptureService.KEY_HEIGHT, "p", ak.aG);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final JsonReader.a f37808c = JsonReader.a.a("list");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final JsonReader.a f37809d = JsonReader.a.a(SocializeProtocolConstants.PROTOCOL_KEY_COMMENT_COUNT, "tm", "dr");

    public static com.airbnb.lottie.g a(JsonReader jsonReader) throws IOException {
        float fE = com.airbnb.lottie.utils.j.e();
        x0<Layer> x0Var = new x0<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        l2<com.airbnb.lottie.model.c> l2Var = new l2<>();
        com.airbnb.lottie.g gVar = new com.airbnb.lottie.g();
        jsonReader.c();
        float fI = 0.0f;
        float fI2 = 0.0f;
        float fI3 = 0.0f;
        int iK = 0;
        int iK2 = 0;
        while (jsonReader.f()) {
            switch (jsonReader.r(f37806a)) {
                case 0:
                    iK = jsonReader.k();
                    break;
                case 1:
                    iK2 = jsonReader.k();
                    break;
                case 2:
                    fI = (float) jsonReader.i();
                    break;
                case 3:
                    fI2 = ((float) jsonReader.i()) - 0.01f;
                    map3 = map3;
                    arrayList2 = arrayList2;
                    break;
                case 4:
                    fI3 = (float) jsonReader.i();
                    map3 = map3;
                    arrayList2 = arrayList2;
                    break;
                case 5:
                    String[] strArrSplit = jsonReader.n().split("\\.");
                    if (!com.airbnb.lottie.utils.j.j(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        gVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    map3 = map3;
                    arrayList2 = arrayList2;
                    break;
                case 6:
                    e(jsonReader, gVar, arrayList, x0Var);
                    map3 = map3;
                    arrayList2 = arrayList2;
                    break;
                case 7:
                    b(jsonReader, gVar, map, map2);
                    map3 = map3;
                    arrayList2 = arrayList2;
                    break;
                case 8:
                    d(jsonReader, map3);
                    map3 = map3;
                    arrayList2 = arrayList2;
                    break;
                case 9:
                    c(jsonReader, gVar, l2Var);
                    map3 = map3;
                    arrayList2 = arrayList2;
                    break;
                case 10:
                    f(jsonReader, gVar, arrayList2);
                    map3 = map3;
                    arrayList2 = arrayList2;
                    break;
                default:
                    jsonReader.s();
                    jsonReader.t();
                    map3 = map3;
                    arrayList2 = arrayList2;
                    break;
            }
        }
        gVar.w(new Rect(0, 0, (int) (iK * fE), (int) (iK2 * fE)), fI, fI2, fI3, arrayList, x0Var, map, map2, l2Var, map3, arrayList2);
        return gVar;
    }

    private static void b(JsonReader jsonReader, com.airbnb.lottie.g gVar, Map<String, List<Layer>> map, Map<String, com.airbnb.lottie.k> map2) throws IOException {
        jsonReader.b();
        while (jsonReader.f()) {
            ArrayList arrayList = new ArrayList();
            x0 x0Var = new x0();
            jsonReader.c();
            int iK = 0;
            int iK2 = 0;
            String strN = null;
            String strN2 = null;
            String strN3 = null;
            while (jsonReader.f()) {
                int iR = jsonReader.r(f37807b);
                if (iR == 0) {
                    strN = jsonReader.n();
                } else if (iR == 1) {
                    jsonReader.b();
                    while (jsonReader.f()) {
                        Layer layerB = v.b(jsonReader, gVar);
                        x0Var.m(layerB.d(), layerB);
                        arrayList.add(layerB);
                    }
                    jsonReader.d();
                } else if (iR == 2) {
                    iK = jsonReader.k();
                } else if (iR == 3) {
                    iK2 = jsonReader.k();
                } else if (iR == 4) {
                    strN2 = jsonReader.n();
                } else if (iR != 5) {
                    jsonReader.s();
                    jsonReader.t();
                } else {
                    strN3 = jsonReader.n();
                }
            }
            jsonReader.e();
            if (strN2 != null) {
                com.airbnb.lottie.k kVar = new com.airbnb.lottie.k(iK, iK2, strN, strN2, strN3);
                map2.put(kVar.e(), kVar);
            } else {
                map.put(strN, arrayList);
            }
        }
        jsonReader.d();
    }

    private static void c(JsonReader jsonReader, com.airbnb.lottie.g gVar, l2<com.airbnb.lottie.model.c> l2Var) throws IOException {
        jsonReader.b();
        while (jsonReader.f()) {
            com.airbnb.lottie.model.c cVarA = m.a(jsonReader, gVar);
            l2Var.n(cVarA.hashCode(), cVarA);
        }
        jsonReader.d();
    }

    private static void d(JsonReader jsonReader, Map<String, com.airbnb.lottie.model.b> map) throws IOException {
        jsonReader.c();
        while (jsonReader.f()) {
            if (jsonReader.r(f37808c) != 0) {
                jsonReader.s();
                jsonReader.t();
            } else {
                jsonReader.b();
                while (jsonReader.f()) {
                    com.airbnb.lottie.model.b bVarA = n.a(jsonReader);
                    map.put(bVarA.c(), bVarA);
                }
                jsonReader.d();
            }
        }
        jsonReader.e();
    }

    private static void e(JsonReader jsonReader, com.airbnb.lottie.g gVar, List<Layer> list, x0<Layer> x0Var) throws IOException {
        jsonReader.b();
        int i10 = 0;
        while (jsonReader.f()) {
            Layer layerB = v.b(jsonReader, gVar);
            if (layerB.f() == Layer.LayerType.IMAGE) {
                i10++;
            }
            list.add(layerB);
            x0Var.m(layerB.d(), layerB);
            if (i10 > 4) {
                com.airbnb.lottie.utils.f.e("You have " + i10 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.d();
    }

    private static void f(JsonReader jsonReader, com.airbnb.lottie.g gVar, List<com.airbnb.lottie.model.g> list) throws IOException {
        jsonReader.b();
        while (jsonReader.f()) {
            String strN = null;
            jsonReader.c();
            float fI = 0.0f;
            float fI2 = 0.0f;
            while (jsonReader.f()) {
                int iR = jsonReader.r(f37809d);
                if (iR == 0) {
                    strN = jsonReader.n();
                } else if (iR == 1) {
                    fI = (float) jsonReader.i();
                } else if (iR != 2) {
                    jsonReader.s();
                    jsonReader.t();
                } else {
                    fI2 = (float) jsonReader.i();
                }
            }
            jsonReader.e();
            list.add(new com.airbnb.lottie.model.g(strN, fI, fI2));
        }
        jsonReader.d();
    }
}
