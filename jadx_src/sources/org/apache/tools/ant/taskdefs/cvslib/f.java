package org.apache.tools.ant.taskdefs.cvslib;

import com.lzy.okgo.model.Progress;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.util.y;
import org.apache.tools.ant.util.z;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* JADX INFO: compiled from: ChangeLogWriter.java */
/* JADX INFO: loaded from: classes5.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final y f134008c = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SimpleDateFormat f134009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SimpleDateFormat f134010b;

    public f() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.f134009a = simpleDateFormat;
        this.f134010b = new SimpleDateFormat("HH:mm");
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        simpleDateFormat.setTimeZone(timeZone);
        this.f134010b.setTimeZone(timeZone);
    }

    private void b(Document document, PrintWriter printWriter, a aVar) throws IOException {
        Element elementCreateElement = document.createElement("entry");
        z.d(elementCreateElement, Progress.L, this.f134009a.format(aVar.e()));
        z.d(elementCreateElement, "time", this.f134010b.format(aVar.e()));
        z.b(elementCreateElement, SocializeProtocolConstants.AUTHOR, aVar.c());
        for (k kVar : aVar.f()) {
            Element elementE = z.e(elementCreateElement, "file");
            z.b(elementE, "name", kVar.a());
            z.d(elementE, "revision", kVar.c());
            String strB = kVar.b();
            if (strB != null) {
                z.d(elementE, "prevrevision", strB);
            }
        }
        z.b(elementCreateElement, "msg", aVar.d());
        f134008c.q(elementCreateElement, printWriter, 1, "\t");
    }

    public void a(PrintWriter printWriter, a[] aVarArr) {
        try {
            printWriter.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            Document documentF = z.f();
            Element elementCreateElement = documentF.createElement("changelog");
            f134008c.m(elementCreateElement, printWriter, 0, "\t");
            printWriter.println();
            for (a aVar : aVarArr) {
                b(documentF, printWriter, aVar);
            }
            f134008c.c(elementCreateElement, printWriter, 0, "\t", true);
            printWriter.flush();
            printWriter.close();
        } catch (IOException e10) {
            throw new BuildException(e10);
        }
    }
}
