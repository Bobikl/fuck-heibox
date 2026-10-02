# 稳定性审查修复：第一批（0.8.5 / 38）

## 范围与边界

本批落实无需新增宿主业务分析的 F01、F10 基础修复。没有改动任务资格、服务端完成态、请求取消、主线程任务持久化、首页刷新、原图加载、网页路由、GIF 请求 options 或帖子渲染等逻辑。这些问题仍待后续逐项处理；不要把本批当作完整审查问题已全部关闭。

## 生产修复

- 删除继承 `k1` 的快速拦截、全空 `df.e` binding 和反射调用 `Y1(false)`。保留宿主真实布局初始化，仅拦截开屏广告选择器；校验声明方法参数、静态性和准确返回类型。没有新增直接跳首页行为，也不存在执行部分副作用后再次重放启动链的分支。
- `SafePreferences` 处理 Boolean 错误类型与读取异常。迁移标记、启动 GIF 新旧键选择、设置页读取均使用安全边界。
- 远程配置迁移只接受已知 Boolean、String、Long 键及对应类型，忽略未知键和错误类型；不迁移任意 StringSet。宿主已有值优先。远程连接/读取失败、缺失远程存储和事务失败不写完成标记。
- GIF 旧键只在类型为 Boolean 且新键不存在时迁移。无效旧值不写入默认值；新键优先，坏值安全回退。
- 设置页保存调用发生同步异常时恢复开关显示，并显示失败提示。这里不能检测 `apply()` 的异步落盘失败，不宣称已验证持久化成功。
- 按 Activity 身份去重设置窗口，管理器仅弱引用 Activity 和 Dialog。观察生命周期只在至少一个窗口存在时注册，最后一个窗口关闭时注销；Activity 销毁时 dismiss；展示失败清理；旧窗口的延迟 onDismiss 不删除新窗口关联。
- 为设置开关提供可访问名称。源码编译编码明确为 UTF-8，Java 源码目标保持 17。

## 可执行验证

- Python 静态集成检查：12 项通过。检查生产接线、空 binding 路径移除和既有防回归约束，不等于宿主运行行为验证。
- JUnit 4 行为测试：18 项通过。调用实际的 `SafePreferences` 和 `DialogSessions`，仅替换存储层与窗口/生命周期适配层；覆盖坏类型、白名单、新值优先、迁移失败重试、GIF 优先级、保存失败、重复打开、多 Activity、销毁、旧回调、展示和监听注册失败。
- Debug 与 Release Lint：完成，均为 0 Error / 14 Warning；未关闭检查。
- 固定签名 Release APK：构建成功，版本 0.8.5 / 38，证书 SHA-256 与 `SIGNING.md` 一致。
- 手机仅执行用户授权的 ADB 安装和安装版本读取；没有执行 UI、任务请求或真机验收。

### Windows 中文路径测试入口

本机 Gradle 9.2 的 `testDebugUnitTest` 使用 UTF-8 `@argfile`，Java Windows 启动器读取后不能加载中文路径下的测试类（ClassNotFoundException），JDK 17 和 21 均复现。编译已成功，直接以 Unicode 参数启动同一组 JUnit 测试则通过。因此提供独立可复现入口：先由 Gradle 编译生产和测试类，再用 Unicode 参数运行 JUnit，所有输出严格按 UTF-8 解码。不是绕过断言或复制生产算法。原 Gradle 测试任务失败不计为通过。

```powershell
python -B -m unittest discover -s tests -v
python -B tests/run_jvm_tests.py --gradle "<Gradle bin/gradle.bat>" --java-home "<JDK directory>" --sdk-dir "<Android SDK directory>" --gradle-user-home "<Gradle cache directory>"
gradle --no-daemon lintDebug lintRelease assembleRelease
```

`--gradle-user-home` 可省略，此时读取环境变量或用户默认缓存。测试入口当前针对本项目 Windows / SDK 35 构建布局。

## 留给用户的真机验证

1. 开启跳过开屏后，冷启动、返回前台、深链/重复 Intent 启动与退出。
2. 设置页连续点击入口只出现一个窗口；返回关闭后再次打开。
3. 设置窗口显示期间旋转或销毁宿主设置 Activity，检查窗口是否跟随清理。
4. 总开关、三个广告子项、GIF 和图片自适应设置的读取/保存/重启生效。
5. 不宣称首页手动刷新或原图加载回归已经解决。本批未改变这些逻辑。


## 最终安装与同步记录（2026-10-02）

- ADB：设备 8d97f189，覆盖安装返回 Success；随后读取安装信息为 versionName=0.8.5 / versionCode=38。
- 本地副本：`HeyBoxPurifier-0.8.5-modern-api102.apk`。
- 已复制到 `X:\临时同步\HeyBoxPurifier-0.8.5-modern-api102.apk`。普通受限环境未显示 X:，授权安装时的环境可以访问，实际复制及哈希读取成功。
- 两份 APK 的 SHA-256 均为 `9C305846B1676E9CD50976C912BB994E2324990AD8294DECF84C62EA8511F69C`。
- 未操作手机界面，不把安装成功等同于功能验收。APK 不进入 Git，也不上传 GitHub Releases。
