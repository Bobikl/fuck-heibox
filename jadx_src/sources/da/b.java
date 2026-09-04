package da;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;

/* JADX INFO: compiled from: FlutterKeyboardVisibilityPlugin.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements FlutterPlugin, ActivityAware, EventChannel.StreamHandler, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EventChannel.EventSink f108176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f108177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f108178d;

    private void a(BinaryMessenger binaryMessenger) {
        new EventChannel(binaryMessenger, "flutter_keyboard_visibility").setStreamHandler(this);
    }

    private void b(Activity activity) {
        View viewFindViewById = activity.findViewById(R.id.content);
        this.f108177c = viewFindViewById;
        viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    private void c() {
        View view = this.f108177c;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f108177c = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        b(activityPluginBinding.getActivity());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        a(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.f108176b = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        c();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        c();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        c();
    }

    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (this.f108177c != null) {
            Rect rect = new Rect();
            this.f108177c.getWindowVisibleDisplayFrame(rect);
            ?? r10 = ((double) rect.height()) / ((double) this.f108177c.getRootView().getHeight()) < 0.85d ? 1 : 0;
            if (r10 != this.f108178d) {
                this.f108178d = r10;
                EventChannel.EventSink eventSink = this.f108176b;
                if (eventSink != null) {
                    eventSink.success(Integer.valueOf((int) r10));
                }
            }
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f108176b = eventSink;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        b(activityPluginBinding.getActivity());
    }
}
