package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.umeng.analytics.pro.ak;
import java.io.IOException;

/* JADX INFO: compiled from: AnimatableTransformParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f37682a = JsonReader.a.a(ak.av, "p", ak.aB, "rz", "r", "o", "so", "eo", "sk", "sa");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final JsonReader.a f37683b = JsonReader.a.a("k");

    private c() {
    }

    private static boolean a(com.airbnb.lottie.model.animatable.e eVar) {
        return eVar == null || (eVar.p() && eVar.r().get(0).f37854b.equals(0.0f, 0.0f));
    }

    private static boolean b(com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar) {
        return mVar == null || (!(mVar instanceof com.airbnb.lottie.model.animatable.i) && mVar.p() && mVar.r().get(0).f37854b.equals(0.0f, 0.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean c(com.airbnb.lottie.model.animatable.b bVar) {
        return bVar == null || (bVar.p() && ((Float) ((com.airbnb.lottie.value.a) bVar.r().get(0)).f37854b).floatValue() == 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean d(com.airbnb.lottie.model.animatable.g gVar) {
        return gVar == null || (gVar.p() && ((com.airbnb.lottie.value.k) ((com.airbnb.lottie.value.a) gVar.r().get(0)).f37854b).a(1.0f, 1.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean e(com.airbnb.lottie.model.animatable.b bVar) {
        return bVar == null || (bVar.p() && ((Float) ((com.airbnb.lottie.value.a) bVar.r().get(0)).f37854b).floatValue() == 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean f(com.airbnb.lottie.model.animatable.b bVar) {
        return bVar == null || (bVar.p() && ((Float) ((com.airbnb.lottie.value.a) bVar.r().get(0)).f37854b).floatValue() == 0.0f);
    }

    public static com.airbnb.lottie.model.animatable.l g(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        boolean z10;
        boolean z11 = false;
        boolean z12 = jsonReader.p() == JsonReader.Token.BEGIN_OBJECT;
        if (z12) {
            jsonReader.c();
        }
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.e eVarA = null;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVarB = null;
        com.airbnb.lottie.model.animatable.g gVarJ = null;
        com.airbnb.lottie.model.animatable.b bVarF = null;
        com.airbnb.lottie.model.animatable.b bVarF2 = null;
        com.airbnb.lottie.model.animatable.d dVarH = null;
        com.airbnb.lottie.model.animatable.b bVarF3 = null;
        com.airbnb.lottie.model.animatable.b bVarF4 = null;
        while (jsonReader.f()) {
            switch (jsonReader.r(f37682a)) {
                case 0:
                    boolean z13 = z11;
                    jsonReader.c();
                    while (jsonReader.f()) {
                        if (jsonReader.r(f37683b) != 0) {
                            jsonReader.s();
                            jsonReader.t();
                        } else {
                            eVarA = a.a(jsonReader, gVar);
                        }
                    }
                    jsonReader.e();
                    z11 = z13;
                    continue;
                case 1:
                    mVarB = a.b(jsonReader, gVar);
                    continue;
                case 2:
                    gVarJ = d.j(jsonReader, gVar);
                    continue;
                case 3:
                    gVar.a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    dVarH = d.h(jsonReader, gVar);
                    continue;
                case 6:
                    bVarF3 = d.f(jsonReader, gVar, z11);
                    continue;
                case 7:
                    bVarF4 = d.f(jsonReader, gVar, z11);
                    continue;
                case 8:
                    bVarF = d.f(jsonReader, gVar, z11);
                    continue;
                case 9:
                    bVarF2 = d.f(jsonReader, gVar, z11);
                    continue;
                default:
                    jsonReader.s();
                    jsonReader.t();
                    continue;
            }
            com.airbnb.lottie.model.animatable.b bVarF5 = d.f(jsonReader, gVar, z11);
            if (bVarF5.r().isEmpty()) {
                bVarF5.r().add(new com.airbnb.lottie.value.a(gVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(gVar.f())));
            } else {
                if (((com.airbnb.lottie.value.a) bVarF5.r().get(0)).f37854b == 0) {
                    z10 = false;
                    bVarF5.r().set(0, new com.airbnb.lottie.value.a(gVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(gVar.f())));
                }
                z11 = z10;
                bVar = bVarF5;
            }
            z10 = false;
            z11 = z10;
            bVar = bVarF5;
        }
        if (z12) {
            jsonReader.e();
        }
        com.airbnb.lottie.model.animatable.e eVar = a(eVarA) ? null : eVarA;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar = b(mVarB) ? null : mVarB;
        com.airbnb.lottie.model.animatable.b bVar2 = c(bVar) ? null : bVar;
        if (d(gVarJ)) {
            gVarJ = null;
        }
        return new com.airbnb.lottie.model.animatable.l(eVar, mVar, gVarJ, bVar2, dVarH, bVarF3, bVarF4, f(bVarF) ? null : bVarF, e(bVarF2) ? null : bVarF2);
    }
}
