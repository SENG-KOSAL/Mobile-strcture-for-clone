# MyApp — Mobile (Kotlin Multiplatform starter)

One Kotlin codebase for Android and iOS: **shared UI** (Compose Multiplatform) in `shared/`, with thin platform entry points.

```
shared/src/commonMain/   ← UI + logic (almost all the code)
  navigation/            routes and the NavHost
  ui/theme/              Material 3 theme
  ui/home, ui/detail     sample screens
  App.kt                 root composable
  Platform.kt            expect declarations (platformName)
shared/src/androidMain/  Android actuals
shared/src/iosMain/      iOS actuals, MainViewController()
shared/src/commonTest/   shared tests
androidApp/              MainActivity → App()
iosApp/                  SwiftUI host → MainViewController()
gradle/libs.versions.toml  version catalog
```

## Requirements
JDK 17+, Android SDK (compileSdk 37), and Xcode 16+ on an Apple Silicon Mac for iOS. Android Studio with the Kotlin Multiplatform plugin is recommended.

## Run
```sh
# Android (emulator running)
./gradlew :androidApp:installDebug

# iOS: open in Xcode and Run
open iosApp/iosApp.xcodeproj
```

Set `TEAM_ID` in `iosApp/Configuration/Config.xcconfig` to run on a real iPhone.

## Renaming the app
The placeholders are `MyApp` and `com.example.myapp`. Change them in:
- `settings.gradle.kts` (rootProject.name)
- `androidApp/build.gradle.kts` (namespace, applicationId) and `androidApp/src/main/res/values/strings.xml`
- `shared/build.gradle.kts` (namespace)
- the `com/example/myapp` package folders and `package` lines in `androidApp` and `shared`
- `iosApp/Configuration/Config.xcconfig` and the `MyApp` names in `iosApp/iosApp.xcodeproj/project.pbxproj`

## Adding a screen
1. Create a composable under `shared/src/commonMain/.../ui/<feature>/`.
2. Add a route constant in `navigation/AppNavigation.kt` and register it in the `NavHost`.
