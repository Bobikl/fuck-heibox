package com.example.imagegallerysaver;

import com.lzy.okgo.model.Progress;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ImageGallerySaverPlugin.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0004R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0007\u0010\u0010\"\u0004\b\u0014\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/example/imagegallerysaver/c;", "", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "g", "", ak.av, "Z", ak.aF, "()Z", "f", "(Z)V", "isSuccess", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "e", "(Ljava/lang/String;)V", Progress.E, "d", "errorMessage", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "image_gallery_saver_release"}, k = 1, mv = {1, 7, 1})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean isSuccess;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @e
    private String filePath;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @e
    private String errorMessage;

    public c(boolean z10, @e String str, @e String str2) {
        this.isSuccess = z10;
        this.filePath = str;
        this.errorMessage = str2;
    }

    public /* synthetic */ c(boolean z10, String str, String str2, int i10, u uVar) {
        this(z10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
    }

    @e
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public final void d(@e String str) {
        this.errorMessage = str;
    }

    public final void e(@e String str) {
        this.filePath = str;
    }

    public final void f(boolean z10) {
        this.isSuccess = z10;
    }

    @d
    public final HashMap<String, Object> g() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("isSuccess", Boolean.valueOf(this.isSuccess));
        map.put(Progress.E, this.filePath);
        map.put("errorMessage", this.errorMessage);
        return map;
    }
}
