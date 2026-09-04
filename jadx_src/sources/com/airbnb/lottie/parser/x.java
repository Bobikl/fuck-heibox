package com.airbnb.lottie.parser;

import android.graphics.Rect;
import androidx.collection.l2;
import androidx.collection.x0;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: LottieCompositionParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static JsonReader.a f37810a = JsonReader.a.a(RXScreenCaptureService.KEY_WIDTH, RXScreenCaptureService.KEY_HEIGHT, "ip", "op", SocializeProtocolConstants.PROTOCOL_KEY_FR, "v", "layers", "assets", "fonts", "chars", "markers");

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
            switch (jsonReader.r(f37810a)) {
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
                    b(jsonReader, gVar, arrayList, x0Var);
                default:
                    jsonReader.t();
                    map3 = map3;
                    arrayList2 = arrayList2;
                    break;
            }
        }
        gVar.w(new Rect(0, 0, (int) (iK * fE), (int) (iK2 * fE)), fI, fI2, fI3, arrayList, x0Var, map, map2, l2Var, map3, arrayList2);
        return gVar;
    }

    private static void b(JsonReader jsonReader, com.airbnb.lottie.g gVar, List<Layer> list, x0<Layer> x0Var) throws IOException {
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
}
