package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.Rect;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: LayerParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f37802a = JsonReader.a.a("nm", "ind", "refId", x5.a.f141074s, "parent", "sw", "sh", "sc", "ks", com.google.android.exoplayer2.text.ttml.d.f49795n, "masksProperties", "shapes", "t", "ef", "sr", "st", RXScreenCaptureService.KEY_WIDTH, RXScreenCaptureService.KEY_HEIGHT, "ip", "op", "tm", "cl", "hd");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final JsonReader.a f37803b = JsonReader.a.a("d", ak.av);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final JsonReader.a f37804c = JsonReader.a.a(x5.a.f141074s, "nm");

    /* JADX INFO: compiled from: LayerParser.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37805a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f37805a = iArr;
            try {
                iArr[Layer.MatteType.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37805a[Layer.MatteType.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private v() {
    }

    public static Layer a(com.airbnb.lottie.g gVar) {
        Rect rectB = gVar.b();
        return new Layer(Collections.emptyList(), gVar, "__container", -1L, Layer.LayerType.PRE_COMP, -1L, null, Collections.emptyList(), new com.airbnb.lottie.model.animatable.l(), 0, 0, 0, 0.0f, 0.0f, rectB.width(), rectB.height(), null, null, Collections.emptyList(), Layer.MatteType.NONE, null, false, null, null);
    }

    public static Layer b(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        ArrayList arrayList;
        float f10;
        Layer.MatteType matteType = Layer.MatteType.NONE;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        jsonReader.c();
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        Layer.MatteType matteType2 = matteType;
        float fI = 1.0f;
        int iK = 0;
        int iK2 = 0;
        int color = 0;
        int iK3 = 0;
        int iK4 = 0;
        boolean zG = false;
        Layer.LayerType layerType = null;
        String strN = null;
        com.airbnb.lottie.model.animatable.l lVarG = null;
        com.airbnb.lottie.model.animatable.j jVarD = null;
        com.airbnb.lottie.model.animatable.k kVarA = null;
        com.airbnb.lottie.model.animatable.b bVarF = null;
        com.airbnb.lottie.model.content.a aVarB = null;
        j jVarB = null;
        float fI2 = 0.0f;
        float fI3 = 0.0f;
        float f11 = 0.0f;
        long jK = -1;
        long jK2 = 0;
        String strN2 = null;
        String strN3 = "UNSET";
        while (jsonReader.f()) {
            switch (jsonReader.r(f37802a)) {
                case 0:
                    strN3 = jsonReader.n();
                    break;
                case 1:
                    jK2 = jsonReader.k();
                    break;
                case 2:
                    strN = jsonReader.n();
                    break;
                case 3:
                    int iK5 = jsonReader.k();
                    layerType = Layer.LayerType.UNKNOWN;
                    if (iK5 < layerType.ordinal()) {
                        layerType = Layer.LayerType.values()[iK5];
                    }
                    break;
                case 4:
                    jK = jsonReader.k();
                    break;
                case 5:
                    iK = (int) (jsonReader.k() * com.airbnb.lottie.utils.j.e());
                    break;
                case 6:
                    iK2 = (int) (jsonReader.k() * com.airbnb.lottie.utils.j.e());
                    break;
                case 7:
                    color = Color.parseColor(jsonReader.n());
                    break;
                case 8:
                    lVarG = c.g(jsonReader, gVar);
                    break;
                case 9:
                    int iK6 = jsonReader.k();
                    if (iK6 < Layer.MatteType.values().length) {
                        matteType2 = Layer.MatteType.values()[iK6];
                        int i10 = a.f37805a[matteType2.ordinal()];
                        if (i10 == 1) {
                            gVar.a("Unsupported matte type: Luma");
                        } else if (i10 == 2) {
                            gVar.a("Unsupported matte type: Luma Inverted");
                        }
                        gVar.v(1);
                    } else {
                        gVar.a("Unsupported matte type: " + iK6);
                    }
                    break;
                case 10:
                    jsonReader.b();
                    while (jsonReader.f()) {
                        arrayList2.add(y.a(jsonReader, gVar));
                    }
                    gVar.v(arrayList2.size());
                    jsonReader.d();
                    break;
                case 11:
                    jsonReader.b();
                    while (jsonReader.f()) {
                        com.airbnb.lottie.model.content.c cVarA = h.a(jsonReader, gVar);
                        if (cVarA != null) {
                            arrayList3.add(cVarA);
                        }
                    }
                    jsonReader.d();
                    break;
                case 12:
                    jsonReader.c();
                    while (jsonReader.f()) {
                        int iR = jsonReader.r(f37803b);
                        if (iR == 0) {
                            jVarD = d.d(jsonReader, gVar);
                        } else if (iR != 1) {
                            jsonReader.s();
                            jsonReader.t();
                        } else {
                            jsonReader.b();
                            if (jsonReader.f()) {
                                kVarA = b.a(jsonReader, gVar);
                            }
                            while (jsonReader.f()) {
                                jsonReader.t();
                            }
                            jsonReader.d();
                        }
                    }
                    jsonReader.e();
                    break;
                case 13:
                    jsonReader.b();
                    ArrayList arrayList4 = new ArrayList();
                    while (jsonReader.f()) {
                        jsonReader.c();
                        while (jsonReader.f()) {
                            int iR2 = jsonReader.r(f37804c);
                            if (iR2 == 0) {
                                int iK7 = jsonReader.k();
                                if (iK7 == 29) {
                                    aVarB = e.b(jsonReader, gVar);
                                } else if (iK7 == 25) {
                                    jVarB = new k().b(jsonReader, gVar);
                                }
                            } else if (iR2 != 1) {
                                jsonReader.s();
                                jsonReader.t();
                            } else {
                                arrayList4.add(jsonReader.n());
                            }
                        }
                        jsonReader.e();
                    }
                    jsonReader.d();
                    gVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList4);
                    break;
                case 14:
                    fI = (float) jsonReader.i();
                    break;
                case 15:
                    fI3 = (float) jsonReader.i();
                    break;
                case 16:
                    iK3 = (int) (jsonReader.k() * com.airbnb.lottie.utils.j.e());
                    break;
                case 17:
                    iK4 = (int) (jsonReader.k() * com.airbnb.lottie.utils.j.e());
                    break;
                case 18:
                    fI2 = (float) jsonReader.i();
                    break;
                case 19:
                    f11 = (float) jsonReader.i();
                    break;
                case 20:
                    bVarF = d.f(jsonReader, gVar, false);
                    break;
                case 21:
                    strN2 = jsonReader.n();
                    break;
                case 22:
                    zG = jsonReader.g();
                    break;
                default:
                    jsonReader.s();
                    jsonReader.t();
                    break;
            }
        }
        jsonReader.e();
        ArrayList arrayList5 = new ArrayList();
        if (fI2 > 0.0f) {
            arrayList = arrayList5;
            arrayList.add(new com.airbnb.lottie.value.a(gVar, fValueOf2, fValueOf2, null, 0.0f, Float.valueOf(fI2)));
            f10 = 0.0f;
        } else {
            arrayList = arrayList5;
            f10 = 0.0f;
        }
        if (f11 <= f10) {
            f11 = gVar.f();
        }
        arrayList.add(new com.airbnb.lottie.value.a(gVar, fValueOf, fValueOf, null, fI2, Float.valueOf(f11)));
        arrayList.add(new com.airbnb.lottie.value.a(gVar, fValueOf2, fValueOf2, null, f11, Float.valueOf(Float.MAX_VALUE)));
        if (strN3.endsWith(".ai") || "ai".equals(strN2)) {
            gVar.a("Convert your Illustrator layers to shape layers.");
        }
        return new Layer(arrayList3, gVar, strN3, jK2, layerType, jK, strN, arrayList2, lVarG, iK, iK2, color, fI, fI3, iK3, iK4, jVarD, kVarA, arrayList, matteType2, bVarF, zG, aVarB, jVarB);
    }
}
