package androidx.compose.ui.platform;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidUriHandler.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/c0;", "Landroidx/compose/ui/platform/y1;", "", "uri", "Lkotlin/b2;", ak.av, "Landroid/content/Context;", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "<init>", "(Landroid/content/Context;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class c0 implements y1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f15826b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Context context;

    public c0(@dl.d Context context) {
        kotlin.jvm.internal.f0.p(context, "context");
        this.context = context;
    }

    @Override // androidx.compose.ui.platform.y1
    public void a(@dl.d String uri) {
        kotlin.jvm.internal.f0.p(uri, "uri");
        this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(uri)));
    }
}
