# HeyBoxHook

小黑盒 LSPosed 模块，使用现代 Xposed API（API 102）开发。

当前版本：`0.5.3`

主要功能：

- 首页隐藏底部发布按钮
- 分享任务自动完成及任务结果提示
- 开屏广告处理
- 版本号与版本检测相关适配
- 旧版本升级提示弹窗抑制
- 原生设置页面

## 构建

使用 Android Studio 或已安装的 Gradle 环境执行：

```powershell
gradle :app:assembleRelease --no-daemon
```

生成的 APK 位于：

```text
app/build/outputs/apk/release/app-release.apk
```

本仓库只跟踪源代码、资源和构建配置，不提交 `build`、`.gradle`、本地 SDK 配置和 APK 文件。
