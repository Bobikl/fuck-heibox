package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.internal.p1;
import com.taobao.accs.common.Constants;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p1 f56409c = new p1("LocalTestingConfigParser");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final XmlPullParser f56410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f56411b = y.c();

    d(XmlPullParser xmlPullParser) {
        this.f56410a = xmlPullParser;
    }

    public static y a(File file) {
        File file2 = new File(file, "local_testing_config.xml");
        if (!file2.exists()) {
            return y.f56457a;
        }
        try {
            FileReader fileReader = new FileReader(file2);
            try {
                XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                xmlPullParserNewPullParser.setInput(fileReader);
                final d dVar = new d(xmlPullParserNewPullParser);
                dVar.e("local-testing-config", new c0() { // from class: com.google.android.play.core.splitinstall.testing.b0
                    @Override // com.google.android.play.core.splitinstall.testing.c0
                    public final void zza() throws XmlPullParserException, IOException {
                        this.f56406a.d();
                    }
                });
                y yVarE = dVar.f56411b.e();
                fileReader.close();
                return yVarE;
            } catch (Throwable th2) {
                try {
                    fileReader.close();
                } catch (Throwable th3) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                    } catch (Exception unused) {
                    }
                }
                throw th2;
            }
        } catch (IOException | RuntimeException | XmlPullParserException e10) {
            f56409c.e("%s can not be parsed, using default. Error: %s", "local_testing_config.xml", e10.getMessage());
            return y.f56457a;
        }
    }

    public static /* synthetic */ void b(final d dVar) throws XmlPullParserException, IOException {
        for (int i10 = 0; i10 < dVar.f56410a.getAttributeCount(); i10++) {
            if ("defaultErrorCode".equals(dVar.f56410a.getAttributeName(i10))) {
                dVar.f56411b.a(l9.c.a(dVar.f56410a.getAttributeValue(i10)));
            }
        }
        dVar.e("split-install-error", new c0() { // from class: com.google.android.play.core.splitinstall.testing.z
            @Override // com.google.android.play.core.splitinstall.testing.c0
            public final void zza() throws XmlPullParserException {
                d.c(this.f56458a);
            }
        });
    }

    public static /* synthetic */ void c(d dVar) throws XmlPullParserException {
        String attributeValue = null;
        String attributeValue2 = null;
        for (int i10 = 0; i10 < dVar.f56410a.getAttributeCount(); i10++) {
            if ("module".equals(dVar.f56410a.getAttributeName(i10))) {
                attributeValue = dVar.f56410a.getAttributeValue(i10);
            }
            if (Constants.KEY_ERROR_CODE.equals(dVar.f56410a.getAttributeName(i10))) {
                attributeValue2 = dVar.f56410a.getAttributeValue(i10);
            }
        }
        if (attributeValue == null || attributeValue2 == null) {
            throw new XmlPullParserException(String.format("'%s' element does not contain 'module'/'errorCode' attributes.", "split-install-error"), dVar.f56410a, null);
        }
        dVar.f56411b.d().put(attributeValue, Integer.valueOf(l9.c.a(attributeValue2)));
        while (dVar.f56410a.next() != 3) {
        }
    }

    private final void e(String str, c0 c0Var) throws XmlPullParserException, IOException {
        while (true) {
            int next = this.f56410a.next();
            if (next == 3 || next == 1) {
                return;
            }
            if (this.f56410a.getEventType() == 2) {
                if (!this.f56410a.getName().equals(str)) {
                    throw new XmlPullParserException(String.format("Expected '%s' tag but found '%s'.", str, this.f56410a.getName()), this.f56410a, null);
                }
                c0Var.zza();
            }
        }
    }

    final /* synthetic */ void d() throws XmlPullParserException, IOException {
        e("split-install-errors", new c0() { // from class: com.google.android.play.core.splitinstall.testing.a0
            @Override // com.google.android.play.core.splitinstall.testing.c0
            public final void zza() throws XmlPullParserException, IOException {
                d.b(this.f56404a);
            }
        });
    }
}
