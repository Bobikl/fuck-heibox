package ze;

import android.widget.ImageView;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.max.video.AbsVideoView;
import com.max.video.ui.BottomPanel;
import com.max.video.ui.CenterPanel;
import com.max.video.ui.TopPanel;
import com.max.video.ui.UIState;
import kotlinx.coroutines.flow.u;

/* JADX INFO: compiled from: VideoUI.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface d {
    void b();

    void d(boolean z10, int i10);

    @dl.d
    d e();

    @dl.d
    d g();

    @dl.d
    u<Boolean> getBottomPanelState();

    @dl.d
    u<Boolean> getCenterPanelState();

    @dl.d
    ImageView getCoverView();

    boolean getEnableBottom();

    boolean getEnableCenter();

    boolean getEnableTop();

    @dl.e
    BottomPanel getPanelBottom();

    @dl.e
    CenterPanel getPanelCenter();

    @dl.e
    TopPanel getPanelTop();

    @dl.d
    u<Boolean> getTopPanelState();

    @dl.d
    UIState getUiState();

    void i();

    void j(@dl.e String str);

    @dl.d
    d k(@dl.e CenterPanel centerPanel);

    void l();

    void lock();

    @dl.d
    d m(@dl.e TopPanel topPanel);

    void n(boolean z10, int i10, long j10);

    @dl.d
    d q(@dl.e BottomPanel bottomPanel);

    void reset();

    void s(@dl.e String str);

    void setEnableBottom(boolean z10);

    void setEnableCenter(boolean z10);

    void setEnableTop(boolean z10);

    void setPanelBottom(@dl.e BottomPanel bottomPanel);

    void setPanelCenter(@dl.e CenterPanel centerPanel);

    void setPanelTop(@dl.e TopPanel topPanel);

    void setUiState(@dl.d UIState uIState);

    @dl.d
    d u(@dl.d LifecycleCoroutineScope lifecycleCoroutineScope, @dl.d AbsVideoView absVideoView);

    void unlock();

    boolean v();
}
