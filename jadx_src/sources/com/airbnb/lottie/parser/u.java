package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: KeyframesParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static JsonReader.a f37801a = JsonReader.a.a("k");

    private u() {
    }

    static <T> List<com.airbnb.lottie.value.a<T>> a(JsonReader jsonReader, com.airbnb.lottie.g gVar, float f10, n0<T> n0Var, boolean z10) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.p() == JsonReader.Token.STRING) {
            gVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.c();
        while (jsonReader.f()) {
            if (jsonReader.r(f37801a) != 0) {
                jsonReader.t();
            } else if (jsonReader.p() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.b();
                if (jsonReader.p() == JsonReader.Token.NUMBER) {
                    arrayList.add(t.c(jsonReader, gVar, f10, n0Var, false, z10));
                } else {
                    while (jsonReader.f()) {
                        arrayList.add(t.c(jsonReader, gVar, f10, n0Var, true, z10));
                    }
                }
                jsonReader.d();
            } else {
                arrayList.add(t.c(jsonReader, gVar, f10, n0Var, false, z10));
            }
        }
        jsonReader.e();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends com.airbnb.lottie.value.a<T>> list) {
        int i10;
        T t10;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            com.airbnb.lottie.value.a<T> aVar = list.get(i11);
            i11++;
            com.airbnb.lottie.value.a<T> aVar2 = list.get(i11);
            aVar.f37860h = Float.valueOf(aVar2.f37859g);
            if (aVar.f37855c == null && (t10 = aVar2.f37854b) != null) {
                aVar.f37855c = t10;
                if (aVar instanceof com.airbnb.lottie.animation.keyframe.i) {
                    ((com.airbnb.lottie.animation.keyframe.i) aVar).i();
                }
            }
        }
        com.airbnb.lottie.value.a<T> aVar3 = list.get(i10);
        if ((aVar3.f37854b == null || aVar3.f37855c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
