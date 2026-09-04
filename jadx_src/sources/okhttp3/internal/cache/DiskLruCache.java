package okhttp3.internal.cache;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import dl.d;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.io.b;
import kotlin.jvm.internal.f0;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.u;
import kotlin.text.y;
import lg.a;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import org.apache.tools.ant.taskdefs.optional.ejb.g;
import org.apache.tools.ant.taskdefs.optional.j2ee.c;
import xh.e;
import xh.i;
import yh.l;

/* JADX INFO: compiled from: DiskLruCache.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0083\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b*\u0001T\u0018\u0000 g2\u00020\u00012\u00020\u0002:\u0004ghijB9\b\u0000\u0012\u0006\u0010X\u001a\u00020W\u0012\u0006\u0010\\\u001a\u000206\u0012\u0006\u0010_\u001a\u00020B\u0012\u0006\u0010`\u001a\u00020B\u0012\u0006\u00100\u001a\u00020\u0017\u0012\u0006\u0010d\u001a\u00020c¢\u0006\u0004\be\u0010fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0006\u0010\u0011\u001a\u00020\u0003J\u000f\u0010\u0014\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\b\u0018\u00010\u0015R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007H\u0086\u0002J \u0010\u001a\u001a\b\u0018\u00010\u0019R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007J\u0006\u0010\u001b\u001a\u00020\u0017J#\u0010 \u001a\u00020\u00032\n\u0010\u001c\u001a\u00060\u0019R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010!\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0007J\u001b\u0010&\u001a\u00020\u000b2\n\u0010#\u001a\u00060\"R\u00020\u0000H\u0000¢\u0006\u0004\b$\u0010%J\b\u0010'\u001a\u00020\u0003H\u0016J\u0006\u0010(\u001a\u00020\u000bJ\b\u0010)\u001a\u00020\u0003H\u0016J\u0006\u0010*\u001a\u00020\u0003J\u0006\u0010+\u001a\u00020\u0003J\u0006\u0010,\u001a\u00020\u0003J\u0010\u0010.\u001a\f\u0012\b\u0012\u00060\u0015R\u00020\u00000-R*\u00100\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010:\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0016\u0010\u001b\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00101R\u0018\u0010;\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R*\u0010>\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060\"R\u00020\u00000=8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010FR\u0016\u0010H\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010FR\"\u0010I\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bI\u0010F\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010FR\u0016\u0010O\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010FR\u0016\u0010P\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u00101R\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010X\u001a\u00020W8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0017\u0010\\\u001a\u0002068\u0006¢\u0006\f\n\u0004\b\\\u00108\u001a\u0004\b]\u0010^R\u0014\u0010_\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010DR\u001a\u0010`\u001a\u00020B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b`\u0010D\u001a\u0004\ba\u0010b¨\u0006k"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lkotlin/b2;", "readJournal", "Lokio/BufferedSink;", "newJournalWriter", "", "line", "readJournalLine", "processJournal", "", "journalRebuildRequired", "checkNotClosed", "removeOldestEntry", "key", "validateKey", "initialize", "rebuildJournal$okhttp", "()V", "rebuildJournal", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "get", "", "expectedSequenceNumber", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "edit", UiKitSpanObj.TYPE_SIZE, "editor", "success", "completeEdit$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;Z)V", "completeEdit", "remove", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "entry", "removeEntry$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Entry;)Z", "removeEntry", "flush", "isClosed", "close", "trimToSize", c.f135155a, "evictAll", "", "snapshots", "value", "maxSize", "J", "getMaxSize", "()J", "setMaxSize", "(J)V", "Ljava/io/File;", "journalFile", "Ljava/io/File;", "journalFileTmp", "journalFileBackup", "journalWriter", "Lokio/BufferedSink;", "Ljava/util/LinkedHashMap;", "lruEntries", "Ljava/util/LinkedHashMap;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "", "redundantOpCount", "I", "hasJournalErrors", "Z", "civilizedFileSystem", "initialized", "closed", "getClosed$okhttp", "()Z", "setClosed$okhttp", "(Z)V", "mostRecentTrimFailed", "mostRecentRebuildFailed", "nextSequenceNumber", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "okhttp3/internal/cache/DiskLruCache$cleanupTask$1", "cleanupTask", "Lokhttp3/internal/cache/DiskLruCache$cleanupTask$1;", "Lokhttp3/internal/io/FileSystem;", "fileSystem", "Lokhttp3/internal/io/FileSystem;", "getFileSystem$okhttp", "()Lokhttp3/internal/io/FileSystem;", g.d.f134963d, "getDirectory", "()Ljava/io/File;", "appVersion", "valueCount", "getValueCount$okhttp", "()I", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(Lokhttp3/internal/io/FileSystem;Ljava/io/File;IIJLokhttp3/internal/concurrent/TaskRunner;)V", "Companion", "Editor", "Entry", "Snapshot", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class DiskLruCache implements Closeable, Flushable {
    private final int appVersion;
    private boolean civilizedFileSystem;
    private final TaskQueue cleanupQueue;
    private final DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;

    @d
    private final File directory;

    @d
    private final FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private BufferedSink journalWriter;

    @d
    private final LinkedHashMap<String, Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;

    @d
    @e
    public static final String JOURNAL_FILE = "journal";

    @d
    @e
    public static final String JOURNAL_FILE_TEMP = "journal.tmp";

    @d
    @e
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";

    @d
    @e
    public static final String MAGIC = "libcore.io.DiskLruCache";

    @d
    @e
    public static final String VERSION_1 = "1";

    @e
    public static final long ANY_SEQUENCE_NUMBER = -1;

    @d
    @e
    public static final Regex LEGAL_KEY_PATTERN = new Regex("[a-z0-9_-]{1,120}");

    @d
    @e
    public static final String CLEAN = "CLEAN";

    @d
    @e
    public static final String DIRTY = "DIRTY";

    @d
    @e
    public static final String REMOVE = "REMOVE";

    @d
    @e
    public static final String READ = "READ";

    /* JADX INFO: compiled from: DiskLruCache.kt */
    @Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0018\u001a\u00060\u0016R\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0018\u001a\u00060\u0016R\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "Lkotlin/b2;", "detach$okhttp", "()V", "detach", "", UCropPlusActivity.ARG_INDEX, "Lokio/Source;", "newSource", "Lokio/Sink;", "newSink", "commit", "abort", "", "written", "[Z", "getWritten$okhttp", "()[Z", "", "done", "Z", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "Lokhttp3/internal/cache/DiskLruCache;", "entry", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "getEntry$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Entry;", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Lokhttp3/internal/cache/DiskLruCache$Entry;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public final class Editor {
        private boolean done;

        @d
        private final Entry entry;
        final /* synthetic */ DiskLruCache this$0;

        @dl.e
        private final boolean[] written;

        public Editor(@d DiskLruCache diskLruCache, Entry entry) {
            f0.p(entry, "entry");
            this.this$0 = diskLruCache;
            this.entry = entry;
            this.written = entry.getReadable() ? null : new boolean[diskLruCache.getValueCount()];
        }

        public final void abort() throws IOException {
            synchronized (this.this$0) {
                if (!(!this.done)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (f0.g(this.entry.getCurrentEditor(), this)) {
                    this.this$0.completeEdit$okhttp(this, false);
                }
                this.done = true;
                b2 b2Var = b2.f124493a;
            }
        }

        public final void commit() throws IOException {
            synchronized (this.this$0) {
                if (!(!this.done)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (f0.g(this.entry.getCurrentEditor(), this)) {
                    this.this$0.completeEdit$okhttp(this, true);
                }
                this.done = true;
                b2 b2Var = b2.f124493a;
            }
        }

        public final void detach$okhttp() throws IOException {
            if (f0.g(this.entry.getCurrentEditor(), this)) {
                if (this.this$0.civilizedFileSystem) {
                    this.this$0.completeEdit$okhttp(this, false);
                } else {
                    this.entry.setZombie$okhttp(true);
                }
            }
        }

        @d
        /* JADX INFO: renamed from: getEntry$okhttp, reason: from getter */
        public final Entry getEntry() {
            return this.entry;
        }

        @dl.e
        /* JADX INFO: renamed from: getWritten$okhttp, reason: from getter */
        public final boolean[] getWritten() {
            return this.written;
        }

        @d
        public final Sink newSink(final int index) {
            synchronized (this.this$0) {
                if (!(!this.done)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!f0.g(this.entry.getCurrentEditor(), this)) {
                    return Okio.blackhole();
                }
                if (!this.entry.getReadable()) {
                    boolean[] zArr = this.written;
                    f0.m(zArr);
                    zArr[index] = true;
                }
                try {
                    return new FaultHidingSink(this.this$0.getFileSystem().sink(this.entry.getDirtyFiles$okhttp().get(index)), new l<IOException, b2>() { // from class: okhttp3.internal.cache.DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(IOException iOException) {
                            invoke2(iOException);
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@d IOException it) {
                            f0.p(it, "it");
                            synchronized (this.this$0.this$0) {
                                this.this$0.detach$okhttp();
                                b2 b2Var = b2.f124493a;
                            }
                        }
                    });
                } catch (FileNotFoundException unused) {
                    return Okio.blackhole();
                }
            }
        }

        @dl.e
        public final Source newSource(int index) {
            synchronized (this.this$0) {
                if (!(!this.done)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                Source source = null;
                if (!this.entry.getReadable() || (!f0.g(this.entry.getCurrentEditor(), this)) || this.entry.getZombie()) {
                    return null;
                }
                try {
                    source = this.this$0.getFileSystem().source(this.entry.getCleanFiles$okhttp().get(index));
                } catch (FileNotFoundException unused) {
                }
                return source;
            }
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.kt */
    @Metadata(bv = {}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\r\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010D\u001a\u00020\u0003¢\u0006\u0004\bH\u0010IJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001d\u0010\u000e\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0018\u001a\b\u0018\u00010\u0014R\u00020\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\"\u0010'\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010-\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R(\u00101\u001a\b\u0018\u000100R\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00107\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010>\u001a\u00020=8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "", "", "strings", "", "invalidLengths", "", UCropPlusActivity.ARG_INDEX, "Lokio/Source;", "newSource", "Lkotlin/b2;", "setLengths$okhttp", "(Ljava/util/List;)V", "setLengths", "Lokio/BufferedSink;", "writer", "writeLengths$okhttp", "(Lokio/BufferedSink;)V", "writeLengths", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "snapshot$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot", "", "lengths", "[J", "getLengths$okhttp", "()[J", "", "Ljava/io/File;", "cleanFiles", "Ljava/util/List;", "getCleanFiles$okhttp", "()Ljava/util/List;", "dirtyFiles", "getDirtyFiles$okhttp", "", "readable", "Z", "getReadable$okhttp", "()Z", "setReadable$okhttp", "(Z)V", "zombie", "getZombie$okhttp", "setZombie$okhttp", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "currentEditor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "getCurrentEditor$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "setCurrentEditor$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "lockingSourceCount", "I", "getLockingSourceCount$okhttp", "()I", "setLockingSourceCount$okhttp", "(I)V", "", "sequenceNumber", "J", "getSequenceNumber$okhttp", "()J", "setSequenceNumber$okhttp", "(J)V", "key", "Ljava/lang/String;", "getKey$okhttp", "()Ljava/lang/String;", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public final class Entry {

        @d
        private final List<File> cleanFiles;

        @dl.e
        private Editor currentEditor;

        @d
        private final List<File> dirtyFiles;

        @d
        private final String key;

        @d
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ DiskLruCache this$0;
        private boolean zombie;

        public Entry(@d DiskLruCache diskLruCache, String key) {
            f0.p(key, "key");
            this.this$0 = diskLruCache;
            this.key = key;
            this.lengths = new long[diskLruCache.getValueCount()];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder sb2 = new StringBuilder(key);
            sb2.append(a.f131414g);
            int length = sb2.length();
            int valueCount = diskLruCache.getValueCount();
            for (int i10 = 0; i10 < valueCount; i10++) {
                sb2.append(i10);
                this.cleanFiles.add(new File(diskLruCache.getDirectory(), sb2.toString()));
                sb2.append(".tmp");
                this.dirtyFiles.add(new File(diskLruCache.getDirectory(), sb2.toString()));
                sb2.setLength(length);
            }
        }

        private final Void invalidLengths(List<String> strings) throws IOException {
            throw new IOException("unexpected journal line: " + strings);
        }

        private final Source newSource(int index) throws FileNotFoundException {
            final Source source = this.this$0.getFileSystem().source(this.cleanFiles.get(index));
            if (this.this$0.civilizedFileSystem) {
                return source;
            }
            this.lockingSourceCount++;
            return new ForwardingSource(source) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                private boolean closed;

                @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    super.close();
                    if (this.closed) {
                        return;
                    }
                    this.closed = true;
                    synchronized (this.this$0.this$0) {
                        DiskLruCache.Entry entry = this.this$0;
                        entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount() - 1);
                        if (this.this$0.getLockingSourceCount() == 0 && this.this$0.getZombie()) {
                            DiskLruCache.Entry entry2 = this.this$0;
                            entry2.this$0.removeEntry$okhttp(entry2);
                        }
                        b2 b2Var = b2.f124493a;
                    }
                }
            };
        }

        @d
        public final List<File> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        @dl.e
        /* JADX INFO: renamed from: getCurrentEditor$okhttp, reason: from getter */
        public final Editor getCurrentEditor() {
            return this.currentEditor;
        }

        @d
        public final List<File> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        @d
        /* JADX INFO: renamed from: getKey$okhttp, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @d
        /* JADX INFO: renamed from: getLengths$okhttp, reason: from getter */
        public final long[] getLengths() {
            return this.lengths;
        }

        /* JADX INFO: renamed from: getLockingSourceCount$okhttp, reason: from getter */
        public final int getLockingSourceCount() {
            return this.lockingSourceCount;
        }

        /* JADX INFO: renamed from: getReadable$okhttp, reason: from getter */
        public final boolean getReadable() {
            return this.readable;
        }

        /* JADX INFO: renamed from: getSequenceNumber$okhttp, reason: from getter */
        public final long getSequenceNumber() {
            return this.sequenceNumber;
        }

        /* JADX INFO: renamed from: getZombie$okhttp, reason: from getter */
        public final boolean getZombie() {
            return this.zombie;
        }

        public final void setCurrentEditor$okhttp(@dl.e Editor editor) {
            this.currentEditor = editor;
        }

        public final void setLengths$okhttp(@d List<String> strings) throws IOException {
            f0.p(strings, "strings");
            if (strings.size() != this.this$0.getValueCount()) {
                invalidLengths(strings);
                throw new KotlinNothingValueException();
            }
            try {
                int size = strings.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.lengths[i10] = Long.parseLong(strings.get(i10));
                }
            } catch (NumberFormatException unused) {
                invalidLengths(strings);
                throw new KotlinNothingValueException();
            }
        }

        public final void setLockingSourceCount$okhttp(int i10) {
            this.lockingSourceCount = i10;
        }

        public final void setReadable$okhttp(boolean z10) {
            this.readable = z10;
        }

        public final void setSequenceNumber$okhttp(long j10) {
            this.sequenceNumber = j10;
        }

        public final void setZombie$okhttp(boolean z10) {
            this.zombie = z10;
        }

        @dl.e
        public final Snapshot snapshot$okhttp() {
            DiskLruCache diskLruCache = this.this$0;
            if (Util.assertionsEnabled && !Thread.holdsLock(diskLruCache)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                f0.o(threadCurrentThread, "Thread.currentThread()");
                sb2.append(threadCurrentThread.getName());
                sb2.append(" MUST hold lock on ");
                sb2.append(diskLruCache);
                throw new AssertionError(sb2.toString());
            }
            if (!this.readable) {
                return null;
            }
            if (!this.this$0.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.lengths.clone();
            try {
                int valueCount = this.this$0.getValueCount();
                for (int i10 = 0; i10 < valueCount; i10++) {
                    arrayList.add(newSource(i10));
                }
                return new Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Util.closeQuietly((Source) it.next());
                }
                try {
                    this.this$0.removeEntry$okhttp(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void writeLengths$okhttp(@d BufferedSink writer) throws IOException {
            f0.p(writer, "writer");
            for (long j10 : this.lengths) {
                writer.writeByte(32).writeDecimalLong(j10);
            }
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.kt */
    @Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0006\u001a\b\u0018\u00010\u0004R\u00020\u0005J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "", "key", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "edit", "", UCropPlusActivity.ARG_INDEX, "Lokio/Source;", "getSource", "", "getLength", "Lkotlin/b2;", "close", "Ljava/lang/String;", "sequenceNumber", "J", "", "sources", "Ljava/util/List;", "", "lengths", "[J", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;JLjava/util/List;[J)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public final class Snapshot implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final List<Source> sources;
        final /* synthetic */ DiskLruCache this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public Snapshot(@d DiskLruCache diskLruCache, String key, @d long j10, @d List<? extends Source> sources, long[] lengths) {
            f0.p(key, "key");
            f0.p(sources, "sources");
            f0.p(lengths, "lengths");
            this.this$0 = diskLruCache;
            this.key = key;
            this.sequenceNumber = j10;
            this.sources = sources;
            this.lengths = lengths;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<Source> it = this.sources.iterator();
            while (it.hasNext()) {
                Util.closeQuietly(it.next());
            }
        }

        @dl.e
        public final Editor edit() throws IOException {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        public final long getLength(int index) {
            return this.lengths[index];
        }

        @d
        public final Source getSource(int index) {
            return this.sources.get(index);
        }

        @d
        /* JADX INFO: renamed from: key, reason: from getter */
        public final String getKey() {
            return this.key;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.cache.DiskLruCache$snapshots$1, reason: invalid class name */
    /* JADX INFO: compiled from: DiskLruCache.kt */
    @Metadata(bv = {}, d1 = {"\u0000'\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001J\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0002J\r\u0010\u0006\u001a\u00060\u0002R\u00020\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R*\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012 \n*\b\u0018\u00010\tR\u00020\u00030\tR\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\b\u0018\u00010\u0002R\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\b\u0018\u00010\u0002R\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"okhttp3/internal/cache/DiskLruCache$snapshots$1", "", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "", "hasNext", "next", "Lkotlin/b2;", "remove", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "kotlin.jvm.PlatformType", "delegate", "Ljava/util/Iterator;", "nextSnapshot", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "removeSnapshot", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class AnonymousClass1 implements Iterator<Snapshot>, zh.d {
        private final Iterator<Entry> delegate;
        private Snapshot nextSnapshot;
        private Snapshot removeSnapshot;

        AnonymousClass1() {
            Iterator<Entry> it = new ArrayList(DiskLruCache.this.getLruEntries$okhttp().values()).iterator();
            f0.o(it, "ArrayList(lruEntries.values).iterator()");
            this.delegate = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Snapshot snapshotSnapshot$okhttp;
            if (this.nextSnapshot != null) {
                return true;
            }
            synchronized (DiskLruCache.this) {
                if (DiskLruCache.this.getClosed()) {
                    return false;
                }
                while (this.delegate.hasNext()) {
                    Entry next = this.delegate.next();
                    if (next != null && (snapshotSnapshot$okhttp = next.snapshot$okhttp()) != null) {
                        this.nextSnapshot = snapshotSnapshot$okhttp;
                        return true;
                    }
                }
                b2 b2Var = b2.f124493a;
                return false;
            }
        }

        @Override // java.util.Iterator
        @d
        public Snapshot next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Snapshot snapshot = this.nextSnapshot;
            this.removeSnapshot = snapshot;
            this.nextSnapshot = null;
            f0.m(snapshot);
            return snapshot;
        }

        @Override // java.util.Iterator
        public void remove() {
            Snapshot snapshot = this.removeSnapshot;
            if (snapshot == null) {
                throw new IllegalStateException("remove() before next()".toString());
            }
            try {
                DiskLruCache.this.remove(snapshot.getKey());
            } catch (IOException unused) {
            } finally {
                this.removeSnapshot = null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(@d FileSystem fileSystem, @d File directory, int i10, int i11, long j10, @d TaskRunner taskRunner) {
        f0.p(fileSystem, "fileSystem");
        f0.p(directory, "directory");
        f0.p(taskRunner, "taskRunner");
        this.fileSystem = fileSystem;
        this.directory = directory;
        this.appVersion = i10;
        this.valueCount = i11;
        this.maxSize = j10;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = taskRunner.newQueue();
        final String str = Util.okHttpName + " Cache";
        this.cleanupTask = new Task(str) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                synchronized (this.this$0) {
                    if (!this.this$0.initialized || this.this$0.getClosed()) {
                        return -1L;
                    }
                    try {
                        this.this$0.trimToSize();
                    } catch (IOException unused) {
                        this.this$0.mostRecentTrimFailed = true;
                    }
                    try {
                        if (this.this$0.journalRebuildRequired()) {
                            this.this$0.rebuildJournal$okhttp();
                            this.this$0.redundantOpCount = 0;
                        }
                    } catch (IOException unused2) {
                        this.this$0.mostRecentRebuildFailed = true;
                        this.this$0.journalWriter = Okio.buffer(Okio.blackhole());
                    }
                    return -1L;
                }
            }
        };
        if (!(j10 > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        if (!(i11 > 0)) {
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        this.journalFile = new File(directory, JOURNAL_FILE);
        this.journalFileTmp = new File(directory, JOURNAL_FILE_TEMP);
        this.journalFileBackup = new File(directory, JOURNAL_FILE_BACKUP);
    }

    private final synchronized void checkNotClosed() {
        if (!(!this.closed)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean journalRebuildRequired() {
        int i10 = this.redundantOpCount;
        return i10 >= 2000 && i10 >= this.lruEntries.size();
    }

    private final BufferedSink newJournalWriter() throws FileNotFoundException {
        return Okio.buffer(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new l<IOException, b2>() { // from class: okhttp3.internal.cache.DiskLruCache$newJournalWriter$faultHidingSink$1
            {
                super(1);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(IOException iOException) {
                invoke2(iOException);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@d IOException it) {
                f0.p(it, "it");
                DiskLruCache diskLruCache = this.this$0;
                if (!Util.assertionsEnabled || Thread.holdsLock(diskLruCache)) {
                    this.this$0.hasJournalErrors = true;
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                f0.o(threadCurrentThread, "Thread.currentThread()");
                sb2.append(threadCurrentThread.getName());
                sb2.append(" MUST hold lock on ");
                sb2.append(diskLruCache);
                throw new AssertionError(sb2.toString());
            }
        }));
    }

    private final void processJournal() throws IOException {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            f0.o(next, "i.next()");
            Entry entry = next;
            int i10 = 0;
            if (entry.getCurrentEditor() == null) {
                int i11 = this.valueCount;
                while (i10 < i11) {
                    this.size += entry.getLengths()[i10];
                    i10++;
                }
            } else {
                entry.setCurrentEditor$okhttp(null);
                int i12 = this.valueCount;
                while (i10 < i12) {
                    this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i10));
                    this.fileSystem.delete(entry.getDirtyFiles$okhttp().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private final void readJournal() throws IOException {
        BufferedSource bufferedSourceBuffer = Okio.buffer(this.fileSystem.source(this.journalFile));
        try {
            String utf8LineStrict = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict2 = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict3 = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict4 = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict5 = bufferedSourceBuffer.readUtf8LineStrict();
            if (!(!f0.g(MAGIC, utf8LineStrict)) && !(!f0.g(VERSION_1, utf8LineStrict2)) && !(!f0.g(String.valueOf(this.appVersion), utf8LineStrict3)) && !(!f0.g(String.valueOf(this.valueCount), utf8LineStrict4))) {
                int i10 = 0;
                if (!(utf8LineStrict5.length() > 0)) {
                    while (true) {
                        try {
                            readJournalLine(bufferedSourceBuffer.readUtf8LineStrict());
                            i10++;
                        } catch (EOFException unused) {
                            this.redundantOpCount = i10 - this.lruEntries.size();
                            if (bufferedSourceBuffer.exhausted()) {
                                this.journalWriter = newJournalWriter();
                            } else {
                                rebuildJournal$okhttp();
                            }
                            b2 b2Var = b2.f124493a;
                            b.a(bufferedSourceBuffer, null);
                            return;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + utf8LineStrict + ", " + utf8LineStrict2 + ", " + utf8LineStrict4 + ", " + utf8LineStrict5 + ']');
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(bufferedSourceBuffer, th2);
                throw th3;
            }
        }
    }

    private final void readJournalLine(String str) throws IOException {
        String strSubstring;
        int iR3 = StringsKt__StringsKt.r3(str, ' ', 0, false, 6, null);
        if (iR3 == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iR3 + 1;
        int iR4 = StringsKt__StringsKt.r3(str, ' ', i10, false, 4, null);
        if (iR4 == -1) {
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            strSubstring = str.substring(i10);
            f0.o(strSubstring, "(this as java.lang.String).substring(startIndex)");
            String str2 = REMOVE;
            if (iR3 == str2.length() && u.v2(str, str2, false, 2, null)) {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            strSubstring = str.substring(i10, iR4);
            f0.o(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        Entry entry = this.lruEntries.get(strSubstring);
        if (entry == null) {
            entry = new Entry(this, strSubstring);
            this.lruEntries.put(strSubstring, entry);
        }
        if (iR4 != -1) {
            String str3 = CLEAN;
            if (iR3 == str3.length() && u.v2(str, str3, false, 2, null)) {
                int i11 = iR4 + 1;
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String strSubstring2 = str.substring(i11);
                f0.o(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                List<String> listT4 = StringsKt__StringsKt.T4(strSubstring2, new char[]{' '}, false, 0, 6, null);
                entry.setReadable$okhttp(true);
                entry.setCurrentEditor$okhttp(null);
                entry.setLengths$okhttp(listT4);
                return;
            }
        }
        if (iR4 == -1) {
            String str4 = DIRTY;
            if (iR3 == str4.length() && u.v2(str, str4, false, 2, null)) {
                entry.setCurrentEditor$okhttp(new Editor(this, entry));
                return;
            }
        }
        if (iR4 == -1) {
            String str5 = READ;
            if (iR3 == str5.length() && u.v2(str, str5, false, 2, null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private final boolean removeOldestEntry() throws IOException {
        for (Entry toEvict : this.lruEntries.values()) {
            if (!toEvict.getZombie()) {
                f0.o(toEvict, "toEvict");
                removeEntry$okhttp(toEvict);
                return true;
            }
        }
        return false;
    }

    private final void validateKey(String str) {
        if (LEGAL_KEY_PATTERN.k(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + y.f128593b).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        Editor currentEditor;
        if (this.initialized && !this.closed) {
            Collection<Entry> collectionValues = this.lruEntries.values();
            f0.o(collectionValues, "lruEntries.values");
            Object[] array = collectionValues.toArray(new Entry[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            for (Entry entry : (Entry[]) array) {
                if (entry.getCurrentEditor() != null && (currentEditor = entry.getCurrentEditor()) != null) {
                    currentEditor.detach$okhttp();
                }
            }
            trimToSize();
            BufferedSink bufferedSink = this.journalWriter;
            f0.m(bufferedSink);
            bufferedSink.close();
            this.journalWriter = null;
            this.closed = true;
            return;
        }
        this.closed = true;
    }

    public final synchronized void completeEdit$okhttp(@d Editor editor, boolean success) throws IOException {
        f0.p(editor, "editor");
        Entry entry = editor.getEntry();
        if (!f0.g(entry.getCurrentEditor(), editor)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (success && !entry.getReadable()) {
            int i10 = this.valueCount;
            for (int i11 = 0; i11 < i10; i11++) {
                boolean[] written = editor.getWritten();
                f0.m(written);
                if (!written[i11]) {
                    editor.abort();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                }
                if (!this.fileSystem.exists(entry.getDirtyFiles$okhttp().get(i11))) {
                    editor.abort();
                    return;
                }
            }
        }
        int i12 = this.valueCount;
        for (int i13 = 0; i13 < i12; i13++) {
            File file = entry.getDirtyFiles$okhttp().get(i13);
            if (!success || entry.getZombie()) {
                this.fileSystem.delete(file);
            } else if (this.fileSystem.exists(file)) {
                File file2 = entry.getCleanFiles$okhttp().get(i13);
                this.fileSystem.rename(file, file2);
                long j10 = entry.getLengths()[i13];
                long size = this.fileSystem.size(file2);
                entry.getLengths()[i13] = size;
                this.size = (this.size - j10) + size;
            }
        }
        entry.setCurrentEditor$okhttp(null);
        if (entry.getZombie()) {
            removeEntry$okhttp(entry);
            return;
        }
        this.redundantOpCount++;
        BufferedSink bufferedSink = this.journalWriter;
        f0.m(bufferedSink);
        if (entry.getReadable() || success) {
            entry.setReadable$okhttp(true);
            bufferedSink.writeUtf8(CLEAN).writeByte(32);
            bufferedSink.writeUtf8(entry.getKey());
            entry.writeLengths$okhttp(bufferedSink);
            bufferedSink.writeByte(10);
            if (success) {
                long j11 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j11;
                entry.setSequenceNumber$okhttp(j11);
            }
        } else {
            this.lruEntries.remove(entry.getKey());
            bufferedSink.writeUtf8(REMOVE).writeByte(32);
            bufferedSink.writeUtf8(entry.getKey());
            bufferedSink.writeByte(10);
        }
        bufferedSink.flush();
        if (this.size > this.maxSize || journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final void delete() throws IOException {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    @dl.e
    @i
    public final Editor edit(@d String str) throws IOException {
        return edit$default(this, str, 0L, 2, null);
    }

    @dl.e
    @i
    public final synchronized Editor edit(@d String key, long expectedSequenceNumber) throws IOException {
        f0.p(key, "key");
        initialize();
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (expectedSequenceNumber != ANY_SEQUENCE_NUMBER && (entry == null || entry.getSequenceNumber() != expectedSequenceNumber)) {
            return null;
        }
        if ((entry != null ? entry.getCurrentEditor() : null) != null) {
            return null;
        }
        if (entry != null && entry.getLockingSourceCount() != 0) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            BufferedSink bufferedSink = this.journalWriter;
            f0.m(bufferedSink);
            bufferedSink.writeUtf8(DIRTY).writeByte(32).writeUtf8(key).writeByte(10);
            bufferedSink.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(this, key);
                this.lruEntries.put(key, entry);
            }
            Editor editor = new Editor(this, entry);
            entry.setCurrentEditor$okhttp(editor);
            return editor;
        }
        TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        return null;
    }

    public final synchronized void evictAll() throws IOException {
        initialize();
        Collection<Entry> collectionValues = this.lruEntries.values();
        f0.o(collectionValues, "lruEntries.values");
        Object[] array = collectionValues.toArray(new Entry[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        for (Entry entry : (Entry[]) array) {
            f0.o(entry, "entry");
            removeEntry$okhttp(entry);
        }
        this.mostRecentTrimFailed = false;
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            BufferedSink bufferedSink = this.journalWriter;
            f0.m(bufferedSink);
            bufferedSink.flush();
        }
    }

    @dl.e
    public final synchronized Snapshot get(@d String key) throws IOException {
        f0.p(key, "key");
        initialize();
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (entry == null) {
            return null;
        }
        f0.o(entry, "lruEntries[key] ?: return null");
        Snapshot snapshotSnapshot$okhttp = entry.snapshot$okhttp();
        if (snapshotSnapshot$okhttp == null) {
            return null;
        }
        this.redundantOpCount++;
        BufferedSink bufferedSink = this.journalWriter;
        f0.m(bufferedSink);
        bufferedSink.writeUtf8(READ).writeByte(32).writeUtf8(key).writeByte(10);
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return snapshotSnapshot$okhttp;
    }

    /* JADX INFO: renamed from: getClosed$okhttp, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    @d
    public final File getDirectory() {
        return this.directory;
    }

    @d
    /* JADX INFO: renamed from: getFileSystem$okhttp, reason: from getter */
    public final FileSystem getFileSystem() {
        return this.fileSystem;
    }

    @d
    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    /* JADX INFO: renamed from: getValueCount$okhttp, reason: from getter */
    public final int getValueCount() {
        return this.valueCount;
    }

    public final synchronized void initialize() throws IOException {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            f0.o(threadCurrentThread, "Thread.currentThread()");
            sb2.append(threadCurrentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        if (this.initialized) {
            return;
        }
        if (this.fileSystem.exists(this.journalFileBackup)) {
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.delete(this.journalFileBackup);
            } else {
                this.fileSystem.rename(this.journalFileBackup, this.journalFile);
            }
        }
        this.civilizedFileSystem = Util.isCivilized(this.fileSystem, this.journalFileBackup);
        if (this.fileSystem.exists(this.journalFile)) {
            try {
                readJournal();
                processJournal();
                this.initialized = true;
                return;
            } catch (IOException e10) {
                Platform.INSTANCE.get().log("DiskLruCache " + this.directory + " is corrupt: " + e10.getMessage() + ", removing", 5, e10);
                try {
                    delete();
                    this.closed = false;
                    rebuildJournal$okhttp();
                    this.initialized = true;
                } catch (Throwable th2) {
                    this.closed = false;
                    throw th2;
                }
            }
        }
        rebuildJournal$okhttp();
        this.initialized = true;
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    public final synchronized void rebuildJournal$okhttp() throws IOException {
        try {
            BufferedSink bufferedSink = this.journalWriter;
            if (bufferedSink != null) {
                bufferedSink.close();
            }
            BufferedSink bufferedSinkBuffer = Okio.buffer(this.fileSystem.sink(this.journalFileTmp));
            try {
                bufferedSinkBuffer.writeUtf8(MAGIC).writeByte(10);
                bufferedSinkBuffer.writeUtf8(VERSION_1).writeByte(10);
                bufferedSinkBuffer.writeDecimalLong(this.appVersion).writeByte(10);
                bufferedSinkBuffer.writeDecimalLong(this.valueCount).writeByte(10);
                bufferedSinkBuffer.writeByte(10);
                for (Entry entry : this.lruEntries.values()) {
                    if (entry.getCurrentEditor() != null) {
                        bufferedSinkBuffer.writeUtf8(DIRTY).writeByte(32);
                        bufferedSinkBuffer.writeUtf8(entry.getKey());
                        bufferedSinkBuffer.writeByte(10);
                    } else {
                        bufferedSinkBuffer.writeUtf8(CLEAN).writeByte(32);
                        bufferedSinkBuffer.writeUtf8(entry.getKey());
                        entry.writeLengths$okhttp(bufferedSinkBuffer);
                        bufferedSinkBuffer.writeByte(10);
                    }
                }
                b2 b2Var = b2.f124493a;
                b.a(bufferedSinkBuffer, null);
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.rename(this.journalFile, this.journalFileBackup);
                }
                this.fileSystem.rename(this.journalFileTmp, this.journalFile);
                this.fileSystem.delete(this.journalFileBackup);
                this.journalWriter = newJournalWriter();
                this.hasJournalErrors = false;
                this.mostRecentRebuildFailed = false;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(bufferedSinkBuffer, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final synchronized boolean remove(@d String key) throws IOException {
        f0.p(key, "key");
        initialize();
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (entry == null) {
            return false;
        }
        f0.o(entry, "lruEntries[key] ?: return false");
        boolean zRemoveEntry$okhttp = removeEntry$okhttp(entry);
        if (zRemoveEntry$okhttp && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return zRemoveEntry$okhttp;
    }

    public final boolean removeEntry$okhttp(@d Entry entry) throws IOException {
        BufferedSink bufferedSink;
        f0.p(entry, "entry");
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount() > 0 && (bufferedSink = this.journalWriter) != null) {
                bufferedSink.writeUtf8(DIRTY);
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(entry.getKey());
                bufferedSink.writeByte(10);
                bufferedSink.flush();
            }
            if (entry.getLockingSourceCount() > 0 || entry.getCurrentEditor() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        Editor currentEditor = entry.getCurrentEditor();
        if (currentEditor != null) {
            currentEditor.detach$okhttp();
        }
        int i10 = this.valueCount;
        for (int i11 = 0; i11 < i10; i11++) {
            this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i11));
            this.size -= entry.getLengths()[i11];
            entry.getLengths()[i11] = 0;
        }
        this.redundantOpCount++;
        BufferedSink bufferedSink2 = this.journalWriter;
        if (bufferedSink2 != null) {
            bufferedSink2.writeUtf8(REMOVE);
            bufferedSink2.writeByte(32);
            bufferedSink2.writeUtf8(entry.getKey());
            bufferedSink2.writeByte(10);
        }
        this.lruEntries.remove(entry.getKey());
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean z10) {
        this.closed = z10;
    }

    public final synchronized void setMaxSize(long j10) {
        this.maxSize = j10;
        if (this.initialized) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final synchronized long size() throws IOException {
        initialize();
        return this.size;
    }

    @d
    public final synchronized Iterator<Snapshot> snapshots() throws IOException {
        initialize();
        return new AnonymousClass1();
    }

    public final void trimToSize() throws IOException {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }
}
