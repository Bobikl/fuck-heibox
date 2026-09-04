package com.airbnb.lottie.parser;

import androidx.annotation.p0;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: ContentModelParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static JsonReader.a f37693a = JsonReader.a.a(x5.a.f141074s, "d");

    private h() {
    }

    @p0
    static com.airbnb.lottie.model.content.c a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        com.airbnb.lottie.model.content.c cVarA;
        String strN;
        jsonReader.c();
        byte b10 = 2;
        int iK = 2;
        while (true) {
            cVarA = null;
            if (!jsonReader.f()) {
                strN = null;
                break;
            }
            int iR = jsonReader.r(f37693a);
            if (iR == 0) {
                strN = jsonReader.n();
                break;
            }
            if (iR != 1) {
                jsonReader.s();
                jsonReader.t();
            } else {
                iK = jsonReader.k();
            }
        }
        if (strN == null) {
            return null;
        }
        switch (strN.hashCode()) {
            case bb.c.d.om /* 3239 */:
                b10 = !strN.equals("el") ? (byte) -1 : (byte) 0;
                break;
            case bb.c.d.Tm /* 3270 */:
                b10 = !strN.equals("fl") ? (byte) -1 : (byte) 1;
                break;
            case bb.c.d.sn /* 3295 */:
                if (!strN.equals("gf")) {
                    b10 = -1;
                }
                break;
            case bb.c.d.En /* 3307 */:
                b10 = !strN.equals("gr") ? (byte) -1 : (byte) 3;
                break;
            case bb.c.d.Fn /* 3308 */:
                b10 = !strN.equals("gs") ? (byte) -1 : (byte) 4;
                break;
            case bb.c.d.dr /* 3488 */:
                b10 = !strN.equals("mm") ? (byte) -1 : (byte) 5;
                break;
            case bb.c.e.f31813h1 /* 3633 */:
                b10 = !strN.equals("rc") ? (byte) -1 : (byte) 6;
                break;
            case bb.c.e.f32033u1 /* 3646 */:
                b10 = !strN.equals("rp") ? (byte) -1 : (byte) 7;
                break;
            case bb.c.e.R1 /* 3669 */:
                b10 = !strN.equals("sh") ? (byte) -1 : (byte) 8;
                break;
            case bb.c.e.f31712b2 /* 3679 */:
                b10 = !strN.equals("sr") ? (byte) -1 : (byte) 9;
                break;
            case bb.c.e.f31746d2 /* 3681 */:
                b10 = !strN.equals("st") ? (byte) -1 : (byte) 10;
                break;
            case bb.c.e.B2 /* 3705 */:
                b10 = !strN.equals("tm") ? (byte) -1 : (byte) 11;
                break;
            case bb.c.e.G2 /* 3710 */:
                b10 = !strN.equals("tr") ? (byte) -1 : (byte) 12;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                cVarA = f.a(jsonReader, gVar, iK);
                break;
            case 1:
                cVarA = i0.a(jsonReader, gVar);
                break;
            case 2:
                cVarA = p.a(jsonReader, gVar);
                break;
            case 3:
                cVarA = j0.a(jsonReader, gVar);
                break;
            case 4:
                cVarA = q.a(jsonReader, gVar);
                break;
            case 5:
                cVarA = z.a(jsonReader);
                gVar.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                cVarA = e0.a(jsonReader, gVar);
                break;
            case 7:
                cVarA = f0.a(jsonReader, gVar);
                break;
            case 8:
                cVarA = k0.a(jsonReader, gVar);
                break;
            case 9:
                cVarA = d0.a(jsonReader, gVar);
                break;
            case 10:
                cVarA = l0.a(jsonReader, gVar);
                break;
            case 11:
                cVarA = m0.a(jsonReader, gVar);
                break;
            case 12:
                cVarA = c.g(jsonReader, gVar);
                break;
            default:
                com.airbnb.lottie.utils.f.e("Unknown shape type " + strN);
                break;
        }
        while (jsonReader.f()) {
            jsonReader.t();
        }
        jsonReader.e();
        return cVarA;
    }
}
