package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes5.dex */
public class FileSystemException extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final File f124738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final File f124739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private final String f124740d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemException(@dl.d File file, @dl.e File file2, @dl.e String str) {
        super(e.b(file, file2, str));
        f0.p(file, "file");
        this.f124738b = file;
        this.f124739c = file2;
        this.f124740d = str;
    }

    public /* synthetic */ FileSystemException(File file, File file2, String str, int i10, u uVar) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }

    @dl.d
    public final File a() {
        return this.f124738b;
    }

    @dl.e
    public final File b() {
        return this.f124739c;
    }

    @dl.e
    public final String c() {
        return this.f124740d;
    }
}
