package s3;

import anet.channel.request.BodyEntry;
import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public interface h {
    void A(int i10);

    void B(String str);

    String C(String str);

    void D(int i10);

    String a();

    void addHeader(String str, String str2);

    List<a> b();

    void c(String str);

    void d(a aVar);

    boolean e();

    int f();

    void g(List<g> list);

    int getConnectTimeout();

    a[] getHeaders(String str);

    String getMethod();

    List<g> getParams();

    int getReadTimeout();

    @Deprecated
    URI getURI();

    @Deprecated
    URL getURL();

    String h();

    @Deprecated
    b i();

    @Deprecated
    boolean j();

    BodyEntry k();

    String l();

    @Deprecated
    void m(URI uri);

    void n(List<a> list);

    void o(int i10);

    void p(a aVar);

    void q(String str);

    void r(String str, String str2);

    @Deprecated
    void s(b bVar);

    @Deprecated
    void t(boolean z10);

    void u(boolean z10);

    Map<String, String> v();

    void w(String str);

    void x(BodyEntry bodyEntry);

    @Deprecated
    void y(int i10);

    String z();
}
