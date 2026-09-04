package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: MaskParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class y {
    private y() {
    }

    static Mask a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        jsonReader.c();
        Mask.MaskMode maskMode = null;
        boolean zG = false;
        com.airbnb.lottie.model.animatable.h hVarK = null;
        com.airbnb.lottie.model.animatable.d dVarH = null;
        while (jsonReader.f()) {
            String strM = jsonReader.m();
            strM.hashCode();
            switch (strM) {
                case "o":
                    dVarH = d.h(jsonReader, gVar);
                    break;
                case "pt":
                    hVarK = d.k(jsonReader, gVar);
                    break;
                case "inv":
                    zG = jsonReader.g();
                    break;
                case "mode":
                    String strN = jsonReader.n();
                    strN.hashCode();
                    switch (strN) {
                        case "a":
                            maskMode = Mask.MaskMode.MASK_MODE_ADD;
                            break;
                        case "i":
                            gVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            maskMode = Mask.MaskMode.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            maskMode = Mask.MaskMode.MASK_MODE_NONE;
                            break;
                        case "s":
                            maskMode = Mask.MaskMode.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            com.airbnb.lottie.utils.f.e("Unknown mask mode " + strM + ". Defaulting to Add.");
                            maskMode = Mask.MaskMode.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    jsonReader.t();
                    break;
            }
        }
        jsonReader.e();
        return new Mask(maskMode, hVarK, dVarH, zG);
    }
}
