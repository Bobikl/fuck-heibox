package okio;

import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.tekartik.sqflite.b;
import dl.d;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.k;
import kotlin.s0;

/* JADX INFO: renamed from: okio.-DeprecatedOkio, reason: invalid class name */
/* JADX INFO: compiled from: -DeprecatedOkio.kt */
/* JADX INFO: loaded from: classes5.dex */
@k(message = "changed in Okio 2.x")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J)\u0010\n\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\"\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J)\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\"\u00020\u0016H\u0007¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, d2 = {"Lokio/-DeprecatedOkio;", "", "()V", "appendingSink", "Lokio/Sink;", "file", "Ljava/io/File;", "blackhole", "buffer", "Lokio/BufferedSink;", "sink", "Lokio/BufferedSource;", "source", "Lokio/Source;", "outputStream", "Ljava/io/OutputStream;", "socket", "Ljava/net/Socket;", FlutterActivityLaunchConfigs.EXTRA_PATH, "Ljava/nio/file/Path;", b.f98586e, "", "Ljava/nio/file/OpenOption;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Sink;", "inputStream", "Ljava/io/InputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Source;", "okio"}, k = 1, mv = {1, 4, 0})
public final class DeprecatedOkio {
    public static final DeprecatedOkio INSTANCE = new DeprecatedOkio();

    private DeprecatedOkio() {
    }

    @d
    @k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @s0(expression = "file.appendingSink()", imports = {"okio.appendingSink"}))
    public final Sink appendingSink(@d File file) {
        f0.p(file, "file");
        return Okio.appendingSink(file);
    }

    @d
    @k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @s0(expression = "blackholeSink()", imports = {"okio.blackholeSink"}))
    public final Sink blackhole() {
        return Okio.blackhole();
    }

    @d
    @k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @s0(expression = "sink.buffer()", imports = {"okio.buffer"}))
    public final BufferedSink buffer(@d Sink sink) {
        f0.p(sink, "sink");
        return Okio.buffer(sink);
    }

    @d
    @k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @s0(expression = "source.buffer()", imports = {"okio.buffer"}))
    public final BufferedSource buffer(@d Source source) {
        f0.p(source, "source");
        return Okio.buffer(source);
    }

    @d
    @k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @s0(expression = "file.sink()", imports = {"okio.sink"}))
    public final Sink sink(@d File file) {
        f0.p(file, "file");
        return Okio__JvmOkioKt.sink$default(file, false, 1, null);
    }

    @d
    @k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @s0(expression = "outputStream.sink()", imports = {"okio.sink"}))
    public final Sink sink(@d OutputStream outputStream) {
        f0.p(outputStream, "outputStream");
        return Okio.sink(outputStream);
    }

    @d
    @k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @s0(expression = "socket.sink()", imports = {"okio.sink"}))
    public final Sink sink(@d Socket socket) {
        f0.p(socket, "socket");
        return Okio.sink(socket);
    }

    @d
    @k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @s0(expression = "path.sink(*options)", imports = {"okio.sink"}))
    public final Sink sink(@d Path path, @d OpenOption... options) {
        f0.p(path, "path");
        f0.p(options, "options");
        return Okio.sink(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @d
    @k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @s0(expression = "file.source()", imports = {"okio.source"}))
    public final Source source(@d File file) {
        f0.p(file, "file");
        return Okio.source(file);
    }

    @d
    @k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @s0(expression = "inputStream.source()", imports = {"okio.source"}))
    public final Source source(@d InputStream inputStream) {
        f0.p(inputStream, "inputStream");
        return Okio.source(inputStream);
    }

    @d
    @k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @s0(expression = "socket.source()", imports = {"okio.source"}))
    public final Source source(@d Socket socket) {
        f0.p(socket, "socket");
        return Okio.source(socket);
    }

    @d
    @k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @s0(expression = "path.source(*options)", imports = {"okio.source"}))
    public final Source source(@d Path path, @d OpenOption... options) {
        f0.p(path, "path");
        f0.p(options, "options");
        return Okio.source(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }
}
