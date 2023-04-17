plugins {
    id(ThunderbirdPlugins.Library.androidCompose)
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "app.k9mail.core.ui.compose.common"
    resourcePrefix = "core_ui_common_"
}
dependencies {
    implementation("androidx.core:core-ktx:1.10.0")
}
