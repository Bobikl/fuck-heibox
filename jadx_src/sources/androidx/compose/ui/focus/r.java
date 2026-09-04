package androidx.compose.ui.focus;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: FocusRequester.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"", ak.av, "Ljava/lang/String;", "focusRequesterNotInitialized", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f13598a = "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n";
}
