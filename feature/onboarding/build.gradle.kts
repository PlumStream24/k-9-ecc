plugins {
    id(ThunderbirdPlugins.Library.androidCompose)
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "net.thunderbird.feature.onboarding"
    resourcePrefix = "onboarding_"
}

dependencies {
    implementation(projects.core.ui.compose.designsystem)
    implementation("androidx.core:core-ktx:1.10.0")
}
