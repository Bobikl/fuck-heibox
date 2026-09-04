package com.alipay.mobile.android.verify.logger;

import com.meituan.robust.Constants;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: LoggerPrinter.java */
/* JADX INFO: loaded from: classes6.dex */
public class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadLocal<String> f39392a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<c> f39393b = new ArrayList();

    i() {
    }

    private String n() {
        String str = this.f39392a.get();
        if (str == null) {
            return null;
        }
        this.f39392a.remove();
        return str;
    }

    private String o(String str, Object... objArr) {
        return (objArr == null || objArr.length == 0) ? str : String.format(str, objArr);
    }

    private synchronized void p(int i10, Throwable th2, String str, Object... objArr) {
        log(i10, n(), o(str, objArr), th2);
    }

    @Override // com.alipay.mobile.android.verify.logger.h
    public void a(String str, Object... objArr) {
        p(4, null, str, objArr);
    }

    @Override // com.alipay.mobile.android.verify.logger.h
    public void b(String str, Object... objArr) {
        p(3, null, str, objArr);
    }

    @Override // com.alipay.mobile.android.verify.logger.h
    public void c(String str, Object... objArr) {
        k(null, str, objArr);
    }

    @Override // com.alipay.mobile.android.verify.logger.h
    public void d(String str, Object... objArr) {
        p(5, null, str, objArr);
    }

    @Override // com.alipay.mobile.android.verify.logger.h
    public void e(String str, Object... objArr) {
        p(7, null, str, objArr);
    }

    @Override // com.alipay.mobile.android.verify.logger.h
    public void f(String str) {
        if (k.c(str)) {
            g("Empty/Null json content");
            return;
        }
        try {
            String strTrim = str.trim();
            if (strTrim.startsWith("{")) {
                g(new JSONObject(strTrim).toString(2));
            } else if (strTrim.startsWith(Constants.ARRAY_TYPE)) {
                g(new JSONArray(strTrim).toString(2));
            } else {
                c("Invalid Json", new Object[0]);
            }
        } catch (JSONException unused) {
            c("Invalid Json", new Object[0]);
        }
    }

    @Override // com.alipay.mobile.android.verify.logger.h
    public void g(Object obj) {
        p(3, null, k.a(obj), new Object[0]);
    }

    @Override // com.alipay.mobile.android.verify.logger.h
    public void h(c cVar) {
        this.f39393b.add(cVar);
    }

    @Override // com.alipay.mobile.android.verify.logger.h
    public h i(String str) {
        if (str != null) {
            this.f39392a.set(str);
        }
        return this;
    }

    @Override // com.alipay.mobile.android.verify.logger.h
    public void j(String str) {
        if (k.c(str)) {
            g("Empty/Null xml content");
            return;
        }
        try {
            StreamSource streamSource = new StreamSource(new StringReader(str));
            StreamResult streamResult = new StreamResult(new StringWriter());
            Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
            transformerNewTransformer.setOutputProperty("indent", "yes");
            transformerNewTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            transformerNewTransformer.transform(streamSource, streamResult);
            g(streamResult.getWriter().toString().replaceFirst(">", ">\n"));
        } catch (TransformerException unused) {
            c("Invalid xml", new Object[0]);
        }
    }

    @Override // com.alipay.mobile.android.verify.logger.h
    public void k(Throwable th2, String str, Object... objArr) {
        p(6, th2, str, objArr);
    }

    @Override // com.alipay.mobile.android.verify.logger.h
    public void l() {
        this.f39393b.clear();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0039 A[Catch: all -> 0x004b, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x0021, B:9:0x0025, B:12:0x002d, B:13:0x0033, B:15:0x0039, B:17:0x0045), top: B:24:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0033 A[SYNTHETIC] */
    @Override // com.alipay.mobile.android.verify.logger.h
    public synchronized void log(int i10, String str, String str2, Throwable th2) {
        if (th2 == null || str2 == null) {
            if (th2 != null && str2 == null) {
                str2 = k.b(th2);
            }
            if (k.c(str2)) {
                str2 = "Empty/NULL log message";
            }
            for (c cVar : this.f39393b) {
                if (cVar.isLoggable(i10, str)) {
                    cVar.a(i10, str, str2);
                }
            }
        } else {
            str2 = str2 + " : " + k.b(th2);
            if (th2 != null) {
                str2 = k.b(th2);
            }
            if (k.c(str2)) {
                str2 = "Empty/NULL log message";
            }
            while (r6.hasNext()) {
                if (cVar.isLoggable(i10, str)) {
                    cVar.a(i10, str, str2);
                }
            }
        }
        throw th;
    }

    @Override // com.alipay.mobile.android.verify.logger.h
    public void m(String str, Object... objArr) {
        p(2, null, str, objArr);
    }
}
