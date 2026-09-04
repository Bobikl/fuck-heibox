package okio;

import com.tekartik.sqflite.b;
import dl.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import xh.i;

/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\f\u001a\u0016\u0010\r\u001a\u00020\u000b*\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0006H\u0007\u001a\n\u0010\r\u001a\u00020\u000b*\u00020\u000f\u001a\n\u0010\r\u001a\u00020\u000b*\u00020\u0010\u001a%\u0010\r\u001a\u00020\u000b*\u00020\u00112\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001a\n\u0010\u0016\u001a\u00020\u0017*\u00020\f\u001a\n\u0010\u0016\u001a\u00020\u0017*\u00020\u0018\u001a\n\u0010\u0016\u001a\u00020\u0017*\u00020\u0010\u001a%\u0010\u0016\u001a\u00020\u0017*\u00020\u00112\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0019\"\u001c\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001c\u0010\u0005\u001a\u00020\u0006*\u00060\u0007j\u0002`\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\t¨\u0006\u001a"}, d2 = {"logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "getLogger$Okio__JvmOkioKt", "()Ljava/util/logging/Logger;", "isAndroidGetsocknameError", "", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "(Ljava/lang/AssertionError;)Z", "appendingSink", "Lokio/Sink;", "Ljava/io/File;", "sink", "append", "Ljava/io/OutputStream;", "Ljava/net/Socket;", "Ljava/nio/file/Path;", b.f98586e, "", "Ljava/nio/file/OpenOption;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Sink;", "source", "Lokio/Source;", "Ljava/io/InputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Source;", "okio"}, k = 5, mv = {1, 4, 0}, xs = "okio/Okio")
public final /* synthetic */ class Okio__JvmOkioKt {
    private static final Logger logger = Logger.getLogger("okio.Okio");

    @d
    public static final Sink appendingSink(@d File appendingSink) throws FileNotFoundException {
        f0.p(appendingSink, "$this$appendingSink");
        return Okio.sink(new FileOutputStream(appendingSink, true));
    }

    public static final boolean isAndroidGetsocknameError(@d AssertionError isAndroidGetsocknameError) {
        f0.p(isAndroidGetsocknameError, "$this$isAndroidGetsocknameError");
        if (isAndroidGetsocknameError.getCause() == null) {
            return false;
        }
        String message = isAndroidGetsocknameError.getMessage();
        return message != null ? StringsKt__StringsKt.W2(message, "getsockname failed", false, 2, null) : false;
    }

    @d
    @i
    public static final Sink sink(@d File file) throws FileNotFoundException {
        return sink$default(file, false, 1, null);
    }

    @d
    @i
    public static final Sink sink(@d File sink, boolean z10) throws FileNotFoundException {
        f0.p(sink, "$this$sink");
        return Okio.sink(new FileOutputStream(sink, z10));
    }

    @d
    public static final Sink sink(@d OutputStream sink) {
        f0.p(sink, "$this$sink");
        return new sink(sink, new Timeout());
    }

    @d
    public static final Sink sink(@d Socket sink) throws IOException {
        f0.p(sink, "$this$sink");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(sink);
        OutputStream outputStream = sink.getOutputStream();
        f0.o(outputStream, "getOutputStream()");
        return socketAsyncTimeout.sink(new sink(outputStream, socketAsyncTimeout));
    }

    @d
    @IgnoreJRERequirement
    public static final Sink sink(@d Path sink, @d OpenOption... options) throws IOException {
        f0.p(sink, "$this$sink");
        f0.p(options, "options");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(sink, (OpenOption[]) Arrays.copyOf(options, options.length));
        f0.o(outputStreamNewOutputStream, "Files.newOutputStream(this, *options)");
        return Okio.sink(outputStreamNewOutputStream);
    }

    public static /* synthetic */ Sink sink$default(File file, boolean z10, int i10, Object obj) throws FileNotFoundException {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return Okio.sink(file, z10);
    }

    @d
    public static final Source source(@d File source) throws FileNotFoundException {
        f0.p(source, "$this$source");
        return Okio.source(new FileInputStream(source));
    }

    @d
    public static final Source source(@d InputStream source) {
        f0.p(source, "$this$source");
        return new source(source, new Timeout());
    }

    @d
    public static final Source source(@d Socket source) throws IOException {
        f0.p(source, "$this$source");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(source);
        InputStream inputStream = source.getInputStream();
        f0.o(inputStream, "getInputStream()");
        return socketAsyncTimeout.source(new source(inputStream, socketAsyncTimeout));
    }

    @d
    @IgnoreJRERequirement
    public static final Source source(@d Path source, @d OpenOption... options) throws IOException {
        f0.p(source, "$this$source");
        f0.p(options, "options");
        InputStream inputStreamNewInputStream = Files.newInputStream(source, (OpenOption[]) Arrays.copyOf(options, options.length));
        f0.o(inputStreamNewInputStream, "Files.newInputStream(this, *options)");
        return Okio.source(inputStreamNewInputStream);
    }
}
