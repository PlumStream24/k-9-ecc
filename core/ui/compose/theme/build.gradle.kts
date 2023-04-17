plugins {
    id(ThunderbirdPlugins.Library.androidCompose)
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "app.k9mail.core.ui.compose.theme"
    resourcePrefix = "core_ui_theme_"
}

dependencies {
    api(projects.core.ui.compose.common)
    implementation(libs.androidx.compose.material)
    implementation("androidx.core:core-ktx:1.10.0")
}
