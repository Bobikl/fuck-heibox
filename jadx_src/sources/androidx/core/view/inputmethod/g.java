package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.core.util.j;
import androidx.core.util.o;
import androidx.core.view.j1;

/* JADX INFO: compiled from: InputConnectionCompat.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f21557a = "InputConnectionCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f21558b = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f21559c = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f21560d = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f21561e = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f21562f = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f21563g = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f21564h = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f21565i = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f21566j = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f21567k = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f21568l = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f21569m = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f21570n = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f21571o = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f21572p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f21573q = "androidx.core.view.extra.INPUT_CONTENT_INFO";

    /* JADX INFO: compiled from: InputConnectionCompat.java */
    public class a extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f21574a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InputConnection inputConnection, boolean z10, d dVar) {
            super(inputConnection, z10);
            this.f21574a = dVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
            if (this.f21574a.a(i.g(inputContentInfo), i10, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i10, bundle);
        }
    }

    /* JADX INFO: compiled from: InputConnectionCompat.java */
    public class b extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f21575a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InputConnection inputConnection, boolean z10, d dVar) {
            super(inputConnection, z10);
            this.f21575a = dVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (g.f(str, bundle, this.f21575a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* JADX INFO: compiled from: InputConnectionCompat.java */
    @w0(25)
    public static class c {
        private c() {
        }

        @u
        static boolean a(InputConnection inputConnection, InputContentInfo inputContentInfo, int i10, Bundle bundle) {
            return inputConnection.commitContent(inputContentInfo, i10, bundle);
        }
    }

    /* JADX INFO: compiled from: InputConnectionCompat.java */
    public interface d {
        boolean a(@n0 i iVar, int i10, @p0 Bundle bundle);
    }

    @Deprecated
    public g() {
    }

    public static boolean b(@n0 InputConnection inputConnection, @n0 EditorInfo editorInfo, @n0 i iVar, int i10, @p0 Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25) {
            return c.a(inputConnection, (InputContentInfo) iVar.f(), i10, bundle);
        }
        int iE = e.e(editorInfo);
        boolean z10 = false;
        if (iE == 2) {
            z10 = true;
        } else if (iE != 3 && iE != 4) {
            return false;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(z10 ? f21561e : f21560d, iVar.a());
        bundle2.putParcelable(z10 ? f21563g : f21562f, iVar.b());
        bundle2.putParcelable(z10 ? f21565i : f21564h, iVar.c());
        bundle2.putInt(z10 ? f21569m : f21568l, i10);
        bundle2.putParcelable(z10 ? f21567k : f21566j, bundle);
        return inputConnection.performPrivateCommand(z10 ? f21559c : f21558b, bundle2);
    }

    @n0
    private static d c(@n0 final View view) {
        o.l(view);
        return new d() { // from class: androidx.core.view.inputmethod.f
            @Override // androidx.core.view.inputmethod.g.d
            public final boolean a(i iVar, int i10, Bundle bundle) {
                return g.g(view, iVar, i10, bundle);
            }
        };
    }

    @n0
    public static InputConnection d(@n0 View view, @n0 InputConnection inputConnection, @n0 EditorInfo editorInfo) {
        return e(inputConnection, editorInfo, c(view));
    }

    @n0
    @Deprecated
    public static InputConnection e(@n0 InputConnection inputConnection, @n0 EditorInfo editorInfo, @n0 d dVar) {
        j.e(inputConnection, "inputConnection must be non-null");
        j.e(editorInfo, "editorInfo must be non-null");
        j.e(dVar, "onCommitContentListener must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new a(inputConnection, false, dVar);
        }
        return e.a(editorInfo).length == 0 ? inputConnection : new b(inputConnection, false, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    static boolean f(@p0 String str, @p0 Bundle bundle, @n0 d dVar) throws Throwable {
        boolean z10;
        ResultReceiver resultReceiver;
        boolean zA;
        ?? r10 = 0;
        r10 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals(f21558b, str)) {
            z10 = false;
        } else {
            if (!TextUtils.equals(f21559c, str)) {
                return false;
            }
            z10 = true;
        }
        try {
            resultReceiver = (ResultReceiver) bundle.getParcelable(z10 ? f21571o : f21570n);
            try {
                Uri uri = (Uri) bundle.getParcelable(z10 ? f21561e : f21560d);
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z10 ? f21563g : f21562f);
                Uri uri2 = (Uri) bundle.getParcelable(z10 ? f21565i : f21564h);
                int i10 = bundle.getInt(z10 ? f21569m : f21568l);
                Bundle bundle2 = (Bundle) bundle.getParcelable(z10 ? f21567k : f21566j);
                if (uri != null && clipDescription != null) {
                    zA = dVar.a(new i(uri, clipDescription, uri2), i10, bundle2);
                }
                if (resultReceiver != 0) {
                    r10 = zA;
                    resultReceiver.send(r10, null);
                }
                r10 = zA;
                return r10;
            } catch (Throwable th2) {
                th = th2;
                if (resultReceiver != 0) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            resultReceiver = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean g(View view, i iVar, int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                iVar.e();
                InputContentInfo inputContentInfo = (InputContentInfo) iVar.f();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable(f21573q, inputContentInfo);
            } catch (Exception e10) {
                Log.w(f21557a, "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        return j1.m1(view, new androidx.core.view.e.b(new ClipData(iVar.b(), new ClipData.Item(iVar.a())), 2).e(iVar.c()).c(bundle).a()) == null;
    }
}
