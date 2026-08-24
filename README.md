# HeyBoxHook

小黑盒 LSPosed 模块，使用现代 Xposed API（API 102）开发。

当前版本：`0.6.2`

主要功能：

- 首页隐藏底部发布按钮
- 全局广告净化二级设置（信息流、首页/页内、页面横幅、商城底栏可独立选择）
- 独立开屏广告跳过
- 禁止读取剪贴板口令
- 分享任务自动完成及任务结果提示
- 外部浏览器打开普通网页链接
- 禁止推荐流视频/GIF 自动播放
- 回前台不自动刷新（保留签到同步）
- 全屏图片查看器自动加载原图，可选仅 Wi-Fi 自动加载
- 仅对帖子正文渲染器强制开启文字选择与复制
- 版本号与版本检测相关适配
- 旧版本升级提示弹窗抑制
- 启动后自动任务请求与失败重试
- 多任务静默刷新防抖和热路径缓存
- 原生设置页面与按需实时 Hook 自检

全部功能默认关闭；修改开关后重启小黑盒生效。关闭的功能不会安装对应 Hook。
模块设置通过官方 libxposed service 写入 LSPosed Remote Preferences，同时保留本地
镜像用于 UI 显示和版本升级迁移。
自检只在用户打开模块设置页时进行一次有序广播问答，不启动服务、不写心跳、
不进行后台轮询；全部功能关闭时，首页启动路径不安装模块 Hook。

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
