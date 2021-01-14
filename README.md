# RainbowProgressBar

Small library to make a rainbow progress bar

![](https://raw.githubusercontent.com/thrashedbrain/RainbowProgressBar/master/screen.gif)

# Setup

## Add a gradle dependency

```Gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

```Gradle
implementation 'com.github.thrashedbrain:RainbowProgressBar:0.5'
```

#Usage

Add a ProgressBar to your layout:

```xml
<com.thrashedbrain.rainbowprogressbar.RainbowProgressBar
            android:id="@+id/progress1"
            android:layout_width="match_parent"
            android:layout_height="3dp"
            style="@style/Widget.AppCompat.ProgressBar.Horizontal"
            android:indeterminate="true"/>
```

```xml
<com.thrashedbrain.rainbowprogressbar.RainbowProgressBar
            android:id="@+id/progress2"
            android:layout_width="match_parent"
            android:layout_height="3dp"
            android:layout_marginTop="40dp"
            style="@style/Widget.AppCompat.ProgressBar.Horizontal"
            android:indeterminate="false"/>
```
