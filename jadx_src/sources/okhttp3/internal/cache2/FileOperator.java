package okhttp3.internal.cache2;

import dl.d;
import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import okio.Buffer;

/* JADX INFO: compiled from: FileOperator.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/cache2/FileOperator;", "", "", "pos", "Lokio/Buffer;", "source", "byteCount", "Lkotlin/b2;", "write", "sink", "read", "Ljava/nio/channels/FileChannel;", "fileChannel", "Ljava/nio/channels/FileChannel;", "<init>", "(Ljava/nio/channels/FileChannel;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(@d FileChannel fileChannel) {
        f0.p(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void read(long j10, @d Buffer sink, long j11) throws IOException {
        f0.p(sink, "sink");
        if (j11 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j11 > 0) {
            long jTransferTo = this.fileChannel.transferTo(j10, j11, sink);
            j10 += jTransferTo;
            j11 -= jTransferTo;
        }
    }

    public final void write(long j10, @d Buffer source, long j11) throws IOException {
        f0.p(source, "source");
        if (j11 < 0 || j11 > source.size()) {
            throw new IndexOutOfBoundsException();
        }
        while (j11 > 0) {
            long jTransferFrom = this.fileChannel.transferFrom(source, j10, j11);
            j10 += jTransferFrom;
            j11 -= jTransferFrom;
        }
    }
}
