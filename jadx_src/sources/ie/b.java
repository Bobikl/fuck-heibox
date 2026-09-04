package ie;

import androidx.annotation.n0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HeyboxOkflutterPlugin.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lie/b;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "flutterPluginBinding", "Lkotlin/b2;", "onAttachedToEngine", "binding", "onDetachedFromEngine", "<init>", "()V", "heybox_okflutter_release"}, k = 1, mv = {1, 7, 1})
public final class b implements FlutterPlugin {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@n0 @d FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        if (PatchProxy.proxy(new Object[]{flutterPluginBinding}, this, changeQuickRedirect, false, bb.c.l.f34496v9, new Class[]{FlutterPlugin.FlutterPluginBinding.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(flutterPluginBinding, "flutterPluginBinding");
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@n0 @d FlutterPlugin.FlutterPluginBinding binding) {
        if (PatchProxy.proxy(new Object[]{binding}, this, changeQuickRedirect, false, bb.c.l.f34518w9, new Class[]{FlutterPlugin.FlutterPluginBinding.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(binding, "binding");
    }
}
