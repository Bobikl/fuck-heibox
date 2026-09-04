package okhttp3;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.s0;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSink;

/* JADX INFO: compiled from: FormBody.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\t\rB%\b\u0000\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0016\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bJ\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\n¨\u0006\u001e"}, d2 = {"Lokhttp3/q;", "Lokhttp3/b0;", "Lokio/BufferedSink;", "sink", "", "countBytes", "", "g", "", ak.av, "()I", UCropPlusActivity.ARG_INDEX, "", "b", "d", ak.aF, "f", "Lokhttp3/v;", "contentType", "contentLength", "Lkotlin/b2;", "writeTo", "", "Ljava/util/List;", "encodedNames", "encodedValues", "e", UiKitSpanObj.TYPE_SIZE, "<init>", "(Ljava/util/List;Ljava/util/List;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class q extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<String> encodedNames;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<String> encodedValues;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v f132629c = v.INSTANCE.c("application/x-www-form-urlencoded");

    /* JADX INFO: compiled from: FormBody.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Lokhttp3/q$a;", "", "", "name", "value", ak.av, "b", "Lokhttp3/q;", ak.aF, "", "Ljava/util/List;", "names", "values", "Ljava/nio/charset/Charset;", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Ljava/nio/charset/Charset;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<String> names;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<String> values;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Charset charset;

        /* JADX WARN: Multi-variable type inference failed */
        @xh.i
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @xh.i
        public a(@dl.e Charset charset) {
            this.charset = charset;
            this.names = new ArrayList();
            this.values = new ArrayList();
        }

        public /* synthetic */ a(Charset charset, int i10, kotlin.jvm.internal.u uVar) {
            this((i10 & 1) != 0 ? null : charset);
        }

        @dl.d
        public final a a(@dl.d String name, @dl.d String value) {
            kotlin.jvm.internal.f0.p(name, "name");
            kotlin.jvm.internal.f0.p(value, "value");
            List<String> list = this.names;
            t.Companion companion = t.INSTANCE;
            list.add(t.Companion.f(companion, name, 0, 0, t.f132648t, false, false, true, false, this.charset, 91, null));
            this.values.add(t.Companion.f(companion, value, 0, 0, t.f132648t, false, false, true, false, this.charset, 91, null));
            return this;
        }

        @dl.d
        public final a b(@dl.d String name, @dl.d String value) {
            kotlin.jvm.internal.f0.p(name, "name");
            kotlin.jvm.internal.f0.p(value, "value");
            List<String> list = this.names;
            t.Companion companion = t.INSTANCE;
            list.add(t.Companion.f(companion, name, 0, 0, t.f132648t, true, false, true, false, this.charset, 83, null));
            this.values.add(t.Companion.f(companion, value, 0, 0, t.f132648t, true, false, true, false, this.charset, 83, null));
            return this;
        }

        @dl.d
        public final q c() {
            return new q(this.names, this.values);
        }
    }

    public q(@dl.d List<String> encodedNames, @dl.d List<String> encodedValues) {
        kotlin.jvm.internal.f0.p(encodedNames, "encodedNames");
        kotlin.jvm.internal.f0.p(encodedValues, "encodedValues");
        this.encodedNames = Util.toImmutableList(encodedNames);
        this.encodedValues = Util.toImmutableList(encodedValues);
    }

    private final long g(BufferedSink sink, boolean countBytes) throws EOFException {
        Buffer buffer;
        if (countBytes) {
            buffer = new Buffer();
        } else {
            kotlin.jvm.internal.f0.m(sink);
            buffer = sink.getBuffer();
        }
        int size = this.encodedNames.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                buffer.writeByte(38);
            }
            buffer.writeUtf8(this.encodedNames.get(i10));
            buffer.writeByte(61);
            buffer.writeUtf8(this.encodedValues.get(i10));
        }
        if (!countBytes) {
            return 0L;
        }
        long size2 = buffer.size();
        buffer.clear();
        return size2;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = UiKitSpanObj.TYPE_SIZE, imports = {}))
    @xh.h(name = "-deprecated_size")
    public final int a() {
        return e();
    }

    @dl.d
    public final String b(int index) {
        return this.encodedNames.get(index);
    }

    @dl.d
    public final String c(int index) {
        return this.encodedValues.get(index);
    }

    @Override // okhttp3.b0
    public long contentLength() {
        return g(null, true);
    }

    @Override // okhttp3.b0
    @dl.d
    /* JADX INFO: renamed from: contentType */
    public v getContentType() {
        return f132629c;
    }

    @dl.d
    public final String d(int index) {
        return t.Companion.n(t.INSTANCE, b(index), 0, 0, true, 3, null);
    }

    @xh.h(name = UiKitSpanObj.TYPE_SIZE)
    public final int e() {
        return this.encodedNames.size();
    }

    @dl.d
    public final String f(int index) {
        return t.Companion.n(t.INSTANCE, c(index), 0, 0, true, 3, null);
    }

    @Override // okhttp3.b0
    public void writeTo(@dl.d BufferedSink sink) throws IOException {
        kotlin.jvm.internal.f0.p(sink, "sink");
        g(sink, false);
    }
}
