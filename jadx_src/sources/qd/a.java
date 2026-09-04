package qd;

import com.max.hbstory.bean.StoryItemsObj;
import com.max.hbstory.bean.StoryNextOffsetCardObj;
import dl.d;
import dl.e;
import java.util.List;

/* JADX INFO: compiled from: IStoryRepository.kt */
/* JADX INFO: loaded from: classes13.dex */
public interface a {
    void a(boolean z10);

    void b(int i10);

    @e
    StoryNextOffsetCardObj c();

    void d(boolean z10);

    int e();

    int f();

    @d
    List<StoryItemsObj> g();

    void h(int i10);

    void i(int i10);

    void j(boolean z10);

    boolean k();

    void l(@e StoryNextOffsetCardObj storyNextOffsetCardObj);

    void m(@d List<StoryItemsObj> list);

    boolean n();

    int o();

    boolean p();
}
