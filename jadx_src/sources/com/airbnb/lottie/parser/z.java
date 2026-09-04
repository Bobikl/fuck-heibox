package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: MergePathsParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f37811a = JsonReader.a.a("nm", "mm", "hd");

    private z() {
    }

    static MergePaths a(JsonReader jsonReader) throws IOException {
        String strN = null;
        boolean zG = false;
        MergePaths.MergePathsMode mergePathsModeForId = null;
        while (jsonReader.f()) {
            int iR = jsonReader.r(f37811a);
            if (iR == 0) {
                strN = jsonReader.n();
            } else if (iR == 1) {
                mergePathsModeForId = MergePaths.MergePathsMode.forId(jsonReader.k());
            } else if (iR != 2) {
                jsonReader.s();
                jsonReader.t();
            } else {
                zG = jsonReader.g();
            }
        }
        return new MergePaths(strN, mergePathsModeForId, zG);
    }
}
