package android.hardware.camera2.params;

import android.annotation.NonNull;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Parcelable;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SessionConfiguration implements Parcelable {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ SessionConfiguration(int i10, @NonNull List<OutputConfiguration> list, @NonNull Executor executor, @NonNull CameraCaptureSession.StateCallback stateCallback) {
    }

    public native /* synthetic */ void setSessionParameters(CaptureRequest captureRequest);
}
