package com.airbnb.lottie.parser;

import androidx.annotation.p0;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: DropShadowEffectParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final JsonReader.a f37705f = JsonReader.a.a("ef");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final JsonReader.a f37706g = JsonReader.a.a("nm", "v");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.airbnb.lottie.model.animatable.a f37707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.airbnb.lottie.model.animatable.b f37708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.airbnb.lottie.model.animatable.b f37709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.airbnb.lottie.model.animatable.b f37710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.airbnb.lottie.model.animatable.b f37711e;

    private void a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        jsonReader.c();
        String strN = "";
        while (jsonReader.f()) {
            int iR = jsonReader.r(f37706g);
            if (iR != 0) {
                if (iR == 1) {
                    strN.hashCode();
                    switch (strN) {
                        case "Distance":
                            this.f37710d = d.e(jsonReader, gVar);
                            break;
                        case "Opacity":
                            this.f37708b = d.f(jsonReader, gVar, false);
                            break;
                        case "Direction":
                            this.f37709c = d.f(jsonReader, gVar, false);
                            break;
                        case "Shadow Color":
                            this.f37707a = d.c(jsonReader, gVar);
                            break;
                        case "Softness":
                            this.f37711e = d.e(jsonReader, gVar);
                            break;
                        default:
                            jsonReader.t();
                            break;
                    }
                } else {
                    jsonReader.s();
                    jsonReader.t();
                }
            } else {
                strN = jsonReader.n();
            }
        }
        jsonReader.e();
    }

    @p0
    j b(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        com.airbnb.lottie.model.animatable.b bVar;
        com.airbnb.lottie.model.animatable.b bVar2;
        com.airbnb.lottie.model.animatable.b bVar3;
        com.airbnb.lottie.model.animatable.b bVar4;
        while (jsonReader.f()) {
            if (jsonReader.r(f37705f) != 0) {
                jsonReader.s();
                jsonReader.t();
            } else {
                jsonReader.b();
                while (jsonReader.f()) {
                    a(jsonReader, gVar);
                }
                jsonReader.d();
            }
        }
        com.airbnb.lottie.model.animatable.a aVar = this.f37707a;
        if (aVar == null || (bVar = this.f37708b) == null || (bVar2 = this.f37709c) == null || (bVar3 = this.f37710d) == null || (bVar4 = this.f37711e) == null) {
            return null;
        }
        return new j(aVar, bVar, bVar2, bVar3, bVar4);
    }
}
