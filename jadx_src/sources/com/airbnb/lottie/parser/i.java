package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.umeng.analytics.pro.ak;
import java.io.IOException;

/* JADX INFO: compiled from: DocumentDataParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class i implements n0<DocumentData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f37696a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final JsonReader.a f37697b = JsonReader.a.a("t", "f", ak.aB, "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private i() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public DocumentData a(JsonReader jsonReader, float f10) throws IOException {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.c();
        DocumentData.Justification justification2 = justification;
        String strN = null;
        String strN2 = null;
        int iK = 0;
        int iD = 0;
        int iD2 = 0;
        float fI = 0.0f;
        float fI2 = 0.0f;
        float fI3 = 0.0f;
        float fI4 = 0.0f;
        boolean zG = true;
        while (jsonReader.f()) {
            switch (jsonReader.r(f37697b)) {
                case 0:
                    strN = jsonReader.n();
                    break;
                case 1:
                    strN2 = jsonReader.n();
                    break;
                case 2:
                    fI = (float) jsonReader.i();
                    break;
                case 3:
                    int iK2 = jsonReader.k();
                    justification2 = DocumentData.Justification.CENTER;
                    if (iK2 <= justification2.ordinal() && iK2 >= 0) {
                        justification2 = DocumentData.Justification.values()[iK2];
                    }
                    break;
                case 4:
                    iK = jsonReader.k();
                    break;
                case 5:
                    fI2 = (float) jsonReader.i();
                    break;
                case 6:
                    fI3 = (float) jsonReader.i();
                    break;
                case 7:
                    iD = s.d(jsonReader);
                    break;
                case 8:
                    iD2 = s.d(jsonReader);
                    break;
                case 9:
                    fI4 = (float) jsonReader.i();
                    break;
                case 10:
                    zG = jsonReader.g();
                    break;
                default:
                    jsonReader.s();
                    jsonReader.t();
                    break;
            }
        }
        jsonReader.e();
        return new DocumentData(strN, strN2, fI, justification2, iK, fI2, fI3, iD, iD2, fI4, zG);
    }
}
